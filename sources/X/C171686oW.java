package X;

import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity$startCompressAndWait$1", f = "NLECutCompressActivity.kt", l = {134}, m = "invokeSuspend")
/* renamed from: X.6oW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171686oW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ CutSource LJLJI;
    public final /* synthetic */ NLECutCompressActivity LJLJJI;
    public final /* synthetic */ TemplateSourceConfig LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ C171856on LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C171686oW(CutSource cutSource, NLECutCompressActivity nLECutCompressActivity, TemplateSourceConfig templateSourceConfig, String str, C171856on c171856on, InterfaceC67352kd<? super C171686oW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = cutSource;
        this.LJLJJI = nLECutCompressActivity;
        this.LJLJJL = templateSourceConfig;
        this.LJLJJLL = str;
        this.LJLJL = c171856on;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C171686oW(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r6 = r12
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLILLLLZI
            r2 = 1
            r10 = 0
            if (r0 == 0) goto L55
            if (r0 != r2) goto Lc3
            long r7 = r11.LJLIL
            X.C141335gf.LIZJ(r6)
        L10:
            X.OSZ r6 = (X.OSZ) r6
        L12:
            if (r6 != 0) goto Lad
            com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity r0 = r11.LJLJJI
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L4f
            com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity r4 = r11.LJLJJI
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity r5 = r11.LJLJJI
            com.ss.android.ugc.cut_ui.CutSource r2 = r11.LJLJI
            java.lang.String r1 = r5.LJLJL
            java.lang.String r0 = "cut_compress_error"
            r3.putExtra(r0, r1)
            java.lang.String r1 = "cut_compress_code"
            int r0 = r5.LJLJJLL
            r3.putExtra(r1, r0)
            if (r2 != 0) goto L52
        L37:
            java.lang.String r0 = "cut_compress_source"
            r3.putExtra(r0, r10)
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r7
            java.lang.String r0 = "cut_compress_time"
            r3.putExtra(r0, r1)
            r0 = 0
            r4.setResult(r0, r3)
            com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity r0 = r11.LJLJJI
            r0.finish()
        L4f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L52:
            java.lang.String r10 = r2.value
            goto L37
        L55:
            X.C141335gf.LIZJ(r6)
            long r7 = android.os.SystemClock.uptimeMillis()
            com.ss.android.ugc.cut_ui.CutSource r6 = r11.LJLJI
            if (r6 != 0) goto L62
            r6 = r10
            goto L12
        L62:
            com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig r0 = r11.LJLJJL
            com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity r5 = r11.LJLJJI
            java.lang.String r1 = r11.LJLJJLL
            if (r0 != 0) goto L6c
            r6 = r10
            goto L12
        L6c:
            r11.LJLIL = r7
            r11.LJLILLLLZI = r2
            r5.getClass()
            X.XKS r3 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r11)
            r3.<init>(r2, r0)
            com.bytedance.ies.cutsame.cut_android.NLETemplateSource r2 = new com.bytedance.ies.cutsame.cut_android.NLETemplateSource
            r2.<init>(r5, r6, r1)
            X.Wfo r1 = new X.Wfo
            X.Wfh r0 = new X.Wfh
            r0.<init>(r5)
            r1.<init>(r0)
            r2.LJ(r1)
            X.HpI r1 = X.C45244HpI.LIZ
            X.6qF r0 = X.EnumC172756qF.CUTSAME
            com.bytedance.ies.nle.editor_jni.NLEModelDownloader r0 = r1.LIZ(r0)
            r2.LJI(r0)
            X.5Ub r0 = new X.5Ub
            r0.<init>()
            r2.LIZ(r0)
            r2.LIZJ()
            r5.LJLL = r2
            java.lang.Object r6 = r3.LJIIJJI()
            if (r6 != r4) goto L10
            return r4
        Lad:
            X.34l r2 = X.C780334l.LJLIL
            X.XIA r1 = X.C78613UtF.LIZJ
            X.6oV r3 = new X.6oV
            X.6on r4 = r11.LJLJL
            com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity r5 = r11.LJLJJI
            com.ss.android.ugc.cut_ui.CutSource r9 = r11.LJLJI
            r3.<init>(r4, r5, r6, r7, r9, r10)
            r0 = 2
            X.XKX.LIZLLL(r2, r1, r10, r3, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lc3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C171686oW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
