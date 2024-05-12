package X;

import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.NzA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61144NzA extends AbstractC61537ODd {
    public final /* synthetic */ String LIZ;

    public C61144NzA(String str) {
        this.LIZ = str;
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIIIZZ(UpdatePackage updatePackage) {
        o.LJIIIZ(updatePackage, "updatePackage");
        C79081V1x.LJJIIJ(EnumC61143Nz9.STEP_LOAD, this.LIZ, "geckoPrefetch.onDownloadSuccess", CardStruct.IStatusCode.DEFAULT);
    }

    @Override // X.AbstractC61537ODd
    public final void LJI(UpdatePackage updatePackage, Throwable e) {
        o.LJIIIZ(updatePackage, "updatePackage");
        o.LJIIIZ(e, "e");
        C79081V1x.LJJIIJ(EnumC61143Nz9.STEP_LOAD, this.LIZ, "geckoPrefetch.onDownloadSuccess", "1");
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable e) {
        o.LJIIIZ(updatePackage, "updatePackage");
        o.LJIIIZ(e, "e");
        C79081V1x.LJJIIJ(EnumC61143Nz9.STEP_LOAD, this.LIZ, "geckoPrefetch.onUpdateFailed", "1");
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        o.LJIIIZ(updatePackage, "updatePackage");
        C79081V1x.LJJIIJ(EnumC61143Nz9.STEP_LOAD, this.LIZ, C61845OOz.LIZ("geckoPrefetch.onUpdateSuccess,version=", j), CardStruct.IStatusCode.DEFAULT);
    }
}
