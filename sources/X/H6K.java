package X;

import com.ss.android.ugc.aweme.publish.core.upload.SmartSliceModel;

/* loaded from: classes8.dex */
public final class H6K extends AbstractC65781Prl implements InterfaceC65784Pro<J30> {
    public static final H6K LJLIL = new H6K();

    public H6K() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final J30 invoke() {
        C43391H1f.LIZ.getClass();
        SmartSliceModel LIZ = C43391H1f.LIZ();
        if (LIZ != null) {
            return new J30(new H6L(LIZ));
        }
        return null;
    }
}
