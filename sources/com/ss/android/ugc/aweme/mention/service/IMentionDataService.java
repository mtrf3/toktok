package com.ss.android.ugc.aweme.mention.service;

import X.C70C;
import X.C70E;
import X.C70F;
import X.C8W2;
import X.ViewOnClickListenerC1790971d;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Set;

/* loaded from: classes4.dex */
public interface IMentionDataService {
    void LIZ(int i, Editable editable);

    String LIZIZ(int i, Editable editable, boolean z);

    void LIZLLL(Set<String> set);

    void LJ(Context context, Fragment fragment, Set set, ViewOnClickListenerC1790971d viewOnClickListenerC1790971d, C70C c70c, C70E c70e, C70F c70f);

    void LJFF(C8W2 c8w2);

    User LJI(Intent intent);
}
