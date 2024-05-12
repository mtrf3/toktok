package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wb9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82587Wb9 implements InterfaceC82605WbR {
    public final /* synthetic */ C82585Wb7 LJLIL;

    public C82587Wb9(C82585Wb7 c82585Wb7) {
        this.LJLIL = c82585Wb7;
    }

    @Override // X.InterfaceC82605WbR
    public final void LIZ(int i, View view) {
        CategoryPageModel categoryPageModel;
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        Effect effect;
        String str;
        o.LJIIIZ(view, "view");
        if (-1 == i) {
            return;
        }
        C82585Wb7 c82585Wb7 = this.LJLIL;
        c82585Wb7.LJLJJLL = true;
        if (i == 0) {
            c82585Wb7.LJZ(i);
            c82585Wb7.LJLJJL.MK(C135285Sq.LIZIZ());
            return;
        }
        if (i <= 0 || (categoryPageModel = c82585Wb7.LJLJLJ) == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null || (effect = (Effect) ListProtector.get(effects, i - 1)) == null) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("effect_name", effect.getName());
        c145995oB.LJI("effect_id", effect.getEffectId());
        VideoPublishEditModel videoPublishEditModel = c82585Wb7.LJLJI;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.getCreationId();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("creation_id", str);
        FMX.LJIIL("select_voice_effect", c145995oB.LIZ);
        String unzipPath = effect.getUnzipPath();
        if (unzipPath == null) {
            unzipPath = "";
        }
        C82593WbF.LIZ().getClass();
        if (C82594WbG.LIZ(effect)) {
            String effectId = effect.getEffectId();
            if (effectId != null) {
                str2 = effectId;
            }
            c82585Wb7.LJLLLLLL(str2, g0.LJIJJLI(effect), unzipPath);
            c82585Wb7.LJZ(i);
            C82584Wb6 c82584Wb6 = c82585Wb7.LJLLILLLL;
            if (c82584Wb6 == null) {
                return;
            }
            c82584Wb6.LLJILJILJ(effect);
            return;
        }
        c82585Wb7.LJLZ(i, 2);
        C82594WbG LIZ = C82593WbF.LIZ();
        C82592WbE c82592WbE = new C82592WbE(effect, c82585Wb7, i);
        LIZ.getClass();
        InterfaceC84498XEg LIZIZ = C82593WbF.LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        LIZIZ.fetchEffect(effect, new C44364Hb6(new C44366Hb8("effect", new C82601WbN(c82592WbE), false, null)));
    }
}
