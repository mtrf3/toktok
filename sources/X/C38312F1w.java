package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.F1w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38312F1w extends AbstractC60800Ntc {
    public final /* synthetic */ AdSparkUtils LJLIL;
    public final /* synthetic */ Bundle LJLILLLLZI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        F3T f3t;
        C37942Euo c37942Euo;
        View LIZJ;
        EnumC38085Ex7 enumC38085Ex7;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        AdSparkUtils adSparkUtils = this.LJLIL;
        Bundle bundle = this.LJLILLLLZI;
        adSparkUtils.getClass();
        C60737Nsb hybridContext = view.getHybridContext();
        if (hybridContext == null || (f3t = (F3T) hybridContext.LIZIZ(F3T.class)) == null) {
            f3t = new F3T();
        }
        C60737Nsb hybridContext2 = view.getHybridContext();
        if (hybridContext2 == null || (c37942Euo = (C37942Euo) hybridContext2.LIZIZ(C37942Euo.class)) == null || (LIZJ = view.LIZJ()) == null) {
            return;
        }
        C40474FuY c40474FuY = new C40474FuY();
        f3t.LIZIZ = view.getHybridContext();
        f3t.LJFF(Context.class, LIZJ.getContext());
        f3t.LJFF(View.class, LIZJ);
        C38314F1y c38314F1y = (C38314F1y) view.getHybridContext().LIZIZ(C38314F1y.class);
        if (c38314F1y != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c38314F1y.LIZ.get()) != null) {
            f3t.LJFF(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.class, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        if (LIZJ instanceof WebView) {
            f3t.LJFF(C38049EwX.class, new C38049EwX((WebView) LIZJ));
        }
        f3t.LIZLLL(Bundle.class, bundle);
        F20 f20 = new F20(view, LIZJ, f3t, c37942Euo);
        f3t.LIZLLL(InterfaceC40516FvE.class, f20);
        view.getHybridContext().LJII(InterfaceC40516FvE.class, f20);
        Iterator it = ((ArrayList) c40474FuY.createBridges(f3t)).iterator();
        while (it.hasNext()) {
            InterfaceC38186Eyk interfaceC38186Eyk = (InterfaceC38186Eyk) it.next();
            C38236EzY c38236EzY = new C38236EzY();
            c38236EzY.LIZ(interfaceC38186Eyk.getName());
            int i = C38313F1x.LIZ[interfaceC38186Eyk.getAccess().ordinal()];
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
            c38236EzY.LIZLLL = new C38043EwR(interfaceC38186Eyk);
            c37942Euo.LJIILJJIL(c38236EzY);
        }
    }

    public C38312F1w(AdSparkUtils adSparkUtils, Context context, Bundle bundle) {
        this.LJLIL = adSparkUtils;
        this.LJLILLLLZI = bundle;
    }
}
