package X;

import Y.ACListenerS23S0100000_3;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import kotlin.jvm.internal.o;

/* renamed from: X.8q4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223608q4 implements InterfaceC88472Yns<C6DL, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ BaseListFragmentPanel LJLJJI;

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C6DL c6dl) {
        C6DQ c6dq = new C6DQ();
        String str = this.LJLIL;
        o.LJIIIZ(str, "<set-?>");
        c6dq.LIZJ = str;
        c6dq.LIZLLL = new ACListenerS23S0100000_3(this, 84);
        c6dl.LIZ(c6dq);
        return C76800UCe.LIZ;
    }

    public C223608q4(BaseListFragmentPanel baseListFragmentPanel, String str, Aweme aweme, String str2) {
        this.LJLJJI = baseListFragmentPanel;
        this.LJLIL = str;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str2;
    }
}
