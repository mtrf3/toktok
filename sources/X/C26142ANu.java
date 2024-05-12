package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ANu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26142ANu extends AbstractC65781Prl implements InterfaceC88475Ynv<AML, Boolean, AbstractC26082ALm<? extends OSZ<? extends UrlModel, ? extends C2047581v>>, Boolean, Integer, C76800UCe> {
    public final /* synthetic */ BaseMyProfileGuideWidget LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26142ANu(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
        super(5);
        this.LJLIL = baseMyProfileGuideWidget;
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(AML aml, Boolean bool, AbstractC26082ALm<? extends OSZ<? extends UrlModel, ? extends C2047581v>> abstractC26082ALm, Boolean bool2, Integer num) {
        AML selectSubscribe = aml;
        Boolean bool3 = bool;
        AbstractC26082ALm<? extends OSZ<? extends UrlModel, ? extends C2047581v>> loadAvatar = abstractC26082ALm;
        Integer num2 = num;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(loadAvatar, "loadAvatar");
        if (!((MyProfileGuideState) selectSubscribe.withState(this.LJLIL.LJI(), AO0.LJLIL)).getHasGuideShowed() && o.LJ(bool2, Boolean.TRUE)) {
            MyProfileGuideViewModel LJI = this.LJLIL.LJI();
            AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(bool3, 675);
            LJI.getClass();
            LJI.setState(aqS170S0100000_4);
            MyProfileGuideViewModel LJI2 = this.LJLIL.LJI();
            AqS170S0100000_4 aqS170S0100000_42 = new AqS170S0100000_4(loadAvatar, (AbstractC26082ALm<? extends OSZ<? extends UrlModel, ? extends C2047581v>>) 688);
            LJI2.getClass();
            LJI2.setState(aqS170S0100000_42);
            MyProfileGuideViewModel LJI3 = this.LJLIL.LJI();
            AqS170S0100000_4 aqS170S0100000_43 = new AqS170S0100000_4(num2, 689);
            LJI3.getClass();
            LJI3.setState(aqS170S0100000_43);
        }
        return C76800UCe.LIZ;
    }
}
