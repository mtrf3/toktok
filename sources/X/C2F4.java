package X;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.core.utils.LoadImageUtil$loadRoundImage$1", f = "LoadImageUtil.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "invokeSuspend")
/* renamed from: X.2F4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2F4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C17190lv LJLJI;
    public final /* synthetic */ InterfaceC75158Tec LJLJJI;
    public final /* synthetic */ ImageModel LJLJJL;
    public final /* synthetic */ ImageView LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2F4(int i, C17190lv c17190lv, InterfaceC75158Tec interfaceC75158Tec, ImageModel imageModel, ImageView imageView, InterfaceC67352kd<? super C2F4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = c17190lv;
        this.LJLJJI = interfaceC75158Tec;
        this.LJLJJL = imageModel;
        this.LJLJJLL = imageView;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2F4(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLIL
            r0 = 1
            if (r1 == 0) goto L13
            if (r1 != r0) goto L2b
            X.C141335gf.LIZJ(r6)
        Lc:
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            if (r6 != 0) goto L33
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L13:
            X.C141335gf.LIZJ(r6)
            int r3 = r5.LJLILLLLZI
            if (r3 <= 0) goto L37
            r5.LJLIL = r0
            X.XIA r2 = X.C78613UtF.LIZJ
            X.2hg r1 = new X.2hg
            r0 = 0
            r1.<init>(r3, r0)
            java.lang.Object r6 = X.XKX.LJI(r2, r1, r5)
            if (r6 != r4) goto Lc
            return r4
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.0lv r0 = r5.LJLJI
            r0.LJII = r6
        L37:
            X.Tec r3 = r5.LJLJJI
            if (r3 == 0) goto L46
            X.0lv r2 = r5.LJLJI
            X.1UQ r1 = new X.1UQ
            com.bytedance.android.live.base.model.ImageModel r0 = r5.LJLJJL
            r1.<init>(r0, r3)
            r2.LIZLLL = r1
        L46:
            X.0lv r1 = r5.LJLJI
            android.widget.ImageView r0 = r5.LJLJJLL
            r1.LIZJ(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2F4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
