package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui;

import X.AbstractC108304Mw;
import X.ActivityC45651qj;
import X.C109774Sn;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C36W;
import X.C3C5;
import X.C41140GCq;
import X.C4SZ;
import X.C4T8;
import X.C56642Ke;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C772831o;
import X.C78496UrM;
import X.C78926UyI;
import X.C78983UzD;
import X.C80763Ey;
import X.C83263Oo;
import X.C85323Wm;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EnumC97443s4;
import X.InterfaceC109644Sa;
import X.InterfaceC109664Sc;
import X.InterfaceC36571c5;
import X.InterfaceC65350Pko;
import X.ORZ;
import X.OSZ;
import X.QD3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class MessageRequestFragment extends BaseFragment {
    public final C214298b3 LJLIL;
    public boolean LJLILLLLZI;
    public EnumC97443s4 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MessageRequestFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageRequestViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 573);
        C4SZ c4sz = C4SZ.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c4sz, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c4sz, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
    }

    public final void vl() {
        MessageRequestsActivity messageRequestsActivity;
        boolean z;
        int i;
        String str;
        if (this.LJLILLLLZI) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Integer num = null;
        if (mo49getActivity instanceof MessageRequestsActivity) {
            messageRequestsActivity = (MessageRequestsActivity) mo49getActivity;
        } else {
            messageRequestsActivity = null;
        }
        if (messageRequestsActivity != null) {
            EnumC97443s4 enumC97443s4 = this.LJLJI;
            if (enumC97443s4 != null) {
                Boolean bool = messageRequestsActivity.LJLJJLL.LIZLLL.get(enumC97443s4);
                if (bool == null || !bool.booleanValue() || !((C4T8) ((AssemViewModel) this.LJLIL.getValue()).getState()).LJLJJLL) {
                    return;
                }
                this.LJLILLLLZI = true;
                int size = ((C4T8) ((AssemViewModel) this.LJLIL.getValue()).getState()).LJLJJL.size();
                EnumC97443s4 enumC97443s42 = this.LJLJI;
                if (enumC97443s42 != null) {
                    if (enumC97443s42 == EnumC97443s4.FILTERED) {
                        z = true;
                    } else {
                        z = false;
                    }
                    User LIZJ = C80763Ey.LIZJ();
                    if (LIZJ != null) {
                        num = Integer.valueOf(LIZJ.getAccountType());
                        i = LIZJ.getFollowerCount();
                    } else {
                        i = 0;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (i > 1000) {
                        arrayList.add("creator");
                    }
                    if (num != null && num.intValue() == 3) {
                        arrayList.add("ttba");
                    }
                    String LLD = ORZ.LLD(arrayList, null, null, null, null, 63);
                    C85323Wm onEventV3 = C772831o.LIZ();
                    o.LJIIIZ(onEventV3, "onEventV3");
                    OSZ[] oszArr = new OSZ[4];
                    oszArr[0] = new OSZ("enter_from", "notification_page");
                    oszArr[1] = new OSZ("num", String.valueOf(size));
                    if (z) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    oszArr[2] = new OSZ("is_filtered", str);
                    oszArr[3] = new OSZ("receiver_user_type", LLD);
                    onEventV3.LIZIZ("enter_message_request_list", C113554cx.LJJL(oszArr));
                    return;
                }
                o.LJIJI("requestType");
                throw null;
            }
            o.LJIJI("requestType");
            throw null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        fragmentConfiguration(C41140GCq.LJLIL);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("STRANGER_REQUEST_TYPE")) {
            i = arguments.getInt("STRANGER_REQUEST_TYPE");
        } else {
            i = 0;
        }
        this.LJLJI = EnumC97443s4.values()[i];
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        FragmentManager fragmentManager;
        o.LJIIIZ(event, "event");
        try {
            InterfaceC109664Sc inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService();
            if (inboxAdapterService != null) {
                String string = JSONObjectProtectorUtils.getString(event.LJLIL, "eventName");
                o.LJIIIIZZ(string, "event.params.getString(\"eventName\")");
                Lifecycle.State currentState = getLifecycle().getCurrentState();
                o.LJIIIIZZ(currentState, "this@MessageRequestFragment.lifecycle.currentState");
                if (inboxAdapterService.LJIIJ(string, currentState) && (fragmentManager = getFragmentManager()) != null) {
                    inboxAdapterService.LIZJ(fragmentManager, C36W.REPORT, null);
                }
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        InterfaceC109644Sa interfaceC109644Sa;
        AbstractC108304Mw LIZ;
        boolean z;
        o.LJIIIZ(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("STRANGER_REQUEST_INDEX")) {
            i = arguments.getInt("STRANGER_REQUEST_INDEX");
        } else {
            i = 0;
        }
        InterfaceC36571c5 mo49getActivity = mo49getActivity();
        if (mo49getActivity instanceof InterfaceC109644Sa) {
            interfaceC109644Sa = (InterfaceC109644Sa) mo49getActivity;
        } else {
            interfaceC109644Sa = null;
        }
        if (interfaceC109644Sa == null || (LIZ = interfaceC109644Sa.LJJJJI(i)) == null) {
            C78983UzD.LJIILJJIL();
            EnumC97443s4 enumC97443s4 = this.LJLJI;
            if (enumC97443s4 != null) {
                LIZ = C83263Oo.LIZ(10, enumC97443s4);
            } else {
                o.LJIJI("requestType");
                throw null;
            }
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.containsKey("TAB_LAYOUT_VISIBLE")) {
            z = arguments2.getBoolean("TAB_LAYOUT_VISIBLE");
        } else {
            z = false;
        }
        EnumC97443s4 enumC97443s42 = this.LJLJI;
        if (enumC97443s42 != null) {
            C8VV.LIZ(this, false, new AqS132S0200000_1(this, new C109774Sn(enumC97443s42, LIZ, z), 24));
        } else {
            o.LJIJI("requestType");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.b2h, viewGroup, false, "inflater.inflate(R.layou…t_page, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }
}
