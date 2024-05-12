package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;

/* renamed from: X.GMb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41385GMb implements BOC {
    public final /* synthetic */ VideoPublishEditModel LIZ;

    public C41385GMb(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    @Override // X.BOC
    public final void LIZ(AVChallenge aVChallenge) {
        if (aVChallenge != null) {
            VideoPublishEditModel videoPublishEditModel = this.LIZ;
            if (videoPublishEditModel.challenges == null) {
                videoPublishEditModel.challenges = new ArrayList();
            }
            this.LIZ.challenges.add(aVChallenge);
        }
    }
}
