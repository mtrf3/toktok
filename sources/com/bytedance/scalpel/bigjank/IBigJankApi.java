package com.bytedance.scalpel.bigjank;

import X.AbstractC73672Svk;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.InterfaceC195727mC;
import X.InterfaceC195767mG;
import X.R2S;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;

/* loaded from: classes12.dex */
public interface IBigJankApi {
    public static final R2S LIZ = R2S.LIZIZ;

    @E8M("/explore/api/v1/bigJank")
    AbstractC73672Svk<String> reportBigJank(@InterfaceC195727mC TypedOutput typedOutput, @ENW int i, @InterfaceC195767mG List<EJ6> list);
}
