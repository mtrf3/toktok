package X;

import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;

/* loaded from: classes6.dex */
public final class CE9 extends F9E {
    public final GetSubInfoResponse LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public CE9(GetSubInfoResponse getSubInfoResponse, boolean z) {
        this.LJLIL = getSubInfoResponse;
        this.LJLILLLLZI = z;
    }
}
