package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.share.improve.pkg.NowInviteSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OcF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62271OcF implements InterfaceC62573Oh7 {
    public final /* synthetic */ SharePackage LJLIL;
    public final /* synthetic */ InterfaceC62225ObV LJLILLLLZI;

    @Override // X.InterfaceC62573Oh7
    public final C4P8 LJ() {
        return null;
    }

    @Override // X.InterfaceC62573Oh7
    public final void LJIIJ(boolean z) {
        String str;
        Bundle bundle;
        String str2 = "success";
        if (o.LJ(this.LJLIL.itemType, "now_invite")) {
            C62272OcG c62272OcG = NowInviteSharePackage.Companion;
            String key = this.LJLILLLLZI.key();
            if (!z) {
                str2 = "fail";
            }
            c62272OcG.getClass();
            C62272OcG.LIZ(key, str2);
            return;
        }
        SharePackage sharePackage = this.LJLIL;
        String key2 = this.LJLILLLLZI.key();
        if (!z) {
            str2 = "fail";
        }
        SharePackage sharePackage2 = this.LJLIL;
        if (sharePackage2 == null || (bundle = sharePackage2.extras) == null || (str = bundle.getString("now_type")) == null) {
            str = "";
        }
        C62468OfQ.LJII(sharePackage, key2, str2, str, null, 48);
    }

    public C62271OcF(InterfaceC62225ObV interfaceC62225ObV, SharePackage sharePackage) {
        this.LJLIL = sharePackage;
        this.LJLILLLLZI = interfaceC62225ObV;
    }
}
