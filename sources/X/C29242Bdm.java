package X;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bdm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29242Bdm implements InterfaceC62096OYq {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ C29930Bos LJLILLLLZI;
    public final /* synthetic */ LongPressWidget LJLJI;

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final void onDismiss() {
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIILLIIL(false);
        }
    }

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIILLIIL(false);
        }
    }

    public C29242Bdm(Room room, C29930Bos c29930Bos, LongPressWidget longPressWidget) {
        this.LJLIL = room;
        this.LJLILLLLZI = c29930Bos;
        this.LJLJI = longPressWidget;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String platform, String shareType, Bundle bundle) {
        int i;
        String str;
        Integer num;
        String str2;
        String str3;
        List<Long> list;
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(shareType, "shareType");
        int i2 = 0;
        if (bundle != null) {
            i = bundle.getInt(LiveOuterService.LJJJLL().LJJIJIL().LJJIIZI(2));
        } else {
            i = 0;
        }
        if (bundle != null) {
            i2 = bundle.getInt(LiveOuterService.LJJJLL().LJJIJIL().LJJIIZI(1));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("share_success");
        LIZ.append(System.currentTimeMillis());
        String bindId = MD5Utils.getMD5String(X1D.LIZIZ(LIZ));
        String str4 = "";
        if (bundle == null) {
            str = "";
        } else {
            str = bundle.getString("shareIdList", "");
        }
        HashMap hashMap = new HashMap();
        RoomLinkInfo linkMicInfo = this.LJLIL.getLinkMicInfo();
        String str5 = null;
        if (linkMicInfo != null && (list = linkMicInfo.audienceIdList) != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        if (num != null && num.intValue() > 0) {
            hashMap.put("is_guest_connection", "1");
        } else {
            hashMap.put("is_guest_connection", CardStruct.IStatusCode.DEFAULT);
        }
        hashMap.put("share_platform", platform);
        hashMap.put("share_type", shareType);
        hashMap.put("user_type", "user");
        C29930Bos c29930Bos = this.LJLILLLLZI;
        if (c29930Bos != null && (str3 = c29930Bos.LJJ) != null) {
            str4 = str3;
        }
        hashMap.put("request_page", str4);
        o.LJIIIIZZ(bindId, "bindId");
        hashMap.put("bind_id", bindId);
        hashMap.put("room_orientation", "portrait");
        hashMap.putAll(BJB.LIZ());
        BZI LIZ2 = C28787BRn.LIZ("livesdk_share");
        C86343Xud LJLZ = this.LJLJI.LJLZ();
        if (LJLZ != null) {
            str2 = LJLZ.LIZJ;
        } else {
            str2 = null;
        }
        LIZ2.LJIJJ(str2, "enter_from_merge");
        LIZ2.LJIJJ("live_cell", "enter_method");
        LIZ2.LJIJJ(Long.valueOf(this.LJLIL.getOwnerUserId()), "anchor_id");
        LIZ2.LJIJJ(Long.valueOf(this.LJLIL.getId()), "room_id");
        LIZ2.LJIJJ("click", "action_type");
        LIZ2.LJIJJ(Integer.valueOf(i), "is_create_group_chat");
        LIZ2.LJIJJ(Integer.valueOf(i2), "friends_shared_cnt");
        this.LJLJI.getClass();
        if (bundle != null) {
            str5 = bundle.getString(LiveOuterService.LJJJLL().LJJIJIL().LJJIIZI(3));
        }
        String str6 = "top_supporters";
        if (!TextUtils.equals(str5, "top_supporters")) {
            str6 = "recently_shared";
            if (!TextUtils.equals(str5, "recently_shared")) {
                str6 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
        }
        LIZ2.LJIJJ(str6, "batch_share_type");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_share"));
        LIZ2.LJJIIJZLJL();
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("share_info")) {
            BZI LIZ3 = C28787BRn.LIZ("share_info");
            LIZ3.LJIJJ(bindId, "bind_id");
            LIZ3.LJIJJ(str, "to_user_id");
            LIZ3.LJJIIJZLJL();
        }
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIILLIIL(true);
        }
    }
}
