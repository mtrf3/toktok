package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.8c4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214928c4 extends F9E {
    public final Aweme LJLIL;
    public final long LJLILLLLZI;
    public final CharSequence LJLJI;
    public final boolean LJLJJI;
    public final CharSequence LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), this.LJLJI, Boolean.valueOf(this.LJLJJI), this.LJLJJL};
    }

    public C214928c4(Aweme aweme, long j, CharSequence text, boolean z, CharSequence oldRethinkText) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(oldRethinkText, "oldRethinkText");
        this.LJLIL = aweme;
        this.LJLILLLLZI = j;
        this.LJLJI = text;
        this.LJLJJI = z;
        this.LJLJJL = oldRethinkText;
    }

    public static C214928c4 L(C214928c4 c214928c4, CharSequence charSequence, boolean z, CharSequence charSequence2, int i) {
        Aweme aweme;
        long j;
        CharSequence oldRethinkText = charSequence2;
        CharSequence text = charSequence;
        boolean z2 = z;
        if ((i & 1) != 0) {
            aweme = c214928c4.LJLIL;
        } else {
            aweme = null;
        }
        if ((i & 2) != 0) {
            j = c214928c4.LJLILLLLZI;
        } else {
            j = 0;
        }
        if ((i & 4) != 0) {
            text = c214928c4.LJLJI;
        }
        if ((i & 8) != 0) {
            z2 = c214928c4.LJLJJI;
        }
        if ((i & 16) != 0) {
            oldRethinkText = c214928c4.LJLJJL;
        }
        c214928c4.getClass();
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(oldRethinkText, "oldRethinkText");
        return new C214928c4(aweme, j, text, z2, oldRethinkText);
    }
}
