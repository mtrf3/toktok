package com.ss.android.ugc.aweme.friends.assem;

import X.ActivityC45651qj;
import X.C45804HyK;
import X.C54050LJe;
import X.C59522Vg;
import X.C70582pq;
import X.C77266UUc;
import X.C78613UtF;
import X.LNF;
import X.QD3;
import X.XKX;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class MainPageFriendsAssem extends BaseMainPageFragmentAssem {
    public LNF LJLIL;

    @Override // X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        LNF lnf = this.LJLIL;
        if (lnf != null) {
            EventBus.LIZJ().LJIJ(lnf);
        }
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        LNF lnf = this.LJLIL;
        if (lnf != null && !TextUtils.isEmpty(lnf.LIZ)) {
            C77266UUc c77266UUc = C77266UUc.LIZIZ;
            if (c77266UUc.LIZJ()) {
                if (c77266UUc.LJJIJL()) {
                    c77266UUc.LJIIZILJ();
                } else {
                    c77266UUc.LJIIIZ(lnf.LIZ);
                }
            }
            lnf.LIZ = "";
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC54059LJn
    public final void M1(ViewGroup viewGroup) {
        this.LJLIL = new LNF();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPermissionPopupEvent(C54050LJe event) {
        Context context;
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLIL, "publish") && (context = getContext()) != null) {
            if (C59522Vg.LIZ()) {
                String str = event.LJLIL;
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
                    XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new C70582pq(context, str, null), 2);
                    return;
                }
                return;
            }
            C77266UUc.LIZIZ.LJFF(context, "homepage_follow", 0, event.LJLIL);
        }
    }
}
