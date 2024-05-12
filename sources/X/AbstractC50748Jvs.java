package X;

import com.lynx.tasm.base.TraceEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Jvs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50748Jvs {
    public boolean LIZ;
    public Object LIZIZ;

    public abstract void LJFF();

    public abstract String LJIIIIZZ();

    public final boolean LJII() {
        if (C39942Fly.LIZIZ.booleanValue()) {
            this.LIZ = true;
            return false;
        }
        TraceEvent.LIZIZ("LynxServiceProxy.ensureInitialize");
        if (this.LIZIZ == null) {
            if (this.LIZ) {
                TraceEvent.LJ("LynxServiceProxy.ensureInitialize");
                return false;
            }
            synchronized (this) {
                if (this.LIZIZ == null) {
                    try {
                        try {
                            TraceEvent.LIZIZ("LynxServiceProxy.initialize");
                            this.LIZIZ = Class.forName(LJIIIIZZ()).getDeclaredField("INSTANCE").get(null);
                        } catch (Throwable unused) {
                            this.LIZ = true;
                            this.LIZIZ = null;
                        }
                    } finally {
                        TraceEvent.LJ("LynxServiceProxy.initialize");
                    }
                }
            }
        }
        TraceEvent.LJ("LynxServiceProxy.ensureInitialize");
        if (this.LIZIZ == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ AbstractC50748Jvs() {
    }

    public /* synthetic */ AbstractC50748Jvs(AbstractC50743Jvn repo) {
        o.LJIIIZ(repo, "repo");
        this.LIZIZ = repo;
    }

    public final void LJI(EnumC50746Jvq binder) {
        o.LJIIIZ(binder, "binder");
        if (!this.LIZ) {
            this.LIZ = true;
            C50759Jw3.LIZ.add(this);
            LJFF();
        }
        AbstractC50743Jvn abstractC50743Jvn = (AbstractC50743Jvn) this.LIZIZ;
        abstractC50743Jvn.LIZ.put(binder, abstractC50743Jvn.LIZJ(binder));
    }
}
