package X;

import com.bytedance.bpea.cert.token.TokenCert;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.channel.guitar.EffectGuitarHandler$fetchGuitar$2", f = "EffectGuitarHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.KSa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51732KSa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ICY LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51732KSa(ICY icy, int i, InterfaceC67352kd<? super C51732KSa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = icy;
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C51732KSa(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        TokenCert with;
        TokenCert with2;
        long j;
        StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "Effect interface: ");
        LIZIZ.append(this.LJLIL.LIZJ);
        LIZIZ.append(" fetchGuitar spi call");
        H78.LJI(X1D.LIZIZ(LIZIZ));
        if (ICY.LIZLLL) {
            TokenCert.Companion companion = TokenCert.Companion;
            with = companion.with("bpea-sticker_effect_guitar_fetch_guitar_cache_time_v3");
            with.auth("bruh");
            with2 = companion.with("bpea-sticker_effect_guitar_fetch_guitar_cache_time_decrypt");
            with2.auth("mckd");
            j = -1;
        } else {
            TokenCert.Companion companion2 = TokenCert.Companion;
            with = companion2.with("bpea-sticker_effect_guitar_fetch_guitar_immediately_v2");
            with.auth("xjcp");
            with2 = companion2.with("bpea-sticker_effect_guitar_fetch_guitar_immediately_decrypt");
            with2.auth("mckd");
            j = 0;
        }
        C56179M3b.LIZ.LJIILJJIL("poi", "location_services", with, with2, new C85406XfW(this.LJLIL, this.LJLILLLLZI), new Long(j));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
