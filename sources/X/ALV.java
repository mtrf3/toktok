package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.live.notification.ResponseState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ALV extends AbstractC65781Prl implements InterfaceC88471Ynr<ResponseState, Bundle, ResponseState> {
    public static final ALV LJLIL = new ALV();

    public ALV() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final ResponseState invoke(ResponseState responseState, Bundle bundle) {
        ResponseState viewModel = responseState;
        o.LJIIIZ(viewModel, "$this$viewModel");
        return ResponseState.copy$default(viewModel, -1, -1, null, null, 12, null);
    }
}
