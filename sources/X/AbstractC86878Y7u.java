package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.Y7u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86878Y7u {
    public final Aweme LIZ;
    public final InterfaceC222708oc LIZIZ;
    public final View LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final C62822Ol8 LJFF;

    public abstract void LIZIZ(float f, float f2);

    public final float LIZ() {
        return ((Number) this.LJFF.getValue()).floatValue();
    }

    public AbstractC86878Y7u(Aweme aweme, InterfaceC222708oc interfaceC222708oc, View view) {
        float f;
        this.LIZ = aweme;
        this.LIZIZ = interfaceC222708oc;
        this.LIZJ = view;
        View videoView = interfaceC222708oc.getVideoView();
        if (videoView != null) {
            f = videoView.getScaleX();
        } else {
            f = 1.0f;
        }
        this.LIZLLL = f;
        View videoView2 = interfaceC222708oc.getVideoView();
        this.LJ = videoView2 != null ? videoView2.getScaleY() : 1.0f;
        this.LJFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 760));
    }
}
