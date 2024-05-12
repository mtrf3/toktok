package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UOT extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final EnumC30639C0t LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public UOT(EnumC30639C0t resourceType) {
        o.LJIIIZ(resourceType, "resourceType");
        this.LJLIL = "tiktok_live_watch_resource_normal_1";
        this.LJLILLLLZI = "poll_start.zip";
        this.LJLJI = "poll_over.zip";
        this.LJLJJI = resourceType;
    }
}
