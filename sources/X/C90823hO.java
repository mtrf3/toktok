package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentVM;
import kotlin.jvm.internal.o;

/* renamed from: X.3hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90823hO extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoQuickCommentAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C90823hO LJLIL = new C90823hO();

    public C90823hO() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoQuickCommentAssem videoQuickCommentAssem, C43I<? extends C76800UCe> c43i) {
        VideoQuickCommentAssem selectSubscribe = videoQuickCommentAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoQuickCommentVM videoQuickCommentVM = (VideoQuickCommentVM) selectSubscribe.LLIIIL.LIZ(selectSubscribe, VideoQuickCommentAssem.LLIILZL[0]);
        if (!videoQuickCommentVM.LJLJLLL.isActive()) {
            videoQuickCommentVM.LJLJLLL = XKX.LIZLLL(ViewModelKt.getViewModelScope(videoQuickCommentVM), C78613UtF.LIZJ, null, new C63062di(videoQuickCommentVM, null), 2);
        }
        return C76800UCe.LIZ;
    }
}
