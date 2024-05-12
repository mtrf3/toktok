package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204267zy extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoShareAssem, AnonymousClass800, C76800UCe> {
    public static final C204267zy LJLIL = new C204267zy();

    public C204267zy() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, AnonymousClass800 anonymousClass800) {
        View findViewById;
        ImageView imageView;
        VideoShareAssem selectSubscribe = videoShareAssem;
        AnonymousClass800 anonymousClass8002 = anonymousClass800;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (anonymousClass8002 != null) {
            C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
            if (c88545Yp3 != null) {
                c88545Yp3.LIZJ(false);
            }
            Drawable drawable = anonymousClass8002.LIZ;
            if (drawable != null) {
                ((VA9) selectSubscribe.Y3().findViewById(R.id.jtf)).setImageDrawable(drawable);
            }
            ViewGroup.LayoutParams layoutParams = anonymousClass8002.LIZIZ;
            if (layoutParams != null) {
                ViewGroup.LayoutParams layoutParams2 = selectSubscribe.Y3().findViewById(R.id.jtf).getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                selectSubscribe.Y3().findViewById(R.id.jtf).setLayoutParams(layoutParams2);
            }
            if (AnonymousClass803.LIZ() && (findViewById = selectSubscribe.getContainerView().findViewById(R.id.ce6)) != null && findViewById.getVisibility() == 0 && (imageView = (ImageView) selectSubscribe.getContainerView().findViewById(R.id.ce6)) != null) {
                imageView.setVisibility(8);
            }
        }
        return C76800UCe.LIZ;
    }
}
