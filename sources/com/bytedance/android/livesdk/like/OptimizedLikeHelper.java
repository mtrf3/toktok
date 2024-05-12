package com.bytedance.android.livesdk.like;

import X.ActivityC45651qj;
import X.B5G;
import X.B83;
import X.BJM;
import X.BZI;
import X.C15380j0;
import X.C28594BKc;
import X.C28787BRn;
import X.C28835BTj;
import X.C29044Baa;
import X.C29374Bfu;
import X.C29841BnR;
import X.C38354F3m;
import X.C64504PTg;
import X.CN1;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostHasAutoMatchSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class OptimizedLikeHelper extends LikeHelper {
    public static final int LLILLL = C15380j0.LIZ(85.0f);
    public static final int LLILZ = C15380j0.LIZ(32.0f);
    public static final float LLILZIL = C15380j0.LIZ(134.0f);
    public static final float LLILZLL = C15380j0.LIZ(236.0f);
    public static final float LLIZ = C15380j0.LIZ(55.0f);

    @Override // com.bytedance.android.livesdk.like.LikeHelper
    public final void LJJIIZI(int i) {
    }

    @Override // com.bytedance.android.livesdk.like.LikeHelper, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.like.LikeHelper
    public final float LJJII(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    @Override // com.bytedance.android.livesdk.like.LikeHelper
    public final float LJJIII(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    public static Bitmap LJJIJIIJIL(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Rect rect = new Rect(0, 0, i, i);
        RectF rectF = new RectF(rect);
        float f = i >> 1;
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        paint.setColor(ColorProtector.parseColor("#ffffff"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C15380j0.LIZ(1.3f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        return createBitmap;
    }

    @Override // com.bytedance.android.livesdk.like.LikeHelper
    public final void LJJIJ(int i, long j, boolean z) {
        long j2;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("live_source", this.LJLZ);
        hashMap.put("request_id", this.LJLJI.getRequestId());
        hashMap.put("log_pb", this.LJLJI.getLog_pb());
        hashMap.put("like_amount", String.valueOf(i));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJI.getUserFrom());
        LIZ.append("");
        hashMap.put("source", X1D.LIZIZ(LIZ));
        String LIZLLL = C28594BKc.LIZJ().LIZLLL();
        if (!C38354F3m.LJ(LIZLLL)) {
            hashMap.put("enter_live_method", LIZLLL);
        }
        String LJIIIZ = BJM.LJIIIZ();
        String str2 = "1";
        if (!TextUtils.isEmpty(LJIIIZ) && "click_push_live_cd_user".equals(LJIIIZ)) {
            hashMap.put("is_subscribe", "1");
        } else {
            hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (C15380j0.LJIILLIIL()) {
            hashMap.put("room_orientation", "portrait");
        } else {
            hashMap.put("room_orientation", "landscape");
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (dataChannelGlobal.mv0(C29044Baa.class) != null) {
            j2 = ((Room) dataChannelGlobal.mv0(C29044Baa.class)).getOwnerUserId();
        } else {
            j2 = 0;
        }
        long j3 = B5G.LIZIZ().LJI;
        String str3 = "anchor";
        if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            hashMap.put("connection_type", "anchor");
            hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
            List<Long> QD = ((IInteractService) CN1.LIZ(IInteractService.class)).QD();
            if (QD.size() <= 2) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_multi", str2);
            if (MultiCohostHasAutoMatchSetting.INSTANCE.getValue() || QD.size() <= 2) {
                ((IInteractService) CN1.LIZ(IInteractService.class)).WA(hashMap);
            }
            if (B5G.LIZIZ().LJIIL) {
                C64504PTg.LIZJ(j2, hashMap, "connection_inviter_id", j3, "connection_invitee_id");
            } else {
                C64504PTg.LIZJ(j2, hashMap, "connection_invitee_id", j3, "connection_inviter_id");
            }
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
            hashMap.put("connection_type", "manual_pk");
            hashMap.put("pk_id", String.valueOf(B5G.LIZIZ().LJJJJJL));
            if (((IInteractService) CN1.LIZ(IInteractService.class)).GQ()) {
                C64504PTg.LIZJ(j2, hashMap, "pk_inviter_id", j3, "pk_invitee_id");
            } else {
                C64504PTg.LIZJ(j2, hashMap, "pk_invitee_id", j3, "pk_inviter_id");
            }
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                hashMap.put("match_status", "pk_phase");
            } else {
                hashMap.put("match_status", "punish");
            }
            hashMap.putAll(((IInteractService) CN1.LIZ(IInteractService.class)).L00());
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).ta0()) {
            hashMap.put("connection_type", "audience");
        }
        hashMap.put("admin_type", C29841BnR.LIZIZ(this.LJLJI, this.LLI));
        hashMap.put("user_type", ((IInteractService) CN1.LIZ(IInteractService.class)).Ng(((C29374Bfu) B83.LIZ().LIZIZ()).LJ()));
        if (j != this.LJLJI.getOwnerUserId()) {
            str3 = "guest";
        }
        hashMap.put("to_user_type", str3);
        hashMap.put("to_user_id", String.valueOf(j));
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        if (z) {
            str = "user_profile";
        } else {
            str = "live_room";
        }
        hashMap.put("request_page", str);
        BZI LIZ2 = C28787BRn.LIZ("like");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIZILJ();
        LIZ2.LIZLLL(C28835BTj.LIZIZ(null, this.LLI, "user_live_like"));
        LIZ2.LJIIIZ("live_interact");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIIJZLJL();
            return;
        }
        LIZ2.LJJIJ();
        LIZ2.LJJIIZ();
        LIZ2.LJJIIZI();
    }

    public OptimizedLikeHelper(ActivityC45651qj activityC45651qj, LifecycleOwner lifecycleOwner, Room room, boolean z, boolean z2, DataChannel dataChannel) {
        super(activityC45651qj, lifecycleOwner, room, z, z2, dataChannel);
    }

    @Override // com.bytedance.android.livesdk.like.LikeHelper
    public final void LJJIIZ(int i, int i2, int i3, float f, float f2, float f3, float f4) {
        super.LJJIIZ(i, i2, i3, f, f2, f3, f4);
    }
}
