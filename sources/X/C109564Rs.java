package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.4Rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109564Rs {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C109584Ru.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C109574Rt.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C109594Rv.LJLIL);

    public static final void LIZ(TuxIconView view, IMUser iMUser) {
        String str;
        String enterpriseVerifyReason;
        o.LJIIIZ(view, "view");
        view.setVisibility(0);
        if (iMUser != null && (((enterpriseVerifyReason = iMUser.getEnterpriseVerifyReason()) == null || enterpriseVerifyReason.length() == 0) && iMUser.getVerificationType() == 2)) {
            view.setTuxIcon((C2068389v) LIZ.getValue());
            return;
        }
        String str2 = null;
        if (iMUser != null) {
            str = iMUser.getEnterpriseVerifyReason();
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            view.setTuxIcon((C2068389v) LIZIZ.getValue());
            return;
        }
        if (iMUser != null) {
            str2 = iMUser.getCustomVerify();
        }
        if (C78685UuP.LJJJZ(str2)) {
            view.setTuxIcon((C2068389v) LIZJ.getValue());
        } else {
            view.setVisibility(8);
        }
    }
}
