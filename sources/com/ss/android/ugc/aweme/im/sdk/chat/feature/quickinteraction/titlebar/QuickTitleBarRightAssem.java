package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar;

import X.C16880lQ;
import X.C17N;
import X.C5H3;
import X.C97343ru;
import Y.ACListenerS21S0100000_1;
import Y.AObserverS69S0100000_1;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuickTitleBarRightAssem extends UISlotAssem {
    public final C5H3 LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8x;
    }

    public QuickTitleBarRightAssem() {
        new LinkedHashMap();
        this.LJLJLLL = C17N.LJJIJL(new AqS151S0100000_1(this, 136));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData mutableLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.eai);
        TuxIconView onViewCreated$lambda$0 = (TuxIconView) findViewById;
        o.LJIIIIZZ(onViewCreated$lambda$0, "onViewCreated$lambda$0");
        onViewCreated$lambda$0.setVisibility(0);
        onViewCreated$lambda$0.setContentDescription(C97343ru.LJFF(R.string.dfz));
        onViewCreated$lambda$0.setIconRes(R.raw.icon_x_mark);
        C16880lQ.LJJJ(onViewCreated$lambda$0, new ACListenerS21S0100000_1(this, 43));
        o.LJIIIIZZ(findViewById, "view.findViewById<TuxIco…)\n            }\n        }");
        getOwnLifecycleOwner();
        BaseQuickChatRoomViewModel baseQuickChatRoomViewModel = (BaseQuickChatRoomViewModel) this.LJLJLLL.getValue();
        if (baseQuickChatRoomViewModel != null && (mutableLiveData = baseQuickChatRoomViewModel.LJLJI) != null) {
            mutableLiveData.observe(this, new AObserverS69S0100000_1(view, 37));
        }
    }
}
