package X;

import android.graphics.Paint;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VqC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80972VqC extends F9E {
    public final String LJLIL;
    public final Paint LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public List<? extends InterfaceC80984VqO> LJLLL;
    public final C5H3 LJLLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C80972VqC(String emojiStr) {
        o.LJIIIZ(emojiStr, "emojiStr");
        this.LJLIL = emojiStr;
        this.LJLILLLLZI = new Paint();
        this.LJLLI = 1.5f;
        this.LJLLILLLL = 1.0f;
        this.LJLLJ = 1.0f;
        this.LJLLLL = C221108m2.LIZ(EnumC221088m0.NONE, C80971VqB.LJLIL);
    }
}
