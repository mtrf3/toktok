package X;

import com.ss.android.legoapi.freso.IFrescoLegoTaskApi;
import com.ss.android.ugc.aweme.legoImpl.FrescoLegoTaskImpl;

/* renamed from: X.FFk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38664FFk implements IFrescoLegoTaskApi {
    public static final C38664FFk LIZIZ = new C38664FFk();
    public final /* synthetic */ IFrescoLegoTaskApi LIZ;

    @Override // com.ss.android.legoapi.freso.IFrescoLegoTaskApi
    public final EE1 LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.legoapi.freso.IFrescoLegoTaskApi
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    public C38664FFk() {
        IFrescoLegoTaskApi iFrescoLegoTaskApi;
        Object LIZ = C58096Mr6.LIZ(IFrescoLegoTaskApi.class, false);
        if (LIZ != null) {
            iFrescoLegoTaskApi = (IFrescoLegoTaskApi) LIZ;
        } else {
            if (C58096Mr6.p2 == null) {
                synchronized (IFrescoLegoTaskApi.class) {
                    if (C58096Mr6.p2 == null) {
                        C58096Mr6.p2 = new FrescoLegoTaskImpl();
                    }
                }
            }
            iFrescoLegoTaskApi = C58096Mr6.p2;
        }
        this.LIZ = iFrescoLegoTaskApi;
    }
}
