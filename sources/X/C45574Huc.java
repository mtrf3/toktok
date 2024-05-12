package X;

import android.app.Activity;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS27S0100100_2;
import kotlin.jvm.internal.o;

/* renamed from: X.Huc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45574Huc extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45574Huc(Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Bundle bundle, long j) {
        super(1);
        this.LJLIL = activity;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = bundle;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(C207798Dn.LIZIZ(this.LJLIL, R.string.g4c, "activity.resources.getSt…o_feature_replace_btn_ok)"), new C136725Ye(this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
        actionGroup.LJIIIZ(C207798Dn.LIZIZ(this.LJLIL, R.string.g4b, "activity.resources.getSt…ature_replace_btn_cancel)"), new AqS27S0100100_2(this.LJLJJI, this.LJLJI, 0));
        return C76800UCe.LIZ;
    }
}
