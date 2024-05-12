package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.IcR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC46995IcR extends Handler {
    public volatile boolean LIZ;
    public volatile C46997IcT LIZIZ;
    public volatile boolean LIZJ;
    public final /* synthetic */ C46998IcU LIZLLL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        InterfaceC46942Iba interfaceC46942Iba = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                if (this.LIZIZ != null) {
                    this.LIZIZ.LJI();
                    this.LIZIZ.LJFF();
                    this.LIZIZ = null;
                } else {
                    new HandlerC46761IWv(C16880lQ.LLJJJJ()).post(new ARunnableS44S0100000_8(this, 173));
                }
                this.LIZJ = true;
                return;
            }
            if (this.LIZJ) {
                return;
            }
            synchronized (this.LIZLLL.LJJIII) {
                if (!this.LIZ && !this.LIZLLL.LJIJJLI && (this.LIZIZ == null || !this.LIZIZ.LJIJ)) {
                    if (this.LIZIZ == null) {
                        LIZ(this.LIZLLL.LJJII, 2);
                    }
                    Object obj = message.obj;
                    if (obj instanceof IX4) {
                        IX4 ix4 = (IX4) obj;
                        LIZIZ(ix4, ix4.LIZ);
                    }
                    return;
                }
                return;
            }
        }
        if (this.LIZJ) {
            return;
        }
        synchronized (this.LIZLLL.LJJIII) {
            if (!this.LIZ && !this.LIZLLL.LJIJJLI && this.LIZIZ == null) {
                Object obj2 = message.obj;
                if (obj2 instanceof InterfaceC46942Iba) {
                    interfaceC46942Iba = (InterfaceC46942Iba) obj2;
                }
                LIZ(interfaceC46942Iba, 1);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC46995IcR(C46998IcU c46998IcU, HandlerThread handlerThread) {
        super(handlerThread.getLooper());
        this.LIZLLL = c46998IcU;
    }

    public final void LIZ(InterfaceC46942Iba interfaceC46942Iba, int i) {
        boolean z;
        ITZ itz;
        if (interfaceC46942Iba != null) {
            interfaceC46942Iba.LJJLL();
        }
        C46999IcV c46999IcV = this.LIZLLL.LJIIL;
        if (c46999IcV != null && c46999IcV.LJIILJJIL) {
            z = true;
        } else {
            z = false;
        }
        Object value = IZ8.R.getValue();
        o.LJIIIIZZ(value, "<get-enablePlayerConfigOpt>(...)");
        if (((Boolean) value).booleanValue()) {
            itz = ITZ.TT_CONFIG_OPT;
        } else {
            itz = this.LIZLLL.LIZIZ;
        }
        C46998IcU c46998IcU = this.LIZLLL;
        this.LIZIZ = new C46997IcT(itz, c46998IcU.LJJI, new C46996IcS(), c46998IcU.LJIIJJI, z);
        this.LIZIZ.LJFF.LJJLL(interfaceC46942Iba);
        this.LIZIZ.LIZLLL();
        Object value2 = IZ8.LLLII.getValue();
        o.LJIIIIZZ(value2, "<get-COLD_BOOT_VIDEO_PRECREATE_DECODER>(...)");
        if (((Boolean) value2).booleanValue()) {
            this.LIZIZ.LJ.sendEmptyMessage(20);
        }
        if (interfaceC46942Iba != null) {
            interfaceC46942Iba.LJJZ();
        }
    }

    public final void LIZIZ(IX4 ix4, IVM ivm) {
        InterfaceC46942Iba interfaceC46942Iba = this.LIZLLL.LJJII;
        if (interfaceC46942Iba != null) {
            interfaceC46942Iba.LJJZZIII();
        }
        if (this.LIZIZ == null || this.LIZIZ.LJIIIIZZ || this.LIZIZ.LJIIIZ || this.LIZIZ.LJIJ || TextUtils.equals(ix4.LJIIIZ, this.LIZIZ.LIZ)) {
            return;
        }
        if (ix4.LJJI != null) {
            this.LIZIZ.LJIIJ(ix4.LJJI);
        }
        ix4.LJJ = true;
        this.LIZIZ.LJIIIZ(ivm);
        this.LIZIZ.LJ(ix4);
        this.LIZIZ.LJIJ = true;
    }
}
