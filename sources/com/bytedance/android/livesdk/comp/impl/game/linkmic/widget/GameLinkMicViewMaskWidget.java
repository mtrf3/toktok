package com.bytedance.android.livesdk.comp.impl.game.linkmic.widget;

import X.C0NB;
import X.C15380j0;
import X.C221108m2;
import X.C28268B7o;
import X.C28329B9x;
import X.C29306Beo;
import X.C62822Ol8;
import X.C73943T0h;
import X.C74760TVs;
import X.C74779TWl;
import X.C75377Ti9;
import X.EnumC31509CYf;
import X.InterfaceC74759TVr;
import X.TSM;
import X.TSN;
import X.TSO;
import X.TT0;
import X.TTR;
import X.TU4;
import X.TV2;
import X.TYP;
import X.X1D;
import Y.AfS65S0100000_13;
import Y.IDComparatorS41S0000000_13;
import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.GameLinkLayoutLandDataChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGuestNumChannel;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkLayoutDataChannel;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkMicViewSmallStyle;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.GameLinkMaskViewModel;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkListChangeContent;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GameLinkMicViewMaskWidget extends LiveWidget implements OnMessageListener {
    public final TTR LJLIL;
    public final TT0 LJLILLLLZI;
    public final HashMap<String, GameLinkMicMaskGuestItemWidget> LJLJI;
    public final HashMap<String, Integer> LJLJJI;
    public final TreeMap<Long, String> LJLJJL;
    public ViewGroup.MarginLayoutParams LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final TSM LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final Map<String, SurfaceView> LJLLLL;
    public final TSO LJLLLLLL;
    public final IDComparatorS41S0000000_13 LJLZ;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final GameLinkMaskViewModel LJZ() {
        return (GameLinkMaskViewModel) this.LJLJL.getValue();
    }

    public final InterfaceC74759TVr LJZI() {
        return (InterfaceC74759TVr) this.LJLLL.getValue();
    }

    public final int LJZL() {
        return ((Number) this.LJLLJ.getValue()).intValue();
    }

    public final int LL() {
        return ((Number) this.LJLLILLLL.getValue()).intValue();
    }

    public final boolean LLF() {
        return ((Boolean) this.LJLJLLL.getValue()).booleanValue();
    }

    public final void LLFII() {
        String str;
        GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget;
        TreeMap treeMap = new TreeMap(this.LJLZ);
        for (Map.Entry entry : ((HashMap) LJZ().LJLIL).entrySet()) {
            C74779TWl c74779TWl = (C74779TWl) entry.getValue();
            if (c74779TWl != null && (str = c74779TWl.LIZ.mInteractIdStr) != null && !TextUtils.isEmpty(str) && (gameLinkMicMaskGuestItemWidget = this.LJLJI.get(str)) != null) {
                treeMap.put(Integer.valueOf(((C74779TWl) entry.getValue()).LIZIZ), gameLinkMicMaskGuestItemWidget);
            }
        }
        Iterator it = treeMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget2 = (GameLinkMicMaskGuestItemWidget) ((Map.Entry) it.next()).getValue();
            if (i >= 0) {
                LJZI().LIZLLL(i, gameLinkMicMaskGuestItemWidget2.LJLILLLLZI);
            }
            i++;
        }
    }

    public final void LLFFF() {
        for (Map.Entry entry : ((HashMap) LJZ().LJLIL).entrySet()) {
            String str = ((C74779TWl) entry.getValue()).LIZ.mInteractIdStr;
            if (str != null) {
                Integer num = this.LJLJJI.get(str);
                if (num == null) {
                    num = -1;
                }
                o.LJIIIIZZ(num, "positionDataMap[linkMicId] ?: -1");
                ((C74779TWl) entry.getValue()).LIZIZ = num.intValue() - 1;
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return LJZI().getLayoutId();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        TT0 LJ;
        TU4 LIZ;
        super.onCreate();
        C0NB.LJIIIZ("GameLinkMicViewMaskWidget", "onCreate()");
        enableSubWidgetManager(C28329B9x.LIZJ(getContext()));
        LJZI().LIZJ(this);
        if (!LLF()) {
            this.dataChannel.lv0(this, GameLinkGuestNumChannel.class, new AqS179S0100000_13(this, 313));
        } else {
            DataChannel dataChannel = this.dataChannel;
            dataChannel.lv0(this, GameLinkGuestNumChannel.class, new AqS179S0100000_13(this, 314));
            dataChannel.lv0(this, GameLinkMicViewSmallStyle.class, new AqS179S0100000_13(this, 315));
        }
        this.LJLIL.LJI(new AqS179S0100000_13(this, 316));
        this.LJLIL.e3(this.LJLL);
        TT0 tt0 = this.LJLILLLLZI;
        if (tt0 != null) {
            tt0.LIZLLL(this.LJLLLLLL);
        }
        IMessageManager iMessageManager = (IMessageManager) this.LJLJLJ.getValue();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.BASE_LINK_LAYER_MESSAGE.getIntType(), this);
        }
        C73943T0h.LIZ().LIZJ(this, C28268B7o.class).LIZIZ(new AfS65S0100000_13(this, 80));
        TT0 LJ2 = this.LJLIL.LJ();
        if (LJ2 != null && LJ2.isInit() && (LJ = this.LJLIL.LJ()) != null && (LIZ = LJ.LIZ()) != null) {
            ArrayList arrayList = new ArrayList();
            for (LinkListUser linkListUser : LIZ.LIZLLL()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getAllUserInfo: linkStatus=");
                LIZ2.append(linkListUser.LIZ);
                LIZ2.append(", linkId=");
                LIZ2.append(linkListUser.linkMicId);
                LIZ2.append(", roleType=");
                LIZ2.append(linkListUser.roleType);
                TYP.LIZJ("GameLinkMicViewMaskWidget", X1D.LIZIZ(LIZ2));
                if (linkListUser.LIZ == 2) {
                    arrayList.add(TV2.LIZ(linkListUser));
                }
            }
            LLFF(arrayList);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C0NB.LJIIIZ("GameLinkMicViewMaskWidget", "onDestroy");
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        dataChannel.rv0(GameLinkLayoutDataChannel.class, new C74760TVs(0));
        DataChannel dataChannel2 = this.dataChannel;
        o.LJIIIIZZ(dataChannel2, "dataChannel");
        dataChannel2.rv0(GameLinkLayoutLandDataChannel.class, 0);
        ((HashMap) this.LJLLLL).clear();
        this.LJLJI.clear();
        this.LJLIL.LJI(null);
        this.LJLIL.X3(this.LJLL);
        IMessageManager iMessageManager = (IMessageManager) this.LJLJLJ.getValue();
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.BASE_LINK_LAYER_MESSAGE.getIntType(), this);
        }
        TT0 tt0 = this.LJLILLLLZI;
        if (tt0 != null) {
            tt0.LJ(this.LJLLLLLL);
        }
    }

    public final void LLFF(List<LinkPlayerInfo> list) {
        String str;
        RecyclableWidgetManager recyclableWidgetManager;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onListChange linkedUsers size = ");
        LIZ.append(list.size());
        TYP.LIZJ("GameLinkMicViewMaskWidget", X1D.LIZIZ(LIZ));
        HashSet hashSet = new HashSet();
        for (LinkPlayerInfo linkPlayerInfo : list) {
            String str2 = linkPlayerInfo.mInteractIdStr;
            if (str2 != null && linkPlayerInfo.mRoleType != 1) {
                hashSet.add(str2);
            }
        }
        HashMap<String, GameLinkMicMaskGuestItemWidget> hashMap = this.LJLJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, GameLinkMicMaskGuestItemWidget> entry : hashMap.entrySet()) {
            if (!hashSet.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onListChange need2Delete size = ");
        LIZ2.append(linkedHashMap.size());
        TYP.LIZJ("GameLinkMicViewMaskWidget", X1D.LIZIZ(LIZ2));
        ArrayList arrayList = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo2 : list) {
            LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo2;
            if (linkPlayerInfo3.mRoleType != 1 && !this.LJLJI.containsKey(linkPlayerInfo3.mInteractIdStr)) {
                arrayList.add(linkPlayerInfo2);
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onListChange need2Add size = ");
        LIZ3.append(arrayList.size());
        TYP.LIZJ("GameLinkMicViewMaskWidget", X1D.LIZIZ(LIZ3));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            String str3 = (String) ((Map.Entry) it.next()).getKey();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("removeGuestBizMask linkMicId = ");
            LIZ4.append(str3);
            TYP.LIZJ("GameLinkMicViewMaskWidget", X1D.LIZIZ(LIZ4));
            ((HashMap) LJZ().LJLIL).remove(str3);
            GameLinkMicMaskGuestItemWidget remove = this.LJLJI.remove(str3);
            if (remove != null && (recyclableWidgetManager = this.subWidgetManager) != null) {
                recyclableWidgetManager.unload(remove);
            }
            this.dataChannel.rv0(GameLinkGuestNumChannel.class, Integer.valueOf(this.LJLJI.size()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LinkPlayerInfo linkPlayerInfo4 = (LinkPlayerInfo) it2.next();
            C74779TWl c74779TWl = (C74779TWl) ((HashMap) LJZ().LJLIL).get(linkPlayerInfo4.mInteractIdStr);
            if (c74779TWl == null) {
                c74779TWl = new C74779TWl(linkPlayerInfo4);
            }
            Map<String, C74779TWl> map = LJZ().LJLIL;
            String str4 = linkPlayerInfo4.mInteractIdStr;
            o.LJIIIIZZ(str4, "it.interactId");
            ((HashMap) map).put(str4, c74779TWl);
            String str5 = c74779TWl.LIZ.mInteractIdStr;
            if (str5 == null || TextUtils.isEmpty(str5) || this.LJLJI.get(str5) == null) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("createGuestBizMask context = ");
                LIZ5.append(this.context);
                LIZ5.append(", linkMicId=");
                LIZ5.append(c74779TWl.LIZ.mInteractIdStr);
                TYP.LIZJ("GameLinkMicViewMaskWidget", X1D.LIZIZ(LIZ5));
                if (this.context != null && (str = c74779TWl.LIZ.mInteractIdStr) != null) {
                    Context context = this.context;
                    o.LJIIIIZZ(context, "context");
                    C75377Ti9 c75377Ti9 = new C75377Ti9(context);
                    InterfaceC74759TVr LJZI = LJZI();
                    View contentView = this.contentView;
                    o.LJIIIIZZ(contentView, "contentView");
                    LJZI.LIZ(contentView, c75377Ti9);
                    ((HashMap) LJZ().LJLIL).put(str, c74779TWl);
                    GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget = new GameLinkMicMaskGuestItemWidget(c74779TWl, c75377Ti9);
                    RecyclableWidgetManager recyclableWidgetManager2 = this.subWidgetManager;
                    if (recyclableWidgetManager2 != null) {
                        recyclableWidgetManager2.load(gameLinkMicMaskGuestItemWidget);
                    }
                    this.LJLJI.put(str, gameLinkMicMaskGuestItemWidget);
                    this.dataChannel.rv0(GameLinkGuestNumChannel.class, Integer.valueOf(this.LJLJI.size()));
                }
            }
        }
        if ((!arrayList.isEmpty()) || (!linkedHashMap.isEmpty())) {
            LLFFF();
            LLFII();
        }
    }

    public final void onEventPause(C28268B7o c28268B7o) {
        int i = c28268B7o.LIZ;
        if (i != 30) {
            if (i != 31) {
                if (i != 36) {
                    if (i != 37) {
                        return;
                    }
                }
            }
            for (Map.Entry entry : ((HashMap) this.LJLLLL).entrySet()) {
                View view = this.contentView;
                o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) view).addView((View) entry.getValue(), 0, this.LJLJJLL);
            }
            return;
        }
        Iterator it = ((HashMap) this.LJLLLL).entrySet().iterator();
        while (it.hasNext()) {
            C29306Beo.LJJIJIIJIL((View) ((Map.Entry) it.next()).getValue());
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AllListUser allListUser;
        List<LinkLayerListUser> list;
        if (iMessage instanceof LinkLayerMessage) {
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
            if (linkLayerMessage.messageType == 11) {
                this.LJLJJL.clear();
                LinkListChangeContent linkListChangeContent = linkLayerMessage.listContent;
                if (linkListChangeContent != null && (allListUser = linkListChangeContent.userList) != null && (list = allListUser.linkedList) != null) {
                    for (LinkLayerListUser linkLayerListUser : list) {
                        this.LJLJJL.put(Long.valueOf(linkLayerListUser.linkedTimeNano), linkLayerListUser.linkMicId);
                    }
                }
                Iterator<Map.Entry<Long, String>> it = this.LJLJJL.entrySet().iterator();
                int i = 0;
                while (it.hasNext()) {
                    this.LJLJJI.put(it.next().getValue(), Integer.valueOf(i));
                    i++;
                }
                LLFFF();
                LLFII();
            }
        }
    }

    public GameLinkMicViewMaskWidget(TTR gameLinkManager, TT0 tt0) {
        o.LJIIIZ(gameLinkManager, "gameLinkManager");
        this.LJLIL = gameLinkManager;
        this.LJLILLLLZI = tt0;
        IDComparatorS41S0000000_13 iDComparatorS41S0000000_13 = new IDComparatorS41S0000000_13(7);
        this.LJLJI = new HashMap<>();
        this.LJLJJI = new HashMap<>();
        this.LJLJJL = new TreeMap<>(iDComparatorS41S0000000_13);
        C221108m2.LIZIZ(TSN.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 209));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 213));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 212));
        this.LJLL = new TSM(this);
        this.LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 211));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 215));
        this.LJLLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 214));
        this.LJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 210));
        this.LJLLLL = new HashMap();
        this.LJLLLLLL = new TSO(this);
        this.LJLZ = new IDComparatorS41S0000000_13(6);
    }

    public final void LJLZ(int i, boolean z) {
        int height;
        if (i > 0) {
            if (z) {
                height = C15380j0.LIZ(64.0f);
            } else {
                height = LJZI().getHeight() + C15380j0.LIZ(8.0f);
            }
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            dataChannel.rv0(GameLinkLayoutLandDataChannel.class, Integer.valueOf(height));
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        o.LJIIIIZZ(dataChannel2, "dataChannel");
        dataChannel2.rv0(GameLinkLayoutLandDataChannel.class, 0);
    }
}
