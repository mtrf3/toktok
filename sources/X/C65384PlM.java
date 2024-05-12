package X;

import com.google.gson.a;
import com.google.gson.b;
import kotlin.jvm.internal.o;

/* renamed from: X.PlM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65384PlM implements a {
    @Override // com.google.gson.a
    public final boolean shouldSkipClass(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        return false;
    }

    @Override // com.google.gson.a
    public final boolean shouldSkipField(b bVar) {
        if (bVar.LIZ.getAnnotation(GPV.class) != null) {
            return true;
        }
        return false;
    }
}
