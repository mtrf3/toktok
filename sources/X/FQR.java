package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountService;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class FQR implements PEV {
    @Override // X.PEV
    public final java.util.Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        QJY.LJI(hashMap, true);
        return hashMap;
    }

    @Override // X.PEV
    public final long getUid() {
        String curUserId = AccountService.LJIJ().LJFF().getCurUserId();
        if (TextUtils.isEmpty(curUserId)) {
            return 0L;
        }
        return CastLongProtector.valueOf(curUserId).longValue();
    }

    @Override // X.PEV
    public final String getSessionId() {
        return FVP.LIZIZ;
    }
}
