package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160406Rg extends AbstractC56012Ht<C160386Re, C160366Rc> {
    public FrameLayout LJLIL;
    public FrameLayout LJLILLLLZI;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            if (frameLayout.getParent() != null) {
                FrameLayout frameLayout2 = this.LJLIL;
                if (frameLayout2 != null) {
                    frameLayout2.post(new ARunnableS38S0100000_2(this, 37));
                } else {
                    o.LJIJI("stickerContainer");
                    throw null;
                }
            }
            observe(getUiStates().LIZ(new TBT() { // from class: X.6Rh
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C160386Re) obj).LJLIL);
                }
            }), new AqS168S0100000_2(this, 76));
            return;
        }
        o.LJIJI("stickerContainer");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        FrameLayout frameLayout = new FrameLayout(requireSceneContext);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C157226Fa c157226Fa = C157226Fa.LIZ;
        c157226Fa.LJ(getUiActions().LIZIZ.invoke().cameraComponentModel.mVideoWidth, getUiActions().LIZIZ.invoke().cameraComponentModel.mVideoHeight);
        FrameLayout frameLayout2 = new FrameLayout(requireSceneContext);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C26338AVi.LJI(frameLayout2, 0, Integer.valueOf(c157226Fa.LIZ()), 0, Integer.valueOf(c157226Fa.getBottomMargin()), false, 16);
        this.LJLIL = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(requireSceneContext);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.LJLILLLLZI = frameLayout3;
        FrameLayout frameLayout4 = this.LJLIL;
        if (frameLayout4 != null) {
            frameLayout.addView(frameLayout4);
            FrameLayout frameLayout5 = this.LJLILLLLZI;
            if (frameLayout5 != null) {
                frameLayout.addView(frameLayout5);
                return frameLayout;
            }
            o.LJIJI("stickerHigherContainer");
            throw null;
        }
        o.LJIJI("stickerContainer");
        throw null;
    }
}
