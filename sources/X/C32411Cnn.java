package X;

import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerSettings;
import kotlin.jvm.internal.AqS19S0200100_5;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Cnn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32411Cnn extends CKI {
    public final /* synthetic */ C32412Cno LJLIL;
    public final /* synthetic */ C32399Cnb LJLILLLLZI;
    public final /* synthetic */ AbstractC32415Cnr LJLJI;

    @Override // X.CKI, X.InterfaceC32416Cns
    public final void LIZ(long j) {
        if (LiveGiftResourceManagerSettings.INSTANCE.getThreadCrash()) {
            AqS19S0200100_5 aqS19S0200100_5 = new AqS19S0200100_5(this.LJLILLLLZI, j, this.LJLJI, 0);
            if (HandlerThreadOptSetting.INSTANCE.enable()) {
                C39202Fa2.LIZJ().submit(new ARunnableS41S0100000_5(aqS19S0200100_5, 203));
                return;
            } else {
                Handler handler = this.LJLIL.LIZIZ;
                if (handler == null) {
                    return;
                }
                handler.post(new ARunnableS41S0100000_5(aqS19S0200100_5, 203));
                return;
            }
        }
        C32399Cnb c32399Cnb = this.LJLILLLLZI;
        if (c32399Cnb != null) {
            c32399Cnb.LJII = false;
            c32399Cnb.LJIIJJI = j;
            c32399Cnb.LIZIZ(EnumC32408Cnk.CANCEL);
        }
        AbstractC32415Cnr abstractC32415Cnr = this.LJLJI;
        if (abstractC32415Cnr == null) {
            return;
        }
        abstractC32415Cnr.LIZ(this.LJLILLLLZI);
    }

    @Override // X.CKI, X.InterfaceC32416Cns
    public final void onFailed(Throwable th) {
        if (LiveGiftResourceManagerSettings.INSTANCE.getThreadCrash()) {
            AqS94S0300000_5 aqS94S0300000_5 = new AqS94S0300000_5(this.LJLILLLLZI, th, this.LJLJI, 9);
            if (HandlerThreadOptSetting.INSTANCE.enable()) {
                C39202Fa2.LIZJ().submit(new ARunnableS41S0100000_5(aqS94S0300000_5, 203));
                return;
            } else {
                Handler handler = this.LJLIL.LIZIZ;
                if (handler == null) {
                    return;
                }
                handler.post(new ARunnableS41S0100000_5(aqS94S0300000_5, 203));
                return;
            }
        }
        C32399Cnb c32399Cnb = this.LJLILLLLZI;
        if (c32399Cnb != null) {
            c32399Cnb.LJII = false;
            c32399Cnb.LJIIL = th;
            c32399Cnb.LIZIZ(EnumC32408Cnk.ERROR);
        }
        AbstractC32415Cnr abstractC32415Cnr = this.LJLJI;
        if (abstractC32415Cnr == null) {
            return;
        }
        abstractC32415Cnr.LIZ(this.LJLILLLLZI);
    }

    @Override // X.CKI, X.InterfaceC32416Cns
    public final void LIZLLL(long j, String path) {
        o.LJIIIZ(path, "path");
        if (LiveGiftResourceManagerSettings.INSTANCE.getThreadCrash()) {
            C32410Cnm c32410Cnm = new C32410Cnm(this.LJLILLLLZI, j, path, this.LJLJI);
            if (HandlerThreadOptSetting.INSTANCE.enable()) {
                C39202Fa2.LIZJ().submit(new ARunnableS41S0100000_5(c32410Cnm, 203));
                return;
            } else {
                Handler handler = this.LJLIL.LIZIZ;
                if (handler == null) {
                    return;
                }
                handler.post(new ARunnableS41S0100000_5(c32410Cnm, 203));
                return;
            }
        }
        C32399Cnb c32399Cnb = this.LJLILLLLZI;
        if (c32399Cnb != null) {
            c32399Cnb.LJII = true;
            c32399Cnb.LJIIJJI = j;
            c32399Cnb.LIZIZ(EnumC32408Cnk.DONE);
        }
        C32399Cnb c32399Cnb2 = this.LJLILLLLZI;
        if (c32399Cnb2 != null) {
            c32399Cnb2.LJIIJ = path;
        }
        AbstractC32415Cnr abstractC32415Cnr = this.LJLJI;
        if (abstractC32415Cnr == null) {
            return;
        }
        abstractC32415Cnr.LIZ(c32399Cnb2);
    }

    public C32411Cnn(C32412Cno c32412Cno, C32399Cnb c32399Cnb, AbstractC32415Cnr abstractC32415Cnr) {
        this.LJLIL = c32412Cno;
        this.LJLILLLLZI = c32399Cnb;
        this.LJLJI = abstractC32415Cnr;
    }
}
