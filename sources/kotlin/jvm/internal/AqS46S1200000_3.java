package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C177256xV;
import X.C177616y5;
import X.C177906yY;
import X.C177916yZ;
import X.C177996yh;
import X.C178136yv;
import X.C178336zF;
import X.C188217a5;
import X.C189187be;
import X.C190407dc;
import X.C190417dd;
import X.C190817eH;
import X.C204237zv;
import X.C217798gh;
import X.C3C8;
import X.C43I;
import X.C4LX;
import X.C76800UCe;
import X.C7MK;
import X.C80H;
import X.C80T;
import X.InterfaceC194547kI;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.X1D;
import X.Y9G;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionSearchCell;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowShareUserRowAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryContentAssem;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS46S1200000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        String str = aqS46S1200000_3.s0;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) aqS46S1200000_3.l1;
        hierarchyData.LIZ = new C189187be(str, poiDetailResponse.isCollected, 3, poiDetailResponse.name, poiDetailResponse.address, false, (C190817eH) aqS46S1200000_3.l2, 32);
        hierarchyData.LIZIZ = "PoiCollectHierarchyData";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        C178336zF it = (C178336zF) obj;
        o.LJIIIZ(it, "it");
        Aweme aweme = it.LJLIL;
        if ((aweme == null || !aweme.isPrivate()) && it.LJZ && it.LJZL) {
            if (o.LJ(it.LJLJJI, C177916yZ.LIZ)) {
                ((NowKeyboardVM) aqS46S1200000_3.l1).setState(new AqS169S0100000_3(it, 75));
            }
            ((NowKeyboardVM) aqS46S1200000_3.l1).setState(new AqS169S0100000_3(new C178136yv((Comment) aqS46S1200000_3.l2, aqS46S1200000_3.s0, 4), 76));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        Object obj2;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", "video_post_page");
        sendEventTrackingAsync.put("previous_page", "video_edit_page");
        sendEventTrackingAsync.put("to_user_id", ((Y9G) aqS46S1200000_3.l1).LIZ);
        sendEventTrackingAsync.put("user_type", aqS46S1200000_3.s0);
        C217798gh c217798gh = ((VideoCaptionMentionSearchCell) aqS46S1200000_3.l2).L().LJLILLLLZI;
        if (c217798gh != null) {
            obj2 = c217798gh.LIZLLL;
        } else {
            obj2 = null;
        }
        sendEventTrackingAsync.put("search_keyword", obj2);
        sendEventTrackingAsync.put("function", "mention");
        sendEventTrackingAsync.put("is_valid", String.valueOf(((Y9G) aqS46S1200000_3.l1).LJIJI.LIZ ? 1 : 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C190407dc(aqS46S1200000_3.s0, (PoiListApi.PoiDetailResponse) aqS46S1200000_3.l1, ((PoiDetailInfoAssem) aqS46S1200000_3.l2).N3());
        hierarchyData.LIZIZ = "PoiDetailContentHeaderHierarchyDataV3";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        PoiDetailInfoAssem poiDetailInfoAssem = (PoiDetailInfoAssem) aqS46S1200000_3.l1;
        assemble.nv0(poiDetailInfoAssem, new AqS46S1200000_3(poiDetailInfoAssem, (PoiListApi.PoiDetailResponse) aqS46S1200000_3.l2, aqS46S1200000_3.s0, 11));
        PoiDetailInfoAssem poiDetailInfoAssem2 = (PoiDetailInfoAssem) aqS46S1200000_3.l1;
        assemble.wv0(poiDetailInfoAssem2, new AqS169S0100000_3(poiDetailInfoAssem2, 947));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C190417dd(aqS46S1200000_3.s0, (PoiListApi.PoiDetailResponse) aqS46S1200000_3.l1, ((PoiDetailInfoAssem) aqS46S1200000_3.l2).N3());
        hierarchyData.LIZIZ = "PoiDetailContentHeaderHierarchyData";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        PoiDetailInfoAssem poiDetailInfoAssem = (PoiDetailInfoAssem) aqS46S1200000_3.l1;
        assemble.nv0(poiDetailInfoAssem, new AqS46S1200000_3(poiDetailInfoAssem, (PoiListApi.PoiDetailResponse) aqS46S1200000_3.l2, aqS46S1200000_3.s0, 13));
        PoiDetailInfoAssem poiDetailInfoAssem2 = (PoiDetailInfoAssem) aqS46S1200000_3.l1;
        assemble.wv0(poiDetailInfoAssem2, new AqS134S0200000_3((PoiListApi.PoiDetailResponse) aqS46S1200000_3.l2, poiDetailInfoAssem2, 280));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C190407dc(aqS46S1200000_3.s0, (PoiListApi.PoiDetailResponse) aqS46S1200000_3.l1, ((PoiDetailInfoAssem) aqS46S1200000_3.l2).N3());
        hierarchyData.LIZIZ = "PoiDetailContentHeaderHierarchyDataV3";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        PoiDetailInfoAssem poiDetailInfoAssem = (PoiDetailInfoAssem) aqS46S1200000_3.l1;
        assemble.nv0(poiDetailInfoAssem, new AqS46S1200000_3(poiDetailInfoAssem, (PoiListApi.PoiDetailResponse) aqS46S1200000_3.l2, aqS46S1200000_3.s0, 15));
        PoiDetailInfoAssem poiDetailInfoAssem2 = (PoiDetailInfoAssem) aqS46S1200000_3.l1;
        assemble.wv0(poiDetailInfoAssem2, new AqS134S0200000_3((PoiListApi.PoiDetailResponse) aqS46S1200000_3.l2, poiDetailInfoAssem2, 281));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        String str = aqS46S1200000_3.s0;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) aqS46S1200000_3.l1;
        hierarchyData.LIZ = new C189187be(str, poiDetailResponse.isCollected, 0, poiDetailResponse.name, poiDetailResponse.address, false, (C190817eH) aqS46S1200000_3.l2, 36);
        hierarchyData.LIZIZ = "PoiCollectHierarchyData";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        String str;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("action_type", "click");
        sendEventTrackingAsync.put("enter_from", aqS46S1200000_3.s0);
        sendEventTrackingAsync.put("group_id", ((InterfaceC194547kI) aqS46S1200000_3.l1).getAweme().getAid());
        sendEventTrackingAsync.put("author_id", ((InterfaceC194547kI) aqS46S1200000_3.l1).getAweme().getAuthorUid());
        sendEventTrackingAsync.put("follow_status", ((InterfaceC194547kI) aqS46S1200000_3.l1).getAweme().getFollowStatus());
        NowPostInfo nowPostInfo = ((InterfaceC194547kI) aqS46S1200000_3.l1).getAweme().nowPostInfo;
        if (nowPostInfo == null || (str = nowPostInfo.getNowMediaType()) == null) {
            str = "post";
        }
        sendEventTrackingAsync.put("now_type", str);
        sendEventTrackingAsync.put("is_now_clear", C7MK.LIZJ(((AbsNowShareUserRowAssem) aqS46S1200000_3.l2).a4(), ((AbsNowShareUserRowAssem) aqS46S1200000_3.l2).b4().getAweme()));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        Comment comment = (Comment) aqS46S1200000_3.l1;
        if (comment != null) {
            C177256xV c177256xV = (C177256xV) aqS46S1200000_3.l2;
            String str = aqS46S1200000_3.s0;
            c177256xV.getClass();
            return C177616y5.LIZ(setState, null, null, false, 0, 0, new C177256xV(comment, str, true), false, false, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, null, -257, 31);
        }
        C177256xV c177256xV2 = (C177256xV) aqS46S1200000_3.l2;
        String str2 = aqS46S1200000_3.s0;
        Comment comment2 = c177256xV2.LIZ;
        c177256xV2.getClass();
        return C177616y5.LIZ(setState, null, null, false, 0, 0, new C177256xV(comment2, str2, true), false, false, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, null, -257, 31);
    }

    public static final Object invoke$3(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        C177616y5 it = (C177616y5) obj;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryReply ");
        LIZ.append(it.LJLJLLL);
        C177996yh.LIZIZ("xjcccc", X1D.LIZIZ(LIZ));
        Aweme aweme = it.LJLIL;
        if ((aweme == null || !aweme.isPrivate()) && it.LJZI) {
            C177256xV c177256xV = it.LJLJLLL;
            if (c177256xV == null) {
                ((KeyboardVMV2) aqS46S1200000_3.l2).setState(new AqS169S0100000_3(new C177256xV((Comment) aqS46S1200000_3.l1, aqS46S1200000_3.s0, false, 4), 629));
            } else {
                ((KeyboardVMV2) aqS46S1200000_3.l2).setState(new AqS46S1200000_3((Comment) aqS46S1200000_3.l1, c177256xV, aqS46S1200000_3.s0, 2));
            }
            ((KeyboardVMV2) aqS46S1200000_3.l2).iv0(C177906yY.LIZ, false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        Aweme aweme;
        C204237zv setState = (C204237zv) obj;
        o.LJIIIZ(setState, "$this$setState");
        C80H c80h = C80H.DM_SHARE;
        VideoItemParams gv0 = ((VideoShareViewModel) aqS46S1200000_3.l1).gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        return C204237zv.LIZ(setState, null, null, null, null, null, new C43I(new OSZ(c80h, new C80T(aweme, ((VideoShareViewModel) aqS46S1200000_3.l1).LJLJI, (UrlModel) aqS46S1200000_3.l2, null, null, aqS46S1200000_3.s0, 24))), 63);
    }

    public static final Object invoke$5(AqS46S1200000_3 aqS46S1200000_3, Object runOnUIThread) {
        o.LJIIIZ(runOnUIThread, "$this$runOnUIThread");
        VideoShareViewModel videoShareViewModel = (VideoShareViewModel) aqS46S1200000_3.l1;
        videoShareViewModel.setState(new AqS46S1200000_3(videoShareViewModel, (UrlModel) aqS46S1200000_3.l2, aqS46S1200000_3.s0, 4));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        Aweme aweme;
        C204237zv setState = (C204237zv) obj;
        o.LJIIIZ(setState, "$this$setState");
        C80H c80h = C80H.PROMOTE;
        VideoItemParams gv0 = ((VideoShareViewModel) aqS46S1200000_3.l1).gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        return C204237zv.LIZ(setState, null, null, null, null, null, new C43I(new OSZ(c80h, new C80T(aweme, ((VideoShareViewModel) aqS46S1200000_3.l1).LJLJI, null, (Drawable) aqS46S1200000_3.l2, aqS46S1200000_3.s0, null, 32))), 63);
    }

    public static final Object invoke$7(AqS46S1200000_3 aqS46S1200000_3, Object runOnUIThread) {
        o.LJIIIZ(runOnUIThread, "$this$runOnUIThread");
        VideoShareViewModel videoShareViewModel = (VideoShareViewModel) aqS46S1200000_3.l1;
        videoShareViewModel.setState(new AqS46S1200000_3(videoShareViewModel, (Drawable) aqS46S1200000_3.l2, aqS46S1200000_3.s0, 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String str = ((C188217a5) aqS46S1200000_3.l1).LJLJI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        actionGroup.LJFF(str, new AqS57S1100000_3((WatchHistoryContentAssem) aqS46S1200000_3.l2, aqS46S1200000_3.s0, 23));
        String str3 = ((C188217a5) aqS46S1200000_3.l1).LJLJJI;
        if (str3 != null) {
            str2 = str3;
        }
        actionGroup.LJIIIZ(str2, new AqS169S0100000_3((WatchHistoryContentAssem) aqS46S1200000_3.l2, 720));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS46S1200000_3 aqS46S1200000_3, Object obj) {
        Object obj2;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("previous_page", "video_edit_page");
        sendEventTrackingAsync.put("to_user_id", ((Y9G) aqS46S1200000_3.l1).LIZ);
        sendEventTrackingAsync.put("user_type", aqS46S1200000_3.s0);
        C217798gh c217798gh = ((VideoCaptionMentionSearchCell) aqS46S1200000_3.l2).L().LJLILLLLZI;
        if (c217798gh != null) {
            obj2 = c217798gh.LIZLLL;
        } else {
            obj2 = null;
        }
        sendEventTrackingAsync.put("search_keyword", obj2);
        sendEventTrackingAsync.put("function", "mention");
        sendEventTrackingAsync.put("is_valid", String.valueOf(((Y9G) aqS46S1200000_3.l1).LJIJI.LIZ ? 1 : 0));
        sendEventTrackingAsync.put("click_type", "choose");
        sendEventTrackingAsync.put("enter_from", "video_post_page");
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS46S1200000_3(com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem r3, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 11: goto L11;
                case 12: goto L5;
                case 13: goto L11;
                case 14: goto L5;
                case 15: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r5
            r1.l2 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.s0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS46S1200000_3.<init>(com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S1200000_3(C188217a5 c188217a5, WatchHistoryContentAssem watchHistoryContentAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c188217a5;
        this.l2 = watchHistoryContentAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S1200000_3(Y9G y9g, String str, VideoCaptionMentionSearchCell videoCaptionMentionSearchCell, int i) {
        super(1);
        this.$t = i;
        this.l1 = y9g;
        this.s0 = str;
        this.l2 = videoCaptionMentionSearchCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S1200000_3(NowKeyboardVM nowKeyboardVM, Comment comment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = nowKeyboardVM;
        this.l2 = comment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S1200000_3(Comment comment, C177256xV c177256xV, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = comment;
        this.l2 = c177256xV;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S1200000_3(Comment comment, String str, KeyboardVMV2 keyboardVMV2, int i) {
        super(1);
        this.$t = i;
        this.l1 = comment;
        this.s0 = str;
        this.l2 = keyboardVMV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S1200000_3(VideoShareViewModel videoShareViewModel, Drawable drawable, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoShareViewModel;
        this.l2 = drawable;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S1200000_3(VideoShareViewModel videoShareViewModel, UrlModel urlModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoShareViewModel;
        this.l2 = urlModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS46S1200000_3(String str, String str2, InterfaceC194547kI interfaceC194547kI, AbsNowShareUserRowAssem<Object, C3C8> absNowShareUserRowAssem) {
        super(1);
        this.$t = absNowShareUserRowAssem;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = interfaceC194547kI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S1200000_3(String str, PoiListApi.PoiDetailResponse poiDetailResponse, C190817eH c190817eH, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = poiDetailResponse;
        this.l2 = c190817eH;
    }
}
