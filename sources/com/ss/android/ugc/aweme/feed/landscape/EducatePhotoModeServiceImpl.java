package com.ss.android.ugc.aweme.feed.landscape;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C19N;
import X.C2063688a;
import X.C2064588j;
import X.C2066389b;
import X.C38281F0r;
import X.C38995FSd;
import X.C53765L8f;
import X.C58096Mr6;
import X.C58310MuY;
import X.C60827Nu3;
import X.C62002c0;
import X.C774632g;
import X.C7MY;
import X.C89W;
import X.C89Z;
import X.KOO;
import X.QZZ;
import X.SY4;
import Y.ACListenerS29S0300000_3;
import Y.ACListenerS38S0200000_3;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS40S0100000_4;
import android.app.Activity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.ss.android.ugc.aweme.service.IEducatePhotoModeService;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class EducatePhotoModeServiceImpl implements IEducatePhotoModeService {
    public boolean LIZ;
    public boolean LIZIZ;
    public final String LIZJ = "creator_educate_photo_post";

    public static IEducatePhotoModeService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IEducatePhotoModeService.class, false);
        if (LIZ != null) {
            return (IEducatePhotoModeService) LIZ;
        }
        if (C58096Mr6.G0 == null) {
            synchronized (IEducatePhotoModeService.class) {
                if (C58096Mr6.G0 == null) {
                    C58096Mr6.G0 = new EducatePhotoModeServiceImpl();
                }
            }
        }
        return C58096Mr6.G0;
    }

    public static void LJ() {
        C38281F0r c38281F0r = new C38281F0r(C774632g.LIZ());
        c38281F0r.LIZLLL("enter_from", "personal_homepage");
        String schema = a1.LJ("aweme://webview?url=", URLEncoder.encode(c38281F0r.LJ(), "ISO-8859-1"), "&use_spark=1&use_preload=1");
        KOO.LIZ.getClass();
        o.LJIIIZ(schema, "schema");
        C60827Nu3.LJIIIIZZ(C58310MuY.LIZIZ, schema, "photo_mode_spark_biz", null, 12);
    }

    @Override // com.ss.android.ugc.aweme.service.IEducatePhotoModeService
    public final void LIZ() {
        if (!C89W.LIZ || this.LIZ || !((Boolean) C2066389b.LIZ.getValue()).booleanValue()) {
            return;
        }
        this.LIZ = true;
        if (C2063688a.LIZ().LIZ.getBoolean("learn_more_entered", false)) {
            return;
        }
        C38995FSd.LIZLLL().submit(new ARunnableS40S0100000_4(this, 50));
    }

    @Override // com.ss.android.ugc.aweme.service.IEducatePhotoModeService
    public final boolean LIZIZ() {
        C62002c0.LIZ.getClass();
        if (!C62002c0.LIZ()) {
            return false;
        }
        boolean z = C89W.LIZ;
        if ((!z && !C89W.LIZIZ) || C2063688a.LIZ().LIZ.getInt("number_of_times_profile_notice_shown", 0) >= 2) {
            return false;
        }
        if (C2063688a.LIZ().LIZ.getInt("number_of_times_profile_notice_shown", 0) == 1 && C2063688a.LIZ().LIZ.getBoolean("publish_since_photo_mode_educate_experiment", false)) {
            return false;
        }
        if (z && !this.LIZIZ && ((Boolean) C89Z.LIZ.getValue()).booleanValue()) {
            this.LIZIZ = true;
            C38995FSd.LIZJ().submit(new ARunnableS39S0100000_3(this, 11));
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IEducatePhotoModeService
    public final void LIZJ(ViewStub viewStub, ActivityC45651qj activity) {
        View view;
        int LIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(activity, "activity");
        C2064588j c2064588j = new C2064588j(viewStub, activity);
        ViewStub viewStub2 = c2064588j.LIZ;
        ViewGroup.LayoutParams layoutParams = null;
        if (viewStub2 != null) {
            view = viewStub2.inflate();
        } else {
            view = null;
        }
        if (C53765L8f.LJIIJJI()) {
            LIZIZ = 0;
        } else {
            LIZIZ = C7MY.LIZIZ(52);
        }
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = LIZIZ;
        }
        ViewGroup parentView = (ViewGroup) c2064588j.LIZJ.findViewById(c2064588j.LIZIZ);
        if (C89W.LIZIZ) {
            o.LJIIIIZZ(parentView, "parentView");
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c7w, c2064588j.LIZJ.getLayoutInflater(), parentView);
            SY4 sy4 = (SY4) LLLZIIL.findViewById(R.id.muo);
            sy4.getClass();
            C16880lQ.LJJIZ(sy4, new ACListenerS29S0300000_3(parentView, c2064588j, sy4, 1));
            C16880lQ.LJIIJ(new ACListenerS38S0200000_3(c2064588j, parentView, 18), LLLZIIL.findViewById(R.id.nkc));
            LLLZIIL.post(new ARunnableS22S0200000_3(c2064588j, LLLZIIL, 5));
            C2064588j.LIZIZ("upload");
        } else {
            o.LJIIIIZZ(parentView, "parentView");
            Activity activity2 = c2064588j.LIZJ;
            View LLLZIIL2 = C16880lQ.LLLZIIL(R.layout.c7v, activity2.getLayoutInflater(), parentView);
            TextView textView = (TextView) LLLZIIL2.findViewById(R.id.c84);
            String string = activity2.getString(R.string.jjv);
            o.LJIIIIZZ(string, "activity.getString(strId2)");
            String string2 = activity2.getString(R.string.jjt, QZZ.LIZIZ(' ', string));
            o.LJIIIIZZ(string2, "activity.getString(strId1, \" $learnMoreStr\")");
            SpannableString spannableString = new SpannableString(string2);
            int LJJLIIJ = s.LJJLIIJ(spannableString, string, 6);
            spannableString.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.eb, activity2)), LJJLIIJ, string.length() + LJJLIIJ, 33);
            spannableString.setSpan(new StyleSpan(1), LJJLIIJ, string.length() + LJJLIIJ, 33);
            textView.setText(spannableString);
            C16880lQ.LJIIJ(new ACListenerS38S0200000_3(c2064588j, activity2, 16), LLLZIIL2);
            C16880lQ.LJIIJ(new ACListenerS38S0200000_3(c2064588j, parentView, 17), LLLZIIL2.findViewById(R.id.nkc));
            LLLZIIL2.post(new ARunnableS22S0200000_3(c2064588j, LLLZIIL2, 5));
            C2064588j.LIZIZ("learn_more");
        }
        C19N.LIZJ(C2063688a.LIZ().LIZ, "number_of_times_profile_notice_shown", 0, 1, "number_of_times_profile_notice_shown");
    }
}
