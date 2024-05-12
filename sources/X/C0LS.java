package X;

import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.0LS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LS {
    public static final void LIZ(LiveEffect liveEffect) {
        boolean z;
        String LJJIFFI;
        boolean z2;
        Effect effect = liveEffect.getEffect();
        if (effect == null) {
            return;
        }
        try {
            new o();
            m LJIIZILJ = o.LIZ(effect.getExtra()).LJIIZILJ();
            j LJJIJ = LJIIZILJ.LJJIJ("is_none");
            if (LJJIJ != null) {
                z = LJJIJ.LJFF();
            } else {
                z = false;
            }
            liveEffect.isNone = z;
            j LJJIJ2 = LJIIZILJ.LJJIJ("beautyConfig");
            if (LJJIJ2 != null && (LJJIFFI = LJJIJ2.LJJIFFI()) != null) {
                new o();
                List<LiveEffect.ComposerConfig> configList = (List) C09650Zl.LIZIZ.LIZLLL(o.LIZ(LJJIFFI).LJIIZILJ().LJJIJIIJI("items"), new TypeToken<List<? extends LiveEffect.ComposerConfig>>() { // from class: X.1HF
                }.getType());
                kotlin.jvm.internal.o.LJIIIIZZ(configList, "configList");
                for (LiveEffect.ComposerConfig composerConfig : configList) {
                    liveEffect.updateKeys.add(composerConfig.tag);
                    int i = composerConfig.minValue;
                    if (i >= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        composerConfig.LIZJ = 100;
                        composerConfig.LIZLLL = 0;
                    } else {
                        composerConfig.LIZJ = 50;
                        composerConfig.LIZLLL = -50;
                    }
                    float f = 100;
                    composerConfig.LJ = composerConfig.maxValue / f;
                    composerConfig.LJFF = i / f;
                    if (LiveEffectDowngradeSetting.INSTANCE.downgrade()) {
                        composerConfig.defaultValue = 0;
                    }
                    composerConfig.LIZIZ = (int) ((composerConfig.defaultValue / (composerConfig.maxValue - composerConfig.minValue)) * (composerConfig.LIZJ - composerConfig.LIZLLL));
                }
                liveEffect.setComposerConfigList(configList);
            }
        } catch (Throwable unused) {
        }
    }

    public static final void LIZIZ(LiveEffect liveEffect) {
        boolean z;
        String LJJIFFI;
        boolean z2;
        Effect effect = liveEffect.getEffect();
        if (effect == null) {
            return;
        }
        try {
            new o();
            m LJIIZILJ = o.LIZ(effect.getExtra()).LJIIZILJ();
            j LJJIJ = LJIIZILJ.LJJIJ("is_none");
            if (LJJIJ != null) {
                z = LJJIJ.LJFF();
            } else {
                z = false;
            }
            liveEffect.isNone = z;
            j LJJIJ2 = LJIIZILJ.LJJIJ("filterconfig");
            if (LJJIJ2 != null && (LJJIFFI = LJJIJ2.LJJIFFI()) != null) {
                new o();
                List<LiveEffect.ComposerConfig> configList = (List) C09650Zl.LIZIZ.LIZLLL(o.LIZ(LJJIFFI).LJIIZILJ().LJJIJIIJI("items"), new TypeToken<List<? extends LiveEffect.ComposerConfig>>() { // from class: X.1HG
                }.getType());
                kotlin.jvm.internal.o.LJIIIIZZ(configList, "configList");
                for (LiveEffect.ComposerConfig composerConfig : configList) {
                    liveEffect.updateKeys.add(composerConfig.tag);
                    int i = composerConfig.minValue;
                    if (i >= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        composerConfig.LIZJ = 100;
                        composerConfig.LIZLLL = 0;
                    } else {
                        composerConfig.LIZJ = 50;
                        composerConfig.LIZLLL = -50;
                    }
                    float f = 100;
                    composerConfig.LJ = composerConfig.maxValue / f;
                    composerConfig.LJFF = i / f;
                    composerConfig.LIZIZ = (int) ((composerConfig.defaultValue / (r3 - i)) * (composerConfig.LIZJ - composerConfig.LIZLLL));
                }
                liveEffect.setComposerConfigList(configList);
            }
        } catch (Throwable unused) {
        }
    }
}
