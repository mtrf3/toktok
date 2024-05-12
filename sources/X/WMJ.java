package X;

import Y.ARunnableS20S0000000_14;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS50S0100000_14;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.group.GroupRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class WMJ {
    public static final HashMap<WM7, C43356Gzw> LJII = new HashMap<>();
    public static final ARunnableS20S0000000_14 LJIIIIZZ = new ARunnableS20S0000000_14(0);
    public final WMH LIZ;
    public ViewGroup LIZIZ;
    public final WMT LIZJ = new WMT();
    public final Handler LIZLLL = new Handler(C16880lQ.LLJJJJ());
    public final java.util.Set<C15070iV<WM7, String>> LJ = new HashSet();
    public boolean LJFF = false;
    public final List<AbstractC82155WMd> LJI = new ArrayList();

    public final List<WM7> LJI() {
        WMT wmt = this.LIZJ;
        wmt.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) wmt.LIZ).iterator();
        while (it.hasNext()) {
            arrayList.add(((GroupRecord) it.next()).LJLILLLLZI);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public WMJ(WMH wmh) {
        this.LIZ = wmh;
    }

    public static void LJ(WMK wmk) {
        try {
            wmk.LIZ(LJIIIIZZ);
        } catch (Throwable th) {
            wmk.LJFF.LIZLLL.post(new ARunnableS42S0100000_6(th, 20));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC82170WMs LJFF(WM7 wm7) {
        if (wm7 == 0) {
            return null;
        }
        if (wm7 instanceof InterfaceC82170WMs) {
            return (InterfaceC82170WMs) wm7;
        }
        WM7 wm72 = wm7.mParentScene;
        if (wm72 == null) {
            return null;
        }
        return LJFF(wm72);
    }

    public final void LIZ(WM7 wm7) {
        String str;
        Iterator it = ((HashSet) this.LJ).iterator();
        while (it.hasNext()) {
            if (((C15070iV) it.next()).LIZ == wm7) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Target scene ");
                LIZ.append(C16880lQ.LJLLILLLL(wm7.getClass()));
                LIZ.append(" is already tracked");
                throw new WM8(X1D.LIZIZ(LIZ));
            }
        }
        InterfaceC82170WMs LJFF = LJFF(this.LIZ.mParentScene);
        if (LJFF != null) {
            str = LJFF.LJLI(wm7.toString());
        } else {
            str = null;
        }
        ((HashSet) this.LJ).add(new C15070iV(wm7, str));
    }

    public final void LIZIZ(WM7 wm7) {
        Iterator it = ((HashSet) this.LJ).iterator();
        while (it.hasNext()) {
            if (((C15070iV) it.next()).LIZ == wm7) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Cant add/remove/show/hide ");
                LIZ.append(C16880lQ.LJLLILLLL(wm7.getClass()));
                LIZ.append(" before it finish previous add/remove/show/hide operation or in its lifecycle method");
                throw new P5W(X1D.LIZIZ(LIZ));
            }
        }
    }

    public final boolean LIZJ(WM7 wm7) {
        List unmodifiableList = Collections.unmodifiableList(this.LIZJ.LIZ);
        for (int i = 0; i < unmodifiableList.size(); i++) {
            if (((GroupRecord) ListProtector.get(unmodifiableList, i)).LJLILLLLZI == wm7) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(WM7 wm7) {
        Iterator it = ((HashSet) this.LJ).iterator();
        while (it.hasNext()) {
            C15070iV c15070iV = (C15070iV) it.next();
            if (c15070iV.LIZ == wm7) {
                if (c15070iV.LIZIZ != 0) {
                    LJFF(this.LIZ.mParentScene).LJLJI((String) c15070iV.LIZIZ);
                }
                ((HashSet) this.LJ).remove(c15070iV);
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Target scene ");
        LIZ.append(C16880lQ.LJLLILLLL(wm7.getClass()));
        LIZ.append(" is not tracked");
        throw new WM8(X1D.LIZIZ(LIZ));
    }

    public static void LJIIIZ(WM7 wm7, int i) {
        View view = wm7.mView;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    public static void LJII(WMH wmh, WM7 wm7, WME wme, boolean z, Runnable runnable) {
        WME wme2 = wm7.mState;
        if (wme2 == wme) {
            runnable.run();
            return;
        }
        if (wme2.value < wme.value) {
            int i = WMF.LIZ[wme2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            wm7.dispatchResume();
                            LJII(wmh, wm7, wme, z, runnable);
                            return;
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("unreachable state case ");
                            LIZ.append(wme2.getName());
                            throw new WM8(X1D.LIZIZ(LIZ));
                        }
                    }
                    wm7.dispatchStart();
                    LJII(wmh, wm7, wme, z, runnable);
                    return;
                }
                GroupRecord LIZ2 = wmh.mGroupSceneManager.LIZJ.LIZ(wm7);
                wm7.dispatchActivityCreated(LIZ2.LJLJJLL);
                LIZ2.LJLJJLL = null;
                LJII(wmh, wm7, wme, z, runnable);
                return;
            }
            wm7.dispatchAttachActivity(wmh.requireActivity());
            wm7.dispatchAttachScene(wmh);
            GroupRecord LIZ3 = wmh.mGroupSceneManager.LIZJ.LIZ(wm7);
            Bundle bundle = LIZ3.LJLJJLL;
            wm7.dispatchCreate(bundle);
            ViewGroup findContainerById = wmh.findContainerById(wmh.mGroupSceneManager.LIZJ.LIZ(wm7).LJLIL);
            wm7.dispatchCreateView(bundle, findContainerById);
            findContainerById.addView(wm7.mView);
            if (LIZ3.isHidden) {
                LJIIIZ(wm7, 8);
            }
            LJII(wmh, wm7, wme, z, runnable);
            return;
        }
        int i2 = WMF.LIZ[wme2.ordinal()];
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        wm7.dispatchPause();
                        LJII(wmh, wm7, wme, z, runnable);
                        return;
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("unreachable state case ");
                        LIZ4.append(wme2.getName());
                        throw new WM8(X1D.LIZIZ(LIZ4));
                    }
                }
                wm7.dispatchStop();
                LJII(wmh, wm7, wme, z, runnable);
                return;
            }
            if (wme == WME.VIEW_CREATED) {
                throw new IllegalArgumentException("cant switch state ACTIVITY_CREATED to VIEW_CREATED");
            }
        }
        View view = wm7.mView;
        wm7.dispatchDestroyView();
        if (z) {
            C78932UyO.LJFF(view);
        }
        wm7.dispatchDestroy();
        wm7.dispatchDetachScene();
        wm7.dispatchDetachActivity();
        LJII(wmh, wm7, wme, z, runnable);
    }

    public final void LJIIIIZZ(WMH wmh, WM7 wm7, WME wme, boolean z, Runnable runnable) {
        try {
            LJII(wmh, wm7, wme, z, runnable);
        } catch (Throwable th) {
            this.LIZLLL.post(new ARunnableS50S0100000_14(th, 21));
            throw th;
        }
    }
}
