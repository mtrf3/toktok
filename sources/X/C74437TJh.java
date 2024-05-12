package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.TJh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74437TJh extends F9E {
    public final boolean LJLIL;
    public final Effect LJLILLLLZI;
    public final EnumC74442TJm LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public C74437TJh(EnumC74442TJm from, Effect effect, boolean z) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(from, "from");
        this.LJLIL = z;
        this.LJLILLLLZI = effect;
        this.LJLJI = from;
    }
}
