package com.bytedance.android.livesdk.qa;

import X.BZI;
import X.C16880lQ;
import X.C1A;
import X.C1DH;
import X.C1EW;
import X.C28507BGt;
import X.C28787BRn;
import X.C28894BVq;
import X.C47121t6;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TurnQuestionDialog extends LiveDialogFragment {
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d1p);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    public final void vl() {
        long j;
        if (C1DH.LJJIIJZLJL(this.dataChannel)) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_entrance_close");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIIJZLJL();
        }
        QAApi qAApi = (QAApi) C1A.LIZJ(QAApi.class);
        if (C1DH.LJJIIJZLJL(this.dataChannel)) {
            j = 0;
        } else {
            j = 1;
        }
        C1EW.LIZ(qAApi.switchOn(j)).LJJJLIIL(new AfS57S0100000_5(this, 162), C28894BVq.LJLIL);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, BroadcastEndShowEvent.class, new AqS171S0100000_5(this, 478));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1DH.LJJIIJZLJL(this.dataChannel)) {
            ((TextView) _$_findCachedViewById(R.id.ltt)).setText(R.string.oss);
        } else {
            ((TextView) _$_findCachedViewById(R.id.ltt)).setText(R.string.osz);
        }
        C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.ltt), new ACListenerS25S0100000_5(this, 244));
        C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.b3n), new ACListenerS25S0100000_5(this, 245));
    }
}
