package X;

import Y.ARunnableS26S0200000_7;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.Har, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44349Har implements InterfaceC83974WxW {
    public final /* synthetic */ AbstractC46244ICy LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ Effect LIZJ;

    @Override // X.InterfaceC83974WxW
    public final void onResult(String[] strArr) {
        this.LIZ.LLLZI().post(new ARunnableS26S0200000_7(strArr, this, 1));
    }

    public C44349Har(AbstractC46244ICy abstractC46244ICy, int i, Effect effect) {
        this.LIZ = abstractC46244ICy;
        this.LIZIZ = i;
        this.LIZJ = effect;
    }
}
