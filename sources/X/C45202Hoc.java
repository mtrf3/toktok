package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.Iterator;
import kotlin.jvm.internal.AqS124S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hoc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45202Hoc extends AbstractC45196HoW {
    public boolean LJIILL;
    public final String LJIILLIIL;

    @Override // X.AbstractC45196HoW
    public final void LJI() {
        this.LJII = null;
        this.LJIIIZ = null;
        this.LJIIIIZZ = null;
        this.LJI = null;
        this.LJIILL = false;
    }

    @Override // X.AbstractC45196HoW
    public final boolean LJIIJJI() {
        C44716Hgm c44716Hgm;
        boolean z;
        boolean z2;
        C45203Hod c45203Hod;
        if ((this.LJIILL || (c45203Hod = this.LIZIZ) == null || !c45203Hod.LIZ) && (c44716Hgm = this.LJI) != null && c44716Hgm.LIZJ()) {
            C45203Hod c45203Hod2 = this.LIZIZ;
            if (c45203Hod2 != null) {
                z = c45203Hod2.LIZJ;
                z2 = c45203Hod2.LIZIZ;
            } else {
                z = true;
                z2 = true;
            }
            if (c44716Hgm.LIZIZ(z, z2)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC45196HoW
    public final String LJIIIZ() {
        return this.LJIILLIIL;
    }

    public C45202Hoc(Activity activity) {
        super(activity);
        this.LJIILLIIL = "AutoCutWithMusicProcessHandler";
    }

    @Override // X.InterfaceC45226Hp0
    public final void LIZIZ(C45203Hod config) {
        o.LJIIIZ(config, "config");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJIILLIIL);
        LIZ.append(" start: config = ");
        LIZ.append(config);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        AutoCutThemeData autoCutThemeData = config.LJIIIIZZ;
        OSZ LJJIJIIJIL = C45087Hml.LJJIJIIJIL(autoCutThemeData);
        AVMusic aVMusic = (AVMusic) LJJIJIIJIL.getFirst();
        String str = (String) LJJIJIIJIL.getSecond();
        if (autoCutThemeData == null || aVMusic == null || !C78685UuP.LJJJZ(str)) {
            return;
        }
        this.LIZIZ = config;
        this.LIZJ = LIZJ(config);
        if (config.LIZ || config.LIZIZ) {
            C45161Hnx.LIZIZ(null);
        }
        LJFF();
        LJI();
        this.LJIIJ = 0.0f;
        this.LJIIL = 0.0f;
        this.LJIIJJI = 0.0f;
        this.LJI = new C44716Hgm(config.LJI, config.LJFF, 0, null, null, null, 0L, null, null, null, null, 8188);
        Iterator<InterfaceC45209Hoj> it = config.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJIILLIIL();
        }
        if (config.LIZ) {
            LJIILL(config.LJII, config.LIZLLL, config.LJIIL, config.LJIILIIL, config.LJ, config.LJIIJJI, false, config.LJIILJJIL, new AqS124S0300000_7(autoCutThemeData, config, this, 3));
        }
        if (config.LIZIZ) {
            AbstractC45196HoW.LJIILJJIL(this, config.LJIIJ, str, EnumC43998HOo.ALGORITHM_TEMPLATE.getValue(), EnumC45070HmU.TEMPLATE_MUSIC, config.LJII, config.LJIIL, config.LJIILIIL, config.LJIILJJIL);
        }
        if (!config.LIZJ) {
            return;
        }
        LJII(aVMusic, config.LJIILJJIL);
    }
}
