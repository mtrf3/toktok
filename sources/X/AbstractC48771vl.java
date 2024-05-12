package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48771vl extends WM7 {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    public abstract void LLJILJIL(View view);

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LJLILLLLZI) {
            WK2 wk2 = (WK2) this;
            wk2.LJLJI.LJIIIIZZ((InterfaceC82075WJb) wk2.LJLLILLLL.getValue());
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
    public final void onResume() {
        super.onResume();
    }

    @Override // X.WM7
    public final void onStart() {
        super.onStart();
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLILLLLZI) {
            LLJILJIL(view);
        }
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (this.LJLIL) {
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            C30981Jm c30981Jm = new C30981Jm(requireSceneContext);
            final FrameLayout frameLayout = new FrameLayout(requireSceneContext());
            c30981Jm.LIZ(R.layout.dsc, container, new C0R6(frameLayout, bundle) { // from class: X.1Jk
                public final /* synthetic */ FrameLayout LIZIZ;

                @Override // X.C0R6
                public final void LIZ(View view) {
                    o.LJIIIZ(view, "view");
                    WME state = AbstractC48771vl.this.mState;
                    o.LJIIIIZZ(state, "state");
                    if (state == WME.NONE) {
                        return;
                    }
                    if (state.value >= WME.VIEW_CREATED.value) {
                        this.LIZIZ.addView(view);
                        AbstractC48771vl abstractC48771vl = AbstractC48771vl.this;
                        abstractC48771vl.LJLILLLLZI = true;
                        abstractC48771vl.LLJILJIL(abstractC48771vl.mView);
                    }
                    if (state.value >= WME.ACTIVITY_CREATED.value) {
                        AbstractC48771vl.this.getClass();
                    }
                    if (state.value >= WME.STARTED.value) {
                        AbstractC48771vl.this.getClass();
                    }
                    if (state.value == WME.RESUMED.value) {
                        AbstractC48771vl.this.getClass();
                    }
                }
            });
            return frameLayout;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dsc, container, false);
        if (!(LLLLIILL instanceof ViewGroup) || LLLLIILL == null) {
            throw new IllegalArgumentException("AsyncLayoutUIScene getLayoutId() view must be ViewGroup");
        }
        this.LJLILLLLZI = true;
        return LLLLIILL;
    }
}
