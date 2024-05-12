package X;

import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.H0a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43360H0a extends AbstractC43455H3r {
    public C67996QmO LJFF;
    public XFL LJI;
    public C43403H1r LJII;

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.AUTH_KEY;
    }

    public final void LJIIJJI(Throwable th) {
        C41658GWo.LIZLLL().LJII(9);
        int LJI = C42991Gu3.LJI(11, th);
        C67996QmO c67996QmO = this.LJFF;
        if (c67996QmO != null) {
            c67996QmO.LIZLLL(LJI, new C41759GaB(th));
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        o.LJIIIZ(args, "args");
        C42074GfG.LIZ();
        this.LJFF = c67996QmO;
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    C43403H1r c43403H1r = (C43403H1r) next;
                    this.LJII = c43403H1r;
                    if (!H7R.LJJJJL(c43403H1r.LIZ)) {
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
                        this.LJI = (XFL) obj;
                    }
                    Iterator<Object> it3 = args.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C43397H1l) {
                            if (next2 != null) {
                                Iterator<Object> it4 = args.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it4.next();
                                    if (next3 instanceof C43404H1s) {
                                        if (next3 != null) {
                                            C60903NvH.LJIIJJI().getPublishService().LJJIIJ();
                                            C41775GaR.LIZJ(H1T.AUTH_KEY);
                                            if (this.LJII != null) {
                                                C76L<VideoCreation> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().LIZJ(null);
                                                C43362H0c c43362H0c = new C43362H0c(this);
                                                EnumC169566l6 enumC169566l6 = EnumC169566l6.LJLIL;
                                                LIZJ.LJFF(new RunnableC65751PrH(LIZJ, c43362H0c), enumC169566l6);
                                                LIZJ.LJFF(new RunnableC65751PrH(LIZJ, new C43361H0b(this)), enumC169566l6);
                                                return;
                                            }
                                            o.LJIJI("editModelContainer");
                                            throw null;
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
