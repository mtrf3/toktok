package com.ss.android.ugc.aweme.mention.service;

import X.C118264kY;
import X.C70C;
import X.C70E;
import X.C70F;
import X.C8W2;
import X.C8W4;
import X.C8WM;
import X.C8WO;
import X.C8WT;
import X.ViewOnClickListenerC1790971d;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.mention.viewmodel.CommentMentionViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MentionDataServiceImpl implements IMentionDataService {
    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final void LIZLLL(Set<String> set) {
        C8WM.LIZ.LIZLLL(set);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final void LJFF(C8W2 lifeCycle) {
        o.LJIIIZ(lifeCycle, "lifeCycle");
        C8WO c8wo = C8WM.LIZIZ;
        int i = C8W4.LIZ[lifeCycle.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return;
            }
            c8wo.LIZ = new CommentMentionViewModel();
        } else {
            C8WT c8wt = c8wo.LIZIZ;
            if (c8wt == null) {
                return;
            }
            c8wt.setItemActionListener(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final User LJI(Intent intent) {
        if (intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("extra_data");
            o.LJII(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            return (User) serializableExtra;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final void LIZ(int i, Editable editable) {
        C8WM.LIZ.LIZ(i, editable);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final String LIZIZ(int i, Editable editable, boolean z) {
        return C118264kY.LIZ(i, editable, z);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final void LJ(Context context, Fragment fragment, Set set, ViewOnClickListenerC1790971d viewOnClickListenerC1790971d, C70C c70c, C70E c70e, C70F c70f) {
        o.LJIIIZ(fragment, "fragment");
        C8WM.LIZ.LJII(context, fragment, set, viewOnClickListenerC1790971d, c70c, c70e, c70f);
    }
}
