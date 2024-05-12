package Y;

import X.C151345wo;
import X.C151385ws;
import X.C151445wy;
import X.C151535x7;
import X.C1554568f;
import X.C32I;
import X.C43073GvN;
import X.C47261Igj;
import X.C5XB;
import X.C5XC;
import X.C5XE;
import X.C60903NvH;
import X.C62850Ola;
import X.C6DR;
import X.C6NU;
import X.C6NZ;
import X.C76800UCe;
import X.EnumC43649HBd;
import X.H78;
import X.InterfaceC43072GvM;
import X.ORZ;
import X.OSZ;
import X.RunnableC151315wl;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.image.model.EditImageInfo;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.VEEditor;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS54S0300000_2 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS54S0300000_2 aCallableS54S0300000_2) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = (List) aCallableS54S0300000_2.l0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            String str = ((C5XE) obj).LIZ;
            if (str != null && str.length() > 0) {
                arrayList2.add(obj);
            }
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS54S0300000_2.l1;
        C5XB c5xb = (C5XB) aCallableS54S0300000_2.l2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C5XE c5xe = (C5XE) it.next();
            C5XC c5xc = c5xe.LJII;
            if (c5xc != null) {
                LoudnessDetectResult LIZIZ = c5xc.LIZIZ(c5xe);
                if (LIZIZ == null || LIZIZ.avgLoudness == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || LIZIZ.peakLoudness == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Need to detect loudness for ");
                    LIZ.append(c5xe.LJI);
                    H78.LIZIZ("LoudnessNormalization", X1D.LIZIZ(LIZ));
                    arrayList3.add(c5xe);
                } else {
                    String str2 = c5xe.LIZ;
                    if (str2 != null) {
                        linkedHashMap.put(str2, LIZIZ);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Dont Need to detect loudness for ");
                    LIZ2.append(c5xe.LJI);
                    H78.LIZIZ("LoudnessNormalization", X1D.LIZIZ(LIZ2));
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            videoPublishEditModel.creativeModel.audioAlgorithmModel.isLoudnessCheckOn = true;
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                String str3 = ((C5XE) it2.next()).LIZ;
                if (str3 != null) {
                    arrayList4.add(str3);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            String[] audioUrls = (String[]) arrayList4.toArray(new String[0]);
            ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList5.add(Integer.valueOf(((C5XE) it3.next()).LIZIZ));
            }
            int[] LLJ = ORZ.LLJ(arrayList5);
            ArrayList arrayList6 = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList6.add(Integer.valueOf(((C5XE) it4.next()).LIZJ));
            }
            int[] LLJ2 = ORZ.LLJ(arrayList6);
            c5xb.getClass();
            o.LJIIIZ(audioUrls, "audioUrls");
            LoudnessDetectResult[] LJIILJJIL = VEEditor.LJIILJJIL(audioUrls, LLJ, LLJ2);
            o.LJIIIIZZ(LJIILJJIL, "detectAudioLoudness(\n   …rtTime, endTime\n        )");
            Iterator it5 = arrayList3.iterator();
            int i = 0;
            while (it5.hasNext()) {
                Object next = it5.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C5XE c5xe2 = (C5XE) next;
                    String str4 = c5xe2.LIZ;
                    if (str4 != null) {
                        linkedHashMap.put(str4, LJIILJJIL[i]);
                        C5XC c5xc2 = c5xe2.LJII;
                        if (c5xc2 != null) {
                            LoudnessDetectResult loudnessDetectResult = LJIILJJIL[i];
                            o.LJIIIZ(loudnessDetectResult, "loudnessDetectResult");
                            Map<String, com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult> map = c5xc2.LIZ.creativeModel.loudnessBalanceModel.loudnessMap;
                            com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult loudnessDetectResult2 = new com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult(0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, 15, null);
                            loudnessDetectResult2.result = loudnessDetectResult.result;
                            loudnessDetectResult2.avgLoudness = loudnessDetectResult.avgLoudness;
                            loudnessDetectResult2.peakLoudness = loudnessDetectResult.peakLoudness;
                            loudnessDetectResult2.audioPath = str4;
                            map.put(str4, loudnessDetectResult2);
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("detect result: ");
                        LIZ3.append(LJIILJJIL[i].avgLoudness);
                        LIZ3.append(' ');
                        LIZ3.append(LJIILJJIL[i].peakLoudness);
                        H78.LIZIZ("LoudnessNormalization", X1D.LIZIZ(LIZ3));
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        Iterator it6 = ((List) aCallableS54S0300000_2.l0).iterator();
        while (it6.hasNext()) {
            Object obj2 = linkedHashMap.get(((C5XE) it6.next()).LIZ);
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        return arrayList.toArray(new LoudnessDetectResult[0]);
    }

    public static final Object call$1(ACallableS54S0300000_2 aCallableS54S0300000_2) {
        Activity activity = ((ImageEditRootScene) aCallableS54S0300000_2.l0).mActivity;
        if (activity != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS54S0300000_2.l1;
            List<? extends StickerModel> list = (List) aCallableS54S0300000_2.l2;
            InterfaceC43072GvM LJ = C62850Ola.LJ();
            CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
            new C6NU(C43073GvN.LIZLLL(LJ, creativeInfo, EnumC43649HBd.IMAGE_STICKER, null, false, 12), activity, new C6NZ(activity, new OSZ(0, 0), null, 0, 480, null), null).LIZ(list);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS54S0300000_2 aCallableS54S0300000_2) {
        C1554568f c1554568f = (C1554568f) aCallableS54S0300000_2.l0;
        Context context = (Context) aCallableS54S0300000_2.l1;
        IEffectPlatformBaseListener iEffectPlatformBaseListener = (IEffectPlatformBaseListener) aCallableS54S0300000_2.l2;
        if (context == null) {
            c1554568f.getClass();
            return null;
        }
        if (c1554568f.LIZJ == null) {
            c1554568f.LIZJ = AVServiceImpl.LIZ().effectService().createFontEffectPlatform(C60903NvH.LJ);
        }
        c1554568f.LIZJ.LJI("textfont", false, new C6DR(c1554568f, iEffectPlatformBaseListener));
        return null;
    }

    public static final Object call$3(ACallableS54S0300000_2 aCallableS54S0300000_2) {
        File LIZ = C151445wy.LIZ((CreativeInfo) aCallableS54S0300000_2.l0, true);
        Map map = (Map) aCallableS54S0300000_2.l1;
        ImageAlbumData imageAlbumData = (ImageAlbumData) aCallableS54S0300000_2.l2;
        for (Map.Entry entry : map.entrySet()) {
            String path = LIZ.getPath();
            C151535x7 c151535x7 = C151535x7.LIZ;
            int intValue = ((Number) entry.getValue()).intValue();
            c151535x7.getClass();
            String tempImagePath = new File(path, C151535x7.LJIIIIZZ(intValue)).getPath();
            boolean autoEnhanceOn = imageAlbumData.getAutoEnhanceOn();
            new RunnableC151315wl((SingleImageData) entry.getKey(), imageAlbumData, tempImagePath, new C151385ws(false, Boolean.valueOf(autoEnhanceOn)), new AqS168S0100000_2(entry, (Map.Entry<SingleImageData, Integer>) 612), null, 32).run();
            EditImageInfo editImageInfo = ((SingleImageData) entry.getKey()).getEditImageInfo();
            o.LJIIIIZZ(tempImagePath, "tempImagePath");
            EditImageInfo.setTempSynthesisPath$default(editImageInfo, tempImagePath, false, 2, null);
            editImageInfo.setLocalImageWithEnhance(autoEnhanceOn);
            editImageInfo.setNeedCompileLocalImage(false);
            ((SingleImageData) entry.getKey()).getFilterInfo().setNeedRender(false);
        }
        C151345wo.LIZIZ();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS54S0300000_2(Object obj, CreativeInfo creativeInfo, Map<SingleImageData, Integer> map, ImageAlbumData imageAlbumData) {
        this.$t = imageAlbumData;
        this.l0 = obj;
        this.l1 = creativeInfo;
        this.l2 = map;
    }
}
