package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final /* synthetic */ class MME extends TBS implements InterfaceC88471Ynr<Integer, InboxEntrancePod, C76800UCe> {
    public MME(Object obj) {
        super(2, obj, MMD.class, "showActionSheet", "showActionSheet(ILcom/ss/android/ugc/aweme/inbox/widget/multi/InboxEntrancePod;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, InboxEntrancePod inboxEntrancePod) {
        String str;
        String str2;
        int intValue = num.intValue();
        InboxEntrancePod p1 = inboxEntrancePod;
        o.LJIIIZ(p1, "p1");
        MMD mmd = (MMD) this.receiver;
        mmd.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show action sheet entrance ");
        InboxEntranceCellUIInfo LIZIZ = MLS.LIZIZ(p1);
        if (LIZIZ != null) {
            str = LIZIZ.getTitle();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" position ");
        LIZ.append(intValue);
        C221018lt.LJFF("NoticeAndDMCombineAdapter", X1D.LIZIZ(LIZ));
        mmd.LJLLLLLL = intValue;
        mmd.LJLZ = p1;
        C245319jz c245319jz = new C245319jz();
        InboxEntranceCellUIInfo LIZIZ2 = MLS.LIZIZ(p1);
        if (LIZIZ2 == null || (str2 = LIZIZ2.getTitle()) == null) {
            str2 = "";
        }
        c245319jz.LIZ.LJLLILLLL = str2;
        ArrayList arrayList = new ArrayList();
        if (p1.entranceCell.getCanPin()) {
            if (p1.entranceCell.getPriority() == 0) {
                arrayList.add(mmd.LJLLL.getValue());
            } else {
                arrayList.add(mmd.LJLLLL.getValue());
            }
        }
        if (p1.entranceCell.getCanHide()) {
            arrayList.add(mmd.LJLLJ.getValue());
        }
        c245319jz.LJ(arrayList);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager requireFragmentManager = mmd.LJLIL.requireFragmentManager();
        o.LJIIIIZZ(requireFragmentManager, "fragment.requireFragmentManager()");
        LIZJ.show(requireFragmentManager, "MultiAdapter");
        return C76800UCe.LIZ;
    }
}
