package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.UserExtra;

/* renamed from: X.BhT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29471BhT {
    public final InterfaceC68342mE<BaseResponse<User, UserExtra>> LIZ;
    public final java.util.Map<AbstractC29482Bhe<?>, InterfaceC68342mE<Object>> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C29473BhV> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C29472BhU
            if (r0 == 0) goto L98
            r5 = r10
            X.BhU r5 = (X.C29472BhU) r5
            int r2 = r5.LJLJLJ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r5.LJLJLJ = r2
        L12:
            java.lang.Object r8 = r5.LJLJJLL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJLJ
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L6c
            if (r0 == r1) goto L64
            if (r0 != r4) goto La9
            java.lang.Object r7 = r5.LJLJJL
            java.lang.Object r3 = r5.LJLJJI
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r1 = r5.LJLJI
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r0 = r5.LJLILLLLZI
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r5.LJLIL
            com.bytedance.android.live.network.response.BaseResponse r2 = (com.bytedance.android.live.network.response.BaseResponse) r2
            X.C141335gf.LIZJ(r8)
        L35:
            r3.put(r7, r8)
            r3 = r0
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.2mE r0 = (X.InterfaceC68342mE) r0
            r5.LJLIL = r2
            r5.LJLILLLLZI = r3
            r5.LJLJI = r1
            r5.LJLJJI = r3
            r5.LJLJJL = r7
            r5.LJLJLJ = r4
            java.lang.Object r8 = r0.LJI(r5)
            if (r8 != r6) goto L62
            return r6
        L62:
            r0 = r3
            goto L35
        L64:
            java.lang.Object r0 = r5.LJLIL
            X.BhT r0 = (X.C29471BhT) r0
            X.C141335gf.LIZJ(r8)
            goto L7d
        L6c:
            X.C141335gf.LIZJ(r8)
            X.2mE<com.bytedance.android.live.network.response.BaseResponse<com.bytedance.android.live.base.model.user.User, com.bytedance.android.livesdk.model.UserExtra>> r0 = r9.LIZ
            r5.LJLIL = r9
            r5.LJLJLJ = r1
            java.lang.Object r8 = r0.LJI(r5)
            if (r8 != r6) goto L7c
            return r6
        L7c:
            r0 = r9
        L7d:
            com.bytedance.android.live.network.response.BaseResponse r8 = (com.bytedance.android.live.network.response.BaseResponse) r8
            java.util.Map<X.Bhe<?>, X.2mE<java.lang.Object>> r1 = r0.LIZIZ
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r0 = r1.size()
            int r0 = X.C51029K0z.LJJIIZ(r0)
            r3.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r1 = r0.iterator()
            r2 = r8
            goto L39
        L98:
            X.BhU r5 = new X.BhU
            r5.<init>(r9, r10)
            goto L12
        L9f:
            X.BhV r1 = new X.BhV
            T r0 = r2.data
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            r1.<init>(r0, r3, r2)
            return r1
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29471BhT.LIZ(X.2kd):java.lang.Object");
    }

    public C29471BhT(C84661XKn c84661XKn, java.util.Map map) {
        this.LIZ = c84661XKn;
        this.LIZIZ = map;
    }
}
