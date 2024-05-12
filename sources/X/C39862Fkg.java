package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Fkg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39862Fkg {
    public static C60601NqP LIZ;
    public static int LIZIZ = 1;
    public static boolean LIZJ;

    public static void LIZ() {
        C76800UCe c76800UCe;
        VMI.LJ.getClass();
        C60601NqP c60601NqP = new C60601NqP();
        LIZ = c60601NqP;
        c60601NqP.LIZJ = new C38218EzG();
        c60601NqP.LJ = true;
        c60601NqP.LIZ = new String[]{"com.bytedance.lynx.hybrid.webkit.WebKitView"};
        C39836FkG.LJII.getClass();
        Application LIZIZ2 = C38262Ezy.LIZ().LIZIZ();
        if (C60625Nqn.LJI == null) {
            C60625Nqn.LJI = C16880lQ.LLLLL(LIZIZ2);
            C60625Nqn.LJII = new C39863Fkh();
        }
        C60625Nqn.LIZIZ("hybrid_web_extension_webkit", C60425NnZ.class, new C60633Nqv());
        Application application = C38262Ezy.LIZ().LIZIZ();
        o.LJIIJ(application, "application");
        try {
            Context LLLLL = C16880lQ.LLLLL(application);
            if (LLLLL != null && C37509Enp.LIZ == null) {
                C37509Enp.LIZ = LLLLL;
            }
            InterfaceC37540EoK interfaceC37540EoK = (InterfaceC37540EoK) EXP.LIZIZ(InterfaceC37540EoK.class);
            if (interfaceC37540EoK != null) {
                interfaceC37540EoK.LIZ(C37507Enn.LIZIZ);
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static InterfaceC39855FkZ LIZIZ(C39858Fkc c39858Fkc, InterfaceC39850FkU interfaceC39850FkU, HybridSchemaParam hybridSchemaParam) {
        C39854FkY c39854FkY;
        if (!(interfaceC39850FkU instanceof C39817Fjx)) {
            interfaceC39850FkU = null;
        }
        C39817Fjx c39817Fjx = (C39817Fjx) interfaceC39850FkU;
        if (c39817Fjx != null) {
            c39854FkY = c39817Fjx.LIZ;
        } else {
            c39854FkY = null;
        }
        if (!(c39854FkY instanceof C39854FkY)) {
            return null;
        }
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("needSecLink: ");
        LIZ2.append(hybridSchemaParam.getNeedSecLink());
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ2), null, null, 6);
        if (!hybridSchemaParam.getNeedSecLink()) {
            return null;
        }
        Object obj = c39858Fkc.get("appLanguage");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = c39858Fkc.get("aid");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            C39048FUe.LIZIZ(c39048FUe, C0ON.LIZJ("secLink miss config, appLanguage: ", str, ", aid: ", str2), null, null, 6);
            return null;
        }
        c39854FkY.getClass();
        o.LJIIJ(str2, "<set-?>");
        o.LJIIJ(str, "<set-?>");
        String secLinkScene = hybridSchemaParam.getSecLinkScene();
        if (secLinkScene != null && secLinkScene.length() != 0) {
            String secLinkScene2 = hybridSchemaParam.getSecLinkScene();
            o.LJIIJ(secLinkScene2, "<set-?>");
            c39854FkY.LIZ = secLinkScene2;
        }
        return c39854FkY;
    }
}
