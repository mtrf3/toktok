package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ga2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41750Ga2 implements InterfaceC41592GUa {
    static {
        C221108m2.LIZIZ(GAL.LJLIL);
    }

    @Override // X.InterfaceC41592GUa
    public final GUG LIZ(GUU record, String publishId, C41594GUc c41594GUc) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        DMMediaModel dMMediaModel;
        VideoPublishEditModel videoPublishEditModel2;
        CreativeModel creativeModel2;
        o.LJIIIZ(record, "record");
        o.LJIIIZ(publishId, "publishId");
        if (o.LJ(C41816Gb6.LIZ.getName(), "DefaultReportWay")) {
            C41816Gb6.LIZ = new C41813Gb3();
        }
        if (record.LIZ.publishType == 3) {
            return new C43386H1a(record, publishId, new C43478H4o());
        }
        if (record.LIZ.isTTEPSave || record.LIZ.isEditSave) {
            return new H1Y(record, C74142va.LIZ(), new C43478H4o());
        }
        BaseShortVideoContext baseShortVideoContext = record.LIZ.editModel;
        DMMediaModel dMMediaModel2 = null;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel2 = (VideoPublishEditModel) baseShortVideoContext) != null && (creativeModel2 = videoPublishEditModel2.creativeModel) != null) {
            dMMediaModel2 = creativeModel2.dmMediaModel;
        }
        if (dMMediaModel2 != null) {
            if (c41594GUc != null) {
                String LIZ = C74142va.LIZ();
                BaseShortVideoContext baseShortVideoContext2 = record.LIZ.editModel;
                if ((baseShortVideoContext2 instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext2) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (dMMediaModel = creativeModel.dmMediaModel) != null && (dMMediaModel.type == 0 || dMMediaModel.type == 2 || dMMediaModel.type == 4)) {
                    return new H1X(record, LIZ, c41594GUc, new C43478H4o());
                }
                return new H1W(record, LIZ, c41594GUc, new C43478H4o());
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (c41594GUc != null) {
            return new H1V(record, C74142va.LIZ(), c41594GUc, new C43478H4o());
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
