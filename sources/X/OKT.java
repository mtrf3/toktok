package X;

import Y.AfS57S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEntryCheckApi;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OKT extends A75 {
    @Override // X.A76
    public final String LIZ() {
        return "PromoteLiveBroadcastSlotProvider";
    }

    @Override // X.A76
    public final List<EnumC30736C4m> LIZIZ() {
        return C47261Igj.LJJIJIL(EnumC30736C4m.SLOT_BROADCAST_SHARE, EnumC30736C4m.SLOT_AUDIENCE_SHARE);
    }

    @Override // X.A76
    public final List<EnumC31730Cco> LIZJ() {
        return null;
    }

    @Override // X.A76
    public final InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> LIZLLL(Context context, EnumC30736C4m enumC30736C4m) {
        o.LJIIIZ(context, "context");
        return null;
    }

    @Override // X.A76
    public final void LJ() {
    }

    @Override // X.A76
    public final InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> LJFF(Context context, EnumC31730Cco enumC31730Cco) {
        o.LJIIIZ(context, "context");
        return null;
    }

    public static void LJIIIIZZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", OKW.LIZJ());
        c188727au.LIZLLL(OKW.LIZ(), "promote_version");
        c188727au.LIZLLL(OKW.LIZIZ(), "user_account_type");
        c188727au.LJIIIZ("enter_from", "during_live");
        c188727au.LJIIIZ("promote_by", str);
        FMX.LJIIL("Promote_live_entrance_click", c188727au.LIZ);
    }

    public static void LJIIIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", OKW.LIZJ());
        c188727au.LIZLLL(OKW.LIZ(), "promote_version");
        c188727au.LIZLLL(OKW.LIZIZ(), "user_account_type");
        c188727au.LJIIIZ("enter_from", "during_live");
        c188727au.LJIIIZ("promote_by", str);
        FMX.LJIIL("Promote_live_entrance_show", c188727au.LIZ);
    }

    public final ActivityC45651qj LJII(Context context) {
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        if (context instanceof ContextWrapper) {
            return LJII(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r1 != 3) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d  */
    @Override // X.A75
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LJI(java.util.Map<java.lang.String, ? extends java.lang.Object> r25, X.EnumC30736C4m r26) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OKT.LJI(java.util.Map, X.C4m):java.util.Map");
    }

    public final void LJIIJ(Context context, C29930Bos c29930Bos, String str) {
        long j;
        String str2;
        MutableLiveData<A9Z> mutableLiveData;
        LJIIIIZZ(str);
        NQA nqa = NQA.LIZIZ;
        String LIZJ = nqa.LIZJ();
        long currentTimeMillis = System.currentTimeMillis();
        if (c29930Bos != null) {
            j = c29930Bos.LIZJ;
        } else {
            j = 0;
        }
        if (o.LJ(str, "myself")) {
            str2 = "1";
        } else {
            str2 = "2";
        }
        if (C59406NTe.LJ() && context != null) {
            String LJFF = C59406NTe.LJFF(Long.valueOf(currentTimeMillis), "", "during_live");
            LiveOuterService.LJJJLL().LJIJJ();
            BroadcastTunnelVM LIZ = C71272Ry8.LIZ(LJII(context));
            if (LIZ != null && (mutableLiveData = LIZ.LJLIL) != null) {
                mutableLiveData.setValue(A9Z.STREAM_ON);
            }
            String builder = UriProtector.parse(LJFF).buildUpon().appendQueryParameter("session_id", LIZJ).appendQueryParameter("promote_by", str2).appendQueryParameter("room_id", String.valueOf(j)).toString();
            o.LJIIIIZZ(builder, "parse(schema).buildUpon(…              .toString()");
            if (nqa.LIZ()) {
                android.net.Uri parse = UriProtector.parse(builder);
                o.LJIIIIZZ(parse, "parse(schema)");
                android.net.Uri LJJJJJ = C78939UyV.LJJJJJ(parse, C47261Igj.LJJIJIL("enable_prefetch", "enable_pending_js_task"));
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ != null) {
                    String uri = LJJJJJ.toString();
                    o.LJIIIIZZ(uri, "tempUri.toString()");
                    C59406NTe.LJIIL(LJIJJ, uri);
                }
            } else {
                Activity LJIJJ2 = C45804HyK.LJIJJ(context);
                if (LJIJJ2 != null) {
                    SmartRouter.buildRoute(LJIJJ2, builder).open();
                }
            }
            Activity LJIJJ3 = C45804HyK.LJIJJ(context);
            if (LJIJJ3 != null) {
                LJIJJ3.overridePendingTransition(0, 0);
            }
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("enter_from", "during_live");
            c198517qh.LIZ.put("carrier_region", C85990Xow.LJ());
            c198517qh.LIZ.put("url", builder);
            C09900aA.LJIIJJI("Promote_live_entrance_click", 1, c198517qh.LJ());
            nqa.LJII(LIZJ, "during_live", str);
            return;
        }
        ((PromoteEntryCheckApi) C45336Hqm.LIZIZ(PromoteEntryCheckApi.class, C42952GtQ.LIZ)).getPromoteEntryCheck("", "during_live", currentTimeMillis, j, str2).LJJJLIIL(new OKU(context, this, str, j), new AfS57S0100000_5(context, 334));
    }
}
