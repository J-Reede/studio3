/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.js.sdoc.parsing;

import java.util.ArrayList;
import java.util.List;
import com.aptana.editor.js.sdoc.model.*;
import beaver.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "SDoc.grammar".
 */
@SuppressWarnings({ "unchecked", "nls" })
public class SDocParser extends Parser {

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pjLbbm5LKGFJFlvIL2C975c8GG80GX2IyX2r5Y4C7W0W4HHHGNS4LHL5nGKOYe851#g5L" +
		"MAHzMMPQb7tvPBXyWuX8KGK4GD20OWyObHWK11Krxxfr#avbdqEWVLIHr#lGztTEtP#RUEm" +
		"zm9w4FJa8cCd0Y#g8NUgCVJaPFHD03ut4snY4Nfs8whiBrk0ltuK6SW2naem25c8ahS2tkm" +
		"68iHKhNTKGmnDQPrCqwtSjAxMRUYYwwEguSwqhShj0uYktAka0wK8CgZ5Gxbf5pa4PheXV3" +
		"bTMX#FcyEeffjiefU9Iy77MqmpKU3sMVWNfVzsQzJFx0179wA2#Ub7MvZYSdPNdHAoqFn3M" +
		"XQ3e6OJ2Ao9Uohr68CUCMt8YRgPXxCJ0PzRZ7#gP6Vyor$03kzBM7SIyv1wVvodmiylt9UC" +
		"HoFPQHyucXlFywd8KfbYVY8jfvcC78TLQPWmMqURYVIWEz0NY8LT9bhRmfQzZRC9HW14fHX" +
		"d9Ke1BLE1rZS1j6enPdCdOkpgCjmLHSI7i9CGkpSJMll87#JRWLj#DkUWk9T2oXJPC$uS3b" +
		"AHJboHBZVa$Z3Y$Y6n$EcNfnBMHmLVJcskXhpvailibitd4kdqSU#yldapDFge2dJzTry1$" +
		"hT7Us$z$LSUNOLypASloL1Nv3Ut95UpQJaGpk4KUZLTpXuRYvEbEhcBnoxWI7fuKNTqBPPj" +
		"Q4dfWLUdKmp$bRbZSkJCfAHCDPdlKgkcINVQMmBuVMvLqNsNinC1anQiOtDI9QozMdaV0D3" +
		"$MLOO5eeKPZoWRcr8ZplvDJQSEH2bznwHNQBbtRROHdKWaxZNB64lvUYDAEv9oULqhVs0H7" +
		"B2hyAokP5LMrLBKocB#L3JGYyXMfb2YWBu0pc$ueyjCDDWtpb1SOxYwKbXDF4AjORnUn6d2" +
		"pE7wUU9b#Bj6VoEFuDRrkBV4#jG7CNqWqShp5YpcBFNRpYK7g6tq9sT6SzVGBrLz6FwR#2l" +
		"f5wizGVZBHQBXtPoQnbPYZuwTeXYJbJ2KE4dDr$0mnItkgelySmVj0azvNYtARvbGpleayc" +
		"eC36kkWbagjXlm2yH6nWSZidDUD4hNgZmdqawtQMFel4PyHWrKRH$zLefaerlnAefQnEl8R" +
		"H2inGMDJEklobmRSYQhN9EB4gg1cmEMpHxNvoS$qdy3yQSIpn3hYHTMQbRSH#yBvY6Xikta" +
		"7waydzXDbEZvqbBcE74Nl2FY7EtqtC9UtnfAks#6jGN#TDPbt5CvnK$IzzT2SdVJJ0ZLscr" +
		"XWBIrIVYnG8qsrnvLRgFK9#9b4ElrNkhg$f9vV3$XxULq$yfg0rkhjKwTHnsrcZmRy7F967" +
		"MyEz9ZZCLOYwKz#bdPfan$bYFmklyaXEIW7v5VPB$la5pdC#0$4ztxsTyhjyYrjgp$wXlPp" +
		"#PHscsfRPJFj9zR$MBXVP0knoOutoWxPBjm7yY6nmMeVo7loBfaxKzPRfT6l$ZMnbsZn5Pw" +
		"DqkntrIvVoZlMUvjuIzPHsUF7TllU5xIx$D5Eeab#qYBZUROw$6f6557xHIcstwv$Hpbpo$" +
		"KhEO9SPhzb2QGa#SbZmx4kuXx7sK#SDKiL9HOH8geSKIqQYAK4E5LZCVFRbzyZnwBI8k9p1" +
		"Jc1why0dDIymG==");

	// suppress parser error reporting and let the custom error recovery mechanism handle it
	private static class SDocEvents extends Events
	{
		public void scannerError(Scanner.Exception e)
		{
		}

		public void syntaxError(Symbol token)
		{
		}

		public void unexpectedTokenRemoved(Symbol token)
		{
		}

		public void missingTokenInserted(Symbol token)
		{
		}

		public void misspelledTokenReplaced(Symbol token)
		{
		}

		public void errorPhraseRemoved(Symbol error)
		{
		}
	}
	
	private SDocScanner fScanner;
	
	/**
	 * parse
	 *
	 * @param source
	 */
	public Object parse(String source) throws java.lang.Exception
	{
		return parse(source, 0);
	}
	
	/**
	 * parse
	 *
	 * @param source
	 * @param offset
	 */
	public Object parse(String source, int offset) throws java.lang.Exception
	{
		fScanner.setOffset(offset);
		fScanner.setSource(source);
		
		return parse(fScanner);
	}

	public SDocParser() {
		super(PARSING_TABLES);


	report = new SDocEvents();
	fScanner = new SDocScanner();
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		switch(rule_num) {
			case 1: // Block = START_DOCUMENTATION Text.text END_DOCUMENTATION
			{
					final Symbol text = _symbols[offset + 2];
					
			return new DocumentationBlock((String) text.value);
			}
			case 2: // Block = START_DOCUMENTATION Tags.tags END_DOCUMENTATION
			{
					final Symbol tags = _symbols[offset + 2];
					
			return new DocumentationBlock((List<Tag>) tags.value);
			}
			case 3: // Block = START_DOCUMENTATION Text.text Tags.tags END_DOCUMENTATION
			{
					final Symbol text = _symbols[offset + 2];
					final Symbol tags = _symbols[offset + 3];
					
			return new DocumentationBlock((String) text.value, (List<Tag>) tags.value);
			}
			case 4: // Text = Text.text TextPart.part
			{
					final Symbol text = _symbols[offset + 1];
					final Symbol part = _symbols[offset + 2];
					
			return new Symbol(text.value + " " + part.value);
			}
			case 15: // Tags = Tags.tags Tag.tag
			{
					final Symbol tags = _symbols[offset + 1];
					final Symbol _symbol_tag = _symbols[offset + 2];
					final Tag tag = (Tag) _symbol_tag.value;
					
			((List<Tag>) tags.value).add(tag);
			
			return tags;
			}
			case 16: // Tags = Tag.tag
			{
					final Symbol _symbol_tag = _symbols[offset + 1];
					final Tag tag = (Tag) _symbol_tag.value;
					
			List<Tag> tags = new ArrayList<Tag>();
			
			tags.add(tag);
			
			return new Symbol(tags);
			}
			case 19: // Tag = ADVANCED opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new AdvancedTag((String) text.value);
			}
			case 20: // Tag = ALIAS Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new AliasTag((String) text.value);
			}
			case 21: // Tag = AUTHOR Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new AuthorTag((String) text.value);
			}
			case 22: // Tag = CLASS_DESCRIPTION LCURLY Namespace.name RCURLY Text.text
			{
					final Symbol _symbol_name = _symbols[offset + 3];
					final String name = (String) _symbol_name.value;
					final Symbol text = _symbols[offset + 5];
					
			return new ClassDescriptionTag(name, (String) text.value);
			}
			case 23: // Tag = CONSTRUCTOR opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new ConstructorTag((String) text.value);
			}
			case 24: // Tag = EXAMPLE Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new ExampleTag((String) text.value);
			}
			case 25: // Tag = EXCEPTION LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new ExceptionTag((List<Type>) types.value, (String) text.value);
			}
			case 26: // Tag = EXTENDS LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new ExtendsTag((List<Type>) types.value, (String) text.value);
			}
			case 27: // Tag = INTERNAL opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new InternalTag((String) text.value);
			}
			case 28: // Tag = METHOD opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new MethodTag((String) text.value);
			}
			case 29: // Tag = NAMESPACE LCURLY Namespace.name RCURLY opt$Text.text
			{
					final Symbol _symbol_name = _symbols[offset + 3];
					final String name = (String) _symbol_name.value;
					final Symbol text = _symbols[offset + 5];
					
			return new NamespaceTag(name, (String) text.value);
			}
			case 30: // Tag = OVERVIEW Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new OverviewTag((String) text.value);
			}
			case 31: // Tag = PARAM LCURLY Types.types RCURLY ParamName.name opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol _symbol_name = _symbols[offset + 5];
					final Parameter name = (Parameter) _symbol_name.value;
					final Symbol text = _symbols[offset + 6];
					
			return new ParamTag(name, (List<Type>) types.value, (String) text.value);
			}
			case 32: // Tag = PRIVATE opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new PrivateTag((String) text.value);
			}
			case 33: // Tag = PROPERTY LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new PropertyTag((List<Type>) types.value, (String) text.value);
			}
			case 34: // Tag = RETURN LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new ReturnTag((List<Type>) types.value, (String) text.value);
			}
			case 35: // Tag = SEE Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new SeeTag((String) text.value);
			}
			case 36: // Tag = TYPE LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new TypeTag((List<Type>) types.value, (String) text.value);
			}
			case 37: // Tag = UNKNOWN.name opt$Text.text
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					final Symbol text = _symbols[offset + 2];
					
			return new UnknownTag(name, (String) text.value);
			}
			case 38: // Types = Types.types TypeDelimiter Type.type
			{
					final Symbol types = _symbols[offset + 1];
					final Symbol _symbol_type = _symbols[offset + 3];
					final Type type = (Type) _symbol_type.value;
					
			((List<Type>) types.value).add(type);
			
			return types;
			}
			case 39: // Types = Type.type
			{
					final Symbol _symbol_type = _symbols[offset + 1];
					final Type type = (Type) _symbol_type.value;
					
			List<Type> types = new ArrayList<Type>();
			
			types.add(type);
			
			return new Symbol(types);
			}
			case 42: // Type = IDENTIFIER.name
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					
			return new Type(name);
			}
			case 43: // Type = IDENTIFIER.name LBRACKET RBRACKET
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					
			return new ArrayType(new Type(name));
			}
			case 44: // Type = CLASS LESS_THAN Type.memberType GREATER_THAN
			{
					final Symbol _symbol_memberType = _symbols[offset + 3];
					final Type memberType = (Type) _symbol_memberType.value;
					
			return new ClassType(memberType);
			}
			case 45: // Type = ARRAY LBRACKET RBRACKET
			{
					
			return new ArrayType();
			}
			case 46: // Type = FUNCTION LBRACKET RBRACKET
			{
					
			return new FunctionType();
			}
			case 47: // Type = ARRAY
			{
					
			return new ArrayType();
			}
			case 48: // Type = ARRAY LESS_THAN Type.memberType GREATER_THAN
			{
					final Symbol _symbol_memberType = _symbols[offset + 3];
					final Type memberType = (Type) _symbol_memberType.value;
					
			return new ArrayType(memberType);
			}
			case 49: // Type = FUNCTION
			{
					
			return new FunctionType();
			}
			case 50: // Type = FUNCTION ReturnDelimiter Type.returnType
			{
					final Symbol _symbol_returnType = _symbols[offset + 3];
					final Type returnType = (Type) _symbol_returnType.value;
					
			FunctionType function = new FunctionType();
			
			function.addReturnType(returnType);
			
			return function;
			}
			case 51: // Type = FUNCTION ReturnDelimiter LPAREN Types.returnTypes RPAREN
			{
					final Symbol returnTypes = _symbols[offset + 4];
					
			FunctionType function = new FunctionType();
			
			for (Type returnType : (List<Type>) returnTypes.value)
			{
				function.addReturnType(returnType);
			}
			
			return function;
			}
			case 52: // Type = FUNCTION LPAREN RPAREN
			{
					
			return new FunctionType();
			}
			case 53: // Type = FUNCTION LPAREN RPAREN ReturnDelimiter Type.returnType
			{
					final Symbol _symbol_returnType = _symbols[offset + 5];
					final Type returnType = (Type) _symbol_returnType.value;
					
			FunctionType function = new FunctionType();
			
			function.addReturnType(returnType);
			
			return function;
			}
			case 54: // Type = FUNCTION LPAREN RPAREN ReturnDelimiter LPAREN Types.returnTypes RPAREN
			{
					final Symbol returnTypes = _symbols[offset + 6];
					
			FunctionType function = new FunctionType();
			
			for (Type returnType : (List<Type>) returnTypes.value)
			{
				function.addReturnType(returnType);
			}
			
			return function;
			}
			case 55: // Type = FUNCTION LPAREN Types.parameterTypes RPAREN
			{
					final Symbol parameterTypes = _symbols[offset + 3];
					
			FunctionType function = new FunctionType();
			
			for (Type parameterType : (List<Type>) parameterTypes.value)
			{
				function.addParameterType(parameterType);
			}
			
			return function;
			}
			case 56: // Type = FUNCTION LPAREN Types.parameterTypes RPAREN ReturnDelimiter Type.returnType
			{
					final Symbol parameterTypes = _symbols[offset + 3];
					final Symbol _symbol_returnType = _symbols[offset + 6];
					final Type returnType = (Type) _symbol_returnType.value;
					
			FunctionType function = new FunctionType();
			
			for (Type parameterType : (List<Type>) parameterTypes.value)
			{
				function.addParameterType(parameterType);
			}
			
			function.addReturnType(returnType);
			
			return function;
			}
			case 57: // Type = FUNCTION LPAREN Types.parameterTypes RPAREN ReturnDelimiter LPAREN Types.returnTypes RPAREN
			{
					final Symbol parameterTypes = _symbols[offset + 3];
					final Symbol returnTypes = _symbols[offset + 7];
					
			FunctionType function = new FunctionType();
			
			for (Type parameterType : (List<Type>) parameterTypes.value)
			{
				function.addParameterType(parameterType);
			}
			
			for (Type returnType : (List<Type>) returnTypes.value)
			{
				function.addReturnType(returnType);
			}
			
			return function;
			}
			case 60: // ParamName = TEXT.name
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					
			return new Parameter(name);
			}
			case 61: // ParamName = LBRACKET TEXT.name RBRACKET
			{
					final Symbol _symbol_name = _symbols[offset + 2];
					final String name = (String) _symbol_name.value;
					
			Parameter result = new Parameter(name);
			
			result.setUsage(Usage.OPTIONAL);
			
			return result;
			}
			case 62: // ParamName = ELLIPSIS
			{
					
			Parameter result = new Parameter("...");
			
			result.setUsage(Usage.ONE_OR_MORE);
			
			return result;
			}
			case 63: // ParamName = LBRACKET ELLIPSIS RBRACKET
			{
					
			Parameter result = new Parameter("...");
			
			result.setUsage(Usage.ZERO_OR_MORE);
			
			return result;
			}
			case 17: // opt$Text = 
			{
				return new Symbol(null);
			}
			case 0: // Grammar = Block
			case 5: // Text = TextPart
			case 6: // TextPart = TEXT
			case 7: // TextPart = LBRACKET
			case 8: // TextPart = RBRACKET
			case 9: // TextPart = LCURLY
			case 10: // TextPart = RCURLY
			case 11: // TextPart = POUND
			case 12: // TextPart = IDENTIFIER
			case 13: // TextPart = COLON
			case 14: // TextPart = ERROR
			case 18: // opt$Text = Text
			case 40: // TypeDelimiter = COMMA
			case 41: // TypeDelimiter = PIPE
			case 58: // ReturnDelimiter = COLON
			case 59: // ReturnDelimiter = ARROW
			case 64: // Namespace = IDENTIFIER
			case 65: // Namespace = FUNCTION
			case 66: // Namespace = ARRAY
			{
				return _symbols[offset + 1];
			}
			default:
				throw new IllegalArgumentException("unknown production #" + rule_num);
		}
	}
}
