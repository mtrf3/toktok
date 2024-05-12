package X;

import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {487, 505}, m = "invokeSuspend")
/* renamed from: X.2GY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GY extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, InterfaceC44041o8, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public /* synthetic */ InterfaceC44041o8 LJLJL;
    public final /* synthetic */ C36001bA LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2GY(C36001bA c36001bA, InterfaceC67352kd<? super C2GY> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJLJ = c36001bA;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[Catch: all -> 0x00e9, TryCatch #0 {, blocks: (B:14:0x0065, B:16:0x0072, B:21:0x0080, B:23:0x008f), top: B:13:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009f -> B:7:0x002b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00be -> B:6:0x0025). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2GY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static final void LJFF(List list, C36001bA c36001bA) {
        list.clear();
        synchronized (c36001bA.LIZLLL) {
            ArrayList arrayList = (ArrayList) c36001bA.LJIIJ;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                list.add((C24380xW) arrayList.get(i));
            }
            ((ArrayList) c36001bA.LJIIJ).clear();
        }
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC44041o8 interfaceC44041o8, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C2GY c2gy = new C2GY(this.LJLJLJ, interfaceC67352kd);
        c2gy.LJLJL = interfaceC44041o8;
        return c2gy.invokeSuspend(C76800UCe.LIZ);
    }

    public static final void LJ(List list, List list2, List list3, java.util.Set set, java.util.Set set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }
}
