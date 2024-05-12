package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.B4Q;
import X.BAF;
import X.BAI;
import X.BAJ;
import X.BAL;
import X.BAO;
import X.BTJ;
import X.C023107f;
import X.C1A;
import X.C1EW;
import X.C1XY;
import X.C28507BGt;
import X.C29306Beo;
import X.C29494Bhq;
import X.C73943T0h;
import Y.AfS57S0100000_5;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.api.interaction.pictionary.PictionaryRankResponse;

/* loaded from: classes6.dex */
public final class DrawGuessRoundSummaryDialog extends LiveDialogFragment {
    public boolean LJLIL;
    public PictionaryRankResponse.ResponseData LJLILLLLZI;
    public DrawGuessWord LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwe);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 60;
        return c28507BGt;
    }

    public final void vl() {
        String str;
        FragmentManager fragmentManager;
        dismiss();
        DataChannel dataChannel = this.dataChannel;
        DrawGuessWord drawGuessWord = this.LJLJI;
        if (drawGuessWord != null) {
            str = drawGuessWord.word;
        } else {
            str = null;
        }
        BAI.LJIIIIZZ(dataChannel, str, "next_word");
        DrawGuessNewStartDialog LIZ = BAO.LIZ(true, true);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class)) == null) {
            return;
        }
        C1XY.LJJIIJZLJL(LIZ, fragmentManager, "DrawGuessRoundSummaryDialog");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long j;
        super.onCreate(bundle);
        DrawGuessApi drawGuessApi = (DrawGuessApi) C1A.LIZJ(DrawGuessApi.class);
        long LJJIZ = C29306Beo.LJJIZ(this.dataChannel);
        Long LJIJJ = BAF.LJIJJ(this.dataChannel);
        if (LJIJJ != null) {
            j = LJIJJ.longValue();
        } else {
            j = 0;
        }
        C1EW.LIZ(drawGuessApi.getRoundSummaryData(LJJIZ, j, 0L, 99L)).LJII(BTJ.LIZIZ(this)).LJJJLIIL(new BAJ(this), BAL.LJLIL);
        C73943T0h.LIZ().LIZJ(this, B4Q.class).LIZIZ(new AfS57S0100000_5(this, 128));
    }

    public final void wl(DrawGuessWord drawGuessWord) {
        if (drawGuessWord == null) {
            return;
        }
        this.LJLJI = drawGuessWord;
        TextView textView = (TextView) _$_findCachedViewById(R.id.njt);
        if (textView != null) {
            textView.setText(drawGuessWord.word);
        }
        C023107f.LIZIZ((TextView) _$_findCachedViewById(R.id.njt), 10, 20, 1, 1);
    }
}
