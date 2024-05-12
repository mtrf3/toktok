package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Jxd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50857Jxd extends AbstractC60800Ntc {
    public final /* synthetic */ C50863Jxj LJLIL;

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.onDestroy();
        }
        this.LJLIL.LJII();
    }

    public C50857Jxd(C50863Jxj c50863Jxj) {
        this.LJLIL = c50863Jxj;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        String str;
        EnumC254749zC enumC254749zC;
        boolean z;
        String str2;
        o.LJIIIZ(view, "view");
        this.LJLIL.LIZJ = new C50849JxV(view);
        this.LJLIL.LJIIIIZZ();
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJJ(view);
        }
        C50863Jxj c50863Jxj = this.LJLIL;
        C50858Jxe c50858Jxe = c50863Jxj.LJIIL;
        DynamicPatch dynamicPatch = c50863Jxj.LJIIIZ;
        boolean z2 = c50863Jxj.LJIIJJI;
        c50858Jxe.getClass();
        long currentTimeMillis = System.currentTimeMillis() - c50858Jxe.LIZ;
        if (dynamicPatch == null || (str = dynamicPatch.schema) == null) {
            str = "";
        }
        int LIZ = C50868Jxo.LIZ(dynamicPatch);
        if (ujb.o.LJJJJJL(str)) {
            enumC254749zC = EnumC254749zC.UNUSED;
        } else {
            enumC254749zC = C254759zD.LIZ.get(str);
            if (enumC254749zC == null) {
                enumC254749zC = EnumC254749zC.UNUSED;
            }
        }
        C50856Jxc c50856Jxc = new C50856Jxc();
        c50856Jxc.LJIILL("type", "load_success");
        c50856Jxc.LJIILL("schema", str);
        c50856Jxc.LJIILL("load_time", String.valueOf(currentTimeMillis));
        int i = 0;
        if (enumC254749zC == EnumC254749zC.USED) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "1";
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c50856Jxc.LJIILL("is_forecast", str2);
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c50856Jxc.LJIILL("preload", str3);
        if (LIZ == 1) {
            i = 1;
        }
        c50856Jxc.LJIILL("is_built_in", String.valueOf(i));
        c50856Jxc.LJIIZILJ(2);
        c50856Jxc.LJIILIIL();
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJJL(view, url);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        String str2;
        int i;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJ(view, url);
        }
        C50863Jxj c50863Jxj = this.LJLIL;
        C50858Jxe c50858Jxe = c50863Jxj.LJIIL;
        DynamicPatch dynamicPatch = c50863Jxj.LJIIIZ;
        c50858Jxe.getClass();
        if (dynamicPatch == null || (str2 = dynamicPatch.schema) == null) {
            str2 = "";
        }
        int LIZ = C50868Jxo.LIZ(dynamicPatch);
        C50856Jxc c50856Jxc = new C50856Jxc();
        c50856Jxc.LJIILL("type", "load_failed");
        c50856Jxc.LJIILL("schema", str2);
        c50856Jxc.LJIILL("error", str);
        if (LIZ == 1) {
            i = 1;
        } else {
            i = 0;
        }
        c50856Jxc.LJIILL("is_built_in", String.valueOf(i));
        c50856Jxc.LJIIZILJ(1);
        c50856Jxc.LJIILIIL();
        if (!ujb.o.LJJJJJL(str2)) {
            C50856Jxc.LJIILL.remove(str2);
        }
        this.LJLIL.LJII();
    }
}
