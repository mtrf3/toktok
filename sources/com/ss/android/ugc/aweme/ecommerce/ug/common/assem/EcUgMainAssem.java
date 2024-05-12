package com.ss.android.ugc.aweme.ecommerce.ug.common.assem;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C38583FCh;
import X.C38995FSd;
import X.C56662Kg;
import X.C61275O3b;
import X.C78866UxK;
import X.C87277YNd;
import X.ED2;
import X.EnumC53761L8b;
import X.FCZ;
import Y.ARunnableS8S1200000_9;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.Iterator;
import ujb.o;

/* loaded from: classes10.dex */
public final class EcUgMainAssem extends BaseMainContainerAssem {
    @Override // X.C8W0
    public final void onResume() {
        String str;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(EcUgMainAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (str = C61275O3b.LIZIZ) != null && !o.LJJJJJL(str)) {
            C61275O3b.LIZIZ = null;
            C61275O3b.LIZ(LIZ, str);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        Intent intent;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(EcUgMainAssem.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (intent = LIZ.getIntent()) != null) {
            v3(intent, "onCreate");
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onNewIntent(Intent intent) {
        kotlin.jvm.internal.o.LJIIIZ(intent, "intent");
        v3(intent, "onNewIntent");
    }

    public final void v3(Intent intent, String str) {
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        String str2;
        BottomTabProtocol bottomTabProtocol;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_non_click_open_from");
        int i = 1;
        if (LLJJIJIIJIL == null || o.LJJJJJL(LLJJIJIIJIL)) {
            return;
        }
        try {
            if (FCZ.LIZ()) {
                C38995FSd.LIZJ().execute(new ARunnableS8S1200000_9(this, str, intent, 2));
                return;
            }
            String str3 = "";
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZ)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
                String LIZ2 = ED2.LIZ(C16880lQ.LLJJIJIIJIL(intent, "extra_position_type"));
                if (kotlin.jvm.internal.o.LJ(CardStruct.IStatusCode.DEFAULT, LIZ2)) {
                    if (!LJIL.jc()) {
                        Iterator<BottomTabProtocol> it = LJIL.ed().iterator();
                        while (true) {
                            str2 = null;
                            if (it.hasNext()) {
                                bottomTabProtocol = it.next();
                                if (bottomTabProtocol.LIZLLL() == EnumC53761L8b.TAB_2) {
                                    break;
                                }
                            } else {
                                bottomTabProtocol = null;
                                break;
                            }
                        }
                        BottomTabProtocol bottomTabProtocol2 = bottomTabProtocol;
                        if (bottomTabProtocol2 != null) {
                            str2 = bottomTabProtocol2.getTag();
                        }
                        str3 = ED2.LIZ(str2);
                    }
                } else if (kotlin.jvm.internal.o.LJ("1", LIZ2) && LJIL.is("Shop")) {
                    i = 2;
                }
                C38583FCh.LIZIZ(i, str, str3, ED2.LIZ(C16880lQ.LLJJIJIIJIL(intent, "extra_route_schema")));
            }
            i = 0;
            C38583FCh.LIZIZ(i, str, str3, ED2.LIZ(C16880lQ.LLJJIJIIJIL(intent, "extra_route_schema")));
        } catch (Throwable unused) {
        }
    }
}
