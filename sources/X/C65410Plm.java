package X;

import com.google.gson.a;
import com.google.gson.b;

/* renamed from: X.Plm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65410Plm implements a {
    public static final C65410Plm LIZ = new C65410Plm();

    @Override // com.google.gson.a
    public final boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    @Override // com.google.gson.a
    public final boolean shouldSkipField(b bVar) {
        if (bVar.LIZ.getAnnotation(InterfaceC37416EmK.class) != null) {
            return true;
        }
        return false;
    }
}
