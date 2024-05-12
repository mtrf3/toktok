package com.ss.android.ugc.aweme.profile.widgets.enterprise;

import X.C119244m8;
import X.C16880lQ;
import X.C2068389v;
import X.C42625Go9;
import X.C65352Pkq;
import X.C7MY;
import X.C8VC;
import X.C9N6;
import X.C9NB;
import X.C9NC;
import X.C9NE;
import X.InterfaceC235069Kk;
import X.QD3;
import X.TBT;
import Y.ACListenerS26S1200000_4;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.RBAUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class ProfileUserRBAIdentifierAssem extends UIContentAssem {
    public TextView LJLIL;
    public C119244m8 LJLILLLLZI;
    public User LJLJI;

    public ProfileUserRBAIdentifierAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchToBusinessAccount(C9NE event) {
        o.LJIIIZ(event, "event");
        getContainerView().setVisibility(0);
        if (C9N6.LIZ()) {
            x3(this.LJLJI);
        } else {
            v3(this.LJLJI);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchToCreatorAccount(C9NB event) {
        o.LJIIIZ(event, "event");
        getContainerView().setVisibility(8);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchToPersonalAccount(C9NC event) {
        o.LJIIIZ(event, "event");
        getContainerView().setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TextView textView;
        o.LJIIIZ(view, "view");
        C119244m8 c119244m8 = null;
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = null;
        }
        this.LJLIL = textView;
        if (view instanceof C119244m8) {
            c119244m8 = (C119244m8) view;
        }
        this.LJLILLLLZI = c119244m8;
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9N8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 698));
    }

    public final void v3(User user) {
        if (user != null) {
            BizAccountInfo bizAccountInfo = user.getBizAccountInfo();
            if (bizAccountInfo != null && bizAccountInfo.enableShowCategory()) {
                TextView textView = this.LJLIL;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.LJLIL;
                if (textView2 == null) {
                    return;
                }
                textView2.setText(user.getCategory());
                return;
            }
            TextView textView3 = this.LJLIL;
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(8);
        }
    }

    public final void x3(User user) {
        RBAUserInfo registeredBusiness;
        String companyName;
        if (user == null) {
            return;
        }
        BizAccountInfo bizAccountInfo = user.getBizAccountInfo();
        if (bizAccountInfo == null || (registeredBusiness = bizAccountInfo.getRegisteredBusiness()) == null || (companyName = registeredBusiness.getCompanyName()) == null || companyName.length() == 0) {
            C119244m8 c119244m8 = this.LJLILLLLZI;
            if (c119244m8 == null) {
                return;
            }
            c119244m8.setVisibility(8);
            return;
        }
        C119244m8 c119244m82 = this.LJLILLLLZI;
        if (c119244m82 != null) {
            c119244m82.setText(companyName);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_store;
            c2068389v.LJ = Integer.valueOf(R.attr.gv);
            c2068389v.LIZIZ = C7MY.LIZIZ(12);
            c2068389v.LIZJ = C7MY.LIZIZ(12);
            c119244m82.setStartIcon(c2068389v);
            C16880lQ.LJJJIL(c119244m82, new ACListenerS26S1200000_4(c119244m82, user, companyName, 3));
            c119244m82.setVisibility(0);
        }
    }
}
