package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4NZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NZ implements InterfaceC108394Nf {
    public final /* synthetic */ C4OT LIZ;
    public final /* synthetic */ SharePackage LIZIZ;
    public final /* synthetic */ List<IMContact> LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.InterfaceC108394Nf
    public final void LIZ(AbstractC108384Ne abstractC108384Ne) {
        C4OT c4ot;
        Bundle bundle;
        String string;
        if (abstractC108384Ne instanceof C108354Nb) {
            C4OT c4ot2 = this.LIZ;
            if (c4ot2 != null) {
                c4ot2.LIZ(this.LIZIZ);
            }
            SharePackage sharePackage = this.LIZIZ;
            if (sharePackage != null && (bundle = sharePackage.extras) != null && (string = bundle.getString("enter_from")) != null && o.LJ(string, "publish_share_panel")) {
                SharePackage sharePackage2 = this.LIZIZ;
                String str = this.LIZLLL;
                List<IMContact> list = this.LIZJ;
                if (o.LJ(sharePackage2.itemType, "now_post") || o.LJ(sharePackage2.itemType, "now_video") || o.LJ(sharePackage2.itemType, "now_post_memory") || o.LJ(sharePackage2.itemType, "now_video_memory")) {
                    C57428MgK.LJFF(sharePackage2, str, ORZ.LLJILJILJ(list), 0, 56);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC108384Ne instanceof C108364Nc) {
            C4OT c4ot3 = this.LIZ;
            if (c4ot3 != null) {
                c4ot3.LIZJ(this.LIZIZ);
            }
            C84943Va.LIZ().LIZIZ(this.LIZJ);
            return;
        }
        if (!(abstractC108384Ne instanceof C108344Na) || (c4ot = this.LIZ) == null) {
            return;
        }
        c4ot.LIZIZ(this.LIZIZ);
    }

    public C4NZ(C4OT c4ot, SharePackage sharePackage, String str, List list) {
        this.LIZ = c4ot;
        this.LIZIZ = sharePackage;
        this.LIZJ = list;
        this.LIZLLL = str;
    }
}
