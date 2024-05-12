package X;

import Y.AfS56S0200000_7;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H3r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43455H3r extends AbstractC43456H3s {
    public C73411SrX LIZ;
    public int LIZIZ;
    public InterfaceC43387H1b LIZJ;
    public C67996QmO LIZLLL;
    public boolean LJ;

    public abstract void LJI(ERR err, C67996QmO c67996QmO);

    public int LJIIIIZZ() {
        return 0;
    }

    public abstract H1T LJIIIZ();

    public final void LJFF() {
        C73411SrX c73411SrX = this.LIZ;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = this.LIZ;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            this.LIZ = null;
        }
    }

    public final InterfaceC43387H1b LJII() {
        InterfaceC43387H1b interfaceC43387H1b = this.LIZJ;
        if (interfaceC43387H1b != null) {
            return interfaceC43387H1b;
        }
        o.LJIJI("externalDependency");
        throw null;
    }

    @Override // X.AbstractC43456H3s
    public boolean LIZJ(Object obj) {
        this.LJ = true;
        LJFF();
        return false;
    }

    @Override // X.AbstractC43456H3s
    public void LIZLLL(Object obj) {
        this.LJ = false;
        C67996QmO c67996QmO = this.LIZLLL;
        if (c67996QmO != null) {
            LJIIJ(c67996QmO);
        } else {
            o.LJIJI("callbackWrapper");
            throw null;
        }
    }

    public final void LJIIJ(C67996QmO c67996QmO) {
        int LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ > 0) {
            this.LIZ = (C73411SrX) AbstractC73672Svk.LJJIJIIJI(LJIIIIZZ, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(new C73950T0o(EnumC169566l6.LJLIL)).LJJJJZI(new AfS56S0200000_7(this, c67996QmO, 6));
        }
    }

    @Override // X.AbstractC43456H3s
    public boolean LIZ(AbstractC42983Gtv cause, C87623YaB c87623YaB) {
        o.LJIIIZ(cause, "cause");
        LJFF();
        super.LIZ(cause, c87623YaB);
        return false;
    }

    @Override // X.AbstractC43456H3s
    public void LJ(ERR args, InterfaceC43351Gzr interfaceC43351Gzr) {
        Object obj;
        int i;
        PublishModel publishModel;
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof InterfaceC43387H1b) {
                if (next != null) {
                    this.LIZJ = (InterfaceC43387H1b) next;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (obj instanceof C43404H1s) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (!(obj instanceof C43404H1s)) {
                        obj = null;
                    }
                    C43404H1s c43404H1s = (C43404H1s) obj;
                    if (c43404H1s != null && (publishModel = c43404H1s.LIZ) != null) {
                        i = publishModel.publishType;
                    } else {
                        i = 0;
                    }
                    this.LIZIZ = i;
                    C67996QmO c67996QmO = new C67996QmO(interfaceC43351Gzr, new AqS157S0100000_7(this, 451));
                    this.LIZLLL = c67996QmO;
                    LJIIJ(c67996QmO);
                    C67996QmO c67996QmO2 = this.LIZLLL;
                    if (c67996QmO2 != null) {
                        LJI(args, c67996QmO2);
                        return;
                    } else {
                        o.LJIJI("callbackWrapper");
                        throw null;
                    }
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
    }
}
