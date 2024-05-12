package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.TJi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74438TJi extends F9E {
    public final Effect LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C74438TJi(Effect favorite, boolean z) {
        o.LJIIIZ(favorite, "favorite");
        this.LJLIL = favorite;
        this.LJLILLLLZI = z;
    }
}
