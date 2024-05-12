package X;

import X.C72207SVn;
import X.InterfaceC72202SVi;
import Y.ACListenerS46S0200000_12;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SVh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72201SVh<T extends InterfaceC72202SVi, S extends C72207SVn> extends HSS {
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1039));
    public S LJLJLLL;

    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    public void LJJJJJ(S s) {
        throw null;
    }

    @Override // X.HSS, X.S1E
    public final CharSequence LIZJ() {
        AnchorCommonStruct anchorCommonStruct;
        String LJJJJJL;
        if (!C7RA.LIZIZ || (anchorCommonStruct = this.LJLJJL) == null || (LJJJJJL = LJJJJJL(anchorCommonStruct)) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int LIZIZ = C7MY.LIZIZ(12);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("* ");
        LIZ.append(LJJJJJL);
        spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ));
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_star_fill;
        c2068389v.LIZIZ = LIZIZ;
        c2068389v.LIZJ = LIZIZ;
        c2068389v.LJ = Integer.valueOf(R.attr.c6);
        SY9 LIZ2 = c2068389v.LIZ(LJIIIZ().LIZ());
        LIZ2.setBounds(0, 0, LIZIZ, LIZIZ);
        spannableStringBuilder.setSpan(new C8FR(LIZ2, 2), 0, 1, 33);
        return spannableStringBuilder;
    }

    public final T LJJJJL() {
        return (T) this.LJLJLJ.getValue();
    }

    public final void LJJJJLI() {
        S s = this.LJLJLLL;
        if (s != null) {
            LJJJJL().LJ(s.getId(), s.LJLJL, this.LJLJJL);
        }
    }

    public static String LJJJJJL(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        try {
            Double valueOf = Double.valueOf(new JSONObject(anchorCommonStruct.getExtra()).optDouble("topic_rating"));
            double doubleValue = valueOf.doubleValue();
            boolean z2 = false;
            if (!Double.isNaN(doubleValue)) {
                if (doubleValue == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = true;
                }
            }
            if (!z2) {
                valueOf = null;
            }
            if (valueOf == null) {
                return null;
            }
            return String.valueOf(O6R.LJJIIJZLJL(valueOf.doubleValue() * 10) / 10.0d);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJL().LJFF(eventMapBuilder, LJIIIZ().LJJLJLI(), LJJII());
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        LJJJJL().LJIILIIL(c188727au, LJIIIZ().LJJLJLI(), LJJII());
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJL().LJIIIZ(eventMapBuilder, LJJIIZI(), LJJII(), LJJIIZ(), this.LJLJJL);
        LJJJJL().LJIIJJI(LJJI(), this.LJLJJL, LJJIIZI());
        LJJJJL().LIZJ(LJIIIZ().LJJLJLI(), LJJII(), this.LJLJJL);
    }

    public final S LJJJJLL(Context context) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bem, null, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.multi.ui.TopicCommonAnchorItem");
        S s = (S) LLLLIILL;
        this.LJLJLLL = s;
        return s;
    }

    @Override // X.HSW, X.S1E
    public void LJIJ(Activity activity, Dialog dialog) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dialog, "dialog");
        super.LJIJ(activity, dialog);
        if (o.LJ(LJJI().getLocalClassName(), activity.getLocalClassName())) {
            LJJJJL().LIZ();
        }
    }

    @Override // X.HSS, X.S1E
    public final void LJIILL(View view, Aweme aweme, boolean z) {
        if (aweme != null) {
            LJJJJL().LIZLLL(aweme);
        }
    }

    @Override // X.HSS, X.S1E
    public void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "parent.context");
        S LJJJJLL = LJJJJLL(context);
        LJJJJJ(LJJJJLL);
        LJJJJLL.setButtonOnClickListener(new AqS159S0200000_12(viewGroup, (ViewGroup) this, 56));
        LJJJJLL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(this, c188727au, 24)));
        viewGroup.addView(LJJJJLL);
    }

    @Override // X.HSW, X.S1E
    public final void LJIILIIL(C7F9 chain, Dialog dialog, boolean z, boolean z2) {
        List<AnchorCommonStruct> anchors;
        o.LJIIIZ(chain, "chain");
        T LJJJJL = LJJJJL();
        Aweme LJJII = LJJII();
        boolean z3 = false;
        if (LJJII != null && (anchors = LJJII.getAnchors()) != null) {
            if (!anchors.isEmpty()) {
                Iterator<AnchorCommonStruct> it = anchors.iterator();
                while (it.hasNext()) {
                    if (it.next().getType() != type()) {
                        break;
                    }
                }
            }
            z3 = true;
        }
        LJJJJL.LJI(LJJII(), z3);
    }
}
