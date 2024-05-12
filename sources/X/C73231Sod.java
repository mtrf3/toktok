package X;

import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.Sod, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73231Sod<T> {
    public final Executor LIZ;
    public int LIZIZ;
    public List<? extends T> LIZJ;
    public final C0AK LIZLLL;
    public final C73246Sos<T> LJ;
    public final C60930Nvi LJFF;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C73231Sod(AbstractC029409q adapter, C73262Sp8 c73262Sp8) {
        this(new C28811Bd(adapter), new C73246Sos(new C73248Sou(c73262Sp8).LIZ, null), null);
        o.LJIIJ(adapter, "adapter");
    }

    public final T LIZ(int i, boolean z) {
        C60930Nvi c60930Nvi;
        List<? extends T> list = this.LIZJ;
        if (i >= list.size() || i < 0) {
            return null;
        }
        if (z && (c60930Nvi = this.LJFF) != null && c60930Nvi.LIZIZ) {
            c60930Nvi.LIZ.zB(c60930Nvi.LIZJ + i);
        }
        return (T) ListProtector.get(list, i);
    }

    public C73231Sod(C0AK c0ak, C73246Sos<T> mConfig, C60930Nvi c60930Nvi) {
        o.LJIIJ(mConfig, "mConfig");
        this.LIZLLL = c0ak;
        this.LJ = mConfig;
        this.LJFF = c60930Nvi;
        Executor executor = mConfig.LIZJ;
        this.LIZ = executor == null ? new Executor() { // from class: X.2NT
            public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.LJLIL.post(runnable);
            }
        } : executor;
        this.LIZJ = C61878OQg.INSTANCE;
    }
}
