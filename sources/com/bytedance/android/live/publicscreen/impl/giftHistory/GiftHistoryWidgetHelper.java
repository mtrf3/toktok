package com.bytedance.android.live.publicscreen.impl.giftHistory;

import X.B83;
import X.BKY;
import X.C1UF;
import X.C221108m2;
import X.C28183B4h;
import X.C28462BFa;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C31492CXo;
import X.C31493CXp;
import X.C31809Ce5;
import X.C62822Ol8;
import X.CRY;
import X.EnumC31158CKs;
import X.InterfaceC17150lr;
import X.InterfaceC31491CXn;
import X.InterfaceC31494CXq;
import Y.AObserverS73S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.broadcast.api.AddDisplaySourceOptionEvent;
import com.bytedance.android.live.broadcast.api.DisplaySourceOptionsChannel;
import com.bytedance.android.live.broadcast.api.RemoveDisplaySourceOptionEvent;
import com.bytedance.android.live.publicscreen.api.ExternalFilterChangeChannel;
import com.bytedance.android.live.publicscreen.api.GiftHistoryNumChannel;
import com.bytedance.android.live.publicscreen.impl.DisplaySourceOptionWrappersChannel;
import com.bytedance.android.live.publicscreen.impl.GiftHistoryEnabledChannel;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedPublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedScreenFilterWidget;
import com.bytedance.android.livesdk.comp.api.game.LocalActionMessageClick;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftHistoryWidgetHelper implements GenericLifecycleObserver, InterfaceC31494CXq {
    public final LifecycleOwner LJLIL;
    public final DataChannel LJLILLLLZI;
    public final TextView LJLJI;
    public final C31809Ce5 LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final boolean LJLJL;
    public final InterfaceC31491CXn LJLJLJ;
    public LiveWidget LJLJLLL;
    public LiveWidget LJLL;
    public final LiveWidget LJLLI;
    public final C28462BFa LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final List<C31492CXo> LJLLLL;
    public final int LJLLLLLL;
    public final int LJLZ;
    public LiveWidget LJZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    public final void LIZ() {
        boolean z;
        C28462BFa c28462BFa = this.LJLLILLLL;
        Integer num = (Integer) this.LJLILLLLZI.kv0(GiftHistoryNumChannel.class);
        if (num == null || num.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        c28462BFa.LIZ(z);
    }

    public final void LIZJ() {
        if (this.LJLL == null) {
            this.LJLL = this.LJLJLJ.LIZIZ(this.LJLJJI.getId(), this.LJLJJI, ExtendedPublicScreenWidget.class, new Object[]{Boolean.TRUE});
        }
        C29306Beo.LJJLJLI(this.LJLJI);
        LiveWidget liveWidget = this.LJLL;
        if (liveWidget != null) {
            liveWidget.show();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LJLILLLLZI.kv0(LiveExtendedScreenStatus.class) == EnumC31158CKs.SHOW && this.LJLILLLLZI.kv0(LiveExtendedScreenType.class) == CRY.ExtendedGift) {
            LIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLILLLLZI.kv0(LiveExtendedScreenStatus.class) == EnumC31158CKs.SHOW && this.LJLILLLLZI.kv0(LiveExtendedScreenType.class) == CRY.ExtendedGift) {
            LIZIZ("backend");
        }
    }

    public final void LIZIZ(String str) {
        boolean z;
        C28462BFa c28462BFa = this.LJLLILLLL;
        Integer num = (Integer) this.LJLILLLLZI.kv0(GiftHistoryNumChannel.class);
        if (num == null || num.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        c28462BFa.LIZIZ(str, z);
    }

    @Override // X.InterfaceC31494CXq
    public final void U7(int i) {
        ViewGroup.LayoutParams layoutParams = this.LJLJI.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        this.LJLJI.setLayoutParams(marginLayoutParams);
    }

    public GiftHistoryWidgetHelper(LifecycleOwner lifecycleOwner, DataChannel dataChannel, TextView textView, C31809Ce5 c31809Ce5, boolean z, C1UF c1uf) {
        long j;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = textView;
        this.LJLJJI = c31809Ce5;
        this.LJLJJL = R.id.lof;
        this.LJLJJLL = R.id.loo;
        this.LJLJL = z;
        this.LJLJLJ = c1uf;
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LJLLILLLL = new C28462BFa(valueOf, j, "extended_filed");
        this.LJLLJ = C221108m2.LIZIZ(C31493CXp.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(C28183B4h.LJLIL);
        this.LJLLLL = new ArrayList();
        this.LJLLLLLL = R.id.lq_;
        this.LJLZ = R.id.lqb;
        dataChannel.rv0(GiftHistoryEnabledChannel.class, Boolean.valueOf(z));
        List<InterfaceC17150lr> list = (List) dataChannel.kv0(DisplaySourceOptionsChannel.class);
        if (list != null) {
            for (InterfaceC17150lr interfaceC17150lr : list) {
                ((ArrayList) this.LJLLLL).add(new C31492CXo(interfaceC17150lr, View.generateViewId(), this.LJLJLJ));
            }
        }
        this.LJLILLLLZI.rv0(DisplaySourceOptionWrappersChannel.class, this.LJLLLL);
        this.LJLLI = this.LJLJLJ.LIZLLL(this.LJLJJL, ExtendedScreenFilterWidget.class);
        BKY.LIZIZ().LJ.observe(this.LJLIL, new AObserverS73S0100000_5(this, 69));
        this.LJLIL.getLifecycle().addObserver(this);
        DataChannel dataChannel2 = this.LJLILLLLZI;
        dataChannel2.lv0(this.LJLIL, ExternalFilterChangeChannel.class, new AqS171S0100000_5(this, 916));
        dataChannel2.lv0(this.LJLIL, LocalActionMessageClick.class, new AqS171S0100000_5(this, 917));
        dataChannel2.lv0(this.LJLIL, GiftHistoryNumChannel.class, new AqS171S0100000_5(this, 918));
        dataChannel2.lv0(this.LJLIL, LiveExtendedScreenStatus.class, new AqS171S0100000_5(this, 919));
        this.LJLILLLLZI.lv0(this.LJLIL, AddDisplaySourceOptionEvent.class, new AqS171S0100000_5(this, 920));
        this.LJLILLLLZI.lv0(this.LJLIL, RemoveDisplaySourceOptionEvent.class, new AqS171S0100000_5(this, 921));
    }
}
