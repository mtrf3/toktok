package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94133mj extends F9E implements InterfaceC57784Mm4 {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;

    public C94133mj() {
        this(0, 0, 0, 0, 0, 63);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C94133mj(int i, int i2, int i3, int i4, int i5, int i6) {
        i = (i6 & 1) != 0 ? AnonymousClass391.LIZ(0.5d) : i;
        i2 = (i6 & 2) != 0 ? R.attr.ds : i2;
        i3 = (i6 & 4) != 0 ? 0 : i3;
        i4 = (i6 & 8) != 0 ? 0 : i4;
        i5 = (i6 & 16) != 0 ? 0 : i5;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
        this.LJLJJLL = 0;
    }
}
