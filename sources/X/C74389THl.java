package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.THl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74389THl extends F9E {
    public final List<Effect> LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final java.util.Map<String, String> LJLJJI;
    public final boolean LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, Boolean.valueOf(this.LJLJJL)};
    }

    public /* synthetic */ C74389THl(List list, int i, int i2, int i3) {
        this(list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C74389THl(List<? extends Effect> effects, int i, int i2, java.util.Map<String, String> map, boolean z) {
        o.LJIIIZ(effects, "effects");
        this.LJLIL = effects;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = map;
        this.LJLJJL = z;
    }
}
