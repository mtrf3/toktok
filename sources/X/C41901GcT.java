package X;

import Y.IDeS360S0100000_1;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.StreamEditUploadFrameTask$decodeFrameList$2$1$1", f = "StreamEditUploadFrameTask.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GcT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41901GcT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC153045zY, InterfaceC67352kd<? super InterfaceC65462ha<? extends List<? extends String>>>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C41906GcY LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41901GcT(C41906GcY c41906GcY, InterfaceC67352kd<? super C41901GcT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c41906GcY;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41901GcT c41901GcT = new C41901GcT(this.LJLILLLLZI, interfaceC67352kd);
        c41901GcT.LJLIL = obj;
        return c41901GcT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) this.LJLIL;
        this.LJLILLLLZI.LJIIJJI = interfaceC153045zY.getDuration();
        C41906GcY c41906GcY = this.LJLILLLLZI;
        int duration = interfaceC153045zY.getDuration();
        this.LJLILLLLZI.getClass();
        int[] LIZ = C41904GcW.LIZ(0, duration, AbstractC41925Gcr.LJ());
        c41906GcY.getClass();
        if (LIZ == null || LIZ.length == 0) {
            return new IDeS360S0100000_1(C61878OQg.INSTANCE, 10);
        }
        return V1M.LJFF(new C41900GcS(interfaceC153045zY, LIZ, c41906GcY, null));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC153045zY interfaceC153045zY, InterfaceC67352kd<? super InterfaceC65462ha<? extends List<? extends String>>> interfaceC67352kd) {
        return ((a) create(interfaceC153045zY, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
