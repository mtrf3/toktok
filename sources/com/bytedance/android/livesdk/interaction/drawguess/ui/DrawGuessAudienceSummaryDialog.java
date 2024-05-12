package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.BA5;
import X.C16880lQ;
import X.C28330B9y;
import X.C28385BCb;
import X.C28507BGt;
import X.C29306Beo;
import X.C2A7;
import X.C47261Igj;
import X.ORZ;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawGuessAudienceSummaryDialog extends LiveDialogFragment {
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwd);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 50;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        long j;
        PictionaryInfo pictionaryInfo;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (list = (List) dataChannel.kv0(C28385BCb.class)) == null) {
            dismiss();
            return;
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ktw);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.ktw)).setAdapter(new C28330B9y(list));
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, LiveEndDismissDialogEvent.class, new AqS171S0100000_5(this, 413));
        }
        PictionaryFullInfo pictionaryFullInfo = (PictionaryFullInfo) ORZ.LJLLLL(list);
        if (pictionaryFullInfo != null && (pictionaryInfo = pictionaryFullInfo.pictionaryInfo) != null) {
            j = pictionaryInfo.sessionId;
        } else {
            j = 0;
        }
        int i = 0;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((PictionaryFullInfo) it.next()).guessCorrect && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        if (i == 0) {
            ((C2A7) _$_findCachedViewById(R.id.br1)).setText(R.string.njj);
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.br1), new ACListenerS25S0100000_5(this, 188));
        } else {
            ((C2A7) _$_findCachedViewById(R.id.br1)).setText(R.string.ktd);
            View confirm_button = _$_findCachedViewById(R.id.br1);
            o.LJIIIIZZ(confirm_button, "confirm_button");
            C29306Beo.LJJJLL(confirm_button, 500L, new BA5(this, j, i));
        }
    }
}
