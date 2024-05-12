package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* renamed from: X.CqF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32563CqF extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ LiveRoomUserInfoWidget LIZIZ;

    public C32563CqF(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.LIZIZ = liveRoomUserInfoWidget;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        if (animatable instanceof AnimatedDrawable2) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            animatedDrawable2.LJFF(new C518821w(animatedDrawable2.LJLJI, 1));
        }
        View view = this.LIZIZ.LJZI;
        if (view != null && view.getVisibility() == 0) {
            this.LIZIZ.LLIIIL();
        }
    }
}
