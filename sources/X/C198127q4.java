package X;

import android.graphics.Bitmap;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.placediscovery2.map.MarkerDataParser$tryLoadBitmap$2", f = "MarkerDataParser.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7q4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198127q4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<C191707fi> LJLIL;
    public final /* synthetic */ C44195HWd LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<String, Bitmap, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C198127q4(List<C191707fi> list, C44195HWd c44195HWd, InterfaceC88471Ynr<? super String, ? super Bitmap, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C198127q4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c44195HWd;
        this.LJLJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C198127q4(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<C191707fi> list = this.LJLIL;
        C44195HWd c44195HWd = this.LJLILLLLZI;
        final InterfaceC88471Ynr<String, Bitmap, C76800UCe> interfaceC88471Ynr = this.LJLJI;
        for (final C191707fi c191707fi : list) {
            c44195HWd.getClass();
            String str = c191707fi.LJI;
            if (str != null && str.length() > 0) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                int i = C199687sa.LIZ;
                LJIIIIZZ.LJII = i;
                LJIIIIZZ.LJIIIIZZ = i;
                LJIIIIZZ.LIZIZ("MarkerDataParser");
                LJIIIIZZ.LJIIL(new InterfaceC78660Uu0(c191707fi, interfaceC88471Ynr) { // from class: X.7q3
                    public final C191707fi LJLIL;
                    public final InterfaceC88471Ynr<String, Bitmap, C76800UCe> LJLILLLLZI;

                    @Override // X.InterfaceC78660Uu0
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC78660Uu0
                    public final void onFailed(Throwable th) {
                    }

                    @Override // X.InterfaceC78660Uu0
                    public final void onProgress(float f) {
                    }

                    @Override // X.InterfaceC78660Uu0
                    public final void LIZIZ(Bitmap bitmap) {
                        InterfaceC88471Ynr<String, Bitmap, C76800UCe> interfaceC88471Ynr2;
                        if (bitmap != null && (interfaceC88471Ynr2 = this.LJLILLLLZI) != null) {
                            interfaceC88471Ynr2.invoke(this.LJLIL.LIZ, bitmap);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LJLIL = c191707fi;
                        this.LJLILLLLZI = interfaceC88471Ynr;
                    }
                });
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
