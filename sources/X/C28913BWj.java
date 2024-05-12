package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BWj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28913BWj extends F9E {
    public final int LJLIL;
    public final BUW LJLILLLLZI;
    public final CharSequence LJLJI;
    public final int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, Integer.valueOf(this.LJLJJI)};
    }

    public C28913BWj(int i, BUW notifyType, CharSequence text, int i2) {
        o.LJIIIZ(notifyType, "notifyType");
        o.LJIIIZ(text, "text");
        this.LJLIL = i;
        this.LJLILLLLZI = notifyType;
        this.LJLJI = text;
        this.LJLJJI = i2;
    }
}
