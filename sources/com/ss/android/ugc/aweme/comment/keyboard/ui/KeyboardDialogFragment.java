package com.ss.android.ugc.aweme.comment.keyboard.ui;

import X.AV1;
import X.ActivityC45651qj;
import X.C018905p;
import X.C105244Bc;
import X.C105394Br;
import X.C10A;
import X.C110154Tz;
import X.C111024Xi;
import X.C111534Zh;
import X.C112094ab;
import X.C112214an;
import X.C117654jZ;
import X.C118824lS;
import X.C16880lQ;
import X.C174596tD;
import X.C175016tt;
import X.C175276uJ;
import X.C176996x5;
import X.C177156xL;
import X.C177326xc;
import X.C177336xd;
import X.C1791071e;
import X.C1791171f;
import X.C1791271g;
import X.C1791371h;
import X.C1791471i;
import X.C1791871m;
import X.C1792171p;
import X.C1793372b;
import X.C1793872g;
import X.C1794572n;
import X.C1799274i;
import X.C1801275c;
import X.C186577Tx;
import X.C188727au;
import X.C2068389v;
import X.C224748ru;
import X.C27740Aue;
import X.C32151Nz;
import X.C45804HyK;
import X.C48841JEv;
import X.C4VN;
import X.C4VR;
import X.C53816LAe;
import X.C53946LFe;
import X.C55230Lly;
import X.C55247LmF;
import X.C62846OlW;
import X.C71Y;
import X.C72434Sbm;
import X.C72713SgH;
import X.C72714SgI;
import X.C72O;
import X.C72W;
import X.C74Z;
import X.C75W;
import X.C76800UCe;
import X.C77321UWf;
import X.C78765Uvh;
import X.C78886Uxe;
import X.C78939UyV;
import X.C79004UzY;
import X.C79045V0n;
import X.C7EP;
import X.C7EV;
import X.C7K4;
import X.C7YC;
import X.C88463da;
import X.C8W2;
import X.C8WN;
import X.EF7;
import X.EnumC1796673i;
import X.FMX;
import X.HG3;
import X.InterfaceC177046xA;
import X.InterfaceC177116xH;
import X.InterfaceC1791671k;
import X.InterfaceC1792471s;
import X.InterfaceC1793272a;
import X.InterfaceC1801475e;
import X.InterfaceC182577En;
import X.InterfaceC55235Lm3;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import X.KL2;
import X.LFH;
import X.QD3;
import X.RBX;
import X.V8L;
import X.ViewOnClickListenerC13880ga;
import X.W5F;
import X.W5U;
import X.X1D;
import X.Y87;
import Y.ACListenerS22S0101000_3;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS26S0101000_8;
import Y.ACListenerS30S0101000_13;
import Y.ACListenerS32S0101000_15;
import Y.ACListenerS51S0000000_3;
import Y.AObserverS56S0000000_3;
import Y.IDObjectS176S0100000_3;
import Y.IDRunnableS6S0101000;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.commentpage.viewmodel.CommentColorModeViewModel;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.multipanel.EmojiInputViewImplV2;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public class KeyboardDialogFragment extends BaseDialogFragment implements TextWatcher, DialogInterface.OnShowListener, InterfaceC182577En, InterfaceC1801475e, InterfaceC1793272a {
    public static final /* synthetic */ int LLLF = 0;
    public ViewGroup LJLJI;
    public ImageView LJLJJI;
    public View LJLJJL;
    public C72434Sbm LJLJJLL;
    public C224748ru LJLJL;
    public C62846OlW LJLJLJ;
    public FrameLayout LJLJLLL;
    public LinearLayout LJLL;
    public TuxIconView LJLLI;
    public TuxIconView LJLLILLLL;
    public TuxIconView LJLLJ;
    public TuxIconView LJLLL;
    public TuxIconView LJLLLL;
    public TuxIconView LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public View LJZI;
    public C62846OlW LJZL;
    public View LL;
    public SmartImageView LLD;
    public LinearLayout LLF;
    public C1791171f LLFF;
    public FrameLayout LLFFF;
    public C111534Zh LLFII;
    public View LLFZ;
    public LinearLayout LLI;
    public FrameLayout LLIFFJFJJ;
    public C111024Xi LLII;
    public View LLIIII;
    public View LLIIIILZ;
    public View LLIIIJ;
    public View LLIIIL;
    public ViewGroup LLIIIZ;
    public ViewGroup LLIIJI;
    public ViewGroup LLIIJLIL;
    public C72W LLIIL;
    public FrameLayout LLIILII;
    public C112094ab LLIILZL;
    public C7YC LLIIZ;
    public InterfaceC1791671k LLIL;
    public InterfaceC177116xH LLILII;
    public C1801275c LLILIL;
    public boolean LLILL;
    public String LLILLIZIL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public Aweme LLIZ;
    public String LLIZLLLIL;
    public Emoji LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public C176996x5 LLJILJIL;
    public CommentVideoModel.Type LLJILJILJ;
    public InterfaceC82683Wch LLJILLL;
    public GiftViewModel LLJJ;
    public final C4VR LLJJI;
    public final C1791271g LLJJIII;
    public CharSequence LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C177326xc LLJJIJIL;
    public C174596tD LLJJJ;
    public int LLJJJIL;
    public final IVideoGiftService LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public ActivityC45651qj LLJJL;
    public CommentColorModeViewModel LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;

    public final void Kl() {
        C177156xL Dl = Dl();
        getArguments().putInt("argIsInvokedFromFakeEditText", -1);
        C7YC c7yc = this.LLIIZ;
        if (c7yc != null) {
            ((C176996x5) c7yc).LJJJ(this.LJLJL.getText(), this.LJLJL.getMentionExtraStructList(), this.LLJ, this.LLJILJIL.LJZL, false, this.LLJJJIL, Dl);
            this.LLJJI.LIZIZ();
            C1793872g.LJIIL(this.LLJJI.LIZLLL(this.LJLJL.getText()));
        }
    }

    @Override // X.InterfaceC1801475e
    public final boolean Q0(String str) {
        return false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onMentionPanelEvent(C1794572n c1794572n) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // X.InterfaceC1793272a
    public final boolean Gk() {
        if (this.LLILZ || this.LLILZIL) {
            return true;
        }
        return false;
    }

    public final Set<String> Gl() {
        HashSet hashSet = new HashSet();
        CommentEditText$MentionSpan[] mentionSpan = this.LJLJL.getMentionSpan();
        if (mentionSpan != null && mentionSpan.length != 0) {
            for (CommentEditText$MentionSpan commentEditText$MentionSpan : mentionSpan) {
                hashSet.add(commentEditText$MentionSpan.uid);
            }
        }
        return hashSet;
    }

    public final boolean Il() {
        if (this.LLILZ || this.LLILZIL) {
            return true;
        }
        return false;
    }

    public final boolean Ml() {
        if (this.LJLJL.getMentionExtraStructList() != null && this.LJLJL.getMentionExtraStructList().size() >= 5) {
            return true;
        }
        return false;
    }

    public final void Nl() {
        int measuredHeight = this.LLII.getMeasuredHeight() - this.LLIIII.getMeasuredHeight();
        float LIZJ = KL2.LIZJ(getContext(), 220.0f);
        if (measuredHeight >= LIZJ) {
            measuredHeight = (int) LIZJ;
        }
        if (measuredHeight > 0 && this.LLJLLL != measuredHeight) {
            C8WN.LIZIZ.LJ(measuredHeight);
        }
        this.LLJLLL = measuredHeight;
    }

    public final void Ql() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_color_repost;
        c2068389v.LIZIZ = C32151Nz.LJIILLIIL(16);
        c2068389v.LIZJ = C32151Nz.LJIILLIIL(16);
        this.LLD.getHierarchy().LJIILL(c2068389v.LIZ(this.LLD.getContext()), 1);
        V8L v8l = this.LLD.getHierarchy().LIZJ;
        if (v8l == null) {
            v8l = new V8L();
        }
        v8l.LIZLLL(KL2.LIZJ(getContext(), 1.0f));
        v8l.LJFF = C79045V0n.LJI(R.attr.cl, getContext()).intValue();
        this.LLD.getHierarchy().LJIL(v8l);
        this.LLD.setVisibility(0);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        C176996x5 c176996x5 = this.LLJILJIL;
        if (c176996x5 != null && c176996x5.LL) {
            return;
        }
        this.LLILIL = null;
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        InterfaceC177116xH interfaceC177116xH = this.LLILII;
        if (interfaceC177116xH != null) {
            Emoji emoji = this.LLJ;
            C177156xL Dl = Dl();
            C176996x5 c176996x52 = (C176996x5) interfaceC177116xH;
            c176996x52.LLILZIL = false;
            c176996x52.LJJIIJZLJL(emoji, Dl);
        }
        this.LLJ = null;
        if (this.LLJILJILJ != CommentVideoModel.Type.NONE) {
            this.LJLJJI.setVisibility(8);
            if (C175276uJ.LIZIZ()) {
                this.LJLLILLLL.setVisibility(8);
            }
            InterfaceC82683Wch interfaceC82683Wch = this.LLJILLL;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.dismiss();
            }
        }
        C224748ru c224748ru = this.LJLJL;
        if (c224748ru != null && Build.VERSION.SDK_INT < 23) {
            c224748ru.setCursorVisible(false);
        }
    }

    public final boolean vl() {
        if (this.LLJLILLLLZIIL || !HG3.LJIILL().isLogin() || !this.LLILL) {
            return false;
        }
        if (this.LJLJL.getMentionExtraStructList() != null && this.LJLJL.getMentionExtraStructList().size() >= 5) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1793272a
    public final List<CommentPersonalizedEmoji> wj() {
        return C75W.LIZIZ(this.LLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.71g] */
    public KeyboardDialogFragment() {
        PatternProtector.compile("^\\s*$");
        this.LLILZ = false;
        this.LLILZIL = false;
        this.LLILZLL = false;
        this.LLIZLLLIL = "";
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJILJILJ = CommentVideoModel.Type.NONE;
        new HashSet();
        new ArrayList();
        this.LLJJ = null;
        this.LLJJI = new C4VR();
        this.LLJJIII = new InterfaceC1792471s() { // from class: X.71g
            @Override // X.InterfaceC1792471s
            public final void P0() {
                KeyboardDialogFragment.this.Kl();
            }
        };
        this.LLJJIJIIJIL = true;
        this.LLJJJIL = 0;
        this.LLJJJJ = VideoGiftService.LJI();
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJL = false;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = false;
        this.LLJLL = 0;
        this.LLJLLIL = false;
        this.LLJZIJLIL = false;
        this.LLL = true;
    }

    public final C177156xL Dl() {
        int i = getArguments().getInt("argIsInvokedFromFakeEditText", -1);
        String str = "";
        String string = getArguments().getString("rec_type", "");
        String string2 = getArguments().getString("fromPage", "");
        if (i != 0) {
            if (i == 1) {
                str = "input_box";
            }
        } else {
            str = "comment_button";
        }
        C177156xL c177156xL = new C177156xL(str, string2);
        c177156xL.LJI = string;
        c177156xL.LJII = Integer.valueOf(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(getContext(), this.LLIZ));
        c177156xL.LJIIIIZZ = this.LJLJL.getEmojiSpanList();
        return c177156xL;
    }

    public final boolean Hl() {
        if (getArguments() != null && (getArguments().getInt("viewType") == 1 || getArguments().getInt("viewType") == 2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ActivityC45651qj mo49getActivity;
        C224748ru c224748ru;
        super.onDestroy();
        C176996x5 c176996x5 = this.LLJILJIL;
        if (c176996x5 != null && (c224748ru = this.LJLJL) != null && ((CopyOnWriteArrayList) c176996x5.LLIIIJ).contains(c224748ru)) {
            ((CopyOnWriteArrayList) c176996x5.LLIIIJ).remove(c224748ru);
        }
        C1791071e.LIZIZ.LJFF(C8W2.ON_DESTROY);
        C112094ab c112094ab = this.LLIILZL;
        if (c112094ab != null) {
            C48841JEv.LIZJ(c112094ab.LJLJLLL, null);
        }
        if (this.LLJJ != null && (mo49getActivity = mo49getActivity()) != null) {
            this.LLJJ.iv0().removeObservers(mo49getActivity);
            this.LLJJ.jv0().removeObservers(mo49getActivity);
            this.LLJJ.kv0().removeObservers(mo49getActivity);
            this.LLJJ.lv0().removeObservers(mo49getActivity);
            ((LiveData) this.LLJJ.LJLJJL.getValue()).removeObservers(mo49getActivity);
            this.LLJJ.LJLLL.removeObservers(mo49getActivity);
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            C8WN.LIZIZ.LJII(mo49getActivity2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ActivityC45651qj mo49getActivity;
        ViewGroup viewGroup;
        super.onPause();
        List<InterfaceC182577En> list = this.LLII.getKeyBoardObservable().LIZLLL;
        if (list != null) {
            ((ArrayList) list).remove(this);
        }
        if (C175016tt.LIZ() && (mo49getActivity = mo49getActivity()) != null && this.LLJJJJJIL != null && (viewGroup = (ViewGroup) mo49getActivity.findViewById(android.R.id.content)) != null) {
            C16880lQ.LJLLL(this.LLJJJJJIL, viewGroup);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLII.getKeyBoardObservable().LIZJ(this);
        this.LJLJL.requestFocus();
        if (Il()) {
            xl(200);
            return;
        }
        if (C175016tt.LIZ()) {
            if (this.LLJJIJIIJIL) {
                this.LLJJIJIIJIL = false;
                return;
            } else {
                Ll(0);
                return;
            }
        }
        Ll(200);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        try {
            Window window2 = getDialog().getWindow();
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (attributes != null) {
                if (C175016tt.LIZ()) {
                    attributes.dimAmount = 0.0f;
                    attributes.windowAnimations = 0;
                } else {
                    attributes.dimAmount = 0.15f;
                }
                window2.setAttributes(attributes);
            }
        } catch (Exception unused) {
        }
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // X.InterfaceC1793272a
    public final boolean Hf() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC1801475e
    public final void LLLLIIIILLL() {
        InterfaceC1791671k interfaceC1791671k = this.LLIL;
    }

    public static void Ol(TuxIconView tuxIconView) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxIconView.getLayoutParams();
        marginLayoutParams.setMarginStart(C32151Nz.LJIILLIIL(6));
        tuxIconView.setLayoutParams(marginLayoutParams);
    }

    public final void BU(List<CommentImageModel> list) {
        if (!this.LJLILLLLZI || !C175276uJ.LIZJ()) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            this.LJLJLJ.setImageURI((String) ListProtector.get(((UrlModel) ListProtector.get(list, 0)).getUrlList(), 0));
            this.LJLJLJ.setVisibility(0);
            this.LJLJLLL.setVisibility(0);
            this.LLJZ = true;
        } else {
            this.LJLJLJ.setImageDrawable(null);
            this.LJLJLJ.setVisibility(8);
            this.LJLJLLL.setVisibility(8);
            this.LLJZ = false;
        }
        C176996x5 c176996x5 = this.LLJILJIL;
        c176996x5.LJZL = list;
        c176996x5.LJJJLL();
        this.LJLJL.setHint(this.LLJILJIL.LJLL);
        if (Boolean.valueOf(this.LLJZ).booleanValue()) {
            C224748ru c224748ru = this.LJLJL;
            C71Y.LIZ("PhotoComment", "editText horizontallyFillEditBox");
            ViewGroup.LayoutParams layoutParams = c224748ru.getLayoutParams();
            if (layoutParams instanceof C018905p) {
                C018905p c018905p = (C018905p) layoutParams;
                c018905p.endToStart = -1;
                c018905p.endToEnd = R.id.blk;
                c018905p.setMarginEnd(C32151Nz.LJIILLIIL(14));
            }
            c224748ru.setLayoutParams(layoutParams);
        } else {
            C224748ru c224748ru2 = this.LJLJL;
            C71Y.LIZ("PhotoComment", "editText horizontallyTillIconGroup");
            ViewGroup.LayoutParams layoutParams2 = c224748ru2.getLayoutParams();
            C018905p c018905p2 = (C018905p) layoutParams2;
            c018905p2.endToStart = R.id.ebo;
            c018905p2.endToEnd = -1;
            c018905p2.setMarginEnd(C32151Nz.LJIILLIIL(4));
            c224748ru2.setLayoutParams(layoutParams2);
        }
        C224748ru c224748ru3 = this.LJLJL;
        C71Y.LIZ("PhotoComment", "editText verticallyUponPhotoView");
        ViewGroup.LayoutParams layoutParams3 = c224748ru3.getLayoutParams();
        ((C018905p) layoutParams3).bottomToTop = R.id.bla;
        c224748ru3.setLayoutParams(layoutParams3);
        Tl(false, true);
    }

    public final void Jl(boolean z) {
        String str;
        if (getArguments() != null) {
            str = getArguments().getString("enterFrom");
        } else {
            str = "";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("position", "comment");
        c188727au.LIZLLL(z ? 1 : 0, "is_fast_panel");
        FMX.LJIIL("show_emoji_board", c188727au.LIZ);
    }

    public final void Ll(int i) {
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(3, this, 1);
        if (i == 0) {
            iDRunnableS6S0101000.run();
        } else {
            this.LJLJL.postDelayed(iDRunnableS6S0101000, i);
        }
    }

    public final void Pl(Boolean bool) {
        boolean z;
        int i;
        int i2 = 0;
        if (bool.booleanValue() || (C175276uJ.LIZ() && (this.LLILZ || this.LLILZIL))) {
            z = true;
        } else {
            z = false;
        }
        View view = this.LLFZ;
        if (view != null) {
            if (z && this.LLILZLL) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        if (!C175276uJ.LIZ() || this.LLJLILLLLZIIL) {
            FrameLayout frameLayout = this.LLIFFJFJJ;
            if (!bool.booleanValue() || !this.LLILZLL) {
                i2 = 8;
            }
            frameLayout.setVisibility(i2);
        }
    }

    public final void Rl(boolean z) {
        int i;
        C111534Zh c111534Zh;
        int i2;
        TuxIconView tuxIconView = this.LJLLL;
        if (z) {
            i = R.raw.icon_keyboard_circle;
        } else {
            i = R.raw.icon_emoji;
        }
        tuxIconView.setIconRes(i);
        C1791171f c1791171f = this.LLFF;
        if (c1791171f != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c1791171f.LIZ(i2);
        }
        if ((z || this.LLILZIL) && (c111534Zh = this.LLFII) != null) {
            c111534Zh.LIZJ(true);
        } else {
            C111534Zh c111534Zh2 = this.LLFII;
            if (c111534Zh2 != null) {
                c111534Zh2.LJ(true);
            }
        }
        Jl(!z);
    }

    public final void Sl(boolean z) {
        boolean z2;
        boolean z3;
        int i = 8;
        if (z) {
            this.LJLLLLLL.LIZ();
            this.LJLLLLLL.setIconRes(R.raw.icon_color_gift);
        } else if (Hl()) {
            this.LJLLLLLL.setIconRes(R.raw.icon_gift);
            this.LJLLLLLL.setTintColorRes(R.attr.go);
            this.LJLLLLLL.setAlpha(1.0f);
        } else {
            this.LJLLLLLL.setVisibility(8);
        }
        ViewGroup viewGroup = this.LLIIJI;
        if (z) {
            i = 0;
        }
        viewGroup.setVisibility(i);
        if (this.LLJL && z) {
            z2 = false;
            z3 = true;
        } else {
            z2 = true;
            z3 = false;
        }
        C27740Aue.LJIIJ(z2, this.LLIIIILZ, this.LLIIIJ);
        C27740Aue.LJIIJ(z3, this.LLIIJLIL);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        C118824lS.LIZJ(this.LJLJL, this);
        C176996x5 c176996x5 = this.LLJILJIL;
        if (c176996x5 != null) {
            c176996x5.LJJIJLIJ(this.LJLJL);
        }
        if (this.LJLLLL == null) {
            return;
        }
        boolean z2 = false;
        if (editable == null || editable.toString().trim().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLLLL.getVisibility() == 0) {
            z2 = true;
        }
        if (!z ? !z2 : z2) {
            Tl(!z2, true);
        }
        C177326xc c177326xc = this.LLJJIJIL;
        C224748ru c224748ru = this.LJLJL;
        c177326xc.getClass();
        C177326xc.LIZ(c224748ru, true);
        if (TextUtils.isEmpty(editable) && TextUtils.isEmpty(this.LJLJL.getHint())) {
            this.LLJILJIL.LJJJLL();
            this.LJLJL.setHint(this.LLJILJIL.LJLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.70F] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.70E] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.70C] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.71d] */
    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        int i;
        int i2;
        Aweme aweme;
        View view;
        int i3;
        C72W c72w;
        int i4;
        int i5;
        C174596tD c174596tD;
        UrlModel animateUrl;
        int[] iArr;
        final KeyboardDialogFragment keyboardDialogFragment = this;
        super.onActivityCreated(bundle);
        Context context = keyboardDialogFragment.getContext();
        if (context == null) {
            context = EF7.LIZIZ();
        }
        C1791071e c1791071e = C1791071e.LIZIZ;
        Set<String> Gl = keyboardDialogFragment.Gl();
        final C224748ru c224748ru = keyboardDialogFragment.LJLJL;
        c1791071e.LJ(context, keyboardDialogFragment, Gl, new View.OnClickListener(c224748ru) { // from class: X.71d
            public final WeakReference<EditText> LJLIL;

            {
                this.LJLIL = new WeakReference<>(c224748ru);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditText editText;
                WeakReference<EditText> weakReference = this.LJLIL;
                if (weakReference == null || (editText = weakReference.get()) == null) {
                    return;
                }
                C1791071e.LIZIZ.LIZ(editText.getSelectionStart(), editText.getText());
            }
        }, new InterfaceC88472Yns<User, C76800UCe>(keyboardDialogFragment) { // from class: X.70C
            public final WeakReference<KeyboardDialogFragment> LJLIL;

            {
                this.LJLIL = new WeakReference<>(keyboardDialogFragment);
            }

            @Override // X.InterfaceC88472Yns
            public final C76800UCe invoke(User user) {
                KeyboardDialogFragment keyboardDialogFragment2;
                User user2 = user;
                WeakReference<KeyboardDialogFragment> weakReference = this.LJLIL;
                if (weakReference == null || (keyboardDialogFragment2 = weakReference.get()) == null) {
                    return null;
                }
                C7YC c7yc = keyboardDialogFragment2.LLIIZ;
                if (c7yc != null) {
                    ((C176996x5) c7yc).LJJJIL(user2);
                }
                keyboardDialogFragment2.LJLJL.setText("");
                KeyboardUtils.LIZIZ(keyboardDialogFragment2.LJLJL);
                keyboardDialogFragment2.dismiss();
                return C76800UCe.LIZ;
            }
        }, new InterfaceC88474Ynu<User, Integer, String, Boolean, Boolean>(keyboardDialogFragment) { // from class: X.70E
            public final WeakReference<KeyboardDialogFragment> LJLIL;

            {
                this.LJLIL = new WeakReference<>(keyboardDialogFragment);
            }

            @Override // X.InterfaceC88474Ynu
            public final Boolean invoke(User user, Integer num, String str2, Boolean bool) {
                int i6;
                User user2 = user;
                Integer num2 = num;
                String str3 = str2;
                Boolean bool2 = bool;
                WeakReference<KeyboardDialogFragment> weakReference = this.LJLIL;
                if (weakReference != null) {
                    KeyboardDialogFragment keyboardDialogFragment2 = weakReference.get();
                    if (keyboardDialogFragment2 == null) {
                        return Boolean.FALSE;
                    }
                    int intValue = num2.intValue();
                    boolean z = true;
                    if (bool2.booleanValue()) {
                        Editable text = keyboardDialogFragment2.LJLJL.getText();
                        int selectionStart = keyboardDialogFragment2.LJLJL.getSelectionStart();
                        int i7 = 0;
                        String LIZIZ = C1791071e.LIZIZ.LIZIZ(selectionStart, keyboardDialogFragment2.LJLJL.getText(), false);
                        if (LIZIZ == null) {
                            LIZIZ = "";
                        }
                        if (text != null) {
                            text.delete(selectionStart - LIZIZ.length(), selectionStart);
                        }
                        if (user2 != null) {
                            String LJ = C1799274i.LJ(user2, keyboardDialogFragment2.LLILLIZIL);
                            C224748ru c224748ru2 = keyboardDialogFragment2.LJLJL;
                            o.LJIIIZ(c224748ru2, "<this>");
                            if (LJ.length() + c224748ru2.length() > C176996x5.LJJI(false)) {
                                C26045AKb c26045AKb = new C26045AKb(keyboardDialogFragment2);
                                c26045AKb.LJIIIIZZ(R.string.cm8);
                                c26045AKb.LJIIJ();
                            } else {
                                if (!keyboardDialogFragment2.LJLJL.LJI(LJ, user2.getUid(), user2.getSecUid())) {
                                    if (keyboardDialogFragment2.getContext() != null) {
                                        C26045AKb c26045AKb2 = new C26045AKb(keyboardDialogFragment2);
                                        c26045AKb2.LJIIIIZZ(R.string.bnk);
                                        c26045AKb2.LJIIJ();
                                    }
                                } else {
                                    ((C176996x5) keyboardDialogFragment2.LLIIZ).LJLJJL.add(user2);
                                    C7YC c7yc = keyboardDialogFragment2.LLIIZ;
                                    int length = LIZIZ.length();
                                    if (user2.getNickname() != null) {
                                        i6 = user2.getNickname().length();
                                    } else {
                                        i6 = 0;
                                    }
                                    int i8 = intValue + 1;
                                    String uid = user2.getUid();
                                    int followStatus = user2.getFollowStatus();
                                    C177156xL Dl = keyboardDialogFragment2.Dl();
                                    C176996x5 c176996x5 = (C176996x5) c7yc;
                                    Aweme commentInputAweme = c176996x5.LJLJJI.getCommentInputAweme();
                                    String LJIJJLI = c176996x5.LJIJJLI();
                                    C188727au LIZJ = C0RN.LIZJ(length, "input_text_length", i6, "user_text_length");
                                    LIZJ.LIZLLL(i8, "rank");
                                    LIZJ.LJIIIZ("search_keyword", LIZIZ);
                                    LIZJ.LJIIIZ("enter_from", LJIJJLI);
                                    LIZJ.LIZLLL(commentInputAweme.getAwemeType(), "aweme_type");
                                    LIZJ.LJIIIZ("to_user_id", uid);
                                    LIZJ.LJIIIZ("enter_position", C222578oP.LJII(C84763XOl.LJIIIIZZ(), LJIJJLI, null));
                                    String LJIIIZ = C178406zM.LJIIIZ(commentInputAweme);
                                    LIZJ.LJIIIZ("group_id", commentInputAweme.getAid());
                                    LIZJ.LJIIIZ("author_id", commentInputAweme.getAuthorUid());
                                    LIZJ.LJI("now_type", LJIIIZ);
                                    C222578oP.LIZIZ(LIZJ, commentInputAweme, LJIJJLI, null, C84763XOl.LJIIIIZZ());
                                    V0N.LJI(LIZJ, commentInputAweme);
                                    C1793872g.LIZ(LIZJ, Dl);
                                    if (commentInputAweme.getPhotoModeImageInfo() != null) {
                                        if (commentInputAweme.getPhotoModeImageInfo().getTitle() != null) {
                                            i7 = 1;
                                        }
                                        LIZJ.LIZLLL(i7, "has_title");
                                    }
                                    LIZJ.LIZLLL(followStatus, "follow_status");
                                    C220488l2.LIZIZ.LJII(commentInputAweme, LIZJ);
                                    C222578oP.LIZIZ(LIZJ, commentInputAweme, null, null, null);
                                    C78866UxK.LJIILLIIL(LIZJ, commentInputAweme.getAuthor());
                                    if (C227768wm.LJJIIJ(LJIJJLI)) {
                                        LIZJ.LJI("log_pb", C3A5.LIZ.LIZIZ(commentInputAweme.getRequestId()));
                                        LIZJ.LJI("search_id", str3);
                                        FMX.LJIILLIIL("add_comment_at", C227768wm.LJJIIZI(LIZJ.LIZ));
                                    } else {
                                        FMX.LJIIL("add_comment_at", LIZJ.LIZ);
                                    }
                                }
                            }
                        }
                        z = false;
                    } else {
                        keyboardDialogFragment2.LJLJL.LJIIIIZZ(user2.getUid());
                    }
                    return Boolean.valueOf(z);
                }
                return Boolean.FALSE;
            }
        }, new InterfaceC88472Yns<String, Boolean>(keyboardDialogFragment) { // from class: X.70F
            public final WeakReference<KeyboardDialogFragment> LJLIL;

            {
                this.LJLIL = new WeakReference<>(keyboardDialogFragment);
            }

            @Override // X.InterfaceC88472Yns
            public final Boolean invoke(String str2) {
                String str3 = str2;
                WeakReference<KeyboardDialogFragment> weakReference = this.LJLIL;
                if (weakReference != null) {
                    KeyboardDialogFragment keyboardDialogFragment2 = weakReference.get();
                    if (keyboardDialogFragment2 == null) {
                        return Boolean.FALSE;
                    }
                    return Boolean.valueOf(TextUtils.equals(str3, C1791071e.LIZIZ.LIZIZ(keyboardDialogFragment2.LJLJL.getSelectionStart(), keyboardDialogFragment2.LJLJL.getEditableText(), true)));
                }
                return Boolean.FALSE;
            }
        });
        keyboardDialogFragment.LJLJL.addTextChangedListener(new IDObjectS176S0100000_3(keyboardDialogFragment, 2));
        C224748ru c224748ru2 = keyboardDialogFragment.LJLJL;
        c224748ru2.setHighlightColor(C78886Uxe.LJJIFFI(R.attr.cf, R.color.al, c224748ru2.getContext()));
        if (keyboardDialogFragment.getArguments() == null) {
            str = "";
        } else {
            str = keyboardDialogFragment.getArguments().getString("enterFrom");
        }
        Aweme aweme2 = keyboardDialogFragment.LLIZ;
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(keyboardDialogFragment, null);
        C177336xd c177336xd = new C177336xd();
        c177336xd.LJLLI = aweme2;
        c177336xd.LJLJJLL = str;
        C55247LmF.LIZIZ(LIZJ, c177336xd, C177336xd.class, "source_default_key");
        keyboardDialogFragment.getDialog().getWindow().setLayout(-1, -1);
        keyboardDialogFragment.getDialog().setOnShowListener(keyboardDialogFragment);
        if (C175016tt.LIZ()) {
            keyboardDialogFragment.Ll(0);
        }
        if (keyboardDialogFragment.getArguments() != null) {
            keyboardDialogFragment.getArguments().getBoolean("isCommentDesc", false);
        }
        C16880lQ.LJJJ(keyboardDialogFragment.LJLLLL, new ACListenerS30S0101000_13(2, keyboardDialogFragment, 3));
        C16880lQ.LJJJ(keyboardDialogFragment.LJLLI, new ACListenerS24S0101000_5(1, keyboardDialogFragment, 1));
        C16880lQ.LJIILLIIL(keyboardDialogFragment.LJLJJI, new ACListenerS32S0101000_15(2, keyboardDialogFragment, 3));
        C16880lQ.LJJJ(keyboardDialogFragment.LJLLILLLL, new ACListenerS32S0101000_15(1, keyboardDialogFragment, 13));
        C16880lQ.LJJJ(keyboardDialogFragment.LJLLL, new ACListenerS32S0101000_15(2, keyboardDialogFragment, 18));
        if (C175276uJ.LIZJ()) {
            C16880lQ.LJJJ(keyboardDialogFragment.LJLLJ, new ACListenerS22S0101000_3(1, keyboardDialogFragment, 13));
            C16880lQ.LJJJJJL(keyboardDialogFragment.LJLJLJ, new ACListenerS32S0101000_15(3, keyboardDialogFragment, 2));
            C16880lQ.LJIILJJIL(keyboardDialogFragment.LJLJLLL, new ACListenerS22S0101000_3(0, keyboardDialogFragment, 1));
        }
        if (C77321UWf.LIZLLL(keyboardDialogFragment.LLIZ, keyboardDialogFragment.LLJLILLLLZIIL)) {
            keyboardDialogFragment.LJLLJ.setVisibility(0);
        } else {
            keyboardDialogFragment.LJLLJ.setVisibility(8);
        }
        C88463da c88463da = C88463da.LIZ;
        c88463da.LIZ(keyboardDialogFragment.LJLLI, EnumC1796673i.ALPHA_BUTTON);
        TuxIconView tuxIconView = keyboardDialogFragment.LJLLL;
        EnumC1796673i enumC1796673i = EnumC1796673i.BUTTON;
        c88463da.LIZ(tuxIconView, enumC1796673i);
        c88463da.LIZ(keyboardDialogFragment.LJLLILLLL, enumC1796673i);
        c88463da.LIZ(keyboardDialogFragment.LJLLJ, enumC1796673i);
        c88463da.LIZ(keyboardDialogFragment.LJLLLL, enumC1796673i);
        c88463da.LIZ(keyboardDialogFragment.LJLJJI, enumC1796673i);
        TuxIconView tuxIconView2 = keyboardDialogFragment.LJLLL;
        if (keyboardDialogFragment.LLILZ) {
            i = R.raw.icon_keyboard_circle;
        } else {
            i = R.raw.icon_emoji;
        }
        tuxIconView2.setIconRes(i);
        C1791171f c1791171f = new C1791171f(keyboardDialogFragment.LLF);
        keyboardDialogFragment.LLFF = c1791171f;
        c1791171f.LIZIZ = new C1791371h(keyboardDialogFragment);
        keyboardDialogFragment.LJLJL.setMentionTextColor(C78886Uxe.LJJIFFI(R.attr.bw, 0, keyboardDialogFragment.LJLJL.getContext()));
        keyboardDialogFragment.LJLJL.setMentionTextTypeface(1);
        keyboardDialogFragment.LJLJL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0101000_3(0, keyboardDialogFragment, 2)));
        keyboardDialogFragment.LLII.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS26S0101000_8(2, keyboardDialogFragment, 4)));
        C16880lQ.LJIIJ(new ACListenerS51S0000000_3(1), keyboardDialogFragment.LLII.findViewById(R.id.bs8));
        C16880lQ.LJIIJ(new ACListenerS51S0000000_3(1), keyboardDialogFragment.LLII.findViewById(R.id.dty));
        C16880lQ.LJIIJ(new ACListenerS22S0101000_3(2, keyboardDialogFragment, 0), keyboardDialogFragment.LL);
        if (keyboardDialogFragment.getArguments() == null || !keyboardDialogFragment.getArguments().getBoolean("hideGiftIcon", false)) {
            TuxIconView tuxIconView3 = keyboardDialogFragment.LJLLLLLL;
            if (keyboardDialogFragment.LLJJJJ.LIZ(keyboardDialogFragment.LLIZ) && !keyboardDialogFragment.LLJLILLLLZIIL) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxIconView3.setVisibility(i2);
            if (keyboardDialogFragment.LLJJJJ.LIZ(keyboardDialogFragment.LLIZ) && keyboardDialogFragment.Hl() && keyboardDialogFragment.LLJJ != null && (aweme = keyboardDialogFragment.LLIZ) != null) {
                if (keyboardDialogFragment.LLIIJI != null) {
                    aweme.getGroupId();
                    Aweme aweme3 = keyboardDialogFragment.LLIZ;
                    if (aweme3 != null) {
                        aweme3.getAuthorUid();
                    }
                    if (keyboardDialogFragment.getArguments() != null) {
                        keyboardDialogFragment.getArguments().getString("enterFrom");
                    }
                    if (keyboardDialogFragment.mo49getActivity() != null && keyboardDialogFragment.LLIZ != null && keyboardDialogFragment.LLJJ != null && (view = new C1792171p(keyboardDialogFragment, keyboardDialogFragment.LLIIJI, keyboardDialogFragment.mo49getActivity(), keyboardDialogFragment.LLJJ, keyboardDialogFragment.LLJJIII, keyboardDialogFragment.LLJL).LJII) != null) {
                        keyboardDialogFragment.LLIIJI.addView(view, 0);
                        ViewGroup viewGroup = keyboardDialogFragment.LLIIJI;
                        if (keyboardDialogFragment.LLILZIL) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        viewGroup.setVisibility(i3);
                    }
                }
                keyboardDialogFragment.LLJJ.hv0(keyboardDialogFragment.LLIZ.getAid(), keyboardDialogFragment.LLIZ.getAuthorUid());
                if (!keyboardDialogFragment.LLJL && (c72w = keyboardDialogFragment.LLIIL) != null) {
                    c72w.LIZ(keyboardDialogFragment.LLJJ, keyboardDialogFragment.mo49getActivity(), keyboardDialogFragment.LLJL);
                }
                keyboardDialogFragment.LLJJ.iv0().observe(keyboardDialogFragment.mo49getActivity(), new AObserverS56S0000000_3(2));
            } else {
                if ((!keyboardDialogFragment.LLJJJJ.LIZ(keyboardDialogFragment.LLIZ) || !keyboardDialogFragment.Hl()) && keyboardDialogFragment.LLJJ != null) {
                    keyboardDialogFragment.LJLLLLLL.setVisibility(8);
                }
                GiftViewModel giftViewModel = keyboardDialogFragment.LLJJ;
                if (giftViewModel != null && giftViewModel.jv0().getValue() != null) {
                    keyboardDialogFragment.LLJJ.jv0().setValue(null);
                }
            }
            keyboardDialogFragment.Sl(keyboardDialogFragment.LLILZIL);
            if (keyboardDialogFragment.Hl()) {
                C16880lQ.LJJJ(keyboardDialogFragment.LJLLLLLL, new ACListenerS32S0101000_15(1, keyboardDialogFragment, 10));
            } else {
                keyboardDialogFragment.LJLLLLLL.setVisibility(8);
            }
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(((RBX) HG3.LJIILL()).getCurUser().getAvatarThumb()));
        LJII.LJJIIJ = keyboardDialogFragment.LJLJJLL;
        C16880lQ.LLJJJ(LJII);
        keyboardDialogFragment.LJLJJLL.setVisibility(0);
        if (C72O.LIZ()) {
            keyboardDialogFragment.LLJJJ.LIZIZ(keyboardDialogFragment.LLIZ, keyboardDialogFragment.LLIZLLLIL);
        } else if ("click_add_recommendation".equals(keyboardDialogFragment.getArguments().getString("click_from"))) {
            keyboardDialogFragment.Ql();
        }
        if (C175016tt.LIZ()) {
            if (keyboardDialogFragment.getArguments().getBoolean("arg_require_gray_background")) {
                keyboardDialogFragment.LLJJJJLIIL.setVisibility(0);
                ObjectAnimator.ofFloat(keyboardDialogFragment.LLJJJJLIIL, "alpha", 0.0f, 1.0f).start();
            }
            WindowManager.LayoutParams attributes = keyboardDialogFragment.getDialog().getWindow().getAttributes();
            if (attributes != null && (attributes.softInputMode & 3) != 0) {
                ObjectAnimator.ofFloat(keyboardDialogFragment.LLII, "translationY", KL2.LJIIIZ(keyboardDialogFragment.LLII.getContext()), 0.0f).start();
            }
        } else {
            keyboardDialogFragment.Tl(false, true);
        }
        Bundle arguments = keyboardDialogFragment.getArguments();
        if (arguments != null) {
            keyboardDialogFragment.LLIZLLLIL = arguments.getString("enterFrom", "");
            keyboardDialogFragment.LLJIJIL = arguments.getBoolean("clickAt");
            int i6 = arguments.getInt("maxLength");
            keyboardDialogFragment.LLILLL = i6;
            if (i6 > 0 && keyboardDialogFragment.LJLJL != null) {
                C7K4 c7k4 = new C7K4(i6);
                c7k4.LJLILLLLZI = C1791471i.LIZ.getResources().getString(R.string.cm8);
                keyboardDialogFragment.LJLJL.setFilters(new InputFilter[]{c7k4});
            }
            Emoji emoji = keyboardDialogFragment.LLJ;
            if (emoji != null && (animateUrl = emoji.getAnimateUrl()) != null) {
                keyboardDialogFragment.LJZI.setVisibility(0);
                keyboardDialogFragment.LL.setVisibility(0);
                int LIZJ2 = (int) KL2.LIZJ(EF7.LIZIZ(), 60.0f);
                if (emoji.getWidth() == 0 || emoji.getHeight() == 0) {
                    iArr = new int[]{LIZJ2, LIZJ2};
                } else {
                    iArr = new int[]{Math.min((emoji.getWidth() / emoji.getHeight()) * LIZJ2, (int) KL2.LIZJ(EF7.LIZIZ(), 107.0f)), LIZJ2};
                }
                keyboardDialogFragment.LJZI.getLayoutParams().width = iArr[0];
                keyboardDialogFragment.LJZI.requestLayout();
                C78765Uvh.LJI(keyboardDialogFragment.LJZL, animateUrl, iArr[0], iArr[1], null);
            }
            C176996x5 c176996x5 = keyboardDialogFragment.LLJILJIL;
            if (c176996x5 != null) {
                keyboardDialogFragment.BU(c176996x5.LJZL);
            }
            CharSequence charSequence = arguments.getCharSequence("hint");
            if (C72O.LIZ()) {
                if (charSequence != null && (c174596tD = keyboardDialogFragment.LLJJJ) != null && !c174596tD.LJII) {
                    keyboardDialogFragment.LJLJL.setHint(charSequence);
                    keyboardDialogFragment.LJLJL.setMaxLines(1);
                    keyboardDialogFragment.LJLJL.setEllipsize(TextUtils.TruncateAt.END);
                }
            } else if (charSequence != null && !keyboardDialogFragment.LLJJIJIL.LJIIJJI) {
                keyboardDialogFragment.LJLJL.setHint(charSequence);
                keyboardDialogFragment.LJLJL.setMaxLines(1);
                keyboardDialogFragment.LJLJL.setEllipsize(TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = arguments.getCharSequence("defaultContent");
            if (!TextUtils.isEmpty(charSequence2)) {
                keyboardDialogFragment.LJLJL.setText(charSequence2);
            }
            User user = (User) arguments.getSerializable("user");
            if (user != null) {
                keyboardDialogFragment.LJLJL.setHint(keyboardDialogFragment.getString(R.string.gzy, C1799274i.LJ(user, keyboardDialogFragment.LLILLIZIL)));
                C7YC c7yc = keyboardDialogFragment.LLIIZ;
                if (c7yc != null) {
                    CharSequence hint = keyboardDialogFragment.LJLJL.getHint();
                    C224748ru c224748ru3 = ((C176996x5) c7yc).LJLILLLLZI;
                    if (c224748ru3 != null) {
                        c224748ru3.setHint(hint);
                    }
                }
            }
            keyboardDialogFragment.LJLJL.addTextChangedListener(keyboardDialogFragment);
            HashSet hashSet = (HashSet) arguments.getSerializable("atUserSet");
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    User user2 = (User) it.next();
                    keyboardDialogFragment.LJLJL.LJI(AV1.LIZLLL(user2), user2.getUid(), user2.getSecUid());
                }
            }
            User user3 = (User) arguments.getSerializable("atUser");
            if (user3 != null) {
                keyboardDialogFragment.LJLJL.LJI(AV1.LIZLLL(user3), user3.getUid(), user3.getSecUid());
            }
            if (C175016tt.LIZ()) {
                keyboardDialogFragment.Tl(false, false);
            } else {
                keyboardDialogFragment.Tl(true, true);
            }
            boolean z = arguments.getBoolean("showAt");
            if (keyboardDialogFragment.LLJLILLLLZIIL) {
                keyboardDialogFragment.LJLLI.setVisibility(8);
            } else {
                TuxIconView tuxIconView4 = keyboardDialogFragment.LJLLI;
                if (z) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                tuxIconView4.setVisibility(i4);
            }
            if (keyboardDialogFragment.Ml()) {
                keyboardDialogFragment.LJLLI.setAlpha(0.5f);
            } else {
                keyboardDialogFragment.LJLLI.setAlpha(1.0f);
            }
            keyboardDialogFragment.LLILL = z;
            arguments.getInt("viewType");
            keyboardDialogFragment.LLILLIZIL = arguments.getString("arg_event_type");
            boolean z2 = keyboardDialogFragment.LLJLILLLLZIIL;
            keyboardDialogFragment.LLJLLIL = z2;
            if (z2) {
                C117654jZ c117654jZ = new C117654jZ(new EmojiInputViewImplV2(keyboardDialogFragment.LJLJL, keyboardDialogFragment.LLILLL, keyboardDialogFragment), keyboardDialogFragment.LLF, keyboardDialogFragment);
                C105394Br c105394Br = c117654jZ.LIZLLL;
                c105394Br.LIZIZ = true;
                c105394Br.LJI = 2;
                int LIZJ3 = C7EP.LIZJ(true);
                C105394Br c105394Br2 = c117654jZ.LIZLLL;
                c105394Br2.LJII = LIZJ3;
                c105394Br2.LJFF = false;
                keyboardDialogFragment.LLF.addView(new C105244Bc(c117654jZ.LIZ, c105394Br2, c117654jZ.LIZJ, c117654jZ.LIZIZ).LJLIL);
            } else if (keyboardDialogFragment.LLF != null) {
                if (keyboardDialogFragment.LLILIL == null) {
                    keyboardDialogFragment.LLILIL = new C1801275c(keyboardDialogFragment.LJLJL, keyboardDialogFragment.LLILLL, keyboardDialogFragment);
                }
                C112214an c112214an = new C112214an(keyboardDialogFragment.LLILIL, keyboardDialogFragment.LLF);
                C4VN.LIZ();
                if (C110154Tz.LIZ(2)) {
                    c112214an.LIZJ.LIZIZ = true;
                }
                c112214an.LIZJ.LJI = 2;
                C112094ab c112094ab = new C112094ab(c112214an.LIZ, c112214an.LIZJ, c112214an.LIZIZ);
                keyboardDialogFragment.LLIILZL = c112094ab;
                keyboardDialogFragment.LLF.addView(c112094ab.LJLIL);
            }
            C1791171f c1791171f2 = keyboardDialogFragment.LLFF;
            if (keyboardDialogFragment.LLILZ) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            c1791171f2.LIZ(i5);
            if (keyboardDialogFragment.LLILZ) {
                keyboardDialogFragment.Jl(false);
            }
            if (keyboardDialogFragment.LLJILJILJ != CommentVideoModel.Type.NONE) {
                if (C175276uJ.LIZIZ()) {
                    keyboardDialogFragment.LJLLILLLL.setVisibility(0);
                } else {
                    keyboardDialogFragment.LJLJJLL.setVisibility(8);
                    keyboardDialogFragment.LJLJJI.setVisibility(0);
                    keyboardDialogFragment.LLJJIJIL.LJ(1, false);
                }
            } else {
                keyboardDialogFragment.LJLJJI.setVisibility(8);
                if (C175276uJ.LIZIZ()) {
                    keyboardDialogFragment.LJLLILLLL.setVisibility(8);
                }
            }
            keyboardDialogFragment.LLJJJIL = arguments.getInt("publishScenario");
            C111534Zh c111534Zh = keyboardDialogFragment.LLFII;
            if (c111534Zh != null) {
                FrameLayout frameLayout = keyboardDialogFragment.LLFFF;
                C224748ru c224748ru4 = keyboardDialogFragment.LJLJL;
                int i7 = keyboardDialogFragment.LLILLL;
                keyboardDialogFragment = keyboardDialogFragment;
                c111534Zh.LIZIZ(frameLayout, c224748ru4, i7, keyboardDialogFragment, keyboardDialogFragment, null);
                keyboardDialogFragment.LLFII.setMEnterFrom(keyboardDialogFragment.LLIZLLLIL);
                if (keyboardDialogFragment.LLILZIL || keyboardDialogFragment.LLILZ) {
                    keyboardDialogFragment.LLFII.LIZJ(false);
                } else {
                    keyboardDialogFragment.LLFII.LJ(false);
                }
            }
            if (keyboardDialogFragment.LLFII != null || (C175276uJ.LIZ() && !keyboardDialogFragment.LLJLILLLLZIIL)) {
                keyboardDialogFragment.LLILZLL = arguments.getBoolean("hasUpvoteCheckBox", false);
            }
            if (keyboardDialogFragment.LLILZLL) {
                C1793372b.LIZ(keyboardDialogFragment.LLFZ, keyboardDialogFragment.LLIZLLLIL, keyboardDialogFragment.LJLJL, keyboardDialogFragment);
            }
            keyboardDialogFragment.Pl(Boolean.valueOf(keyboardDialogFragment.LLJZIJLIL));
        }
        if (bundle != null) {
            try {
                super.dismiss();
            } catch (IllegalStateException unused) {
                super.dismissAllowingStateLoss();
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ActivityC45651qj) {
            this.LLJJL = C45804HyK.LJJIFFI(context);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z = C53946LFe.LIZJ(mo49getActivity(), null).LJFF;
        LFH lfh = LFH.LIZIZ;
        lfh.LIZLLL().LJIILIIL();
        if (C53816LAe.LJI(mo49getActivity(), configuration) || (this.LLJL && z != this.LLJLIL)) {
            dismiss();
        } else {
            C111024Xi c111024Xi = this.LLII;
            if (c111024Xi != null) {
                c111024Xi.LIZ(configuration.orientation, lfh.LIZLLL().block().LJI());
            }
        }
        this.LLJLIL = z;
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C175016tt.LIZ()) {
            setStyle(1, R.style.a54);
        } else {
            setStyle(1, R.style.a53);
        }
        if (getArguments() != null) {
            this.LLJL = getArguments().getBoolean("isSplitMode");
            this.LLJLILLLLZIIL = getArguments().getBoolean("isLandscapeMode");
        }
        GiftViewModel giftViewModel = this.LLJJ;
        if (giftViewModel != null) {
            giftViewModel.iv0().setValue(Long.MIN_VALUE);
        }
        this.LLJLIL = C53946LFe.LIZJ(null, null).LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Dialog onCreateDialog(android.os.Bundle r8) {
        /*
            r7 = this;
            android.app.Dialog r6 = super.onCreateDialog(r8)
            android.view.Window r5 = r6.getWindow()
            android.os.Bundle r4 = r7.getArguments()
            r3 = 19
            r2 = 0
            r1 = 1
            if (r4 == 0) goto L3c
            java.lang.String r0 = "showEmojiPanel"
            boolean r0 = r4.getBoolean(r0)
            if (r0 == 0) goto L2f
            r7.LLILZ = r1
            r7.LLL = r2
        L1e:
            if (r5 == 0) goto L28
            r5.setSoftInputMode(r3)
            r0 = 80
            r5.setGravity(r0)
        L28:
            r6.setCanceledOnTouchOutside(r2)
            r6.setCancelable(r1)
            return r6
        L2f:
            java.lang.String r0 = "showGiftPanel"
            boolean r0 = r4.getBoolean(r0)
            if (r0 == 0) goto L3c
            r7.LLILZIL = r1
            r7.LLL = r2
            goto L1e
        L3c:
            r3 = 20
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        List<CommentImageModel> list;
        C186577Tx.LIZ();
        if (C175276uJ.LIZJ() && (list = this.LLJILJIL.LJZL) != null && list.size() > 0) {
            C176996x5 c176996x5 = this.LLJILJIL;
            c176996x5.LLILZIL = true;
            c176996x5.LJJJLL();
            this.LJLJL.setHint(this.LLJILJIL.LJLL);
        }
        InterfaceC177116xH interfaceC177116xH = this.LLILII;
        if (interfaceC177116xH != null) {
            ((C176996x5) interfaceC177116xH).LJJJJI(Dl());
        }
    }

    public final void xl(int i) {
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(2, this, 26);
        if (i == 0) {
            iDRunnableS6S0101000.run();
        } else {
            this.LJLJL.postDelayed(iDRunnableS6S0101000, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    @Override // X.InterfaceC182577En
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILLL(int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment.LLILLL(int, boolean):void");
    }

    @Override // X.InterfaceC1801475e
    public final void Pa(View view, Emoji emoji) {
        String str;
        String str2;
        String str3;
        this.LLJ = emoji;
        C176996x5 c176996x5 = this.LLJILJIL;
        if (c176996x5 != null) {
            c176996x5.LJJJLZIJ(emoji);
        }
        if (emoji == null || emoji.getAnimateUrl() == null) {
            str = "";
        } else {
            str = emoji.getAnimateUrl().getUri();
        }
        LogPbBean logPb = emoji.getLogPb();
        InterfaceC1791671k interfaceC1791671k = this.LLIL;
        if (interfaceC1791671k != null) {
            Aweme commentInputAweme = ((C176996x5) interfaceC1791671k).LJLJJI.getCommentInputAweme();
            if (commentInputAweme == null) {
                str2 = "";
                str3 = "";
            } else {
                str3 = commentInputAweme.getAuthorUid();
                str2 = commentInputAweme.getAid();
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("emoji_type", "recommend");
            if (TextUtils.equals("recommend", "recommend")) {
                c188727au.LJIIIZ("group_id", str2);
                c188727au.LJIIIZ("author_id", str3);
                c188727au.LJIIIZ("emoji_uri", str);
                c188727au.LJFF(-1, "position");
                c188727au.LJFF(logPb, "log_pb");
            } else if (TextUtils.equals("recommend", "search")) {
                c188727au.LJIIIZ("group_id", str2);
                c188727au.LJIIIZ("author_id", str3);
                c188727au.LJIIIZ("search_keyword", "");
                c188727au.LJIIIZ("emoji_uri", str);
                c188727au.LJFF(-1, "position");
                c188727au.LJFF(logPb, "log_pb");
            }
            FMX.LJIIL("click_comment_emoji", c188727au.LIZ);
        }
        Tl(true, true);
    }

    public final void Tl(boolean z, boolean z2) {
        boolean z3;
        C174596tD c174596tD;
        Editable text = this.LJLJL.getText();
        if (!TextUtils.isEmpty(this.LJLJL.getHint())) {
            this.LLJJIJI = this.LJLJL.getHint();
        }
        boolean z4 = false;
        if ((text != null && text.toString().trim().length() > 0) || this.LLJ != null || this.LLJZ) {
            C177326xc c177326xc = this.LLJJIJIL;
            if (this.LLJILJILJ != CommentVideoModel.Type.NONE) {
                z4 = true;
            }
            c177326xc.LJI(true, z, z4, true);
            return;
        }
        C177326xc c177326xc2 = this.LLJJIJIL;
        if (this.LLJILJILJ != CommentVideoModel.Type.NONE) {
            z3 = true;
        } else {
            z3 = false;
        }
        c177326xc2.LJI(false, z2, z3, true);
        if (TextUtils.isEmpty(this.LLJJIJI)) {
            this.LLJILJIL.LJJJLL();
            this.LJLJL.setHint(this.LLJILJIL.LJLL);
        } else if ((C72O.LIZ() && (c174596tD = this.LLJJJ) != null && c174596tD.LJII) || this.LLJJIJIL.LJIIJJI) {
            this.LJLJL.setHint(R.string.q3p);
        } else {
            this.LJLJL.setHint(this.LLJJIJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C72713SgH.LJIIIIZZ.getClass();
        C72714SgI.LIZ(view, this);
        Aweme aweme = this.LLIZ;
        if (aweme != null && aweme.getAid() != null) {
            this.LLIZ.getAid();
        }
        C176996x5 c176996x5 = this.LLJILJIL;
        if (c176996x5 != null) {
            c176996x5.LJIIIIZZ(this.LJLJL);
            int LJJIFFI = C78886Uxe.LJJIFFI(R.attr.bw, 0, getContext());
            C176996x5 c176996x52 = this.LLJILJIL;
            C224748ru c224748ru = this.LJLJL;
            c176996x52.getClass();
            if (c224748ru != null && !C79004UzY.LJJIFFI(c224748ru.getMentionExtraStructList())) {
                c224748ru.setMentionTextColor(LJJIFFI);
                c224748ru.LJIIIZ();
            }
        }
        if (!C1791871m.LIZ) {
            C1791871m.LIZLLL = System.currentTimeMillis();
        }
        C7EV c7ev = new C7EV();
        c7ev.LJFF = this.LLJLILLLLZIIL;
        this.LLII.setKeyBoardObservable(c7ev);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (C175276uJ.LIZJ()) {
            if (i2 == 100 && intent != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MediaModel = ");
                LIZ.append(intent.getParcelableArrayListExtra("key_choose_media_data"));
                LIZ.append(" requestCode = ");
                LIZ.append(i);
                C71Y.LIZ("PhotoComment", X1D.LIZIZ(LIZ));
                List<CommentImageModel> LJIILIIL = C77321UWf.LJIILIIL(intent.getParcelableArrayListExtra("key_choose_media_data"));
                if (LJIILIIL != null) {
                    if (this.LLJILJIL.LJZL != null) {
                        C74Z.LJIJI(this.LLIZLLLIL, "replace");
                        C74Z.LJIIIZ(this.LLIZLLLIL, "replace");
                    } else {
                        C74Z.LJIIIZ(this.LLIZLLLIL, "add");
                    }
                    List<CommentImageModel> list = this.LLJILJIL.LJZL;
                    if (list != null && !list.isEmpty()) {
                        Y87.LIZ((CommentImageModel) ListProtector.get(list, 0));
                    }
                    if (!((ArrayList) LJIILIIL).isEmpty()) {
                        Y87.LJI((CommentImageModel) ListProtector.get(LJIILIIL, 0));
                    }
                }
                BU(LJIILIIL);
            }
            this.LLJILJIL.LL = false;
            if (i == 10002) {
                Ll(150);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:1|(1:3)|4|(2:87|(2:89|(1:91)))(1:10)|11|(4:13|(3:15|(1:17)(1:81)|(2:19|(18:21|22|(1:80)(1:26)|27|(1:29)(1:79)|30|(1:32)|33|(1:35)|36|(1:38)(1:78)|39|(4:41|(1:43)(1:67)|44|(1:66)(2:48|(3:62|(1:64)|65)))|68|69|(1:71)|72|73)))|82|(0))|83|(1:85)|86|22|(1:24)|80|27|(0)(0)|30|(0)|33|(0)|36|(0)(0)|39|(0)|68|69|(0)|72|73) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0422, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0423, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0416 A[Catch: all -> 0x0422, TryCatch #0 {all -> 0x0422, blocks: (B:69:0x0401, B:71:0x0416, B:72:0x0419), top: B:68:0x0401 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0307  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.InterfaceC1801475e
    public final void onEmojiClick(String str, int i, int i2) {
        InterfaceC177046xA interfaceC177046xA;
        C7YC c7yc = this.LLIIZ;
        if (c7yc != null && (interfaceC177046xA = ((C176996x5) c7yc).LJLJJI) != null) {
            interfaceC177046xA.onEmojiClick(str, i, i2);
        }
    }

    public static KeyboardDialogFragment wl(int i, String str, boolean z, boolean z2) {
        KeyboardDialogFragment keyboardDialogFragment = new KeyboardDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("viewType", i);
        bundle.putBoolean("hasUpvoteCheckBox", z);
        bundle.putString("enterFrom", str);
        bundle.putBoolean("isSplitMode", z2);
        keyboardDialogFragment.setArguments(bundle);
        return keyboardDialogFragment;
    }

    public static KeyboardDialogFragment Al(int i, boolean z, String str, Bundle bundle, boolean z2) {
        KeyboardDialogFragment wl = wl(i, str, z, z2);
        Bundle arguments = wl.getArguments();
        if (arguments != null) {
            arguments.putAll(bundle);
        }
        return wl;
    }
}
