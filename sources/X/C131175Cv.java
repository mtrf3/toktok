package X;

import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$removeRequest$1", f = "VideoFrameCache.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Cv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131175Cv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C131235Db LJLIL;
    public final /* synthetic */ InterfaceC131385Dq LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131175Cv(C131235Db c131235Db, InterfaceC131385Dq interfaceC131385Dq, InterfaceC67352kd<? super C131175Cv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c131235Db;
        this.LJLILLLLZI = interfaceC131385Dq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131175Cv(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C131235Db c131235Db = this.LJLIL;
        List<InterfaceC131385Dq> list = c131235Db.LJLJJL;
        InterfaceC131385Dq interfaceC131385Dq = this.LJLILLLLZI;
        synchronized (list) {
            ((ArrayList) c131235Db.LJLJJL).remove(interfaceC131385Dq);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
