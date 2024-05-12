package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Ffd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39549Ffd implements N2X {
    public final /* synthetic */ Context LIZ;

    public C39549Ffd(Context context) {
        this.LIZ = context;
    }

    @Override // X.N2X
    public final void LIZ(boolean z) {
        String str;
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LIZ = "draw_ad";
        String str2 = "deeplink_success";
        if (z) {
            str = "deeplink_success";
        } else {
            str = "deeplink_failed";
        }
        LIZ.LIZIZ = str;
        LIZ.LJIIIZ(this.LIZ);
        if (!z) {
            str2 = "deeplink_failed";
        }
        C58704N2e.LJ("draw_ad", str2, CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT).LJII();
    }
}
