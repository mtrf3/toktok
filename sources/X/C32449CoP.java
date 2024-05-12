package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.bytedance.gift.render.model.Effect;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CoP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32449CoP {
    public final Effect LIZ;
    public final int LIZIZ;
    public final C78160Ulw LIZJ;
    public final InterfaceC65784Pro<List<ImageModel>> LIZLLL;
    public final C32437CoD LJ;
    public final java.util.Map<String, String> LJFF;
    public final java.util.Map<Class<?>, Object> LJI;
    public final List<LynxGiftExtra> LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;
    public boolean LJIIJ;
    public C78217Umr LJIIJJI;
    public final boolean LJIIL;
    public int LJIILIIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request(assets=");
        LIZ.append(this.LIZ);
        LIZ.append(", source=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", monitorExtra=");
        LIZ.append(this.LIZJ);
        LIZ.append(", resLocalPath=");
        LIZ.append((String) null);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C32449CoP(C32438CoE builder) {
        o.LJIIIZ(builder, "builder");
        this.LIZ = builder.LIZJ;
        this.LIZIZ = builder.LJ;
        this.LIZJ = builder.LJFF;
        this.LIZLLL = builder.LJIIIZ;
        this.LJ = builder.LIZLLL;
        this.LJFF = builder.LJII;
        this.LJI = builder.LJIIIIZZ;
        this.LJII = builder.LJI;
        this.LJIIIIZZ = builder.LIZIZ;
        this.LJIIIZ = builder.LIZ;
        this.LJIIL = builder.LJIIJ;
    }

    public final <T> T LIZ(Class<T> cls) {
        T t = (T) ((LinkedHashMap) this.LJI).get(cls);
        if (t == null) {
            return null;
        }
        return t;
    }
}
