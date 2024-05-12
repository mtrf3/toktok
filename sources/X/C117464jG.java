package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4jG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117464jG implements InterfaceC57784Mm4 {
    public final IMUser LJLIL;
    public final boolean LJLILLLLZI;
    public final InterfaceC88472Yns<IMUser, C76800UCe> LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C117464jG)) {
            return false;
        }
        C117464jG c117464jG = (C117464jG) obj;
        return o.LJ(this.LJLIL, c117464jG.LJLIL) && this.LJLILLLLZI == c117464jG.LJLILLLLZI && o.LJ(this.LJLJI, c117464jG.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        InterfaceC88472Yns<IMUser, C76800UCe> interfaceC88472Yns = this.LJLJI;
        return i2 + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdminChooseItem(user=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isSelected=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", onUserSelectChange=");
        return C249109q6.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C117464jG c117464jG;
        IMUser iMUser;
        String str = null;
        if (interfaceC57784Mm4 instanceof C117464jG) {
            c117464jG = (C117464jG) interfaceC57784Mm4;
        } else {
            c117464jG = null;
        }
        String uid = this.LJLIL.getUid();
        if (c117464jG != null && (iMUser = c117464jG.LJLIL) != null) {
            str = iMUser.getUid();
        }
        if (!o.LJ(uid, str) || c117464jG == null || this.LJLILLLLZI != c117464jG.LJLILLLLZI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C117464jG c117464jG;
        IMUser iMUser;
        String uid = this.LJLIL.getUid();
        String str = null;
        if ((interfaceC57784Mm4 instanceof C117464jG) && (c117464jG = (C117464jG) interfaceC57784Mm4) != null && (iMUser = c117464jG.LJLIL) != null) {
            str = iMUser.getUid();
        }
        return o.LJ(uid, str);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        boolean z;
        if (!(interfaceC57784Mm4 instanceof C117464jG)) {
            return null;
        }
        if (this.LJLILLLLZI != ((C117464jG) interfaceC57784Mm4).LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        return new C117474jH(z);
    }

    public C117464jG(IMUser iMUser, boolean z, AqS167S0100000_1 aqS167S0100000_1) {
        this.LJLIL = iMUser;
        this.LJLILLLLZI = z;
        this.LJLJI = aqS167S0100000_1;
    }
}
