package X;

import com.bytedance.pia.core.setting.Settings;

/* renamed from: X.EmF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37411EmF extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends Boolean>> {
    public final /* synthetic */ Settings LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37411EmF(Settings settings) {
        super(0);
        this.LJLIL = settings;
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends Boolean> invoke() {
        return C113554cx.LJJL(new OSZ("main", Boolean.valueOf(this.LJLIL.isPiaEnabled)), new OSZ("boot", Boolean.valueOf(this.LJLIL.isBootEnabled)), new OSZ("worker", Boolean.valueOf(this.LJLIL.isWorkerEnabled)), new OSZ("cache", Boolean.valueOf(this.LJLIL.isCacheEnabled)));
    }
}
