package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.480, reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass480 extends AnonymousClass460<TextContent> {
    public final EnumC110124Tw LLIIIL;
    public final View LLIIIZ;
    public final ImageView LLIIJI;
    public final TuxTextView LLIIJLIL;
    public View.OnClickListener LLIIL;
    public View.OnLongClickListener LLIILII;
    public AnonymousClass488 LLIILZL;
    public final AppCompatImageView LLIIZ;
    public final TuxIconView LLIL;
    public final C62822Ol8 LLILII;

    @Override // X.AbstractC1041546x
    public final boolean Y() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 == true) goto L6;
     */
    @Override // X.AbstractC1041546x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a0() {
        /*
            r3 = this;
            X.4Rq r0 = r3.LJZI
            if (r0 == 0) goto Lf
            boolean r1 = X.C93793mB.LIZLLL(r0)
            r0 = 1
            if (r1 != r0) goto Lf
        Lb:
            r2 = 0
            if (r0 == 0) goto L11
            return r2
        Lf:
            r0 = 0
            goto Lb
        L11:
            X.4Tw r1 = r3.LLIIIL
            X.4Tw r0 = X.EnumC110124Tw.TEXT_BIG_EMOJI_SEND
            if (r1 == r0) goto L1b
            X.4Tw r0 = X.EnumC110124Tw.TEXT_BIG_EMOJI_RECEIVE
            if (r1 != r0) goto L20
        L1b:
            android.view.View r0 = super.a0()
            return r0
        L20:
            X.470 r0 = r3.LJLJJI
            if (r0 == 0) goto L26
            android.view.View r2 = r0.LIZ
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass480.a0():android.view.View");
    }

    public final boolean v0() {
        EnumC110124Tw enumC110124Tw = this.LLIIIL;
        if (enumC110124Tw == EnumC110124Tw.TEXT_BIG_EMOJI_SEND || enumC110124Tw == EnumC110124Tw.TEXT_BIG_EMOJI_RECEIVE) {
            return true;
        }
        return false;
    }

    public final void w0() {
        if (this.LLIILZL == null) {
            View inflate = ((ViewStub) this.itemView.findViewById(R.id.iwd)).inflate();
            o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout");
            AnonymousClass488 anonymousClass488 = (AnonymousClass488) inflate;
            this.LLIILZL = anonymousClass488;
            L(anonymousClass488);
        }
        AnonymousClass488 anonymousClass4882 = this.LLIILZL;
        if (anonymousClass4882 == null) {
            return;
        }
        anonymousClass4882.setVisibility(0);
    }

    @Override // X.AbstractC1041546x
    public boolean X(C109544Rq c109544Rq) {
        return C93793mB.LJIIL(c109544Rq);
    }

    @Override // X.AbstractC1041546x
    public final void i0(View.OnLongClickListener onLongClickListener) {
        o.LJIIIZ(onLongClickListener, "onLongClickListener");
        super.i0(onLongClickListener);
        this.LLIILII = onLongClickListener;
    }

    @Override // X.AnonymousClass460, X.AbstractC1041546x
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        super.setOnClickListener(onClickListener);
        this.LLIIL = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass480(View itemView, EnumC110124Tw messageType) {
        super(itemView, messageType);
        C1045348j c1045348j;
        float f;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(messageType, "messageType");
        this.LLIIIL = messageType;
        this.LLILII = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 817));
        View findViewById = itemView.findViewById(R.id.gnu);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.msg_tv)");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.LLIIJLIL = tuxTextView;
        this.LLIIJI = (ImageView) itemView.findViewById(R.id.acf);
        AppCompatImageView appCompatImageView = (AppCompatImageView) itemView.findViewById(R.id.gnq);
        this.LLIIZ = appCompatImageView;
        this.LLIL = (TuxIconView) itemView.findViewById(R.id.kwr);
        if (v0()) {
            tuxTextView.LJJJ(48.0f);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
            this.LLIIIZ = null;
            return;
        }
        if (C1044648c.LIZ() && messageType.getContentLayoutId() != null) {
            View findViewById2 = itemView.findViewById(R.id.btl);
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C018905p c018905p = (C018905p) layoutParams;
            if (messageType.getMessagePositionType() == C47R.START) {
                f = 0.82f;
            } else {
                f = 0.2f;
            }
            c018905p.guidePercent = f;
            findViewById2.setLayoutParams(c018905p);
        }
        View findViewById3 = itemView.findViewById(R.id.gnv);
        this.LLIIIZ = findViewById3;
        if (!(findViewById3 instanceof C1045348j) || (c1045348j = (C1045348j) findViewById3) == null) {
            return;
        }
        c1045348j.setInterceptSwipeCallback(new AqS132S0200000_1(this, c1045348j, 57));
    }

    public void s0(boolean z, C49V backgroundConfig) {
        o.LJIIIZ(backgroundConfig, "backgroundConfig");
        View view = this.LLIIIZ;
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            C77413UZt.LJFF(gradientDrawable, backgroundConfig);
            view.setBackground(gradientDrawable);
        }
        AppCompatImageView appCompatImageView = this.LLIIZ;
        if (appCompatImageView != null) {
            if (z) {
                appCompatImageView.setVisibility(0);
                C48E c48e = backgroundConfig.LIZJ;
                if (c48e != null) {
                    this.LLIIZ.setColorFilter(c48e.LJLIL);
                    return;
                }
                return;
            }
            appCompatImageView.setVisibility(8);
        }
    }

    @Override // X.AbstractC1041546x
    public final void T(C81243Gu c81243Gu, C109544Rq msg, C109544Rq c109544Rq) {
        AnonymousClass472<TuxTextView> anonymousClass472;
        o.LJIIIZ(msg, "msg");
        super.T(c81243Gu, msg, c109544Rq);
        if (msg.getReferenceInfo() != null && (anonymousClass472 = this.LJLJLLL) != null) {
            anonymousClass472.LIZIZ();
        }
    }

    public C49V t0(boolean z, boolean z2, boolean z3) {
        boolean z4;
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        if (z && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        return C77413UZt.LJIILIIL(context, z4, z2, C90193gN.LIZ());
    }

    @Override // X.AbstractC1041546x
    public void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        boolean z;
        AnonymousClass488 anonymousClass488;
        o.LJIIIZ(msg, "msg");
        boolean LJJIJIIJIL = C78939UyV.LJJIJIIJIL(msg, c109544Rq);
        if (msg.getReferenceInfo() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!v0()) {
            boolean LJJIJIL = C78939UyV.LJJIJIL(msg, c109544Rq2);
            s0(LJJIJIL, t0(LJJIJIIJIL, LJJIJIL, z));
        }
        if (z) {
            boolean isSelf = msg.isSelf();
            boolean LIZ = C90193gN.LIZ();
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C49V c49v2 = new C49V(C49W.LIZ(isSelf, LJJIJIIJIL, LIZ), C1042447g.LJLIL, new C48E(AnonymousClass636.LJIIIIZZ(R.attr.cv, context)));
            AnonymousClass488 anonymousClass4882 = this.LLIILZL;
            if (anonymousClass4882 != null && (anonymousClass488 = (AnonymousClass488) anonymousClass4882.findViewById(R.id.iwd)) != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                C77413UZt.LJFF(gradientDrawable, c49v2);
                anonymousClass488.setBackgroundOutside(gradientDrawable);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.bytedance.tux.input.TuxTextView, android.widget.TextView, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    @Override // X.AnonymousClass460
    public final void p0(C109544Rq msg, C109544Rq c109544Rq, TextContent textContent, int i) {
        SpannableString spannableString;
        boolean z;
        int i2;
        TuxTextView tuxTextView;
        boolean z2;
        List<RichTextInfo> richTextInfos;
        C48D c48d;
        ?? spannableString2;
        final int i3;
        int i4;
        SpannableString spannableString3;
        final int i5;
        TextContent textContent2 = textContent;
        o.LJIIIZ(msg, "msg");
        C97223ri LJIIIZ = C96963rI.LJIIIZ();
        ImageView imageView = this.LLIIJI;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        LJIIIZ.getClass();
        C97223ri.LIZ(imageView, msg, itemView);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 1);
        }
        if (textContent2 == null || textContent2.getText() == null) {
            return;
        }
        int i6 = 0;
        if (textContent2.isDefault()) {
            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.eb);
            if (LIZIZ != null) {
                i5 = LIZIZ.intValue();
            } else {
                i5 = 0;
            }
            String text = textContent2.getText();
            o.LJIIIZ(text, "text");
            SpannableString spannableString4 = new SpannableString(text);
            String LIZLLL = C1DD.LIZLLL(R.string.h5h, "getApplicationContext().…R.string.im_download_apk)");
            if (s.LJJJLZIJ(text, LIZLLL, false)) {
                ClickableSpan clickableSpan = new ClickableSpan(i5) { // from class: X.3yM
                    public final int LJLIL;

                    {
                        this.LJLIL = i5;
                    }

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View widget) {
                        o.LJIIIZ(widget, "widget");
                        Context context = widget.getContext();
                        o.LJIIIIZZ(context, "widget.context");
                        Activity LJIJJ = C45804HyK.LJIJJ(context);
                        if (C85773Yf.LJLJI != null) {
                            Intent intent = new Intent(LJIJJ, (Class<?>) CrossPlatformActivity.class);
                            intent.setData(UriProtector.parse("https://go.onelink.me/bIdt/409f077"));
                            if (LJIJJ != null) {
                                C16880lQ.LIZJ(LJIJJ, intent);
                            }
                        }
                        FMX.onEventV3("click_update_message");
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint ds) {
                        o.LJIIIZ(ds, "ds");
                        ds.setColor(this.LJLIL);
                        ds.setUnderlineText(false);
                    }
                };
                int LJJLIIIJL = s.LJJLIIIJL(text, LIZLLL, 0, false, 6);
                spannableString4.setSpan(clickableSpan, LJJLIIIJL, LIZLLL.length() + LJJLIIIJL, 33);
            }
            this.LLIIJLIL.setText(spannableString4);
            return;
        }
        if (v0() || !C81253Gv.LIZ() || (richTextInfos = textContent2.getRichTextInfos()) == null || richTextInfos.isEmpty()) {
            if (textContent2.getText().length() <= 1024) {
                Object localCache = msg.getLocalCache(2);
                if ((localCache instanceof SpannableString) && (spannableString = (SpannableString) localCache) != null) {
                    this.LLIIJLIL.setText(spannableString);
                } else {
                    this.LLIIJLIL.setText(textContent2.getText());
                    C118824lS.LIZJ(this.LLIIJLIL, null);
                }
            } else {
                this.LLIIJLIL.setText(textContent2.getText());
            }
        } else {
            Object localCache2 = msg.getLocalCache(2);
            if ((localCache2 instanceof SpannableString) && (spannableString3 = (SpannableString) localCache2) != null) {
                this.LLIIJLIL.setText(spannableString3);
            } else {
                if (textContent2.getText() != null && textContent2.getRichTextInfos() != null) {
                    ?? textView = this.LLIIJLIL;
                    String text2 = textContent2.getText();
                    List<RichTextInfo> richTextInfoList = textContent2.getRichTextInfos();
                    if (msg.isSelf()) {
                        c48d = new C48D(C49R.LIZ.LIZIZ);
                    } else {
                        c48d = new C48D(R.attr.bw);
                    }
                    o.LJIIIZ(textView, "textView");
                    o.LJIIIZ(text2, "text");
                    o.LJIIIZ(richTextInfoList, "richTextInfoList");
                    if (text2.length() == 0 || richTextInfoList.isEmpty()) {
                        spannableString2 = textContent2.getText();
                    } else {
                        spannableString2 = new SpannableString(text2);
                        Context context = textView.getContext();
                        o.LJIIIIZZ(context, "textView.context");
                        Integer LJI = C79045V0n.LJI(c48d.LJLIL, context);
                        if (LJI != null) {
                            i3 = LJI.intValue();
                        } else {
                            i3 = -1;
                        }
                        for (RichTextInfo richTextInfo : richTextInfoList) {
                            final String str = richTextInfo.mentionedUid;
                            if (str != null && ((i4 = richTextInfo.type) == C3H0.MENTION_SINGLE.getValue() || i4 == C3H0.MENTION_ALL.getValue())) {
                                ClickableSpan clickableSpan2 = new ClickableSpan(i3, str) { // from class: X.3yF
                                    public final int LJLIL;
                                    public final String LJLILLLLZI;

                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View widget) {
                                        o.LJIIIZ(widget, "widget");
                                        if (!o.LJ(this.LJLILLLLZI, CardStruct.IStatusCode.DEFAULT)) {
                                            C84643Tw.LIZLLL(this.LJLILLLLZI, "chat", "dm_mention", null, 24);
                                            Context context2 = widget.getContext();
                                            o.LJIIIIZZ(context2, "widget.context");
                                            Activity LJIJJ = C45804HyK.LJIJJ(context2);
                                            if (LJIJJ != null) {
                                                StringBuilder LIZ = X1D.LIZ();
                                                LIZ.append("aweme://user/profile/");
                                                LIZ.append(this.LJLILLLLZI);
                                                SmartRouter.buildRoute(LJIJJ, X1D.LIZIZ(LIZ)).open();
                                            }
                                        }
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint ds) {
                                        o.LJIIIZ(ds, "ds");
                                        ds.setColor(this.LJLIL);
                                        ds.setUnderlineText(false);
                                    }

                                    {
                                        this.LJLIL = i3;
                                        this.LJLILLLLZI = str;
                                    }
                                };
                                int min = Math.min(richTextInfo.position + richTextInfo.length, text2.length());
                                spannableString2.setSpan(clickableSpan2, richTextInfo.position, min, 33);
                                spannableString2.setSpan(new T5U(32, true), richTextInfo.position, min, 33);
                            }
                        }
                    }
                    textView.setText(spannableString2);
                }
                C118824lS.LIZJ(this.LLIIJLIL, null);
            }
        }
        ReferenceInfo referenceInfo = msg.getReferenceInfo();
        AnonymousClass488 anonymousClass488 = this.LLIILZL;
        if (anonymousClass488 != null) {
            anonymousClass488.setVisibility(8);
        }
        if (referenceInfo != null) {
            if (C2304092m.LIZ() && this.LLIIJLIL.getVisibility() != 0) {
                this.LLIIJLIL.setVisibility(0);
            }
            w0();
            AnonymousClass488 anonymousClass4882 = this.LLIILZL;
            if (anonymousClass4882 != null) {
                View.OnClickListener onClickListener = this.LLIIL;
                C99033ud c99033ud = this.LJLLL;
                if (c99033ud != null && c99033ud.isHighRiskConversation()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                anonymousClass4882.LJ(msg, referenceInfo, onClickListener, z2);
            }
            if (!SuggestedReplyExperiment.LIZJ() || !SuggestedReplyExperiment.LJ()) {
                return;
            }
            AnonymousClass486 anonymousClass486 = (AnonymousClass486) this.LLILII.getValue();
            anonymousClass486.getClass();
            anonymousClass486.LIZIZ = msg;
            if (!SuggestedReplyExperiment.LIZJ() || !SuggestedReplyExperiment.LJ() || C46U.LJFF(msg)) {
                anonymousClass486.LIZ();
                return;
            }
            C77869UhF LIZJ = anonymousClass486.LIZJ();
            if (LIZJ == null) {
                return;
            }
            String LJ = C46U.LJ(msg);
            anonymousClass486.LJ = LJ;
            if (LJ == null || LJ.length() == 0) {
                anonymousClass486.LIZ();
                return;
            }
            anonymousClass486.LJI = true;
            LIZJ.setVisibility(0);
            anonymousClass486.LIZLLL();
            return;
        }
        if (textContent2.getRefVideo() != null) {
            BaseContent.ReferenceVideo refVideo = textContent2.getRefVideo();
            if (refVideo == null || !C78685UuP.LJJJZ(refVideo.getRefVideoId())) {
                return;
            }
            w0();
            final AnonymousClass488 anonymousClass4883 = this.LLIILZL;
            if (anonymousClass4883 == null) {
                return;
            }
            anonymousClass4883.LIZLLL(msg, refVideo, this.LLIIL);
            if (!C2304092m.LIZ()) {
                return;
            }
            final C47N swipeForReplyGestureHelper = this.LLFII;
            final C47R messagePositionType = this.LLIIIL.getMessagePositionType();
            View.OnLongClickListener onLongClickListener = this.LLIILII;
            TuxTextView tuxTextView2 = this.LLIIJLIL;
            TuxIconView tuxIconView = this.LLIL;
            View.OnClickListener onClickListener2 = this.LLIIL;
            InterfaceC1039746f interfaceC1039746f = this.LLFFF;
            o.LJIIIZ(swipeForReplyGestureHelper, "swipeForReplyGestureHelper");
            o.LJIIIZ(messagePositionType, "messagePositionType");
            if (anonymousClass4883.LJLJL == null) {
                View inflate = ((ViewStub) anonymousClass4883.findViewById(R.id.kl9)).inflate();
                if (inflate instanceof TuxTextView) {
                    tuxTextView = (TuxTextView) inflate;
                } else {
                    tuxTextView = null;
                }
                anonymousClass4883.LJLJL = tuxTextView;
                if (tuxTextView != null) {
                    tuxTextView.LJJJ(48.0f);
                }
            }
            anonymousClass4883.LJLL = msg.isSelf();
            anonymousClass4883.LJZ = interfaceC1039746f;
            anonymousClass4883.LJLZ = onClickListener2;
            if (C2304092m.LIZ() && o.LJ(msg.getScene(), "story_reaction")) {
                z = true;
                anonymousClass4883.LJLLLL = tuxTextView2;
                anonymousClass4883.LJLLLLLL = tuxIconView;
                TuxTextView tuxTextView3 = anonymousClass4883.LJLJL;
                if (tuxTextView3 != null) {
                    String text3 = textContent2.getText();
                    if (text3 == null) {
                        text3 = "";
                    }
                    tuxTextView3.setText(text3);
                }
                anonymousClass4883.setTag(50331648, 110);
                anonymousClass4883.setTag(134217728, msg);
                anonymousClass4883.setTag(100663296, textContent2);
                C16880lQ.LJJJJZ(anonymousClass4883, null);
                anonymousClass4883.setOnTouchListener(new View.OnTouchListener() { // from class: X.487
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View v, MotionEvent event) {
                        o.LJIIIZ(v, "v");
                        o.LJIIIZ(event, "event");
                        C16230kN gestureDetector = AnonymousClass488.this.getGestureDetector();
                        if (gestureDetector != null) {
                            Boolean valueOf = Boolean.valueOf(gestureDetector.LIZ(event));
                            if (valueOf.booleanValue()) {
                                valueOf.booleanValue();
                                return true;
                            }
                        }
                        swipeForReplyGestureHelper.LIZJ(v, messagePositionType, event);
                        return false;
                    }
                });
                anonymousClass4883.setOnLongClickListener(onLongClickListener);
                anonymousClass4883.LJFF(tuxIconView, false);
            } else {
                z = false;
                anonymousClass4883.LJLLLL = null;
                anonymousClass4883.LJLLLLLL = null;
                anonymousClass4883.setOnTouchListener(null);
                anonymousClass4883.setOnLongClickListener(null);
                anonymousClass4883.LJFF(tuxIconView, true);
            }
            TuxTextView tuxTextView4 = anonymousClass4883.LJLLLL;
            if (tuxTextView4 != null) {
                if (!z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                tuxTextView4.setVisibility(i2);
            }
            TuxTextView tuxTextView5 = anonymousClass4883.LJLJL;
            if (tuxTextView5 == null) {
                return;
            }
            if (!z) {
                i6 = 8;
            }
            tuxTextView5.setVisibility(i6);
            return;
        }
        AnonymousClass488 anonymousClass4884 = this.LLIILZL;
        if (anonymousClass4884 == null) {
            return;
        }
        anonymousClass4884.setVisibility(8);
    }
}
