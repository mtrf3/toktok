package X;

import android.content.ContentResolver;
import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {115, 121}, m = "invokeSuspend")
/* renamed from: X.29a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C537429a extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super Float>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC169716lL LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ ContentResolver LJLJJI;
    public final /* synthetic */ android.net.Uri LJLJJL;
    public final /* synthetic */ C05J LJLJJLL;
    public final /* synthetic */ InterfaceC78936UyS<C76800UCe> LJLJL;
    public final /* synthetic */ Context LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537429a(ContentResolver contentResolver, android.net.Uri uri, C05J c05j, InterfaceC78936UyS<C76800UCe> interfaceC78936UyS, Context context, InterfaceC67352kd<? super C537429a> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = contentResolver;
        this.LJLJJL = uri;
        this.LJLJJLL = c05j;
        this.LJLJL = interfaceC78936UyS;
        this.LJLJLJ = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C537429a c537429a = new C537429a(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c537429a.LJLJI = obj;
        return c537429a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:15:0x004c, B:17:0x0054), top: B:14:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0074 -> B:8:0x003f). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLILLLLZI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 == r4) goto L1e
            if (r0 != r5) goto L16
            X.6lL r7 = r8.LJLIL
            java.lang.Object r3 = r8.LJLJI
            X.2gJ r3 = (X.InterfaceC64672gJ) r3
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> L84
            goto L3f
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.6lL r7 = r8.LJLIL
            java.lang.Object r3 = r8.LJLJI
            X.2gJ r3 = (X.InterfaceC64672gJ) r3
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> L84
            goto L4c
        L28:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r3 = r8.LJLJI
            X.2gJ r3 = (X.InterfaceC64672gJ) r3
            android.content.ContentResolver r7 = r8.LJLJJI
            android.net.Uri r2 = r8.LJLJJL
            r1 = 0
            X.05J r0 = r8.LJLJJLL
            r7.registerContentObserver(r2, r1, r0)
            X.UyS<X.UCe> r0 = r8.LJLJL     // Catch: java.lang.Throwable -> L84
            X.6lL r7 = r0.iterator()     // Catch: java.lang.Throwable -> L84
        L3f:
            r8.LJLJI = r3     // Catch: java.lang.Throwable -> L86
            r8.LJLIL = r7     // Catch: java.lang.Throwable -> L86
            r8.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r9 = r7.LIZ(r8)     // Catch: java.lang.Throwable -> L86
            if (r9 != r6) goto L4c
            goto L83
        L4c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L81
            boolean r0 = r9.booleanValue()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L77
            r7.next()     // Catch: java.lang.Throwable -> L81
            android.content.Context r0 = r8.LJLJLJ     // Catch: java.lang.Throwable -> L81
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "animator_duration_scale"
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = android.provider.Settings.Global.getFloat(r2, r1, r0)     // Catch: java.lang.Throwable -> L81
            java.lang.Float r0 = new java.lang.Float     // Catch: java.lang.Throwable -> L81
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L81
            r8.LJLJI = r3     // Catch: java.lang.Throwable -> L81
            r8.LJLIL = r7     // Catch: java.lang.Throwable -> L81
            r8.LJLILLLLZI = r5     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r3.emit(r0, r8)     // Catch: java.lang.Throwable -> L81
            if (r0 != r6) goto L3f
            return r6
        L77:
            android.content.ContentResolver r1 = r8.LJLJJI
            X.05J r0 = r8.LJLJJLL
            r1.unregisterContentObserver(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L81:
            r2 = move-exception
            goto L87
        L83:
            return r6
        L84:
            r2 = move-exception
            goto L87
        L86:
            r2 = move-exception
        L87:
            android.content.ContentResolver r1 = r8.LJLJJI
            X.05J r0 = r8.LJLJJLL
            r1.unregisterContentObserver(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C537429a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super Float> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
