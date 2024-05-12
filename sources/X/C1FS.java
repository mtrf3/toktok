package X;

import com.bytedance.als.AlsLogicContainer;
import kotlin.jvm.internal.o;

/* renamed from: X.1FS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FS implements C0I8 {
    public final /* synthetic */ AlsLogicContainer LIZ;

    public C1FS(AlsLogicContainer alsLogicContainer) {
        this.LIZ = alsLogicContainer;
    }

    @Override // X.C0I8
    public final C29851Fd LIZ(Class<? extends C0I6> clazz) {
        C29831Fb c29831Fb;
        C0I8 c0i8;
        o.LJIIIZ(clazz, "clazz");
        Class<?> cls = this.LIZ.LJLJJLL.get(clazz);
        if (cls == null) {
            C82622Wbi c82622Wbi = this.LIZ.LJLZ;
            if (c82622Wbi == null || (c0i8 = (C0I8) c82622Wbi.LJIIIIZZ(null, C0I8.class)) == null) {
                return null;
            }
            return c0i8.LIZ(clazz);
        }
        C29841Fc c29841Fc = this.LIZ.LJLJI.get(cls);
        if (c29841Fc == null || (c29831Fb = c29841Fc.LJLJI) == null) {
            return null;
        }
        return new C29851Fd(cls, c29831Fb.LJLJI);
    }

    @Override // X.C0I8
    public final AbstractC29891Fh<?> LIZIZ(Class<? extends C0I6> clazz) {
        C0I8 c0i8;
        o.LJIIIZ(clazz, "clazz");
        AbstractC29891Fh<?> abstractC29891Fh = this.LIZ.LJLJL.get(clazz);
        if (abstractC29891Fh != null) {
            return abstractC29891Fh;
        }
        C82622Wbi c82622Wbi = this.LIZ.LJLZ;
        if (c82622Wbi == null || (c0i8 = (C0I8) c82622Wbi.LJIIIIZZ(null, C0I8.class)) == null) {
            return null;
        }
        return c0i8.LIZIZ(clazz);
    }
}
