package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Wf3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82829Wf3 {
    public final ShortVideoContext LIZ;
    public final InterfaceC46131I8p LIZIZ;

    public final C145995oB LIZ() {
        C145995oB c145995oB = new C145995oB();
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext != null) {
            c145995oB.LJI("creation_id", shortVideoContext.LJI());
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LIZLLL("shoot_way", shortVideoContext.shootWay);
        }
        return c145995oB;
    }

    public final String LIZIZ() {
        int i = C82836WfA.LIZ[this.LIZIZ.ye().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return "music_and_prop";
            }
            return "prop";
        }
        return "music";
    }

    public C82829Wf3(ShortVideoContext shortVideoContext, C82822Wew reuseApi) {
        o.LJIIIZ(reuseApi, "reuseApi");
        this.LIZ = shortVideoContext;
        this.LIZIZ = reuseApi;
    }
}
