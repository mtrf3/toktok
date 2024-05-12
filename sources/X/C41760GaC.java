package X;

import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.GaC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41760GaC extends AbstractC41873Gc1 {
    public final C41755Ga7 LJ;
    public C43458H3u LJFF;
    public C43397H1l LJI;
    public C43404H1s LJII;

    @Override // X.AbstractC41873Gc1
    public final void LIZLLL(Object sourceTag, C41875Gc3 happenTime, AbstractC41872Gc0 event) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(event, "event");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41760GaC(Object netTag, C41755Ga7 c41755Ga7) {
        super(netTag, 2);
        o.LJIIIZ(netTag, "netTag");
        this.LJ = c41755Ga7;
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
            if (next instanceof C43458H3u) {
                if (next != null) {
                    this.LJFF = (C43458H3u) next;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43397H1l) {
                            if (next2 != null) {
                                this.LJI = (C43397H1l) next2;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43404H1s) {
                                        if (next3 != null) {
                                            C43404H1s c43404H1s = (C43404H1s) next3;
                                            this.LJII = c43404H1s;
                                            PublishModel publishModel = c43404H1s.LIZ;
                                            C43397H1l c43397H1l = this.LJI;
                                            if (c43397H1l != null) {
                                                String str = c43397H1l.LJLIL;
                                                publishModel.getClass();
                                                o.LJIIIZ(str, "<set-?>");
                                                publishModel.publishId = str;
                                                return;
                                            }
                                            o.LJIJI("publishId");
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
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        C41755Ga7 c41755Ga7 = this.LJ;
        C41756Ga8 c41756Ga8 = C41756Ga8.INSTANCE;
        C43404H1s c43404H1s = this.LJII;
        if (c43404H1s != null) {
            c41755Ga7.Z3(c41756Ga8, c43404H1s.LIZ);
        } else {
            o.LJIJI("publishModelContainer");
            throw null;
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        C43458H3u c43458H3u = this.LJFF;
        if (c43458H3u != null) {
            if (c43458H3u.LIZIZ) {
                Throwable t = error.getT();
                C41738GZq c41738GZq = C41767GaJ.Companion;
                int code = error.getCode();
                c41738GZq.getClass();
                C41759GaB c41759GaB = new C41759GaB(t, ORY.LJJIJIIJIL(Integer.valueOf(code), C41767GaJ.USER_NETWORK_BAD_CODES));
                c41759GaB.setPublishDuration(i);
                c41759GaB.setErrorCode(error.getCode());
                c41759GaB.setServerLogId(C42991Gu3.LJ(error));
                c41759GaB.setFailedTaskTag(sourceTag);
                C41755Ga7 c41755Ga7 = this.LJ;
                C43404H1s c43404H1s = this.LJII;
                if (c43404H1s != null) {
                    c41755Ga7.Z3(c41759GaB, c43404H1s.LIZ);
                    return;
                } else {
                    o.LJIJI("publishModelContainer");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("clickPublishWaiter");
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
            if (next instanceof CreateBaseAwemeResponse) {
                if (next != null) {
                    CreateBaseAwemeResponse createBaseAwemeResponse = (CreateBaseAwemeResponse) next;
                    C41755Ga7 c41755Ga7 = this.LJ;
                    C43404H1s c43404H1s = this.LJII;
                    if (c43404H1s != null) {
                        c41755Ga7.K6(createBaseAwemeResponse, false, c43404H1s.LIZ);
                        return;
                    } else {
                        o.LJIJI("publishModelContainer");
                        throw null;
                    }
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse");
    }
}
