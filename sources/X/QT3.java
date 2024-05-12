package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class QT3 implements InterfaceC64016PAm {
    public final /* synthetic */ QT2 LIZ;

    @Override // X.InterfaceC64016PAm
    public final String getSessionId() {
        return null;
    }

    @Override // X.InterfaceC64016PAm
    public final java.util.Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        if (this.LIZ.LJFF) {
            hashMap.put("oversea", "1");
        } else {
            hashMap.put("oversea", CardStruct.IStatusCode.DEFAULT);
        }
        return hashMap;
    }

    public QT3(QT2 qt2) {
        this.LIZ = qt2;
    }
}
