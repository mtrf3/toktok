package X;

import Y.AfS59S0100000_7;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H4t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43483H4t extends AbstractC41873Gc1 {
    public C43403H1r LJ;
    public C43458H3u LJFF;
    public C43397H1l LJI;
    public PublishModel LJII;
    public C43484H4u LJIIIIZZ;

    @Override // X.AbstractC41873Gc1
    public final void LIZLLL(Object sourceTag, C41875Gc3 happenTime, AbstractC41872Gc0 event) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(event, "event");
    }

    public C43483H4t() {
        super(H1U.UPLOAD, 2);
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
            if (next instanceof C43403H1r) {
                if (next != null) {
                    this.LJ = (C43403H1r) next;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43404H1s) {
                            if (next2 != null) {
                                this.LJII = ((C43404H1s) next2).LIZ;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43458H3u) {
                                        if (next3 != null) {
                                            this.LJFF = (C43458H3u) next3;
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it4.next();
                                                if (next4 instanceof C43397H1l) {
                                                    if (next4 != null) {
                                                        this.LJI = (C43397H1l) next4;
                                                        C43397H1l c43397H1l = this.LJI;
                                                        if (c43397H1l != null) {
                                                            String str = c43397H1l.LJLIL;
                                                            PublishModel publishModel = this.LJII;
                                                            if (publishModel != null) {
                                                                String str2 = publishModel.shootWay;
                                                                boolean LIZIZ = publishModel.LIZIZ();
                                                                C43458H3u c43458H3u = this.LJFF;
                                                                if (c43458H3u != null) {
                                                                    C43484H4u c43484H4u = new C43484H4u(str, str2, LIZIZ, c43458H3u.LIZIZ, new H56());
                                                                    this.LJIIIIZZ = c43484H4u;
                                                                    C43403H1r c43403H1r = this.LJ;
                                                                    if (c43403H1r != null) {
                                                                        c43484H4u.LJIIIZ = c43403H1r.LIZ.getCreationId();
                                                                        C43484H4u c43484H4u2 = this.LJIIIIZZ;
                                                                        if (c43484H4u2 != null) {
                                                                            C43403H1r c43403H1r2 = this.LJ;
                                                                            if (c43403H1r2 != null) {
                                                                                c43484H4u2.LJIIJ = H7R.LJIIIZ(c43403H1r2.LIZ);
                                                                            } else {
                                                                                o.LJIJI("editModelContainer");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        C43458H3u c43458H3u2 = this.LJFF;
                                                                        if (c43458H3u2 != null) {
                                                                            c43458H3u2.LIZJ(new AqS157S0100000_7(this, 764));
                                                                            C43484H4u c43484H4u3 = this.LJIIIIZZ;
                                                                            if (c43484H4u3 == null || c43484H4u3.LJI <= 0) {
                                                                                return;
                                                                            }
                                                                            c43484H4u3.LJIIIIZZ = SystemClock.uptimeMillis();
                                                                            c43484H4u3.LJII = (C73411SrX) AbstractC73672Svk.LJJIJIIJI(c43484H4u3.LJI, TimeUnit.SECONDS).LJJJJZI(new AfS59S0100000_7(c43484H4u3, 78));
                                                                            return;
                                                                        }
                                                                        o.LJIJI("clickPublishWaiter");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("editModelContainer");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("clickPublishWaiter");
                                                                throw null;
                                                            }
                                                            o.LJIJI("publishModel");
                                                            throw null;
                                                        }
                                                        o.LJIJI("publishId");
                                                        throw null;
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZIZ(C41875Gc3 happenTime, Object sourceTag, Object info) {
        C43484H4u c43484H4u;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(info, "info");
        if (this.LJIIIIZZ == null) {
            C41859Gbn LIZIZ = C1I0.LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sourceTag: ");
            LIZ.append(sourceTag);
            LIZ.append(", info: ");
            LIZ.append(info);
            LIZIZ.LIZJ("UploadSdkCustomReporter_onCustomEvent", X1D.LIZIZ(LIZ));
        }
        if (info instanceof H3T) {
            H3T h3t = (H3T) info;
            if (h3t.LJLIL == 100 && !TextUtils.isEmpty(h3t.LJLJI)) {
                C170666ms.LIZ.LJIIJ(3, "ttmn", h3t.LJLJI);
            }
            if (h3t.LJLIL == 101 && (c43484H4u = this.LJIIIIZZ) != null) {
                int i = h3t.LJLILLLLZI;
                String str = h3t.LJLJI;
                if (c43484H4u.LJI <= 0 || c43484H4u.LJIIJJI || str == null || str.length() == 0) {
                    return;
                }
                if (c43484H4u.LJFF.size() >= 20) {
                    c43484H4u.LJFF.poll();
                }
                ConcurrentLinkedQueue<String> concurrentLinkedQueue = c43484H4u.LJFF;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('[');
                LIZ2.append(i);
                LIZ2.append("][");
                LIZ2.append(System.currentTimeMillis());
                LIZ2.append(']');
                LIZ2.append(str);
                concurrentLinkedQueue.offer(X1D.LIZIZ(LIZ2));
            }
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        C43484H4u c43484H4u = this.LJIIIIZZ;
        if (c43484H4u != null) {
            c43484H4u.LIZ(H52.CANCEL);
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        C43484H4u c43484H4u = this.LJIIIIZZ;
        if (c43484H4u != null) {
            c43484H4u.LIZ(H52.FAILED);
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        C43484H4u c43484H4u = this.LJIIIIZZ;
        if (c43484H4u != null) {
            c43484H4u.LIZ(H52.SUCCESS);
        }
    }
}
