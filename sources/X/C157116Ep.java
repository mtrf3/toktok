package X;

import Y.ACListenerS26S0400000_2;
import Y.ACListenerS2S1301000_2;
import Y.AUListenerS90S0100000_1;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MusicInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.base.AudioCopyrightLearnMoreFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS4S1301000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6Ep, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157116Ep {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(R.string.w_);
        creativeToastBuilder.duration(5000L);
        C78915Uy7.LJJIIZI(activity, 3012, creativeToastBuilder);
    }

    public static final void LIZLLL(Activity activity) {
        o.LJIIIZ(activity, "activity");
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(R.string.wa);
        creativeToastBuilder.icon(R.raw.icon_tick_fill_small);
        creativeToastBuilder.iconColorRes(R.attr.e8);
        creativeToastBuilder.duration(3000L);
        C78915Uy7.LJJIIZI(activity, 3012, creativeToastBuilder);
    }

    public static void LIZ(View view, boolean z) {
        ValueAnimator ofInt;
        if (z) {
            ofInt = ValueAnimator.ofInt(0, C17N.LJIILL(130.0d));
        } else {
            ofInt = ValueAnimator.ofInt(C17N.LJIILL(130.0d), 0);
        }
        ofInt.addUpdateListener(new AUListenerS90S0100000_1(view, 21));
        ofInt.setDuration(250L);
        ofInt.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v106, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet, androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r6v27, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet, androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet, androidx.fragment.app.DialogFragment] */
    public static final TuxSheet LIZIZ(final FragmentManager supportFragmentManager, final Context context, final PreCheckResult preCheckResult, final VideoPublishEditModel videoPublishEditModel, final String enterFrom, String enterMethod, int i, Integer num, InterfaceC88472Yns<? super C6EX, C76800UCe> interfaceC88472Yns, final InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns2) {
        boolean z;
        TuxSheet tuxSheet;
        final boolean z2;
        final int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        String quantityString;
        int i6;
        boolean z4;
        TuxSheet tuxSheet2;
        o.LJIIIZ(supportFragmentManager, "supportFragmentManager");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        if (i == EnumC139485dg.ECOMMERCE.getScene()) {
            C68322mC c68322mC = new C68322mC();
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS4S1301000_2(c68322mC, (C68322mC<TuxSheet>) interfaceC88472Yns2, (InterfaceC88472Yns<? super Integer, C76800UCe>) videoPublishEditModel, (VideoPublishEditModel) enterFrom, (String) i, 4));
            c235119Kp.LIZIZ(LIZJ);
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.amj, null, false);
            o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…sult_layout, null, false)");
            SY4 sy4 = (SY4) LLLLIILL.findViewById(R.id.avc);
            if (sy4 != null) {
                C16880lQ.LJJIZ(sy4, new ACListenerS2S1301000_2(c68322mC, interfaceC88472Yns2, videoPublishEditModel, enterFrom, i, 1));
            }
            LinearLayout linearLayout = (LinearLayout) LLLLIILL.findViewById(R.id.c9i);
            linearLayout.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) LLLLIILL.findViewById(R.id.c6x);
            try {
                Iterator<MusicInfo> it = preCheckResult.musicInfos.iterator();
                while (it.hasNext()) {
                    MusicInfo next = it.next();
                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    SpannableString spannableString = new SpannableString(next.name);
                    spannableString.setSpan(new C8FW(C17N.LJIILL(6.0d)), 0, 0, 18);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    tuxTextView.setText(spannableStringBuilder);
                    tuxTextView.setTextColor(context.getResources().getColor(R.color.cs));
                    tuxTextView.setTextSize(15.0f);
                    viewGroup.addView(tuxTextView);
                }
                tuxSheet2 = 0;
                tuxSheet2 = 0;
                try {
                    TuxTextView tuxTextView2 = new TuxTextView(context, tuxSheet2, 6, 0);
                    tuxTextView2.setText(context.getResources().getString(R.string.w5));
                    tuxTextView2.setTextSize(15.0f);
                    tuxTextView2.setTextColor(context.getResources().getColor(R.color.cs));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.topMargin = C17N.LJIILL(16.0d);
                    viewGroup.addView(tuxTextView2, layoutParams);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                tuxSheet2 = 0;
            }
            linearLayout.requestDisallowInterceptTouchEvent(true);
            TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.ean);
            C34K c34k = new C34K();
            LinearLayout linearLayout2 = (LinearLayout) LLLLIILL.findViewById(R.id.g2l);
            if (linearLayout2 != null) {
                C16880lQ.LJIIZILJ(linearLayout2, new ACListenerS26S0400000_2(c34k, linearLayout, tuxIconView, interfaceC88472Yns2, 1));
            }
            ASL asl = new ASL();
            TuxSheet tuxSheet3 = asl.LIZ;
            tuxSheet3.LJLLL = c235119Kp;
            tuxSheet3.LJLLI = LLLLIILL;
            asl.LJI(1);
            ?? r6 = asl.LIZ;
            r6.LJLLJ = true;
            r6.LJLJI = false;
            r6.LJZI = false;
            c68322mC.element = r6;
            r6.show(supportFragmentManager, "showCopyRightResultDialog");
            String creationId = videoPublishEditModel.getCreationId();
            o.LJIIIIZZ(creationId, "videoPublishEditModel.creationId");
            String str = videoPublishEditModel.mShootWay;
            o.LJIIIIZZ(str, "videoPublishEditModel.mShootWay");
            C6ES.LJII(i, videoPublishEditModel.getVideoLength(), creationId, str, C78983UzD.LJJJJJL(videoPublishEditModel) ? 1 : 0, String.valueOf(videoPublishEditModel.draftId), enterFrom, "", H7R.LJIIIZ(videoPublishEditModel), H7R.LJIIIIZZ(videoPublishEditModel), videoPublishEditModel.getMusicId());
            return tuxSheet2;
        }
        if (i == EnumC139485dg.LONG_VIDEO_NEW.getScene() || i == EnumC139485dg.SHORT_VIDEO.getScene()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            final C68322mC c68322mC2 = new C68322mC();
            if (C1JD.LJIIJJI(videoPublishEditModel) && !C5HR.LIZ() && !C5HS.LIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            final boolean LIZIZ = C146535p3.LIZIZ(i);
            ArrayList<MatchDetailsV1> arrayList = preCheckResult.matchDetailsV1;
            if (arrayList != null) {
                i2 = arrayList.size();
            } else {
                i2 = 0;
            }
            C235119Kp c235119Kp2 = new C235119Kp();
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_x_mark_small;
            LIZJ2.LIZLLL = true;
            LIZJ2.LIZIZ(new AqS4S1301000_2(c68322mC2, (C68322mC<TuxSheet>) interfaceC88472Yns2, (InterfaceC88472Yns<? super Integer, C76800UCe>) videoPublishEditModel, (VideoPublishEditModel) enterFrom, (String) i, 5));
            c235119Kp2.LIZIZ(LIZJ2);
            View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.amb, null, false);
            o.LJIIIIZZ(LLLLIILL2, "from(context).inflate(resId, null, false)");
            final SY4 sy42 = (SY4) LLLLIILL2.findViewById(R.id.avc);
            sy42.getClass();
            sy42.setText(context.getResources().getQuantityString(R.plurals.rz, i2));
            if (LIZIZ && interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(new C6EX() { // from class: X.3Y0
                    @Override // X.C6EX
                    public final void onComplete() {
                        SY4.this.setButtonVariant(0);
                        SY4.this.setText(context.getResources().getQuantityString(R.plurals.rz, i2));
                        SY4.this.setClickable(true);
                    }

                    @Override // X.C6EX
                    public final void onProgress(int i7) {
                        SY4.this.setButtonVariant(5);
                        SY4 sy43 = SY4.this;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(context.getResources().getQuantityString(R.plurals.rs, i2));
                        LIZ2.append(i7);
                        LIZ2.append('%');
                        sy43.setText(X1D.LIZIZ(LIZ2));
                        SY4.this.setClickable(false);
                    }
                });
            }
            final int i7 = i;
            C16880lQ.LJJIZ(sy42, new View.OnClickListener() { // from class: X.6Eq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (LIZIZ) {
                        try {
                            if (C2NU.LIZ.LIZIZ()) {
                                InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns2;
                                if (interfaceC88472Yns3 != null) {
                                    interfaceC88472Yns3.invoke(4);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        Activity LJIJJ = C45804HyK.LJIJJ(context);
                        if (LJIJJ != null || (LJIJJ = C42470Gle.LIZ()) != null) {
                            C24540xm.LIZ(R.string.im9, LJIJJ, 6001);
                            return;
                        }
                        return;
                    }
                    TuxSheet tuxSheet4 = c68322mC2.element;
                    if (tuxSheet4 != null) {
                        tuxSheet4.dismissAllowingStateLoss();
                    }
                    InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns4 = interfaceC88472Yns2;
                    if (interfaceC88472Yns4 != null) {
                        interfaceC88472Yns4.invoke(1);
                    }
                    TuxSheet tuxSheet5 = c68322mC2.element;
                    if (tuxSheet5 != null) {
                        tuxSheet5.dismissAllowingStateLoss();
                    }
                    String creationId2 = videoPublishEditModel.getCreationId();
                    o.LJIIIIZZ(creationId2, "videoPublishEditModel.creationId");
                    String str2 = videoPublishEditModel.mShootWay;
                    o.LJIIIIZZ(str2, "videoPublishEditModel.mShootWay");
                    C6ES.LJ(creationId2, str2, String.valueOf(videoPublishEditModel.draftId), enterFrom, H7R.LJIIIZ(videoPublishEditModel), H7R.LJIIIIZZ(videoPublishEditModel), i7, videoPublishEditModel.getMusicId(), videoPublishEditModel.getVideoLength(), C78983UzD.LJJJJJL(videoPublishEditModel) ? 1 : 0);
                }
            });
            SY4 sy43 = (SY4) LLLLIILL2.findViewById(R.id.az8);
            C5HA.LIZ.getClass();
            FFL.LJIIIZ().getClass();
            if (FFL.LJIIJ(31744, 0, "audio_copyright_shorten_video_show", true) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || !C44384HbQ.LJJIIZI(videoPublishEditModel) || !z2 || i7 == EnumC139485dg.SHORT_VIDEO.getScene()) {
                i3 = 8;
                sy43.setVisibility(8);
            } else {
                sy43.setBackgroundResource(R.drawable.qi);
                i7 = i7;
                C16880lQ.LJJIZ(sy43, new ACListenerS2S1301000_2(c68322mC2, interfaceC88472Yns2, videoPublishEditModel, enterFrom, i7, 2));
                i3 = 8;
            }
            SY4 sy44 = (SY4) LLLLIILL2.findViewById(R.id.avq);
            if (o.LJ(enterMethod, "click_add_sound") && !LIZIZ) {
                sy44.setVisibility(i3);
            } else {
                sy44.setBackgroundResource(R.drawable.qi);
                C16880lQ.LJJIZ(sy44, new ACListenerS2S1301000_2(c68322mC2, interfaceC88472Yns2, videoPublishEditModel, enterFrom, i7, 3));
                if (o.LJ(enterFrom, "video_edit_page")) {
                    i4 = R.string.q0a;
                } else {
                    i4 = R.string.q0t;
                }
                sy44.setText(context.getString(i4));
            }
            String string = context.getString(R.string.seg);
            o.LJIIIIZZ(string, "context.getString(R.string.toast_learn_more)");
            if (C149275tT.LIZIZ()) {
                if (z2) {
                    quantityString = context.getString(R.string.rfz, string);
                } else {
                    quantityString = context.getString(R.string.rg0, string);
                }
            } else {
                Resources resources = context.getResources();
                if (o.LJ(enterFrom, "video_edit_page")) {
                    if (z2) {
                        i5 = R.plurals.rq;
                    } else {
                        i5 = R.plurals.rt;
                    }
                } else if (z2) {
                    i5 = R.plurals.ry;
                } else {
                    i5 = R.plurals.s0;
                }
                quantityString = resources.getQuantityString(i5, i2, string);
            }
            o.LJIIIIZZ(quantityString, "if (AudioCopyrightUXUpda…,\n            )\n        }");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(quantityString);
            int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder2, string, 0, false, 6);
            final int i8 = i2;
            final int i9 = i7;
            spannableStringBuilder2.setSpan(new ClickableSpan() { // from class: X.6F0
                @Override // android.text.style.ClickableSpan
                public final void onClick(View widget) {
                    o.LJIIIZ(widget, "widget");
                    FragmentManager supportFragmentManager2 = FragmentManager.this;
                    Context context2 = context;
                    PreCheckResult result = preCheckResult;
                    boolean z5 = z2;
                    int i10 = i8;
                    o.LJIIIZ(supportFragmentManager2, "supportFragmentManager");
                    o.LJIIIZ(context2, "context");
                    o.LJIIIZ(result, "result");
                    ASL asl2 = new ASL();
                    asl2.LIZ.LJLLILLLL = new AudioCopyrightLearnMoreFragment(context2, result, z5, i10);
                    asl2.LJI(1);
                    int LIZIZ2 = C170576mj.LIZIZ(context2);
                    TuxSheet tuxSheet4 = asl2.LIZ;
                    tuxSheet4.LJLLLLLL = LIZIZ2;
                    tuxSheet4.LJLLJ = true;
                    tuxSheet4.LJZL = true;
                    tuxSheet4.LJZI = true;
                    tuxSheet4.show(supportFragmentManager2, "showCopyRightLearnMoreDialog");
                    String creationId2 = videoPublishEditModel.getCreationId();
                    o.LJIIIIZZ(creationId2, "videoPublishEditModel.creationId");
                    String str2 = videoPublishEditModel.mShootWay;
                    o.LJIIIIZZ(str2, "videoPublishEditModel.mShootWay");
                    String enterFrom2 = enterFrom;
                    String contentType = H7R.LJIIIZ(videoPublishEditModel);
                    String contentSource = H7R.LJIIIIZZ(videoPublishEditModel);
                    int i11 = i9;
                    int videoLength = videoPublishEditModel.getVideoLength();
                    boolean LJJJJJL = C78983UzD.LJJJJJL(videoPublishEditModel);
                    o.LJIIIZ(enterFrom2, "enterFrom");
                    o.LJIIIZ(contentType, "contentType");
                    o.LJIIIZ(contentSource, "contentSource");
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("creation_id", creationId2);
                    c188727au.LJIIIZ("shoot_way", str2);
                    c188727au.LJIIIZ("enter_from", enterFrom2);
                    c188727au.LJIIIZ("content_type", contentType);
                    c188727au.LJIIIZ("content_source", contentSource);
                    c188727au.LIZLLL(videoLength, "creation_duration");
                    C6ES.LIZ(i11, LJJJJJL ? 1 : 0, c188727au);
                    FMX.LJIIL("sound_copyright_learn_more_click", c188727au.LIZ);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                    T5S t5s = new T5S();
                    t5s.LIZ(42);
                    ds.setTypeface(t5s.getTypeface());
                }
            }, LJJLIIIJL, string.length() + LJJLIIIJL, 34);
            TextView textView = (TextView) LLLLIILL2.findViewById(R.id.m4u);
            textView.setText(spannableStringBuilder2);
            textView.setMovementMethod(new LinkMovementMethod());
            TextView textView2 = (TextView) LLLLIILL2.findViewById(R.id.mo6);
            Resources resources2 = context.getResources();
            if (C149275tT.LIZIZ()) {
                i6 = R.string.rg1;
            } else {
                i6 = R.string.q0v;
            }
            textView2.setText(resources2.getString(i6));
            if (C149275tT.LIZIZ()) {
                z4 = false;
                ((ImageView) LLLLIILL2.findViewById(R.id.fcp)).setVisibility(0);
                ((ImageView) LLLLIILL2.findViewById(R.id.fco)).setVisibility(8);
            } else {
                ((ImageView) LLLLIILL2.findViewById(R.id.fcp)).setVisibility(8);
                ((ImageView) LLLLIILL2.findViewById(R.id.fco)).setVisibility(0);
                z4 = false;
            }
            ASL asl2 = new ASL();
            TuxSheet tuxSheet4 = asl2.LIZ;
            tuxSheet4.LJLLL = c235119Kp2;
            tuxSheet4.LJLLI = LLLLIILL2;
            asl2.LJI(1);
            ?? r3 = asl2.LIZ;
            r3.LJLLJ = true;
            r3.LJLJI = true;
            r3.LJZI = z4;
            c68322mC2.element = r3;
            r3.show(supportFragmentManager, "showCopyRightResultDialog");
            String creationId2 = videoPublishEditModel.getCreationId();
            o.LJIIIIZZ(creationId2, "videoPublishEditModel.creationId");
            String str2 = videoPublishEditModel.mShootWay;
            o.LJIIIIZZ(str2, "videoPublishEditModel.mShootWay");
            C6ES.LJII(i7, videoPublishEditModel.getVideoLength(), creationId2, str2, C78983UzD.LJJJJJL(videoPublishEditModel) ? 1 : 0, String.valueOf(videoPublishEditModel.draftId), enterFrom, enterMethod, H7R.LJIIIZ(videoPublishEditModel), H7R.LJIIIIZZ(videoPublishEditModel), videoPublishEditModel.getMusicId());
            if (num != null) {
                interfaceC88472Yns2.invoke(Integer.valueOf(num.intValue()));
            }
            return (TuxSheet) c68322mC2.element;
        }
        C68322mC c68322mC3 = new C68322mC();
        C235119Kp c235119Kp3 = new C235119Kp();
        C234529Ii LIZJ3 = s1.LIZJ();
        LIZJ3.LIZJ = R.raw.icon_x_mark_small;
        LIZJ3.LIZLLL = true;
        LIZJ3.LIZIZ(new AqS4S1301000_2(c68322mC3, (C68322mC<TuxSheet>) interfaceC88472Yns2, (InterfaceC88472Yns<? super Integer, C76800UCe>) videoPublishEditModel, (VideoPublishEditModel) enterFrom, (String) i, 3));
        c235119Kp3.LIZIZ(LIZJ3);
        View LLLLIILL3 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ama, null, false);
        o.LJIIIIZZ(LLLLIILL3, "from(context).inflate(resId, null, false)");
        SY4 sy45 = (SY4) LLLLIILL3.findViewById(R.id.avc);
        if (sy45 != null) {
            C16880lQ.LJJIZ(sy45, new ACListenerS2S1301000_2(c68322mC3, interfaceC88472Yns2, videoPublishEditModel, enterFrom, i, 0));
        }
        LinearLayout linearLayout3 = (LinearLayout) LLLLIILL3.findViewById(R.id.c9i);
        linearLayout3.setVisibility(8);
        ViewGroup viewGroup2 = (ViewGroup) LLLLIILL3.findViewById(R.id.c6x);
        try {
            Iterator<MusicInfo> it2 = preCheckResult.musicInfos.iterator();
            while (it2.hasNext()) {
                try {
                    MusicInfo next2 = it2.next();
                    TuxTextView tuxTextView3 = new TuxTextView(context, null, 6, 0);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    SpannableString spannableString2 = new SpannableString(next2.name);
                    spannableString2.setSpan(new C8FW(C17N.LJIILL(6.0d)), 0, 0, 18);
                    spannableStringBuilder3.append((CharSequence) spannableString2);
                    tuxTextView3.setText(spannableStringBuilder3);
                    tuxTextView3.setTextColor(context.getResources().getColor(R.color.cs));
                    tuxTextView3.setTextSize(15.0f);
                    viewGroup2.addView(tuxTextView3);
                } catch (Exception unused3) {
                    tuxSheet = 0;
                }
            }
            tuxSheet = 0;
            tuxSheet = 0;
            try {
                TuxTextView tuxTextView4 = new TuxTextView(context, tuxSheet, 6, 0);
                tuxTextView4.setText(context.getResources().getString(R.string.w5));
                tuxTextView4.setTextSize(15.0f);
                tuxTextView4.setTextColor(context.getResources().getColor(R.color.cs));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.topMargin = C17N.LJIILL(16.0d);
                viewGroup2.addView(tuxTextView4, layoutParams2);
            } catch (Exception unused4) {
            }
        } catch (Exception unused5) {
            tuxSheet = 0;
        }
        linearLayout3.requestDisallowInterceptTouchEvent(true);
        TuxIconView tuxIconView2 = (TuxIconView) LLLLIILL3.findViewById(R.id.ean);
        C34K c34k2 = new C34K();
        LinearLayout linearLayout4 = (LinearLayout) LLLLIILL3.findViewById(R.id.g2l);
        if (linearLayout4 != null) {
            C16880lQ.LJIIZILJ(linearLayout4, new ACListenerS26S0400000_2(c34k2, linearLayout3, tuxIconView2, interfaceC88472Yns2, 0));
        }
        ASL asl3 = new ASL();
        TuxSheet tuxSheet5 = asl3.LIZ;
        tuxSheet5.LJLLL = c235119Kp3;
        tuxSheet5.LJLLI = LLLLIILL3;
        asl3.LJI(1);
        ?? r62 = asl3.LIZ;
        r62.LJLLJ = true;
        r62.LJLJI = false;
        r62.LJZI = false;
        c68322mC3.element = r62;
        r62.show(supportFragmentManager, "showCopyRightResultDialog");
        String creationId3 = videoPublishEditModel.getCreationId();
        o.LJIIIIZZ(creationId3, "videoPublishEditModel.creationId");
        String str3 = videoPublishEditModel.mShootWay;
        o.LJIIIIZZ(str3, "videoPublishEditModel.mShootWay");
        C6ES.LJII(i, videoPublishEditModel.getVideoLength(), creationId3, str3, C78983UzD.LJJJJJL(videoPublishEditModel) ? 1 : 0, String.valueOf(videoPublishEditModel.draftId), enterFrom, "", H7R.LJIIIZ(videoPublishEditModel), H7R.LJIIIIZZ(videoPublishEditModel), videoPublishEditModel.getMusicId());
        return tuxSheet;
    }
}
