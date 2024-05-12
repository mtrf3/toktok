package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LiveShowSubOnlyLiveBypassLabelSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BIR {
    public static final /* synthetic */ int LJI = 0;
    public InterfaceC65784Pro<C76800UCe> LIZJ;
    public InterfaceC65784Pro<C76800UCe> LJ;
    public InterfaceC65784Pro<C76800UCe> LJFF;
    public boolean LIZ = true;
    public boolean LIZIZ = true;
    public boolean LIZLLL = true;

    public static void LIZ(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "4549141940702445988")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public static final void LIZJ(ViewGroup viewGroup) {
        int i;
        if (viewGroup == null) {
            return;
        }
        if (LiveShowSubOnlyLiveBypassLabelSetting.INSTANCE.isEnabled()) {
            i = 0;
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    public static /* synthetic */ void LJIIL(BIR bir, C41071jL c41071jL) {
        bir.LJIIJJI(c41071jL, true, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r0.isAnchorHasSubQualification() == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.bytedance.android.livesdkapi.depend.model.live.Room r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "enterFrom"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "livesdk_sub_only_live_management_page_show"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            java.lang.String r0 = "show_entrance"
            r2.LJIJJ(r5, r0)
            if (r4 == 0) goto L36
            long r0 = r4.getOwnerUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L1a:
            java.lang.String r0 = "anchor_id"
            r2.LJIJJ(r1, r0)
            if (r4 == 0) goto L34
            com.bytedance.android.live.base.model.user.User r0 = r4.getOwner()
            if (r0 == 0) goto L34
            boolean r0 = r0.isAnchorHasSubQualification()
            r1 = 1
            if (r0 != r1) goto L34
        L2e:
            java.lang.String r0 = "is_opt_in"
            X.UFE.LIZIZ(r1, r2, r0)
            return
        L34:
            r1 = 0
            goto L2e
        L36:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIR.LJFF(com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String):void");
    }

    public static void LJIIIIZZ(DataChannel dataChannel, String str, boolean z) {
        String str2;
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_use_music_popup_click");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(str, "click_position");
        if (z) {
            str2 = "confirm";
        } else {
            str2 = "cancel";
        }
        LIZ.LJIJJ(str2, "click_type");
        LIZ.LJJIIJZLJL();
    }

    public final void LJIIIZ(C41071jL c41071jL, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        float f;
        this.LIZ = z;
        if (interfaceC65784Pro != null) {
            this.LJFF = interfaceC65784Pro;
        }
        if (c41071jL == null) {
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        c41071jL.setAlpha(f);
    }

    public final void LJIIJ(C41071jL c41071jL, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        float f;
        this.LIZLLL = z;
        if (interfaceC65784Pro != null) {
            this.LJ = interfaceC65784Pro;
        }
        if (c41071jL == null) {
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        c41071jL.setAlpha(f);
    }

    public final void LJIIJJI(C41071jL c41071jL, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        float f;
        this.LIZIZ = z;
        if (interfaceC65784Pro != null) {
            this.LIZJ = interfaceC65784Pro;
        }
        if (c41071jL == null) {
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        c41071jL.setAlpha(f);
    }

    public static void LJI(Room room, DataChannel dataChannel, String str, String str2) {
        Long l;
        int i;
        User owner;
        BZI LIZ = C28787BRn.LIZ("livesdk_subscriber_only_live_popup_click");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(str, "show_entrance");
        LIZ.LJIJJ(str, "click_position");
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "anchor_id");
        if (room != null && (owner = room.getOwner()) != null && owner.isAnchorHasSubQualification()) {
            i = 1;
        } else {
            i = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i ^ 1), "is_opt_in");
        LIZ.LJIJJ(str2, "click_type");
        LIZ.LJJIIJZLJL();
    }

    public static void LJII(Room room, DataChannel dataChannel, String str, String str2) {
        Long l;
        int i;
        User owner;
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_preview_turn_off_popup_click");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(str, "show_entrance");
        LIZ.LJIJJ(str, "click_position");
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "anchor_id");
        if (room != null && (owner = room.getOwner()) != null && owner.isAnchorHasSubQualification()) {
            i = 1;
        } else {
            i = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i ^ 1), "is_opt_in");
        LIZ.LJIJJ(str2, "click_type");
        LIZ.LJJIIJZLJL();
    }

    public final void LJ(ActivityC45651qj activityC45651qj, C41071jL c41071jL, Room room, LiveSubOnlyConfig liveSubOnlyConfig) {
        if (C29232Bdc.LJIILIIL(room)) {
            if (c41071jL != null) {
                c41071jL.setChecked(true);
            }
            LJIIJJI(c41071jL, false, C28540BIa.LJLIL);
        } else if (liveSubOnlyConfig != null && liveSubOnlyConfig.disabled) {
            LJIIJJI(c41071jL, false, new AqS94S0300000_5(liveSubOnlyConfig, activityC45651qj, room, 23));
        } else {
            LJIIJJI(c41071jL, true, null);
        }
    }

    public final void LIZIZ(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, C41071jL c41071jL, C41071jL c41071jL2, DataChannel dataChannel, Room room, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (C29232Bdc.LJIILIIL(room)) {
            C29306Beo.LJJLJLI(viewGroup);
        }
        if (room != null && room.disablePreviewSubOnly == 1) {
            if (c41071jL != null) {
                c41071jL.setChecked(false);
            }
            LJIIJ(c41071jL, false, BB1.LJLIL);
        }
        if (c41071jL != null) {
            c41071jL.setOnTouchListener(new BIS(this, context, dataChannel, enterFrom, room, c41071jL, c41071jL2, viewGroup2));
        }
    }

    public final void LIZLLL(Context context, C41071jL c41071jL, C41071jL c41071jL2, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, DataChannel dataChannel, Room room, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (c41071jL != null) {
            c41071jL.setOnTouchListener(new BB3(this, context, c41071jL, c41071jL2, viewGroup, viewGroup2, viewGroup3, dataChannel, room, enterFrom));
        }
    }

    public final void LJIILIIL(Context context, C41071jL c41071jL, C41071jL c41071jL2, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, DataChannel dataChannel, Room room, String enterFrom) {
        Long l;
        User owner;
        User owner2;
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        boolean OB = iInteractService.OB();
        boolean mT = iInteractService.mT();
        boolean ta0 = iInteractService.ta0();
        boolean LIZIZ = BYI.LIZIZ(BWZ.KARAOKE);
        if (mT) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.ofq));
            return;
        }
        if (OB) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.ofp));
            return;
        }
        if (ta0) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.ofo));
            return;
        }
        if (LIZIZ) {
            C30868C9o.LIZJ(R.string.jw3);
            return;
        }
        if (this.LIZIZ) {
            BIT bit = new BIT(this, context, c41071jL, viewGroup2, viewGroup, viewGroup3, dataChannel, room, enterFrom);
            o.LJIIIZ(enterFrom, "enterFrom");
            int i = 0;
            Long l2 = null;
            if (c41071jL2 == null) {
                bit.invoke();
            } else {
                C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.V2;
                Boolean LIZ = c30554Byw.LIZ();
                Boolean bool = Boolean.TRUE;
                if (o.LJ(LIZ, bool)) {
                    bit.invoke();
                } else if (o.LJ(enterFrom, "anchor_close_live_popup")) {
                    bit.invoke();
                } else {
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_sub_only_live_longer_preview_popup_show");
                    if (room != null && (owner = room.getOwner()) != null) {
                        l = Long.valueOf(owner.getId());
                    } else {
                        l = null;
                    }
                    LIZ2.LJIJJ(l, "anchor_id");
                    LIZ2.LJIJJ(enterFrom, "click_position");
                    LIZ2.LJJIIJZLJL();
                    c30554Byw.LIZJ(bool);
                    String LJIILJJIL = C15380j0.LJIILJJIL(R.string.nq7);
                    C47071t1 c47071t1 = new C47071t1(context);
                    c47071t1.LJIILLIIL(R.string.nq5);
                    c47071t1.LJII(C15380j0.LJIILL(R.string.nq4, LJIILJJIL));
                    AnonymousClass175 anonymousClass175 = new AnonymousClass175();
                    C39471gl c39471gl = new C39471gl();
                    c39471gl.LIZ = C15380j0.LJIILJJIL(R.string.nq2);
                    c39471gl.LIZJ = new C28367BBj(c41071jL2, room, enterFrom, bit);
                    anonymousClass175.LIZ(new C39481gm(c39471gl));
                    C39491gn c39491gn = new C39491gn();
                    c39491gn.LIZ = C15380j0.LJIILJJIL(R.string.nq3);
                    c39491gn.LIZJ = new C28368BBk(c41071jL2, room, enterFrom, bit);
                    anonymousClass175.LIZ(new C39501go(c39491gn));
                    anonymousClass175.LIZIZ = 2;
                    c47071t1.LIZJ(new AnonymousClass176(anonymousClass175));
                    c47071t1.LJIILL = false;
                    c47071t1.LJIILJJIL = false;
                    LIZ(c47071t1.LIZ());
                }
            }
            BZI LIZ3 = C28787BRn.LIZ("livesdk_subscriber_only_live_button_click");
            LIZ3.LJIILLIIL(dataChannel);
            LIZ3.LJIJJ(enterFrom, "click_position");
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            }
            LIZ3.LJIJJ(l2, "anchor_id");
            if (room != null && (owner2 = room.getOwner()) != null && owner2.isAnchorHasSubQualification()) {
                i = 1;
            }
            LIZ3.LJIJJ(Integer.valueOf(1 ^ i), "is_opt_in");
            LIZ3.LJIJJ("open", "sub_live_status");
            LIZ3.LJJIIJZLJL();
            return;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }
}
