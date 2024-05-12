package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.J9u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48710J9u extends F9E implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, Integer.valueOf(this.LJLJJL)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C48710J9u(Aweme aweme, int i, int i2, String pastMemoryKey, int i3) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
        this.LJLIL = aweme;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = pastMemoryKey;
        this.LJLJJL = i3;
    }
}
