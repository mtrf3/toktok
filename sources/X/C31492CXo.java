package X;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.CXo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31492CXo implements InterfaceC17150lr {
    public final InterfaceC17150lr LIZ;
    public final int LIZIZ;
    public final InterfaceC31491CXn LIZJ;
    public LiveWidget LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC17150lr
    public final CharSequence LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC17150lr
    public final LiveWidget LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C31492CXo(InterfaceC17150lr displaySourceOption, int i, InterfaceC31491CXn l) {
        o.LJIIIZ(displaySourceOption, "displaySourceOption");
        o.LJIIIZ(l, "l");
        this.LIZ = displaySourceOption;
        this.LIZIZ = i;
        this.LIZJ = l;
    }
}
