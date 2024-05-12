package com.ss.android.ugc.aweme.feed.assem.quickcomment;

import X.AnonymousClass391;
import X.AnonymousClass636;
import X.C023107f;
import X.C110614Vt;
import X.C113554cx;
import X.C16880lQ;
import X.C174046sK;
import X.C174266sg;
import X.C177056xB;
import X.C177156xL;
import X.C178646zk;
import X.C178726zs;
import X.C178766zw;
import X.C181407Aa;
import X.C181497Aj;
import X.C1DH;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C224748ru;
import X.C26045AKb;
import X.C2IP;
import X.C2NH;
import X.C2U8;
import X.C32151Nz;
import X.C47261Igj;
import X.C51029K0z;
import X.C54838Lfe;
import X.C5H3;
import X.C61328O5c;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C75J;
import X.C76800UCe;
import X.C78939UyV;
import X.C79488VHo;
import X.C7AL;
import X.C7AM;
import X.C7AN;
import X.C7AO;
import X.C7AP;
import X.C7AQ;
import X.C7AR;
import X.C7AS;
import X.C7AT;
import X.C7AU;
import X.C7AY;
import X.C7AZ;
import X.C7DU;
import X.C7HV;
import X.C7MY;
import X.C8YN;
import X.C90823hO;
import X.EnumC177736yH;
import X.EnumC177746yI;
import X.EnumC221088m0;
import X.FMX;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC177046xA;
import X.InterfaceC178516zX;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.InterpolatorC216808f6;
import X.J8V;
import X.L2J;
import X.O6R;
import X.OSZ;
import X.RBX;
import X.TBT;
import X.W5F;
import X.W5U;
import Y.ACListenerS21S0201000_3;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS4S0301000_3;
import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS37S0200000_3;
import Y.IDAListenerS72S0100000_3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoQuickCommentAssem extends BaseCellSlotComponent<VideoQuickCommentAssem> implements InterfaceC177046xA {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILZL;
    public static final int LLIIZ;
    public SmartAvatarImageView LLFII;
    public TuxTextView LLFZ;
    public View LLI;
    public LinearLayout LLIFFJFJJ;
    public C224748ru LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C5H3 LLIIIJ;
    public final InterfaceC115514g7 LLIIIL;
    public final C5H3 LLIIIZ;
    public final C5H3 LLIIJI;
    public final C5H3 LLIIJLIL;
    public C7AY LLIIL;
    public boolean LLIILII;

    static {
        int i;
        TBT tbt = new TBT(VideoQuickCommentAssem.class, "quickCommentVM", "getQuickCommentVM()Lcom/ss/android/ugc/aweme/feed/assem/quickcomment/VideoQuickCommentVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIILZL = new InterfaceC74236TBo[]{tbt};
        if (L2J.LIZ()) {
            i = 40;
        } else {
            i = 50;
        }
        LLIIZ = i;
    }

    public final void D4() {
        String authorUid;
        OSZ[] oszArr = new OSZ[4];
        int i = 0;
        oszArr[0] = new OSZ("enter_from", ((VideoItemParams) v3()).mEventType);
        Aweme commentInputAweme = getCommentInputAweme();
        String str = null;
        if (commentInputAweme != null) {
            str = commentInputAweme.getAid();
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("group_id", str);
        LinearLayout linearLayout = this.LLIFFJFJJ;
        if (linearLayout != null) {
            i = linearLayout.getChildCount();
        }
        oszArr[2] = new OSZ("show_cnt", String.valueOf(i));
        Aweme commentInputAweme2 = getCommentInputAweme();
        if (commentInputAweme2 != null && (authorUid = commentInputAweme2.getAuthorUid()) != null) {
            str2 = authorUid;
        }
        oszArr[3] = new OSZ("author_id", str2);
        FMX.LJIIL("show_quick_comment_panel", C113554cx.LJJL(oszArr));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.af6;
    }

    @Override // X.InterfaceC177046xA
    public final /* bridge */ /* synthetic */ Comment getCommentInputReplyComment() {
        return null;
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ String getEnterMethod() {
        return "";
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ boolean isLandscapeMode() {
        return false;
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onClickCloseUpvotePanel() {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onCommentInputClick() {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
    }

    @Override // X.InterfaceC177046xA
    public final void onEmojiClick(String str, int i, int i2) {
    }

    @Override // X.InterfaceC177046xA
    public final void onEmojiToKeyboard(String str) {
    }

    @Override // X.InterfaceC177046xA
    public void onEvent(C174266sg c174266sg) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onUpvotePublishProcessChanged(boolean z) {
    }

    public VideoQuickCommentAssem() {
        new LinkedHashMap();
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C7AS.INSTANCE);
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C7AT.INSTANCE);
        this.LLIIIJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C7AU.INSTANCE);
        C65776Prg LIZ = C65352Pkq.LIZ(VideoQuickCommentVM.class);
        this.LLIIIL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 356), null, C7AR.INSTANCE, null, null);
        C79488VHo.LIZIZ();
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LLIIIZ = C221108m2.LIZ(enumC221088m0, C7AZ.LJLIL);
        this.LLIIJI = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 357));
        this.LLIIJLIL = C221108m2.LIZ(enumC221088m0, C178766zw.LJLIL);
        this.LLIILII = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 66));
    }

    @Override // X.InterfaceC177046xA
    public final int getCommentInputViewType() {
        C7AY c7ay = this.LLIIL;
        if (c7ay != null && c7ay.LJI()) {
            return 10;
        }
        return 2;
    }

    @Override // X.InterfaceC177046xA
    public final boolean hasUpvoteOption() {
        return C7HV.LIZIZ.LJIL().LJII(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
    }

    public final InterfaceC178516zX r4() {
        return (InterfaceC178516zX) this.LLIIJLIL.getValue();
    }

    public final void A4() {
        boolean z;
        float f;
        LinearLayout linearLayout;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (C32151Nz.LJJIJIIJI(context, C63081OpJ.LJJJJL(context)) <= 360) {
            z = true;
        } else {
            z = false;
        }
        CommentService.LIZ.getClass();
        List<String> LJIIIZ = CommentServiceImpl.LJJL().LJIIIZ(z);
        LinearLayout linearLayout2 = this.LLIFFJFJJ;
        if (linearLayout2 != null && linearLayout2.getChildCount() > 0 && (linearLayout = this.LLIFFJFJJ) != null) {
            linearLayout.removeAllViews();
        }
        int size = LJIIIZ.size();
        for (int i = 0; i < size; i++) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            if (L2J.LIZ()) {
                f = 24.0f;
            } else {
                f = 22.0f;
            }
            tuxTextView.LJJJ(f);
            tuxTextView.setGravity(17);
            tuxTextView.setText((CharSequence) ListProtector.get(LJIIIZ, i));
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS21S0201000_3(i, this, LJIIIZ, 1));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C7MY.LIZIZ(40), C7MY.LIZIZ(40));
            if (i < C47261Igj.LJJI(LJIIIZ)) {
                layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            }
            LinearLayout linearLayout3 = this.LLIFFJFJJ;
            if (linearLayout3 != null) {
                linearLayout3.addView(tuxTextView, layoutParams);
            }
        }
    }

    public final void B4() {
        C224748ru c224748ru;
        String str;
        String str2;
        Fragment LJIIIIZZ = J8V.LJIIIIZZ(getHostLifecycleOwner());
        if (LJIIIIZZ == null || !LJIIIIZZ.isAdded() || LJIIIIZZ.getContext() == null) {
            return;
        }
        if (this.LLIIL == null) {
            CommentService.LIZ.getClass();
            this.LLIIL = CommentServiceImpl.LJJL().LJJJLZIJ(LJIIIIZZ, hashCode(), this);
        }
        if (!this.LLIILII || (c224748ru = this.LLII) == null) {
            return;
        }
        Context requireContext = LJIIIIZZ.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        TuxTextView tuxTextView = new TuxTextView(requireContext, null, 6, 0);
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str3 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType;
        if (str3 == null) {
            str3 = "";
        }
        Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        C177056xB c177056xB = new C177056xB(c224748ru, c224748ru, (TuxIconView) null, (TuxIconView) null, (TuxIconView) null, tuxTextView, str, str3, (EnumC177736yH) null, str2, 768);
        C7AY c7ay = this.LLIIL;
        if (c7ay != null) {
            c7ay.LIZIZ(c177056xB);
        }
        this.LLIILII = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
        n4();
        if (this.LJLLLL) {
            z4(this, false, false, 6);
        }
    }

    @Override // X.InterfaceC177046xA
    public final boolean checkCommentInputable() {
        Aweme commentInputAweme;
        if (!((RBX) HG3.LJIILL()).isLogin() || (commentInputAweme = getCommentInputAweme()) == null) {
            return false;
        }
        AwemeControl awemeControl = commentInputAweme.getAwemeControl();
        if (awemeControl != null) {
            awemeControl.canComment();
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC177046xA
    public final Aweme getCommentInputAweme() {
        return ((VideoItemParams) v3()).getAweme();
    }

    @Override // X.InterfaceC177046xA
    public final String getEventType() {
        String str = ((VideoItemParams) v3()).mEventType;
        o.LJIIIIZZ(str, "getItem<VideoItemParams>().eventType");
        return str;
    }

    @Override // X.InterfaceC177046xA
    public final boolean upvoteWhenComment() {
        if (hasUpvoteOption() && C7HV.LIZIZ.LJIL().LJFF()) {
            return true;
        }
        return false;
    }

    public static final void C4(VideoQuickCommentAssem videoQuickCommentAssem) {
        String str;
        if (!videoQuickCommentAssem.LJLLL || C54838Lfe.LJIIZILJ(videoQuickCommentAssem.getCommentInputAweme())) {
            return;
        }
        if (C79488VHo.LIZ() && videoQuickCommentAssem.getContainerView().getVisibility() != 0) {
            InterfaceC178516zX r4 = videoQuickCommentAssem.r4();
            Aweme commentInputAweme = videoQuickCommentAssem.getCommentInputAweme();
            if (commentInputAweme != null) {
                str = commentInputAweme.getAid();
            } else {
                str = null;
            }
            z4(videoQuickCommentAssem, !r4.get(str).LJLILLLLZI, false, 6);
        }
        if ((C7DU.LIZ() & 8) == 8 && !((VideoItemParams) C51029K0z.LJIILLIIL(videoQuickCommentAssem)).getAweme().isFriendsVideoUnread()) {
            z4(videoQuickCommentAssem, false, false, 6);
        }
        if (videoQuickCommentAssem.getContainerView().getVisibility() == 0) {
            videoQuickCommentAssem.D4();
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        boolean z;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        if (!C54838Lfe.LJIIZILJ(item.getAweme())) {
            C7AL c7al = r4().get(str);
            boolean LIZ = C79488VHo.LIZ();
            if (!c7al.LJLIL && LIZ) {
                r4().LIZ(str, C7AL.L(c7al, true, false, null, 6));
            }
            if ((c7al.LJLIL || LIZ) && !c7al.LJLILLLLZI) {
                z = true;
            } else {
                z = false;
            }
            z4(this, z, false, 6);
        }
        this.LLIILII = true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return c2((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: m4 */
    public final boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C178726zs.LIZJ(item.getAweme());
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishStart(Comment comment) {
        String aid;
        if (comment == null) {
            return;
        }
        String awemeId = comment.getAwemeId();
        if (awemeId == null || awemeId.length() == 0) {
            Aweme commentInputAweme = getCommentInputAweme();
            if (commentInputAweme == null || (aid = commentInputAweme.getAid()) == null) {
                aid = "";
            }
        } else {
            aid = comment.getAwemeId();
        }
        CommentService.LIZ.getClass();
        List<C75J> LJJJIL = CommentServiceImpl.LJJL().LJJJIL(C212428Vi.LIZ(getHostLifecycleOwner()));
        if (LJJJIL != null) {
            Iterator<C75J> it = LJJJIL.iterator();
            while (it.hasNext()) {
                it.next().Kc(comment);
            }
        }
        C178646zk c178646zk = new C178646zk(0);
        o.LJIIIIZZ(aid, "aid");
        c178646zk.LJLILLLLZI = aid;
        C2U8.LIZ(c178646zk);
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishSuccess(Comment comment) {
        boolean z;
        String awemeId;
        boolean z2;
        int i;
        if (comment == null || !this.LJLLL) {
            return;
        }
        String awemeId2 = comment.getAwemeId();
        if (awemeId2 == null || awemeId2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String emoji = null;
        if (z) {
            Aweme commentInputAweme = getCommentInputAweme();
            if (commentInputAweme == null || (awemeId = commentInputAweme.getAid()) == null) {
                awemeId = "";
            }
        } else {
            awemeId = comment.getAwemeId();
        }
        if (comment.getPublishScenario() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            String text = comment.getText();
            if (text != null) {
                String text2 = comment.getText();
                if (text2 != null) {
                    i = text2.length();
                } else {
                    i = 0;
                }
                emoji = text.substring(0, i / 3);
                o.LJIIIIZZ(emoji, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (!C54838Lfe.LJIIZILJ(getCommentInputAweme()) && emoji != null && emoji.length() != 0) {
                AssemViewModel assemViewModel = (AssemViewModel) this.LLIIIL.LIZ(this, LLIILZL[0]);
                assemViewModel.getClass();
                o.LJIIIZ(emoji, "emoji");
                assemViewModel.setState(new AqS28S1000000_3(emoji, 33));
                DataCenter dataCenter = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).dataCenter;
                if (dataCenter != null) {
                    dataCenter.jv0(emoji, "on_click_quick_emoji");
                }
            }
        } else {
            C26045AKb c26045AKb = new C26045AKb(getContainerView());
            c26045AKb.LJIIIIZZ(R.string.dl4);
            c26045AKb.LJIIJ();
        }
        C2U8.LIZ(new C174046sK(3, new Object[]{awemeId, comment.m103clone()}));
        CommentService.LIZ.getClass();
        List<C75J> LJJJIL = CommentServiceImpl.LJJL().LJJJIL(C212428Vi.LIZ(getHostLifecycleOwner()));
        if (LJJJIL != null) {
            comment.setIgnoreToast(true);
            Iterator<C75J> it = LJJJIL.iterator();
            while (it.hasNext()) {
                it.next().Ri(comment);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = (SmartAvatarImageView) view.findViewById(R.id.eye);
        this.LLFZ = (TuxTextView) view.findViewById(R.id.m6i);
        this.LLI = view.findViewById(R.id.n2k);
        this.LLIFFJFJJ = (LinearLayout) view.findViewById(R.id.g37);
        this.LLII = (C224748ru) view.findViewById(R.id.gie);
        if (L2J.LIZ()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = C7MY.LIZIZ(40);
            view.setLayoutParams(layoutParams);
            TuxTextView tuxTextView = this.LLFZ;
            if (tuxTextView != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
                    tuxTextView.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            LinearLayout linearLayout = this.LLIFFJFJJ;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                    marginLayoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                    linearLayout.setLayoutParams(marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            SmartAvatarImageView smartAvatarImageView = this.LLFII;
            if (smartAvatarImageView != null) {
                ViewGroup.LayoutParams layoutParams4 = smartAvatarImageView.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = C7MY.LIZIZ(32);
                    layoutParams4.width = C7MY.LIZIZ(32);
                    smartAvatarImageView.setLayoutParams(layoutParams4);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        if (((Number) C181497Aj.LIZ.getValue()).intValue() > 1) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            if (layoutParams5 != null) {
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                layoutParams6.width = -1;
                view.setLayoutParams(layoutParams6);
                SmartAvatarImageView smartAvatarImageView2 = this.LLFII;
                if (smartAvatarImageView2 != null) {
                    smartAvatarImageView2.setVisibility(0);
                }
                W5F LJII = W5U.LJII(C78939UyV.LJ(((RBX) HG3.LJIILL()).getCurUser().getAvatarThumb()));
                LJII.LJJIIJ = this.LLFII;
                C16880lQ.LLJJJ(LJII);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(24);
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        c110614Vt.LJFF = Integer.valueOf(R.attr.dm);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        view.setBackground(c110614Vt.LIZ(context));
        q4(null);
        View view2 = this.LLI;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 325), view2);
        }
        A4();
        if (!C79488VHo.LIZ()) {
            C8YN.LJII(this, (AssemViewModel) this.LLIIIL.LIZ(this, LLIILZL[0]), new TBT() { // from class: X.7AX
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C7AV) obj).LJLILLLLZI;
                }
            }, null, C7AN.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.8PN
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLJJLL;
                }
            }, null, C90823hO.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.7Di
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJZ;
                }
            }, C213688a4.LIZLLL(), C7AQ.LJLIL, 4);
        }
        C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.7wO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 225), 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.7Ae
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 224), 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.82C
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C7AP.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.7DW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLZ;
            }
        }, null, C7AM.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.7Df
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJZI;
            }
        }, C213688a4.LIZLLL(), C7AO.LJLIL, 4);
        C2NH.LIZ(new ARunnableS39S0100000_3(this, 224));
    }

    public final void q4(CharSequence charSequence) {
        boolean z;
        Context context;
        CharSequence string;
        C224748ru c224748ru;
        TuxTextView tuxTextView = this.LLFZ;
        if (tuxTextView == null) {
            return;
        }
        if (charSequence == null || charSequence.length() == 0) {
            C7AY c7ay = this.LLIIL;
            if (c7ay != null && c7ay.LJI()) {
                z = true;
            } else {
                z = false;
            }
            if (!z ? (context = getContext()) == null || (string = context.getString(R.string.ps_)) == null : (c224748ru = this.LLII) == null || (string = c224748ru.getHint()) == null) {
                string = "";
            }
        } else {
            string = charSequence;
        }
        if (C79488VHo.LIZIZ() && o.LJ(tuxTextView.getText(), string)) {
            return;
        }
        if (charSequence == null || charSequence.length() == 0) {
            C023107f.LIZIZ(tuxTextView, 10, 15, 1, 1);
        } else {
            C023107f.LIZJ(tuxTextView, 0);
            tuxTextView.setTuxFont(41);
        }
        tuxTextView.setText(string);
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardDismiss(boolean z, C177156xL eventTrackingBundle) {
        CommentEditText$MentionSpan[] commentEditText$MentionSpanArr;
        Editable text;
        o.LJIIIZ(eventTrackingBundle, "eventTrackingBundle");
        Context context = getContext();
        if (context == null) {
            return;
        }
        C224748ru c224748ru = this.LLII;
        SpannableString spannableString = null;
        if (c224748ru != null) {
            commentEditText$MentionSpanArr = c224748ru.getMentionSpan();
        } else {
            commentEditText$MentionSpanArr = null;
        }
        if (commentEditText$MentionSpanArr != null && commentEditText$MentionSpanArr.length != 0) {
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dj, context);
            C224748ru c224748ru2 = this.LLII;
            if (c224748ru2 != null) {
                c224748ru2.setMentionTextColor(LJIIIIZZ);
            }
            C224748ru c224748ru3 = this.LLII;
            if (c224748ru3 != null) {
                c224748ru3.LJIIIZ();
            }
        }
        C224748ru c224748ru4 = this.LLII;
        if (c224748ru4 != null && (text = c224748ru4.getText()) != null) {
            spannableString = SpannableString.valueOf(text);
            o.LJIIIIZZ(spannableString, "SpannableString.valueOf(this)");
        }
        q4(spannableString);
        C2U8.LIZ(new C2IP(false, false));
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardShow(boolean z, String str, C177156xL c177156xL) {
        C2U8.LIZ(new C2IP(true, false));
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishFailed(Exception e, int i, Comment comment) {
        Aweme commentInputAweme;
        o.LJIIIZ(e, "e");
        if (comment == null) {
            return;
        }
        if (comment.getCommentType() == 223) {
            String awemeId = comment.getAwemeId();
            if (awemeId == null && ((commentInputAweme = getCommentInputAweme()) == null || (awemeId = commentInputAweme.getAid()) == null)) {
                awemeId = "";
            }
            C7HV c7hv = C7HV.LIZIZ;
            if (c7hv.LJIILJJIL().LJIIIZ(e)) {
                c7hv.LJIILJJIL().LJII(awemeId, EnumC177746yI.PERMISSION_DENIED);
            } else {
                CommentService.LIZ.getClass();
                if (CommentServiceImpl.LJJL().LJJIFFI(getContext(), e)) {
                    c7hv.LJIILJJIL().LJII(awemeId, EnumC177746yI.DEFAULT);
                }
            }
        } else if (comment.getPublishScenario() != 1) {
            CommentService.LIZ.getClass();
            CommentServiceImpl.LJJL().LJJIFFI(getContext(), e);
        }
        CommentService.LIZ.getClass();
        List<C75J> LJJJIL = CommentServiceImpl.LJJL().LJJJIL(C212428Vi.LIZ(getHostLifecycleOwner()));
        if (LJJJIL != null) {
            comment.setIgnoreToast(true);
            Iterator<C75J> it = LJJJIL.iterator();
            while (it.hasNext()) {
                it.next().xk(e, i, comment);
            }
        }
    }

    public final void u4(boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        boolean z3;
        LinearInterpolator linearInterpolator;
        InterpolatorC216808f6 interpolatorC216808f6;
        if (!this.LJLLL) {
            return;
        }
        if (z2 && !C79488VHo.LIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z3) {
            Y3().setVisibility(0);
            C181407Aa c181407Aa = (C181407Aa) this.LLIIIZ.getValue();
            View containerView = getContainerView();
            int LIZIZ = C7MY.LIZIZ(LLIIZ);
            AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3(this, (VideoQuickCommentAssem) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 35);
            c181407Aa.getClass();
            AnimatorSet animatorSet = c181407Aa.LIZIZ;
            if (animatorSet != null && animatorSet.isRunning()) {
                animatorSet.cancel();
            }
            if (containerView.getVisibility() == 0) {
                return;
            }
            AnimatorSet animatorSet2 = c181407Aa.LIZ;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
                containerView.setLayoutParams(layoutParams);
                containerView.setAlpha(0.0f);
                containerView.post(new ARunnableS4S0301000_3(LIZIZ, containerView, c181407Aa, aqS150S0200000_3, 2));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (z) {
            if (getContainerView().getVisibility() != 0) {
                int height = getContainerView().getHeight();
                int i = LLIIZ;
                if (height < C7MY.LIZIZ(i)) {
                    View containerView2 = getContainerView();
                    ViewGroup.LayoutParams layoutParams2 = containerView2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = C7MY.LIZIZ(i);
                        containerView2.setLayoutParams(layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            }
            getContainerView().setVisibility(0);
            Y3().setVisibility(0);
            getContainerView().setAlpha(1.0f);
            if (interfaceC65784Pro == null) {
                return;
            }
            interfaceC65784Pro.invoke();
            return;
        }
        if (z3) {
            C181407Aa c181407Aa2 = (C181407Aa) this.LLIIIZ.getValue();
            View containerView3 = getContainerView();
            int LIZIZ2 = C7MY.LIZIZ(LLIIZ);
            AqS150S0200000_3 aqS150S0200000_32 = new AqS150S0200000_3(this, (VideoQuickCommentAssem) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 36);
            c181407Aa2.getClass();
            AnimatorSet animatorSet3 = c181407Aa2.LIZ;
            if (animatorSet3 != null && animatorSet3.isRunning()) {
                animatorSet3.cancel();
            }
            if (containerView3.getVisibility() == 8) {
                return;
            }
            AnimatorSet animatorSet4 = c181407Aa2.LIZIZ;
            if (animatorSet4 != null && animatorSet4.isRunning()) {
                return;
            }
            boolean LIZIZ3 = C79488VHo.LIZIZ();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(containerView3, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            if (LIZIZ3) {
                linearInterpolator = (LinearInterpolator) c181407Aa2.LIZJ.getValue();
            } else {
                linearInterpolator = new LinearInterpolator();
            }
            ofFloat.setInterpolator(linearInterpolator);
            ofFloat.setDuration(100L);
            ValueAnimator ofInt = ValueAnimator.ofInt(LIZIZ2, 0);
            if (LIZIZ3) {
                interpolatorC216808f6 = (InterpolatorC216808f6) c181407Aa2.LIZLLL.getValue();
            } else {
                interpolatorC216808f6 = new InterpolatorC216808f6(0.65f, 0.0f, 0.35f, 1.0f);
            }
            ofInt.setInterpolator(interpolatorC216808f6);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(containerView3, 88));
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(ofFloat, ofInt);
            animatorSet5.addListener(new IDAListenerS37S0200000_3(containerView3, aqS150S0200000_32, 4));
            animatorSet5.addListener(new IDAListenerS72S0100000_3(aqS150S0200000_32, 52));
            c181407Aa2.LIZIZ = animatorSet5;
            animatorSet5.start();
            return;
        }
        getContainerView().setVisibility(8);
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static /* synthetic */ void z4(VideoQuickCommentAssem videoQuickCommentAssem, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        videoQuickCommentAssem.u4(z, z2, null);
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishClick(int i, int i2, CharSequence content, String str, String str2, boolean z, C177156xL c177156xL) {
        o.LJIIIZ(content, "content");
        c177156xL.LIZLLL = upvoteWhenComment();
        CommentService.LIZ.getClass();
        CommentServiceImpl.LJJL().LJIJJ(getCommentInputAweme(), content, getEventType(), String.valueOf(i2), "click_quick_panel", null, i, c177156xL);
    }
}
