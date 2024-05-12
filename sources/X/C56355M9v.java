package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* renamed from: X.M9v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56355M9v extends AbstractC65781Prl implements InterfaceC65784Pro<InboxTopHorizontalListVM> {
    public static final C56355M9v LJLIL = new C56355M9v();

    public C56355M9v() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM] */
    @Override // X.InterfaceC65784Pro
    public final InboxTopHorizontalListVM invoke() {
        ActivityC45651qj activityC45651qj;
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity) == null) {
            return null;
        }
        return new C214378bB(C65352Pkq.LIZ(InboxTopHorizontalListVM.class), C56357M9x.LJLIL, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C56356M9w.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj)).getValue();
    }
}
