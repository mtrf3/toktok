package com.ss.android.ugc.aweme.detail.panel;

import X.C16880lQ;
import X.C221108m2;
import X.C51556KLg;
import X.C62822Ol8;
import X.InterfaceC224548ra;
import X.M89;
import Y.IDiS267S0100000_3;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiCollectPanel extends DetailFragmentPanel {
    public final Bundle LLJJJIL;
    public final C62822Ol8 LLJJJJ;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final Map<String, String> LJLJLLL() {
        Object obj;
        Bundle bundle = this.LLJJJIL;
        if (bundle != null) {
            obj = C16880lQ.LLJJIII(bundle, "screen_shot_param");
        } else {
            obj = null;
        }
        o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        return (Map) obj;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
        View view;
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null) {
            return;
        }
        View view2 = getFragment().getView();
        View view3 = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.aoo);
        } else {
            view = null;
        }
        if (!(view instanceof ViewGroup) || view == null) {
            View view4 = getFragment().getView();
            if (view4 instanceof ViewGroup) {
                view3 = view4;
            }
        } else {
            view3 = view;
        }
        getViewPager().LJI(new IDiS267S0100000_3(this, 0));
        InterfaceC224548ra interfaceC224548ra = (InterfaceC224548ra) this.LLJJJJ.getValue();
        if (interfaceC224548ra != null) {
            interfaceC224548ra.R1(LJJLJ());
        }
        C51556KLg.LIZ.getClass();
        C51556KLg.LIZ().LJIIL(this.LLJJJIL, view3, getChildFragmentManager());
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void LJLLILLLL(List<Aweme> list) {
        LJLLJ(list, false);
        InterfaceC224548ra interfaceC224548ra = (InterfaceC224548ra) this.LLJJJJ.getValue();
        if (interfaceC224548ra != null) {
            interfaceC224548ra.R1(LJJLJ());
        }
    }

    public PoiCollectPanel(Bundle bundle, M89 m89) {
        super(m89);
        this.LLJJJIL = bundle;
        this.LLJJJJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 181));
    }
}
