package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.BAC;
import X.BAF;
import X.C1I;
import X.C28507BGt;
import X.C29306Beo;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessRoundDurationChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawGuessStartDialog extends LiveDialogFragment {
    public boolean LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final AqS171S0100000_5 LJLILLLLZI = new AqS171S0100000_5(this, 420);

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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwf);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    public final void vl() {
        if (this.isViewValid && !BAF.LJI(this, this.LJLILLLLZI) && !BAF.LJ(this, this.dataChannel, this.LJLILLLLZI)) {
            DataChannel dataChannel = this.dataChannel;
            AqS171S0100000_5 dialogActionCallback = this.LJLILLLLZI;
            o.LJIIIZ(dialogActionCallback, "dialogActionCallback");
            if (!C29306Beo.LJJLIIIJLJLI(Boolean.valueOf(C1I.LIZJ), new AqS94S0300000_5((Fragment) this, (Fragment) dataChannel, (DataChannel) dialogActionCallback, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 13)) && !BAF.LJII(this, this.dataChannel, this.LJLILLLLZI)) {
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.rv0(DrawGuessIsCountingDownRoundStart.class, Boolean.TRUE);
                }
                dismiss();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, DrawGuessRoundDurationChannel.class, new BAC(this));
        }
    }
}
