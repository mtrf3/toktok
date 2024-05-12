package X;

import com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider$categoryFetch$1", f = "DefaultResourceProvider.kt", l = {185, 190, 191, 201, 203, 210, 218, 220, 221}, m = "invokeSuspend")
/* renamed from: X.amL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94769amL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public CategoryPageModel LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ DefaultResourceProvider LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ AbstractC94464ahQ LJLJLJ;
    public final /* synthetic */ InterfaceC93663aUV LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94769amL(DefaultResourceProvider defaultResourceProvider, boolean z, String str, String str2, AbstractC94464ahQ abstractC94464ahQ, InterfaceC93663aUV interfaceC93663aUV, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = defaultResourceProvider;
        this.LJLJJL = z;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJLJ = abstractC94464ahQ;
        this.LJLJLLL = interfaceC93663aUV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94769amL(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r5 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0116, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94769amL.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
