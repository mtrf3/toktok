package X;

import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.topbar.Video2StickerTopBarComponent$nextBeforeCheckStatus$2", f = "Video2StickerTopBarComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5lJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144215lJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C144245lM LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144215lJ(C144245lM c144245lM, InterfaceC67352kd<? super C144215lJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c144245lM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C144215lJ(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C78920UyC.LIZLLL(R.string.im9, this.LJLIL.getActivity(), 1034);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
