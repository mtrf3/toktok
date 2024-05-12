package X;

import Y.IDfS292S0100000;
import Y.IDuS74S0200000;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.1kB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41591kB<T> implements IFetchEffectChannelListener {
    public final String LIZ;
    public final C0WM<T> LIZIZ;
    public final C0WP<T> LIZJ;
    public final C0WO<T> LIZLLL;
    public final long LJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        C0TX.LIZ.LIZJ("LiveEffectDataProvider");
        C0TX.LIZIZ("fetch from remote fail");
        LIZ(this.LIZ, false);
        C0WO<T> c0wo = this.LIZLLL;
        if (c0wo != null) {
            c0wo.onFail();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        C0TX.LIZ.LIZJ("LiveEffectDataProvider");
        C0TX.LIZIZ("fetch from remote success");
        AbstractC73672Svk.LJIIJ(new IDuS74S0200000(this, effectChannelResponse, 1)).LJII(new C62705OjF()).LJJJJZI(new IDfS292S0100000(this, 17));
    }

    public final void LIZ(String str, boolean z) {
        String str2;
        if (C0TY.LIZ().equals(str)) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_filter_panel_download");
            LIZ.LJIIZILJ();
            I9A.LIZ(System.currentTimeMillis(), this.LJ, LIZ, "duration");
            if (z) {
                str2 = "done";
            } else {
                str2 = "failed";
            }
            LIZ.LJIJJ(str2, "status");
            LIZ.LJJIIJZLJL();
        }
    }

    public C41591kB(String panel, C0WM<T> effectConverter, C0WP<T> effectProcessor, C0WO<T> c0wo) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(effectConverter, "effectConverter");
        o.LJIIIZ(effectProcessor, "effectProcessor");
        this.LIZ = panel;
        this.LIZIZ = effectConverter;
        this.LIZJ = effectProcessor;
        this.LIZLLL = c0wo;
        this.LJ = System.currentTimeMillis();
    }
}
