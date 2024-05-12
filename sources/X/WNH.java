package X;

import Y.ALAdapterS7S0300000_14;
import Y.ARunnableS20S0200000_1;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS6S0500000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class WNH extends WMU {
    public final java.util.Map<String, WNY> LIZJ;
    public final WNI LIZLLL;
    public final WNM LJ;
    public final WMU LJFF;

    @Override // X.WMU
    public final void LIZJ(Class cls, Class cls2) {
    }

    public WNH(java.util.Map map) {
        C81012Vqq c81012Vqq = new C81012Vqq();
        WNM wnm = WNM.FALLBACK;
        this.LIZJ = map;
        this.LIZLLL = null;
        this.LJ = wnm;
        this.LJFF = c81012Vqq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WMU
    public final void LIZ(C82158WMg c82158WMg, C82158WMg c82158WMg2, Runnable runnable, C43356Gzw c43356Gzw) {
        if (!c82158WMg.LIZLLL) {
            if (!c82158WMg2.LIZLLL) {
                View view = c82158WMg.LIZIZ;
                View view2 = c82158WMg2.LIZIZ;
                this.LIZ.addView(view);
                view.setVisibility(0);
                ARunnableS6S0500000_14 aRunnableS6S0500000_14 = new ARunnableS6S0500000_14(this, c82158WMg, c82158WMg2, runnable, c43356Gzw, 5);
                java.util.Map<String, WNY> map = this.LIZJ;
                WNL wnl = new WNL(map, this.LIZLLL);
                ARunnableS32S0200000_13 aRunnableS32S0200000_13 = new ARunnableS32S0200000_13(view, runnable, 116);
                WNM wnm = this.LJ;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                java.util.Set<String> keySet = map.keySet();
                C1HQ c1hq = new C1HQ();
                for (String str : keySet) {
                    View LIZIZ = C80944Vpk.LIZIZ(view, str, true);
                    if (LIZIZ == null) {
                        int i = WNN.LIZ[wnm.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                aRunnableS6S0500000_14.run();
                                return;
                            }
                        } else {
                            throw new IllegalArgumentException(a1.LJ("cant find ", str, " View"));
                        }
                    }
                    c1hq.put(str, LIZIZ);
                }
                Iterator it = ((ArrayList) C80944Vpk.LJ(c1hq)).iterator();
                while (it.hasNext()) {
                    PIA pia = (PIA) it.next();
                    WNY wny = wnl.LIZ.get(pia.LIZ);
                    View view3 = (View) pia.LIZIZ;
                    View LIZIZ2 = C80944Vpk.LIZIZ(view2, (String) pia.LIZ, false);
                    if (LIZIZ2 == null) {
                        int i2 = WNN.LIZ[wnm.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                aRunnableS6S0500000_14.run();
                                return;
                            }
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("cant find ");
                            throw new IllegalArgumentException(JBR.LJFF(LIZ, (String) pia.LIZ, " View", LIZ));
                        }
                    }
                    arrayList.add(new WNO(view3, LIZIZ2, wny));
                    arrayList2.add(view3);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    WNO wno = (WNO) it2.next();
                    WNY wny2 = wno.LIZJ;
                    View view4 = wno.LIZ;
                    wny2.LIZ(view4, wno.LIZIZ, view4);
                    C80944Vpk.LIZLLL(wno.LIZ, (ViewGroup) view);
                    arrayList3.add(wno.LIZJ.LIZLLL(false));
                    wno.LIZIZ.setVisibility(4);
                }
                ArrayList arrayList4 = new ArrayList();
                C80944Vpk.LIZ(view, view, arrayList4);
                List<View> list = C80944Vpk.LJFF(arrayList4).LIZ;
                list.removeAll(arrayList2);
                if (wnl.LIZIZ != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (View view5 : list) {
                        WNI clone = wnl.LIZIZ.clone();
                        clone.LJLJI = 300L;
                        clone.LJLIL = view5;
                        clone.LJLILLLLZI = (ViewGroup) view;
                        arrayList5.add(clone.LIZJ(false));
                    }
                    Iterator it3 = arrayList5.iterator();
                    long j = Long.MAX_VALUE;
                    while (it3.hasNext()) {
                        j = Math.min(j, ((Animator) it3.next()).getStartDelay());
                    }
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        Animator animator = (Animator) it4.next();
                        animator.setStartDelay(animator.getStartDelay() - j);
                    }
                    arrayList3.addAll(arrayList5);
                }
                if (view.getBackground() != null) {
                    WNJ wnj = new WNJ();
                    wnj.LJLIL = view;
                    wnj.LJLILLLLZI = (ViewGroup) view;
                    arrayList3.add(wnj.LIZJ(false));
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList3);
                animatorSet.setDuration(300L);
                animatorSet.addListener(new ALAdapterS7S0300000_14(view2, arrayList, aRunnableS32S0200000_13, 3));
                animatorSet.start();
                c43356Gzw.LIZIZ(new WNR(animatorSet));
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SharedElement animation don't support translucent scene: ");
            LIZ2.append(c82158WMg2.LIZ);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("SharedElement animation don't support translucent scene: ");
        LIZ3.append(c82158WMg.LIZ);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WMU
    public final void LIZIZ(C82158WMg c82158WMg, C82158WMg c82158WMg2, Runnable runnable, C43356Gzw c43356Gzw) {
        if (!c82158WMg.LIZLLL) {
            if (!c82158WMg2.LIZLLL) {
                View view = c82158WMg.LIZIZ;
                view.setVisibility(0);
                View view2 = c82158WMg2.LIZIZ;
                java.util.Map<String, WNY> map = this.LIZJ;
                WNL wnl = new WNL(map, this.LIZLLL);
                ARunnableS6S0500000_14 aRunnableS6S0500000_14 = new ARunnableS6S0500000_14(this, c82158WMg, c82158WMg2, runnable, c43356Gzw, 4);
                ARunnableS20S0200000_1 aRunnableS20S0200000_1 = new ARunnableS20S0200000_1(view, runnable, 54);
                WNM wnm = this.LJ;
                java.util.Set<String> keySet = map.keySet();
                C1HQ c1hq = new C1HQ();
                Iterator<String> it = keySet.iterator();
                while (true) {
                    boolean z = true;
                    if (it.hasNext()) {
                        String next = it.next();
                        View LIZIZ = C80944Vpk.LIZIZ(view2, next, true);
                        if (LIZIZ == null) {
                            int i = WNN.LIZ[wnm.ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                    aRunnableS6S0500000_14.run();
                                    return;
                                }
                            } else {
                                throw new IllegalArgumentException(a1.LJ("cant find ", next, " View"));
                            }
                        }
                        c1hq.put(next, LIZIZ);
                    } else {
                        List<PIA<String, View>> LJ = C80944Vpk.LJ(c1hq);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = 0;
                        while (i2 < ((ArrayList) LJ).size()) {
                            String str = (String) ((PIA) ListProtector.get(LJ, i2)).LIZ;
                            WNY wny = wnl.LIZ.get(str);
                            View LIZIZ2 = C80944Vpk.LIZIZ(view, str, z);
                            View view3 = (View) ((PIA) ListProtector.get(LJ, i2)).LIZIZ;
                            if (LIZIZ2 == null) {
                                int i3 = WNN.LIZ[wnm.ordinal()];
                                if (i3 != 1) {
                                    if (i3 == 2) {
                                        aRunnableS6S0500000_14.run();
                                        return;
                                    }
                                } else {
                                    throw new IllegalArgumentException(a1.LJ("cant find ", str, " View"));
                                }
                            }
                            arrayList.add(new WNO(LIZIZ2, view3, wny));
                            arrayList2.add(view3);
                            i2++;
                            z = true;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            WNO wno = (WNO) it2.next();
                            WNY wny2 = wno.LIZJ;
                            View view4 = wno.LIZ;
                            View view5 = wno.LIZIZ;
                            wny2.LIZ(view4, view5, view5);
                            C80944Vpk.LIZLLL(wno.LIZIZ, (ViewGroup) view2);
                            arrayList3.add(wno.LIZJ.LIZLLL(true));
                            wno.LIZ.setVisibility(4);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        C80944Vpk.LIZ(view2, view2, arrayList4);
                        List<View> list = C80944Vpk.LJFF(arrayList4).LIZ;
                        list.removeAll(arrayList2);
                        if (wnl.LIZIZ != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (View view6 : list) {
                                WNI clone = wnl.LIZIZ.clone();
                                clone.LJLJI = 300L;
                                clone.LJLIL = view6;
                                clone.LJLILLLLZI = (ViewGroup) view2;
                                arrayList5.add(clone.LIZJ(true));
                            }
                            Iterator it3 = arrayList5.iterator();
                            long j = Long.MAX_VALUE;
                            while (it3.hasNext()) {
                                j = Math.min(j, ((Animator) it3.next()).getStartDelay());
                            }
                            Iterator it4 = arrayList5.iterator();
                            while (it4.hasNext()) {
                                Animator animator = (Animator) it4.next();
                                animator.setStartDelay(animator.getStartDelay() - j);
                            }
                            arrayList3.addAll(arrayList5);
                        }
                        if (view2.getBackground() != null) {
                            WNJ wnj = new WNJ();
                            wnj.LJLIL = view2;
                            wnj.LJLILLLLZI = (ViewGroup) view2;
                            arrayList3.add(wnj.LIZJ(true));
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(arrayList3);
                        animatorSet.setDuration(300L);
                        animatorSet.addListener(new ALAdapterS7S0300000_14(view2, arrayList, aRunnableS20S0200000_1, 2));
                        animatorSet.start();
                        c43356Gzw.LIZIZ(new WNQ(animatorSet));
                        return;
                    }
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SharedElement animation don't support translucent scene: ");
                LIZ.append(c82158WMg2.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SharedElement animation don't support translucent scene: ");
            LIZ2.append(c82158WMg.LIZ);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
        }
    }
}
