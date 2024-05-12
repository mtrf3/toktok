package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C16880lQ;
import X.C201467vS;
import X.C220858ld;
import X.C221108m2;
import X.C45804HyK;
import X.C47704Ins;
import X.C55749LuL;
import X.C57434MgQ;
import X.C62822Ol8;
import Y.ACListenerS38S0200000_3;
import Y.AObserverS71S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageReportAsssem extends UISlotAssem {
    public View LJLJLLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C55749LuL LJLL = new C55749LuL(C47704Ins.LIZJ(this, FullPageParam.class, null), checkSupervisorPrepared());
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 430));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
        Integer valueOf = Integer.valueOf(R.id.nfq);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.nfq)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.aeb;
    }

    public final FullPageParam H3() {
        return (FullPageParam) this.LJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        VideoMaskInfo videoMaskInfo;
        Activity LJIJJ;
        LifecycleOwner LIZIZ;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJLLL = view;
        boolean LJIIJJI = C220858ld.LJIIJJI(H3().getAweme());
        Aweme aweme = H3().getAweme();
        if (aweme != null) {
            videoMaskInfo = aweme.getReportMaskInfo();
        } else {
            videoMaskInfo = null;
        }
        I3(LJIIJJI, videoMaskInfo);
        Context context = getContext();
        if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null || (LIZIZ = C57434MgQ.LIZIZ(LJIJJ)) == null) {
            return;
        }
        PostModeContainerViewModel postModeContainerViewModel = (PostModeContainerViewModel) this.LJLLI.getValue();
        if (postModeContainerViewModel != null && (mutableLiveData2 = postModeContainerViewModel.LLIIII) != null) {
            mutableLiveData2.observe(LIZIZ, new AObserverS71S0100000_3(this, 63));
        }
        PostModeContainerViewModel postModeContainerViewModel2 = (PostModeContainerViewModel) this.LJLLI.getValue();
        if (postModeContainerViewModel2 == null || (mutableLiveData = postModeContainerViewModel2.LLIFFJFJJ) == null) {
            return;
        }
        mutableLiveData.observe(LIZIZ, new AObserverS71S0100000_3(this, 65));
    }

    public final void I3(boolean z, VideoMaskInfo videoMaskInfo) {
        Activity LJIJJ;
        TextView textView;
        String string;
        TextView textView2;
        String string2;
        TextView textView3;
        String string3;
        if (z) {
            Context context = getContext();
            if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null) {
                return;
            }
            View view = this.LJLJLLL;
            if (view != null && (textView3 = (TextView) view.findViewById(R.id.title)) != null) {
                if (videoMaskInfo == null || (string3 = videoMaskInfo.getTitle()) == null) {
                    string3 = LJIJJ.getString(R.string.q2i);
                }
                textView3.setText(string3);
            }
            View view2 = this.LJLJLLL;
            if (view2 != null && (textView2 = (TextView) view2.findViewById(R.id.bst)) != null) {
                if (videoMaskInfo == null || (string2 = videoMaskInfo.getContent()) == null) {
                    string2 = LJIJJ.getString(R.string.q2g);
                }
                textView2.setText(string2);
            }
            View view3 = this.LJLJLLL;
            if (view3 != null && (textView = (TextView) view3.findViewById(R.id.b1h)) != null) {
                if (videoMaskInfo == null || (string = videoMaskInfo.getCancelMaskLabel()) == null) {
                    string = LJIJJ.getString(R.string.q2h);
                }
                textView.setText(string);
                C16880lQ.LJIJI(textView, new ACListenerS38S0200000_3(this, LJIJJ, 38));
            }
            C201467vS.LJIJ("reportlayer_show", H3());
            return;
        }
        View view4 = this.LJLJLLL;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }
}
