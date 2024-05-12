package X;

import Y.ACListenerS0S0403000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS56S0400000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OMm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61780OMm {
    public static Option[] LIZ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJI;
    public static String LIZIZ = "";
    public static int LIZJ = -1;
    public static final Handler LJFF = new Handler();

    public static final boolean LIZLLL() {
        Iterator LIZLLL2 = C47135Ieh.LIZLLL(OMU.LIZ, "surveyMap.values");
        while (LIZLLL2.hasNext()) {
            if (((OMW) LIZLLL2.next()).LIZIZ == OML.FEED_TYPE.getType()) {
                return true;
            }
        }
        return false;
    }

    public static final void LJIIIZ() {
        if (IWF.LJJLIIIIJ().isPlaying()) {
            IWF.LJJLIIIIJ().LJIILJJIL();
            LJ = true;
        } else {
            LJFF.postDelayed(RunnableC61785OMr.LJLIL, 1000L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        if (((X.C77202URq) r0).LIZ() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        if (r1.LJLILLLLZI == false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ(com.ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
            r2 = 0
            if (r5 != 0) goto L4
            return r2
        L4:
            boolean r0 = X.C224888s8.LJFF(r2)
            if (r0 != 0) goto Lb
            return r2
        Lb:
            java.lang.String r1 = r5.getAuthorUid()
            java.lang.String r0 = "aweme.authorUid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r5.getRequestId()
            java.lang.String r4 = r5.getAid()
            boolean r0 = X.C57822Os.LIZ(r5)
            if (r0 == 0) goto L22
            return r2
        L22:
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r1 = X.OMU.LIZJ(r5)
            if (r1 == 0) goto Ld6
            com.ss.android.ugc.aweme.feed.model.survey.Question[] r0 = r1.getQuestions()
            if (r0 == 0) goto Ld6
            int r0 = r0.length
            r3 = 1
            if (r0 <= 0) goto Ld6
            boolean r0 = X.ONM.LJFF(r1)
            if (r0 == 0) goto L39
            return r2
        L39:
            java.lang.String r0 = "awemeId"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            boolean r0 = X.OMS.LIZLLL(r4)
            if (r0 == 0) goto L46
            return r2
        L46:
            if (r1 == 0) goto L57
            r1.getId()
            r1.getTitle()
            com.ss.android.ugc.aweme.feed.model.survey.Question[] r1 = r1.getQuestions()
            if (r1 == 0) goto L57
            int r0 = r1.length
            if (r0 != 0) goto L70
        L57:
            boolean r0 = r5.isAd()
            if (r0 == 0) goto L83
            boolean r0 = X.C63081OpJ.LL(r5)
            if (r0 != 0) goto L6f
            boolean r0 = X.C63081OpJ.LJLLI(r5)
            if (r0 != 0) goto L6f
            boolean r0 = X.C63081OpJ.LLJJJJLIIL(r5)
            if (r0 == 0) goto L83
        L6f:
            return r2
        L70:
            r0 = r1[r2]
            int r0 = r0.getType()
            X.C61780OMm.LIZJ = r0
            r0 = r1[r2]
            r0.getId()
            r0 = r1[r2]
            r0.getTitle()
            goto L57
        L83:
            boolean r0 = X.OMS.LJ(r5)
            if (r0 == 0) goto La1
            java.util.HashSet<java.lang.String> r1 = X.OMS.LJFF
            java.lang.String r0 = r5.getAid()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto La1
            if (r6 == 0) goto La0
            X.OMf r0 = X.EnumC61773OMf.INTERVAL
            int r0 = r0.getType()
            LJII(r0, r5)
        La0:
            return r2
        La1:
            boolean r0 = X.C59522Vg.LIZ()
            if (r0 == 0) goto Lc6
            X.M3s r1 = X.EnumC56196M3s.FYP
            X.OMw r0 = X.C61790OMw.LJLIL
            X.2pm r0 = X.C78609UtB.LJJIIJ(r1, r0)
            if (r0 == 0) goto Ld5
            X.URq r0 = (X.C77202URq) r0
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto Ld5
        Lb9:
            X.OMf r0 = X.EnumC61773OMf.PRIORITY
            int r0 = r0.getType()
            LJII(r0, r5)
            X.OMS.LJII(r5)
            return r2
        Lc6:
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.UQF r1 = r0.LJJIJIIJIL(r3, r2)
            boolean r0 = r1.LJLIL
            if (r0 != 0) goto Lb9
            boolean r0 = r1.LJLILLLLZI
            if (r0 == 0) goto Ld5
            goto Lb9
        Ld5:
            return r3
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61780OMm.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }

    public static void LJII(int i, Aweme aweme) {
        if (i != EnumC61773OMf.SUBMIT.getType() && i != EnumC61773OMf.SECONDARY_SUBMIT.getType()) {
            LIZ = null;
            ON9.LIZ(i, aweme);
        } else {
            ON9.LIZJ(i, aweme, LIZ);
        }
    }

    public static C61789OMv LIZIZ(int i, Context context, List list) {
        boolean z;
        int i2;
        if (context == null) {
            return null;
        }
        C61789OMv c61789OMv = new C61789OMv(context);
        int i3 = 1;
        if (i == EnumC61777OMj.SINGLE_CHOICE.getType()) {
            z = true;
        } else {
            z = false;
            i3 = 2;
        }
        c61789OMv.setChoiceMode(i3);
        c61789OMv.setVisibility(0);
        c61789OMv.setDivider(null);
        c61789OMv.setSelector(new ColorDrawable(0));
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Option) it.next()).getName());
        }
        if (z) {
            i2 = R.layout.abm;
        } else {
            i2 = R.layout.abl;
        }
        c61789OMv.setAdapter((ListAdapter) new ArrayAdapter(context, i2, arrayList));
        c61789OMv.setOnItemClickListener(new C61787OMt(c61789OMv, z, list));
        c61789OMv.setPadding(0, (int) KL2.LIZJ(context, 12.0f), 0, 0);
        return c61789OMv;
    }

    public static void LJI(String str, Aweme aweme, String str2) {
        String str3;
        FeedSurvey LIZJ2 = OMU.LIZJ(aweme);
        C61769OMb c61769OMb = C61769OMb.LIZ;
        OML oml = OML.FEED_TYPE;
        if (LIZJ2 != null) {
            str3 = LIZJ2.getId();
        } else {
            str3 = null;
        }
        C61769OMb.LIZLLL(c61769OMb, aweme, oml, str, str3, str2, null, 0, null, 224);
    }

    public static void LJIIIIZZ(int i, Aweme aweme, Option[] optionArr) {
        LIZ = optionArr;
        if (i != EnumC61773OMf.SUBMIT.getType() && i != EnumC61773OMf.SECONDARY_SUBMIT.getType()) {
            ON9.LIZ(i, aweme);
        } else {
            ON9.LIZJ(i, aweme, optionArr);
        }
    }

    public static final void LIZJ(EnumC61773OMf operation, Aweme aweme, Option[] optionArr, boolean z) {
        int type;
        o.LJIIIZ(operation, "operation");
        if (optionArr != null && optionArr.length != 0) {
            LIZIZ = String.valueOf(optionArr[0].getId());
        }
        if (operation.getType() == EnumC61773OMf.SWIPE.getType() || operation.getType() == EnumC61773OMf.CLICK_BLANK.getType() || operation.getType() == EnumC61773OMf.CLICK_VIDEO.getType()) {
            type = EnumC61773OMf.CANCEL.getType();
        } else {
            type = operation.getType();
        }
        if (OMU.LIZIZ(aweme) != OBQ.BACKGROUND.getType() || type != EnumC61773OMf.CANCEL.getType()) {
            LJIIIIZZ(type, aweme, optionArr);
        }
        if (z) {
            String name = operation.name();
            Locale locale = Locale.ENGLISH;
            LJI(C141415gn.LIZIZ(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)"), aweme, LIZIZ);
        }
        LIZLLL = false;
        LIZ = null;
    }

    public static final void LJFF(String str, long j, Aweme aweme, String str2) {
        LIZLLL = true;
        OMS.LJII(aweme);
        C61769OMb.LJI(str, aweme, str2);
    }

    public static void LIZ(Aweme aweme, EnumC61773OMf enumC61773OMf, C80796VnM c80796VnM, int i, int i2, int i3) {
        LJII(enumC61773OMf.getType(), aweme);
        c80796VnM.LJJIL(i, i2, i3);
        String name = enumC61773OMf.name();
        Locale locale = Locale.ENGLISH;
        LJI(C141415gn.LIZIZ(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)"), aweme, LIZIZ);
        LJI = false;
        LIZLLL = false;
        LIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.ARf, T] */
    /* JADX WARN: Type inference failed for: r18v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.OMp, android.widget.LinearLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r8v8, types: [X.3gw] */
    public static final boolean LJIIJ(Aweme aweme, Fragment fragment, final Context context, C80796VnM c80796VnM, int i, int i2, int i3, long j) {
        List arrayList;
        boolean z;
        C61789OMv c61789OMv;
        Object obj;
        C90543gw c90543gw;
        o.LJIIIZ(context, "context");
        FeedSurvey LIZJ2 = OMU.LIZJ(aweme);
        int i4 = 0;
        if (c80796VnM == null || LIZJ2 == null) {
            return false;
        }
        if (OMU.LIZIZ(aweme) == OBQ.FLOATING.getType()) {
            Question[] questions = LIZJ2.getQuestions();
            if (questions == null || questions.length == 0) {
                return false;
            }
            Question question = questions[0];
            LIZJ = question.getType();
            question.getId();
            question.getTitle();
            if (LIZJ != EnumC61777OMj.SINGLE_CHOICE.getType()) {
                return false;
            }
            ONM.LJII(aweme, context, LIZJ2, OML.FEED_TYPE);
            return true;
        }
        LIZJ2.getTitle();
        Question[] questions2 = LIZJ2.getQuestions();
        if (questions2 != null && questions2.length > 0) {
            o.LJI(questions2);
            Question question2 = questions2[0];
            Option[] options = question2.getOptions();
            if (options == null || (arrayList = ORY.LJJZZIII(options)) == null) {
                arrayList = new ArrayList();
            }
            if (arrayList.size() > 0) {
                LIZJ = question2.getType();
                question2.getId();
                question2.getTitle();
                if (OMU.LIZIZ(aweme) == OBQ.DEFAULT.getType()) {
                    z = true;
                } else {
                    z = false;
                }
                int i5 = 6;
                AttributeSet attributeSet = null;
                if (z && EnumC61777OMj.SINGLE_CHOICE.getType() == LIZJ) {
                    C34K c34k = new C34K();
                    ON2 on2 = new ON2(context);
                    on2.LIZ(LIZJ2);
                    TuxTextView tuxTextView = new TuxTextView(context, attributeSet, i5, i4);
                    tuxTextView.setTuxFont(23);
                    tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
                    tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                    tuxTextView.setText(question2.getTitle());
                    tuxTextView.setGravity(17);
                    tuxTextView.setHighlightColor(0);
                    C26227ARb c26227ARb = new C26227ARb(context);
                    c26227ARb.LJII = false;
                    c26227ARb.LJIIIIZZ = true;
                    c26227ARb.LJIIJ = new ARU(tuxTextView);
                    C77119UOl.LJFF(c26227ARb, on2);
                    C77123UOp.LJIILL(c26227ARb, new AqS56S0400000_10(LIZJ2, c34k, on2, context, 17));
                    c26227ARb.LIZJ(new AqS176S0100000_10(c34k, 258));
                    c26227ARb.LJI = new XPR();
                    C26231ARf LJI2 = c26227ARb.LJI();
                    if (LIZJ != EnumC61777OMj.BINARY.getType()) {
                        on2.setOptionListener(new ARY(LJI2));
                    }
                    if (LJI2.LJI() instanceof ARH) {
                        AbstractC243009gG LJI3 = LJI2.LJI();
                        o.LJII(LJI3, "null cannot be cast to non-null type com.bytedance.tux.dialog.action.ButtonGroup");
                        ((ARL) ListProtector.get(((ARH) LJI3).LJFF, 0)).LIZIZ(false);
                    }
                    if (fragment instanceof InterfaceC56322M8o) {
                        PopupManager.LJIIL(new C26241ARp((InterfaceC56322M8o) fragment, LJI2));
                    } else {
                        LJI2.LIZLLL();
                    }
                    String id = LIZJ2.getId();
                    String name = EnumC61777OMj.values()[LIZJ].name();
                    Locale locale = Locale.ENGLISH;
                    LJFF(id, 0L, aweme, C141415gn.LIZIZ(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)"));
                    return true;
                }
                int i6 = LIZJ;
                EnumC61777OMj enumC61777OMj = EnumC61777OMj.BINARY;
                if (i6 == enumC61777OMj.getType()) {
                    c61789OMv = new LinearLayout(context) { // from class: X.3gw
                        public final SY4 LJLIL;
                        public final SY4 LJLILLLLZI;
                        public final TuxTextView LJLJI;

                        public final SY4 getButton1() {
                            return this.LJLIL;
                        }

                        public final SY4 getButton2() {
                            return this.LJLILLLLZI;
                        }

                        public final TuxTextView getButton3() {
                            return this.LJLJI;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(context);
                            a1.LJFF(context, "context");
                            SY4 sy4 = new SY4(context, null, 6, 0);
                            this.LJLIL = sy4;
                            SY4 sy42 = new SY4(context, null, 6, 0);
                            this.LJLILLLLZI = sy42;
                            TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
                            this.LJLJI = tuxTextView2;
                            setOrientation(1);
                            LIZ(sy4, O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                            LIZ(sy42, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                            tuxTextView2.setMinWidth(0);
                            tuxTextView2.setMaxWidth(Integer.MAX_VALUE);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C7MY.LIZIZ(44));
                            layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 0);
                            tuxTextView2.setLayoutParams(layoutParams);
                            tuxTextView2.setTuxFont(41);
                            tuxTextView2.setTextColorRes(R.attr.gu);
                            tuxTextView2.setGravity(17);
                            Context context2 = tuxTextView2.getContext();
                            o.LJIIIIZZ(context2, "context");
                            Integer LJI4 = C79045V0n.LJI(R.attr.ct, context2);
                            tuxTextView2.setBackgroundColor(LJI4 != null ? LJI4.intValue() : 0);
                            C78897Uxp.LJJJJLI(tuxTextView2, null);
                            addView(sy4);
                            addView(sy42);
                            addView(tuxTextView2);
                            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        }

                        @Override // android.view.ViewGroup, android.view.View
                        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                            return super.dispatchTouchEvent(motionEvent);
                        }

                        public static void LIZ(SY4 sy4, int i7) {
                            sy4.setButtonVariant(1);
                            sy4.setButtonSize(3);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), i7, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 0);
                            sy4.setLayoutParams(layoutParams);
                        }
                    };
                } else if (i6 == EnumC61777OMj.FIVE_LEVEL.getType()) {
                    ?? c61783OMp = new C61783OMp(context);
                    c61783OMp.setGravity(17);
                    c61783OMp.setClickable(true);
                    c61783OMp.setStarEmptyDrawable(context.getResources().getDrawable(R.drawable.b4o));
                    c61783OMp.setStarFillDrawable(context.getResources().getDrawable(R.drawable.b4p));
                    c61783OMp.setStarStep(0.0f);
                    c61783OMp.setStepSize(1);
                    c61783OMp.setStarCount(arrayList.size());
                    c61783OMp.setStarImageSize(KL2.LIZJ(context, 40.0f));
                    c61783OMp.setStarPadding(KL2.LIZJ(context, 10.0f));
                    c61783OMp.setOnRatingChangeListener(new C61782OMo(c61783OMp, arrayList));
                    c61783OMp.LIZ();
                    c61783OMp.setPadding(0, (int) KL2.LIZJ(context, 12.0f), 0, 0);
                    c61789OMv = c61783OMp;
                } else {
                    EnumC61777OMj enumC61777OMj2 = EnumC61777OMj.SINGLE_CHOICE;
                    if (i6 == enumC61777OMj2.getType()) {
                        c61789OMv = LIZIZ(enumC61777OMj2.getType(), context, arrayList);
                    } else {
                        EnumC61777OMj enumC61777OMj3 = EnumC61777OMj.MULTIPLE_CHOICE;
                        if (i6 != enumC61777OMj3.getType()) {
                            return false;
                        }
                        c61789OMv = LIZIZ(enumC61777OMj3.getType(), context, arrayList);
                    }
                }
                C68322mC c68322mC = new C68322mC();
                TuxTextView tuxTextView2 = new TuxTextView(context, attributeSet, i5, i4);
                tuxTextView2.setTuxFont(33);
                tuxTextView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
                tuxTextView2.setText(question2.getTitle());
                tuxTextView2.setGravity(17);
                tuxTextView2.setHighlightColor(0);
                C26227ARb c26227ARb2 = new C26227ARb(context);
                c26227ARb2.LJIIJ = new ARU(tuxTextView2);
                c26227ARb2.LJII = false;
                c26227ARb2.LJI = new C61788OMu();
                c26227ARb2.LIZJ(OBP.LJLIL);
                if (c61789OMv != null) {
                    C77119UOl.LJFF(c26227ARb2, c61789OMv);
                }
                LIZJ2.getId();
                if (LIZJ == enumC61777OMj.getType()) {
                    if (arrayList.size() < 2 || !(c61789OMv instanceof C90543gw) || (c90543gw = (C90543gw) c61789OMv) == null) {
                        return false;
                    }
                    c90543gw.getButton1().setText(((Option) ListProtector.get(arrayList, 0)).getName());
                    C16880lQ.LJJIZ(c90543gw.getButton1(), new ACListenerS0S0403000_10(arrayList, aweme, c80796VnM, i, i2, i3, c68322mC, 0));
                    c90543gw.getButton2().setText(((Option) ListProtector.get(arrayList, 1)).getName());
                    C16880lQ.LJJIZ(c90543gw.getButton2(), new ACListenerS0S0403000_10(arrayList, aweme, c80796VnM, i, i2, i3, c68322mC, 1));
                    String cancelText = LIZJ2.getCancelText();
                    if (cancelText == null || cancelText.length() == 0) {
                        c90543gw.getButton3().setVisibility(8);
                    } else {
                        c90543gw.getButton3().setText(LIZJ2.getCancelText());
                        C16880lQ.LJJJJI(c90543gw.getButton3(), new ViewOnClickListenerC61781OMn(aweme, c80796VnM, i, i2, i3, c68322mC));
                    }
                } else {
                    C77123UOp.LJIILL(c26227ARb2, new ON1(LIZJ2, aweme, c80796VnM, i, i2, i3));
                }
                c68322mC.element = c26227ARb2.LJI();
                if (LIZJ != enumC61777OMj.getType()) {
                    o.LJII(c61789OMv, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.helper.MTFeedSurvey");
                    c61789OMv.setOptionListener(new ARZ(c68322mC));
                }
                if ((fragment instanceof InterfaceC56322M8o) && (obj = c68322mC.element) != null) {
                    PopupManager.LJIIL(new C26241ARp((InterfaceC56322M8o) fragment, (C26231ARf) obj));
                } else {
                    AbstractDialogInterfaceC26236ARk abstractDialogInterfaceC26236ARk = (AbstractDialogInterfaceC26236ARk) c68322mC.element;
                    if (abstractDialogInterfaceC26236ARk != null) {
                        abstractDialogInterfaceC26236ARk.LIZLLL();
                    }
                }
                LJI = true;
                String id2 = LIZJ2.getId();
                String name2 = EnumC61777OMj.values()[LIZJ].name();
                Locale locale2 = Locale.ENGLISH;
                LJFF(id2, j, aweme, C141415gn.LIZIZ(locale2, "ENGLISH", name2, locale2, "this as java.lang.String).toLowerCase(locale)"));
                return true;
            }
        }
        return false;
    }
}
