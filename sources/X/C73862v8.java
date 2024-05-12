package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.j;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.2v8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73862v8 {
    public static final m LIZ = new m();

    public static final String LIZ() {
        Object LIZ2;
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            LIZ2 = LIZ;
            m mVar = (m) LIZLLL.LJIIIIZZ("push_sdk_overwrite_settings", m.class, LIZ2);
            if (mVar != null) {
                LIZ2 = mVar;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        j jVar = (j) LIZ2;
        if (jVar == null) {
            jVar = LIZ;
        }
        String jVar2 = jVar.toString();
        o.LJIIIIZZ(jVar2, "kotlin.runCatching {\n   …() ?: DEFAULT).toString()");
        return jVar2;
    }
}
