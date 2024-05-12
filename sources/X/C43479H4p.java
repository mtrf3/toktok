package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H4p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43479H4p extends AbstractC41873Gc1 {
    public VideoPublishEditModel LJ;
    public C43458H3u LJFF;
    public C43397H1l LJI;
    public PublishModel LJII;
    public InterfaceC43387H1b LJIIIIZZ;
    public C41875Gc3 LJIIIZ;
    public C41875Gc3 LJIIJ;
    public C41875Gc3 LJIIJJI;
    public boolean LJIIL;

    public C43479H4p() {
        super("DefaultWavePublisher", (List<? extends Object>) C47261Igj.LJJIJIIJI(H1U.COMPILE, H1U.UPLOAD, H1U.CREATE_AWEME));
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
    }

    @Override // X.AbstractC41873Gc1, X.InterfaceC36938Eec
    public void onEvent(AbstractC41872Gc0 event) {
        o.LJIIIZ(event, "event");
        super.onEvent(event);
        Object obj = event.LIZ;
        if (obj == H1U.UPLOAD) {
            if (event instanceof C41870Gby) {
                this.LJIIIZ = event.LIZIZ;
            } else if (event instanceof C41852Gbg) {
                this.LJIIJ = event.LIZIZ;
            }
        } else if (obj == H1U.CREATE_AWEME) {
            if (event instanceof C41852Gbg) {
                this.LJIIJJI = event.LIZIZ;
            }
        } else if (obj == H1U.COMPILE && (event instanceof C41852Gbg)) {
            o.LJII(((C41852Gbg) event).LIZLLL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.SynthetiseResult");
        }
        if (event instanceof C41870Gby) {
            C268713r.LIZ().LJIILLIIL(new AqS157S0100000_7(event, 761));
        }
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
                    this.LJ = ((C43403H1r) next).LIZ;
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
                                                        Iterator<Object> it5 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it5.next();
                                                            if (next5 instanceof InterfaceC43387H1b) {
                                                                if (next5 != null) {
                                                                    this.LJIIIIZZ = (InterfaceC43387H1b) next5;
                                                                    C43458H3u c43458H3u = this.LJFF;
                                                                    if (c43458H3u != null) {
                                                                        c43458H3u.LIZJ(new AqS157S0100000_7(this, 762));
                                                                        return;
                                                                    } else {
                                                                        o.LJIJI("clickPublishWaiter");
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
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

    /* JADX WARN: Code restructure failed: missing block: B:185:0x04c5, code lost:
    
        if (r4 > 0) goto L170;
     */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    @Override // X.AbstractC41873Gc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.Object r52, java.lang.Object r53, boolean r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 2190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43479H4p.LJFF(java.lang.Object, java.lang.Object, boolean, int, int):void");
    }
}
