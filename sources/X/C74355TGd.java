package X;

import android.app.Application;
import com.ss.android.ugc.aweme.sticker.preference.StickerPreferencesRecordAdapter;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS47S1000000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.TGd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74355TGd {
    public static final InterfaceC78118UlG LIZJ() {
        C44350Has c44350Has = new C44350Has(new C45439HsR());
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        return (InterfaceC78118UlG) c44350Has.LIZ(application, StickerPreferencesRecordAdapter.class);
    }

    public static final C74380THc LIZ(C29S activity, C74385THh configure, TNV musicFetcher, InterfaceC84497XEf effectPlatform, List<EffectCategoryModel> defaultCategories) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(musicFetcher, "musicFetcher");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(defaultCategories, "defaultCategories");
        C74380THc c74380THc = new C74380THc(activity, configure, musicFetcher, effectPlatform, defaultCategories, C60903NvH.LJIIJJI().LJIL().LIZ(activity), 32);
        c74380THc.LIZ = new C44365Hb7();
        c74380THc.LIZIZ = new T1V();
        c74380THc.LIZJ = C52312Kg0.LIZ();
        return c74380THc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x016b, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "draft_again") != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.TGB LIZLLL(X.TGD r14, X.TEZ r15, X.InterfaceC46204IBk r16, X.InterfaceC84497XEf r17, X.InterfaceC74343TFr r18, X.C82622Wbi r19) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74355TGd.LIZLLL(X.TGD, X.TEZ, X.IBk, X.XEf, X.TFr, X.Wbi):X.TGB");
    }

    public static C46193IAz LIZIZ(C82622Wbi diContainer, InterfaceC88472Yns interfaceC88472Yns, C45312HqO stickerLogicConfig, C73040SlY c73040SlY, InterfaceC65784Pro stickerManagerConfigureProvider, AqS194S0100000_12 defaultStickerDataManagerFactoryProvider, int i) {
        if ((i & 4) != 0) {
            interfaceC88472Yns = null;
        }
        if ((i & 8) != 0) {
            stickerLogicConfig = new C45312HqO(false, false);
        }
        IBR recordStickerLoginExtraInfoStickerHandlerFactory = c73040SlY;
        if ((i & 16) != 0) {
            recordStickerLoginExtraInfoStickerHandlerFactory = new C73093SmP();
        }
        if ((i & 32) != 0) {
            stickerManagerConfigureProvider = new AqS47S1000000_9(2);
        }
        if ((i & 64) != 0) {
            defaultStickerDataManagerFactoryProvider = new AqS194S0100000_12(diContainer, 273);
        }
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerLogicConfig, "stickerLogicConfig");
        o.LJIIIZ(recordStickerLoginExtraInfoStickerHandlerFactory, "recordStickerLoginExtraInfoStickerHandlerFactory");
        o.LJIIIZ(stickerManagerConfigureProvider, "stickerManagerConfigureProvider");
        o.LJIIIZ(defaultStickerDataManagerFactoryProvider, "defaultStickerDataManagerFactoryProvider");
        return new C46193IAz(diContainer, recordStickerLoginExtraInfoStickerHandlerFactory, new AqS111S0300000_7(stickerManagerConfigureProvider, (InterfaceC65784Pro<C74385THh>) diContainer, (C82622Wbi) interfaceC88472Yns, (InterfaceC88472Yns<? super ID3, C76800UCe>) 38), stickerLogicConfig);
    }
}
