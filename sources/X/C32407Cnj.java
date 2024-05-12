package X;

import Y.ARunnableS16S0300000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;

/* renamed from: X.Cnj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32407Cnj extends AbstractC32397CnZ {
    public final Handler LIZIZ;

    public C32407Cnj(C32401Cnd c32401Cnd, Handler handler) {
        super(c32401Cnd);
        this.LIZIZ = handler;
    }

    @Override // X.AbstractC32397CnZ
    public final void LIZ(AbstractC32415Cnr abstractC32415Cnr, C32399Cnb c32399Cnb) {
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            C39202Fa2.LIZJ().submit(new ARunnableS16S0300000_5(this, abstractC32415Cnr, c32399Cnb, 5));
        } else {
            Handler handler = this.LIZIZ;
            if (handler == null) {
                return;
            }
            handler.post(new ARunnableS16S0300000_5(this, abstractC32415Cnr, c32399Cnb, 6));
        }
    }
}
