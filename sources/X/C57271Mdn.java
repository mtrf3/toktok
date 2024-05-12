package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.model.RelationDataSource;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.Mdn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57271Mdn implements M4C {
    @Override // X.M4C
    public final boolean LIZJ() {
        return C56193M3p.LIZ(null);
    }

    @Override // X.M4C
    public final EventLiveData<C246119lH> LJ() {
        return RelationDataSource.INSTANCE.getIsRemoved();
    }

    @Override // X.M4C
    public final EventLiveData<RelationStatus> LJFF() {
        return RelationDataSource.INSTANCE.get();
    }

    @Override // X.M4C
    public final C57287Me3 LIZ(C57285Me1 param) {
        o.LJIIIZ(param, "param");
        String str = param.LIZ;
        java.util.Map LIZIZ = C57310MeQ.LIZIZ(param);
        return new C57287Me3(C57310MeQ.LIZ(str, LIZIZ), System.currentTimeMillis(), param);
    }

    @Override // X.M4C
    public final C3U1 LIZLLL(ActivityC45651qj storeOwner) {
        o.LJIIIZ(storeOwner, "storeOwner");
        return (C3U1) new ViewModelProvider(storeOwner).get(RelationViewVM.class);
    }

    @Override // X.M4C
    public final C56186M3i LIZIZ(ActivityC45651qj activityC45651qj, Aweme aweme, Bundle bundle) {
        if (activityC45651qj != null) {
            return new C56186M3i(activityC45651qj, aweme, bundle);
        }
        return null;
    }
}
