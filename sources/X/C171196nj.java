package X;

import android.os.Handler;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.creative.CreativeInfo;

/* renamed from: X.6nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171196nj {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static final TokenCert LIZIZ;
    public static final TokenCert LIZJ;

    static {
        TokenCert.Companion companion = TokenCert.Companion;
        LIZIZ = companion.with("bpea-mic_VoiceFilterOnShootPage_record");
        LIZJ = companion.with("bpea-mic_VoiceFilterOnShootPage_permission");
    }

    public static String LIZ(CreativeInfo creativeInfo) {
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIJL(creativeInfo);
    }
}
