package X;

import com.ss.android.ugc.aweme.detail.api.ReactDuetSettingsResponse;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.GQd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41491GQd {
    public static ReactDuetSettingsResponse LIZ() {
        if (!C44172HVg.LJIJ.isChildrenMode()) {
            return (ReactDuetSettingsResponse) AVApiImpl.LIZJ().LIZIZ(C141445gq.LIZ, ReactDuetSettingsResponse.class);
        }
        throw new IllegalStateException("Cannot access in ftc");
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!((Boolean) C41493GQf.LIZ.getValue()).booleanValue() || (!H7R.LJJJJLL(videoPublishEditModel) && !H7R.LJJIJIL(videoPublishEditModel))) {
            return true;
        }
        return false;
    }
}
