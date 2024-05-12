package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.15R, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C15R {
    public static final Charset LIZ;
    public static final Pattern LIZIZ;
    public static final Pattern LIZJ;
    public static final Pattern LIZLLL;
    public static final Pattern LJ;
    public static final C5H3<String[]> LJFF;

    public abstract C14F LIZ(InputStream inputStream);

    static {
        Charset forName = Charset.forName("utf-8");
        o.LJIIIIZZ(forName, "forName(\"utf-8\")");
        LIZ = forName;
        Pattern compile = PatternProtector.compile("\\[\\d+,\\d+\\]");
        o.LJIIIIZZ(compile, "compile(\"\\\\[\\\\d+,\\\\d+\\\\]\")");
        LIZIZ = compile;
        Pattern compile2 = PatternProtector.compile("\\<\\d+,\\d+,\\d+\\>");
        o.LJIIIIZZ(compile2, "compile(\"\\\\<\\\\d+,\\\\d+,\\\\d+\\\\>\")");
        LIZJ = compile2;
        Pattern compile3 = PatternProtector.compile("(\\[\\d+:\\d+.\\d+\\])+");
        o.LJIIIIZZ(compile3, "compile(\"($LRC_TIME_REGEX)+\")");
        LIZLLL = compile3;
        Pattern compile4 = PatternProtector.compile("\\[\\d+:\\d+.\\d+\\]");
        o.LJIIIIZZ(compile4, "compile(LRC_TIME_REGEX)");
        LJ = compile4;
        LJFF = C221108m2.LIZ(EnumC221088m0.NONE, C535028c.LJLIL);
    }
}
