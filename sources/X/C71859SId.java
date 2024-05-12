package X;

import android.view.View;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercebase.live.WindowLivePlayer$playPrepared$2", f = "WindowLivePlayer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.SId, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71859SId extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ViewOnTouchListenerC71861SIf LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71859SId(ViewOnTouchListenerC71861SIf viewOnTouchListenerC71861SIf, InterfaceC67352kd<? super C71859SId> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = viewOnTouchListenerC71861SIf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJ("manual");
        View findViewById = this.LJLIL.LJLJJL.findViewById(R.id.h1t);
        o.LJIIIIZZ(findViewById, "cardView.no_internet");
        if (findViewById.getVisibility() != 0 && (!ujb.o.LJJJJJL(this.LJLIL.LJLJI))) {
            Keva keva = C66822jm.LIZ;
            String key = this.LJLIL.LJLJI;
            long currentTimeMillis = System.currentTimeMillis();
            o.LJIIIZ(keva, "<this>");
            o.LJIIIZ(key, "key");
            keva.storeLong(key, currentTimeMillis);
        }
        XJL<C76800UCe> xjl = this.LJLIL.LJLJJI;
        if (xjl != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            xjl.resumeWith(c76800UCe);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C71859SId(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
