package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OKU<T> implements InterfaceC64592gB {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ OKT LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;

    public OKU(Context context, OKT okt, String str, long j) {
        this.LJLIL = context;
        this.LJLILLLLZI = okt;
        this.LJLJI = str;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        String url;
        String str;
        MutableLiveData<A9Z> mutableLiveData;
        String str2;
        String str3;
        PromoteEntryCheck promoteEntryCheck = (PromoteEntryCheck) obj;
        if (promoteEntryCheck != null && promoteEntryCheck.getStatusCode() == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (!z) {
            if (promoteEntryCheck != null) {
                str2 = promoteEntryCheck.getStatusMsg();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
                if (promoteEntryCheck != null) {
                    str3 = promoteEntryCheck.getStatusMsg();
                } else {
                    str3 = null;
                }
                LJJIJIL.LJIILLIIL(str3);
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("error_status_code", 10001);
                if (promoteEntryCheck != null) {
                    num = Integer.valueOf(promoteEntryCheck.getStatusCode());
                }
                c198517qh.LIZ.put("error_message", num);
                c198517qh.LIZ.put("entry_from", "during_live");
                c198517qh.LIZ.put("carrier_region", C85990Xow.LJ());
                C09900aA.LJIIJJI("Promote_live_entrance_click", 0, c198517qh.LJ());
                return;
            }
        }
        String str4 = "";
        if (this.LJLIL != null && promoteEntryCheck != null && !TextUtils.isEmpty(promoteEntryCheck.getUrl())) {
            LiveOuterService.LJJJLL().LJIJJ();
            BroadcastTunnelVM LIZ = C71272Ry8.LIZ(this.LJLILLLLZI.LJII(this.LJLIL));
            if (LIZ != null && (mutableLiveData = LIZ.LJLIL) != null) {
                mutableLiveData.setValue(A9Z.STREAM_ON);
            }
            if (promoteEntryCheck.getUrl() == null) {
                str = "";
            } else {
                str = UriProtector.parse(promoteEntryCheck.getUrl()).buildUpon().appendQueryParameter("promote_by", this.LJLJI).appendQueryParameter("room_id", String.valueOf(this.LJLJJI)).toString();
                o.LJIIIIZZ(str, "parse(it.url).buildUpon(…              .toString()");
            }
            Activity LJIJJ = C45804HyK.LJIJJ(this.LJLIL);
            if (LJIJJ != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(LJIJJ, str);
                buildRoute.withParam("from_promote_live", true);
                buildRoute.open();
            }
            Activity LJIJJ2 = C45804HyK.LJIJJ(this.LJLIL);
            if (LJIJJ2 != null) {
                LJIJJ2.overridePendingTransition(0, 0);
            }
        }
        C198517qh c198517qh2 = new C198517qh();
        c198517qh2.LIZ.put("entry_from", "during_live");
        c198517qh2.LIZ.put("carrier_region", C85990Xow.LJ());
        if (promoteEntryCheck != null && (url = promoteEntryCheck.getUrl()) != null) {
            str4 = url;
        }
        c198517qh2.LIZ.put("url", str4);
        C09900aA.LJIIJJI("Promote_live_entrance_click", 1, c198517qh2.LJ());
    }
}
