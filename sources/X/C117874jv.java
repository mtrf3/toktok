package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.dm.DMPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.vesdk.VEUtils;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4jv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117874jv {
    public static final java.util.Map<String, GUX> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, List<InterfaceC41771GaN>> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<String, Integer> LIZJ = new LinkedHashMap();

    public static PublishModel LIZIZ(BaseShortVideoContext baseShortVideoContext) {
        String creationId = baseShortVideoContext.getCreationId();
        o.LJIIIIZZ(creationId, "editModel.creationId");
        return new PublishModel("chat_shoot", creationId, 0, GWB.NOT_RETRY, false, 0, 2, C61878OQg.INSTANCE, baseShortVideoContext, null, false, null, false, false, false, true, null, false, null, 491008, null);
    }

    public static PublishModel LIZLLL(BaseShortVideoContext baseShortVideoContext) {
        String creationId = baseShortVideoContext.getCreationId();
        o.LJIIIIZZ(creationId, "editModel.creationId");
        return new PublishModel("chat_shoot", creationId, 0, GWB.NOT_RETRY, false, 0, 2, C61878OQg.INSTANCE, baseShortVideoContext, null, false, null, false, false, false, true, null, false, null, 491008, null);
    }

    public static void LIZ(InterfaceC41771GaN callback, String str) {
        o.LJIIIZ(callback, "callback");
        java.util.Map<String, List<InterfaceC41771GaN>> map = LIZIZ;
        if (map.containsKey(str)) {
            List list = (List) ((LinkedHashMap) map).get(str);
            if (list != null) {
                list.add(callback);
                return;
            }
            return;
        }
        map.put(str, C47261Igj.LJJIJIL(callback));
    }

    public static C41769GaL LIZJ(String str, String str2) {
        LIZJ.put(str, 0);
        return new C41769GaL(str, str2);
    }

    public static void LJ(String str, InterfaceC88472Yns interfaceC88472Yns) {
        List list = (List) ((LinkedHashMap) LIZIZ).get(str);
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; -1 < size; size--) {
            interfaceC88472Yns.invoke(ListProtector.get(list, size));
        }
    }

    public static void LJIIIIZZ(InterfaceC41771GaN callback, String key) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(callback, "callback");
        java.util.Map<String, List<InterfaceC41771GaN>> map = LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        List list = (List) linkedHashMap.get(key);
        if (list != null) {
            list.remove(callback);
        }
        List list2 = (List) linkedHashMap.get(key);
        if (list2 != null && list2.isEmpty()) {
            map.remove(key);
        }
    }

    public static void LJII(String str, C117844js templateWrapper, boolean z) {
        OSZ osz;
        PublishModel publishModel;
        o.LJIIIZ(templateWrapper, "templateWrapper");
        String str2 = templateWrapper.LIZ;
        if (str2 == null) {
            osz = new OSZ(Boolean.FALSE, null);
        } else {
            VEUtils.VEVideoFileInfo vEVideoFileInfo = templateWrapper.LJII;
            if (vEVideoFileInfo == null) {
                osz = new OSZ(Boolean.FALSE, null);
            } else {
                OSZ<Boolean, BaseShortVideoContext> createVideoPublishEditModel = DMPublishService.INSTANCE.createVideoPublishEditModel(str, str2, templateWrapper.LJ, templateWrapper.LJFF, vEVideoFileInfo.duration, vEVideoFileInfo.fps, vEVideoFileInfo.bitrate, vEVideoFileInfo.codec, vEVideoFileInfo.keyFrameCount, z);
                if (!createVideoPublishEditModel.getFirst().booleanValue()) {
                    osz = new OSZ(Boolean.FALSE, null);
                } else {
                    BaseShortVideoContext second = createVideoPublishEditModel.getSecond();
                    if (second == null) {
                        osz = new OSZ(Boolean.FALSE, null);
                    } else {
                        osz = new OSZ(Boolean.TRUE, LIZLLL(second));
                    }
                }
            }
        }
        if (!((Boolean) osz.getFirst()).booleanValue() || (publishModel = (PublishModel) osz.getSecond()) == null) {
            return;
        }
        DMPublishService dMPublishService = DMPublishService.INSTANCE;
        String publishDMMedia = dMPublishService.publishDMMedia(publishModel);
        C41769GaL LIZJ2 = LIZJ(str, publishDMMedia);
        dMPublishService.addPublishCallback(publishDMMedia, LIZJ2);
        LIZ.put(str, LIZJ2);
    }

    public static /* synthetic */ void LJI(String str, C117814jp c117814jp, int i, boolean z, int i2) {
        boolean z2;
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            z3 = false;
        }
        LJFF(str, c117814jp, i, z2, false, z3);
    }

    public static void LJFF(String key, C117814jp templateWrapper, int i, boolean z, boolean z2, boolean z3) {
        OSZ osz;
        PublishModel publishModel;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(templateWrapper, "templateWrapper");
        String str = templateWrapper.LIZ;
        if (str == null) {
            osz = new OSZ(Boolean.FALSE, null);
        } else {
            OSZ<Boolean, BaseShortVideoContext> createPhotoPublishEditModel = DMPublishService.INSTANCE.createPhotoPublishEditModel(key, str, i, z2, z, z3);
            if (!createPhotoPublishEditModel.getFirst().booleanValue()) {
                osz = new OSZ(Boolean.FALSE, null);
            } else {
                BaseShortVideoContext second = createPhotoPublishEditModel.getSecond();
                if (second == null) {
                    osz = new OSZ(Boolean.FALSE, null);
                } else {
                    osz = new OSZ(Boolean.TRUE, LIZIZ(second));
                }
            }
        }
        if (!((Boolean) osz.getFirst()).booleanValue() || (publishModel = (PublishModel) osz.getSecond()) == null) {
            return;
        }
        DMPublishService dMPublishService = DMPublishService.INSTANCE;
        String publishDMMedia = dMPublishService.publishDMMedia(publishModel);
        C41769GaL LIZJ2 = LIZJ(key, publishDMMedia);
        dMPublishService.addPublishCallback(publishDMMedia, LIZJ2);
        LIZ.put(key, LIZJ2);
    }
}
