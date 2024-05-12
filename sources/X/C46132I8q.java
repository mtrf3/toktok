package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.I8q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46132I8q extends F9E {
    public final boolean LJLIL;
    public final Effect LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public C46132I8q(Effect effect, String musicId, boolean z) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(musicId, "musicId");
        this.LJLIL = z;
        this.LJLILLLLZI = effect;
        this.LJLJI = musicId;
    }
}
