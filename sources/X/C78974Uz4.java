package X;

import Y.AObjectS42S0101000_5;
import android.app.Dialog;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uz4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78974Uz4 extends C78915Uy7 {
    public final /* synthetic */ ARI LJLILLLLZI;
    public final /* synthetic */ Dialog LJLJI;
    public final /* synthetic */ I18nSettingManageMyAccountActivity LJLJJI;

    @Override // X.C78915Uy7
    public final void LJJIFFI() {
        this.LJLJI.dismiss();
    }

    @Override // X.C78915Uy7
    public final void LJJIII(VerificationResponse verificationResponse) {
        StringBuilder sb = new StringBuilder(this.LJLJJI.getString(R.string.tfp));
        C26227ARb c26227ARb = new C26227ARb(this.LJLJJI);
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\n");
        LIZ.append(this.LJLJJI.LJLIL.getBindPhone());
        c26227ARb.LJFF(i18nSettingManageMyAccountActivity.getString(R.string.tfr, X1D.LIZIZ(LIZ)));
        c26227ARb.LIZIZ(sb.toString());
        ARI action = this.LJLILLLLZI;
        o.LJIIIZ(action, "action");
        c26227ARb.LJIIL = action;
        c26227ARb.LJIIIZ = new C244659iv(this.LJLJJI, R.raw.icon_phone, Integer.valueOf(R.attr.go), 0);
        c26227ARb.LJIIIIZZ = !this.LJLJJI.LLIILII.LIZ();
        c26227ARb.LIZJ(new AObjectS42S0101000_5(2, this, 25));
        c26227ARb.LJII = this.LJLJJI.LLIILII.LIZ();
        if (verificationResponse.shouldShowChangeMobileDialog()) {
            TuxTextView tuxTextView = new TuxTextView(this.LJLJJI);
            tuxTextView.setText(this.LJLJJI.getString(R.string.tfq));
            tuxTextView.setTuxFont(41);
            tuxTextView.setTextColorRes(R.attr.gu);
            tuxTextView.setGravity(17);
            c26227ARb.LJIIJJI = new C238249Wq(tuxTextView);
        }
        c26227ARb.LJI().LIZLLL();
        this.LJLJJI.LLILIL(true);
    }

    public C78974Uz4(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, ARI ari, DialogC254019y1 dialogC254019y1) {
        this.LJLJJI = i18nSettingManageMyAccountActivity;
        this.LJLILLLLZI = ari;
        this.LJLJI = dialogC254019y1;
    }
}
