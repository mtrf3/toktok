package X;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204037zb extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoShareAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C204037zb LJLIL = new C204037zb();

    public C204037zb() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, C43I<? extends Boolean> c43i) {
        Boolean bool;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator duration;
        VideoShareAssem selectSubscribe = videoShareAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Context context = selectSubscribe.getContext();
        if (context == null || !C79004UzY.LJJIJIIJI(context)) {
            if (c43i2 != null) {
                bool = c43i2.LIZ();
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.FALSE)) {
                selectSubscribe.E4();
                C35570Dxe.LIZJ(selectSubscribe.Y3().findViewById(R.id.jt3));
                selectSubscribe.Y3().findViewById(R.id.jt3).clearAnimation();
                View findViewById = selectSubscribe.Y3().findViewById(R.id.jt3);
                if (findViewById != null && (animate = findViewById.animate()) != null && (scaleX = animate.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (duration = scaleY.setDuration(150L)) != null) {
                    duration.start();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
