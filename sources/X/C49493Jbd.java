package X;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchPreloadLayoutOptConfig;

/* renamed from: X.Jbd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49493Jbd extends AbstractC49496Jbg {
    public final /* synthetic */ C49491Jbb LIZLLL;

    @Override // X.AbstractC49496Jbg
    public final RecyclerView.ViewHolder LIZ() {
        C49491Jbb c49491Jbb = this.LIZLLL;
        if (c49491Jbb.LIZ != null) {
            if (((SearchPreloadLayoutOptConfig) C49500Jbk.LIZIZ.getValue()).enableAsyncCreate && C46442IKo.LIZ()) {
                InterfaceC49498Jbi interfaceC49498Jbi = c49491Jbb.LIZIZ;
                if (interfaceC49498Jbi != null) {
                    return interfaceC49498Jbi.LJJLIIIJLLLLLLLZ(c49491Jbb.LIZ, true);
                }
            } else {
                InterfaceC49498Jbi interfaceC49498Jbi2 = c49491Jbb.LIZIZ;
                if (interfaceC49498Jbi2 != null) {
                    return interfaceC49498Jbi2.LJJLIIIJLLLLLLLZ(c49491Jbb.LIZ, false);
                }
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49493Jbd(C49491Jbb c49491Jbb, Handler handler) {
        super(handler);
        this.LIZLLL = c49491Jbb;
    }
}
