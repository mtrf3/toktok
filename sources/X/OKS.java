package X;

import Y.AfS62S0100000_10;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEntryCheckApi;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OKS implements InterfaceC31687Cc7 {
    public final /* synthetic */ OKQ LIZ;

    public OKS(OKQ okq) {
        this.LIZ = okq;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        MutableLiveData<A9Z> mutableLiveData;
        if (C6ZT.LIZ(view)) {
            return;
        }
        IIconSlot.SlotViewModel slotViewModel = this.LIZ.LJLJJLL;
        if (slotViewModel != null) {
            MutableLiveData<Boolean> mutableLiveData2 = slotViewModel.LJLJJL;
            o.LJIIIIZZ(mutableLiveData2, "this.hasRedpoint");
            if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
                mutableLiveData2.setValue(Boolean.FALSE);
            } else {
                mutableLiveData2.postValue(Boolean.FALSE);
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", OKW.LIZJ());
        c188727au.LIZLLL(OKW.LIZ(), "promote_version");
        c188727au.LIZLLL(OKW.LIZIZ(), "user_account_type");
        c188727au.LJIIIZ("enter_from", "before_live");
        FMX.LJIIL("Promote_live_entrance_click", c188727au.LIZ);
        NQA nqa = NQA.LIZIZ;
        String LIZJ = nqa.LIZJ();
        long currentTimeMillis = System.currentTimeMillis();
        if (C59406NTe.LJ()) {
            String builder = UriProtector.parse(C59406NTe.LJFF(Long.valueOf(currentTimeMillis), "", "before_live")).buildUpon().appendQueryParameter("session_id", LIZJ).toString();
            o.LJIIIIZZ(builder, "parse(schema).buildUpon(…              .toString()");
            LiveOuterService.LJJJLL().LJIJJ();
            OKQ okq = this.LIZ;
            BroadcastTunnelVM LIZ = C71272Ry8.LIZ(okq.LJIIL(okq.LJLJJL));
            if (LIZ != null && (mutableLiveData = LIZ.LJLIL) != null) {
                mutableLiveData.setValue(A9Z.STREAM_ON);
            }
            if (nqa.LIZ()) {
                android.net.Uri parse = UriProtector.parse(builder);
                o.LJIIIIZZ(parse, "parse(schema)");
                String uri = C78939UyV.LJJJJJ(parse, C47261Igj.LJJIJIL("enable_prefetch", "enable_pending_js_task")).toString();
                o.LJIIIIZZ(uri, "tempUri.toString()");
                C59406NTe.LJIIL(this.LIZ.LJLJJL, uri);
            } else {
                SmartRouter.buildRoute(this.LIZ.LJLJJL, builder).open();
            }
            Activity LJIJJ = C45804HyK.LJIJJ(this.LIZ.LJLJJL);
            if (LJIJJ != null) {
                LJIJJ.overridePendingTransition(0, 0);
            }
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("entry_from", "before_live");
            c198517qh.LIZ.put("carrier_region", C85990Xow.LJ());
            c198517qh.LIZ.put("url", builder);
            C09900aA.LJIIJJI("Promote_live_entrance_click", 1, c198517qh.LJ());
            nqa.LJII(LIZJ, "before_live", "myself");
            return;
        }
        AbstractC73672Svk<PromoteEntryCheck> promoteEntryCheck = ((PromoteEntryCheckApi) C45336Hqm.LIZIZ(PromoteEntryCheckApi.class, C42952GtQ.LIZ)).getPromoteEntryCheck("", "before_live", currentTimeMillis, 0L, "");
        OKQ okq2 = this.LIZ;
        promoteEntryCheck.LJJJLIIL(new AfS62S0100000_10(okq2, 37), new AfS62S0100000_10(okq2, 38));
    }
}
