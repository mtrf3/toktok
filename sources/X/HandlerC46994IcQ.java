package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.IcQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC46994IcQ extends Handler {
    public final C47004Ica LIZ;
    public final Object LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public InterfaceC46942Iba LJII;
    public volatile boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;

    public final void LIZIZ(IX4 ix4) {
        C47004Ica c47004Ica;
        if (ix4 == null || (c47004Ica = this.LIZ) == null || c47004Ica.LJIIIZ || c47004Ica.LJIIIIZZ || c47004Ica.LJIJJLI || TextUtils.equals(ix4.LJIIIZ, this.LIZ.LIZ)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doPreRender | ");
        LIZ.append(this.LIZ);
        LIZ.append('}');
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        InterfaceC46942Iba interfaceC46942Iba = this.LJII;
        if (interfaceC46942Iba != null) {
            interfaceC46942Iba.LJJZZIII();
        }
        ix4.LJJ = true;
        this.LIZ.LJIIJ(ix4.LJJI);
        this.LIZ.LJ(ix4);
        this.LIZ.LJIJJLI = true;
    }

    public final void LIZJ(IX4 prepareData) {
        o.LJIIIZ(prepareData, "prepareData");
        if (this.LJIIIZ) {
            return;
        }
        String msg = o.LJIILLIIL(C17N.LJJLIIIJ(prepareData), "postPreRender | ");
        o.LJIIIZ(msg, "msg");
        Message obtain = Message.obtain();
        obtain.what = this.LIZLLL;
        obtain.obj = prepareData;
        sendMessage(obtain);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        IX4 ix4 = null;
        InterfaceC46942Iba interfaceC46942Iba = null;
        if (i == this.LIZJ) {
            if (this.LJIIIZ) {
                return;
            }
            synchronized (this.LIZIZ) {
                if (this.LJIIIIZZ) {
                    return;
                }
                Object obj = msg.obj;
                if (obj instanceof InterfaceC46942Iba) {
                    interfaceC46942Iba = (InterfaceC46942Iba) obj;
                }
                LIZ(interfaceC46942Iba, this.LJFF);
                return;
            }
        }
        if (i == this.LIZLLL) {
            if (this.LJIIIZ) {
                return;
            }
            synchronized (this.LIZIZ) {
                if (!this.LJIIIIZZ && !this.LIZ.LJIJJLI) {
                    if (!this.LIZ.LJIL) {
                        LIZ(this.LJII, this.LJI);
                    }
                    Object obj2 = msg.obj;
                    if (obj2 instanceof IX4) {
                        ix4 = (IX4) obj2;
                    }
                    LIZIZ(ix4);
                    return;
                }
                return;
            }
        }
        if (i == this.LJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("doRelease | ");
            LIZ.append(this.LIZ);
            LIZ.append('}');
            o.LJIIIZ(X1D.LIZIZ(LIZ), "msg");
            this.LJIIIZ = true;
            this.LIZ.LJI();
            this.LIZ.LJFF();
            removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC46994IcQ(C47004Ica playSession, Object sessionLock) {
        super(playSession.LIZLLL.getLooper());
        o.LJIIIZ(playSession, "playSession");
        o.LJIIIZ(sessionLock, "sessionLock");
        this.LIZ = playSession;
        this.LIZIZ = sessionLock;
        this.LIZJ = 1;
        this.LIZLLL = 2;
        this.LJ = 3;
        this.LJFF = 1;
        this.LJI = 2;
    }

    public final void LIZ(InterfaceC46942Iba interfaceC46942Iba, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doPreCreate | ");
        LIZ.append(this.LIZ);
        LIZ.append('}');
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        if (interfaceC46942Iba != null) {
            interfaceC46942Iba.LJJLL();
        }
        this.LIZ.LJFF.LJJLL(interfaceC46942Iba);
        this.LIZ.LIZLLL();
        Object value = IZ8.LLLII.getValue();
        o.LJIIIIZZ(value, "<get-COLD_BOOT_VIDEO_PRECREATE_DECODER>(...)");
        if (((Boolean) value).booleanValue()) {
            this.LIZ.LJ.sendEmptyMessage(20);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("doPreCreate - initDecoder | ");
            LIZ2.append(this.LIZ);
            LIZ2.append('}');
            String msg2 = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg2, "msg");
        }
        if (interfaceC46942Iba == null) {
            return;
        }
        interfaceC46942Iba.LJJZ();
    }
}
