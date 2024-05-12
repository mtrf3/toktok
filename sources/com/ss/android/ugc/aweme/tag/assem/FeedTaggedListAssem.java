package com.ss.android.ugc.aweme.tag.assem;

import X.AV1;
import X.C186997Vn;
import X.C214298b3;
import X.C32I;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C7BO;
import X.C7BP;
import X.C7BQ;
import X.C7BS;
import X.C7BT;
import X.C7BU;
import X.C7F0;
import X.C8YN;
import X.C9BE;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tag.FeedTaggedEditCell;
import com.ss.android.ugc.aweme.tag.FeedTaggedListCell;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedTaggedListAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public SYL LJLILLLLZI;
    public final C55749LuL LJLJI;

    public FeedTaggedListAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1034);
        C65776Prg LIZ = C65352Pkq.LIZ(FeedTaggedListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1033), C7BU.INSTANCE, aqS153S0100000_3);
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C7BT.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SYL syl = (SYL) getContainerView().findViewById(R.id.d8u);
        o.LJIIIIZZ(syl, "containerView.feed_tagged_list");
        this.LJLILLLLZI = syl;
        syl.LLLF.LJZL(FeedTaggedListCell.class, FeedTaggedEditCell.class);
        syl.setItemAnimator(null);
        ArrayList<User> arrayList = ((C7BT) this.LJLJI.getValue()).LJLILLLLZI;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator<User> it = arrayList.iterator();
            while (it.hasNext()) {
                User next = it.next();
                SYL syl2 = this.LJLILLLLZI;
                if (syl2 != null) {
                    syl2.getState().LIZJ(new C7BQ(next, new C7BP(((C7BT) this.LJLJI.getValue()).LJLIL, ((C7BT) this.LJLJI.getValue()).LJLJI)));
                    arrayList2.add(C76800UCe.LIZ);
                } else {
                    o.LJIJI("taggedList");
                    throw null;
                }
            }
        }
        Aweme aweme = ((C7BT) this.LJLJI.getValue()).LJLIL;
        if (aweme != null && ((C7F0.LIZ() || C186997Vn.LIZIZ()) && AV1.LJIJI(aweme.getAuthorUid()))) {
            SYL syl3 = this.LJLILLLLZI;
            if (syl3 != null) {
                syl3.getState().LIZJ(new C7BO(new C7BP(aweme, ((C7BT) this.LJLJI.getValue()).LJLJI)));
            } else {
                o.LJIJI("taggedList");
                throw null;
            }
        }
        C8YN.LJII(this, this.LJLIL.getValue(), new TBT() { // from class: X.7BV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C7BX) obj).LJLILLLLZI;
            }
        }, null, C7BS.LJLIL, 6);
    }
}
