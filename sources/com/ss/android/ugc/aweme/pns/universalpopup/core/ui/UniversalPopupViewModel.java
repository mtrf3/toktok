package com.ss.android.ugc.aweme.pns.universalpopup.core.ui;

import X.AbstractC82929Wgf;
import X.AnonymousClass036;
import X.C0H1;
import X.C10K;
import X.C113554cx;
import X.C16880lQ;
import X.C73992T2e;
import X.C82926Wgc;
import X.C82927Wgd;
import X.C82930Wgg;
import X.C82931Wgh;
import X.C8GI;
import X.C8GL;
import X.InterfaceC36824Ecm;
import X.InterfaceC82923WgZ;
import X.ORZ;
import X.OSZ;
import Y.AObserverS64S0101000_14;
import Y.AgS77S0300000_14;
import android.os.Bundle;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupBodyLinkList;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupButton;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager;
import com.ss.android.ugc.aweme.pns.universalpopup.core.utils.SingleLiveEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class UniversalPopupViewModel extends ViewModel implements C8GL {
    public final int LJLIL;
    public final UniversalPopupResponse LJLILLLLZI;
    public final InterfaceC36824Ecm LJLJI;
    public final C73992T2e LJLJJI;
    public final InterfaceC82923WgZ LJLJJL;
    public final MediatorLiveData<Stack<UniversalPopup>> LJLJJLL;
    public final MutableLiveData<Stack<UniversalPopup>> LJLJL;
    public final SingleLiveEvent<AbstractC82929Wgf> LJLJLJ;
    public final LinkedList<UniversalPopup> LJLJLLL;
    public final Map<String, UniversalPopup> LJLL;
    public final Map<String, String> LJLLI;

    public final void gv0() {
        InterfaceC82923WgZ interfaceC82923WgZ = this.LJLJJL;
        if (interfaceC82923WgZ != null) {
            interfaceC82923WgZ.LJ(this.LJLLI);
        }
        MutableLiveData<Stack<UniversalPopup>> mutableLiveData = this.LJLJL;
        Stack<UniversalPopup> value = mutableLiveData.getValue();
        if (value != null) {
            value.clear();
        }
        mutableLiveData.setValue(mutableLiveData.getValue());
        Stack<UniversalPopup> value2 = this.LJLJL.getValue();
        if (value2 == null || value2.size() != 0) {
            return;
        }
        hv0();
    }

    public final void hv0() {
        if (!this.LJLJLLL.isEmpty()) {
            UniversalPopup pop = this.LJLJLLL.pop();
            MutableLiveData<Stack<UniversalPopup>> mutableLiveData = this.LJLJL;
            Stack<UniversalPopup> value = mutableLiveData.getValue();
            if (value != null) {
                value.add(pop);
            }
            mutableLiveData.setValue(mutableLiveData.getValue());
            return;
        }
        InterfaceC82923WgZ interfaceC82923WgZ = this.LJLJJL;
        if (interfaceC82923WgZ != null) {
            interfaceC82923WgZ.LJ(this.LJLLI);
        }
        this.LJLJLJ.setValue(C82930Wgg.LIZ);
    }

    public final void iv0() {
        UniversalPopup peek;
        Stack<UniversalPopup> value = this.LJLJL.getValue();
        if (value == null || (peek = value.peek()) == null) {
            return;
        }
        C73992T2e c73992T2e = this.LJLJJI;
        String business = peek.getBusiness();
        String style = peek.getStyle();
        c73992T2e.getClass();
        o.LJIIIZ(business, "business");
        o.LJIIIZ(style, "style");
        try {
            AppLogNewUtils.LIZJ("pns_popup_shown", AnonymousClass036.LIZJ("business", business, "style", style));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.C8GL
    public final void P00(String actionId) {
        Stack<UniversalPopup> value;
        UniversalPopup peek;
        UniversalPopupButton universalPopupButton;
        UniversalPopupBodyLinkList universalPopupBodyLinkList;
        UniversalPopupBodyLinkList universalPopupBodyLinkList2;
        UniversalPopupAction action;
        boolean z;
        UniversalPopup peek2;
        o.LJIIIZ(actionId, "actionId");
        Stack<UniversalPopup> value2 = this.LJLJL.getValue();
        if ((value2 != null && value2.isEmpty()) || (value = this.LJLJL.getValue()) == null || (peek = value.peek()) == null) {
            return;
        }
        Iterator<UniversalPopupButton> it = peek.getButtons().iterator();
        while (true) {
            if (it.hasNext()) {
                universalPopupButton = it.next();
                if (o.LJ(universalPopupButton.getAction().getActionId(), actionId)) {
                    break;
                }
            } else {
                universalPopupButton = null;
                break;
            }
        }
        UniversalPopupButton universalPopupButton2 = universalPopupButton;
        List<UniversalPopupBodyLinkList> popupLinkList = peek.getPopupLinkList();
        if (popupLinkList == null) {
            universalPopupBodyLinkList2 = null;
        } else {
            Iterator<UniversalPopupBodyLinkList> it2 = popupLinkList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    universalPopupBodyLinkList = it2.next();
                    if (o.LJ(universalPopupBodyLinkList.getAction().getActionId(), actionId)) {
                        break;
                    }
                } else {
                    universalPopupBodyLinkList = null;
                    break;
                }
            }
            universalPopupBodyLinkList2 = universalPopupBodyLinkList;
        }
        if ((universalPopupButton2 == null || (action = universalPopupButton2.getAction()) == null) && (universalPopupBodyLinkList2 == null || (action = universalPopupBodyLinkList2.getAction()) == null)) {
            return;
        }
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("business", peek.getBusiness()), new OSZ("style", peek.getStyle()));
        Map<String, String> extra = peek.getExtra();
        if (extra != null) {
            LJJLIIIIJ.putAll(extra);
        }
        InterfaceC82923WgZ interfaceC82923WgZ = this.LJLJJL;
        if (interfaceC82923WgZ != null) {
            interfaceC82923WgZ.LIZ(action, LJJLIIIIJ);
        }
        if (action.getApprove()) {
            Stack<UniversalPopup> value3 = this.LJLJL.getValue();
            if (value3 != null && (peek2 = value3.peek()) != null) {
                C73992T2e c73992T2e = this.LJLJJI;
                String business = peek2.getBusiness();
                c73992T2e.getClass();
                o.LJIIIZ(business, "business");
                try {
                    AppLogNewUtils.LIZJ("pns_popup_approve", C0H1.LIZ("business", business));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                this.LJLJI.LIZIZ(this.LJLIL, peek2.getBusiness(), C113554cx.LJJL(new OSZ("policy_version", peek2.getPolicyVersion()), new OSZ("style", peek2.getStyle()), new OSZ("extra", action.getExtra()), new OSZ("operation", String.valueOf(action.getOperation())))).LJ(new AgS77S0300000_14(this, action, LJJLIIIIJ, 1), C10K.LJIIIIZZ, null);
            }
        } else {
            for (String str : action.getCustomizedActions()) {
                InterfaceC82923WgZ interfaceC82923WgZ2 = this.LJLJJL;
                if (interfaceC82923WgZ2 != null) {
                    interfaceC82923WgZ2.LIZIZ(str, LJJLIIIIJ);
                }
            }
        }
        Boolean dismiss = action.getDismiss();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(dismiss, bool)) {
            MutableLiveData<Stack<UniversalPopup>> mutableLiveData = this.LJLJL;
            Stack<UniversalPopup> value4 = mutableLiveData.getValue();
            if (value4 != null) {
                value4.pop();
            }
            mutableLiveData.setValue(mutableLiveData.getValue());
            C73992T2e c73992T2e2 = this.LJLJJI;
            String business2 = peek.getBusiness();
            String style = peek.getStyle();
            c73992T2e2.getClass();
            o.LJIIIZ(business2, "business");
            o.LJIIIZ(style, "style");
            try {
                AppLogNewUtils.LIZJ("pns_popup_dismissed", AnonymousClass036.LIZJ("business", business2, "style", style));
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        if (o.LJ(action.getDismissAll(), bool)) {
            gv0();
        }
        String linkType = action.getLinkType();
        if (o.LJ(linkType, C8GI.LINK_TYPE_EXTERNAL.getValue())) {
            this.LJLJLJ.setValue(new C82927Wgd(action.getLink()));
        } else if (o.LJ(linkType, C8GI.LINK_TYPE_INTERNAL.getValue())) {
            SingleLiveEvent<AbstractC82929Wgf> singleLiveEvent = this.LJLJLJ;
            String link = action.getLink();
            if (universalPopupBodyLinkList2 != null) {
                z = true;
            } else {
                z = false;
            }
            singleLiveEvent.setValue(new C82926Wgc(link, z));
        } else if (o.LJ(linkType, C8GI.LINK_TYPE_POP.getValue())) {
            String nextPopUp = action.getNextPopUp();
            if (nextPopUp == null) {
                nextPopUp = action.getLink();
            }
            Object obj = ((LinkedHashMap) this.LJLL).get(nextPopUp);
            if (obj != null) {
                MutableLiveData<Stack<UniversalPopup>> mutableLiveData2 = this.LJLJL;
                Vector value5 = mutableLiveData2.getValue();
                if (value5 != null) {
                    value5.add(obj);
                }
                mutableLiveData2.setValue(mutableLiveData2.getValue());
            }
        } else if (o.LJ(linkType, C8GI.LINK_TYPE_UPGRADE.getValue())) {
            this.LJLJLJ.setValue(C82931Wgh.LIZ);
        }
        Stack<UniversalPopup> value6 = this.LJLJL.getValue();
        if (value6 != null && value6.size() == 0 && (action.getApprove() || o.LJ(action.getDismiss(), bool))) {
            hv0();
        }
        C73992T2e c73992T2e3 = this.LJLJJI;
        String action2 = action.getCustomizedActions().toString();
        String business3 = peek.getBusiness();
        String style2 = peek.getStyle();
        Integer valueOf = Integer.valueOf(action.getOperation());
        c73992T2e3.getClass();
        o.LJIIIZ(action2, "action");
        o.LJIIIZ(business3, "business");
        o.LJIIIZ(style2, "style");
        Bundle LIZJ = AnonymousClass036.LIZJ("business", business3, "style", style2);
        LIZJ.putString("operation", String.valueOf(valueOf));
        LIZJ.putString("action", action2);
        try {
            AppLogNewUtils.LIZJ("pns_popup_click", LIZJ);
        } catch (Exception e3) {
            C16880lQ.LLLLIIL(e3);
        }
    }

    public UniversalPopupViewModel(int i, UniversalPopupResponse universalPopupResponse, InterfaceC36824Ecm loader, C73992T2e logger, InterfaceC82923WgZ interfaceC82923WgZ) {
        List<UniversalPopup> popups;
        UniversalPopup universalPopup;
        List<UniversalPopup> popups2;
        List<UniversalPopup> popups3;
        o.LJIIIZ(loader, "loader");
        o.LJIIIZ(logger, "logger");
        this.LJLIL = i;
        this.LJLILLLLZI = universalPopupResponse;
        this.LJLJI = loader;
        this.LJLJJI = logger;
        this.LJLJJL = interfaceC82923WgZ;
        MediatorLiveData<Stack<UniversalPopup>> mediatorLiveData = new MediatorLiveData<>();
        this.LJLJJLL = mediatorLiveData;
        MutableLiveData<Stack<UniversalPopup>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new Stack<>());
        this.LJLJL = mutableLiveData;
        this.LJLJLJ = new SingleLiveEvent<>();
        this.LJLJLLL = new LinkedList<>();
        this.LJLL = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LJLLI = linkedHashMap;
        if (universalPopupResponse != null && (popups = universalPopupResponse.getPopups()) != null && (universalPopup = (UniversalPopup) ORZ.LJLLLLLL(0, popups)) != null) {
            linkedHashMap.put("business", universalPopup.getBusiness());
            linkedHashMap.put("style", universalPopup.getStyle());
            Map<String, String> extra = universalPopup.getExtra();
            if (extra != null) {
                linkedHashMap.putAll(extra);
            }
        }
        mediatorLiveData.addSource(mutableLiveData, new AObserverS64S0101000_14(2, this, 8));
        if (universalPopupResponse != null && (popups2 = universalPopupResponse.getPopups()) != null) {
            ArrayList arrayList = new ArrayList();
            for (UniversalPopup universalPopup2 : popups2) {
                if (o.LJ(universalPopup2.isSubPopUp(), Boolean.FALSE)) {
                    arrayList.add(universalPopup2);
                }
            }
            this.LJLJLLL.addAll(arrayList);
        }
        UniversalPopupResponse universalPopupResponse2 = this.LJLILLLLZI;
        if (universalPopupResponse2 != null && (popups3 = universalPopupResponse2.getPopups()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (UniversalPopup universalPopup3 : popups3) {
                if (o.LJ(universalPopup3.isSubPopUp(), Boolean.TRUE)) {
                    arrayList2.add(universalPopup3);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                UniversalPopup universalPopup4 = (UniversalPopup) it.next();
                this.LJLL.put(universalPopup4.getBusiness(), universalPopup4);
            }
        }
        UniversalPopupManager.LJIIIZ.observeForever(new AObserverS64S0101000_14(0, this, 7));
        InterfaceC82923WgZ interfaceC82923WgZ2 = this.LJLJJL;
        if (interfaceC82923WgZ2 != null) {
            interfaceC82923WgZ2.LIZJ(this.LJLLI);
        }
        hv0();
    }
}
