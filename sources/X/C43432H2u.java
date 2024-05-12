package X;

import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEWatermarkParam;
import defpackage.e1;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS7S0100001_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H2u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43432H2u implements InterfaceC133905Ni {
    public final /* synthetic */ C43422H2k LJLIL;
    public final /* synthetic */ SynthetiseResult LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;
    public final /* synthetic */ InterfaceC153045zY LJLJJI;

    public C43432H2u(InterfaceC153045zY interfaceC153045zY, SynthetiseResult synthetiseResult, VideoPublishEditModel videoPublishEditModel, C43422H2k c43422H2k) {
        this.LJLIL = c43422H2k;
        this.LJLILLLLZI = synthetiseResult;
        this.LJLJI = videoPublishEditModel;
        this.LJLJJI = interfaceC153045zY;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        String str2;
        String str3;
        if (this.LJLIL.LJIJJLI != H3D.BiChannelSynthesis) {
            return;
        }
        String str4 = null;
        if (i != 4103) {
            if (i == 4118) {
                String LIZLLL = C48263Iwt.LIZLLL("TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:", i2, " videoExt:", 0);
                C67996QmO c67996QmO = this.LJLIL.LJIILJJIL;
                if (c67996QmO != null) {
                    c67996QmO.LIZIZ(new C43393H1h("CompileWithCaptionTask", LIZLLL), EnumC43531H6p.OUTER);
                    C6BK c6bk = new C6BK();
                    c6bk.LIZ.put("log", LIZLLL);
                    C43882HKc.LIZIZ("aweme_synthesis_compile_log_vesdk", c6bk.LJ());
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
        } else {
            C67996QmO c67996QmO2 = this.LJLIL.LJIILJJIL;
            if (c67996QmO2 != null) {
                StringBuilder LIZJ = C06460Ne.LIZJ("TE_INFO_COMPILE_DONE ext:", i2, " videoExt:", 0, " isDone():");
                LIZJ.append(this.LJLIL.LJIILLIIL);
                c67996QmO2.LIZIZ(new C43393H1h("CompileWithCaptionTask", X1D.LIZIZ(LIZJ)), EnumC43531H6p.OUTER);
            } else {
                o.LJIJI("nodeCallback");
                throw null;
            }
        }
        if (!this.LJLIL.LJIILLIIL) {
            if (i == 4103) {
                if (i2 == 0) {
                    this.LJLILLLLZI.videoLength = f;
                }
                this.LJLIL.LJIIL(new AqS154S0200000_7(this.LJLILLLLZI, this.LJLJI, 68));
                try {
                    if (this.LJLJI.isSaveLocalWithoutWaterMark()) {
                        this.LJLIL.LJIIL(new AqS154S0200000_7(this.LJLILLLLZI, this.LJLJI, 69));
                    }
                } catch (Throwable unused) {
                }
                C67996QmO c67996QmO3 = this.LJLIL.LJIILJJIL;
                if (c67996QmO3 != null) {
                    StringBuilder sb = new StringBuilder("CompileWithCaptionTask onCallback: onCompileDone outputFile ");
                    sb.append(this.LJLILLLLZI.outputFile);
                    sb.append(" watermarkFile ");
                    VEWatermarkParam vEWatermarkParam = this.LJLIL.LJII;
                    if (vEWatermarkParam != null) {
                        str4 = vEWatermarkParam.extFile;
                    }
                    sb.append(str4);
                    c67996QmO3.LIZIZ(new C43393H1h("CompileWithCaptionTask", sb.toString()), EnumC43531H6p.OUTER);
                    C43422H2k c43422H2k = this.LJLIL;
                    c43422H2k.LJIIL(new AqS96S0300000_7(c43422H2k, this.LJLILLLLZI, this.LJLJJI, 14));
                    return;
                }
                o.LJIJI("nodeCallback");
                throw null;
            }
            if (i == 4105) {
                if (i2 == 0) {
                    C43422H2k c43422H2k2 = this.LJLIL;
                    c43422H2k2.LJIIL(new AqS7S0100001_7(c43422H2k2, f, 2));
                    return;
                }
                return;
            }
            if (i == 4112) {
                this.LJLILLLLZI.synthetiseCPUEncode = i2 ^ 1;
                C67996QmO c67996QmO4 = this.LJLIL.LJIILJJIL;
                if (c67996QmO4 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("SynthesisMode NotSkip: ");
                    if (i2 == 1) {
                        str3 = "Hw";
                    } else {
                        str3 = "Sw";
                    }
                    LIZ.append(str3);
                    c67996QmO4.LIZIZ(new C43393H1h("CompileWithCaptionTask", X1D.LIZIZ(LIZ)), EnumC43531H6p.OUTER);
                    return;
                }
                o.LJIJI("nodeCallback");
                throw null;
            }
            if (i == 4113) {
                this.LJLILLLLZI.audioLength = f;
                return;
            }
            if (i == 4114) {
                this.LJLIL.LJII().LIZLLL().LIZLLL().execute(new H34(this.LJLIL, i, i2, f));
                return;
            }
            if (i == 4116) {
                if (e1.LIZ(31744, "upload_metadata", true, false)) {
                    VideoPublishEditModel videoPublishEditModel = this.LJLJI;
                    java.util.Map<String, Object> map = videoPublishEditModel.metadataMap;
                    if (map == null) {
                        videoPublishEditModel.metadataMap = C63942P7q.LIZ();
                    } else {
                        java.util.Map<String, Object> LIZ2 = C63942P7q.LIZ();
                        o.LJIIIIZZ(LIZ2, "buildEditorInfoJson()");
                        map.putAll(LIZ2);
                    }
                }
                C67996QmO c67996QmO5 = this.LJLIL.LJIILJJIL;
                if (c67996QmO5 != null) {
                    c67996QmO5.LIZIZ(new C43393H1h("CompileWithCaptionTask", "receive prepare done event in compiler"), EnumC43531H6p.OUTER);
                    return;
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            if (i == 4130) {
                this.LJLILLLLZI.unableRemuxCode = i2;
                C67996QmO c67996QmO6 = this.LJLIL.LJIILJJIL;
                if (c67996QmO6 != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("SynthesisMode IsSkipReEncode: ");
                    if (i2 == 0) {
                        str2 = "true";
                    } else {
                        str2 = "false";
                    }
                    LIZ3.append(str2);
                    c67996QmO6.LIZIZ(new C43393H1h("CompileWithCaptionTask", X1D.LIZIZ(LIZ3)), EnumC43531H6p.OUTER);
                    return;
                }
                o.LJIJI("nodeCallback");
                throw null;
            }
        }
    }
}
