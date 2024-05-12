package X;

import com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl;

/* renamed from: X.QEg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66662QEg {
    public C66662QEg(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        int ordinal = cronetEngineBuilderImpl.LJIIIZ.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
        } else {
            throw new IllegalArgumentException("Unknown internal builder cache mode");
        }
    }
}
