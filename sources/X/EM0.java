package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import fjb.a;
import java.util.HashSet;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactBookFilterByPsi$tryFilterBeforeUpload$4", f = "ContactFilterByPsi.kt", l = {265, 272, 277}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EM0 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super ContactUploadResponse>, Object> {
    public ContactUploadResponse LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ EM2 LJLJI;
    public final /* synthetic */ EM1 LJLJJI;
    public final /* synthetic */ List<ContactBookUploadItem> LJLJJL;
    public final /* synthetic */ HashSet<String> LJLJJLL;
    public final /* synthetic */ HashSet<String> LJLJL;
    public final /* synthetic */ java.util.Set<String> LJLJLJ;
    public final /* synthetic */ java.util.Set<String> LJLJLLL;
    public final /* synthetic */ InterfaceC88471Ynr<List<ContactBookUploadItem>, InterfaceC67352kd<? super ContactUploadResponse>, Object> LJLL;
    public final /* synthetic */ java.util.Set<String> LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EM0(EM2 em2, EM1 em1, List<ContactBookUploadItem> list, HashSet<String> hashSet, HashSet<String> hashSet2, java.util.Set<String> set, java.util.Set<String> set2, InterfaceC88471Ynr<? super List<ContactBookUploadItem>, ? super InterfaceC67352kd<? super ContactUploadResponse>, ? extends Object> interfaceC88471Ynr, java.util.Set<String> set3, InterfaceC67352kd<? super EM0> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLJI = em2;
        this.LJLJJI = em1;
        this.LJLJJL = list;
        this.LJLJJLL = hashSet;
        this.LJLJL = hashSet2;
        this.LJLJLJ = set;
        this.LJLJLLL = set2;
        this.LJLL = interfaceC88471Ynr;
        this.LJLLI = set3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new EM0(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super ContactUploadResponse> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EM0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
