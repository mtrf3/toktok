package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C16880lQ;
import X.C187127Wa;
import X.C189177bd;
import X.C189187be;
import X.C189957ct;
import X.C190397db;
import X.C193037hr;
import X.C214298b3;
import X.C42625Go9;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C79234V7u;
import X.C9BE;
import X.FFL;
import X.QD3;
import Y.ACListenerS23S0100000_3;
import Y.ALAdapterS0S0000000_3;
import Y.ALAdapterS2S0300000_3;
import Y.IDTListenerS113S0100000_3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailFragment;
import com.ss.android.ugc.aweme.poi.map.PoiLocationDetailFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public abstract class PoiCollectStatusBaseAssem extends UISlotAssem {
    public View LJLJLLL;
    public final boolean LJLL;
    public final C214298b3 LJLLI;
    public final C55749LuL LJLLILLLL;
    public AqS150S0200000_3 LJLLJ;
    public boolean LJLLL;

    public abstract String I3();

    public abstract View L3();

    public abstract TuxIconView N3();

    public abstract void P3(boolean z);

    public abstract void R3(boolean z);

    public PoiCollectStatusBaseAssem() {
        new LinkedHashMap();
        this.LJLL = true;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiCollectStatusViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 684), C189177bd.INSTANCE, null);
        this.LJLLILLLL = new C55749LuL(C47704Ins.LIZJ(this, C189187be.class, "PoiCollectHierarchyData"), checkSupervisorPrepared());
    }

    public final View K3() {
        View view = this.LJLJLLL;
        if (view != null) {
            return view;
        }
        o.LJIJI("content");
        throw null;
    }

    public final C189187be M3() {
        return (C189187be) this.LJLLILLLL.getValue();
    }

    public final PoiCollectStatusViewModel O3() {
        return (PoiCollectStatusViewModel) this.LJLLI.getValue();
    }

    public final void Q3() {
        TuxIconView N3 = N3();
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 685);
        N3.clearAnimation();
        this.LJLLL = false;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(N3, "scaleX", 1.0f, 1.08f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(N3, "scaleY", 1.0f, 1.08f);
        ofFloat.setDuration(100L);
        ofFloat2.setDuration(100L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(N3, "scaleX", 1.08f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(N3, "scaleY", 1.08f, 0.0f);
        ofFloat3.setDuration(100L);
        ofFloat4.setDuration(100L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(N3, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(N3, "alpha", 1.0f, 0.0f);
        ofFloat6.setDuration(100L);
        ofFloat5.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(N3, "scaleX", 0.0f, 1.08f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(N3, "scaleY", 0.0f, 1.08f);
        ofFloat7.setDuration(100L);
        ofFloat8.setDuration(100L);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(N3, "scaleX", 1.08f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(N3, "scaleY", 1.08f, 1.0f);
        ofFloat9.setDuration(100L);
        ofFloat9.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
        animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
        animatorSet.addListener(new ALAdapterS2S0300000_3(this, animatorSet2, aqS153S0100000_3, 3));
        animatorSet2.addListener(new ALAdapterS0S0000000_3(1));
        animatorSet.start();
        P3(!O3().getState().LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C187127Wa event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLILLLLZI;
        if (str == null) {
            str = "";
        }
        boolean z = event.LJLIL;
        HashMap<String, PoiAnchorData> hashMap = PoiCollectStatusViewModel.LJLJI;
        PoiAnchorData poiAnchorData = hashMap.get(str);
        if (poiAnchorData != null) {
            if (z != poiAnchorData.isCollected()) {
                hashMap.put(str, PoiAnchorData.copy$default(poiAnchorData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z, null, null, null, null, null, null, 4161535, null));
            }
        } else {
            PoiCollectStatusViewModel.LJLJJI.put(str, Boolean.valueOf(z));
        }
        PoiCollectStatusBaseAssem poiCollectStatusBaseAssem = this;
        if (!o.LJ(poiCollectStatusBaseAssem.I3(), event.LJLILLLLZI)) {
            return;
        }
        if (!poiCollectStatusBaseAssem.LJLLL) {
            poiCollectStatusBaseAssem.R3(event.LJLIL);
            poiCollectStatusBaseAssem = poiCollectStatusBaseAssem;
            poiCollectStatusBaseAssem.H3(event, String.valueOf(poiCollectStatusBaseAssem.hashCode()), poiCollectStatusBaseAssem.L3(), event.LJLILLLLZI, event.LJLIL);
        } else {
            poiCollectStatusBaseAssem.LJLLJ = new AqS150S0200000_3(poiCollectStatusBaseAssem, event, 46);
        }
        if (event.LJLIL != poiCollectStatusBaseAssem.O3().getState().LJLIL) {
            PoiCollectStatusViewModel O3 = poiCollectStatusBaseAssem.O3();
            boolean z2 = event.LJLIL;
            O3.getClass();
            O3.setState(new AqS8S0010000_3(z2, 55));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJLLL = view;
        L3().setOnTouchListener(new IDTListenerS113S0100000_3(this, 6));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 119), L3());
        R3(M3().LJLILLLLZI);
        PoiCollectStatusViewModel O3 = O3();
        boolean z = M3().LJLILLLLZI;
        O3.getClass();
        O3.setState(new AqS8S0010000_3(z, 55));
    }

    public final void H3(C187127Wa c187127Wa, String str, View view, String str2, boolean z) {
        String str3;
        if (!o.LJ(c187127Wa.LJLJJL, str)) {
            return;
        }
        C189957ct.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "poi_ymal_show", false) == 0) {
            return;
        }
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        if (!z) {
            return;
        }
        if (LJIIIZ instanceof PoiDetailFragment) {
            C193037hr.LIZ(view, "poi_detail");
            if (!(this instanceof PoiCollectStatusRedBtnAssem)) {
                if ((this instanceof PoiCollectStatusTopNavBarAssem) || (this instanceof PoiDetailFavoriteBottomAssem)) {
                    str3 = "click_banner";
                } else if (this instanceof PoiPlayFeedFavoriteBottomAssem) {
                    str3 = "click_button_video";
                }
                C190397db.LIZIZ(str2, "poi_detail", str3);
                return;
            }
            str3 = "click_button";
            C190397db.LIZIZ(str2, "poi_detail", str3);
            return;
        }
        if (!(LJIIIZ instanceof PoiLocationDetailFragment)) {
            return;
        }
        C193037hr.LIZ(view, "poi_map");
        C190397db.LIZIZ(str2, "poi_map", "click_button_map");
    }
}
