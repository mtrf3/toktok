package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.services.BindService;
import kotlin.jvm.internal.o;

/* renamed from: X.Uz1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78971Uz1 extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ JJ4 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78971Uz1(Activity activity, JJ4 jj4, String str, String str2, String str3) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = activity;
        this.LJLJJL = jj4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN arn) {
        ARN it = arn;
        o.LJIIIZ(it, "it");
        it.LIZJ = false;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", this.LJLIL);
        c35936E8m.LIZLLL("enter_method", this.LJLILLLLZI);
        c35936E8m.LIZLLL("platform", this.LJLJI);
        FMX.LJIIL("bind_notify_confirm", c35936E8m.LIZ);
        Bundle bundle = new Bundle();
        bundle.putInt("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeLogoutAlert.getValue());
        bundle.putInt("email_source", V86.DYABindEmailSourceTypeLogoutAlert.getValue());
        BindService LIZIZ = R41.LIZIZ();
        Activity activity = this.LJLJJI;
        LIZIZ.bindMobileOrEmailAndSetPwd(activity, this.LJLIL, this.LJLILLLLZI, bundle, new C78471Uqx(activity, it, this.LJLJJL));
        return C76800UCe.LIZ;
    }
}
