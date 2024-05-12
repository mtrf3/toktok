package X;

import Y.ACallableS110S0100000_7;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import java.util.Iterator;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H2o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43426H2o extends AbstractC43455H3r {
    public C43403H1r LJFF;
    public InterfaceC153045zY LJI;
    public C67996QmO LJII;
    public volatile C76940UHo LJIIIIZZ;
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 707));

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.EXTRACT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.String] */
    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        int i;
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
                    this.LJFF = (C43403H1r) next;
                    ((C42132GgC) this.LJIIIZ.getValue()).LIZIZ();
                    C60903NvH.LJIIJJI().LJJII();
                    C43403H1r c43403H1r = this.LJFF;
                    if (c43403H1r != null) {
                        C150785vu.LIZ(c43403H1r.LIZ);
                        try {
                            LJII().LIZ();
                            C43403H1r c43403H1r2 = this.LJFF;
                            if (c43403H1r2 != null) {
                                this.LJI = C152875zH.LIZIZ(c43403H1r2.LIZ, new AqS173S0100000_7(this, 382));
                                C68322mC c68322mC = new C68322mC();
                                c68322mC.element = "";
                                C43403H1r c43403H1r3 = this.LJFF;
                                if (c43403H1r3 != null) {
                                    DMMediaModel dMMediaModel = c43403H1r3.LIZ.creativeModel.dmMediaModel;
                                    if (dMMediaModel != null) {
                                        if (dMMediaModel.type != 2) {
                                            LJIIJJI(10008, new C43451H3n("type is not TYPE_EDITED_PHOTO"));
                                            return;
                                        }
                                        if (dMMediaModel.photoFile.length() == 0) {
                                            LJIIJJI(10008, new C43451H3n("photo path is empty"));
                                            return;
                                        }
                                        c68322mC.element = dMMediaModel.photoFile;
                                        InterfaceC153045zY interfaceC153045zY = this.LJI;
                                        if (interfaceC153045zY != null) {
                                            C43403H1r c43403H1r4 = this.LJFF;
                                            if (c43403H1r4 != null) {
                                                int[] LIZJ = C44526Hdi.LIZJ(c43403H1r4.LIZ);
                                                Integer LJJJJ = ORY.LJJJJ(0, LIZJ);
                                                int i2 = -1;
                                                if (LJJJJ != null) {
                                                    i = LJJJJ.intValue();
                                                } else {
                                                    i = -1;
                                                }
                                                Integer LJJJJ2 = ORY.LJJJJ(1, LIZJ);
                                                if (LJJJJ2 != null) {
                                                    i2 = LJJJJ2.intValue();
                                                }
                                                interfaceC153045zY.LLJIJIL(i, i2);
                                                interfaceC153045zY.prepare();
                                                new C6YX(interfaceC153045zY, (String) c68322mC.element, 0, null, new H3C(this), new C43434H2w(this, c68322mC), true, false);
                                                return;
                                            }
                                            o.LJIJI("editModelContainer");
                                            throw null;
                                        }
                                        return;
                                    }
                                    LJIIJJI(10008, new C43451H3n("DMMediaModel is null"));
                                    return;
                                }
                                o.LJIJI("editModelContainer");
                                throw null;
                            }
                            o.LJIJI("editModelContainer");
                            throw null;
                        } catch (Exception unused) {
                            LJIIJJI(10010, new C43451H3n("VEEditor create error"));
                            return;
                        }
                    }
                    o.LJIJI("editModelContainer");
                    throw null;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIIJJI(int i, Throwable th) {
        ((C42132GgC) this.LJIIIZ.getValue()).LIZ();
        C67996QmO c67996QmO = this.LJII;
        if (c67996QmO != null) {
            c67996QmO.LIZLLL(i, th);
            C76940UHo c76940UHo = this.LJIIIIZZ;
            if (c76940UHo != null) {
                c76940UHo.LIZ();
            }
            this.LJIIIIZZ = null;
            C10K.LIZJ(new ACallableS110S0100000_7(this, 58));
            return;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }
}
