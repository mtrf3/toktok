package X;

import Y.ARunnableS21S0200000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.5Q4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Q4 extends AbstractC56012Ht<C5QB, C5QJ> {
    public C134595Pz LJLIL;

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1280450u.LIZ()) {
            View view2 = this.mView;
            if (!(view2 instanceof C87230YLi)) {
                return;
            }
            o.LJII(view2, "null cannot be cast to non-null type com.ss.ugc.android.editor.preview.gesture.CommonGestureLayout");
            C87230YLi c87230YLi = (C87230YLi) view2;
            if (this.LJLIL != null) {
                return;
            }
            this.LJLIL = new C134595Pz(c87230YLi);
            c87230YLi.post(new ARunnableS21S0200000_2(this, c87230YLi, 42));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (!C1280450u.LIZ()) {
            return new FrameLayout(requireSceneContext());
        }
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        C87230YLi c87230YLi = new C87230YLi(requireSceneContext, null, 6);
        c87230YLi.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c87230YLi;
    }
}
