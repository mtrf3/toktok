package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H4Y extends AbstractC41873Gc1 {
    public C43397H1l LJ;
    public PublishModel LJFF;
    public VideoPublishEditModel LJI;
    public C43458H3u LJII;
    public InterfaceC43387H1b LJIIIIZZ;

    public H4Y() {
        super((Object) null, (List<? extends Object>) null);
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

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
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
            if (next instanceof C43397H1l) {
                if (next != null) {
                    this.LJ = (C43397H1l) next;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43403H1r) {
                            if (next2 != null) {
                                this.LJI = ((C43403H1r) next2).LIZ;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43404H1s) {
                                        if (next3 != null) {
                                            this.LJFF = ((C43404H1s) next3).LIZ;
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it4.next();
                                                if (next4 instanceof C43458H3u) {
                                                    if (next4 != null) {
                                                        this.LJII = (C43458H3u) next4;
                                                        Iterator<Object> it5 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it5.next();
                                                            if (next5 instanceof InterfaceC43387H1b) {
                                                                if (next5 != null) {
                                                                    this.LJIIIIZZ = (InterfaceC43387H1b) next5;
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
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
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZIZ(C41875Gc3 happenTime, Object sourceTag, Object info) {
        String str;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(info, "info");
        if (info instanceof C43457H3t) {
            C43457H3t c43457H3t = (C43457H3t) info;
            H4V h4v = new H4V(new C6BK());
            C43397H1l c43397H1l = this.LJ;
            if (c43397H1l != null) {
                h4v.LJI(c43397H1l.LJLIL);
                VideoPublishEditModel videoPublishEditModel = this.LJI;
                if (videoPublishEditModel != null) {
                    h4v.LIZJ = videoPublishEditModel;
                    h4v.LJII(c43457H3t.LJLIL);
                    h4v.LJIIIIZZ(EnumC42379GkB.VIDEO);
                    h4v.LIZ();
                    PublishModel publishModel = this.LJFF;
                    if (publishModel != null) {
                        h4v.LIZLLL(publishModel.LIZIZ());
                        h4v.LIZIZ();
                        h4v.LJ();
                        C6BK LJFF = h4v.LJFF(EnumC42980Gts.CALLBACK_TIMEOUT);
                        LJFF.LIZ.put("error_source", c43457H3t.LJLILLLLZI.getDesc());
                        LJFF.LIZ.put("error_cause", c43457H3t.LJLJI);
                        C43458H3u c43458H3u = this.LJII;
                        if (c43458H3u != null) {
                            if (c43458H3u.LIZIZ) {
                                str = "1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            LJFF.LIZ.put("click_publish", str);
                            PublishModel publishModel2 = this.LJFF;
                            if (publishModel2 != null) {
                                LJFF.LIZ.put("is_save_local", Integer.valueOf(publishModel2.isEditSave ? 1 : 0));
                                JSONObject json = LJFF.LJ();
                                InterfaceC43387H1b interfaceC43387H1b = this.LJIIIIZZ;
                                if (interfaceC43387H1b != null) {
                                    C77413UZt LJ = interfaceC43387H1b.LJ();
                                    o.LJIIIIZZ(json, "json");
                                    LJ.getClass();
                                    C43882HKc.LIZLLL(0, "aweme_publish_task_timeout", json, true);
                                    InterfaceC43387H1b interfaceC43387H1b2 = this.LJIIIIZZ;
                                    if (interfaceC43387H1b2 != null) {
                                        interfaceC43387H1b2.LIZJ().LJJIIJZLJL(json);
                                        return;
                                    } else {
                                        o.LJIJI("dependency");
                                        throw null;
                                    }
                                }
                                o.LJIJI("dependency");
                                throw null;
                            }
                            o.LJIJI("publishModel");
                            throw null;
                        }
                        o.LJIJI("clickPublishWaiter");
                        throw null;
                    }
                    o.LJIJI("publishModel");
                    throw null;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("publishId");
            throw null;
        }
    }
}
