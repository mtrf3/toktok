package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7w5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201857w5 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCommentAssem, Drawable, C76800UCe> {
    public static final C201857w5 LJLIL = new C201857w5();

    public C201857w5() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, Drawable drawable) {
        VideoCommentAssem selectSubscribe = videoCommentAssem;
        Drawable drawable2 = drawable;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ImageView imageView = selectSubscribe.LLIIL;
        if (imageView != null) {
            imageView.setImageDrawable(drawable2);
            return C76800UCe.LIZ;
        }
        o.LJIJI("commentImageView");
        throw null;
    }
}
