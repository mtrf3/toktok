package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.broadcast.feedback.FeedbackAnimWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.CXc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31480CXc extends C31073CHl {
    public final /* synthetic */ FeedbackAnimWidget LJLJL;

    @Override // X.C31073CHl
    public final void LJFF() {
    }

    public C31480CXc(FeedbackAnimWidget feedbackAnimWidget) {
        this.LJLJL = feedbackAnimWidget;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        this.LJLJL.hide();
    }
}
