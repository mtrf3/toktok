package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import kotlin.jvm.internal.o;

/* renamed from: X.2Hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC56042Hw extends UserVisibleHintGroupScene {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    public abstract C0R5 LLJILJIL(LayoutInflater layoutInflater);

    public abstract int LLJILJILJ();

    public void LLJJ() {
    }

    public void LLJJI() {
    }

    public void LLJJIII() {
    }

    public void LLJJIJI(View view) {
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LJLILLLLZI) {
            LLJJI();
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        if (this.LJLILLLLZI) {
            LLJJIII();
        }
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // X.WM7
    public final void onDetach() {
        super.onDetach();
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
    }

    @Override // X.WM7
    public final void onStart() {
        super.onStart();
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.LJLILLLLZI) {
            LLJJ();
        }
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLILLLLZI) {
            LLJJIJI(view);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle bundle) {
        C0R5 LLJILJIL;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (this.LJLIL && (LLJILJIL = LLJILJIL(inflater)) != null) {
            final FrameLayout frameLayout = new FrameLayout(requireSceneContext());
            LLJILJIL.LIZ(LLJILJILJ(), container, new C0R6(frameLayout, bundle) { // from class: X.1Jj
                public final /* synthetic */ FrameLayout LIZIZ;

                @Override // X.C0R6
                public final void LIZ(View view) {
                    o.LJIIIZ(view, "view");
                    WME state = AbstractC56042Hw.this.mState;
                    o.LJIIIIZZ(state, "state");
                    if (state == WME.NONE) {
                        return;
                    }
                    if (state.value >= WME.VIEW_CREATED.value) {
                        this.LIZIZ.addView(view);
                        AbstractC56042Hw abstractC56042Hw = AbstractC56042Hw.this;
                        abstractC56042Hw.LJLILLLLZI = true;
                        abstractC56042Hw.LLJJIJI(abstractC56042Hw.mView);
                    }
                    if (state.value >= WME.ACTIVITY_CREATED.value) {
                        AbstractC56042Hw.this.LLJJ();
                    }
                    if (state.value >= WME.STARTED.value) {
                        AbstractC56042Hw.this.getClass();
                    }
                    if (state.value == WME.RESUMED.value) {
                        AbstractC56042Hw.this.LLJJIII();
                    }
                }
            });
            return frameLayout;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, LLJILJILJ(), container, false);
        if (!(LLLLIILL instanceof ViewGroup)) {
            LLLLIILL = null;
        }
        ViewGroup viewGroup = (ViewGroup) LLLLIILL;
        if (viewGroup != null) {
            this.LJLILLLLZI = true;
            return viewGroup;
        }
        throw new IllegalArgumentException("AsyncLayoutUIScene getLayoutId() view must be ViewGroup");
    }
}
