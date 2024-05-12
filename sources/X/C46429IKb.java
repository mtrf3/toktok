package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.IKb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46429IKb implements InterfaceC79472VGy {
    public static final IAwemeService LIZ = AwemeService.LIZ();

    @Override // X.InterfaceC79472VGy
    public final String key() {
        return "video_duration_seconds";
    }

    @Override // X.InterfaceC79472VGy
    public final String LIZ(String str) {
        Aweme i6;
        IAwemeService iAwemeService = LIZ;
        if (iAwemeService == null || (i6 = iAwemeService.i6(str)) == null || i6.getVideo() == null) {
            return "-1";
        }
        return String.valueOf(i6.getVideo().getDuration() / 1000.0f);
    }
}
