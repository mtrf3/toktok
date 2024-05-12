package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridSparkLoader;
import kotlin.jvm.internal.o;

/* renamed from: X.NUz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59453NUz extends AbstractC60800Ntc {
    public final /* synthetic */ AdHybridSparkLoader LJLIL;

    public C59453NUz(AdHybridSparkLoader adHybridSparkLoader) {
        this.LJLIL = adHybridSparkLoader;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        NV4 nv4;
        String str;
        o.LJIIIZ(view, "view");
        if (!this.LJLIL.isLoadFailed) {
            AdHybridSparkLoader.Companion.getClass();
            C58582Rq.LIZ("render success ", AdHybridSparkLoader.tag);
            AdHybridSparkLoader adHybridSparkLoader = this.LJLIL;
            C40177Fpl c40177Fpl = adHybridSparkLoader.sparkMixture;
            if (c40177Fpl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c40177Fpl.LIZIZ) != null && (nv4 = adHybridSparkLoader.iAdHybridLoadStatus) != null) {
                EnumC46475ILv enumC46475ILv = EnumC46475ILv.STATUS_LOAD_SUCCESS;
                SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
                if (sparkContext != null) {
                    str = sparkContext.containerId;
                } else {
                    str = null;
                }
                nv4.ze(new C58978NCs(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, enumC46475ILv, str));
            }
            InterfaceC59067NGd adRenderLifecycle = this.LJLIL.getAdRenderLifecycle();
            if (adRenderLifecycle != null) {
                adRenderLifecycle.LIZLLL(this.LJLIL.isFromPre);
            }
        }
        AdHybridSparkLoader.Companion.getClass();
        C58582Rq.LIZ("render onLoadFinish", AdHybridSparkLoader.tag);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        AdHybridSparkLoader.Companion.getClass();
        C58582Rq.LIZ("render onLoadStart", AdHybridSparkLoader.tag);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        AdHybridSparkLoader adHybridSparkLoader = this.LJLIL;
        adHybridSparkLoader.isLoadFailed = true;
        NV4 nv4 = adHybridSparkLoader.iAdHybridLoadStatus;
        String str = "Unknown_reason";
        if (nv4 != null) {
            String valueOf = String.valueOf(c60704Ns4.LIZ);
            String str2 = c60704Ns4.LIZIZ;
            if (str2 == null) {
                str2 = "Unknown_reason";
            }
            nv4.Zi(valueOf, str2);
        }
        InterfaceC59067NGd adRenderLifecycle = adHybridSparkLoader.getAdRenderLifecycle();
        if (adRenderLifecycle != null) {
            boolean z = adHybridSparkLoader.isFromPre;
            String valueOf2 = String.valueOf(c60704Ns4.LIZ);
            String str3 = c60704Ns4.LIZIZ;
            if (str3 != null) {
                str = str3;
            }
            adRenderLifecycle.LIZ(valueOf2, str, z);
        }
        AdHybridSparkLoader.Companion.getClass();
        C58582Rq.LIZ("render failed", AdHybridSparkLoader.tag);
    }
}
