package X;

import java.io.File;

/* renamed from: X.GgK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42140GgK extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C42140GgK LJLIL = new C42140GgK();

    public C42140GgK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String LJJIJIIJI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIJIIJI();
        File LIZJ = C60903NvH.LJIIJJI().LJJIJL().getFileProvider().LIZJ(LJJIJIIJI);
        if (!LIZJ.exists() && !LIZJ.mkdirs()) {
            H78.LIZLLL("EndingWatermarkConfig", new Throwable("create watermark resource root dir failed!"));
        }
        return LJJIJIIJI;
    }
}
