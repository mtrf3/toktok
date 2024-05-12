package X;

import Y.AfS59S0100000_7;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.Iterator;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H2b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43413H2b extends AbstractC43455H3r {
    public XFL LJFF;
    public C67996QmO LJII;
    public C43403H1r LJIIIIZZ;
    public final C73318Sq2 LJI = new C73318Sq2();
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 678));

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.AUTH_KEY;
    }

    public final void LJIIJJI(C43414H2c c43414H2c) {
        ((C42132GgC) this.LJIIIZ.getValue()).LIZ();
        XFL xfl = this.LJFF;
        if (xfl != null) {
            xfl.LIZIZ();
        }
        C67996QmO c67996QmO = this.LJII;
        if (c67996QmO != null) {
            c67996QmO.LIZLLL(30001, c43414H2c);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZ(AbstractC42983Gtv cause, C87623YaB c87623YaB) {
        o.LJIIIZ(cause, "cause");
        this.LJI.dispose();
        super.LIZ(cause, c87623YaB);
        return false;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        o.LJIIIZ(args, "args");
        this.LJII = c67996QmO;
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    this.LJIIIIZZ = (C43403H1r) next;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (obj == null || (obj instanceof XFL)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (!(obj instanceof XFL)) {
                        obj = null;
                    }
                    this.LJFF = (XFL) obj;
                    ((C42132GgC) this.LJIIIZ.getValue()).LIZIZ();
                    C43403H1r c43403H1r = this.LJIIIIZZ;
                    if (c43403H1r != null) {
                        C78999UzT.LJFF(IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LJ(c43403H1r.LIZ.uploadScene, false).LJJII(new AfS59S0100000_7(this, 75), new AfS59S0100000_7(this, 76)), this.LJI);
                        return;
                    } else {
                        o.LJIJI("editModelContainer");
                        throw null;
                    }
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
