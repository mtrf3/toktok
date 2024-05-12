package X;

import Y.IDHandlerS21S0100000_8;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.IcY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47002IcY {
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJII;
    public IXC LJIIJJI;
    public float LIZ = -1.0f;
    public float LIZIZ = -1.0f;
    public float LJFF = 1.0f;
    public final C47404Ij2 LJI = C47404Ij2.LJIIIIZZ.getValue();
    public final C47001IcX LJIIIIZZ = new C47001IcX(this);
    public final WeakReference<B91> LJIIIZ = new WeakReference<>(new C47003IcZ(this));
    public final Handler LJIIJ = new Handler(C16880lQ.LLJJJJ());

    public final void LIZ() {
        if (this.LIZLLL && IXN.LIZJ.getAutoAudioFocus() && !this.LIZJ) {
            C47404Ij2 c47404Ij2 = this.LJI;
            o.LJI(c47404Ij2);
            C47001IcX c47001IcX = this.LJIIIIZZ;
            Handler handler = this.LJIIJ;
            if (c47404Ij2.LIZ == null) {
                HandlerThread handlerThread = new HandlerThread("SimAudioFocusManager");
                handlerThread.start();
                c47404Ij2.LIZ = new IDHandlerS21S0100000_8(c47404Ij2, handlerThread.getLooper(), 0);
            }
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = new C47403Ij1(2, this, c47001IcX, handler);
            IDHandlerS21S0100000_8 iDHandlerS21S0100000_8 = c47404Ij2.LIZ;
            o.LJI(iDHandlerS21S0100000_8);
            iDHandlerS21S0100000_8.sendMessage(obtain);
            this.LJII = false;
            this.LIZ = -1.0f;
            this.LIZIZ = -1.0f;
        }
    }

    public final void LIZJ() {
        if (!this.LIZLLL || !IXN.LIZJ.getAutoAudioFocus() || this.LIZJ || this.LJII) {
            return;
        }
        C47404Ij2 c47404Ij2 = this.LJI;
        o.LJI(c47404Ij2);
        C47001IcX c47001IcX = this.LJIIIIZZ;
        Handler handler = this.LJIIJ;
        if (c47404Ij2.LIZ == null) {
            HandlerThread handlerThread = new HandlerThread("SimAudioFocusManager");
            handlerThread.start();
            c47404Ij2.LIZ = new IDHandlerS21S0100000_8(c47404Ij2, handlerThread.getLooper(), 0);
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = new C47403Ij1(1, this, c47001IcX, handler);
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8 = c47404Ij2.LIZ;
        o.LJI(iDHandlerS21S0100000_8);
        iDHandlerS21S0100000_8.sendMessage(obtain);
    }

    public final void LIZIZ(IXC playSessionManager) {
        B93 b93;
        o.LJIIIZ(playSessionManager, "playSessionManager");
        if (this.LJIIJJI == null) {
            this.LJIIJJI = playSessionManager;
            Object value = IZ8.LJJIL.getValue();
            o.LJIIIIZZ(value, "<get-ENABLE_AUDIO_FOCUS_WHEN_PLAY>(...)");
            this.LIZLLL = ((Boolean) value).booleanValue();
            Object value2 = IZ8.LJJIZ.getValue();
            o.LJIIIIZZ(value2, "<get-downVolumeOnAudioFocusLoss>(...)");
            this.LJ = ((Boolean) value2).booleanValue();
            Object value3 = IZ8.LJJJI.getValue();
            o.LJIIIIZZ(value3, "<get-downVolumePercentOnAudioFocusLoss>(...)");
            this.LJFF = ((Number) value3).floatValue();
            if (!this.LIZLLL || (b93 = C30591Hz.LJLIL) == null) {
                return;
            }
            ((CopyOnWriteArrayList) ((B92) b93).LIZ).add(this.LJIIIZ);
        }
    }
}
