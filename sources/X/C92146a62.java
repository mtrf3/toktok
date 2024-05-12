package X;

import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.a62, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92146a62 extends AbstractC61537ODd {
    public final /* synthetic */ long LIZ;

    public C92146a62(long j) {
        this.LIZ = j;
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIIIZZ(UpdatePackage updatePackage) {
        C91924a2S.LIZ(C91924a2S.LIZ, "rd_pipo_bnpl_gecko_sync_resource", "", null, C113554cx.LJJL(new OSZ("status", "1"), new OSZ("duration", String.valueOf(System.currentTimeMillis() - this.LIZ)), new OSZ("biz_type", "BNPL")), 12);
    }

    @Override // X.AbstractC61537ODd
    public final void LJI(UpdatePackage updatePackage, Throwable th) {
        C91924a2S.LIZ(C91924a2S.LIZ, "rd_pipo_bnpl_gecko_sync_resource", "", null, C113554cx.LJJL(new OSZ("status", CardStruct.IStatusCode.DEFAULT), new OSZ("duration", String.valueOf(System.currentTimeMillis() - this.LIZ)), new OSZ("biz_type", "BNPL")), 12);
    }
}
