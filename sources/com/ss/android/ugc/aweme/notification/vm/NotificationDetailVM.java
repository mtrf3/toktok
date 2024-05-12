package com.ss.android.ugc.aweme.notification.vm;

import X.C221108m2;
import X.C57027MZr;
import X.C57028MZs;
import X.C57029MZt;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C78857UxB;
import X.C78999UzT;
import X.InterfaceC65784Pro;
import X.T16;
import Y.AfS61S0100000_9;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NotificationDetailVM extends ViewModel {
    public static final /* synthetic */ int LJLJJI = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C57027MZr.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C57028MZs.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C57029MZt.LJLIL);

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLJI.getValue()).LIZLLL();
    }

    public final void gv0(BaseNotice notice) {
        o.LJIIIZ(notice, "notice");
        C78999UzT.LJFF(NotificationApi.LIZ().deleteNotice(notice.nid).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(notice, 9), new AfS61S0100000_9(notice, 10)), (C73318Sq2) this.LJLJI.getValue());
    }

    public final void vP(BaseNotice baseNotice, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        if (baseNotice != null) {
            str = baseNotice.nid;
        } else {
            str = null;
        }
        if (C78857UxB.LJJJIL(str)) {
            Set set = (Set) this.LJLIL.getValue();
            o.LJI(baseNotice);
            if (!set.contains(baseNotice.nid)) {
                Set set2 = (Set) this.LJLIL.getValue();
                String str2 = baseNotice.nid;
                o.LJIIIIZZ(str2, "item.nid");
                set2.add(str2);
                interfaceC65784Pro.invoke();
            }
        }
    }
}
