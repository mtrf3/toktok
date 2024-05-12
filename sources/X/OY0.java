package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OY0<T> implements InterfaceC73518StG {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ GiphyViewModel LIZIZ;

    public OY0(String str, GiphyViewModel giphyViewModel) {
        this.LIZ = str;
        this.LIZIZ = giphyViewModel;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C64626PXy LJIIJJI = C64626PXy.LJIIJJI(this.LIZ);
        if (LJIIJJI == null) {
            c73516StE.onError(new IllegalArgumentException("Expecting valid url"));
            return;
        }
        C64627PXz LJIIJ = LJIIJJI.LJIIJ();
        LJIIJ.LIZIZ("ts", String.valueOf(this.LIZIZ.LJLJI.now()));
        String str = LJIIJ.LIZJ().LJIIIIZZ;
        o.LJIIIIZZ(str, "url.newBuilder()\n       …              .toString()");
        c73516StE.onSuccess(str);
    }
}
