package X;

import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.GSp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41555GSp extends F9E implements Serializable {
    public final VideoInfoFromURLResponse LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

    public static /* synthetic */ C41555GSp copy$default(C41555GSp c41555GSp, VideoInfoFromURLResponse videoInfoFromURLResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            videoInfoFromURLResponse = c41555GSp.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i = c41555GSp.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            str = c41555GSp.LJLJI;
        }
        return c41555GSp.copy(videoInfoFromURLResponse, i, str);
    }

    public final C41555GSp copy(VideoInfoFromURLResponse requestResult, int i, String enterMethod) {
        o.LJIIIZ(requestResult, "requestResult");
        o.LJIIIZ(enterMethod, "enterMethod");
        return new C41555GSp(requestResult, i, enterMethod);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public final String getEnterMethod() {
        return this.LJLJI;
    }

    public final VideoInfoFromURLResponse getRequestResult() {
        return this.LJLIL;
    }

    public final int getSubType() {
        return this.LJLILLLLZI;
    }

    public C41555GSp(VideoInfoFromURLResponse requestResult, int i, String enterMethod) {
        o.LJIIIZ(requestResult, "requestResult");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = requestResult;
        this.LJLILLLLZI = i;
        this.LJLJI = enterMethod;
    }
}
