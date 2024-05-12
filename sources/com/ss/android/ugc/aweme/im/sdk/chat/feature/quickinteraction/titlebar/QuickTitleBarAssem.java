package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar;

import X.C17N;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C89333ez;
import X.C8VV;
import Y.AObserverS69S0100000_1;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuickTitleBarAssem extends UISlotAssem {
    public final C55749LuL LJLJLLL;
    public final C5H3 LJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8z;
    }

    public QuickTitleBarAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLL = C17N.LJJIJL(new AqS151S0100000_1(this, 126));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData mutableLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS167S0100000_1(this, 65));
        getOwnLifecycleOwner();
        BaseQuickChatRoomViewModel baseQuickChatRoomViewModel = (BaseQuickChatRoomViewModel) this.LJLL.getValue();
        if (baseQuickChatRoomViewModel != null && (mutableLiveData = baseQuickChatRoomViewModel.LJLJI) != null) {
            mutableLiveData.observe(this, new AObserverS69S0100000_1(this, 86));
        }
    }
}
