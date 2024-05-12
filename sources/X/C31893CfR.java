package X;

/* renamed from: X.CfR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31893CfR implements InterfaceC31920Cfs {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC37666EqM LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LIZJ;

    public C31893CfR(String str, InterfaceC37666EqM interfaceC37666EqM, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LIZ = str;
        this.LIZIZ = interfaceC37666EqM;
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC31920Cfs
    public final AbstractC38123Exj LIZ() {
        return new C31894CfS(this.LIZ, this.LIZIZ, this.LIZJ);
    }
}
