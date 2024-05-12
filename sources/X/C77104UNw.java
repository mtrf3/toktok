package X;

import android.widget.TextView;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.v2.CaptionAdapter$captionTextAnimation$1$1", f = "CaptionAdapter.kt", l = {154}, m = "invokeSuspend")
/* renamed from: X.UNw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77104UNw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C77107UNz LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C77107UNz LJLJI;
    public final /* synthetic */ UO1 LJLJJI;
    public final /* synthetic */ C77105UNx LJLJJL;
    public final /* synthetic */ C76732zl LJLJJLL;
    public final /* synthetic */ C77103UNv LJLJL;
    public final /* synthetic */ StringBuilder LJLJLJ;
    public final /* synthetic */ TextView LJLJLLL;
    public final /* synthetic */ StringBuilder LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77104UNw(C77107UNz c77107UNz, UO1 uo1, C77105UNx c77105UNx, C76732zl c76732zl, C77103UNv c77103UNv, StringBuilder sb, TextView textView, StringBuilder sb2, InterfaceC67352kd<? super C77104UNw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c77107UNz;
        this.LJLJJI = uo1;
        this.LJLJJL = c77105UNx;
        this.LJLJJLL = c76732zl;
        this.LJLJL = c77103UNv;
        this.LJLJLJ = sb;
        this.LJLJLLL = textView;
        this.LJLL = sb2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77104UNw(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x000f, code lost:
    
        if (r5 != null) goto L37;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLILLLLZI
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L7e
            X.UNz r5 = r10.LJLIL
            X.C141335gf.LIZJ(r11)
        Lf:
            X.UO1 r0 = r10.LJLJJI
            long r7 = r0.LIZJ()
            long r0 = r5.LIZIZ
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 >= 0) goto L33
            X.UO1 r6 = r10.LJLJJI
            long r6 = r6.LIZJ()
            long r0 = r0 - r6
            r10.LJLIL = r5
            r10.LJLILLLLZI = r2
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r10)
            if (r0 != r3) goto Lf
            return r3
        L2d:
            X.C141335gf.LIZJ(r11)
            X.UNz r5 = r10.LJLJI
            goto L7b
        L33:
            X.UNx r6 = r10.LJLJJL
            X.UO1 r0 = r10.LJLJJI
            long r0 = r0.LIZJ()
            r6.LIZIZ(r0)
            X.2zl r9 = r10.LJLJJLL
            X.UNx r1 = r10.LJLJJL
            int r0 = r1.LJ
            r9.element = r0
            X.UNz r0 = r1.LJI
            if (r0 == 0) goto L72
            X.UNv r8 = r10.LJLJL
            java.lang.StringBuilder r7 = r10.LJLL
            android.widget.TextView r6 = r10.LJLJLLL
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = " "
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L72
            int r1 = r9.element
            r8.getClass()
            if (r1 < 0) goto L67
            int r0 = r7.length()
            if (r1 <= r0) goto L6b
        L67:
            int r1 = r7.length()
        L6b:
            java.lang.CharSequence r0 = r7.subSequence(r4, r1)
            r6.setText(r0)
        L72:
            X.UNv r0 = r10.LJLJL
            r0.LJLZ(r5)
            X.UNx r0 = r10.LJLJJL
            X.UNz r5 = r0.LJFF
        L7b:
            if (r5 == 0) goto L86
            goto Lf
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L86:
            X.UNv r3 = r10.LJLJL
            java.lang.StringBuilder r2 = r10.LJLJLJ
            android.widget.TextView r1 = r10.LJLJLLL
            int r0 = r2.length()
            r3.getClass()
            java.lang.CharSequence r0 = r2.subSequence(r4, r0)
            r1.setText(r0)
            X.UNv r1 = r10.LJLJL
            X.UNx r0 = r10.LJLJJL
            r1.LJLLLLLL(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77104UNw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
