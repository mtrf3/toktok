package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base;

import X.ASL;
import X.AVS;
import X.AbstractC71812rp;
import X.ActivityC45651qj;
import X.AnonymousClass114;
import X.C00F;
import X.C04270Et;
import X.C100013wD;
import X.C101543yg;
import X.C1045248i;
import X.C1046348t;
import X.C1046648w;
import X.C105064Ak;
import X.C105084Am;
import X.C105114Ap;
import X.C105134Ar;
import X.C105174Av;
import X.C105394Br;
import X.C105454Bx;
import X.C111074Xn;
import X.C113634d5;
import X.C113644d6;
import X.C113774dJ;
import X.C118234kV;
import X.C16880lQ;
import X.C16970lZ;
import X.C1GE;
import X.C1HQ;
import X.C2068389v;
import X.C221108m2;
import X.C2U8;
import X.C32I;
import X.C32V;
import X.C36L;
import X.C39V;
import X.C3H0;
import X.C3XR;
import X.C3XT;
import X.C42625Go9;
import X.C45804HyK;
import X.C45L;
import X.C46318IFu;
import X.C47261Igj;
import X.C49R;
import X.C4AS;
import X.C4B8;
import X.C4BE;
import X.C4BI;
import X.C4BJ;
import X.C4BN;
import X.C4BS;
import X.C4BT;
import X.C4BU;
import X.C4D1;
import X.C4FF;
import X.C4LS;
import X.C4XM;
import X.C4YG;
import X.C56308M8a;
import X.C61878OQg;
import X.C62822Ol8;
import X.C62846OlW;
import X.C6ZT;
import X.C71432rD;
import X.C71442rE;
import X.C71512rL;
import X.C71582rS;
import X.C71922s0;
import X.C72092sH;
import X.C72142sM;
import X.C73340SqO;
import X.C772831o;
import X.C783835u;
import X.C78613UtF;
import X.C78842Uww;
import X.C79004UzY;
import X.C79045V0n;
import X.C80533Eb;
import X.C80763Ey;
import X.C81253Gv;
import X.C81273Gx;
import X.C84683Ua;
import X.C85323Wm;
import X.C87393br;
import X.C87687YbD;
import X.C88003cq;
import X.C88113d1;
import X.C88963eO;
import X.C90193gN;
import X.C91093hp;
import X.C91963jE;
import X.C92843ke;
import X.C93023kw;
import X.C93073l1;
import X.C98063t4;
import X.C98563ts;
import X.C99033ud;
import X.EnumC73222u6;
import X.EnumC91113hr;
import X.InterfaceC1032343j;
import X.KL2;
import X.LFH;
import X.ORY;
import X.ORZ;
import X.QD3;
import X.RunnableC105094An;
import X.X1D;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS27S0300000_1;
import Y.ACListenerS36S0200000_1;
import Y.AObserverS65S0200000_1;
import Y.AObserverS69S0100000_1;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS7S0110000_1;
import Y.IDLListenerS55S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Range;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.ActionBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.mention.viewmodel.MentionPanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerBottomSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS105S0300000_1;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.IDqS448S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;

/* loaded from: classes2.dex */
public class InputView extends BaseInputView implements C4BE, C3XT {
    public static final String LLIZ = C16880lQ.LJLLJ(InputView.class);
    public final ViewGroup LJLLLLLL;
    public final C99033ud LJLZ;
    public final WeakReference<Fragment> LJZ;
    public final LifecycleOwner LJZI;
    public final boolean LJZL;
    public final View LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public ViewGroup LLFFF;
    public C105114Ap LLFII;
    public TuxIconView LLFZ;
    public C91963jE LLI;
    public ViewGroup LLIFFJFJJ;
    public TuxIconView LLII;
    public View LLIIII;
    public AVS LLIIIILZ;
    public C3XR LLIIIJ;
    public final boolean LLIIIL;
    public final boolean LLIIIZ;
    public final boolean LLIIJI;
    public final boolean LLIIJLIL;
    public final boolean LLIIL;
    public final RunnableC105094An LLIILII;
    public final ChatViewModel LLIILZL;
    public final IDqS448S0100000_1 LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public C45L LLILL;
    public final C62822Ol8 LLILLIZIL;
    public final C62822Ol8 LLILLJJLI;
    public final C62822Ol8 LLILLL;
    public final C62822Ol8 LLILZ;
    public final C62822Ol8 LLILZIL;
    public final C62822Ol8 LLILZLL;

    @Override // X.C3XT
    public final void LIZJ() {
    }

    public int LJJIFFI() {
        return R.layout.b7j;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public /* bridge */ /* synthetic */ void onPause() {
        C105134Ar.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C105134Ar.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public /* bridge */ /* synthetic */ void onStop() {
        C105134Ar.LIZLLL(this);
    }

    private final C3XR LJJIII() {
        ViewStub viewStub = (ViewStub) this.LJLLLLLL.findViewById(R.id.gh4);
        final LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        final Context context = this.LJLLLLLL.getContext();
        viewStub.setLayoutInflater(new LayoutInflater(LLZIL, context) { // from class: X.4Aj
            @Override // android.view.LayoutInflater
            public final LayoutInflater cloneInContext(Context context2) {
                return C16880lQ.LLZIL(context2);
            }

            @Override // android.view.LayoutInflater
            public final View inflate(int i, ViewGroup viewGroup, boolean z) {
                Context context2 = InputView.this.LJLLLLLL.getContext();
                o.LJIIIIZZ(context2, "parentViewGroup.context");
                View LIZJ = C16970lZ.LIZJ(i, C45804HyK.LJIJJ(context2), viewGroup, z);
                o.LJIIIIZZ(LIZJ, "inflate(parentViewGroup.…urce, root, attachToRoot)");
                return LIZJ;
            }
        });
        View inflate = viewStub.inflate();
        View view = this.LJLJJLL;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS55S0200000_1(inflate, view, 0));
        }
        o.LJII(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        WeakReference<Fragment> weakReference = this.LJZ;
        C99033ud c99033ud = this.LJLZ;
        o.LJII(c99033ud, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.GroupSessionInfo");
        return new C3XR(inflate, weakReference, (C98563ts) c99033ud, this);
    }

    @Override // X.InterfaceC105124Aq
    public final boolean AQ() {
        C4BT c4bt = this.LJLJL;
        if (c4bt == null || c4bt.LJLILLLLZI == -1) {
            return false;
        }
        LJIILJJIL();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIIIIZZ() {
        C98063t4.LIZIZ("chat");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIIJ() {
        if (this.LJZL) {
            C98063t4.LIZJ("chat", "chat_panel", Boolean.valueOf(LJJIIJZLJL()), 8);
        } else {
            C98063t4.LIZJ("chat", null, Boolean.valueOf(LJJIIJZLJL()), 10);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIILJJIL() {
        if (this.LJLLILLLL == -1) {
            return;
        }
        super.LJIILJJIL();
        C3XR c3xr = this.LLIIIJ;
        if (c3xr != null) {
            c3xr.LIZIZ(null);
        }
    }

    public final boolean LJJIIJZLJL() {
        ChatViewModel chatViewModel;
        C4YG c4yg = this.LJLILLLLZI;
        Editable editable = null;
        if (c4yg != null) {
            editable = c4yg.getText();
        }
        if ((editable == null || editable.length() == 0) && ((chatViewModel = this.LLIILZL) == null || chatViewModel.hv0() == null)) {
            return false;
        }
        return true;
    }

    public final boolean LJJIIZI() {
        if ((this.LJLZ.isAuthorSupporterChat() && (C100013wD.LIZ & 4) == 4) || this.LJLZ.isGroupChat()) {
            return false;
        }
        IMUser LJIIJ = C80533Eb.LJIIJ(String.valueOf(C81273Gx.LIZLLL(this.LJLZ.getConversationId())), C79004UzY.LJIILIIL(this.LJLZ.getConversationId()));
        if (LJIIJ == null) {
            return true;
        }
        if (LJIIJ.getFollowStatus() != 2 && !C36L.LIZJ(LJIIJ)) {
            return true;
        }
        return false;
    }

    public final void LJJIJIIJI() {
        TuxIconView tuxIconView;
        C4YG c4yg;
        if (!this.LLIIIZ && (c4yg = this.LJLILLLLZI) != null) {
            c4yg.setVisibility(8);
        }
        if (this.LLIIIL || (tuxIconView = this.LJLJI) == null) {
            return;
        }
        tuxIconView.setVisibility(8);
    }

    public final void LJJIJIL() {
        Drawable background;
        Integer num = (Integer) this.LLILLJJLI.getValue();
        if (num != null) {
            LJJIJIIJIL(num.intValue());
        }
        Integer num2 = (Integer) this.LLILLL.getValue();
        if (num2 != null) {
            int intValue = num2.intValue();
            ImageView imageView = (ImageView) this.LJLLLLLL.findViewById(R.id.cox);
            if (imageView != null) {
                imageView.setColorFilter(intValue);
            }
            View findViewById = this.LJLLLLLL.findViewById(R.id.b9v);
            if (findViewById != null && (background = findViewById.getBackground()) != null) {
                background.setColorFilter(intValue, PorterDuff.Mode.SRC_ATOP);
            }
        }
    }

    public final void LJJIL() {
        if (this.LLIIIJ == null) {
            C3XR LJJIII = LJJIII();
            this.LLIIIJ = LJJIII;
            LJJIIZ(LJJIII);
        }
        C3XR c3xr = this.LLIIIJ;
        if (c3xr != null) {
            c3xr.LJFF();
        }
    }

    public final void LJJJI() {
        int i;
        Editable editableText;
        C93073l1 c93073l1;
        C3XR c3xr;
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null) {
            i = c4yg.getSelectionStart();
        } else {
            i = 0;
        }
        C4YG c4yg2 = this.LJLILLLLZI;
        if (c4yg2 == null || (editableText = c4yg2.getEditableText()) == null) {
            return;
        }
        Integer LJJII = LJJII(i, editableText);
        if (LJJII != null) {
            if (this.LLIIIJ == null) {
                C3XR LJJIII = LJJIII();
                this.LLIIIJ = LJJIII;
                LJJIIZ(LJJIII);
            }
            if (this.LLILII) {
                return;
            }
            Object[] spans = editableText.getSpans(LJJII.intValue(), i, C93073l1.class);
            if (spans == null || (c93073l1 = (C93073l1) ORY.LJJJLZIJ(spans)) == null) {
                String charSequence = editableText.subSequence(LJJII.intValue() + 1, i).toString();
                if (s.LJJJLZIJ(charSequence, "  ", false) || s.LJJJZ(charSequence, '\n') || charSequence == null) {
                    charSequence = "";
                }
                C3XR c3xr2 = this.LLIIIJ;
                if (c3xr2 != null) {
                    c3xr2.LJI(charSequence);
                    return;
                }
                return;
            }
            Range range = c93073l1.LIZLLL;
            if (range == null || range.getTo() >= i || (c3xr = this.LLIIIJ) == null) {
                return;
            }
            c3xr.LIZIZ(new AqS151S0100000_1(this, 90));
            return;
        }
        C3XR c3xr3 = this.LLIIIJ;
        if (c3xr3 != null) {
            c3xr3.LIZIZ(new AqS151S0100000_1(this, 91));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public boolean onBackPressed() {
        if (this.LJZL) {
            return true;
        }
        C4BT c4bt = this.LJLJL;
        if (c4bt == null || c4bt.LJLILLLLZI == -1) {
            return false;
        }
        LJIILJJIL();
        return true;
    }

    @Override // X.InterfaceC105124Aq
    public void vb() {
        Editable text;
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg == null || (text = c4yg.getText()) == null) {
            return;
        }
        C101543yg c101543yg = C101543yg.LIZ;
        Context context = getContext();
        String conversationId = this.LJLZ.getConversationId();
        AqS132S0200000_1 aqS132S0200000_1 = new AqS132S0200000_1(this, text, 10);
        c101543yg.getClass();
        C101543yg.LIZ(context, conversationId, aqS132S0200000_1);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIIIZ() {
        C98063t4.LIZ(Boolean.valueOf(LJJIIJZLJL()));
    }

    public final void LJIJJ() {
        C72142sM c72142sM;
        if (C88963eO.LJ() && !C88963eO.LIZJ()) {
            TuxIconView tuxIconView = this.LJLJI;
            if (tuxIconView != null && !tuxIconView.isSelected() && (c72142sM = (C72142sM) this.LLILLIZIL.getValue()) != null && C72142sM.LIZJ(c72142sM)) {
                AVS avs = this.LLIIIILZ;
                if (avs == null) {
                    return;
                }
                avs.setVisibility(0);
                return;
            }
            AVS avs2 = this.LLIIIILZ;
            if (avs2 == null) {
                return;
            }
            avs2.setVisibility(8);
        }
    }

    public final List<RichTextInfo> LJJIIJ() {
        C4YG c4yg;
        Editable editableText;
        Collection collection;
        List<C93073l1> list;
        ArrayList arrayList;
        String str;
        C3H0 c3h0;
        Editable editableText2;
        Object[] spans;
        if (!C81253Gv.LIZ() || (c4yg = this.LJLILLLLZI) == null || (editableText = c4yg.getEditableText()) == null) {
            return null;
        }
        C3XR c3xr = this.LLIIIJ;
        if (c3xr != null) {
            MentionPanelViewModel mentionPanelViewModel = c3xr.LJFF;
            if (mentionPanelViewModel == null || (collection = ORZ.LLJI(mentionPanelViewModel.LJZI)) == null) {
                collection = C61878OQg.INSTANCE;
            }
        } else {
            collection = null;
        }
        if (!C1GE.LJIILIIL(collection)) {
            return null;
        }
        C4YG c4yg2 = this.LJLILLLLZI;
        if (c4yg2 != null && (editableText2 = c4yg2.getEditableText()) != null && (spans = editableText2.getSpans(0, editableText.length(), C93073l1.class)) != null) {
            list = ORY.LJJZZIII(spans);
        } else {
            list = null;
        }
        if (!C1GE.LJIILIIL(list)) {
            return null;
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (C93073l1 c93073l1 : list) {
                Range range = c93073l1.LIZLLL;
                if (range != null && (str = c93073l1.LIZIZ) != null) {
                    if (o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
                        c3h0 = C3H0.MENTION_ALL;
                    } else {
                        c3h0 = C3H0.MENTION_SINGLE;
                    }
                    arrayList.add(new RichTextInfo(range.getFrom(), range.getTo() - range.getFrom(), c3h0.getValue(), str));
                }
            }
        } else {
            arrayList = null;
        }
        if (!C1GE.LJIILIIL(arrayList)) {
            return null;
        }
        return arrayList;
    }

    public final void LJJIZ() {
        Activity LJIJJ;
        Context context = getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && C73340SqO.LJJIJ(LJIJJ)) {
            AnonymousClass114.LIZ(LJIJJ, R.string.en0);
        }
    }

    public final void LJJJ() {
        String str;
        Editable text;
        List<RichTextInfo> LJJIIJ = LJJIIJ();
        ChatViewModel chatViewModel = this.LLIILZL;
        if (chatViewModel != null) {
            String conversationId = this.LJLZ.getConversationId();
            C4YG c4yg = this.LJLILLLLZI;
            if (c4yg != null && (text = c4yg.getText()) != null) {
                str = text.toString();
            } else {
                str = null;
            }
            o.LJIIIZ(conversationId, "conversationId");
            XKX.LIZLLL(ViewModelKt.getViewModelScope(chatViewModel), C78613UtF.LIZJ, null, new C39V(chatViewModel, conversationId, str, LJJIIJ, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public final void onDestroy() {
        super.onDestroy();
        C16970lZ.LJII(R.layout.b7p);
        C42625Go9.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIIJJI() {
        C87393br.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIIZILJ() {
        super.LJIIZILJ();
    }

    public boolean LJIL() {
        return this.LLIIJI;
    }

    public boolean LJJ() {
        return this.LLIIJLIL;
    }

    public boolean LJJI() {
        return this.LLIIL;
    }

    @Override // X.C3XT
    public final void LIZ(String uid) {
        Editable text;
        List LJJZZIII;
        Range range;
        C3XR c3xr;
        o.LJIIIZ(uid, "uid");
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null && (text = c4yg.getText()) != null) {
            Object[] spans = text.getSpans(0, text.length(), C93073l1.class);
            Object obj = null;
            if (spans != null && (LJJZZIII = ORY.LJJZZIII(spans)) != null) {
                Iterator it = LJJZZIII.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (o.LJ(((C93073l1) next).LIZIZ, uid)) {
                        obj = next;
                        break;
                    }
                }
                C93073l1 c93073l1 = (C93073l1) obj;
                if (c93073l1 != null && (range = c93073l1.LIZLLL) != null) {
                    text.delete(range.getFrom(), range.getTo());
                    if (LJJZZIII.size() == 1 && (c3xr = this.LLIIIJ) != null) {
                        c3xr.LJ();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public C4BS LIZLLL(C4BS c4bs) {
        if (C113634d5.LIZ()) {
            C105394Br c105394Br = c4bs.LJ;
            c105394Br.LIZJ = true;
            c105394Br.LIZLLL = true;
        }
        if (C71922s0.LIZ().enable) {
            c4bs.LJ.LJ = true;
        }
        c4bs.LJ.LIZ = true;
        return c4bs;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public void LJII(ViewGroup viewGroup) {
        int i;
        AVS avs;
        View findViewById = viewGroup.findViewById(R.id.ep2);
        o.LJIIIIZZ(findViewById, "parentViewGroup.findView…d(R.id.input_root_layout)");
        this.LLFFF = (ViewGroup) findViewById;
        C1045248i c1045248i = C49R.LIZ;
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.kmj);
        if (viewStub != null) {
            viewStub.setLayoutResource(LJJIFFI());
        }
        if (this.LL != null) {
            final LayoutInflater LLZIL = C16880lQ.LLZIL(viewGroup.getContext());
            final Context context = viewGroup.getContext();
            viewStub.setLayoutInflater(new LayoutInflater(LLZIL, context) { // from class: X.4Au
                @Override // android.view.LayoutInflater
                public final LayoutInflater cloneInContext(Context context2) {
                    return C16880lQ.LLZIL(context2);
                }

                @Override // android.view.LayoutInflater
                public final View inflate(int i2, ViewGroup viewGroup2, boolean z) {
                    return InputView.this.LL;
                }
            });
        }
        viewStub.inflate();
        this.LJLJJLL = viewGroup.findViewById(R.id.cow);
        this.LJLILLLLZI = (C4YG) viewGroup.findViewById(R.id.gnm);
        this.LJLJI = (TuxIconView) viewGroup.findViewById(R.id.cu2);
        this.LLIIIILZ = (AVS) viewGroup.findViewById(R.id.cu3);
        this.LLII = (TuxIconView) viewGroup.findViewById(R.id.dq1);
        this.LLIIII = viewGroup.findViewById(R.id.av7);
        this.LJLJJI = viewGroup.findViewById(R.id.jo1);
        this.LLFZ = (TuxIconView) viewGroup.findViewById(R.id.jv_);
        this.LJLJL = (C4BT) viewGroup.findViewById(R.id.hho);
        this.LLI = (C91963jE) viewGroup.findViewById(R.id.iwc);
        View findViewById2 = viewGroup.findViewById(R.id.b9v);
        o.LJIIIIZZ(findViewById2, "parentViewGroup.findView…d.chat_constraint_layout)");
        this.LLIFFJFJJ = (ViewGroup) findViewById2;
        TuxIconView tuxIconView = this.LJLJI;
        int i2 = 0;
        if (tuxIconView != null && !tuxIconView.isSelected() && C91093hp.LJ() && C113634d5.LIZ() && LJJ() && (avs = this.LLIIIILZ) != null) {
            avs.setVisibility(0);
        }
        TuxIconView tuxIconView2 = this.LJLJI;
        if (tuxIconView2 != null) {
            C2068389v c2068389v = new C2068389v();
            if (C88963eO.LJFF()) {
                i = R.raw.icon_sticker_round;
            } else {
                i = R.raw.icon_emoji;
            }
            c2068389v.LIZ = i;
            c2068389v.LJFF = true;
            tuxIconView2.setTuxIcon(c2068389v);
        }
        if (this.LJLZ.isGroupChat() && C00F.LIZ(31744, 0, "tt_im_mention_in_group_chat_strategy", true) >= 3) {
            TuxIconView tuxIconView3 = (TuxIconView) viewGroup.findViewById(R.id.gha);
            this.LJLJJL = tuxIconView3;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(0);
            }
        }
        if (C88963eO.LJFF()) {
            TuxIconView tuxIconView4 = this.LLII;
            if (tuxIconView4 != null) {
                tuxIconView4.setIconRes(R.raw.icon_image_square);
            }
            TuxIconView tuxIconView5 = this.LLII;
            if (tuxIconView5 != null) {
                tuxIconView5.setTintColorRes(R.attr.go);
            }
        }
        View view = this.LJLJJI;
        if (view != null) {
            view.setVisibility(0);
        }
        LJIJI(false);
        TuxIconView tuxIconView6 = this.LLFZ;
        if (tuxIconView6 != null) {
            tuxIconView6.setVisibility(8);
        }
        Drawable drawable = null;
        if (LJJI()) {
            ViewGroup viewGroup2 = this.LLFFF;
            if (viewGroup2 != null) {
                this.LLFII = new C105114Ap(this, viewGroup2, this.LJLZ.getConversationId());
            } else {
                o.LJIJI("inputRootLayout");
                throw null;
            }
        }
        LJJIJIIJI();
        if (this.LJLZ.isSingleChat() && C113774dJ.LIZ() && LJIL()) {
            TuxIconView tuxIconView7 = this.LLII;
            if (tuxIconView7 != null) {
                tuxIconView7.setVisibility(0);
            }
            View view2 = this.LLIIII;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            C99033ud sessionInfo = this.LJLZ;
            C85323Wm onEventV3 = C772831o.LIZ();
            o.LJIIIZ(sessionInfo, "sessionInfo");
            o.LJIIIZ(onEventV3, "onEventV3");
            C1HQ LJ = C783835u.LJ(sessionInfo);
            onEventV3.LIZIZ("show_album_entrance", LJ);
            onEventV3.LIZIZ("show_camera_entrance", LJ);
            TuxIconView tuxIconView8 = this.LLII;
            if (tuxIconView8 != null) {
                C16880lQ.LJJJ(tuxIconView8, new ACListenerS21S0100000_1(this, 39));
            }
            View view3 = this.LLIIII;
            if (view3 != null) {
                C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 40), view3);
            }
        } else {
            TuxIconView tuxIconView9 = this.LLII;
            if (tuxIconView9 != null) {
                tuxIconView9.setVisibility(8);
            }
            View view4 = this.LLIIII;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            Integer LJI = C79045V0n.LJI(c1045248i.LJIIIZ, context2);
            if (LJI != null) {
                i2 = LJI.intValue();
            }
            ViewGroup viewGroup3 = this.LLIFFJFJJ;
            if (viewGroup3 != null) {
                Drawable LIZIZ = C04270Et.LIZIZ(context2, C1045248i.LIZ(c1045248i));
                if (LIZIZ != null) {
                    LIZIZ.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
                    drawable = LIZIZ;
                }
                viewGroup3.setBackground(drawable);
                ImageView imageView = (ImageView) viewGroup.findViewById(R.id.cox);
                if (imageView != null) {
                    imageView.setColorFilter(i2);
                }
            } else {
                o.LJIJI("chatContainer");
                throw null;
            }
        }
        Context context3 = viewGroup.getContext();
        o.LJIIIIZZ(context3, "parentViewGroup.context");
        Integer LJI2 = C79045V0n.LJI(c1045248i.LIZLLL, context3);
        if (LJI2 != null) {
            LJJIJIIJIL(LJI2.intValue());
        }
        C91963jE c91963jE = this.LLI;
        if (c91963jE != null) {
            c91963jE.setCloseButtonOnClick(new ACListenerS21S0100000_1(this, 41));
        }
        C4BT c4bt = this.LJLJL;
        if (c4bt != null) {
            c4bt.setFixKeyboardHeight(this.LJZL);
        }
        C4BT c4bt2 = this.LJLJL;
        if (c4bt2 != null) {
            c4bt2.setNeedBlockResetOnScreenOrientation(LFH.LIZIZ.LIZLLL().block().LJI());
        }
        super.LJII(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIILL(boolean z) {
        if (this.LJLLJ == z) {
            return;
        }
        super.LJIILL(z);
        if (z) {
            Integer num = (Integer) this.LLD.getValue();
            if (num != null) {
                int intValue = num.intValue();
                C4YG c4yg = this.LJLILLLLZI;
                if (c4yg != null) {
                    c4yg.setHintTextColor(intValue);
                }
            }
        } else {
            Integer num2 = (Integer) this.LLFF.getValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                C4YG c4yg2 = this.LJLILLLLZI;
                if (c4yg2 != null) {
                    c4yg2.setHintTextColor(intValue2);
                }
            }
        }
        Integer num3 = (Integer) this.LLF.getValue();
        if (num3 != null) {
            int intValue3 = num3.intValue();
            C4YG c4yg3 = this.LJLILLLLZI;
            if (c4yg3 != null) {
                c4yg3.setTextColor(intValue3);
            }
        }
        LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIILLIIL(int i) {
        super.LJIILLIIL(i);
        if (i == 1 && C88963eO.LJ() && this.LLILLIZIL.getValue() != null) {
            C72142sM.LIZIZ();
        }
        LJJJIL(null);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIJ(boolean z) {
        super.LJIJ(z);
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null && !tuxIconView.isSelected() && C91093hp.LJ() && C113634d5.LIZ() && LJJ()) {
            AVS avs = this.LLIIIILZ;
            if (avs == null) {
                return;
            }
            avs.setVisibility(0);
            return;
        }
        AVS avs2 = this.LLIIIILZ;
        if (avs2 == null) {
            return;
        }
        avs2.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJI(boolean r6) {
        /*
            r5 = this;
            android.view.View r4 = r5.LJLJJI
            if (r4 == 0) goto L42
            boolean r3 = r4.isActivated()
            r4.setActivated(r6)
            r4.setEnabled(r6)
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L4b
            if (r6 == 0) goto L47
            r0 = 2130968670(0x7f04005e, float:1.7546E38)
        L19:
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r1)
            if (r0 == 0) goto L4b
            int r2 = r0.intValue()
        L23:
            if (r6 == 0) goto L43
            r1 = 2130968641(0x7f040041, float:1.7545941E38)
        L28:
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            r0.setTint(r2)
            boolean r0 = r4 instanceof com.bytedance.tux.icon.TuxIconView
            if (r0 == 0) goto L3b
            r0 = r4
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            if (r0 == 0) goto L3b
            r0.setTintColorRes(r1)
        L3b:
            if (r6 == 0) goto L42
            if (r3 != 0) goto L42
            X.C105624Co.LIZ(r4)
        L42:
            return
        L43:
            r1 = 2130968612(0x7f040024, float:1.7545883E38)
            goto L28
        L47:
            r0 = 2130968931(0x7f040163, float:1.754653E38)
            goto L19
        L4b:
            r2 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView.LJIJI(boolean):void");
    }

    public final boolean LJIJJLI(String str) {
        String str2;
        int i;
        boolean z;
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (o.LJIIJJI(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else {
                    if (!z) {
                        break;
                    }
                    length--;
                }
            }
            str2 = str.subSequence(i2, length + 1).toString();
        } else {
            str2 = null;
        }
        return TextUtils.isEmpty(str2);
    }

    public final void LJJIIZ(final C3XR c3xr) {
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null) {
            c4yg.setOnMentionDeleted(new AqS167S0100000_1(c3xr, 64));
        }
        this.LJLJLJ = new C4BN() { // from class: X.4B2
            @Override // X.C4BN
            public final void LIZ(int i) {
                if (i != 0) {
                    if (i != 8) {
                        return;
                    }
                    c3xr.LIZIZ(null);
                } else {
                    InputView.this.LJJJI();
                    InputView inputView = InputView.this;
                    if (!inputView.LLILII) {
                        return;
                    }
                    inputView.LLILII = false;
                }
            }
        };
        c3xr.LIZJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0145, code lost:
    
        if (r13 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0031, code lost:
    
        if (r13 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(X.C792239a r13) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView.LJJIJ(X.39a):void");
    }

    public final void LJJIJIIJIL(int i) {
        ViewGroup viewGroup = this.LLFFF;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i);
            View view = this.LJLJJLL;
            if (view != null) {
                view.setBackgroundColor(i);
                return;
            }
            return;
        }
        o.LJIJI("inputRootLayout");
        throw null;
    }

    public final void LJJIJL(int i) {
        ViewGroup viewGroup = this.LLFFF;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        } else {
            o.LJIJI("inputRootLayout");
            throw null;
        }
    }

    public final void LJJIJLIJ(boolean z) {
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null) {
            c4yg.post(new ARunnableS7S0110000_1(this, z, 1));
        }
    }

    public final void LJJJIL(List<? extends C105454Bx> list) {
        int intValue;
        int LJIIJJI;
        int LIZ;
        int LIZ2;
        C62846OlW c62846OlW;
        UrlModel urlModel;
        UrlModel urlModel2;
        C105114Ap c105114Ap = this.LLFII;
        if (c105114Ap != null) {
            final C45L c45l = this.LLILL;
            c105114Ap.LJIILL.removeCallbacksAndMessages(null);
            if (list == null || ((ArrayList) list).isEmpty()) {
                C4BI c4bi = c105114Ap.LJIILJJIL;
                if (c4bi != null && c4bi.isShowing()) {
                    c4bi.dismiss();
                    return;
                }
                return;
            }
            C105084Am.LIZIZ(c105114Ap.LIZJ);
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() == 1) {
                intValue = ((Number) c105114Ap.LJII.getValue()).intValue();
                if (C90193gN.LIZ()) {
                    LIZ2 = c105114Ap.LIZ();
                } else {
                    LJIIJJI = KL2.LJIIJJI(c105114Ap.LJFF.getContext()) - ((Number) c105114Ap.LJII.getValue()).intValue();
                    LIZ = c105114Ap.LIZ();
                    LIZ2 = LJIIJJI - LIZ;
                }
            } else if (arrayList.size() == 2) {
                intValue = ((Number) c105114Ap.LJIIIIZZ.getValue()).intValue();
                if (C90193gN.LIZ()) {
                    LIZ2 = c105114Ap.LIZ();
                } else {
                    LJIIJJI = KL2.LJIIJJI(c105114Ap.LJFF.getContext()) - ((Number) c105114Ap.LJIIIIZZ.getValue()).intValue();
                    LIZ = c105114Ap.LIZ();
                    LIZ2 = LJIIJJI - LIZ;
                }
            } else {
                intValue = ((Number) c105114Ap.LJIIIZ.getValue()).intValue();
                if (C90193gN.LIZ()) {
                    LIZ2 = c105114Ap.LIZ();
                } else {
                    LJIIJJI = KL2.LJIIJJI(c105114Ap.LJFF.getContext()) - ((Number) c105114Ap.LJIIIZ.getValue()).intValue();
                    LIZ = c105114Ap.LIZ();
                    LIZ2 = LJIIJJI - LIZ;
                }
            }
            ((ViewGroup) c105114Ap.LJI.getValue()).removeAllViews();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C105454Bx c105454Bx = (C105454Bx) it.next();
                ViewGroup viewGroup = (ViewGroup) c105114Ap.LJI.getValue();
                C62846OlW c62846OlW2 = new C62846OlW(((View) c105114Ap.LJI.getValue()).getContext());
                c62846OlW2.setScaleType(ImageView.ScaleType.FIT_XY);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(c105114Ap.LIZIZ(), c105114Ap.LIZIZ());
                marginLayoutParams.rightMargin = c105114Ap.LIZ();
                c62846OlW2.setLayoutParams(marginLayoutParams);
                Emoji emoji = c105454Bx.LIZJ;
                if (emoji != null) {
                    UrlModel urlModel3 = new UrlModel();
                    ArrayList arrayList2 = new ArrayList();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("file://");
                    LIZ3.append(C73340SqO.LJJIIJ(emoji));
                    arrayList2.add(X1D.LIZIZ(LIZ3));
                    urlModel3.setUrlList(arrayList2);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("file://");
                    LIZ4.append(C73340SqO.LJJIIJ(emoji));
                    urlModel3.setUri(X1D.LIZIZ(LIZ4));
                    c62846OlW = c62846OlW2;
                    C4AS.LIZIZ(c62846OlW2, urlModel3, null, 0, 0, 0, 0, null, 508);
                    C16880lQ.LJJJJJL(c62846OlW2, new ACListenerS27S0300000_1(c105114Ap, c105454Bx, emoji, 7));
                } else {
                    c62846OlW = c62846OlW2;
                }
                SetSticker setSticker = c105454Bx.LJ;
                if (setSticker != null) {
                    Integer stickerType = setSticker.getStickerType();
                    int type = EnumC73222u6.ANIMATED.getType();
                    if (stickerType == null || stickerType.intValue() != type) {
                        int type2 = EnumC73222u6.STATIC.getType();
                        if (stickerType != null && stickerType.intValue() == type2) {
                            StickerUrlStruct staticUrl = setSticker.getStaticUrl();
                            if (staticUrl != null) {
                                urlModel2 = staticUrl.getMidResolutionUrl();
                            } else {
                                urlModel2 = null;
                            }
                            C4AS.LJII(c62846OlW, urlModel2, "sticker_search_view_sticker", null, null, c105114Ap.LIZIZ(), c105114Ap.LIZIZ(), 408);
                        }
                    } else {
                        StickerUrlStruct animateUrl = setSticker.getAnimateUrl();
                        if (animateUrl == null || (urlModel = animateUrl.getMidResolutionUrl()) == null) {
                            StickerUrlStruct staticUrl2 = setSticker.getStaticUrl();
                            if (staticUrl2 != null) {
                                urlModel = staticUrl2.getMidResolutionUrl();
                            } else {
                                urlModel = null;
                            }
                        }
                        C4AS.LIZIZ(c62846OlW, urlModel, "sticker_search_view_sticker", c105114Ap.LIZIZ(), c105114Ap.LIZIZ(), 0, 0, null, 480);
                    }
                    c62846OlW.getHierarchy().LJIJ(R.drawable.bjo);
                    c62846OlW.getHierarchy().LJIIZILJ(R.drawable.bjo);
                    C16880lQ.LJJJJJL(c62846OlW, new ACListenerS36S0200000_1(setSticker, c105114Ap, 50));
                }
                viewGroup.addView(c62846OlW);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = ((Number) c105114Ap.LJIILIIL.getValue()).intValue();
            layoutParams.width = intValue;
            c105114Ap.LJFF.setLayoutParams(layoutParams);
            C4BI c4bi2 = c105114Ap.LJIILJJIL;
            if (c4bi2 != null && c4bi2.isShowing()) {
                C4BI c4bi3 = c105114Ap.LJIILJJIL;
                if (c4bi3 != null) {
                    c4bi3.dismiss();
                }
            } else {
                C4BI c4bi4 = new C4BI();
                c105114Ap.LJIILJJIL = c4bi4;
                c4bi4.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.4BG
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        C4BL c4bl = c45l;
                        if (c4bl != null) {
                            c4bl.LIZ();
                        }
                    }
                });
            }
            C4BI c4bi5 = c105114Ap.LJIILJJIL;
            if (c4bi5 != null) {
                ViewGroup viewGroup2 = c105114Ap.LJFF;
                int i = layoutParams.height;
                c4bi5.LIZ = viewGroup2;
                c4bi5.setContentView(viewGroup2);
                c4bi5.setWidth(-2);
                c4bi5.setHeight(-2);
                c4bi5.setOutsideTouchable(true);
                c4bi5.LIZIZ = i;
            }
            C4BI c4bi6 = c105114Ap.LJIILJJIL;
            if (c4bi6 != null) {
                View view = c105114Ap.LIZIZ;
                int i2 = -((Number) c105114Ap.LJIIL.getValue()).intValue();
                c4bi6.dismiss();
                if (view != null) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int i3 = iArr[0] + LIZ2;
                    int i4 = (iArr[1] - c4bi6.LIZIZ) + i2;
                    if (C4XM.LIZ()) {
                        C56308M8a.LIZ();
                    }
                    C46318IFu.LIZ.getClass();
                    if (C46318IFu.LIZ()) {
                        try {
                            C56308M8a.LIZIZ();
                            Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c4bi6));
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            int i5 = attributes.flags;
                            boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                            C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                            attributes.flags &= -16777217;
                            c4bi6.showAtLocation(view, 0, i3, i4);
                            C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                            attributes.flags = i5;
                        } catch (Throwable unused) {
                            c4bi6.showAtLocation(view, 0, i3, i4);
                        }
                    } else {
                        c4bi6.showAtLocation(view, 0, i3, i4);
                    }
                }
            }
            C4BI c4bi7 = c105114Ap.LJIILJJIL;
            if (c4bi7 != null) {
                c4bi7.update(layoutParams.width, layoutParams.height);
            }
            c105114Ap.LJIILL.postDelayed(new ARunnableS37S0100000_1(c105114Ap, 94), 5000L);
            if (c45l == null) {
                return;
            }
            c45l.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public final void LLLZLZ(C105454Bx baseEmoji) {
        o.LJIIIZ(baseEmoji, "baseEmoji");
        C101543yg c101543yg = C101543yg.LIZ;
        Context context = getContext();
        String conversationId = this.LJLZ.getConversationId();
        AqS132S0200000_1 aqS132S0200000_1 = new AqS132S0200000_1(this, baseEmoji, 9);
        c101543yg.getClass();
        C101543yg.LIZ(context, conversationId, aqS132S0200000_1);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        boolean z = true;
        if (LJIJJLI(String.valueOf(editable))) {
            LJIJI(false);
        } else {
            LJIJI(!this.LLILIL);
        }
        if (C81253Gv.LIZ() && this.LJLZ.isGroupChat()) {
            LJJJI();
        }
        LJJIJIIJI();
        RunnableC105094An runnableC105094An = this.LLIILII;
        if (editable == null || editable.length() <= 0) {
            z = false;
        }
        runnableC105094An.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = runnableC105094An.LJLIL + 2000;
        if (j <= elapsedRealtime || !z) {
            runnableC105094An.LJLIL = elapsedRealtime;
            return;
        }
        ViewGroup viewGroup = runnableC105094An.LJLILLLLZI.LLFFF;
        if (viewGroup != null) {
            viewGroup.removeCallbacks(runnableC105094An);
            ViewGroup viewGroup2 = runnableC105094An.LJLILLLLZI.LLFFF;
            if (viewGroup2 != null) {
                viewGroup2.postDelayed(runnableC105094An, j - elapsedRealtime);
                return;
            } else {
                o.LJIJI("inputRootLayout");
                throw null;
            }
        }
        o.LJIJI("inputRootLayout");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public final void i30(String emojiText) {
        o.LJIIIZ(emojiText, "emojiText");
        super.i30(emojiText);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView;
        TuxAlertBadgeLayout tuxAlertBadgeLayout;
        List LJJIJ;
        Activity activity;
        ActivityC45651qj activityC45651qj;
        View view2;
        ChatViewModel chatViewModel;
        Context context;
        Activity LJIJJ;
        ActivityC45651qj activityC45651qj2;
        ActivityC45651qj activityC45651qj3;
        FragmentManager supportFragmentManager;
        Context context2;
        Activity LJIJJ2;
        Resources resources;
        DisplayMetrics displayMetrics;
        super.onClick(view);
        Activity activity2 = null;
        if (o.LJ(view, this.LLFZ)) {
            if (C6ZT.LIZIZ(view, 500L)) {
                return;
            }
            Context context3 = getContext();
            if (context3 != null) {
                activity2 = C45804HyK.LJIJJ(context3);
            }
            if (!(activity2 instanceof ActivityC45651qj) || (activityC45651qj3 = (ActivityC45651qj) activity2) == null || (supportFragmentManager = activityC45651qj3.getSupportFragmentManager()) == null || (context2 = getContext()) == null || (LJIJJ2 = C45804HyK.LJIJJ(context2)) == null || (resources = LJIJJ2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                return;
            }
            float f = displayMetrics.heightPixels;
            FavoriteVideoPickerBottomSheet favoriteVideoPickerBottomSheet = new FavoriteVideoPickerBottomSheet();
            ASL asl = new ASL();
            asl.LIZ.LJLLILLLL = favoriteVideoPickerBottomSheet;
            asl.LJI(2);
            asl.LIZJ((int) (0.7f * f), (int) (f * 1.0f));
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJZI = false;
            tuxSheet.LJLLJ = true;
            tuxSheet.LJZL = true;
            tuxSheet.LJLILLLLZI = favoriteVideoPickerBottomSheet;
            favoriteVideoPickerBottomSheet.LJLJJLL = new C4BJ(this);
            tuxSheet.show(supportFragmentManager, LLIZ);
            C85323Wm LIZ = C772831o.LIZ();
            C1HQ LIZ2 = C111074Xn.LIZ(LIZ, "eventSender", "enter_from", "chat", "video_type", "liked");
            User LIZJ = C80763Ey.LIZJ();
            o.LJI(LIZJ);
            LIZ2.put("video_cnt", String.valueOf(LIZJ.getFavoritingCount()));
            LIZ.LIZIZ("show_video_panel", LIZ2);
            return;
        }
        C4BU c4bu = this.LJLJLLL;
        if (c4bu != null) {
            imageView = c4bu.LJII();
        } else {
            imageView = null;
        }
        if (o.LJ(view, imageView)) {
            if (!C6ZT.LIZIZ(view, 500L) && (context = getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && C73340SqO.LJJIJ(LJIJJ)) {
                boolean LJJIIZI = LJJIIZI();
                if (LJJIIZI) {
                    LJJIZ();
                    return;
                }
                if (LJJIIZI) {
                    return;
                }
                Activity LJIJJ3 = C45804HyK.LJIJJ(LJIJJ);
                if (!(LJIJJ3 instanceof ActivityC45651qj) || (activityC45651qj2 = (ActivityC45651qj) LJIJJ3) == null) {
                    return;
                }
                C4D1.LIZ(activityC45651qj2, new IDqS426S0100000_1(this, 0));
                C105064Ak.LIZ();
                return;
            }
            return;
        }
        if (o.LJ(view, this.LJLJJI)) {
            if (!C6ZT.LIZIZ(view, 500L) && (view2 = this.LJLJJI) != null && view2.isActivated() && (chatViewModel = this.LLIILZL) != null) {
                chatViewModel.iv0(null);
                return;
            }
            return;
        }
        C4BU c4bu2 = this.LJLJLLL;
        if (c4bu2 != null) {
            tuxAlertBadgeLayout = c4bu2.LJIIIIZZ();
        } else {
            tuxAlertBadgeLayout = null;
        }
        if (!o.LJ(view, tuxAlertBadgeLayout) || C6ZT.LIZ(view)) {
            return;
        }
        C71512rL.LJII.getClass();
        if (C71512rL.LJIIIIZZ && C91093hp.LJ()) {
            C91093hp.LJIIJ(false);
            C2U8.LIZ(new C72092sH(false));
        }
        if (C113644d6.LIZIZ()) {
            LJJIJ = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC91113hr.VIDEO_STICKER.getType()), Integer.valueOf(EnumC91113hr.STICKER_SET.getType()));
        } else {
            LJJIJ = C47261Igj.LJJIJ(Integer.valueOf(EnumC91113hr.STICKER_SET.getType()));
        }
        Context context4 = getContext();
        if (context4 != null) {
            activity = C45804HyK.LJIJJ(context4);
        } else {
            activity = null;
        }
        if (!(activity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) activity) == null) {
            return;
        }
        C88113d1.LIZJ(activityC45651qj, LJJIJ, this.LJLZ.getConversationId(), null);
        C91093hp.LJI();
        C84683Ua.LJFF.LIZIZ(new C88003cq(), true);
        C91093hp.LJIIIIZZ();
        C4BU c4bu3 = this.LJLJLLL;
        if (c4bu3 != null) {
            c4bu3.LJIIIIZZ().LIZIZ();
        }
        C87393br.LJIJJ("chat", "click");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowRedDot(C72092sH event) {
        AVS avs;
        o.LJIIIZ(event, "event");
        if (event.LJLIL) {
            TuxIconView tuxIconView = this.LJLJI;
            if (tuxIconView == null || tuxIconView.isSelected() || !C113634d5.LIZ() || !LJJ() || (avs = this.LLIIIILZ) == null) {
                return;
            }
            avs.setVisibility(0);
            return;
        }
        AVS avs2 = this.LLIIIILZ;
        if (avs2 == null) {
            return;
        }
        avs2.setVisibility(8);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUseStickerSet(C71432rD event) {
        Long setId;
        o.LJIIIZ(event, "event");
        if (this.LJLJLLL == null) {
            LJFF(this.LJZI);
            StickerSetInfo stickerSetInfo = event.LJLIL;
            if (stickerSetInfo != null && (setId = stickerSetInfo.getSetId()) != null) {
                long longValue = setId.longValue();
                C71442rE c71442rE = C71442rE.LJII;
                if (c71442rE.LJIIL(Long.valueOf(longValue)).LIZIZ == null) {
                    AbstractC71812rp.LJIIJJI(c71442rE, C47261Igj.LJJIJ(Long.valueOf(longValue)), false, 2);
                }
            }
        }
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            tuxIconView.setSelected(true);
            LJIILLIIL(1);
            LJIJ(true);
        }
        C4BU c4bu = this.LJLJLLL;
        if (c4bu != null) {
            c4bu.kI(event.LJLIL);
        }
    }

    public static Integer LJJII(int i, Editable editable) {
        C118234kV it = C78842Uww.LJJ(0, i).iterator();
        Object obj = null;
        while (it.LJLJI) {
            Object next = it.next();
            if (editable.charAt(((Number) next).intValue()) == '@') {
                obj = next;
            }
        }
        return (Integer) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (X.ORY.LJJJLZIJ(r0) != null) goto L14;
     */
    @Override // X.C3XT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "uid"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.4YG r3 = r7.LJLILLLLZI
            if (r3 == 0) goto L71
            int r6 = r3.getSelectionStart()
            android.text.Editable r1 = r3.getEditableText()
            java.lang.String r0 = "it.editableText"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Integer r5 = LJJII(r6, r1)
            r4 = 0
            if (r5 == 0) goto L4c
            int r2 = r5.intValue()
            android.text.Editable r1 = r3.getEditableText()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Class<X.3l1> r0 = X.C93073l1.class
            java.lang.Object[] r0 = r1.getSpans(r2, r6, r0)
            if (r0 == 0) goto L36
            java.lang.Object r0 = X.ORY.LJJJLZIJ(r0)
            if (r0 != 0) goto L4c
        L36:
            android.text.Editable r1 = r3.getText()
            if (r1 == 0) goto L4c
            int r0 = r5.intValue()
            int r0 = r0 + 1
            java.lang.CharSequence r0 = r1.subSequence(r0, r6)
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L4e
        L4c:
            java.lang.String r2 = ""
        L4e:
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r0)
            if (r0 == 0) goto L65
            android.view.ViewGroup r0 = r7.LLFFF
            if (r0 == 0) goto L72
            android.content.Context r1 = r0.getContext()
            r0 = 2131827969(0x7f111d01, float:1.9288866E38)
            java.lang.String r9 = r1.getString(r0)
        L65:
            if (r9 == 0) goto L71
            r0 = 2130968580(0x7f040004, float:1.7545818E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.LJI(r0, r9, r8, r2)
        L71:
            return
        L72:
            java.lang.String r0 = "inputRootLayout"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView.LIZIZ(java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public final void T0(C32V c32v, C4B8 stickerEnterMethod) {
        o.LJIIIZ(stickerEnterMethod, "stickerEnterMethod");
        C101543yg c101543yg = C101543yg.LIZ;
        Context context = getContext();
        String conversationId = this.LJLZ.getConversationId();
        AqS105S0300000_1 aqS105S0300000_1 = new AqS105S0300000_1(this, c32v, stickerEnterMethod, 0);
        c101543yg.getClass();
        C101543yg.LIZ(context, conversationId, aqS105S0300000_1);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC1032943p
    public final void LJIIL(View view, int i, int i2, boolean z) {
        boolean z2;
        InterfaceC1032343j interfaceC1032343j;
        C1046648w actionBarDisplayManager;
        boolean z3;
        super.LJIIL(view, i, i2, z);
        if (i2 != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        LifecycleOwner lifecycleOwner = this.LJZI;
        if ((lifecycleOwner instanceof InterfaceC1032343j) && (interfaceC1032343j = (InterfaceC1032343j) lifecycleOwner) != null && (actionBarDisplayManager = interfaceC1032343j.getActionBarDisplayManager()) != null) {
            ActionBarComponent actionBarComponent = actionBarDisplayManager.LIZJ;
            if (actionBarComponent != null) {
                z3 = actionBarComponent.LIZ();
            } else {
                z3 = true;
            }
            actionBarDisplayManager.LIZ("keyboard_minimized", z2, z3);
        }
        if (i2 != 1) {
            C71512rL.LJII.getClass();
            if (C71512rL.LJIIIIZZ && C91093hp.LJ() && i == 1) {
                C91093hp.LJIIJ(false);
                C2U8.LIZ(new C72092sH(false));
            } else {
                LJIJJ();
            }
            C4BU c4bu = this.LJLJLLL;
            if (c4bu != null) {
                c4bu.LJIILJJIL();
            }
            if (i == 1) {
                C71512rL.LJIIIIZZ = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        List list;
        C3XR c3xr;
        C3XR c3xr2 = this.LLIIIJ;
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
                    if (str != null && (c3xr = this.LLIIIJ) != null) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Object obj;
        ?? r4;
        CharSequence charSequence2;
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null) {
            obj = c4yg.getTag(R.id.kg);
        } else {
            obj = null;
        }
        if ((obj instanceof CharSequence) && (charSequence2 = (CharSequence) obj) != null && TextUtils.equals(charSequence2, charSequence)) {
            C4YG c4yg2 = this.LJLILLLLZI;
            if (c4yg2 != null) {
                c4yg2.setTag(R.id.kg, null);
            }
        } else if (charSequence == null || charSequence.length() == 0) {
            LJJJIL(null);
        } else {
            List<Emoji> LJ = C4FF.LJ(charSequence.toString());
            if (LJ != null) {
                r4 = new ArrayList(C32I.LJJL(LJ, 10));
                for (Emoji emoji : LJ) {
                    C105454Bx c105454Bx = new C105454Bx();
                    c105454Bx.LIZIZ = C1GE.LJ(emoji);
                    c105454Bx.LIZJ = emoji;
                    r4.add(c105454Bx);
                }
            } else {
                r4 = C61878OQg.INSTANCE;
            }
            ?? r3 = C61878OQg.INSTANCE;
            if (C71922s0.LIZ().enable) {
                List<SetSticker> LIZ = C71582rS.LIZ(charSequence.toString());
                r3 = new ArrayList(C32I.LJJL(LIZ, 10));
                for (SetSticker setSticker : LIZ) {
                    C105454Bx c105454Bx2 = new C105454Bx();
                    c105454Bx2.LJ = setSticker;
                    r3.add(c105454Bx2);
                }
            }
            LJJJIL(ORZ.LLIIIZ(r3, r4));
        }
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZ() && (i3 != 0 || i != 0)) {
            C93023kw.LIZ(this.LJLZ.getConversationId());
        }
        IDqS448S0100000_1 iDqS448S0100000_1 = this.LLIIZ;
        if (iDqS448S0100000_1 != null) {
            iDqS448S0100000_1.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public InputView(ViewGroup viewGroup, C99033ud c99033ud, WeakReference<Fragment> weakReference, LifecycleOwner lifecycleOwner, boolean z, View view) {
        super(lifecycleOwner);
        ChatViewModel chatViewModel;
        boolean z2;
        this.LJLLLLLL = viewGroup;
        this.LJLZ = c99033ud;
        this.LJZ = weakReference;
        this.LJZI = lifecycleOwner;
        this.LJZL = z;
        this.LL = view;
        this.LLD = C221108m2.LIZIZ(new AqS151S0100000_1(this, 96));
        this.LLF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 99));
        this.LLFF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 97));
        this.LLIIIZ = true;
        this.LLIIJI = true;
        this.LLIIJLIL = true;
        this.LLIIL = true;
        Fragment fragment = weakReference.get();
        if (fragment != null) {
            chatViewModel = C92843ke.LIZ(fragment);
        } else {
            chatViewModel = null;
        }
        this.LLIILZL = chatViewModel;
        C221108m2.LIZIZ(new AqS151S0100000_1(this, 98));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C1046348t.LJLIL);
        this.LLILLIZIL = LIZIZ;
        this.LLILLJJLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 94));
        this.LLILLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 93));
        this.LLILZ = C221108m2.LIZIZ(C105174Av.LJLIL);
        this.LLILZIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 92));
        this.LLILZLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 95));
        this.LLIIIL = true;
        if (c99033ud.isAuthorSupporterChat()) {
            int i = C100013wD.LIZ;
            if ((i & 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLIIIZ = z2;
            this.LLIIIL = (i & 8) == 8;
        }
        this.LLIIIL = true ^ C4LS.LIZ();
        this.LLIILII = new RunnableC105094An(this);
        LJII(viewGroup);
        super.LJI();
        TuxIconView tuxIconView = this.LLFZ;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, this);
        }
        TuxIconView tuxIconView2 = this.LJLJJL;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS21S0100000_1(this, 178));
        }
        Fragment fragment2 = weakReference.get();
        if (fragment2 != null && chatViewModel != null) {
            chatViewModel.LJLJLJ.observe(fragment2, new AObserverS65S0200000_1(chatViewModel, this, 11));
            chatViewModel.LJLJLLL.observe(fragment2, new AObserverS69S0100000_1(this, 107));
            chatViewModel.LJLLJ.observe(fragment2, new AObserverS69S0100000_1(this, 108));
        }
        if (c99033ud.isGroupChat() && C81253Gv.LIZ()) {
            this.LLIIZ = new IDqS448S0100000_1(this, 0);
            C16970lZ.LJ(R.layout.b7p, viewGroup.getContext());
        }
        LJIJJ();
        if (LIZIZ.getValue() != null) {
            C72142sM.LIZ();
        }
        C42625Go9.LIZIZ(this);
    }
}
