package X;

import com.google.gson.a;
import com.google.gson.b;

/* renamed from: X.PlI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65380PlI implements a {
    @Override // com.google.gson.a
    public final boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    @Override // com.google.gson.a
    public final boolean shouldSkipField(b bVar) {
        if (bVar.LIZ.getAnnotation(InterfaceC65381PlJ.class) != null) {
            return true;
        }
        return false;
    }
}
