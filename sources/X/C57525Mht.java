package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Mht, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57525Mht extends ClickableSpan {
    public final /* synthetic */ ViewOnClickListenerC57522Mhq LJLIL;

    public C57525Mht(ViewOnClickListenerC57522Mhq viewOnClickListenerC57522Mhq) {
        this.LJLIL = viewOnClickListenerC57522Mhq;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        SmartRouter.buildRoute(this.LJLIL.getContext(), "//privacy/setting").open();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.LJLIL.getResources().getColor(R.color.c0));
        textPaint.setUnderlineText(false);
    }
}
