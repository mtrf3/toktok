package X;

import android.app.Application;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS37S0301000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GMe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41388GMe {
    public static final void LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
    }

    public static final void LIZJ(int i, final VideoPublishEditModel model, InterfaceC88472Yns<? super AwemeDraft, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super DraftSaveResult, C76800UCe> interfaceC88472Yns2) {
        int i2;
        o.LJIIIZ(model, "model");
        final Application application = C44172HVg.LIZ;
        o.LJIIIIZZ(application, "application");
        final AqS37S0301000_7 aqS37S0301000_7 = new AqS37S0301000_7(i, model, interfaceC88472Yns, interfaceC88472Yns2, 0);
        if (model.isMultiVideoEdit() && !model.isCurrentAutoCutMode()) {
            if (C44687HgJ.LIZIZ(model.multiEditVideoRecordData.coverImagePath)) {
                aqS37S0301000_7.invoke();
                return;
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData = model.getCurMultiEditVideoRecordData();
            o.LJIIIIZZ(curMultiEditVideoRecordData, "mModel.curMultiEditVideoRecordData");
            VERecordData LJIIJJI = C46104I7o.LJIIJJI(curMultiEditVideoRecordData);
            Pair<Integer, Integer> playInOutTime = model.getCurMultiEditVideoRecordData().getPlayInOutTime();
            o.LJIIIIZZ(playInOutTime, "mModel.curMultiEditVideoRecordData.playInOutTime");
            LJIIJJI.setTimeRange(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
            int i3 = (int) (model.mVideoCoverStartTm * 1000);
            if (model.isUseTimeReverseEffect()) {
                int intValue = ((Number) playInOutTime.second).intValue();
                Object obj = playInOutTime.first;
                o.LJIIIIZZ(obj, "playPair.first");
                i2 = (intValue - ((Number) obj).intValue()) - i3;
            } else {
                i2 = i3;
            }
            int dimensionPixelOffset = application.getResources().getDimensionPixelOffset(R.dimen.oc);
            VEUtils.getVideoThumb(LJIIJJI, i2, dimensionPixelOffset, (int) (dimensionPixelOffset / ((model.videoWidth() * 1.0f) / model.videoHeight())), false, new P5A() { // from class: X.6Yy
                @Override // X.P5A
                public final boolean processFrame(ByteBuffer frame, int i4, int i5, int i6) {
                    o.LJIIIZ(frame, "frame");
                    Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(frame.position(0));
                    Bitmap LIZJ = OUR.LIZJ(model, createBitmap);
                    new C1M5(application.getResources(), LIZJ).LIZJ(KL2.LIZJ(C44172HVg.LIZ, 4.0f));
                    if (TextUtils.isEmpty(model.multiEditVideoRecordData.coverImagePath)) {
                        VideoPublishEditModel videoPublishEditModel = model;
                        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                        CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                        o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
                        multiEditVideoStatusRecordData.coverImagePath = C6BI.LIZJ(creativeInfo);
                    }
                    String str = model.multiEditVideoRecordData.coverImagePath;
                    o.LJIIIIZZ(str, "mModel.multiEditVideoRecordData.coverImagePath");
                    C6BI.LIZLLL(LIZJ, str, null);
                    aqS37S0301000_7.invoke();
                    return false;
                }
            });
            return;
        }
        aqS37S0301000_7.invoke();
    }

    public final void LIZIZ(ActivityC45651qj activity, VideoPublishEditModel model, AqS173S0100000_7 aqS173S0100000_7, AqS173S0100000_7 aqS173S0100000_72) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(model, "model");
        LIZJ(1, model, new G6J(aqS173S0100000_7, this, activity, model), new AqS173S0100000_7(aqS173S0100000_72, 2));
    }
}
