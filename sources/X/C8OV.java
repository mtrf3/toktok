package X;

import Y.ARunnableS9S0110000_3;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.feed.platform.container.info.FeedInfoAreaContainer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8OV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OV extends AbstractC65781Prl implements InterfaceC88473Ynt<FeedInfoAreaContainer, Boolean, Long, C76800UCe> {
    public static final C8OV LJLIL = new C8OV();

    public C8OV() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(FeedInfoAreaContainer feedInfoAreaContainer, Boolean bool, Long l) {
        int i;
        FeedInfoAreaContainer selectSubscribe = feedInfoAreaContainer;
        boolean booleanValue = bool.booleanValue();
        long longValue = l.longValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        final View findViewById = selectSubscribe.getContainerView().findViewById(R.id.adq);
        if (findViewById != null) {
            final float f = 1.0f;
            if (longValue <= 0) {
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                findViewById.setVisibility(i);
                if (!booleanValue) {
                    f = 0.0f;
                }
                findViewById.setAlpha(f);
            } else {
                if (booleanValue) {
                    f = 0.0f;
                }
                findViewById.clearAnimation();
                findViewById.animate().alpha(1 - f).setDuration(longValue).setInterpolator(new LinearInterpolator()).withStartAction(new Runnable() { // from class: X.2N0
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            findViewById.setAlpha(f);
                            findViewById.setVisibility(0);
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                }).withEndAction(new ARunnableS9S0110000_3(findViewById, booleanValue, 4)).start();
            }
        }
        return C76800UCe.LIZ;
    }
}
