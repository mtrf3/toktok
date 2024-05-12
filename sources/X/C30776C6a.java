package X;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;

/* renamed from: X.C6a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30776C6a extends C6L {
    public final int LJLJJL;
    public final User LJLJJLL;

    @Override // X.C8FQ
    public final void LIZ(View view) {
    }

    public void LIZJ(View view, UserProfileEvent userProfileEvent) {
    }

    @Override // X.C6L
    public final void LIZIZ(View view) {
        User user;
        if (view != null && (user = this.LJLJJLL) != null) {
            if (user.getUserRole() == 0 && this.LJLJJLL.getId() == 0) {
                return;
            }
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.LJLJJLL.getId(), "comment_filed");
            userProfileEvent.mReportType = "report_user";
            userProfileEvent.mSource = "live_comment";
            userProfileEvent.mShowEntrance = "comment_area";
            LIZJ(view, userProfileEvent);
            C73943T0h.LIZ().LIZIZ(userProfileEvent);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.LJLJJL);
    }

    public C30776C6a(int i, User user) {
        this.LJLJJLL = user;
        this.LJLJJL = i;
        this.LJLJI = false;
    }
}
