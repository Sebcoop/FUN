// Generated from Fun.g4 by ANTLR 4.4

package ast;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, ELSE=2, FALSE=3, FUNC=4, IF=5, INT=6, PROC=7, RETURN=8, TRUE=9, 
		WHILE=10, FOR=11, TO=12, EQ=13, LT=14, GT=15, PLUS=16, MINUS=17, TIMES=18, 
		DIV=19, NOT=20, ASSN=21, LPAR=22, RPAR=23, COLON=24, DOT=25, COMMA=26, 
		NUM=27, ID=28, SPACE=29, EOL=30, COMMENT=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'bool'", "'else'", "'false'", "'func'", "'if'", "'int'", 
		"'proc'", "'return'", "'true'", "'while'", "'for'", "'to'", "'=='", "'<'", 
		"'>'", "'+'", "'-'", "'*'", "'/'", "'not'", "'='", "'('", "')'", "':'", 
		"'.'", "','", "NUM", "ID", "SPACE", "EOL", "COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_proc_decl = 1, RULE_formal_decl_seq = 2, RULE_formal_decl = 3, 
		RULE_var_decl = 4, RULE_type = 5, RULE_com = 6, RULE_seq_com = 7, RULE_expr = 8, 
		RULE_sec_expr = 9, RULE_prim_expr = 10, RULE_actual_seq = 11;
	public static final String[] ruleNames = {
		"program", "proc_decl", "formal_decl_seq", "formal_decl", "var_decl", 
		"type", "com", "seq_com", "expr", "sec_expr", "prim_expr", "actual_seq"
	};

	@Override
	public String getGrammarFileName() { return "Fun.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(FunParser.EOF, 0); }
		public List<Proc_declContext> proc_decl() {
			return getRuleContexts(Proc_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Proc_declContext proc_decl(int i) {
			return getRuleContext(Proc_declContext.class,i);
		}
		public ProgContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitProg(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOL || _la==INT) {
				{
				{
				setState(24); var_decl();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30); proc_decl();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC || _la==PROC );
			setState(35); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_declContext extends ParserRuleContext {
		public Proc_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_decl; }
	 
		public Proc_declContext() { }
		public void copyFrom(Proc_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcContext extends Proc_declContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public TerminalNode PROC() { return getToken(FunParser.PROC, 0); }
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Formal_decl_seqContext formal_decl_seq() {
			return getRuleContext(Formal_decl_seqContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public ProcContext(Proc_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitProc(this);
		}
	}
	public static class FuncContext extends Proc_declContext {
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public TerminalNode RETURN() { return getToken(FunParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Formal_decl_seqContext formal_decl_seq() {
			return getRuleContext(Formal_decl_seqContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode FUNC() { return getToken(FunParser.FUNC, 0); }
		public FuncContext(Proc_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFunc(this);
		}
	}

	public final Proc_declContext proc_decl() throws RecognitionException {
		Proc_declContext _localctx = new Proc_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proc_decl);
		int _la;
		try {
			setState(74);
			switch (_input.LA(1)) {
			case PROC:
				_localctx = new ProcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37); match(PROC);
				setState(38); match(ID);
				setState(39); match(LPAR);
				setState(41);
				_la = _input.LA(1);
				if (_la==BOOL || _la==INT) {
					{
					setState(40); formal_decl_seq();
					}
				}

				setState(43); match(RPAR);
				setState(44); match(COLON);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOL || _la==INT) {
					{
					{
					setState(45); var_decl();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51); seq_com();
				setState(52); match(DOT);
				}
				break;
			case FUNC:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54); match(FUNC);
				setState(55); type();
				setState(56); match(ID);
				setState(57); match(LPAR);
				setState(59);
				_la = _input.LA(1);
				if (_la==BOOL || _la==INT) {
					{
					setState(58); formal_decl_seq();
					}
				}

				setState(61); match(RPAR);
				setState(62); match(COLON);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOL || _la==INT) {
					{
					{
					setState(63); var_decl();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69); seq_com();
				setState(70); match(RETURN);
				setState(71); expr();
				setState(72); match(DOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_decl_seqContext extends ParserRuleContext {
		public Formal_decl_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_decl_seq; }
	 
		public Formal_decl_seqContext() { }
		public void copyFrom(Formal_decl_seqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalseqContext extends Formal_decl_seqContext {
		public List<TerminalNode> COMMA() { return getTokens(FunParser.COMMA); }
		public List<Formal_declContext> formal_decl() {
			return getRuleContexts(Formal_declContext.class);
		}
		public Formal_declContext formal_decl(int i) {
			return getRuleContext(Formal_declContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(FunParser.COMMA, i);
		}
		public FormalseqContext(Formal_decl_seqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFormalseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFormalseq(this);
		}
	}

	public final Formal_decl_seqContext formal_decl_seq() throws RecognitionException {
		Formal_decl_seqContext _localctx = new Formal_decl_seqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formal_decl_seq);
		int _la;
		try {
			_localctx = new FormalseqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76); formal_decl();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77); match(COMMA);
				setState(78); formal_decl();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_declContext extends ParserRuleContext {
		public Formal_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_decl; }
	 
		public Formal_declContext() { }
		public void copyFrom(Formal_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalContext extends Formal_declContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalContext(Formal_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFormal(this);
		}
	}

	public final Formal_declContext formal_decl() throws RecognitionException {
		Formal_declContext _localctx = new Formal_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal_decl);
		try {
			_localctx = new FormalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84); type();
			setState(85); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarContext extends Var_declContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSN() { return getToken(FunParser.ASSN, 0); }
		public VarContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitVar(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			_localctx = new VarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87); type();
			setState(88); match(ID);
			setState(89); match(ASSN);
			setState(90); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(FunParser.BOOL, 0); }
		public BoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitBool(this);
		}
	}
	public static class IntContext extends TypeContext {
		public TerminalNode INT() { return getToken(FunParser.INT, 0); }
		public IntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitInt(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92); match(BOOL);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssnContext extends ComContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSN() { return getToken(FunParser.ASSN, 0); }
		public AssnContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterAssn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitAssn(this);
		}
	}
	public static class ProccallContext extends ComContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public Actual_seqContext actual_seq() {
			return getRuleContext(Actual_seqContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public ProccallContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterProccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitProccall(this);
		}
	}
	public static class ForContext extends ComContext {
		public ExprContext e1;
		public ExprContext e2;
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public TerminalNode FOR() { return getToken(FunParser.FOR, 0); }
		public TerminalNode TO() { return getToken(FunParser.TO, 0); }
		public TerminalNode ASSN() { return getToken(FunParser.ASSN, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public ForContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFor(this);
		}
	}
	public static class WhileContext extends ComContext {
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(FunParser.WHILE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitWhile(this);
		}
	}
	public static class IfContext extends ComContext {
		public Seq_comContext c1;
		public Seq_comContext c2;
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public TerminalNode ELSE() { return getToken(FunParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(FunParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON(int i) {
			return getToken(FunParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(FunParser.COLON); }
		public List<Seq_comContext> seq_com() {
			return getRuleContexts(Seq_comContext.class);
		}
		public Seq_comContext seq_com(int i) {
			return getRuleContext(Seq_comContext.class,i);
		}
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitIf(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_com);
		int _la;
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AssnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96); match(ID);
				setState(97); match(ASSN);
				setState(98); expr();
				}
				break;
			case 2:
				_localctx = new ProccallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99); match(ID);
				setState(100); match(LPAR);
				setState(102);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << NOT) | (1L << LPAR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(101); actual_seq();
					}
				}

				setState(104); match(RPAR);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105); match(IF);
				setState(106); expr();
				setState(107); match(COLON);
				setState(108); ((IfContext)_localctx).c1 = seq_com();
				setState(115);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(109); match(DOT);
					}
					break;
				case ELSE:
					{
					setState(110); match(ELSE);
					setState(111); match(COLON);
					setState(112); ((IfContext)_localctx).c2 = seq_com();
					setState(113); match(DOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(117); match(WHILE);
				setState(118); expr();
				setState(119); match(COLON);
				setState(120); seq_com();
				setState(121); match(DOT);
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123); match(FOR);
				setState(124); match(ID);
				setState(125); match(ASSN);
				setState(126); ((ForContext)_localctx).e1 = expr();
				setState(127); match(TO);
				setState(128); ((ForContext)_localctx).e2 = expr();
				setState(129); match(COLON);
				setState(130); seq_com();
				setState(131); match(DOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Seq_comContext extends ParserRuleContext {
		public Seq_comContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq_com; }
	 
		public Seq_comContext() { }
		public void copyFrom(Seq_comContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SeqContext extends Seq_comContext {
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public SeqContext(Seq_comContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitSeq(this);
		}
	}

	public final Seq_comContext seq_com() throws RecognitionException {
		Seq_comContext _localctx = new Seq_comContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_seq_com);
		int _la;
		try {
			_localctx = new SeqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(135); com();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Sec_exprContext e1;
		public Token op;
		public Sec_exprContext e2;
		public TerminalNode LT() { return getToken(FunParser.LT, 0); }
		public Sec_exprContext sec_expr(int i) {
			return getRuleContext(Sec_exprContext.class,i);
		}
		public TerminalNode GT() { return getToken(FunParser.GT, 0); }
		public TerminalNode EQ() { return getToken(FunParser.EQ, 0); }
		public List<Sec_exprContext> sec_expr() {
			return getRuleContexts(Sec_exprContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); ((ExprContext)_localctx).e1 = sec_expr();
			setState(144);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) {
				{
				setState(142);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(143); ((ExprContext)_localctx).e2 = sec_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sec_exprContext extends ParserRuleContext {
		public Prim_exprContext e1;
		public Token op;
		public Sec_exprContext e2;
		public Prim_exprContext prim_expr() {
			return getRuleContext(Prim_exprContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(FunParser.TIMES, 0); }
		public TerminalNode PLUS() { return getToken(FunParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunParser.MINUS, 0); }
		public Sec_exprContext sec_expr() {
			return getRuleContext(Sec_exprContext.class,0);
		}
		public TerminalNode DIV() { return getToken(FunParser.DIV, 0); }
		public Sec_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sec_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterSec_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitSec_expr(this);
		}
	}

	public final Sec_exprContext sec_expr() throws RecognitionException {
		Sec_exprContext _localctx = new Sec_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sec_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); ((Sec_exprContext)_localctx).e1 = prim_expr();
			setState(149);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) {
				{
				setState(147);
				((Sec_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) ) {
					((Sec_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(148); ((Sec_exprContext)_localctx).e2 = sec_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prim_exprContext extends ParserRuleContext {
		public Prim_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim_expr; }
	 
		public Prim_exprContext() { }
		public void copyFrom(Prim_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends Prim_exprContext {
		public TerminalNode NOT() { return getToken(FunParser.NOT, 0); }
		public Prim_exprContext prim_expr() {
			return getRuleContext(Prim_exprContext.class,0);
		}
		public NotContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitNot(this);
		}
	}
	public static class ParensContext extends Prim_exprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public ParensContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitParens(this);
		}
	}
	public static class FunccallContext extends Prim_exprContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public Actual_seqContext actual_seq() {
			return getRuleContext(Actual_seqContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public FunccallContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFunccall(this);
		}
	}
	public static class NumContext extends Prim_exprContext {
		public TerminalNode NUM() { return getToken(FunParser.NUM, 0); }
		public NumContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitNum(this);
		}
	}
	public static class FalseContext extends Prim_exprContext {
		public TerminalNode FALSE() { return getToken(FunParser.FALSE, 0); }
		public FalseContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFalse(this);
		}
	}
	public static class TrueContext extends Prim_exprContext {
		public TerminalNode TRUE() { return getToken(FunParser.TRUE, 0); }
		public TrueContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitTrue(this);
		}
	}
	public static class IdContext extends Prim_exprContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public IdContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitId(this);
		}
	}

	public final Prim_exprContext prim_expr() throws RecognitionException {
		Prim_exprContext _localctx = new Prim_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prim_expr);
		int _la;
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151); match(FALSE);
				}
				break;
			case 2:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152); match(TRUE);
				}
				break;
			case 3:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153); match(NUM);
				}
				break;
			case 4:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154); match(ID);
				}
				break;
			case 5:
				_localctx = new FunccallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(155); match(ID);
				setState(156); match(LPAR);
				setState(158);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << NOT) | (1L << LPAR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(157); actual_seq();
					}
				}

				setState(160); match(RPAR);
				}
				break;
			case 6:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(161); match(NOT);
				setState(162); prim_expr();
				}
				break;
			case 7:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(163); match(LPAR);
				setState(164); expr();
				setState(165); match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_seqContext extends ParserRuleContext {
		public Actual_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_seq; }
	 
		public Actual_seqContext() { }
		public void copyFrom(Actual_seqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActualseqContext extends Actual_seqContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunParser.COMMA, i);
		}
		public ActualseqContext(Actual_seqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterActualseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitActualseq(this);
		}
	}

	public final Actual_seqContext actual_seq() throws RecognitionException {
		Actual_seqContext _localctx = new Actual_seqContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_actual_seq);
		int _la;
		try {
			_localctx = new ActualseqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(169); expr();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(170); match(COMMA);
				setState(171); expr();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\2\3\2\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\7\3C\n"+
		"\3\f\3\16\3F\13\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\7\4R\n\4\f"+
		"\4\16\4U\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7a\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bi\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bv\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0088\n\b\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\n\3\n\3\n\5"+
		"\n\u0093\n\n\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00a1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00aa\n\f\3\r\3\r\3\r"+
		"\7\r\u00af\n\r\f\r\16\r\u00b2\13\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\4\3\2\17\21\3\2\22\25\u00c1\2\35\3\2\2\2\4L\3\2\2\2\6N\3\2\2"+
		"\2\bV\3\2\2\2\nY\3\2\2\2\f`\3\2\2\2\16\u0087\3\2\2\2\20\u008c\3\2\2\2"+
		"\22\u008f\3\2\2\2\24\u0094\3\2\2\2\26\u00a9\3\2\2\2\30\u00ab\3\2\2\2\32"+
		"\34\5\n\6\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"!\3\2\2\2\37\35\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3"+
		"\2\2\2$%\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'(\7\t\2\2()\7\36\2\2)+\7\30\2\2"+
		"*,\5\6\4\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\31\2\2.\62\7\32\2\2/\61\5"+
		"\n\6\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2"+
		"\2\2\64\62\3\2\2\2\65\66\5\20\t\2\66\67\7\33\2\2\67M\3\2\2\289\7\6\2\2"+
		"9:\5\f\7\2:;\7\36\2\2;=\7\30\2\2<>\5\6\4\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2"+
		"\2?@\7\31\2\2@D\7\32\2\2AC\5\n\6\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2"+
		"\2\2EG\3\2\2\2FD\3\2\2\2GH\5\20\t\2HI\7\n\2\2IJ\5\22\n\2JK\7\33\2\2KM"+
		"\3\2\2\2L\'\3\2\2\2L8\3\2\2\2M\5\3\2\2\2NS\5\b\5\2OP\7\34\2\2PR\5\b\5"+
		"\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2US\3\2\2\2VW\5\f"+
		"\7\2WX\7\36\2\2X\t\3\2\2\2YZ\5\f\7\2Z[\7\36\2\2[\\\7\27\2\2\\]\5\22\n"+
		"\2]\13\3\2\2\2^a\7\3\2\2_a\7\b\2\2`^\3\2\2\2`_\3\2\2\2a\r\3\2\2\2bc\7"+
		"\36\2\2cd\7\27\2\2d\u0088\5\22\n\2ef\7\36\2\2fh\7\30\2\2gi\5\30\r\2hg"+
		"\3\2\2\2hi\3\2\2\2ij\3\2\2\2j\u0088\7\31\2\2kl\7\7\2\2lm\5\22\n\2mn\7"+
		"\32\2\2nu\5\20\t\2ov\7\33\2\2pq\7\4\2\2qr\7\32\2\2rs\5\20\t\2st\7\33\2"+
		"\2tv\3\2\2\2uo\3\2\2\2up\3\2\2\2v\u0088\3\2\2\2wx\7\f\2\2xy\5\22\n\2y"+
		"z\7\32\2\2z{\5\20\t\2{|\7\33\2\2|\u0088\3\2\2\2}~\7\r\2\2~\177\7\36\2"+
		"\2\177\u0080\7\27\2\2\u0080\u0081\5\22\n\2\u0081\u0082\7\16\2\2\u0082"+
		"\u0083\5\22\n\2\u0083\u0084\7\32\2\2\u0084\u0085\5\20\t\2\u0085\u0086"+
		"\7\33\2\2\u0086\u0088\3\2\2\2\u0087b\3\2\2\2\u0087e\3\2\2\2\u0087k\3\2"+
		"\2\2\u0087w\3\2\2\2\u0087}\3\2\2\2\u0088\17\3\2\2\2\u0089\u008b\5\16\b"+
		"\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\21\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0092\5\24\13\2\u0090"+
		"\u0091\t\2\2\2\u0091\u0093\5\24\13\2\u0092\u0090\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\23\3\2\2\2\u0094\u0097\5\26\f\2\u0095\u0096\t\3\2\2\u0096"+
		"\u0098\5\24\13\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\25\3\2"+
		"\2\2\u0099\u00aa\7\5\2\2\u009a\u00aa\7\13\2\2\u009b\u00aa\7\35\2\2\u009c"+
		"\u00aa\7\36\2\2\u009d\u009e\7\36\2\2\u009e\u00a0\7\30\2\2\u009f\u00a1"+
		"\5\30\r\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2"+
		"\u00a2\u00aa\7\31\2\2\u00a3\u00a4\7\26\2\2\u00a4\u00aa\5\26\f\2\u00a5"+
		"\u00a6\7\30\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8\7\31\2\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u0099\3\2\2\2\u00a9\u009a\3\2\2\2\u00a9\u009b\3\2\2\2\u00a9"+
		"\u009c\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a5\3\2"+
		"\2\2\u00aa\27\3\2\2\2\u00ab\u00b0\5\22\n\2\u00ac\u00ad\7\34\2\2\u00ad"+
		"\u00af\5\22\n\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\31\3\2\2\2\u00b2\u00b0\3\2\2\2\24\35"+
		"#+\62=DLS`hu\u0087\u008c\u0092\u0097\u00a0\u00a9\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}