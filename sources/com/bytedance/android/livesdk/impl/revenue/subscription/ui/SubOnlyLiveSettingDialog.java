package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.BIR;
import X.C16880lQ;
import X.C28357BAz;
import X.C28507BGt;
import X.C41071jL;
import Y.ACListenerS14S1300000_5;
import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubOnlyLiveSettingDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLLJ = 0;
    public LiveIconView LJLIL;
    public ViewGroup LJLILLLLZI;
    public ViewGroup LJLJI;
    public C41071jL LJLJJI;
    public ViewGroup LJLJJL;
    public C41071jL LJLJJLL;
    public ViewGroup LJLJL;
    public Room LJLJLJ;
    public LiveSubOnlyConfig LJLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public String LJLJLLL = "";
    public final BIR LJLLI = new BIR();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d18);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 60;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            C28357BAz.LIZ(dataChannel, this.LJLJLLL);
        }
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJLJ = room;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (LiveIconView) view.findViewById(R.id.aeg);
        this.LJLILLLLZI = (ViewGroup) view.findViewById(R.id.kon);
        this.LJLJI = (ViewGroup) view.findViewById(R.id.koj);
        this.LJLJJI = (C41071jL) view.findViewById(R.id.kop);
        this.LJLJJL = (ViewGroup) view.findViewById(R.id.lld);
        this.LJLJJLL = (C41071jL) view.findViewById(R.id.lle);
        this.LJLJL = (ViewGroup) view.findViewById(R.id.glf);
        LiveIconView liveIconView = this.LJLIL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 170));
        }
        this.LJLLI.LJ(mo49getActivity(), this.LJLJJI, this.LJLJLJ, this.LJLL);
        this.LJLLI.LIZLLL(getContext(), this.LJLJJI, null, this.LJLJJL, null, null, this.dataChannel, this.LJLJLJ, this.LJLJLLL);
        BIR bir = this.LJLLI;
        Context context = getContext();
        ViewGroup viewGroup = this.LJLJI;
        DataChannel dataChannel = this.dataChannel;
        String enterFrom = this.LJLJLLL;
        bir.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new ACListenerS14S1300000_5(context, bir, dataChannel, enterFrom, 0));
        }
        this.LJLLI.LIZIZ(getContext(), this.LJLJJL, null, this.LJLJJLL, this.LJLJJI, this.dataChannel, this.LJLJLJ, this.LJLJLLL);
        BIR.LIZJ(this.LJLJL);
        this.LJLLI.LJFF(this.LJLJLJ, this.LJLJLLL);
    }
}
