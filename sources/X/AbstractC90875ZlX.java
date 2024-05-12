package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ZlX, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90875ZlX extends BasePendingResult<InterfaceC90638Zhi> {
    public C90636Zhg LJIILJJIL;
    public final boolean LJIILL;
    public final /* synthetic */ C90639Zhj LJIILLIIL;

    public abstract void LJIILIIL();

    public final InterfaceC90481ZfB LJIILJJIL() {
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new C90636Zhg(this);
        }
        return this.LJIILJJIL;
    }

    public final void LJIILL() {
        if (!this.LJIILL) {
            Iterator it = ((CopyOnWriteArrayList) this.LJIILLIIL.LJI).iterator();
            while (it.hasNext()) {
                ((InterfaceC90123ZYp) it.next()).LJIIJJI();
            }
            Iterator it2 = ((CopyOnWriteArrayList) this.LJIILLIIL.LJII).iterator();
            while (it2.hasNext()) {
                ((AbstractC90122ZYo) it2.next()).LJFF();
            }
        }
        try {
            synchronized (this.LJIILLIIL.LIZ) {
                LJIILIIL();
            }
        } catch (C90478Zf8 unused) {
            LIZ(new C90874ZlW(new Status(2100, null, null)));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC90638Zhi LJ(Status status) {
        return new C90874ZlW(status);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC90875ZlX(C90639Zhj c90639Zhj, boolean z) {
        super((AbstractC67709Qhl) null);
        this.LJIILLIIL = c90639Zhj;
        this.LJIILL = z;
    }
}
