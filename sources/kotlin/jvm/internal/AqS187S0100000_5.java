package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.BZI;
import X.C0NB;
import X.C0WF;
import X.C1JI;
import X.C278817o;
import X.C28509BGv;
import X.C28665BMv;
import X.C28787BRn;
import X.C28963BYh;
import X.C29306Beo;
import X.C30355Bvj;
import X.C30383BwB;
import X.C75295Tgp;
import X.C76800UCe;
import X.C7N;
import X.CN1;
import X.CRD;
import X.CSH;
import X.CUH;
import X.CUL;
import X.CWA;
import X.InterfaceC88471Ynr;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridPropsService;
import com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget;
import com.bytedance.android.livesdk.broadcast.LiveBroadcastEndFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHelper;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.BlockCloseLiveReasonChannel;
import com.bytedance.android.livesdk.dataChannel.PerceptionDialogChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableHideFeedbackLabelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.ErrorCodeForFrontendSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.ErrorCodeMockSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoreErrorCodeForFrontendSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivesdkGameLiveFeedbackLabelIdsSetting;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import ql1.IDbS495S0100000_5;

/* loaded from: classes6.dex */
public class AqS187S0100000_5 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS187S0100000_5(C28963BYh c28963BYh, int i) {
        super(2);
        this.$t = i;
        this.l0 = c28963BYh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS187S0100000_5(CWA cwa, int i) {
        super(2);
        this.$t = i;
        this.l0 = cwa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS187S0100000_5(BaseCommentPinnedWidget baseCommentPinnedWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = baseCommentPinnedWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS187S0100000_5(LiveBroadcastEndFragment liveBroadcastEndFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveBroadcastEndFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS187S0100000_5(PreviewStickerHelper previewStickerHelper, int i) {
        super(2);
        this.$t = i;
        this.l0 = previewStickerHelper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS187S0100000_5(LiveStickerPropsDialog liveStickerPropsDialog, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveStickerPropsDialog;
    }

    public static final Object invoke$0(AqS187S0100000_5 aqS187S0100000_5, Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        ImageModel avatarLarge;
        List<String> urls;
        SparkContext sparkContext = (SparkContext) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(sparkContext, "sparkContext");
        if ((intValue & 2) == 2) {
            C1JI.LJJIJIL(sparkContext);
            sparkContext.LJJIJ(((IHybridPropsService) CN1.LIZ(IHybridPropsService.class)).dg());
        }
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) aqS187S0100000_5.l0;
        Room room = liveBroadcastEndFragment.LJLIL;
        LiveMode liveMode = null;
        if (room != null) {
            User owner = room.getOwner();
            if (owner == null || (avatarLarge = owner.getAvatarLarge()) == null || (urls = avatarLarge.getUrls()) == null || urls.isEmpty()) {
                str2 = null;
            } else {
                str2 = (String) ListProtector.get(urls, 0);
            }
            if (str2 == null) {
                str2 = "";
            }
            User owner2 = room.getOwner();
            if (owner2 == null || (str3 = C278817o.LIZIZ(owner2)) == null) {
                str3 = "";
            }
            String valueOf = String.valueOf(room.getId());
            String valueOf2 = String.valueOf(C7N.LJIIL().appId());
            sparkContext.LJJIIJ("live_enter_from", "");
            if (!TextUtils.isEmpty(str2)) {
                sparkContext.LJJIIJ("anchor_avatar", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                sparkContext.LJJIIJ("user_id", str3);
            }
            if (!TextUtils.isEmpty(valueOf)) {
                sparkContext.LJJIIJ("room_id", valueOf);
            }
            if (!TextUtils.isEmpty(valueOf2)) {
                sparkContext.LJJIIJ("aid", valueOf2);
            }
            Boolean hasUsedAccompanimentBusiness = C7N.LJII().hasUsedAccompanimentBusiness();
            o.LJIIIIZZ(hasUsedAccompanimentBusiness, "effectService.hasUsedAccompanimentBusiness()");
            if (hasUsedAccompanimentBusiness.booleanValue()) {
                sparkContext.LJJIIJ("survey_filter", "used_bgm");
            }
            LiveMode streamType = room.getStreamType();
            o.LJIIIIZZ(streamType, "room.streamType");
            sparkContext.LJJIIJ("live_type", C28509BGv.LIZ(streamType));
            if (ErrorCodeMockSetting.INSTANCE.enableErrorCodeMock()) {
                sparkContext.LJJIIJ("error_code", String.valueOf(ErrorCodeForFrontendSetting.INSTANCE.passErrorCode()));
                sparkContext.LJJIIJ("livecore_error_code", String.valueOf(LiveCoreErrorCodeForFrontendSetting.INSTANCE.passLiveCoreErrorCode()));
            } else {
                if (!C29306Beo.LJJIFFI((Boolean) DataChannelGlobal.LJLJJI.mv0(BlockCloseLiveReasonChannel.class))) {
                    sparkContext.LJJIIJ("error_code", String.valueOf(liveBroadcastEndFragment.LJLJLLL));
                }
                sparkContext.LJJIIJ("livecore_error_code", String.valueOf(liveBroadcastEndFragment.LJLL));
            }
            PerceptionDialogInfo perceptionDialogInfo = (PerceptionDialogInfo) DataChannelGlobal.LJLJJI.mv0(PerceptionDialogChannel.class);
            if (perceptionDialogInfo != null && perceptionDialogInfo.targetRoomId == 0) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str4 = "1";
            }
            sparkContext.LJJIIJ("end_room_reason", str4);
            sparkContext.LJJIIJ("page_open_time", String.valueOf(liveBroadcastEndFragment.LJLLILLLL));
        }
        LiveBroadcastEndFragment liveBroadcastEndFragment2 = (LiveBroadcastEndFragment) aqS187S0100000_5.l0;
        liveBroadcastEndFragment2.LJLLJ = "lynx_spark";
        sparkContext.LJJI(new IDbS495S0100000_5(liveBroadcastEndFragment2, 0));
        sparkContext.LJIJJ(liveBroadcastEndFragment2);
        ((LiveBroadcastEndFragment) aqS187S0100000_5.l0).getClass();
        Integer num = (Integer) DataChannelGlobal.LJLJJI.mv0(C30383BwB.class);
        if (num != null) {
            int intValue2 = num.intValue();
            if (intValue2 != 1) {
                if (intValue2 != 2) {
                    if (intValue2 != 3) {
                        str = "unknow";
                    } else {
                        str = "high";
                    }
                } else {
                    str = "medium";
                }
            } else {
                str = "low";
            }
            sparkContext.LJJIIJ("device_level", str);
        }
        LiveBroadcastEndFragment liveBroadcastEndFragment3 = (LiveBroadcastEndFragment) aqS187S0100000_5.l0;
        liveBroadcastEndFragment3.getClass();
        if (((IGameService) CN1.LIZ(IGameService.class)).rH()) {
            Room room2 = liveBroadcastEndFragment3.LJLIL;
            if (room2 != null) {
                liveMode = room2.getStreamType();
            }
            if (liveMode == LiveMode.SCREEN_RECORD) {
                sparkContext.LJJIIJ("feedback_core_infos", ((IGameService) CN1.LIZ(IGameService.class)).i80());
            }
        }
        ((LiveBroadcastEndFragment) aqS187S0100000_5.l0).getClass();
        if (EnableHideFeedbackLabelSetting.INSTANCE.enable()) {
            JSONArray jSONArray = new JSONArray();
            if (!((IGameService) CN1.LIZ(IGameService.class)).TM()) {
                LivesdkGameLiveFeedbackLabelIdsSetting livesdkGameLiveFeedbackLabelIdsSetting = LivesdkGameLiveFeedbackLabelIdsSetting.INSTANCE;
                String game_freezing_or_high_ping = livesdkGameLiveFeedbackLabelIdsSetting.getValue().getGame_freezing_or_high_ping();
                String low_audio_quality = livesdkGameLiveFeedbackLabelIdsSetting.getValue().getLow_audio_quality();
                if (C29306Beo.LJIJJLI(game_freezing_or_high_ping)) {
                    jSONArray.put(game_freezing_or_high_ping);
                }
                if (C29306Beo.LJIJJLI(low_audio_quality)) {
                    jSONArray.put(low_audio_quality);
                }
                if (jSONArray.length() > 0) {
                    String jSONArray2 = jSONArray.toString();
                    o.LJIIIIZZ(jSONArray2, "idsJsonArray.toString()");
                    sparkContext.LJJIIJ("hide_label_ids", jSONArray2);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS187S0100000_5 aqS187S0100000_5, Object obj, Object obj2) {
        CUH cuh;
        CSH<? extends CRD> p = (CSH) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(p, "p");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Callback invoked, VH = ");
        LIZ.append(((BaseCommentPinnedWidget) aqS187S0100000_5.l0).LJLJL);
        LIZ.append(", PinnedModel: ");
        LIZ.append(p);
        LIZ.append(", PerformHiding: ");
        LIZ.append(booleanValue);
        C0NB.LJ("PinnedWidget", X1D.LIZIZ(LIZ));
        BaseCommentPinnedWidget baseCommentPinnedWidget = (BaseCommentPinnedWidget) aqS187S0100000_5.l0;
        CUL<? extends CRD, CSH<? extends CRD>> cul = baseCommentPinnedWidget.LJLJL;
        if ((cul instanceof CUH) && (cuh = (CUH) cul) != null) {
            cuh.itemView.setAlpha(1.0f);
            if (booleanValue) {
                cuh.onHide();
            }
            if (cuh.isRecyclable()) {
                baseCommentPinnedWidget.LLIIIJ(p, cuh);
            }
        }
        ((BaseCommentPinnedWidget) aqS187S0100000_5.l0).LJLJL = null;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS187S0100000_5 aqS187S0100000_5, Object obj, Object obj2) {
        Room room;
        Long l;
        User owner;
        Long l2;
        long j;
        User owner2;
        int i;
        int i2;
        Sticker sticker;
        TreeMap allVisibleItems = (TreeMap) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        LiveStickerPropsDialog liveStickerPropsDialog = (LiveStickerPropsDialog) aqS187S0100000_5.l0;
        DataChannel dataChannel = liveStickerPropsDialog.dataChannel;
        C28665BMv c28665BMv = liveStickerPropsDialog.LJLIL;
        if (c28665BMv != null) {
            if (dataChannel != null) {
                room = (Room) dataChannel.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (Map.Entry entry : allVisibleItems.entrySet()) {
                int i3 = ((C75295Tgp) entry.getValue()).LIZ;
                if (c28665BMv.getItemViewType(i3) != 1) {
                    if (c28665BMv.LJLZ() >= 3 && i3 > ((c28665BMv.LJLJI + c28665BMv.LJLJJI) + 2) - 2) {
                        i2 = 3;
                    } else {
                        if (c28665BMv.LJLZ() >= 2) {
                            i = 1;
                            if (i3 > c28665BMv.LJZ() - 1) {
                                i2 = 2;
                            }
                        } else {
                            i = 1;
                        }
                        if (c28665BMv.LJLZ() >= i && i3 > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                    }
                    int i4 = i3 - i2;
                    if (i4 >= 0 && i4 < ((ArrayList) c28665BMv.LJLILLLLZI).size() && (sticker = (Sticker) ListProtector.get(c28665BMv.LJLILLLLZI, i4)) != null) {
                        int i5 = sticker.type;
                        String str = "";
                        if (i5 == 4) {
                            arrayList.add(Integer.valueOf(c28665BMv.LJLLLLLL(((C75295Tgp) entry.getValue()).LIZ) + 1));
                            arrayList2.add(Long.valueOf(sticker.id));
                            String str2 = sticker.LIZ;
                            if (str2 != null) {
                                str = str2;
                            }
                            arrayList3.add(str);
                        } else if (i5 == 5 || i5 == 6) {
                            arrayList4.add(Integer.valueOf(c28665BMv.LJLLLLLL(((C75295Tgp) entry.getValue()).LIZ) + 1));
                            arrayList5.add(Long.valueOf(sticker.id));
                            String str3 = sticker.LIZ;
                            if (str3 != null) {
                                str = str3;
                            }
                            arrayList6.add(str);
                        }
                    }
                }
            }
            long j2 = 0;
            if ((!arrayList5.isEmpty()) && (!arrayList6.isEmpty())) {
                BZI LIZ = C28787BRn.LIZ("livesdk_live_picture_prop_panel_show");
                if (room != null && (owner2 = room.getOwner()) != null) {
                    l2 = Long.valueOf(owner2.getId());
                } else {
                    l2 = null;
                }
                LIZ.LJIJJ(String.valueOf(l2), "anchor_id");
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                LIZ.LJIJJ(Long.valueOf(j), "room_id");
                LIZ.LJIJJ("video_live", "live_type");
                LIZ.LJIIJJI("live_take_detail");
                LIZ.LJIJJ(arrayList4.toString(), "prop_position");
                LIZ.LJIJJ(arrayList5.toString(), "prop_id_set");
                LIZ.LJIJJ(arrayList6.toString(), "resource_id_set");
                LIZ.LJIILLIIL(dataChannel);
                LIZ.LJJIIJZLJL();
            }
            if ((!arrayList2.isEmpty()) && (!arrayList3.isEmpty())) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_character_prop_panel_show");
                if (room != null && (owner = room.getOwner()) != null) {
                    l = Long.valueOf(owner.getId());
                } else {
                    l = null;
                }
                LIZ2.LJIJJ(String.valueOf(l), "anchor_id");
                if (room != null) {
                    j2 = room.getId();
                }
                LIZ2.LJIJJ(Long.valueOf(j2), "room_id");
                LIZ2.LJIJJ("video_live", "live_type");
                LIZ2.LJIIJJI("live_take_detail");
                LIZ2.LJIJJ(arrayList.toString(), "prop_position");
                LIZ2.LJIJJ(arrayList2.toString(), "prop_id_set");
                LIZ2.LJIJJ(arrayList3.toString(), "resource_id_set");
                LIZ2.LJIILLIIL(dataChannel);
                LIZ2.LJJIIJZLJL();
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    public static final Object invoke$3(AqS187S0100000_5 aqS187S0100000_5, Object obj, Object obj2) {
        String key = (String) obj;
        String filePath = (String) obj2;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(filePath, "filePath");
        int LLIIIJ = ((PreviewStickerHelper) aqS187S0100000_5.l0).LJLJJLL.LLIIIJ(key, filePath);
        C0WF LIZJ = C30355Bvj.LIZJ();
        LIZJ.LJIJJLI(key);
        LIZJ.LIZJ(filePath);
        return Integer.valueOf(LLIIIJ);
    }

    public static final Object invoke$4(AqS187S0100000_5 aqS187S0100000_5, Object obj, Object obj2) {
        ((C28963BYh) aqS187S0100000_5.l0).LIZIZ(((Number) obj).longValue(), ((Number) obj2).longValue(), false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS187S0100000_5 aqS187S0100000_5, Object obj, Object obj2) {
        ((CWA) aqS187S0100000_5.l0).getCallback().LJI(((Number) obj).intValue(), ((Number) obj2).intValue());
        return C76800UCe.LIZ;
    }
}
