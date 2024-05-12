package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QDM extends F9E {
    public static final C62822Ol8 LJLJJL;
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    static {
        new QDM(R.string.tef, "U", "US", "+1");
        new QDM(R.string.cq8, "C", "CN", "+86");
        LJLJJL = C221108m2.LIZIZ(C86805Y4z.LJLIL);
    }

    public QDM(int i, String str, String alpha2, String str2) {
        o.LJIIIZ(alpha2, "alpha2");
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = alpha2;
        this.LJLJJI = str2;
    }
}
