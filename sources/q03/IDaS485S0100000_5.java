package q03;

import X.AbstractC29482Bhe;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.BCW;
import X.BEF;
import X.BPG;
import X.BPM;
import X.BZI;
import X.C17280m4;
import X.C28509BGv;
import X.C28787BRn;
import X.C29033BaP;
import X.C29040BaW;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29456BhE;
import X.C29465BhN;
import X.C29471BhT;
import X.C29478Bha;
import X.C29481Bhd;
import X.C29727Blb;
import X.C29739Bln;
import X.C29746Blu;
import X.C29750Bly;
import X.C30868C9o;
import X.C32537Cpp;
import X.C48459J0d;
import X.C51029K0z;
import X.C73969T1h;
import X.C7N;
import X.C98T;
import X.CN1;
import X.InterfaceC29736Blk;
import X.InterfaceC30442Bx8;
import X.T16;
import X.XKX;
import Y.AfS1S0200100_5;
import Y.AfS4S0100100_5;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.adminsetting.LiveCommentBlockKeywordsFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveMuteDurationSettingFragmentSheet;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.broadcast.CommentFeatureChannel;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewPracticeModeFragmentSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewVideoQualityFragmentSheet;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.moderator.ModeratorListFragmentSheet;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import com.bytedance.android.livesdk.usercard.profilev3.TryModeLiveProfileDialog;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDaS485S0100000_5 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZ$11(this, view);
                return;
            case 12:
                LIZ$12(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS485S0100000_5(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        if (view != null) {
            ((LiveCommentSettingFragmentSheet) iDaS485S0100000_5.l0).LJLZ.LJIIIIZZ(LiveCommentBlockKeywordsFragmentSheet.class, "live_comment_block_keywords", null, null);
        }
    }

    public static final void LIZ$1(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        if (view != null) {
            ((LiveCommentSettingFragmentSheet) iDaS485S0100000_5.l0).LJLZ.LJIIIIZZ(LiveMuteDurationSettingFragmentSheet.class, "live_mute_duration_setting", null, null);
            InterfaceC30442Bx8.LL.LIZ(Boolean.FALSE);
        }
    }

    public static final void LIZ$10(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        if (view != null) {
            ((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0).LJLZ.LJIIIIZZ(PreviewVideoQualityFragmentSheet.class, "preview_video_quality", null, null);
        }
    }

    public static final void LIZ$11(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        boolean z;
        String str;
        LiveMode liveMode;
        Boolean bool;
        if (view != null) {
            IAdminSettingService LIZIZ = C7N.LIZIZ();
            AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0, 811);
            DataChannel LJIILIIL = C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0);
            if (LJIILIIL != null && (bool = (Boolean) LJIILIIL.kv0(CommentFeatureChannel.class)) != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            ((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0).LJLZ.LJIIIZ(LIZIZ.S90(z, aqS171S0100000_5), "live_comment_setting");
            BZI LIZ = C28787BRn.LIZ("livesdk_comment_settings_click");
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0);
            if (LJIILIIL2 != null && (liveMode = (LiveMode) LJIILIIL2.kv0(LiveModeChannel.class)) != null) {
                str = liveMode.logStreamingType;
            } else {
                str = null;
            }
            LIZ.LJIJ(str);
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0));
            LIZ.LJJIIJZLJL();
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJJLL;
            Boolean bool2 = Boolean.FALSE;
            c48459J0d.LIZ(bool2);
            C48459J0d<Map<String, Boolean>> c48459J0d2 = InterfaceC30442Bx8.LLD;
            Map<String, Boolean> LIZJ = c48459J0d2.LIZJ();
            LIZJ.put("1", bool2);
            c48459J0d2.LIZ(LIZJ);
            C29306Beo.LJI(((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0)._$_findCachedViewById(R.id.bmk));
        }
    }

    public static final void LIZ$12(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        if (view != null) {
            BEF bef = (BEF) DataChannelGlobal.LJLJJI.mv0(C29040BaW.class);
            if (bef != null && bef.LJLILLLLZI) {
                C30868C9o.LIZJ(R.string.o7y);
                return;
            }
            DataChannel LJIILIIL = C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0);
            if (LJIILIIL != null) {
                LJIILIIL.pv0(DismissPreviewSettingDialogEvent.class);
            }
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0).getContext());
            if (LIZIZ != null) {
                BPG.LIZ(LIZIZ, true, true);
            }
            InterfaceC30442Bx8.LLLLLLIL.LIZ(Boolean.FALSE);
            BZI LIZ = C28787BRn.LIZ("livesdk_room_detail_setting");
            LIZ.LJIIZILJ();
            LIZ.LJJIFFI(C29232Bdc.LJIIZILJ(((ISubscribeService) CN1.LIZ(ISubscribeService.class)).ze0()));
            LIZ.LIZJ("click");
            LIZ.LJJIIJZLJL();
        }
    }

    public static final void LIZ$2(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        String str;
        if (view != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_comment_filter_filter_access_click");
            LIZ.LJIIZILJ();
            if (((LiveCommentSettingFragmentSheet) iDaS485S0100000_5.l0).Pl()) {
                str = "anchor";
            } else {
                str = "admin";
            }
            LIZ.LJIJJ(str, "admin_type");
            LIZ.LJJIIJZLJL();
            ((LiveCommentSettingFragmentSheet) iDaS485S0100000_5.l0).LJLZ.LJIIIIZZ(LiveFilterCommentSettingFragmentSheet.class, "live_filter_comment_setting", null, null);
        }
    }

    public static final void LIZ$3(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        if (view != null) {
            C29465BhN xl = ((LiveProfileDialog) iDaS485S0100000_5.l0).xl();
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((LiveProfileDialog) iDaS485S0100000_5.l0);
            C29481Bhd c29481Bhd = ((LiveProfileDialog) iDaS485S0100000_5.l0).LJLJI;
            if (c29481Bhd != null) {
                List<AbstractC29482Bhe<?>> LIZ = c29481Bhd.LIZ();
                C29456BhE c29456BhE = ((LiveProfileDialog) iDaS485S0100000_5.l0).LJLILLLLZI;
                if (c29456BhE != null) {
                    C29471BhT LIZ2 = xl.LIZ(lifecycleScope, LIZ, c29456BhE.LJ());
                    LiveProfileDialog liveProfileDialog = (LiveProfileDialog) iDaS485S0100000_5.l0;
                    liveProfileDialog.LLIFFJFJJ = true;
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveProfileDialog), ((LiveProfileDialog) iDaS485S0100000_5.l0).xl().LJFF, null, new C29478Bha((LiveProfileDialog) iDaS485S0100000_5.l0, LIZ2, null), 2);
                    return;
                }
                o.LJIJI("profileRoleInfo");
                throw null;
            }
            o.LJIJI("cellsContainer");
            throw null;
        }
    }

    public static final void LIZ$4(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        if (view != null) {
            ((TryModeLiveProfileDialog) iDaS485S0100000_5.l0).getClass();
            TryModeLiveProfileDialog tryModeLiveProfileDialog = (TryModeLiveProfileDialog) iDaS485S0100000_5.l0;
            tryModeLiveProfileDialog.getClass();
            tryModeLiveProfileDialog.vl(new AqS155S0100000_5(tryModeLiveProfileDialog, 459));
        }
    }

    public static final void LIZ$5(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        boolean z;
        long j;
        Boolean bool;
        if (view != null) {
            DataChannel dataChannel = ((C29739Bln) iDaS485S0100000_5.l0).LJIILIIL;
            if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BCW.class)) != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            C29750Bly DZ = ((IFansClubService) CN1.LIZ(IFansClubService.class)).DZ();
            if (DZ != null) {
                j = DZ.LJII;
            } else {
                j = 0;
            }
            if (z) {
                if (j == 0) {
                    C29739Bln c29739Bln = (C29739Bln) iDaS485S0100000_5.l0;
                    c29739Bln.LIZIZ(c29739Bln.LJIILIIL);
                } else {
                    ((C29739Bln) iDaS485S0100000_5.l0).getClass();
                    C29739Bln.LIZLLL(view);
                }
            } else {
                DataChannel dataChannel2 = ((C29739Bln) iDaS485S0100000_5.l0).LJIILIIL;
                if (dataChannel2 != null) {
                    dataChannel2.pv0(OrientationChangeEvent.class);
                }
                AbstractC73672Svk.LJJLIIIJLJLI(300L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS1S0200100_5(j, (C29739Bln) iDaS485S0100000_5.l0, view, 12));
            }
            C29739Bln c29739Bln2 = (C29739Bln) iDaS485S0100000_5.l0;
            c29739Bln2.LIZJ("anchor", true, true, c29739Bln2.LJII);
        }
    }

    public static final void LIZ$6(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        boolean z;
        long j;
        Long l;
        String str;
        Room room;
        Boolean bool;
        if (view != null) {
            ((C29746Blu) iDaS485S0100000_5.l0).LJIIJJI();
            DataChannel dataChannel = ((C29746Blu) iDaS485S0100000_5.l0).LJIILIIL;
            if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BCW.class)) != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            C29746Blu c29746Blu = (C29746Blu) iDaS485S0100000_5.l0;
            C29750Bly c29750Bly = c29746Blu.LIZLLL;
            if (c29750Bly != null) {
                j = c29750Bly.LIZ;
            } else {
                j = 0;
            }
            boolean z2 = false;
            if (z) {
                if (j <= 0) {
                    c29746Blu.LIZIZ(c29746Blu.LJIILIIL);
                } else {
                    c29746Blu.LJII = false;
                    c29746Blu.LJIILIIL(j);
                }
            } else {
                DataChannel dataChannel2 = c29746Blu.LJIILIIL;
                if (dataChannel2 != null) {
                    dataChannel2.pv0(OrientationChangeEvent.class);
                }
                AbstractC73672Svk.LJJLIIIJLJLI(300L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS4S0100100_5(j, (C29746Blu) iDaS485S0100000_5.l0, 16));
                DataChannel dataChannel3 = ((C29746Blu) iDaS485S0100000_5.l0).LJIILIIL;
                if (dataChannel3 != null && (l = (Long) dataChannel3.kv0(AudienceShowOrientationBeginTime.class)) != null) {
                    IDefinitionService iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class);
                    DataChannel dataChannel4 = ((C29746Blu) iDaS485S0100000_5.l0).LJIILIIL;
                    if (dataChannel4 == null || (room = (Room) dataChannel4.kv0(RoomChannel.class)) == null || (str = C17280m4.LIZ(room)) == null) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    iDefinitionService.Hu(1, l.longValue(), str, 0, "click_fans");
                }
            }
            C29746Blu c29746Blu2 = (C29746Blu) iDaS485S0100000_5.l0;
            InterfaceC29736Blk interfaceC29736Blk = c29746Blu2.LJIIJJI;
            if (interfaceC29736Blk != null && ((C29727Blb) interfaceC29736Blk).LJIIIZ()) {
                z2 = true;
            }
            c29746Blu2.LIZJ("user", z2, true, ((C29746Blu) iDaS485S0100000_5.l0).LJII);
        }
    }

    public static final void LIZ$7(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        if (view != null) {
            InterfaceC30442Bx8.LJJJLIIL.LIZ(Boolean.FALSE);
            C29306Beo.LJI(((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0)._$_findCachedViewById(R.id.glb));
            ModeratorListFragmentSheet rA = C7N.LJIILLIIL().rA();
            if (rA != null) {
                ((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0).LJLZ.LJIIIZ(rA, "moderator_list");
            }
            ((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0).Vl("click");
        }
    }

    public static final void LIZ$8(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        if (view != null) {
            C28787BRn.LIZ("livesdk_setting_practice_mode_click").LJJIIJZLJL();
            DataChannel LJIILIIL = C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0);
            if (LJIILIIL != null && LJIILIIL.kv0(PreviewBlockInfoChannel.class) != null) {
                BPM bpm = new BPM();
                bpm.LIZJ = R.string.mca;
                bpm.LIZIZ = "pm_liveTryMode_goLivePage_noAccessToast";
                bpm.LJFF = C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0);
                bpm.LIZLLL = true;
                C30868C9o.LJII(bpm);
                return;
            }
            ((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0).LJLZ.LJIIIIZZ(PreviewPracticeModeFragmentSheet.class, "practice_mode", null, null);
        }
    }

    public static final void LIZ$9(IDaS485S0100000_5 iDaS485S0100000_5, View view) {
        String str;
        BroadcastSettingResponse broadcastSettingResponse;
        LiveMode liveMode;
        if (view != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_ranking_icon_click");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0));
            DataChannel LJIILIIL = C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0);
            if (LJIILIIL != null && (liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) != null) {
                str = C28509BGv.LIZ(liveMode);
            } else {
                str = null;
            }
            LIZ.LJIJJ(str, "live_type");
            LIZ.LJJIIJZLJL();
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29033BaP.class)).LIZ = "live_page_setting";
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0);
            if (LJIILIIL2 != null && (broadcastSettingResponse = (BroadcastSettingResponse) LJIILIIL2.kv0(BroadcastSettingResponseChannel.class)) != null) {
                ((BasePreviewSettingMainFragmentSheet) iDaS485S0100000_5.l0).LJLZ.LJIIIZ(((IRankService) CN1.LIZ(IRankService.class)).JY(broadcastSettingResponse.giftRankSwitchStatus, broadcastSettingResponse.ecRankSwitchStatus), "preview_ranking_setting");
            }
        }
    }
}
