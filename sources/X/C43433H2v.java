package X;

import com.bytedance.ies.nle.editor_jni.MapStrStr;
import com.bytedance.ies.nle.editor_jni.NLECompileResult;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEWatermarkParam;
import defpackage.e1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS7S0100001_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H2v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43433H2v implements InterfaceC133905Ni {
    public final AtomicInteger LJLIL = new AtomicInteger(0);
    public final /* synthetic */ VEWatermarkParam LJLILLLLZI;
    public final /* synthetic */ C43421H2j LJLJI;
    public final /* synthetic */ InterfaceC153045zY LJLJJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJL;
    public final /* synthetic */ SynthetiseResult LJLJJLL;

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        int i3;
        String str2;
        String str3;
        C133765Mu c133765Mu;
        C122034qd LJI;
        InterfaceC126684y8 interfaceC126684y8;
        C5N0 W8;
        NLECompileResult LJIIIZ;
        H37 h37 = this.LJLJI.LJJIIZ;
        if (h37 != null) {
            h37.LIZ(i, i2, f, str);
            if (this.LJLILLLLZI == null) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i != 4103) {
                if (i == 4118) {
                    String LIZLLL = C48263Iwt.LIZLLL("TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:", i2, " videoExt:", i3);
                    C67996QmO c67996QmO = this.LJLJI.LJIILLIIL;
                    if (c67996QmO != null) {
                        c67996QmO.LIZIZ(new C43393H1h("CompileTask", LIZLLL), EnumC43531H6p.OUTER);
                    } else {
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                }
            } else {
                C67996QmO c67996QmO2 = this.LJLJI.LJIILLIIL;
                if (c67996QmO2 != null) {
                    StringBuilder LIZJ = C06460Ne.LIZJ("TE_INFO_COMPILE_DONE ext:", i2, " videoExt:", i3, " isDone():");
                    LIZJ.append(this.LJLJI.LJIJI);
                    c67996QmO2.LIZIZ(new C43393H1h("CompileTask", X1D.LIZIZ(LIZJ)), EnumC43531H6p.OUTER);
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            if (!this.LJLJI.LJIJI) {
                if (i == 4103) {
                    C43421H2j c43421H2j = this.LJLJI;
                    InterfaceC153045zY interfaceC153045zY = this.LJLJJI;
                    VideoPublishEditModel videoPublishEditModel = this.LJLJJL;
                    c43421H2j.getClass();
                    if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null && (LJI = c133765Mu.LJI()) != null && (interfaceC126684y8 = LJI.LJIIJJI) != null && (W8 = interfaceC126684y8.W8()) != null && (LJIIIZ = W8.LJIIIZ()) != null) {
                        long NLECompileResult_riskyVideoInfo_get = NLEMediaJniJNI.NLECompileResult_riskyVideoInfo_get(LJIIIZ.LIZ, LJIIIZ);
                        if (NLECompileResult_riskyVideoInfo_get != 0) {
                            MapStrStr mapStrStr = new MapStrStr(NLECompileResult_riskyVideoInfo_get, false);
                            if (!mapStrStr.isEmpty()) {
                                String LIZJ2 = C75792yF.LIZJ(mapStrStr);
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("CompileTask riskyVideoInfo: ");
                                LIZ.append(LIZJ2);
                                H78.LJI(X1D.LIZIZ(LIZ));
                                videoPublishEditModel.creativeModel.videoDetectionRiskInfo = LIZJ2;
                            }
                        }
                    }
                    if (i2 == 0) {
                        this.LJLJJLL.videoLength = f;
                    }
                    if (this.LJLILLLLZI == null || this.LJLIL.incrementAndGet() == 2) {
                        C43421H2j.LJIIL(new AqS154S0200000_7(this.LJLJJLL, this.LJLJJL, 115));
                        try {
                            if (this.LJLJJL.isSaveLocalWithoutWaterMark()) {
                                C43421H2j.LJIIL(new AqS154S0200000_7(this.LJLJJLL, this.LJLJJL, 116));
                            }
                        } catch (Throwable unused) {
                        }
                        this.LJLJI.LJIILJJIL(this.LJLJJLL, false);
                        C43421H2j.LJIIL(new AqS157S0100000_7(this.LJLJJI, 598));
                        return;
                    }
                    return;
                }
                if (i == 4105) {
                    if (i2 == i3) {
                        C43421H2j.LJIIL(new AqS7S0100001_7(this.LJLJI, f, 4));
                        return;
                    }
                    return;
                }
                if (i == 4112) {
                    int i4 = i2 ^ 1;
                    this.LJLJJLL.synthetiseCPUEncode = i4;
                    C67996QmO c67996QmO3 = this.LJLJI.LJIILLIIL;
                    if (c67996QmO3 != null) {
                        c67996QmO3.LIZIZ(new H3G(0, i4, 1), EnumC43531H6p.OUTER);
                        C67996QmO c67996QmO4 = this.LJLJI.LJIILLIIL;
                        if (c67996QmO4 != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("SynthesisMode NotSkip: ");
                            if (i2 == 1) {
                                str3 = "Hw";
                            } else {
                                str3 = "Sw";
                            }
                            LIZ2.append(str3);
                            c67996QmO4.LIZIZ(new C43393H1h("CompileTask", X1D.LIZIZ(LIZ2)), EnumC43531H6p.OUTER);
                            return;
                        }
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                    o.LJIJI("nodeCallback");
                    throw null;
                }
                if (i == 4113) {
                    this.LJLJJLL.audioLength = f;
                    return;
                }
                if (i == 4114) {
                    C10K.LIZIZ(new H35(this.LJLJI, i, i2, f), C10K.LJIIIIZZ, null);
                    return;
                }
                if (i == 4116) {
                    if (e1.LIZ(31744, "upload_metadata", true, false)) {
                        VideoPublishEditModel videoPublishEditModel2 = this.LJLJJL;
                        java.util.Map<String, Object> map = videoPublishEditModel2.metadataMap;
                        if (map == null) {
                            videoPublishEditModel2.metadataMap = C63942P7q.LIZ();
                        } else {
                            java.util.Map<String, Object> LIZ3 = C63942P7q.LIZ();
                            o.LJIIIIZZ(LIZ3, "buildEditorInfoJson()");
                            map.putAll(LIZ3);
                        }
                    }
                    C67996QmO c67996QmO5 = this.LJLJI.LJIILLIIL;
                    if (c67996QmO5 != null) {
                        c67996QmO5.LIZIZ(new C43393H1h("CompileTask", "receive prepare done event in compiler"), EnumC43531H6p.OUTER);
                        return;
                    } else {
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                }
                if (i == 4130) {
                    this.LJLJJLL.unableRemuxCode = i2;
                    C67996QmO c67996QmO6 = this.LJLJI.LJIILLIIL;
                    if (c67996QmO6 != null) {
                        c67996QmO6.LIZIZ(new H3G(i2, 0, 2), EnumC43531H6p.OUTER);
                        C67996QmO c67996QmO7 = this.LJLJI.LJIILLIIL;
                        if (c67996QmO7 != null) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("SynthesisMode IsSkipReEncode: ");
                            if (i2 == 0) {
                                str2 = "true";
                            } else {
                                str2 = "false";
                            }
                            LIZ4.append(str2);
                            c67996QmO7.LIZIZ(new C43393H1h("CompileTask", X1D.LIZIZ(LIZ4)), EnumC43531H6p.OUTER);
                            return;
                        }
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                    o.LJIJI("nodeCallback");
                    throw null;
                }
                return;
            }
            return;
        }
        o.LJIJI("timeoutMonitor");
        throw null;
    }

    public C43433H2v(VEWatermarkParam vEWatermarkParam, C43421H2j c43421H2j, InterfaceC153045zY interfaceC153045zY, VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult) {
        this.LJLILLLLZI = vEWatermarkParam;
        this.LJLJI = c43421H2j;
        this.LJLJJI = interfaceC153045zY;
        this.LJLJJL = videoPublishEditModel;
        this.LJLJJLL = synthetiseResult;
    }
}
