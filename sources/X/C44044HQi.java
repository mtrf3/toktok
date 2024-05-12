package X;

import Y.AfS59S0100000_7;
import Y.IDuS2S1200000_7;
import android.content.Context;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import kotlin.jvm.internal.o;

/* renamed from: X.HQi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44044HQi {
    public final Context LIZ;
    public final int LIZIZ = 2;
    public final int LIZJ = 3;
    public final TemplateSourceConfig LIZLLL;
    public C73411SrX LJ;
    public C73411SrX LJFF;
    public String LJI;
    public String LJII;
    public HKQ LJIIIIZZ;
    public C44048HQm LJIIIZ;

    public C44044HQi(Context context, TemplateSourceConfig templateSourceConfig) {
        this.LIZ = context;
        this.LIZLLL = templateSourceConfig;
    }

    public final void LIZ(String templateId, String str, HKP hkp) {
        InterfaceC92693kP LJJJJZI;
        C44048HQm c44048HQm;
        C44048HQm c44048HQm2;
        o.LJIIIZ(templateId, "templateId");
        if (templateId.length() == 0 || this.LIZ == null) {
            return;
        }
        if (this.LJ == null || this.LJFF == null || (((c44048HQm = this.LJIIIZ) != null && c44048HQm.LIZ()) || !o.LJ(this.LJI, templateId) || !o.LJ(str, this.LJII))) {
            C134225Oo.LIZ(LogLevel.LEVEL_INFO, "start new disposable");
            this.LJIIIIZZ = new HKQ(hkp);
            this.LJII = str;
            this.LJI = templateId;
            this.LJIIIZ = null;
            C73893SzJ c73893SzJ = new C73893SzJ();
            this.LJ = (C73411SrX) c73893SzJ.LJJJJZI(new AfS59S0100000_7(this, 46));
            if (str == null || str.length() == 0) {
                LJJJJZI = AbstractC73672Svk.LJIIJ(new IDuS2S1200000_7(this, c73893SzJ, templateId, 2)).LJJJJZI(new AfS59S0100000_7(this, 47));
            } else {
                LJJJJZI = AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJIIJ(new IDuS2S1200000_7(this, c73893SzJ, str, 1)), AbstractC73672Svk.LJIIJ(new IDuS2S1200000_7(this, c73893SzJ, templateId, 2)), new C44049HQn(this)).LJJJJZI(new AfS59S0100000_7(this, 47));
            }
            this.LJFF = (C73411SrX) LJJJJZI;
            return;
        }
        C73411SrX c73411SrX = this.LJFF;
        if (c73411SrX == null || !c73411SrX.isDisposed() || (c44048HQm2 = this.LJIIIZ) == null || !c44048HQm2.LIZIZ()) {
            C134225Oo.LIZ(LogLevel.LEVEL_INFO, "is downloading, continue it");
            HKQ hkq = this.LJIIIIZZ;
            if (hkq != null) {
                hkq.LJI(hkp);
                return;
            }
            return;
        }
        C134225Oo.LIZ(LogLevel.LEVEL_INFO, "current process of downloading has been finished, build NLEModel");
        HKQ hkq2 = this.LJIIIIZZ;
        if (hkq2 != null) {
            hkq2.LJI(hkp);
        }
    }
}
