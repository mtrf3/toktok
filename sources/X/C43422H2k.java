package X;

import Y.ACallableS110S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS7S0100001_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H2k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43422H2k extends AbstractC43349Gzp {
    public static final C62822Ol8 LJJIIJ = C221108m2.LIZIZ(C37193Eij.LJLIL);
    public final boolean LJI;
    public final VEWatermarkParam LJII;
    public final InterfaceC65784Pro<C76800UCe> LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public C43403H1r LJIIJ;
    public PublishModel LJIIJJI;
    public C43397H1l LJIIL;
    public XFL LJIILIIL;
    public C67996QmO LJIILJJIL;
    public InterfaceC153045zY LJIILL;
    public volatile boolean LJIILLIIL;
    public volatile boolean LJIIZILJ;
    public SynthetiseResult LJIJ;
    public final List<Runnable> LJIJI;
    public final C44428Hc8 LJIJJ;
    public volatile H3D LJIJJLI;
    public final List<String> LJIL;
    public final List<Integer> LJJ;
    public final C62822Ol8 LJJI;
    public volatile C76940UHo LJJIFFI;
    public final C62822Ol8 LJJII;
    public final C62822Ol8 LJJIII;

    public final void LJIIJJI() {
        String str;
        int i;
        this.LJIIZILJ = false;
        this.LJIILL = null;
        this.LJIJ = null;
        ((ArrayList) this.LJIJI).clear();
        this.LJIILLIIL = false;
        this.LJIJJLI = H3D.BiChannelSynthesis;
        ((ArrayList) this.LJJ).clear();
        ((ArrayList) this.LJIL).clear();
        this.LJIJJ.LIZJ();
        this.LJIJJ.LIZLLL();
        if (C43161Gwn.LIZ()) {
            C43403H1r c43403H1r = this.LJIIJ;
            if (c43403H1r != null) {
                C43157Gwj.LJI(c43403H1r.LIZ);
            } else {
                o.LJIJI("editModelContainer");
                throw null;
            }
        }
        XFL xfl = this.LJIILIIL;
        if (xfl != null) {
            xfl.LJI();
            XFL xfl2 = this.LJIILIIL;
            if (xfl2 != null) {
                xfl2.LJIJJLI = false;
                C60903NvH.LJIIJJI().LJJII();
                C39579Fg7.LJIL(((C42141GgL) this.LJJIII.getValue()).LIZIZ().getPath());
                VEWatermarkParam vEWatermarkParam = this.LJII;
                if (vEWatermarkParam != null) {
                    vEWatermarkParam.extFile = ((C42141GgL) this.LJJIII.getValue()).LIZIZ().getPath();
                }
                C43403H1r c43403H1r2 = this.LJIIJ;
                if (c43403H1r2 != null) {
                    C150785vu.LIZ(c43403H1r2.LIZ);
                    try {
                        LJII().LIZ();
                        C43403H1r c43403H1r3 = this.LJIIJ;
                        if (c43403H1r3 != null) {
                            InterfaceC153045zY LIZIZ = C152875zH.LIZIZ(c43403H1r3.LIZ, new AqS173S0100000_7(this, 238));
                            C5UF.LIZ(LIZIZ);
                            this.LJIILL = LIZIZ;
                            C43403H1r c43403H1r4 = this.LJIIJ;
                            if (c43403H1r4 != null) {
                                SynthetiseResult LIZ = C43217Gxh.LIZ(c43403H1r4.LIZ);
                                this.LJIJ = LIZ;
                                C43403H1r c43403H1r5 = this.LJIIJ;
                                if (c43403H1r5 != null) {
                                    VideoPublishEditModel videoPublishEditModel = c43403H1r5.LIZ;
                                    InterfaceC153045zY interfaceC153045zY = this.LJIILL;
                                    if (interfaceC153045zY != null) {
                                        if (videoPublishEditModel.isFastImport) {
                                            C44513HdV.LIZ(interfaceC153045zY, videoPublishEditModel.getPreviewInfo().getVideoList());
                                        }
                                        CommerceToolsStickerServiceImpl.LJIIL().LIZLLL(interfaceC153045zY, videoPublishEditModel);
                                        interfaceC153045zY.LLILLJJLI(0);
                                        if (videoPublishEditModel.isFastImport) {
                                            str = "1";
                                        } else {
                                            str = CardStruct.IStatusCode.DEFAULT;
                                        }
                                        interfaceC153045zY.LLILLL("te_is_fast_import", str);
                                        if (videoPublishEditModel.isMultiVideoEdit() && !TextUtils.isEmpty(videoPublishEditModel.multiEditVideoRecordData.videoMetaData)) {
                                            String str2 = videoPublishEditModel.multiEditVideoRecordData.videoMetaData;
                                            o.LJIIIIZZ(str2, "editModel.multiEditVideoRecordData.videoMetaData");
                                            interfaceC153045zY.LLILLL("description", str2);
                                        }
                                    }
                                    C43403H1r c43403H1r6 = this.LJIIJ;
                                    if (c43403H1r6 != null) {
                                        VideoPublishEditModel videoPublishEditModel2 = c43403H1r6.LIZ;
                                        InterfaceC153045zY interfaceC153045zY2 = this.LJIILL;
                                        if (interfaceC153045zY2 != null) {
                                            ((Keva) H31.LIZ.getValue()).erase("upload_param_key");
                                            C122034qd LJJI = C17N.LJJI(interfaceC153045zY2);
                                            if (LJJI != null) {
                                                LJJI.LJIIJJI.P8().LJIJI(new H3A(this));
                                            }
                                            interfaceC153045zY2.LLILL(new C43428H2q(this, LIZ, interfaceC153045zY2));
                                            interfaceC153045zY2.LLIIJLIL(new C43432H2u(interfaceC153045zY2, LIZ, videoPublishEditModel2, this));
                                        }
                                        InterfaceC153045zY interfaceC153045zY3 = this.LJIILL;
                                        if (interfaceC153045zY3 != null) {
                                            if (this.LJIIJ != null) {
                                                if (!C43401H1p.LIZ()) {
                                                    interfaceC153045zY3.LLLFF(new C43430H2s(this, LIZ, interfaceC153045zY3));
                                                }
                                            } else {
                                                o.LJIJI("editModelContainer");
                                                throw null;
                                            }
                                        }
                                        C01H.LIZIZ(C0NU.TT_CONCURRENT_UPLOAD_COMPILE, 10000);
                                        C43403H1r c43403H1r7 = this.LJIIJ;
                                        if (c43403H1r7 != null) {
                                            VideoPublishEditModel videoPublishEditModel3 = c43403H1r7.LIZ;
                                            InterfaceC153045zY interfaceC153045zY4 = this.LJIILL;
                                            if (interfaceC153045zY4 != null) {
                                                try {
                                                    C43397H1l c43397H1l = this.LJIIL;
                                                    if (c43397H1l != null) {
                                                        VEVideoEncodeSettings LIZJ = C44546He2.LIZJ(videoPublishEditModel3, LIZ, null, interfaceC153045zY4, c43397H1l.LJLIL);
                                                        if (LIZJ != null) {
                                                            boolean isEnableRemuxVideo = LIZJ.isEnableRemuxVideo();
                                                            InterfaceC153045zY interfaceC153045zY5 = this.LJIILL;
                                                            if (interfaceC153045zY5 != null) {
                                                                i = interfaceC153045zY5.LLJILJILJ(LIZJ);
                                                            } else {
                                                                i = -2;
                                                            }
                                                            LIZJ.setEnableRemuxVideo(isEnableRemuxVideo);
                                                            C67996QmO c67996QmO = this.LJIILJJIL;
                                                            if (c67996QmO != null) {
                                                                C67996QmO.LIZJ(c67996QmO, new H3H(i));
                                                                C67996QmO c67996QmO2 = this.LJIILJJIL;
                                                                if (c67996QmO2 != null) {
                                                                    StringBuilder LIZ2 = X1D.LIZ();
                                                                    LIZ2.append("PublishDurationMonitor SynthetiseStart ");
                                                                    LIZ2.append(LIZJ);
                                                                    C67996QmO.LIZJ(c67996QmO2, new C43393H1h("CompileWithCaptionTask", X1D.LIZIZ(LIZ2)));
                                                                    C67996QmO c67996QmO3 = this.LJIILJJIL;
                                                                    if (c67996QmO3 != null) {
                                                                        StringBuilder LIZ3 = X1D.LIZ();
                                                                        LIZ3.append("mVEEditor.compile source.getOutputFile() : ");
                                                                        C43403H1r c43403H1r8 = this.LJIIJ;
                                                                        if (c43403H1r8 != null) {
                                                                            LIZ3.append(c43403H1r8.LIZ.getOutputFile());
                                                                            C67996QmO.LIZJ(c67996QmO3, new C43393H1h("CompileWithCaptionTask", X1D.LIZIZ(LIZ3)));
                                                                            C43403H1r c43403H1r9 = this.LJIIJ;
                                                                            if (c43403H1r9 != null) {
                                                                                HI5.LIZJ(c43403H1r9.LIZ, LIZJ, LIZ.needRecode, i, this.LJII != null);
                                                                                C43403H1r c43403H1r10 = this.LJIIJ;
                                                                                if (c43403H1r10 != null) {
                                                                                    VideoPublishEditModel videoPublishEditModel4 = c43403H1r10.LIZ;
                                                                                    InterfaceC153045zY interfaceC153045zY6 = this.LJIILL;
                                                                                    if (interfaceC153045zY6 == null) {
                                                                                        return;
                                                                                    }
                                                                                    try {
                                                                                        HIP.LIZ(videoPublishEditModel4, LIZJ);
                                                                                        interfaceC153045zY6.LLIILZL(videoPublishEditModel4.getOutputFile(), LIZJ);
                                                                                        return;
                                                                                    } catch (Exception e) {
                                                                                        C43342Gzi c43342Gzi = new C43342Gzi();
                                                                                        c43342Gzi.LIZ = C43217Gxh.LIZIZ(100105);
                                                                                        c43342Gzi.LIZLLL = e;
                                                                                        LJIILJJIL(c43342Gzi.LIZ());
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                o.LJIJI("editModelContainer");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("editModelContainer");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("editModelContainer");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("nodeCallback");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("nodeCallback");
                                                                throw null;
                                                            }
                                                            o.LJIJI("nodeCallback");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("publishId");
                                                        throw null;
                                                    }
                                                } catch (Exception e2) {
                                                    LJII().LJIIIIZZ();
                                                    C41813Gb3.LIZLLL("CompileWithCaptionTask", e2);
                                                }
                                            }
                                            C43342Gzi c43342Gzi2 = new C43342Gzi();
                                            SynthetiseResult m157clone = LIZ.m157clone();
                                            if (m157clone != null) {
                                                c43342Gzi2.LIZ = m157clone;
                                            }
                                            c43342Gzi2.LIZJ = "encode settings is null";
                                            LJIILJJIL(c43342Gzi2.LIZ());
                                            return;
                                        }
                                        o.LJIJI("editModelContainer");
                                        throw null;
                                    }
                                    o.LJIJI("editModelContainer");
                                    throw null;
                                }
                                o.LJIJI("editModelContainer");
                                throw null;
                            }
                            o.LJIJI("editModelContainer");
                            throw null;
                        }
                        o.LJIJI("editModelContainer");
                        throw null;
                    } catch (Exception e3) {
                        C43342Gzi c43342Gzi3 = new C43342Gzi();
                        c43342Gzi3.LIZ = C43217Gxh.LIZIZ(100104);
                        c43342Gzi3.LIZLLL = e3;
                        LJIILJJIL(c43342Gzi3.LIZ());
                        return;
                    }
                }
                o.LJIJI("editModelContainer");
                throw null;
            }
            o.LJIJI("uploadStrategy");
            throw null;
        }
        o.LJIJI("uploadStrategy");
        throw null;
    }

    @Override // X.AbstractC43455H3r
    public final int LJIIIIZZ() {
        LJII().LJFF().getClass();
        new C42388GkK();
        return C42388GkK.LIZ();
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZJ(Object obj) {
        super.LIZJ(obj);
        InterfaceC153045zY interfaceC153045zY = this.LJIILL;
        if (interfaceC153045zY == null || this.LJIILLIIL || this.LJIIZILJ) {
            return false;
        }
        this.LJIIZILJ = true;
        C67996QmO c67996QmO = this.LJIILJJIL;
        if (c67996QmO != null) {
            C67996QmO.LIZJ(c67996QmO, new C43393H1h("CompileWithCaptionTask", "CompileWithCaptionTask pause"));
            interfaceC153045zY.LLII();
            C67996QmO c67996QmO2 = this.LJIILJJIL;
            if (c67996QmO2 != null) {
                C67996QmO.LIZJ(c67996QmO2, C41764GaG.LIZ);
                return true;
            }
            o.LJIJI("nodeCallback");
            throw null;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final void LIZLLL(Object obj) {
        super.LIZLLL(obj);
        InterfaceC153045zY interfaceC153045zY = this.LJIILL;
        if (interfaceC153045zY != null && this.LJIIZILJ) {
            C67996QmO c67996QmO = this.LJIILJJIL;
            if (c67996QmO != null) {
                C67996QmO.LIZJ(c67996QmO, new C43393H1h("CompileWithCaptionTask", "CompileWithCaptionTask resume"));
                interfaceC153045zY.LLIFFJFJJ();
                C67996QmO c67996QmO2 = this.LJIILJJIL;
                if (c67996QmO2 != null) {
                    C67996QmO.LIZJ(c67996QmO2, C41763GaF.LIZ);
                    this.LJIIZILJ = false;
                    return;
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    public final void LJIIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (e1.LIZ(31744, "studio_enable_synthesis_callback_async", true, false)) {
            LJII().LIZLLL().LIZJ();
            C10K.LIZJ(new ACallableS110S0100000_7((Runnable) new ARunnableS43S0100000_7((InterfaceC65784Pro) interfaceC65784Pro, 99), 37));
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    public final void LJIILIIL(float f) {
        float min;
        if (H3E.LIZ[this.LJIJJLI.ordinal()] == 1) {
            min = Math.min(60.0f, (60 * f) / 100.0f);
        } else {
            min = Math.min(100.0f, ((40 * f) / 100.0f) + 60);
        }
        C67996QmO c67996QmO = this.LJIILJJIL;
        if (c67996QmO != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("compileProgress: ");
            LIZ.append(min);
            C67996QmO.LIZJ(c67996QmO, new C43393H1h("CompileWithCaptionTask", X1D.LIZIZ(LIZ)));
            if (this.LJJII.getValue() == null) {
                C67996QmO c67996QmO2 = this.LJIILJJIL;
                if (c67996QmO2 != null) {
                    C67996QmO.LIZJ(c67996QmO2, new C41855Gbj(min));
                    return;
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            C43366H0g c43366H0g = (C43366H0g) this.LJJII.getValue();
            if (c43366H0g == null) {
                return;
            }
            C43366H0g.LIZ(c43366H0g, new AqS7S0100001_7(this, min, 1));
            return;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    public final void LJIILJJIL(C42990Gu2 c42990Gu2) {
        this.LJIILLIIL = true;
        C67996QmO c67996QmO = this.LJIILJJIL;
        if (c67996QmO != null) {
            C67996QmO.LIZJ(c67996QmO, new C43393H1h("CompileWithCaptionTask", "PublishDurationMonitor Synthetise end failed"));
            if (this.LJI) {
                ((RunnableC137475aR) this.LJIIIZ.getValue()).LIZ();
            }
            if (!C42991Gu3.LIZJ(c42990Gu2)) {
                int LJFF = C42991Gu3.LJFF(c42990Gu2);
                C67996QmO c67996QmO2 = this.LJIILJJIL;
                if (c67996QmO2 != null) {
                    c67996QmO2.LIZLLL(LJFF, c42990Gu2);
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            C76940UHo c76940UHo = this.LJJIFFI;
            if (c76940UHo != null) {
                c76940UHo.LIZ();
            }
            this.LJJIFFI = null;
            return;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    public C43422H2k(VEWatermarkParam vEWatermarkParam, InterfaceC65784Pro interfaceC65784Pro) {
        super(vEWatermarkParam);
        this.LJI = false;
        this.LJII = vEWatermarkParam;
        this.LJIIIIZZ = interfaceC65784Pro;
        this.LJIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 747));
        this.LJIJI = new ArrayList();
        this.LJIJJ = new C44428Hc8();
        this.LJIJJLI = H3D.BiChannelSynthesis;
        this.LJIL = new ArrayList();
        this.LJJ = new ArrayList();
        this.LJJI = C221108m2.LIZIZ(C120704oU.LJLIL);
        this.LJJII = C221108m2.LIZIZ(H3J.LJLIL);
        this.LJJIII = C221108m2.LIZIZ(C42145GgP.LJLIL);
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZ(AbstractC42983Gtv cause, C87623YaB c87623YaB) {
        o.LJIIIZ(cause, "cause");
        super.LIZ(cause, c87623YaB);
        this.LJIILLIIL = true;
        LJII().LJIIIIZZ();
        C41813Gb3.LIZJ("CompileWithCaptionTask", "cancelUpload");
        Iterator it = ((ArrayList) this.LJIJI).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (this.LJI) {
            ((RunnableC137475aR) this.LJIIIZ.getValue()).LIZ();
        }
        XFL xfl = this.LJIILIIL;
        if (xfl != null) {
            xfl.LJIJJLI = false;
            xfl.LIZIZ();
            SynthetiseResult synthetiseResult = this.LJIJ;
            if (synthetiseResult != null && synthetiseResult.outputFile != null) {
                File file = new File(synthetiseResult.outputFile);
                if (file.exists()) {
                    C16880lQ.LLLZZIL(file);
                    C67996QmO c67996QmO = this.LJIILJJIL;
                    if (c67996QmO != null) {
                        C67996QmO.LIZJ(c67996QmO, new C43393H1h("CompileWithCaptionTask", C0F0.LIZJ("incompleteFile delete incompleteFile : ", file)));
                    } else {
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                }
                VEWatermarkParam vEWatermarkParam = this.LJII;
                if (vEWatermarkParam != null && vEWatermarkParam.extFile != null) {
                    File file2 = new File(this.LJII.extFile);
                    if (file2.exists()) {
                        C16880lQ.LLLZZIL(file2);
                        C67996QmO c67996QmO2 = this.LJIILJJIL;
                        if (c67996QmO2 != null) {
                            C67996QmO.LIZJ(c67996QmO2, new C43393H1h("CompileWithCaptionTask", C0F0.LIZJ("incompleteWatermarkFile delete incompleteWatermarkFile : ", file2)));
                        } else {
                            o.LJIJI("nodeCallback");
                            throw null;
                        }
                    }
                }
            }
            C76940UHo c76940UHo = this.LJJIFFI;
            if (c76940UHo != null) {
                c76940UHo.LIZ();
            }
            this.LJJIFFI = null;
            InterfaceC153045zY interfaceC153045zY = this.LJIILL;
            LJII().LIZLLL().LIZJ();
            C10K.LIZJ(new ACallableS110S0100000_7((Runnable) new ARunnableS43S0100000_7(interfaceC153045zY, 100), 37));
            c87623YaB.LIZ(null);
            return true;
        }
        o.LJIJI("uploadStrategy");
        throw null;
    }

    @Override // X.AbstractC43349Gzp, X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        SynthetiseResult synthetiseResult;
        String str;
        o.LJIIIZ(args, "args");
        super.LJI(args, c67996QmO);
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    this.LJIIJ = (C43403H1r) next;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43397H1l) {
                            if (next2 != null) {
                                this.LJIIL = (C43397H1l) next2;
                                this.LJIILJJIL = c67996QmO;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof XFL) {
                                        if (next3 != null) {
                                            this.LJIILIIL = (XFL) next3;
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it4.next();
                                                if (next4 instanceof C43404H1s) {
                                                    if (next4 != null) {
                                                        this.LJIIJJI = ((C43404H1s) next4).LIZ;
                                                        C60903NvH.LJIIJJI().getPublishService().LJJIIJ();
                                                        C41775GaR.LIZJ(H1T.COMPILE);
                                                        C43403H1r c43403H1r = this.LJIIJ;
                                                        if (c43403H1r != null) {
                                                            VideoPublishEditModel videoPublishEditModel = c43403H1r.LIZ;
                                                            PublishModel publishModel = this.LJIIJJI;
                                                            if (publishModel != null) {
                                                                if (C43157Gwj.LJIIIZ(videoPublishEditModel, publishModel.LIZIZ(), false)) {
                                                                    C43403H1r c43403H1r2 = this.LJIIJ;
                                                                    if (c43403H1r2 != null) {
                                                                        SynthetiseResult LIZ = C43217Gxh.LIZ(c43403H1r2.LIZ);
                                                                        this.LJIJ = LIZ;
                                                                        LJIILL(LIZ, true);
                                                                        return;
                                                                    }
                                                                    o.LJIJI("editModelContainer");
                                                                    throw null;
                                                                }
                                                                C43403H1r c43403H1r3 = this.LJIIJ;
                                                                if (c43403H1r3 != null) {
                                                                    if (GU7.LJIIIIZZ(c43403H1r3.LIZ)) {
                                                                        GU9 gu9 = GU7.LIZLLL;
                                                                        if (gu9 != null) {
                                                                            synthetiseResult = gu9.LJII;
                                                                        } else {
                                                                            synthetiseResult = null;
                                                                        }
                                                                        this.LJIJ = synthetiseResult;
                                                                        if (synthetiseResult != null) {
                                                                            str = synthetiseResult.outputFile;
                                                                        } else {
                                                                            str = null;
                                                                        }
                                                                        C43403H1r c43403H1r4 = this.LJIIJ;
                                                                        if (c43403H1r4 != null) {
                                                                            C39579Fg7.LIZLLL(str, c43403H1r4.LIZ.getLocalTempPath());
                                                                            if (synthetiseResult != null) {
                                                                                LJIILL(synthetiseResult, true);
                                                                                return;
                                                                            } else {
                                                                                "Required value was null.".toString();
                                                                                throw new IllegalArgumentException("Required value was null.");
                                                                            }
                                                                        }
                                                                        o.LJIJI("editModelContainer");
                                                                        throw null;
                                                                    }
                                                                    if (this.LJI) {
                                                                        ((ExecutorService) LJJIIJ.getValue()).execute((RunnableC137475aR) this.LJIIIZ.getValue());
                                                                        return;
                                                                    } else {
                                                                        LJIIJJI();
                                                                        return;
                                                                    }
                                                                }
                                                                o.LJIJI("editModelContainer");
                                                                throw null;
                                                            }
                                                            o.LJIJI("publishMode");
                                                            throw null;
                                                        }
                                                        o.LJIJI("editModelContainer");
                                                        throw null;
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ConcurrentUploadByFile");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIILL(SynthetiseResult synthetiseResult, boolean z) {
        this.LJIILLIIL = true;
        long LIZIZ = this.LJIJJ.LIZIZ(TimeUnit.MILLISECONDS);
        C67996QmO c67996QmO = this.LJIILJJIL;
        if (c67996QmO != null) {
            C67996QmO.LIZJ(c67996QmO, new C43393H1h("CompileWithCaptionTask", C61845OOz.LIZ("PublishDurationMonitor Synthetise end success durationMs:", LIZIZ)));
            if (z) {
                C67996QmO c67996QmO2 = this.LJIILJJIL;
                if (c67996QmO2 != null) {
                    H5I LIZ = H31.LIZ();
                    if (LIZ == null) {
                        LIZ = new H5I(0);
                    }
                    c67996QmO2.LIZIZ(LIZ, EnumC43531H6p.ALL);
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            if (this.LJI) {
                ((RunnableC137475aR) this.LJIIIZ.getValue()).LIZ();
            }
            C60903NvH.LJIIJJI().getPublishService().LJIJI();
            C43403H1r c43403H1r = this.LJIIJ;
            if (c43403H1r != null) {
                synthetiseResult.setNeedSaveLocal(GSL.LIZLLL(c43403H1r.LIZ));
                synthetiseResult.setSyntheticEndTime(new C43236Gy0(0));
                synthetiseResult.setSkipFrameLogList(this.LJIL);
                if (C43161Gwn.LIZ()) {
                    if (!z) {
                        XFL xfl = this.LJIILIIL;
                        if (xfl != null) {
                            xfl.LJIJJLI = true;
                            C43403H1r c43403H1r2 = this.LJIIJ;
                            if (c43403H1r2 != null) {
                                C43157Gwj.LJFF(c43403H1r2.LIZ);
                            } else {
                                o.LJIJI("editModelContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("uploadStrategy");
                            throw null;
                        }
                    }
                } else if (z) {
                }
                C67996QmO c67996QmO3 = this.LJIILJJIL;
                if (c67996QmO3 != null) {
                    c67996QmO3.LJ(synthetiseResult, z);
                    String path = synthetiseResult.outputFile;
                    C67996QmO c67996QmO4 = this.LJIILJJIL;
                    if (c67996QmO4 != null) {
                        o.LJIIIIZZ(path, "path");
                        C67996QmO.LIZJ(c67996QmO4, new C41762GaE(path));
                        C76940UHo c76940UHo = this.LJJIFFI;
                        if (c76940UHo != null) {
                            c76940UHo.LIZ();
                        }
                        this.LJJIFFI = null;
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJIIIIZZ;
                        if (interfaceC65784Pro != null) {
                            interfaceC65784Pro.invoke();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("nodeCallback");
                    throw null;
                }
                o.LJIJI("nodeCallback");
                throw null;
            }
            o.LJIJI("editModelContainer");
            throw null;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }
}
