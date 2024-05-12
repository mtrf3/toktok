package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.EditText;
import com.ss.android.ugc.aweme.setting.ui.beta.BetaEmailRegisterPage;

/* renamed from: X.AAd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnFocusChangeListenerC25787AAd implements View.OnFocusChangeListener {
    public final /* synthetic */ BetaEmailRegisterPage LJLIL;
    public final /* synthetic */ EditText LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ GradientDrawable LJLJJI;

    public ViewOnFocusChangeListenerC25787AAd(BetaEmailRegisterPage betaEmailRegisterPage, EditText editText, View view, GradientDrawable gradientDrawable) {
        this.LJLIL = betaEmailRegisterPage;
        this.LJLILLLLZI = editText;
        this.LJLJI = view;
        this.LJLJJI = gradientDrawable;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            BetaEmailRegisterPage betaEmailRegisterPage = this.LJLIL;
            String obj = this.LJLILLLLZI.getText().toString();
            if (!betaEmailRegisterPage.LJLJI.matches(obj) || obj.length() == 0) {
                this.LJLJI.setVisibility(0);
                this.LJLILLLLZI.setBackground(this.LJLJJI);
            }
        }
    }
}
