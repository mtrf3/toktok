package X;

import Y.IDDListenerS105S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecomsearch.middle.feedback.EcommerceSearchMiddleFeedback;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.AqS68S0400000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.SiH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72837SiH extends AbstractC72839SiJ {
    public static WeakReference<C26045AKb> LJLJJL;

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        boolean z;
        String str;
        View view;
        ActivityC45651qj activityC45651qj;
        Object obj;
        Context context;
        LinearLayout linearLayout;
        View view2;
        View view3;
        InterfaceC72840SiK interfaceC72840SiK = (InterfaceC72840SiK) xBaseParamModel;
        o.LJIIIZ(type, "type");
        int i = 0;
        if (interfaceC72840SiK.getWordContent().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || interfaceC72840SiK.getWordGroupId().length() == 0 || interfaceC72840SiK.getWordImageUrl().length() == 0 || interfaceC72840SiK.getSearchPosition().length() == 0 || interfaceC72840SiK.getSearchlogId().length() == 0 || interfaceC72840SiK.getSearchEntrance().length() == 0) {
            C31626Cb8.LIZ(c37356ElM, 1, "params is empty string", 4);
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        AttributeSet attributeSet = null;
        if (interfaceC38263Ezz != null && (view = interfaceC38263Ezz.getView()) != null) {
            LJLJJL = null;
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if ((LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    obj = parent.getParent();
                } else {
                    obj = null;
                }
                if (!(obj instanceof View) || (view3 = (View) obj) == null || (context = view3.getContext()) == null) {
                    context = view.getContext();
                }
                if (context != null) {
                    View LLLZIIL = C16880lQ.LLLZIIL(R.layout.aow, C16880lQ.LLZIL(context), null);
                    ((TextView) LLLZIIL.findViewById(R.id.clp)).setText(interfaceC72840SiK.getWordContent());
                    SmartImageView smartImageView = (SmartImageView) LLLZIIL.findViewById(R.id.clq);
                    S3I s3i = new S3I();
                    s3i.LIZLLL = C32151Nz.LJIIZILJ(4);
                    smartImageView.setCircleOptions(new S3L(s3i));
                    smartImageView.setImageURI(interfaceC72840SiK.getWordImageUrl());
                    if ((LLLZIIL instanceof LinearLayout) && (linearLayout = (LinearLayout) LLLZIIL) != null) {
                        EcommerceSearchMiddleFeedback.FeedbackQuestion[] LIZ = EcommerceSearchMiddleFeedback.LIZ().LIZ();
                        if (LIZ == null) {
                            LIZ = EcommerceSearchMiddleFeedback.LIZ;
                        }
                        int length = LIZ.length;
                        int i2 = 0;
                        while (i2 < length) {
                            EcommerceSearchMiddleFeedback.FeedbackQuestion feedbackQuestion = LIZ[i2];
                            Integer index = feedbackQuestion.getIndex();
                            String value = feedbackQuestion.getValue();
                            if (index != null && value != null) {
                                int intValue = index.intValue();
                                AqS68S0400000_8 aqS68S0400000_8 = new AqS68S0400000_8(this, feedbackQuestion, interfaceC72840SiK, linearLayout, 1);
                                TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, i);
                                tuxTextView.setText(value);
                                tuxTextView.setSingleLine(true);
                                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                                tuxTextView.setTuxFont(41);
                                tuxTextView.setTextColorRes(R.attr.go);
                                StateListDrawable stateListDrawable = new StateListDrawable();
                                int[] iArr = new int[1];
                                iArr[i] = 16842919;
                                C110614Vt c110614Vt = new C110614Vt();
                                c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(2));
                                c110614Vt.LIZLLL = C1FJ.LIZIZ(1);
                                c110614Vt.LIZ = C79045V0n.LJI(R.attr.dx, context);
                                c110614Vt.LJ = C79045V0n.LJI(R.attr.e0, context);
                                stateListDrawable.addState(iArr, c110614Vt.LIZ(context));
                                C110614Vt c110614Vt2 = new C110614Vt();
                                c110614Vt2.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(2));
                                c110614Vt2.LIZLLL = C1FJ.LIZIZ(1);
                                c110614Vt2.LIZ = C79045V0n.LJI(R.attr.ct, context);
                                c110614Vt2.LJ = C79045V0n.LJI(R.attr.e0, context);
                                stateListDrawable.addState(new int[0], c110614Vt2.LIZ(context));
                                tuxTextView.setBackgroundDrawable(stateListDrawable);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C7MY.LIZIZ(38));
                                layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), C7MY.LIZIZ(8), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), 0);
                                tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
                                tuxTextView.setLayoutParams(layoutParams);
                                tuxTextView.setLongClickable(true);
                                tuxTextView.setClickable(true);
                                view2 = view;
                                C16880lQ.LJJJJI(tuxTextView, new C72838SiI(view, this, interfaceC72840SiK, intValue, aqS68S0400000_8));
                                linearLayout.addView(tuxTextView);
                            } else {
                                view2 = view;
                            }
                            i2++;
                            i = 0;
                            attributeSet = null;
                            view = view2;
                        }
                    }
                    ASL asl = new ASL();
                    C235119Kp c235119Kp = new C235119Kp();
                    C9KF c9kf = new C9KF();
                    String LIZIZ = EcommerceSearchMiddleFeedback.LIZ().LIZIZ();
                    if (LIZIZ == null) {
                        LIZIZ = EcommerceSearchMiddleFeedback.LIZIZ;
                    }
                    c9kf.LIZ(LIZIZ);
                    c235119Kp.LIZJ = c9kf;
                    C234529Ii LIZJ = s1.LIZJ();
                    LIZJ.LIZJ = R.raw.icon_x_mark;
                    LIZJ.LIZIZ(new AqS162S0100000_12(LLLZIIL, 565));
                    c235119Kp.LIZIZ(LIZJ);
                    asl.LIZ.LJLLL = c235119Kp;
                    Integer LJI = C79045V0n.LJI(R.attr.cl, context);
                    TuxSheet tuxSheet = asl.LIZ;
                    tuxSheet.LJLJL = LJI;
                    tuxSheet.LJLLI = LLLZIIL;
                    asl.LJI(1);
                    int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LiveChatShowDelayForHotLiveSetting.DEFAULT)));
                    TuxSheet tuxSheet2 = asl.LIZ;
                    tuxSheet2.LJLLLLLL = LJJIIZ;
                    tuxSheet2.LJZI = false;
                    tuxSheet2.LJZL = true;
                    tuxSheet2.LJLILLLLZI = new IDDListenerS105S0200000_12(this, interfaceC72840SiK, 0);
                    C1DG.LJII(activityC45651qj, "act.supportFragmentManager", tuxSheet2, "EcSearchMiddleFeedbackSheet");
                    C76542zS.LIZJ("mall_click_search_feedback", new AqS65S1100000_12(interfaceC72840SiK, "open", 3));
                }
            }
        }
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
        if (interfaceC38263Ezz2 != null) {
            str = interfaceC38263Ezz2.LIZIZ();
        } else {
            str = null;
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC72841SiL.class, str), "");
    }
}
