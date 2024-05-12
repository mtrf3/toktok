package X;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.XCf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84445XCf implements XCP {
    public final /* synthetic */ XCW LIZ;

    @Override // X.XCP
    public final void onProgress(Effect effect, int i, long j) {
    }

    @Override // X.XCP
    public final void onStart(Effect effect) {
    }

    public C84445XCf(XCW xcw) {
        this.LIZ = xcw;
    }

    @Override // X.XDR
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        if (effect2 != null) {
            this.LIZ.LJIIIIZZ.remove(effect2.getId());
            this.LIZ.LJIIIZ.add(effect2);
        }
        this.LIZ.LJI();
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(Effect effect) {
    }

    @Override // X.XDR
    public final void onFail(Effect effect, C84418XBe exception) {
        Effect effect2 = effect;
        o.LJIIJ(exception, "exception");
        if (effect2 != null) {
            this.LIZ.LJIIIIZZ.remove(effect2.getId());
            this.LIZ.LJIIJ.add(new OSZ<>(effect2, exception));
        }
        this.LIZ.LJI();
    }
}
