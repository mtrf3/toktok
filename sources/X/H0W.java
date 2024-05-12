package X;

import Y.ACallableS42S0000000_7;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.publish.config.TTUploaderService;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.CheckTitleSensitivityResult;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import defpackage.e1;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H0W {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(GSK.LJLIL);

    public static final void LIZ() {
        if (C1DG.LJIIIIZZ()) {
            return;
        }
        if (e1.LIZ(31744, "studio_enable_authkey_cache_with_validity", true, false)) {
            C43379H0t.LJ(true, new HashMap(0), H0X.LJLIL, H0Y.LJLIL);
        } else {
            C10K.LIZJ(new ACallableS42S0000000_7(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.H11] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.76L] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap] */
    public final C76L<VideoCreation> LIZJ(LinkedHashMap<String, String> linkedHashMap) {
        FSF fsd;
        FSF fsf;
        AbstractC84773XOv abstractC84773XOv;
        this.LIZ.getValue().getClass();
        if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            abstractC84773XOv = new XP7(new Throwable());
        } else {
            LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
            if (linkedHashMap == null) {
                linkedHashMap2 = new HashMap(0);
            }
            if (linkedHashMap2.isEmpty() && e1.LIZ(31744, "studio_enable_authkey_cache_with_validity", true, false)) {
                ExecutorService LIZLLL = C38995FSd.LIZLLL();
                if (LIZLLL instanceof FSF) {
                    fsf = (FSF) LIZLLL;
                } else {
                    if (LIZLLL instanceof ScheduledExecutorService) {
                        fsd = new ScheduledExecutorServiceC65728Pqu((ScheduledExecutorService) LIZLLL);
                    } else {
                        fsd = new FSD(LIZLLL);
                    }
                    fsf = fsd;
                }
                abstractC84773XOv = fsf.submit((Callable) new XAM(linkedHashMap2));
            } else {
                UploaderRetrofitService uploaderRetrofitService = (UploaderRetrofitService) C60903NvH.LJIIJJI().getNetworkService().createRetrofit(AVApiImpl.LIZJ().LIZ(), true, UploaderRetrofitService.class);
                long currentTimeMillis = System.currentTimeMillis();
                C76L<UploadAuthKeyConfig> uploadAuthKeyConfig = uploaderRetrofitService.getUploadAuthKeyConfig(linkedHashMap2);
                if (linkedHashMap2.isEmpty()) {
                    H0V h0v = new H0V(currentTimeMillis);
                    uploadAuthKeyConfig.LJFF(new RunnableC65751PrH(uploadAuthKeyConfig, h0v), EnumC169566l6.LJLIL);
                }
                C43365H0f c43365H0f = new C43365H0f(uploadAuthKeyConfig, IOException.class, new H12() { // from class: X.H11
                    @Override // X.H12
                    public final XPE apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        String LIZ = C43379H0t.LIZ();
                        if (TextUtils.isEmpty(LIZ)) {
                            return new XP7(th);
                        }
                        Object fromJson = GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), LIZ, (Class<Object>) UploadAuthKeyConfig.class);
                        if (fromJson == null) {
                            return C43956HMy.LJLJI;
                        }
                        return new C43956HMy(fromJson);
                    }
                });
                uploadAuthKeyConfig.LJFF(c43365H0f, EnumC169566l6.LJLIL);
                abstractC84773XOv = c43365H0f;
            }
        }
        o.LJIIIIZZ(abstractC84773XOv, "mAuthKeyService.refreshUploadAuthKeyConfig(params)");
        return abstractC84773XOv;
    }

    public static final AbstractC73672Svk<CheckTitleSensitivityResult> LIZIZ(String title, EnumC41098GBa type) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(type, "type");
        AbstractC73672Svk<CheckTitleSensitivityResult> LIZ = TTUploaderService.LIZ(title, type);
        o.LJIIIIZZ(LIZ, "getTitleSensitivityResult(title, type)");
        return LIZ;
    }
}
