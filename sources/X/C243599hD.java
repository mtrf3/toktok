package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.9hD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243599hD implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;
    public final boolean LJLILLLLZI;
    public final InterfaceC88471Ynr<Aweme, Boolean, C76800UCe> LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Aweme aweme = this.LJLIL;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        InterfaceC88471Ynr<Aweme, Boolean, C76800UCe> interfaceC88471Ynr = this.LJLJI;
        return i2 + (interfaceC88471Ynr != null ? interfaceC88471Ynr.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeatureVideoItem(data=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isSelected=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!areItemTheSame(interfaceC57784Mm4) || !(interfaceC57784Mm4 instanceof C243599hD) || this.LJLILLLLZI != ((C243599hD) interfaceC57784Mm4).LJLILLLLZI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C243599hD)) {
            return false;
        }
        return o.LJ(this.LJLIL, ((C243599hD) interfaceC57784Mm4).LJLIL);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C243599hD)) {
            return false;
        }
        return o.LJ(this.LJLIL, ((C243599hD) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C243599hD) || areContentsTheSame(interfaceC57784Mm4)) {
            return null;
        }
        return new C243609hE(((C243599hD) interfaceC57784Mm4).LJLILLLLZI);
    }

    public static C243599hD LIZ(C243599hD c243599hD, boolean z) {
        Aweme aweme = c243599hD.LJLIL;
        InterfaceC88471Ynr<Aweme, Boolean, C76800UCe> interfaceC88471Ynr = c243599hD.LJLJI;
        c243599hD.getClass();
        return new C243599hD(aweme, z, interfaceC88471Ynr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C243599hD(Aweme aweme, boolean z, InterfaceC88471Ynr<? super Aweme, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC88471Ynr;
    }
}
