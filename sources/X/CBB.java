package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSubCapsuleGovernanceSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubCapsuleNotFilterSceneSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeGoalsLynxUrlSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class CBB implements InterfaceC29848BnY {
    public static CBE LJII(C29846BnW c29846BnW) {
        CBE cbe;
        if (o.LJ("notice_viewer_new_goal", ((CapsuleMessage) c29846BnW.LJIJJLI).scene) || o.LJ("notice_anchor_reset_goal", ((CapsuleMessage) c29846BnW.LJIJJLI).scene)) {
            return CBE.SUPPORT;
        }
        COL col = c29846BnW.LJJIFFI;
        if (col != null && (cbe = (CBE) col.LIZIZ) != null) {
            return cbe;
        }
        return CBE.SUBSCRIBE;
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LIZJ(C29846BnW model) {
        Object obj;
        String str;
        Integer num;
        o.LJIIIZ(model, "model");
        CQQ LJLIIL = model.LJLIIL();
        String str2 = "sub_capsule";
        C30929CBx.LJIILL("sub_capsule");
        COL col = model.LJJIFFI;
        Boolean bool = null;
        if (col != null) {
            obj = col.LIZ;
        } else {
            obj = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (model.LJIJJLI.isLocalInsertMsg) {
            linkedHashMap.put("extra_dict", obj);
        }
        Room room = LJLIIL.LJI;
        if (room != null) {
            if (o.LJ(((CapsuleMessage) model.LJIJJLI).scene, "unaccess_after_update") || o.LJ(((CapsuleMessage) model.LJIJJLI).scene, "unfinished_on_boarding")) {
                ISubscribeService iSubscribeService = (ISubscribeService) CN1.LIZ(ISubscribeService.class);
                Context LIZLLL = C15380j0.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "getContext()");
                if (o.LJ(((CapsuleMessage) model.LJIJJLI).scene, "unaccess_after_update")) {
                    str = "sub_new_benefit_capsule";
                } else {
                    str = "sub_benefit_capsule";
                }
                iSubscribeService.Ee(LIZLLL, room, str);
            } else if (C29306Beo.LJIJJLI(((CapsuleMessage) model.LJIJJLI).schema)) {
                if (LJII(model) == CBE.SUPPORT) {
                    str2 = "sub_goal_capsule";
                }
                CapsuleMessage capsuleMessage = (CapsuleMessage) model.LJIJJLI;
                String str3 = capsuleMessage.schema;
                if (o.LJ(capsuleMessage.scene, "sub_gift_tiktok2user_notice") || o.LJ(((CapsuleMessage) model.LJIJJLI).scene, "sub_gift_tiktok2anchor_notice") || o.LJ(((CapsuleMessage) model.LJIJJLI).scene, "sub_gift_anchor_remaining_present_notice")) {
                    str2 = "sub_gift_capsule";
                } else {
                    o.LJ(((CapsuleMessage) model.LJIJJLI).scene, "live_sub_only_use_music");
                }
                if (str3 != null) {
                    C31847Ceh.LJII(LJLIIL.LIZ, room, str3, str2);
                }
            } else if (LJII(model) == CBE.SUBSCRIBE) {
                SubscribeInfo subscribeInfo = room.getOwner().getSubscribeInfo();
                if (subscribeInfo != null) {
                    bool = Boolean.valueOf(subscribeInfo.isSubscribed());
                }
                if (!C29306Beo.LJJIFFI(bool)) {
                    InterfaceC06390Mx LIZ = CN1.LIZ(ISubscribeService.class);
                    o.LJIIIIZZ(LIZ, "getService(ISubscribeService::class.java)");
                    ISubscribeService iSubscribeService2 = (ISubscribeService) LIZ;
                    Context LIZLLL2 = C15380j0.LIZLLL();
                    o.LJIIIIZZ(LIZLLL2, "getContext()");
                    DataChannel dataChannel = LJLIIL.LJIIIIZZ;
                    if (dataChannel != null && (num = (Integer) dataChannel.kv0(BCH.class)) != null && num.intValue() > 0) {
                        str2 = "activity_anchor_list";
                    }
                    iSubscribeService2.dc(LIZLLL2, room, str2, linkedHashMap, null);
                } else {
                    ISubscribeService iSubscribeService3 = (ISubscribeService) CN1.LIZ(ISubscribeService.class);
                    Context LIZLLL3 = C15380j0.LIZLLL();
                    o.LJIIIIZZ(LIZLLL3, "getContext()");
                    iSubscribeService3.ui0(LIZLLL3, room, "sub_capsule", linkedHashMap);
                }
            } else if (LJII(model) == CBE.EXTEND) {
                ISubscribeService iSubscribeService4 = (ISubscribeService) CN1.LIZ(ISubscribeService.class);
                Context LIZLLL4 = C15380j0.LIZLLL();
                o.LJIIIIZZ(LIZLLL4, "getContext()");
                iSubscribeService4.ui0(LIZLLL4, room, "sub_capsule", linkedHashMap);
            } else if (LJII(model) == CBE.SUPPORT) {
                Context LIZLLL5 = C15380j0.LIZLLL();
                o.LJIIIIZZ(LIZLLL5, "getContext()");
                C31847Ceh.LJII(LIZLLL5, room, SubscribeGoalsLynxUrlSetting.INSTANCE.getUser_detail_popup(), "sub_goal_capsule");
            } else if (LJII(model) == CBE.MUSIC) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZLLL(C29846BnW capsuleModel) {
        Long l;
        int i;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        if (((CapsuleMessage) capsuleModel.LJIJJLI).scene.equals("sub_gift_tiktok2anchor_notice")) {
            Integer num = InterfaceC30442Bx8.K0.LIZJ().get(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            String valueOf = String.valueOf(capsuleModel.getContent());
            String LJLLI = s.LJLLI(valueOf, "You have ", valueOf);
            try {
                i = CastIntegerProtector.parseInt(s.LJLLL(LJLLI, " subscription", LJLLI));
            } catch (Exception unused) {
                i = 0;
            }
            if (num != null) {
                java.util.Map<Long, Integer> LIZJ = InterfaceC30442Bx8.K0.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_SUB_GIFT_COUNT.value");
                LIZJ.put(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), Integer.valueOf(num.intValue() + i));
            }
        }
        C30929CBx.LJIILLIIL("sub_capsule");
        if (o.LJ(((CapsuleMessage) capsuleModel.LJIJJLI).scene, "live_sub_only_use_music")) {
            BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_music_guide_capsule_show");
            LIZ.LJIIZILJ();
            Room room = capsuleModel.LJLIIL().LJI;
            Long l2 = null;
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "anchor_id");
            Room room2 = capsuleModel.LJLIIL().LJI;
            if (room2 != null) {
                l2 = Long.valueOf(room2.getId());
            }
            LIZ.LJIJJ(l2, "room_id");
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // X.InterfaceC29848BnY
    public final void LJ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZIZ(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LJFF(CQQ publicScreenContext, CapsuleMessage message) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        o.LJIIIZ(message, "message");
        if (!C78609UtB.LJJJZ(publicScreenContext.LJFF)) {
            return true;
        }
        LiveSubCapsuleGovernanceSetting liveSubCapsuleGovernanceSetting = LiveSubCapsuleGovernanceSetting.INSTANCE;
        if (liveSubCapsuleGovernanceSetting.subCapsuleDefault()) {
            return true;
        }
        if (C29306Beo.LJIILLIIL(Boolean.valueOf(publicScreenContext.LJFF)) && liveSubCapsuleGovernanceSetting.subCapsuleRollOff()) {
            String str = message.scene;
            for (String str2 : LiveSubCapsuleNotFilterSceneSetting.getValue()) {
                if (!str2.equals(str)) {
                }
            }
            return true;
        }
        C29837BnN.LIZ(publicScreenContext, message);
        return false;
    }

    @Override // X.InterfaceC29848BnY
    public final void LJI(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }
}
