package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OjO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62714OjO implements InterfaceC62733Ojh {
    public final String LIZ;

    @Override // X.InterfaceC62733Ojh
    public final int LIZ(C78963Uyt typeFactory) {
        o.LJIIIZ(typeFactory, "typeFactory");
        return R.layout.bma;
    }

    @Override // X.InterfaceC62733Ojh
    public final C5D4 LIZLLL() {
        return new C5D4("", this.LIZ);
    }

    public C62714OjO(String coverUrl) {
        o.LJIIIZ(coverUrl, "coverUrl");
        this.LIZ = coverUrl;
    }
}
