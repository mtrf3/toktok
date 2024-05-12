package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.Hby, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44418Hby implements InterfaceC46811IYt {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ C44388HbU LIZJ;

    @Override // X.InterfaceC46811IYt
    public final /* synthetic */ void LIZ() {
    }

    @Override // X.InterfaceC46811IYt
    public final /* synthetic */ String LIZJ() {
        return null;
    }

    @Override // X.InterfaceC46811IYt
    public final /* synthetic */ void LJIIIIZZ() {
    }

    @Override // X.InterfaceC46811IYt
    public final void LIZIZ() {
        Object obj = this.LIZJ.LIZ.LJ;
        if (obj == null) {
            return;
        }
        obj.getClass();
    }

    @Override // X.InterfaceC46811IYt
    public final String LIZLLL() {
        return (String) this.LIZJ.LIZ.LIZJ;
    }

    @Override // X.InterfaceC46811IYt
    public final C46812IYu LJ() {
        Object obj = this.LIZJ.LIZ.LJ;
        if (obj == null) {
            return null;
        }
        return ((C44412Hbs) obj).LIZIZ;
    }

    @Override // X.InterfaceC46811IYt
    public final List<InterfaceC46813IYv> LJFF() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC46811IYt
    public final void LJI() {
        Object obj = this.LIZJ.LIZ.LJ;
        if (obj != null) {
            obj.getClass();
        }
    }

    @Override // X.InterfaceC46811IYt
    public final void LJII() {
        Object obj = this.LIZJ.LIZ.LJ;
        if (obj == null) {
            return;
        }
        obj.getClass();
    }

    @Override // X.InterfaceC46811IYt
    public final void LJIIIZ() {
        C44412Hbs c44412Hbs = (C44412Hbs) this.LIZJ.LIZ.LJ;
        if (c44412Hbs == null) {
            return;
        }
        c44412Hbs.LIZIZ.getClass();
    }

    @Override // X.InterfaceC46811IYt
    public final List<InterfaceC46813IYv> LJIIJ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC46811IYt
    public final long getDuration() {
        Object obj = this.LIZJ.LIZ.LJ;
        if (obj != null) {
            return ((C44412Hbs) obj).LIZJ;
        }
        return 0L;
    }

    @Override // X.InterfaceC46811IYt
    public final String getKey() {
        return (String) this.LIZJ.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC46811IYt
    public final InterfaceC44420Hc0 getVideoModel() {
        Object obj = this.LIZJ.LIZ.LIZLLL;
        if (obj != null && !TextUtils.isEmpty(((C44390HbW) obj).LIZ)) {
            return new C44419Hbz(this);
        }
        return null;
    }

    public C44418Hby(C44388HbU c44388HbU, List list, List list2) {
        this.LIZJ = c44388HbU;
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
