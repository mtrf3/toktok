package X;

import com.bytedance.forest.Forest;

/* loaded from: classes11.dex */
public final class O4X extends AbstractC65781Prl implements InterfaceC65784Pro<O47> {
    public static final O4X LJLIL = new O4X();

    public O4X() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final O47 invoke() {
        int i;
        C61322O4w c61322O4w;
        C39857Fkb globalConfig = Forest.Companion.getGlobalConfig();
        if (globalConfig != null && (c61322O4w = globalConfig.LIZ) != null) {
            i = c61322O4w.LIZ;
        } else {
            i = 12582912;
        }
        return new O47(i);
    }
}
