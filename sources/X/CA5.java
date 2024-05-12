package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridPropsService;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CA5 extends CA4 {
    @Override // X.CA4
    public final void LJIIZILJ() {
        Context context;
        ActivityC45651qj LIZ;
        if (this.LJLJL == null || (context = this.LJLIL) == null || (LIZ = C29306Beo.LIZ(context)) == null) {
            return;
        }
        String url = this.LJLJL;
        o.LJIIIZ(url, "url");
        C6I c6i = new C6I();
        c6i.LJIIIZ(url);
        c6i.LIZIZ.authority("lynxview_card");
        c6i.LJI(true);
        c6i.LJ(0);
        c6i.LJIIIIZZ("bdhm_bid", "tiktok_live_fundamental_banner_container");
        String uri = c6i.LIZ().toString();
        o.LJIIIIZZ(uri, "SparkCardSchemaBuilder.u…)\n            .toString()");
        if (!this.LJLJI) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS R70 = ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).R70(LIZ, uri, "live_top_right_lynx_banner", new AqS171S0100000_5(this, 508));
            this.LJLJLJ = R70;
            if (R70 != null) {
                SparkContext sparkContext = R70.getSparkContext();
                if (sparkContext != null) {
                    sparkContext.LJJI(new CAB(this.LJLILLLLZI, this.LJLJJL));
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                    SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
                    if (sparkContext2 != null) {
                        C1JI.LJJIJIL(sparkContext2);
                    }
                    SparkContext sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
                    if (sparkContext3 != null) {
                        sparkContext3.LJJIJ(((IHybridPropsService) CN1.LIZ(IHybridPropsService.class)).dg());
                    }
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJLJ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                    C78598Ut0.LJIJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
                    return;
                }
                return;
            }
        }
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
        this.LJLJLJ = C05590Jv.LIZIZ((IHybridContainerService) LIZ2, new MutableContextWrapper(LIZ), uri, false, new AqS171S0100000_5(this, 509), 4);
    }

    @Override // X.CA4, X.CAA
    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        SparkContext sparkContext;
        super.LIZIZ();
        CAB LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLJ) != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null) {
            sparkContext.LJIIJ(AbstractC60811Ntn.class, LJIILJJIL);
        }
        this.LJLJLJ = null;
    }

    @Override // X.CAA
    public final void LJI() {
        LJIILLIIL();
    }

    public CA5(Context context, String str, List<? extends BannerInRoom> list, boolean z, Room room) {
        super(context, str, list, z, room);
    }
}
