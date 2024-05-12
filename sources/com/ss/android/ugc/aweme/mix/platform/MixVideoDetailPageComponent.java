package com.ss.android.ugc.aweme.mix.platform;

import X.C221108m2;
import X.C55654Lso;
import X.C62822Ol8;
import X.C8MM;
import android.view.View;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class MixVideoDetailPageComponent extends DetailPageComponent {
    public final Map<Integer, View> LLIILZL = new LinkedHashMap();
    public final C62822Ol8 LLIILII = C221108m2.LIZIZ(new AqS159S0100000_9(this, 327));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIILZL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void I3() {
        super.I3();
        IFeedCleanAbility iFeedCleanAbility = this.LLIIII;
        if (iFeedCleanAbility != null) {
            iFeedCleanAbility.xT(_$_findCachedViewById(R.id.gkc));
        }
        IFeedCleanAbility iFeedCleanAbility2 = this.LLIIII;
        if (iFeedCleanAbility2 != null) {
            iFeedCleanAbility2.xT(_$_findCachedViewById(R.id.ab1));
        }
        IFeedCleanAbility iFeedCleanAbility3 = this.LLIIII;
        if (iFeedCleanAbility3 != null) {
            iFeedCleanAbility3.xT(_$_findCachedViewById(R.id.hsz));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_on_playing", new C55654Lso(this));
    }
}
