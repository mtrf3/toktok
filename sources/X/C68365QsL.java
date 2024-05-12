package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QsL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68365QsL implements InterfaceC68379QsZ {
    public final boolean LJLIL;

    @Override // X.InterfaceC68379QsZ
    public final Double LJI() {
        double d;
        if (true != this.LJLIL) {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            d = 1.0d;
        }
        return Double.valueOf(d);
    }

    @Override // X.InterfaceC68379QsZ
    public final Iterator LJIIJ() {
        return null;
    }

    @Override // X.InterfaceC68379QsZ
    public final Boolean LIZJ() {
        return Boolean.valueOf(this.LJLIL);
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LIZLLL() {
        return new C68365QsL(Boolean.valueOf(this.LJLIL));
    }

    @Override // X.InterfaceC68379QsZ
    public final String LJII() {
        return Boolean.toString(this.LJLIL);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.LJLIL).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.LJLIL);
    }

    public C68365QsL(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.LJLIL = booleanValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C68365QsL) && this.LJLIL == ((C68365QsL) obj).LJLIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LJIILJJIL(String str, C68377QsX c68377QsX, List list) {
        if ("toString".equals(str)) {
            return new C68376QsW(Boolean.toString(this.LJLIL));
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("%s.%s is not a function.", new Object[]{Boolean.toString(this.LJLIL), str}));
    }
}
