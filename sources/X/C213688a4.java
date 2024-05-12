package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8a4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213688a4 {
    public static final <R> C56412MCa<R> LIZJ() {
        C56412MCa<R> c56412MCa = new C56412MCa<>();
        c56412MCa.LIZIZ(true);
        return c56412MCa;
    }

    public static final <R> C56412MCa<R> LIZLLL() {
        C56412MCa<R> c56412MCa = new C56412MCa<>();
        c56412MCa.LIZ = true;
        return c56412MCa;
    }

    public static final <R> C56412MCa<R> LJ() {
        C56412MCa<R> c56412MCa = new C56412MCa<>();
        c56412MCa.LIZIZ(true);
        c56412MCa.LIZ = true;
        return c56412MCa;
    }

    public static final <R> C56412MCa<R> LIZIZ(boolean z) {
        C56412MCa<R> c56412MCa = new C56412MCa<>();
        c56412MCa.LIZIZ(!z);
        return c56412MCa;
    }

    public static final void LIZ(C8YM c8ym, C56412MCa target, boolean z, boolean z2) {
        ReusedAssem reusedAssem;
        Object obj;
        boolean uniqueOnlyDefault;
        o.LJIIIZ(c8ym, "<this>");
        o.LJIIIZ(target, "target");
        if (!target.LIZLLL) {
            if (z) {
                uniqueOnlyDefault = false;
            } else {
                uniqueOnlyDefault = c8ym.getUniqueOnlyDefault();
            }
            target.LIZIZ(uniqueOnlyDefault);
        }
        if (z2) {
            target.LIZ = false;
        }
        InterfaceC73396SrI interfaceC73396SrI = null;
        if (!(c8ym instanceof ReusedAssem) || (reusedAssem = (ReusedAssem) c8ym) == null) {
            return;
        }
        if (z) {
            obj = reusedAssem.LJLJLJ;
        } else {
            obj = null;
        }
        if (obj instanceof InterfaceC73396SrI) {
            interfaceC73396SrI = (InterfaceC73396SrI) obj;
        }
        target.LJI = interfaceC73396SrI;
    }
}
