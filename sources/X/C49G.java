package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.49G, reason: invalid class name */
/* loaded from: classes2.dex */
public class C49G extends AnonymousClass461<AwemeCardTemplate> {
    public final C113074cB LLIIIJ;
    public final SmartImageView LLIIIL;
    public final View LLIIIZ;
    public final C116414hZ LLIIJI;
    public final View LLIIJLIL;
    public final SmartAvatarImageView LLIIL;
    public final TuxTextView LLIILII;
    public final TuxIconView LLIILZL;
    public final TuxTextView LLIIZ;
    public final View LLIL;
    public InterfaceC207258Bl LLILII;
    public final C62822Ol8 LLILIL;
    public final View LLILL;
    public final TuxTextView LLILLIZIL;
    public final C62822Ol8 LLILLJJLI;
    public final C62822Ol8 LLILLL;
    public final C62822Ol8 LLILZ;

    @Override // X.AbstractC1041546x
    public final boolean Y() {
        return true;
    }

    public String o0() {
        return C88913eJ.LIZ(this.itemView, R.string.qio, "itemView.context.getStri…ng.send_muf_shared_video)");
    }

    public final void v0() {
        s0(R.attr.cv);
        this.LLIIJLIL.setVisibility(0);
        this.LLIIIZ.setVisibility(0);
    }

    public String p0(C109544Rq c109544Rq) {
        ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
        if (companion.isVideoTag$im_base_release(c109544Rq)) {
            return this.itemView.getContext().getString(R.string.epa);
        }
        if (companion.isVideoMention$im_base_release(c109544Rq)) {
            return this.itemView.getContext().getString(R.string.ep9);
        }
        if (companion.isVideoMentionAndTag$im_base_release(c109544Rq)) {
            return this.itemView.getContext().getString(R.string.ep_);
        }
        return null;
    }

    public final void s0(int i) {
        int i2;
        GradientDrawable LIZIZ = T28.LIZIZ(0);
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", i);
        if (LIZIZ2 != null) {
            i2 = LIZIZ2.intValue();
        } else {
            i2 = -16776961;
        }
        LIZIZ.setColor(i2);
        W5F LJFF = W5U.LJFF(android.net.Uri.EMPTY);
        LJFF.LJIILIIL = LIZIZ;
        LJFF.LJIILLIIL = LIZIZ;
        LJFF.LJJIIJ = this.LLIIIL;
        C16880lQ.LLJJJ(LJFF);
    }

    @Override // X.AbstractC1041546x
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        super.setOnClickListener(onClickListener);
        C16880lQ.LJJJJL(this.LLIIL, onClickListener);
        C16880lQ.LJJJJI(this.LLIILII, onClickListener);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZ(onClickListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49G(View itemView, EnumC110124Tw itemType) {
        super(itemView, itemType);
        int i;
        Drawable background;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(itemType, "itemType");
        this.LLILIL = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 958));
        this.LLILLJJLI = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 957));
        this.LLILLL = C221108m2.LIZIZ(C49K.LJLIL);
        this.LLILZ = C221108m2.LIZIZ(new AqS148S0200000_1(itemView, this, 42));
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIIJ = (C113074cB) findViewById;
        View findViewById2 = itemView.findViewById(R.id.bxs);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.cover_image)");
        this.LLIIIL = (SmartImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.f8q);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_play_center)");
        this.LLIIIZ = findViewById3;
        View findViewById4 = itemView.findViewById(R.id.g8x);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.loading_spinner)");
        C116414hZ c116414hZ = (C116414hZ) findViewById4;
        this.LLIIJI = c116414hZ;
        View findViewById5 = itemView.findViewById(R.id.l7j);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.….tiktok_logo_placeholder)");
        this.LLIIJLIL = findViewById5;
        View findViewById6 = itemView.findViewById(R.id.m06);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.tv_auto_message_hint)");
        this.LLILLIZIL = (TuxTextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.apc);
        if (findViewById7 != null && (background = findViewById7.getBackground()) != null) {
            background.setAutoMirrored(true);
        }
        o.LJIIIIZZ(findViewById7, "itemView.findViewById<Vi…nt).also(::setAutoMirror)");
        this.LLILL = findViewById7;
        View findViewById8 = itemView.findViewById(R.id.aos);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.…ttom_background_gradient)");
        this.LLIL = findViewById8;
        View findViewById9 = itemView.findViewById(R.id.bt8);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.content_avatar_iv)");
        this.LLIIL = (SmartAvatarImageView) findViewById9;
        View findViewById10 = itemView.findViewById(R.id.bu6);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.content_name_tv)");
        this.LLIILII = (TuxTextView) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.btm);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.content_error_icon)");
        this.LLIILZL = (TuxIconView) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.btn);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.id.content_error_text)");
        this.LLIIZ = (TuxTextView) findViewById12;
        Integer LIZIZ = C19N.LIZIZ(itemView, "itemView.context", R.attr.dw);
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = 0;
        }
        c116414hZ.LIZ(R.raw.icon_spinner_normal, i);
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        o.LJIIIZ(msg, "msg");
        C4AH c4ah = c49v.LIZ;
        if (c4ah != null) {
            this.LLIIIJ.setRoundingParams(c4ah);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X.49H] */
    @Override // X.AnonymousClass461
    public final void m0(final C109544Rq msg, C109544Rq c109544Rq, AwemeCardTemplate awemeCardTemplate, int i) {
        boolean z;
        String str;
        final boolean z2;
        int i2;
        List<String> list;
        String str2;
        final AwemeCardTemplate awemeCardTemplate2 = awemeCardTemplate;
        o.LJIIIZ(msg, "msg");
        InterfaceC207258Bl interfaceC207258Bl = this.LLILII;
        if (interfaceC207258Bl != null) {
            interfaceC207258Bl.LIZLLL(false);
        }
        View findViewById = this.itemView.findViewById(R.id.kl3);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.LLIIJI.setVisibility(8);
        this.LLIIJLIL.setVisibility(8);
        this.LLILL.setVisibility(8);
        this.LLIIIZ.setVisibility(8);
        this.LLIL.setVisibility(8);
        this.LLILLIZIL.setVisibility(8);
        this.LLIILZL.setVisibility(8);
        this.LLIIZ.setVisibility(8);
        this.LLILLIZIL.setVisibility(8);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 108);
        }
        this.LLIIL.setTag(50331648, 4);
        this.LLIILII.setTag(50331648, 4);
        ShareAwemeContent shareAwemeContent = new ShareAwemeContent();
        C109544Rq c109544Rq2 = this.LJZI;
        if (c109544Rq2 != null && (str2 = c109544Rq2.getLocalExt().get("feed_ad_fake_nickname")) != null && str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        shareAwemeContent.setAdFake(z);
        Long l = awemeCardTemplate2.baseUserComponent.userId;
        UrlModel urlModel = null;
        if (l != null) {
            str = l.toString();
        } else {
            str = null;
        }
        shareAwemeContent.setUser(str);
        this.LLIIL.setTag(100663296, shareAwemeContent);
        this.LLIILII.setTag(100663296, shareAwemeContent);
        VideoCoverComponent videoCoverComponent = awemeCardTemplate2.baseVideoComponent;
        AnonymousClass462 anonymousClass462 = this.LLF;
        if (anonymousClass462 != null) {
            anonymousClass462.LJI = videoCoverComponent.id;
        }
        switch (C112914bv.LIZ[awemeCardTemplate2.fallbackInfo.image.iconType.ordinal()]) {
            case 1:
                s0(R.attr.cv);
                n0(msg, awemeCardTemplate2.baseUserComponent, R.attr.go, false);
                if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
                    t0(R.raw.icon_large_video, R.attr.gp, R.attr.gu, awemeCardTemplate2.fallbackInfo.text.text);
                    return;
                } else {
                    v0();
                    return;
                }
            case 2:
                s0(R.attr.cv);
                this.LLIIJI.setVisibility(0);
                return;
            case 3:
                s0(R.attr.d4);
                t0(R.raw.icon_large_protection, R.attr.dj, R.attr.dj, awemeCardTemplate2.fallbackInfo.text.text);
                return;
            case 4:
            case 5:
                s0(R.attr.cv);
                if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
                    n0(msg, awemeCardTemplate2.baseUserComponent, R.attr.go, false);
                    String str3 = awemeCardTemplate2.fallbackInfo.text.text;
                    int length = str3.length();
                    CharSequence charSequence = str3;
                    if (length == 0) {
                        charSequence = this.itemView.getContext().getText(R.string.tob);
                    }
                    o.LJIIIIZZ(charSequence, "template.fallbackInfo.te…ideo_unavailable_hint)) }");
                    t0(R.raw.icon_large_video, R.attr.gp, R.attr.gu, charSequence);
                    return;
                }
                v0();
                return;
            case 6:
                C99033ud c99033ud = this.LJLLL;
                if (c99033ud != null && c99033ud.isHighRiskConversation()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                n0(msg, awemeCardTemplate2.baseUserComponent, R.attr.go, false);
                ImageComponent imageComponent = awemeCardTemplate2.baseVideoComponent.coverImage;
                final ?? r4 = new C81929WDl() { // from class: X.49H
                    @Override // X.C81929WDl, X.InterfaceC70769Rq1
                    public final void s2(android.net.Uri uri, View view, Throwable th) {
                        super.s2(uri, view, th);
                        if (z2) {
                            this.s0(R.attr.d4);
                            C49G c49g = this;
                            CharSequence text = c49g.itemView.getContext().getText(R.string.ett);
                            o.LJIIIIZZ(text, "itemView.context.getText…g.dm_safety_content_mask)");
                            c49g.t0(R.raw.icon_large_protection, R.attr.dj, R.attr.dj, text);
                            this.LLILL.setVisibility(8);
                            return;
                        }
                        this.v0();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(null, false, null, null, null, 63);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
                    
                        if (r3 != null) goto L24;
                     */
                    @Override // X.C81929WDl, X.InterfaceC70769Rq1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void U0(android.net.Uri r10, android.view.View r11, X.C2047581v r12, android.graphics.drawable.Animatable r13) {
                        /*
                            Method dump skipped, instructions count: 270
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C49H.U0(android.net.Uri, android.view.View, X.81v, android.graphics.drawable.Animatable):void");
                    }
                };
                GradientDrawable LIZIZ = T28.LIZIZ(0);
                Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cv);
                if (LIZIZ2 != null) {
                    i2 = LIZIZ2.intValue();
                } else {
                    i2 = -16776961;
                }
                LIZIZ.setColor(i2);
                if (imageComponent != null && (list = imageComponent.urls) != null) {
                    urlModel = C78934UyQ.LJJIIJ(list);
                }
                W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                C43659HBn.LJIILIIL(LJII, EnumC61782be.DEFAULT);
                LJII.LJIILIIL = LIZIZ;
                LJII.LJIILLIIL = LIZIZ;
                LJII.LJJIIJ = this.LLIIIL;
                if (z2) {
                    LJII.LJIL = new MHO(25, 0);
                }
                LJII.LIZLLL(new C81929WDl() { // from class: X.49I
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("AwemeVideoCardViewHolder", false, null, null, null, 62);
                    }

                    @Override // X.C81929WDl, X.AbstractC72439Sbr, X.InterfaceC70769Rq1
                    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
                        super.T1(uri, smartImageView);
                        C49G.this.LLIIJI.setVisibility(0);
                        r4.T1(uri, smartImageView);
                    }

                    @Override // X.C81929WDl, X.InterfaceC70769Rq1
                    public final void s2(android.net.Uri uri, View view, Throwable th) {
                        super.s2(uri, view, th);
                        C49G.this.LLIIJI.setVisibility(8);
                        r4.s2(uri, view, th);
                    }

                    @Override // X.C81929WDl, X.InterfaceC70769Rq1
                    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                        super.U0(uri, view, c2047581v, animatable);
                        C49G.this.LLIIJI.setVisibility(8);
                        r4.U0(uri, view, c2047581v, animatable);
                    }
                });
                if (C93793mB.LJ(msg)) {
                    this.LLILLIZIL.setVisibility(0);
                    this.LLILLIZIL.setText(o0());
                }
                if (!SuggestedReplyExperiment.LIZJ() || msg.isSelf()) {
                    return;
                }
                String scene = msg.getScene();
                if (!o.LJ(scene, C49J.VIDEO_SUBSCRIPTION.getScene()) && !o.LJ(scene, C49J.DEFAULT_VIDEO.getScene())) {
                    return;
                }
                ((C46V) this.LLILZ.getValue()).LIZ(msg);
                return;
            default:
                return;
        }
    }

    public final void n0(C109544Rq c109544Rq, BaseUserComponent baseUserComponent, int i, boolean z) {
        String str;
        List<String> list;
        TuxTextView tuxTextView = this.LLIILII;
        String str2 = c109544Rq.getLocalExt().get("feed_ad_fake_nickname");
        UrlModel urlModel = null;
        if (str2 == null) {
            TextComponent textComponent = baseUserComponent.nickname;
            if (textComponent != null) {
                str2 = textComponent.text;
            } else {
                str2 = null;
            }
        }
        tuxTextView.setText(str2);
        this.LLIILII.setTextColorRes(i);
        ImageComponent imageComponent = baseUserComponent.avatar;
        if (imageComponent != null && (list = imageComponent.urls) != null) {
            urlModel = C78934UyQ.LJJIIJ(list);
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
            LJII.LJIILIIL = (Drawable) this.LLILLJJLI.getValue();
            LJII.LJIILLIIL = (Drawable) this.LLILLJJLI.getValue();
        } else {
            LJII.LJIILL = R.drawable.b7n;
        }
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        LJII.LJJIIJ = this.LLIIL;
        ImageComponent imageComponent2 = baseUserComponent.avatar;
        if (imageComponent2 == null || (str = imageComponent2.id) == null) {
            str = "";
        }
        C43659HBn.LJIIZILJ(LJII, "AvatarOnAwemeVideoCardViewHolder", str, 0, null, 28);
        int i2 = 0;
        this.LLILL.setVisibility(0);
        View view = this.LLIL;
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void t0(int i, int i2, int i3, CharSequence charSequence) {
        this.LLIILZL.setIconRes(i);
        this.LLIILZL.setTintColorRes(i2);
        this.LLIILZL.setVisibility(0);
        this.LLIIZ.setText(charSequence);
        this.LLIIZ.setTextColorRes(i3);
        this.LLIIZ.setVisibility(0);
    }
}
