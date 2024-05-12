package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.BA1;
import X.BA7;
import X.BAI;
import X.C16880lQ;
import X.C28385BCb;
import X.C28399BCp;
import X.C28507BGt;
import X.C2A7;
import X.C32537Cpp;
import Y.ACListenerS40S0200000_5;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawGuessAnchorSummaryDialog extends LiveDialogFragment {
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwc);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 50;
        return c28507BGt;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, O] */
    public final void vl() {
        dismiss();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C28399BCp.class)).LIZ = Boolean.TRUE;
        }
        BAI.LJII(this.dataChannel, "play_again", false, 12);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(DrawGuessIsCountingDownRoundStart.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
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
        ((RecyclerView) _$_findCachedViewById(R.id.ktw)).setAdapter(new BA1(list));
        ((RecyclerView) _$_findCachedViewById(R.id.ktw)).LJIIJJI(new BA7(this, list));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.kcs), new ACListenerS40S0200000_5(new AqS171S0100000_5(this, 412), this, 22));
    }
}
