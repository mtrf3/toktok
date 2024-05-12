package com.bytedance.android.livesdk.definition;

import X.B57;
import X.B83;
import X.B9F;
import X.B9G;
import X.BZI;
import X.C06540Nm;
import X.C28509BGv;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C47261Igj;
import X.C78886Uxe;
import X.C78963Uyt;
import X.CN1;
import X.InterfaceC28738BPq;
import X.ORZ;
import X.OSZ;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class DefinitionService implements IDefinitionService {
    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final boolean aK() {
        B9G b9g = (B9G) ORZ.LLFII(C78886Uxe.LJIIJ(null));
        if (b9g != null) {
            return b9g.LIZLLL;
        }
        return false;
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final OSZ<String, String> h70() {
        List LJIIJ = C78886Uxe.LJIIJ(null);
        Iterator it = LJIIJ.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (((B9G) ListProtector.get(LJIIJ, i)).LIZLLL && i2 < LJIIJ.size()) {
                    String str = ((B9G) ListProtector.get(LJIIJ, i2)).LIZ;
                    String str2 = ((B9G) ListProtector.get(LJIIJ, i2)).LIZJ;
                    if (str == null || str2 == null) {
                        return null;
                    }
                    return new OSZ<>(str2, str);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void xO() {
        Object obj = null;
        Iterator it = C78886Uxe.LJIIJ(null).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (o.LJ(((B9G) next).LIZJ, "auto")) {
                obj = next;
                break;
            }
        }
        B9G b9g = (B9G) obj;
        if (b9g != null) {
            String str = b9g.LIZ;
            String str2 = b9g.LIZJ;
            if (str != null && str2 != null) {
                new OSZ(str2, str);
            }
        }
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void V90(EnterRoomConfig enterRoomConfig, String roomId) {
        o.LJIIIZ(roomId, "roomId");
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_screen_rotate_btn_show", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (enterRoomConfig != null) {
            String str = enterRoomConfig.mRoomsData.enterFromMerge;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            hashMap.put("enter_from_merge", str);
            String str3 = enterRoomConfig.mRoomsData.enterMethod;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("enter_method", str3);
            String str4 = enterRoomConfig.mRoomsData.actionType;
            if (str4 != null) {
                str2 = str4;
            }
            hashMap.put("action_type", str2);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_user_screen_rotate_btn_show");
        LIZ.LJIJJ(C78963Uyt.LJIIIZ(), "anchor_id");
        LIZ.LJIJJ(roomId, "room_id");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void bT(FragmentManager fragmentManager, boolean z) {
        B9F.LIZ(fragmentManager, z);
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void gV(String str, String str2) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_definition_selection_btn_show");
        C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id", str, "current_definition");
        LIZ.LJIJ(str2);
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final String kh0(int i, int i2) {
        if (i2 != -1) {
            if (C29306Beo.LJIIZILJ(i2)) {
                if (C29306Beo.LJIIZILJ(i)) {
                    return "landscape_to_landscape";
                }
                return "landscape_to_portrait";
            }
            if (C29306Beo.LJIJ(i2) && C29306Beo.LJIIZILJ(i)) {
                return "portrait_to_landscape";
            }
        }
        return "null";
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void op(String str, String str2) {
        C78963Uyt.LJJIJL(str, str2, "1");
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void Mr(String str, String str2, String str3) {
        String str4;
        String str5;
        LiveMode streamType;
        String str6 = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str6);
        if (LIZIZ == null || (str4 = LIZIZ.getCurrentResolution()) == null) {
            str4 = "";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_definition_switch_show");
        LIZ.LJIJJ(C78963Uyt.LJIIIZ(), "anchor_id");
        LIZ.LJIJJ(str, "room_id");
        LIZ.LJIJJ(Long.valueOf(C78963Uyt.LJJ()), "user_id");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str7 = C28509BGv.LIZ(streamType);
        }
        LIZ.LJIJJ(str7, "live_type");
        if (o.LJ(CardStruct.IStatusCode.DEFAULT, str3)) {
            str5 = "portrait";
        } else {
            str5 = "landscape";
        }
        LIZ.LJIJJ(str5, "room_orientation");
        LIZ.LJIJJ(str4, "current_definition");
        LIZ.LJIJ(str2);
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void Hu(int i, long j, String roomId, int i2, String str) {
        String str2;
        String str3;
        o.LJIIIZ(roomId, "roomId");
        BZI LIZ = C28787BRn.LIZ("livesdk_user_screen_rotate_btn_click");
        LIZ.LJIJJ(C78963Uyt.LJIIIZ(), "anchor_id");
        LIZ.LJIJJ(roomId, "room_id");
        LIZ.LJIJJ(str, "action");
        if (C29306Beo.LJIJ(i)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        LIZ.LJIJJ(str2, "room_orientation_after");
        if (i != i2) {
            if (C29306Beo.LJIIZILJ(i2)) {
                if (C29306Beo.LJIIZILJ(i)) {
                    str3 = "landscape_to_landscape";
                } else {
                    str3 = "landscape_to_portrait";
                }
            } else if (C29306Beo.LJIJ(i2) && C29306Beo.LJIIZILJ(i)) {
                str3 = "portrait_to_landscape";
            }
            LIZ.LJIJJ(str3, "rotate_type");
            LIZ.LJIJJ(String.valueOf((System.currentTimeMillis() - j) / 1000), "duration");
            LIZ.LJJIIJZLJL();
        }
        str3 = "null";
        LIZ.LJIJJ(str3, "rotate_type");
        LIZ.LJIJJ(String.valueOf((System.currentTimeMillis() - j) / 1000), "duration");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.definition.IDefinitionService
    public final void FK(String str, String str2, String str3, String duration, String str4, String curDefinition) {
        o.LJIIIZ(duration, "duration");
        o.LJIIIZ(curDefinition, "curDefinition");
        C78963Uyt.LJJIJLIJ(str, str2, str3, duration, str4, "pool_connection", curDefinition);
    }
}
