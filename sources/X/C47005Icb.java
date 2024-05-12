package X;

import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Icb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47005Icb implements InterfaceC47030Id0 {
    public final ITZ LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final Object LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public int LJIIIIZZ;
    public ITX LJIIIZ;
    public boolean LJIIJ;

    public final HandlerC46994IcQ LJFF() {
        return (HandlerC46994IcQ) this.LJII.getValue();
    }

    @Override // X.InterfaceC47021Icr
    public final void release() {
        if (LJ(this.LJ)) {
            HandlerC46994IcQ LJFF = LJFF();
            if (!LJFF.LJIIIZ) {
                LJFF.LJII = null;
                LJFF.sendEmptyMessage(LJFF.LJ);
            }
            this.LJI.getValue().getClass();
        }
    }

    public C47005Icb(ITZ playerType) {
        o.LJIIIZ(playerType, "playerType");
        this.LIZ = playerType;
        this.LIZIZ = 1;
        this.LIZJ = 2;
        this.LIZLLL = 3;
        this.LJ = 4;
        this.LJFF = new Object();
        this.LJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 575));
        this.LJII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 574));
        this.LJIIIIZZ = 0;
    }

    @Override // X.InterfaceC47030Id0
    public final void LIZ(ITX playerCreateCallback) {
        o.LJIIIZ(playerCreateCallback, "playerCreateCallback");
        if (this.LJIIIIZZ == this.LJ) {
            return;
        }
        this.LJIIIZ = playerCreateCallback;
    }

    @Override // X.InterfaceC47030Id0
    public final void LIZIZ(IWT iwt) {
        synchronized (this.LJFF) {
            if (LJ(this.LIZIZ)) {
                HandlerC46994IcQ LJFF = LJFF();
                if (!LJFF.LJIIIZ) {
                    LJFF.LJII = iwt;
                    Message obtain = Message.obtain();
                    obtain.what = LJFF.LIZJ;
                    obtain.obj = iwt;
                    LJFF.sendMessage(obtain);
                }
            }
        }
    }

    @Override // X.InterfaceC47035Id5
    public final C47020Icq LIZLLL(IX4 prepareData) {
        o.LJIIIZ(prepareData, "prepareData");
        if (!prepareData.LJL) {
            this.LJIIJ = true;
            return C73340SqO.LJIILLIIL();
        }
        synchronized (this.LJFF) {
            if (LJ(this.LIZJ)) {
                LJFF().LIZJ(prepareData);
                return C73340SqO.LJJIJL(null, null);
            }
            return C73340SqO.LJIILLIIL();
        }
    }

    public final boolean LJ(int i) {
        int i2 = this.LJIIIIZZ;
        if (i2 >= i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ensureState error : ");
            LIZ.append(this.LJIIIIZZ);
            LIZ.append(" >= ");
            LIZ.append(i);
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            return false;
        }
        if (i == this.LIZLLL && i2 == 0) {
            return false;
        }
        if (i == this.LJ && i2 == 0) {
            return false;
        }
        this.LJIIIIZZ = i;
        return true;
    }

    @Override // X.InterfaceC47021Icr
    public final C47020Icq LIZJ(C47007Icd c47007Icd, IX4 prepareData, OnUIPlayListener onUIPlayListener, AqS158S0100000_8 clean) {
        o.LJIIIZ(prepareData, "prepareData");
        o.LJIIIZ(clean, "clean");
        if (c47007Icd != null && (c47007Icd instanceof C47004Ica)) {
            clean.invoke();
            prepareData.LJLLL = 3;
            release();
            this.LJIIJ = true;
        }
        if (this.LJIIJ) {
            return C73340SqO.LJIILLIIL();
        }
        synchronized (this.LJFF) {
            if (!LJ(this.LIZLLL)) {
                return C73340SqO.LJIILLIIL();
            }
            if (prepareData.LJJI == null) {
                return C73340SqO.LJIILLIIL();
            }
            if (LJFF().LJIIIZ || LJFF().LJIIIIZZ) {
                return C73340SqO.LJIILLIIL();
            }
            LJFF().LJIIIIZZ = true;
            C47004Ica c47004Ica = LJFF().LIZ;
            if (c47004Ica.LJIJJLI && TextUtils.equals(prepareData.LJIIIZ, c47004Ica.LIZ)) {
                return C73340SqO.LJJIJL(c47004Ica, new AqS174S0100000_8(prepareData, 206));
            }
            if (c47004Ica.LJIL) {
                return C73340SqO.LJJIJL(c47004Ica, new AqS174S0100000_8(prepareData, 207));
            }
            prepareData.LJLLL = 4;
            release();
            if (onUIPlayListener != null) {
                onUIPlayListener.onPreRenderSessionMissed(c47004Ica.LIZ);
            }
            return C73340SqO.LJIILLIIL();
        }
    }
}
