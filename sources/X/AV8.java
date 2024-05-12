package X;

import android.os.Bundle;

/* loaded from: classes5.dex */
public final class AV8 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ AVB LJLJI;

    public AV8(AVB avb, String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = avb;
    }

    public final void LIZ() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("from_uid", this.LJLIL);
        c188727au.LJIIIZ("target_uid", this.LJLILLLLZI);
        c188727au.LJIIIZ("enter_method", this.LJLJI.LJLJJL.LIZIZ);
        c188727au.LJIIIZ("channel", this.LJLJI.LJLJJL.LIZJ);
        c188727au.LJIIIZ("enter_from", this.LJLJI.LJLJJL.LIZ);
        c188727au.LJIIIZ("sdk_name", this.LJLJI.LJLJJL.LIZLLL);
        c188727au.LJIIIZ("sdk_version", this.LJLJI.LJLJJL.LJ);
        FMX.LJIIL("switch_account_submit", c188727au.LIZ);
        Bundle bundle = new Bundle();
        AVB avb = this.LJLJI;
        bundle.putString("enter_from", avb.LJLJJL.LIZ);
        bundle.putString("enter_method", avb.LJLJJL.LIZIZ);
        Bundle bundle2 = avb.LJLJJLL;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
        AVB avb2 = this.LJLJI;
        LJIIIIZZ.switchAccount(avb2.LJLILLLLZI, bundle, new AV7(avb2, this.LJLIL, this.LJLILLLLZI));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
