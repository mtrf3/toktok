package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1Z extends AbstractC41873Gc1 {
    public final Object LJ;
    public VideoPublishEditModel LJFF;
    public InterfaceC43387H1b LJI;

    public H1Z() {
        super((Object) null, (List<? extends Object>) C47261Igj.LJJIJIIJI(H1U.COMPILE, H1U.UPLOAD, H1U.CREATE_AWEME));
        this.LJ = "DefaultWavePublisher";
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
                    this.LJFF = ((C43403H1r) next).LIZ;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof InterfaceC43387H1b) {
                            if (next2 != null) {
                                InterfaceC43387H1b interfaceC43387H1b = (InterfaceC43387H1b) next2;
                                this.LJI = interfaceC43387H1b;
                                interfaceC43387H1b.LJIIIIZZ();
                                C41813Gb3.LIZJ(sourceTag.toString(), "wave task start execute...");
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJI(int i, C43336Gzc c43336Gzc) {
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        C62822Ol8 c62822Ol8 = H2X.LIZ;
        ((Keva) c62822Ol8.getValue()).storeLong("upload_finish_timestamp", currentTimeMillis);
        if (c43336Gzc != null) {
            i2 = (int) c43336Gzc.LIZ;
        } else {
            i2 = 0;
        }
        int i3 = i - i2;
        if (i3 != 0) {
            VideoPublishEditModel videoPublishEditModel = this.LJFF;
            if (videoPublishEditModel != null) {
                ((Keva) c62822Ol8.getValue()).storeLong("upload_speed", (C42000Ge4.LJIIIZ(videoPublishEditModel) * 1000) / i3);
            } else {
                o.LJIJI("editModel");
                throw null;
            }
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZIZ(C41875Gc3 happenTime, Object sourceTag, Object info) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(info, "info");
        InterfaceC43387H1b interfaceC43387H1b = this.LJI;
        if (interfaceC43387H1b == null) {
            return;
        }
        if (info instanceof H0B) {
            C41813Gb3 LJIIIIZZ = interfaceC43387H1b.LJIIIIZZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setPreUploadEncryptionMode:");
            H0B h0b = (H0B) info;
            LIZ.append(h0b.LJLIL);
            LIZ.append(" isAllowMerge:");
            LIZ.append(h0b.LJLILLLLZI);
            LJIIIIZZ.LIZIZ("", X1D.LIZIZ(LIZ));
            return;
        }
        if (info instanceof C43350Gzq) {
            C41813Gb3 LJIIIIZZ2 = interfaceC43387H1b.LJIIIIZZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("merge Mode:");
            C43350Gzq c43350Gzq = (C43350Gzq) info;
            LIZ2.append(c43350Gzq.LJLIL);
            LIZ2.append(" isAllowMerge:");
            LIZ2.append(c43350Gzq.LJLILLLLZI);
            LJIIIIZZ2.LIZIZ("", X1D.LIZIZ(LIZ2));
            return;
        }
        if (info instanceof H3I) {
            return;
        }
        if (info instanceof C43395H1j) {
            interfaceC43387H1b.LJIIIIZZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("smart slice size = ");
            LIZ3.append(((C43395H1j) info).LJLIL);
            C41813Gb3.LIZJ("UploadSmartSlice", X1D.LIZIZ(LIZ3));
            return;
        }
        if (info instanceof C43390H1e) {
            C41813Gb3 LJIIIIZZ3 = interfaceC43387H1b.LJIIIIZZ();
            C43390H1e c43390H1e = (C43390H1e) info;
            String str = c43390H1e.LJLIL;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("ConcurrentUploadByFile probeContext:");
            LIZ4.append(c43390H1e.LJLILLLLZI);
            LIZ4.append(", speed: ");
            LIZ4.append(c43390H1e.LJLJI);
            LIZ4.append(", speedThreshold: ");
            LIZ4.append(c43390H1e.LJLJJI);
            LJIIIIZZ3.LIZIZ(str, X1D.LIZIZ(LIZ4));
            return;
        }
        if (info instanceof C43392H1g) {
            C41813Gb3 LJIIIIZZ4 = interfaceC43387H1b.LJIIIIZZ();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("PublishDurationMonitor EncryptionMode:");
            C43392H1g c43392H1g = (C43392H1g) info;
            LIZ5.append(c43392H1g.LJLIL);
            LIZ5.append(" Upload Start:");
            LIZ5.append(c43392H1g.LJLILLLLZI);
            LJIIIIZZ4.LIZIZ("", X1D.LIZIZ(LIZ5));
            return;
        }
        if (!(info instanceof C43393H1h)) {
            return;
        }
        interfaceC43387H1b.LJIIIIZZ();
        C43393H1h c43393H1h = (C43393H1h) info;
        C41813Gb3.LIZJ(c43393H1h.LJLIL, c43393H1h.LJLILLLLZI);
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        LJII(sourceTag, EnumC43388H1c.PUBLISH_CANCEL, i, i2, false);
        if (sourceTag == H1U.UPLOAD) {
            LJI(i, null);
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        LJII(sourceTag, EnumC43388H1c.PUBLISH_FAIL, i, i2, false);
        if (o.LJ(sourceTag, this.LJ)) {
            InterfaceC43387H1b interfaceC43387H1b = this.LJI;
            if (interfaceC43387H1b != null) {
                interfaceC43387H1b.LJIIIIZZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PublishFailed, reason: ");
                LIZ.append(C36747EbX.LIZIZ(error));
                C41813Gb3.LIZJ("publish", X1D.LIZIZ(LIZ));
                return;
            }
            o.LJIJI("dependency");
            throw null;
        }
        if (sourceTag != H1U.UPLOAD) {
            return;
        }
        LJI(i, null);
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        LJII(sourceTag, EnumC43388H1c.PUBLISH_SUCCESS, i, i2, z);
        if (sourceTag == H1U.UPLOAD) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.UploadResult");
            LJI(i, ((C43335Gzb) obj).LJLILLLLZI);
        }
    }

    public final void LJII(Object obj, EnumC43388H1c enumC43388H1c, int i, int i2, boolean z) {
        InterfaceC43387H1b interfaceC43387H1b = this.LJI;
        if (interfaceC43387H1b != null) {
            interfaceC43387H1b.LJIIIIZZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stage: ");
            LIZ.append(obj);
            LIZ.append(" succeeded, event: ");
            C0EH.LIZLLL(LIZ, enumC43388H1c.LJLIL, ", systemDuration: ", i, "ms, absoluteDuration: ");
            LIZ.append(i2);
            LIZ.append("ms, isSkip: ");
            LIZ.append(z);
            C41813Gb3.LIZJ("publish_duration_monitor", X1D.LIZIZ(LIZ));
            return;
        }
        o.LJIJI("dependency");
        throw null;
    }
}
