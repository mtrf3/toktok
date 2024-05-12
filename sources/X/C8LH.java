package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.assem.videodownload.VideoDownloadProgressAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8LH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LH extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDownloadProgressAssem, C43I<? extends C8LI>, C76800UCe> {
    public static final C8LH LJLIL = new C8LH();

    public C8LH() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDownloadProgressAssem videoDownloadProgressAssem, C43I<? extends C8LI> c43i) {
        C8LI c8li;
        View view;
        int i;
        VideoDownloadProgressAssem selectSubscribe = videoDownloadProgressAssem;
        C43I<? extends C8LI> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c8li = (C8LI) c43i2.LIZ) != null && (view = selectSubscribe.LJZL) != null) {
            if (c8li.LJLIL) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = c8li.LJLILLLLZI;
                view.setLayoutParams(layoutParams);
            }
            if (c8li.LJLIL) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        return C76800UCe.LIZ;
    }
}
