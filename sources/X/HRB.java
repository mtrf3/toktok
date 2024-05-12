package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class HRB<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ C44065HRd LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL = "";

    public HRB(C44065HRd c44065HRd, Activity activity, String str) {
        this.LIZ = c44065HRd;
        this.LIZIZ = activity;
        this.LIZJ = str;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        Aweme aweme = (Aweme) c10k.LJIIJJI();
        if (aweme == null) {
            this.LIZ.LJI(R.string.rpm, EnumC44070HRi.AWEME_ID_UNAVAILABLE);
            this.LIZ.LIZ();
        } else if (aweme.getStatus() != null && aweme.getStatus().isPrivate()) {
            this.LIZ.LJI(R.string.h47, EnumC44070HRi.PRIVATE_STATUS);
            this.LIZ.LIZ();
        } else if (aweme.getStatus() != null && aweme.getStatus().isDelete()) {
            this.LIZ.LJI(R.string.h46, EnumC44070HRi.VIDEO_IS_NOT_EXIT);
            this.LIZ.LIZ();
        } else {
            this.LIZ.LIZJ(aweme, this.LIZIZ, this.LIZJ, this.LIZLLL, false);
        }
        return C76800UCe.LIZ;
    }
}
