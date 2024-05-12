package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.mention.viewmodel;

import X.C00F;
import X.C221108m2;
import X.C32I;
import X.C3H1;
import X.C3H6;
import X.C3Q9;
import X.C44384HbQ;
import X.C47261Igj;
import X.C4WC;
import X.C61878OQg;
import X.C62822Ol8;
import X.C75782yE;
import X.C79853Bl;
import X.C79883Bo;
import X.C80853Fh;
import X.C81143Gk;
import X.C81243Gu;
import X.C98563ts;
import X.EnumC81123Gi;
import X.HG3;
import X.InterfaceC80883Fk;
import X.InterfaceC81223Gs;
import X.ORZ;
import X.RBX;
import X.V8H;
import X.XLL;
import X.XLM;
import Y.IDComparatorS29S0000000_1;
import Y.IDComparatorS334S0100000_1;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MentionPanelViewModel extends ViewModel implements InterfaceC81223Gs {
    public static final /* synthetic */ int LLFF = 0;
    public final C98563ts LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final C81143Gk LJLJJI;
    public final InterfaceC80883Fk LJLJJL;
    public final C3H1 LJLJJLL;
    public final C3Q9 LJLJL;
    public final XLM LJLJLJ;
    public final XLL LJLJLLL;
    public final XLL LJLL;
    public final C79883Bo LJLLI;
    public final XLL LJLLILLLL;
    public final C79883Bo LJLLJ;
    public final XLL LJLLL;
    public final C79883Bo LJLLLL;
    public List<? extends IMUser> LJLLLLLL;
    public List<String> LJLZ;
    public List<? extends IMUser> LJZ;
    public final LinkedHashSet<String> LJZI;
    public String LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final AqS183S0100000_1 LLF;

    public final List<IMUser> gv0() {
        List<IMUser> LLIIIZ;
        int i = 0;
        int LIZ = C00F.LIZ(31744, 0, "tt_im_mention_in_group_chat_strategy", true);
        if (LIZ == 2 || LIZ == 4) {
            i = 1;
        }
        C81143Gk c81143Gk = this.LJLJJI;
        String conversationId = this.LJLIL.getConversationId();
        c81143Gk.getClass();
        List<String> LIZLLL = C81143Gk.LIZLLL(conversationId);
        if (o.LJ(this.LJLZ, LIZLLL) && this.LJLLLLLL.size() + i == this.LJZ.size()) {
            return this.LJZ;
        }
        this.LJLZ = LIZLLL;
        Set LLJJ = ORZ.LLJJ(LIZLLL);
        List<? extends IMUser> list = this.LJLLLLLL;
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : list) {
            if (LLJJ.contains(iMUser.getUid())) {
                arrayList.add(iMUser);
            }
        }
        List LLILII = ORZ.LLILII(new IDComparatorS334S0100000_1(LLJJ, 3), arrayList);
        List<? extends IMUser> list2 = this.LJLLLLLL;
        ArrayList arrayList2 = new ArrayList();
        for (IMUser iMUser2 : list2) {
            if (!LLJJ.contains(iMUser2.getUid())) {
                arrayList2.add(iMUser2);
            }
        }
        List LLILII2 = ORZ.LLILII(new IDComparatorS29S0000000_1(9), arrayList2);
        if (i != 0) {
            LLIIIZ = ORZ.LLIIIZ(LLILII2, ORZ.LLIIIZ(LLILII, C47261Igj.LJJIJ(this.LLD.getValue())));
        } else {
            LLIIIZ = ORZ.LLIIIZ(LLILII2, LLILII);
        }
        this.LJZ = LLIIIZ;
        return LLIIIZ;
    }

    public final void refresh() {
        Object value;
        ArrayList arrayList;
        XLM xlm = this.LJLJLJ;
        do {
            value = xlm.getValue();
            List<IMUser> gv0 = gv0();
            arrayList = new ArrayList(C32I.LJJL(gv0, 10));
            for (IMUser iMUser : gv0) {
                arrayList.add(new C3H6(iMUser, this.LJZI.contains(iMUser.getUid()), this.LJLLLLLL.size()));
            }
        } while (!xlm.compareAndSet(value, arrayList));
    }

    @Override // X.InterfaceC81223Gs
    public final void Qj0(String str) {
        if (o.LJ(str, this.LJLIL.getConversationId())) {
            C81143Gk c81143Gk = this.LJLJJI;
            String conversationId = this.LJLIL.getConversationId();
            c81143Gk.getClass();
            if (!o.LJ(C81143Gk.LIZLLL(conversationId), this.LJLZ)) {
                refresh();
            }
        }
    }

    public MentionPanelViewModel(C98563ts sessionInfo, String allItemDisplayName) {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        C81143Gk groupMemberLoader = C81143Gk.LIZ;
        InterfaceC80883Fk imUserDao = C80853Fh.LJ();
        C3H1 c3h1 = C3H1.LIZ;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(allItemDisplayName, "allItemDisplayName");
        o.LJIIIZ(groupMemberLoader, "groupMemberLoader");
        o.LJIIIZ(imUserDao, "imUserDao");
        this.LJLIL = sessionInfo;
        this.LJLILLLLZI = allItemDisplayName;
        this.LJLJI = curUserId;
        this.LJLJJI = groupMemberLoader;
        this.LJLJJL = imUserDao;
        this.LJLJJLL = c3h1;
        this.LJLJL = c4wc;
        this.LJLJLJ = V8H.LIZ(null);
        this.LJLJLLL = C79853Bl.LIZ(0, 0, null, 7);
        XLL LIZ = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLL = LIZ;
        this.LJLLI = new C79883Bo(LIZ);
        XLL LIZ2 = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLLILLLL = LIZ2;
        this.LJLLJ = new C79883Bo(LIZ2);
        XLL LIZ3 = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLLL = LIZ3;
        this.LJLLLL = new C79883Bo(LIZ3);
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJLLLLLL = c61878OQg;
        this.LJLZ = c61878OQg;
        this.LJZ = c61878OQg;
        this.LJZI = new LinkedHashSet<>();
        this.LJZL = "";
        this.LL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 21));
        this.LLD = C221108m2.LIZIZ(new AqS151S0100000_1(this, 20));
        C81143Gk.LIZJ(groupMemberLoader, sessionInfo.getConversationId(), this, imUserDao, 12);
        this.LLF = new AqS183S0100000_1(this, 4);
    }

    @Override // X.InterfaceC81223Gs
    public final void QK(EnumC81123Gi reason, String conversationId, List memberList) {
        IMUser LJLIIIL;
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(memberList, "memberList");
        o.LJIIIZ(reason, "reason");
        ArrayList arrayList = new ArrayList();
        Iterator it = memberList.iterator();
        while (it.hasNext()) {
            C81243Gu c81243Gu = (C81243Gu) it.next();
            if (!o.LJ(c81243Gu.getUid(), this.LJLJI) && (LJLIIIL = C44384HbQ.LJLIIIL(c81243Gu)) != null) {
                arrayList.add(LJLIIIL);
            }
        }
        this.LJLLLLLL = arrayList;
    }
}
