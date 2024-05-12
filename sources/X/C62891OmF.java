package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.OmF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62891OmF implements EUJ {
    @Override // X.EUJ
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.EUJ
    public final void A1(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
        C62913Omb.LJFF(settings.removePhotosensitiveContent);
        OP4.LIZLLL(settings.filteredWordsCount);
        int i = settings.filteredWordsLimit;
        C247839o3 c247839o3 = C9X3.LIZ;
        c247839o3.LIZJ(String.valueOf(i), "tns_filter_keyword_limit");
        c247839o3.LIZJ(String.valueOf(settings.selfFilterWordsCount), "tns_filter_keyword_count_self");
    }
}
