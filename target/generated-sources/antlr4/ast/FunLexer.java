// Generated from Fun.g4 by ANTLR 4.4

package ast;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, ELSE=2, FALSE=3, FUNC=4, IF=5, INT=6, PROC=7, RETURN=8, TRUE=9, 
		WHILE=10, FOR=11, TO=12, EQ=13, LT=14, GT=15, PLUS=16, MINUS=17, TIMES=18, 
		DIV=19, NOT=20, ASSN=21, LPAR=22, RPAR=23, COLON=24, DOT=25, COMMA=26, 
		NUM=27, ID=28, SPACE=29, EOL=30, COMMENT=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'"
	};
	public static final String[] ruleNames = {
		"BOOL", "ELSE", "FALSE", "FUNC", "IF", "INT", "PROC", "RETURN", "TRUE", 
		"WHILE", "FOR", "TO", "EQ", "LT", "GT", "PLUS", "MINUS", "TIMES", "DIV", 
		"NOT", "ASSN", "LPAR", "RPAR", "COLON", "DOT", "COMMA", "NUM", "ID", "SPACE", 
		"EOL", "COMMENT", "LETTER", "DIGIT"
	};


	public FunLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Fun.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00a0"+
		"\n\34\r\34\16\34\u00a1\3\35\3\35\3\35\7\35\u00a7\n\35\f\35\16\35\u00aa"+
		"\13\35\3\36\6\36\u00ad\n\36\r\36\16\36\u00ae\3\36\3\36\3\37\5\37\u00b4"+
		"\n\37\3\37\3\37\3\37\3\37\3 \3 \7 \u00bc\n \f \16 \u00bf\13 \3 \5 \u00c2"+
		"\n \3 \3 \3 \3 \3!\3!\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\2\3\2\5\4\2\13\13\"\"\4\2"+
		"\f\f\17\17\4\2C\\c|\u00cf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3E\3\2\2\2\5J\3\2"+
		"\2\2\7O\3\2\2\2\tU\3\2\2\2\13Z\3\2\2\2\r]\3\2\2\2\17a\3\2\2\2\21f\3\2"+
		"\2\2\23m\3\2\2\2\25r\3\2\2\2\27x\3\2\2\2\31|\3\2\2\2\33\177\3\2\2\2\35"+
		"\u0082\3\2\2\2\37\u0084\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a\3"+
		"\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u0092\3\2\2\2-\u0094\3\2\2\2/\u0096"+
		"\3\2\2\2\61\u0098\3\2\2\2\63\u009a\3\2\2\2\65\u009c\3\2\2\2\67\u009f\3"+
		"\2\2\29\u00a3\3\2\2\2;\u00ac\3\2\2\2=\u00b3\3\2\2\2?\u00b9\3\2\2\2A\u00c7"+
		"\3\2\2\2C\u00c9\3\2\2\2EF\7d\2\2FG\7q\2\2GH\7q\2\2HI\7n\2\2I\4\3\2\2\2"+
		"JK\7g\2\2KL\7n\2\2LM\7u\2\2MN\7g\2\2N\6\3\2\2\2OP\7h\2\2PQ\7c\2\2QR\7"+
		"n\2\2RS\7u\2\2ST\7g\2\2T\b\3\2\2\2UV\7h\2\2VW\7w\2\2WX\7p\2\2XY\7e\2\2"+
		"Y\n\3\2\2\2Z[\7k\2\2[\\\7h\2\2\\\f\3\2\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2"+
		"`\16\3\2\2\2ab\7r\2\2bc\7t\2\2cd\7q\2\2de\7e\2\2e\20\3\2\2\2fg\7t\2\2"+
		"gh\7g\2\2hi\7v\2\2ij\7w\2\2jk\7t\2\2kl\7p\2\2l\22\3\2\2\2mn\7v\2\2no\7"+
		"t\2\2op\7w\2\2pq\7g\2\2q\24\3\2\2\2rs\7y\2\2st\7j\2\2tu\7k\2\2uv\7n\2"+
		"\2vw\7g\2\2w\26\3\2\2\2xy\7h\2\2yz\7q\2\2z{\7t\2\2{\30\3\2\2\2|}\7v\2"+
		"\2}~\7q\2\2~\32\3\2\2\2\177\u0080\7?\2\2\u0080\u0081\7?\2\2\u0081\34\3"+
		"\2\2\2\u0082\u0083\7>\2\2\u0083\36\3\2\2\2\u0084\u0085\7@\2\2\u0085 \3"+
		"\2\2\2\u0086\u0087\7-\2\2\u0087\"\3\2\2\2\u0088\u0089\7/\2\2\u0089$\3"+
		"\2\2\2\u008a\u008b\7,\2\2\u008b&\3\2\2\2\u008c\u008d\7\61\2\2\u008d(\3"+
		"\2\2\2\u008e\u008f\7p\2\2\u008f\u0090\7q\2\2\u0090\u0091\7v\2\2\u0091"+
		"*\3\2\2\2\u0092\u0093\7?\2\2\u0093,\3\2\2\2\u0094\u0095\7*\2\2\u0095."+
		"\3\2\2\2\u0096\u0097\7+\2\2\u0097\60\3\2\2\2\u0098\u0099\7<\2\2\u0099"+
		"\62\3\2\2\2\u009a\u009b\7\60\2\2\u009b\64\3\2\2\2\u009c\u009d\7.\2\2\u009d"+
		"\66\3\2\2\2\u009e\u00a0\5C\"\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a28\3\2\2\2\u00a3\u00a8\5"+
		"A!\2\u00a4\u00a7\5A!\2\u00a5\u00a7\5C\"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		":\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\t\2\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\b\36\2\2\u00b1<\3\2\2\2\u00b2\u00b4\7\17\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\f"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\37\2\2\u00b8>\3\2\2\2\u00b9\u00bd"+
		"\7%\2\2\u00ba\u00bc\n\3\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c2\7\17\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b "+
		"\2\2\u00c6@\3\2\2\2\u00c7\u00c8\t\4\2\2\u00c8B\3\2\2\2\u00c9\u00ca\4\62"+
		";\2\u00caD\3\2\2\2\n\2\u00a1\u00a6\u00a8\u00ae\u00b3\u00bd\u00c1\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}