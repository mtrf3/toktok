package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS103S0101000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6EJ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6EJ {
    public PreCheckResult LIZ;

    public abstract int LIZ();

    public boolean LIZIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        return true;
    }

    public abstract boolean LIZJ();

    public boolean LIZLLL(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        return true;
    }

    public void LJ(FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, int i, AqS103S0101000_2 aqS103S0101000_2, AqS103S0101000_2 aqS103S0101000_22) {
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
    }

    public void LJFF(FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, AqS168S0100000_2 aqS168S0100000_2) {
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
    }
}
