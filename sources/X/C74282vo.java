package X;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.2vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74282vo implements InterfaceC74322vs {
    public final C82622Wbi LIZ;
    public final Context LIZIZ;
    public C84661XKn LIZJ;
    public final java.util.Map<String, String> LIZLLL;
    public final C62822Ol8 LJ;
    public String LJFF;

    @Override // X.InterfaceC74322vs
    public final boolean LIZIZ(String key) {
        o.LJIIIZ(key, "key");
        return this.LIZLLL.containsKey(key);
    }

    public C74282vo(Context context, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = diContainer;
        this.LIZIZ = context;
        this.LIZLLL = new LinkedHashMap();
        this.LJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 992));
        this.LJFF = "";
    }

    @Override // X.InterfaceC74322vs
    public final Object LIZ(String str, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return XKX.LJI(C36636EZk.LIZ, new C74262vm(this, str, null), interfaceC67352kd);
    }

    @Override // X.InterfaceC74322vs
    public final void LIZJ(InterfaceC70422pa coroutineScope, String key) {
        o.LJIIIZ(coroutineScope, "coroutineScope");
        o.LJIIIZ(key, "key");
        C84661XKn c84661XKn = this.LIZJ;
        if (c84661XKn != null) {
            c84661XKn.LIZIZ(null);
        }
        this.LIZJ = XKX.LIZIZ(coroutineScope, C36636EZk.LIZ, null, new C74272vn(this, key, null), 2);
    }
}
