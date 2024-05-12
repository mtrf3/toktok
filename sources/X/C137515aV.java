package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$fetchVoiceEffectList$1", f = "TTSPanelUIComponent.kt", l = {953, 954, 956}, m = "invokeSuspend")
/* renamed from: X.5aV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137515aV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C138075bP LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ TextStickerData LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137515aV(C138075bP c138075bP, boolean z, TextStickerData textStickerData, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C137515aV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c138075bP;
        this.LJLJJI = z;
        this.LJLJJL = textStickerData;
        this.LJLJJLL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C137515aV c137515aV = new C137515aV(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c137515aV.LJLILLLLZI = obj;
        return c137515aV;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            r3 = 3
            r7 = 2
            r6 = 1
            r10 = 0
            if (r0 == 0) goto L1b
            if (r0 == r6) goto L48
            if (r0 == r7) goto L5e
            if (r0 != r3) goto L80
            X.C141335gf.LIZJ(r12)
        L13:
            X.5bP r0 = r11.LJLJI
            r0.Mz(r10)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1b:
            X.C141335gf.LIZJ(r12)
            java.lang.Object r5 = r11.LJLILLLLZI
            X.2pa r5 = (X.InterfaceC70422pa) r5
            X.5bP r0 = r11.LJLJI
            r0.n00()
            X.5aW r1 = new X.5aW
            X.5bP r0 = r11.LJLJI
            r1.<init>(r0, r10)
            X.XKn r4 = X.XKX.LIZIZ(r5, r10, r10, r1, r3)
            X.5aU r1 = new X.5aU
            X.5bP r0 = r11.LJLJI
            r1.<init>(r0, r10)
            X.XKn r0 = X.XKX.LIZIZ(r5, r10, r10, r1, r3)
            r11.LJLILLLLZI = r0
            r11.LJLIL = r6
            java.lang.Object r12 = r4.LJJIJ(r11)
            if (r12 != r2) goto L4f
            return r2
        L48:
            java.lang.Object r0 = r11.LJLILLLLZI
            X.2mE r0 = (X.InterfaceC68342mE) r0
            X.C141335gf.LIZJ(r12)
        L4f:
            java.util.List r12 = (java.util.List) r12
            r11.LJLILLLLZI = r12
            r11.LJLIL = r7
            java.lang.Object r0 = r0.LJI(r11)
            if (r0 != r2) goto L5c
            return r2
        L5c:
            r5 = r12
            goto L65
        L5e:
            java.lang.Object r5 = r11.LJLILLLLZI
            java.util.List r5 = (java.util.List) r5
            X.C141335gf.LIZJ(r12)
        L65:
            X.UtN r0 = X.C36636EZk.LIZ
            X.5aX r4 = new X.5aX
            boolean r6 = r11.LJLJJI
            X.5bP r7 = r11.LJLJI
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r8 = r11.LJLJJL
            X.Pro<X.UCe> r9 = r11.LJLJJLL
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.LJLILLLLZI = r10
            r11.LJLIL = r3
            java.lang.Object r0 = X.XKX.LJI(r0, r4, r11)
            if (r0 != r2) goto L13
            return r2
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137515aV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
