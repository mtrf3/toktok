package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem$resetDiggDrawableToDefault$1", f = "VideoDiggAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7nR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196497nR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ VideoDiggAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C196497nR(VideoDiggAssem videoDiggAssem, InterfaceC67352kd<? super C196497nR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoDiggAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C196497nR(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((C29701Eo) this.LJLIL.Y3().findViewById(R.id.c_r)).setImageDrawable(this.LJLIL.LLIIIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}