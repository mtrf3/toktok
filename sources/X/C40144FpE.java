package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl;
import com.ss.android.ugc.aweme.hybridkit.IHybridKitService;
import kotlin.jvm.internal.o;

/* renamed from: X.FpE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40144FpE implements IHybridKitService {
    public static final C40144FpE LIZIZ = new C40144FpE();
    public final /* synthetic */ IHybridKitService LIZ = HybridKitTaskImpl.LJIIJJI();

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final boolean LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final boolean LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final boolean LIZJ(String str) {
        return this.LIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LIZLLL(Context context, String url, String str, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        this.LIZ.LIZLLL(context, url, str, bundle);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final InterfaceC60814Ntq LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final EE1 LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final boolean LJI(String str, String str2, boolean z) {
        return this.LIZ.LJI(str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LJII() {
        this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final EE1 LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LJIIIZ(Context context, String str) {
        this.LIZ.LJIIIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final EE1 LJIIJ() {
        return this.LIZ.LJIIJ();
    }
}
