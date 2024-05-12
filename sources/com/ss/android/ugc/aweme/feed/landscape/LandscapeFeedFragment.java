package com.ss.android.ugc.aweme.feed.landscape;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C29S;
import X.C2L4;
import X.C2S6;
import X.C3C5;
import X.C48662J7y;
import X.C51697KQr;
import X.C76800UCe;
import X.C76965UIn;
import X.C78966Uyw;
import X.C87293bh;
import X.C90903hW;
import X.FMX;
import X.FRW;
import X.InterfaceC46330IGg;
import X.JHI;
import X.KR8;
import X.KRB;
import X.M89;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.landscape.component.scope.LandscapeFeedScope;
import com.ss.android.ugc.aweme.feed.landscape.experiments.LandscapeRefactorExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LandscapeFeedFragment extends AmeBaseFragment implements C2L4 {
    public Aweme LJLILLLLZI;
    public M89 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final LandscapeFragmentPanel LJLIL = new LandscapeFragmentPanel();

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(LandscapeFeedScope.class);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        this.LJLIL.setUserVisibleHint(true);
        super.onResume();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.LJLIL.setUserVisibleHint(false);
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLIL.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<KRB> registerComponents() {
        SparseArray<KRB> registerComponents = super.registerComponents();
        o.LJIIIIZZ(registerComponents, "super.registerComponents()");
        registerComponents.append(C51697KQr.LIZLLL, this.LJLIL);
        return registerComponents;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        String str;
        String str2;
        C87293bh LJ;
        String LLJJIJIIJIL;
        o.LJIIIZ(activity, "activity");
        super.onAttach(activity);
        M89 m89 = new M89();
        Intent intent = activity.getIntent();
        int i = 0;
        if (intent != null) {
            i = intent.getIntExtra("page_type", 0);
        }
        m89.setPageType(i);
        Intent intent2 = activity.getIntent();
        String str3 = "homepage_hot";
        if (intent2 == null || (str = C16880lQ.LLJJIJIIJIL(intent2, "event_type")) == null) {
            str = "homepage_hot";
        }
        m89.setEventType(str);
        Intent intent3 = activity.getIntent();
        if (intent3 != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent3, "event_type")) != null) {
            str3 = LLJJIJIIJIL;
        }
        m89.setFrom(str3);
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        m89.setFromGroupId(str2);
        this.LJLJI = m89;
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LIZLLL()) {
            setArguments(C16880lQ.LLJJIJI(activity.getIntent()));
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Landscape");
            }
            KR8.LJIIIIZZ(this);
            RootPanelComponent LIZIZ = KR8.LIZIZ(this);
            if (LIZIZ != null) {
                LIZIZ.j(activity, this);
            }
            M89 m892 = this.LJLJI;
            if (m892 == null || (LJ = KR8.LJ(this)) == null) {
                return;
            }
            LJ.LJLIL.LIZJ = m892;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        RootPanelComponent LIZIZ;
        super.onCreate(bundle);
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LIZLLL() && (LIZIZ = KR8.LIZIZ(this)) != null) {
            LIZIZ.N1(bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        boolean z;
        Intent intent;
        Serializable serializable2;
        Intent intent2;
        Intent intent3;
        RootPanelComponent LIZIZ;
        o.LJIIIZ(view, "view");
        FMX.onEventV3("landscape_business_on_view_created");
        FRW.LIZ("landscape_performance_create_to_created");
        FRW.LIZLLL("landscape_performance_created_to_video_first_frame");
        FRW.LIZLLL("landscape_performance_created_to_view_first_frame");
        super.onViewCreated(view, bundle);
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LIZLLL() && (LIZIZ = KR8.LIZIZ(this)) != null) {
            LIZIZ.LJJJJI(view, bundle);
        }
        this.LJLILLLLZI = C78966Uyw.LJLJJI;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent3 = mo49getActivity.getIntent()) != null) {
            serializable = intent3.getSerializableExtra("is_pause_state");
        } else {
            serializable = null;
        }
        if (serializable instanceof Boolean) {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null && (intent2 = mo49getActivity2.getIntent()) != null) {
                serializable2 = intent2.getSerializableExtra("is_pause_state");
            } else {
                serializable2 = null;
            }
            o.LJII(serializable2, "null cannot be cast to non-null type kotlin.Boolean");
            ((Boolean) serializable2).booleanValue();
        }
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 != null && (intent = mo49getActivity3.getIntent()) != null) {
            z = intent.getBooleanExtra("is_original_caption", true);
        } else {
            z = true;
        }
        M89 m89 = this.LJLJI;
        if (m89 != null) {
            LandscapeFragmentPanel landscapeFragmentPanel = this.LJLIL;
            landscapeFragmentPanel.getClass();
            landscapeFragmentPanel.LJLLLLLL = m89;
            Context context = landscapeFragmentPanel.getContext();
            o.LJIIIIZZ(context, "context");
            M89 m892 = landscapeFragmentPanel.LJLLLLLL;
            if (m892 != null) {
                C2S6.LIZIZ(context, m892);
                if (!LandscapeRefactorExperiment.LIZJ()) {
                    M89 m893 = landscapeFragmentPanel.LJLLLLLL;
                    if (m893 != null) {
                        String eventType = m893.getEventType();
                        M89 m894 = landscapeFragmentPanel.LJLLLLLL;
                        if (m894 != null) {
                            landscapeFragmentPanel.LJLJJLL = new C48662J7y(m894.getPageType(), landscapeFragmentPanel, eventType);
                            InterfaceC46330IGg interfaceC46330IGg = JHI.LIZ().LIZ;
                            if (interfaceC46330IGg != null) {
                                JHI.LIZ().LIZ = null;
                                landscapeFragmentPanel.LJZI = interfaceC46330IGg;
                            }
                            C48662J7y c48662J7y = landscapeFragmentPanel.LJLJJLL;
                            if (c48662J7y != null) {
                                c48662J7y.LLLLLLLLLL = landscapeFragmentPanel.getPlayerManager();
                            }
                        } else {
                            o.LJIJI("param");
                            throw null;
                        }
                    } else {
                        o.LJIJI("param");
                        throw null;
                    }
                }
                landscapeFragmentPanel.LJLLL = System.currentTimeMillis();
            } else {
                o.LJIJI("param");
                throw null;
            }
        }
        this.LJLIL.setUserVisibleHint(true);
        LandscapeFragmentPanel landscapeFragmentPanel2 = this.LJLIL;
        landscapeFragmentPanel2.LJLJLLL = this.LJLILLLLZI;
        landscapeFragmentPanel2.LJLLLL = z;
        landscapeFragmentPanel2.onAttach(mo49getActivity(), this);
        this.LJLIL.onViewCreated(view, bundle);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        o.LJII(context, "null cannot be cast to non-null type android.app.Activity");
        View LIZLLL = C16970lZ.LIZLLL((Activity) context, R.layout.bgv);
        C29S c29s = null;
        if (!(LIZLLL instanceof View)) {
            LIZLLL = null;
        }
        if (LIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZLLL, this);
                C10A.LIZIZ(LIZLLL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LIZLLL;
    }
}
