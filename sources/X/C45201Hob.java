package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS2S2400000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hob, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45201Hob extends AbstractC45196HoW {
    public final String LJIILL;

    @Override // X.AbstractC45196HoW
    public final void LJI() {
        this.LJII = null;
        this.LJIIIZ = null;
        this.LJIIIIZZ = null;
        this.LJI = null;
    }

    @Override // X.AbstractC45196HoW
    public final boolean LJIIJJI() {
        boolean z;
        boolean z2;
        C44716Hgm c44716Hgm = this.LJI;
        if (c44716Hgm == null || !c44716Hgm.LIZJ()) {
            return false;
        }
        C45203Hod c45203Hod = this.LIZIZ;
        if (c45203Hod != null) {
            z = c45203Hod.LIZJ;
            z2 = c45203Hod.LIZIZ;
        } else {
            z = true;
            z2 = true;
        }
        if (!c44716Hgm.LIZIZ(z, z2)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC45196HoW
    public final String LJIIIZ() {
        return this.LJIILL;
    }

    public C45201Hob(Activity activity) {
        super(activity);
        this.LJIILL = "AutoCutProcessHandler";
    }

    @Override // X.InterfaceC45226Hp0
    public final void LIZIZ(C45203Hod config) {
        o.LJIIIZ(config, "config");
        StringBuilder LIZ = X1D.LIZ();
        C45201Hob c45201Hob = this;
        LIZ.append(c45201Hob.LJIILL);
        LIZ.append(" start: config = ");
        LIZ.append(config);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        c45201Hob.LIZIZ = config;
        c45201Hob.LIZJ = c45201Hob.LIZJ(config);
        if (config.LIZ || config.LIZIZ) {
            C45161Hnx.LIZIZ(null);
        }
        c45201Hob.LJFF();
        c45201Hob.LJI();
        c45201Hob.LJIIJ = 0.0f;
        c45201Hob.LJIIL = 0.0f;
        c45201Hob.LJIIJJI = 0.0f;
        c45201Hob.LJI = new C44716Hgm(config.LJI, config.LJFF, 0, null, null, null, 0L, null, null, null, null, 8188);
        Iterator<InterfaceC45209Hoj> it = config.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJIILLIIL();
        }
        AutoCutThemeData autoCutThemeData = config.LJIIIIZZ;
        OSZ LJJIJIIJIL = C45087Hml.LJJIJIIJIL(autoCutThemeData);
        LJJIJIIJIL.getFirst();
        String str = (String) LJJIJIIJIL.getSecond();
        AutoCutThemeData autoCutThemeData2 = config.LJIIIZ;
        OSZ LJJIJIIJIL2 = C45087Hml.LJJIJIIJIL(autoCutThemeData2);
        AVMusic aVMusic = (AVMusic) LJJIJIIJIL2.getFirst();
        String str2 = (String) LJJIJIIJIL2.getSecond();
        if (config.LIZ) {
            c45201Hob.LJIILL(config.LJII, config.LIZLLL, config.LJIIL, config.LJIILIIL, config.LJ, config.LJIIJJI, true, config.LJIILJJIL, new AqS2S2400000_7(autoCutThemeData, config, c45201Hob, str, aVMusic, str2, 1));
            return;
        }
        if (autoCutThemeData2 != null && autoCutThemeData2.templateType == EnumC43998HOo.CUT_SAME.getValue()) {
            C44716Hgm c44716Hgm = c45201Hob.LJI;
            if (c44716Hgm != null) {
                c44716Hgm.LIZJ = autoCutThemeData2.templateType;
                c44716Hgm.LJIIIZ = autoCutThemeData2.templateId;
                c44716Hgm.LJIIJJI = autoCutThemeData2.templateGroupId;
            }
            config.LIZJ = false;
            if (config.LIZIZ) {
                String str3 = autoCutThemeData2.templateId;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = autoCutThemeData2.templateGroupId;
                if (str4 == null) {
                    str4 = "";
                }
                int i = autoCutThemeData2.templateType;
                String str5 = autoCutThemeData2.templateUrl;
                if (str5 == null) {
                    str5 = "";
                }
                c45201Hob.LJIILIIL("", "", str3, str4, i, str5, autoCutThemeData2.templateData, EnumC45070HmU.TEMPLATE_CC, config.LJII, autoCutThemeData2.preloadUrsSet, config.LJIIL, config.LJIILIIL, config.LJIILJJIL);
                return;
            }
            return;
        }
        if (str2 != null && str2.length() > 0) {
            if (config.LIZIZ) {
                c45201Hob = c45201Hob;
                AbstractC45196HoW.LJIILJJIL(c45201Hob, config.LJIIJ, str2, EnumC43998HOo.ALGORITHM_TEMPLATE.getValue(), EnumC45070HmU.TEMPLATE_MUSIC, config.LJII, config.LJIIL, config.LJIILIIL, config.LJIILJJIL);
            }
            if (config.LIZJ) {
                if (aVMusic != null) {
                    c45201Hob.LJII(aVMusic, config.LJIILJJIL);
                } else {
                    c45201Hob.LJIILLIIL(str2, config.LJIILJJIL);
                }
            }
        }
    }

    public final void LJIILLIIL(String str, List<? extends InterfaceC45209Hoj> list) {
        Iterator<? extends InterfaceC45209Hoj> it = list.iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ(str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJIILL);
        LIZ.append(" start fetchAndDownloadMusic: musicId = ");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C78934UyQ.LJLIL.getMusicService().requestMusic(str, new C45210Hok(this, list));
    }
}
