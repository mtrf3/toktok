package X;

import android.graphics.Bitmap;
import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$onCompleted$1", f = "VideoFrameCache.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Dd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131255Dd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C131235Db LJLIL;
    public final /* synthetic */ C5DY LJLILLLLZI;
    public final /* synthetic */ Bitmap LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131255Dd(C131235Db c131235Db, C5DY c5dy, Bitmap bitmap, InterfaceC67352kd<? super C131255Dd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c131235Db;
        this.LJLILLLLZI = c5dy;
        this.LJLJI = bitmap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131255Dd(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List LLJI;
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLJJI.LIZLLL(this.LJLILLLLZI, this.LJLJI);
        this.LJLIL.LJII(this.LJLILLLLZI, this.LJLJI);
        C131235Db c131235Db = this.LJLIL;
        synchronized (c131235Db.LJLJJL) {
            LLJI = ORZ.LLJI(c131235Db.LJLJJL);
        }
        C5DY c5dy = this.LJLILLLLZI;
        Iterator it = LLJI.iterator();
        while (it.hasNext()) {
            ((InterfaceC131385Dq) it.next()).LIZIZ(c5dy);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
