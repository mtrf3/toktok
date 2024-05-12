package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.QsV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68375QsV implements Iterable, InterfaceC68379QsZ, InterfaceC68406Qt0 {
    public final SortedMap LJLIL;
    public final java.util.Map LJLILLLLZI;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C68374QsU(this);
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LIZLLL() {
        C68375QsV c68375QsV = new C68375QsV();
        for (Map.Entry entry : ((TreeMap) this.LJLIL).entrySet()) {
            if (entry.getValue() instanceof InterfaceC68406Qt0) {
                ((TreeMap) c68375QsV.LJLIL).put(entry.getKey(), entry.getValue());
            } else {
                ((TreeMap) c68375QsV.LJLIL).put(entry.getKey(), ((InterfaceC68379QsZ) entry.getValue()).LIZLLL());
            }
        }
        return c68375QsV;
    }

    @Override // X.InterfaceC68379QsZ
    public final Double LJI() {
        if (((TreeMap) this.LJLIL).size() == 1) {
            return LJIIZILJ(0).LJI();
        }
        if (((TreeMap) this.LJLIL).size() <= 0) {
            return Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // X.InterfaceC68379QsZ
    public final String LJII() {
        return LJIJ(",");
    }

    @Override // X.InterfaceC68379QsZ
    public final Iterator LJIIJ() {
        return new C68397Qsr(((TreeMap) this.LJLIL).keySet().iterator(), ((TreeMap) this.LJLILLLLZI).keySet().iterator());
    }

    public final int LJIILLIIL() {
        if (this.LJLIL.isEmpty()) {
            return 0;
        }
        return ((Integer) ((TreeMap) this.LJLIL).lastKey()).intValue() + 1;
    }

    public final Iterator LJIJJLI() {
        return ((TreeMap) this.LJLIL).keySet().iterator();
    }

    public final List LJIL() {
        ArrayList arrayList = new ArrayList(LJIILLIIL());
        for (int i = 0; i < LJIILLIIL(); i++) {
            arrayList.add(LJIIZILJ(i));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode() * 31;
    }

    public final String toString() {
        return LJIJ(",");
    }

    public C68375QsV() {
        this.LJLIL = new TreeMap();
        this.LJLILLLLZI = new TreeMap();
    }

    @Override // X.InterfaceC68379QsZ
    public final Boolean LIZJ() {
        return Boolean.TRUE;
    }

    public C68375QsV(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                LJJIFFI(i, (InterfaceC68379QsZ) ListProtector.get(list, i));
            }
        }
    }

    @Override // X.InterfaceC68406Qt0
    public final boolean LJFF(String str) {
        if ("length".equals(str) || ((TreeMap) this.LJLILLLLZI).containsKey(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC68406Qt0
    public final InterfaceC68379QsZ LJIIIZ(String str) {
        InterfaceC68379QsZ interfaceC68379QsZ;
        if ("length".equals(str)) {
            return new C68366QsM(Double.valueOf(LJIILLIIL()));
        }
        if (LJFF(str) && (interfaceC68379QsZ = (InterfaceC68379QsZ) ((TreeMap) this.LJLILLLLZI).get(str)) != null) {
            return interfaceC68379QsZ;
        }
        return InterfaceC68379QsZ.LJIIJ;
    }

    public final InterfaceC68379QsZ LJIIZILJ(int i) {
        if (i < LJIILLIIL()) {
            if (LJJII(i)) {
                InterfaceC68379QsZ interfaceC68379QsZ = (InterfaceC68379QsZ) ((TreeMap) this.LJLIL).get(Integer.valueOf(i));
                if (interfaceC68379QsZ != null) {
                    return interfaceC68379QsZ;
                }
            }
            return InterfaceC68379QsZ.LJIIJ;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String LJIJ(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.LJLIL.isEmpty()) {
            for (int i = 0; i < LJIILLIIL(); i++) {
                InterfaceC68379QsZ LJIIZILJ = LJIIZILJ(i);
                sb.append(str);
                if (!(LJIIZILJ instanceof C68371QsR) && !(LJIIZILJ instanceof C68367QsN)) {
                    sb.append(LJIIZILJ.LJII());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void LJJI(int i) {
        int intValue = ((Integer) ((TreeMap) this.LJLIL).lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        ((TreeMap) this.LJLIL).remove(Integer.valueOf(i));
        if (i == intValue) {
            SortedMap sortedMap = this.LJLIL;
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (!((TreeMap) sortedMap).containsKey(valueOf) && i2 >= 0) {
                ((TreeMap) this.LJLIL).put(valueOf, InterfaceC68379QsZ.LJIIJ);
                return;
            }
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) ((TreeMap) this.LJLIL).lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.LJLIL;
            Integer valueOf2 = Integer.valueOf(i);
            Object obj = ((TreeMap) sortedMap2).get(valueOf2);
            if (obj != null) {
                ((TreeMap) this.LJLIL).put(Integer.valueOf(i - 1), obj);
                ((TreeMap) this.LJLIL).remove(valueOf2);
            }
        }
    }

    public final boolean LJJII(int i) {
        if (i >= 0 && i <= ((Integer) ((TreeMap) this.LJLIL).lastKey()).intValue()) {
            return ((TreeMap) this.LJLIL).containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(C64.LIZIZ("Out of bounds index: ", i));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C68375QsV)) {
            return false;
        }
        C68375QsV c68375QsV = (C68375QsV) obj;
        if (LJIILLIIL() != c68375QsV.LJIILLIIL()) {
            return false;
        }
        if (this.LJLIL.isEmpty()) {
            return c68375QsV.LJLIL.isEmpty();
        }
        for (int intValue = ((Integer) ((TreeMap) this.LJLIL).firstKey()).intValue(); intValue <= ((Integer) ((TreeMap) this.LJLIL).lastKey()).intValue(); intValue++) {
            if (!LJIIZILJ(intValue).equals(c68375QsV.LJIIZILJ(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC68406Qt0
    public final void LJIIIIZZ(String str, InterfaceC68379QsZ interfaceC68379QsZ) {
        if (interfaceC68379QsZ == null) {
            ((TreeMap) this.LJLILLLLZI).remove(str);
        } else {
            ((TreeMap) this.LJLILLLLZI).put(str, interfaceC68379QsZ);
        }
    }

    public final void LJJIFFI(int i, InterfaceC68379QsZ interfaceC68379QsZ) {
        if (i <= 32468) {
            if (i >= 0) {
                if (interfaceC68379QsZ == null) {
                    ((TreeMap) this.LJLIL).remove(Integer.valueOf(i));
                    return;
                } else {
                    ((TreeMap) this.LJLIL).put(Integer.valueOf(i), interfaceC68379QsZ);
                    return;
                }
            }
            throw new IndexOutOfBoundsException(C64.LIZIZ("Out of bounds index: ", i));
        }
        throw new IllegalStateException("Array too large");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LJIILJJIL(String str, C68377QsX c68377QsX, List list) {
        char c;
        AbstractC68364QsK abstractC68364QsK;
        double min;
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            switch (str.hashCode()) {
                case -1776922004:
                    if (str.equals("toString")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1274492040:
                    if (str.equals("filter")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -934873754:
                    if (str.equals("reduce")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -895859076:
                    if (str.equals("splice")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -678635926:
                    if (str.equals("forEach")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -277637751:
                    if (str.equals("unshift")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 107868:
                    if (str.equals("map")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 111185:
                    if (str.equals("pop")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3267882:
                    if (str.equals("join")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3452698:
                    if (str.equals("push")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3536116:
                    if (str.equals("some")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 3536286:
                    if (str.equals("sort")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 96891675:
                    if (str.equals("every")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109407362:
                    if (str.equals("shift")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1099846370:
                    if (str.equals("reverse")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            InterfaceC68379QsZ interfaceC68379QsZ = InterfaceC68379QsZ.LJIIJ;
            String str2 = ",";
            double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            switch (c) {
                case 0:
                    InterfaceC68379QsZ LIZLLL = LIZLLL();
                    ArrayList arrayList = (ArrayList) list;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) it.next());
                            if (!(LIZIZ instanceof C68381Qsb)) {
                                C68375QsV c68375QsV = (C68375QsV) LIZLLL;
                                int LJIILLIIL = c68375QsV.LJIILLIIL();
                                if (LIZIZ instanceof C68375QsV) {
                                    C68375QsV c68375QsV2 = (C68375QsV) LIZIZ;
                                    Iterator LJIJJLI = c68375QsV2.LJIJJLI();
                                    while (LJIJJLI.hasNext()) {
                                        Integer num = (Integer) LJIJJLI.next();
                                        c68375QsV.LJJIFFI(num.intValue() + LJIILLIIL, c68375QsV2.LJIIZILJ(num.intValue()));
                                    }
                                } else {
                                    c68375QsV.LJJIFFI(LJIILLIIL, LIZIZ);
                                }
                            } else {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                        }
                        return LIZLLL;
                    }
                    return LIZLLL;
                case 1:
                    C68368QsO.LJII(1, "every", list);
                    InterfaceC68379QsZ LIZIZ2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    if (LIZIZ2 instanceof C68378QsY) {
                        if (LJIILLIIL() == 0) {
                            return InterfaceC68379QsZ.LJIILL;
                        }
                        if (TMC.LJJIJL(this, c68377QsX, (C68378QsY) LIZIZ2, Boolean.FALSE, Boolean.TRUE).LJIILLIIL() != LJIILLIIL()) {
                            return InterfaceC68379QsZ.LJIILLIIL;
                        }
                        return InterfaceC68379QsZ.LJIILL;
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                case 2:
                    C68368QsO.LJII(1, "filter", list);
                    InterfaceC68379QsZ LIZIZ3 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    if (LIZIZ3 instanceof C68378QsY) {
                        if (((TreeMap) this.LJLIL).size() == 0) {
                            return new C68375QsV();
                        }
                        InterfaceC68379QsZ LIZLLL2 = LIZLLL();
                        C68375QsV LJJIJL = TMC.LJJIJL(this, c68377QsX, (C68378QsY) LIZIZ3, null, Boolean.TRUE);
                        C68375QsV c68375QsV3 = new C68375QsV();
                        Iterator LJIJJLI2 = LJJIJL.LJIJJLI();
                        while (LJIJJLI2.hasNext()) {
                            c68375QsV3.LJJIFFI(c68375QsV3.LJIILLIIL(), ((C68375QsV) LIZLLL2).LJIIZILJ(((Integer) LJIJJLI2.next()).intValue()));
                        }
                        return c68375QsV3;
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                case 3:
                    C68368QsO.LJII(1, "forEach", list);
                    InterfaceC68379QsZ LIZIZ4 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    if (LIZIZ4 instanceof C68378QsY) {
                        if (((TreeMap) this.LJLIL).size() != 0) {
                            TMC.LJJIJL(this, c68377QsX, (C68378QsY) LIZIZ4, null, null);
                            return interfaceC68379QsZ;
                        }
                        return interfaceC68379QsZ;
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                case 4:
                    C68368QsO.LJIIIZ(2, "indexOf", list);
                    ArrayList arrayList2 = (ArrayList) list;
                    if (!arrayList2.isEmpty()) {
                        interfaceC68379QsZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    }
                    if (arrayList2.size() > 1) {
                        double LIZ = C68368QsO.LIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue());
                        if (LIZ >= LJIILLIIL()) {
                            return new C68366QsM(Double.valueOf(-1.0d));
                        }
                        if (LIZ < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                            d = LJIILLIIL() + LIZ;
                        } else {
                            d = LIZ;
                        }
                    }
                    Iterator LJIJJLI3 = LJIJJLI();
                    while (LJIJJLI3.hasNext()) {
                        int intValue = ((Integer) LJIJJLI3.next()).intValue();
                        double d2 = intValue;
                        if (d2 >= d && C68368QsO.LJIIJJI(LJIIZILJ(intValue), interfaceC68379QsZ)) {
                            return new C68366QsM(Double.valueOf(d2));
                        }
                    }
                    return new C68366QsM(Double.valueOf(-1.0d));
                case 5:
                    C68368QsO.LJIIIZ(1, "join", list);
                    if (LJIILLIIL() == 0) {
                        return InterfaceC68379QsZ.LJIIZILJ;
                    }
                    if (!((ArrayList) list).isEmpty()) {
                        InterfaceC68379QsZ LIZIZ5 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                        if ((LIZIZ5 instanceof C68367QsN) || (LIZIZ5 instanceof C68371QsR)) {
                            str2 = "";
                        } else {
                            str2 = LIZIZ5.LJII();
                        }
                    }
                    return new C68376QsW(LJIJ(str2));
                case 6:
                    C68368QsO.LJIIIZ(2, "lastIndexOf", list);
                    ArrayList arrayList3 = (ArrayList) list;
                    if (!arrayList3.isEmpty()) {
                        interfaceC68379QsZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    }
                    double LJIILLIIL2 = LJIILLIIL() - 1;
                    if (arrayList3.size() > 1) {
                        InterfaceC68379QsZ LIZIZ6 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                        LJIILLIIL2 = Double.isNaN(LIZIZ6.LJI().doubleValue()) ? LJIILLIIL() - 1 : C68368QsO.LIZ(LIZIZ6.LJI().doubleValue());
                        if (LJIILLIIL2 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                            LJIILLIIL2 += LJIILLIIL();
                        }
                    }
                    if (LJIILLIIL2 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        return new C68366QsM(Double.valueOf(-1.0d));
                    }
                    for (int min2 = (int) Math.min(LJIILLIIL(), LJIILLIIL2); min2 >= 0; min2--) {
                        if (LJJII(min2) && C68368QsO.LJIIJJI(LJIIZILJ(min2), interfaceC68379QsZ)) {
                            return new C68366QsM(Double.valueOf(min2));
                        }
                    }
                    return new C68366QsM(Double.valueOf(-1.0d));
                case 7:
                    C68368QsO.LJII(1, "map", list);
                    InterfaceC68379QsZ LIZIZ7 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    if (LIZIZ7 instanceof C68378QsY) {
                        if (LJIILLIIL() == 0) {
                            return new C68375QsV();
                        }
                        return TMC.LJJIJL(this, c68377QsX, (C68378QsY) LIZIZ7, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                case '\b':
                    C68368QsO.LJII(0, "pop", list);
                    int LJIILLIIL3 = LJIILLIIL();
                    if (LJIILLIIL3 != 0) {
                        int i = LJIILLIIL3 - 1;
                        InterfaceC68379QsZ LJIIZILJ = LJIIZILJ(i);
                        LJJI(i);
                        return LJIIZILJ;
                    }
                    return interfaceC68379QsZ;
                case '\t':
                    ArrayList arrayList4 = (ArrayList) list;
                    if (!arrayList4.isEmpty()) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            LJJIFFI(LJIILLIIL(), c68377QsX.LIZIZ((InterfaceC68379QsZ) it2.next()));
                        }
                    }
                    return new C68366QsM(Double.valueOf(LJIILLIIL()));
                case '\n':
                    return TMC.LJJIJLIJ(this, c68377QsX, list, true);
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    return TMC.LJJIJLIJ(this, c68377QsX, list, false);
                case '\f':
                    C68368QsO.LJII(0, "reverse", list);
                    int LJIILLIIL4 = LJIILLIIL();
                    if (LJIILLIIL4 != 0) {
                        for (int i2 = 0; i2 < LJIILLIIL4 / 2; i2++) {
                            if (LJJII(i2)) {
                                InterfaceC68379QsZ LJIIZILJ2 = LJIIZILJ(i2);
                                LJJIFFI(i2, null);
                                int i3 = (LJIILLIIL4 - 1) - i2;
                                if (LJJII(i3)) {
                                    LJJIFFI(i2, LJIIZILJ(i3));
                                }
                                LJJIFFI(i3, LJIIZILJ2);
                            }
                        }
                        break;
                    }
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    C68368QsO.LJII(0, "shift", list);
                    if (LJIILLIIL() != 0) {
                        InterfaceC68379QsZ LJIIZILJ3 = LJIIZILJ(0);
                        LJJI(0);
                        return LJIIZILJ3;
                    }
                    return interfaceC68379QsZ;
                case 14:
                    C68368QsO.LJIIIZ(2, "slice", list);
                    ArrayList arrayList5 = (ArrayList) list;
                    if (arrayList5.isEmpty()) {
                        return LIZLLL();
                    }
                    double LJIILLIIL5 = LJIILLIIL();
                    double LIZ2 = C68368QsO.LIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJI().doubleValue());
                    if (LIZ2 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        min = Math.max(LIZ2 + LJIILLIIL5, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                    } else {
                        min = Math.min(LIZ2, LJIILLIIL5);
                    }
                    if (arrayList5.size() == 2) {
                        double LIZ3 = C68368QsO.LIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue());
                        if (LIZ3 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                            LJIILLIIL5 = Math.max(LJIILLIIL5 + LIZ3, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                        } else {
                            LJIILLIIL5 = Math.min(LJIILLIIL5, LIZ3);
                        }
                    }
                    C68375QsV c68375QsV4 = new C68375QsV();
                    for (int i4 = (int) min; i4 < LJIILLIIL5; i4++) {
                        c68375QsV4.LJJIFFI(c68375QsV4.LJIILLIIL(), LJIIZILJ(i4));
                    }
                    return c68375QsV4;
                case 15:
                    C68368QsO.LJII(1, "some", list);
                    InterfaceC68379QsZ LIZIZ8 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    if (LIZIZ8 instanceof AbstractC68364QsK) {
                        if (LJIILLIIL() == 0) {
                            return InterfaceC68379QsZ.LJIILLIIL;
                        }
                        AbstractC68364QsK abstractC68364QsK2 = (AbstractC68364QsK) LIZIZ8;
                        Iterator LJIJJLI4 = LJIJJLI();
                        while (LJIJJLI4.hasNext()) {
                            int intValue2 = ((Integer) LJIJJLI4.next()).intValue();
                            if (LJJII(intValue2) && abstractC68364QsK2.LIZ(c68377QsX, Arrays.asList(LJIIZILJ(intValue2), new C68366QsM(Double.valueOf(intValue2)), this)).LIZJ().booleanValue()) {
                                return InterfaceC68379QsZ.LJIILL;
                            }
                        }
                        return InterfaceC68379QsZ.LJIILLIIL;
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    C68368QsO.LJIIIZ(1, "sort", list);
                    if (LJIILLIIL() >= 2) {
                        List LJIL = LJIL();
                        if (!((ArrayList) list).isEmpty()) {
                            InterfaceC68379QsZ LIZIZ9 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                            if (LIZIZ9 instanceof AbstractC68364QsK) {
                                abstractC68364QsK = (AbstractC68364QsK) LIZIZ9;
                            } else {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                        } else {
                            abstractC68364QsK = null;
                        }
                        Collections.sort(LJIL, new C68380Qsa(abstractC68364QsK, c68377QsX));
                        ((TreeMap) this.LJLIL).clear();
                        Iterator it3 = ((ArrayList) LJIL).iterator();
                        int i5 = 0;
                        while (it3.hasNext()) {
                            LJJIFFI(i5, (InterfaceC68379QsZ) it3.next());
                            i5++;
                        }
                        break;
                    }
                    break;
                case 17:
                    ArrayList arrayList6 = (ArrayList) list;
                    if (arrayList6.isEmpty()) {
                        return new C68375QsV();
                    }
                    int LIZ4 = (int) C68368QsO.LIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJI().doubleValue());
                    if (LIZ4 < 0) {
                        LIZ4 = Math.max(0, LJIILLIIL() + LIZ4);
                    } else if (LIZ4 > LJIILLIIL()) {
                        LIZ4 = LJIILLIIL();
                    }
                    int LJIILLIIL6 = LJIILLIIL();
                    C68375QsV c68375QsV5 = new C68375QsV();
                    if (arrayList6.size() > 1) {
                        int max = Math.max(0, (int) C68368QsO.LIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue()));
                        if (max > 0) {
                            for (int i6 = LIZ4; i6 < Math.min(LJIILLIIL6, LIZ4 + max); i6++) {
                                c68375QsV5.LJJIFFI(c68375QsV5.LJIILLIIL(), LJIIZILJ(LIZ4));
                                LJJI(LIZ4);
                            }
                        }
                        if (arrayList6.size() > 2) {
                            for (int i7 = 2; i7 < arrayList6.size(); i7++) {
                                InterfaceC68379QsZ LIZIZ10 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, i7));
                                if (!(LIZIZ10 instanceof C68381Qsb)) {
                                    int i8 = (LIZ4 + i7) - 2;
                                    if (i8 >= 0) {
                                        if (i8 >= LJIILLIIL()) {
                                            LJJIFFI(i8, LIZIZ10);
                                        } else {
                                            for (int intValue3 = ((Integer) ((TreeMap) this.LJLIL).lastKey()).intValue(); intValue3 >= i8; intValue3--) {
                                                SortedMap sortedMap = this.LJLIL;
                                                Integer valueOf = Integer.valueOf(intValue3);
                                                InterfaceC68379QsZ interfaceC68379QsZ2 = (InterfaceC68379QsZ) ((TreeMap) sortedMap).get(valueOf);
                                                if (interfaceC68379QsZ2 != null) {
                                                    LJJIFFI(intValue3 + 1, interfaceC68379QsZ2);
                                                    ((TreeMap) this.LJLIL).remove(valueOf);
                                                }
                                            }
                                            LJJIFFI(i8, LIZIZ10);
                                        }
                                    } else {
                                        throw new IllegalArgumentException(C64.LIZIZ("Invalid value index: ", i8));
                                    }
                                } else {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                            }
                            return c68375QsV5;
                        }
                        return c68375QsV5;
                    }
                    while (LIZ4 < LJIILLIIL6) {
                        c68375QsV5.LJJIFFI(c68375QsV5.LJIILLIIL(), LJIIZILJ(LIZ4));
                        LJJIFFI(LIZ4, null);
                        LIZ4++;
                    }
                    return c68375QsV5;
                case 18:
                    C68368QsO.LJII(0, "toString", list);
                    return new C68376QsW(LJIJ(","));
                case 19:
                    ArrayList arrayList7 = (ArrayList) list;
                    if (!arrayList7.isEmpty()) {
                        C68375QsV c68375QsV6 = new C68375QsV();
                        Iterator it4 = arrayList7.iterator();
                        while (it4.hasNext()) {
                            InterfaceC68379QsZ LIZIZ11 = c68377QsX.LIZIZ((InterfaceC68379QsZ) it4.next());
                            if (!(LIZIZ11 instanceof C68381Qsb)) {
                                c68375QsV6.LJJIFFI(c68375QsV6.LJIILLIIL(), LIZIZ11);
                            } else {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                        }
                        int LJIILLIIL7 = c68375QsV6.LJIILLIIL();
                        Iterator LJIJJLI5 = LJIJJLI();
                        while (LJIJJLI5.hasNext()) {
                            Integer num2 = (Integer) LJIJJLI5.next();
                            c68375QsV6.LJJIFFI(num2.intValue() + LJIILLIIL7, LJIIZILJ(num2.intValue()));
                        }
                        ((TreeMap) this.LJLIL).clear();
                        Iterator LJIJJLI6 = c68375QsV6.LJIJJLI();
                        while (LJIJJLI6.hasNext()) {
                            Integer num3 = (Integer) LJIJJLI6.next();
                            LJJIFFI(num3.intValue(), c68375QsV6.LJIIZILJ(num3.intValue()));
                        }
                    }
                    return new C68366QsM(Double.valueOf(LJIILLIIL()));
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
            return this;
        }
        return C1DH.LJJJJ(this, new C68376QsW(str), c68377QsX, list);
    }
}
