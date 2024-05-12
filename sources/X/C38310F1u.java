package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.F1u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38310F1u extends AbstractC60800Ntc {
    public final /* synthetic */ Bundle LJLIL;
    public final /* synthetic */ F23 LJLILLLLZI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        View LIZJ;
        EnumC38085Ex7 enumC38085Ex7;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        Bundle bundle = this.LJLIL;
        F23 f23 = this.LJLILLLLZI;
        F3T f3t = (F3T) view.getHybridContext().LIZIZ(F3T.class);
        if (f3t == null) {
            f3t = new F3T();
        }
        C37942Euo c37942Euo = (C37942Euo) view.getHybridContext().LIZIZ(C37942Euo.class);
        if (c37942Euo == null || (LIZJ = view.LIZJ()) == null) {
            return;
        }
        f3t.LIZIZ = view.getHybridContext();
        f3t.LJ(Context.class, new F26(LIZJ.getContext()));
        f3t.LJ(View.class, new F26(LIZJ));
        C38311F1v c38311F1v = (C38311F1v) view.getHybridContext().LIZIZ(C38311F1v.class);
        if (c38311F1v != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c38311F1v.LIZ.get()) != null) {
            f3t.LJ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.class, new F26(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS));
        }
        if (LIZJ instanceof WebView) {
            f3t.LJ(C38049EwX.class, new F26(new C38049EwX((WebView) LIZJ)));
        }
        f3t.LJ(Bundle.class, new F25(bundle));
        C38315F1z c38315F1z = new C38315F1z(view, LIZJ, f3t, c37942Euo);
        f3t.LJ(InterfaceC40516FvE.class, new F25(c38315F1z));
        view.getHybridContext().LJII(InterfaceC40516FvE.class, c38315F1z);
        if (f23 == null) {
            return;
        }
        List<InterfaceC38186Eyk> LIZ = f23.LIZ(f3t);
        if (LIZ != null) {
            for (InterfaceC38186Eyk interfaceC38186Eyk : LIZ) {
                C38236EzY c38236EzY = new C38236EzY();
                c38236EzY.LIZ(interfaceC38186Eyk.getName());
                int i = C38309F1t.LIZ[interfaceC38186Eyk.getAccess().ordinal()];
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
                c38236EzY.LIZLLL = new C38041EwP(interfaceC38186Eyk);
                c37942Euo.LJIILJJIL(c38236EzY);
            }
        }
        List<Class<? extends InterfaceC37666EqM>> LJ = f23.LJ();
        if (LJ == null) {
            return;
        }
        Iterator<Class<? extends InterfaceC37666EqM>> it = LJ.iterator();
        while (it.hasNext()) {
            C37831Et1.LIZIZ(it.next(), null, 6);
        }
    }

    public C38310F1u(Context context, Bundle bundle, F23 f23) {
        this.LJLIL = bundle;
        this.LJLILLLLZI = f23;
    }
}
