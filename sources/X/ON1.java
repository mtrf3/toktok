package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import kotlin.jvm.internal.AqS0S0203000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ON1 extends AbstractC65781Prl implements InterfaceC88472Yns<ARH, C76800UCe> {
    public final /* synthetic */ FeedSurvey LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ C80796VnM LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ON1(FeedSurvey feedSurvey, Aweme aweme, C80796VnM c80796VnM, int i, int i2, int i3) {
        super(1);
        this.LJLIL = feedSurvey;
        this.LJLILLLLZI = aweme;
        this.LJLJI = c80796VnM;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = i3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARH arh) {
        ARH buttonGroup = arh;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        if (C78685UuP.LJJJZ(this.LJLIL.getSubmitText())) {
            buttonGroup.LJFF(this.LJLIL.getSubmitText(), new AqS0S0203000_10(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, 0));
            ((ARL) ListProtector.get(buttonGroup.LJFF, 0)).LIZIZ(false);
        }
        if (C78685UuP.LJJJZ(this.LJLIL.getCancelText())) {
            buttonGroup.LJII(this.LJLIL.getCancelText(), new AqS0S0203000_10(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, 1));
        }
        return C76800UCe.LIZ;
    }
}
