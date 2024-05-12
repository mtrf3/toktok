package com.bytedance.android.live.liveinteract.multimatch.widget;

import X.C09K;
import X.C0NB;
import X.C16880lQ;
import X.C28272B7s;
import X.C58313Mub;
import X.C75593Tld;
import X.C75832TpU;
import X.C75883TqJ;
import X.C75934Tr8;
import X.C75935Tr9;
import X.C75936TrA;
import X.C76244Tw8;
import X.C76271TwZ;
import X.C76272Twa;
import X.C8E;
import X.CN1;
import X.InterfaceC75940TrE;
import X.InterfaceC92693kP;
import X.ViewOnClickListenerC76430Tz8;
import X.X1D;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchStatusRestEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class MatchBaseWidget extends LiveWidget {
    public MultiCoHostWindowManager LJLIL;
    public final List<LinkUser> LJLILLLLZI;
    public final AqS195S0100000_13 LJLJI;
    public final AqS195S0100000_13 LJLJJI;
    public final AqS195S0100000_13 LJLJJL;
    public C58313Mub LJLJJLL;

    public void LJZL(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
    }

    public void LLF(long j, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        C76272Twa.LIZIZ = true;
        C75832TpU.LJII = (C76244Tw8) LJZI(C76244Tw8.class);
        C76271TwZ.LJJIFFI = (C76244Tw8) LJZI(C76244Tw8.class);
        C76271TwZ.LJJII = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(new C75936TrA());
        super.onCreate();
        C8E.LIZLLL().LJJJZ(C75593Tld.class, this.LJLJJL);
        C8E.LIZLLL().LJJJZ(C75935Tr9.class, this.LJLJI);
        C8E.LIZLLL().LJJJZ(C75934Tr8.class, this.LJLJJI);
        C0NB.LJIIIZ(LJZ(), "observable UserListChangedMessage from co-host linked user list");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, MatchStatusRestEvent.class, new AqS179S0100000_13(this, 229));
        }
        C0NB.LIZIZ(LJZ(), "onCreate");
    }

    public void onSei(C28272B7s c28272B7s) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final String LJZ() {
        return C16880lQ.LJLLJ(getClass());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        C58313Mub c58313Mub = this.LJLJJLL;
        if (c58313Mub != null) {
            Iterator it = c58313Mub.LIZIZ.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC75940TrE) it.next()).onCleared();
            }
            c58313Mub.LIZIZ.clear();
        }
        this.LJLJJLL = null;
        C8E.LIZLLL().LJZI(C75593Tld.class, this.LJLJJL);
        C8E.LIZLLL().LJZI(C75935Tr9.class, this.LJLJI);
        C8E.LIZLLL().LJZI(C75934Tr8.class, this.LJLJJI);
        C0NB.LJIIIZ(LJZ(), "unObserverLinkedListChanged");
        C0NB.LIZIZ(LJZ(), "onDestroy");
        C75832TpU.LJII = null;
        C76271TwZ.LJJIFFI = null;
        InterfaceC92693kP interfaceC92693kP = C76271TwZ.LJJII;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public MatchBaseWidget(View view) {
        setContentView(view);
        IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
        if (iHostResource != null) {
            iHostResource.K00("tiktok_live_match_resource");
        }
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new AqS195S0100000_13(this, 12);
        this.LJLJJI = new AqS195S0100000_13(this, 14);
        this.LJLJJL = new AqS195S0100000_13(this, 13);
    }

    public final ViewOnClickListenerC76430Tz8 LJLZ(long j) {
        String str;
        MultiCoHostWindowManager multiCoHostWindowManager = this.LJLIL;
        if (multiCoHostWindowManager != null) {
            C75883TqJ LJI = C8E.LIZLLL().LJI(j);
            if (LJI == null || (str = LJI.LJII) == null) {
                str = "";
            }
            return multiCoHostWindowManager.LIZIZ(str);
        }
        return null;
    }

    public final <T extends InterfaceC75940TrE> T LJZI(Class<T> cls) {
        T t;
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new C58313Mub(0);
        }
        String LJLLILLLL = C16880lQ.LJLLILLLL(cls);
        if (LJLLILLLL == null) {
            LJLLILLLL = "default";
        }
        if (!TextUtils.isEmpty(LJLLILLLL)) {
            C58313Mub c58313Mub = this.LJLJJLL;
            if (c58313Mub != null) {
                t = (T) c58313Mub.LIZIZ.get(LJLLILLLL);
            } else {
                t = null;
            }
            if (cls.isInstance(t)) {
                o.LJII(t, "null cannot be cast to non-null type T of com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget.getViewModel");
                return t;
            }
            T viewModel = cls.newInstance();
            C58313Mub c58313Mub2 = this.LJLJJLL;
            o.LJI(c58313Mub2);
            o.LJIIIZ(viewModel, "viewModel");
            InterfaceC75940TrE interfaceC75940TrE = (InterfaceC75940TrE) c58313Mub2.LIZIZ.put(LJLLILLLL, viewModel);
            if (interfaceC75940TrE != null) {
                interfaceC75940TrE.onCleared();
            }
            return viewModel;
        }
        throw new IllegalArgumentException(C09K.LIZIZ("MatchBaseWidget getViewModel cls error ", cls));
    }

    public void LL(List<LinkUser> list, List<LinkUser> list2, CustomLinkMessage customLinkMessage) {
        String LJZ = LJZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkedAnchorChanged size=");
        LIZ.append(list.size());
        C0NB.LJIIIZ(LJZ, X1D.LIZIZ(LIZ));
    }
}
