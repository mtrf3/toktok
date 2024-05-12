package com.ss.android.ugc.aweme.comment.detailpage.ui;

import X.AF9;
import X.AWX;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.AnonymousClass766;
import X.C018905p;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C149985uc;
import X.C16880lQ;
import X.C16970lZ;
import X.C174046sK;
import X.C174266sg;
import X.C175136u5;
import X.C175256uH;
import X.C175276uJ;
import X.C176996x5;
import X.C177056xB;
import X.C177156xL;
import X.C177326xc;
import X.C178296zB;
import X.C178506zW;
import X.C178526zY;
import X.C178596zf;
import X.C178606zg;
import X.C178636zj;
import X.C178646zk;
import X.C178676zn;
import X.C1793872g;
import X.C181497Aj;
import X.C187197Wh;
import X.C188727au;
import X.C1B3;
import X.C224748ru;
import X.C227768wm;
import X.C26045AKb;
import X.C27740Aue;
import X.C279017q;
import X.C29S;
import X.C2U8;
import X.C32151Nz;
import X.C38306F1q;
import X.C38816FLg;
import X.C3C5;
import X.C50420Jqa;
import X.C53816LAe;
import X.C54838Lfe;
import X.C55274Lmg;
import X.C57092Lx;
import X.C58655N0h;
import X.C58704N2e;
import X.C59406NTe;
import X.C61447O9r;
import X.C62905OmT;
import X.C63081OpJ;
import X.C71Y;
import X.C74Z;
import X.C76800UCe;
import X.C76A;
import X.C76T;
import X.C77321UWf;
import X.C79045V0n;
import X.C7AL;
import X.C7HV;
import X.C80S;
import X.C90903hW;
import X.EnumC177736yH;
import X.EnumC177746yI;
import X.FMX;
import X.HG3;
import X.InterfaceC177046xA;
import X.InterfaceC178126yu;
import X.InterfaceC178496zV;
import X.InterfaceC178516zX;
import X.InterfaceC55317LnN;
import X.KL2;
import X.LFH;
import X.M89;
import X.ORZ;
import X.OSZ;
import X.Q8V;
import X.QD3;
import X.RBX;
import X.V0N;
import X.V16;
import X.X1D;
import X.Y87;
import X.Z89;
import X.Z9N;
import Y.ACListenerS17S1300000_10;
import Y.ACListenerS22S0101000_3;
import Y.ACListenerS32S0101000_15;
import Y.ACListenerS38S0200000_3;
import Y.AObserverS71S0100000_3;
import Y.ARunnableS0S0111000_3;
import Y.ARunnableS4S0301000_3;
import Y.IDAListenerS1S0110000_3;
import Y.IDCListenerS157S0100000_3;
import Y.IDCListenerS47S0200000_3;
import Y.IDCSpanS29S0100000_3;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.livedata.SlideData;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.comment.gift.ui.GiftAnimationFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import yq4.a;

/* loaded from: classes4.dex */
public class CommentInputFragment extends AbsFragment implements InterfaceC177046xA, InterfaceC55317LnN {
    public static String LLIIJLIL;
    public static String LLIIL;
    public ViewGroup LJLIL;
    public ViewGroup LJLILLLLZI;
    public TuxTextView LJLJI;
    public View LJLJJI;
    public C224748ru LJLJJL;
    public TuxIconView LJLJJLL;
    public TuxIconView LJLJL;
    public TuxIconView LJLJLJ;
    public TuxIconView LJLJLLL;
    public TuxIconView LJLL;
    public TuxTextView LJLLI;
    public ViewGroup LJLLILLLL;
    public ViewGroup LJLLJ;
    public FrameLayout LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public C187197Wh LJZI;
    public C177326xc LJZL;
    public InterfaceC178496zV LL;
    public C176996x5 LLD;
    public InterfaceC178126yu LLF;
    public IVideoGiftService LLFF;
    public C178506zW LLFFF;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public ObjectAnimator LLIIIL;
    public ACListenerS22S0101000_3 LLIIJI;
    public String LLFII = "";
    public String LLFZ = "";
    public String LLIIIILZ = "";
    public boolean LLIIIJ = true;
    public boolean LLIIIZ = true;

    @Override // X.InterfaceC55317LnN
    public final void I4() {
        this.LLI = true;
        View view = this.LJLLLL;
        if (view == null) {
            return;
        }
        view.setVisibility(4);
        this.LJLLLL.setEnabled(false);
    }

    @Override // X.InterfaceC55317LnN
    public final void N() {
        LLIIL = null;
        LLIIJLIL = null;
    }

    @Override // X.InterfaceC55317LnN
    public final void Zh() {
        this.LLI = false;
        View view = this.LJLLLL;
        if (view == null) {
            return;
        }
        view.setVisibility(this.LLIFFJFJJ ? 4 : 0);
        this.LJLLLL.setEnabled(true);
    }

    @Override // X.InterfaceC177046xA
    public final Comment getCommentInputReplyComment() {
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

    @QD3
    public void onAfterLoginInEvent(C175256uH c175256uH) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onClickCloseUpvotePanel() {
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputClick() {
    }

    @Override // X.InterfaceC177046xA
    public void onEvent(C174266sg c174266sg) {
    }

    @QD3
    public void onEvent(AWX awx) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onUpvotePublishProcessChanged(boolean z) {
    }

    public final void Al() {
        if (this.LJLZ.getVisibility() == 0 && this.LJLLL.getVisibility() == 8) {
            return;
        }
        this.LJLZ.setVisibility(0);
        this.LJLLL.setVisibility(8);
        C018905p c018905p = (C018905p) this.LJLJJL.getLayoutParams();
        c018905p.endToStart = R.id.ebo;
        this.LJLJJL.setLayoutParams(c018905p);
    }

    public final boolean Dl() {
        M89 m89;
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            C71Y.LIZLLL("comment_input_tag", "CommentInput  bind expose bottom view but view is not Valid !");
            return false;
        }
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null) {
            m89 = interfaceC178496zV.s3();
        } else {
            m89 = null;
        }
        Aweme aweme = getAweme();
        if (m89 != null && aweme != null) {
            Z9N z9n = Z9N.LIZIZ;
            if (z9n.LLILZ().LJIIJ(m89.getEventType()) && aweme.hasCreationIntention() && z9n.LLILZ().LIZJ(aweme)) {
                return true;
            }
        }
        return false;
    }

    public final String Gl() {
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null && interfaceC178496zV.getCommentInputAweme() != null) {
            return this.LL.getCommentInputAweme().getAid();
        }
        return "";
    }

    public final void Hl() {
        View view = this.LJLLLL;
        if (view == null || this.LJLIL == null || this.LJLLLLLL == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.LJLIL.setVisibility(8);
        this.LJLLLLLL.setVisibility(8);
        marginLayoutParams.height = 1;
        this.LJLLLL.setLayoutParams(marginLayoutParams);
    }

    public final void Kl() {
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
            ((ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams()).setMarginStart(C32151Nz.LJIILLIIL(16));
            this.LJLJI.setGravity(8388627);
        }
        ViewGroup viewGroup = this.LJLLILLLL;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final void Ll() {
        C178506zW c178506zW;
        String str;
        C224748ru c224748ru;
        String str2;
        String str3;
        Aweme commentInputAweme;
        Aweme commentInputAweme2;
        Aweme aweme;
        String str4;
        String str5;
        String authorUid;
        C76T c76t;
        if (this.LLD == null || (c178506zW = this.LLFFF) == null || !c178506zW.LIZ()) {
            return;
        }
        String str6 = "";
        int i = 0;
        if (this.LLFFF.LIZIZ()) {
            ViewGroup viewGroup = this.LJLLJ;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            ViewGroup viewGroup2 = this.LJLIL;
            if (viewGroup2 == null) {
                return;
            }
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.d2e);
            if (viewGroup3 != null) {
                int i2 = C61447O9r.LJIILJJIL;
                C57092Lx.LIZ.getClass();
                int LIZ = C61447O9r.LIZ();
                if (i2 == 0) {
                    i2 = LIZ;
                }
                ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
                layoutParams.height = i2;
                viewGroup3.setLayoutParams(layoutParams);
            }
            C178506zW c178506zW2 = this.LLFFF;
            c178506zW2.getClass();
            if (viewGroup3 == null) {
                return;
            }
            View findViewById = viewGroup3.findViewById(R.id.ikm);
            if (findViewById == null) {
                C76T c76t2 = new C76T(c178506zW2.LIZ);
                c76t2.setId(R.id.ikm);
                c76t2.setOnEdit(new C178636zj(c178506zW2));
                c76t2.setOnClickEmoji(new C178606zg(c178506zW2));
                c178506zW2.LIZLLL = c76t2;
                viewGroup3.addView(c178506zW2.LIZLLL, new ViewGroup.LayoutParams(-1, -1));
            }
            String str7 = null;
            if (findViewById == null || (c76t = c178506zW2.LIZLLL) == null || c76t.getVisibility() != 0) {
                C76T c76t3 = c178506zW2.LIZLLL;
                if (c76t3 != null) {
                    c76t3.setVisibility(0);
                }
                C76T c76t4 = c178506zW2.LIZLLL;
                if (c76t4 != null) {
                    c224748ru = c76t4.getEditText();
                } else {
                    c224748ru = null;
                }
                TuxTextView tuxTextView = new TuxTextView(c178506zW2.LIZ, null, 6, 0);
                InterfaceC178496zV interfaceC178496zV = c178506zW2.LJFF;
                if (interfaceC178496zV == null || (commentInputAweme2 = interfaceC178496zV.getCommentInputAweme()) == null || (str2 = commentInputAweme2.getAid()) == null) {
                    str2 = "";
                }
                String str8 = c178506zW2.LJI;
                if (str8 == null) {
                    str8 = "";
                }
                InterfaceC178496zV interfaceC178496zV2 = c178506zW2.LJFF;
                if (interfaceC178496zV2 != null && (commentInputAweme = interfaceC178496zV2.getCommentInputAweme()) != null) {
                    str3 = commentInputAweme.getAuthorUid();
                } else {
                    str3 = null;
                }
                C177056xB c177056xB = new C177056xB(c224748ru, c224748ru, (TuxIconView) null, (TuxIconView) null, (TuxIconView) null, tuxTextView, str2, str8, (EnumC177736yH) null, str3, 768);
                C176996x5 c176996x5 = c178506zW2.LJ;
                if (c176996x5 != null) {
                    c176996x5.LIZIZ(c177056xB);
                }
            }
            if (viewGroup3.getVisibility() != 0) {
                viewGroup3.setVisibility(0);
            }
            InterfaceC178496zV interfaceC178496zV3 = c178506zW2.LJFF;
            if (interfaceC178496zV3 != null) {
                aweme = interfaceC178496zV3.getCommentInputAweme();
                if (aweme != null) {
                    str7 = aweme.getAid();
                }
            } else {
                aweme = null;
            }
            if (o.LJ(str7, c178506zW2.LJII)) {
                return;
            }
            if (aweme == null || (str4 = aweme.getAid()) == null) {
                str4 = "";
            }
            c178506zW2.LJII = str4;
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ("enter_from", c178506zW2.LJI);
            if (aweme == null || (str5 = aweme.getAid()) == null) {
                str5 = "";
            }
            oszArr[1] = new OSZ("group_id", str5);
            C76T c76t5 = c178506zW2.LIZLLL;
            if (c76t5 != null) {
                i = c76t5.getEmojiCount();
            }
            oszArr[2] = new OSZ("show_cnt", String.valueOf(i));
            if (aweme != null && (authorUid = aweme.getAuthorUid()) != null) {
                str6 = authorUid;
            }
            oszArr[3] = new OSZ("author_id", str6);
            FMX.LJIIL("show_quick_comment_panel", C113554cx.LJJL(oszArr));
            return;
        }
        C76T c76t6 = this.LLFFF.LIZLLL;
        if (c76t6 == null || c76t6.getVisibility() != 0) {
            return;
        }
        ViewGroup viewGroup4 = this.LJLLJ;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(0);
        }
        C178506zW c178506zW3 = this.LLFFF;
        C76T c76t7 = c178506zW3.LIZLLL;
        if (c76t7 != null) {
            c76t7.setVisibility(8);
        }
        c178506zW3.LJII = "";
        View view = this.LJLJJI;
        C224748ru c224748ru2 = this.LJLJJL;
        TuxIconView tuxIconView = this.LJLJJLL;
        TuxIconView tuxIconView2 = this.LJLJLJ;
        TuxIconView tuxIconView3 = this.LJLJL;
        TuxTextView tuxTextView2 = this.LJLJI;
        Aweme aweme2 = getAweme();
        if (aweme2 == null) {
            str = "";
        } else {
            str = aweme2.getAid();
        }
        String str9 = this.LLFII;
        EnumC177736yH enumC177736yH = EnumC177736yH.DEFAULT;
        Aweme aweme3 = getAweme();
        if (aweme3 != null) {
            str6 = aweme3.getAuthorUid();
        }
        this.LLD.LIZIZ(new C177056xB(view, c224748ru2, tuxIconView, tuxIconView2, tuxIconView3, (TextView) tuxTextView2, str, str9, true, enumC177736yH, str6));
    }

    @Override // X.InterfaceC55317LnN, com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility
    public final void X5() {
        boolean z;
        C176996x5 c176996x5;
        C176996x5 c176996x52;
        Aweme commentInputAweme;
        if (this.LJLJJL == null || this.LLII) {
            return;
        }
        isViewValid();
        Aweme aweme = getAweme();
        boolean z2 = true;
        if (aweme != null && aweme.isProhibited()) {
            this.LJLJJL.setEnabled(false);
            this.LJLJJL.setHint(R.string.dkl);
        } else {
            this.LJLJJL.setEnabled(true);
            C176996x5 c176996x53 = this.LLD;
            if (c176996x53 != null) {
                c176996x53.LJJJLL();
                Editable text = this.LJLJJL.getText();
                boolean LJJL = C176996x5.LJJL(aweme);
                if (text != null && text.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                Nl(LJJL, z, false);
                this.LLD.LJJJJLI();
            }
        }
        C178506zW c178506zW = this.LLFFF;
        if (c178506zW != null && c178506zW.LIZIZ()) {
            C178506zW c178506zW2 = this.LLFFF;
            InterfaceC178496zV interfaceC178496zV = c178506zW2.LJFF;
            if (interfaceC178496zV == null || (commentInputAweme = interfaceC178496zV.getCommentInputAweme()) == null || !commentInputAweme.isProhibited()) {
                z2 = false;
            }
            C76T c76t = c178506zW2.LIZLLL;
            if (c76t != null) {
                c76t.setEditStatus(z2);
            }
            if (!z2 && (c176996x52 = c178506zW2.LJ) != null) {
                c176996x52.LJJJJLI();
            }
        }
        if (!isViewValid() || (c176996x5 = this.LLD) == null) {
            return;
        }
        c176996x5.LJZL = null;
    }

    @Override // X.InterfaceC55317LnN
    public final void d3() {
        M89 m89;
        C71Y.LIZ("xjccccc", "input fragment updateWhenPageSelected");
        if (!isViewValid()) {
            return;
        }
        if (Dl()) {
            xl();
            InterfaceC178496zV interfaceC178496zV = this.LL;
            if (interfaceC178496zV != null) {
                m89 = interfaceC178496zV.s3();
            } else {
                m89 = null;
            }
            Aweme aweme = getAweme();
            if (m89 != null && aweme != null) {
                Z9N.LIZIZ.LLILZ().LJIIIZ(aweme.getAid(), m89.getEventType(), aweme.getAuthorUid());
            }
        } else {
            Al();
            if (!vl()) {
                wl();
                Ll();
            } else {
                this.LJLLJ.setVisibility(8);
            }
        }
        boolean LJ = a.LJ().LJ(3);
        if (this.LLIIII != LJ && this.LLD != null) {
            this.LLIIII = LJ;
            if (LJ) {
                Kl();
            }
            this.LLD.LJJJLIIL(this.LLIIII);
        }
        this.LLIIIZ = false;
    }

    @Override // X.InterfaceC55317LnN
    public final void fj() {
        View view = this.LJZ;
        if (view != null && this.LJLJJL != null && view.getVisibility() == 0) {
            this.LJZ.setVisibility(8);
            this.LJLJJL.setEnabled(true);
            this.LJLJJL.setFocusable(true);
        }
    }

    @Override // X.InterfaceC55317LnN
    public final boolean g0() {
        C176996x5 c176996x5;
        ViewGroup viewGroup;
        C178506zW c178506zW;
        if (!this.LLIIII && (((c176996x5 = this.LLD) == null || c176996x5.LJJIIZI()) && (((viewGroup = this.LJLLJ) != null && viewGroup.getVisibility() == 0) || ((c178506zW = this.LLFFF) != null && c178506zW.LIZIZ())))) {
            return true;
        }
        return false;
    }

    public final Aweme getAweme() {
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null) {
            return interfaceC178496zV.getCommentInputAweme();
        }
        return null;
    }

    @Override // X.InterfaceC177046xA
    public final int getCommentInputViewType() {
        C176996x5 c176996x5 = this.LLD;
        if (c176996x5 != null && c176996x5.LJI()) {
            return 10;
        }
        return 1;
    }

    @Override // X.InterfaceC177046xA
    public final String getEventType() {
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null) {
            return interfaceC178496zV.getEventType();
        }
        return "";
    }

    @Override // X.InterfaceC177046xA
    public final boolean hasUpvoteOption() {
        return C7HV.LIZIZ.LJIL().LJII(getAweme());
    }

    public final boolean vl() {
        M89 m89;
        C71Y.LIZ("jxl0227", "bind expose bottom view");
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            C71Y.LIZLLL("comment_input_tag", "CommentInput  bind expose bottom view but view is not Valid !");
            return false;
        }
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null) {
            m89 = interfaceC178496zV.s3();
        } else {
            m89 = null;
        }
        if (!AnonymousClass766.LIZJ(getAweme(), m89)) {
            return false;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.LJLIL.findViewById(R.id.d2e);
        if (viewGroup2 != null) {
            int i = C61447O9r.LJIILJJIL;
            C57092Lx.LIZ.getClass();
            int LIZ = C61447O9r.LIZ();
            if (i == 0) {
                i = LIZ;
            }
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = i;
            viewGroup2.setLayoutParams(layoutParams);
        }
        return C178676zn.LIZ(viewGroup2, m89, getAweme(), new ACListenerS22S0101000_3(0, this, 7));
    }

    public final void wl() {
        M89 m89;
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            C71Y.LIZLLL("comment_input_tag", "CommentInput  bindVideoViewerEntrance but view is not Valid !");
            return;
        }
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null) {
            m89 = interfaceC178496zV.s3();
        } else {
            m89 = null;
        }
        boolean LJIJJLI = CommentServiceImpl.LJJL().LJIJJLI((ViewGroup) this.LJLIL.findViewById(R.id.d2e), getAweme(), m89);
        ViewGroup viewGroup2 = this.LJLLJ;
        if (viewGroup2 != null) {
            if (LJIJJLI) {
                viewGroup2.setVisibility(8);
            } else {
                viewGroup2.setVisibility(0);
            }
        }
    }

    public final void xl() {
        if (this.LJLZ.getVisibility() == 8 && this.LJLLL.getVisibility() == 0) {
            return;
        }
        this.LJLZ.setVisibility(8);
        this.LJLLL.setVisibility(0);
        if (this.LLIIJI == null) {
            this.LLIIJI = new ACListenerS22S0101000_3(1, this, 5);
        }
        C16880lQ.LJIILJJIL(this.LJLLL, this.LLIIJI);
        C018905p c018905p = (C018905p) this.LJLJJL.getLayoutParams();
        c018905p.endToStart = R.id.bl3;
        this.LJLJJL.setLayoutParams(c018905p);
    }

    public final CommentListPageFragment Ml() {
        if (mo49getActivity() == null) {
            return null;
        }
        return (CommentListPageFragment) mo49getActivity().getSupportFragmentManager().LJJJIL("comment_page");
    }

    @Override // X.InterfaceC55317LnN
    public final void b7() {
        boolean z;
        Aweme aweme;
        if (!isViewValid()) {
            return;
        }
        boolean z2 = false;
        if (!HG3.LJIILL().isLogin()) {
            this.LJLJJL.setFocusable(false);
        } else {
            this.LJLJJL.setFocusable(true);
            this.LJLJJL.setFocusableInTouchMode(true);
            this.LJLJJL.requestFocus();
        }
        Aweme aweme2 = getAweme();
        if (aweme2 != null && aweme2.isProhibited()) {
            this.LJLJJL.setEnabled(false);
            this.LJLJJL.setHint(R.string.dkl);
        } else {
            this.LJLJJL.setEnabled(true);
            C176996x5 c176996x5 = this.LLD;
            if (c176996x5 != null) {
                c176996x5.LJJJLL();
                Editable text = this.LJLJJL.getText();
                boolean LJJL = C176996x5.LJJL(aweme2);
                if ((text != null && text.length() > 0) || this.LLD.LJZL != null) {
                    z = true;
                } else {
                    z = false;
                }
                Nl(LJJL, false, z);
            }
        }
        C178506zW c178506zW = this.LLFFF;
        if (c178506zW != null && c178506zW.LIZIZ()) {
            C178506zW c178506zW2 = this.LLFFF;
            InterfaceC178496zV interfaceC178496zV = c178506zW2.LJFF;
            if (interfaceC178496zV != null) {
                aweme = interfaceC178496zV.getCommentInputAweme();
            } else {
                aweme = null;
            }
            C76T c76t = c178506zW2.LIZLLL;
            if (c76t != null) {
                if (aweme != null && aweme.isProhibited()) {
                    z2 = true;
                }
                c76t.setEditStatus(z2);
            }
        }
    }

    @Override // X.InterfaceC177046xA
    public final boolean checkCommentInputable() {
        Aweme commentInputAweme;
        if (!isViewValid() || mo49getActivity() == null || !((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        Aweme aweme = getAweme();
        if (C63081OpJ.LJLJLLL(aweme)) {
            String LJJIL = C63081OpJ.LJJIL(R.string.tob, aweme);
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIZ(LJJIL);
            c26045AKb.LJIIJ();
            return false;
        }
        if (aweme != null) {
            if (!aweme.isCanPlay()) {
                if (aweme.isImage()) {
                    C26045AKb c26045AKb2 = new C26045AKb(this);
                    c26045AKb2.LJIIIIZZ(R.string.h_y);
                    c26045AKb2.LJIIJ();
                } else {
                    C26045AKb c26045AKb3 = new C26045AKb(this);
                    c26045AKb3.LJIIIIZZ(R.string.tob);
                    c26045AKb3.LJIIJ();
                }
                return false;
            }
            if (aweme.getStatus() != null && aweme.getStatus().isDelete()) {
                C26045AKb c26045AKb4 = new C26045AKb(this);
                c26045AKb4.LJIIIIZZ(R.string.tme);
                c26045AKb4.LJIIJ();
                return false;
            }
            if (aweme.getStatus() != null && !aweme.getStatus().isAllowComment()) {
                C26045AKb c26045AKb5 = new C26045AKb(this);
                c26045AKb5.LJIIIIZZ(R.string.cg5);
                c26045AKb5.LJIIJ();
                return false;
            }
        }
        if (C80S.LIZJ(aweme) && !C80S.LIZLLL(aweme) && (aweme.getAuthor() == null || !TextUtils.equals(aweme.getAuthor().getUid(), ((RBX) HG3.LJIILL()).getCurUser().getUid()))) {
            C26045AKb c26045AKb6 = new C26045AKb(this);
            c26045AKb6.LJIIIIZZ(R.string.gno);
            c26045AKb6.LJIIJ();
            return false;
        }
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null && interfaceC178496zV.getCommentInputAweme() != null && (commentInputAweme = this.LL.getCommentInputAweme()) != null && commentInputAweme.getStatus() != null && commentInputAweme.getStatus().getPrivateStatus() == 1 && commentInputAweme.getAuthor() != null && TextUtils.equals(commentInputAweme.getAuthor().getUid(), ((RBX) HG3.LJIILL()).getCurUser().getUid())) {
            if (aweme != null) {
                this.LJZI.LJJIII(aweme);
                Context context = getContext();
                o.LJIIIZ(context, "context");
                C62905OmT c62905OmT = new C62905OmT(context);
                c62905OmT.LIZ(R.string.pau);
                c62905OmT.LJIIIIZZ(R.string.cg_, new IDCListenerS157S0100000_3(aweme, 5), false);
                c62905OmT.LJIIJJI(R.string.hp2, new IDCListenerS47S0200000_3(aweme, this, 8), false);
                C279017q.LIZLLL(c62905OmT);
            }
            return false;
        }
        if (aweme != null && aweme.isAwemeFromXiGua()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55317LnN
    public final void dismissAllowingStateLoss() {
        Fragment LJJJIL;
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null && (LJJJIL = fragmentManager.LJJJIL("comment_input_tag")) != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIIZ(LJJJIL);
            c1b3.LJI();
        }
    }

    @Override // X.InterfaceC177046xA
    public final Aweme getCommentInputAweme() {
        return getAweme();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, X.InterfaceC49940Jiq
    public final boolean isViewValid() {
        if (super.isViewValid() && getContext() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLFFF = null;
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.mStatusActive = false;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLIIII) {
            Kl();
        }
        b7();
        w0(LLIIJLIL, LLIIL);
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null) {
            interfaceC178496zV.onInternalEvent(new C50420Jqa(9));
        }
    }

    @Override // X.InterfaceC177046xA
    public final boolean upvoteWhenComment() {
        if (hasUpvoteOption() && C7HV.LIZIZ.LJIL().LJFF()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC55317LnN
    public final void R7() {
        isViewValid();
    }

    public final boolean Il(Configuration configuration) {
        LFH.LIZIZ.LIZLLL().LJIILIIL();
        if (C53816LAe.LJI(mo49getActivity(), configuration) && C53816LAe.LJ(this.LLFZ) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC55317LnN
    public final void V9(boolean z) {
        int i;
        View view = this.LJZ;
        if (view != null && this.LJLJJL != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            this.LJLJJL.setEnabled(!z);
            this.LJLJJL.setFocusable(!z);
            Aweme aweme = getAweme();
            if (aweme != null && this.LJZ.getVisibility() == 0) {
                C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, aweme, 108), this.LJZ);
            }
        }
    }

    @Override // X.InterfaceC55317LnN
    public final void ae(boolean z) {
        float f;
        View view = this.LJLLLL;
        if (view == null) {
            this.LLIFFJFJJ = z;
            return;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
        if (z) {
            this.LJLLLL.setVisibility(4);
        }
    }

    @Override // X.InterfaceC55317LnN
    public final boolean h(boolean z) {
        if (!isViewValid() || this.LJLLLL == null || this.LJLIL == null) {
            return false;
        }
        Aweme aweme = getAweme();
        if (aweme != null && aweme.isProhibitedAndShouldTell()) {
            z = false;
        }
        if (Z89.LIZIZ.LIZIZ(aweme)) {
            z = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLLLL.getLayoutParams();
        if (z) {
            if (this.LJLIL.getVisibility() == 8) {
                if (!C54838Lfe.LIZIZ(getAweme())) {
                    return false;
                }
                InterfaceC178496zV interfaceC178496zV = this.LL;
                if (interfaceC178496zV != null && interfaceC178496zV.De()) {
                    return false;
                }
                this.LJLIL.setVisibility(0);
                C27740Aue.LJIIIZ(0, this.LJLLLLLL);
                marginLayoutParams.height = getContext().getResources().getDimensionPixelOffset(R.dimen.gr);
                C57092Lx.LIZ.getClass();
                marginLayoutParams.height += C61447O9r.LJIIL;
                this.LJLLLL.setLayoutParams(marginLayoutParams);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" first bind  show ");
                LIZ.append(this.LLIIIJ);
                C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ));
                if (this.LLIIIJ) {
                    this.LLIIIJ = false;
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("addShowAndHideAnimation ");
                    LIZ2.append(z);
                    C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ2));
                    ObjectAnimator objectAnimator = this.LLIIIL;
                    if (objectAnimator != null && objectAnimator.isRunning()) {
                        this.LLIIIL.cancel();
                    }
                    ViewGroup viewGroup = this.LJLIL;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "alpha", viewGroup.getAlpha(), 1.0f);
                    this.LLIIIL = ofFloat;
                    ofFloat.setDuration(300L);
                    this.LLIIIL.addListener(new IDAListenerS1S0110000_3(this, z, 3));
                    C149985uc.LIZ(this.LLIIIL);
                    this.LLIIIL.start();
                }
            }
            if (Dl()) {
                xl();
            } else {
                Al();
                if (!vl()) {
                    wl();
                    Ll();
                } else {
                    this.LJLLJ.setVisibility(8);
                }
            }
        } else if (this.LJLIL.getVisibility() == 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" first bind  hide ");
            LIZ3.append(this.LLIIIJ);
            C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ3));
            this.LLIIIJ = false;
            Hl();
            isViewValid();
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55317LnN
    public final void ml(float f) {
        int i;
        View view = this.LJLLLL;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
        View view2 = this.LJLLLL;
        boolean z = false;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        view2.setVisibility(i);
        if (f > 0.0f) {
            z = true;
        }
        h(z);
    }

    @QD3
    public void onCommentEvent(C174046sK c174046sK) {
        C176996x5 c176996x5;
        C76T c76t;
        if (c174046sK.LJLIL == 8) {
            Object obj = c174046sK.LJLILLLLZI;
            Aweme aweme = getAweme();
            if (aweme != null && aweme.getAid() != null && aweme.getAid().equals(obj) && (c176996x5 = this.LLD) != null) {
                c176996x5.LJJJLL();
                Nl(C176996x5.LJJL(aweme), false, false);
                C178506zW c178506zW = this.LLFFF;
                if (c178506zW != null && c178506zW.LIZIZ() && (c76t = this.LLFFF.LIZLLL) != null) {
                    c76t.LJJLL();
                }
            }
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
        X5();
        if (comment != null && comment.getFakeGiftId() != 0) {
            Jl(0, comment, true);
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishStart(Comment comment) {
        String str;
        int i;
        if (comment != null) {
            if (!V0N.LJJII(comment.getGiftEffectPath()) && comment.getFakeGiftId() != 0) {
                FragmentManager supportFragmentManager = mo49getActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                GiftAnimationFragment giftAnimationFragment = new GiftAnimationFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("comment", comment);
                giftAnimationFragment.setArguments(bundle);
                giftAnimationFragment.show(c1b3, "GiftAnimationFragment");
                return;
            }
            CommentListPageFragment Ml = Ml();
            if (Ml != null) {
                Ml.Kc(comment);
            }
            if (C76A.LIZ()) {
                C2U8.LIZ(new C175136u5(comment, 1));
            }
            if (((Number) C181497Aj.LIZ.getValue()).intValue() > 0) {
                String aid = comment.getAwemeId();
                if (TextUtils.isEmpty(aid)) {
                    aid = Gl();
                }
                C178646zk c178646zk = new C178646zk(0);
                o.LJIIIZ(aid, "aid");
                c178646zk.LJLILLLLZI = aid;
                C2U8.LIZ(c178646zk);
            }
            C178506zW c178506zW = this.LLFFF;
            if (c178506zW == null || !c178506zW.LIZIZ()) {
                return;
            }
            C178506zW c178506zW2 = this.LLFFF;
            c178506zW2.getClass();
            InterfaceC178496zV interfaceC178496zV = c178506zW2.LJFF;
            Aweme aweme = null;
            if (interfaceC178496zV != null) {
                aweme = interfaceC178496zV.getCommentInputAweme();
            }
            String awemeId = comment.getAwemeId();
            if (awemeId == null || awemeId.length() == 0) {
                if (aweme == null || (str = aweme.getAid()) == null) {
                    str = "";
                }
            } else {
                str = comment.getAwemeId();
            }
            String text = comment.getText();
            if (text == null) {
                return;
            }
            String text2 = comment.getText();
            if (text2 != null) {
                i = text2.length();
            } else {
                i = 0;
            }
            String substring = text.substring(0, i / 3);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            C7AL c7al = ((InterfaceC178516zX) c178506zW2.LIZJ.getValue()).get(str);
            Set LLJILLL = ORZ.LLJILLL(c7al.LJLJI);
            LLJILLL.add(substring);
            ((InterfaceC178516zX) c178506zW2.LIZJ.getValue()).LIZ(str, C7AL.L(c7al, false, false, LLJILLL, 3));
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishSuccess(Comment comment) {
        if (!isViewValid() || mo49getActivity() == null) {
            return;
        }
        String awemeId = comment.getAwemeId();
        if (TextUtils.isEmpty(awemeId)) {
            awemeId = Gl();
        }
        if (comment.getPublishScenario() != 1) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.dl4);
            c26045AKb.LJIIJ();
        }
        X5();
        Aweme aweme = getAweme();
        if (aweme != null && aweme.isAd() && TextUtils.equals(awemeId, aweme.getAid())) {
            AdCommentDependImpl.LJJIIJZLJL().LJIILIIL(getContext(), aweme, "comment_sign");
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "comment", aweme.getAwemeRawAd());
            LIZLLL.LIZJ("comment_sign", "refer");
            LIZLLL.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
            LIZLLL.LIZIZ(C59406NTe.LJI(aweme), "room_id");
            LIZLLL.LJII();
        }
        C74Z.LIZ(requireContext(), comment, this.LLD.LJLJJL, Gl());
        C2U8.LIZ(new C174046sK(3, new Object[]{awemeId, comment.m103clone()}));
        CommentListPageFragment Ml = Ml();
        if (Ml != null) {
            comment.setIgnoreToast(true);
            Ml.Ri(comment);
        }
        if (comment.getGift() == null) {
            return;
        }
        Jl(0, comment, true);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = getView();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int LIZJ = (int) KL2.LIZJ(view.getContext(), configuration.screenWidthDp);
            if (layoutParams.width != LIZJ) {
                layoutParams.width = LIZJ;
            }
            view.setLayoutParams(layoutParams);
        }
        C176996x5 c176996x5 = this.LLD;
        if (c176996x5 != null) {
            c176996x5.LLILZ = Il(configuration);
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hashCode();
        C176996x5 c176996x5 = new C176996x5(this, this);
        this.LLD = c176996x5;
        c176996x5.LLILZ = Il(null);
        this.LLFF = VideoGiftService.LJI();
    }

    @QD3
    public void onDislikeAwemeEvent(C55274Lmg c55274Lmg) {
        float f;
        if (mo49getActivity() == null || c55274Lmg.LJLJJL != mo49getActivity().hashCode() || c55274Lmg.LJLILLLLZI != 2) {
            return;
        }
        if (c55274Lmg.LJLIL) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        ViewGroup viewGroup = this.LJLIL;
        C178596zf.LIZ(viewGroup.getAlpha(), f, viewGroup);
        View view = this.LJLLLLLL;
        C178596zf.LIZ(view.getAlpha(), f, view);
    }

    @Override // X.InterfaceC177046xA
    public final void onEmojiToKeyboard(String str) {
        String aid;
        Aweme aweme = getAweme();
        String str2 = this.LLFII;
        String str3 = "";
        if (aweme == null) {
            aid = "";
        } else {
            aid = aweme.getAid();
            str3 = aweme.getAuthorUid();
        }
        C1793872g.LJFF(str, str2, aid, str3);
    }

    @Override // X.InterfaceC55317LnN
    public final void zd(boolean z) {
        View view = this.LJLLLL;
        if (view == null) {
            return;
        }
        view.post(new ARunnableS0S0111000_3(this, z, 0, 0));
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardDismiss(boolean z, C177156xL c177156xL) {
        boolean z2;
        C76T c76t;
        this.LJLLLL.setVisibility(0);
        if (!TextUtils.isEmpty(this.LJLJJL.getText()) || this.LLD.LJZL != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Nl(false, false, z2);
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null) {
            interfaceC178496zV.onInternalEvent(new C50420Jqa(9));
        }
        InterfaceC178126yu interfaceC178126yu = this.LLF;
        if (interfaceC178126yu != null) {
            interfaceC178126yu.LIZIZ();
        }
        C178506zW c178506zW = this.LLFFF;
        if (c178506zW != null && c178506zW.LIZIZ()) {
            C178506zW c178506zW2 = this.LLFFF;
            C76T c76t2 = c178506zW2.LIZLLL;
            if (c76t2 != null) {
                c76t2.LJJLL();
            }
            C176996x5 c176996x5 = c178506zW2.LJ;
            if (c176996x5 != null && c176996x5.LJI() && (c76t = c178506zW2.LIZLLL) != null) {
                c76t.LJJZ();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        this.LJLJI.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, getContext()));
        TuxTextView tuxTextView = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getString(R.string.dj2));
        LIZ.append(" ");
        String LIZIZ = X1D.LIZIZ(LIZ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i0.LJFF(LIZIZ, getString(R.string.tqv)));
        spannableStringBuilder.setSpan(new IDCSpanS29S0100000_3(this, 7), LIZIZ.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext())), LIZIZ.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), LIZIZ.length(), spannableStringBuilder.length(), 18);
        tuxTextView.setText(spannableStringBuilder);
        this.LJLJI.setMovementMethod(new LinkMovementMethod());
        if (this.LLD != null) {
            View view2 = this.LJLJJI;
            C224748ru c224748ru = this.LJLJJL;
            TuxIconView tuxIconView = this.LJLJJLL;
            TuxIconView tuxIconView2 = this.LJLJLJ;
            TuxIconView tuxIconView3 = this.LJLJL;
            TuxTextView tuxTextView2 = this.LJLJI;
            Aweme aweme = getAweme();
            String str2 = "";
            if (aweme == null) {
                str = "";
            } else {
                str = aweme.getAid();
            }
            String str3 = this.LLFII;
            EnumC177736yH enumC177736yH = EnumC177736yH.DEFAULT;
            Aweme aweme2 = getAweme();
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            this.LLD.LIZIZ(new C177056xB(view2, c224748ru, tuxIconView, tuxIconView2, tuxIconView3, (TextView) tuxTextView2, str, str3, true, enumC177736yH, str2));
        }
        boolean LJ = a.LJ().LJ(3);
        this.LLIIII = LJ;
        this.LLD.LJJJLIIL(LJ);
        if (this.LLIIII) {
            Kl();
        }
        this.LJLJJL.setCursorVisible(false);
        this.LJLLI.setVisibility(8);
        C16880lQ.LJJJ(this.LJLL, new ACListenerS22S0101000_3(0, this, 8));
        this.LJLIL.setBackgroundResource(R.drawable.bop);
        C224748ru c224748ru2 = this.LJLJJL;
        c224748ru2.setTextColor(c224748ru2.getResources().getColor(R.color.bd));
        Integer LJI = C79045V0n.LJI(R.attr.dl, getContext());
        if (LJI != null) {
            this.LJLJJL.setHintTextColor(LJI.intValue());
        }
        this.LJLJJL.setTextAlignment(5);
        this.LJLJJL.setEllipsize(TextUtils.TruncateAt.START);
        this.LJLJJLL.setTintColorRes(R.attr.dl);
        this.LJLJLJ.setTintColorRes(R.attr.dl);
        this.LJLJLLL.setTintColorRes(R.attr.dl);
        if (C175276uJ.LIZJ()) {
            C16880lQ.LJJJ(this.LJLJLLL, new ACListenerS32S0101000_15(0, this, 8));
            this.LJLJLLL.setVisibility(0);
        } else {
            this.LJLJLLL.setVisibility(8);
        }
        C61447O9r c61447O9r = C57092Lx.LIZ;
        ViewGroup viewGroup = this.LJLIL;
        View view3 = this.LJLLLLLL;
        View view4 = this.LJZ;
        c61447O9r.getClass();
        if (view3 != null) {
            C38816FLg.LIZJ(new ARunnableS4S0301000_3(2, view3, viewGroup, view4, 1));
        }
        Nl(C176996x5.LJJL(getAweme()), false, false);
        if (this.LLI) {
            I4();
        }
        ae(this.LLIFFJFJJ);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            SlideData slideData = (SlideData) ViewModelProviders.of(mo49getActivity).get(SlideData.class);
            if (slideData.LJLIL == null) {
                slideData.LJLIL = new MutableLiveData<>();
            }
            slideData.LJLIL.observe(this, new AObserverS71S0100000_3(this, 72));
            if (slideData.LJLILLLLZI == null) {
                slideData.LJLILLLLZI = new MutableLiveData<>();
            }
            slideData.LJLILLLLZI.observe(this, new AObserverS71S0100000_3(this, 73));
        }
        if (!C54838Lfe.LIZIZ(getAweme())) {
            h(false);
        }
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null && interfaceC178496zV.De()) {
            h(false);
        }
        if (Dl()) {
            xl();
            return;
        }
        Al();
        if (!vl()) {
            wl();
            C178506zW c178506zW = new C178506zW(requireContext());
            this.LLFFF = c178506zW;
            C176996x5 c176996x5 = this.LLD;
            InterfaceC178496zV interfaceC178496zV2 = this.LL;
            String str4 = this.LLFII;
            c178506zW.LJ = c176996x5;
            c178506zW.LJFF = interfaceC178496zV2;
            c178506zW.LJI = str4;
            Ll();
            return;
        }
        this.LJLLJ.setVisibility(8);
    }

    @Override // X.InterfaceC55317LnN
    public final void w0(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.LJLJJL.setText(str);
        this.LJLJJL.setEnabled(false);
        this.LLII = true;
        this.LJLJJLL.setVisibility(8);
        this.LJLJLJ.setVisibility(8);
        this.LJLJLLL.setVisibility(8);
        this.LJLLI.setVisibility(0);
        LLIIJLIL = str;
        LLIIL = str2;
        Aweme aweme = getAweme();
        if (!C63081OpJ.LJLL(aweme)) {
            C16880lQ.LJJJJI(this.LJLLI, null);
        } else {
            C16880lQ.LJJJJI(this.LJLLI, new ACListenerS17S1300000_10(this, str2, aweme, aweme.getCommerceVideoAuthInfo(), 0));
        }
    }

    public final void Jl(int i, Comment comment, boolean z) {
        long id;
        int i2;
        if (getAweme() == null || comment == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LLFII);
        c188727au.LJIIIZ("group_id", C227768wm.LIZIZ(getAweme()));
        c188727au.LJIIIZ("author_id", C227768wm.LIZJ(getAweme()));
        c188727au.LIZLLL(z ? 1 : 0, "is_success");
        if (comment.getGift() == null) {
            id = comment.getFakeGiftId();
        } else {
            id = comment.getGift().getId();
        }
        c188727au.LJ(id, "gift_id");
        c188727au.LIZLLL(C178526zY.LIZ(getAweme()), "is_follow");
        Aweme aweme = getAweme();
        if (aweme != null && aweme.isLike()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c188727au.LIZLLL(i2, "is_like");
        c188727au.LIZLLL(!V0N.LJJII(comment.getText()) ? 1 : 0, "is_comment");
        if (i != 0) {
            c188727au.LIZLLL(i, "error_code");
            c188727au.LJFF(C16880lQ.LLJJI(getContext()), "newtork_condition");
        }
        if (!this.LLIIIILZ.isEmpty()) {
            c188727au.LJI("enter_method", this.LLIIIILZ);
        } else if (!this.LLD.LLIIII.isEmpty()) {
            c188727au.LJI("enter_method", this.LLD.LLIIII);
        } else {
            c188727au.LJI("enter_method", "send_button");
        }
        this.LLIIIILZ = "";
        C176996x5 c176996x5 = this.LLD;
        int i3 = c176996x5.LLILLJJLI;
        if (i3 != -1 && c176996x5.LLILLL != -1) {
            c188727au.LIZLLL(i3, "gift_value");
            c188727au.LIZLLL(this.LLD.LLILLL, "gift_position");
        }
        FMX.LJIIL("send_gift", c188727au.LIZ);
        C176996x5 c176996x52 = this.LLD;
        c176996x52.LLILLJJLI = -1;
        c176996x52.LLILLL = -1;
    }

    public final void Nl(boolean z, boolean z2, boolean z3) {
        C176996x5 c176996x5;
        C71Y.LIZ("CommentInputFragment", "updateCommentInputIconGroupDisplay");
        if (this.LJLJL != null) {
            if (this.LLFF.LIZ(getAweme())) {
                this.LJLJL.setTintColorRes(R.attr.dl);
                this.LJLJL.setVisibility(0);
            } else {
                this.LJLJL.setVisibility(8);
            }
        }
        if (z) {
            this.LJLJJLL.setVisibility(8);
            this.LJLJLJ.setVisibility(8);
            this.LJLJLLL.setVisibility(8);
            this.LJLJL.setVisibility(8);
            this.LJZL.LJI(false, false, false, false);
            return;
        }
        this.LJLJJLL.setVisibility(0);
        this.LJLJLJ.setVisibility(0);
        if (getAweme() != null && C77321UWf.LIZLLL(getAweme(), false)) {
            this.LJLJLLL.setVisibility(0);
            if (!this.LLIIIZ && this.LJLLJ.getVisibility() == 0) {
                C74Z.LJJIIJ(this.LLFII);
                this.LLIIIZ = true;
            }
        } else {
            this.LJLJLLL.setVisibility(8);
        }
        this.LJZL.LJI(z3, z2, false, false);
        if (!z3 && this.LJLJJL != null && (c176996x5 = this.LLD) != null) {
            c176996x5.LJJJLL();
        }
        C224748ru c224748ru = this.LJLJJL;
        if (c224748ru != null) {
            c224748ru.setFocusable(true);
            this.LJLJJL.setFocusableInTouchMode(true);
            this.LJLJJL.requestFocus();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C176996x5 c176996x5;
        if (getAweme() != null && C77321UWf.LIZLLL(getAweme(), false)) {
            if (i2 == 100 && intent != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MediaModel = ");
                LIZ.append(intent.getParcelableArrayListExtra("key_choose_media_data"));
                C71Y.LIZ("PhotoComment", X1D.LIZIZ(LIZ));
                List<CommentImageModel> LJIILIIL = C77321UWf.LJIILIIL(intent.getParcelableArrayListExtra("key_choose_media_data"));
                if (LJIILIIL != null) {
                    if (this.LLD.LJZL != null) {
                        C74Z.LJIJI(this.LLFII, "replace");
                        C74Z.LJIIIZ(this.LLFII, "replace");
                    } else {
                        C74Z.LJIIIZ(this.LLFII, "add");
                    }
                    List<CommentImageModel> list = this.LLD.LJZL;
                    if (list != null && !list.isEmpty()) {
                        Y87.LIZ((CommentImageModel) ListProtector.get(list, 0));
                    }
                    if (!((ArrayList) LJIILIIL).isEmpty()) {
                        Y87.LJI((CommentImageModel) ListProtector.get(LJIILIIL, 0));
                    }
                    if (isViewValid() && (c176996x5 = this.LLD) != null) {
                        c176996x5.LJZL = LJIILIIL;
                    }
                }
                if (i == 10002) {
                    this.LJLLLL.post(new Q8V(3, this));
                }
            }
            this.LLD.LL = false;
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardShow(boolean z, String str, C177156xL c177156xL) {
        long j;
        this.LJLLLL.setVisibility(4);
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null) {
            interfaceC178496zV.onInternalEvent(new C50420Jqa(8));
        }
        InterfaceC178126yu interfaceC178126yu = this.LLF;
        if (interfaceC178126yu != null) {
            interfaceC178126yu.LIZ();
        }
        Nl(false, false, false);
        ViewGroup viewGroup = this.LJLLJ;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            if (getAweme() != null && getAweme().getStatistics() != null) {
                j = getAweme().getStatistics().getCommentCount();
            } else {
                j = 0;
            }
            C1793872g.LJII(this.LLFII, getAweme(), "", "bottom_comment_box", null, j, 1);
            if (getAweme() != null && C77321UWf.LIZLLL(getAweme(), false)) {
                List<CommentImageModel> list = this.LLD.LJZL;
                if (list == null || list.isEmpty()) {
                    C74Z.LJJIIJ(this.LLFII);
                }
            }
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        int i2;
        Context context = getContext();
        if (comment == null || context == null) {
            return;
        }
        if (V16.LJJIZ(comment)) {
            String awemeId = comment.getAwemeId();
            if (TextUtils.isEmpty(awemeId)) {
                awemeId = Gl();
            }
            C7HV c7hv = C7HV.LIZIZ;
            if (c7hv.LJIILJJIL().LJIIIZ(exc)) {
                c7hv.LJIILJJIL().LJII(awemeId, EnumC177746yI.PERMISSION_DENIED);
            } else if (C178296zB.LIZLLL(getContext(), exc, R.string.djs, false, false)) {
                c7hv.LJIILJJIL().LJII(awemeId, EnumC177746yI.DEFAULT);
            }
        } else if (comment.getPublishScenario() != 1) {
            C178296zB.LIZJ(context, exc, R.string.djs);
        }
        CommentListPageFragment Ml = Ml();
        if (Ml != null) {
            comment.setIgnoreToast(true);
            Ml.xk(exc, i, comment);
        }
        if (comment.getFakeGiftId() == 0) {
            return;
        }
        try {
            i2 = ((C38306F1q) exc).getErrorCode();
        } catch (Exception unused) {
            i2 = 0;
        }
        Jl(i2, comment, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LIZJ = C16970lZ.LIZJ(R.layout.pm, mo49getActivity(), viewGroup, false);
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(KL2.LJIIJJI(mo49getActivity()), -2);
            layoutParams.addRule(12);
            LIZJ.setLayoutParams(layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(KL2.LJIIJJI(mo49getActivity()), -2);
            layoutParams2.gravity = 80;
            LIZJ.setLayoutParams(layoutParams2);
        } else {
            LIZJ.setLayoutParams(new ViewGroup.LayoutParams(KL2.LJIIJJI(mo49getActivity()), -2));
        }
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJLIL = (ViewGroup) LIZJ.findViewById(R.id.coe);
        this.LJLILLLLZI = (ViewGroup) LIZJ.findViewById(R.id.bk6);
        this.LJLJI = (TuxTextView) LIZJ.findViewById(R.id.bjt);
        this.LJLJJI = LIZJ.findViewById(R.id.fi1);
        this.LJLJJL = (C224748ru) LIZJ.findViewById(R.id.bk7);
        this.LJLJJLL = (TuxIconView) LIZJ.findViewById(R.id.ey8);
        this.LJLJL = (TuxIconView) LIZJ.findViewById(R.id.f3r);
        this.LJLJLJ = (TuxIconView) LIZJ.findViewById(R.id.f2i);
        this.LJLJLLL = (TuxIconView) LIZJ.findViewById(R.id.f59);
        this.LJLL = (TuxIconView) LIZJ.findViewById(R.id.blk);
        this.LJLLI = (TuxTextView) LIZJ.findViewById(R.id.blf);
        this.LJLLILLLL = (ViewGroup) LIZJ.findViewById(R.id.bk5);
        this.LJLLJ = (ViewGroup) LIZJ.findViewById(R.id.emw);
        this.LJZL = new C177326xc(this.LJLLILLLL);
        this.LJZ = LIZJ.findViewById(R.id.sj);
        this.LJLLLL = LIZJ.findViewById(R.id.bs8);
        this.LJLLLLLL = LIZJ.findViewById(R.id.kyg);
        C187197Wh c187197Wh = new C187197Wh(mo49getActivity());
        this.LJZI = c187197Wh;
        c187197Wh.LJJ(new AF9());
        this.LJLLL = (FrameLayout) LIZJ.findViewById(R.id.bl3);
        this.LJZL.LJ(0, false);
        this.LJLZ = LIZJ.findViewById(R.id.ebo);
        try {
            ViewTreeLifecycleOwner.set(LIZJ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZJ, this);
            C10A.LIZIZ(LIZJ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZJ;
    }

    @Override // X.InterfaceC177046xA
    public final void onEmojiClick(String str, int i, int i2) {
        String authorUid;
        Aweme aweme = getAweme();
        String str2 = this.LLFII;
        String str3 = "";
        if (aweme == null) {
            authorUid = "";
        } else {
            str3 = aweme.getAid();
            authorUid = aweme.getAuthorUid();
        }
        C1793872g.LJ(str, str2, i, i2, str3, false, authorUid);
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishClick(int i, int i2, CharSequence charSequence, String str, String str2, boolean z, C177156xL c177156xL) {
        Aweme commentInputAweme;
        String num;
        CharSequence charSequence2 = charSequence;
        InterfaceC178496zV interfaceC178496zV = this.LL;
        if (interfaceC178496zV != null) {
            interfaceC178496zV.h5(i2);
        }
        c177156xL.LIZLLL = upvoteWhenComment();
        C178506zW c178506zW = this.LLFFF;
        if (c178506zW != null && c178506zW.LIZIZ()) {
            C178506zW c178506zW2 = this.LLFFF;
            Integer valueOf = Integer.valueOf(i2);
            InterfaceC178496zV interfaceC178496zV2 = c178506zW2.LJFF;
            if (interfaceC178496zV2 != null && (commentInputAweme = interfaceC178496zV2.getCommentInputAweme()) != null) {
                String str3 = "";
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                String str4 = c178506zW2.LJI;
                if (str4 == null) {
                    str4 = "";
                }
                if (valueOf != null && (num = valueOf.toString()) != null) {
                    str3 = num;
                }
                C74Z.LJJI(commentInputAweme, charSequence2, str4, "", null, null, null, str3, "click_quick_panel", i, null, c177156xL, -134219264);
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_recommendation", upvoteWhenComment());
            if (TextUtils.equals(str, "button_send")) {
                String charSequence3 = charSequence2.toString();
                InterfaceC178496zV interfaceC178496zV3 = this.LL;
                if (interfaceC178496zV3 != null) {
                    C50420Jqa c50420Jqa = new C50420Jqa(57, charSequence3);
                    c50420Jqa.LJLJI = bundle;
                    interfaceC178496zV3.onInternalEvent(c50420Jqa);
                }
            } else {
                String charSequence4 = charSequence2.toString();
                InterfaceC178496zV interfaceC178496zV4 = this.LL;
                if (interfaceC178496zV4 != null) {
                    C50420Jqa c50420Jqa2 = new C50420Jqa(11, charSequence4);
                    c50420Jqa2.LJLJI = bundle;
                    interfaceC178496zV4.onInternalEvent(c50420Jqa2);
                }
            }
        }
        Nl(false, true, false);
    }
}
