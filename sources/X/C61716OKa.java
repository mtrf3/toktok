package X;

import android.text.TextUtils;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OKa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61716OKa implements InterfaceC65753PrJ<PromoteEntryCheck> {
    public final /* synthetic */ CreatorToolsActivity LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ int LIZJ;

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        C5S1 c5s1 = new C5S1(C16880lQ.LLLLLL(this.LIZ));
        c5s1.LIZJ(R.string.im9);
        c5s1.LJ();
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(PromoteEntryCheck promoteEntryCheck) {
        boolean z;
        String str;
        String str2;
        String statusMsg;
        PromoteEntryCheck promoteEntryCheck2 = promoteEntryCheck;
        int i = 0;
        if (promoteEntryCheck2 != null && promoteEntryCheck2.getStatusCode() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Integer num = null;
            if (promoteEntryCheck2 != null) {
                str2 = promoteEntryCheck2.getStatusMsg();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (promoteEntryCheck2 != null && (statusMsg = promoteEntryCheck2.getStatusMsg()) != null && statusMsg.length() > 0) {
                    C5S1 c5s1 = new C5S1(C16880lQ.LLLLLL(this.LIZ));
                    c5s1.LIZLLL(statusMsg);
                    c5s1.LJ();
                }
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("error_status_code", 10001);
                if (promoteEntryCheck2 != null) {
                    num = Integer.valueOf(promoteEntryCheck2.getStatusCode());
                }
                c198517qh.LIZ.put("error_message", num);
                c198517qh.LIZ.put("entry_from", "creator_tools");
                c198517qh.LIZ.put("carrier_region", C85990Xow.LJ());
                C09900aA.LJIIJJI("promote_entry_check", 0, c198517qh.LJ());
                return;
            }
        }
        if (promoteEntryCheck2 != null && !TextUtils.isEmpty(promoteEntryCheck2.getUrl())) {
            SmartRouter.buildRoute(C16880lQ.LLLLLL(this.LIZ), promoteEntryCheck2.getUrl()).open();
            C188727au c188727au = new C188727au();
            Integer promoteStatus = promoteEntryCheck2.getPromoteStatus();
            if (promoteStatus != null) {
                i = promoteStatus.intValue();
            }
            c188727au.LIZLLL(i, "promote_status");
            c188727au.LIZLLL(this.LIZIZ, "user_account_type");
            c188727au.LIZLLL(this.LIZJ, "promote_version");
            c188727au.LJIIIZ("enter_from", "creator_tools");
            FMX.LJIIL("Promote_profile_entrance_click", c188727au.LIZ);
        }
        C198517qh c198517qh2 = new C198517qh();
        c198517qh2.LIZ.put("entry_from", "creator_tools");
        c198517qh2.LIZ.put("carrier_region", C85990Xow.LJ());
        if (promoteEntryCheck2 == null || (str = promoteEntryCheck2.getUrl()) == null) {
            str = "";
        }
        c198517qh2.LIZ.put("url", str);
        C09900aA.LJIIJJI("promote_entry_check", 1, c198517qh2.LJ());
    }

    public C61716OKa(CreatorToolsActivity creatorToolsActivity, int i, int i2) {
        this.LIZ = creatorToolsActivity;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
