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
import X.C98563ts;
import X.C98583tu;
import X.C99033ud;
import X.C99043ue;
import X.InterfaceC65784Pro;
import Y.AObserverS69S0100000_1;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.GroupQuickChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupQuickChatRoomFragment extends BaseQuickChatRoomFragment {
    public C98563ts LLFF;
    public final Map<Integer, View> LLI = new LinkedHashMap();
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 113));
    public final C214738bl LLFII = C71745SDt.LIZ(this, C65352Pkq.LIZ(GroupQuickChatRoomViewModel.class), new AqS151S0100000_1((InterfaceC65784Pro) new AqS151S0100000_1((Fragment) this, 116), 117), new AqS151S0100000_1(this, 115));
    public final C62822Ol8 LLFZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 114));

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLI;
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
        return (BaseQuickChatRoomViewModel) this.LLFII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final C99033ud Dl() {
        C98563ts c98563ts = this.LLFF;
        if (c98563ts != null) {
            return c98563ts;
        }
        o.LJIJI("sessionInfo");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final void Il() {
        ((GroupQuickChatRoomViewModel) this.LLFII.getValue()).LJLLJ.observe(this, new AObserverS69S0100000_1(this, 31));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final C4ID xl() {
        return (C4ID) this.LLFZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final void Hl(long j) {
        C98563ts c98563ts = this.LLFF;
        if (c98563ts != null) {
            C98583tu.LJ(c98563ts, j, "chat_panel");
        } else {
            o.LJIJI("sessionInfo");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C98563ts c98563ts;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_session_info");
        }
        if (!(serializable instanceof C98563ts) || (c98563ts = (C98563ts) serializable) == null) {
            C34B.LIZJ("GroupQuickChatRoomFragment", "GroupQuickChatRoomFragment: session info is null");
            ASQ.LJ(this, ASX.LIZ);
        } else {
            this.LLFF = c98563ts;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment
    public final BaseChatPanel wl(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        C98563ts c98563ts = this.LLFF;
        if (c98563ts != null) {
            return new GroupChatPanel(this, rootView, c98563ts, (GroupChatViewModel) this.LLFFF.getValue(), true, new C99043ue());
        }
        o.LJIJI("sessionInfo");
        throw null;
    }
}
