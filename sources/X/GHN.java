package X;

import Y.IDDListenerS102S0200000_7;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.AuthorSurveyFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GHN {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Bundle bundle, ActivityC45651qj context) {
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(context, "context");
        AuthorSurveyFragment authorSurveyFragment = new AuthorSurveyFragment();
        authorSurveyFragment.setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = authorSurveyFragment;
        Integer LJI = C79045V0n.LJI(R.attr.c9, context);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLJL = LJI;
        tuxSheet.LJLJI = false;
        IDDListenerS102S0200000_7 iDDListenerS102S0200000_7 = new IDDListenerS102S0200000_7(authorSurveyFragment, bundle, 4);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLILLLLZI = iDDListenerS102S0200000_7;
        C1DG.LJII(context, "context.supportFragmentManager", tuxSheet2, "survey_after_post_sheet");
    }
}
