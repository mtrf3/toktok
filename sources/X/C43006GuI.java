package X;

import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.util.List;

/* renamed from: X.GuI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43006GuI extends AbstractC43007GuJ {
    public final ExtractFramesModel LJ;
    public final long LJFF;
    public final List<MultiEditVideoSegmentRecordData> LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C43006GuI(ExtractFramesModel extractFramesModel, long j, List<? extends MultiEditVideoSegmentRecordData> list, String str, String str2, String str3, boolean z, String str4) {
        super(str, str2, str3, str4);
        this.LJ = extractFramesModel;
        this.LJFF = j;
        this.LJI = list;
    }
}
