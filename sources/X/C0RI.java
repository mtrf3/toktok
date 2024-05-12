package X;

import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.bytedance.android.livesdk.revenue.StarCommentDataChannel;
import com.bytedance.android.livesdk.revenue.StarCommentHideEvent;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0RI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RI {
    public final DataChannel LIZ;
    public final C30031Fv LIZIZ;
    public boolean LIZJ;

    public C0RI(DataChannel dataChannel, CUC cuc, InterfaceC266512v interfaceC266512v, C37661dq gameUiStrategy) {
        ContextThemeWrapper contextThemeWrapper;
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(gameUiStrategy, "gameUiStrategy");
        this.LIZ = dataChannel;
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        AttributeSet attributeSet = null;
        if (iHostAppContext != null) {
            contextThemeWrapper = new ContextThemeWrapper(iHostAppContext.context(), R.style.rv);
        } else {
            contextThemeWrapper = null;
        }
        o.LJIIIIZZ(contextThemeWrapper, "getContextWithStyle()");
        C30031Fv c30031Fv = new C30031Fv(contextThemeWrapper, attributeSet, 6, 0);
        this.LIZIZ = c30031Fv;
        c30031Fv.LJJZ(true, dataChannel, gameUiStrategy);
        dataChannel.mv0(StarCommentDataChannel.class, this, new IDqS28S0300000(cuc, this, interfaceC266512v, 11));
        dataChannel.mv0(StarCommentHideEvent.class, this, new IDqS416S0100000(this, 143));
    }
}
