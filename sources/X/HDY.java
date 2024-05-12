package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HDY {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(ShortVideoContext shortVideoContext) {
        if (o.LJ(shortVideoContext.shootWay, "duet") && C43710HDm.LIZ()) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(String str, boolean z, boolean z2) {
        String str2;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_type", str);
        c145995oB.LJ("is_duet_upload", z);
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("source_is_hdr", str2);
        GXR.LIZ("choose_upload_content", c145995oB.LIZ);
    }
}
