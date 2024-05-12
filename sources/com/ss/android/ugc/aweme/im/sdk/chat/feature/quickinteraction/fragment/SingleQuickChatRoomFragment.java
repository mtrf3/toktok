package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment;

import X.ASQ;
import X.ASX;
import X.C214738bl;
import X.C221108m2;
import X.C34B;
import X.C4ID;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C71745SDt;
import X.C98523to;
import X.C98583tu;
import X.C99033ud;
import X.C99043ue;
import X.InterfaceC65784Pro;
import Y.AObserverS69S0100000_1;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.SingleQuickChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingleQuickChatRoomFragment extends BaseQuickChatRoomFragment {
    public C98523to LLFF;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public final C214738bl LLFFF = C71745SDt.LIZ(this, C65352Pkq.LIZ(SingleQuickChatRoomViewModel.class), new AqS151S0100000_1((InterfaceC65784Pro) new AqS151S0100000_1((Fragment) this, LiveTryModeCountDownThresholdSetting.DEFAULT), 121), new AqS151S0100000_1(this, 119));
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 118));

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final BaseQuickChatRoomViewModel Al() {
        return (BaseQuickChatRoomViewModel) this.LLFFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final C99033ud Dl() {
        C98523to c98523to = this.LLFF;
        if (c98523to != null) {
            return c98523to;
        }
        o.LJIJI("sessionInfo");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final void Il() {
        ((SingleQuickChatRoomViewModel) this.LLFFF.getValue()).LJZI.observe(this, new AObserverS69S0100000_1(this, 32));
        ((SingleQuickChatRoomViewModel) this.LLFFF.getValue()).LL.observe(this, new AObserverS69S0100000_1(this, 33));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final C4ID xl() {
        return (C4ID) this.LLFII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final void Hl(long j) {
        C98523to c98523to = this.LLFF;
        if (c98523to != null) {
            C98583tu.LJ(c98523to, j, "chat_panel");
        } else {
            o.LJIJI("sessionInfo");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C98523to c98523to;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_session_info");
        }
        if (!(serializable instanceof C98523to) || (c98523to = (C98523to) serializable) == null) {
            C34B.LIZJ("SingleQuickChatRoomFragment", "SingleQuickChatRoomFragment: session info is null");
            ASQ.LJ(this, ASX.LIZ);
        } else {
            this.LLFF = c98523to;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final BaseChatPanel wl(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        C98523to c98523to = this.LLFF;
        if (c98523to != null) {
            return new SingleChatPanel(this, rootView, c98523to, true, new C99043ue());
        }
        o.LJIJI("sessionInfo");
        throw null;
    }
}
