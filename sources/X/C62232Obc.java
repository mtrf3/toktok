package X;

import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.AclType;

/* renamed from: X.Obc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62232Obc extends AbstractC62226ObW {
    public final ACLCommonShare LJLILLLLZI;

    @Override // X.AbstractC62226ObW, X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final boolean LJIILJJIL() {
        ACLCommonShare aCLCommonShare = this.LJLILLLLZI;
        if (aCLCommonShare != null) {
            if ((aCLCommonShare.getAwemeAclType() != AclType.SHARE_GENERAL || !C62340OdM.LJIIIIZZ(this.LJLIL.key()) || aCLCommonShare.getShowType() != 1) && aCLCommonShare.getShowType() == 1) {
                return true;
            }
            return false;
        }
        return super.LJIILJJIL();
    }

    public C62232Obc(InterfaceC62225ObV interfaceC62225ObV, ACLCommonShare aCLCommonShare) {
        super(interfaceC62225ObV);
        this.LJLILLLLZI = aCLCommonShare;
    }
}
