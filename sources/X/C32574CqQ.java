package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.CqQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32574CqQ extends W4V<Object> {
    public final /* synthetic */ LiveNewGiftBottomWidget LIZIZ;
    public final /* synthetic */ int LIZJ;

    public C32574CqQ(LiveNewGiftBottomWidget liveNewGiftBottomWidget, int i) {
        this.LIZIZ = liveNewGiftBottomWidget;
        this.LIZJ = i;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String id, Object obj, Animatable animatable) {
        o.LJIIIZ(id, "id");
        if (animatable instanceof AnimatedDrawable2) {
            ((AnimatedDrawable2) animatable).LJI(new C32575CqR(this.LIZIZ, this.LIZJ));
        }
    }
}
