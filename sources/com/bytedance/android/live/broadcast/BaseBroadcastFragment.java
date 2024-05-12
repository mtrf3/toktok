package com.bytedance.android.live.broadcast;

import X.ActivityC45651qj;
import X.B3E;
import X.B4U;
import X.B83;
import X.B8A;
import X.BEF;
import X.BHA;
import X.BJO;
import X.BM1;
import X.C10A;
import X.C141335gf;
import X.C29032BaO;
import X.C29040BaW;
import X.C29044Baa;
import X.C29049Baf;
import X.C29108Bbc;
import X.C29263Be7;
import X.C29494Bhq;
import X.C29824BnA;
import X.C29927Bop;
import X.C29S;
import X.C30382BwA;
import X.C30385BwD;
import X.C30725C4b;
import X.C32537Cpp;
import X.C3C5;
import X.C3V;
import X.C54982Du;
import X.C55002Dw;
import X.C55012Dx;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC31509CYf;
import X.InterfaceC27469AqH;
import X.InterfaceC28236B6i;
import X.InterfaceC29405BgP;
import X.InterfaceC36571c5;
import X.InterfaceC86149XrV;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.game.model.AccessRecallMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class BaseBroadcastFragment extends BaseFragment implements InterfaceC86149XrV, InterfaceC28236B6i {
    public DataChannel LJLIL;
    public boolean LJLILLLLZI;
    public Room LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public boolean Dl() {
        return false;
    }

    public void Gl() {
    }

    public void Hl(int i, int i2, Intent intent) {
    }

    public void Il() {
    }

    public View Jl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        return null;
    }

    public void Kl() {
    }

    public void Ll() {
    }

    public void Ml() {
    }

    public void Nl() {
    }

    public void Ol() {
    }

    public void Pl() {
    }

    public void Ql(View view) {
        o.LJIIIZ(view, "view");
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.InterfaceC86149XrV
    public void finish() {
    }

    @Override // X.InterfaceC86149XrV
    public Fragment getFragment() {
        return this;
    }

    public void wl() {
    }

    public final DataChannel LJIIL() {
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            return dataChannel;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29824BnA.class);
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C54982Du.class);
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C30385BwD.class);
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C30382BwA.class);
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C55002Dw.class);
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C55012Dx.class);
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29049Baf.class);
        BM1.LIZJ();
        dataChannelGlobal.jv0(this);
        LJIIL().jv0(this);
        B4U.LIZ().LJJIIJ();
        super.onDestroy();
        if (this.LJLILLLLZI) {
            return;
        }
        Kl();
        B4U.LIZ().LJJIIZ(false);
        ((C32537Cpp) dataChannelGlobal.gv0(C29032BaO.class)).LIZ = Boolean.FALSE;
    }

    public final void vl() {
        IMessageManager iMessageManager;
        if (!this.LJLJJL && this.LJLIL != null && (iMessageManager = (IMessageManager) LJIIL().kv0(C29927Bop.class)) != null) {
            this.LJLJJL = true;
            iMessageManager.addMessageListener(EnumC31509CYf.ACCESS_RECALL_MESSAGE.getIntType(), new OnIMMessageListener() { // from class: X.1j2
                @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
                public final String messageListenerBizTag() {
                    return "LIVE_BAN_CAPABILITY";
                }

                @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
                public final IMListenerType messageListenerType() {
                    return IMListenerType.SYNC;
                }

                @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
                public final void onMessage(IMessage iMessage) {
                    if (iMessage instanceof AccessRecallMessage) {
                        BaseBroadcastFragment baseBroadcastFragment = BaseBroadcastFragment.this;
                        AccessRecallMessage accessRecallMessage = (AccessRecallMessage) iMessage;
                        if (baseBroadcastFragment.LJLIL != null) {
                            BEF bef = (BEF) baseBroadcastFragment.LJIIL().kv0(LiveBanCapabilityChannel.class);
                            if (bef != null) {
                                String str = accessRecallMessage.scene;
                                o.LJIIIZ(str, "<set-?>");
                                bef.LJLJJLL = str;
                            }
                            String str2 = accessRecallMessage.scene;
                            boolean z = false;
                            switch (str2.hashCode()) {
                                case -1980625194:
                                    if (str2.equals("STICKERS")) {
                                        if (bef == null) {
                                            return;
                                        }
                                        if (accessRecallMessage.status == 1) {
                                            z = true;
                                        }
                                        bef.LJLJI = z;
                                        baseBroadcastFragment.LJIIL().rv0(LiveBanCapabilityChannel.class, bef);
                                    }
                                    break;
                                case -1723429900:
                                    if (str2.equals("DRAW_AND_GUESS")) {
                                        if (bef == null) {
                                            return;
                                        }
                                        if (accessRecallMessage.status == 1) {
                                            z = true;
                                        }
                                        bef.LJLIL = z;
                                        baseBroadcastFragment.LJIIL().rv0(LiveBanCapabilityChannel.class, bef);
                                    }
                                    break;
                                case -1689642695:
                                    if (str2.equals("LIVE_INTRO")) {
                                        if (bef == null) {
                                            return;
                                        }
                                        if (accessRecallMessage.status == 1) {
                                            z = true;
                                        }
                                        bef.LJLILLLLZI = z;
                                        baseBroadcastFragment.LJIIL().rv0(LiveBanCapabilityChannel.class, bef);
                                    }
                                    break;
                                case -37181579:
                                    if (str2.equals("COMMENT_PIN")) {
                                        if (bef == null) {
                                            return;
                                        }
                                        if (accessRecallMessage.status == 1) {
                                            z = true;
                                        }
                                        bef.LJLJJL = z;
                                        baseBroadcastFragment.LJIIL().rv0(LiveBanCapabilityChannel.class, bef);
                                    }
                                    break;
                                case 2461631:
                                    if (str2.equals("POLL")) {
                                        if (bef == null) {
                                            return;
                                        }
                                        if (accessRecallMessage.status == 1) {
                                            z = true;
                                        }
                                        bef.LJLJJI = z;
                                        baseBroadcastFragment.LJIIL().rv0(LiveBanCapabilityChannel.class, bef);
                                    }
                                    break;
                            }
                            if (bef == null) {
                                return;
                            }
                            baseBroadcastFragment.LJIIL().rv0(LiveBanCapabilityChannel.class, bef);
                        }
                    }
                }
            });
        }
    }

    public final Room xl() {
        Room room = this.LJLJI;
        if (room != null) {
            return room;
        }
        o.LJIJI("mRoom");
        throw null;
    }

    public final long Al() {
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.getCurrentUserId();
        }
        return 0L;
    }

    public final long getRoomId() {
        return xl().getId();
    }

    @Override // X.InterfaceC86149XrV
    public boolean onBackPressed() {
        InterfaceC27469AqH interfaceC27469AqH;
        FragmentManager supportFragmentManager;
        List<Fragment> LJJJJLI;
        InterfaceC27469AqH interfaceC27469AqH2;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null && (LJJJJLI = supportFragmentManager.LJJJJLI()) != null) {
            for (InterfaceC36571c5 interfaceC36571c5 : LJJJJLI) {
                if ((interfaceC36571c5 instanceof InterfaceC27469AqH) && (interfaceC27469AqH2 = (InterfaceC27469AqH) interfaceC36571c5) != null && interfaceC27469AqH2.onBackPressed()) {
                    return true;
                }
            }
        }
        List<Fragment> LJJJJLI2 = getChildFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI2, "childFragmentManager.fragments");
        for (InterfaceC36571c5 interfaceC36571c52 : LJJJJLI2) {
            if ((interfaceC36571c52 instanceof InterfaceC27469AqH) && (interfaceC27469AqH = (InterfaceC27469AqH) interfaceC36571c52) != null && interfaceC27469AqH.onBackPressed()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.LJLILLLLZI) {
            _$_clearFindViewByIdCache();
        } else {
            Ll();
            _$_clearFindViewByIdCache();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.LJLILLLLZI) {
            return;
        }
        Ml();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        wl();
        if (this.LJLILLLLZI) {
            return;
        }
        Nl();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.LJLILLLLZI) {
            return;
        }
        Ol();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LJLILLLLZI) {
            return;
        }
        Pl();
    }

    @Override // X.InterfaceC28236B6i
    public DataChannel provideDataChannel() {
        return LJIIL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        if (this.LJLILLLLZI) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(51);
        }
        if (!Dl() && !Room.isValid(xl())) {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                mo49getActivity2.finish();
            }
            this.LJLILLLLZI = true;
            return;
        }
        Gl();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.fragment.app.FragmentManager, O] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.bytedance.ies.sdk.datachannel.DataChannel, O] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.Context, O] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, O] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.B6s, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        GenericDeclaration genericDeclaration;
        BM1.LJIILIIL = true;
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C3V.class);
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29263Be7.class);
        ((C32537Cpp) dataChannelGlobal.gv0(C29032BaO.class)).LIZ = Boolean.valueOf(Dl());
        ViewModelProvider of = ViewModelProviders.of(this);
        o.LJIIIIZZ(of, "of(this)");
        DataChannel LIZ = BHA.LIZ(of, this);
        ((C32537Cpp) LIZ.gv0(C29494Bhq.class)).LIZ = getChildFragmentManager();
        this.LJLIL = LIZ;
        ((C32537Cpp) dataChannelGlobal.gv0(C55002Dw.class)).LIZ = LJIIL();
        ((C32537Cpp) dataChannelGlobal.gv0(C54982Du.class)).LIZ = getContext();
        super.onCreate(bundle);
        if (this.LJLJJI) {
            genericDeclaration = C29108Bbc.class;
        } else {
            genericDeclaration = C29044Baa.class;
        }
        Room room = (Room) dataChannelGlobal.mv0(genericDeclaration);
        if ((Dl() && room != null) || (Room.isValid(room) && room != null && room.getStreamUrl() != null)) {
            o.LJIIIZ(room, "<set-?>");
            this.LJLJI = room;
            if (Dl()) {
                xl().setCreateTime(C30725C4b.LIZ() / 1000);
            }
            ?? hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(xl().getOwnerUserId()));
            hashMap.put("room_id", String.valueOf(xl().getId()));
            ((C32537Cpp) dataChannelGlobal.gv0(C29824BnA.class)).LIZ = hashMap;
            B3E b3e = new B3E();
            b3e.LIZIZ = xl();
            b3e.LIZ = "live_take_detail";
            b3e.LIZLLL = new B8A(xl().getCreateTime());
            ?? LIZ2 = b3e.LIZ();
            ((C32537Cpp) dataChannelGlobal.gv0(C29049Baf.class)).LIZ = LIZ2;
            ((C32537Cpp) LJIIL().gv0(BJO.class)).LIZ = LIZ2;
            B4U.LIZ().LJJIIZ(true);
            Il();
            Object mv0 = dataChannelGlobal.mv0(C29040BaW.class);
            ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29040BaW.class);
            DataChannel LJIIL = LJIIL();
            if (mv0 == null) {
                mv0 = new BEF(0);
            }
            LJIIL.rv0(LiveBanCapabilityChannel.class, mv0);
            return;
        }
        this.LJLILLLLZI = true;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLILLLLZI) {
            return;
        }
        Ql(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.LJLILLLLZI) {
            return;
        }
        Hl(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View Jl;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        if (this.LJLILLLLZI) {
            Jl = null;
        } else {
            Jl = Jl(inflater, viewGroup);
        }
        if (!(Jl instanceof View)) {
            Jl = null;
        }
        if (Jl != null) {
            try {
                ViewTreeLifecycleOwner.set(Jl, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(Jl, this);
                C10A.LIZIZ(Jl, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return Jl;
    }
}
