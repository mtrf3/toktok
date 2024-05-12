package X;

import android.view.View;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxViewClient;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NVP extends LynxViewClient {
    public final /* synthetic */ NVO LIZ;
    public final /* synthetic */ InterfaceC60761Nsz LIZIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        NOY noy;
        C59297NOz c59297NOz;
        ViewParent viewParent;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        View LIZJ;
        SparkContext sparkContext = this.LIZ.LJLJLJ;
        if (sparkContext != null && (noy = (NOY) sparkContext.LIZIZ(NOY.class)) != null && (c59297NOz = noy.LJJLIIJ) != null && o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
            NVO nvo = this.LIZ;
            View LIZJ2 = this.LIZIZ.LIZJ();
            if (LIZJ2 != null) {
                viewParent = LIZJ2.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) viewParent;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
            }
            if (nvo.LJZI) {
                return;
            }
            nvo.LJZI = true;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setId(R.id.u3);
                InterfaceC60761Nsz kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
                if (kitView != null && (LIZJ = kitView.LIZJ()) != null) {
                    LIZJ.setId(R.id.st);
                }
            }
            HashSet hashSet = new HashSet();
            hashSet.add("ad_lynx_container");
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
                return;
            }
            C12460eI.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, new AqS114S0300000_10(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, nvo, hashSet, 24));
        }
    }

    public NVP(NVO nvo, InterfaceC60761Nsz interfaceC60761Nsz) {
        this.LIZ = nvo;
        this.LIZIZ = interfaceC60761Nsz;
    }
}
