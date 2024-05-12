package com.bytedance.android.live.effect.music;

import X.ActivityC45651qj;
import X.BBP;
import X.C0L7;
import X.C10A;
import X.C14320hI;
import X.C14410hR;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C28507BGt;
import X.C33481Tc;
import X.C33591Tn;
import X.C47531tl;
import X.C47541tm;
import X.C56002Hs;
import X.C5H3;
import X.C78983UzD;
import X.C78996UzQ;
import Y.IDCListenerS135S0100000;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveBGMDialog extends LiveDialogFragment {
    public View LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(C47531tl.LJLIL);
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(C47541tm.LJLIL);

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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cun);
        C78983UzD.LJIILIIL(c28507BGt);
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C78983UzD.LJJLIIIJJIZ(this);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Fragment fragment;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        int i = C0L7.LIZ[BBP.BGM_SONG_LIST.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                fragment = (Fragment) this.LJLILLLLZI.getValue();
            }
        } else {
            fragment = (Fragment) this.LJLIL.getValue();
        }
        if (fragment == null) {
            return;
        }
        LIZ.LJIIIIZZ(R.id.dm7, 1, fragment, null);
        LIZ.LJIILJJIL();
        View findViewById = view.findViewById(R.id.hej);
        this.LJLJI = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 49), findViewById);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, BroadcastDialogPageChannel.class, new C56002Hs(this));
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        ViewModelProviders.of(mo49getActivity, new C33591Tn(new C14410hR(), this.dataChannel)).get(BGMSongListViewModel.class);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 == null) {
            return;
        }
        ViewModelProviders.of(mo49getActivity2, new C33481Tc(new C14320hI(), this.dataChannel)).get(BGMPlaylistViewModel.class);
    }
}
