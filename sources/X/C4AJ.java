package X;

import Y.IDCSpanS0S1100000_1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.IDqS448S0100000_1;
import kotlin.jvm.internal.o;
import o53.IDdS472S0100000_1;
import ujb.s;

/* renamed from: X.4AJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AJ extends AnonymousClass461<StickerTemplate> {
    public final View LLIIIJ;
    public final SmartImageView LLIIIL;
    public final ConstraintLayout LLIIIZ;
    public final LinearLayout LLIIJI;
    public final TuxTextView LLIIJLIL;
    public StickerTemplate LLIIL;
    public String LLIILII;

    public final void n0() {
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent;
        UrlModel urlModel;
        List<String> list;
        ImageComponent imageComponent;
        List<String> list2;
        Resources resources;
        Resources resources2;
        C17N.LJJIIJZLJL(this.LLIIJI);
        ViewGroup.LayoutParams layoutParams = null;
        r2 = null;
        String str = null;
        r2 = null;
        String str2 = null;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (C4LS.LIZIZ()) {
            C17N.LJJIIJZLJL(this.LLIIIL);
            C17N.LJJLIIIJJI(this.LLIIIZ);
            Context context = this.LLIIIZ.getContext();
            if (context != null && (resources2 = context.getResources()) != null) {
                str = resources2.getString(R.string.eti);
            }
            this.LLIIJLIL.setText(str);
            return;
        }
        StickerTemplate stickerTemplate = this.LLIIL;
        if (stickerTemplate != null) {
            stickerCardFallbackInfoComponent = stickerTemplate.fallbackInfo;
        } else {
            stickerCardFallbackInfoComponent = null;
        }
        StickerCardFallbackInfoComponent.Companion.getClass();
        if (!o.LJ(stickerCardFallbackInfoComponent, StickerCardFallbackInfoComponent.EMPTY_FALLBACK)) {
            C17N.LJJIIJZLJL(this.LLIIIL);
            C17N.LJJLIIIJJI(this.LLIIIZ);
            Context context2 = this.LLIIIZ.getContext();
            if (context2 != null && (resources = context2.getResources()) != null) {
                str2 = resources.getString(R.string.rog);
            }
            this.LLIIJLIL.setText(str2);
            return;
        }
        C17N.LJJLIIIJJI(this.LLIIIL);
        C17N.LJJIIJZLJL(this.LLIIIZ);
        StickerTemplate stickerTemplate2 = this.LLIIL;
        if (stickerTemplate2 != null && (imageComponent = stickerTemplate2.imageComponent) != null && (list2 = imageComponent.urls) != null) {
            urlModel = C78934UyQ.LJJIIJ(list2);
            if (urlModel != null) {
                list = urlModel.getUrlList();
                if (list != null || list.isEmpty()) {
                    p0(true);
                }
                String str3 = this.LLIILII;
                if (o.LJ(str3, String.valueOf(EnumC73222u6.STATIC.getType()))) {
                    ViewGroup.LayoutParams layoutParams3 = this.LLIIIL.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = C7MY.LIZIZ(112);
                        layoutParams3.height = C7MY.LIZIZ(112);
                        layoutParams2 = layoutParams3;
                    }
                    this.LLIIIL.setLayoutParams(layoutParams2);
                    C4AS.LJII(this.LLIIIL, urlModel, "SetStickerReceiveViewHolder", null, null, C7MY.LIZIZ(112), C7MY.LIZIZ(112), 408);
                    return;
                }
                if (o.LJ(str3, String.valueOf(EnumC73222u6.VIDEO_STICKER_STATIC.getType()))) {
                    ViewGroup.LayoutParams layoutParams4 = this.LLIIIL.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.height = o0();
                        layoutParams4.width = C7MY.LIZIZ(UserLevelGeckoUpdateSetting.DEFAULT);
                    }
                    this.LLIIIL.setLayoutParams(layoutParams4);
                    if (HK5.LIZIZ) {
                        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                        LJII.LJJIIJ = this.LLIIIL;
                        C43659HBn.LJIILIIL(LJII, EnumC61782be.STORE_STICKER);
                        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(UserLevelGeckoUpdateSetting.DEFAULT)));
                        int o0 = o0();
                        LJII.LJII = LJJIIZ;
                        LJII.LJIIIIZZ = o0;
                        LJII.LIZLLL(new C81929WDl("sticker_store_chat_video_sticker_opt", false, null, null, new IDqS426S0100000_1(this, 15), 28));
                        return;
                    }
                    C4AS.LJII(this.LLIIIL, urlModel, "sticker_store_chat_video_sticker", new IDdS472S0100000_1(this, 1), null, C7MY.LIZIZ(UserLevelGeckoUpdateSetting.DEFAULT), o0(), LiveChatShowDelayForHotLiveSetting.DEFAULT);
                    return;
                }
                if (o.LJ(str3, String.valueOf(EnumC73222u6.ANIMATED.getType()))) {
                    ViewGroup.LayoutParams layoutParams5 = this.LLIIIL.getLayoutParams();
                    if (layoutParams5 != null) {
                        layoutParams5.width = C7MY.LIZIZ(112);
                        layoutParams5.height = C7MY.LIZIZ(112);
                        layoutParams = layoutParams5;
                    }
                    this.LLIIIL.setLayoutParams(layoutParams);
                    C4AS.LIZIZ(this.LLIIIL, urlModel, "SetStickerReceiveViewHolder", C7MY.LIZIZ(112), C7MY.LIZIZ(112), 0, 0, null, 480);
                    return;
                }
                if (!o.LJ(str3, String.valueOf(EnumC73222u6.VIDEO_STICKER_ANIMATED.getType()))) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams6 = this.LLIIIL.getLayoutParams();
                if (layoutParams6 != null) {
                    layoutParams6.height = o0();
                    layoutParams6.width = C7MY.LIZIZ(UserLevelGeckoUpdateSetting.DEFAULT);
                }
                this.LLIIIL.setLayoutParams(layoutParams6);
                if (HK5.LIZIZ) {
                    W5F LJII2 = W5U.LJII(C78939UyV.LJ(urlModel));
                    LJII2.LJJIIJ = this.LLIIIL;
                    int LIZIZ = C7MY.LIZIZ(UserLevelGeckoUpdateSetting.DEFAULT);
                    int o02 = o0();
                    LJII2.LJII = LIZIZ;
                    LJII2.LJIIIIZZ = o02;
                    LJII2.LIZLLL = true;
                    C43659HBn.LJIILIIL(LJII2, EnumC61782be.STORE_STICKER);
                    LJII2.LIZLLL(new C81929WDl("sticker_store_chat_video_sticker_opt", false, null, new IDqS448S0100000_1(this, 1), new IDqS426S0100000_1(this, 16), 12));
                    return;
                }
                C4AS.LIZIZ(this.LLIIIL, urlModel, "sticker_store_chat_video_sticker", C7MY.LIZIZ(UserLevelGeckoUpdateSetting.DEFAULT), o0(), 0, 0, new InterfaceC81853WAn() { // from class: X.4AK
                    @Override // X.InterfaceC81853WAn
                    public final void LIZJ(String str4) {
                    }

                    @Override // X.InterfaceC81853WAn
                    public final boolean LIZLLL() {
                        return false;
                    }

                    @Override // X.InterfaceC81853WAn
                    public final void LIZIZ(String str4, Throwable th) {
                        C4AJ.this.p0(false);
                    }

                    @Override // X.InterfaceC81853WAn
                    public final void LIZ(String str4, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
                        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent2;
                        Keva kevaRepo = C105004Ae.LIZ();
                        o.LJIIIIZZ(kevaRepo, "kevaRepo");
                        StickerTemplate stickerTemplate3 = C4AJ.this.LLIIL;
                        if (stickerTemplate3 != null) {
                            stickerCardFallbackInfoComponent2 = stickerTemplate3.fallbackInfo;
                        } else {
                            stickerCardFallbackInfoComponent2 = null;
                        }
                        StickerCardFallbackInfoComponent.Companion.getClass();
                        if (!o.LJ(stickerCardFallbackInfoComponent2, StickerCardFallbackInfoComponent.EMPTY_FALLBACK)) {
                            C17N.LJJLIIIJJI(C4AJ.this.LLIIIZ);
                            C17N.LJJIIJZLJL(C4AJ.this.LLIIIL);
                            C17N.LJJIIJZLJL(C4AJ.this.LLIIJI);
                        } else {
                            C17N.LJJLIIIJJI(C4AJ.this.LLIIIL);
                            C17N.LJJIIJZLJL(C4AJ.this.LLIIIZ);
                            C17N.LJJIIJZLJL(C4AJ.this.LLIIJI);
                        }
                    }
                }, 224);
                return;
            }
        } else {
            urlModel = null;
        }
        list = null;
        if (list != null) {
        }
        p0(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o0() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate r1 = r4.LLIIL
            r3 = 1
            if (r1 == 0) goto L2e
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r1.imageComponent
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent r0 = r0.resolution
            if (r0 == 0) goto L2e
            int r2 = r0.width
        Lf:
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r1.imageComponent
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent r0 = r0.resolution
            if (r0 == 0) goto L32
            int r1 = r0.height
        L19:
            if (r2 != 0) goto L2c
        L1b:
            r0 = 140(0x8c, float:1.96E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            int r0 = r0 * r1
            int r0 = r0 / r3
            return r0
        L2c:
            r3 = r2
            goto L1b
        L2e:
            r2 = 1
            if (r1 == 0) goto L32
            goto Lf
        L32:
            r1 = 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4AJ.o0():int");
    }

    @Override // X.AbstractC1041546x
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n0();
    }

    public final void p0(final boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (o.LJ(this.LLIILII, String.valueOf(EnumC73222u6.VIDEO_STICKER_STATIC.getType())) || o.LJ(this.LLIILII, String.valueOf(EnumC73222u6.VIDEO_STICKER_ANIMATED.getType()))) {
            LinearLayout linearLayout = this.LLIIJI;
            C17N.LJJLIIIJJI(linearLayout);
            if (!z && (layoutParams = linearLayout.getLayoutParams()) != null) {
                layoutParams.height = o0();
                layoutParams.width = C7MY.LIZIZ(UserLevelGeckoUpdateSetting.DEFAULT);
            }
            C17N.LJJIIJZLJL(this.LLIIIL);
            C17N.LJJIIJZLJL(this.LLIIIZ);
            C16880lQ.LJIIZILJ(this.LLIIJI, new View.OnClickListener() { // from class: X.4AL
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C109544Rq c109544Rq;
                    C4AJ.this.n0();
                    if (z && (c109544Rq = C4AJ.this.LJZI) != null) {
                        InterfaceC104994Ad.LIZ.LIZ(c109544Rq);
                    }
                }
            });
            VA9 va9 = (VA9) this.LLIIJI.findViewById(R.id.cyf);
            if (va9 != null) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_refresh;
                c2068389v.LJ = Integer.valueOf(R.attr.gp);
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                va9.setImageDrawable(c2068389v.LIZ(context));
            }
            TextView textView = (TextView) this.LLIIJI.findViewById(R.id.cyu);
            if (textView != null) {
                textView.setText(R.string.emb);
            }
        }
    }

    @Override // X.AbstractC1041546x
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        super.setOnClickListener(onClickListener);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZ(onClickListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4AJ(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIIJ = findViewById;
        View findViewById2 = itemView.findViewById(R.id.hpc);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.picture_iv)");
        this.LLIIIL = (SmartImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.hr4);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.placeholder_container)");
        this.LLIIIZ = (ConstraintLayout) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.cy6);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.error_content)");
        this.LLIIJI = (LinearLayout) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.hr8);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.placeholder_text)");
        this.LLIIJLIL = (TuxTextView) findViewById5;
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        V8L v8l;
        Integer LJI;
        o.LJIIIZ(msg, "msg");
        Context context = this.LLIIIL.getContext();
        if (context == null) {
            return;
        }
        if (C4LS.LIZIZ()) {
            Integer LJI2 = C79045V0n.LJI(R.attr.cv, context);
            if (LJI2 != null) {
                int intValue = LJI2.intValue();
                View view = this.LLIIIJ;
                GradientDrawable gradientDrawable = new GradientDrawable();
                C77413UZt.LJFF(gradientDrawable, new C49V(c49v.LIZ, c49v.LIZIZ, new C48E(intValue)));
                view.setBackground(gradientDrawable);
                return;
            }
            return;
        }
        Integer LJI3 = C79045V0n.LJI(C49R.LIZ.LIZLLL, context);
        if (LJI3 != null) {
            this.LLIIIL.setBackgroundColor(LJI3.intValue());
        }
        V92 hierarchy = this.LLIIIL.getHierarchy();
        C48E c48e = null;
        if (hierarchy != null) {
            C4AH c4ah = c49v.LIZ;
            if (c4ah != null) {
                Context context2 = this.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                v8l = g0.LJJJI(c4ah, context2);
            } else {
                v8l = null;
            }
            hierarchy.LJIL(v8l);
        }
        StickerTemplate stickerTemplate = (StickerTemplate) C1DJ.LJIILL(msg);
        if (stickerTemplate == null) {
            return;
        }
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent = stickerTemplate.fallbackInfo;
        StickerCardFallbackInfoComponent.Companion.getClass();
        if (!o.LJ(stickerCardFallbackInfoComponent, StickerCardFallbackInfoComponent.EMPTY_FALLBACK)) {
            View view2 = this.LLIIIJ;
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            Integer LJI4 = C79045V0n.LJI(R.attr.cv, context);
            if (LJI4 != null) {
                c48e = new C48E(LJI4.intValue());
            }
            C77413UZt.LJFF(gradientDrawable2, new C49V(c49v.LIZ, c49v.LIZIZ, c48e));
            view2.setBackground(gradientDrawable2);
        }
        String str = stickerTemplate.LLLL().queryData.extras.get("a:sticker_type");
        if ((o.LJ(str, String.valueOf(EnumC73222u6.VIDEO_STICKER_ANIMATED.getType())) || o.LJ(str, String.valueOf(EnumC73222u6.VIDEO_STICKER_STATIC.getType()))) && (LJI = C79045V0n.LJI(R.attr.cv, context)) != null) {
            int intValue2 = LJI.intValue();
            View view3 = this.LLIIIJ;
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            C77413UZt.LJFF(gradientDrawable3, new C49V(c49v.LIZ, c49v.LIZIZ, new C48E(intValue2)));
            view3.setBackground(gradientDrawable3);
        }
    }

    @Override // X.AnonymousClass461
    public final void m0(C109544Rq msg, C109544Rq c109544Rq, StickerTemplate stickerTemplate, int i) {
        int i2;
        C109544Rq c109544Rq2;
        java.util.Map<String, String> localExt;
        Integer num;
        final String str;
        StickerTemplate stickerTemplate2 = stickerTemplate;
        o.LJIIIZ(msg, "msg");
        this.LLIIL = stickerTemplate2;
        String str2 = stickerTemplate2.LLLL().queryData.extras.get("a:sticker_type");
        this.LLIILII = str2;
        if (o.LJ(str2, String.valueOf(EnumC73222u6.STATIC.getType())) || o.LJ(this.LLIILII, String.valueOf(EnumC73222u6.ANIMATED.getType()))) {
            i2 = 103;
        } else {
            i2 = 104;
        }
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, Integer.valueOf(i2));
        }
        AnonymousClass470 anonymousClass4702 = this.LJLJJI;
        if (anonymousClass4702 != null) {
            anonymousClass4702.LIZIZ(150994944, stickerTemplate2);
        }
        if (C88963eO.LIZLLL() && !C88963eO.LIZJ() && (c109544Rq2 = this.LJZI) != null && (localExt = c109544Rq2.getLocalExt()) != null && localExt.containsKey("a:sticker_store_inline")) {
            C109544Rq c109544Rq3 = this.LJZI;
            ForegroundColorSpan foregroundColorSpan = null;
            if (c109544Rq3 != null) {
                num = Integer.valueOf(c109544Rq3.getConversationType());
            } else {
                num = null;
            }
            int i3 = AbstractC63505Ow9.LIZIZ;
            if (num == null || num.intValue() != i3) {
                str = "private";
            } else {
                str = "group";
            }
            TuxTextView LIZ = this.LJLL.LIZ();
            if (LIZ != null) {
                Context context = LIZ.getContext();
                o.LJIIIIZZ(context, "noticeTv.context");
                IDCSpanS0S1100000_1 iDCSpanS0S1100000_1 = new IDCSpanS0S1100000_1(this, str, 2);
                String LIZ2 = C29822Bn8.LIZ(context, R.string.haw, "context.resources.getStr…chat_findMoreSticker_btn)");
                String string = context.getResources().getString(R.string.hav, LIZ2);
                o.LJIIIIZZ(string, "context.resources.getStr…reSticker, clickableText)");
                int LJJLIIIJL = s.LJJLIIIJL(string, LIZ2, 0, false, 6);
                int length = LIZ2.length() + LJJLIIIJL;
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(iDCSpanS0S1100000_1, LJJLIIIJL, length, 18);
                spannableString.setSpan(new T5U(62, false), LJJLIIIJL, length, 18);
                Integer LJI = C79045V0n.LJI(R.attr.gu, context);
                if (LJI != null) {
                    foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
                }
                spannableString.setSpan(foregroundColorSpan, LJJLIIIJL, length, 18);
                LIZ.setText(spannableString);
                LIZ.setMovementMethod(LinkMovementMethod.getInstance());
                LIZ.setVisibility(0);
                C12460eI.LIZLLL(LIZ, new AbstractC13940gg() { // from class: X.4AN
                    public final C4AM LJ = C4AM.LJLIL;

                    @Override // X.AbstractC13940gg
                    public final java.util.Map LJFF() {
                        return C113554cx.LJJJLZIJ(new OSZ("enter_from", "chat"), new OSZ("chat_type", str), new OSZ("platform", "internal"), new OSZ(WM7.SCENE_SERVICE, "sticker_store"));
                    }

                    @Override // X.AbstractC13940gg
                    public final InterfaceC65784Pro<String> LIZ() {
                        return this.LJ;
                    }
                });
            }
        }
    }
}
