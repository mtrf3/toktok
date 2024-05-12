package X;

import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import kotlin.jvm.internal.o;

/* renamed from: X.9Aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232459Aj extends F9E implements InterfaceC87283bg {
    public final int LJLIL;
    public final ProfileComponents LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C232459Aj(int i, ProfileComponents data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = i;
        this.LJLILLLLZI = data;
    }
}
