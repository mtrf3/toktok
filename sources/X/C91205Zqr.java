package X;

import com.ss.android.ugc.aweme.dsp.playpage.model.DspMusicPlayedInfo;
import java.util.Comparator;

/* renamed from: X.Zqr, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91205Zqr<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C66851QLn.LJFF(Long.valueOf(((DspMusicPlayedInfo) t).LJLIL), Long.valueOf(((DspMusicPlayedInfo) t2).LJLIL));
    }
}
