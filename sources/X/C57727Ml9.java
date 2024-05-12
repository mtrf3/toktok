package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Ml9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57727Ml9 extends F9E implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C57727Ml9(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C57727Ml9 c57727Ml9;
        Aweme aweme;
        String aid = this.LJLIL.getAid();
        String str = null;
        if ((interfaceC57784Mm4 instanceof C57727Ml9) && (c57727Ml9 = (C57727Ml9) interfaceC57784Mm4) != null && (aweme = c57727Ml9.LJLIL) != null) {
            str = aweme.getAid();
        }
        return o.LJ(aid, str);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C57727Ml9 c57727Ml9;
        Aweme aweme;
        String aid = this.LJLIL.getAid();
        String str = null;
        if ((interfaceC57784Mm4 instanceof C57727Ml9) && (c57727Ml9 = (C57727Ml9) interfaceC57784Mm4) != null && (aweme = c57727Ml9.LJLIL) != null) {
            str = aweme.getAid();
        }
        return o.LJ(aid, str);
    }
}
