package X;

import com.bytedance.android.livesdk.livesetting.other.LiveEcommerceInnerSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.BMl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28655BMl {
    public static final C5H3<C28655BMl> LJIIIIZZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C28656BMm.LJLIL);
    public Long LIZ;
    public Long LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL = true;
    public String LJ;
    public Long LJFF;
    public String LJI;
    public int LJII;

    public final boolean LIZIZ() {
        if (!this.LIZJ || this.LJ == null) {
            return false;
        }
        return true;
    }

    public static String LIZ(C28655BMl c28655BMl, Long l, boolean z, int i) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((!c28655BMl.LIZJ || (!o.LJ(l, c28655BMl.LIZIZ) && !LiveEcommerceInnerSetting.INSTANCE.m63switch())) && !z) {
            return null;
        }
        return c28655BMl.LJ;
    }
}
