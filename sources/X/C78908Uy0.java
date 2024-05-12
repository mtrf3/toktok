package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Uy0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78908Uy0 {
    public final java.util.Map<String, List<InterfaceC78911Uy3>> LIZ = new HashMap();

    public final List<InterfaceC78911Uy3> LIZ(String str) {
        List<InterfaceC78911Uy3> list = (List) ((HashMap) this.LIZ).get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            ((HashMap) this.LIZ).put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    public final void LIZIZ(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            Iterator<InterfaceC78911Uy3> it = LIZ(str).iterator();
            while (it.hasNext()) {
                it.next().LIZJ();
            }
        }
    }

    public final void LIZJ(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            Iterator<InterfaceC78911Uy3> it = LIZ(str).iterator();
            while (it.hasNext()) {
                it.next().LIZIZ();
            }
        }
    }

    public final void LIZLLL(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            Iterator<InterfaceC78911Uy3> it = LIZ(str).iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
    }

    public final void LJ(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            Iterator<InterfaceC78911Uy3> it = LIZ(str).iterator();
            while (it.hasNext()) {
                it.next().LIZLLL();
            }
        }
    }
}
