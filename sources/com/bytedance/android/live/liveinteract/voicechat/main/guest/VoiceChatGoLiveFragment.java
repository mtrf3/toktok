package com.bytedance.android.live.liveinteract.voicechat.main.guest;

import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C28507BGt;
import X.C29306Beo;
import X.C2A7;
import X.C73318Sq2;
import X.C73969T1h;
import X.C74824TYe;
import X.C74906TaY;
import X.DialogC77438UaI;
import X.InterfaceC64592gB;
import X.TMC;
import X.TQV;
import Y.ACListenerS33S0100000_13;
import Y.AfS65S0100000_13;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VoiceChatGoLiveFragment extends LiveDialogFragment {
    public DialogC77438UaI LJLILLLLZI;
    public Integer LJLJI;
    public TQV LJLJJI;
    public long LJLJJLL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final /* synthetic */ C74906TaY LJLIL = new C74906TaY();
    public boolean LJLJJL = true;
    public String LJLJL = "outside";
    public String LJLJLJ = "is_cancel";

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.br2);
        c28507BGt.LIZJ = R.style.ac_;
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.7f;
        c28507BGt.LJIIJ = -2;
        c28507BGt.LJIILIIL = 3;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        TQV tqv;
        super.onDestroy();
        C0NB.LIZIZ("VoiceChatGoLiveFragment", "onDestroy");
        ((C73318Sq2) this.LJLIL.LIZ.getValue()).dispose();
        if (this.LJLJJL && (tqv = this.LJLJJI) != null) {
            tqv.LLF = true;
            tqv.LJJJJJL();
        }
        C74824TYe c74824TYe = C74824TYe.LIZ;
        Integer num = this.LJLJI;
        if (num == null || num.intValue() != 1) {
            str = "invite";
        } else {
            str = "apply";
        }
        c74824TYe.LJJJJZ(str, null, 0L, false, true, false, this.LJLJL, this.LJLJLJ, System.currentTimeMillis() - this.LJLJJLL);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C2A7 c2a7 = (C2A7) _$_findCachedViewById(R.id.dxe);
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS33S0100000_13(this, 106));
        }
        C2A7 c2a72 = (C2A7) _$_findCachedViewById(R.id.bfh);
        if (c2a72 != null) {
            C16880lQ.LJJIII(c2a72, new ACListenerS33S0100000_13(this, 107));
        }
        if (C29306Beo.LJJIJLIJ(this.dataChannel) != null) {
            ((TextView) _$_findCachedViewById(R.id.bu4)).setText(C15380j0.LJIILJJIL(R.string.nef));
        }
        this.LJLIL.LIZ(TMC.LJIL(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ(6).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS65S0100000_13(this, 98), new InterfaceC64592gB() { // from class: X.9Ci
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }));
        this.LJLJJLL = System.currentTimeMillis();
        C74824TYe c74824TYe = C74824TYe.LIZ;
        Integer num = this.LJLJI;
        if (num == null || num.intValue() != 1) {
            str = "anchor_invite_guest";
        } else {
            str = "guest_apply_anchor";
        }
        c74824TYe.LJJJJLL(str, CardStruct.IStatusCode.DEFAULT);
    }
}
