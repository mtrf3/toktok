package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes11.dex */
public final class NDI extends AbstractC85293Wj {
    public final /* synthetic */ IAdPlayFunAsseUtils LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        this.LJLIL.LIZIZ(this.LJLILLLLZI, null, true);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        String str;
        IAdPlayFunAsseUtils iAdPlayFunAsseUtils = this.LJLIL;
        Aweme aweme = this.LJLILLLLZI;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        iAdPlayFunAsseUtils.LIZIZ(aweme, str, false);
    }

    public NDI(IAdPlayFunAsseUtils iAdPlayFunAsseUtils, Aweme aweme) {
        this.LJLIL = iAdPlayFunAsseUtils;
        this.LJLILLLLZI = aweme;
    }
}
