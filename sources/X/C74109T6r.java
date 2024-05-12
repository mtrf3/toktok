package X;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.qna.assem.QnaTabsContainerAssem;
import com.ss.android.ugc.aweme.qna.fragment.QnaQuestionsTabFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.T6r, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74109T6r implements InterfaceC74055T4p {
    public final /* synthetic */ C74110T6s LIZ;
    public final /* synthetic */ QnaTabsContainerAssem LIZIZ;
    public final /* synthetic */ ViewPager LIZJ;

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI tab) {
        o.LJIIIZ(tab, "tab");
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI tab) {
        o.LJIIIZ(tab, "tab");
        int i = tab.LIZLLL;
        if (this.LIZ.LJJIIJ(i) instanceof QnaQuestionsTabFragment) {
            this.LIZIZ.LJLJLLL = Integer.valueOf(i);
            if (o.LJ(this.LIZIZ.v3().LJLIL, "qa_detail") && o.LJ(this.LIZIZ.v3().LJLILLLLZI, "click_toast")) {
                this.LIZJ.setCurrentItem(i, true);
            }
        }
        C74053T4n c74053T4n = this.LIZIZ.LJLJLJ;
        if (c74053T4n != null) {
            KeyboardUtils.LIZIZ(c74053T4n);
            ((AssemViewModel) this.LIZIZ.LJLILLLLZI.getValue()).setState(E85.LJLIL);
            this.LIZ.getClass();
            return;
        }
        o.LJIJI("tabLayout");
        throw null;
    }

    public C74109T6r(C74110T6s c74110T6s, QnaTabsContainerAssem qnaTabsContainerAssem, ViewPager viewPager) {
        this.LIZ = c74110T6s;
        this.LIZIZ = qnaTabsContainerAssem;
        this.LIZJ = viewPager;
    }
}
