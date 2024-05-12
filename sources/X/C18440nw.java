package X;

import com.bytedance.android.live.effect.navi.model.ProfileNaviFeatureInfo;
import com.bytedance.android.live.effect.navi.model.ProfileNaviFeatureInfoValue;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18440nw {
    public final InterfaceC08020Te LIZ;
    public final java.util.Map<String, String> LIZIZ;
    public final Gson LIZJ;
    public C20000qS LIZLLL;
    public boolean LJ;
    public C73411SrX LJFF;
    public final List<C18430nv> LJI;

    public final void LIZJ() {
        if (this.LJ) {
            return;
        }
        C73411SrX c73411SrX = this.LJFF;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJFF = null;
        this.LJ = true;
    }

    public C18440nw(InterfaceC08020Te effectWrapper, java.util.Map<String, String> map) {
        o.LJIIIZ(effectWrapper, "effectWrapper");
        this.LIZ = effectWrapper;
        this.LIZIZ = map;
        this.LIZJ = new Gson();
        this.LJI = new ArrayList();
    }

    public final void LIZ(List<ProfileNaviFeatureInfo> list, List<? extends Effect> list2) {
        String str;
        C20000qS c20000qS = this.LIZLLL;
        if (c20000qS != null) {
            java.util.Map<C20000qS, OSZ<List<ProfileNaviFeatureInfo>, List<Effect>>> map = C18420nu.LIZIZ;
            if (!map.containsKey(c20000qS)) {
                map.put(c20000qS, new OSZ<>(list, list2));
            }
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        for (Effect effect : list2) {
            arrayList.add(new OSZ(effect.getEffect_id(), effect.getUnzipPath()));
        }
        java.util.Map LJJLIIIJLJLI = C113554cx.LJJLIIIJLJLI(arrayList);
        C0NB.LJ("LiveNaviAvatar", "send the start message(66640 1 0 avatar_load)");
        this.LIZ.LJJIJL(66640, 1L, 0L, "avatar_load");
        for (ProfileNaviFeatureInfo profileNaviFeatureInfo : list) {
            String str2 = (String) LJJLIIIJLJLI.get(profileNaviFeatureInfo.getEffectId());
            if (str2 != null) {
                this.LIZ.LJJIJL(66666, 1L, 0L, str2);
            }
            ProfileNaviFeatureInfoValue colorPicker = profileNaviFeatureInfo.getColorPicker();
            String str3 = null;
            if (colorPicker != null) {
                str = colorPicker.getKey();
            } else {
                str = null;
            }
            LIZIZ(1L, str);
            ProfileNaviFeatureInfoValue flip = profileNaviFeatureInfo.getFlip();
            if (flip != null) {
                str3 = flip.getKey();
            }
            LIZIZ(1L, str3);
            LIZIZ(1L, profileNaviFeatureInfo.getInspirationKey());
            List<ProfileNaviFeatureInfoValue> sliders = profileNaviFeatureInfo.getSliders();
            if (sliders != null) {
                for (ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue : sliders) {
                    LIZIZ(profileNaviFeatureInfoValue.getValue(), profileNaviFeatureInfoValue.getKey());
                }
            }
        }
        for (C18430nv c18430nv : this.LJI) {
            this.LIZ.LJJIJL(c18430nv.LIZ, c18430nv.LIZIZ, c18430nv.LIZJ, c18430nv.LIZLLL);
        }
        ((ArrayList) this.LJI).clear();
        C0NB.LJ("LiveNaviAvatar", "send the end message(66640 0 0 avatar_load)");
        this.LIZ.LJJIJL(66640, 0L, 0L, "avatar_load");
    }

    public final void LIZIZ(Long l, String str) {
        if (str == null || l == null) {
            return;
        }
        ((ArrayList) this.LJI).add(new C18430nv(l.longValue(), str));
    }
}
