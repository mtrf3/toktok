package X;

import Y.ARunnableS45S0100000_9;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.jvm.internal.o;

/* renamed from: X.Mq4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58032Mq4 implements InterfaceC57960Mou {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public C58033Mq5 LJ;
    public C58033Mq5 LJFF;
    public EnumC41264GHk LJI;
    public boolean LJII;
    public long LJIIIIZZ;

    @Override // X.InterfaceC57960Mou
    public final void LIZ() {
        if (this.LJII) {
            return;
        }
        C58033Mq5 c58033Mq5 = new C58033Mq5("", 2);
        c58033Mq5.start();
        this.LJFF = c58033Mq5;
    }

    @Override // X.InterfaceC57960Mou
    public final void LIZIZ() {
        if (this.LJII) {
            return;
        }
        C58033Mq5 c58033Mq5 = new C58033Mq5("", 2);
        c58033Mq5.start();
        this.LJ = c58033Mq5;
        this.LJI = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
    }

    @Override // X.InterfaceC57960Mou
    public final void LIZJ(AbstractC57774Mlu<?> result) {
        o.LJIIIZ(result, "result");
        if (this.LJII) {
            return;
        }
        this.LJII = true;
        C58033Mq5 c58033Mq5 = this.LJ;
        if (c58033Mq5 != null) {
            c58033Mq5.stop();
            long j = c58033Mq5.LIZJ - c58033Mq5.LIZIZ;
            C58033Mq5 c58033Mq52 = this.LJFF;
            if (c58033Mq52 != null) {
                c58033Mq52.stop();
                C38995FSd.LIZJ().execute(new ARunnableS45S0100000_9((Object) new C58031Mq3(result, this, j, c58033Mq52.LIZJ - c58033Mq52.LIZIZ), 229));
            }
        }
    }

    @Override // X.InterfaceC57960Mou
    public final void LIZLLL(long j) {
        if (this.LJII) {
            return;
        }
        this.LJIIIIZZ = j;
    }

    public C58032Mq4(String str, String str2, String str3) {
        HH1.LIZ(str, "enterFrom", str2, "enterMethod", str3, "sceneType");
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJIIIIZZ = -1L;
    }
}
