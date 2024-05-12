package X;

import Y.AfS18S0001000_6;
import Y.AfS39S0000000_10;
import Y.IDhS103S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Nen, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59881Nen {
    public static final C59881Nen LJ = new C59881Nen();
    public final C59882Neo LIZ = new C59882Neo();
    public final C73318Sq2 LIZIZ = new C73318Sq2();
    public C59349NQz LIZJ;
    public boolean LIZLLL;

    public final void LIZIZ() {
        this.LIZLLL = false;
        C59882Neo c59882Neo = this.LIZ;
        c59882Neo.LJ = null;
        c59882Neo.LJFF = false;
        c59882Neo.LIZ.clear();
        c59882Neo.LIZIZ.clear();
        c59882Neo.LIZJ.clear();
        c59882Neo.LIZLLL.clear();
        C40445Fu5.LIZIZ.LIZ.clear();
        this.LIZIZ.LIZLLL();
    }

    public final void LIZ() {
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            this.LIZIZ.LIZ(AbstractC73672Svk.LJJIJIIJI(200L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new IDhS103S0100000_10(this, 4)).LJJJ(T16.LIZ()).LJJIJL(new C59994Ngc()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS18S0001000_6(1, 1), new AfS39S0000000_10(1)));
        }
    }

    public final void LIZJ(View view, C59885Ner c59885Ner) {
        EnumC59883Nep enumC59883Nep;
        C59993Ngb c59993Ngb;
        if (!NR1.LIZ(view)) {
            return;
        }
        C59882Neo c59882Neo = this.LIZ;
        if (c59882Neo.LIZJ.contains(view)) {
            enumC59883Nep = EnumC59883Nep.PARENT_VIEW;
        } else if (c59882Neo.LJFF) {
            enumC59883Nep = EnumC59883Nep.OBSTRUCTION_VIEW;
        } else {
            enumC59883Nep = EnumC59883Nep.UNDERLYING_VIEW;
        }
        if (enumC59883Nep == EnumC59883Nep.UNDERLYING_VIEW) {
            return;
        }
        int i = 0;
        boolean z = true;
        if (this.LIZ.LIZ.containsKey(view)) {
            this.LIZ.LJFF = true;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            c59885Ner.LIZLLL = new C59993Ngb(i2, iArr[1], view.getWidth() + i2, view.getHeight() + iArr[1], String.valueOf(view.getId()));
            return;
        }
        EnumC59883Nep enumC59883Nep2 = EnumC59883Nep.PARENT_VIEW;
        if (enumC59883Nep != enumC59883Nep2) {
            if (!this.LIZ.LIZIZ.containsKey(view)) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                int i3 = iArr2[0];
                c59993Ngb = new C59993Ngb(i3, iArr2[1], view.getWidth() + i3, view.getHeight() + iArr2[1], String.valueOf(view.getId()));
                c59885Ner.LJ.add(c59993Ngb);
            } else {
                c59993Ngb = new C59993Ngb(0, 0, 0, 0, "");
            }
            C59993Ngb c59993Ngb2 = c59885Ner.LIZLLL;
            if (c59993Ngb2 != null && c59993Ngb.LIZIZ(c59993Ngb2).LIZ() == 0 && (view instanceof ViewGroup) && ((ViewGroup) view).getClipChildren()) {
                return;
            }
        }
        if (enumC59883Nep != enumC59883Nep2) {
            z = false;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (z) {
            HashMap hashMap = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get(it.next())).iterator();
                while (it2.hasNext()) {
                    LIZJ((View) it2.next(), c59885Ner);
                }
            }
            return;
        }
        while (i < viewGroup.getChildCount()) {
            LIZJ(viewGroup.getChildAt(i), c59885Ner);
            i++;
        }
    }
}
