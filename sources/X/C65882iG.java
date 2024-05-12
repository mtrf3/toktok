package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment$refreshVideoCover$1$bitmap$1", f = "FTCVideoPublishFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2iG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65882iG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Bitmap>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65882iG(String str, InterfaceC67352kd<? super C65882iG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65882iG(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return BitmapFactory.decodeFile(this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
