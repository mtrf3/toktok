package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: X.2TT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2TT {
    public static long LIZ = -1;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(final Aweme aweme, final String str, float f, long j) {
        if (!IFH.LIZ(aweme) || aweme == null || TextUtils.isEmpty(aweme.getAid()) || TextUtils.isEmpty(str)) {
            return;
        }
        long j2 = LIZ;
        if (j2 == -1 || j <= j2) {
            return;
        }
        final long j3 = j - j2;
        if (f != 1.0f) {
            final String valueOf = String.valueOf(f);
            if (IFH.LIZ(aweme) && !TextUtils.isEmpty(aweme.getAid()) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(valueOf)) {
                C10K.LIZIZ(new Callable() { // from class: X.3t5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String str2;
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("group_id", aweme.getAid());
                        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
                        c188727au.LJIIIZ("enter_from", str);
                        c188727au.LJIIIZ("speed_mode", valueOf);
                        if (C53946LFe.LIZIZ().LJFF) {
                            str2 = "3";
                        } else {
                            str2 = "1";
                        }
                        c188727au.LJIIIZ("pad_interface_orientation", str2);
                        c188727au.LJ(j3, "duration");
                        FMX.LJIIL("video_speed_play_time", c188727au.LIZ);
                        return C76800UCe.LIZ;
                    }
                }, FMX.LIZIZ(), null);
            }
        }
        LIZ = j;
    }
}
