package X;

import X.InterfaceC78933UyP;
import X.WM7;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes15.dex */
public final class WMA<T extends WM7 & InterfaceC78933UyP> {
    public final int LIZ;
    public final InterfaceC42033Geb LIZIZ;
    public final T LIZJ;
    public final InterfaceC78896Uxo LIZLLL;
    public final boolean LJ;
    public final WMC<T> LJFF;
    public final WMD LJI;

    public final void LIZIZ() {
        WMC<T> wmc = this.LJFF;
        if (wmc.LIZIZ == WMB.RESUME) {
            wmc.LIZIZ = WMB.PAUSE;
            wmc.LIZ.dispatchPause();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invoke onResume() first, current state ");
            LIZ.append(wmc.LIZIZ.toString());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZJ() {
        WMC<T> wmc = this.LJFF;
        WMB wmb = wmc.LIZIZ;
        if (wmb == WMB.START || wmb == WMB.PAUSE) {
            wmc.LIZIZ = WMB.RESUME;
            wmc.LIZ.dispatchResume();
            wmc.LJ = false;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invoke onStart() or onPause() first, current state ");
            LIZ.append(wmc.LIZIZ.toString());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public final void LJ() {
        WMC<T> wmc = this.LJFF;
        WMB wmb = wmc.LIZIZ;
        if (wmb == WMB.ACTIVITY_CREATED || wmb == WMB.STOP) {
            wmc.LIZIZ = WMB.START;
            wmc.LIZ.dispatchStart();
            wmc.LJ = false;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invoke onActivityCreated() or onStop() first, current state ");
            LIZ.append(wmc.LIZIZ.toString());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public final void LJFF() {
        WMC<T> wmc = this.LJFF;
        WMB wmb = wmc.LIZIZ;
        if (wmb == WMB.PAUSE || wmb == WMB.START) {
            wmc.LIZIZ = WMB.STOP;
            wmc.LIZ.dispatchStop();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invoke onPause() or onStart() first, current state ");
            LIZ.append(wmc.LIZIZ.toString());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public final void LJI() {
        WMC<T> wmc = this.LJFF;
        WMB wmb = wmc.LIZIZ;
        if (wmb == WMB.STOP || wmb == WMB.ACTIVITY_CREATED) {
            wmc.LIZIZ = WMB.NONE;
            wmc.LIZ.dispatchDestroyView();
            wmc.LIZ.dispatchDestroy();
            wmc.LIZ.dispatchDetachScene();
            Activity requireActivity = wmc.LIZ.requireActivity();
            wmc.LIZ.dispatchDetachActivity();
            wmc.LIZ.mRootScopeFactory = null;
            WMD wmd = wmc.LIZLLL;
            if (wmd != null) {
                if (wmc.LIZJ) {
                    if (!wmc.LJ) {
                        wmd.LJIIZILJ();
                    } else if (requireActivity.isFinishing()) {
                        wmc.LIZLLL.LJIIZILJ();
                    }
                }
                wmc.LIZLLL = null;
            }
            wmc.LIZ = null;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invoke onStop() or onActivityCreated() first, current state ");
        LIZ.append(wmc.LIZIZ.toString());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final void LIZLLL(Bundle bundle) {
        if (this.LJ) {
            bundle.putString("SCENE", this.LIZJ.getClass().getName());
            WMC<T> wmc = this.LJFF;
            wmc.getClass();
            if (wmc.LIZIZ != WMB.NONE) {
                if (wmc.LIZJ) {
                    if (wmc.LIZLLL != null) {
                        Bundle bundle2 = new Bundle();
                        wmc.LIZ.dispatchSaveInstanceState(bundle2);
                        bundle2.putBoolean("SceneLifecycleManager_onSaveInstanceState_TAG", true);
                        wmc.LIZLLL.LJIJ(bundle, bundle2);
                    } else {
                        wmc.LIZ.dispatchSaveInstanceState(bundle);
                        bundle.putBoolean("SceneLifecycleManager_onSaveInstanceState_TAG", true);
                    }
                    wmc.LJ = true;
                    return;
                }
                throw new IllegalArgumentException("cant invoke onSaveInstanceState when not support restore");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invoke onActivityCreated() first, current state ");
            LIZ.append(wmc.LIZIZ.toString());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZ(Activity activity, Bundle bundle) {
        WMD wmd;
        ViewGroup viewGroup = (ViewGroup) this.LIZIZ.LIZ(this.LIZ);
        WMC<T> wmc = this.LJFF;
        T t = this.LIZJ;
        InterfaceC78896Uxo interfaceC78896Uxo = this.LIZLLL;
        WMD wmd2 = this.LJI;
        boolean z = this.LJ;
        if (!z) {
            bundle = null;
        }
        if (wmc.LIZIZ == WMB.NONE) {
            C78932UyO.LJI(activity, "activity can't be null");
            C78932UyO.LJI(viewGroup, "viewGroup can't be null");
            C78932UyO.LJI(t, "scene can't be null");
            C78932UyO.LJI(interfaceC78896Uxo, "rootScopeFactory can't be null");
            WME wme = t.mState;
            WME wme2 = WME.NONE;
            if (wme == wme2) {
                wmc.LIZJ = z;
                if (z || bundle == null) {
                    wmc.LIZLLL = wmd2;
                    wmc.LIZIZ = WMB.ACTIVITY_CREATED;
                    wmc.LJ = false;
                    wmc.LIZ = t;
                    if (!z) {
                        t.disableSupportRestore();
                    }
                    T t2 = wmc.LIZ;
                    t2.mRootScopeFactory = interfaceC78896Uxo;
                    t2.dispatchAttachActivity(activity);
                    wmc.LIZ.dispatchAttachScene(null);
                    if (bundle == null || (((wmd = wmc.LIZLLL) != null && (bundle = wmd.onRestoreInstanceState(bundle)) == null) || bundle.getBoolean("SceneLifecycleManager_onSaveInstanceState_TAG"))) {
                        wmc.LIZ.dispatchCreate(bundle);
                        wmc.LIZ.dispatchCreateView(bundle, viewGroup);
                        viewGroup.addView(wmc.LIZ.requireView(), new ViewGroup.LayoutParams(-1, -1));
                        wmc.LIZ.dispatchActivityCreated(bundle);
                        return;
                    }
                    throw new P5X("savedInstanceState argument is not null, but previous onSaveInstanceState() is missing");
                }
                throw new IllegalArgumentException("savedInstanceState should be null when not support restore");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Scene state must be ");
            LIZ.append(wme2.name);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("invoke onDestroyView() first, current state ");
        LIZ2.append(wmc.LIZIZ.toString());
        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
    }

    public WMA(int i, InterfaceC42033Geb interfaceC42033Geb, T t, InterfaceC78896Uxo interfaceC78896Uxo, boolean z) {
        this(i, interfaceC42033Geb, t, interfaceC78896Uxo, null, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WMA(int i, InterfaceC42033Geb interfaceC42033Geb, WM7 wm7, InterfaceC78896Uxo interfaceC78896Uxo, C42330GjO c42330GjO, boolean z) {
        this.LJFF = new WMC<>();
        this.LIZ = i;
        this.LIZIZ = interfaceC42033Geb;
        this.LIZJ = wm7;
        this.LIZLLL = interfaceC78896Uxo;
        this.LJI = c42330GjO;
        this.LJ = z;
    }
}
