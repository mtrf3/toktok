package X;

import Y.ACListenerS27S0101000_9;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class MUZ implements InterfaceC56810MRi {
    public static final /* synthetic */ int LJLJJL = 0;
    public final InterfaceC56881MUb LJLIL;
    public final boolean LJLILLLLZI;
    public C96533qb LJLJI;
    public final C62822Ol8 LJLJJI;

    public /* synthetic */ MUZ() {
        throw null;
    }

    @Override // X.InterfaceC56810MRi
    public void onItemClick(int i) {
    }

    public final List<MusNotice> LIZ() {
        return this.LJLIL.getData();
    }

    public final Fragment LIZIZ() {
        return this.LJLIL.getFragment();
    }

    public final InterfaceC56771MPv LIZJ() {
        return this.LJLIL.LIZJ();
    }

    public final boolean LJFF(int i) {
        if (i <= 0) {
            return true;
        }
        C40511Fv9 LJIILLIIL = C78842Uww.LJIILLIIL(i - 1, 0);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIILLIIL, 10));
        Iterator<Integer> it = LJIILLIIL.iterator();
        while (it.hasNext()) {
            arrayList.add(ListProtector.get(LIZ(), ((AbstractC118224kU) it).nextInt()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            BaseNotice baseNotice = (BaseNotice) it2.next();
            if (baseNotice instanceof MPH) {
                if (baseNotice.timeLineType == 0) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC56810MRi
    public void onItemLongClick(int i) {
        BaseNotice baseNotice;
        String type;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        if (i >= LIZ().size() || LIZIZ().getContext() == null) {
            return;
        }
        ACListenerS27S0101000_9 aCListenerS27S0101000_9 = new ACListenerS27S0101000_9(this, i, 2);
        User user = null;
        if (i >= 0 && i < LIZ().size()) {
            baseNotice = (BaseNotice) ListProtector.get(LIZ(), i);
        } else {
            baseNotice = null;
        }
        if (baseNotice != null && baseNotice.type == 225) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "notification_page");
            c188727au.LJIIIZ("action_type", "show");
            c188727au.LJIIIZ("from_user_id", baseNotice.userId);
            String str = AX5.LIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c188727au.LJIIIZ("position", str);
            C200007t6 c200007t6 = C57364MfI.Companion;
            GeneralTemplateNotice generalTemplateNotice = baseNotice.templateNotice;
            if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null) {
                user = (User) ORZ.LJLLLL(list);
            }
            c200007t6.getClass();
            EnumC199997t5 LIZ = C200007t6.LIZ(user);
            if (LIZ != null && (type = LIZ.getType()) != null) {
                str2 = type;
            }
            c188727au.LJIIIZ("follow_type", str2);
            FMX.LJIIL("recommend_delete_button", c188727au.LIZ);
        }
        FragmentManager fragmentManager = LIZIZ().getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        C245319jz c245319jz = new C245319jz();
        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.efd);
        LIZIZ.LIZJ = 1;
        LIZIZ.LJ = aCListenerS27S0101000_9;
        c245319jz.LIZIZ(LIZIZ);
        c245319jz.LIZJ().show(fragmentManager, "DELETE_NOTICE_ACTION_SHEET_TAG");
    }

    public MUZ(InterfaceC56881MUb interfaceC56881MUb, boolean z) {
        this.LJLIL = interfaceC56881MUb;
        this.LJLILLLLZI = z;
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1071));
        if (L0K.LIZJ) {
            int LIZIZ = C7MY.LIZIZ(56);
            int LIZIZ2 = C7MY.LIZIZ(42);
            int LIZIZ3 = C7MY.LIZIZ(40);
            Activity topActivity = ActivityStack.getTopActivity();
            o.LJIIIIZZ(topActivity, "getTopActivity()");
            this.LJLJI = new C96533qb(0, LIZIZ, LIZIZ2, LIZIZ3, 0, 0, 0, AnonymousClass636.LJIIIIZZ(R.attr.gu, topActivity), R.attr.gu, 0, 0, 0, null, 31985);
        }
    }

    public static void LJIIIIZZ(RecyclerView.ViewHolder viewHolder, int i) {
        try {
            o.LJII(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewBaseNotificationHolder");
            ((C56906MVa) viewHolder).setNotificationGuideBundle(i);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x05dc, code lost:
    
        if (r6 > 1) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0961, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0a6c, code lost:
    
        if (r9 != null) goto L629;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0063. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0660  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(androidx.recyclerview.widget.RecyclerView.ViewHolder r26, int r27) {
        /*
            Method dump skipped, instructions count: 3262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUZ.LJI(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder LJII(android.view.ViewGroup r6, int r7) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUZ.LJII(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public static View LIZLLL(int i, ViewGroup viewGroup, boolean z) {
        return C1DI.LIZ(viewGroup, "parent", i, viewGroup, z, "from(parent.context).inf…, parent, attachToParent)");
    }

    public static /* synthetic */ View LJ(MUZ muz, int i, ViewGroup viewGroup) {
        muz.getClass();
        return LIZLLL(i, viewGroup, false);
    }
}
