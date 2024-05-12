package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRU implements YRK {
    public static final /* synthetic */ int LJIIJ = 0;
    public final HandlerThreadC87386YRi LIZ = new HandlerThreadC87386YRi(this);
    public final HandlerThread LIZIZ = new HandlerThread("MessagePortal-Request");
    public C32075CiN LIZJ;
    public C87392YRo LIZLLL;
    public final YRS LJ;
    public final YRW LJFF;
    public final YRR LJI;
    public MessageMonitor LJII;
    public final C87388YRk LJIIIIZZ;
    public final List<YRT> LJIIIZ;

    @Override // X.YRK
    public final MessageMonitor LIZJ() {
        MessageMonitor messageMonitor = this.LJII;
        if (messageMonitor != null) {
            return messageMonitor;
        }
        o.LJIJI("monitor");
        throw null;
    }

    public final C87392YRo LJIIIIZZ() {
        C87392YRo c87392YRo = this.LIZLLL;
        if (c87392YRo != null) {
            return c87392YRo;
        }
        o.LJIJI("portalContext");
        throw null;
    }

    public YRU() {
        YRS yrs = new YRS();
        this.LJ = yrs;
        YRW yrw = new YRW(this);
        this.LJFF = yrw;
        YRR yrr = new YRR(this);
        this.LJI = yrr;
        C87388YRk c87388YRk = new C87388YRk();
        this.LJIIIIZZ = c87388YRk;
        this.LJIIIZ = C47261Igj.LJJIJIL(yrs, yrr, yrw, c87388YRk);
    }

    public final void LJIIJ() {
        LIZJ().log("MessagePortal", "startMessage");
        if ((this.LJIIIIZZ.LJIIIZ(EnumC87389YRl.INITED) || this.LJIIIIZZ.LJIIIZ(EnumC87389YRl.READY) || this.LJIIIIZZ.LJIIIZ(EnumC87389YRl.STOPED) || this.LJIIIIZZ.LJIIIZ(EnumC87389YRl.RELEASED)) && this.LIZ.getLooper() != null) {
            Iterator<YRT> it = this.LJIIIZ.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
        }
    }

    @Override // X.YRK
    public final C87392YRo context() {
        return LJIIIIZZ();
    }

    @Override // X.YRK
    public final C87388YRk LIZIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.YRK
    public final YRW LJFF() {
        return this.LJFF;
    }

    @Override // X.YRK
    public final YRS LJI() {
        return this.LJ;
    }

    @Override // X.YRK
    public final Handler LIZ(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15) {
        return new Handler(this.LIZIZ.getLooper(), iDCallbackS369S0100000_15);
    }

    @Override // X.YRK
    public final Handler LIZLLL(Handler.Callback callback) {
        return new Handler(this.LIZ.getLooper(), callback);
    }

    @Override // X.YRK
    public final Handler LJ(Handler.Callback callback) {
        return new Handler(C16880lQ.LLJJJJ(), callback);
    }

    public final void LJII(C32075CiN configuration) {
        long j;
        IMessageWsClient iMessageWsClient;
        o.LJIIIZ(configuration, "configuration");
        this.LIZJ = configuration;
        C32077CiP c32077CiP = configuration.LIZJ;
        this.LJII = new MessageMonitor(new YMB(c32077CiP.LJLIL, c32077CiP.LJLILLLLZI, c32077CiP.LJLJI));
        this.LIZLLL = new C87392YRo(this);
        C87392YRo LJIIIIZZ = LJIIIIZZ();
        YRJ yrj = configuration.LIZIZ.LIZJ;
        if (yrj != null && (iMessageWsClient = yrj.LJLIL) != null) {
            j = iMessageWsClient.getRoomId();
        } else {
            j = 0;
        }
        LJIIIIZZ.LIZJ = j;
        Iterator<YRT> it = this.LJIIIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(configuration);
        }
        if (this.LIZ.getLooper() != null) {
            Iterator<YRT> it2 = this.LJIIIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
        if (this.LIZIZ.getLooper() == null) {
            this.LIZIZ.start();
        }
        if (this.LIZ.getLooper() == null) {
            this.LIZ.start();
        }
        LIZJ().log("MessagePortal", "createMessage");
    }

    public final void LJIIIZ(IMessage message, boolean z) {
        o.LJIIIZ(message, "message");
        LIZJ().log("MessagePortal", "insertMessage");
        YRW yrw = this.LJFF;
        yrw.getClass();
        if (z) {
            yrw.LJIIIZ(message, false);
        } else {
            yrw.LJIIL(message, false);
        }
        if (yrw.LJJ) {
            YRX yrx = yrw.LJIL;
            yrx.getClass();
            C87390YRm c87390YRm = new C87390YRm(message, false, true, z);
            synchronized (yrx) {
                ListProtector.add(yrx.LJ, 0, c87390YRm);
            }
            yrx.LIZLLL.sendEmptyMessage(301);
        }
    }
}
