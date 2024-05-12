package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.CpR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32513CpR<T> implements InterfaceC32548Cq0 {
    public final InterfaceC32521CpZ<T> LIZ;
    public boolean LIZIZ;

    public C32513CpR(InterfaceC32521CpZ<T> observer) {
        o.LJIIIZ(observer, "observer");
        this.LIZ = observer;
        this.LIZIZ = true;
    }

    @Override // X.InterfaceC32548Cq0
    public void LIZ(C32543Cpv stateManager, EnumC32542Cpu event) {
        o.LJIIIZ(stateManager, "stateManager");
        o.LJIIIZ(event, "event");
        if (stateManager.LIZ == EnumC32545Cpx.END) {
            this.LIZIZ = false;
            C32543Cpv.LIZIZ("addObserver");
            ((ArrayList) stateManager.LIZIZ).remove(this);
        }
    }
}
