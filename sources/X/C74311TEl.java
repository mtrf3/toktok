package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.TEl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74311TEl extends F9E {
    public final boolean LJLIL;
    public final List<Effect> LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C74311TEl(String str, String str2, List list, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = list;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }
}
