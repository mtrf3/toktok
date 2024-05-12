package Y;

import X.AbstractC42141l4;
import X.AbstractC42811m9;
import X.AnonymousClass143;
import X.AnonymousClass159;
import X.BZI;
import X.C006900z;
import X.C03880Dg;
import X.C06490Nh;
import X.C06900Ow;
import X.C0NB;
import X.C0TM;
import X.C0TY;
import X.C15380j0;
import X.C16880lQ;
import X.C23120vU;
import X.C276616s;
import X.C28787BRn;
import X.C29306Beo;
import X.C30680C2i;
import X.C30681C2j;
import X.C32151Nz;
import X.C35341a6;
import X.C38921fs;
import X.C41341jm;
import X.C41351jn;
import X.C48971w5;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78946Uyc;
import X.DialogC30679C2h;
import X.DialogInterfaceOnClickListenerC265412k;
import X.InterfaceC30442Bx8;
import X.KNV;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.StateListDrawable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.navi.NaviAvatarListPresenter;
import com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerListView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ugc.effectplatform.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDObserverS225S0100000 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            case 17:
                onChanged$17(this, obj);
                return;
            default:
                return;
        }
    }

    public IDObserverS225S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        NaviAvatarListPresenter naviAvatarListPresenter = (NaviAvatarListPresenter) iDObserverS225S0100000.l0;
        if (naviAvatarListPresenter.LJLLILLLL) {
            naviAvatarListPresenter.LIZIZ();
        }
    }

    public static final void onChanged$1(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        NaviAvatarListPresenter naviAvatarListPresenter = (NaviAvatarListPresenter) iDObserverS225S0100000.l0;
        if (naviAvatarListPresenter.LJLJL) {
            naviAvatarListPresenter.LIZLLL();
        }
    }

    public static final void onChanged$10(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        ((PagingViewModel) iDObserverS225S0100000.l0).LJLJJI.postValue(obj);
    }

    public static final void onChanged$11(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        ((PagingViewModel) iDObserverS225S0100000.l0).LJLJLLL.postValue(obj);
    }

    public static final void onChanged$12(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        C006900z it = (C006900z) obj;
        AbstractC42811m9 abstractC42811m9 = (AbstractC42811m9) iDObserverS225S0100000.l0;
        o.LJIIIIZZ(it, "it");
        abstractC42811m9.getClass();
        LiveGiftTrayPublicScreenTranslateSetting liveGiftTrayPublicScreenTranslateSetting = LiveGiftTrayPublicScreenTranslateSetting.INSTANCE;
        abstractC42811m9.LJLILLLLZI = liveGiftTrayPublicScreenTranslateSetting.giftTrayTranslateWithPublicScreen(it.LIZ.LIZLLL);
        abstractC42811m9.LJLJJI = liveGiftTrayPublicScreenTranslateSetting.canGiftTrayTranslationXfer(it.LIZ.LIZLLL);
        abstractC42811m9.LIZIZ(it);
    }

    public static final void onChanged$13(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        Collection collection = (Collection) obj;
        if (collection != null) {
            C35341a6 naviAdapter = ((C23120vU) iDObserverS225S0100000.l0).getNaviAdapter();
            naviAdapter.getClass();
            ((ArrayList) naviAdapter.LJLIL).clear();
            ((ArrayList) naviAdapter.LJLIL).addAll(collection);
            naviAdapter.notifyDataSetChanged();
            RecyclerView recyclerView = naviAdapter.LJLJJL;
            if (recyclerView != null) {
                recyclerView.LJLI(naviAdapter.LJLJI);
            } else {
                o.LJIJI("recyclerView");
                throw null;
            }
        }
    }

    public static final void onChanged$14(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        AnonymousClass143 anonymousClass143 = (AnonymousClass143) iDObserverS225S0100000.l0;
        DialogC30679C2h dialogC30679C2h = anonymousClass143.LJFF;
        if (dialogC30679C2h != null && !dialogC30679C2h.isShowing()) {
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/chatroom/ui/RoomCenterDialog", "show", dialogC30679C2h, new Object[0], "void", new C65300Pk0(false, "()V", "5419228958912610949")).LIZ) {
                dialogC30679C2h.show();
            }
            anonymousClass143.LIZJ.LIZIZ().addDialogToManager(dialogC30679C2h);
        }
    }

    public static final void onChanged$15(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        int i;
        String str;
        C38921fs c38921fs = (C38921fs) iDObserverS225S0100000.l0;
        LiveDialog liveDialog = c38921fs.LJIIJ;
        if (liveDialog != null && !liveDialog.isShowing() && !c38921fs.LJI) {
            C16880lQ.LIZ(liveDialog);
            c38921fs.LIZJ.LIZIZ().addDialogToManager(liveDialog);
            BZI LIZ = C28787BRn.LIZ("livesdk_push_stream_fail_reminder_show");
            LIZ.LJIJJ(String.valueOf(c38921fs.LIZIZ.getOwnerUserId()), "anchor_id");
            LIZ.LJIJJ(c38921fs.LIZIZ.getIdStr(), "room_id");
            RoomStats stats = c38921fs.LIZIZ.getStats();
            if (stats != null) {
                i = stats.getTotalUser();
            } else {
                i = 0;
            }
            KNV.LJ(i, LIZ, "viewer_cnt", "popup", "reminder_type");
            LIZ.LJIJJ("several_attempt_fail", "content_type");
            AnonymousClass159 anonymousClass159 = c38921fs.LJIIJJI;
            if (anonymousClass159 != null) {
                str = anonymousClass159.LIZLLL;
            } else {
                str = null;
            }
            LIZ.LJIJJ(str, "error_type");
            LIZ.LJJIIJZLJL();
        }
    }

    public static final void onChanged$16(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        int i;
        C38921fs c38921fs = (C38921fs) iDObserverS225S0100000.l0;
        LiveDialog liveDialog = c38921fs.LJIIIZ;
        if (liveDialog != null && !liveDialog.isShowing() && !c38921fs.LJI) {
            C16880lQ.LIZ(liveDialog);
            c38921fs.LIZJ.LIZIZ().addDialogToManager(liveDialog);
            BZI LIZ = C28787BRn.LIZ("livesdk_push_stream_fail_reminder_show");
            LIZ.LJIJJ(String.valueOf(c38921fs.LIZIZ.getOwnerUserId()), "anchor_id");
            LIZ.LJIJJ(c38921fs.LIZIZ.getIdStr(), "room_id");
            RoomStats stats = c38921fs.LIZIZ.getStats();
            if (stats != null) {
                i = stats.getTotalUser();
            } else {
                i = 0;
            }
            KNV.LJ(i, LIZ, "viewer_cnt", "popup", "reminder_type");
            C06490Nh.LIZLLL(LIZ, "first_fail", "content_type", "stream_error", "error_type");
        }
    }

    public static final void onChanged$17(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        C276616s c276616s = (C276616s) iDObserverS225S0100000.l0;
        if (c276616s.LIZLLL == null) {
            Context context = c276616s.LIZJ;
            o.LJIIIZ(context, "context");
            C30681C2j c30681C2j = new C30681C2j(context);
            C30680C2i c30680C2i = c30681C2j.LIZ;
            c30680C2i.LIZJ = R.layout.d0g;
            CharSequence text = c30680C2i.LIZ.getText(R.string.o0d);
            C30680C2i c30680C2i2 = c30681C2j.LIZ;
            c30680C2i2.LIZLLL = text;
            c30681C2j.LIZ.LJ = c30680C2i2.LIZ.getText(R.string.o0c);
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.sol);
            DialogInterfaceOnClickListenerC265412k dialogInterfaceOnClickListenerC265412k = new DialogInterface.OnClickListener() { // from class: X.12k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            };
            C30680C2i c30680C2i3 = c30681C2j.LIZ;
            c30680C2i3.LJFF = LJIILJJIL;
            c30680C2i3.LJII = dialogInterfaceOnClickListenerC265412k;
            StateListDrawable LJIIJ = C78946Uyc.LJIIJ(C32151Nz.LJIIZILJ(8), C32151Nz.LJIIZILJ(8), C15380j0.LIZIZ(R.color.ar), C15380j0.LIZIZ(R.color.al));
            C30680C2i c30680C2i4 = c30681C2j.LIZ;
            c30680C2i4.LJI = LJIIJ;
            c30680C2i4.LJIIIZ = false;
            c30680C2i4.LJIIIIZZ = false;
            C30680C2i c30680C2i5 = c30681C2j.LIZ;
            DialogC30679C2h dialogC30679C2h = new DialogC30679C2h(c30680C2i5.LIZ, c30680C2i5);
            C276616s c276616s2 = (C276616s) iDObserverS225S0100000.l0;
            C16880lQ.LJIJI(dialogC30679C2h.LJLJJLL, new IDCListenerS135S0100000(c276616s2, 97));
            dialogC30679C2h.setOnDismissListener(new IDDListenerS140S0100000(c276616s2, 12));
            c276616s.LIZLLL = dialogC30679C2h;
        }
        C276616s c276616s3 = (C276616s) iDObserverS225S0100000.l0;
        DialogC30679C2h dialogC30679C2h2 = c276616s3.LIZLLL;
        if (dialogC30679C2h2 != null && !dialogC30679C2h2.isShowing()) {
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/chatroom/ui/RoomCenterDialog", "show", dialogC30679C2h2, new Object[0], "void", new C65300Pk0(false, "()V", "-2066184117682589038")).LIZ) {
                dialogC30679C2h2.show();
            }
            c276616s3.LIZIZ.LIZIZ().addDialogToManager(dialogC30679C2h2);
        }
    }

    public static final void onChanged$2(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        String unzipPath;
        Effect effect = (Effect) obj;
        if (effect != null && (unzipPath = effect.getUnzipPath()) != null) {
            ((NaviAvatarListPresenter) iDObserverS225S0100000.l0).LJLJI.setEffect(unzipPath);
            C0NB.LJ("auto_creation", "set Auto-Creation Effect");
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C0NB.LJ("auto_creation", "autoCreationEffect == null");
    }

    public static final void onChanged$3(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        List<? extends LiveEffect> list = (List) obj;
        C29306Beo.LJI(((MultiGuestStickerListView) iDObserverS225S0100000.l0).LJLLL);
        C48971w5 c48971w5 = ((MultiGuestStickerListView) iDObserverS225S0100000.l0).LJLLLLLL;
        for (LiveEffect liveEffect : list) {
            liveEffect.effectPanelKey = "props";
            liveEffect.effectPanelName = "props";
        }
        LiveEffect liveEffect2 = ((MultiGuestStickerListView) iDObserverS225S0100000.l0).LJLJL;
        String STICKER_INTERACT = C0TY.LIZJ;
        o.LJIIIIZZ(STICKER_INTERACT, "STICKER_INTERACT");
        c48971w5.LLJJJJJIL(list, false, liveEffect2, STICKER_INTERACT);
        if (((MultiGuestStickerListView) iDObserverS225S0100000.l0).LJLLLLLL.LLILLIZIL() >= 0) {
            MultiGuestStickerListView multiGuestStickerListView = (MultiGuestStickerListView) iDObserverS225S0100000.l0;
            multiGuestStickerListView.LJLLJ.LJLI(multiGuestStickerListView.LJLLLLLL.LLILLIZIL());
        }
    }

    public static final void onChanged$4(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        C41341jm c41341jm = (C41341jm) iDObserverS225S0100000.l0;
        LiveDialog liveDialog = c41341jm.LJ;
        if (liveDialog != null && !liveDialog.isShowing() && !c41341jm.LJI) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_unexcepted_interruption_golive_show");
            LIZ.LJIJJ(c41341jm.LJIIIZ(), "anchor_id");
            LIZ.LJIJJ("screen_share", "live_type");
            LIZ.LJIJJ(Long.valueOf(c41341jm.LJIIL()), "room_id");
            LIZ.LJIJJ(c41341jm.LJIIJJI(), "enter_from");
            LIZ.LJJIIJZLJL();
            C16880lQ.LIZ(liveDialog);
            c41341jm.LJIIJ().addDialogToManager(liveDialog);
        }
    }

    public static final void onChanged$5(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        C41341jm c41341jm = (C41341jm) iDObserverS225S0100000.l0;
        LiveDialog liveDialog = c41341jm.LJFF;
        if (liveDialog != null && !liveDialog.isShowing() && !c41341jm.LJI) {
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "2597351922061005414")).LIZ) {
                liveDialog.show();
            }
            c41341jm.LJIIJ().addDialogToManager(liveDialog);
            InterfaceC30442Bx8.U0.LIZ(Boolean.FALSE);
        }
    }

    public static final void onChanged$6(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        C41351jn c41351jn = (C41351jn) iDObserverS225S0100000.l0;
        LiveDialog liveDialog = c41351jn.LJ;
        if (liveDialog != null && !liveDialog.isShowing() && !c41351jn.LJI) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_unexcepted_interruption_golive_show");
            LIZ.LJIJJ(c41351jn.LJIIIZ(), "anchor_id");
            LIZ.LJIJJ("screen_share", "live_type");
            LIZ.LJIJJ(Long.valueOf(c41351jn.LJIIL()), "room_id");
            LIZ.LJIJJ(c41351jn.LJIIJJI(), "enter_from");
            LIZ.LJJIIJZLJL();
            C16880lQ.LIZ(liveDialog);
            c41351jn.LJIIJ().addDialogToManager(liveDialog);
        }
    }

    public static final void onChanged$7(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        C41351jn c41351jn = (C41351jn) iDObserverS225S0100000.l0;
        LiveDialog liveDialog = c41351jn.LJFF;
        if (liveDialog != null && !liveDialog.isShowing() && !c41351jn.LJI) {
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-2552215603829415751")).LIZ) {
                liveDialog.show();
            }
            c41351jn.LJIIJ().addDialogToManager(liveDialog);
        }
    }

    public static final void onChanged$8(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        C0TM c0tm = (C0TM) iDObserverS225S0100000.l0;
        DialogC30679C2h dialogC30679C2h = c0tm.LIZLLL;
        if (dialogC30679C2h != null && !dialogC30679C2h.isShowing()) {
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/chatroom/ui/RoomCenterDialog", "show", dialogC30679C2h, new Object[0], "void", new C65300Pk0(false, "()V", "-7953396325286034624")).LIZ) {
                dialogC30679C2h.show();
            }
            c0tm.LIZ().addDialogToManager(dialogC30679C2h);
        }
    }

    public static final void onChanged$9(IDObserverS225S0100000 iDObserverS225S0100000, Object obj) {
        C06900Ow c06900Ow = (C06900Ow) obj;
        if (c06900Ow == null) {
            return;
        }
        AbstractC42141l4 abstractC42141l4 = (AbstractC42141l4) iDObserverS225S0100000.l0;
        abstractC42141l4.LJLL = c06900Ow.LIZ;
        abstractC42141l4.LLIIIILZ(abstractC42141l4.LJLJLLL);
    }
}
