package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.GzC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43310GzC extends AbstractC41873Gc1 {
    public VideoPublishEditModel LJ;
    public InterfaceC43387H1b LJFF;
    public final C62822Ol8 LJI;

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

    public C43310GzC() {
        super(H1U.AUTH_KEY, 2);
        this.LJI = C221108m2.LIZIZ(C43311GzD.LJLIL);
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
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43458H3u) {
                                        if (next3 != null) {
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it4.next();
                                                if (next4 instanceof C43397H1l) {
                                                    if (next4 != null) {
                                                        Iterator<Object> it5 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it5.next();
                                                            if (next5 instanceof InterfaceC43387H1b) {
                                                                if (next5 != null) {
                                                                    this.LJFF = (InterfaceC43387H1b) next5;
                                                                    C43312GzE c43312GzE = (C43312GzE) this.LJI.getValue();
                                                                    c43312GzE.getClass();
                                                                    C44428Hc8 c44428Hc8 = new C44428Hc8(H6A.LIZIZ);
                                                                    c44428Hc8.LIZLLL();
                                                                    c43312GzE.LIZ = c44428Hc8;
                                                                    InterfaceC43387H1b interfaceC43387H1b = this.LJFF;
                                                                    if (interfaceC43387H1b != null) {
                                                                        C79081V1x LIZJ = interfaceC43387H1b.LIZJ();
                                                                        C145995oB c145995oB = new C145995oB();
                                                                        VideoPublishEditModel videoPublishEditModel = this.LJ;
                                                                        if (videoPublishEditModel != null) {
                                                                            c145995oB.LJI("shoot_entrance", videoPublishEditModel.mShootWay);
                                                                            c145995oB.LJI("is_photo", CardStruct.IStatusCode.DEFAULT);
                                                                            java.util.Map<String, String> map = c145995oB.LIZ;
                                                                            o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
                                                                            LIZJ.getClass();
                                                                            FMX.LJIIL("publish_start", map);
                                                                            return;
                                                                        }
                                                                        o.LJIJI("editModel");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("dependency");
                                                                    throw null;
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

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        C43312GzE c43312GzE = (C43312GzE) this.LJI.getValue();
        C44428Hc8 c44428Hc8 = c43312GzE.LIZ;
        if (c44428Hc8 != null && c44428Hc8.LIZIZ) {
            c44428Hc8.LJ();
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            C44428Hc8 c44428Hc82 = c43312GzE.LIZ;
            if (c44428Hc82 != null) {
                objArr[0] = Float.valueOf(((float) c44428Hc82.LIZIZ(TimeUnit.NANOSECONDS)) / 1.0E9f);
                String LLLZI = C16880lQ.LLLZI(locale, "%.2f", objArr);
                o.LJIIIIZZ(LLLZI, "format(\n                …DS) / 1E9f,\n            )");
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("duration", LLLZI);
                FMX.LJIIL("get_video_key", c145995oB.LIZ);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
