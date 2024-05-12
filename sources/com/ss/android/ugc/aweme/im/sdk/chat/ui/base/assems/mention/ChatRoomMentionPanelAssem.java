package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mention;

import X.C16880lQ;
import X.C16970lZ;
import X.C17N;
import X.C212428Vi;
import X.C214298b3;
import X.C2K0;
import X.C3XR;
import X.C3XT;
import X.C47704Ins;
import X.C4CX;
import X.C4CY;
import X.C4CZ;
import X.C55096Ljo;
import X.C55749LuL;
import X.C5H3;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C89333ez;
import X.C8YN;
import X.C93073l1;
import X.C93163lA;
import X.C98563ts;
import X.C99033ud;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.ORZ;
import X.TBT;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.mention.viewmodel.MentionPanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatInputVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomMentionInputAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatRoomMentionPanelAssem extends UIContentAssem implements TextWatcher, ChatRoomMentionPanelAbility, InterfaceC55102Lju {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C55749LuL LJLJJI;
    public C3XR LJLJJL;
    public ViewGroup LJLJJLL;
    public final int[] LJLJL;
    public final C5H3 LJLJLJ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1373506092) {
            return null;
        }
        return this;
    }

    public final synchronized C3XR v3() {
        ViewStub viewStub;
        View containerView = getContainerView();
        if (!(containerView instanceof ViewStub) || (viewStub = (ViewStub) containerView) == null) {
            return null;
        }
        final LayoutInflater LLZIL = C16880lQ.LLZIL(viewStub.getContext());
        final Context context = viewStub.getContext();
        viewStub.setLayoutInflater(new LayoutInflater(context, LLZIL) { // from class: X.4CV
            @Override // android.view.LayoutInflater
            public final LayoutInflater cloneInContext(Context context2) {
                return C16880lQ.LLZIL(context2);
            }

            @Override // android.view.LayoutInflater
            public final View inflate(int i, ViewGroup viewGroup, boolean z) {
                Activity activity;
                Context context2 = getContext();
                if (context2 != null) {
                    activity = C45804HyK.LJIJJ(context2);
                } else {
                    activity = null;
                }
                View LIZJ = C16970lZ.LIZJ(i, activity, viewGroup, z);
                o.LJIIIIZZ(LIZJ, "inflate(context?.activit…urce, root, attachToRoot)");
                return LIZJ;
            }
        });
        View inflate = viewStub.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.LJLJJLL = viewGroup;
        WeakReference weakReference = new WeakReference(C212428Vi.LIZLLL(this));
        C99033ud c99033ud = ((C89333ez) this.LJLJJI.getValue()).LJLIL;
        o.LJII(c99033ud, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.GroupSessionInfo");
        C3XR c3xr = new C3XR(viewGroup, weakReference, (C98563ts) c99033ud, (C3XT) this.LJLJLJ.getValue());
        c3xr.LIZJ();
        return c3xr;
    }

    public ChatRoomMentionPanelAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChatRoomInputVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 398), C4CX.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(GroupChatInputVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ2, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 399), C4CZ.INSTANCE, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(MessageDraftVM.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ3, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ3, LiveChatShowDelayForHotLiveSetting.DEFAULT), C4CY.INSTANCE, null);
        this.LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLJL = new int[2];
        this.LJLJLJ = C17N.LJJIJL(new AqS151S0100000_1(this, 397));
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mention.ChatRoomMentionPanelAbility
    public final void Nd(List<String> list) {
        MentionPanelViewModel mentionPanelViewModel;
        if (this.LJLJJL == null) {
            this.LJLJJL = v3();
        }
        C3XR c3xr = this.LJLJJL;
        if (c3xr != null && (mentionPanelViewModel = c3xr.LJFF) != null) {
            mentionPanelViewModel.LJZI.addAll(list);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ChatRoomMentionInputAbility chatRoomMentionInputAbility;
        C93163lA bC;
        C3XR c3xr;
        C3XR c3xr2 = this.LJLJJL;
        if (c3xr2 != null && (chatRoomMentionInputAbility = (ChatRoomMentionInputAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ChatRoomMentionInputAbility.class, null)) != null && (bC = chatRoomMentionInputAbility.bC()) != null) {
            if (bC.LIZ != null) {
                c3xr2.LJI(bC.LIZ);
            }
            if (bC != null && bC.LIZIZ && (c3xr = this.LJLJJL) != null) {
                c3xr.LIZIZ(new AqS151S0100000_1(this, 396));
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C16970lZ.LJ(R.layout.b7p, getContext());
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.4Ca
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C105504Cc) obj).LJLIL);
            }
        }, null, new AqS183S0100000_1(this, 25), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.4CW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C105044Ai) obj).LJLJI;
            }
        }, null, new AqS183S0100000_1(this, 26), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.4CU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C105044Ai) obj).LJLJJI);
            }
        }, null, new AqS183S0100000_1(this, 27), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.4Cd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C105044Ai) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 28), 6);
        ChatRoomEditTextAbility chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ChatRoomEditTextAbility.class, null);
        if (chatRoomEditTextAbility != null) {
            chatRoomEditTextAbility.Uc0(this);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        List list;
        C3XR c3xr;
        C3XR c3xr2 = this.LJLJJL;
        if (c3xr2 != null) {
            MentionPanelViewModel mentionPanelViewModel = c3xr2.LJFF;
            if (mentionPanelViewModel == null || (list = ORZ.LLJI(mentionPanelViewModel.LJZI)) == null) {
                list = C61878OQg.INSTANCE;
            }
            if (list == null || list.isEmpty() || !(charSequence instanceof SpannableStringBuilder) || i2 <= 0 || i3 <= 0) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int i4 = i2 + i;
            C93073l1[] mentionSpansInRange = (C93073l1[]) spannableStringBuilder.getSpans(i, i4, C93073l1.class);
            if (mentionSpansInRange != null && mentionSpansInRange.length != 0) {
                o.LJIIIIZZ(mentionSpansInRange, "mentionSpansInRange");
                for (C93073l1 c93073l1 : mentionSpansInRange) {
                    String str = c93073l1.LIZIZ;
                    if (str != null && (c3xr = this.LJLJJL) != null) {
                        c3xr.LIZLLL(str);
                    }
                    spannableStringBuilder.removeSpan(c93073l1);
                }
            }
            CharacterStyle[] styleSpansInRange = (CharacterStyle[]) spannableStringBuilder.getSpans(i, i4, CharacterStyle.class);
            if (styleSpansInRange == null || styleSpansInRange.length == 0) {
                return;
            }
            o.LJIIIIZZ(styleSpansInRange, "styleSpansInRange");
            for (CharacterStyle characterStyle : styleSpansInRange) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.length() == 0 || i3 <= 0 || i2 >= charSequence.length() || charSequence.charAt((i + i3) - 1) != '@') {
            return;
        }
        withState((AssemViewModel) this.LJLJI.getValue(), new AqS167S0100000_1(this, 130));
    }
}
