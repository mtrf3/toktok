package com.bytedance.android.livesdk.qa;

import X.C16880lQ;
import X.C28507BGt;
import X.C2A7;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TutorialDialog extends LiveDialogFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.dhs);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, BroadcastEndShowEvent.class, new AqS171S0100000_5(this, 479));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null && !bool.booleanValue()) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.title);
            if (textView != null) {
                textView.setText(R.string.nr_);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.bst);
            if (textView2 != null) {
                textView2.setText(R.string.nr8);
            }
        }
        C2A7 c2a7 = (C2A7) _$_findCachedViewById(R.id.d1p);
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 246));
        }
    }
}
