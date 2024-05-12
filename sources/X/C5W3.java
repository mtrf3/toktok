package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$2", f = "CutOptimizedVideoChosenHandler.kt", l = {342, 343, 348, 364, 354, 364, 364, 364}, m = "invokeSuspend")
/* renamed from: X.5W3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5W3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public C84661XKn LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ List<MediaModel> LJLJL;
    public final /* synthetic */ Intent LJLJLJ;
    public final /* synthetic */ Intent LJLJLLL;
    public final /* synthetic */ C43544H7c LJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ C34K LJLLJ;
    public final /* synthetic */ long LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5W3(List<? extends MediaModel> list, Intent intent, Intent intent2, C43544H7c c43544H7c, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str, C34K c34k, long j, InterfaceC67352kd<? super C5W3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = list;
        this.LJLJLJ = intent;
        this.LJLJLLL = intent2;
        this.LJLL = c43544H7c;
        this.LJLLI = interfaceC65784Pro;
        this.LJLLILLLL = str;
        this.LJLLJ = c34k;
        this.LJLLL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C5W3 c5w3 = new C5W3(this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, interfaceC67352kd);
        c5w3.LJLJJLL = obj;
        return c5w3;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x02b5, code lost:
    
        if (r0 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x02b7, code lost:
    
        r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x02bc, code lost:
    
        return X.C76800UCe.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02a2, code lost:
    
        if (r0 != null) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0240 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f3  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5W3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
