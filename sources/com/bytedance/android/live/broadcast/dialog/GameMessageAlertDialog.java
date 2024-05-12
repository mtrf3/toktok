package com.bytedance.android.live.broadcast.dialog;

import X.B83;
import X.BZI;
import X.C07250Qf;
import X.C0J0;
import X.C10A;
import X.C15510jD;
import X.C16880lQ;
import X.C1Q3;
import X.C28507BGt;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C2A4;
import X.C30051Fx;
import X.C40210FqI;
import X.C48459J0d;
import X.C56062Hy;
import X.C56072Hz;
import X.C73411SrX;
import X.C73943T0h;
import X.C77437UaH;
import X.C78856UxA;
import X.C80261Vej;
import X.C87277YNd;
import X.CFX;
import X.DialogC77438UaI;
import X.InterfaceC30442Bx8;
import X.LHW;
import X.V10;
import X.ZAT;
import Y.IDCListenerS135S0100000;
import Y.IDCListenerS155S0100000;
import Y.IDfS292S0100000;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.broadcast.dialog.GameMessageAlertDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameMessageAlertDialog extends LiveDialogFragment {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public C73411SrX LJLJI;
    public DialogC77438UaI LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public C80261Vej LJLJL;
    public boolean LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

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

    public GameMessageAlertDialog() {
        BroadcastGameFloatWindowLibra broadcastGameFloatWindowLibra = BroadcastGameFloatWindowLibra.INSTANCE;
        this.LJLIL = broadcastGameFloatWindowLibra.isExperimentGroup2();
        this.LJLILLLLZI = broadcastGameFloatWindowLibra.isExperimentGroup();
        this.LJLJLJ = true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cyr);
        c28507BGt.LIZIZ = 2;
        c28507BGt.LIZJ = R.style.ab4;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 73;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        super.onDestroyView();
    }

    public final void vl() {
        if (this.LJLJJI == null) {
            C77437UaH c77437UaH = new C77437UaH(getContext());
            String LIZ = CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_game_demand_1");
            c77437UaH.LJIIIIZZ = Integer.MAX_VALUE;
            c77437UaH.LJIIJ = LIZ;
            c77437UaH.LJIIJJI = "ttlive_ic_float_permission_pic.png";
            c77437UaH.LJIIL = 1.6315789f;
            c77437UaH.LJI(R.string.o04);
            c77437UaH.LIZIZ(R.string.o03);
            c77437UaH.LJ(R.string.o02, new IDCListenerS155S0100000(this, 0), false);
            c77437UaH.LIZJ(R.string.o01, new IDCListenerS155S0100000(this, 1), false);
            DialogC77438UaI LIZ2 = c77437UaH.LIZ();
            LIZ2.setCanceledOnTouchOutside(false);
            this.LJLJJI = LIZ2;
        }
        C29306Beo.LJJJJIZL(this.LJLJJI);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        C80261Vej c80261Vej;
        C78856UxA tabAt;
        super.onStart();
        if (o.LJ(this.LJLJJL, "guide_toast") && (c80261Vej = this.LJLJL) != null && (tabAt = c80261Vej.getTabAt(1)) != null) {
            tabAt.LIZIZ();
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        long j;
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        BZI LIZ = C28787BRn.LIZ("livesdk_live_overlay_setting_left");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C07250Qf.LIZJ(j, LIZ, "room_id", "screen_share", "live_type");
        V10.LJ(InterfaceC30442Bx8.LJJIJIIJI.LIZJ(), LIZ, "is_comments_notifications");
        V10.LJ(InterfaceC30442Bx8.LJJIJIIJIL.LIZJ(), LIZ, "is_gift_notifications");
        V10.LJ(InterfaceC30442Bx8.LJJIZ.LIZJ(), LIZ, "is_entry_messages");
        V10.LJ(InterfaceC30442Bx8.LJJJ.LIZJ(), LIZ, "is_followed_messages");
        V10.LJ(InterfaceC30442Bx8.LJJIJIL.LIZJ(), LIZ, "is_gift_bubble");
        V10.LJ(InterfaceC30442Bx8.LJJIJL.LIZJ(), LIZ, "is_comments_bubble");
        V10.LJ(InterfaceC30442Bx8.LJJIJLIJ.LIZJ(), LIZ, "is_start_comment_bubble");
        V10.LJ(InterfaceC30442Bx8.LJJIL.LIZJ(), LIZ, "is_start_comment_notifications");
        V10.LJ(InterfaceC30442Bx8.LJJJI.LIZJ(), LIZ, "is_like_messages");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(InterfaceC30442Bx8.B0.LIZJ()) ? 1 : 0), "is_show_activities_tab");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String LIZ;
        Room room;
        StarCommentConfig starCommentConfig;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 19), view);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (starCommentConfig = room.starCommentConfig) != null && starCommentConfig.starCommentQualification) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        C48459J0d<Boolean> LIVE_GAME_GIFT_SEPARATE = InterfaceC30442Bx8.B0;
        o.LJIIIIZZ(LIVE_GAME_GIFT_SEPARATE, "LIVE_GAME_GIFT_SEPARATE");
        arrayList.add(new C0J0(R.string.lxs, LIVE_GAME_GIFT_SEPARATE, "livesdk_live_show_activities_tab_click", Integer.valueOf(R.string.lxr), true, null, 32));
        C48459J0d<Boolean> LIVE_GAME_GIFT_MSG_PUSH = InterfaceC30442Bx8.LJJIJIIJIL;
        o.LJIIIIZZ(LIVE_GAME_GIFT_MSG_PUSH, "LIVE_GAME_GIFT_MSG_PUSH");
        arrayList.add(new C0J0(R.string.lxv, LIVE_GAME_GIFT_MSG_PUSH, "livesdk_anchor_message_alert_setting_hover_ban_gift_click", null, false, null, 56));
        C48459J0d<Boolean> LIVE_GAME_COMMENT_MSG_PUSH = InterfaceC30442Bx8.LJJIJIIJI;
        o.LJIIIIZZ(LIVE_GAME_COMMENT_MSG_PUSH, "LIVE_GAME_COMMENT_MSG_PUSH");
        arrayList.add(new C0J0(R.string.lxt, LIVE_GAME_COMMENT_MSG_PUSH, "livesdk_anchor_message_alert_setting_hover_ban_comment_click", null, !z, null, 40));
        if (z) {
            C48459J0d<Boolean> LIVE_GAME_STAR_COMMENT_MSG_PUSH = InterfaceC30442Bx8.LJJIL;
            o.LJIIIIZZ(LIVE_GAME_STAR_COMMENT_MSG_PUSH, "LIVE_GAME_STAR_COMMENT_MSG_PUSH");
            arrayList.add(new C0J0(R.string.ly0, LIVE_GAME_STAR_COMMENT_MSG_PUSH, "livesdk_star_comment_overlay_settings_click", null, true, "full", 8));
        }
        C48459J0d<Boolean> GAME_MESSAGE_NOTIFICATION_LIKE_MESSAGE = InterfaceC30442Bx8.LJJJI;
        o.LJIIIIZZ(GAME_MESSAGE_NOTIFICATION_LIKE_MESSAGE, "GAME_MESSAGE_NOTIFICATION_LIKE_MESSAGE");
        arrayList.add(new C0J0(R.string.lxw, GAME_MESSAGE_NOTIFICATION_LIKE_MESSAGE, "livesdk_anchor_message_alert_setting_hover_ban_like_click", null, false, null, 56));
        C48459J0d<Boolean> GAME_MESSAGE_NOTIFICATION_ATTENTION_MESSAGE = InterfaceC30442Bx8.LJJJ;
        o.LJIIIIZZ(GAME_MESSAGE_NOTIFICATION_ATTENTION_MESSAGE, "GAME_MESSAGE_NOTIFICATION_ATTENTION_MESSAGE");
        arrayList.add(new C0J0(R.string.lxx, GAME_MESSAGE_NOTIFICATION_ATTENTION_MESSAGE, "livesdk_anchor_message_alert_setting_hover_ban_follow_click", null, false, null, 56));
        C48459J0d<Boolean> GAME_MESSAGE_NOTIFICATION_ENTRY_MESSAGE = InterfaceC30442Bx8.LJJIZ;
        o.LJIIIIZZ(GAME_MESSAGE_NOTIFICATION_ENTRY_MESSAGE, "GAME_MESSAGE_NOTIFICATION_ENTRY_MESSAGE");
        arrayList.add(new C0J0(R.string.lxy, GAME_MESSAGE_NOTIFICATION_ENTRY_MESSAGE, "livesdk_anchor_message_alert_setting_hover_ban_entry_click", null, false, null, 56));
        ArrayList arrayList2 = new ArrayList();
        if (this.LJLIL) {
            C48459J0d<Boolean> LIVE_GAME_SHOW_BUBBLE_GIFT = InterfaceC30442Bx8.LJJIJIL;
            o.LJIIIIZZ(LIVE_GAME_SHOW_BUBBLE_GIFT, "LIVE_GAME_SHOW_BUBBLE_GIFT");
            arrayList2.add(new C0J0(R.string.lxv, LIVE_GAME_SHOW_BUBBLE_GIFT, "livesdk_anchor_floating_gifts_switch_click", null, false, null, 56));
        }
        if (this.LJLILLLLZI) {
            C48459J0d<Boolean> LIVE_GAME_SHOW_BUBBLE_COMMENT = InterfaceC30442Bx8.LJJIJL;
            o.LJIIIIZZ(LIVE_GAME_SHOW_BUBBLE_COMMENT, "LIVE_GAME_SHOW_BUBBLE_COMMENT");
            arrayList2.add(new C0J0(R.string.lxt, LIVE_GAME_SHOW_BUBBLE_COMMENT, "livesdk_anchor_floating_comments_switch_click", null, false, null, 56));
        }
        if (z) {
            C48459J0d<Boolean> LIVE_GAME_SHOW_BUBBLE_STAR_COMMENT = InterfaceC30442Bx8.LJJIJLIJ;
            o.LJIIIIZZ(LIVE_GAME_SHOW_BUBBLE_STAR_COMMENT, "LIVE_GAME_SHOW_BUBBLE_STAR_COMMENT");
            arrayList2.add(new C0J0(R.string.ly0, LIVE_GAME_SHOW_BUBBLE_STAR_COMMENT, "livesdk_star_comment_overlay_settings_click", null, false, "small", 24));
        }
        ArrayList arrayList3 = new ArrayList();
        C80261Vej c80261Vej = null;
        ViewPager viewPager = null;
        View inflate = View.inflate(getContext(), R.layout.dk9, null);
        String str3 = "tiktok_live_game_demand_1";
        if (inflate != null) {
            C2A4 c2a4 = (C2A4) inflate.findViewById(R.id.lpb);
            boolean z2 = this.LJLILLLLZI;
            if (z2) {
                str2 = "ttlive_ic_game_setting_msg_new.png";
            } else {
                str2 = "ttlive_ic_game_setting_msg.png";
            }
            if (z2) {
                C29306Beo.LJJLIIIJJIZ(C87277YNd.LJIIJJI(193), C87277YNd.LJIIJJI(128), c2a4);
            }
            if (this.LJLILLLLZI) {
                LIZ = "tiktok_live_game_demand_1";
            } else {
                LIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1");
            }
            c2a4.LJIIIIZZ(C15510jD.LJIIIZ(LIZ, str2));
            c2a4.LIZIZ();
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.lqi);
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.setAdapter(new C30051Fx(arrayList, C40210FqI.LJ(getContext()), new C56062Hy(this)));
            arrayList3.add(inflate);
        }
        View inflate2 = View.inflate(getContext(), R.layout.dk9, null);
        if (inflate2 != null) {
            C2A4 c2a42 = (C2A4) inflate2.findViewById(R.id.lpb);
            if (this.LJLILLLLZI) {
                str = "ttlive_ic_game_setting_right_tab.png";
                C29306Beo.LJJLIIIJJIZ(C87277YNd.LJIIJJI(160), C87277YNd.LJIIJJI(64), c2a42);
                C29306Beo.LJJLIIIJILLIZJL(C87277YNd.LJIIJJI(39), c2a42);
                C29306Beo.LJJJJJL(C87277YNd.LJIIJJI(39), c2a42);
            } else {
                str = "ttlive_ic_game_setting_activities.png";
            }
            if (!this.LJLILLLLZI) {
                str3 = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1");
            }
            c2a42.LJIIIIZZ(C15510jD.LJIIIZ(str3, str));
            c2a42.LIZIZ();
            RecyclerView recyclerView2 = (RecyclerView) inflate2.findViewById(R.id.lqi);
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView2.setAdapter(new C30051Fx(arrayList2, C40210FqI.LJ(getContext()), new C56072Hz(this)));
            arrayList3.add(inflate2);
        }
        C80261Vej c80261Vej2 = (C80261Vej) view.findViewById(R.id.lpc);
        if (c80261Vej2 != null) {
            ViewPager viewPager2 = (ViewPager) view.findViewById(R.id.lpd);
            if (viewPager2 != null) {
                C1Q3 c1q3 = new C1Q3(arrayList3);
                c1q3.LJLJI = new String[]{getString(R.string.ly1), getString(R.string.ly2)};
                viewPager2.setAdapter(c1q3);
                viewPager = viewPager2;
            }
            c80261Vej2.setupWithViewPager(viewPager, false);
            c80261Vej2.addOnTabSelectedListener(new LHW() { // from class: X.1lT
                @Override // X.InterfaceC54357LUz
                public final void LIZ(C78856UxA c78856UxA) {
                }

                @Override // X.InterfaceC54357LUz
                public final void LIZJ(C78856UxA c78856UxA) {
                }

                @Override // X.InterfaceC54357LUz
                public final void LIZIZ(C78856UxA c78856UxA) {
                    C78856UxA c78856UxA2;
                    String str4;
                    long j;
                    int i;
                    GameMessageAlertDialog gameMessageAlertDialog = GameMessageAlertDialog.this;
                    C80261Vej c80261Vej3 = gameMessageAlertDialog.LJLJL;
                    boolean z3 = false;
                    if (c80261Vej3 != null) {
                        c78856UxA2 = c80261Vej3.getTabAt(0);
                    } else {
                        c78856UxA2 = null;
                    }
                    if (o.LJ(c78856UxA2, c78856UxA)) {
                        str4 = "full";
                    } else {
                        str4 = "small";
                    }
                    gameMessageAlertDialog.LJLJJLL = str4;
                    TextView textView = (TextView) view.findViewById(R.id.lpa);
                    if (textView != null) {
                        if (o.LJ(GameMessageAlertDialog.this.LJLJJLL, "full")) {
                            i = R.string.lxu;
                        } else {
                            i = R.string.lxz;
                        }
                        textView.setText(i);
                    }
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_live_overlay_settings_show");
                    LIZ2.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
                    Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                    if (room2 != null) {
                        j = room2.getId();
                    } else {
                        j = 0;
                    }
                    C07250Qf.LIZJ(j, LIZ2, "room_id", "screen_share", "live_type");
                    String str5 = GameMessageAlertDialog.this.LJLJJL;
                    if (str5 == null) {
                        str5 = "in_app";
                    }
                    LIZ2.LJIJJ(str5, "enter_from");
                    LIZ2.LJIJJ(GameMessageAlertDialog.this.LJLJJLL, "tab_name");
                    LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C40210FqI.LJ(C15380j0.LIZLLL()))) ? 1 : 0), "overlay_permission");
                    LIZ2.LJJIIJZLJL();
                    GameMessageAlertDialog gameMessageAlertDialog2 = GameMessageAlertDialog.this;
                    if (c78856UxA != null && c78856UxA.LJ == 0) {
                        z3 = true;
                    }
                    gameMessageAlertDialog2.LJLJLJ = z3;
                }
            });
            c80261Vej = c80261Vej2;
        }
        this.LJLJL = c80261Vej;
        this.LJLJI = (C73411SrX) C73943T0h.LIZ().LJ(ZAT.class).LJJJJZI(new IDfS292S0100000(this, 22));
    }
}
