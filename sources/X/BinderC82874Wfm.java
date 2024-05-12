package X;

import java.util.LinkedHashMap;

/* renamed from: X.Wfm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class BinderC82874Wfm extends AbstractBinderC82875Wfn {
    public final /* synthetic */ C82869Wfh LJLILLLLZI;

    public BinderC82874Wfm(C82869Wfh c82869Wfh) {
        this.LJLILLLLZI = c82869Wfh;
    }

    @Override // X.FL7
    public final void LJFF(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        C44976Hky c44976Hky = (C44976Hky) ((LinkedHashMap) this.LJLILLLLZI.LJ).get(str);
        if (c44976Hky != null) {
            c44976Hky.LIZ = str2;
        }
        C82876Wfo c82876Wfo = this.LJLILLLLZI.LJI;
        if (c82876Wfo == null) {
            return;
        }
        c82876Wfo.LJFF(str, str2);
    }

    @Override // X.FL7
    public final void onError(int i, String str) {
        if (str == null || i == 0) {
            return;
        }
        C44976Hky c44976Hky = (C44976Hky) ((LinkedHashMap) this.LJLILLLLZI.LJ).get(str);
        if (c44976Hky != null) {
            c44976Hky.LIZIZ = i;
        }
        C82876Wfo c82876Wfo = this.LJLILLLLZI.LJI;
        if (c82876Wfo == null) {
            return;
        }
        c82876Wfo.onError(i, str);
    }
}
