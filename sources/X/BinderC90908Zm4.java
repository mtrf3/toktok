package X;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.internal.zzy;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Zm4, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class BinderC90908Zm4 extends AbstractBinderC90822Zkg {
    public final AtomicReference<C90909Zm5> LJLIL;
    public final Handler LJLILLLLZI;

    @Override // X.InterfaceC90473Zf3
    public final void LJLIIIL(int i) {
    }

    @Override // X.InterfaceC90473Zf3
    public final void LLFZ(int i) {
    }

    @Override // X.InterfaceC90473Zf3
    public final void LLZLI() {
        C90909Zm5.LLIZLLLIL.getClass();
    }

    public BinderC90908Zm4(C90909Zm5 c90909Zm5) {
        this.LJLIL = new AtomicReference<>(c90909Zm5);
        this.LJLILLLLZI = new HandlerC90301ZcH(c90909Zm5.LJLJLLL);
    }

    @Override // X.InterfaceC90473Zf3
    public final void C(byte[] bArr) {
        if (this.LJLIL.get() == null) {
            return;
        }
        C90909Zm5.LLIZLLLIL.getClass();
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJIILL(int i) {
        if (this.LJLIL.get() == null) {
            return;
        }
        synchronized (C90909Zm5.LLJI) {
        }
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJIJI(int i) {
        C90909Zm5 c90909Zm5 = this.LJLIL.get();
        if (c90909Zm5 == null) {
            return;
        }
        c90909Zm5.LLILZ = null;
        c90909Zm5.LLILZIL = null;
        synchronized (C90909Zm5.LLJI) {
        }
        if (c90909Zm5.LLIIJI != null) {
            this.LJLILLLLZI.post(new RunnableC90471Zf1(c90909Zm5, i));
        }
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJIJJ(int i) {
        if (this.LJLIL.get() == null) {
            return;
        }
        synchronized (C90909Zm5.LLJI) {
        }
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJIJJLI(int i) {
        if (this.LJLIL.get() == null) {
            return;
        }
        synchronized (C90909Zm5.LLJ) {
        }
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJJIIJ(int i) {
        C90909Zm5 andSet = this.LJLIL.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.LLILLJJLI = -1;
        andSet.LLILLL = -1;
        andSet.LLIIIL = null;
        andSet.LLIIZ = null;
        andSet.LLILL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        andSet.LJJIZ();
        andSet.LLIL = false;
        andSet.LLILLIZIL = null;
        C90909Zm5.LLIZLLLIL.getClass();
        if (i != 0) {
            HandlerC67864QkG handlerC67864QkG = andSet.LJLLILLLL;
            handlerC67864QkG.sendMessage(handlerC67864QkG.obtainMessage(6, andSet.LLIFFJFJJ.get(), 2));
        }
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJLLI(long j) {
        C90909Zm5 c90909Zm5 = this.LJLIL.get();
        if (c90909Zm5 == null) {
            return;
        }
        C90909Zm5.LJJIL(c90909Zm5, j, 0);
    }

    @Override // X.InterfaceC90473Zf3
    public final void LLILLJJLI(zzy zzyVar) {
        C90909Zm5 c90909Zm5 = this.LJLIL.get();
        if (c90909Zm5 == null) {
            return;
        }
        C90909Zm5.LLIZLLLIL.getClass();
        this.LJLILLLLZI.post(new RunnableC90472Zf2(c90909Zm5, zzyVar));
    }

    @Override // X.InterfaceC90473Zf3
    public final void m0(zza zzaVar) {
        C90909Zm5 c90909Zm5 = this.LJLIL.get();
        if (c90909Zm5 == null) {
            return;
        }
        C90909Zm5.LLIZLLLIL.getClass();
        this.LJLILLLLZI.post(new RunnableC90474Zf4(c90909Zm5, zzaVar));
    }

    @Override // X.InterfaceC90473Zf3
    public final void LLJJIJIL(String str, String str2) {
        C90909Zm5 c90909Zm5 = this.LJLIL.get();
        if (c90909Zm5 == null) {
            return;
        }
        C90909Zm5.LLIZLLLIL.getClass();
        this.LJLILLLLZI.post(new RunnableC90475Zf5(c90909Zm5, str, str2));
    }

    @Override // X.InterfaceC90473Zf3
    public final void n(int i, long j) {
        C90909Zm5 c90909Zm5 = this.LJLIL.get();
        if (c90909Zm5 == null) {
            return;
        }
        C90909Zm5.LJJIL(c90909Zm5, j, i);
    }

    @Override // X.InterfaceC90473Zf3
    public final void i0(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        C90909Zm5 c90909Zm5 = this.LJLIL.get();
        if (c90909Zm5 == null) {
            return;
        }
        c90909Zm5.LLIIIL = applicationMetadata;
        c90909Zm5.LLILZ = applicationMetadata.zza;
        c90909Zm5.LLILZIL = str2;
        c90909Zm5.LLIIZ = str;
        synchronized (C90909Zm5.LLJ) {
        }
    }
}
