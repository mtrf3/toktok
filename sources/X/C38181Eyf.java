package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

/* renamed from: X.Eyf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38181Eyf implements InterfaceC38133Ext {
    public final /* synthetic */ C38182Eyg LJLIL;

    public C38181Eyf(C38182Eyg c38182Eyg) {
        this.LJLIL = c38182Eyg;
    }

    @Override // X.InterfaceC38133Ext
    public final <T> String LIZJ(T t) {
        String json = GsonProtectorUtils.toJson((Gson) this.LJLIL.LJIILL.getValue(), t);
        o.LJFF(json, "gson.toJson(value)");
        return json;
    }

    @Override // X.InterfaceC38133Ext
    public final <T> T LJIIIZ(String data, Type type) {
        o.LJIIJ(data, "data");
        return (T) GsonProtectorUtils.fromJson((Gson) this.LJLIL.LJIILL.getValue(), data, type);
    }
}
