package X;

import com.ss.android.legoapi.abtest.IABLegoTaskApi;
import com.ss.android.legoimpl.ABLegoTaskImpl;

/* renamed from: X.FFj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38663FFj implements IABLegoTaskApi {
    public static final C38663FFj LIZIZ = new C38663FFj();
    public final /* synthetic */ IABLegoTaskApi LIZ;

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final EE1 LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final EE1 LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final EE1 LIZJ() {
        return this.LIZ.LIZJ();
    }

    public C38663FFj() {
        IABLegoTaskApi iABLegoTaskApi;
        Object LIZ = C58096Mr6.LIZ(IABLegoTaskApi.class, false);
        if (LIZ != null) {
            iABLegoTaskApi = (IABLegoTaskApi) LIZ;
        } else {
            if (C58096Mr6.LJJJJLI == null) {
                synchronized (IABLegoTaskApi.class) {
                    if (C58096Mr6.LJJJJLI == null) {
                        C58096Mr6.LJJJJLI = new ABLegoTaskImpl();
                    }
                }
            }
            iABLegoTaskApi = C58096Mr6.LJJJJLI;
        }
        this.LIZ = iABLegoTaskApi;
    }
}
