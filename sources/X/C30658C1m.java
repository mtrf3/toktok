package X;

import android.graphics.Rect;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.C1m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30658C1m extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final EnumC74778TWk LJLJJL;
    public final boolean LJLJJLL;
    public final InterfaceC65784Pro<Rect> LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), this.LJLJJL, Boolean.valueOf(this.LJLJJLL), this.LJLJL};
    }

    public final boolean L() {
        if (this.LJLIL != 0 && this.LJLILLLLZI != 0) {
            return true;
        }
        return false;
    }

    public C30658C1m(int i, int i2, int i3, int i4, EnumC74778TWk multiLiveType, boolean z, InterfaceC65784Pro<Rect> getLayoutRect) {
        o.LJIIIZ(multiLiveType, "multiLiveType");
        o.LJIIIZ(getLayoutRect, "getLayoutRect");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = multiLiveType;
        this.LJLJJLL = z;
        this.LJLJL = getLayoutRect;
    }

    public /* synthetic */ C30658C1m(int i, int i2, int i3, int i4, EnumC74778TWk enumC74778TWk, boolean z, AqS163S0100000_13 aqS163S0100000_13, int i5) {
        this(i, i2, i3, i4, (i5 & 16) != 0 ? EnumC74778TWk.NORMAL : enumC74778TWk, (i5 & 32) != 0 ? false : z, (i5 & 64) != 0 ? C30682C2k.LJLIL : aqS163S0100000_13);
    }
}
