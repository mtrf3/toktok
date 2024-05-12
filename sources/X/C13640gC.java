package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0gC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13640gC implements Comparable<C13640gC> {
    public static final C13640gC LJLILLLLZI;
    public static final C13640gC LJLJI;
    public static final C13640gC LJLJJI;
    public static final C13640gC LJLJJL;
    public static final C13640gC LJLJJLL;
    public static final C13640gC LJLJL;
    public static final C13640gC LJLJLJ;
    public static final List<C13640gC> LJLJLLL;
    public final int LJLIL;

    static {
        C13640gC c13640gC = new C13640gC(100);
        C13640gC c13640gC2 = new C13640gC(200);
        C13640gC c13640gC3 = new C13640gC(300);
        C13640gC c13640gC4 = new C13640gC(LiveChatShowDelayForHotLiveSetting.DEFAULT);
        LJLILLLLZI = c13640gC4;
        C13640gC c13640gC5 = new C13640gC(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        LJLJI = c13640gC5;
        C13640gC c13640gC6 = new C13640gC(600);
        LJLJJI = c13640gC6;
        C13640gC c13640gC7 = new C13640gC(700);
        C13640gC c13640gC8 = new C13640gC(800);
        C13640gC c13640gC9 = new C13640gC(900);
        LJLJJL = c13640gC3;
        LJLJJLL = c13640gC4;
        LJLJL = c13640gC5;
        LJLJLJ = c13640gC7;
        LJLJLLL = C47261Igj.LJJIJIIJI(c13640gC, c13640gC2, c13640gC3, c13640gC4, c13640gC5, c13640gC6, c13640gC7, c13640gC8, c13640gC9);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FontWeight(weight=");
        return b0.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final int hashCode() {
        return this.LJLIL;
    }

    public C13640gC(int i) {
        this.LJLIL = i;
        if (1 <= i && i < 1001) {
            return;
        }
        String LJ = KMP.LJ("Font weight can be in range [1, 1000]. Current value: ", i);
        LJ.toString();
        throw new IllegalArgumentException(LJ);
    }

    @Override // java.lang.Comparable
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C13640gC other) {
        o.LJIIIZ(other, "other");
        return o.LJIIJJI(this.LJLIL, other.LJLIL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C13640gC) && this.LJLIL == ((C13640gC) obj).LJLIL) {
            return true;
        }
        return false;
    }
}
