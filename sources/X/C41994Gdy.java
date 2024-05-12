package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS10S1100100_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gdy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41994Gdy {
    public static final /* synthetic */ int LIZ = 0;

    public static OSJ LIZ(Context context, List videosInfo, long j, long j2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(videosInfo, "videosInfo");
        int size = videosInfo.size();
        long j3 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((int) ((MediaModel) ListProtector.get(videosInfo, i2)).duration) < j) {
                String string = context.getString(R.string.th6, Long.valueOf(j / 1000));
                o.LJIIIIZZ(string, "context.getString(R.stri…imit, minDuration / 1000)");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("VQEvaluation; checkMediaDurationValid; ");
                LIZ2.append(string);
                C5Z2.LIZJ(X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Media invalid for duration: \n real duration = ");
                LIZ3.append(((MediaModel) ListProtector.get(videosInfo, i2)).duration);
                LIZ3.append(" \n minDuration = ");
                LIZ3.append(j);
                H7B.LIZJ(X1D.LIZIZ(LIZ3));
                if (context instanceof Activity) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(string);
                    C78915Uy7.LJJIIZI((Activity) context, 3047, creativeToastBuilder);
                }
                C41865Gbt.LIZ(new AqS10S1100100_7(j, videosInfo, string, 0));
                C41995Gdz.LIZ(1, 0);
                return new OSJ(Boolean.FALSE, -1, -1L);
            }
            j3 += (int) ((MediaModel) ListProtector.get(videosInfo, i2)).duration;
            if (((MediaModel) ListProtector.get(videosInfo, i2)).type == 4) {
                i++;
            }
        }
        if (j3 < j) {
            String string2 = context.getString(R.string.th6, Long.valueOf(j / 1000));
            o.LJIIIIZZ(string2, "context.getString(R.stri…imit, minDuration / 1000)");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Media invalid for duration: \n all real duration = ");
            LIZ4.append(j3);
            LIZ4.append(" \n minDuration = ");
            LIZ4.append(j);
            H7B.LIZJ(X1D.LIZIZ(LIZ4));
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("VQEvaluation ; checkMediaDurationValid; ");
            LIZ5.append(string2);
            C5Z2.LIZJ(X1D.LIZIZ(LIZ5));
            if (context instanceof Activity) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.message(string2);
                C78915Uy7.LJJIIZI((Activity) context, 3047, creativeToastBuilder2);
            }
            C41865Gbt.LIZ(new AqS10S1100100_7(j, videosInfo, string2, 1));
            C41995Gdz.LIZ(1, 0);
            return new OSJ(Boolean.FALSE, -1, -1L);
        }
        if (1 <= j2 && j2 < j3) {
            String string3 = context.getString(R.string.i_t);
            o.LJIIIIZZ(string3, "context.getString(R.stri…ti_select_video_max_time)");
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("VQEvaluation ; checkMediaDurationValid; ");
            LIZ6.append(string3);
            C5Z2.LIZJ(X1D.LIZIZ(LIZ6));
            if (context instanceof Activity) {
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                creativeToastBuilder3.message(string3);
                C78915Uy7.LJJIIZI((Activity) context, 3047, creativeToastBuilder3);
            }
            C41995Gdz.LIZ(2, 0);
            return new OSJ(Boolean.FALSE, -1, -1L);
        }
        return new OSJ(Boolean.TRUE, Integer.valueOf(i), Long.valueOf(j3));
    }
}
