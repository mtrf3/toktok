package X;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.XEy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84516XEy implements XCP {
    public final /* synthetic */ XF0 LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.XCP
    public final void onStart(Effect effect) {
    }

    @Override // X.XDR
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        if (effect2 != null && effect2.getUnzipPath().length() > 0) {
            this.LIZ.LJFF(this.LIZIZ, effect2.getUnzipPath());
        } else {
            this.LIZ.LJI(this.LIZIZ, new C57M(new IllegalStateException("effect is null or effect unzipPath is empty"), -1));
        }
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(Effect effect) {
    }

    public C84516XEy(XF0 xf0, String str) {
        this.LIZ = xf0;
        this.LIZIZ = str;
    }

    @Override // X.XDR
    public final void onFail(Effect effect, C84418XBe exception) {
        o.LJIIIZ(exception, "exception");
        this.LIZ.LJI(this.LIZIZ, new C57M(exception.LIZJ, exception.LIZ));
    }

    @Override // X.XCP
    public final void onProgress(Effect effect, int i, long j) {
        this.LIZ.LJIIIZ(i, this.LIZIZ);
    }
}
