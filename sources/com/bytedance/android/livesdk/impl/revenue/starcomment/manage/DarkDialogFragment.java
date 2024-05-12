package com.bytedance.android.livesdk.impl.revenue.starcomment.manage;

import X.B9K;
import X.BCW;
import X.C15380j0;
import X.C28507BGt;
import X.C29306Beo;
import X.CCJ;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class DarkDialogFragment extends LiveDialogFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        Boolean bool;
        int i;
        int i2;
        int LJFF;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = null;
        }
        boolean LJJ = C29306Beo.LJJ(bool);
        C28507BGt c28507BGt = new C28507BGt(R.layout.d10);
        if (LJJ) {
            i = R.style.aai;
        } else if (CCJ.LIZ(getContext())) {
            i = R.style.aam;
        } else {
            i = R.style.aan;
        }
        c28507BGt.LIZJ = i;
        if (LJJ) {
            i2 = 80;
        } else if (CCJ.LIZ(getContext())) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        c28507BGt.LJII = i2;
        c28507BGt.LJI = 0.0f;
        int i3 = -1;
        if (LJJ) {
            LJFF = -1;
        } else {
            LJFF = C15380j0.LJFF(R.dimen.ad9);
        }
        c28507BGt.LJIIIZ = LJFF;
        if (LJJ) {
            i3 = (B9K.LIZJ(getContext()) * 550) / 375;
        }
        int LIZIZ = (int) (B9K.LIZIZ(getContext()) * 0.8f);
        if (i3 > LIZIZ) {
            i3 = LIZIZ;
        }
        c28507BGt.LJIIJ = i3;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(new ContextThemeWrapper(mo49getActivity(), R.style.vp));
        o.LJIIIIZZ(cloneInContext, "super.onGetLayoutInflate…\n            ),\n        )");
        return cloneInContext;
    }
}
