package X;

import android.os.Bundle;
import com.facebook.share.model.ShareContent;

/* loaded from: classes12.dex */
public final class Q7X implements InterfaceC66437Q5p {
    public final /* synthetic */ Q6H LIZ;
    public final /* synthetic */ ShareContent<?, ?> LIZIZ;

    @Override // X.InterfaceC66437Q5p
    public final Bundle LIZ() {
        return C66476Q7c.LIZ(this.LIZ.LIZ(), this.LIZIZ, false);
    }

    @Override // X.InterfaceC66437Q5p
    public final Bundle getParameters() {
        return Q7Z.LIZ(this.LIZ.LIZ(), this.LIZIZ, false);
    }

    public Q7X(Q6H q6h, ShareContent shareContent) {
        this.LIZ = q6h;
        this.LIZIZ = shareContent;
    }
}
