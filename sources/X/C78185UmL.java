package X;

import com.bytedance.gift.render.model.Effect;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UmL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78185UmL {
    public final C32449CoP LIZ;
    public final C62822Ol8 LIZIZ;
    public final C77380UYm LIZJ;

    public C78185UmL(C32449CoP request) {
        C77380UYm c77380UYm;
        o.LJIIIZ(request, "request");
        this.LIZ = request;
        this.LIZIZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 359));
        Effect effect = request.LIZ;
        if (effect != null && effect.LIZJ) {
            c77380UYm = new C77380UYm(request);
        } else {
            c77380UYm = null;
        }
        this.LIZJ = c77380UYm;
    }
}
