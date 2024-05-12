package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.2ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70012ov implements C2K7 {
    public final Aweme LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final Aweme LJLJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70012ov)) {
            return false;
        }
        C70012ov c70012ov = (C70012ov) obj;
        return o.LJ(this.LJLIL, c70012ov.LJLIL) && this.LJLILLLLZI == c70012ov.LJLILLLLZI && this.LJLJI == c70012ov.LJLJI && this.LJLJJI == c70012ov.LJLJJI && this.LJLJJL == c70012ov.LJLJJL && this.LJLJJLL == c70012ov.LJLJJLL && o.LJ(this.LJLJL, c70012ov.LJLJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31) + this.LJLJI) * 31) + this.LJLJJI) * 31;
        boolean z = this.LJLJJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + (this.LJLJJLL ? 1 : 0)) * 31;
        Aweme aweme = this.LJLJL;
        return i2 + (aweme == null ? 0 : aweme.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryPageSelectParam(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", storyListPosition=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", storyPosition=");
        LIZ.append(this.LJLJI);
        LIZ.append(", totalCount=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isSlideToSelect=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", shouldPlay=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", lastAweme=");
        return C770830u.LIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C70012ov(com.ss.android.ugc.aweme.feed.model.Aweme r9, int r10, int r11, int r12, boolean r13, com.ss.android.ugc.aweme.feed.model.Aweme r14, int r15) {
        /*
            r8 = this;
            r7 = r14
            r0 = r15 & 32
            if (r0 == 0) goto L15
            r6 = 1
        L6:
            r0 = r15 & 64
            if (r0 == 0) goto Lb
            r7 = 0
        Lb:
            r5 = r13
            r1 = r9
            r4 = r12
            r0 = r8
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L15:
            r6 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70012ov.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, int, int, int, boolean, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    public C70012ov(Aweme aweme, int i, int i2, int i3, boolean z, boolean z2, Aweme aweme2) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = aweme2;
    }
}
