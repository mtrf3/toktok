package X;

import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagData;
import java.util.Comparator;

/* loaded from: classes8.dex */
public final class GK5<T> implements Comparator {
    public static final GK5<T> LJLIL = new GK5<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((RecommendHashTagData) obj).pos - ((RecommendHashTagData) obj2).pos;
    }
}
