package X;

import android.text.TextUtils;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OKb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61717OKb implements InterfaceC65753PrJ<PromoteEntryCheck> {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ int LIZIZ;

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable th) {
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZJ(R.string.im9);
        c5s1.LJ();
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(PromoteEntryCheck promoteEntryCheck) {
        PromoteEntryCheck promoteEntryCheck2 = promoteEntryCheck;
        if (promoteEntryCheck2 == null) {
            return;
        }
        if (promoteEntryCheck2.getStatusCode() != 0 && TextUtils.isEmpty(promoteEntryCheck2.getStatusMsg())) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(promoteEntryCheck2.getStatusMsg());
            c5s1.LJ();
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("error_status_code", 10001);
            c198517qh.LIZ.put("error_message", Integer.valueOf(promoteEntryCheck2.getStatusCode()));
            c198517qh.LIZ.put("entry_from", "post");
            c198517qh.LIZ.put("carrier_region", C85990Xow.LJ());
            C09900aA.LJIIJJI("promote_entry_check", 0, c198517qh.LJ());
            return;
        }
        if (!TextUtils.isEmpty(promoteEntryCheck2.getUrl())) {
            SmartRouter.buildRoute(EF7.LIZIZ(), promoteEntryCheck2.getUrl()).open();
            C188727au c188727au = new C188727au();
            c188727au.LJFF(promoteEntryCheck2.getPromoteStatus(), "promote_status");
            c188727au.LIZLLL(this.LIZ, "user_account_type");
            c188727au.LIZLLL(this.LIZIZ, "promote_version");
            FMX.LJIIL("Promote_profile_entrance_click", c188727au.LIZ);
        }
        C198517qh c198517qh2 = new C198517qh();
        c198517qh2.LIZ.put("entry_from", "post");
        c198517qh2.LIZ.put("carrier_region", C85990Xow.LJ());
        c198517qh2.LIZ.put("url", promoteEntryCheck2.getUrl());
        C09900aA.LJIIJJI("promote_entry_check", 1, c198517qh2.LJ());
    }

    public C61717OKb(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
