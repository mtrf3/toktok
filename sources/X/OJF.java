package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OJF implements Serializable {
    public static final long serialVersionUID = 0;
    public final String LJLIL;
    public final int LJLILLLLZI;

    private final Object readResolve() {
        Pattern compile = PatternProtector.compile(this.LJLIL, this.LJLILLLLZI);
        o.LJIIIIZZ(compile, "compile(pattern, flags)");
        return new OJD(compile);
    }

    public OJF(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
