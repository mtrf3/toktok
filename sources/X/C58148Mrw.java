package X;

import com.bytedance.ies.android.base.runtime.IDependOutService;
import com.ss.android.ugc.aweme.commercialize.runtime.DependOutServiceImpl;

/* renamed from: X.Mrw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58148Mrw extends AbstractC65781Prl implements InterfaceC65784Pro<C59836Ne4> {
    public static final C58148Mrw LJLIL = new C58148Mrw();

    public C58148Mrw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C59836Ne4 invoke() {
        IDependOutService dependOutServiceImpl;
        Object LIZ = C58096Mr6.LIZ(IDependOutService.class, false);
        if (LIZ != null) {
            dependOutServiceImpl = (IDependOutService) LIZ;
        } else {
            dependOutServiceImpl = new DependOutServiceImpl();
        }
        return dependOutServiceImpl.LIZ();
    }
}
