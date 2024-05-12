package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;

/* renamed from: X.JcL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49537JcL extends AbstractC72439Sbr {
    public final /* synthetic */ SearchTakoCardAssem LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public C49537JcL(SearchTakoCardAssem searchTakoCardAssem, boolean z) {
        this.LJLIL = searchTakoCardAssem;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        String str;
        this.LJLIL.E4(false);
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
        this.LJLIL.E4(this.LJLILLLLZI);
    }
}
