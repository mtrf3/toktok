package X;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1Q2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Q2 implements InterfaceC12670ed {
    public static final C1Q2 LIZ = new C1Q2();
    public static final ArrayList<InterfaceC12670ed> LIZIZ = new ArrayList<>();

    @Override // X.InterfaceC12670ed
    public final void LIZIZ() {
        Iterator<InterfaceC12670ed> it = LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
    }

    @Override // X.InterfaceC12670ed
    public final void LIZJ() {
        Iterator<InterfaceC12670ed> it = LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ();
        }
        C29306Beo.LJJIJIIJI(C20D.LJLIL, LIZIZ);
    }

    @Override // X.InterfaceC12670ed
    public final void LIZLLL() {
        Iterator<InterfaceC12670ed> it = LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
    }

    @Override // X.InterfaceC12670ed
    public final EnumC12660ec LJI() {
        return EnumC12660ec.LONG_TERM;
    }

    @Override // X.InterfaceC12670ed
    public final void LJ(boolean z) {
        Iterator<InterfaceC12670ed> it = LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJ(z);
        }
        ArrayList<InterfaceC12670ed> arrayList = LIZIZ;
        C29306Beo.LJJIJIIJI(C20E.LJLIL, arrayList);
        if (!z) {
            C29306Beo.LJJIJIIJI(C20F.LJLIL, arrayList);
        }
    }

    @Override // X.InterfaceC12670ed
    public final void LJFF(boolean z) {
        Iterator<InterfaceC12670ed> it = LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJFF(z);
        }
    }

    @Override // X.InterfaceC12670ed
    public final void LIZ(Fragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        Iterator<InterfaceC12670ed> it = LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(fragment, dataChannel);
        }
    }

    @Override // X.InterfaceC12670ed
    public final void LJII(Fragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        Iterator<InterfaceC12670ed> it = LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJII(fragment, dataChannel);
        }
    }
}
