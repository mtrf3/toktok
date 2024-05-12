package com.bytedance.lobby.internal;

import X.ActivityC45651qj;
import android.app.Application;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.lobby.auth.AuthResult;

/* loaded from: classes12.dex */
public class LobbyViewModel extends BaseViewModel<AuthResult> {
    public LobbyViewModel(Application application) {
        super(application);
    }

    public static LobbyViewModel gv0(ActivityC45651qj activityC45651qj) {
        return (LobbyViewModel) ViewModelProviders.of(activityC45651qj).get(LobbyViewModel.class);
    }

    public final void hv0(AuthResult authResult) {
        this.LJLIL.postValue(authResult);
    }
}
