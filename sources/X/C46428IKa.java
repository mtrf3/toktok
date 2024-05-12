package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.IKa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46428IKa implements InterfaceC79472VGy {
    public static final IAwemeService LIZ = AwemeService.LIZ();

    @Override // X.InterfaceC79472VGy
    public final String key() {
        return "video_format";
    }

    @Override // X.InterfaceC79472VGy
    public final String LIZ(String str) {
        Aweme i6;
        IAwemeService iAwemeService = LIZ;
        if (iAwemeService == null || (i6 = iAwemeService.i6(str)) == null || i6.getVideo() == null) {
            return "-1";
        }
        if (TextUtils.isEmpty(i6.getVideo().getVideoModelStr())) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }
}
