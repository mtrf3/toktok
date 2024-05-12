package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.476, reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass476 extends AnonymousClass460<ShareAwemeContent> {
    public Aweme LLIIIL;
    public final String LLIIIZ;
    public final C113094cD LLIIJI;
    public final SmartAvatarImageView LLIIJLIL;
    public final TextView LLIIL;
    public final TextView LLIILII;
    public final ImageView LLIILZL;
    public final C116414hZ LLIIZ;
    public final ImageView LLIL;
    public final TuxTextView LLILII;
    public final View LLILIL;
    public final TuxIconView LLILL;
    public final View LLILLIZIL;
    public final TuxTextView LLILLJJLI;
    public final TextView LLILLL;
    public final SY4 LLILZ;
    public final InterfaceC207258Bl LLILZIL;
    public final C62822Ol8 LLILZLL;
    public C84803Um LLIZ;
    public final C62822Ol8 LLIZLLLIL;
    public final IDqS426S0100000_1 LLJ;
    public final C62822Ol8 LLJI;
    public final C62822Ol8 LLJIJIL;

    @Override // X.AbstractC1041546x
    public final boolean Y() {
        return true;
    }

    public String s0() {
        return C88913eJ.LIZ(this.itemView, R.string.qio, "itemView.context.getStri…ng.send_muf_shared_video)");
    }

    public String t0() {
        return C88913eJ.LIZ(this.itemView, R.string.tjn, "itemView.context.getStri…heading_DM_inbox_creator)");
    }

    public boolean w0() {
        C99033ud c99033ud = this.LJLLL;
        if (c99033ud == null || !c99033ud.isHighRiskConversation()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1041546x
    public final void LJJJJIZL() {
        super.LJJJJIZL();
        this.LLIZ = null;
    }

    @Override // X.AnonymousClass460, X.AbstractC1041546x
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        super.setOnClickListener(onClickListener);
        C16880lQ.LJJJJL(this.LLIIJLIL, onClickListener);
        C16880lQ.LJIJI(this.LLIIL, onClickListener);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZ(new ACListenerS36S0200000_1(onClickListener, this, 25));
        }
        this.LJLLILLLL.LIZ(this.LLIIJLIL, this.LLIIL);
    }

    public String v0(C109544Rq message) {
        o.LJIIIZ(message, "message");
        ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
        if (companion.isVideoTag$im_base_release(message)) {
            return this.itemView.getContext().getString(R.string.epa);
        }
        if (companion.isVideoMention$im_base_release(message)) {
            return this.itemView.getContext().getString(R.string.ep9);
        }
        if (companion.isVideoMentionAndTag$im_base_release(message)) {
            return this.itemView.getContext().getString(R.string.ep_);
        }
        return null;
    }

    public final void x0(C109544Rq c109544Rq) {
        if (!c109544Rq.isSelf() && C54838Lfe.LJJIJIIJI(this.LLIIIL, this.LLIIIZ)) {
            if (this.LLILZ.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12);
                layoutParams.addRule(14);
                layoutParams.setMargins(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                C16880lQ.LJJIZ(this.LLILZ, new ACListenerS21S0100000_1(this, 148));
                C113094cD c113094cD = this.LLIIJI;
                if ((c113094cD instanceof ViewGroup) && c113094cD != null) {
                    c113094cD.addView(this.LLILZ, layoutParams);
                }
            }
            this.LLILZ.setVisibility(0);
            this.LLILLIZIL.setVisibility(8);
            Aweme aweme = this.LLIIIL;
            if (aweme == null) {
                return;
            }
            C54838Lfe.LIZ(this.LLIIIZ, aweme, "chat_page");
            return;
        }
        this.LLILZ.setVisibility(8);
        this.LLILLIZIL.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass476(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        int i;
        Drawable background;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLIIIZ = "";
        this.LLILZLL = C221108m2.LIZIZ(new AqS148S0200000_1(itemView, this, 29));
        this.LLIZLLLIL = C221108m2.LIZIZ(C47F.LJLIL);
        this.LLJ = new IDqS426S0100000_1(this, 12);
        this.LLJI = C221108m2.LIZIZ(AnonymousClass478.LJLIL);
        this.LLJIJIL = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 805));
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        C113094cD c113094cD = (C113094cD) findViewById;
        this.LLIIJI = c113094cD;
        View findViewById2 = itemView.findViewById(R.id.bt8);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.content_avatar_iv)");
        this.LLIIJLIL = (SmartAvatarImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.bu6);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.content_name_tv)");
        this.LLIIL = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.btx);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.content_live_iv)");
        this.LLIILII = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.bu8);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.content_photo_iv)");
        this.LLIILZL = (ImageView) findViewById5;
        this.LLILLL = (TextView) itemView.findViewById(R.id.buh);
        View findViewById6 = itemView.findViewById(R.id.f8q);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.iv_play_center)");
        this.LLIL = (ImageView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.g8x);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.loading_spinner)");
        C116414hZ c116414hZ = (C116414hZ) findViewById7;
        this.LLIIZ = c116414hZ;
        Integer LIZIZ = C19N.LIZIZ(itemView, "itemView.context", R.attr.dw);
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = 0;
        }
        c116414hZ.LIZ(R.raw.icon_spinner_normal, i);
        View findViewById8 = itemView.findViewById(R.id.bti);
        View findViewById9 = itemView.findViewById(R.id.b0n);
        if (findViewById9 != null && (background = findViewById9.getBackground()) != null) {
            background.setAutoMirrored(true);
        }
        o.LJIIIIZZ(findViewById9, "itemView.findViewById<Vi…ll).also(::setAutoMirror)");
        this.LLILLIZIL = findViewById9;
        View findViewById10 = itemView.findViewById(R.id.mlh);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.tv_story_react_hint)");
        this.LLILII = (TuxTextView) findViewById10;
        this.LLILZIL = C8SG.LIZIZ.LJI(c113094cD);
        View findViewById11 = itemView.findViewById(R.id.bu2);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.content_mask_view)");
        this.LLILIL = findViewById11;
        View findViewById12 = itemView.findViewById(R.id.bu0);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.id.content_mask_icon)");
        this.LLILL = (TuxIconView) findViewById12;
        View findViewById13 = itemView.findViewById(R.id.m06);
        o.LJIIIIZZ(findViewById13, "itemView.findViewById(R.id.tv_auto_message_hint)");
        this.LLILLJJLI = (TuxTextView) findViewById13;
        findViewById8.setBackgroundResource(R.drawable.bkf);
        Context context = itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        SY4 sy4 = new SY4(context, null, 6, 0);
        String string = this.itemView.getContext().getString(R.string.r35);
        o.LJIIIIZZ(string, "itemView.context.getStri…g_friendsPost_cta_button)");
        sy4.setText(string);
        sy4.setButtonSize(1);
        sy4.setButtonVariant(1);
        AnonymousClass477 anonymousClass477 = AnonymousClass477.LJLIL;
        if (anonymousClass477 != null) {
            anonymousClass477.invoke(sy4);
        }
        sy4.LLFF = anonymousClass477;
        sy4.setButtonStartIcon(Integer.valueOf(R.raw.icon_story_star));
        OUP.LJJJJLI(sy4, Float.valueOf(C32151Nz.LJIIZILJ(8)), null, null, 30);
        sy4.setMinimumWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(158)));
        this.LLILZ = sy4;
        HG3.LJIIL();
        this.LLIIIZ = HG3.LJLJL.LJFF().getCurUserId();
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        o.LJIIIZ(msg, "msg");
        C4AH c4ah = c49v.LIZ;
        if (c4ah != null) {
            this.LLIIJI.setRoundingParams(c4ah);
            if (w0()) {
                View view = this.LLILIL;
                GradientDrawable gradientDrawable = new GradientDrawable();
                Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.ee);
                if (LIZIZ != null) {
                    gradientDrawable.setColor(LIZIZ.intValue());
                }
                view.setBackground(gradientDrawable);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.3Um, X.3UX] */
    @Override // X.AnonymousClass460
    public final void p0(C109544Rq msg, C109544Rq c109544Rq, ShareAwemeContent shareAwemeContent, int i) {
        Integer sourceType;
        boolean z;
        LifecycleOwner LIZIZ;
        LifecycleCoroutineScope lifecycleScope;
        String str;
        List<String> urlList;
        ShareAwemeContent shareAwemeContent2 = shareAwemeContent;
        o.LJIIIZ(msg, "msg");
        if (shareAwemeContent2 == null) {
            return;
        }
        C84803Um c84803Um = this.LLIZ;
        if (c84803Um == null || !o.LJ(c84803Um.LIZIZ, msg.getUuid())) {
            final String uuid = msg.getUuid();
            o.LJIIIIZZ(uuid, "msg.uuid");
            ?? r4 = new C3UX(uuid) { // from class: X.3Um
                public final String LJ;

                public final int hashCode() {
                    return Objects.hash(this.LJ);
                }

                @Override // X.C3UX
                public final String toString() {
                    return C78966Uyw.LJJJLL("MsgResourceLoadEventKey:%s", this.LJ);
                }

                {
                    super("im_message_resource_load", uuid, 0.0f, C3US.TEA, 4);
                    this.LJ = uuid;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C84803Um)) {
                        return false;
                    }
                    return C78966Uyw.LJIIIZ(new Object[]{((C84803Um) obj).LJ}, new Object[]{this.LJ});
                }
            };
            ((C3VM) this.LLIZLLLIL.getValue()).LIZIZ(r4, true);
            this.LLIZ = r4;
        }
        int awemeType = shareAwemeContent2.getAwemeType();
        this.LLIIIL = null;
        if (awemeType == 0 || awemeType == 23 || shareAwemeContent2.isStory() || awemeType == 150) {
            this.LLIILZL.setVisibility(8);
            if (awemeType == 23) {
                this.LLIILII.setVisibility(0);
            }
        } else {
            this.LLIILZL.setVisibility(0);
        }
        String v0 = v0(msg);
        if (v0 != null) {
            TuxTextView tuxTextView = this.LLILII;
            tuxTextView.setVisibility(0);
            tuxTextView.setText(v0);
            tuxTextView.setMaxLines(2);
            tuxTextView.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(200)));
        } else {
            TuxTextView tuxTextView2 = this.LLILII;
            tuxTextView2.setMaxLines(Integer.MAX_VALUE);
            tuxTextView2.setMaxWidth(Integer.MAX_VALUE);
            if (!ShareStoryContent.Companion.isStory(shareAwemeContent2) || !C55723Ltv.LIZIZ.LJIIJ() || (sourceType = ((ShareStoryContent) shareAwemeContent2).getSourceType()) == null || sourceType.intValue() != 1) {
                this.LLILII.setVisibility(8);
                this.LLILII.setText("");
            } else {
                this.LLILII.setText(t0());
                this.LLILII.setVisibility(0);
            }
        }
        this.LLIL.setVisibility(0);
        InterfaceC207258Bl interfaceC207258Bl = this.LLILZIL;
        if (shareAwemeContent2.type == 810) {
            z = true;
        } else {
            z = false;
        }
        interfaceC207258Bl.LIZLLL(z);
        if (w0()) {
            this.LLILIL.setVisibility(0);
            this.LLILL.setIconRes(R.raw.icon_large_protection);
        } else {
            this.LLILIL.setVisibility(8);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C84973Vd.LIZ(itemView, msg, shareAwemeContent2, w0(), this.LLJ);
        String user = shareAwemeContent2.getUser();
        UrlModel contentThumb = shareAwemeContent2.getContentThumb();
        java.util.Map<String, String> localExt = msg.getLocalExt();
        if (localExt != null && (str = localExt.get("key_content_avatar")) != null && contentThumb != null && (urlList = contentThumb.getUrlList()) != null) {
            ListProtector.add(urlList, 0, str);
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(contentThumb));
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
            LJII.LJIILIIL = (Drawable) this.LLJIJIL.getValue();
            LJII.LJIILLIIL = (Drawable) this.LLJIJIL.getValue();
        } else {
            LJII.LJIILL = R.drawable.b7n;
        }
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        LJII.LJJIIJ = this.LLIIJLIL;
        C43659HBn.LJIIZILJ(LJII, "ShareAwemeReceiveAutoPlayViewHolder", user, 0, new AqS167S0100000_1(msg, 256), 12);
        TextView textView = this.LLIIL;
        String str2 = msg.getLocalExt().get("feed_ad_fake_nickname");
        if (str2 == null) {
            if (shareAwemeContent2.getContentName() != null) {
                str2 = shareAwemeContent2.getContentName();
            } else {
                str2 = shareAwemeContent2.getAuthorUsername();
            }
        }
        textView.setText(str2);
        TextView textView2 = this.LLILLL;
        if (textView2 != null) {
            String title = shareAwemeContent2.getTitle();
            if (!TextUtils.isEmpty(title)) {
                textView2.setText(title);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
        }
        if (shareAwemeContent2.isStory()) {
            AnonymousClass470 anonymousClass470 = this.LJLJJI;
            if (anonymousClass470 != null) {
                anonymousClass470.LIZIZ(50331648, 48);
            }
        } else {
            AnonymousClass470 anonymousClass4702 = this.LJLJJI;
            if (anonymousClass4702 != null) {
                anonymousClass4702.LIZIZ(50331648, 2);
            }
        }
        this.LLIIJLIL.setTag(50331648, 4);
        this.LLIIJLIL.setTag(100663296, shareAwemeContent2);
        this.LLIIL.setTag(50331648, 4);
        this.LLIIL.setTag(100663296, shareAwemeContent2);
        if (!C1041847a.LIZ()) {
            String user2 = shareAwemeContent2.getUser();
            String itemId = shareAwemeContent2.getItemId();
            C85323Wm LIZ = C772831o.LIZ();
            C1HQ LIZ2 = C111074Xn.LIZ(LIZ, "eventSender", "enter_from", "chat", "author_id", user2);
            LIZ2.put("group_id", itemId);
            LIZ2.put("content", "video");
            LIZ2.put("display", "card");
            LIZ2.put("is_auto_play", CardStruct.IStatusCode.DEFAULT);
            LIZ.LIZIZ("client_show", LIZ2);
        }
        if (TextUtils.isEmpty(shareAwemeContent2.getItemId())) {
            o.LJIIIZ(Q7L.LIZJ("fetchPlayerData getItemId is empty", true), "msg");
        } else {
            Context context = this.itemView.getContext();
            if (context != null && (LIZIZ = C57434MgQ.LIZIZ(context)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LIZIZ)) != null) {
                XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new C3IK(this, msg, shareAwemeContent2, true, shareAwemeContent2, null), 2);
            }
        }
        AnonymousClass462 anonymousClass462 = this.LLF;
        if (anonymousClass462 != null) {
            anonymousClass462.LJI = shareAwemeContent2.getItemId();
        }
        if (C93793mB.LJ(msg)) {
            this.LLILLJJLI.setVisibility(0);
            this.LLILLJJLI.setText(s0());
        } else {
            this.LLILLJJLI.setVisibility(8);
        }
        if (SuggestedReplyExperiment.LIZJ() && !msg.isSelf()) {
            ((C46V) this.LLILZLL.getValue()).LIZ(msg);
        }
        x0(msg);
    }
}
