package X;

import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.OdS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62346OdS implements InterfaceC62720OjU {
    public final /* synthetic */ ACLCommonShare LIZ;
    public final /* synthetic */ C45344Hqu LIZIZ;
    public final /* synthetic */ Aweme LIZJ;

    @Override // X.InterfaceC62720OjU
    public final void LIZ() {
    }

    @Override // X.InterfaceC62720OjU
    public final void LIZIZ() {
        if (this.LIZ.getCode() == 0) {
            this.LIZIZ.LJIIJ(this.LIZJ, "share_download", false);
        }
    }

    public C62346OdS(ACLCommonShare aCLCommonShare, C45344Hqu c45344Hqu, Aweme aweme) {
        this.LIZ = aCLCommonShare;
        this.LIZIZ = c45344Hqu;
        this.LIZJ = aweme;
    }
}
