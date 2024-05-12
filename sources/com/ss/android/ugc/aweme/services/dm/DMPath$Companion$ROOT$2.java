package com.ss.android.ugc.aweme.services.dm;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import X.X1D;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMPath$Companion$ROOT$2 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final DMPath$Companion$ROOT$2 INSTANCE = new DMPath$Companion$ROOT$2();

    public DMPath$Companion$ROOT$2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        String absolutePath = DMPublishService.INSTANCE.getCreativeToolsRootDir().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "DMPublishService.getCrea…olsRootDir().absolutePath");
        LIZ.append(DMPathKt.ensureSeparatorSuffix(absolutePath));
        LIZ.append("dm");
        LIZ.append(File.separator);
        return X1D.LIZIZ(LIZ);
    }
}
