package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.translate.AutoTranslateTextView$setText$1", f = "AutoTranslateTextView.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40, 44, 47, LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "invokeSuspend")
/* renamed from: X.2wm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74882wm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CharSequence LJLILLLLZI;
    public final /* synthetic */ C74902wo LJLJI;
    public final /* synthetic */ TextView.BufferType LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74882wm(TextView.BufferType bufferType, C74902wo c74902wo, CharSequence charSequence, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = charSequence;
        this.LJLJI = c74902wo;
        this.LJLJJI = bufferType;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        CharSequence charSequence = this.LJLILLLLZI;
        return new C74882wm(this.LJLJJI, this.LJLJI, charSequence, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            r6 = 4
            r8 = 3
            r9 = 2
            r5 = 0
            r10 = 1
            if (r0 == 0) goto L19
            if (r0 == r10) goto L13
            if (r0 == r9) goto L4e
            if (r0 == r8) goto L62
            if (r0 != r6) goto L91
        L13:
            X.C141335gf.LIZJ(r12)
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.C141335gf.LIZJ(r12)
            java.lang.CharSequence r0 = r11.LJLILLLLZI
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "key"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = X.C74862wk.LIZIZ
            java.lang.Object r7 = r0.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L37
            boolean r0 = ujb.o.LJJJJJL(r7)
            if (r0 == 0) goto L7c
        L37:
        L38:
            X.UtN r7 = X.C36636EZk.LIZ
            X.2wq r3 = new X.2wq
            X.2wo r2 = r11.LJLJI
            java.lang.CharSequence r1 = r11.LJLILLLLZI
            android.widget.TextView$BufferType r0 = r11.LJLJJI
            r3.<init>(r0, r2, r1, r5)
            r11.LJLIL = r9
            java.lang.Object r0 = X.XKX.LJI(r7, r3, r11)
            if (r0 != r4) goto L51
            return r4
        L4e:
            X.C141335gf.LIZJ(r12)
        L51:
            X.2wk r1 = X.C74862wk.LIZ
            java.lang.CharSequence r0 = r11.LJLILLLLZI
            java.lang.String r0 = r0.toString()
            r11.LJLIL = r8
            java.lang.Object r12 = r1.LIZ(r0, r11)
            if (r12 != r4) goto L65
            return r4
        L62:
            X.C141335gf.LIZJ(r12)
        L65:
            java.lang.String r12 = (java.lang.String) r12
            X.UtN r3 = X.C36636EZk.LIZ
            X.2wp r2 = new X.2wp
            X.2wo r1 = r11.LJLJI
            android.widget.TextView$BufferType r0 = r11.LJLJJI
            r2.<init>(r1, r12, r0, r5)
            r11.LJLIL = r6
            java.lang.Object r0 = X.XKX.LJI(r3, r2, r11)
            if (r0 != r4) goto L16
            return r4
        L7c:
            X.UtN r3 = X.C36636EZk.LIZ
            X.2wn r2 = new X.2wn
            X.2wo r1 = r11.LJLJI
            android.widget.TextView$BufferType r0 = r11.LJLJJI
            r2.<init>(r1, r7, r0, r5)
            r11.LJLIL = r10
            java.lang.Object r0 = X.XKX.LJI(r3, r2, r11)
            if (r0 != r4) goto L16
            return r4
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74882wm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
