package com.bytedance.android.live.broadcast.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C15490jB;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C46871sh;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import Y.IDCListenerS135S0100000;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameDualDevicePositionPreviewFragment extends BaseFragment {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final C62822Ol8 LJLIL;

    public GameDualDevicePositionPreviewFragment() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new C46871sh(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (r6 == X.EnumC12710eh.RightBottom.ordinal()) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r7 = this;
            super.onResume()
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = X.C51029K0z.LJIILIIL(r7)
            if (r1 == 0) goto La4
            java.lang.Class<X.BCy> r0 = X.C28408BCy.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto La4
            int r6 = r0.intValue()
        L17:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "positionSelect = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "GameDualDevicePositionPreviewFragment"
            X.C0NB.LJIIIZ(r0, r1)
            android.view.View r1 = r7.getView()
            if (r1 == 0) goto L3d
            r0 = 2131378518(0x7f0a4156, float:1.837727E38)
            android.view.View r2 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            if (r2 != 0) goto L3e
        L3d:
            return
        L3e:
            X.064 r5 = new X.064
            r5.<init>()
            r5.LJII(r2)
            r4 = 2131378519(0x7f0a4157, float:1.8377273E38)
            r3 = 2
            r5.LJI(r4, r3)
            r0 = 1
            r5.LJI(r4, r0)
            r1 = 4
            r5.LJI(r4, r1)
            r0 = 3
            r5.LJI(r4, r0)
            X.0eh r0 = X.EnumC12710eh.LeftTop
            int r0 = r0.ordinal()
            if (r6 != r0) goto L88
        L61:
            r3 = 1
        L62:
            r1 = 3
        L63:
            r0 = 2131378517(0x7f0a4155, float:1.8377269E38)
            r5.LJIIIIZZ(r4, r1, r0, r1)
            r5.LJIIIIZZ(r4, r3, r0, r3)
            r5.LIZIZ(r2)
            X.Ol8 r0 = r7.LJLIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3d
            Y.IDRunnableS85S0100000 r1 = new Y.IDRunnableS85S0100000
            r0 = 100
            r1.<init>(r7, r0)
            r2.post(r1)
            goto L3d
        L88:
            X.0eh r0 = X.EnumC12710eh.RightTop
            int r0 = r0.ordinal()
            if (r6 != r0) goto L91
            goto L62
        L91:
            X.0eh r0 = X.EnumC12710eh.LeftBottom
            int r0 = r0.ordinal()
            if (r6 != r0) goto L9b
            r3 = 1
            goto L63
        L9b:
            X.0eh r0 = X.EnumC12710eh.RightBottom
            int r0 = r0.ordinal()
            if (r6 != r0) goto L61
            goto L63
        La4:
            r6 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.fragment.GameDualDevicePositionPreviewFragment.onResume():void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (((Boolean) this.LJLIL.getValue()).booleanValue()) {
            View findViewById = view.findViewById(R.id.lr0);
            if (findViewById != null) {
                C15490jB.LJFF(findViewById, "tiktok_live_game_demand_1", "ttlive_game_dual_device_position_preview_mask.png", ImageView.ScaleType.FIT_XY, null);
            }
        } else {
            View findViewById2 = view.findViewById(R.id.lqx);
            if (findViewById2 != null) {
                C15490jB.LJFF(findViewById2, "tiktok_live_game_demand_1", "ttlive_game_dual_device_position_preview_mask_bg_port.png", ImageView.ScaleType.FIT_XY, null);
            }
            View findViewById3 = view.findViewById(R.id.lr0);
            if (findViewById3 != null) {
                C15490jB.LJFF(findViewById3, "tiktok_live_game_demand_1", "ttlive_game_dual_device_position_preview_mask_port.png", ImageView.ScaleType.FIT_XY, null);
            }
        }
        View findViewById4 = view.findViewById(R.id.lr2);
        if (findViewById4 != null) {
            C15490jB.LJFF(findViewById4, "tiktok_live_game_demand_1", "ttlive_game_dual_device_position_selected.png", ImageView.ScaleType.FIT_XY, null);
        }
        View findViewById5 = view.findViewById(R.id.lqy);
        if (findViewById5 != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 79), findViewById5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        if (((Boolean) this.LJLIL.getValue()).booleanValue()) {
            i = R.layout.d40;
        } else {
            i = R.layout.d41;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
