package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.helios.api.config.ApiSampleRateConfig;
import com.bytedance.helios.api.config.DomainRange;
import com.bytedance.helios.api.config.FuseConf;
import com.bytedance.helios.api.config.FuseConfig;
import com.bytedance.helios.api.config.ModifyConf;
import com.bytedance.helios.api.config.ModifyConfig;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.RangeConf;
import com.bytedance.helios.api.config.SampleRateConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.ShutdownConfig;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Pu8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65928Pu8 extends AbstractC65815PsJ {
    public static final C65928Pu8 LIZIZ = new C65928Pu8();
    public static final SettingsModel LIZ = new SettingsModel("helios_default", null, false, false, false, 0, 0, null, null, null, null, new SampleRateConfig(false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, C47261Igj.LJJIJ(new ApiSampleRateConfig(C47261Igj.LJJIJIIJI(400001, 400101, 400203), 0.001d, 0.05d, 1.0d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 16, null)), 1023, null), 0, null, null, null, null, null, null, false, null, null, null, null, null, new NetworkConfig(true, false, 0, 0, null, null, null, null, null, 0, 0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, false, false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, new ShutdownConfig(0.25d, 1.0d, C47261Igj.LJJIJIL(new FuseConfig("shutdown_fuse_default", new RangeConf(null, null, new DomainRange(null, null, C77275UUl.LJIIIIZZ("8c767f728e95dcb290320799adee5c4e2ebd4598647c0629ab25927e5cf89e99", "04e4a48fa1c76160e61c5ee1a6f2428da86f9e898b61bac815b08ac65b3476f1", "30a29eacb4726718180b22517971d52f6b3fc6ad7ffbc317b9de82b49c9906ca", "1618a495d7c873e1608c74d32ed510cec97076a440ad943edc0de4524cbdc778", "d361ecef72bde9719edfd7b02810ef29af2335d83114ebeb65cbc3175550a06a", "82855e4df6fbf1055379104b28a6ae1b4575b6d7fcca89c691c051485b5fb4bf", "4efe880a241b4efa5e86ea4e7be40a275f1f7ac299b279fb2b4a20e7eddd75e7", "892fc69040c6eceff7bc0fada0c9e13eb6f3108f12170d96452b47eb3d4a61d6", "390db46033e8688e6ef734aa41f78117f460ee1547b59850b1d87443ec375fd6", "bbb421c32da51d6c28ffc8add9266bb64fb7a8114cbfd1bdce83b4cd2c424ac3", "e9d472bfb51aad0de80e802829e3234619faf2829510369e8f39af9e434f0f5c", "62211a6b9f51d0737a2c8ee094880b5d5a31ceb3956977fc1a8f827bf78a542a", "1dd632029109b3caccd7f1bb7ad6c959a53e63eede6ba1cb14245d74357ee81f", "1d375f16f46dd8e4413100d4ec7d15d2f8f24ca4154c480799f00c9f8621b8d5", "af8fdc02456aa1bf23dc4fc94be4864b8fa1afdf61889290647a052a1a8fab9e", "9485863fe5bf14fe5aec7ea7ec423cdf457a1d248796626b2101a34092477743"), null, null, 27, null), null, 11, null), new FuseConf(410, "this domain is not allow by default"))), C47261Igj.LJJIJ(new ModifyConfig("shutdown_modify_default", new RangeConf(null, C77275UUl.LJII("http"), new DomainRange(null, C77275UUl.LJIIIIZZ("lf16-scmcdn.oecstatic.com", "lf16-tiktok-common.ttwstatic.com", "f-p-va.isnssdk.com", "tiktok.com", "sg.immers.page", "lf16-tiktok-web.ttwstatic.com", "f-p.sgsnssdk.com", "sf16-website-login.neutral.ttwstatic.com", "www.projectevogame.com", "lf16-upay.g-t-static.com", "v16m.tiktokcdn-us.com", "sf16-short-sg.bytedapm.com", "p19-sign.tiktokcdn-us.com", "p16-webcast.tiktokcdn-us.com", "p19-webcast.tiktokcdn-us.com"), null, null, null, 29, null), null, 9, null), new ModifyConf(C51029K0z.LJJIIZI(new OSZ("http", "https")), null, null == true ? 1 : 0, 6, null == true ? 1 : 0))), null, null, null, null, false, false, false, 2032, null), null, 6291454, null), null, null, null, null, 1040185342, null);

    @Override // X.AbstractC65815PsJ
    public final SettingsModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SettingsModel settingsModel = LIZ;
        SettingsModel settingsModel2 = (SettingsModel) LIZLLL.LJIIIIZZ("helios_settings", SettingsModel.class, settingsModel);
        if (settingsModel2 != null) {
            return settingsModel2;
        }
        return settingsModel;
    }
}
