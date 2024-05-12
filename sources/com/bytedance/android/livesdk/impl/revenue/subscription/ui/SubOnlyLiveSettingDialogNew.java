package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.B83;
import X.BIR;
import X.C15610jN;
import X.C16880lQ;
import X.C1EW;
import X.C221108m2;
import X.C223338pd;
import X.C28478BFq;
import X.C28479BFr;
import X.C28480BFs;
import X.C28507BGt;
import X.C28959BYd;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29402BgM;
import X.C41071jL;
import X.C47121t6;
import X.C62822Ol8;
import X.InterfaceC30442Bx8;
import X.Q7L;
import X.ViewOnTouchListenerC28475BFn;
import X.X1D;
import Y.ACListenerS14S1300000_5;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.ARunnableS6S1100000_5;
import Y.AfS54S0200000_5;
import Y.IDCListenerS206S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubOnlyAllowMusicSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubOnlyLiveSettingDialogNew extends LiveDialogFragment {
    public static final /* synthetic */ int LLF = 0;
    public LiveIconView LJLIL;
    public ViewGroup LJLILLLLZI;
    public ViewGroup LJLJI;
    public C41071jL LJLJJI;
    public ViewGroup LJLJJL;
    public C41071jL LJLJJLL;
    public ViewGroup LJLJL;
    public C41071jL LJLJLJ;
    public ViewGroup LJLJLLL;
    public ViewGroup LJLL;
    public C41071jL LJLLI;
    public ViewGroup LJLLILLLL;
    public C223338pd LJLLJ;
    public ViewGroup LJLLL;
    public Room LJLLLL;
    public LiveSubOnlyConfig LJLZ;
    public boolean LJZI;
    public boolean LJZL;
    public final Map<Integer, View> LLD = new LinkedHashMap();
    public String LJLLLLLL = "";
    public final BIR LJZ = new BIR();
    public final C62822Ol8 LL = C221108m2.LIZIZ(C28479BFr.INSTANCE);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLD;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d19);
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
            C29402BgM.LIZ(dataChannel, this.LJLLLLLL);
        }
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((Handler) this.LL.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJZI) {
            this.LJZI = false;
            C15610jN.LIZJ(new ARunnableS41S0100000_5(this, 152), 200L);
        }
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
        this.LJLLLL = room;
    }

    public final void vl(View view) {
        C41071jL c41071jL;
        if (o.LJ(this.LJLLLLLL, "anchor_close_live_popup")) {
            C29306Beo.LJJLIIIJJI(this.LJLIL, false);
        } else {
            LiveIconView liveIconView = this.LJLIL;
            if (liveIconView != null) {
                C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 319));
            }
        }
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            C29306Beo.LJJLJLI(viewGroup);
        }
        this.LJZ.LJ(mo49getActivity(), this.LJLJJI, this.LJLLLL, this.LJLZ);
        this.LJZ.LIZLLL(getContext(), this.LJLJJI, this.LJLJLJ, this.LJLJJL, this.LJLJL, this.LJLL, this.dataChannel, this.LJLLLL, this.LJLLLLLL);
        BIR bir = this.LJZ;
        Context context = getContext();
        ViewGroup viewGroup2 = this.LJLJI;
        DataChannel dataChannel = this.dataChannel;
        String enterFrom = this.LJLLLLLL;
        bir.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        if (viewGroup2 != null) {
            C16880lQ.LJIIL(viewGroup2, new ACListenerS14S1300000_5(context, bir, dataChannel, enterFrom, 0));
        }
        this.LJZ.LIZIZ(getContext(), this.LJLJJL, this.LJLJL, this.LJLJJLL, this.LJLJJI, this.dataChannel, this.LJLLLL, this.LJLLLLLL);
        int i = 8;
        if (!LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview()) {
            ViewGroup viewGroup3 = this.LJLJL;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            this.LJLJL = null;
            this.LJLJLJ = null;
        }
        C41071jL c41071jL2 = this.LJLJLJ;
        if (c41071jL2 != null) {
            c41071jL2.setChecked(!o.LJ(InterfaceC30442Bx8.U2.LIZ(), Boolean.FALSE));
        }
        C41071jL c41071jL3 = this.LJLJLJ;
        if (c41071jL3 != null) {
            c41071jL3.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 21));
        }
        C28959BYd.LIZIZ((C47121t6) view.findViewById(R.id.kof));
        ViewGroup viewGroup4 = this.LJLJL;
        if (viewGroup4 != null) {
            ViewGroup viewGroup5 = this.LJLJJL;
            if (viewGroup5 != null && viewGroup5.getVisibility() == 0 && (c41071jL = this.LJLJJLL) != null && c41071jL.isChecked() && LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview()) {
                i = 0;
            }
            viewGroup4.setVisibility(i);
        }
        ViewGroup viewGroup6 = (ViewGroup) view.findViewById(R.id.glf);
        this.LJLLL = viewGroup6;
        BIR.LIZJ(viewGroup6);
        if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic() && !o.LJ(this.LJLLLLLL, "anchor_close_live_popup") && !o.LJ(InterfaceC30442Bx8.J3.LIZ(), Boolean.TRUE)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LiveSubscriptionAnchorUrlSetting.musicIntro());
            LIZ.append("&anchor_id=");
            LIZ.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            LIZ.append("&show_entrance=");
            LIZ.append(this.LJLLLLLL);
            ((Handler) this.LL.getValue()).post(new ARunnableS6S1100000_5(this, X1D.LIZIZ(LIZ), 2));
        }
        if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic()) {
            ViewGroup viewGroup7 = this.LJLLILLLL;
            if (viewGroup7 != null) {
                C29306Beo.LJI(viewGroup7);
            }
        } else {
            ViewGroup viewGroup8 = this.LJLLILLLL;
            if (viewGroup8 != null) {
                C29306Beo.LJJLJLI(viewGroup8);
            }
        }
        BIR bir2 = this.LJZ;
        Context context2 = getContext();
        ViewGroup viewGroup9 = this.LJLL;
        C41071jL c41071jL4 = this.LJLLI;
        DataChannel dataChannel2 = this.dataChannel;
        Room room = this.LJLLLL;
        String enterFrom2 = this.LJLLLLLL;
        bir2.getClass();
        o.LJIIIZ(enterFrom2, "enterFrom");
        if (C29232Bdc.LJIILIIL(room) && LiveSubOnlyAllowMusicSetting.getEnableAllowMusic()) {
            if (viewGroup9 != null) {
                C29306Beo.LJJLJLI(viewGroup9);
            }
        } else if (viewGroup9 != null) {
            C29306Beo.LJI(viewGroup9);
        }
        if (room != null && room.liveSubOnlyUseMusic == 1) {
            if (c41071jL4 != null) {
                c41071jL4.setChecked(true);
            }
            bir2.LJIIIZ(c41071jL4, false, C28480BFs.LJLIL);
        } else {
            if (c41071jL4 != null) {
                c41071jL4.setChecked(false);
            }
            bir2.LJIIIZ(c41071jL4, true, null);
        }
        if (c41071jL4 != null) {
            c41071jL4.setOnTouchListener(new ViewOnTouchListenerC28475BFn(bir2, context2, c41071jL4, room, enterFrom2, dataChannel2));
        }
        this.LJZ.LJFF(this.LJLLLL, this.LJLLLLLL);
        this.LJZI = o.LJ(this.LJLLLLLL, "anchor_close_live_popup");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        long j;
        User owner;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (LiveIconView) view.findViewById(R.id.aeg);
        this.LJLILLLLZI = (ViewGroup) view.findViewById(R.id.btg);
        this.LJLJI = (ViewGroup) view.findViewById(R.id.koj);
        this.LJLJJI = (C41071jL) view.findViewById(R.id.kop);
        this.LJLJJL = (ViewGroup) view.findViewById(R.id.a15);
        this.LJLJJLL = (C41071jL) view.findViewById(R.id.a16);
        this.LJLJLLL = (ViewGroup) view.findViewById(R.id.l9_);
        this.LJLL = (ViewGroup) view.findViewById(R.id.a11);
        this.LJLLI = (C41071jL) view.findViewById(R.id.a12);
        this.LJLLJ = (C223338pd) view.findViewById(R.id.g84);
        this.LJLLILLLL = (ViewGroup) view.findViewById(R.id.dao);
        this.LJLJL = (ViewGroup) view.findViewById(R.id.kot);
        this.LJLJLJ = (C41071jL) view.findViewById(R.id.kou);
        this.LJZI = o.LJ(this.LJLLLLLL, "anchor_close_live_popup");
        if (this.LJLZ != null || !this.LJZL) {
            vl(view);
            return;
        }
        C223338pd c223338pd = this.LJLLJ;
        if (c223338pd != null) {
            C29306Beo.LJJLJLI(c223338pd);
        }
        C223338pd c223338pd2 = this.LJLLJ;
        if (c223338pd2 != null) {
            c223338pd2.LIZIZ();
        }
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        }
        SubscribeApi subscribeApi = (SubscribeApi) Q7L.LIZIZ(SubscribeApi.class);
        if (room == null || (owner = room.getOwner()) == null || (str = owner.getSecUid()) == null) {
            str = "";
        }
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C1EW.LIZ(subscribeApi.getAnchorSubscriptionManagement(str, j)).LJJJLIIL(new AfS54S0200000_5(this, view, 22), C28478BFq.LJLIL);
    }
}
