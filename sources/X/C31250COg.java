package X;

import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.COg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31250COg<T> implements InterfaceC31253COj {
    public static final C31250COg<T> LIZ = new C31250COg<>();

    @Override // X.InterfaceC31253COj
    public final Object LIZ(android.net.Uri uri, String key, String str) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(key, "key");
        try {
            return new JSONArray(str);
        } catch (Exception unused) {
            return new JSONArray();
        }
    }
}
