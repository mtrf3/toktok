package X;

import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.GZm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41734GZm extends AbstractC41873Gc1 {
    public VideoPublishEditModel LJ;
    public PublishModel LJFF;

    public C41734GZm() {
        super(H1U.COMPILE, 2);
    }

    public final void LJI() {
        String str;
        GU9 gu9;
        PublishModel publishModel = this.LJFF;
        GU9 gu92 = null;
        if (publishModel != null) {
            if (!publishModel.isEditSave && GUH.LJIIZILJ() <= 1) {
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel != null) {
                    String flowId = videoPublishEditModel.creativeModel.editSaveLocalModel.flowId;
                    o.LJIIIZ(flowId, "flowId");
                    GU9 gu93 = GU7.LIZLLL;
                    if (gu93 != null) {
                        str = gu93.LIZJ;
                    } else {
                        str = null;
                    }
                    if (o.LJ(flowId, str) && (gu9 = GU7.LIZLLL) != null && gu9.LJI) {
                        VideoPublishEditModel videoPublishEditModel2 = gu9.LJ;
                        if (videoPublishEditModel2 != null) {
                            GU7.LJII(videoPublishEditModel2, null, false, true, 6);
                        }
                        GU9 gu94 = GU7.LIZLLL;
                        if (gu94 != null) {
                            gu92 = GU9.LIZ(gu94, null, false, null, false, null, 1983);
                        }
                        GU7.LIZLLL = gu92;
                        return;
                    }
                    return;
                }
                o.LJIJI("editModel");
                throw null;
            }
            return;
        }
        o.LJIJI("publishModel");
        throw null;
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
                                PublishModel publishModel = ((C43404H1s) next2).LIZ;
                                this.LJFF = publishModel;
                                GU7.LIZIZ = true;
                                if (publishModel != null) {
                                    if (publishModel.isEditSave) {
                                        GU7.LIZLLL("edit save compile start");
                                        return;
                                    }
                                    return;
                                }
                                o.LJIJI("publishModel");
                                throw null;
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
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        GU7.LIZIZ = false;
        LJI();
        PublishModel publishModel = this.LJFF;
        if (publishModel != null) {
            if (publishModel.isEditSave) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("edit save compile canceled, cause: ");
                LIZ.append(cause);
                GU7.LIZLLL(X1D.LIZIZ(LIZ));
                return;
            }
            return;
        }
        o.LJIJI("publishModel");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        GU7.LIZIZ = false;
        LJI();
        PublishModel publishModel = this.LJFF;
        if (publishModel != null) {
            if (publishModel.isEditSave) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("edit save compile failed, error: ");
                LIZ.append(error);
                GU7.LIZLLL(X1D.LIZIZ(LIZ));
                return;
            }
            return;
        }
        o.LJIJI("publishModel");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        String str;
        o.LJIIIZ(sourceTag, "sourceTag");
        GU7.LIZIZ = false;
        PublishModel publishModel = this.LJFF;
        GU9 gu9 = null;
        if (publishModel != null) {
            if (publishModel.isEditSave && (obj instanceof SynthetiseResult)) {
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel != null) {
                    String flowId = videoPublishEditModel.creativeModel.editSaveLocalModel.flowId;
                    SynthetiseResult result = (SynthetiseResult) obj;
                    o.LJIIIZ(flowId, "flowId");
                    o.LJIIIZ(result, "result");
                    GU9 gu92 = GU7.LIZLLL;
                    if (gu92 != null) {
                        str = gu92.LIZJ;
                    } else {
                        str = null;
                    }
                    if (o.LJ(flowId, str)) {
                        GU9 gu93 = GU7.LIZLLL;
                        if (gu93 != null) {
                            gu9 = GU9.LIZ(gu93, null, false, null, false, result, 1919);
                        }
                        GU7.LIZLLL = gu9;
                    }
                    GU7.LIZLLL("edit save compile complete");
                    return;
                }
                o.LJIJI("editModel");
                throw null;
            }
            if (publishModel.isEditPrePublish && (obj instanceof SynthetiseResult)) {
                VideoPublishEditModel videoPublishEditModel2 = this.LJ;
                if (videoPublishEditModel2 != null) {
                    String flowId2 = videoPublishEditModel2.creativeModel.editSaveLocalModel.flowId;
                    SynthetiseResult result2 = (SynthetiseResult) obj;
                    o.LJIIIZ(flowId2, "flowId");
                    o.LJIIIZ(result2, "result");
                    GU7.LIZJ = new GV6(flowId2, result2);
                } else {
                    o.LJIJI("editModel");
                    throw null;
                }
            }
            LJI();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("some task compile success, is edit prepublish: ");
            PublishModel publishModel2 = this.LJFF;
            if (publishModel2 != null) {
                LIZ.append(publishModel2.isEditPrePublish);
                X1D.LIZIZ(LIZ);
                return;
            } else {
                o.LJIJI("publishModel");
                throw null;
            }
        }
        o.LJIJI("publishModel");
        throw null;
    }
}
