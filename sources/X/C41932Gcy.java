package X;

import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gcy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41932Gcy extends QXX {
    public final ExtractFramesModel LJLIL;
    public final List<MultiEditVideoSegmentRecordData> LJLILLLLZI;

    @Override // X.QXX
    public final boolean LLJJJJLIIL(QXX last) {
        String str;
        List<FrameItem> allFrames;
        FrameItem frameItem;
        List<FrameItem> allFrames2;
        FrameItem frameItem2;
        o.LJIIIZ(last, "last");
        if (o.LJ(last, this)) {
            return true;
        }
        if (!(last instanceof C41932Gcy)) {
            return false;
        }
        C41932Gcy c41932Gcy = (C41932Gcy) last;
        if (o.LJ(c41932Gcy.LJLIL, this.LJLIL)) {
            return true;
        }
        ExtractFramesModel extractFramesModel = this.LJLIL;
        String str2 = null;
        if (extractFramesModel != null && (allFrames2 = extractFramesModel.getAllFrames()) != null && (frameItem2 = (FrameItem) ORZ.LLFII(allFrames2)) != null) {
            str = frameItem2.getPath();
        } else {
            str = null;
        }
        ExtractFramesModel extractFramesModel2 = c41932Gcy.LJLIL;
        if (extractFramesModel2 != null && (allFrames = extractFramesModel2.getAllFrames()) != null && (frameItem = (FrameItem) ORZ.LLFII(allFrames)) != null) {
            str2 = frameItem.getPath();
        }
        return o.LJ(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41932Gcy(ExtractFramesModel extractFramesModel, List<? extends MultiEditVideoSegmentRecordData> list) {
        this.LJLIL = extractFramesModel;
        this.LJLILLLLZI = list;
    }
}
