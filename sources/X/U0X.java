package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U0X<V extends View> implements InterfaceC76502U0s {
    public final /* synthetic */ DataChannel LJLIL;

    public U0X(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    @Override // X.InterfaceC76502U0s
    public final void LIZ(View view) {
        U2A view2 = (U2A) view;
        o.LJIIIZ(view2, "view");
        view2.LJIIJ(this.LJLIL);
    }
}
