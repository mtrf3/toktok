package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

/* renamed from: X.EyB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38151EyB implements InterfaceC38133Ext {
    public final /* synthetic */ C38150EyA LJLIL;

    public C38151EyB(C38150EyA c38150EyA) {
        this.LJLIL = c38150EyA;
    }

    @Override // X.InterfaceC38133Ext
    public final <T> String LIZJ(T t) {
        String json = GsonProtectorUtils.toJson((Gson) this.LJLIL.LJIIJJI.getValue(), t);
        o.LJIIIIZZ(json, "gson.toJson(value)");
        return json;
    }

    @Override // X.InterfaceC38133Ext
    public final <T> T LJIIIZ(String data, Type type) {
        o.LJIIIZ(data, "data");
        return (T) GsonProtectorUtils.fromJson((Gson) this.LJLIL.LJIIJJI.getValue(), data, type);
    }
}
