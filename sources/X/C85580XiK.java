package X;

import android.content.Intent;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity;

/* renamed from: X.XiK, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85580XiK extends AbstractC80579Vjr {
    public final /* synthetic */ LoginMethodListActivity LIZ;

    @Override // X.AbstractC80579Vjr
    public final void LIZ(View view) {
    }

    public C85580XiK(LoginMethodListActivity loginMethodListActivity) {
        this.LIZ = loginMethodListActivity;
    }

    @Override // X.AbstractC80579Vjr
    public final void LIZIZ(int i, View view) {
        String str;
        if (i == 5) {
            String LJJLIIIJJI = this.LIZ.LJJLIIIJJI();
            String LJJLIIIJLLLLLLLZ = this.LIZ.LJJLIIIJLLLLLLLZ();
            Intent intent = this.LIZ.getIntent();
            if (intent != null) {
                str = C16880lQ.LLJJIJIIJIL(intent, "login_panel_type");
            } else {
                str = null;
            }
            R5Q.LIZJ(LJJLIIIJJI, LJJLIIIJLLLLLLLZ, str, "slide");
            this.LIZ.getWindow().setDimAmount(0.0f);
            this.LIZ.finish();
        }
    }
}
