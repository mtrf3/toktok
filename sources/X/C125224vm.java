package X;

import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import kotlin.jvm.internal.AqS48S0400000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125224vm extends AbstractC125294vt {
    @Override // X.AbstractC125294vt
    public final void LIZJ(C125284vs request, AqS48S0400000_2 aqS48S0400000_2) {
        String extra;
        NLESegmentVideo LJJ;
        NLEResourceAV LJ;
        o.LJIIIZ(request, "request");
        C125184vi c125184vi = request.LIZIZ;
        C125244vo c125244vo = c125184vi.LJLIL;
        String str = c125244vo.LIZIZ;
        String str2 = c125244vo.LIZJ;
        NLETrackSlot nLETrackSlot = c125184vi.LJLILLLLZI;
        NLETrackSlot LJIIIIZZ = nLETrackSlot.LJIIIIZZ();
        if (LJIIIIZZ != null && LJIIIIZZ.hasExtra("ep_magic_resource_id") && (extra = LJIIIIZZ.getExtra("ep_magic_resource_id")) != null && (!ujb.o.LJJJJJL(extra)) && o.LJ(str, extra)) {
            nLETrackSlot.LJIILJJIL(null);
            nLETrackSlot.setProcessor(new VecString());
            C125204vk.LIZLLL(nLETrackSlot, str, str2);
            NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
            if (LJJ2 != null && (LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI())) != null && (LJ = LJJ.LJ()) != null) {
                if (LJ.LJFF() == EnumC123874tb.IMAGE) {
                    LJJ2.setAbsSpeed(1.0f);
                    LJ.setDuration(nLETrackSlot.getDuration());
                    LJJ2.LJIJJLI(0L);
                    LJJ2.LJIJJ(nLETrackSlot.getDuration());
                } else if (LJ.LJFF() == EnumC123874tb.VIDEO) {
                    float absSpeed = LJJ2.getAbsSpeed();
                    if (((float) nLETrackSlot.getDuration()) * absSpeed > ((float) LJ.getDuration())) {
                        nLETrackSlot.setDuration(((float) LJ.getDuration()) / absSpeed);
                        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + (((float) LJ.getDuration()) / absSpeed));
                        LJJ2.LJIJJLI(0L);
                        LJJ2.LJIJJ(LJ.getDuration());
                    } else if (LJJ2.LJIIL() > LJ.getDuration()) {
                        if (LJJ2.LJIILIIL() >= LJ.getDuration() - ImagePreloadExperiment.PRIORITY_DEFAULT) {
                            LJJ2.LJIJJLI(LJ.getDuration() - (LJJ2.LJIIL() - LJJ2.LJIILIIL()));
                            LJJ2.LJIJJ(LJ.getDuration());
                        } else {
                            LJJ2.LJIJJ(LJ.getDuration());
                            long duration = ((float) (LJ.getDuration() - LJJ2.LJIILIIL())) / absSpeed;
                            nLETrackSlot.setDuration(duration);
                            nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + duration);
                        }
                    }
                }
            }
        }
        aqS48S0400000_2.invoke(new C125234vn(true, null));
    }

    @Override // X.AbstractC125294vt
    public final void LIZ(C125284vs request, AqS48S0400000_2 aqS48S0400000_2, InterfaceC88472Yns interfaceC88472Yns) {
        NLETrack mainTrack;
        NLETrackSlot nLETrackSlot;
        NLEResourceAV LJ;
        o.LJIIIZ(request, "request");
        NLETemplateModel nLETemplateModel = request.LIZJ;
        if (nLETemplateModel != null && (mainTrack = nLETemplateModel.getMainTrack()) != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(mainTrack.LJIILLIIL())) != null) {
            if (nLETrackSlot.LJIIIIZZ() != null) {
                NLETrackSlot nLETrackSlot2 = request.LIZIZ.LJLILLLLZI;
                NLERenderProxySegment LIZLLL = NLERenderProxySegment.LIZLLL(nLETrackSlot.LJIIIIZZ().LJI());
                if (LIZLLL != null) {
                    C125244vo c125244vo = request.LIZIZ.LJLIL;
                    String str = c125244vo.LIZIZ;
                    String str2 = c125244vo.LIZJ;
                    nLETrackSlot2.LJIILJJIL(nLETrackSlot.LJIIIIZZ());
                    nLETrackSlot2.setProcessor(nLETrackSlot.getProcessor());
                    C125204vk.LIZIZ(nLETrackSlot2, str, str2);
                    nLETrackSlot2.LJIIIIZZ().setExtra("ep_magic_resource_id", str);
                    nLETrackSlot2.LJIIIIZZ().setExtra("is_from_ep_magic", "true");
                    NLEResourceAV LJ2 = LIZLLL.LJ();
                    EnumC123874tb LJFF = LJ2.LJFF();
                    EnumC123874tb enumC123874tb = EnumC123874tb.IMAGE;
                    if (LJFF == enumC123874tb) {
                        NLERenderProxySegment LIZLLL2 = NLERenderProxySegment.LIZLLL(nLETrackSlot2.LJIIIIZZ().LJI());
                        if (LIZLLL2 != null && (LJ = LIZLLL2.LJ()) != null) {
                            LJ.setDuration(nLETrackSlot2.getDuration());
                        }
                    } else if (LJFF == EnumC123874tb.VIDEO) {
                        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot2.LJI());
                        long duration = LJ2.getDuration();
                        long absSpeed = ((float) duration) / LJJ.getAbsSpeed();
                        nLETrackSlot2.setDuration(absSpeed);
                        nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + absSpeed);
                        LJJ.LJIJJLI(0L);
                        LJJ.LJIJJ(duration);
                        if (LJJ.LIZIZ().LJFF() == enumC123874tb) {
                            LJJ.LIZIZ().setDuration(duration);
                        }
                    }
                    aqS48S0400000_2.invoke(new C125234vn(true, null));
                    return;
                }
            } else {
                aqS48S0400000_2.invoke(new C125234vn(true, null));
                return;
            }
        }
        aqS48S0400000_2.invoke(new C125234vn(false, null));
    }
}
