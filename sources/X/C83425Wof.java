package X;

import com.bytedance.ies.actionai.jni.ExecutionContext;

/* renamed from: X.Wof, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83425Wof extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ AbstractC83417WoX LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ ExecutionContext LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83425Wof(C76732zl c76732zl, C68322mC<String> c68322mC, AbstractC83417WoX abstractC83417WoX, long j, ExecutionContext executionContext) {
        super(0);
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = abstractC83417WoX;
        this.LJLJJI = j;
        this.LJLJJL = executionContext;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        String valueOf = String.valueOf(this.LJLIL.element);
        String str2 = this.LJLILLLLZI.element;
        String LIZ = this.LJLJI.LIZ();
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
        ExecutionContext executionContext = this.LJLJJL;
        if (executionContext != null) {
            str = executionContext.getConversationId();
        } else {
            str = null;
        }
        C43003GuF.LIZ(1, valueOf, str2, LIZ, currentTimeMillis, str, null, null, null, 0L);
        return C76800UCe.LIZ;
    }
}
