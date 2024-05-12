package X;

import com.ss.android.ugc.aweme.bnpl.network.model.ConfirmRegisterMobileResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.a85, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92273a85 implements C33Q {
    public final EnumC92023a43 LJLIL;
    public final boolean LJLILLLLZI;
    public final EnumC92024a44 LJLJI;
    public ConfirmRegisterMobileResponse LJLJJI;
    public final String LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92273a85)) {
            return false;
        }
        C92273a85 c92273a85 = (C92273a85) obj;
        return this.LJLIL == c92273a85.LJLIL && this.LJLILLLLZI == c92273a85.LJLILLLLZI && this.LJLJI == c92273a85.LJLJI && o.LJ(this.LJLJJI, c92273a85.LJLJJI) && o.LJ(this.LJLJJL, c92273a85.LJLJJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.LJLJI.hashCode()) * 31;
        ConfirmRegisterMobileResponse confirmRegisterMobileResponse = this.LJLJJI;
        int hashCode3 = (hashCode2 + (confirmRegisterMobileResponse == null ? 0 : confirmRegisterMobileResponse.hashCode())) * 31;
        String str = this.LJLJJL;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhoneNumberContentState(mode=");
        LIZ.append(this.LJLIL);
        LIZ.append(", needClearError=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", networkStatus=");
        LIZ.append(this.LJLJI);
        LIZ.append(", confirmResp=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", errorContent=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C92273a85(EnumC92023a43 mode, boolean z, EnumC92024a44 networkStatus, ConfirmRegisterMobileResponse confirmRegisterMobileResponse, String str) {
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(networkStatus, "networkStatus");
        this.LJLIL = mode;
        this.LJLILLLLZI = z;
        this.LJLJI = networkStatus;
        this.LJLJJI = confirmRegisterMobileResponse;
        this.LJLJJL = str;
    }

    public static C92273a85 LIZ(C92273a85 c92273a85, EnumC92023a43 enumC92023a43, boolean z, EnumC92024a44 enumC92024a44, ConfirmRegisterMobileResponse confirmRegisterMobileResponse, String str, int i) {
        String str2 = str;
        ConfirmRegisterMobileResponse confirmRegisterMobileResponse2 = confirmRegisterMobileResponse;
        EnumC92024a44 networkStatus = enumC92024a44;
        EnumC92023a43 mode = enumC92023a43;
        boolean z2 = z;
        if ((i & 1) != 0) {
            mode = c92273a85.LJLIL;
        }
        if ((i & 2) != 0) {
            z2 = c92273a85.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            networkStatus = c92273a85.LJLJI;
        }
        if ((i & 8) != 0) {
            confirmRegisterMobileResponse2 = c92273a85.LJLJJI;
        }
        if ((i & 16) != 0) {
            str2 = c92273a85.LJLJJL;
        }
        c92273a85.getClass();
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(networkStatus, "networkStatus");
        return new C92273a85(mode, z2, networkStatus, confirmRegisterMobileResponse2, str2);
    }
}
