package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VkW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80620VkW extends F9E {
    public final Object LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C80620VkW(Object rawData, String displayName) {
        o.LJIIIZ(rawData, "rawData");
        o.LJIIIZ(displayName, "displayName");
        this.LJLIL = rawData;
        this.LJLILLLLZI = displayName;
    }
}
