package X;

import android.content.Context;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC85929Xnx extends C25860ACy implements InterfaceC85949XoH {
    public final PushItem LJLJJL;

    public void LJ(Context context) {
    }

    public final C2068389v LJIILJJIL() {
        if (this.LJLJJL.display.LIZ()) {
            return C85926Xnu.LIZLLL(this.LJLJJL.display.icon);
        }
        return null;
    }

    public final boolean LJIILLIIL() {
        if ((this.LJLJJL.clientControlFlags & 1) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C25860ACy, X.AG6
    public /* bridge */ /* synthetic */ C25859ACx LJIIIIZZ() {
        return LJIIIIZZ();
    }

    public final boolean LJIILL() {
        if (LJIILLIIL()) {
            return C40322Fs6.LIZJ(EF7.LIZIZ());
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC85929Xnx(PushItem pushItem) {
        super(null);
        o.LJIIIZ(pushItem, "pushItem");
        this.LJLJJL = pushItem;
    }

    @Override // X.InterfaceC85949XoH
    public final void LIZIZ(boolean z) {
        if (LJIILLIIL()) {
            LJIIL(z);
        }
    }

    @Override // X.InterfaceC85949XoH
    public final void LIZLLL(int i, String otherItemId) {
        o.LJIIIZ(otherItemId, "otherItemId");
    }
}
