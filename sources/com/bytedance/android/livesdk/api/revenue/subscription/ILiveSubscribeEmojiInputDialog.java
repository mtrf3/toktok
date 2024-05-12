package com.bytedance.android.livesdk.api.revenue.subscription;

import X.InterfaceC61975OTz;
import X.T2R;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class ILiveSubscribeEmojiInputDialog extends LiveDialogFragment implements InterfaceC61975OTz {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    public abstract void Al(Map<String, ? extends Object> map);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract void vl();

    public abstract void wl();

    public abstract void xl(T2R t2r);
}
