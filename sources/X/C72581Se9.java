package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviAnimatedGifDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviFeatureDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviStaticImageDataModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Se9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72581Se9 {
    public static String LIZIZ(InterfaceC72575Se3 interfaceC72575Se3) {
        C72556Sdk c72556Sdk;
        m mVar = new m();
        if (interfaceC72575Se3 instanceof InterfaceC72696Sg0) {
            mVar.LJJIIZ("sticker_id", interfaceC72575Se3.getKey());
        } else {
            mVar.LJJIIZ("inspiration_key", interfaceC72575Se3.getKey());
        }
        InterfaceC72580Se8 LIZ = interfaceC72575Se3.LIZ();
        C72549Sdd LIZIZ = LIZ.LIZIZ();
        if (LIZIZ != null && (c72556Sdk = LIZIZ.LIZIZ) != null) {
            m mVar2 = new m();
            mVar2.LJJIIZ("key", c72556Sdk.LIZ);
            mVar.LJJII("color_picker", mVar2);
        }
        C72583SeB LIZLLL = LIZ.LIZLLL();
        if (LIZLLL != null) {
            m mVar3 = new m();
            mVar3.LJJIIZ("key", LIZLLL.LIZ);
            mVar3.LJJIIJ("value", Integer.valueOf(LIZLLL.LIZIZ));
            mVar.LJJII("flip", mVar3);
        }
        HashMap<String, C72588SeG> LIZJ = LIZ.LIZJ();
        g gVar = new g();
        for (C72588SeG c72588SeG : LIZJ.values()) {
            m mVar4 = new m();
            mVar4.LJJIIZ("key", c72588SeG.LIZ);
            mVar4.LJJIIJ("value", Integer.valueOf(c72588SeG.LJI));
            gVar.LJJII(mVar4);
        }
        mVar.LJJII("sliders", gVar);
        String jVar = mVar.toString();
        o.LJIIIIZZ(jVar, "jsonObject.toString()");
        return jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C72582SeA LIZ(ProfileNaviDataModel data, HashMap hashMap) {
        HashMap<String, C72587SeF> hashMap2;
        InterfaceC72580Se8 interfaceC72580Se8;
        String info;
        C72587SeF c72587SeF;
        o.LJIIIZ(data, "data");
        C72582SeA c72582SeA = new C72582SeA();
        String navi_id = data.getNavi_id();
        if (navi_id != null) {
            c72582SeA.LIZ = navi_id;
        }
        String background_color = data.getBackground_color();
        o.LJIIIZ(background_color, "<set-?>");
        c72582SeA.LIZIZ = background_color;
        List<ProfileNaviStaticImageDataModel> staticImage = data.getStaticImage();
        if (staticImage != null && (!staticImage.isEmpty())) {
            c72582SeA.LJ = ((ProfileNaviStaticImageDataModel) ListProtector.get(staticImage, 0)).getThumbnailUrl();
        }
        List<ProfileNaviAnimatedGifDataModel> animationList = data.getAnimationList();
        if (animationList != null && (!animationList.isEmpty())) {
            c72582SeA.LJFF = ((ProfileNaviAnimatedGifDataModel) ListProtector.get(animationList, 0)).getUrl();
        }
        List<ProfileNaviFeatureDataModel> features = data.getFeatures();
        if (features != null) {
            for (ProfileNaviFeatureDataModel profileNaviFeatureDataModel : features) {
                String category = profileNaviFeatureDataModel.getCategory();
                if (category != null && (interfaceC72580Se8 = (InterfaceC72580Se8) hashMap.get(category)) != null && (info = profileNaviFeatureDataModel.getInfo()) != null) {
                    try {
                        new com.google.gson.o();
                        m LJIIZILJ = com.google.gson.o.LIZ(info).LJIIZILJ();
                        if (!LJIIZILJ.LJJIJLIJ("sticker_id")) {
                            if (LJIIZILJ.LJJIJLIJ("inspiration_key")) {
                                String inspirationKey = LJIIZILJ.LJJIJ("inspiration_key").LJJIFFI();
                                o.LJIIIIZZ(inspirationKey, "inspirationKey");
                                ujb.o.LJJJJZ(inspirationKey, "\"", "", false);
                                if (interfaceC72580Se8.LJ().containsKey(inspirationKey) && (c72587SeF = interfaceC72580Se8.LJ().get(inspirationKey)) != null) {
                                    String groupId = interfaceC72580Se8.getGroupId();
                                    if (groupId == null || groupId.length() == 0) {
                                        c72582SeA.LIZLLL.put(interfaceC72580Se8.getKey(), c72587SeF);
                                    } else {
                                        HashMap<String, C72587SeF> hashMap3 = c72582SeA.LIZLLL;
                                        String groupId2 = interfaceC72580Se8.getGroupId();
                                        o.LJI(groupId2);
                                        hashMap3.put(groupId2, c72587SeF);
                                    }
                                }
                            }
                        } else {
                            String stickerKey = LJIIZILJ.LJJIJ("sticker_id").LJJIFFI();
                            o.LJIIIIZZ(stickerKey, "stickerKey");
                            ujb.o.LJJJJZ(stickerKey, "\"", "", false);
                            Iterator<InterfaceC72696Sg0> it = interfaceC72580Se8.LIZ().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                InterfaceC72696Sg0 next = it.next();
                                if (o.LJ(next.getKey(), stickerKey)) {
                                    String groupId3 = interfaceC72580Se8.getGroupId();
                                    if (groupId3 == null || groupId3.length() == 0) {
                                        c72582SeA.LIZJ.put(interfaceC72580Se8.getKey(), next);
                                    } else {
                                        HashMap<String, InterfaceC72696Sg0> hashMap4 = c72582SeA.LIZJ;
                                        String groupId4 = interfaceC72580Se8.getGroupId();
                                        o.LJI(groupId4);
                                        hashMap4.put(groupId4, next);
                                    }
                                }
                            }
                        }
                        LIZJ(LJIIZILJ, interfaceC72580Se8);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!((InterfaceC72580Se8) entry.getValue()).LJI() && (hashMap2 = c72582SeA.LIZLLL) != null && !hashMap2.containsKey(entry.getKey()) && (!((InterfaceC72580Se8) entry.getValue()).LJ().isEmpty())) {
                HashMap<String, C72587SeF> hashMap5 = c72582SeA.LIZLLL;
                Object key = entry.getKey();
                C72587SeF value = ((InterfaceC72580Se8) entry.getValue()).LJ().entrySet().iterator().next().getValue();
                o.LJIIIIZZ(value, "category.value.inspirati…s.iterator().next().value");
                hashMap5.put(key, value);
            }
        }
        return c72582SeA;
    }

    public static void LIZJ(m mVar, InterfaceC72580Se8 interfaceC72580Se8) {
        C72588SeG c72588SeG;
        if (mVar.LJJIJLIJ("color_picker")) {
            m LJIIZILJ = mVar.LJJIJ("color_picker").LJIIZILJ();
            if (LJIIZILJ.LJJIJLIJ("key")) {
                String LJJIFFI = LJIIZILJ.LJJIJ("key").LJJIFFI();
                C72549Sdd LIZIZ = interfaceC72580Se8.LIZIZ();
                if (LIZIZ != null) {
                    Iterator<C72556Sdk> it = LIZIZ.LIZ.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C72556Sdk next = it.next();
                        if (o.LJ(next.LIZ, LJJIFFI)) {
                            LIZIZ.LIZIZ = next;
                            break;
                        }
                    }
                }
            }
        }
        if (mVar.LJJIJLIJ("flip")) {
            m LJIIZILJ2 = mVar.LJJIJ("flip").LJIIZILJ();
            if (LJIIZILJ2.LJJIJLIJ("key")) {
                String LJJIFFI2 = LJIIZILJ2.LJJIJ("key").LJJIFFI();
                C72583SeB LIZLLL = interfaceC72580Se8.LIZLLL();
                if (LIZLLL != null && o.LJ(LIZLLL.LIZ, LJJIFFI2) && LJIIZILJ2.LJJIJLIJ("value")) {
                    LIZLLL.LIZIZ = LJIIZILJ2.LJJIJ("value").LJIILJJIL();
                }
            }
        }
        if (mVar.LJJIJLIJ("sliders")) {
            Iterator<j> it2 = mVar.LJJIJ("sliders").LJIILLIIL().iterator();
            while (it2.hasNext()) {
                j next2 = it2.next();
                if (next2 instanceof m) {
                    m mVar2 = (m) next2;
                    if (mVar2.LJJIJLIJ("value")) {
                        int LJIILJJIL = mVar2.LJJIJ("value").LJIILJJIL();
                        if (mVar2.LJJIJLIJ("slider_key") || mVar2.LJJIJLIJ("key")) {
                            j LJJIJ = mVar2.LJJIJ("slider_key");
                            if (LJJIJ == null) {
                                LJJIJ = mVar2.LJJIJ("key");
                            }
                            String LJJIFFI3 = LJJIJ.LJJIFFI();
                            if (interfaceC72580Se8.LIZJ().containsKey(LJJIFFI3) && (c72588SeG = interfaceC72580Se8.LIZJ().get(LJJIFFI3)) != null) {
                                c72588SeG.LJI = LJIILJJIL;
                            }
                        }
                    }
                }
            }
        }
    }
}
