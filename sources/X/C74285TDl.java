package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.TDl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74285TDl extends C1GE {
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ ShortVideoContext LJLJI;

    @Override // X.InterfaceC74398THu
    public final void onSuccess(Effect effect) {
        C74284TDk.LIZJ(this.LJLILLLLZI, effect, this.LJLJI);
    }

    public C74285TDl(Context context, ShortVideoContext shortVideoContext) {
        this.LJLILLLLZI = context;
        this.LJLJI = shortVideoContext;
    }
}
