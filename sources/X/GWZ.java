package X;

import android.util.Pair;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GWZ {
    public static String LIZ;

    public static String LIZ(VideoPublishEditModel videoPublishEditModel, WeakReference weakReference) {
        int i;
        Integer valueOf;
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        o.LJIIIIZZ(curMultiEditVideoRecordData, "mModel.curMultiEditVideoRecordData");
        VERecordData LJIIJJI = C46104I7o.LJIIJJI(curMultiEditVideoRecordData);
        Pair<Integer, Integer> playInOutTime = videoPublishEditModel.getCurMultiEditVideoRecordData().getPlayInOutTime();
        LJIIJJI.setTimeRange(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
        int i2 = (int) (videoPublishEditModel.mVideoCoverStartTm * 1000);
        if (videoPublishEditModel.isUseTimeReverseEffect()) {
            int intValue = ((Number) playInOutTime.second).intValue();
            Object obj = playInOutTime.first;
            o.LJIIIIZZ(obj, "playPair.first");
            i = (intValue - ((Number) obj).intValue()) - i2;
        } else {
            i = i2;
        }
        View view = (View) weakReference.get();
        if (view == null || (valueOf = Integer.valueOf(view.getWidth())) == null) {
            return null;
        }
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        VEUtils.getVideoThumb(LJIIJJI, i, valueOf.intValue(), (int) (valueOf.intValue() / ((videoPublishEditModel.videoWidth() * 1.0f) / videoPublishEditModel.videoHeight())), false, new C41883GcB(videoPublishEditModel));
        return videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
    }

    public static void LIZIZ(WeakReference weakReference, float f, RecordScene recordScene) {
        AbstractC73638SvC.LJI(new C41887GcF(recordScene, weakReference)).LJJIIJ(T16.LIZ()).LJIJI(C41882GcA.LJLIL).LJIJJ(C73969T1h.LIZIZ()).LJJII(new C41880Gc8(weakReference, f), C41644GWa.LJLIL);
    }
}
