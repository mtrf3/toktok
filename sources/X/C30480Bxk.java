package X;

import android.text.TextUtils;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Bxk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30480Bxk implements InterfaceC75217TfZ {
    public final AbstractC30473Bxd LIZ;

    @Override // X.InterfaceC75217TfZ
    public final EffectImageInfo LIZJ() {
        if (this.LIZ != null && !TextUtils.isEmpty("navi_capture")) {
            return this.LIZ.LIZLLL();
        }
        return null;
    }

    public C30480Bxk(C30514ByI c30514ByI) {
        this.LIZ = c30514ByI;
    }

    @Override // X.InterfaceC75217TfZ
    public final void LIZ(InterfaceC30516ByK messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        AbstractC30473Bxd abstractC30473Bxd = this.LIZ;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJIIIIZZ(messageListener);
        }
    }

    @Override // X.InterfaceC75217TfZ
    public final int LIZIZ(String str) {
        if (this.LIZ != null && !TextUtils.isEmpty(str)) {
            return this.LIZ.LJII(str);
        }
        return 0;
    }

    @Override // X.InterfaceC75217TfZ
    public final void LIZLLL(InterfaceC30516ByK messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        AbstractC30473Bxd abstractC30473Bxd = this.LIZ;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LIZ(messageListener);
        }
    }

    @Override // X.InterfaceC75217TfZ
    public final int setEffect(String str) {
        if (this.LIZ != null && !TextUtils.isEmpty(str)) {
            return this.LIZ.LJIIJ(str);
        }
        return 0;
    }

    @Override // X.InterfaceC75217TfZ
    public final void LJJIJL(int i, long j, long j2, String msg) {
        o.LJIIIZ(msg, "msg");
        AbstractC30473Bxd abstractC30473Bxd = this.LIZ;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJIIIZ(i, (int) j, (int) j2, msg);
        }
    }
}
