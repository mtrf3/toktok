package X;

import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusFeature;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusFeaturesResponse;
import java.util.List;

/* loaded from: classes5.dex */
public final class A86<I, O> implements C14Q {
    public static final A86<I, O> LJLIL = new A86<>();

    @Override // X.C14Q
    public final Object apply(Object obj) {
        boolean z;
        List<CreatorPlusFeature> list;
        CreatorPlusFeaturesResponse creatorPlusFeaturesResponse = (CreatorPlusFeaturesResponse) obj;
        if (creatorPlusFeaturesResponse == null || (list = creatorPlusFeaturesResponse.features) == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(!z);
    }
}
