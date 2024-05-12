package X;

import android.content.Context;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XbM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85148XbM extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ TwoStepVerificationDetailFragment LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;
    public final /* synthetic */ AddVerificationResponse LJLJLJ;
    public final /* synthetic */ Context LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85148XbM(boolean z, String str, Boolean bool, String str2, TwoStepVerificationDetailFragment twoStepVerificationDetailFragment, String str3, C85134Xb8 c85134Xb8, AddVerificationResponse addVerificationResponse, Context context, String str4, String str5) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = bool;
        this.LJLJJI = str2;
        this.LJLJJL = twoStepVerificationDetailFragment;
        this.LJLJJLL = str3;
        this.LJLJL = c85134Xb8;
        this.LJLJLJ = addVerificationResponse;
        this.LJLJLLL = context;
        this.LJLL = str4;
        this.LJLLI = str5;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        int i;
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI = true;
        if (!this.LJLIL || GJ0.LIZ()) {
            actionGroup.LJII(this.LJLILLLLZI, new C85145XbJ(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLIL, this.LJLJL));
        }
        if (o.LJ(this.LJLJI, Boolean.TRUE)) {
            i = R.string.s7;
        } else {
            i = R.string.rn6;
        }
        actionGroup.LJI(i, new C85146XbK(this.LJLJJI, this.LJLJJL, this.LJLJI, this.LJLJLJ, this.LJLJJLL, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLIL));
        actionGroup.LJIIIIZZ(R.string.rmt, null);
        return C76800UCe.LIZ;
    }
}
