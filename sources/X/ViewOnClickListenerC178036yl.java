package X;

import Y.ARunnableS39S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.6yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC178036yl extends C70B implements GenericLifecycleObserver, InterfaceC174656tJ, InterfaceC177046xA, View.OnClickListener {
    public final Fragment LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public C174646tI LJLJJL;
    public C176996x5 LJLJJLL;
    public TuxIconView LJLJL;
    public Comment LJLJLJ;
    public Aweme LJLJLLL;
    public RecyclerView.ViewHolder LJLL;
    public EnumC178066yo LJLLI;
    public boolean LJLLILLLL;
    public InterfaceC88471Ynr<? super String, ? super String, C76800UCe> LJLLJ;
    public final java.util.Map<Integer, View> LJLLL = new LinkedHashMap();

    public final View LIZLLL(int i) {
        java.util.Map<Integer, View> map = this.LJLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC177046xA
    public final boolean checkCommentInputable() {
        return true;
    }

    @Override // X.InterfaceC177046xA
    public int getCommentInputViewType() {
        return 9;
    }

    @Override // X.InterfaceC177046xA
    public /* bridge */ /* synthetic */ String getEnterMethod() {
        return "";
    }

    @Override // X.InterfaceC177046xA
    public String getEventType() {
        return "notification_page";
    }

    public /* bridge */ /* synthetic */ Comment getForwardComment() {
        return null;
    }

    @Override // X.InterfaceC177046xA
    public /* bridge */ /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ boolean hasUpvoteOption() {
        return false;
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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy(lifecycleOwner);
        }
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onUpvotePublishProcessChanged(boolean z) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ boolean upvoteWhenComment() {
        return false;
    }

    @Override // X.InterfaceC177046xA
    public Comment getCommentInputReplyComment() {
        String str;
        String str2 = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get reply comment ");
        Comment comment = this.LJLJLJ;
        if (comment != null) {
            str = comment.getCid();
        } else {
            str = null;
        }
        LIZ.append(str);
        C71Y.LIZ(str2, X1D.LIZIZ(LIZ));
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC177046xA
    public Aweme getCommentInputAweme() {
        return this.LJLJLLL;
    }

    public final Fragment getFragment() {
        return this.LJLIL;
    }

    private final void setLikeStyle(EnumC178066yo enumC178066yo) {
        int i = C178056yn.LIZ[enumC178066yo.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    LIZLLL(R.id.iko).setVisibility(8);
                    return;
                }
                ((ImageView) LIZLLL(R.id.ikx)).setVisibility(0);
                LIZLLL(R.id.iky).setVisibility(0);
                View quick_like_icon = LIZLLL(R.id.ikx);
                o.LJIIIIZZ(quick_like_icon, "quick_like_icon");
                C26338AVi.LJI(quick_like_icon, 0, 0, Integer.valueOf(C45804HyK.LJJI(2)), 0, false, 16);
                View quick_like_icon2 = LIZLLL(R.id.ikx);
                o.LJIIIIZZ(quick_like_icon2, "quick_like_icon");
                g0.LJJIJIIJI(C45804HyK.LJJI(14), C45804HyK.LJJI(14), quick_like_icon2);
                View quick_like_box = LIZLLL(R.id.ikw);
                o.LJIIIIZZ(quick_like_box, "quick_like_box");
                C26338AVi.LJIIIZ(quick_like_box, Integer.valueOf(C45804HyK.LJJI(5)), Integer.valueOf(C45804HyK.LJJI(0)), Integer.valueOf(C45804HyK.LJJI(6)), Integer.valueOf(C45804HyK.LJJI(0)), 16);
                View quick_like_box2 = LIZLLL(R.id.ikw);
                o.LJIIIIZZ(quick_like_box2, "quick_like_box");
                C78886Uxe.LJJLIIIJ(C45804HyK.LJJI(22), quick_like_box2);
                return;
            }
            ((ImageView) LIZLLL(R.id.ikx)).setVisibility(0);
            LIZLLL(R.id.iky).setVisibility(8);
            View quick_like_icon3 = LIZLLL(R.id.ikx);
            o.LJIIIIZZ(quick_like_icon3, "quick_like_icon");
            C26338AVi.LJI(quick_like_icon3, 0, 0, 0, 0, false, 16);
            View quick_like_icon4 = LIZLLL(R.id.ikx);
            o.LJIIIIZZ(quick_like_icon4, "quick_like_icon");
            g0.LJJIJIIJI(C45804HyK.LJJI(14), C45804HyK.LJJI(14), quick_like_icon4);
            View quick_like_box3 = LIZLLL(R.id.ikw);
            o.LJIIIIZZ(quick_like_box3, "quick_like_box");
            C26338AVi.LJIIIZ(quick_like_box3, Integer.valueOf(C45804HyK.LJJI(6)), Integer.valueOf(C45804HyK.LJJI(0)), Integer.valueOf(C45804HyK.LJJI(6)), Integer.valueOf(C45804HyK.LJJI(0)), 16);
            View quick_like_box4 = LIZLLL(R.id.ikw);
            o.LJIIIIZZ(quick_like_box4, "quick_like_box");
            C78886Uxe.LJJLIIIJ(C45804HyK.LJJI(22), quick_like_box4);
            return;
        }
        ((ImageView) LIZLLL(R.id.ikx)).setVisibility(0);
        LIZLLL(R.id.iky).setVisibility(0);
        View quick_like_icon5 = LIZLLL(R.id.ikx);
        o.LJIIIIZZ(quick_like_icon5, "quick_like_icon");
        C26338AVi.LJI(quick_like_icon5, 0, 0, Integer.valueOf(C45804HyK.LJJI(2)), 0, false, 16);
        View quick_like_icon6 = LIZLLL(R.id.ikx);
        o.LJIIIIZZ(quick_like_icon6, "quick_like_icon");
        g0.LJJIJIIJI(C45804HyK.LJJI(13), C45804HyK.LJJI(13), quick_like_icon6);
        View quick_like_box5 = LIZLLL(R.id.ikw);
        o.LJIIIIZZ(quick_like_box5, "quick_like_box");
        C26338AVi.LJIIIZ(quick_like_box5, Integer.valueOf(C45804HyK.LJJI(5)), Integer.valueOf(C45804HyK.LJJI(0)), Integer.valueOf(C45804HyK.LJJI(6)), Integer.valueOf(C45804HyK.LJJI(0)), 16);
        View quick_like_box6 = LIZLLL(R.id.ikw);
        o.LJIIIIZZ(quick_like_box6, "quick_like_box");
        C78886Uxe.LJJLIIIJ(C45804HyK.LJJI(22), quick_like_box6);
    }

    @Override // X.C70B
    public final void LIZIZ(String str) {
        String str2;
        String str3;
        Comment comment = this.LJLJLJ;
        if (comment != null) {
            str2 = comment.getNoticeRepliedCid();
        } else {
            str2 = null;
        }
        if (C78857UxB.LJJJIL(str2)) {
            str3 = "view_reply";
        } else {
            str3 = "reply";
        }
        C178046ym.LIZ(str, str3);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("position", str);
        FMX.LJIIL("show_like_comment_button", c188727au.LIZ);
        this.LJLJJI = str;
    }

    @Override // X.C70B
    public final void LIZJ(InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LJLLJ = interfaceC88471Ynr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0111. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Comment comment;
        String str;
        C176426wA c176426wA;
        Activity activity;
        String str2;
        C176996x5 c176996x5;
        User user;
        Fragment fragment;
        Story story;
        String noticeRepliedCid;
        if (view == null) {
            return;
        }
        int id = view.getId();
        boolean z = true;
        boolean z2 = false;
        int i = R.string.dkt;
        String str3 = null;
        if (id == R.id.iw2) {
            Comment comment2 = this.LJLJLJ;
            if (comment2 != null) {
                str2 = comment2.getNoticeRepliedCid();
            } else {
                str2 = null;
            }
            if (C78857UxB.LJJJIL(str2) && ((Boolean) C53288Kvk.LIZJ.getValue()).booleanValue()) {
                InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr = this.LJLLJ;
                if (interfaceC88471Ynr != null) {
                    Aweme aweme = this.LJLJLLL;
                    if (aweme != null) {
                        str3 = aweme.getAid();
                    }
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    Comment comment3 = this.LJLJLJ;
                    if (comment3 != null && (noticeRepliedCid = comment3.getNoticeRepliedCid()) != null) {
                        str4 = noticeRepliedCid;
                    }
                    interfaceC88471Ynr.invoke(str3, str4);
                }
                FMX.LJIIL("click_view_reply", CK3.LIZ("enter_from", "notification_page").LIZ);
                return;
            }
            if (this.LJLLILLLL) {
                return;
            }
            if (getContext() != null && (fragment = this.LJLIL) != null) {
                if (fragment.mo49getActivity() != null && ((RBX) HG3.LJIILL()).isLogin()) {
                    Aweme aweme2 = this.LJLJLLL;
                    if (aweme2 != null && C54838Lfe.LJJI(aweme2) && (story = aweme2.getStory()) != null && System.currentTimeMillis() > story.getExpiredAt()) {
                        C26045AKb c26045AKb = new C26045AKb(this);
                        c26045AKb.LJIIIIZZ(R.string.rru);
                        c26045AKb.LJIIJ();
                    } else {
                        Aweme aweme3 = this.LJLJLLL;
                        Comment comment4 = this.LJLJLJ;
                        Fragment context = this.LJLIL;
                        o.LJIIIZ(context, "context");
                        if (aweme3 != null && comment4 != null) {
                            if (C45804HyK.LJJJ(aweme3) || !C45804HyK.LJIIIIZZ(aweme3)) {
                                C31811Ce7.LIZJ(context, R.string.dkt);
                            } else {
                                switch (C178416zN.LIZ[C178406zM.LIZJ(aweme3).ordinal()]) {
                                    case 1:
                                        C26045AKb c26045AKb2 = new C26045AKb(context);
                                        c26045AKb2.LJIIIZ(C63081OpJ.LJJIL(R.string.tob, aweme3));
                                        c26045AKb2.LJIIJ();
                                        break;
                                    case 2:
                                    case 3:
                                        if (aweme3.isImage()) {
                                            C31811Ce7.LIZJ(context, R.string.h_y);
                                            break;
                                        } else {
                                            C31811Ce7.LIZJ(context, R.string.tob);
                                            break;
                                        }
                                    case 4:
                                        C31811Ce7.LIZJ(context, R.string.pbf);
                                        break;
                                    case 5:
                                        C31811Ce7.LIZJ(context, R.string.txs);
                                        break;
                                    case 6:
                                        C31811Ce7.LIZJ(context, R.string.txs);
                                        break;
                                    case 7:
                                        C5S1 c5s1 = new C5S1(context.getContext());
                                        c5s1.LIZJ(R.string.dkl);
                                        c5s1.LJ();
                                        break;
                                    case 8:
                                        C31811Ce7.LIZJ(context, R.string.dkl);
                                        break;
                                    case 9:
                                        C26045AKb c26045AKb3 = new C26045AKb(context);
                                        if (AV1.LJIJI(aweme3.getAuthorUid())) {
                                            i = R.string.dks;
                                        }
                                        c26045AKb3.LJIIIIZZ(i);
                                        c26045AKb3.LJIIJ();
                                        break;
                                    case 10:
                                        C31811Ce7.LIZJ(context, R.string.cg5);
                                        break;
                                }
                                z2 = z;
                            }
                        }
                    }
                }
                String str5 = this.LJLILLLLZI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onClick reply checkCanComment=");
                LIZ.append(z2);
                C71Y.LIZLLL(str5, X1D.LIZIZ(LIZ));
                if (z2 || (c176996x5 = this.LJLJJLL) == null) {
                    return;
                }
                Comment comment5 = this.LJLJLJ;
                if (comment5 != null) {
                    user = comment5.getUser();
                } else {
                    user = null;
                }
                c176996x5.LJJLIIIIJ(null, user, "inbox_reply_box");
                return;
            }
            z = false;
            z2 = z;
            String str52 = this.LJLILLLLZI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onClick reply checkCanComment=");
            LIZ2.append(z2);
            C71Y.LIZLLL(str52, X1D.LIZIZ(LIZ2));
            if (z2) {
                return;
            } else {
                return;
            }
        }
        if (id != R.id.fr1 || (comment = this.LJLJLJ) == null) {
            return;
        }
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            if (C45804HyK.LJJJ(this.LJLJLLL)) {
                C26045AKb c26045AKb4 = new C26045AKb(this);
                c26045AKb4.LJIIIIZZ(R.string.dkt);
                c26045AKb4.LJIIJ();
                return;
            }
            if (C78949Uyf.LJIIJ(comment)) {
                boolean z3 = !comment.isUserDigged();
                this.LJLJI = z3;
                LJ(z3, true);
            }
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                Context context2 = getContext();
                if (context2 != null) {
                    activity = C78949Uyf.LJIILL(context2);
                } else {
                    activity = null;
                }
                J9P.LIZIZ(activity, getEventType(), "like_comment", null, null);
                return;
            }
            if (comment.getUserDigged() == 0) {
                str = "1";
            } else {
                str = "2";
            }
            C174646tI c174646tI = this.LJLJJL;
            if (c174646tI == null || !c174646tI.LJIL()) {
                return;
            }
            C174646tI c174646tI2 = this.LJLJJL;
            if (c174646tI2 != null) {
                c174646tI2.LJIILL(comment.getCid(), comment.getAwemeId(), str, "inbox_page");
            }
            C174646tI c174646tI3 = this.LJLJJL;
            if (c174646tI3 == null || (c176426wA = (C176426wA) c174646tI3.LJLIL) == null) {
                return;
            }
            c176426wA.LJLJJL = comment;
            return;
        }
        C26045AKb c26045AKb5 = new C26045AKb(this);
        c26045AKb5.LJIIIIZZ(R.string.img);
        c26045AKb5.LJIIJ();
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishStart(Comment comment) {
        this.LJLLILLLL = true;
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishSuccess(Comment comment) {
        String str;
        Aweme commentInputAweme;
        String str2;
        Comment comment2;
        String str3;
        this.LJLLILLLL = false;
        String str4 = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCommentInputPublishSuccess comment:");
        String str5 = null;
        if (comment != null) {
            str = comment.getCid();
        } else {
            str = null;
        }
        LIZ.append(str);
        C71Y.LIZ(str4, X1D.LIZIZ(LIZ));
        if ((comment == null || (str2 = comment.getAwemeId()) == null) && ((commentInputAweme = getCommentInputAweme()) == null || (str2 = commentInputAweme.getAid()) == null)) {
            str2 = "";
        }
        C5S1 c5s1 = new C5S1(getContext());
        c5s1.LIZJ(R.string.dl4);
        c5s1.LJ();
        Object[] objArr = new Object[2];
        objArr[0] = str2;
        if (comment != null) {
            comment2 = comment.m103clone();
        } else {
            comment2 = null;
        }
        objArr[1] = comment2;
        C174046sK c174046sK = new C174046sK(3, objArr);
        c174046sK.LIZ(hashCode());
        C2U8.LIZ(c174046sK);
        Comment comment3 = this.LJLJLJ;
        if (comment3 != null) {
            str3 = comment3.getCid();
        } else {
            str3 = null;
        }
        if (comment != null) {
            str5 = comment.getCid();
        }
        C2U8.LIZ(new C174546t8(true, str3, str5));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C42625Go9.LIZIZ(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C42625Go9.LIZJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDiggChangeEventReceive(C174396st c174396st) {
        String str;
        if (c174396st == null) {
            return;
        }
        String str2 = c174396st.LJLIL;
        int i = c174396st.LJLILLLLZI;
        Comment comment = this.LJLJLJ;
        if (comment != null) {
            String str3 = null;
            if (o.LJ(comment.getCid(), str2)) {
                String str4 = this.LJLILLLLZI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateDiggState, comment:");
                LIZ.append(comment);
                LIZ.append(", is digg: ");
                LIZ.append(i);
                C71Y.LIZ(str4, X1D.LIZIZ(LIZ));
                comment.setUserDigged(i);
                if (this.LJLJI != comment.isUserDigged()) {
                    boolean isUserDigged = comment.isUserDigged();
                    this.LJLJI = isUserDigged;
                    LJ(isUserDigged, true);
                }
                Comment comment2 = this.LJLJLJ;
                if (comment2 != null) {
                    str3 = comment2.getCid();
                }
                Comment comment3 = this.LJLJLJ;
                if (comment3 == null || (str = comment3.getNoticeRepliedCid()) == null) {
                    str = "";
                }
                C178046ym.LIZIZ(i, str3, str);
            }
        }
    }

    @QD3
    public final void onReplyChangeEvent(C174546t8 event) {
        String str;
        o.LJIIIZ(event, "event");
        if (!((Boolean) C53288Kvk.LIZJ.getValue()).booleanValue()) {
            return;
        }
        int i = 0;
        String str2 = null;
        if (event.LJLIL) {
            String str3 = event.LJLILLLLZI;
            if (str3 == null || event.LJLJI == null) {
                return;
            }
            Comment comment = this.LJLJLJ;
            if (comment != null) {
                str = comment.getCid();
            } else {
                str = null;
            }
            if (o.LJ(str3, str)) {
                Comment comment2 = this.LJLJLJ;
                if (comment2 != null) {
                    comment2.setNoticeRepliedCid(event.LJLJI);
                }
                LJFF(true, this.LJLLI);
                Comment comment3 = this.LJLJLJ;
                if (comment3 != null) {
                    str2 = comment3.getCid();
                }
                String str4 = event.LJLJI;
                Comment comment4 = this.LJLJLJ;
                if (comment4 != null) {
                    i = comment4.getUserDigged();
                }
                C178046ym.LIZIZ(i, str2, str4);
                C178046ym.LIZ(this.LJLJJI, "view_reply");
                return;
            }
            return;
        }
        String str5 = event.LJLJI;
        Comment comment5 = this.LJLJLJ;
        if (comment5 != null) {
            str2 = comment5.getNoticeRepliedCid();
        }
        if (o.LJ(str5, str2)) {
            Comment comment6 = this.LJLJLJ;
            if (comment6 != null) {
                comment6.setNoticeRepliedCid("");
            }
            LJFF(false, this.LJLLI);
        }
    }

    @Override // X.InterfaceC174656tJ
    public final void vp0(Object... objArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        C71Y.LIZ(this.LJLILLLLZI, "onDiggSuccess ");
        Comment comment = this.LJLJLJ;
        if (comment != null && objArr.length > 1) {
            Object obj = objArr[1];
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            String str7 = (String) obj;
            comment.setUserDigged(TextUtils.equals(str7, "1") ? 1 : 0);
            Aweme aweme = this.LJLJLLL;
            Comment comment2 = this.LJLJLJ;
            if (aweme != null && comment2 != null) {
                User user = comment2.getUser();
                if (user != null) {
                    str4 = user.getUid();
                } else {
                    str4 = null;
                }
                boolean equals = TextUtils.equals(str4, aweme.getAuthorUid());
                HashMap hashMap = new HashMap();
                hashMap.put("has_title", Integer.valueOf(C227768wm.LIZ(aweme)));
                int LJFF = C222578oP.LJFF(comment2.getUser());
                String cid = comment2.getCid();
                User user2 = comment2.getUser();
                if (user2 != null) {
                    str5 = user2.getUid();
                } else {
                    str5 = null;
                }
                int i2 = 1 ^ (equals ? 1 : 0);
                String predictedAgeGroup = ((RBX) HG3.LJIILL()).getCurUser().getPredictedAgeGroup();
                User user3 = comment2.getUser();
                if (user3 != null) {
                    str6 = user3.getPredictedAgeGroup();
                } else {
                    str6 = null;
                }
                String text = comment2.getText();
                if (text != null) {
                    i = text.length();
                } else {
                    i = 0;
                }
                C1793872g.LJIIIIZZ("notification_page", "inbox_like_box", aweme, cid, true, str5, false, str7, LJFF, "", CardStruct.IStatusCode.DEFAULT, i2, "", predictedAgeGroup, str6, hashMap, "", i, comment2.getIsPhotoContained());
            }
            String cid2 = comment.getCid();
            o.LJIIIIZZ(cid2, "it.cid");
            C2U8.LIZ(new C174396st(cid2, comment.getUserDigged(), "inbox"));
            Comment comment3 = this.LJLJLJ;
            if (comment3 != null) {
                str = comment3.getCid();
            } else {
                str = null;
            }
            Comment comment4 = this.LJLJLJ;
            if (comment4 == null || (str2 = comment4.getNoticeRepliedCid()) == null) {
                str2 = "";
            }
            C178046ym.LIZIZ(comment.getUserDigged(), str, str2);
            Aweme aweme2 = this.LJLJLLL;
            if (aweme2 != null) {
                str3 = aweme2.getAid();
            } else {
                str3 = null;
            }
            C1800774x.LIZ(str3, null);
        }
    }

    public ViewOnClickListenerC178036yl(Context context, Fragment fragment) {
        super(context, null, 0);
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        this.LJLIL = fragment;
        this.LJLILLLLZI = "quick_comment_like";
        this.LJLLI = EnumC178066yo.TYPE_NONE;
        FrameLayout.inflate(getContext(), R.layout.qv, this);
        this.LJLJL = (TuxIconView) findViewById(R.id.ikx);
        View LIZLLL = LIZLLL(R.id.il5);
        C110614Vt c110614Vt = new C110614Vt();
        Integer valueOf = Integer.valueOf(R.attr.cf);
        c110614Vt.LIZIZ = valueOf;
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(36));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        LIZLLL.setBackground(c110614Vt.LIZ(context2));
        C16880lQ.LJIILJJIL((FrameLayout) LIZLLL(R.id.iw2), this);
        View LIZLLL2 = LIZLLL(R.id.ikw);
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = valueOf;
        c110614Vt2.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(36));
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        LIZLLL2.setBackground(c110614Vt2.LIZ(context3));
        C16880lQ.LJIILJJIL((FrameLayout) LIZLLL(R.id.fr1), this);
        Object context4 = getContext();
        if ((context4 instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context4) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    public final void LJ(boolean z, boolean z2) {
        TuxIconView tuxIconView;
        if (z2 && (tuxIconView = this.LJLJL) != null) {
            tuxIconView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80L).withEndAction(new ARunnableS39S0100000_3(tuxIconView, 31)).start();
        }
        if (z) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_heart_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.eb);
            TuxIconView tuxIconView2 = this.LJLJL;
            if (tuxIconView2 != null) {
                tuxIconView2.setTuxIcon(c2068389v);
                return;
            }
            return;
        }
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_heart;
        c2068389v2.LJ = Integer.valueOf(R.attr.gp);
        TuxIconView tuxIconView3 = this.LJLJL;
        if (tuxIconView3 == null) {
            return;
        }
        tuxIconView3.setTuxIcon(c2068389v2);
    }

    public final void LJFF(boolean z, EnumC178066yo enumC178066yo) {
        if (enumC178066yo == EnumC178066yo.TYPE_NONE) {
            LIZLLL(R.id.iko).setVisibility(8);
            return;
        }
        if (z && ((Boolean) C53288Kvk.LIZJ.getValue()).booleanValue()) {
            ((ImageView) LIZLLL(R.id.il8)).setVisibility(8);
            ((ImageView) LIZLLL(R.id.il4)).setVisibility(8);
            LIZLLL(R.id.il9).setVisibility(0);
            ((TextView) LIZLLL(R.id.il9)).setText(getContext().getString(R.string.pry));
            View quick_reply_text = LIZLLL(R.id.il9);
            o.LJIIIIZZ(quick_reply_text, "quick_reply_text");
            C26338AVi.LJI(quick_reply_text, 0, 0, 0, 0, false, 16);
            View quick_reply_box = LIZLLL(R.id.il5);
            o.LJIIIIZZ(quick_reply_box, "quick_reply_box");
            float f = (float) 2.5d;
            C26338AVi.LJIIIZ(quick_reply_box, Integer.valueOf(C45804HyK.LJJI(8)), Integer.valueOf(O6R.LJJIIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()))), Integer.valueOf(C45804HyK.LJJI(8)), Integer.valueOf(O6R.LJJIIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()))), 16);
            return;
        }
        if (enumC178066yo == EnumC178066yo.TYPE_V1) {
            ((ImageView) LIZLLL(R.id.il8)).setVisibility(0);
            ((ImageView) LIZLLL(R.id.il4)).setVisibility(8);
            LIZLLL(R.id.il9).setVisibility(0);
            ((TextView) LIZLLL(R.id.il9)).setText(getContext().getString(R.string.prx));
            View quick_reply_text2 = LIZLLL(R.id.il9);
            o.LJIIIIZZ(quick_reply_text2, "quick_reply_text");
            C26338AVi.LJI(quick_reply_text2, Integer.valueOf(C45804HyK.LJJI(2)), 0, 0, 0, false, 16);
            View quick_reply_box2 = LIZLLL(R.id.il5);
            o.LJIIIIZZ(quick_reply_box2, "quick_reply_box");
            C26338AVi.LJIIIZ(quick_reply_box2, Integer.valueOf(C45804HyK.LJJI(5)), Integer.valueOf(C45804HyK.LJJI(0)), Integer.valueOf(C45804HyK.LJJI(6)), Integer.valueOf(C45804HyK.LJJI(0)), 16);
            View quick_reply_box3 = LIZLLL(R.id.il5);
            o.LJIIIIZZ(quick_reply_box3, "quick_reply_box");
            C78886Uxe.LJJLIIIJ(C45804HyK.LJJI(22), quick_reply_box3);
            return;
        }
        if (enumC178066yo != EnumC178066yo.TYPE_V2 && enumC178066yo != EnumC178066yo.TYPE_V3) {
            return;
        }
        ((ImageView) LIZLLL(R.id.il8)).setVisibility(8);
        ((ImageView) LIZLLL(R.id.il4)).setVisibility(0);
        LIZLLL(R.id.il9).setVisibility(0);
        ((TextView) LIZLLL(R.id.il9)).setText(getContext().getString(R.string.prx));
        HG3.LJIIL();
        W5F LJII = W5U.LJII(C78939UyV.LJ(HG3.LJLJL.LJFF().getCurUser().getAvatarThumb()));
        LJII.LJIILIIL(J7H.LIZ(100));
        int LJJI = C45804HyK.LJJI(18);
        int LJJI2 = C45804HyK.LJJI(18);
        LJII.LJII = LJJI;
        LJII.LJIIIIZZ = LJJI2;
        LJII.LJJIJIIJIL = true;
        LJII.LIZIZ(this.LJLILLLLZI);
        LJII.LJJIIJ = (SmartImageView) LIZLLL(R.id.il4);
        LJII.LJ();
        View quick_reply_text3 = LIZLLL(R.id.il9);
        o.LJIIIIZZ(quick_reply_text3, "quick_reply_text");
        C26338AVi.LJI(quick_reply_text3, Integer.valueOf(C45804HyK.LJJI(4)), 0, 0, 0, false, 16);
        View quick_reply_box4 = LIZLLL(R.id.il5);
        o.LJIIIIZZ(quick_reply_box4, "quick_reply_box");
        C26338AVi.LJIIIZ(quick_reply_box4, Integer.valueOf(C45804HyK.LJJI(2)), Integer.valueOf(C45804HyK.LJJI(0)), Integer.valueOf(C45804HyK.LJJI(6)), Integer.valueOf(C45804HyK.LJJI(0)), 16);
        View quick_reply_box5 = LIZLLL(R.id.il5);
        o.LJIIIIZZ(quick_reply_box5, "quick_reply_box");
        C78886Uxe.LJJLIIIJ(C45804HyK.LJJI(22), quick_reply_box5);
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardDismiss(boolean z, C177156xL c177156xL) {
        InterfaceC178086yq interfaceC178086yq;
        InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
        if ((interfaceC36571c5 instanceof InterfaceC178086yq) && (interfaceC178086yq = (InterfaceC178086yq) interfaceC36571c5) != null) {
            interfaceC178086yq.Ha(this.LJLL, false);
        }
    }

    @Override // X.InterfaceC174656tJ
    public final void PB(String str, String str2, Exception exc) {
        if (exc != null) {
            String str3 = this.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onDiggFailed cid:");
            LIZ.append(str);
            LIZ.append(" diggType:");
            LIZ.append(str2);
            LIZ.append(' ');
            C71Y.LIZJ(str3, X1D.LIZIZ(LIZ), exc);
        }
        Comment comment = this.LJLJLJ;
        if (comment != null) {
            o.LJ(comment.getCid(), str);
        }
        boolean z = !this.LJLJI;
        this.LJLJI = z;
        LJ(z, true);
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardShow(boolean z, String str, C177156xL c177156xL) {
        InterfaceC178086yq interfaceC178086yq;
        C1793872g.LJII("notification_page", this.LJLJLLL, C1793872g.LIZLLL(this.LJLJLJ), str, c177156xL, 0L, 1);
        InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
        if ((interfaceC36571c5 instanceof InterfaceC178086yq) && (interfaceC178086yq = (InterfaceC178086yq) interfaceC36571c5) != null) {
            interfaceC178086yq.Ha(this.LJLL, true);
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        this.LJLLILLLL = false;
        if (exc != null && comment != null) {
            C178296zB.LJ(getContext(), exc, R.string.dlw, 24);
            String str = this.LJLILLLLZI;
            StringBuilder LJ = C7MY.LJ("onCommentInputPublishFailed requestType:", i, " comment:");
            LJ.append(comment.getCid());
            LJ.append(' ');
            C71Y.LIZJ(str, X1D.LIZIZ(LJ), exc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    @Override // X.C70B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.comment.model.Comment r5, com.ss.android.ugc.aweme.feed.model.Aweme r6, X.EnumC178066yo r7, androidx.recyclerview.widget.RecyclerView.ViewHolder r8) {
        /*
            r4 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r2 = r4.LJLILLLLZI
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "bind data. comment: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", isDigg: "
            r1.append(r0)
            r3 = 0
            if (r5 == 0) goto Lba
            int r0 = r5.getUserDigged()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C71Y.LIZ(r2, r0)
            r4.LJLJLJ = r5
            r4.LJLJLLL = r6
            r4.LJLL = r8
            r4.LJLLI = r7
            if (r5 == 0) goto L3e
            java.lang.String r1 = r5.getCid()
            if (r1 != 0) goto Lad
        L3e:
            r0 = r3
        L3f:
            r1 = r3
        L40:
            boolean r1 = X.C78857UxB.LJJJIL(r1)
            if (r1 == 0) goto L4a
            com.ss.android.ugc.aweme.comment.model.Comment r2 = r4.LJLJLJ
            if (r2 != 0) goto La1
        L4a:
            if (r0 == 0) goto L5a
            int r0 = r0.LJLILLLLZI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r4.LJLJLJ
            if (r0 != 0) goto L9d
        L5a:
            X.6tI r0 = new X.6tI
            r0.<init>()
            r4.LJLJJL = r0
            X.6x5 r1 = new X.6x5
            androidx.fragment.app.Fragment r0 = r4.LJLIL
            r1.<init>(r0, r4)
            r4.LJLJJLL = r1
            X.6tI r1 = r4.LJLJJL
            if (r1 == 0) goto L78
            r1.LJLILLLLZI = r4
            X.6wA r0 = new X.6wA
            r0.<init>()
            r1.LJJ(r0)
        L78:
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r4.LJLJLJ
            if (r0 == 0) goto L86
            boolean r1 = r0.isUserDigged()
            r4.LJLJI = r1
            r0 = 0
            r4.LJ(r1, r0)
        L86:
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r4.LJLJLJ
            if (r0 == 0) goto L8e
            java.lang.String r3 = r0.getNoticeRepliedCid()
        L8e:
            boolean r1 = X.C78857UxB.LJJJIL(r3)
            X.6yo r0 = r4.LJLLI
            r4.LJFF(r1, r0)
            X.6yo r0 = r4.LJLLI
            r4.setLikeStyle(r0)
            return
        L9d:
            r0.setUserDigged(r1)
            goto L5a
        La1:
            if (r0 == 0) goto La7
            java.lang.String r1 = r0.LJLIL
            if (r1 != 0) goto La9
        La7:
            java.lang.String r1 = ""
        La9:
            r2.setNoticeRepliedCid(r1)
            goto L4a
        Lad:
            X.EAd<java.lang.String, X.6t1> r0 = X.C178046ym.LIZ
            java.lang.Object r0 = r0.LIZIZ(r1)
            X.6t1 r0 = (X.C174476t1) r0
            if (r0 == 0) goto L3f
            java.lang.String r1 = r0.LJLIL
            goto L40
        Lba:
            r0 = r3
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC178036yl.LIZ(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.feed.model.Aweme, X.6yo, androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC177046xA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCommentInputPublishClick(int r33, int r34, java.lang.CharSequence r35, java.lang.String r36, java.lang.String r37, boolean r38, X.C177156xL r39) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC178036yl.onCommentInputPublishClick(int, int, java.lang.CharSequence, java.lang.String, java.lang.String, boolean, X.6xL):void");
    }
}
