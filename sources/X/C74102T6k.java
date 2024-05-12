package X;

import com.ss.android.ugc.aweme.qna.vm.QnaNavigationViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.T6k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74102T6k implements T84 {
    public final /* synthetic */ QnaViewModel LJLIL;
    public final /* synthetic */ QnaNavigationViewModel LJLILLLLZI;

    @Override // X.T84
    public final void LLLL() {
        QnaViewModel qnaViewModel = this.LJLIL;
        if (qnaViewModel != null) {
            qnaViewModel.LLLL();
        }
    }

    @Override // X.T84
    public final void RO(String str) {
        QnaViewModel qnaViewModel = this.LJLIL;
        if (qnaViewModel != null) {
            qnaViewModel.RO(str);
        }
    }

    @Override // X.T84
    public final void mQ(C69603RTj c69603RTj) {
        QnaViewModel qnaViewModel = this.LJLIL;
        if (qnaViewModel != null) {
            qnaViewModel.mQ(c69603RTj);
        }
    }

    @Override // X.T84
    public final void q00(T7E t7e) {
        QnaViewModel qnaViewModel = this.LJLIL;
        if (qnaViewModel != null) {
            qnaViewModel.q00(t7e);
        }
    }

    public C74102T6k(QnaViewModel qnaViewModel, QnaNavigationViewModel qnaNavigationViewModel) {
        this.LJLIL = qnaViewModel;
        this.LJLILLLLZI = qnaNavigationViewModel;
    }

    @Override // X.T84
    public final void jI(int i, String str) {
        QnaViewModel qnaViewModel = this.LJLIL;
        if (qnaViewModel != null) {
            qnaViewModel.jI(i, str);
        }
    }

    @Override // X.T84
    public final void vg0(String questionId, String str) {
        o.LJIIIZ(questionId, "questionId");
        QnaNavigationViewModel qnaNavigationViewModel = this.LJLILLLLZI;
        if (qnaNavigationViewModel != null) {
            qnaNavigationViewModel.vg0(questionId, str);
        }
    }

    @Override // X.T84
    public final void wA(C71830SHa videoThumbnailData, String str) {
        o.LJIIIZ(videoThumbnailData, "videoThumbnailData");
        QnaViewModel qnaViewModel = this.LJLIL;
        if (qnaViewModel != null) {
            qnaViewModel.wA(videoThumbnailData, str);
        }
    }

    @Override // X.T84
    public final void HO(String str, List list, boolean z) {
        QnaViewModel qnaViewModel = this.LJLIL;
        if (qnaViewModel != null) {
            qnaViewModel.HO(str, list, z);
        }
    }
}
