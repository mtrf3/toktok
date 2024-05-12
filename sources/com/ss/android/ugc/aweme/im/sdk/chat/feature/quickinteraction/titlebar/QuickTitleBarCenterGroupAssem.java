package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar;

import X.C018905p;
import X.C1041046s;
import X.C119574mf;
import X.C16880lQ;
import X.C17N;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C62822Ol8;
import X.C89333ez;
import Y.ACListenerS21S0100000_1;
import Y.AObserverS69S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuickTitleBarCenterGroupAssem extends UISlotAssem {
    public final C55749LuL LJLJLLL;
    public final C5H3 LJLL;
    public final C55749LuL LJLLI;
    public ConstraintLayout LJLLILLLL;
    public TuxTextView LJLLJ;
    public TuxTextView LJLLL;
    public C119574mf LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8v;
    }

    public QuickTitleBarCenterGroupAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLL = C17N.LJJIJL(new AqS151S0100000_1(this, 128));
        this.LJLLI = new C55749LuL(C47704Ins.LIZJ(this, C1041046s.class, null), checkSupervisorPrepared());
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 127));
    }

    public final void H3(float f) {
        C018905p c018905p;
        C119574mf c119574mf = this.LJLLLL;
        if (c119574mf != null) {
            ViewGroup.LayoutParams layoutParams = c119574mf.getLayoutParams();
            if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                c018905p.horizontalBias = f;
                C119574mf c119574mf2 = this.LJLLLL;
                if (c119574mf2 != null) {
                    c119574mf2.setLayoutParams(c018905p);
                    return;
                } else {
                    o.LJIJI("avatar");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("avatar");
        throw null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData mutableLiveData;
        LiveData<UrlModel> gv0;
        LiveData<String> hv0;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLLILLLL = (ConstraintLayout) view;
        View findViewById = view.findViewById(R.id.eye);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.iv_avatar)");
        this.LJLLLL = (C119574mf) findViewById;
        View findViewById2 = view.findViewById(R.id.db3);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.first_title)");
        this.LJLLJ = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.jj0);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.second_hint)");
        this.LJLLL = (TuxTextView) findViewById3;
        ConstraintLayout constraintLayout = this.LJLLILLLL;
        if (constraintLayout != null) {
            C16880lQ.LJIL(constraintLayout, new ACListenerS21S0100000_1(this, 154));
            H3(0.5f);
            getOwnLifecycleOwner();
            BaseQuickChatRoomViewModel baseQuickChatRoomViewModel = (BaseQuickChatRoomViewModel) this.LJLL.getValue();
            if (baseQuickChatRoomViewModel != null && (hv0 = baseQuickChatRoomViewModel.hv0()) != null) {
                hv0.observe(this, new AObserverS69S0100000_1(this, 87));
            }
            BaseQuickChatRoomViewModel baseQuickChatRoomViewModel2 = (BaseQuickChatRoomViewModel) this.LJLL.getValue();
            if (baseQuickChatRoomViewModel2 != null && (gv0 = baseQuickChatRoomViewModel2.gv0()) != null) {
                gv0.observe(this, new AObserverS69S0100000_1(this, 88));
            }
            BaseQuickChatRoomViewModel baseQuickChatRoomViewModel3 = (BaseQuickChatRoomViewModel) this.LJLL.getValue();
            if (baseQuickChatRoomViewModel3 != null && (mutableLiveData = baseQuickChatRoomViewModel3.LJLJI) != null) {
                mutableLiveData.observe(this, new AObserverS69S0100000_1(this, 89));
                return;
            }
            return;
        }
        o.LJIJI("rootView");
        throw null;
    }
}
