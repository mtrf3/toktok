package X;

import android.graphics.drawable.Drawable;
import fjb.a;

@InterfaceC65848Psq(c = "live.ss.android.common.util.UtilityKotlinExtentionsKt$getDrawableInBackground$2", f = "UtilityKotlinExtentions.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65522hg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Drawable>, Object> {
    public final /* synthetic */ int LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65522hg(int i, InterfaceC67352kd<? super C65522hg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65522hg(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C15380j0.LJI(this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Drawable> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
