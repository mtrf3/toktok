package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashSet;

/* renamed from: X.8Xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212938Xh extends AbstractC65781Prl implements InterfaceC65784Pro<C212948Xi> {
    public static final C212938Xh LJLIL = new C212938Xh();

    public C212938Xh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8Xi] */
    @Override // X.InterfaceC65784Pro
    public final C212948Xi invoke() {
        return new InterfaceC214448bI() { // from class: X.8Xi
            public final java.util.Set<AssemViewModel<?>> LIZ = new LinkedHashSet();

            @Override // X.InterfaceC214448bI
            public final java.util.Set<AssemViewModel<?>> LIZ() {
                return this.LIZ;
            }
        };
    }
}
