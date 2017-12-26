// Generated from /Users/oscar/myapps/flink-java-rdf/src/main/java/org/univalle/rdf/compiler/Sparql.g4 by ANTLR 4.7
package org.univalle.rdf.compiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_PARENTHESIS=1, CLOSE_PARENTHESIS=2, PROJECT=3, BGP=4, TRIPLE=5, LEFTJOIN=6, 
		UNION=7, VARIABLE=8, URIREF=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "PROJECT", "BGP", "TRIPLE", "LEFTJOIN", 
		"UNION", "VARIABLE", "URIREF", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'project'", "'bgp'", "'triple'", "'leftjoin'", "'union'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "PROJECT", "BGP", "TRIPLE", 
		"LEFTJOIN", "UNION", "VARIABLE", "URIREF", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SparqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sparql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fS\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\7\t@\n\t\f\t\16\tC\13\t\3\n\3\n\6\nG\n\n\r\n"+
		"\16\nH\3\n\3\n\3\13\6\13N\n\13\r\13\16\13O\3\13\3\13\3H\2\f\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\4\6\2\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\2U\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27"+
		"\3\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t#\3\2\2\2\13\'\3\2\2\2\r.\3\2\2\2"+
		"\17\67\3\2\2\2\21=\3\2\2\2\23D\3\2\2\2\25M\3\2\2\2\27\30\7*\2\2\30\4\3"+
		"\2\2\2\31\32\7+\2\2\32\6\3\2\2\2\33\34\7r\2\2\34\35\7t\2\2\35\36\7q\2"+
		"\2\36\37\7l\2\2\37 \7g\2\2 !\7e\2\2!\"\7v\2\2\"\b\3\2\2\2#$\7d\2\2$%\7"+
		"i\2\2%&\7r\2\2&\n\3\2\2\2\'(\7v\2\2()\7t\2\2)*\7k\2\2*+\7r\2\2+,\7n\2"+
		"\2,-\7g\2\2-\f\3\2\2\2./\7n\2\2/\60\7g\2\2\60\61\7h\2\2\61\62\7v\2\2\62"+
		"\63\7l\2\2\63\64\7q\2\2\64\65\7k\2\2\65\66\7p\2\2\66\16\3\2\2\2\678\7"+
		"w\2\289\7p\2\29:\7k\2\2:;\7q\2\2;<\7p\2\2<\20\3\2\2\2=A\7A\2\2>@\t\2\2"+
		"\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\22\3\2\2\2CA\3\2\2\2DF\7>"+
		"\2\2EG\13\2\2\2FE\3\2\2\2GH\3\2\2\2HI\3\2\2\2HF\3\2\2\2IJ\3\2\2\2JK\7"+
		"@\2\2K\24\3\2\2\2LN\t\3\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ"+
		"\3\2\2\2QR\b\13\2\2R\26\3\2\2\2\6\2AHO\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}