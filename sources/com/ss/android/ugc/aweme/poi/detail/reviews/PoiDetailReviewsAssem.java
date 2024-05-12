package com.ss.android.ugc.aweme.poi.detail.reviews;

import X.C05040Hs;
import X.C186817Uv;
import X.C198867rG;
import X.C198977rR;
import X.C199097rd;
import X.C199127rg;
import X.C212428Vi;
import X.C214298b3;
import X.C2TZ;
import X.C2U8;
import X.C42625Go9;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72818Shy;
import X.C78685UuP;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.InterfaceC189047bQ;
import X.InterfaceC199107re;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.InterfaceC78502UrS;
import X.QD3;
import X.SYL;
import X.TBT;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class PoiDetailReviewsAssem extends PoiDetailBaseAssem implements PoiReviewListItemCell.PoiReviewCellVAbility, InterfaceC72822Si2 {
    public String LJLLI;
    public final C214298b3 LJLLILLLL;
    public SYL LJLLJ;

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean L3() {
        return true;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0n;
    }

    public PoiDetailReviewsAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailReviewsViewModel.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 727), C198867rG.INSTANCE, null);
    }

    public final PoiDetailReviewsViewModel N3() {
        return (PoiDetailReviewsViewModel) this.LJLLILLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell.PoiReviewCellVAbility
    public final C186817Uv di0() {
        return new C186817Uv(false);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        String str = this.LJLLI;
        if (str != null) {
            N3().gv0(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell.PoiReviewCellVAbility
    public final InterfaceC199107re Um() {
        return N3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("syncReviewToNative", this);
        C42625Go9.LIZJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPoiWriteReviewSuccess(C2TZ event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLIL, this.LJLLI) && x3().findViewById(R.id.hl6).getVisibility() == 0) {
            M3(false);
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        String valueOf;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceiveJsEvent - name: ");
        LIZ.append(c199097rd.LJLIL);
        LIZ.append(", params: ");
        LIZ.append(c199097rd.LJLILLLLZI);
        C199127rg.LIZ(X1D.LIZIZ(LIZ));
        if (o.LJ(c199097rd.LJLIL, "syncReviewToNative") && (interfaceC78280Uns = c199097rd.LJLILLLLZI) != null) {
            String str = "";
            String LJJIJIL = u.LJJIJIL(interfaceC78280Uns, "review_id", "");
            if (LJJIJIL == null || LJJIJIL.length() == 0) {
                valueOf = String.valueOf(u.LJJIJ(interfaceC78280Uns, "review_id", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
            } else {
                valueOf = u.LJJIJIL(interfaceC78280Uns, "review_id", "");
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onReceiveJsEvent - poi_id: ");
            LIZ2.append(u.LJJIJIL(interfaceC78280Uns, "poi_id", ""));
            LIZ2.append(", review_id: ");
            LIZ2.append(valueOf);
            LIZ2.append(", create_time: ");
            LIZ2.append(u.LJJIJIIJI(interfaceC78280Uns, "create_time", 0));
            LIZ2.append(", rating: ");
            LIZ2.append(u.LJJIJIIJI(interfaceC78280Uns, "rating", 0));
            LIZ2.append(", review_text: ");
            LIZ2.append(u.LJJIJIL(interfaceC78280Uns, "review_text", ""));
            LIZ2.append(' ');
            C199127rg.LIZ(X1D.LIZIZ(LIZ2));
            PoiReviewsApi.PoiReviewModel poiReviewModel = C198977rR.LIZIZ;
            if ((poiReviewModel != null && o.LJ(poiReviewModel.reviewId, u.LJJIJIL(interfaceC78280Uns, "review_id", ""))) || !C78685UuP.LJJJZ(valueOf) || u.LJJIJIIJI(interfaceC78280Uns, "create_time", 0) <= 0) {
                return;
            }
            if (u.LJJIJIIJI(interfaceC78280Uns, "rating", 0) <= 0 && !C78685UuP.LJJJZ(u.LJJIJIL(interfaceC78280Uns, "review_text", ""))) {
                return;
            }
            String LJJIJIL2 = u.LJJIJIL(interfaceC78280Uns, "poi_id", "");
            String LJJIJIL3 = u.LJJIJIL(interfaceC78280Uns, "review_id", "");
            double LJJIJIIJI = u.LJJIJIIJI(interfaceC78280Uns, "rating", 0);
            String LJJIJIL4 = u.LJJIJIL(interfaceC78280Uns, "review_text", "");
            long LJJIJIIJI2 = u.LJJIJIIJI(interfaceC78280Uns, "create_time", 0);
            InterfaceC78502UrS LJJIIZ = u.LJJIIZ(interfaceC78280Uns, "review_images", null);
            ArrayList arrayList = new ArrayList();
            if (LJJIIZ != null) {
                for (int i = 0; i < LJJIIZ.size(); i++) {
                    arrayList.add(LJJIIZ.getString(i));
                }
            }
            PoiReviewsApi.PoiReviewModel LIZ3 = C198977rR.LIZ(LJJIJIL2, LJJIJIL3, LJJIJIIJI, LJJIJIL4, LJJIJIIJI2, arrayList);
            C198977rR.LIZIZ = LIZ3;
            C198977rR.LIZ = LIZ3.poiId;
            C2U8.LIZ(new C2TZ(u.LJJIJIL(interfaceC78280Uns, "poi_id", "")));
            SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//poi/review_list");
            String str2 = this.LJLLI;
            if (str2 != null) {
                str = str2;
            }
            buildRoute.withParam("poi_id", str);
            C05040Hs.LJ(buildRoute, "enter_from", "poi_review_post", "enter_method", "submit_review");
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        String c1 = ((InterfaceC189047bQ) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC189047bQ.class), null)).c1();
        this.LJLLI = c1;
        if (c1 != null) {
            N3().gv0(c1);
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, PoiReviewListItemCell.PoiReviewCellVAbility.class, null);
        }
        C8YN.LJIIJ(this, N3(), new TBT() { // from class: X.7rC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C198807rA) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.7rB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C198807rA) obj).LJLJI;
            }
        }, null, new IDqS428S0100000_3(this, 12), 12);
    }
}
