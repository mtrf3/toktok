package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class G5E<V> implements Callable {
    public final /* synthetic */ VideoPublishEditModel LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public G5E(VideoPublishEditModel videoPublishEditModel, int i, int i2, int i3, String str) {
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LJLIL.getCreationId());
        c145995oB.LJI("shoot_way", this.LJLIL.mShootWay);
        c145995oB.LJI("content_type", H7R.LJIIIZ(this.LJLIL));
        c145995oB.LIZ(this.LJLILLLLZI, "video_type");
        c145995oB.LIZ(this.LJLJI, "memory_total_size_mb");
        c145995oB.LIZ(0, "retry_publish");
        c145995oB.LIZ(this.LJLJJI, "pre_publish_type");
        c145995oB.LJI("publish_action_trace_id", this.LJLJJL);
        c145995oB.LIZ(this.LJLIL.screenBrightness, "brightness");
        c145995oB.LIZ(C44546He2.LJFF(this.LJLIL) ? 1 : 0, "is_hd_video");
        c145995oB.LIZ(1, "video_upload_type");
        FMX.LJIIL("performance_publish", c145995oB.LIZ);
        return C76800UCe.LIZ;
    }
}
