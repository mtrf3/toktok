package X;

import Y.ARunnableS20S0000000_14;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS42S0100000_6;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.navigation.Record;
import defpackage.b1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class WMI {
    public static final ARunnableS20S0000000_14 LJIIL = new ARunnableS20S0000000_14(1);
    public final NavigationScene LIZ;
    public final NavigationScene LIZJ;
    public final WMW LIZIZ = new WMW();
    public final HandlerC36634EZi LIZLLL = new HandlerC36634EZi(C16880lQ.LLJJJJ());
    public final ArrayDeque<InterfaceC82169WMr> LJ = new ArrayDeque<>();
    public long LJFF = -1;
    public final C82162WMk LJI = new C82162WMk();
    public final List<PIA<LifecycleOwner, GHB>> LJII = new ArrayList();
    public final java.util.Set<String> LJIIIIZZ = new HashSet();
    public int LJIIIZ = 0;
    public int LJIIJ = 0;
    public boolean LJIIJJI = false;

    public final boolean LIZIZ() {
        if (this.LIZ.mState.value >= WME.ACTIVITY_CREATED.value) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        C82162WMk c82162WMk = this.LJI;
        if (((ArrayList) c82162WMk.LIZ).size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(c82162WMk.LIZ);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C43356Gzw c43356Gzw = (C43356Gzw) it.next();
            it.remove();
            c43356Gzw.LIZ();
        }
        ((ArrayList) c82162WMk.LIZ).removeAll(arrayList);
    }

    public final WM7 LJFF() {
        Record LIZ = this.LIZIZ.LIZ();
        if (LIZ != null) {
            return LIZ.LJLIL;
        }
        return null;
    }

    public WMI(NavigationScene navigationScene) {
        this.LIZ = navigationScene;
        this.LIZJ = navigationScene;
    }

    public final String LIZ(String str) {
        StringBuilder LIZJ = b1.LIZJ(str, "_");
        int i = this.LJIIIZ;
        this.LJIIIZ = i + 1;
        LIZJ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        if (((HashSet) this.LJIIIIZZ).add(LIZIZ)) {
            return LIZIZ;
        }
        throw new WM8("suppressTag already exists");
    }

    public final void LIZLLL(String str) {
        if (((HashSet) this.LJIIIIZZ).remove(str)) {
            if (((HashSet) this.LJIIIIZZ).size() == 0) {
                this.LJIIIZ = 0;
                return;
            }
            return;
        }
        throw new WM8("suppressTag not found");
    }

    public final void LJ(InterfaceC82169WMr interfaceC82169WMr) {
        try {
            interfaceC82169WMr.execute();
        } catch (Throwable th) {
            this.LIZLLL.post(new ARunnableS42S0100000_6(th, 21));
            throw th;
        }
    }

    public final void LJII(GHB ghb) {
        PIA pia;
        int size = ((ArrayList) this.LJII).size() - 1;
        while (true) {
            if (size >= 0) {
                pia = (PIA) ListProtector.get(this.LJII, size);
                if (pia.LIZIZ == ghb) {
                    break;
                } else {
                    size--;
                }
            } else {
                pia = null;
                break;
            }
        }
        ((ArrayList) this.LJII).remove(pia);
    }

    public final void LJIIIIZZ(InterfaceC82169WMr interfaceC82169WMr) {
        if (LIZIZ()) {
            if (((HashSet) this.LJIIIIZZ).size() > 0 || this.LJIIJ > 0) {
                ARunnableS33S0200000_14 aRunnableS33S0200000_14 = new ARunnableS33S0200000_14(this, interfaceC82169WMr, 16);
                this.LJIIJ++;
                HandlerC36634EZi handlerC36634EZi = this.LIZLLL;
                handlerC36634EZi.getClass();
                Message obtain = Message.obtain(handlerC36634EZi, aRunnableS33S0200000_14);
                if (handlerC36634EZi.LIZ) {
                    obtain.setAsynchronous(true);
                }
                handlerC36634EZi.sendMessage(obtain);
                return;
            }
            String LIZ = LIZ("NavigationManager execute operation directly");
            LJ(interfaceC82169WMr);
            LIZLLL(LIZ);
            return;
        }
        this.LJ.addLast(interfaceC82169WMr);
        this.LJFF = System.currentTimeMillis();
    }

    public static void LJI(NavigationScene navigationScene, WM7 wm7, WME wme, Bundle bundle, boolean z, ARunnableS20S0000000_14 aRunnableS20S0000000_14) {
        Record record;
        WME wme2 = wm7.mState;
        if (wme2 == wme) {
            return;
        }
        if (wme2.value < wme.value) {
            int i = WMG.LIZ[wme2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            wm7.dispatchResume();
                            LJI(navigationScene, wm7, wme, bundle, z, aRunnableS20S0000000_14);
                            return;
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("unreachable state case ");
                            LIZ.append(wme2.getName());
                            throw new WM8(X1D.LIZIZ(LIZ));
                        }
                    }
                    wm7.mView.setVisibility(0);
                    wm7.dispatchStart();
                    LJI(navigationScene, wm7, wme, bundle, z, aRunnableS20S0000000_14);
                    return;
                }
                wm7.dispatchActivityCreated(bundle);
                LJI(navigationScene, wm7, wme, bundle, z, aRunnableS20S0000000_14);
                return;
            }
            wm7.dispatchAttachActivity(navigationScene.requireActivity());
            wm7.dispatchAttachScene(navigationScene);
            wm7.dispatchCreate(bundle);
            FrameLayout frameLayout = navigationScene.LJLJJL;
            wm7.dispatchCreateView(bundle, frameLayout);
            if (!z) {
                if (wm7.mView.getBackground() == null) {
                    Iterator it = ((ArrayList) navigationScene.LJLJJI.LIZIZ.LIZ).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            record = (Record) it.next();
                            if (record.LJLIL == wm7) {
                                break;
                            }
                        } else {
                            record = null;
                            break;
                        }
                    }
                    if (!record.LJLILLLLZI) {
                        HJO hjo = navigationScene.LJLJI;
                        if (hjo.LIZLLL) {
                            int i2 = hjo.LJ;
                            if (i2 > 0) {
                                wm7.mView.setBackgroundDrawable(wm7.requireSceneContext().getResources().getDrawable(i2));
                            } else {
                                wm7.mView.setBackgroundDrawable(C78932UyO.LIZLLL(wm7.requireSceneContext()));
                            }
                            record.LJLJJLL = true;
                        }
                    }
                }
                frameLayout.addView(wm7.mView);
            }
            wm7.mView.setVisibility(8);
            LJI(navigationScene, wm7, wme, bundle, z, aRunnableS20S0000000_14);
            return;
        }
        int i3 = WMG.LIZ[wme2.ordinal()];
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 == 5) {
                        wm7.dispatchPause();
                        LJI(navigationScene, wm7, wme, bundle, z, aRunnableS20S0000000_14);
                        return;
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("unreachable state case ");
                        LIZ2.append(wme2.getName());
                        throw new WM8(X1D.LIZIZ(LIZ2));
                    }
                }
                wm7.dispatchStop();
                if (!z) {
                    wm7.mView.setVisibility(8);
                }
                LJI(navigationScene, wm7, wme, bundle, z, aRunnableS20S0000000_14);
                return;
            }
            if (wme == WME.VIEW_CREATED) {
                throw new IllegalArgumentException("cant switch state ACTIVITY_CREATED to VIEW_CREATED");
            }
        }
        View view = wm7.mView;
        wm7.dispatchDestroyView();
        if (!z) {
            C78932UyO.LJFF(view);
        }
        wm7.dispatchDestroy();
        wm7.dispatchDetachScene();
        wm7.dispatchDetachActivity();
        LJI(navigationScene, wm7, wme, bundle, z, aRunnableS20S0000000_14);
    }
}
