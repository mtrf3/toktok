package X;

import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I61 {
    public final int LIZ;
    public boolean LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final MultiEditVideoStatusRecordData LIZLLL;
    public final Cut2EditTransferModel LJ;

    public I61(int i, boolean z, VideoPublishEditModel editModel, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, Cut2EditTransferModel cut2EditTransferModel) {
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = editModel;
        this.LIZLLL = multiEditVideoStatusRecordData;
        this.LJ = cut2EditTransferModel;
    }
}
