package X;

import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import kotlin.jvm.internal.o;

/* renamed from: X.ANi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26130ANi extends AbstractC65781Prl implements InterfaceC88475Ynv<AML, Integer, Boolean, Boolean, Boolean, C76800UCe> {
    public final /* synthetic */ MyProfileGuideWidgetV2 LJLIL;
    public final /* synthetic */ ViewOnClickListenerC226978vV LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26130ANi(MyProfileGuideWidgetV2 myProfileGuideWidgetV2, ViewOnClickListenerC226978vV viewOnClickListenerC226978vV) {
        super(5);
        this.LJLIL = myProfileGuideWidgetV2;
        this.LJLILLLLZI = viewOnClickListenerC226978vV;
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(AML aml, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        AML selectSubscribe = aml;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ProfileState profileState = (ProfileState) selectSubscribe.withState(this.LJLIL.LIZ(), AO3.LJLIL);
        if (intValue == 0 && this.LJLIL.LJIILIIL(profileState)) {
            this.LJLIL.LJIIJJI(0);
            C255209zw.LJI();
            C255199zv.LJFF = true;
            ViewOnClickListenerC226978vV viewOnClickListenerC226978vV = this.LJLILLLLZI;
            if (viewOnClickListenerC226978vV != null) {
                viewOnClickListenerC226978vV.setVisibility(4);
            }
        } else {
            this.LJLIL.LJIIJJI(8);
            ViewOnClickListenerC226978vV viewOnClickListenerC226978vV2 = this.LJLILLLLZI;
            if (viewOnClickListenerC226978vV2 != null) {
                viewOnClickListenerC226978vV2.setVisibility(4);
            }
            C255199zv.LJFF = false;
        }
        return C76800UCe.LIZ;
    }
}
