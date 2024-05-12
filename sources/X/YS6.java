package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes16.dex */
public final class YS6 implements YTH {
    public YS3 LJFF;
    public final SparseArray<TreeSet<YSA>> LIZ = new SparseArray<>();
    public final SparseArray<TreeSet<YSA>> LIZIZ = new SparseArray<>();
    public final SparseArray<YSA> LIZJ = new SparseArray<>();
    public final SparseArray<YTK> LIZLLL = new SparseArray<>();
    public final TreeSet<YSA> LJ = new TreeSet<>();
    public final java.util.Map<Class<? extends YTK>, YTK> LJI = new HashMap();
    public boolean LJII = false;
    public boolean LJIIIIZZ = false;
    public final java.util.Set<Integer> LJIIIZ = new LinkedHashSet();
    public boolean LJIIJ = false;

    public final InterfaceC48221IwD LIZLLL() {
        YS3 ys3 = this.LJFF;
        if (ys3 != null) {
            return ys3.getVideoStateInquirer();
        }
        return null;
    }

    public final void LIZ(YSA ysa) {
        if (ysa == null) {
            return;
        }
        if (this.LIZJ.get(ysa.getLayerType()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("layerType:");
            LIZ.append(ysa.getLayerType());
            LIZ.append(" already exist, remove the old before adding new one! ");
            LIZ.append(hashCode());
            X1D.LIZIZ(LIZ);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("add layer:");
        LIZ2.append(C16880lQ.LJLLJ(ysa.getClass()));
        LIZ2.append(" layerType:");
        LIZ2.append(ysa.getLayerType());
        LIZ2.append(" ");
        LIZ2.append(hashCode());
        X1D.LIZIZ(LIZ2);
        this.LIZJ.put(ysa.getLayerType(), ysa);
        this.LJ.add(ysa);
        ysa.onRegister(this);
        YTK layerStateInquirer = ysa.getLayerStateInquirer();
        if (layerStateInquirer != null) {
            this.LIZLLL.put(ysa.getLayerType(), layerStateInquirer);
            ((HashMap) this.LJI).put(layerStateInquirer.getClass(), layerStateInquirer);
        }
        ArrayList<Integer> supportEvents = ysa.getSupportEvents();
        if (supportEvents != null) {
            Iterator<Integer> it = supportEvents.iterator();
            while (it.hasNext()) {
                LIZIZ(this.LIZ, it.next().intValue(), ysa);
            }
        }
        if (!this.LJII) {
            java.util.Set<Integer> activateEvents = ysa.getActivateEvents();
            if (activateEvents != null && !activateEvents.isEmpty()) {
                Iterator<Integer> it2 = activateEvents.iterator();
                while (it2.hasNext()) {
                    LIZIZ(this.LIZIZ, it2.next().intValue(), ysa);
                }
            }
            ysa.setActivated(true);
            ysa.getLayerType();
            return;
        }
        java.util.Set<Integer> activateEvents2 = ysa.getActivateEvents();
        ArrayList arrayList = null;
        if (activateEvents2 != null && !activateEvents2.isEmpty()) {
            for (Integer num : activateEvents2) {
                LIZIZ(this.LIZIZ, num.intValue(), ysa);
                if (this.LJIIIZ.contains(num)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(num);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                ysa.setActivated(true);
                ysa.onActivate(arrayList, LIZLLL());
                return;
            }
            return;
        }
        ysa.setActivated(true);
        ysa.onActivate(null, LIZLLL());
    }

    public final List<YSA> LIZJ(List<? extends YSA> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (YSA ysa : list) {
                if (ysa != null && this.LIZJ.get(ysa.getLayerType()) == null) {
                    arrayList.add(ysa);
                }
            }
        }
        return arrayList;
    }

    public final boolean LJ(YT8 yt8) {
        boolean z;
        if (yt8 == null || this.LIZ == null) {
            return false;
        }
        if (this.LJIIIZ.isEmpty() && !this.LJII) {
            Iterator<YSA> it = this.LJ.iterator();
            while (it.hasNext()) {
                YSA next = it.next();
                if (!next.isActivated()) {
                    next.setActivated(true);
                }
            }
        }
        this.LJIIIZ.add(Integer.valueOf(yt8.getType()));
        if (this.LJII) {
            TreeSet<YSA> treeSet = this.LIZIZ.get(yt8.getType());
            if (treeSet != null && !treeSet.isEmpty()) {
                TreeSet treeSet2 = new TreeSet();
                Iterator<YSA> it2 = treeSet.iterator();
                while (it2.hasNext()) {
                    YSA next2 = it2.next();
                    if (next2 != null) {
                        treeSet2.add(next2);
                    }
                }
                Iterator it3 = treeSet2.iterator();
                while (it3.hasNext()) {
                    YSA ysa = (YSA) it3.next();
                    if (!ysa.isActivated()) {
                        ysa.setActivated(true);
                        ysa.onActivate(Collections.singletonList(Integer.valueOf(yt8.getType())), LIZLLL());
                    }
                }
            }
            if (!this.LJIIJ && this.LJIIIIZZ) {
                Iterator<YSA> it4 = this.LJ.iterator();
                while (it4.hasNext()) {
                    YSA next3 = it4.next();
                    if (next3 != null && next3.getActivateEvents() == null && !next3.isActivated()) {
                        next3.setActivated(true);
                        next3.onActivate(Collections.singletonList(Integer.valueOf(yt8.getType())), LIZLLL());
                    }
                }
                this.LJIIJ = true;
            }
        }
        TreeSet<YSA> treeSet3 = this.LIZ.get(yt8.getType());
        if (treeSet3 != null && !treeSet3.isEmpty()) {
            TreeSet treeSet4 = new TreeSet();
            Iterator<YSA> it5 = treeSet3.iterator();
            while (it5.hasNext()) {
                YSA next4 = it5.next();
                if (next4 != null) {
                    treeSet4.add(next4);
                }
            }
            Iterator it6 = treeSet4.iterator();
            loop5: while (true) {
                z = false;
                while (it6.hasNext()) {
                    YSA ysa2 = (YSA) it6.next();
                    if (ysa2 instanceof YT6) {
                        if (!((YT6) ysa2).LIZJ(yt8) && !z) {
                            break;
                        }
                    } else if ((!this.LJII || ysa2.isActivated()) && (ysa2 instanceof YSB)) {
                        z = ((YSB) ysa2).LIZJ(yt8);
                    } else if (!this.LJII || ysa2.isActivated()) {
                        if (ysa2.handleVideoEvent(yt8)) {
                        }
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (yt8.getType() == 101) {
            this.LJIIIZ.clear();
            if (this.LJII && this.LJIIIIZZ) {
                Iterator<YSA> it7 = this.LJ.iterator();
                while (it7.hasNext()) {
                    YSA next5 = it7.next();
                    if (next5 != null) {
                        next5.setActivated(false);
                    }
                }
                this.LJIIJ = false;
            }
        }
        return z;
    }

    public final void LJFF(YSA ysa) {
        SparseArray<YSA> sparseArray;
        if (ysa == null || (sparseArray = this.LIZJ) == null || sparseArray.get(ysa.getLayerType()) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeLayer:");
        LIZ.append(C16880lQ.LJLLJ(ysa.getClass()));
        LIZ.append(" layerType:");
        LIZ.append(ysa.getLayerType());
        X1D.LIZIZ(LIZ);
        this.LIZJ.delete(ysa.getLayerType());
        LJI(this.LIZ, ysa);
        LJI(this.LIZIZ, ysa);
        TreeSet<YSA> treeSet = this.LJ;
        if (treeSet != null && treeSet.contains(ysa)) {
            this.LJ.remove(ysa);
            YTK ytk = this.LIZLLL.get(ysa.getLayerType());
            if (ytk != null) {
                ((HashMap) this.LJI).remove(ytk.getClass());
            }
            this.LIZLLL.remove(ysa.getLayerType());
            ysa.onUnregister(this);
        }
        ysa.setActivated(false);
    }

    public static void LJI(SparseArray sparseArray, YSA ysa) {
        if (sparseArray == null || ysa == null) {
            return;
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            if (sparseArray.valueAt(i) != null) {
                ((TreeSet) sparseArray.valueAt(i)).remove(ysa);
            }
        }
    }

    public static void LIZIZ(SparseArray sparseArray, int i, YSA ysa) {
        if (sparseArray.indexOfKey(i) >= 0) {
            ((TreeSet) sparseArray.get(i)).add(ysa);
            return;
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(ysa);
        sparseArray.put(i, treeSet);
    }
}
