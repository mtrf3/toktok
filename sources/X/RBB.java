package X;

import android.content.res.Resources;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RBB implements RBL {
    public static final RBE LIZJ = RBE.ALL_CHARS_VALID_RULE;
    public final Resources LIZ;
    public final RBK LIZIZ;

    public RBB(Resources resources) {
        RBK rbk = new RBK();
        o.LJIIIZ(resources, "resources");
        this.LIZ = resources;
        this.LIZIZ = rbk;
    }

    @Override // X.RBL
    public final RB8 LIZ(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            this.LIZIZ.getClass();
            if (!PatternProtector.compile("^[A-Za-z0-9_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\]*$").matcher(String.valueOf(charAt)).matches()) {
                return new RB8(LIZJ, false, this.LIZ.getString(R.string.rda, Character.valueOf(charAt)));
            }
        }
        return new RB8(LIZJ, true, null);
    }
}
