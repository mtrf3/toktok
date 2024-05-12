package com.bytedance.android.livesdk.chatroom.end;

import android.view.View;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes6.dex */
public class LiveEndFragment extends BaseFragment {
    public Room LJLIL;
    public String LJLILLLLZI;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public final <T extends View> T vl(int i) {
        if (getView() == null) {
            return null;
        }
        return (T) getView().findViewById(i);
    }
}
