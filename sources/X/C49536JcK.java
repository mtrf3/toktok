package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;
import kotlin.jvm.internal.AqS174S0100000_8;

/* renamed from: X.JcK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49536JcK extends AbstractC72439Sbr {
    public final /* synthetic */ TakoPollingVM LJLIL;

    public C49536JcK(TakoPollingVM takoPollingVM) {
        this.LJLIL = takoPollingVM;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        String str;
        TakoPollingVM takoPollingVM = this.LJLIL;
        Boolean bool = Boolean.FALSE;
        takoPollingVM.getClass();
        takoPollingVM.setState(new AqS174S0100000_8(bool, 217));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("botIconPath imageLoad onFailed: ");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        TakoPollingVM takoPollingVM = this.LJLIL;
        Boolean bool = Boolean.TRUE;
        takoPollingVM.getClass();
        takoPollingVM.setState(new AqS174S0100000_8(bool, 217));
    }
}
