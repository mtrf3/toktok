package X;

import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.rank.impl.view.AudienceListGiftGuideDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BQK {
    public final boolean LIZ;
    public CV6 LIZIZ;

    public BQK(DataChannel dataChannel) {
        boolean z;
        if (dataChannel != null) {
            z = C29306Beo.LJIIJ(dataChannel);
        } else {
            z = false;
        }
        this.LIZ = !z;
    }

    public final void LIZ(int i, CV6 item, DataChannel dataChannel) {
        String str;
        String str2;
        long j;
        long j2;
        String str3;
        LiveMode streamType;
        o.LJIIIZ(item, "item");
        String str4 = null;
        if (dataChannel != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_top2_audience_slot_click");
            LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
            LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            if (room != null) {
                j = room.getOwnerUserId();
            } else {
                j = 0;
            }
            LIZ.LJIJJ(Long.valueOf(j), "anchor_id");
            Room room2 = (Room) dataChannel.kv0(RoomChannel.class);
            if (room2 != null) {
                j2 = room2.getId();
            } else {
                j2 = 0;
            }
            LIZ.LJIJJ(Long.valueOf(j2), "room_id");
            Room room3 = (Room) dataChannel.kv0(RoomChannel.class);
            if (room3 != null && (streamType = room3.getStreamType()) != null) {
                str4 = C28509BGv.LIZ(streamType);
            }
            LIZ.LJIJJ(str4, "live_type");
            LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
            if (C29306Beo.LJIIJ(dataChannel)) {
                str3 = "anchor";
            } else {
                str3 = "user";
            }
            LIZ.LJIJJ(str3, "user_type");
            if (C29306Beo.LJIIJ(dataChannel)) {
                LIZ.LJIJJ("null", "user_rank");
            } else {
                LIZ.LJIJJ(Long.valueOf(UCH.LJ()), "user_rank");
            }
            long j3 = item.LIZJ;
            if (j3 <= 0) {
                LIZ.LJIJJ("null", "to_user_rank");
                LIZ.LJIJJ("null", "to_user_coins");
                C78895Uxn.LIZIZ(LIZ, "null", "is_vague", 1, "is_empty");
            } else {
                LIZ.LJIJJ(Long.valueOf(j3), "to_user_rank");
                LIZ.LJIJJ(Long.valueOf(item.LIZIZ), "to_user_coins");
                LIZ.LJIJJ(Integer.valueOf(UCH.LJI(item.LIZJ, dataChannel)), "is_vague");
                LIZ.LJIJJ(0, "is_empty");
            }
            LIZ.LJIJJ(Integer.valueOf(i + 1), "slot_rank");
            LIZ.LJJIIJZLJL();
        }
        if (item.LIZJ <= 0) {
            if (this.LIZ) {
                if (dataChannel != null) {
                    try {
                        FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
                        if (fragmentManager != null) {
                            AudienceListGiftGuideDialog audienceListGiftGuideDialog = new AudienceListGiftGuideDialog();
                            audienceListGiftGuideDialog.LJLJJLL = i;
                            audienceListGiftGuideDialog.show(fragmentManager, fragmentManager.getClass().getName());
                            return;
                        }
                    } catch (IllegalStateException unused) {
                        return;
                    }
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(item.LIZ.getId(), "top_viewer_rank_out");
        userProfileEvent.mClickUserPosition = "top_active_user_rank";
        userProfileEvent.mReportType = "report_user";
        userProfileEvent.mSource = "top_active_user_rank";
        userProfileEvent.mShowEntrance = "top_right_active_user_rank";
        C28177B4b c28177B4b = C28177B4b.LJLIL;
        User user = item.LIZ;
        String str5 = "";
        if (user == null || (str = C278817o.LIZIZ(user)) == null) {
            str = "";
        }
        String l = Long.valueOf(item.LIZJ).toString();
        if (l != null) {
            str5 = l;
        }
        if (((Boolean) c28177B4b.invoke()).booleanValue()) {
            str2 = "live_anchor_c_audience";
        } else {
            str2 = "live_audience_c_audience";
        }
        LinkedHashMap LIZIZ = JF1.LIZIZ("to_user_id", str, "to_user_rank", str5);
        LIZIZ.put("click_user_position", "top_active_user_rank");
        LIZIZ.put("rank_position", "top_right");
        LIZIZ.put("request_page", str2);
        if (((Boolean) c28177B4b.invoke()).booleanValue()) {
            LIZIZ.put("from_user_rank", "null");
        } else {
            LIZIZ.put("from_user_rank", String.valueOf(C28652BMi.LIZJ));
        }
        userProfileEvent.mRankInfo = LIZIZ;
        C73943T0h.LIZ().LIZIZ(userProfileEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.widget.ImageView r9, X.CV6 r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            com.bytedance.android.live.base.model.user.User r0 = r10.LIZ
            com.bytedance.android.live.base.model.ImageModel r0 = r0.getAvatarThumb()
            r3 = 0
            if (r0 == 0) goto Lab
            java.util.List<java.lang.String> r0 = r0.mUrls
        L10:
            r7 = 0
            if (r0 == 0) goto La8
            int r0 = r0.size()
        L17:
            r6 = 1
            if (r0 > 0) goto La5
            r0 = 1
        L1b:
            r4 = 2131235440(0x7f081270, float:1.8087074E38)
            r1 = 2
            if (r0 == 0) goto L42
            android.content.Context r0 = r9.getContext()
            android.content.res.Resources r2 = r0.getResources()
            boolean r0 = r8.LIZ
            if (r0 == 0) goto L33
            int r0 = r11 + 1
            if (r0 == r6) goto L36
            if (r0 == r1) goto L3e
        L33:
            r4 = 2131235612(0x7f08131c, float:1.8087423E38)
        L36:
            android.graphics.drawable.Drawable r0 = X.C0OW.LIZ(r2, r4, r3)
            r9.setImageDrawable(r0)
        L3d:
            return
        L3e:
            r4 = 2131235441(0x7f081271, float:1.8087076E38)
            goto L36
        L42:
            com.bytedance.android.livesdk.livesetting.watchlive.LiveAudienceImageCacheRefactorSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveAudienceImageCacheRefactorSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L9c
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            int r3 = r0.width
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            int r2 = r0.height
        L56:
            com.bytedance.android.live.base.model.user.User r0 = r10.LIZ
            com.bytedance.android.live.base.model.ImageModel r5 = r0.getAvatarThumb()
            boolean r0 = r8.LIZ
            if (r0 == 0) goto L66
            int r0 = r11 + 1
            if (r0 == r6) goto L69
            if (r0 == r1) goto L98
        L66:
            r4 = 2131235612(0x7f08131c, float:1.8087423E38)
        L69:
            if (r5 == 0) goto L3d
            com.bytedance.android.livesdk.livesetting.watchlive.LiveChatViewImageSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveChatViewImageSetting.INSTANCE
            int r0 = r0.getValue()
            if (r0 < r1) goto L74
            r7 = 1
        L74:
            X.BQO r1 = X.C15650jR.LIZ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            X.Uuy r1 = r1.LIZJ(r0)
            java.util.List<java.lang.String> r0 = r5.mUrls
            r1.LIZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.LJIIL = r0
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.LIZLLL(r0)
            r1.LJ = r3
            r1.LJFF = r2
            r1.LJIIIIZZ = r4
            r1.LJIIJJI(r9)
            goto L3d
        L98:
            r4 = 2131235441(0x7f081271, float:1.8087076E38)
            goto L69
        L9c:
            int r3 = r9.getWidth()
            int r2 = r9.getHeight()
            goto L56
        La5:
            r0 = 0
            goto L1b
        La8:
            r0 = 0
            goto L17
        Lab:
            r0 = r3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BQK.LIZIZ(android.widget.ImageView, X.CV6, int):void");
    }

    public final void LIZJ(C47121t6 c47121t6, DataChannel dataChannel, CV6 item, boolean z) {
        long j;
        Room room;
        o.LJIIIZ(item, "item");
        try {
            if (c47121t6.getVisibility() == 0) {
                if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                    j = room.getOwnerUserId();
                } else {
                    j = 0;
                }
                String LJIJI = g0.LJIJI(this.LIZ, j, item);
                if (!z || !TextUtils.equals(c47121t6.getText(), LJIJI)) {
                    c47121t6.setText(LJIJI);
                }
                if (item.LIZIZ > 0) {
                    long j2 = item.LIZJ;
                    if (j2 == 1) {
                        C87277YNd.LJJIII(R.drawable.ckp, c47121t6);
                        return;
                    } else if (j2 == 2) {
                        C87277YNd.LJJIII(R.drawable.ckr, c47121t6);
                        return;
                    } else {
                        if (j2 != 3) {
                            return;
                        }
                        C87277YNd.LJJIII(R.drawable.ckt, c47121t6);
                        return;
                    }
                }
                C87277YNd.LJJIII(R.drawable.cko, c47121t6);
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }
}
