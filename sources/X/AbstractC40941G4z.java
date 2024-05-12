package X;

import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.G4z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40941G4z {
    public boolean onCancel() {
        return false;
    }

    public boolean onDeviceBlocked() {
        return false;
    }

    public boolean onError(PNSErrorModel error) {
        o.LJIIIZ(error, "error");
        return false;
    }

    public boolean onSuccess(C62962OnO result) {
        o.LJIIIZ(result, "result");
        return false;
    }

    public boolean onUnderage(C62962OnO result) {
        o.LJIIIZ(result, "result");
        return false;
    }
}
