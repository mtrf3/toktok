package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I0Q<T1, T2, R> implements RTU {
    public static final I0Q<T1, T2, R> LJLIL = new I0Q<>();

    @Override // X.RTU
    public final Object apply(Object obj, Object obj2) {
        C45743HxL mediaData = (C45743HxL) obj;
        C45743HxL videoData = (C45743HxL) obj2;
        o.LJIIIZ(mediaData, "mediaData");
        o.LJIIIZ(videoData, "videoData");
        List LJJLIIIJ = OJ4.LJJLIIIJ(OJ4.LJJL(new I0T(OJ4.LJJJLZIJ(OJ4.LJJL(ORZ.LJLIIIL(mediaData.LJLILLLLZI)), ORZ.LLILLL(videoData.LJLILLLLZI, 2)))));
        if ((!((ArrayList) LJJLIIIJ).isEmpty()) && LJJLIIIJ != null) {
            return new C45743HxL(new C45744HxM(((MediaModel) ListProtector.get(LJJLIIIJ, 0)).type, LJJLIIIJ.size(), 0), LJJLIIIJ);
        }
        return mediaData;
    }
}
