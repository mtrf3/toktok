package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes8.dex */
public final /* synthetic */ class G8C implements InterfaceC88472Yns {
    public final /* synthetic */ IDP LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public /* synthetic */ G8C(IDP idp, Aweme aweme, boolean z) {
        this.LJLIL = idp;
        this.LJLILLLLZI = aweme;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        int i;
        IDP idp = this.LJLIL;
        Aweme aweme = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        Aweme aweme2 = (Aweme) obj;
        idp.getClass();
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        idp.LJJLIIIJLLLLLLLZ(i, aweme);
        OJY LJIL = C73340SqO.LJIL();
        Context LJJIIZ = idp.LJJIIZ();
        LJIL.getClass();
        NN1.LJJIJ(LJJIIZ, aweme2);
        return C76800UCe.LIZ;
    }
}
