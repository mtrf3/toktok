package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.TMt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74527TMt extends AbstractC74560TOa<C74397THt, Effect, C44368HbA> implements InterfaceC74528TMu {
    public final InterfaceC74529TMv LJII;

    @Override // X.AbstractC74560TOa
    public final String LJI(C74397THt c74397THt) {
        C74397THt key = c74397THt;
        o.LJIIIZ(key, "key");
        return key.LJLIL.getEffectId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74527TMt(InterfaceC74529TMv actualDownloader, int i) {
        super(i);
        o.LJIIIZ(actualDownloader, "actualDownloader");
        this.LJII = actualDownloader;
    }

    @Override // X.InterfaceC74528TMu
    public final boolean LIZ(Effect effect, boolean z) {
        o.LJIIIZ(effect, "effect");
        return this.LJII.LIZ(effect, z);
    }

    @Override // X.AbstractC74560TOa
    public final void LJFF(Object key, TOZ toz) {
        o.LJIIIZ(key, "key");
        this.LJII.LIZIZ(key, toz);
    }
}
