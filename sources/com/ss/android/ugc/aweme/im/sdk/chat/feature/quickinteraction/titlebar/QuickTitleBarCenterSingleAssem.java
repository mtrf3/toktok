package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar;

import X.C018905p;
import X.C1040146j;
import X.C1040246k;
import X.C1040446m;
import X.C1040846q;
import X.C1041046s;
import X.C1041346v;
import X.C119354mJ;
import X.C119574mf;
import X.C16880lQ;
import X.C17N;
import X.C214298b3;
import X.C214528bQ;
import X.C3IU;
import X.C40W;
import X.C45S;
import X.C47704Ins;
import X.C53691L5j;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C87687YbD;
import X.C98523to;
import X.C98693u5;
import X.EnumC53695L5n;
import X.InterfaceC100173wT;
import X.InterfaceC100393wp;
import X.InterfaceC1040946r;
import X.InterfaceC65350Pko;
import X.InterfaceC98713u7;
import Y.ACListenerS21S0100000_1;
import Y.AObserverS69S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.viewmodel.SingleTitleBarCenterViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS26S1000000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuickTitleBarCenterSingleAssem extends UISlotAssem implements InterfaceC98713u7 {
    public final C55749LuL LJLJLLL;
    public final C5H3 LJLL;
    public final C214298b3 LJLLI;
    public final C5H3 LJLLILLLL;
    public final C55749LuL LJLLJ;
    public final C5H3 LJLLL;
    public ConstraintLayout LJLLLL;
    public TuxTextView LJLLLLLL;
    public TuxTextView LJLZ;
    public FrameLayout LJZ;
    public C119574mf LJZI;
    public C119354mJ LJZL;
    public LiveData<ActivityStatus> LL;
    public C53691L5j LLD;
    public EnumC53695L5n LLF;
    public InterfaceC100173wT LLFF;
    public final C5H3 LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public final C5H3 LLI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8y;
    }

    public QuickTitleBarCenterSingleAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C40W.class, null), checkSupervisorPrepared());
        this.LJLL = C17N.LJJIJL(new AqS151S0100000_1(this, 132));
        C65776Prg LIZ = C65352Pkq.LIZ(SingleTitleBarCenterViewModel.class);
        this.LJLLI = new C214298b3(new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 135), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C1040446m.INSTANCE, LIZ);
        this.LJLLILLLL = C17N.LJJIJL(new AqS151S0100000_1(this, 131));
        this.LJLLJ = new C55749LuL(C47704Ins.LIZJ(this, C1041046s.class, null), checkSupervisorPrepared());
        this.LJLLL = C17N.LJJIJL(C1040146j.LJLIL);
        this.LLF = EnumC53695L5n.NONE;
        this.LLFFF = C17N.LJJIJL(new AqS151S0100000_1(this, 130));
        this.LLFII = C17N.LJJIJL(new AqS151S0100000_1(this, 129));
        this.LLFZ = C17N.LJJIJL(new AqS151S0100000_1(this, 133));
        this.LLI = C17N.LJJIJL(new AqS151S0100000_1(this, 134));
    }

    public final C1040246k H3() {
        return (C1040246k) this.LLFII.getValue();
    }

    public final C98523to I3() {
        return (C98523to) this.LJLL.getValue();
    }

    public final void M3() {
        InboxSocPubStatusViewModelImpl inboxSocPubStatusViewModelImpl;
        ConstraintLayout constraintLayout = this.LJLLLL;
        if (constraintLayout != null) {
            this.LLD = (C53691L5j) constraintLayout.findViewById(R.id.dff);
            IMUser fromUser = I3().getFromUser();
            if (fromUser != null) {
                if (this.LLI.getValue() != null) {
                    InboxSocPubStatusViewModelImpl.jv0((InterfaceC100393wp) this.LLFZ.getValue(), fromUser);
                }
                String uid = fromUser.getUid();
                if (uid != null && (inboxSocPubStatusViewModelImpl = (InboxSocPubStatusViewModelImpl) this.LLI.getValue()) != null) {
                    inboxSocPubStatusViewModelImpl.iv0(uid, true);
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZJ()) {
            String convId = I3().getConversationId();
            o.LJIIIZ(convId, "convId");
            C98693u5.LIZLLL.remove(convId);
        }
        super.onDestroy();
    }

    public final void L3(float f) {
        C018905p c018905p;
        FrameLayout frameLayout = this.LJZ;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                c018905p.horizontalBias = f;
                FrameLayout frameLayout2 = this.LJZ;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(c018905p);
                    return;
                } else {
                    o.LJIJI("avatarContainer");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("avatarContainer");
        throw null;
    }

    @Override // X.InterfaceC98713u7
    public final void V1(boolean z) {
        String str;
        if (I3().isReportPage()) {
            return;
        }
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZJ()) {
            if (z) {
                AssemViewModel assemViewModel = (AssemViewModel) this.LJLLI.getValue();
                TuxTextView tuxTextView = this.LJLZ;
                if (tuxTextView != null) {
                    String lastHintText = tuxTextView.getText().toString();
                    o.LJIIIZ(lastHintText, "lastHintText");
                    assemViewModel.setState(new AqS26S1000000_1(lastHintText, 5));
                    TuxTextView tuxTextView2 = this.LJLZ;
                    if (tuxTextView2 != null) {
                        Context context = getContext();
                        if (context == null || (str = context.getString(R.string.ev6)) == null) {
                            str = "";
                        }
                        tuxTextView2.setText(str);
                        TuxTextView tuxTextView3 = this.LJLZ;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setVisibility(0);
                            return;
                        } else {
                            o.LJIJI("hint");
                            throw null;
                        }
                    }
                    o.LJIJI("hint");
                    throw null;
                }
                o.LJIJI("hint");
                throw null;
            }
            String str2 = ((C3IU) ((AssemViewModel) this.LJLLI.getValue()).getState()).LJLILLLLZI;
            TuxTextView tuxTextView4 = this.LJLZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(str2);
                if (str2.length() != 0) {
                    return;
                }
                TuxTextView tuxTextView5 = this.LJLZ;
                if (tuxTextView5 != null) {
                    tuxTextView5.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("hint");
                    throw null;
                }
            }
            o.LJIJI("hint");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData mutableLiveData;
        LiveData<UrlModel> gv0;
        LiveData<String> hv0;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLLLL = (ConstraintLayout) view;
        View findViewById = view.findViewById(R.id.abt);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.avatar_container)");
        this.LJZ = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.eye);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_avatar)");
        this.LJZI = (C119574mf) findViewById2;
        View findViewById3 = view.findViewById(R.id.db3);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.first_title)");
        this.LJLLLLLL = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.jj0);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.second_hint)");
        this.LJLZ = (TuxTextView) findViewById4;
        ConstraintLayout constraintLayout = this.LJLLLL;
        if (constraintLayout != null) {
            C16880lQ.LJIL(constraintLayout, new ACListenerS21S0100000_1(this, 155));
            L3(0.5f);
            M3();
            getOwnLifecycleOwner();
            BaseQuickChatRoomViewModel baseQuickChatRoomViewModel = (BaseQuickChatRoomViewModel) this.LJLLILLLL.getValue();
            if (baseQuickChatRoomViewModel != null && (hv0 = baseQuickChatRoomViewModel.hv0()) != null) {
                hv0.observe(this, new AObserverS69S0100000_1(this, 91));
            }
            BaseQuickChatRoomViewModel baseQuickChatRoomViewModel2 = (BaseQuickChatRoomViewModel) this.LJLLILLLL.getValue();
            if (baseQuickChatRoomViewModel2 != null && (gv0 = baseQuickChatRoomViewModel2.gv0()) != null) {
                gv0.observe(this, new AObserverS69S0100000_1(this, 92));
            }
            BaseQuickChatRoomViewModel baseQuickChatRoomViewModel3 = (BaseQuickChatRoomViewModel) this.LJLLILLLL.getValue();
            if (baseQuickChatRoomViewModel3 != null && (mutableLiveData = baseQuickChatRoomViewModel3.LJLJI) != null) {
                mutableLiveData.observe(this, new AObserverS69S0100000_1(this, 93));
            }
            C87687YbD.LIZ.getClass();
            if (C87687YbD.LIZJ()) {
                C98693u5.LIZJ(I3().getConversationId(), this);
                return;
            }
            return;
        }
        o.LJIJI("rootView");
        throw null;
    }

    public static void K3(QuickTitleBarCenterSingleAssem quickTitleBarCenterSingleAssem, UrlModel urlModel, boolean z) {
        String str;
        quickTitleBarCenterSingleAssem.getClass();
        if (C1041346v.LIZ()) {
            C1040846q.LIZIZ((InterfaceC1040946r) quickTitleBarCenterSingleAssem.LLFFF.getValue(), "", urlModel, 0, 12);
            return;
        }
        if (z) {
            str = "ImTextTitleBar: CenterAvatar";
        } else {
            str = "ImTextTitleBar: LeftAvatar";
        }
        C119574mf c119574mf = quickTitleBarCenterSingleAssem.LJZI;
        if (c119574mf != null) {
            C45S.LJFF(c119574mf, urlModel, str, R.raw.icon_color_default_avatar, R.drawable.b0p, null, null, 992);
        } else {
            o.LJIJI("avatar");
            throw null;
        }
    }
}
