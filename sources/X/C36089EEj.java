package X;

import Y.ARunnableS25S0200000_6;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.EEj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36089EEj {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public int LJII;
    public List<EEY>[] LIZJ = new List[EnumC36103EEx.values().length];
    public List<EEY> LIZLLL = new ArrayList();
    public List<EEY> LJ = new ArrayList();
    public java.util.Map<InterfaceC36076EDw, String[]> LJFF = new LinkedHashMap();
    public java.util.Map<String, EEY> LJI = new LinkedHashMap();
    public final boolean LJIIIIZZ = true;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        if (this.LJIIIIZZ) {
            if (((ArrayList) this.LIZLLL).isEmpty() && ((ArrayList) this.LJ).isEmpty()) {
                return;
            }
            if (this.LIZ) {
                for (Map.Entry entry : ((LinkedHashMap) this.LJFF).entrySet()) {
                    C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL((Object[]) entry.getValue());
                    int i = -1;
                    while (LJJIIJZLJL.hasNext()) {
                        EEY eey = (EEY) ((LinkedHashMap) this.LJI).get(LJJIIJZLJL.next());
                        if (eey != null) {
                            Object key = entry.getKey();
                            o.LJII(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                            int ordinal = ((EEY) key).triggerType().ordinal();
                            if (ordinal == eey.triggerType().ordinal() && ordinal == EnumC36103EEx.TASK_BACKGROUND.ordinal()) {
                                C36093EEn.LIZ.getClass();
                                InterfaceC36091EEl interfaceC36091EEl = C36093EEn.LJIILL.get(Integer.valueOf(ordinal));
                                o.LJII(interfaceC36091EEl, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.common.trigger.BackgroundTrigger");
                                C36079EDz c36079EDz = (C36079EDz) interfaceC36091EEl;
                                Object key2 = entry.getKey();
                                o.LJII(key2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                                c36079EDz.LJLIL.put(eey, key2);
                                if (((LinkedHashMap) c36079EDz.LJLILLLLZI).get(key2) == null) {
                                    c36079EDz.LJLILLLLZI.put(key2, 1);
                                } else {
                                    java.util.Map<EEY, Integer> map = c36079EDz.LJLILLLLZI;
                                    Object obj = ((LinkedHashMap) map).get(key2);
                                    o.LJI(obj);
                                    map.put(key2, Integer.valueOf(((Number) obj).intValue() + 1));
                                }
                            } else {
                                int indexOf = ((ArrayList) this.LIZLLL).indexOf(eey);
                                if (indexOf > i) {
                                    i = indexOf;
                                }
                            }
                        }
                    }
                    if (i > 0) {
                        Object key3 = entry.getKey();
                        o.LJII(key3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                        ListProtector.add(this.LIZLLL, i + 1, key3);
                    } else {
                        List<EEY> list = this.LJ;
                        Object key4 = entry.getKey();
                        o.LJII(key4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                        ((ArrayList) list).add(key4);
                    }
                }
                if (!this.LIZIZ) {
                    ((ArrayList) this.LIZLLL).addAll(0, this.LJ);
                }
                this.LJFF = new LinkedHashMap();
                this.LJI = new LinkedHashMap();
                this.LJII = 0;
            }
            if (this.LIZIZ && (!((ArrayList) this.LJ).isEmpty())) {
                int ordinal2 = ((EEY) ListProtector.get(this.LJ, 0)).triggerType().ordinal();
                C36093EEn.LIZ.getClass();
                InterfaceC36091EEl interfaceC36091EEl2 = C36093EEn.LJIILL.get(Integer.valueOf(ordinal2));
                if (interfaceC36091EEl2 != null) {
                    C38995FSd.LIZJ().execute(new ARunnableS25S0200000_6(this, interfaceC36091EEl2, 34));
                }
            }
            Iterator it = ((ArrayList) this.LIZLLL).iterator();
            while (it.hasNext()) {
                EEY eey2 = (EEY) it.next();
                int ordinal3 = eey2.triggerType().ordinal();
                C36093EEn.LIZ.getClass();
                HashMap<Integer, InterfaceC36091EEl> hashMap = C36093EEn.LJIILL;
                InterfaceC36091EEl interfaceC36091EEl3 = hashMap.get(Integer.valueOf(ordinal3));
                o.LJI(interfaceC36091EEl3);
                interfaceC36091EEl3.LJ(eey2);
                InterfaceC36091EEl interfaceC36091EEl4 = hashMap.get(Integer.valueOf(ordinal3));
                o.LJI(interfaceC36091EEl4);
                interfaceC36091EEl4.LIZJ(C47261Igj.LJII(eey2));
            }
            this.LIZLLL = new ArrayList();
            this.LJ = new ArrayList();
            return;
        }
        List<EEY>[] listArr = this.LIZJ;
        if (listArr.length == 0) {
            return;
        }
        int length = listArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            List<EEY> list2 = listArr[i2];
            int i4 = i3 + 1;
            o.LJI(list2);
            for (EEY eey3 : list2) {
                C36093EEn.LIZ.getClass();
                InterfaceC36091EEl interfaceC36091EEl5 = C36093EEn.LJIILL.get(Integer.valueOf(i3));
                o.LJI(interfaceC36091EEl5);
                interfaceC36091EEl5.LJ(eey3);
            }
            i2++;
            i3 = i4;
        }
        List<EEY>[] listArr2 = this.LIZJ;
        int length2 = listArr2.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length2) {
            List<EEY> list3 = listArr2[i5];
            int i7 = i6 + 1;
            o.LJI(list3);
            if (list3.size() > 0) {
                C36093EEn.LIZ.getClass();
                InterfaceC36091EEl interfaceC36091EEl6 = C36093EEn.LJIILL.get(Integer.valueOf(i6));
                o.LJI(interfaceC36091EEl6);
                interfaceC36091EEl6.LIZJ(list3);
            }
            i5++;
            i6 = i7;
        }
        this.LIZJ = new List[0];
    }

    public final void LIZ(EEY component) {
        o.LJIIIZ(component, "component");
        LIZIZ(component, true);
    }

    public C36089EEj(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r0 != 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.EEY r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36089EEj.LIZIZ(X.EEY, boolean):void");
    }
}
