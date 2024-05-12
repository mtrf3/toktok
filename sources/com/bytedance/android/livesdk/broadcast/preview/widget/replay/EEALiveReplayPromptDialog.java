package com.bytedance.android.livesdk.broadcast.preview.widget.replay;

import X.BX0;
import X.BZI;
import X.C16880lQ;
import X.C221108m2;
import X.C28507BGt;
import X.C28787BRn;
import X.C62822Ol8;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import Y.ACListenerS25S0100000_5;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class EEALiveReplayPromptDialog extends LiveDialogFragment {
    public static final String LJLJL = C16880lQ.LJLLJ(EEALiveReplayPromptDialog.class);
    public static EEALiveReplayPromptDialog LJLJLJ;
    public FrameLayout LJLIL;
    public FrameLayout LJLILLLLZI;
    public FrameLayout LJLJI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(BX0.LJLIL);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d27);
        c28507BGt.LIZJ = R.style.aai;
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJIIJ = -2;
        c28507BGt.LJIIL = new ColorDrawable(0);
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJJI = null;
        LJLJLJ = null;
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.aai);
    }

    public final void vl(String str) {
        String str2;
        LiveMode liveMode;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_replay_pop_up_click");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            str2 = liveMode.logStreamingType;
        } else {
            str2 = null;
        }
        LIZ.LJIJ(str2);
        LIZ.LJFF((String) this.LJLJJL.getValue());
        LIZ.LJIJJ(str, "click_position");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        o.LJIIIIZZ(view.findViewById(R.id.title), "view.findViewById(R.id.title)");
        View findViewById = view.findViewById(R.id.axd);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.btn_never_show_item)");
        this.LJLIL = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.az_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.btn_show_next_time_item)");
        this.LJLILLLLZI = (FrameLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.ava);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.btn_cancel_item)");
        this.LJLJI = (FrameLayout) findViewById3;
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS25S0100000_5(this, 108));
            FrameLayout frameLayout2 = this.LJLILLLLZI;
            if (frameLayout2 != null) {
                C16880lQ.LJIILJJIL(frameLayout2, new ACListenerS25S0100000_5(this, 109));
                FrameLayout frameLayout3 = this.LJLJI;
                if (frameLayout3 != null) {
                    C16880lQ.LJIILJJIL(frameLayout3, new ACListenerS25S0100000_5(this, 110));
                    return;
                } else {
                    o.LJIJI("cancelBtnItem");
                    throw null;
                }
            }
            o.LJIJI("showNextTimeItem");
            throw null;
        }
        o.LJIJI("neverShowBtnItem");
        throw null;
    }
}
