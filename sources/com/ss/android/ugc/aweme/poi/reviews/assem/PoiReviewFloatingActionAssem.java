package com.ss.android.ugc.aweme.poi.reviews.assem;

import X.C16880lQ;
import X.C198977rR;
import X.C199097rd;
import X.C199127rg;
import X.C214298b3;
import X.C2TZ;
import X.C2U8;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C72818Shy;
import X.C78685UuP;
import X.C78926UyI;
import X.C79045V0n;
import X.C7V0;
import X.C7V8;
import X.C89V;
import X.C8BK;
import X.C8YN;
import X.C9BE;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.InterfaceC78502UrS;
import X.KL2;
import X.KR8;
import X.TBT;
import X.ViewOnTouchListenerC76562zU;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class PoiReviewFloatingActionAssem extends UISlotAssem implements InterfaceC72822Si2 {
    public final C55749LuL LJLJLLL;
    public final C214298b3 LJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c13;
    }

    public PoiReviewFloatingActionAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LJ(this, C7V0.class, "PoiReviewHierarchyData"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 781);
        C65776Prg LIZ = C65352Pkq.LIZ(PoiReviewListViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 780), C7V8.INSTANCE, aqS153S0100000_3);
    }

    public final PoiReviewListViewModel H3() {
        return (PoiReviewListViewModel) this.LJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("syncReviewToNative", this);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        String valueOf;
        Integer valueOf2;
        double d;
        Double d2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceiveJsEvent - name: ");
        LIZ.append(c199097rd.LJLIL);
        LIZ.append(", params: ");
        LIZ.append(c199097rd.LJLILLLLZI);
        C199127rg.LIZ(X1D.LIZIZ(LIZ));
        if (o.LJ(c199097rd.LJLIL, "syncReviewToNative") && (interfaceC78280Uns = c199097rd.LJLILLLLZI) != null) {
            String LJJIJIL = u.LJJIJIL(interfaceC78280Uns, "review_id", "");
            if ((LJJIJIL == null || LJJIJIL.length() == 0) && 1 != 0) {
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
            if (KR8.LJIIIZ(this)) {
                return;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModel = C198977rR.LIZIZ;
            if ((poiReviewModel != null && o.LJ(poiReviewModel.reviewId, u.LJJIJIL(interfaceC78280Uns, "review_id", ""))) || !C78685UuP.LJJJZ(valueOf) || u.LJJIJIIJI(interfaceC78280Uns, "create_time", 0) <= 0) {
                return;
            }
            if (u.LJJIJIIJI(interfaceC78280Uns, "rating", 0) <= 0 && !C78685UuP.LJJJZ(u.LJJIJIL(interfaceC78280Uns, "review_text", ""))) {
                return;
            }
            PoiReviewListViewModel H3 = H3();
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
            H3.getClass();
            C198977rR.LIZ = H3.LJLIL;
            C198977rR.LIZIZ = LIZ3;
            C72808Sho<ITEM> c72808Sho = H3.state;
            if (c72808Sho != 0 && (valueOf2 = Integer.valueOf(c72808Sho.LJIIIZ(LIZ3))) != null && valueOf2.intValue() == -1) {
                H3.listAddItemAt(0, (int) LIZ3);
                String str = H3.LJLIL;
                if (str == null) {
                    str = "";
                }
                PoiReviewListViewModel.gv0(H3, str);
                if (H3.LJLJJI == null) {
                    PoiReviewsApi.PoiReviewContentModel poiReviewContentModel = LIZ3.content;
                    if (poiReviewContentModel != null && (d2 = poiReviewContentModel.rating) != null) {
                        d = d2.doubleValue();
                    } else {
                        d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    }
                    H3.LJLJJI = new PoiReviewsApi.PoiReviewSummaryModel(1L, Double.valueOf(d));
                    H3.setState(new AqS169S0100000_3(H3, 934));
                }
            }
            C2U8.LIZ(new C2TZ(u.LJJIJIL(interfaceC78280Uns, "poi_id", "")));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        o.LJIIIIZZ(view.findViewById(R.id.kdg), "view.findViewById(R.id.start_record_icon)");
        o.LJIIIIZZ(view.findViewById(R.id.kdj), "view.findViewById(R.id.start_record_title)");
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        Integer LJI = C79045V0n.LJI(R.attr.go, context);
        int i2 = -16777216;
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = -16777216;
        }
        float LIZJ = KL2.LIZJ(context, 4.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        Integer LJI2 = C79045V0n.LJI(R.attr.cd, context);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        }
        view.setBackground(new C8BK(i, new C89V(LIZJ, blur, 0.0f, i2)));
        view.setOnTouchListener(new ViewOnTouchListenerC76562zU(0.99f, null));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 131), view);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.7rF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C7VC) obj).LJLJI;
            }
        }, null, new AqS166S0200000_3(view, this, 12), 6);
    }
}
