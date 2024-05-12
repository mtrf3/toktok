package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AqS4S2300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hjk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44900Hjk extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ C42594Gne LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ ActivityC45651qj LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ SharePackage LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44900Hjk(C42594Gne c42594Gne, Aweme aweme, String str, String str2, String str3, ActivityC45651qj activityC45651qj, String str4, SharePackage sharePackage) {
        super(1);
        this.LJLIL = c42594Gne;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = activityC45651qj;
        this.LJLJL = str4;
        this.LJLJLJ = sharePackage;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        o.LJIIIZ(it, "it");
        C42594Gne c42594Gne = this.LJLIL;
        Aweme aweme = this.LJLILLLLZI;
        String str = this.LJLJI;
        c42594Gne.getClass();
        C42594Gne.LIZJ(str, aweme, "save_video");
        C42594Gne c42594Gne2 = this.LJLIL;
        Aweme aweme2 = this.LJLILLLLZI;
        String str2 = this.LJLJJI;
        String str3 = this.LJLJJL;
        String str4 = this.LJLJI;
        c42594Gne2.getClass();
        C42594Gne.LIZIZ(aweme2, str2, str3, str4, 0, null);
        C225298sn.LIZJ(1, 0, this.LJLILLLLZI);
        Aweme aweme3 = this.LJLILLLLZI;
        C44890Hja.LIZIZ(aweme3, new AqS4S2300000_7(this.LJLJJL, aweme3, this.LJLJJLL, this.LJLJL, this.LJLJLJ, 1));
        return C76800UCe.LIZ;
    }
}
