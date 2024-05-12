package X;

import android.graphics.drawable.Drawable;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.uikit.remoteimage.GeckoRemoteImage$loader$1$start$1$1", f = "GeckoRemoteImage.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BZo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28996BZo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Drawable>, Object> {
    public final /* synthetic */ C28998BZq LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28996BZo(C28998BZq c28998BZq, InterfaceC67352kd<? super C28996BZo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c28998BZq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28996BZo(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C28998BZq c28998BZq = this.LJLIL;
        return C15490jB.LIZ(c28998BZq.LIZLLL, c28998BZq.LJ);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Drawable> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
