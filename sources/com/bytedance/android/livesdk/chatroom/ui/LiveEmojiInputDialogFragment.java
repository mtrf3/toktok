package com.bytedance.android.livesdk.chatroom.ui;

import X.ActivityC45651qj;
import X.B4Q;
import X.B73;
import X.B83;
import X.BCW;
import X.BKY;
import X.BZI;
import X.C018905p;
import X.C04270Et;
import X.C05040Hs;
import X.C06420Na;
import X.C0K2;
import X.C0NB;
import X.C0Y5;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15410j3;
import X.C15E;
import X.C15G;
import X.C15H;
import X.C15I;
import X.C15J;
import X.C16880lQ;
import X.C1FC;
import X.C20910rv;
import X.C259910h;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C30114Brq;
import X.C30326BvG;
import X.C30872C9s;
import X.C31061Ju;
import X.C31079CHr;
import X.C31081CHt;
import X.C31082CHu;
import X.C31089CIb;
import X.C31093CIf;
import X.C31413CUn;
import X.C31418CUs;
import X.C32161Oa;
import X.C32181Oc;
import X.C32537Cpp;
import X.C38931ft;
import X.C3C5;
import X.C42221lC;
import X.C47121t6;
import X.C54832Df;
import X.C73943T0h;
import X.C76800UCe;
import X.C79057V0z;
import X.C90903hW;
import X.CI1;
import X.CI6;
import X.CI8;
import X.CI9;
import X.CIA;
import X.CIC;
import X.CIK;
import X.CIO;
import X.CIS;
import X.CIT;
import X.CIU;
import X.CJ0;
import X.CN1;
import X.CQW;
import X.EnumC09680Zo;
import X.EnumC31158CKs;
import X.InterfaceC15800jg;
import X.InterfaceC31088CIa;
import X.InterfaceC31090CIc;
import X.InterfaceC31091CId;
import X.InterfaceC31092CIe;
import X.KL2;
import X.KNV;
import X.ORY;
import X.RunnableC31321CQz;
import X.RunnableC63881P5h;
import X.ViewOnClickListenerC13880ga;
import X.ViewTreeObserverOnPreDrawListenerC06930Oz;
import X.X1D;
import X.Y90;
import Y.ACListenerS23S0201000_5;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS32S0101000_15;
import Y.AObjectS122S0200000_5;
import Y.AObjectS54S1100000_5;
import Y.ARunnableS41S0100000_5;
import Y.ARunnableS9S0101000_5;
import Y.IDCListenerS254S0100000_5;
import Y.IDCListenerS374S0100000_5;
import Y.IDRunnableS6S0101000;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.toolbar.HideShareLeadEvent;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.api.revenue.starcomment.StarCommentEntranceVisibleEvent;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.ChatEmojiListData;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.chatroom.model.ReplyInfo;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.utils.EmoteFixTextHelper;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.InputDialogShowingChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveInputProgressEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.VideoSize;
import com.bytedance.android.livesdk.livesetting.comment.EnableLiveKeyboardWithHeightSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentDialogAnchorOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentDialogOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentInputDialogDismissFixSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveEmoteLoadTimingOptSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveEomjiConvenientSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveEomjiSpaceSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class LiveEmojiInputDialogFragment extends ControllableDialogFragment implements C15G, C15H, CIS {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public DataChannel LJLJJI;
    public InterfaceC31092CIe LJLJJL;
    public InterfaceC31090CIc LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public String LJLLI;
    public InputFilter LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public String LJZI;
    public String LJZL;
    public String LL;
    public List<EmoteWithIndex> LLD;
    public boolean LLF;
    public MeasureLinearLayout LLFF;
    public LiveIconView LLFFF;
    public LiveIconView LLFII;
    public LiveIconView LLFZ;
    public C31089CIb LLI;
    public C47121t6 LLIFFJFJJ;
    public TextView LLII;
    public View LLIIII;
    public View LLIIIILZ;
    public View LLIIIJ;
    public LinearLayout LLIIIL;
    public View LLIIIZ;
    public B4Q LLIIJI;
    public C31093CIf LLIIJLIL;
    public Y90 LLIIL;
    public C30872C9s LLIILII;
    public LinearLayout LLIILZL;
    public ViewPager LLIIZ;
    public C0Y5 LLIL;
    public EmoteFixTextHelper LLILII;
    public C32161Oa LLILIL;
    public C32181Oc LLILL;
    public long LLILLIZIL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public JSONObject LLJJ;
    public boolean LLJJIJI;
    public InterfaceC31091CId LLJJIJIIJIL;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public ValueAnimator LLJJJJLIIL;
    public Handler LLJJL;
    public EnumC09680Zo LJLL = EnumC09680Zo.Keyboard;
    public Boolean LLILLJJLI = Boolean.FALSE;
    public int LLILLL = 0;
    public boolean LLILZLL = false;
    public boolean LLJ = false;
    public boolean LLJI = false;
    public boolean LLJIJIL = true;
    public boolean LLJILJIL = false;
    public boolean LLJILJILJ = false;
    public int LLJILLL = -16777216;
    public final List<C0Y5> LLJJI = new ArrayList();
    public ChatEmojiListData LLJJIII = null;
    public boolean LLJJIJIL = false;
    public boolean LLJJJ = false;
    public final ACListenerS24S0101000_5 LLJJLIIIJLLLLLLLZ = new ACListenerS24S0101000_5(0, this, 1);
    public final C31081CHt LLJL = new C31081CHt(this);
    public final C31082CHu LLJLIL = new C31082CHu(this);

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLIZLLLIL = false;
        if (!this.LLILZLL) {
            C15E keyBoardObservable = this.LLFF.getKeyBoardObservable();
            if (keyBoardObservable.LIZJ == null) {
                keyBoardObservable.LIZJ = new ArrayList();
            }
            ((ArrayList) keyBoardObservable.LIZJ).add(this);
        }
        if (this.LJLJLJ && this.LJLL == EnumC09680Zo.Keyboard) {
            this.LJLJLJ = false;
            C31089CIb c31089CIb = this.LLI;
            if (c31089CIb != null) {
                c31089CIb.postDelayed(new CI9(this, 200L, 1, 5), 200L);
                return;
            }
            return;
        }
        if (this.LJLL != EnumC09680Zo.Keyboard) {
            return;
        }
        wl();
    }

    public final int Dl() {
        View view = this.LLIIIILZ;
        if (view == null || view.getMeasuredHeight() == 0) {
            return C15380j0.LIZ(60.0f);
        }
        return this.LLIIIILZ.getMeasuredHeight();
    }

    public final boolean Gl() {
        if (((IHostResource) CN1.LIZ(IHostResource.class)).Sz() && this.LJLILLLLZI != 2) {
            return true;
        }
        return false;
    }

    public final void Hl() {
        if (!this.LJLJI || this.LLI == null) {
            return;
        }
        C79057V0z.LJJIIJZLJL(getContext(), this.LLI);
    }

    public final void Ql() {
        if (this.LJLLLL) {
            return;
        }
        Kl(Gl());
        this.LJLL = EnumC09680Zo.Panel;
        this.LLIL = this.LLILIL;
        int i = 1;
        this.LLI.setShowSoftInputOnFocus(!(r0 instanceof C32181Oc));
        if (this.LJLJLLL) {
            int indexOf = ((ArrayList) this.LLJJI).indexOf(this.LLIL);
            if (indexOf != -1) {
                Pl(indexOf);
                this.LLIIZ.setCurrentItem(indexOf, false);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(this.LLI.getText());
        Yl(isEmpty);
        if (!isEmpty) {
            this.LLFZ.setClickable(true);
        }
        this.LLI.post(new RunnableC31321CQz(i, this, this.LJLL));
    }

    public final void Rl() {
        if (this.LJLLLL) {
            return;
        }
        Kl(Gl());
        this.LJLL = EnumC09680Zo.Panel;
        this.LLIL = this.LLILL;
        int i = 1;
        this.LLI.setShowSoftInputOnFocus(!(r0 instanceof C32181Oc));
        if (this.LJLJLLL) {
            int indexOf = ((ArrayList) this.LLJJI).indexOf(this.LLIL);
            if (indexOf != -1) {
                Pl(indexOf);
                this.LLIIZ.setCurrentItem(indexOf, false);
            }
        }
        this.LLI.post(new RunnableC31321CQz(i, this, this.LJLL));
    }

    public final void Sl() {
        if (this.LJLLLL) {
            return;
        }
        this.LJLL = EnumC09680Zo.Keyboard;
        boolean isEmpty = TextUtils.isEmpty(this.LLI.getText());
        Yl(isEmpty);
        int i = 1;
        if (!isEmpty) {
            this.LLFZ.setClickable(true);
        }
        this.LLI.post(new RunnableC31321CQz(i, this, this.LJLL));
    }

    public final void Xl() {
        Iterator it = ((ArrayList) this.LLJJI).iterator();
        while (it.hasNext()) {
            C0Y5 c0y5 = (C0Y5) it.next();
            boolean z = this.LJLLLL;
            if (c0y5.LJII != z) {
                c0y5.LJII = z;
                c0y5.LIZ();
            }
        }
    }

    public final void vl() {
        if (this.LJLJI) {
            try {
                Hl();
                if (isAdded()) {
                    dismissAllowingStateLoss();
                }
            } catch (Exception e) {
                C0K2.LIZ("LiveEmojiInputDialogFragment", e);
            }
        }
    }

    public final void wl() {
        C31089CIb c31089CIb;
        if (!this.LLJILJILJ && (c31089CIb = this.LLI) != null) {
            c31089CIb.post(new ARunnableS41S0100000_5(this, 122));
            this.LLI.setOnFocusChangeListener(new IDCListenerS374S0100000_5(this, 0));
        }
    }

    public final InputAttrs Al() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.setClassLoader(InputAttrs.class.getClassLoader());
            return (InputAttrs) arguments.getParcelable("live.intent.extra.INPUT_ATTRS");
        }
        return null;
    }

    public final void Ol() {
        if (!isAdded()) {
            return;
        }
        if (this.LJLLLL) {
            this.LLI.setText("");
            this.LLII.setText(R.string.mln);
            this.LLI.setEnabled(false);
            return;
        }
        this.LLI.setTextSize(1, 17.0f);
        if (this.LJLLJ) {
            this.LLII.setText(R.string.spf);
        } else if (!TextUtils.isEmpty(this.LJLLI)) {
            this.LLII.setText(this.LJLLI);
        } else {
            this.LLII.setText(R.string.mg6);
        }
        this.LLI.setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJI = false;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.ControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJLJ = false;
        Y90 y90 = this.LLIIL;
        if (y90 != null) {
            y90.clearAnimation();
            this.LLIIL = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        List<C15G> list = this.LLFF.getKeyBoardObservable().LIZJ;
        if (list != null) {
            ((ArrayList) list).remove(this);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || !C29306Beo.LJIIZILJ(mo49getActivity.getRequestedOrientation())) {
            return;
        }
        vl();
    }

    public static boolean Jl(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                if (str.length() <= 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    public final void Il(MeasureLinearLayout measureLinearLayout) {
        LinearLayout linearLayout = (LinearLayout) measureLinearLayout.findViewById(R.id.loc);
        this.LLIIIL = linearLayout;
        if (linearLayout == null) {
            return;
        }
        int LJIIJJI = (KL2.LJIIJJI(getContext()) - (C15380j0.LIZ(14.0f) * 2)) - (C15380j0.LIZ(24.0f) * 2);
        int LIZ = LJIIJJI / (C15380j0.LIZ(LiveEomjiSpaceSetting.INSTANCE.getSpaceValue()) + C15380j0.LIZ(24.0f));
        int LIZ2 = (LJIIJJI - (C15380j0.LIZ(24.0f) * LIZ)) / (LIZ + 1);
        ArrayList arrayList = new ArrayList();
        ChatEmojiListData chatEmojiListData = this.LLJJIII;
        if (chatEmojiListData != null) {
            for (String str : chatEmojiListData.emojiList) {
                if (str != null) {
                    ArrayList LIZIZ = C05040Hs.LIZIZ(str);
                    C31061Ju c31061Ju = new C31061Ju();
                    c31061Ju.emojiList.addAll(LIZIZ);
                    c31061Ju.previewEmoji = str;
                    arrayList.add(c31061Ju);
                }
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = arrayList;
        if (size <= 0) {
            arrayList2 = C1FC.LIZIZ().LJ();
        }
        if (arrayList2.size() <= 2) {
            return;
        }
        List subList = arrayList2.subList(0, Math.min(arrayList2.size(), LIZ + 2));
        for (int i = 0; i < subList.size(); i++) {
            C47121t6 c47121t6 = new C47121t6(getContext(), null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) KL2.LIZJ(getContext(), 24.0f), -1);
            c47121t6.setGravity(17);
            c47121t6.setTextSize(1, 20.0f);
            c47121t6.setText((CharSequence) ListProtector.get(((C31061Ju) ListProtector.get(subList, i)).emojiList, 0));
            C16880lQ.LJJIIZ(c47121t6, new ACListenerS23S0201000_5(i, this, subList, 1));
            if (i > 0) {
                if (i <= subList.size() - 1) {
                    layoutParams.leftMargin = LIZ2;
                }
                layoutParams.rightMargin = C15380j0.LIZ(14.0f);
            } else {
                if (i == 0) {
                    layoutParams.leftMargin = C15380j0.LIZ(14.0f);
                }
                layoutParams.rightMargin = C15380j0.LIZ(14.0f);
            }
            c47121t6.setLayoutParams(layoutParams);
            this.LLIIIL.addView(c47121t6);
        }
        this.LLIIIL.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Kl(boolean z) {
        String str;
        boolean z2;
        String str2;
        int i;
        boolean z3;
        String str3;
        String str4;
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        DataChannel dataChannel = this.LJLJJI;
        InputAttrs Al = Al();
        if (dataChannel == null || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_comment_pannel_show", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            return;
        }
        Object kv0 = dataChannel.kv0(C30114Brq.class);
        Boolean bool = Boolean.TRUE;
        if (o.LJ(kv0, bool)) {
            str = "chat_room";
        } else {
            str = "bubble";
        }
        Boolean bool2 = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        boolean z4 = false;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        String dz = ((IStarCommentService) CN1.LIZ(IStarCommentService.class)).dz(dataChannel);
        BZI LIZ = C28787BRn.LIZ("livesdk_comment_pannel_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_emoji");
        LIZ.LJIJJ(str, "comment_pannel_type");
        if (Al != null) {
            str2 = Al.mCommentMethod;
        } else {
            str2 = null;
        }
        LIZ.LJIJJ(str2, "method");
        LIZ.LJIJJ(Integer.valueOf(o.LJ(dataChannel.kv0(StarCommentEntranceVisibleEvent.class), bool) ? 1 : 0), "is_star_comment_entrance_show");
        LIZ.LJIJJ(dz, "no_star_comment_reason");
        if (z2) {
            LIZ.LJIJJ("more", "click_method");
        }
        if (Al != null) {
            boolean z5 = Al.emoteEnabled;
            JSONObject jSONObject = Al.trackInfo;
            if (jSONObject != null) {
                LIZ.LJJ(jSONObject);
            }
            LIZ.LJIJJ(Integer.valueOf(Al.hasDraft ? 1 : 0), "has_draft");
            ReplyInfo replyInfo = Al.replyInfo;
            if (replyInfo != null && replyInfo.replyToId > 0) {
                LIZ.LJIJJ(Long.valueOf(replyInfo.msgId), "reply_message_id");
                LIZ.LJIJJ(Long.valueOf(replyInfo.releaseId), "reply_message_release_id");
            }
            ISendCommentEvent.Sender sender = Al.sender;
            i = z5;
            if (sender != null) {
                i = z5;
                if (sender == ISendCommentEvent.Sender.COMMENT_COMBO_TRAY) {
                    LIZ.LJJIFFI(sender.getLogArgs());
                    i = z5;
                }
            }
        } else {
            i = 0;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null && (owner2 = room.getOwner()) != null) {
            z3 = owner2.isSubscribed();
        } else {
            z3 = false;
        }
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null && (owner = room2.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
            z4 = subscribeInfo.isInGracePeriod();
        }
        if (z3) {
            str3 = "subscribed_not_expired";
        } else if (z4) {
            str3 = "subscribed_expired_grace_period";
        } else {
            str3 = "not_subscribed";
        }
        KNV.LJ(i, LIZ, "has_sub_tab", str3, "subscribe_state");
        if (Al != null && (str4 = Al.requestPage) != null) {
            LIZ.LJIJJ(str4, "request_page");
        }
        C31079CHr.LJI(LIZ);
        if (dataChannel.kv0(LiveExtendedScreenStatus.class) == EnumC31158CKs.SHOW) {
            LIZ.LJIJJ("live_extended_comment_filed", "event_page");
        }
        C31079CHr.LJFF(LIZ, dataChannel);
        LIZ.LJJIIJZLJL();
    }

    public final void Ll(boolean z) {
        if (!TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.isGroup3()) {
            return;
        }
        try {
            C018905p c018905p = (C018905p) this.LLIILII.getLayoutParams();
            if (c018905p.bottomToTop == -1) {
                c018905p.bottomToTop = R.id.emq;
                c018905p.bottomToBottom = -1;
                this.LLIILII.setLayoutParams(c018905p);
            }
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.getMessage());
            C0K2.LJII(1, "ttlive_emoji_fragment_error", hashMap);
        }
        if (z) {
            if (!this.LLJJJ) {
                return;
            }
            this.LLJJJ = false;
            this.LLIILZL.setBackground(null);
            this.LLIIII.setBackground(new ColorDrawable(C259910h.LIZIZ(R.attr.cp, this.LLIIII.getContext())));
            this.LLIIIILZ.setBackground(new ColorDrawable(C259910h.LIZIZ(R.attr.cl, this.LLIIIILZ.getContext())));
            if (getContext() != null) {
                this.LLIIIJ.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.cd0));
            }
            LiveIconView liveIconView = this.LLFFF;
            liveIconView.setIconTint(C259910h.LIZJ(R.attr.bns, liveIconView));
            C31089CIb c31089CIb = this.LLI;
            c31089CIb.setTextColor(C259910h.LIZIZ(R.attr.do, c31089CIb.getContext()));
            LiveIconView liveIconView2 = this.LLFII;
            liveIconView2.setIconTint(C259910h.LIZJ(R.attr.bns, liveIconView2));
            Yl(TextUtils.isEmpty(this.LLI.getText()));
            return;
        }
        if (this.LLJJJ) {
            return;
        }
        this.LLJJJ = true;
        this.LLIILZL.setBackground(new ColorDrawable(C259910h.LIZIZ(R.attr.cp, this.LLIILZL.getContext())));
        this.LLIIII.setBackground(null);
        this.LLIIIILZ.setBackground(new ColorDrawable(C259910h.LIZIZ(R.attr.ca, this.LLIIIILZ.getContext())));
        if (getContext() != null) {
            this.LLIIIJ.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.cd1));
        }
        this.LLFFF.setIconTint(C259910h.LIZIZ(R.attr.go, new ContextThemeWrapper(this.LLFFF.getContext(), R.style.vp)));
        this.LLFII.setIconTint(C259910h.LIZIZ(R.attr.dj, new ContextThemeWrapper(this.LLFII.getContext(), R.style.vp)));
        this.LLI.setTextColor(C259910h.LIZIZ(R.attr.go, new ContextThemeWrapper(this.LLI.getContext(), R.style.vp)));
        Yl(TextUtils.isEmpty(this.LLI.getText()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d5, code lost:
    
        if (r3 == 0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List, java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.OQg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nl(int r20) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment.Nl(int):void");
    }

    public final void Pl(int i) {
        if (i >= 0 && i < ((ArrayList) this.LLJJI).size()) {
            C0Y5 c0y5 = (C0Y5) ListProtector.get(this.LLJJI, i);
            boolean isEmpty = TextUtils.isEmpty(this.LLI.getText());
            Yl(isEmpty);
            this.LLFZ.setClickable(!isEmpty);
            this.LLIL = c0y5;
            this.LLI.setShowSoftInputOnFocus(!(c0y5 instanceof C32181Oc));
            for (int i2 = 0; i2 < ((ArrayList) this.LLJJI).size(); i2++) {
                if (i2 != i) {
                    C0Y5 c0y52 = (C0Y5) ListProtector.get(this.LLJJI, i2);
                    if (c0y52.LJ) {
                        c0y52.LJ = false;
                        c0y52.LIZLLL(false);
                    }
                }
            }
            if (!c0y5.LJ) {
                c0y5.LJ = true;
                c0y5.LIZLLL(true);
            }
        }
    }

    public final void Tl(int i) {
        View view = this.LLIIII;
        if (view != null) {
            view.setTranslationY(i);
        }
        View view2 = this.LLIIIZ;
        if (view2 != null) {
            view2.setTranslationY(i);
        }
    }

    public final void Vl(String str) {
        if (!isAdded() || this.LJLLLL) {
            return;
        }
        this.LJZI = str;
        C31089CIb c31089CIb = this.LLI;
        if (c31089CIb != null) {
            c31089CIb.setText(str);
            if (!TextUtils.isEmpty(this.LJZI)) {
                this.LLI.setSelection(this.LJZI.length());
            }
        }
        Ol();
    }

    public final void Yl(boolean z) {
        if (z) {
            if (this.LLJJJ) {
                this.LLFZ.setIconTint(C259910h.LIZIZ(R.attr.gp, new ContextThemeWrapper(this.LLFZ.getContext(), R.style.vp)));
                return;
            } else {
                LiveIconView liveIconView = this.LLFZ;
                liveIconView.setIconTint(C259910h.LIZJ(R.attr.bnt, liveIconView));
                return;
            }
        }
        LiveIconView liveIconView2 = this.LLFZ;
        liveIconView2.setIconTint(C259910h.LIZJ(R.attr.bnd, liveIconView2));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        C31089CIb c31089CIb;
        super.onActivityCreated(bundle);
        if (this.LLJJJIL) {
            this.LLJILJILJ = true;
            CIT.LIZ("Keyboard will open");
            InterfaceC31092CIe interfaceC31092CIe = this.LJLJJL;
            if (interfaceC31092CIe != null) {
                CIO cio = (CIO) interfaceC31092CIe;
                if (cio.LIZIZ == 0) {
                    cio.LIZIZ = SystemClock.elapsedRealtime();
                }
            }
            if (this.LJLJI && (c31089CIb = this.LLI) != null) {
                c31089CIb.requestFocus();
                C79057V0z.LJJJJZ(getContext(), this.LLI);
            }
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.LJLJI = true;
        setCancelable(true);
        InputAttrs Al = Al();
        if (Al != null) {
            this.LJLLJ = Al.isDanmuOpen;
            this.LJLLL = Al.isBroadcaster;
            this.LJLLLL = Al.isUserBanned;
            this.LJLLLLLL = Al.isUserBannedWholeLive;
            String str = Al.input;
            if (str == null) {
                str = "";
            }
            this.LJZI = str;
            this.LJZL = Al.atName;
            this.LL = Al.content;
            this.LLD = Al.atEmoteWithIndexList;
            EmoteFixTextHelper emoteFixTextHelper = Al.emoteFixTextHelperForText;
            if (emoteFixTextHelper == null) {
                emoteFixTextHelper = new EmoteFixTextHelper();
            }
            this.LLILII = emoteFixTextHelper;
            this.LJLZ = Al.canSendDanmu;
            this.LJZ = Al.isOfficial;
            this.LJLILLLLZI = !Al.emoteEnabled ? 1 : 0;
            this.LJLLI = Al.hint;
            this.LLJJ = Al.trackInfo;
        } else {
            this.LLILII = new EmoteFixTextHelper();
        }
        this.LLJJJIL = LiveCommentDialogOptimizeSetting.showOptimize(this.LJLJJI);
        this.LLJJJJ = LiveCommentDialogOptimizeSetting.reuseOptimize(this.LJLJJI);
        this.LLJJJJJIL = LiveCommentDialogOptimizeSetting.layoutOptimize(this.LJLJJI);
        if (this.LJLILLLLZI == 2) {
            this.LJLL = EnumC09680Zo.Panel;
        }
        if (!this.LJLLL || LiveCommentDialogAnchorOptimizationSetting.anchorOptimize()) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZLL = z;
        if (z) {
            setStyle(1, R.style.abd);
        } else {
            setStyle(1, R.style.abc);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(this.LLF);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.aj);
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Input Dialog Setting is");
            LIZ.append(this.LLILZLL);
            CIT.LIZ(X1D.LIZIZ(LIZ));
            window.addFlags(32);
            if (this.LLILZLL) {
                window.setSoftInputMode(19);
            } else {
                window.setSoftInputMode(3);
            }
            if (this.LLJJJIL) {
                window.setSoftInputMode((window.getAttributes().softInputMode & (-4)) | 4);
            }
            if (!this.LLILZLL && ((mo49getActivity() != null && C29306Beo.LJIIZILJ(mo49getActivity().getRequestedOrientation())) || (!this.LJLLL && !C15410j3.LIZJ(mo49getActivity())))) {
                window.addFlags(1024);
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        long j;
        String str;
        InterfaceC15800jg interfaceC15800jg;
        EmoteFixTextHelper emoteFixTextHelper;
        CIT.LIZ("Dialog onDismiss");
        if (!this.LLIZLLLIL) {
            this.LLIIJI = new B4Q(0, Dl(), false);
            C73943T0h.LIZ().LIZIZ(this.LLIIJI);
        }
        super.onDismiss(dialogInterface);
        if (this.LJLJJL != null) {
            InputAttrs inputAttrs = new InputAttrs();
            inputAttrs.isBroadcaster = this.LJLLL;
            inputAttrs.isUserBanned = this.LJLLLL;
            inputAttrs.isUserBannedWholeLive = this.LJLLLLLL;
            inputAttrs.isDanmuOpen = this.LJLLJ;
            inputAttrs.input = "";
            inputAttrs.emoteFixTextHelperForText = this.LLILII;
            if (Al() != null) {
                inputAttrs.replyInfo = Al().replyInfo;
                inputAttrs.mCommentMethod = Al().mCommentMethod;
            }
            inputAttrs.canSendDanmu = this.LJLZ;
            inputAttrs.trackInfo = this.LLJJ;
            CIO cio = (CIO) this.LJLJJL;
            DataChannel dataChannel = cio.LIZJ.dataChannel;
            if (dataChannel != null) {
                dataChannel.qv0(HideShareLeadEvent.class, Boolean.FALSE);
            }
            if (!TextUtils.isEmpty(cio.LIZJ.LLI) && ((!TextUtils.isEmpty(inputAttrs.input) && inputAttrs.input.contains(cio.LIZJ.LLI)) || ((emoteFixTextHelper = inputAttrs.emoteFixTextHelperForText) != null && !emoteFixTextHelper.list.isEmpty() && inputAttrs.emoteFixTextHelperForText.LIZIZ().contains(cio.LIZJ.LLI)))) {
                j = cio.LIZJ.LLILLL.replyInfo.replyToId;
            } else {
                j = 0;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            CommentWidget commentWidget = cio.LIZJ;
            long j2 = commentWidget.LLIL;
            int i = (int) ((elapsedRealtime - j2) / 1000);
            DataChannel dataChannel2 = commentWidget.dataChannel;
            long j3 = cio.LIZIZ;
            long j4 = j3 - j2;
            long j5 = cio.LIZ - j3;
            if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_comment_pannel_show_duration", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                BZI LIZ = C28787BRn.LIZ("comment_pannel_show_duration");
                LIZ.LJIILLIIL(dataChannel2);
                LIZ.LJIJJ(Integer.valueOf(i), "duration");
                if (j != 0) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ.LJIJJ(str, "is_message_reply");
                if (j != 0) {
                    LIZ.LJIJJ(Long.valueOf(j), "reply_user_id");
                }
                C31079CHr.LJFF(LIZ, dataChannel2);
                if (j4 >= 0 && j5 >= 0) {
                    LIZ.LJIJJ(Long.valueOf(j4), "call_show_keyboard_latency");
                    LIZ.LJIJJ(Long.valueOf(j5), "keyboard_show_latency");
                    LIZ.LJIJJ(Long.valueOf(j4 + j5), "total_show_latency");
                }
                C31079CHr.LJI(LIZ);
                LIZ.LJJIIJZLJL();
            }
            cio.LIZIZ = 0L;
            cio.LIZ = 0L;
            BKY.LIZIZ().LJFF(false);
            DataChannel dataChannel3 = cio.LIZJ.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.rv0(InputDialogShowingChannel.class, Boolean.FALSE);
            }
            CommentWidget commentWidget2 = cio.LIZJ;
            if (!commentWidget2.LLIZLLLIL) {
                interfaceC15800jg = null;
                commentWidget2.LLILLIZIL = null;
            } else {
                interfaceC15800jg = null;
            }
            commentWidget2.LLILLJJLI = false;
            commentWidget2.LLILLL = inputAttrs;
            if (commentWidget2.LLILZIL.isEnabled()) {
                cio.LIZJ.LLILZIL.setHighlightHandler(interfaceC15800jg);
            }
            cio.LIZJ.LLILZLL();
            CommentWidget commentWidget3 = cio.LIZJ;
            if (commentWidget3.LLILII) {
                commentWidget3.LLILZ();
            }
            cio.LIZJ.LLILII = false;
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C54832Df.class)).LIZ = "";
            cio.LIZJ.LLFZ = "";
        }
        this.LJLJJL = null;
        this.LJLJL = false;
        this.LJLJLJ = false;
        this.LJLJLLL = false;
        this.LJLL = EnumC09680Zo.Keyboard;
        this.LJLLJ = false;
        this.LJLLLL = false;
        this.LJLLLLLL = false;
        this.LJLZ = false;
        this.LJZI = "";
        this.LLILLJJLI = Boolean.FALSE;
        this.LLILLL = 0;
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJ = false;
        ((ArrayList) this.LLJJI).clear();
        this.LLJJIII = null;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = null;
        if (this.LLJJJJ) {
            ViewPager viewPager = this.LLIIZ;
            if (viewPager != null) {
                viewPager.setAdapter(null);
            }
            LinearLayout linearLayout = this.LLIIIL;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
                C29306Beo.LJI(this.LLIIIL);
            }
            C29306Beo.LJI(this.LLIIIZ);
            C29306Beo.LJI(this.LLIFFJFJJ);
            MeasureLinearLayout measureLinearLayout = this.LLFF;
            if (measureLinearLayout != null) {
                measureLinearLayout.setCanSaveState(false);
            }
            CI8.LIZ(this.LLI, this.LJLLILLLL);
            this.LJLLILLLL = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.LJLJLJ = this.LJLJL;
    }

    @Override // X.C15G
    public final void LLILLL(int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            this.LLILLIZIL = SystemClock.uptimeMillis();
            EnumC09680Zo enumC09680Zo = this.LJLL;
            EnumC09680Zo enumC09680Zo2 = EnumC09680Zo.Keyboard;
            if (enumC09680Zo != enumC09680Zo2) {
                this.LJLL = enumC09680Zo2;
            }
            CIT.LIZ("Open keyboard");
            this.LJLJL = true;
            this.LLFFF.setIconAttr(R.attr.arl);
            this.LLFII.setIcon(R.drawable.cvn);
            if (!this.LLJJIJI) {
                if (this.LLIILZL.getVisibility() != 0) {
                    int Ml = Ml(i, false, true);
                    if (this.LLIIII != null && this.LLIIIZ != null && TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldOptimize()) {
                        if (this.LLJJJJLIIL == null) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            this.LLJJJJLIIL = valueAnimator;
                            valueAnimator.setDuration(100L);
                            this.LLJJJJLIIL.setFloatValues(0.0f, 1.0f);
                        }
                        this.LLJJJJLIIL.removeAllUpdateListeners();
                        float translationY = this.LLIIII.getTranslationY();
                        int width = this.LLIIIILZ.getWidth();
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLIIIILZ.getLayoutParams();
                        if (Ml == -1 || this.LLJJIJI) {
                            this.LLJJJJLIIL.addUpdateListener(new CIC(this, translationY, i));
                        } else {
                            this.LLJJJJLIIL.addUpdateListener(new CI6(this, translationY, i, layoutParams, width, Ml));
                        }
                        z2 = true;
                        Ll(false);
                        z3 = z2;
                    }
                } else {
                    Ml(i, false, false);
                }
                z2 = false;
                Ll(false);
                z3 = z2;
            } else {
                Ml(i, true, false);
                Ll(true);
            }
            this.LLIILZL.setVisibility(8);
            if (this.LLILZLL) {
                if (z3) {
                    this.LLJJJJLIIL.start();
                } else {
                    Tl(-i);
                }
            }
            this.LLIIJI = new B4Q(i, Dl(), true);
            C73943T0h.LIZ().LIZIZ(this.LLIIJI);
            InterfaceC31092CIe interfaceC31092CIe = this.LJLJJL;
            if (interfaceC31092CIe != null) {
                CIO cio = (CIO) interfaceC31092CIe;
                if (cio.LIZ == 0) {
                    cio.LIZ = SystemClock.elapsedRealtime();
                    return;
                }
                return;
            }
            return;
        }
        if (this.LJLL == EnumC09680Zo.Panel) {
            this.LLFF.setVisibility(0);
            if (this.LLIILZL.getVisibility() != 0) {
                this.LLIILZL.setVisibility(0);
                this.LLIILZL.post(new IDRunnableS6S0101000(2, this, 8));
            }
            int i2 = this.LLILZIL;
            if (this.LLILZLL) {
                Tl(0);
            }
            if (TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.isGroup3()) {
                try {
                    C018905p c018905p = (C018905p) this.LLIILII.getLayoutParams();
                    c018905p.bottomToTop = -1;
                    c018905p.bottomToBottom = R.id.eon;
                    this.LLIILII.setLayoutParams(c018905p);
                } catch (Exception e) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("error", e.getMessage());
                    C0K2.LJII(1, "ttlive_emoji_fragment_error", hashMap);
                }
                if (this.LLJJL == null) {
                    this.LLJJL = new Handler(C16880lQ.LLJJJJ());
                }
                this.LLJJL.post(new RunnableC63881P5h(i2, 0, this));
            }
            this.LLIIJI = new B4Q(i2, Dl(), true);
            C73943T0h.LIZ().LIZIZ(this.LLIIJI);
            return;
        }
        CIT.LIZ("close keyboard");
        if (LiveCommentInputDialogDismissFixSetting.getValue().enable && SystemClock.uptimeMillis() - this.LLILLIZIL < LiveCommentInputDialogDismissFixSetting.getValue().delayTime) {
            CIT.LIZ("Unexpected close keyboard");
            return;
        }
        if (this.LLILZLL) {
            if (this.LLJJIJI || !TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldOptimize()) {
                Tl(0);
            } else {
                Tl(Dl());
            }
        }
        if (!this.LJLJL) {
            return;
        }
        this.LJLJL = false;
        try {
            dismissAllowingStateLoss();
        } catch (Exception e2) {
            C0K2.LIZ("LiveEmojiInputDialogFragment", e2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        Y90 y90;
        User owner;
        boolean z4;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        Y90 y902;
        super.onViewCreated(view, bundle);
        if (this.LLILZLL) {
            this.LLIILII.LJLJJL = false;
            this.LLIIIZ.setVisibility(0);
            if (getDialog() != null) {
                Window window = getDialog().getWindow();
                this.LLJILLL = window.getNavigationBarColor();
                if (this.LLILZLL) {
                    C15I c15i = new C15I();
                    c15i.LIZ = this;
                    MeasureLinearLayout view2 = this.LLFF;
                    o.LJIIIZ(view2, "view");
                    c15i.LIZIZ = view2;
                    c15i.LIZJ = window;
                    new C15J(c15i.LIZ, view2, window);
                }
            }
        }
        Y90 y903 = this.LLIIL;
        if (y903 != null) {
            y903.setOnClickListener(new ViewOnClickListenerC13880ga(this.LLJJLIIIJLLLLLLLZ));
        }
        C16880lQ.LJJII(this.LLFFF, this.LLJJLIIIJLLLLLLLZ);
        if (Al() == null || !Al().emoteEnabled) {
            this.LLFII.setVisibility(8);
            C16880lQ.LJJII(this.LLFII, null);
        } else {
            this.LLFII.setVisibility(0);
            C16880lQ.LJJII(this.LLFII, this.LLJJLIIIJLLLLLLLZ);
            this.LLIIZ.setOnPageChangeListener(new CIA(this));
        }
        if (this.LJZ && (y902 = this.LLIIL) != null) {
            KL2.LJIILLIIL(8, y902);
        }
        KL2.LIZJ(getContext(), 8.0f);
        Context context = view.getContext();
        this.LLILIL = new C32161Oa(context);
        context.getResources().getDimensionPixelSize(R.dimen.acy);
        context.getResources().getDimensionPixelSize(R.dimen.acz);
        context.getResources().getDimensionPixelSize(R.dimen.acx);
        C32161Oa c32161Oa = this.LLILIL;
        c32161Oa.LIZIZ = this.LJLJJI;
        InterfaceC31090CIc interfaceC31090CIc = this.LJLJJLL;
        if (interfaceC31090CIc == null || (dataChannel2 = ((CIU) interfaceC31090CIc).LIZ.dataChannel) == null || ((Boolean) dataChannel2.kv0(BCW.class)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        c32161Oa.LIZLLL = z;
        this.LLILIL.LJIIIIZZ = this.LLJLIL;
        if (!this.LJZI.isEmpty()) {
            EmoteFixTextHelper emoteFixTextHelper = this.LLILII;
            if (emoteFixTextHelper.isReceiveInput) {
                emoteFixTextHelper.list.clear();
            }
            this.LLI.getEditableText().append((CharSequence) this.LJZI);
        } else {
            this.LLJI = true;
            EmoteFixTextHelper emoteFixTextHelper2 = this.LLILII;
            Editable editable = this.LLI.getEditableText();
            emoteFixTextHelper2.getClass();
            o.LJIIIZ(editable, "editable");
            Iterator<EmoteFixTextHelper.EmoteText> it = emoteFixTextHelper2.list.iterator();
            while (it.hasNext()) {
                EmoteFixTextHelper.EmoteText next = it.next();
                int i = next.state;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            editable.append((CharSequence) next.emoji);
                        }
                    } else {
                        EmoteModel emoteModel = next.emote;
                        if (emoteModel != null) {
                            C31418CUs.LIZIZ(emoteModel, CQW.INPUT_PANNEL, null, new AqS171S0100000_5(editable, 557));
                        }
                    }
                } else {
                    editable.append(next.text);
                }
            }
            this.LLJI = false;
        }
        InputAttrs Al = Al();
        if (Al != null) {
            Al.hasDraft = !this.LLILII.list.isEmpty();
        }
        if (this.LJLILLLLZI != 2) {
            ((ArrayList) this.LLJJI).add(this.LLILIL);
            this.LLFFF.setVisibility(0);
        } else {
            this.LLFFF.setVisibility(8);
        }
        if (this.LJLILLLLZI != 1) {
            C32181Oc c32181Oc = new C32181Oc(context);
            this.LLILL = c32181Oc;
            c32181Oc.LIZIZ = this.LJLJJI;
            InterfaceC31090CIc interfaceC31090CIc2 = this.LJLJJLL;
            if (interfaceC31090CIc2 == null || (dataChannel = ((CIU) interfaceC31090CIc2).LIZ.dataChannel) == null || ((Boolean) dataChannel.kv0(BCW.class)).booleanValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            c32181Oc.LIZLLL = z4;
            C32181Oc c32181Oc2 = this.LLILL;
            CI1 ci1 = new CI1(this);
            c32181Oc2.LJIIJ = ci1;
            c32181Oc2.LJIIIIZZ = new C42221lC(ci1, c32181Oc2);
            c32181Oc2.LJIIJJI = ci1;
            ((ArrayList) this.LLJJI).add(c32181Oc2);
        }
        Xl();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == room.getOwnerUserId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null && (owner = room2.getOwner()) != null) {
            z3 = owner.isSubscribed();
        } else {
            z3 = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (LiveEmoteLoadTimingOptSetting.INSTANCE.preLoadEmote(z3, z2)) {
                C16880lQ.LJLI(B73.LIZ().getLooper().getQueue(), new MessageQueue.IdleHandler() { // from class: X.CIB
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = LiveEmojiInputDialogFragment.this;
                        if (liveEmojiInputDialogFragment.getContext() == null) {
                            throw new NullPointerException("getResources");
                        }
                        C31106CIs.LIZ.LIZIZ(0, liveEmojiInputDialogFragment.getResources());
                        return false;
                    }
                });
            }
        } else if (LiveEmoteLoadTimingOptSetting.INSTANCE.preLoadEmote(z3, z2)) {
            C30326BvG.LIZ.post(new ARunnableS9S0101000_5(1, this, 7), null);
        }
        Kl(Gl());
        Ol();
        if (!this.LJLLLL && this.LJLLJ && (y90 = this.LLIIL) != null) {
            y90.LIZIZ(false);
        }
        Y90 y904 = this.LLIIL;
        if (y904 != null) {
            y904.setVisibility(8);
        }
        View findViewById = view.findViewById(R.id.kc7);
        C16880lQ.LJIIJ(new ACListenerS24S0101000_5(0, this, 0), findViewById);
        Boolean bool = (Boolean) this.LJLJJI.kv0(StarCommentEntranceVisibleEvent.class);
        if (bool == null || !bool.booleanValue()) {
            if (bool == null) {
                C0NB.LJ("InputFragment", "StarCommentEntranceVisibleEvent is null.");
            } else {
                C0NB.LJ("InputFragment", "StarCommentEntranceVisibleEvent is false.");
            }
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            C31079CHr.LJ(this.LJLJJI, "keyboard");
        }
        DataChannel dataChannel3 = this.LJLJJI;
        if (dataChannel3 != null) {
            dataChannel3.ov0(this, StarCommentEntranceVisibleEvent.class, new AObjectS122S0200000_5(this, findViewById, 2));
        }
        Ll(this.LLJJIJI);
        if (TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldOptimize()) {
            Tl(Dl());
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.ControllableDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        boolean showOptimize = LiveCommentDialogOptimizeSetting.showOptimize(this.LJLJJI);
        this.LLJJJIL = showOptimize;
        if (showOptimize) {
            showNow(fragmentManager, str);
        } else {
            super.show(fragmentManager, str);
        }
    }

    public final int Ml(int i, boolean z, boolean z2) {
        if (!TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.isGroup3()) {
            return -1;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLIIIILZ.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLIIIJ.getLayoutParams();
        if (z || this.LLJJIJI) {
            if (!this.LLJJIJIL) {
                return -1;
            }
            this.LLJJIJIL = false;
            layoutParams.width = -1;
            layoutParams.gravity = 80;
            this.LLIIIILZ.setLayoutParams(layoutParams);
            marginLayoutParams.setMarginStart(C15380j0.LIZ(12.0f));
            this.LLIIIJ.setLayoutParams(marginLayoutParams);
            return -1;
        }
        this.LLJJIJIL = true;
        int[] iArr = (int[]) DataChannelGlobal.LJLJJI.mv0(VideoSize.class);
        if (iArr == null || iArr.length < 2 || iArr[1] == 0) {
            return -1;
        }
        marginLayoutParams.setMarginStart(C15380j0.LIZ(8.0f));
        this.LLIIIJ.setLayoutParams(marginLayoutParams);
        int LJIIL = C15380j0.LJIIL() - ((int) ((iArr[0] / iArr[1]) * (C15380j0.LJIIJJI() - i)));
        if (C15410j3.LIZJ(getContext())) {
            LJIIL -= C15380j0.LJIILIIL();
        }
        layoutParams.gravity = 8388613;
        if (!z2) {
            layoutParams.width = LJIIL;
            this.LLIIIILZ.setLayoutParams(layoutParams);
            return -1;
        }
        this.LLIIIILZ.setLayoutParams(layoutParams);
        return LJIIL;
    }

    public final void Wl(String str, String str2, List<EmoteWithIndex> list) {
        if (this.LLIFFJFJJ != null && mo49getActivity() != null && C29306Beo.LJIJ(mo49getActivity().getRequestedOrientation())) {
            if (str != null && str2 != null && list != null) {
                C31418CUs.LIZ(list, CQW.REPLY_STAYTYPE, str2, null, null, new AObjectS54S1100000_5(this, str, 0), this, true);
            } else {
                this.LLIFFJFJJ.setVisibility(8);
            }
        }
    }

    public final void Zl(int i, int i2, boolean z) {
        boolean z2 = false;
        if (z) {
            this.LLFF.setVisibility(0);
            EnumC09680Zo enumC09680Zo = this.LJLL;
            EnumC09680Zo enumC09680Zo2 = EnumC09680Zo.Keyboard;
            if (enumC09680Zo != enumC09680Zo2) {
                this.LJLL = enumC09680Zo2;
            }
            if (this.LLILZ != i) {
                this.LLILZ = i;
            }
            if ((this.LLIL != null && this.LLIILZL.getVisibility() == 0) || this.LLIZ) {
                if (this.LLIILZL.getVisibility() == 0) {
                    this.LLFFF.setIconAttr(R.attr.arl);
                    this.LLFII.setIcon(R.drawable.cvn);
                    this.LLIILZL.setVisibility(8);
                    ViewTreeObserverOnPreDrawListenerC06930Oz.LIZ(this.LLIILZL, new ARunnableS9S0101000_5(i, this, 9));
                    this.LLIIJI = new B4Q(i, Dl(), true, false);
                    C73943T0h.LIZ().LIZIZ(this.LLIIJI);
                    this.LLILLIZIL = SystemClock.uptimeMillis();
                    CIT.LIZ("Open keyboard");
                    this.LLIIJLIL = new C31093CIf(i, Dl(), this.LLILZ, true);
                }
                if (i2 != i) {
                    z2 = true;
                }
                this.LLIZ = z2;
                this.LJLJL = true;
                return;
            }
            if (!this.LJLJL) {
                this.LLIIJI = new B4Q(i, Dl(), true, true);
                C73943T0h.LIZ().LIZIZ(this.LLIIJI);
                this.LLFFF.setIconAttr(R.attr.arl);
                this.LLFII.setIcon(R.drawable.cvn);
                this.LLIILZL.setVisibility(8);
                this.LLILLIZIL = SystemClock.uptimeMillis();
                CIT.LIZ("Open keyboard");
                this.LJLJL = true;
            }
            C31093CIf c31093CIf = new C31093CIf(i2, Dl(), this.LLILZ, true);
            this.LLIIJLIL = c31093CIf;
            this.LJLJJI.qv0(LiveInputProgressEvent.class, c31093CIf);
            Tl(-i2);
            return;
        }
        if (this.LJLL == EnumC09680Zo.Panel) {
            this.LLFF.setVisibility(0);
            if (this.LLIILZL.getVisibility() == 0) {
                return;
            }
            this.LLIILZL.setVisibility(0);
            ViewTreeObserverOnPreDrawListenerC06930Oz.LIZ(this.LLIILZL, new IDRunnableS6S0101000(1, this, 27));
            this.LLIILZL.post(new IDRunnableS6S0101000(2, this, 8));
            this.LLIIJI = new B4Q(this.LLILZIL, Dl(), true, false);
            C73943T0h.LIZ().LIZIZ(this.LLIIJI);
            this.LLIIJLIL = new C31093CIf(this.LLILZIL, Dl(), this.LLILZIL, true);
            return;
        }
        if (LiveCommentInputDialogDismissFixSetting.getValue().enable && SystemClock.uptimeMillis() - this.LLILLIZIL < LiveCommentInputDialogDismissFixSetting.getValue().delayTime) {
            CIT.LIZ("Unexpected close keyboard");
            return;
        }
        if (this.LLILZ < i2) {
            this.LLILZ = i2;
        }
        if (this.LJLJL) {
            this.LLIZLLLIL = true;
            this.LLIIJI = new B4Q(0, Dl(), false, true);
            C73943T0h.LIZ().LIZIZ(this.LLIIJI);
        }
        this.LJLJL = false;
        float f = i2;
        if (f == 1.0f && getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setNavigationBarColor(this.LLJILLL);
        }
        C31093CIf c31093CIf2 = new C31093CIf(i2, Dl(), this.LLILZ, false);
        this.LLIIJLIL = c31093CIf2;
        this.LJLJJI.qv0(LiveInputProgressEvent.class, c31093CIf2);
        int i3 = -i2;
        int i4 = this.LLILZ;
        if (i4 > 0) {
            float f2 = f / (i4 * 1.0f);
            if (f2 < 0.3d) {
                i3 = (int) C06420Na.LIZIZ(1.0f, f2, Dl(), i3);
            }
        }
        Tl(i3);
        if (f != 0.0f) {
            return;
        }
        CIT.LIZ("close keyboard");
        try {
            dismissAllowingStateLoss();
        } catch (Exception e) {
            C0K2.LIZ("LiveEmojiInputDialogFragment", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        String str;
        List<EmoteWithIndex> list;
        int i;
        View LLLLIILL;
        boolean z2;
        MeasureLinearLayout measureLinearLayout;
        o.LJIIIZ(inflater, "inflater");
        if (this.LLJJJJ && (measureLinearLayout = this.LLFF) != null) {
            if (measureLinearLayout.getParent() != null) {
                ((ViewGroup) this.LLFF.getParent()).removeAllViews();
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.LLJJJJJIL) {
                LLLLIILL = C20910rv.LJFF(R.layout.d4n, getContext(), viewGroup, false);
            } else {
                LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d4m, viewGroup, false);
            }
            this.LLFF = (MeasureLinearLayout) LLLLIILL;
            if (EnableLiveKeyboardWithHeightSetting.INSTANCE.getValue() && mo49getActivity() != null && mo49getActivity().getRequestedOrientation() == 1) {
                MeasureLinearLayout measureLinearLayout2 = this.LLFF;
                measureLinearLayout2.getClass();
                measureLinearLayout2.LJLIL = new C38931ft();
            }
            C30872C9s c30872C9s = (C30872C9s) this.LLFF.findViewById(R.id.nbu);
            this.LLIILII = c30872C9s;
            if (!this.LLF) {
                c30872C9s.setActivity(mo49getActivity());
            }
            this.LLFFF = (LiveIconView) LLLLIILL.findViewById(R.id.hbm);
            this.LLFII = (LiveIconView) LLLLIILL.findViewById(R.id.hbn);
            LiveIconView liveIconView = (LiveIconView) LLLLIILL.findViewById(R.id.joa);
            this.LLFZ = liveIconView;
            C16880lQ.LJJII(liveIconView, new ACListenerS32S0101000_15(0, this, 3));
            this.LLIIL = (Y90) LLLLIILL.findViewById(R.id.ags);
            this.LLIIII = LLLLIILL.findViewById(R.id.emq);
            this.LLIIIZ = LLLLIILL.findViewById(R.id.emr);
            this.LLIIIILZ = LLLLIILL.findViewById(R.id.eon);
            this.LLIIIJ = LLLLIILL.findViewById(R.id.l3r);
            this.LLIIIILZ.addOnLayoutChangeListener(new IDCListenerS254S0100000_5(this, 4));
            C31089CIb c31089CIb = (C31089CIb) LLLLIILL.findViewById(R.id.cps);
            this.LLI = c31089CIb;
            c31089CIb.setImeOptions(268435460);
            ((ArrayList) this.LLI.LJLL).add(new InterfaceC31088CIa() { // from class: X.CIY
                @Override // X.InterfaceC31088CIa
                public final void LIZ() {
                    LiveEmojiInputDialogFragment.this.LLILLL = 1;
                }
            });
            this.LLI.addTextChangedListener(this.LLJL);
            this.LLI.setOnKeyListener(new View.OnKeyListener() { // from class: X.CIJ
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                    LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = LiveEmojiInputDialogFragment.this;
                    liveEmojiInputDialogFragment.getClass();
                    if (66 != i2) {
                        return false;
                    }
                    if (1 == keyEvent.getAction()) {
                        liveEmojiInputDialogFragment.Nl(0);
                    }
                    return true;
                }
            });
            if (!this.LLILZLL) {
                C30872C9s c30872C9s2 = this.LLIILII;
                if (this.LJLLL && (mo49getActivity() == null || !C29306Beo.LJIIZILJ(mo49getActivity().getRequestedOrientation()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c30872C9s2.setShowStatusBar(z2);
            }
            this.LLII = (TextView) LLLLIILL.findViewById(R.id.cpv);
            this.LLIILZL = (LinearLayout) LLLLIILL.findViewById(R.id.cui);
            this.LLIIZ = (ViewPager) LLLLIILL.findViewById(R.id.ep0);
            if (getDialog() != null) {
                this.LLIILII.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0101000_15(0, this, 2)));
            }
            this.LLILZIL = C15380j0.LIZ(1.0f) + C15380j0.LJFF(R.dimen.ad1);
            C47121t6 c47121t6 = (C47121t6) LLLLIILL.findViewById(R.id.a6h);
            this.LLIFFJFJJ = c47121t6;
            c47121t6.LJJIJIL(R.style.a49);
        }
        this.LLFF.setCanSaveState(true);
        if (!this.LJLLL && this.LLJJIJI && LiveEomjiConvenientSetting.INSTANCE.isShowEmojiConvenient()) {
            try {
                Il(this.LLFF);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C16880lQ.LJLLJ(getClass()));
                LIZ.append(" : ");
                LIZ.append(e.getLocalizedMessage());
                C0NB.LIZLLL(X1D.LIZIZ(LIZ));
            }
        }
        this.LLI.setPadding(0, 0, 0, 0);
        if (this.LLJJJJ && this.LLI.getEditableText() != null) {
            this.LLJI = true;
            this.LLI.getEditableText().clear();
            this.LLJI = false;
        }
        C31089CIb et = this.LLI;
        o.LJIIIZ(et, "et");
        InputFilter[] filters = et.getFilters();
        o.LJIIIIZZ(filters, "et.filters");
        int length = filters.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (filters[i2] instanceof CIK) {
                    break;
                }
                i2++;
            } else {
                InputFilter[] filters2 = et.getFilters();
                o.LJIIIIZZ(filters2, "et.filters");
                ArrayList arrayList = (ArrayList) ORY.LJLIIIL(filters2);
                arrayList.add(new CIK());
                et.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
                break;
            }
        }
        Y90 y90 = this.LLIIL;
        if (y90 != null) {
            if (this.LJLZ) {
                i = 0;
            } else {
                i = 8;
            }
            KL2.LJIILLIIL(i, y90);
        }
        if (!this.LJLZ) {
            this.LJLLJ = false;
        }
        if (this.LJLL == EnumC09680Zo.Panel) {
            this.LLFF.setVisibility(0);
            this.LLIILZL.setVisibility(0);
            this.LLIILZL.post(new IDRunnableS6S0101000(2, this, 8));
            this.LLIIJI = new B4Q(this.LLILZIL, Dl(), true);
            C73943T0h.LIZ().LIZIZ(this.LLIIJI);
        } else {
            this.LLIILZL.setVisibility(8);
        }
        if (mo49getActivity() != null && C29306Beo.LJIJ(mo49getActivity().getRequestedOrientation())) {
            String str2 = this.LL;
            if (str2 != null && (str = this.LJZL) != null && (list = this.LLD) != null) {
                Wl(str, str2, list);
                this.LLIFFJFJJ.setVisibility(0);
            } else {
                this.LLIFFJFJJ.setVisibility(8);
            }
        }
        MeasureLinearLayout measureLinearLayout3 = this.LLFF;
        C29S c29s = null;
        if (!(measureLinearLayout3 instanceof View)) {
            measureLinearLayout3 = null;
        }
        if (measureLinearLayout3 != null) {
            try {
                ViewTreeLifecycleOwner.set(measureLinearLayout3, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(measureLinearLayout3, this);
                C10A.LIZIZ(measureLinearLayout3, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return measureLinearLayout3;
    }

    public static void xl(EmoteModel emoteModel, CJ0 cj0, C31413CUn c31413CUn, List list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if ((ListProtector.get(list, i) instanceof EmoteModel) && (str = emoteModel.emoteId) != null && str.equals(((EmoteModel) ListProtector.get(list, i)).emoteId)) {
                EmoteModel emoteModel2 = (EmoteModel) ListProtector.get(list, i);
                emoteModel2.shine = true;
                arrayList.add(emoteModel2);
                int oneLineCount = cj0.getOneLineCount();
                if (i > oneLineCount) {
                    cj0.getRecyclerView().LJLI(i - oneLineCount);
                }
            } else {
                arrayList.add(ListProtector.get(list, i));
            }
        }
        c31413CUn.LJZ(arrayList);
        c31413CUn.notifyDataSetChanged();
    }
}
