package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1HD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HD implements C0WH {
    public static final C1HD LIZ = new C1HD();
    public static String LIZIZ;
    public static C1HC LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0WD, X.1HC] */
    public static final void LIZIZ() {
        ?? r1 = new C0WD() { // from class: X.1HC
            @Override // X.C0WD
            public final void Z00(LiveEffect liveEffect, String str, boolean z) {
                o.LJ(str, C0TY.LIZIZ);
            }
        };
        C12890ez.LIZ().LJIIIZ(r1);
        LIZJ = r1;
    }

    public static LiveEffect LIZ(List effectList) {
        o.LJIIIZ(effectList, "effectList");
        Object obj = null;
        if (LIZIZ == null) {
            return null;
        }
        Iterator it = effectList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (o.LJ(((LiveEffect) next).getResourceId(), LIZIZ)) {
                obj = next;
                break;
            }
        }
        return (LiveEffect) obj;
    }
}
