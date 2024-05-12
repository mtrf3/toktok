package X;

import com.ss.android.vesdk.VERecorder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.WwK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83900WwK implements HJ0 {
    public final CopyOnWriteArrayList<HJ0> LJLIL;
    public final VERecorder LJLILLLLZI;
    public final boolean LJLJI;
    public final InterfaceC65784Pro<Boolean> LJLJJI;

    public C83900WwK(VERecorder recorder, boolean z, InterfaceC65784Pro<Boolean> interceptCallback) {
        o.LJIIIZ(recorder, "recorder");
        o.LJIIIZ(interceptCallback, "interceptCallback");
        this.LJLILLLLZI = recorder;
        this.LJLJI = z;
        this.LJLJJI = interceptCallback;
        this.LJLIL = new CopyOnWriteArrayList<>();
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        if (this.LJLJJI.invoke().booleanValue()) {
            return;
        }
        Iterator<HJ0> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZ(i, i2, f, str);
        }
    }
}
