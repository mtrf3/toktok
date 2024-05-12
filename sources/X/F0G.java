package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F0G extends QZV {
    public static final F0G LIZ = new F0G();

    public final C37940Eum LJIJI(InterfaceC37947Eut interfaceC37947Eut) {
        C37940Eum c37940Eum = new C37940Eum();
        c37940Eum.LJLJI = new C77117UOj();
        ((ArrayList) c37940Eum.LJLJLLL).addAll(C38083Ex5.LIZ());
        ((ArrayList) c37940Eum.LJLJLJ).addAll(C38083Ex5.LIZIZ(C47261Igj.LJJIJ("host"), true));
        C38024Ew8 c38024Ew8 = new C38024Ew8();
        C37932Eue c37932Eue = c37940Eum.LJLIL.LIZ;
        c37932Eue.getClass();
        C37904EuC c37904EuC = c37932Eue.LIZ;
        c37904EuC.getClass();
        C37965EvB c37965EvB = c37904EuC.LIZJ;
        c37965EvB.getClass();
        c37965EvB.LIZ.add(c38024Ew8);
        return c37940Eum;
    }

    public static F3T LJIJJ(InterfaceC60761Nsz iKitView, C37942Euo c37942Euo) {
        Context context;
        Context context2;
        Object f0q;
        InterfaceC60553Npd c1a7;
        InterfaceC60710NsA interfaceC60710NsA;
        Context context3;
        o.LJIIIZ(iKitView, "iKitView");
        F3T f3t = new F3T();
        View LIZJ = iKitView.LIZJ();
        f3t.LIZIZ = iKitView.getHybridContext();
        View LIZJ2 = iKitView.LIZJ();
        EnumC39924Flg enumC39924Flg = null;
        if (LIZJ2 != null) {
            context = LIZJ2.getContext();
        } else {
            context = null;
        }
        f3t.LJ(Context.class, new F26(context));
        f3t.LJ(View.class, new F26(LIZJ));
        View LIZJ3 = iKitView.LIZJ();
        if (LIZJ3 != null && (context3 = LIZJ3.getContext()) != null) {
            context2 = C16880lQ.LLLLL(context3);
        } else {
            context2 = null;
        }
        if (context2 instanceof Application) {
            f3t.LJ(Application.class, new F25(context2));
        }
        C60737Nsb c60737Nsb = f3t.LIZIZ;
        if (c60737Nsb != null && (interfaceC60710NsA = c60737Nsb.hybridParams) != null) {
            enumC39924Flg = interfaceC60710NsA.getType();
        }
        C62822Ol8 c62822Ol8 = F0J.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() != 1) {
            f0q = new F0P(enumC39924Flg, new WeakReference(iKitView));
        } else {
            f0q = new F0Q(enumC39924Flg, new WeakReference(iKitView));
        }
        f3t.LJ(InterfaceC40516FvE.class, new F25(f0q));
        if (LIZJ instanceof WebView) {
            f3t.LJ(WebView.class, new F26(LIZJ));
            f3t.LJ(C38049EwX.class, new F25(new C38049EwX((WebView) LIZJ)));
        } else if (LIZJ instanceof VNS) {
            f3t.LJ(VNS.class, new F26(LIZJ));
        }
        if (((Number) c62822Ol8.getValue()).intValue() != 1) {
            c1a7 = new C38291F1b();
        } else {
            c1a7 = new C1A7();
        }
        F0H f0h = new F0H();
        f0h.LIZIZ = "99999";
        f3t.LJ(InterfaceC60276NlA.class, new F25(new C60544NpU(c1a7, new C60510Now(f0h.LIZ, f0h.LIZIZ, f0h.LIZJ))));
        f3t.LJ(InterfaceC60761Nsz.class, new F26(iKitView));
        return f3t;
    }

    public static C38236EzY LJIJJLI(InterfaceC38186Eyk interfaceC38186Eyk, InterfaceC60761Nsz iKitView) {
        EnumC39924Flg enumC39924Flg;
        boolean z;
        EnumC38085Ex7 enumC38085Ex7;
        o.LJIIIZ(iKitView, "iKitView");
        InterfaceC60710NsA interfaceC60710NsA = iKitView.getHybridContext().hybridParams;
        if (interfaceC60710NsA != null) {
            enumC39924Flg = interfaceC60710NsA.getType();
        } else {
            enumC39924Flg = null;
        }
        if (enumC39924Flg == EnumC39924Flg.WEB) {
            z = true;
        } else {
            z = false;
        }
        C38236EzY c38236EzY = new C38236EzY();
        c38236EzY.LIZ(interfaceC38186Eyk.getName());
        c38236EzY.LIZJ = "";
        int i = C38040EwO.LIZ[interfaceC38186Eyk.getAccess().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    enumC38085Ex7 = EnumC38085Ex7.PUBLIC;
                } else {
                    enumC38085Ex7 = EnumC38085Ex7.PROTECT;
                }
            } else {
                enumC38085Ex7 = EnumC38085Ex7.PUBLIC;
            }
        } else {
            enumC38085Ex7 = EnumC38085Ex7.PRIVATE;
        }
        c38236EzY.LIZIZ(enumC38085Ex7);
        interfaceC38186Eyk.getNeedCallback();
        c38236EzY.LIZLLL = new C38039EwN(z, interfaceC38186Eyk, iKitView);
        return c38236EzY;
    }
}
