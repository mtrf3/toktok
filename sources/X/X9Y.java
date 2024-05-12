package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X9Y extends F9E {
    public final X80 LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public X9Y() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    public /* synthetic */ X9Y(int i) {
        this(X80.INSERT, Integer.MAX_VALUE, LiveLayoutPreloadThreadPriority.DEFAULT);
    }

    public X9Y(X80 type, int i, int i2) {
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
