package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.frame.Cache$getNoCacheTaskOld$2", f = "VideoFrameCache.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131315Dj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<C1290754t>>, Object> {
    public final /* synthetic */ C5E0 LJLIL;
    public final /* synthetic */ List<C5E1> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131315Dj(C5E0 c5e0, List<C5E1> list, InterfaceC67352kd<? super C131315Dj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c5e0;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131315Dj(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return this.LJLIL.LIZJ(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<C1290754t>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
