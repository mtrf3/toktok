package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.7EX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7EX extends LinearLayout {
    public static final C62822Ol8 LLFFF = C221108m2.LIZIZ(C253059wT.INSTANCE);
    public C72433Sbl LJLIL;
    public TuxTextView LJLILLLLZI;
    public C201577vd LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public TextView LJLJJLL;
    public C201577vd LJLJL;
    public ImageView LJLJLJ;
    public View LJLJLLL;
    public TextView LJLL;
    public TuxIconView LJLLI;
    public TextView LJLLILLLL;
    public TextView LJLLJ;
    public RelativeLayout LJLLL;
    public TextView LJLLLL;
    public LinearLayout LJLLLLLL;
    public int LJLZ;
    public String LJZ;
    public CommentStruct LJZI;
    public Aweme LJZL;
    public Keva LL;
    public WeakReference<InterfaceC1799774n> LLD;
    public C74R LLF;
    public final AqS153S0100000_3 LLFF;

    public final void LIZLLL() {
        Aweme aweme;
        if (this.LJZI != null && (aweme = this.LJZL) != null) {
            o.LJI(aweme);
            if (aweme.getAdCommentStruct() != null) {
                return;
            }
            IAdCommentDepend iAdCommentDepend = C182487Ee.LIZ;
            if (iAdCommentDepend != null) {
                iAdCommentDepend.LIZJ(getContext(), this.LJZL);
            }
            WeakReference<InterfaceC1799774n> weakReference = this.LLD;
            o.LJI(weakReference);
            if (weakReference.get() != null) {
                WeakReference<InterfaceC1799774n> weakReference2 = this.LLD;
                o.LJI(weakReference2);
                InterfaceC1799774n interfaceC1799774n = weakReference2.get();
                o.LJI(interfaceC1799774n);
                interfaceC1799774n.LIZ();
            }
            if (iAdCommentDepend == null) {
                return;
            }
            iAdCommentDepend.LJIILL(this.LJZL, this.LJZ, true, "click_comment_link");
        }
    }

    public final void LJ() {
        CommentStruct commentStruct = this.LJZI;
        o.LJI(commentStruct);
        if (commentStruct.getUserDigged() == 1) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_heart_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.eb);
            TuxIconView tuxIconView = this.LJLLI;
            if (tuxIconView != null) {
                o.LJI(tuxIconView);
                tuxIconView.setTuxIcon(c2068389v);
                return;
            }
            return;
        }
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_heart;
        c2068389v2.LJ = Integer.valueOf(R.attr.gx);
        TuxIconView tuxIconView2 = this.LJLLI;
        if (tuxIconView2 == null) {
            return;
        }
        o.LJI(tuxIconView2);
        tuxIconView2.setTuxIcon(c2068389v2);
    }

    public final String getDiggSpKey() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("COMMENT_DIGG");
        CommentStruct commentStruct = this.LJZI;
        o.LJI(commentStruct);
        LIZ.append(commentStruct.getAwemeId());
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (NPC.LJII(getContext())) {
            return;
        }
        Aweme aweme = this.LJZL;
        if (aweme != null && aweme.isAd()) {
            CommentStruct commentStruct = this.LJZI;
            o.LJI(commentStruct);
            if (commentStruct.getCommentStyle() == 1) {
                Aweme aweme2 = this.LJZL;
                o.LJI(aweme2);
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                C55707Ltf c55707Ltf = new C55707Ltf();
                c55707Ltf.LIZ = awemeRawAd;
                JSONObject LIZ = c55707Ltf.LIZ();
                o.LJIIIIZZ(LIZ, "ExtraJsonBuilder().awemeRawAd(awemeRawAd).create()");
                if (awemeRawAd != null) {
                    C58776N4y.LIZ("comment_first_ad", "othershow", LIZ, awemeRawAd);
                }
                Aweme aweme3 = this.LJZL;
                o.LJI(aweme3);
                C58655N0h LIZLLL = C58704N2e.LIZLLL("comment_first_ad", "othershow", aweme3.getAwemeRawAd());
                LIZLLL.LIZIZ(C59406NTe.LIZIZ(this.LJZL), "anchor_id");
                LIZLLL.LIZIZ(C59406NTe.LJI(this.LJZL), "room_id");
                LIZLLL.LJII();
            } else {
                CommentStruct commentStruct2 = this.LJZI;
                o.LJI(commentStruct2);
                if (commentStruct2.getCommentStyle() == 0) {
                    Aweme aweme4 = this.LJZL;
                    o.LJI(aweme4);
                    AwemeRawAd awemeRawAd2 = aweme4.getAwemeRawAd();
                    C55707Ltf c55707Ltf2 = new C55707Ltf();
                    c55707Ltf2.LIZ = awemeRawAd2;
                    JSONObject LIZ2 = c55707Ltf2.LIZ();
                    o.LJIIIIZZ(LIZ2, "ExtraJsonBuilder().awemeRawAd(awemeRawAd).create()");
                    if (awemeRawAd2 != null) {
                        C58776N4y.LIZ("comment_first_ad", "comment_first_show", LIZ2, awemeRawAd2);
                    }
                    Aweme aweme5 = this.LJZL;
                    o.LJI(aweme5);
                    C58655N0h LIZLLL2 = C58704N2e.LIZLLL("comment_first_ad", "comment_first_show", aweme5.getAwemeRawAd());
                    LIZLLL2.LIZIZ(C59406NTe.LIZIZ(this.LJZL), "anchor_id");
                    LIZLLL2.LIZIZ(C59406NTe.LJI(this.LJZL), "room_id");
                    LIZLLL2.LJII();
                }
            }
        }
        IAdCommentDepend iAdCommentDepend = C182487Ee.LIZ;
        if (iAdCommentDepend == null) {
            return;
        }
        iAdCommentDepend.LJIILL(this.LJZL, this.LJZ, false, "show_comment_link");
    }

    public final C74R getAdOpenCallBack() {
        return this.LLF;
    }

    public final Aweme getAweme() {
        return this.LJZL;
    }

    public final LinearLayout getContentll() {
        return this.LJLLLLLL;
    }

    public final CommentStruct getData() {
        return this.LJZI;
    }

    public final String getEventType() {
        return this.LJZ;
    }

    public final Keva getKeva() {
        return this.LL;
    }

    public final C72433Sbl getMAvatarView() {
        return this.LJLIL;
    }

    public final View getMCommentContainer() {
        return this.LJLJJI;
    }

    public final TextView getMCommentSplitView() {
        return this.LJLLILLLL;
    }

    public final TextView getMCommentStyleView() {
        return this.LJLLJ;
    }

    public final TextView getMCommentTimeView() {
        return this.LJLL;
    }

    public final C201577vd getMContentView() {
        return this.LJLJI;
    }

    public final RelativeLayout getMDiggLayout() {
        return this.LJLLL;
    }

    public final TuxIconView getMDiggView() {
        return this.LJLLI;
    }

    public final ImageView getMMenuItem() {
        return this.LJLJLJ;
    }

    public final TextView getMReplyCommentStyleView() {
        return this.LJLLLL;
    }

    public final View getMReplyContainer() {
        return this.LJLJJL;
    }

    public final C201577vd getMReplyContentView() {
        return this.LJLJL;
    }

    public final View getMReplyDivider() {
        return this.LJLJLLL;
    }

    public final TextView getMReplyTitleView() {
        return this.LJLJJLL;
    }

    public final TuxTextView getMTitleView() {
        return this.LJLILLLLZI;
    }

    public final WeakReference<InterfaceC1799774n> getOnInternalEventListenerWeakReference() {
        return this.LLD;
    }

    public final int getSize() {
        return this.LJLZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7EX(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJZ = "";
        this.LL = Keva.getRepo("ad_comment");
        this.LLF = new C74R() { // from class: X.7Ed
        };
        this.LLFF = new AqS153S0100000_3(this, 1609);
        C16880lQ.LLLZIIL(R.layout.baw, C16880lQ.LLZIL(context), this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.LJLZ = C17N.LJIILL(32.0d);
        View findViewById = findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.avatar)");
        this.LJLIL = (C72433Sbl) findViewById;
        View findViewById2 = findViewById(R.id.title);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.title)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.content)");
        this.LJLJI = (C201577vd) findViewById3;
        View findViewById4 = findViewById(R.id.bjz);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.comment_container)");
        this.LJLJJI = findViewById4;
        View findViewById5 = findViewById(R.id.iw5);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.reply_container)");
        this.LJLJJL = findViewById5;
        View findViewById6 = findViewById(R.id.iwk);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.reply_title)");
        this.LJLJJLL = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.iw6);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.reply_content)");
        this.LJLJL = (C201577vd) findViewById7;
        this.LJLJLJ = (ImageView) findViewById(R.id.d1j);
        View findViewById8 = findViewById(R.id.iw7);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.reply_divider)");
        this.LJLJLLL = findViewById8;
        View findViewById9 = findViewById(R.id.bmc);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.comment_time)");
        this.LJLL = (TextView) findViewById9;
        this.LJLLI = (TuxIconView) findViewById(R.id.f1x);
        View findViewById10 = findViewById(R.id.blr);
        o.LJIIIIZZ(findViewById10, "findViewById(R.id.comment_split)");
        this.LJLLILLLL = (TextView) findViewById10;
        View findViewById11 = findViewById(R.id.bm6);
        o.LJIIIIZZ(findViewById11, "findViewById(R.id.comment_style)");
        this.LJLLJ = (TextView) findViewById11;
        View findViewById12 = findViewById(R.id.fhv);
        o.LJIIIIZZ(findViewById12, "findViewById(R.id.layout_digg)");
        this.LJLLL = (RelativeLayout) findViewById12;
        View findViewById13 = findViewById(R.id.iw4);
        o.LJIIIIZZ(findViewById13, "findViewById(R.id.reply_comment_style)");
        this.LJLLLL = (TextView) findViewById13;
        View findViewById14 = findViewById(R.id.bty);
        o.LJIIIIZZ(findViewById14, "findViewById(R.id.content_ll)");
        this.LJLLLLLL = (LinearLayout) findViewById14;
        if (NPC.LJII(context)) {
            setVisibility(8);
            this.LJLJJI.setVisibility(8);
        }
        if (C1803676a.LIZ()) {
            setMediumFont(this.LJLJI);
        }
        if ((((Number) C182497Ef.LIZ.getValue()).intValue() & 16) == 16) {
            TextView textView = this.LJLLJ;
            Context context2 = textView.getContext();
            o.LJIIIIZZ(context2, "tv.context");
            Integer LJI = C79045V0n.LJI(R.attr.eh, context2);
            if (LJI != null) {
                textView.setTextColor(LJI.intValue());
            }
            if (C1803676a.LIZ()) {
                setMediumFont(this.LJLLJ);
            } else {
                TextView textView2 = this.LJLLJ;
                if (textView2 instanceof TuxTextView) {
                    o.LJII(textView2, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
                    setBoldFont((TuxTextView) textView2);
                }
            }
        }
        View findViewById15 = findViewById(R.id.fhv);
        if (findViewById15 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 272), findViewById15);
        }
        View findViewById16 = findViewById(R.id.abh);
        if (findViewById16 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 273), findViewById16);
        }
        View findViewById17 = findViewById(R.id.title);
        if (findViewById17 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 274), findViewById17);
        }
        View findViewById18 = findViewById(R.id.bky);
        if (findViewById18 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 275), findViewById18);
        }
        View findViewById19 = findViewById(R.id.bty);
        if (findViewById19 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 276), findViewById19);
        }
        View findViewById20 = findViewById(R.id.bst);
        if (findViewById20 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 277), findViewById20);
        }
        View findViewById21 = findViewById(R.id.bjz);
        if (findViewById21 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 278), findViewById21);
        }
        View findViewById22 = findViewById(R.id.bm6);
        if (findViewById22 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 279), findViewById22);
        }
        View findViewById23 = findViewById(R.id.blr);
        if (findViewById23 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 280), findViewById23);
        }
        setOrientation(1);
        C1806877g.LIZ(this.LJLJI);
        C1806877g.LIZ(this.LJLJL);
    }

    private final void setBoldFont(TuxTextView tuxTextView) {
        tuxTextView.setTuxFont(62);
    }

    private final void setMediumFont(TextView textView) {
        C62822Ol8 c62822Ol8 = LLFFF;
        if (c62822Ol8.getValue() != null) {
            textView.setTypeface((Typeface) c62822Ol8.getValue());
        }
    }

    public final void LIZ(String str) {
        Aweme aweme = this.LJZL;
        o.LJI(aweme);
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return;
        }
        String openUrl = awemeRawAd.getOpenUrl();
        C58655N0h LIZLLL = C58704N2e.LIZLLL("comment_first_ad", "click", awemeRawAd);
        LIZLLL.LIZJ(str, "refer");
        LIZLLL.LIZIZ(C59406NTe.LIZIZ(this.LJZL), "anchor_id");
        LIZLLL.LIZIZ(C59406NTe.LJI(this.LJZL), "room_id");
        LIZLLL.LJI();
        IAdCommentDepend iAdCommentDepend = C182487Ee.LIZ;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.LJIILJJIL(awemeRawAd);
            if (iAdCommentDepend.LJIJ(openUrl)) {
                C55707Ltf c55707Ltf = new C55707Ltf();
                c55707Ltf.LIZ = awemeRawAd;
                c55707Ltf.LIZJ = false;
                C58776N4y.LIZ("comment_first_ad", "click_message", c55707Ltf.LIZ(), awemeRawAd);
                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("comment_first_ad", "click_message", awemeRawAd);
                LIZLLL2.LIZIZ(C59406NTe.LIZIZ(this.LJZL), "anchor_id");
                LIZLLL2.LIZIZ(C59406NTe.LJI(this.LJZL), "room_id");
                LIZLLL2.LJII();
                return;
            }
        }
        C55707Ltf c55707Ltf2 = new C55707Ltf();
        c55707Ltf2.LIZ = awemeRawAd;
        JSONObject LIZ = c55707Ltf2.LIZ();
        o.LJIIIIZZ(LIZ, "ExtraJsonBuilder().awemeRawAd(awemeRawAd).create()");
        C58776N4y.LIZ("comment_first_ad", "click_title", LIZ, awemeRawAd);
        Aweme aweme2 = this.LJZL;
        o.LJI(aweme2);
        C58655N0h LIZLLL3 = C58704N2e.LIZLLL("comment_first_ad", "click_title", aweme2.getAwemeRawAd());
        LIZLLL3.LIZIZ(C59406NTe.LIZIZ(this.LJZL), "anchor_id");
        LIZLLL3.LIZIZ(C59406NTe.LJI(this.LJZL), "room_id");
        LIZLLL3.LJII();
    }

    public final void LIZIZ(int i) {
        Aweme aweme;
        IAdCommentDepend iAdCommentDepend;
        if (this.LJZI != null && (aweme = this.LJZL) != null) {
            o.LJI(aweme);
            if (!aweme.isAd() || (iAdCommentDepend = C182487Ee.LIZ) == null) {
                return;
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Aweme aweme2 = this.LJZL;
            o.LJI(aweme2);
            iAdCommentDepend.LIZ(context, aweme2, i, this.LLF);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0128, code lost:
    
        if (r8 != com.zhiliaoapp.musically.R.id.title) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7EX.LIZJ(android.view.View):void");
    }

    public final void setAdOpenCallBack(C74R c74r) {
        o.LJIIIZ(c74r, "<set-?>");
        this.LLF = c74r;
    }

    public final void setAweme(Aweme aweme) {
        this.LJZL = aweme;
    }

    public final void setContentll(LinearLayout linearLayout) {
        o.LJIIIZ(linearLayout, "<set-?>");
        this.LJLLLLLL = linearLayout;
    }

    public final void setData(CommentStruct commentStruct) {
        IAdCommentDepend iAdCommentDepend;
        boolean z;
        List<TextExtraStruct> LJIIJ;
        boolean z2;
        o.LJIIIZ(commentStruct, "commentStruct");
        if (NPC.LJII(getContext())) {
            return;
        }
        this.LJZI = commentStruct;
        String aid = commentStruct.getAid();
        IAwemeService LIZ = AwemeService.LIZ();
        Aweme o6 = LIZ.o6(aid);
        Aweme i6 = LIZ.i6(aid);
        Aweme n6 = LIZ.n6(aid);
        if (o6 == null) {
            if (i6 == null) {
                o6 = n6;
            } else {
                o6 = i6;
            }
        }
        this.LJZL = o6;
        if (this.LJLIL.getHierarchy().LIZJ != null) {
            V8L v8l = this.LJLIL.getHierarchy().LIZJ;
            o.LJI(v8l);
            v8l.LIZLLL(C17N.LJIILL(0.5d));
            V8L v8l2 = this.LJLIL.getHierarchy().LIZJ;
            o.LJI(v8l2);
            v8l2.LJFF = C78609UtB.LJJJ(R.attr.dz, getContext());
        }
        CommentStruct commentStruct2 = this.LJZI;
        o.LJI(commentStruct2);
        if (commentStruct2.getAvatarSize() > 0) {
            ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
            CommentStruct commentStruct3 = this.LJZI;
            o.LJI(commentStruct3);
            layoutParams.width = commentStruct3.getAvatarSize();
            CommentStruct commentStruct4 = this.LJZI;
            o.LJI(commentStruct4);
            layoutParams.height = commentStruct4.getAvatarSize();
            this.LJLIL.setLayoutParams(layoutParams);
            CommentStruct commentStruct5 = this.LJZI;
            o.LJI(commentStruct5);
            this.LJLZ = commentStruct5.getAvatarSize();
        }
        CommentStruct commentStruct6 = this.LJZI;
        o.LJI(commentStruct6);
        User user = commentStruct6.getUser();
        if (user != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                C78765Uvh.LIZ(this.LJLIL, R.drawable.b0p);
            } else {
                C72433Sbl c72433Sbl = this.LJLIL;
                int i = this.LJLZ;
                C78765Uvh.LJ(c72433Sbl, avatarThumb, i, i, null, c72433Sbl.getControllerListener(), true, null);
            }
        }
        CommentStruct commentStruct7 = this.LJZI;
        o.LJI(commentStruct7);
        String commentInfo = commentStruct7.getCommentInfo();
        if (this.LJZL != null && !TextUtils.isEmpty(commentInfo) && (iAdCommentDepend = C182487Ee.LIZ) != null) {
            Aweme aweme = this.LJZL;
            o.LJI(aweme);
            boolean isAd = aweme.isAd();
            Aweme aweme2 = this.LJZL;
            o.LJI(aweme2);
            if (aweme2.getAdCommentStruct() != null) {
                z = true;
            } else {
                z = false;
            }
            if (isAd & z) {
                C182447Ea c182447Ea = C7EY.LIZ;
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                CommentStruct commentStruct8 = this.LJZI;
                o.LJI(commentStruct8);
                Aweme aweme3 = this.LJZL;
                o.LJI(aweme3);
                AwemeRawAd awemeRawAd = aweme3.getAwemeRawAd();
                AqS153S0100000_3 onLinkTagClick = this.LLFF;
                c182447Ea.getClass();
                o.LJIIIZ(onLinkTagClick, "onLinkTagClick");
                if (commentStruct8.getCommentStyle() == 1) {
                    LJIIJ = iAdCommentDepend.LJJI(context, commentStruct8, awemeRawAd, onLinkTagClick);
                } else {
                    LJIIJ = iAdCommentDepend.LJIIJ(context, commentStruct8);
                }
                C201577vd c201577vd = this.LJLJI;
                CommentStruct commentStruct9 = this.LJZI;
                o.LJI(commentStruct9);
                c201577vd.setText(iAdCommentDepend.LJJ(commentStruct9));
                this.LJLJI.LJJIZ(LJIIJ, new C78886Uxe(), null);
                this.LJLJI.setMovementMethod(LinkMovementMethod.getInstance());
                C59894Nf0.LIZ(this.LJLLLLLL);
            } else {
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                Aweme aweme4 = this.LJZL;
                o.LJI(aweme4);
                CommentStruct commentStruct10 = this.LJZI;
                o.LJI(commentStruct10);
                List LIZIZ = iAdCommentDepend.LIZIZ(context2, commentStruct10, aweme4);
                C201577vd c201577vd2 = this.LJLJI;
                CommentStruct commentStruct11 = this.LJZI;
                o.LJI(commentStruct11);
                c201577vd2.setText(iAdCommentDepend.LJJ(commentStruct11));
                if (LIZIZ != null) {
                    this.LJLJI.LJJIZ(LIZIZ, new C78886Uxe(), null);
                    this.LJLJI.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        this.LJLL.setVisibility(8);
        this.LJLLL.setVisibility(0);
        int i2 = this.LL.getInt(getDiggSpKey(), -1);
        if (i2 != -1) {
            CommentStruct commentStruct12 = this.LJZI;
            o.LJI(commentStruct12);
            commentStruct12.setUserDigged(i2);
        }
        LJ();
        CommentStruct commentStruct13 = this.LJZI;
        if (commentStruct13 != null && commentStruct13.showCreatorTag()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = "";
        if (z2) {
            this.LJLLILLLL.setVisibility(0);
            String string = getResources().getString(R.string.dk5);
            o.LJIIIIZZ(string, "resources.getString(R.string.comment_label)");
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{""}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            this.LJLLILLLL.setText(s.LJZI(LLLZ).toString());
            this.LJLLJ.setVisibility(0);
            this.LJLLJ.setText(getResources().getText(R.string.bwk));
        }
        TuxTextView tuxTextView = this.LJLILLLLZI;
        CommentStruct commentStruct14 = this.LJZI;
        o.LJI(commentStruct14);
        if (!TextUtils.isEmpty(commentStruct14.getCommentNickName())) {
            CommentStruct commentStruct15 = this.LJZI;
            o.LJI(commentStruct15);
            str = commentStruct15.getCommentNickName();
        }
        tuxTextView.setText(str);
        this.LJLILLLLZI.setTuxFont(62);
        this.LJLILLLLZI.setTextColor(C78609UtB.LJJJ(R.attr.gu, getContext()));
    }

    public final void setEventType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJZ = str;
    }

    public final void setKeva(Keva keva) {
        this.LL = keva;
    }

    public final void setMAvatarView(C72433Sbl c72433Sbl) {
        o.LJIIIZ(c72433Sbl, "<set-?>");
        this.LJLIL = c72433Sbl;
    }

    public final void setMCommentContainer(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLJJI = view;
    }

    public final void setMCommentSplitView(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLLILLLL = textView;
    }

    public final void setMCommentStyleView(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLLJ = textView;
    }

    public final void setMCommentTimeView(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLL = textView;
    }

    public final void setMContentView(C201577vd c201577vd) {
        o.LJIIIZ(c201577vd, "<set-?>");
        this.LJLJI = c201577vd;
    }

    public final void setMDiggLayout(RelativeLayout relativeLayout) {
        o.LJIIIZ(relativeLayout, "<set-?>");
        this.LJLLL = relativeLayout;
    }

    public final void setMDiggView(TuxIconView tuxIconView) {
        this.LJLLI = tuxIconView;
    }

    public final void setMMenuItem(ImageView imageView) {
        this.LJLJLJ = imageView;
    }

    public final void setMReplyCommentStyleView(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLLLL = textView;
    }

    public final void setMReplyContainer(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLJJL = view;
    }

    public final void setMReplyContentView(C201577vd c201577vd) {
        o.LJIIIZ(c201577vd, "<set-?>");
        this.LJLJL = c201577vd;
    }

    public final void setMReplyDivider(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLJLLL = view;
    }

    public final void setMReplyTitleView(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLJJLL = textView;
    }

    public final void setMTitleView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLILLLLZI = tuxTextView;
    }

    public final void setOnInternalEventListener(InterfaceC1799774n interfaceC1799774n) {
        this.LLD = new WeakReference<>(interfaceC1799774n);
    }

    public final void setOnInternalEventListenerWeakReference(WeakReference<InterfaceC1799774n> weakReference) {
        this.LLD = weakReference;
    }

    public final void setSize(int i) {
        this.LJLZ = i;
    }
}
