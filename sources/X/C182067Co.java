package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182067Co extends F9E implements InterfaceC57784Mm4 {
    public final int LJLIL = R.string.rq5;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
