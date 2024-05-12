package com.bytedance.android.livesdk.drawerfeed;

import X.BOT;
import X.BOV;
import X.BZI;
import X.C15380j0;
import X.C1B3;
import X.C221108m2;
import X.C26338AVi;
import X.C28507BGt;
import X.C28787BRn;
import X.C62822Ol8;
import X.C74291TDr;
import X.CN1;
import X.KL2;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveNonPersonalizedDialog extends LiveDialogFragment {
    public boolean LJLIL;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public boolean LJLILLLLZI = true;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 209));

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
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_in_sheet");
        } else {
            z = true;
        }
        this.LJLILLLLZI = z;
        C28507BGt c28507BGt = new C28507BGt(R.layout.czo);
        c28507BGt.LJI = 0.0f;
        if (this.LJLILLLLZI && ((Boolean) this.LJLJI.getValue()).booleanValue()) {
            c28507BGt.LIZJ = R.style.aai;
            c28507BGt.LJII = 80;
            c28507BGt.LJIIIZ = -1;
            c28507BGt.LJIIJ = -2;
        } else {
            Context context = getContext();
            if (context != null && C26338AVi.LIZJ(context)) {
                c28507BGt.LIZJ = R.style.aam;
                c28507BGt.LJII = 8388611;
            } else {
                c28507BGt.LIZJ = R.style.aan;
                c28507BGt.LJII = 8388613;
            }
            c28507BGt.LJIIIZ = (int) (KL2.LJIIJJI(getContext()) - KL2.LIZJ(getContext(), 50.0f));
            c28507BGt.LJIIJ = -1;
        }
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BOT.LIZ = "";
        BOT.LIZIZ = "";
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        if (!this.LJLIL) {
            BOT.LJ(this.dataChannel, "exit");
        }
        super.onDismiss(dialog);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Fragment fragment;
        o.LJIIIZ(view, "view");
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        IHostPersonalized iHostPersonalized = (IHostPersonalized) CN1.LIZ(IHostPersonalized.class);
        if (iHostPersonalized != null) {
            boolean z = this.LJLILLLLZI;
            mo49getActivity();
            fragment = iHostPersonalized.bc0(z, new BOV(this));
        } else {
            fragment = null;
        }
        if (fragment != null) {
            View view2 = fragment.getView();
            if (view2 != null) {
                view2.setBackgroundResource(R.drawable.chu);
            }
            DataChannel dataChannel = this.dataChannel;
            BZI LIZ = C28787BRn.LIZ("livesdk_manage_feeds_popup_show");
            LIZ.LJIJJ(BOT.LIZ, "source");
            LIZ.LJIJJ(BOT.LIZIZ, "from_page");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJJIIJZLJL();
            c1b3.LJIIIIZZ(R.id.hmn, 1, fragment, null);
            c1b3.LJI();
        }
        C74291TDr radiusLayout = (C74291TDr) view.findViewById(R.id.hmn);
        o.LJIIIIZZ(radiusLayout, "radiusLayout");
        int LIZ2 = C15380j0.LIZ(12.0f);
        if (this.LJLILLLLZI && ((Boolean) this.LJLJI.getValue()).booleanValue()) {
            float f = LIZ2 * 1.0f;
            radiusLayout.LIZ(f, f, 0.0f, 0.0f);
        } else {
            float f2 = LIZ2 * 1.0f;
            radiusLayout.LIZ(f2, 0.0f, f2, 0.0f);
        }
    }
}
