package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.GaQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41774GaQ extends AbstractC41873Gc1 {
    public final GUX LJ;
    public final long LJFF;
    public C43404H1s LJI;

    public static EnumC42135GgF LJI(Object obj) {
        if (obj == H1U.COMPILE) {
            return EnumC42135GgF.COMPILE;
        }
        if (obj == H1U.COVER_EXTRACT) {
            return EnumC42135GgF.COVER_EXTRACT;
        }
        if (obj == H1U.AUTH_KEY) {
            return EnumC42135GgF.AUTH;
        }
        if (obj == H1U.UPLOAD) {
            return EnumC42135GgF.UPLOAD;
        }
        return EnumC42135GgF.NONE;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43404H1s) {
                if (next != null) {
                    this.LJI = (C43404H1s) next;
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
    }

    public C41774GaQ(Object obj, GUX gux, long j) {
        super(obj, 2);
        this.LJ = gux;
        this.LJFF = j;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        GUX gux = this.LJ;
        GAI gai = GAI.LIZ;
        C43404H1s c43404H1s = this.LJI;
        if (c43404H1s != null) {
            gux.onFinish(gai, null, c43404H1s.LIZ);
            LJII(false, -1, "cancel", LJI(sourceTag));
        } else {
            o.LJIJI("publishModelContainer");
            throw null;
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        Throwable t = error.getT();
        C41738GZq c41738GZq = C41767GaJ.Companion;
        int code = error.getCode();
        c41738GZq.getClass();
        C41759GaB c41759GaB = new C41759GaB(t, ORY.LJJIJIIJIL(Integer.valueOf(code), C41767GaJ.USER_NETWORK_BAD_CODES));
        GUX gux = this.LJ;
        C41478GPq c41478GPq = new C41478GPq(new C41606GUo(String.valueOf(error.getCode()), error.toString(), c41759GaB.isUserNetworkBad(), c41759GaB.getCause(), Boolean.valueOf(c41759GaB.isRecover())));
        C43404H1s c43404H1s = this.LJI;
        if (c43404H1s != null) {
            gux.onFinish(c41478GPq, null, c43404H1s.LIZ);
            LJII(false, Integer.valueOf(error.getCode()), error.toString(), LJI(error.getNodeTag()));
        } else {
            o.LJIJI("publishModelContainer");
            throw null;
        }
    }

    public final void LJII(boolean z, Integer num, String str, EnumC42135GgF enumC42135GgF) {
        IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LIZJ();
        C42115Gfv c42115Gfv = C42115Gfv.LIZ;
        C43404H1s c43404H1s = this.LJI;
        if (c43404H1s != null) {
            C42131GgB LIZ = c42115Gfv.LIZ(c43404H1s.LIZ.creationId);
            LIZ.LJIIJ(z);
            LIZ.LJIIL(System.currentTimeMillis() - this.LJFF);
            LIZ.LJFF(enumC42135GgF);
            if (num != null) {
                LIZ.LIZLLL(num.intValue());
            }
            if (str != null) {
                LIZ.LJ(str);
            }
            LIZ.LJIIIZ();
            return;
        }
        o.LJIJI("publishModelContainer");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.wave.core.Args");
        Iterator<Object> it = ((ERR) obj).LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C118004k8) {
                if (next != null) {
                    GUX gux = this.LJ;
                    C41614GUw c41614GUw = new C41614GUw((C118004k8) next);
                    C43404H1s c43404H1s = this.LJI;
                    if (c43404H1s != null) {
                        gux.onFinish(c41614GUw, null, c43404H1s.LIZ);
                        LJII(true, null, null, EnumC42135GgF.NONE);
                        return;
                    } else {
                        o.LJIJI("publishModelContainer");
                        throw null;
                    }
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.dm.DMMediaPublishResult");
    }
}
