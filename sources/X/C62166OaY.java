package X;

import com.ss.android.ugc.aweme.qrcode.model.RiskUrl;

/* renamed from: X.OaY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62166OaY extends I4X implements C8BT {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BT
    public final void onSuccess() {
        Object obj = this.LJLJI;
        if (obj != null) {
            ((InterfaceC62167OaZ) ((I4Y) obj)).LIZJ((RiskUrl) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).mData);
        }
    }

    @Override // X.C8BT
    public final void onFailed(Exception exc) {
        Object obj = this.LJLJI;
        if (obj != null) {
            ((InterfaceC62167OaZ) ((I4Y) obj)).LJIJI(exc);
        }
    }

    public C62166OaY(C57541Mi9 c57541Mi9, C39800Fjg c39800Fjg) {
        super(c57541Mi9, c39800Fjg);
        c57541Mi9.addNotifyListener(this);
    }
}
