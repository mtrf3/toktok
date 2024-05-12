package X;

import com.byted.cast.common.source.ServiceInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1GF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GF extends F9E {
    public final List<ServiceInfo> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C1GF(List<ServiceInfo> deviceList) {
        o.LJIIIZ(deviceList, "deviceList");
        this.LJLIL = deviceList;
    }
}
