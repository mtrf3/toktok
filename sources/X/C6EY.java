package X;

import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetail;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import java.util.ArrayList;

/* renamed from: X.6EY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6EY {
    /* JADX WARN: Multi-variable type inference failed */
    public static PreCheckResult LIZ(PreCheckResultModel preCheckResultModel) {
        if (preCheckResultModel == null) {
            return null;
        }
        ArrayList<MusicInfo> arrayList = preCheckResultModel.musicInfos;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList<MatchDetail> arrayList2 = preCheckResultModel.matchDetails;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        ArrayList<MatchDetailsV1> arrayList3 = preCheckResultModel.matchDetailsV1;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList<>();
        }
        ArrayList<UnavailableReason> arrayList4 = preCheckResultModel.unavailableReasons;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList<>();
        }
        int i = 0;
        return new PreCheckResult(arrayList, arrayList2, arrayList3, arrayList4, i, null, i, 112, 0 == true ? 1 : 0);
    }
}
