package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.CqS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32576CqS extends V1B {
    public final /* synthetic */ LiveNewGiftBottomWidget LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
        if (animatable instanceof AnimatedDrawable2) {
            ((AnimatedDrawable2) animatable).LJI(new C32577CqT(this.LJLJJL, this.LJLJJLL));
        }
    }

    public C32576CqS(LiveNewGiftBottomWidget liveNewGiftBottomWidget, int i) {
        this.LJLJJL = liveNewGiftBottomWidget;
        this.LJLJJLL = i;
    }
}
