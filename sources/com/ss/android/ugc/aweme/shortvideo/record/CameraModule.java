package com.ss.android.ugc.aweme.shortvideo.record;

import X.C29S;
import X.C5NP;
import X.C82127WLb;
import X.C82890Wg2;
import X.C82891Wg3;
import X.C83600WrU;
import X.C83691Wsx;
import X.InterfaceC82128WLc;
import X.InterfaceC83624Wrs;
import X.InterfaceC83659WsR;
import X.InterfaceC83703Wt9;
import X.InterfaceC83991Wxn;
import X.TMB;
import X.WLT;
import X.X1D;
import android.util.SparseIntArray;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.als.LiveEvent;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes15.dex */
public class CameraModule implements GenericLifecycleObserver, InterfaceC83991Wxn {
    public final C29S LJLIL;
    public final InterfaceC83659WsR LJLILLLLZI;
    public final InterfaceC83703Wt9 LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final C82127WLb LJLJJLL;
    public final InterfaceC83624Wrs LJLJL;
    public final WLT LJLJLJ;
    public Integer LJLJLLL;
    public final Boolean LJLL;
    public final C83600WrU LJLLI;
    public final boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public final C83691Wsx LJZ = new C83691Wsx(this);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.LJLJL.LJJJJJ(0);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        sparseIntArray.put(0, R.drawable.b6x);
        sparseIntArray.put(1, R.drawable.b6z);
        sparseIntArray.put(2, R.drawable.b6z);
        sparseIntArray.put(3, R.drawable.b6v);
    }

    public final void LIZIZ() {
        LiveEvent<Boolean> VO = this.LJLJLJ.VO();
        if (VO.LIZJ() != null && !VO.LIZJ().booleanValue()) {
            this.LJLJLJ.Gm0(true);
        }
    }

    public final void LIZJ() {
        int i = this.LJLLLL;
        if (i != 0) {
            if (i != 1 || this.LJLJL.LLLLLLZZ() || this.LJLLJ) {
                return;
            }
            this.LJLLJ = true;
            C29S c29s = this.LJLIL;
            C82890Wg2.LJFF.getClass();
            TMB.LIZ(R.string.cg1, 1, c29s).LIZ();
            return;
        }
        if (this.LJLJL.LLLLLLZZ() || this.LJLLL) {
            return;
        }
        this.LJLLL = true;
        C29S c29s2 = this.LJLIL;
        C82890Wg2.LJFF.getClass();
        TMB.LIZ(R.string.cg1, 1, c29s2).LIZ();
    }

    public final boolean LIZLLL() {
        if (!this.LJLJL.LLLLZI()) {
            if (!this.LJLJJL) {
                C29S c29s = this.LJLIL;
                C82890Wg2.LJFF.getClass();
                TMB.LIZ(R.string.tx_, 1, c29s).LIZ();
                this.LJLJJL = true;
            }
            return true;
        }
        return false;
    }

    public final int LIZ(boolean z) {
        Integer num = this.LJLJLLL;
        if (num != null) {
            int LIZIZ = this.LJLJI.LIZIZ(num.intValue());
            this.LJLJLLL = null;
            this.LJLJI.LIZJ(LIZIZ);
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("camera_switch CameraModule getCameraFacing incomeFacing:");
            LIZ.append(num);
            LIZ.append(", fromInit:");
            LIZ.append(z);
            LIZ.append(", facing:");
            LIZ.append(LIZIZ);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            return LIZIZ;
        }
        return this.LJLJI.LIZ();
    }

    @Override // X.InterfaceC83991Wxn
    public final void onChange(int i, float f, boolean z) {
        this.LJLILLLLZI.LJIIIZ(f, i, z);
    }

    @Override // X.InterfaceC83991Wxn
    public final void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list) {
        this.LJLILLLLZI.LIZJ(i, z, z2, f, list);
    }

    public CameraModule(C29S c29s, InterfaceC83703Wt9 interfaceC83703Wt9, InterfaceC83659WsR interfaceC83659WsR, InterfaceC83624Wrs interfaceC83624Wrs, WLT wlt, Integer num, boolean z, C83600WrU c83600WrU, boolean z2, InterfaceC82128WLc interfaceC82128WLc) {
        this.LJLIL = c29s;
        this.LJLJI = interfaceC83703Wt9;
        this.LJLJL = interfaceC83624Wrs;
        this.LJLILLLLZI = interfaceC83659WsR;
        this.LJLJLJ = wlt;
        this.LJLJLLL = num;
        this.LJLL = Boolean.valueOf(z);
        this.LJLLI = c83600WrU;
        this.LJLLILLLL = z2;
        this.LJLJJLL = new C82127WLb(c29s, interfaceC83624Wrs.getCameraController(), interfaceC82128WLc);
    }
}
