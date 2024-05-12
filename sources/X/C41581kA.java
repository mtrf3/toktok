package X;

import Y.IDfS292S0100000;
import Y.IDuS74S0200000;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* renamed from: X.1kA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41581kA<T> implements IFetchEffectChannelListener {
    public final String LIZ;
    public final C0WM<T> LIZIZ;
    public final C0WP<T> LIZJ;
    public final C0WO<T> LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        C0TX c0tx = C0TX.LIZ;
        c0tx.LIZJ("LiveEffectDataProvider");
        C0TX.LIZIZ("fetch from cache fail");
        C15380j0.LIZLLL();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                c0tx.LIZJ("LiveEffectDataProvider");
                C0TX.LIZIZ("try fetch from remote");
                EffectManager effectManager = C1KJ.LIZIZ;
                String str = this.LIZ;
                effectManager.fetchEffectList(str, false, (IFetchEffectChannelListener) new C41591kB(str, this.LIZIZ, this.LIZJ, this.LIZLLL));
                return;
            }
        } catch (Exception unused) {
        }
        c0tx.LIZJ("LiveEffectDataProvider");
        C0TX.LIZIZ("not network");
        C0WO<T> c0wo = this.LIZLLL;
        if (c0wo != null) {
            c0wo.onFail();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        C0TX.LIZ.LIZJ("LiveEffectDataProvider");
        C0TX.LIZIZ("fetch from cache success");
        AbstractC73672Svk.LJIIJ(new IDuS74S0200000(this, effectChannelResponse, 0)).LJII(new C62705OjF()).LJJJJZI(new IDfS292S0100000(this, 16));
    }

    public C41581kA(String str, C0WM<T> c0wm, C0WP<T> c0wp, C0WO<T> c0wo) {
        this.LIZ = str;
        this.LIZIZ = c0wm;
        this.LIZJ = c0wp;
        this.LIZLLL = c0wo;
    }
}
