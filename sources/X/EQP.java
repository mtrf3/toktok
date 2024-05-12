package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import java.util.Comparator;

/* loaded from: classes7.dex */
public final class EQP<T> implements Comparator {
    public static final EQP<T> LJLIL = new EQP<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((CKEDraftInfoWrapper) obj2).updateTime.compareTo(((CKEDraftInfoWrapper) obj).updateTime);
    }
}
