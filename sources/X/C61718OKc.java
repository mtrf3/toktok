package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OKc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61718OKc implements InterfaceC65753PrJ<PromoteEntryCheck> {
    public final /* synthetic */ C61722OKg LIZ;
    public final /* synthetic */ Context LIZIZ;

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        Activity activity = this.LIZ.LJLJJI;
        if (activity != null) {
            AnonymousClass114.LIZ(activity, R.string.im9);
        }
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(PromoteEntryCheck promoteEntryCheck) {
        boolean z;
        String str;
        String str2;
        String statusMsg;
        Activity activity;
        PromoteEntryCheck promoteEntryCheck2 = promoteEntryCheck;
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
                if (promoteEntryCheck2 != null && (statusMsg = promoteEntryCheck2.getStatusMsg()) != null && (activity = this.LIZ.LJLJJI) != null) {
                    C31811Ce7.LIZIZ(activity, statusMsg);
                }
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("error_status_code", 10001);
                if (promoteEntryCheck2 != null) {
                    num = Integer.valueOf(promoteEntryCheck2.getStatusCode());
                }
                c198517qh.LIZ.put("error_message", num);
                c198517qh.LIZ.put("entry_from", "video");
                c198517qh.LIZ.put("item_id", this.LIZ.LJLIL.getAid());
                c198517qh.LIZ.put("carrier_region", C85990Xow.LJ());
                C09900aA.LJIIJJI("promote_entry_check", 0, c198517qh.LJ());
                return;
            }
        }
        if (promoteEntryCheck2 != null && !TextUtils.isEmpty(promoteEntryCheck2.getUrl())) {
            String builder = UriProtector.parse(promoteEntryCheck2.getUrl()).buildUpon().appendQueryParameter("promote_by", "myself").toString();
            o.LJIIIIZZ(builder, "parse(result.url).buildU…              .toString()");
            SmartRouter.buildRoute(this.LIZIZ, builder).open();
        }
        C198517qh c198517qh2 = new C198517qh();
        c198517qh2.LIZ.put("entry_from", "video");
        c198517qh2.LIZ.put("item_id", this.LIZ.LJLIL.getAid());
        c198517qh2.LIZ.put("carrier_region", C85990Xow.LJ());
        if (promoteEntryCheck2 == null || (str = promoteEntryCheck2.getUrl()) == null) {
            str = "";
        }
        c198517qh2.LIZ.put("url", str);
        C09900aA.LJIIJJI("promote_entry_check", 1, c198517qh2.LJ());
    }

    public C61718OKc(C61722OKg c61722OKg, Context context) {
        this.LIZ = c61722OKg;
        this.LIZIZ = context;
    }
}
