package X;

import android.content.Context;

/* loaded from: classes8.dex */
public final class H4R extends AbstractC65781Prl implements InterfaceC65784Pro<Context> {
    public static final H4R INSTANCE = new H4R();

    public H4R() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Context invoke() {
        Context LLLLJI = C16880lQ.LLLLJI(C60903NvH.LJ);
        if (LLLLJI != null) {
            return LLLLJI;
        }
        "CreativeTools Context is initialized, maybe call watermark composer too early".toString();
        throw new IllegalArgumentException("CreativeTools Context is initialized, maybe call watermark composer too early");
    }
}
