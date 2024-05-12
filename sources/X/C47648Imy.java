package X;

import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.Comparator;

/* renamed from: X.Imy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47648Imy<T> implements Comparator {
    public static final C47648Imy<T> LJLIL = new C47648Imy<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        VideoUrlModel videoUrlModel = (VideoUrlModel) obj;
        VideoUrlModel videoUrlModel2 = (VideoUrlModel) obj2;
        if (videoUrlModel.getCreateTime() == videoUrlModel2.getCreateTime()) {
            return 0;
        }
        if (videoUrlModel.getCreateTime() > videoUrlModel2.getCreateTime()) {
            return 1;
        }
        return -1;
    }
}
