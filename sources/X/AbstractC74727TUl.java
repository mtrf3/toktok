package X;

import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.TUl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC74727TUl<T, S> implements TZX {
    public S LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C74729TUn.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C74728TUm.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C74733TUr.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C74730TUo.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(TUP.LJLIL);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C74731TUp.LJLIL);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C74732TUq.LJLIL);
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C74734TUs.LJLIL);
    public final List<Integer> LJIIIZ = new ArrayList();

    @Override // X.TZX
    public Long LJIILIIL() {
        return null;
    }

    @Override // X.TZX
    public String LJIILL() {
        return null;
    }

    @Override // X.TZX
    public String LJIILLIIL() {
        return null;
    }

    public abstract void LJJIII(S s);

    public final void LJJIIJZLJL() {
        synchronized (this) {
            LJIJ();
        }
    }

    @Override // X.TZX
    public final List<ListByTypeResponse.ReservedUser> LJI() {
        return (List) this.LIZJ.getValue();
    }

    @Override // X.TZX
    public List<T> LJIIJ() {
        return new ArrayList();
    }

    @Override // X.TZX
    public List<T> LJIILJJIL() {
        return new ArrayList();
    }

    @Override // X.TZX
    public List<T> LJIIZILJ() {
        return new ArrayList();
    }

    public final List<T> LJIJI() {
        return (List) this.LIZIZ.getValue();
    }

    public final List<ListByTypeResponse.GiftScoreAppliedUser> LJIJJ() {
        return (List) this.LJFF.getValue();
    }

    public final List<T> LJIJJLI() {
        return (List) this.LJ.getValue();
    }

    public final List<T> LJIL() {
        return (List) this.LJI.getValue();
    }

    public final List<T> LJJ() {
        return (List) this.LJII.getValue();
    }

    public final List<T> LJJI() {
        return (List) this.LIZLLL.getValue();
    }

    public final List<T> LJJIFFI() {
        return (List) this.LJIIIIZZ.getValue();
    }

    @Override // X.TZX
    public final List<T> LIZ() {
        return LJJI();
    }

    @Override // X.TZX
    public final List<T> LIZIZ() {
        return LJIJI();
    }

    @Override // X.TZX
    public final List<T> LJ() {
        return LJIL();
    }

    @Override // X.TZX
    public final List<T> LJFF() {
        return LJJIFFI();
    }

    @Override // X.TZX
    public final List<T> LJIIIIZZ() {
        return LJIJJLI();
    }

    public final void LJIJ() {
        LJIJI().clear();
        LJJI().clear();
        LJIJJLI().clear();
        LJIL().clear();
        LJJ().clear();
        ((List) this.LIZJ.getValue()).clear();
        LJJIFFI().clear();
        LJIJJ().clear();
    }

    @Override // X.TZX
    public final S getSource() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJII(S s) {
        C61878OQg c61878OQg;
        this.LIZ = s;
        if (((ArrayList) this.LJIIIZ).isEmpty()) {
            c61878OQg = C61878OQg.INSTANCE;
        } else if (!((ArrayList) this.LJIIIZ).contains(4)) {
            C0NB.LIZIZ("invite_out_view_friend", "save NOT_VIEWER_FRIENDS");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(LJJIFFI());
            c61878OQg = arrayList;
        } else {
            c61878OQg = C61878OQg.INSTANCE;
        }
        LJIJ();
        LJJIFFI().addAll(c61878OQg);
        LJJIII(s);
        List<T> LJIJI = LJIJI();
        LJIJI.addAll(LJJI());
        LJIJI.addAll(LJIJJLI());
        LJIJI.addAll(LJIL());
        LJIJI.addAll(LJJ());
        LJIJI.addAll(LJJIFFI());
    }

    public final void LJJIIJ(S s) {
        synchronized (this) {
            LJJII(s);
        }
    }
}
