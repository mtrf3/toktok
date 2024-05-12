package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginDialogFragment;
import java.util.List;

/* renamed from: X.XiC, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85572XiC implements C0C3 {
    public int LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ List<Fragment> LJLJJI;
    public final /* synthetic */ C85575XiF LJLJJL;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrollStateChanged(int r7) {
        /*
            r6 = this;
            int r0 = r6.LJLIL
            if (r0 != 0) goto L1c
            r0 = 1
            if (r7 != r0) goto L1c
            X.XiF r0 = r6.LJLJJL
            com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r0.LIZIZ()
            X.XiD r0 = r0.ov0()
            com.bytedance.tux.input.TuxTextView r0 = r0.LJLIL
            float r0 = r0.getAlpha()
            r6.LJLILLLLZI = r0
        L19:
            r6.LJLIL = r7
            return
        L1c:
            if (r7 != 0) goto L19
            X.XiF r4 = r6.LJLJJL
            java.lang.String r5 = r4.LJIIJ()
            int r1 = r5.hashCode()
            r0 = -902467304(0xffffffffca357118, float:-2972742.0)
            java.lang.String r3 = "login"
            java.lang.String r2 = "signup"
            if (r1 == r0) goto La5
            r0 = 103149417(0x625ef69, float:3.1208942E-35)
            if (r1 == r0) goto L9e
            r0 = 444807686(0x1a833a06, float:5.427407E-23)
            if (r1 == r0) goto L8b
        L3b:
            X.XiF r0 = r6.LJLJJL
            r0.LJI()
            X.XiF r0 = r6.LJLJJL
            X.Vct r0 = r0.LJI
            int r0 = r0.getCurrentItem()
            r6.LJLJI = r0
            X.XiF r5 = r6.LJLJJL
            java.lang.String r1 = r5.LJIIJ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r2)
            java.lang.String r4 = "enter_type"
            if (r0 == 0) goto L74
            com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r5.LIZIZ()
            android.os.Bundle r1 = r0.nv0()
            java.lang.String r0 = "click_sign_up"
            r1.putString(r4, r0)
            r3 = r2
        L66:
            com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r5.LIZIZ()
            android.os.Bundle r1 = r0.mv0()
            java.lang.String r0 = "login_panel_type"
            r1.putString(r0, r3)
            goto L19
        L74:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r3)
            if (r0 == 0) goto L88
            com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r5.LIZIZ()
            android.os.Bundle r1 = r0.nv0()
            java.lang.String r0 = "click_login"
            r1.putString(r4, r0)
            goto L66
        L88:
            java.lang.String r3 = "setupLoginPanelType"
            goto L66
        L8b:
            java.lang.String r0 = "ru_instant_login_si"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L94
            goto L3b
        L94:
            X.Xqz r1 = r4.LIZ
            r0 = 2131843870(0x7f115b1e, float:1.9321117E38)
            java.lang.String r1 = r1.getString(r0)
            goto Lbe
        L9e:
            boolean r0 = r5.equals(r3)
            if (r0 != 0) goto Lb5
            goto L3b
        La5:
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L3b
            X.Xqz r1 = r4.LIZ
            r0 = 2131826644(0x7f1117d4, float:1.9286178E38)
            java.lang.String r1 = r1.getString(r0)
            goto Lbe
        Lb5:
            X.Xqz r1 = r4.LIZ
            r0 = 2131826582(0x7f111796, float:1.9286052E38)
            java.lang.String r1 = r1.getString(r0)
        Lbe:
            if (r1 == 0) goto L3b
            com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r4.LIZIZ()
            X.XiD r0 = r0.ov0()
            com.bytedance.tux.input.TuxTextView r0 = r0.LJLIL
            r0.setText(r1)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85572XiC.onPageScrollStateChanged(int):void");
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        LoginDialogFragment loginDialogFragment;
        AbstractC85571XiB abstractC85571XiB;
        int i2 = 1 - i;
        if (i2 >= 0 && i2 < this.LJLJJI.size()) {
            Object obj = ListProtector.get(this.LJLJJI, i2);
            if (!(obj instanceof LoginDialogFragment) || (loginDialogFragment = (LoginDialogFragment) obj) == null || !loginDialogFragment.isViewValid() || (abstractC85571XiB = loginDialogFragment.LJLIL) == null) {
                return;
            }
            abstractC85571XiB.LIZIZ().LJLI(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C85572XiC(List<? extends Fragment> list, C85575XiF c85575XiF) {
        this.LJLJJI = list;
        this.LJLJJL = c85575XiF;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.LJLILLLLZI == 0.0f || f == 0.0f) {
            return;
        }
        TuxTextView tuxTextView = this.LJLJJL.LIZIZ().ov0().LJLIL;
        float f2 = this.LJLILLLLZI;
        if (this.LJLJI == 0) {
            f = 1 - f;
        }
        tuxTextView.setAlpha(f2 * f);
        this.LJLJJL.LIZIZ().ov0().LJLILLLLZI.setAlpha(this.LJLJJL.LIZIZ().ov0().LJLIL.getAlpha());
    }
}
