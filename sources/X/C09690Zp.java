package X;

import com.bytedance.android.livesdkapi.host.IHostConfig;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0Zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09690Zp {
    public final java.util.Map<EnumC30736C4m, List<A76>> LIZ = new HashMap();
    public final java.util.Map<EnumC31730Cco, List<A76>> LIZIZ = new HashMap();
    public final java.util.Map<EnumC30736C4m, InterfaceC31722Ccg> LIZJ = new HashMap();
    public final java.util.Map<String, A76> LIZLLL = new HashMap();
    public final java.util.Map<String, InterfaceC31722Ccg> LJ = new HashMap();
    public volatile boolean LJFF = false;

    public final void LIZ() {
        if (!this.LJFF) {
            ((IHostConfig) CN1.LIZ(IHostConfig.class)).EB();
        }
        this.LJFF = true;
    }
}
