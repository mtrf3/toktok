package X;

import android.content.Context;
import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Hpw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45284Hpw implements InterfaceC83472WpQ, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final Context LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;

    static {
        TBT tbt = new TBT(C45284Hpw.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C45284Hpw.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC83472WpQ
    public final String LIZIZ() {
        return "text_apply";
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public C45284Hpw(Context context, C82622Wbi diContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = context;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = C221108m2.LIZIZ(C45286Hpy.LJLIL);
        this.LJLJJI = UCI.LJI(diContainer, InterfaceC142515iZ.class, null);
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C45241HpF r15, X.InterfaceC67352kd r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C45285Hpx
            if (r0 == 0) goto Lba
            r9 = r3
            X.Hpx r9 = (X.C45285Hpx) r9
            int r2 = r9.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lba
            int r2 = r2 - r1
            r9.LJLJJLL = r2
        L14:
            java.lang.Object r1 = r9.LJLJJI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJJLL
            r7 = 1
            r10 = 0
            java.lang.String r6 = "text_apply"
            if (r0 == 0) goto L5d
            if (r0 != r7) goto Lc1
            long r2 = r9.LJLJI
            X.HpF r15 = r9.LJLILLLLZI
            X.Hpw r0 = r9.LJLIL
            X.C141335gf.LIZJ(r1)
        L2b:
            r0.getClass()
            X.C83412WoS.LIZIZ(r6, r7)
            X.Woj r4 = new X.Woj
            X.Ol8 r0 = r0.LJLJI
            java.lang.Object r5 = r0.getValue()
            r6 = 0
            java.lang.String r7 = "Successfully add a Text."
            if (r15 == 0) goto L43
            boolean r0 = r15.LIZJ
            if (r0 == 0) goto L5b
        L43:
            r8 = 1
        L44:
            X.HpA r10 = X.EnumC45236HpA.SUCCESS
            X.Hpd r12 = new X.Hpd
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r12.<init>(r0)
            r13 = 82
            r9 = r6
            r11 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.C3C5.m7constructorimpl(r4)
            return r4
        L5b:
            r8 = 0
            goto L44
        L5d:
            X.C141335gf.LIZJ(r1)
            X.C83412WoS.LIZLLL(r6)
            long r2 = java.lang.System.currentTimeMillis()
            r5 = 0
            if (r15 == 0) goto L8c
            T r0 = r15.LIZ
            com.ss.android.ugc.aweme.actionai.action.data.ActionAITextData r0 = (com.ss.android.ugc.aweme.actionai.action.data.ActionAITextData) r0
            if (r0 == 0) goto L8c
            java.util.List r1 = r0.getTextResult()
            if (r1 == 0) goto L8c
            java.lang.Integer r0 = r15.LIZIZ
            if (r0 == 0) goto L9e
            int r0 = r0.intValue()
        L7e:
            java.lang.Object r4 = X.ORZ.LJLLLLLL(r0, r1)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L8c
            int r0 = r4.length()
            if (r0 != 0) goto La0
        L8c:
            X.C83412WoS.LIZIZ(r6, r10)
            X.Hpz r1 = new X.Hpz
            java.lang.String r0 = "TextApplyAction Error: the select text is empty or null!"
            r1.<init>(r0)
            X.3C4 r0 = X.C141335gf.LIZ(r1)
            X.C3C5.m7constructorimpl(r0)
            return r0
        L9e:
            r0 = 0
            goto L7e
        La0:
            X.UtN r1 = X.C36636EZk.LIZ
            X.5aH r0 = new X.5aH
            r0.<init>(r14, r4, r5)
            r9.LJLIL = r14
            r9.LJLILLLLZI = r15
            r9.LJLJI = r2
            r9.LJLJJLL = r7
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r9)
            if (r0 != r8) goto Lb7
            return r8
        Lb7:
            r0 = r14
            goto L2b
        Lba:
            X.Hpx r9 = new X.Hpx
            r9.<init>(r14, r3)
            goto L14
        Lc1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45284Hpw.LIZJ(X.HpF, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC83472WpQ
    public final /* bridge */ /* synthetic */ Object LIZ(ExecutionContext executionContext, ActionExecuteCallback actionExecuteCallback, Object obj, InterfaceC67352kd interfaceC67352kd) {
        return LIZJ((C45241HpF) obj, interfaceC67352kd);
    }
}
