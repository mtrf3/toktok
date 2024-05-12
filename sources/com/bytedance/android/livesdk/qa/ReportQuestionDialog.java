package com.bytedance.android.livesdk.qa;

import X.C16880lQ;
import X.C28507BGt;
import X.C28863BUl;
import X.C28868BUq;
import X.C47121t6;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS32S0110000_5;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ReportQuestionDialog extends LiveDialogFragment {
    public Question LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public String LJLILLLLZI = "";

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d0e);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        Question question;
        Boolean bool;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (str = (String) dataChannel2.kv0(C28863BUl.class)) == null) {
            str = "";
        }
        this.LJLILLLLZI = str;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            question = (Question) dataChannel3.kv0(C28868BUq.class);
        } else {
            question = null;
        }
        this.LJLIL = question;
        C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.ixg), new ACListenerS32S0110000_5(this, z, 0));
        C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.b3n), new ACListenerS25S0100000_5(this, 243));
    }
}
