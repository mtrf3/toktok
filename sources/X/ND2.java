package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import defpackage.s1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ND2 implements C14Q, InterfaceC40178Fpm {
    public static final InterfaceC67352kd[] LJLIL = new InterfaceC67352kd[0];
    public static final ND2 LJLILLLLZI = new ND2();

    public void LIZ() {
        throw null;
    }

    @Override // X.InterfaceC40178Fpm
    public InterfaceC60614Nqc LIZIZ(C60737Nsb hybridContext) {
        o.LJIIJ(hybridContext, "hybridContext");
        return null;
    }

    public void LIZJ(String str) {
        throw null;
    }

    @Override // X.C14Q
    public Object apply(Object obj) {
        List list = (List) obj;
        ArrayList LIZIZ = s1.LIZIZ(list, "it");
        for (Object obj2 : list) {
            if (obj2 != null) {
                LIZIZ.add(obj2);
            }
        }
        return LIZIZ;
    }

    public static final void LIZLLL(ND1 nd1, boolean z) {
        String str;
        Long l;
        String str2;
        AnoleModel anoleModel;
        o.LJIIIZ(nd1, "<this>");
        String str3 = (String) nd1.LLD.getValue();
        if (z) {
            str = "othershow";
        } else {
            str = "othershow_fail";
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL(str3, str, nd1.LJLILLLLZI.getAwemeRawAd());
        LIZLLL.LIZJ(nd1.LLF.getValue(), "refer");
        LIZLLL.LIZIZ(Long.valueOf(nd1.LJLIL.getID()), "component_id");
        AwemeRawAd awemeRawAd = nd1.LJLILLLLZI.getAwemeRawAd();
        if (awemeRawAd != null && (anoleModel = awemeRawAd.getAnoleModel()) != null) {
            l = Long.valueOf(anoleModel.getTemplateID());
        } else {
            l = null;
        }
        LIZLLL.LIZIZ(l, "template_id");
        LIZLLL.LIZIZ(nd1.LJLIL.getType(), "component_type");
        if (!z) {
            if (!nd1.LJZ) {
                str2 = "image_load_failed";
            } else {
                str2 = "-1";
            }
            LIZLLL.LIZIZ(str2, "fail_reason");
            LIZLLL.LIZIZ(nd1.LJZL, "failed_detail_reason");
            LIZLLL.LIZIZ(nd1.LL, "origin_url");
        }
        C0JU.LIZJ(0, LIZLLL, "is_lynx");
    }
}
