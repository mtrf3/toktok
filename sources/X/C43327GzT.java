package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;
import kotlin.jvm.internal.o;

/* renamed from: X.GzT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43327GzT {
    public static final Keva LIZ = Keva.getRepo("UploadSelectChoiceSP");

    public static boolean LIZ() {
        UploadSingleSelectData LIZ2;
        UploadSingleSelectData LIZ3;
        if (C43326GzS.LIZ.contains(Integer.valueOf(C43326GzS.LIZIZ)) && (((LIZ2 = HRV.LIZ()) != null && LIZ2.getUploadRememberLastChoice() && HRV.LIZJ()) || ((LIZ3 = HRV.LIZ()) != null && LIZ3.getUploadRememberLastChoiceNonStory() && HRV.LIZIZ()))) {
            return o.LJ(LIZ.getString("storeLastChoice", "single"), "single");
        }
        return C43326GzS.LIZ();
    }
}
