package X;

import android.text.TextPaint;
import android.view.View;
import com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment;

/* loaded from: classes10.dex */
public final class MF3 extends AnonymousClass899 {
    public final /* synthetic */ MTAwemeListFragment LJLIL;

    public MF3(MTAwemeListFragment mTAwemeListFragment) {
        this.LJLIL = mTAwemeListFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.LJLIL.LLLZI();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
