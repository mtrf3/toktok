package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.BZI;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C28433BDx;
import X.C28507BGt;
import X.C28787BRn;
import X.C29306Beo;
import X.C41071jL;
import X.C47121t6;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.Q7L;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import Y.AfS57S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.api.sub.SubManagementResponse;

/* loaded from: classes6.dex */
public final class SubscriptionManagementFragment extends LiveDialogFragment {
    public static final /* synthetic */ int LJLLLL = 0;
    public View LJLIL;
    public C47121t6 LJLILLLLZI;
    public ViewGroup LJLJI;
    public C41071jL LJLJJI;
    public ViewGroup LJLJJL;
    public C47121t6 LJLJJLL;
    public ViewGroup LJLJL;
    public C47121t6 LJLJLJ;
    public LiveIconView LJLJLLL;
    public Room LJLL;
    public SubManagementResponse.Data LJLLI;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public String LJLLILLLL = "";
    public final C28433BDx LJLLJ = new C28433BDx();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d1f);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 60;
        return c28507BGt;
    }

    public final void vl() {
        String LIZIZ;
        SubManagementResponse.Data data = this.LJLLI;
        if (data == null) {
            return;
        }
        C29306Beo.LJJLJLI(this.LJLIL);
        long j = data.activeSubscriberCnt;
        if (j >= 5) {
            C47121t6 c47121t6 = this.LJLILLLLZI;
            if (c47121t6 != null) {
                Object[] objArr = new Object[1];
                if (j < 1000) {
                    LIZIZ = String.valueOf(j);
                } else if (j < 1000000) {
                    StringBuilder LIZ = X1D.LIZ();
                    String LLLZI = C16880lQ.LLLZI(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) j) / 1000)}, 1));
                    o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                    LIZ.append(LLLZI);
                    LIZ.append('K');
                    LIZIZ = X1D.LIZIZ(LIZ);
                } else if (j < 1000000000) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    String LLLZI2 = C16880lQ.LLLZI(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) j) / 1000000)}, 1));
                    o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
                    LIZ2.append(LLLZI2);
                    LIZ2.append('M');
                    LIZIZ = X1D.LIZIZ(LIZ2);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    String LLLZI3 = C16880lQ.LLLZI(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) j) / 1000000000)}, 1));
                    o.LJIIIIZZ(LLLZI3, "format(locale, format, *args)");
                    LIZ3.append(LLLZI3);
                    LIZ3.append('B');
                    LIZIZ = X1D.LIZIZ(LIZ3);
                }
                objArr[0] = LIZIZ;
                c47121t6.setText(C15380j0.LJIILL(R.string.mmd, objArr));
            }
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
        } else {
            C29306Beo.LJI(this.LJLILLLLZI);
        }
        this.LJLLJ.LIZ(this.LJLJI, this.LJLJJI, this.LJLL, this.LJLLILLLL);
        C28433BDx.LIZIZ(this.LJLJJL, this.LJLJJLL, this.dataChannel, this.LJLL);
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new ACListenerS40S0200000_5(data, this, 47));
        }
        BZI LIZ4 = C28787BRn.LIZ("livesdk_anchor_subscription_page_show");
        LIZ4.LJIILLIIL(this.dataChannel);
        LIZ4.LJIJJ(this.LJLLILLLL, "show_entrance");
        LIZ4.LJJIIJZLJL();
        Boolean userHasClosedTooltipBefore = InterfaceC30442Bx8.T2.LIZJ();
        o.LJIIIIZZ(userHasClosedTooltipBefore, "userHasClosedTooltipBefore");
        if (userHasClosedTooltipBefore.booleanValue()) {
            return;
        }
        C29306Beo.LJJLJLI(this.LJLJL);
        String LIZJ = BDDateFormat.LIZJ(new BDDateFormat("MMM D"), 1687968000000L);
        C47121t6 c47121t62 = this.LJLJLJ;
        if (c47121t62 != null) {
            c47121t62.setText(C15380j0.LJIILL(R.string.mc8, LIZJ));
        }
        LiveIconView liveIconView = this.LJLJLLL;
        if (liveIconView == null) {
            return;
        }
        C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 321));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        long j;
        User owner;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        }
        this.LJLL = room;
        SubscribeApi subscribeApi = (SubscribeApi) Q7L.LIZIZ(SubscribeApi.class);
        Room room2 = this.LJLL;
        if (room2 == null || (owner = room2.getOwner()) == null || (str = owner.getSecUid()) == null) {
            str = "";
        }
        Room room3 = this.LJLL;
        if (room3 != null) {
            j = room3.getId();
        } else {
            j = 0;
        }
        C1EW.LIZ(subscribeApi.getAnchorSubscriptionManagement(str, j)).LJJJLIIL(new AfS57S0100000_5(this, 261), new InterfaceC64592gB() { // from class: X.9Da
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
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
        this.LJLIL = view.findViewById(R.id.bu3);
        this.LJLILLLLZI = (C47121t6) view.findViewById(R.id.nhd);
        this.LJLJI = (ViewGroup) view.findViewById(R.id.koc);
        this.LJLJJI = (C41071jL) view.findViewById(R.id.kod);
        this.LJLJJL = (ViewGroup) view.findViewById(R.id.kon);
        this.LJLJJLL = (C47121t6) view.findViewById(R.id.koo);
        view.findViewById(R.id.kog);
        this.LJLJL = (ViewGroup) view.findViewById(R.id.gji);
        this.LJLJLJ = (C47121t6) view.findViewById(R.id.ldt);
        this.LJLJLLL = (LiveIconView) view.findViewById(R.id.lds);
        vl();
    }
}
