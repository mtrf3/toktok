package X;

import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.core.EffectDependencyLoader;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeatureInfo;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeatureInfoValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SgC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72708SgC {
    public final ActivityC45651qj LIZ;
    public final InterfaceC83624Wrs LIZIZ;
    public final InterfaceC84497XEf LIZJ;
    public final Gson LIZLLL;
    public RTP LJ;
    public EffectDependencyLoader LJFF;
    public boolean LJI;
    public final List<OSZ<Integer, String>> LJII;
    public InterfaceC65784Pro<C76800UCe> LJIIIIZZ;
    public C73411SrX LJIIIZ;

    public C72708SgC(ActivityC45651qj activity, InterfaceC83624Wrs cameraView, InterfaceC84497XEf effectPlatform) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cameraView, "cameraView");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZ = activity;
        this.LIZIZ = cameraView;
        this.LIZJ = effectPlatform;
        this.LIZLLL = new Gson();
        this.LJII = new ArrayList();
    }

    public final void LIZ(Effect effect, List list, List list2) {
        String str;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            com.ss.ugc.effectplatform.model.Effect effect2 = (com.ss.ugc.effectplatform.model.Effect) it.next();
            arrayList.add(new OSZ(effect2.getEffect_id(), effect2.getUnzipPath()));
        }
        java.util.Map LJJLIIIJLJLI = C113554cx.LJJLIIIJLJLI(arrayList);
        EffectDependencyLoader effectDependencyLoader = new EffectDependencyLoader(this.LIZ, this.LIZIZ);
        this.LJFF = effectDependencyLoader;
        if (effect != null) {
            effectDependencyLoader.LIZIZ(66668, 1L, 0L, effect.getUnzipPath());
            ((ArrayList) this.LJII).add(new OSZ(66668, effect.getUnzipPath()));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ProfileNaviFeatureInfo profileNaviFeatureInfo = (ProfileNaviFeatureInfo) it2.next();
            String str2 = (String) LJJLIIIJLJLI.get(profileNaviFeatureInfo.getEffectId());
            if (str2 != null) {
                if (effect != null) {
                    EffectDependencyLoader effectDependencyLoader2 = this.LJFF;
                    if (effectDependencyLoader2 != null) {
                        effectDependencyLoader2.LIZ(66666, 1L, str2, effect.getUnzipPath());
                    }
                } else {
                    EffectDependencyLoader effectDependencyLoader3 = this.LJFF;
                    if (effectDependencyLoader3 != null) {
                        effectDependencyLoader3.LIZIZ(66666, 1L, 0L, str2);
                    }
                }
                ((ArrayList) this.LJII).add(new OSZ(66666, str2));
            }
            String str3 = null;
            if (str2 == null) {
                if (effect != null) {
                    str2 = effect.getUnzipPath();
                } else {
                    str2 = null;
                }
            }
            ProfileNaviFeatureInfoValue colorPicker = profileNaviFeatureInfo.getColorPicker();
            if (colorPicker != null) {
                str = colorPicker.getKey();
            } else {
                str = null;
            }
            LIZIZ(1L, str, str2);
            ProfileNaviFeatureInfoValue flip = profileNaviFeatureInfo.getFlip();
            if (flip != null) {
                str3 = flip.getKey();
            }
            LIZIZ(1L, str3, str2);
            LIZIZ(1L, profileNaviFeatureInfo.getInspirationKey(), str2);
            List<ProfileNaviFeatureInfoValue> sliders = profileNaviFeatureInfo.getSliders();
            if (sliders != null) {
                for (ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue : sliders) {
                    LIZIZ(profileNaviFeatureInfoValue.getValue(), profileNaviFeatureInfoValue.getKey(), str2);
                }
            }
        }
    }

    public final void LIZIZ(Long l, String str, String str2) {
        EffectDependencyLoader effectDependencyLoader;
        if (str == null || l == null || (effectDependencyLoader = this.LJFF) == null) {
            return;
        }
        effectDependencyLoader.LIZ(66667, l.longValue(), str, str2);
    }
}
