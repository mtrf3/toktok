package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7gX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192217gX extends F9E {
    public final Aweme LJLIL;
    public final int LJLILLLLZI;

    public C192217gX() {
        this(0, 3);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C192217gX(int r3, int r4) {
        /*
            r2 = this;
            r0 = r4 & 1
            if (r0 == 0) goto L12
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = new com.ss.android.ugc.aweme.feed.model.Aweme
            r1.<init>()
        L9:
            r0 = r4 & 2
            if (r0 == 0) goto Le
            r3 = 0
        Le:
            r2.<init>(r3, r1)
            return
        L12:
            r1 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192217gX.<init>(int, int):void");
    }

    public C192217gX(int i, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
        this.LJLILLLLZI = i;
    }
}
