package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.inbox.widget.multi.NoticeAndDMCombineWidget;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MM2 extends MMX<MNO> implements MMB {
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;

    public MM2(MM4 mm4) {
        super(mm4);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mm4, 971));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 972));
        this.LJLLI = C221108m2.LIZIZ(MMC.LJLIL);
    }

    @Override // X.MMB
    public final void LJJJIL(MM6 tabType) {
        int index;
        o.LJIIIZ(tabType, "tabType");
        if (tabType == MM6.REQUESTS) {
            SmartRoute buildRoute = SmartRouter.buildRoute(M(), "//im/stranger_list");
            buildRoute.withCallback(new MM3());
            buildRoute.open();
        } else {
            NoticeAndDMCombineWidget noticeAndDMCombineWidget = (NoticeAndDMCombineWidget) this.LJLL.getValue();
            if (noticeAndDMCombineWidget != null && noticeAndDMCombineWidget.LLIIIZ != (index = tabType.getIndex())) {
                noticeAndDMCombineWidget.LLIIIZ = index;
                noticeAndDMCombineWidget.LJIL();
            }
        }
    }

    @Override // X.MMB
    public final void LJL(EnumC253269wo filterType) {
        int index;
        o.LJIIIZ(filterType, "filterType");
        NoticeAndDMCombineWidget noticeAndDMCombineWidget = (NoticeAndDMCombineWidget) this.LJLL.getValue();
        if (noticeAndDMCombineWidget != null && noticeAndDMCombineWidget.LLIIJI != (index = filterType.getIndex())) {
            noticeAndDMCombineWidget.LLIIJI = index;
            noticeAndDMCombineWidget.LJIL();
        }
    }

    @Override // X.MMX
    public final void V(MNO mno) {
        super.V(mno);
        C56204M4a.LIZLLL("life-CreatorTabBarVH # onBindData");
        if (((AtomicBoolean) this.LJLLI.getValue()).compareAndSet(false, true)) {
            MM4 mm4 = (MM4) this.LJLJLLL.getValue();
            mm4.getClass();
            mm4.LJLJL.add(this);
            C56204M4a.LJIIIIZZ();
        }
    }
}
