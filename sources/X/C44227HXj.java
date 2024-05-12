package X;

import Y.ACallableS56S0300000_7;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.beauty.MBeautyStateInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* renamed from: X.HXj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44227HXj implements InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe> {
    public final /* synthetic */ C44226HXi LJLIL;

    public C44227HXj(C44226HXi c44226HXi) {
        this.LJLIL = c44226HXi;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Integer num, Integer num2, String str, VERecorder vERecorder) {
        Integer num3;
        String str2;
        FaceStickerBean Z5;
        int intValue = num.intValue();
        num2.intValue();
        VERecorder veRecorder = vERecorder;
        o.LJIIIZ(veRecorder, "veRecorder");
        if (intValue == 1076) {
            AbstractC84025WyL abstractC84025WyL = veRecorder.LIZIZ;
            HY1.LIZJ = abstractC84025WyL.recordPreviewFpsStart;
            HY1.LIZLLL = abstractC84025WyL.recordPreviewFpsEnd;
            HY1.LJ = abstractC84025WyL.renderFrameTime;
            HY1.LJFF = abstractC84025WyL.renderEffectTime;
            C44226HXi c44226HXi = this.LJLIL;
            ComposerBeautyBuriedInfo LJJLIIIJILLIZJL = c44226HXi.LJJLIIIJILLIZJL(c44226HXi.LJJLIIIJJIZ().f7().r7());
            C44226HXi c44226HXi2 = this.LJLIL;
            MBeautyStateInfo LJJLIIIJJI = c44226HXi2.LJJLIIIJJI(c44226HXi2.LJJLIIIJJIZ().f7().m7());
            long endFrameTimeUS = this.LJLIL.getCameraApiComponent().e8().getEndFrameTimeUS() / 1000;
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", this.LJLIL.LJLJJL.LIZLLL().getCreationId());
            c145995oB.LJI("content_type", this.LJLIL.LJLJJL.LIZLLL().getContentType());
            c145995oB.LJI("content_source", this.LJLIL.LJLJJL.LIZLLL().getContentSource());
            c145995oB.LIZ(this.LJLIL.LJLJJL.shootMode, "record_mode");
            c145995oB.LIZIZ(endFrameTimeUS, "record_duration");
            C44226HXi c44226HXi3 = this.LJLIL;
            FilterBean LIZ = c44226HXi3.getFilterApiComponent().getCurSelectedFilter().LIZ();
            if (LIZ != null) {
                num3 = Integer.valueOf(LIZ.getId());
            } else {
                num3 = null;
            }
            c145995oB.LJI("filter_id", c44226HXi3.LLJLLIL(num3));
            I0N stickerApiComponent = this.LJLIL.getStickerApiComponent();
            if (stickerApiComponent == null || (Z5 = stickerApiComponent.Z5()) == null || (str2 = Long.valueOf(Z5.getStickerId()).toString()) == null) {
                str2 = "";
            }
            c145995oB.LJI("prop_id", str2);
            c145995oB.LIZ(this.LJLIL.LJJLIIIJJIZ().d3(), "eyes");
            c145995oB.LIZ(this.LJLIL.LJJLIIIJJIZ().B1(), "smooth");
            c145995oB.LIZ(this.LJLIL.LJJLIIIJJIZ().K6(), "reshape");
            c145995oB.LIZJ(Double.valueOf(HY1.LIZJ), "record_preview_frame_rate_start");
            c145995oB.LIZJ(Double.valueOf(HY1.LIZLLL), "record_preview_frame_rate_end");
            c145995oB.LIZJ(Double.valueOf(HY1.LJ), "record_render_frame_time");
            c145995oB.LIZJ(Double.valueOf(HY1.LJFF), "record_effect_render_time");
            C10K.LIZIZ(new ACallableS56S0300000_7(c145995oB, LJJLIIIJILLIZJL, LJJLIIIJJI, 1), FMX.LIZIZ(), null);
        }
        return C76800UCe.LIZ;
    }
}
