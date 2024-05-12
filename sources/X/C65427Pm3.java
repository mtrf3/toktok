package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: X.Pm3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65427Pm3 {
    public Object LIZ;

    public C65427Pm3(int i) {
        if (i != 3) {
            this.LIZ = C47261Igj.LJJIJIIJI(1, 2, 3);
        }
    }

    public final TypeAdapter LIZ(TypeToken typeToken) {
        return ((Gson) this.LIZ).LJIIIZ(typeToken);
    }

    public final TypeAdapter LIZIZ(Class cls) {
        return ((Gson) this.LIZ).LJIIJ(cls);
    }

    public /* synthetic */ C65427Pm3(Object obj) {
        this.LIZ = obj;
    }
}
