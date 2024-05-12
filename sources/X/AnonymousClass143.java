package X;

import Y.IDCListenerS135S0100000;
import Y.IDDListenerS140S0100000;
import Y.IDObserverS225S0100000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.143, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass143 {
    public final Fragment LIZ;
    public final Room LIZIZ;
    public final C12C LIZJ;
    public final Context LIZLLL;
    public final Handler LJ;
    public DialogC30679C2h LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public C38581fK LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;

    public final void LJFF() {
        this.LJI = true;
        if (this.LJFF == null) {
            Context context = this.LIZLLL;
            o.LJIIIZ(context, "context");
            C30681C2j c30681C2j = new C30681C2j(context);
            C30680C2i c30680C2i = c30681C2j.LIZ;
            c30680C2i.LIZJ = R.layout.d0g;
            CharSequence text = c30680C2i.LIZ.getText(R.string.n0k);
            C30680C2i c30680C2i2 = c30681C2j.LIZ;
            c30680C2i2.LIZLLL = text;
            c30681C2j.LIZ.LJ = c30680C2i2.LIZ.getText(R.string.n0j);
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.n0m);
            DialogInterfaceOnClickListenerC265312j dialogInterfaceOnClickListenerC265312j = new DialogInterface.OnClickListener() { // from class: X.12j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            };
            C30680C2i c30680C2i3 = c30681C2j.LIZ;
            c30680C2i3.LJFF = LJIILJJIL;
            c30680C2i3.LJII = dialogInterfaceOnClickListenerC265312j;
            StateListDrawable LJIIJ = C78946Uyc.LJIIJ(C32151Nz.LJIIZILJ(8), C32151Nz.LJIIZILJ(8), C15380j0.LIZIZ(R.color.ar), C15380j0.LIZIZ(R.color.al));
            C30680C2i c30680C2i4 = c30681C2j.LIZ;
            c30680C2i4.LJI = LJIIJ;
            c30680C2i4.LJIIIZ = false;
            c30680C2i4.LJIIIIZZ = false;
            C30680C2i c30680C2i5 = c30681C2j.LIZ;
            DialogC30679C2h dialogC30679C2h = new DialogC30679C2h(c30680C2i5.LIZ, c30680C2i5);
            C16880lQ.LJIJI(dialogC30679C2h.LJLJJLL, new IDCListenerS135S0100000(this, 96));
            dialogC30679C2h.setOnDismissListener(new IDDListenerS140S0100000(this, 9));
            this.LJFF = dialogC30679C2h;
        }
        this.LIZJ.LIZIZ().addToShow(8, this.LIZ, new IDObserverS225S0100000(this, 14));
        LJ("popup");
    }

    public final void LIZ() {
        DialogC30679C2h dialogC30679C2h;
        DialogC30679C2h dialogC30679C2h2 = this.LJFF;
        if (dialogC30679C2h2 != null && dialogC30679C2h2.isShowing() && (dialogC30679C2h = this.LJFF) != null) {
            dialogC30679C2h.dismiss();
        }
        this.LIZJ.LIZIZ().ee0(8);
    }

    public final void LIZIZ(boolean z) {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleRemindDialogShowLogic  isBackGround, ");
            LIZ.append(this.LJIIJ);
            LIZ.append(" preFocusState ");
            LIZ.append(this.LJIIIIZZ);
            LIZ.append(", isMutePunishment ");
            LIZ.append(this.LJIIIZ);
            LIZ.append(", hasFocus ");
            LIZ.append(z);
            C0NB.LJIIIZ("AudioFocusRemindController", X1D.LIZIZ(LIZ));
        }
        if (this.LJIIJ || this.LJIIIZ || !AnonymousClass147.LIZJ) {
            return;
        }
        if (z) {
            if (!this.LJIIIIZZ && !this.LJI) {
                LJFF();
                return;
            }
        } else if (!this.LJI) {
            LJFF();
            return;
        }
        if (!this.LJIIIIZZ) {
            return;
        }
        LIZ();
    }

    public final void LIZJ(boolean z) {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleRemindTipsShowLogic  isBackGround: ");
            LIZ.append(this.LJIIJ);
            LIZ.append(",  isMutePunishment ");
            C76965UIn.LIZJ(LIZ, this.LJIIIZ, ", hasFocus: ", z, ", preFocusState: ");
            FT5.LJ(LIZ, this.LJIIIIZZ, LIZ, "AudioFocusRemindController");
        }
        if (!this.LJIIJ) {
            return;
        }
        this.LJIIIIZZ = z;
        if (this.LJIIIZ || !AnonymousClass147.LIZJ) {
            return;
        }
        if (!z) {
            LJI(true);
            return;
        }
        LJI(false);
        C12C c12c = this.LIZJ;
        int ordinal = EnumC264412a.LIVE_TIP_AUDIO_FOCUS_GET_TIP.ordinal();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.n0b);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_mic_get_back_toast)");
        C12B.LIZ(c12c, true, ordinal, LJIILJJIL, 8);
    }

    public final void LJ(String str) {
        int i;
        boolean LIZIZ = C31026CFq.LIZ.LIZIZ();
        BZI LIZ = C28787BRn.LIZ("livesdk_no_sound_reminder_show");
        LIZ.LJIJJ(String.valueOf(this.LIZIZ.getOwnerUserId()), "anchor_id");
        LIZ.LJIJJ(this.LIZIZ.getIdStr(), "room_id");
        LIZ.LJIJJ(str, "reminder_type");
        RoomStats stats = this.LIZIZ.getStats();
        if (stats != null) {
            i = stats.getTotalUser();
        } else {
            i = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i), "viewer_cnt");
        LIZ.LJIJJ(Integer.valueOf(LIZIZ ? 1 : 0), "userHeadPhones");
        LIZ.LJJIIJZLJL();
    }

    public final void LJI(boolean z) {
        String focusLostTips = C86881Y7x.LIZIZ().LIZ("pm_mt_ls_microphoneConflict_modal_body");
        if (focusLostTips == null || focusLostTips.length() == 0) {
            focusLostTips = C15380j0.LJIILJJIL(R.string.mvd);
        }
        C12C c12c = this.LIZJ;
        int ordinal = EnumC264412a.LIVE_TIP_AUDIO_FOCUS_LOST_TIP.ordinal();
        o.LJIIIIZZ(focusLostTips, "focusLostTips");
        C12B.LIZ(c12c, z, ordinal, focusLostTips, 8);
        if (z) {
            LJ("float_window");
        }
    }

    public final void LIZLLL(String str, String str2) {
        BZI LIZ = C28787BRn.LIZ("livesdk_no_sound_reminder_close");
        LIZ.LJIJJ(String.valueOf(this.LIZIZ.getOwnerUserId()), "anchor_id");
        LIZ.LJIJJ(this.LIZIZ.getIdStr(), "room_id");
        LIZ.LJIJJ(str, "reminder_type");
        LIZ.LJIJJ(str2, "action_type");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.1fK] */
    public AnonymousClass143(GameBroadcastFragment fragment, Room room, C37661dq c37661dq) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(room, "room");
        this.LIZ = fragment;
        this.LIZIZ = room;
        this.LIZJ = c37661dq;
        Context requireContext = fragment.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        this.LIZLLL = requireContext;
        this.LJ = new Handler(C16880lQ.LLJJJJ());
        this.LJII = true;
        this.LJIIIIZZ = true;
        ?? r2 = new AnonymousClass144() { // from class: X.1fK
            @Override // X.AnonymousClass144
            public final void LIZ() {
                AnonymousClass143.this.LJII = true;
                if (C30922CBq.LIZIZ) {
                    C0NB.LJIIIZ("AudioFocusRemindController", "registerAudioFocusListener onFocusGet");
                }
                AnonymousClass143 anonymousClass143 = AnonymousClass143.this;
                anonymousClass143.LJ.post(new IDRunnableS85S0100000(anonymousClass143, 126));
                AnonymousClass143 anonymousClass1432 = AnonymousClass143.this;
                if (anonymousClass1432.LJIIL > 0) {
                    anonymousClass1432.LJIILIIL = (System.currentTimeMillis() - anonymousClass1432.LJIIL) + anonymousClass1432.LJIILIIL;
                    anonymousClass1432.LJIIL = 0L;
                }
                AnonymousClass143 anonymousClass1433 = AnonymousClass143.this;
                anonymousClass1433.getClass();
                BZI LIZ = C28787BRn.LIZ("livesdk_no_sound_recover");
                LIZ.LJIJJ(String.valueOf(anonymousClass1433.LIZIZ.getOwnerUserId()), "anchor_id");
                LIZ.LJIJJ(anonymousClass1433.LIZIZ.getIdStr(), "room_id");
                LIZ.LJJIIJZLJL();
            }

            @Override // X.AnonymousClass144
            public final void LIZIZ() {
                if (C30922CBq.LIZIZ) {
                    C0NB.LJIIIZ("AudioFocusRemindController", "registerAudioFocusListener onFocusLose");
                }
                AnonymousClass143.this.LJIIL = System.currentTimeMillis();
                AnonymousClass143 anonymousClass143 = AnonymousClass143.this;
                anonymousClass143.LJII = false;
                anonymousClass143.LJ.post(new IDRunnableS85S0100000(anonymousClass143, 127));
                ((IGameService) CN1.LIZ(IGameService.class)).Cc();
            }
        };
        this.LJIIJJI = r2;
        ArrayList<AnonymousClass144> arrayList = AnonymousClass147.LJII;
        if (!arrayList.contains(r2)) {
            arrayList.add(r2);
        }
    }
}
