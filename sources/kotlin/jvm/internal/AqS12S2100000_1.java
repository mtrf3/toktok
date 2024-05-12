package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C39061g6;
import X.C41835GbP;
import X.C76800UCe;
import X.C87393br;
import X.C96093pt;
import X.EnumC87323bk;
import X.InterfaceC88472Yns;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.SharePanelImHeadViewModel;
import defpackage.i0;

/* loaded from: classes2.dex */
public class AqS12S2100000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S2100000_1(VideoStickerContentCell videoStickerContentCell, int i) {
        super(1);
        this.$t = i;
        this.l2 = videoStickerContentCell;
        this.s0 = "store_video_sticker_page";
        this.s1 = "long_press";
    }

    public static final Object invoke$0(AqS12S2100000_1 aqS12S2100000_1, Object it) {
        ActivityC45651qj activityC45651qj;
        String str;
        boolean z;
        Long originVideoId;
        Long videoStickerId;
        Fragment fragment;
        o.LJIIIZ(it, "it");
        VideoStickerContentViewModel Q = ((VideoStickerContentCell) aqS12S2100000_1.l2).Q();
        LifecycleOwner currentLifecycleOwner = ((VideoStickerContentCell) aqS12S2100000_1.l2).getCurrentLifecycleOwner();
        String str2 = null;
        if ((currentLifecycleOwner instanceof Fragment) && (fragment = (Fragment) currentLifecycleOwner) != null) {
            activityC45651qj = fragment.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        VideoSticker videoSticker = ((VideoStickerContentCell) aqS12S2100000_1.l2).LJLJLLL;
        Q.getClass();
        if (activityC45651qj != null && videoSticker != null) {
            Q.withState(new AqS132S0200000_1(activityC45651qj, videoSticker, 72));
        }
        String str3 = aqS12S2100000_1.s0;
        String str4 = aqS12S2100000_1.s1;
        VideoSticker videoSticker2 = ((VideoStickerContentCell) aqS12S2100000_1.l2).LJLJLLL;
        if (videoSticker2 != null && (videoStickerId = videoSticker2.getVideoStickerId()) != null) {
            str = videoStickerId.toString();
        } else {
            str = null;
        }
        VideoSticker videoSticker3 = ((VideoStickerContentCell) aqS12S2100000_1.l2).LJLJLLL;
        if (videoSticker3 != null && (originVideoId = videoSticker3.getOriginVideoId()) != null) {
            str2 = originVideoId.toString();
        }
        VideoSticker videoSticker4 = ((VideoStickerContentCell) aqS12S2100000_1.l2).LJLJLLL;
        if (videoSticker4 != null) {
            Integer status = videoSticker4.getStatus();
            int status2 = EnumC87323bk.IN_STORE.getStatus();
            if (status != null && status.intValue() == status2) {
                z = true;
                C87393br.LJIL(str3, str4, str, str2, Boolean.valueOf(z), "report_sticker");
                return C76800UCe.LIZ;
            }
        }
        z = false;
        C87393br.LJIL(str3, str4, str, str2, Boolean.valueOf(z), "report_sticker");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        if (r5.intValue() != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r2.intValue() != r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS12S2100000_1 r11, java.lang.Object r12) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            java.lang.Object r4 = r11.l2
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell r4 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell) r4
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r0 = r4.LJLJLLL
            r6 = 1
            r10 = 0
            if (r0 == 0) goto L69
            java.lang.Long r0 = r0.getOriginVideoId()
            if (r0 == 0) goto L69
            long r1 = r0.longValue()
            java.lang.String r0 = "aweme://aweme/detail/"
            java.lang.String r0 = X.C61845OOz.LIZ(r0, r1)
            X.1g6 r3 = new X.1g6
            r3.<init>(r0)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel r0 = r4.Q()
            X.3ct r0 = r0.lv0()
            if (r0 == 0) goto Le0
            int r0 = r0.LJLILLLLZI
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L39:
            X.3bE r0 = X.EnumC87003bE.PERSONAL_PROFILE_FROM_STICKER_STORE
            int r1 = r0.getType()
            if (r5 != 0) goto Lc2
        L41:
            X.3bE r0 = X.EnumC87003bE.PERSONAL_PROFILE_NOT_FROM_STICKER_STORE
            int r1 = r0.getType()
            if (r5 != 0) goto Lbb
        L49:
            androidx.lifecycle.LifecycleOwner r1 = r4.getCurrentLifecycleOwner()
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L69
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L69
            X.1qj r1 = r1.mo49getActivity()
            if (r1 == 0) goto L69
            java.lang.String r0 = r3.LIZJ()
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            r0.withParam(r2)
            r0.open()
        L69:
            java.lang.String r7 = r11.s0
            java.lang.String r8 = r11.s1
            java.lang.Object r0 = r11.l2
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell) r0
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r0 = r0.LJLJLLL
            if (r0 == 0) goto Lb9
            java.lang.Long r0 = r0.getVideoStickerId()
            if (r0 == 0) goto Lb9
            java.lang.String r9 = r0.toString()
        L7f:
            java.lang.Object r0 = r11.l2
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell) r0
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r0 = r0.LJLJLLL
            if (r0 == 0) goto L91
            java.lang.Long r0 = r0.getOriginVideoId()
            if (r0 == 0) goto L91
            java.lang.String r10 = r0.toString()
        L91:
            java.lang.Object r0 = r11.l2
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell) r0
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r0 = r0.LJLJLLL
            if (r0 == 0) goto La5
            java.lang.Integer r2 = r0.getStatus()
            X.3bk r0 = X.EnumC87323bk.IN_STORE
            int r1 = r0.getStatus()
            if (r2 != 0) goto Lb2
        La5:
            r6 = 0
        La6:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            java.lang.String r12 = "view_original_video"
            X.C87393br.LJIL(r7, r8, r9, r10, r11, r12)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lb2:
            int r0 = r2.intValue()
            if (r0 != r1) goto La5
            goto La6
        Lb9:
            r9 = r10
            goto L7f
        Lbb:
            int r0 = r5.intValue()
            if (r0 != r1) goto L49
            goto Lc8
        Lc2:
            int r0 = r5.intValue()
            if (r0 != r1) goto L41
        Lc8:
            java.lang.String r1 = "video_from"
            java.lang.String r0 = "from_video_sticker_profile_self"
            r2.putString(r1, r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "userid"
            r2.putString(r0, r1)
            goto L49
        Le0:
            r5 = r10
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS12S2100000_1.invoke$1(kotlin.jvm.internal.AqS12S2100000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AqS12S2100000_1 aqS12S2100000_1, Object obj) {
        int i;
        C41835GbP param = (C41835GbP) obj;
        o.LJIIIZ(param, "param");
        String LJFF = ((SharePanelImHeadViewModel) aqS12S2100000_1.l2).LJLZ.LJFF();
        o.LJIIIIZZ(LJFF, "shareListViewModel.enterFrom");
        String enterMethod = aqS12S2100000_1.s0;
        o.LJIIIIZZ(enterMethod, "enterMethod");
        if (((SharePanelImHeadViewModel) aqS12S2100000_1.l2).LJLZ.LIZLLL()) {
            i = 2;
        } else {
            i = 1;
        }
        String icon = aqS12S2100000_1.s1;
        o.LJIIIIZZ(icon, "icon");
        return C41835GbP.L(param, LJFF, enterMethod, i, "dm", icon, 365);
    }

    public static final Object invoke$3(AqS12S2100000_1 aqS12S2100000_1, Object it) {
        String str;
        String str2;
        boolean z;
        Long originVideoId;
        Long videoStickerId;
        Long creatorUid;
        o.LJIIIZ(it, "it");
        VideoSticker videoSticker = ((VideoStickerContentCell) aqS12S2100000_1.l2).LJLJLLL;
        String str3 = null;
        if (videoSticker != null && (creatorUid = videoSticker.getCreatorUid()) != null) {
            str = creatorUid.toString();
        } else {
            str = null;
        }
        C96093pt.LIZJ(str, "video_sticker_rank_list", "click_name", null, null);
        String str4 = aqS12S2100000_1.s0;
        String str5 = aqS12S2100000_1.s1;
        VideoSticker videoSticker2 = ((VideoStickerContentCell) aqS12S2100000_1.l2).LJLJLLL;
        if (videoSticker2 != null && (videoStickerId = videoSticker2.getVideoStickerId()) != null) {
            str2 = videoStickerId.toString();
        } else {
            str2 = null;
        }
        VideoSticker videoSticker3 = ((VideoStickerContentCell) aqS12S2100000_1.l2).LJLJLLL;
        if (videoSticker3 != null && (originVideoId = videoSticker3.getOriginVideoId()) != null) {
            str3 = originVideoId.toString();
        }
        VideoSticker videoSticker4 = ((VideoStickerContentCell) aqS12S2100000_1.l2).LJLJLLL;
        if (videoSticker4 != null) {
            Integer status = videoSticker4.getStatus();
            int status2 = EnumC87323bk.IN_STORE.getStatus();
            if (status != null && status.intValue() == status2) {
                z = true;
                C87393br.LJIL(str4, str5, str2, str3, Boolean.valueOf(z), "more_stickers");
                return C76800UCe.LIZ;
            }
        }
        z = false;
        C87393br.LJIL(str4, str5, str2, str3, Boolean.valueOf(z), "more_stickers");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS12S2100000_1 aqS12S2100000_1, Object it) {
        o.LJIIIZ(it, "it");
        View view = (View) aqS12S2100000_1.l2;
        String str = aqS12S2100000_1.s0;
        if (str != null && view != null) {
            SmartRouter.buildRoute(view.getContext(), new C39061g6(i0.LJFF("aweme://aweme/detail/", str)).LIZJ()).open();
        }
        C87393br.LJIL("chat", "click", aqS12S2100000_1.s1, aqS12S2100000_1.s0, Boolean.TRUE, "view_original_video");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S2100000_1(View view, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = view;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S2100000_1(VideoStickerContentCell videoStickerContentCell, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = videoStickerContentCell;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S2100000_1(SharePanelImHeadViewModel sharePanelImHeadViewModel, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = sharePanelImHeadViewModel;
        this.s0 = str;
        this.s1 = str2;
    }
}
