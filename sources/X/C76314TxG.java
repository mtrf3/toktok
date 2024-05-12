package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TxG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76314TxG<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C76278Twg LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    public C76314TxG(boolean z, boolean z2, C76278Twg c76278Twg, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = c76278Twg;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C28467BFf<Void> it = (C28467BFf) obj;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        o.LJIIIIZZ(it, "it");
        c76271TwZ.LJJJJJL(it);
        C0NB.LJIIIZ("MultiMatchViewAnchorPre", "punish, success");
        if (this.LJLIL) {
            if (this.LJLILLLLZI) {
                C76278Twg.LJJIJIIJI(this.LJLJI, "punish_cut_short_request_negative", 6);
            } else {
                C76278Twg.LJJIJIIJI(this.LJLJI, "punish_cut_short_request", 6);
            }
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }
}
