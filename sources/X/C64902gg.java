package X;

import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.shared.UserProfileCache$clearVideoCacheWhenInit$1", f = "UserProfileCache.kt", l = {86}, m = "invokeSuspend")
/* renamed from: X.2gg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64902gg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final /* synthetic */ File[] LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64902gg(File[] fileArr, InterfaceC67352kd<? super C64902gg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = fileArr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64902gg(this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0038 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0051 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001b -> B:5:0x0015). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJJI
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L54
            if (r0 != r4) goto L64
            int r7 = r9.LJLJI
            int r3 = r9.LJLILLLLZI
            java.lang.Object r2 = r9.LJLIL
            java.io.File[] r2 = (java.io.File[]) r2
            X.C141335gf.LIZJ(r10)
        L15:
            int r3 = r3 + 1
        L17:
            if (r3 >= r7) goto L61
            r8 = r2[r3]
            if (r8 == 0) goto L15
            boolean r0 = r8.isFile()
            if (r0 != r4) goto L15
            boolean r0 = r8.exists()
            if (r0 == 0) goto L15
            java.lang.String r1 = r8.getName()
            java.lang.String r0 = "file.name"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "other"
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r5)
            if (r0 == 0) goto L15
            X.2fB r1 = X.C64912gh.LIZIZ()
            java.lang.String r0 = r8.getPath()
            r9.LJLIL = r2
            r9.LJLILLLLZI = r3
            r9.LJLJI = r7
            r9.LJLJJI = r4
            r1.getClass()
            java.lang.Object r0 = X.C63972fB.LIZ(r0, r9)
            if (r0 != r6) goto L15
            return r6
        L54:
            X.C141335gf.LIZJ(r10)
            java.io.File[] r2 = r9.LJLJJL
            java.lang.String r0 = "files"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            int r7 = r2.length
            r3 = 0
            goto L17
        L61:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64902gg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
