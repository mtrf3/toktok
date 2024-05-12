package X;

import Y.ACListenerS27S0101000_9;
import Y.IDCListenerS284S0100000_9;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SystemNoticeData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final /* synthetic */ class MDL extends TBS implements InterfaceC88473Ynt<ViewOnClickListenerC56819MRr, Integer, String, C76800UCe> {
    public MDL(Object obj) {
        super(3, obj, C56818MRq.class, "showActionSheet", "showActionSheet(Lcom/ss/android/ugc/aweme/notification/vh/NoticeCardViewHolder;ILjava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(ViewOnClickListenerC56819MRr viewOnClickListenerC56819MRr, Integer num, String str) {
        List<SystemNoticeData> data;
        MusNotice notice;
        Boolean bool;
        int i;
        GeneralTemplateNotice generalTemplateNotice;
        ViewOnClickListenerC56819MRr p0 = viewOnClickListenerC56819MRr;
        int intValue = num.intValue();
        String p2 = str;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        C56818MRq c56818MRq = (C56818MRq) this.receiver;
        FragmentManager fragmentManager = c56818MRq.LJLIL.getFragmentManager();
        if (fragmentManager != null && (data = c56818MRq.getData()) != null && data.size() > intValue) {
            c56818MRq.LJLJJLL = p0;
            SystemNoticeData systemNoticeData = (SystemNoticeData) ListProtector.get(data, intValue);
            if (systemNoticeData != null && (notice = systemNoticeData.getNotice()) != null) {
                c56818MRq.LJLJJL = notice;
                StringBuilder LJ = C7MY.LJ("show action sheet notice position ", intValue, ", isUnsubscribe = ");
                MusNotice musNotice = c56818MRq.LJLJJL;
                if (musNotice != null) {
                    bool = Boolean.valueOf(musNotice.isUnsubscribe());
                } else {
                    bool = null;
                }
                LJ.append(bool);
                C221018lt.LJFF("NoticeCardAdapter", X1D.LIZIZ(LJ));
                ArrayList arrayList = new ArrayList();
                MusNotice musNotice2 = c56818MRq.LJLJJL;
                boolean z = true;
                if (musNotice2 != null && (generalTemplateNotice = musNotice2.templateNotice) != null && !generalTemplateNotice.shouldKeep) {
                    ACListenerS27S0101000_9 aCListenerS27S0101000_9 = new ACListenerS27S0101000_9(c56818MRq, intValue, 4);
                    C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.hfq);
                    LIZIZ.LIZJ = 0;
                    LIZIZ.LJ = aCListenerS27S0101000_9;
                    arrayList.add(LIZIZ);
                }
                MusNotice musNotice3 = c56818MRq.LJLJJL;
                if (musNotice3 != null && musNotice3.supportUnsubscribe()) {
                    MusNotice musNotice4 = c56818MRq.LJLJJL;
                    if (musNotice4 == null || !musNotice4.isUnsubscribe()) {
                        z = false;
                    }
                    MDG mdg = new MDG(c56818MRq, z);
                    if (z) {
                        i = R.string.ije;
                    } else {
                        i = R.string.ijd;
                    }
                    C252669vq LIZIZ2 = C06530Nl.LIZIZ(i);
                    LIZIZ2.LIZJ = 0;
                    LIZIZ2.LJ = mdg;
                    arrayList.add(LIZIZ2);
                }
                C245319jz c245319jz = new C245319jz();
                c245319jz.LIZ.LJLLILLLL = p2;
                c245319jz.LJFF(arrayList);
                c245319jz.LIZ.LJLIL = new IDCListenerS284S0100000_9(c56818MRq, 4);
                c245319jz.LIZJ().show(fragmentManager, "NoticeCardAdapter");
            }
        }
        return C76800UCe.LIZ;
    }
}
