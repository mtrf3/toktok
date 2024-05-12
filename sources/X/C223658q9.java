package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import defpackage.m0;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.8q9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223658q9 extends AbstractC224038ql {
    public final InterfaceC223648q8 LJLLI;
    public View LJLLILLLL;
    public final C223668qA LJLLJ;

    @Override // X.Y1I
    public final void LJJII() {
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
    }

    @Override // X.Y1E
    public final int getStickerType() {
        return 4;
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.LJLILLLLZI);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.LJLILLLLZI, null, 6, 0);
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, this.LJLILLLLZI));
        tuxTextView.setTuxFont(62);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.LJLILLLLZI.getString(R.string.dm3));
        C116474hf c116474hf = new C116474hf(this.LJLILLLLZI, null);
        c116474hf.setImageResource(R.drawable.bvr);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(c116474hf);
        return linearLayout;
    }

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        Long l;
        VideoReplyStruct videoReplyStruct;
        VideoReplyStruct videoReplyStruct2;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        C188727au c188727au = new C188727au();
        C245649kW c245649kW = this.LJLJJI;
        VideoReplyStruct videoReplyStruct3 = null;
        if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
            str = c223778qL4.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
            str2 = c223778qL3.LIZIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
            str3 = c223778qL2.LIZLLL;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_pb", str3);
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
            str4 = c223778qL.LIZ;
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("enter_from", str4);
        C245649kW c245649kW5 = this.LJLJJI;
        if (c245649kW5 != null && (videoReplyStruct2 = c245649kW5.LJIJ) != null && videoReplyStruct2.getCommentId() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str8 = "";
        if (z) {
            str5 = "";
        } else {
            C245649kW c245649kW6 = this.LJLJJI;
            if (c245649kW6 != null && (videoReplyStruct = c245649kW6.LJIJ) != null) {
                l = Long.valueOf(videoReplyStruct.getCommentId());
            } else {
                l = null;
            }
            str5 = String.valueOf(l);
        }
        c188727au.LJIIIZ("reply_comment_id", str5);
        C245649kW c245649kW7 = this.LJLJJI;
        if (c245649kW7 != null && (str7 = c245649kW7.LJIJI) != null) {
            str8 = str7;
        }
        c188727au.LJIIIZ("reply_user_id", str8);
        c188727au.LJIIIZ("sticker_type", "comment_reply");
        if (C223678qB.LIZ) {
            C245649kW c245649kW8 = this.LJLJJI;
            if (c245649kW8 != null) {
                videoReplyStruct3 = c245649kW8.LJIJ;
            }
            if (LJJIIJ(videoReplyStruct3)) {
                str6 = "both";
                c188727au.LJIIIZ("options_show", str6);
                FMX.LJIIL("sticker_click", c188727au.LIZ);
            }
        }
        str6 = "see_comment";
        c188727au.LJIIIZ("options_show", str6);
        FMX.LJIIL("sticker_click", c188727au.LIZ);
    }

    @Override // X.AbstractC224038ql
    public final void LJIJJ() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        VideoReplyStruct videoReplyStruct;
        String str7;
        String str8;
        String str9;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        String str10;
        Long l;
        VideoReplyStruct videoReplyStruct2;
        VideoReplyStruct videoReplyStruct3;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        C223778qL c223778qL5;
        C223778qL c223778qL6;
        C188727au c188727au = new C188727au();
        C245649kW c245649kW = this.LJLJJI;
        String str11 = null;
        if (c245649kW != null && (c223778qL6 = c245649kW.LJIIZILJ) != null) {
            str = c223778qL6.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL5 = c245649kW2.LJIIZILJ) != null) {
            str2 = c223778qL5.LIZIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL4 = c245649kW3.LJIIZILJ) != null) {
            str3 = c223778qL4.LIZLLL;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_pb", str3);
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null && (c223778qL3 = c245649kW4.LJIIZILJ) != null) {
            str4 = c223778qL3.LIZ;
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("enter_from", str4);
        C245649kW c245649kW5 = this.LJLJJI;
        boolean z2 = true;
        if (c245649kW5 != null && (videoReplyStruct3 = c245649kW5.LJIJ) != null && videoReplyStruct3.getCommentId() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str12 = "";
        if (z) {
            str5 = "";
        } else {
            C245649kW c245649kW6 = this.LJLJJI;
            if (c245649kW6 != null && (videoReplyStruct2 = c245649kW6.LJIJ) != null) {
                l = Long.valueOf(videoReplyStruct2.getCommentId());
            } else {
                l = null;
            }
            str5 = String.valueOf(l);
        }
        c188727au.LJIIIZ("reply_comment_id", str5);
        c188727au.LJIIIZ("to_group_id", LJJ());
        C245649kW c245649kW7 = this.LJLJJI;
        if (c245649kW7 == null || (str6 = c245649kW7.LJIJI) == null) {
            str6 = "";
        }
        c188727au.LJIIIZ("reply_user_id", str6);
        c188727au.LJIIIZ("target", "see_comments");
        c188727au.LJIIIZ("sticker_type", "comment_reply");
        FMX.LJIIL("sticker_toast_click", c188727au.LIZ);
        C245649kW c245649kW8 = this.LJLJJI;
        if (c245649kW8 == null || c245649kW8.LJIJ == null) {
            LJJI(false);
            return;
        }
        if (c245649kW8 != null) {
            videoReplyStruct = c245649kW8.LJIJ;
        } else {
            videoReplyStruct = null;
        }
        o.LJI(videoReplyStruct);
        if (videoReplyStruct.getAwemeId() == 0) {
            str7 = "";
        } else {
            str7 = String.valueOf(videoReplyStruct.getAwemeId());
        }
        if (videoReplyStruct.getCommentId() == 0) {
            str8 = "";
        } else {
            str8 = String.valueOf(videoReplyStruct.getCommentId());
        }
        if (videoReplyStruct.getAliasCommentId() == 0) {
            str9 = "";
        } else {
            str9 = String.valueOf(videoReplyStruct.getAliasCommentId());
        }
        SmartRoute LIZ = m0.LIZ(this.LJLILLLLZI, "aweme://aweme/detail/", "id", str7, "refer", "click_comment_bubble");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str8);
        LIZ2.append(',');
        LIZ2.append(str9);
        LIZ.withParam("cid", X1D.LIZIZ(LIZ2));
        C245649kW c245649kW9 = this.LJLJJI;
        if (c245649kW9 != null && (c223778qL2 = c245649kW9.LJIIZILJ) != null && (str10 = c223778qL2.LIZ) != null) {
            str12 = str10;
        }
        LIZ.withParam("video_from", str12);
        C245649kW c245649kW10 = this.LJLJJI;
        if (c245649kW10 != null && (c223778qL = c245649kW10.LJIIZILJ) != null) {
            str11 = c223778qL.LIZJ;
        }
        LIZ.withParam("last_group_id", str11);
        LIZ.open();
        if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(str8)) {
            z2 = false;
        }
        LJJI(z2);
    }

    public final String LJJ() {
        VideoReplyStruct videoReplyStruct;
        C245649kW c245649kW = this.LJLJJI;
        if (c245649kW == null || (videoReplyStruct = c245649kW.LJIJ) == null || videoReplyStruct.getAwemeId() == 0) {
            return "";
        }
        return String.valueOf(videoReplyStruct.getAwemeId());
    }

    public static void LJJI(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            C09900aA.LJIIJJI("stcker_awemeid_issue_error_rate", i, null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static boolean LJJIIJ(VideoReplyStruct videoReplyStruct) {
        UrlModel userAvatar;
        if (videoReplyStruct == null || videoReplyStruct.getUserAvatar() == null || (userAvatar = videoReplyStruct.getUserAvatar()) == null || TextUtils.isEmpty(userAvatar.getUri()) || !(!C79004UzY.LJJIFFI(userAvatar.getUrlList())) || !C78857UxB.LJJJIL(videoReplyStruct.getUserName()) || videoReplyStruct.getCommentUserId() == 0 || videoReplyStruct.getCommentId() == 0 || videoReplyStruct.getAwemeId() == 0) {
            return false;
        }
        return true;
    }

    @Override // X.Y1I
    public final View LIZ(int i) {
        if (C223998qh.LJ(this.LJLILLLLZI)) {
            if (this.LJLLILLLL == null) {
                this.LJLLILLLL = new C221798n9(this.LJLILLLLZI);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.LJLLILLLL;
                o.LJI(view);
                view.setLayoutParams(layoutParams);
                View view2 = this.LJLLILLLL;
                o.LJII(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CommonStickerFeedView");
                ((C221798n9) view2).setPoints(this.LJLLJ.LJLJJLL);
                View view3 = this.LJLLILLLL;
                o.LJI(view3);
                view3.postInvalidate();
            }
            return this.LJLLILLLL;
        }
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = new FrameLayout(this.LJLILLLLZI);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view4 = this.LJLLILLLL;
            if (view4 != null) {
                view4.setLayoutParams(layoutParams2);
            }
        }
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC224038ql, X.Y1P
    public final void LJII(C245649kW interactStickerParams) {
        o.LJIIIZ(interactStickerParams, "interactStickerParams");
        this.LJLJJI = interactStickerParams;
        C223668qA c223668qA = this.LJLLJ;
        c223668qA.getClass();
        c223668qA.LJLJJI = interactStickerParams;
    }

    @Override // X.AbstractC224038ql
    public final int LJIIZILJ(C6DL c6dl) {
        VideoReplyStruct videoReplyStruct;
        Integer num;
        Long l;
        int i;
        VideoReplyStruct videoReplyStruct2;
        VideoReplyStruct videoReplyStruct3;
        o.LJIIIZ(c6dl, "<this>");
        C245649kW c245649kW = this.LJLJJI;
        VideoReplyStruct videoReplyStruct4 = null;
        if (c245649kW != null) {
            videoReplyStruct = c245649kW.LJIJ;
        } else {
            videoReplyStruct = null;
        }
        if (videoReplyStruct == null) {
            return 0;
        }
        C6DO c6do = new C6DO();
        String string = c6dl.LIZ.getString(R.string.dm1);
        o.LJIIIIZZ(string, "context.getString(R.string.comment_sticker_CTA1)");
        c6do.LIZLLL = string;
        c6do.LIZ = R.drawable.b5z;
        c6do.LJFF = new ACListenerS23S0100000_3(this, 235);
        ((ArrayList) c6dl.LIZIZ).add(c6do);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (videoReplyStruct3 = c245649kW2.LJIJ) != null) {
            num = videoReplyStruct3.getCollectStat();
        } else {
            num = null;
        }
        int i2 = 1;
        if (C174796tX.LIZ() && num != null && ((RBX) HG3.LJIILL()).isLogin()) {
            C6DO c6do2 = new C6DO();
            C245649kW c245649kW3 = this.LJLJJI;
            if (c245649kW3 != null && (videoReplyStruct2 = c245649kW3.LJIJ) != null) {
                l = Long.valueOf(videoReplyStruct2.getCommentId());
            } else {
                l = null;
            }
            if (l != null) {
                i = CommentFavoriteServiceImpl.LIZJ().LIZIZ(l.toString());
            } else {
                i = -1;
            }
            if ((num.intValue() == 1 && i == -1) || i == 1) {
                String string2 = c6dl.LIZ.getString(R.string.ga5);
                o.LJIIIIZZ(string2, "context.getString(R.string.fav_comment_remove)");
                c6do2.LIZLLL = string2;
                c6do2.LIZ = R.drawable.y3;
                c6do2.LJFF = new ACListenerS23S0100000_3(this, 236);
            } else if ((num.intValue() == 0 && i == -1) || i == 0) {
                int LIZ = C00F.LIZ(31744, 0, "add_comments_to_favorites", false);
                if (LIZ == 3 || LIZ == 1) {
                    String string3 = c6dl.LIZ.getString(R.string.ga2);
                    o.LJIIIIZZ(string3, "context.getString(R.string.fav_comment_button_1)");
                    c6do2.LIZLLL = string3;
                } else {
                    String string4 = c6dl.LIZ.getString(R.string.ga3);
                    o.LJIIIIZZ(string4, "context.getString(R.string.fav_comment_button_2)");
                    c6do2.LIZLLL = string4;
                }
                c6do2.LIZ = R.drawable.y2;
                c6do2.LJFF = new ACListenerS23S0100000_3(this, 237);
            }
            ((ArrayList) c6dl.LIZIZ).add(c6do2);
            i2 = 2;
        }
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null) {
            videoReplyStruct4 = c245649kW4.LJIJ;
        }
        if (LJJIIJ(videoReplyStruct4)) {
            C6DO c6do3 = new C6DO();
            String string5 = c6dl.LIZ.getString(R.string.dm2);
            o.LJIIIIZZ(string5, "context.getString(R.string.comment_sticker_CTA2)");
            c6do3.LIZLLL = string5;
            c6do3.LIZ = R.drawable.b5y;
            c6do3.LJFF = new ACListenerS23S0100000_3(this, 238);
            ((ArrayList) c6dl.LIZIZ).add(c6do3);
            return i2 + 1;
        }
        return i2;
    }

    public final void LJJIFFI(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        VideoReplyStruct videoReplyStruct;
        VideoReplyStruct videoReplyStruct2;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        C188727au c188727au = new C188727au();
        C245649kW c245649kW = this.LJLJJI;
        Long l = null;
        if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
            str = c223778qL4.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
            str2 = c223778qL3.LIZIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
            str3 = c223778qL2.LIZLLL;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_pb", str3);
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
            str4 = c223778qL.LIZ;
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("enter_from", str4);
        c188727au.LJIIIZ("to_group_id", LJJ());
        C245649kW c245649kW5 = this.LJLJJI;
        if (c245649kW5 != null && (videoReplyStruct2 = c245649kW5.LJIJ) != null && videoReplyStruct2.getCommentId() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str8 = "";
        if (z) {
            str5 = "";
        } else {
            C245649kW c245649kW6 = this.LJLJJI;
            if (c245649kW6 != null && (videoReplyStruct = c245649kW6.LJIJ) != null) {
                l = Long.valueOf(videoReplyStruct.getCommentId());
            }
            str5 = String.valueOf(l);
        }
        c188727au.LJIIIZ("reply_comment_id", str5);
        C245649kW c245649kW7 = this.LJLJJI;
        if (c245649kW7 != null && (str7 = c245649kW7.LJIJI) != null) {
            str8 = str7;
        }
        c188727au.LJIIIZ("reply_user_id", str8);
        if (i == 1) {
            str6 = "add_to_favorites";
        } else {
            str6 = "remove_from_favorites";
        }
        c188727au.LJIIIZ("target", str6);
        c188727au.LJIIIZ("sticker_type", "comment_reply");
        FMX.LJIIL("sticker_toast_click", c188727au.LIZ);
    }

    public final void LJJIII(int i, int i2, int i3) {
        if (i2 != 0) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
            c26045AKb.LJIIIZ(this.LJLILLLLZI.getString(i));
            c26045AKb.LJII(i3);
            c26045AKb.LJFF(i2);
            c26045AKb.LJIIJ();
            return;
        }
        C26045AKb c26045AKb2 = new C26045AKb(this.LJLJI);
        c26045AKb2.LJIIIZ(this.LJLILLLLZI.getString(i));
        c26045AKb2.LJIIJ();
    }

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        return this.LJLLJ.LJIIJJI(j, f, f2, i);
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        return this.LJLLJ.LJIILIIL(j, i, f, f2, popListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C223658q9(int i, Context context, C224048qm contentView, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, InterfaceC223648q8 interfaceC223648q8) {
        super(i, context, contentView, interactStickerStruct, c245649kW);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(contentView, "contentView");
        this.LJLLI = interfaceC223648q8;
        this.LJLLJ = new C223668qA(context, this, interactStickerStruct, c245649kW, interfaceC223648q8);
    }
}
