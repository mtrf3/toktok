package com.ss.android.ugc.aweme.notification.vm;

import X.AnonymousClass349;
import X.C221108m2;
import X.C56702MNe;
import X.C56777MQb;
import X.C56778MQc;
import X.C56779MQd;
import X.C56780MQe;
import X.C56781MQf;
import X.C56782MQg;
import X.C5H3;
import X.C62822Ol8;
import X.C77266UUc;
import X.EnumC56648MLc;
import X.EnumC57165Mc5;
import X.MPA;
import X.MPL;
import X.MQI;
import X.V1B;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NotificationCombineVM extends BaseNotificationVM {
    public static final /* synthetic */ int LJZL = 0;
    public WeakReference<Context> LJLL;
    public WeakReference<Fragment> LJLLI;
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(C56782MQg.LJLIL);
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(C56781MQf.LJLIL);
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(C56779MQd.LJLIL);
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(C56778MQc.LJLIL);
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(C56777MQb.LJLIL);
    public final C5H3 LJLZ = V1B.LJZI(MQI.LJLIL);
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(C56780MQe.LJLIL);
    public boolean LJZI;

    @Override // com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM, androidx.lifecycle.ViewModel
    public final void onCleared() {
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM, X.InterfaceC56771MPv
    public final EnumC56648MLc Aw() {
        Context context;
        C77266UUc.LIZIZ.LJIILLIIL().LIZJ();
        if (az() != C56702MNe.LIZ) {
            return EnumC56648MLc.GONE;
        }
        EnumC57165Mc5 enumC57165Mc5 = EnumC57165Mc5.CONTACTS;
        WeakReference<Context> weakReference = this.LJLL;
        Fragment fragment = null;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        WeakReference<Fragment> weakReference2 = this.LJLLI;
        if (weakReference2 != null) {
            fragment = weakReference2.get();
        }
        return enumC57165Mc5.decideDisplay(context, fragment);
    }

    public final MPL hv0(List<? extends MusNotice> list, AnonymousClass349 bottomResp) {
        o.LJIIIZ(bottomResp, "bottomResp");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList();
        if (Aw() == EnumC56648MLc.BOTTOM) {
            arrayList2.add(this.LJLZ.getValue());
        }
        RecommendList recommendList = bottomResp.LIZ;
        boolean z = true;
        if (recommendList != null) {
            List<User> inviterList = recommendList.getInviterList();
            if (inviterList != null) {
                Iterator<User> it = inviterList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new MPA(2011, it.next(), 12));
                }
            }
            List<User> userList = recommendList.getUserList();
            if (userList != null && (!userList.isEmpty())) {
                Iterator<User> it2 = userList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new MPA(2001, it2.next(), 12));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            ListProtector.add(arrayList2, 0, new MPA(LiveNetAdaptiveHurryTimeSetting.DEFAULT, null, 14));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList2);
        if (arrayList.isEmpty() && (!arrayList3.isEmpty())) {
            MusNotice musNotice = new MusNotice(false, 1, null);
            musNotice.type = 2003;
            arrayList.add(musNotice);
        }
        arrayList.addAll(arrayList3);
        RecommendList recommendList2 = bottomResp.LIZ;
        if (recommendList2 == null || !recommendList2.hasMore()) {
            z = false;
        }
        return new MPL(arrayList, arrayList3, z);
    }
}
