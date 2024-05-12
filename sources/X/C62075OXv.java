package X;

import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;

/* renamed from: X.OXv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62075OXv<T> implements InterfaceC73518StG {
    public final /* synthetic */ WebSharePackage LIZ;

    public C62075OXv(WebSharePackage webSharePackage) {
        this.LIZ = webSharePackage;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        String str = this.LIZ.url;
        if (str == null) {
            str = "";
        }
        c73516StE.onSuccess(str);
    }
}
