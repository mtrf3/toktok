package X;

import Y.ARunnableS23S0200000_4;
import Y.ARunnableS40S0100000_4;
import Y.ARunnableS8S0101000_4;
import Y.AgS123S0100000_6;
import Y.AgS131S0100000_15;
import android.os.Handler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS0S0300000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.ttep.IDownloadCallback;
import com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApi;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XFA implements ITTEPAbilityService {
    public static final XFA LIZ = new XFA();

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final C10K<Effect> downloadPreviewEffectAndResourceWithoutLoginTask(String host, String effectId) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(effectId, "effectId");
        return C84494XEc.LIZ(host, effectId, XCB.LIZJ()).LJFF(XFF.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void fetchTTEPMaterials(String host, InterfaceC88471Ynr<Object, ? super Exception, C76800UCe> callback) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(callback, "callback");
        try {
            ((EffectFetchApi) C60903NvH.LJIIJJI().getNetworkService().createRetrofit(host, true, EffectFetchApi.class)).fetchTTEPMaterials().LIZLLL(new AgS123S0100000_6(callback, 15));
        } catch (Exception e) {
            callback.invoke(null, e);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadPreviewEffectAndResource(String host, String effectId, IDownloadCallback callback) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(callback, "callback");
        new XFB(C84494XEc.LIZ).invoke(host, effectId, XCB.LIZJ()).LIZLLL(new AgS131S0100000_15(callback, 11));
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadPreviewEffectAndResourceWithoutLogin(String host, String effectId, IDownloadCallback callback) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(callback, "callback");
        new XFC(C84494XEc.LIZ).invoke(host, effectId, XCB.LIZJ()).LIZLLL(new AgS131S0100000_15(callback, 11));
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadEffectAndJumpShootPage(final ActivityC45651qj activity, InterfaceC65784Pro<Boolean> isViewValid, String url, final InterfaceC88472Yns<? super Integer, C76800UCe> closeScanView, InterfaceC88472Yns<? super Boolean, C76800UCe> setIsNeedLoadStickerStatus) {
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(isViewValid, "isViewValid");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(closeScanView, "closeScanView");
        o.LJIIIZ(setIsNeedLoadStickerStatus, "setIsNeedLoadStickerStatus");
        if (!isViewValid.invoke().booleanValue()) {
            return;
        }
        if (!C44172HVg.LJIJ.isLogin()) {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS23S0200000_4(closeScanView, activity, 29), 0L);
            C44172HVg.LJIJ.LIZ(activity, "", "schema_record", null, new XFD());
            return;
        }
        if (!e1.LIZ(31744, "creator_preview_enable", true, false)) {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS40S0100000_4(closeScanView, 116));
            return;
        }
        setIsNeedLoadStickerStatus.invoke(Boolean.TRUE);
        try {
            str = UriProtector.getQueryParameter(UriProtector.parse(url), "object_id");
        } catch (Exception unused) {
            str = "";
        }
        if (str != null) {
            if (str.length() == 0) {
                return;
            }
            downloadPreviewEffectAndResource("https://effecthouse.tiktok.com", str, new IDownloadCallback() { // from class: X.9qX
                @Override // com.ss.android.ugc.aweme.services.ttep.IDownloadCallback
                public final void onSuccess(Effect effect) {
                    o.LJIIIZ(effect, "effect");
                    RecordConfig.Builder builder = new RecordConfig.Builder();
                    builder.creationId(UUID.randomUUID().toString());
                    builder.setEnterTTEPPageMode(1);
                    builder.setTTEPPreviewEffect(effect);
                    builder.shootWay("scan");
                    AVExternalServiceImpl.LIZ().asyncService("scan", new IDLCallbackS0S0300000_7(closeScanView, activity, builder, 7));
                }

                @Override // com.ss.android.ugc.aweme.services.ttep.IDownloadCallback
                public final void onFail(int i, String message, Exception exc) {
                    int i2;
                    o.LJIIIZ(message, "message");
                    if (i != 0) {
                        if (o.LJ(message, "exceed limit")) {
                            i2 = R.string.g16;
                        } else if (o.LJ(message, "no permission")) {
                            i2 = R.string.ji;
                        } else {
                            i2 = R.string.rf3;
                        }
                        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS8S0101000_4(i2, activity, 9), 500L);
                    }
                    closeScanView.invoke(300);
                }
            });
        }
    }
}
