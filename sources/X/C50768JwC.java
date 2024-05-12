package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.JwC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50768JwC {
    public static C50789JwX LIZIZ;
    public static final C50768JwC LIZ = new C50768JwC();
    public static int LIZJ = 1;

    public final void LIZLLL() {
        Long l;
        if (LIZIZ == null) {
            C50789JwX c50789JwX = new C50789JwX();
            LIZIZ = c50789JwX;
            c50789JwX.LIZJ = System.currentTimeMillis();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("start time:");
            C50789JwX c50789JwX2 = LIZIZ;
            if (c50789JwX2 != null) {
                l = Long.valueOf(c50789JwX2.LIZJ);
            } else {
                l = null;
            }
            LIZ2.append(l);
            X1D.LIZIZ(LIZ2);
        }
    }

    public static boolean LIZ(Object data) {
        String obj;
        o.LJIIIZ(data, "data");
        if (!(data instanceof TemplateData)) {
            return false;
        }
        TemplateData templateData = (TemplateData) data;
        java.util.Map<Object, Object> LJIIIIZZ = templateData.LJIIIIZZ();
        if ((LJIIIIZZ == null || (obj = LJIIIIZZ.toString()) == null || !s.LJJJLZIJ(obj, "guessSearchData", false)) && !o.LJ("guessSearchDataProcess", templateData.LIZLLL)) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(Object obj) {
        C50789JwX c50789JwX = LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0 && c50789JwX.LIZLLL > 0 && c50789JwX.LJJIII == 0) {
            c50789JwX.LJJIII = System.currentTimeMillis() - c50789JwX.LIZLLL;
            c50789JwX.LJJIJIIJIL = obj;
        }
    }

    public final void LIZJ(SearchResultParam searchResultParam) {
        String str;
        C50789JwX c50789JwX = LIZIZ;
        if (c50789JwX != null) {
            c50789JwX.LIZ = searchResultParam;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setParams enterFrom:");
            String str2 = null;
            if (searchResultParam != null) {
                str = searchResultParam.getSearchFrom();
            } else {
                str = null;
            }
            LIZ2.append(str);
            LIZ2.append(" enterMethod: ");
            if (searchResultParam != null) {
                str2 = searchResultParam.getEnterMethod();
            }
            LIZ2.append(str2);
            X1D.LIZIZ(LIZ2);
        }
    }
}
