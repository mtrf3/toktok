package com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.assem;

import X.C1040246k;
import X.C1040346l;
import X.C1040546n;
import X.C1040846q;
import X.C1041346v;
import X.C107454Jp;
import X.C119354mJ;
import X.C119574mf;
import X.C16880lQ;
import X.C17N;
import X.C214298b3;
import X.C214528bQ;
import X.C2K0;
import X.C3IS;
import X.C3IU;
import X.C45S;
import X.C47704Ins;
import X.C53691L5j;
import X.C55096Ljo;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C87687YbD;
import X.C89333ez;
import X.C8YN;
import X.C98523to;
import X.C98693u5;
import X.EnumC53695L5n;
import X.InterfaceC100173wT;
import X.InterfaceC100393wp;
import X.InterfaceC1040946r;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.InterfaceC98713u7;
import X.TBT;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.viewmodel.SingleTitleBarCenterViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS26S1000000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingleTitleBarCenterAssem extends UISlotAssem implements TitleBarTypingAbility, TitleBarActivityStatusAbility, InterfaceC98713u7, InterfaceC55102Lju {
    public final C55749LuL LJLJLLL;
    public final C5H3 LJLL;
    public final C214298b3 LJLLI;
    public final C5H3 LJLLILLLL;
    public ConstraintLayout LJLLJ;
    public TuxTextView LJLLL;
    public TuxTextView LJLLLL;
    public C119574mf LJLLLLLL;
    public C119354mJ LJLZ;
    public LiveData<ActivityStatus> LJZ;
    public C53691L5j LJZI;
    public EnumC53695L5n LJZL;
    public InterfaceC100173wT LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public final C5H3 LLFF;
    public final C5H3 LLFFF;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1700307391 || hashCode == -771300373) {
            return this;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8y;
    }

    public SingleTitleBarCenterAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLL = C17N.LJJIJL(new AqS151S0100000_1(this, 157));
        C65776Prg LIZ = C65352Pkq.LIZ(SingleTitleBarCenterViewModel.class);
        this.LJLLI = new C214298b3(new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 160), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C1040546n.INSTANCE, LIZ);
        this.LJLLILLLL = C17N.LJJIJL(C1040346l.LJLIL);
        this.LJZL = EnumC53695L5n.NONE;
        this.LLD = C17N.LJJIJL(new AqS151S0100000_1(this, 156));
        this.LLF = C17N.LJJIJL(new AqS151S0100000_1(this, 155));
        this.LLFF = C17N.LJJIJL(new AqS151S0100000_1(this, 158));
        this.LLFFF = C17N.LJJIJL(new AqS151S0100000_1(this, 159));
    }

    public final C1040246k H3() {
        return (C1040246k) this.LLF.getValue();
    }

    public final C98523to I3() {
        return (C98523to) this.LJLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.assem.TitleBarActivityStatusAbility
    public final boolean cf() {
        C119354mJ c119354mJ = this.LJLZ;
        if (c119354mJ != null) {
            return c119354mJ.LJLJLLL;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZJ()) {
            String convId = I3().getConversationId();
            o.LJIIIZ(convId, "convId");
            C98693u5.LIZLLL.remove(convId);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        getOwnLifecycleOwner();
        LiveData<ActivityStatus> liveData = this.LJZ;
        if (liveData != null) {
            liveData.removeObservers(this);
        }
        SingleTitleBarCenterViewModel singleTitleBarCenterViewModel = (SingleTitleBarCenterViewModel) this.LJLLI.getValue();
        XKX.LIZLLL(singleTitleBarCenterViewModel.getAssemVMScope(), null, null, new C3IS(singleTitleBarCenterViewModel, null), 3);
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
                String conversationId = I3().getConversationId();
                o.LJIIIZ(conversationId, "conversationId");
                AssemViewModel assemViewModel = (AssemViewModel) this.LJLLI.getValue();
                TuxTextView tuxTextView = this.LJLLLL;
                if (tuxTextView != null) {
                    String lastHintText = tuxTextView.getText().toString();
                    o.LJIIIZ(lastHintText, "lastHintText");
                    assemViewModel.setState(new AqS26S1000000_1(lastHintText, 5));
                    TuxTextView tuxTextView2 = this.LJLLLL;
                    if (tuxTextView2 != null) {
                        Context context = getContext();
                        if (context == null || (str = context.getString(R.string.ev6)) == null) {
                            str = "";
                        }
                        tuxTextView2.setText(str);
                        TuxTextView tuxTextView3 = this.LJLLLL;
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
            TuxTextView tuxTextView4 = this.LJLLLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(str2);
                if (str2.length() != 0) {
                    return;
                }
                TuxTextView tuxTextView5 = this.LJLLLL;
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
        String str;
        String uid;
        InboxSocPubStatusViewModelImpl inboxSocPubStatusViewModelImpl;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLLJ = (ConstraintLayout) view;
        View findViewById = view.findViewById(R.id.eye);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.iv_avatar)");
        this.LJLLLLLL = (C119574mf) findViewById;
        View findViewById2 = view.findViewById(R.id.db3);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.first_title)");
        this.LJLLL = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.jj0);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.second_hint)");
        this.LJLLLL = (TuxTextView) findViewById3;
        ConstraintLayout constraintLayout = this.LJLLJ;
        if (constraintLayout != null) {
            C16880lQ.LJIL(constraintLayout, new ACListenerS21S0100000_1(this, 201));
            ConstraintLayout constraintLayout2 = this.LJLLJ;
            if (constraintLayout2 != null) {
                this.LJZI = (C53691L5j) constraintLayout2.findViewById(R.id.dff);
                IMUser fromUser = I3().getFromUser();
                if (fromUser != null && this.LLFFF.getValue() != null) {
                    InboxSocPubStatusViewModelImpl.jv0((InterfaceC100393wp) this.LLFF.getValue(), fromUser);
                }
                IMUser fromUser2 = I3().getFromUser();
                boolean z = true;
                if (fromUser2 != null && (uid = fromUser2.getUid()) != null && (inboxSocPubStatusViewModelImpl = (InboxSocPubStatusViewModelImpl) this.LLFFF.getValue()) != null) {
                    inboxSocPubStatusViewModelImpl.iv0(uid, true);
                }
                IMUser fromUser3 = I3().getFromUser();
                if (fromUser3 != null) {
                    ConstraintLayout constraintLayout3 = this.LJLLJ;
                    if (constraintLayout3 != null) {
                        ViewGroup.LayoutParams layoutParams = constraintLayout3.getLayoutParams();
                        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        if (C107454Jp.LIZ()) {
                            layoutParams2.gravity = 16;
                            z = false;
                        } else {
                            layoutParams2.gravity = 17;
                        }
                        UrlModel displayAvatar = fromUser3.getDisplayAvatar();
                        String uid2 = fromUser3.getUid();
                        if (C1041346v.LIZ()) {
                            InterfaceC1040946r interfaceC1040946r = (InterfaceC1040946r) this.LLD.getValue();
                            if (uid2 == null) {
                                uid2 = "";
                            }
                            C1040846q.LIZIZ(interfaceC1040946r, uid2, displayAvatar, 0, 12);
                        } else {
                            if (z) {
                                str = "ImTextTitleBar: CenterAvatar";
                            } else {
                                str = "ImTextTitleBar: LeftAvatar";
                            }
                            C119574mf c119574mf = this.LJLLLLLL;
                            if (c119574mf != null) {
                                C45S.LJFF(c119574mf, displayAvatar, str, R.raw.icon_color_default_avatar, R.drawable.b0p, null, null, 992);
                            } else {
                                o.LJIJI("avatar");
                                throw null;
                            }
                        }
                        ConstraintLayout constraintLayout4 = this.LJLLJ;
                        if (constraintLayout4 != null) {
                            constraintLayout4.setLayoutParams(layoutParams2);
                            String displayName = fromUser3.getDisplayName();
                            if (displayName != null) {
                                TuxTextView tuxTextView = this.LJLLL;
                                if (tuxTextView != null) {
                                    tuxTextView.setText(displayName);
                                } else {
                                    o.LJIJI("title");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("rootView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("rootView");
                        throw null;
                    }
                }
                C8YN.LJII(this, (AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.46p
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C3IU) obj).LJLIL;
                    }
                }, null, new AqS183S0100000_1(this, 97), 6);
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
        o.LJIJI("rootView");
        throw null;
    }
}
