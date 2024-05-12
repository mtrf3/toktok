package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.profile.impl.ad.CommerceProfileFeedModule$attemptFetchAdsAndInsert$1", f = "CommerceProfileFeedModule.kt", l = {90}, m = "invokeSuspend")
/* renamed from: X.NFb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59039NFb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C59041NFd LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59039NFb(C59041NFd c59041NFd, List<String> list, int i, String str, InterfaceC67352kd<? super C59039NFb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c59041NFd;
        this.LJLJI = list;
        this.LJLJJI = i;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59039NFb(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ab, code lost:
    
        X.C59041NFd.LIZLLL("Insertion fails. Unable to find the index of current aweme.");
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59039NFb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
