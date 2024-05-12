package X;

import android.text.TextUtils;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.UrlShorter$fetchShortenUrl$1$1$job$1", f = "UrlShorter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66742je extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC<String> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66742je(C68322mC<String> c68322mC, String str, String str2, C68322mC<String> c68322mC2, boolean z, InterfaceC67352kd<? super C66742je> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = c68322mC2;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66742je(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        T t;
        C141335gf.LIZJ(obj);
        C68322mC<String> c68322mC = this.LJLIL;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String str3 = this.LJLJJI.element;
        if (TextUtils.isEmpty(str3)) {
            t = 0;
        } else {
            t = C4LD.LIZIZ.LJJLIIIJLLLLLLLZ(str, str2, str3).LIZLLL();
        }
        o.LJIIIIZZ(t, "getShortShareUrl(itemTyp…el, longUrl, boolPersist)");
        c68322mC.element = t;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
