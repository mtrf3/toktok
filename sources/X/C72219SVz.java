package X;

import com.ss.android.ugc.aweme.qna.assem.QnaHeaderAssem;
import com.ss.android.ugc.aweme.qna.vm.QnaMobViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SVz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72219SVz extends AbstractC008101l {
    public final /* synthetic */ QnaHeaderAssem LIZJ;

    @Override // X.AbstractC008101l
    public final void LIZ() {
        QnaMobViewModel qnaMobViewModel = this.LIZJ.LJLJJL;
        if (qnaMobViewModel != null) {
            EnumC72752Sgu qaTrendingExitMethod = EnumC72752Sgu.CLICK_BACK;
            o.LJIIIZ(qaTrendingExitMethod, "qaTrendingExitMethod");
            qnaMobViewModel.LJLIL.setValue(new C74100T6i<>(qaTrendingExitMethod));
            LIZIZ();
            ActivityC45651qj activityC45651qj = this.LIZJ.LJLIL;
            if (activityC45651qj != null) {
                activityC45651qj.onBackPressed();
                return;
            } else {
                o.LJIJI("activity");
                throw null;
            }
        }
        o.LJIJI("qnaMobVm");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72219SVz(QnaHeaderAssem qnaHeaderAssem) {
        super(true);
        this.LIZJ = qnaHeaderAssem;
    }
}
