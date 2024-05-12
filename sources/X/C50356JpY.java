package X;

import androidx.fragment.app.Fragment;
import com.google.gson.Gson;
import com.google.gson.m;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.JpY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50356JpY {
    public String LIZJ;
    public String LJ;
    public final List<InterfaceC50355JpX> LIZ = new ArrayList();
    public final Gson LIZIZ = GsonHolder.LIZLLL().LIZ();
    public final java.util.Map<String, String> LIZLLL = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:104:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(androidx.fragment.app.Fragment r13) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50356JpY.LIZ(androidx.fragment.app.Fragment):void");
    }

    public final void LIZIZ(Fragment fragment, m mVar, FeelgoodSurveyModel feelgoodSurveyModel) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC50355JpX) it.next()).b30(fragment, mVar, feelgoodSurveyModel, this.LIZLLL);
        }
    }
}
