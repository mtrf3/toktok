package kotlin.jvm.internal;

import X.ARI;
import X.ARN;
import X.ASQ;
import X.ASX;
import X.AbstractC65781Prl;
import X.AnonymousClass850;
import X.AnonymousClass852;
import X.AnonymousClass853;
import X.C16880lQ;
import X.C181627Aw;
import X.C182347Dq;
import X.C184817Nd;
import X.C187127Wa;
import X.C188027Zm;
import X.C188487aW;
import X.C188727au;
import X.C189527cC;
import X.C189927cq;
import X.C1FP;
import X.C2050482y;
import X.C2056385f;
import X.C2061387d;
import X.C206888Aa;
import X.C206978Aj;
import X.C206998Al;
import X.C207008Am;
import X.C207148Ba;
import X.C208708Ha;
import X.C219618jd;
import X.C219708jm;
import X.C225458t3;
import X.C2U8;
import X.C32I;
import X.C3A5;
import X.C3C1;
import X.C43I;
import X.C47261Igj;
import X.C59992Xb;
import X.C64707PaR;
import X.C72912tb;
import X.C72922tc;
import X.C73411SrX;
import X.C73454SsE;
import X.C73969T1h;
import X.C76800UCe;
import X.C78767Uvj;
import X.C7D5;
import X.C7H2;
import X.C7J0;
import X.C7KN;
import X.C7KO;
import X.C7KP;
import X.C7KQ;
import X.C7KR;
import X.C7KS;
import X.C7KT;
import X.C7MY;
import X.C7PR;
import X.C84T;
import X.C85M;
import X.C8AS;
import X.C8BZ;
import X.FMX;
import X.HG3;
import X.InterfaceC193237iB;
import X.InterfaceC194547kI;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import X.RBX;
import X.T16;
import X.X1D;
import X.Y9G;
import Y.ACListenerS42S1100000_3;
import Y.AfS2S0100100_3;
import Y.AfS55S0100000_3;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.compliance.api.model.ResetEntryTextData;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.nows.archive.viewmodel.NowArchiveCalendarListViewModel;
import com.ss.android.ugc.aweme.nows.feed.caption.NowCollectionCellCaptionAssem;
import com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.StoryViewerListResponse;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem;
import com.ss.android.ugc.aweme.toptab.vm.LiveDualFeedListViewModel;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryContentAssem;
import com.ss.android.ugc.now.interaction.api.CommentDeleteState;
import com.ss.android.ugc.now.interaction.api.CommentLatestState;
import com.ss.android.ugc.now.interaction.api.CommentPublishState;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS57S1100000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
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
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case 33:
                return invoke$33(this, obj);
            case 34:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case 36:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(C188027Zm it) {
        boolean z;
        View view;
        o.LJIIIZ(it, "it");
        List LIZ = C208708Ha.LIZ(it);
        if (LIZ == null || LIZ.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        View view2 = null;
        if (z) {
            View containerView = ((UIAssem) this.l1).getContainerView();
            if (containerView != null) {
                view2 = containerView.findViewById(R.id.l62);
            }
            view2.setVisibility(8);
            return;
        }
        View containerView2 = ((UIAssem) this.l1).getContainerView();
        if (containerView2 != null) {
            view = containerView2.findViewById(R.id.l62);
        } else {
            view = null;
        }
        view.setVisibility(0);
        View containerView3 = ((UIAssem) this.l1).getContainerView();
        if (containerView3 != null) {
            view2 = containerView3.findViewById(R.id.l62);
        }
        C16880lQ.LJJJJI((TuxTextView) view2, new ACListenerS42S1100000_3((UIAssem) this.l1, this.s0, 2));
    }

    public static final Object invoke$0(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        ICommerceChallengeService LIZIZ;
        UrlModel LJIJ;
        AnonymousClass850 it = (AnonymousClass850) obj;
        o.LJIIIZ(it, "it");
        List LJJIJIL = C47261Igj.LJJIJIL(it);
        Object obj2 = it.LIZLLL;
        if (obj2 instanceof TextExtraStruct) {
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.model.TextExtraStruct");
            TextExtraStruct textExtraStruct = (TextExtraStruct) obj2;
            if (textExtraStruct.getType() == 1 && (LJIJ = (LIZIZ = CommerceChallengeServiceImpl.LIZIZ()).LJIJ(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                View view = (View) aqS57S1100000_3.l1;
                String str = aqS57S1100000_3.s0;
                int LIZIZ2 = C7MY.LIZIZ(15);
                ColorDrawable colorDrawable = new ColorDrawable(0);
                colorDrawable.setBounds(0, 0, LIZIZ2, LIZIZ2);
                LJJIJIL.add(new AnonymousClass850("[emoji]", C47261Igj.LJJIJIL(new C78767Uvj(colorDrawable, LIZIZ2, LJIJ, view)), AnonymousClass853.EMOJI, 8));
                LIZIZ.LJIIJ(str, textExtraStruct.getHashTagName());
            }
        }
        return LJJIJIL;
    }

    public static final Object invoke$1(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        ICommerceChallengeService LIZIZ;
        UrlModel LJIJ;
        AnonymousClass852 it = (AnonymousClass852) obj;
        o.LJIIIZ(it, "it");
        List LJJIJIL = C47261Igj.LJJIJIL(it);
        C85M c85m = it.LJI;
        if (c85m != null && c85m.LIZ()) {
            TextExtraStruct textExtraStruct = c85m.LIZ;
            if (textExtraStruct.getType() == 1 && (LJIJ = (LIZIZ = CommerceChallengeServiceImpl.LIZIZ()).LJIJ(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                View view = (View) aqS57S1100000_3.l1;
                String str = aqS57S1100000_3.s0;
                int LIZIZ2 = C7MY.LIZIZ(15);
                ColorDrawable colorDrawable = new ColorDrawable(0);
                colorDrawable.setBounds(0, 0, LIZIZ2, LIZIZ2);
                C78767Uvj c78767Uvj = new C78767Uvj(colorDrawable, LIZIZ2, LJIJ, view);
                C2056385f c2056385f = new C2056385f("[emoji]");
                c2056385f.LJII.add(c78767Uvj);
                LJJIJIL.add(c2056385f);
                LIZIZ.LJIIJ(str, textExtraStruct.getHashTagName());
            }
        }
        return LJJIJIL;
    }

    public static final Object invoke$10(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        boolean z;
        String str;
        String str2;
        C184817Nd c184817Nd;
        C188727au c188727au;
        Map<String, String> map;
        String str3;
        String str4;
        C182347Dq it = (C182347Dq) obj;
        o.LJIIIZ(it, "it");
        String str5 = aqS57S1100000_3.s0;
        if (str5 == null || str5.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str6 = null;
        String str7 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        Map<String, String> map2 = null;
        String str8 = null;
        if (!z) {
            List<C184817Nd> list = it.getListState().LJLJJI;
            if (list != null && (c184817Nd = (C184817Nd) ORZ.LJLLLL(list)) != null && (c188727au = c184817Nd.LJLJI) != null && (map = c188727au.LIZ) != null) {
                List<C184817Nd> list2 = it.getListState().LJLJJI;
                if (list2 != null) {
                    str3 = ORZ.LLD(list2, null, null, null, C7KN.LJLIL, 31);
                } else {
                    str3 = null;
                }
                HashMap hashMap = (HashMap) map;
                hashMap.put("words_position", str3);
                List<C184817Nd> list3 = it.getListState().LJLJJI;
                if (list3 != null) {
                    str4 = ORZ.LLD(list3, null, null, null, C7KO.LJLIL, 31);
                } else {
                    str4 = null;
                }
                hashMap.put("words_content", str4);
                List<C184817Nd> list4 = it.getListState().LJLJJI;
                if (list4 != null) {
                    str7 = ORZ.LLD(list4, null, null, null, C7KP.LJLIL, 31);
                }
                hashMap.put("group_id", str7);
                map2 = map;
            }
            FMX.LJIIL("trending_show", map2);
        } else {
            C7PR c7pr = ((TopicSearchListAssem) aqS57S1100000_3.l1).LJLLLLLL;
            if (c7pr != null) {
                if (c7pr.getType() == C7PR.MOVIE.getType()) {
                    C188727au c188727au2 = new C188727au();
                    List<C184817Nd> list5 = it.getListState().LJLJJI;
                    if (list5 != null) {
                        str2 = ORZ.LLD(list5, null, null, null, C7KQ.LJLIL, 31);
                    } else {
                        str2 = null;
                    }
                    c188727au2.LJI("movie_id", str2);
                    List<C184817Nd> list6 = it.getListState().LJLJJI;
                    if (list6 != null) {
                        str8 = ORZ.LLD(list6, null, null, null, C7KR.LJLIL, 31);
                    }
                    c188727au2.LJI("movie_title", str8);
                    FMX.LJIIL("movie_trending_list_show", c188727au2.LIZ);
                } else {
                    C7PR c7pr2 = ((TopicSearchListAssem) aqS57S1100000_3.l1).LJLLLLLL;
                    if (c7pr2 != null) {
                        if (c7pr2.getType() == C7PR.BOOK.getType()) {
                            C188727au c188727au3 = new C188727au();
                            List<C184817Nd> list7 = it.getListState().LJLJJI;
                            if (list7 != null) {
                                str = ORZ.LLD(list7, null, null, null, C7KS.LJLIL, 31);
                            } else {
                                str = null;
                            }
                            c188727au3.LJI("book_id", str);
                            List<C184817Nd> list8 = it.getListState().LJLJJI;
                            if (list8 != null) {
                                str6 = ORZ.LLD(list8, null, null, null, C7KT.LJLIL, 31);
                            }
                            c188727au3.LJI("book_title", str6);
                            FMX.LJIIL("book_trending_list_show", c188727au3.LIZ);
                        }
                    } else {
                        o.LJIJI("topicType");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("topicType");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C207148Ba it = (C207148Ba) obj;
        o.LJIIIZ(it, "it");
        if (!(C208708Ha.LIZLLL(it) instanceof C72922tc)) {
            ((LiveDualFeedListViewModel) aqS57S1100000_3.l1).manualListRefresh();
            if (o.LJ(aqS57S1100000_3.s0, "click_button_icon") || o.LJ(aqS57S1100000_3.s0, "click_top_icon")) {
                ((LiveDualFeedListViewModel) aqS57S1100000_3.l1).setState(C8BZ.LJLIL);
            }
            ((LiveDualFeedListViewModel) aqS57S1100000_3.l1).hv0(aqS57S1100000_3.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C181627Aw setState = (C181627Aw) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C181627Aw.LIZ(setState, new C3C1((Throwable) aqS57S1100000_3.l1), null, new C43I(new OSZ(2, aqS57S1100000_3.s0)), C1FP.LJIIIIZZ(C7H2.LIZ(aqS57S1100000_3.s0)), null, null, 50);
    }

    public static final Object invoke$13(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C181627Aw setState = (C181627Aw) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C181627Aw.LIZ(setState, new C72912tb((UpvotePublishResponse) aqS57S1100000_3.l1), null, new C43I(new OSZ(1, aqS57S1100000_3.s0)), C1FP.LJIIIIZZ(C7H2.LIZ(aqS57S1100000_3.s0)), null, null, 50);
    }

    public static final Object invoke$14(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C181627Aw setState = (C181627Aw) obj;
        o.LJIIIZ(setState, "$this$setState");
        Throwable it = (Throwable) aqS57S1100000_3.l1;
        o.LJIIIIZZ(it, "it");
        return C181627Aw.LIZ(setState, new C3C1(it), null, new C43I(new OSZ(2, aqS57S1100000_3.s0)), C1FP.LJIIIIZZ(C7H2.LIZ(aqS57S1100000_3.s0)), null, null, 50);
    }

    public static final Object invoke$15(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C181627Aw setState = (C181627Aw) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C181627Aw.LIZ(setState, new C72912tb((UpvotePublishResponse) aqS57S1100000_3.l1), null, new C43I(new OSZ(1, aqS57S1100000_3.s0)), C1FP.LJIIIIZZ(C7H2.LIZ(aqS57S1100000_3.s0)), null, null, 50);
    }

    public static final Object invoke$16(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C181627Aw setState = (C181627Aw) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C181627Aw.LIZ(setState, new C72912tb((UpvotePublishResponse) aqS57S1100000_3.l1), null, new C43I(new OSZ(1, aqS57S1100000_3.s0)), C1FP.LJIIIIZZ(C7H2.LIZ(aqS57S1100000_3.s0)), null, null, 50);
    }

    public static final Object invoke$17(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C2061387d setState = (C2061387d) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C2061387d.LIZ(setState, aqS57S1100000_3.s0, ((Aweme) aqS57S1100000_3.l1).isCollected(), 2);
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        aqS57S1100000_3.invoke$0((C188027Zm) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C189527cC setState = (C189527cC) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C189527cC.LIZ(setState, 0L, 0, new OSZ(aqS57S1100000_3.s0, (List) aqS57S1100000_3.l1), null, 11);
    }

    public static final Object invoke$2(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C207148Ba it = (C207148Ba) obj;
        o.LJIIIZ(it, "it");
        List<C59992Xb> list = it.LJLILLLLZI.LJLJJI;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (o.LJ(((C59992Xb) ListProtector.get(list, i)).LJLIL.getAid(), aqS57S1100000_3.s0)) {
                    ListProtector.add(arrayList, 0, Integer.valueOf(i));
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((LiveDualFeedListViewModel) aqS57S1100000_3.l1).listRemoveItemAt(((Number) ListProtector.get(arrayList, i2)).intValue());
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C189527cC setState = (C189527cC) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C189527cC.LIZ(setState, 0L, 0, null, new OSZ(aqS57S1100000_3.s0, Long.valueOf(((StoryViewerListResponse) aqS57S1100000_3.l1).total)), 7);
    }

    public static final Object invoke$21(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", ((NowArchiveCalendarListViewModel) aqS57S1100000_3.l1).LJLIL);
        sendEventTrackingAsync.put("now_date", aqS57S1100000_3.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", ((NowArchiveCalendarListViewModel) aqS57S1100000_3.l1).LJLIL);
        sendEventTrackingAsync.put("now_date", aqS57S1100000_3.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS57S1100000_3 aqS57S1100000_3, Object it) {
        o.LJIIIZ(it, "it");
        ((WatchHistoryContentAssem) aqS57S1100000_3.l1).getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "single");
        c188727au.LIZLLL(1, "is_success");
        FMX.LJIIL("confirm_popup_delete_account_history_result", c188727au.LIZ);
        ((WatchHistoryContentAssem) aqS57S1100000_3.l1).C3(aqS57S1100000_3.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        InteractionSyncViewModelState setState = (InteractionSyncViewModelState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InteractionSyncViewModelState.copy$default(setState, null, null, null, null, new CommentDeleteState((Comment) aqS57S1100000_3.l1, aqS57S1100000_3.s0), null, null, null, 239, null);
    }

    public static final Object invoke$25(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        InteractionSyncViewModelState setState = (InteractionSyncViewModelState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InteractionSyncViewModelState.copy$default(setState, null, null, null, new CommentPublishState((Comment) aqS57S1100000_3.l1, aqS57S1100000_3.s0), null, null, null, null, 247, null);
    }

    public static final Object invoke$26(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        InteractionSyncViewModelState setState = (InteractionSyncViewModelState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InteractionSyncViewModelState.copy$default(setState, null, null, null, null, null, new C43I(new CommentLatestState((Comment) aqS57S1100000_3.l1, aqS57S1100000_3.s0)), null, null, 223, null);
    }

    public static final Object invoke$27(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        String str;
        String authorUid;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("to_user_id", aqS57S1100000_3.s0);
        sendEventTrackingAsync.put("enter_from", ((FeedTaggedListViewModel) aqS57S1100000_3.l1).gv0().LJLJI);
        Aweme aweme = ((FeedTaggedListViewModel) aqS57S1100000_3.l1).gv0().LJLIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendEventTrackingAsync.put("group_id", str);
        Aweme aweme2 = ((FeedTaggedListViewModel) aqS57S1100000_3.l1).gv0().LJLIL;
        if (aweme2 != null && (authorUid = aweme2.getAuthorUid()) != null) {
            str2 = authorUid;
        }
        sendEventTrackingAsync.put("author_id", str2);
        sendEventTrackingAsync.put("anchor_type", ((FeedTaggedListViewModel) aqS57S1100000_3.l1).gv0().LJLJJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("previous_page", "video_post_page");
        sendEventTrackingAsync.put("to_user_id", ((Y9G) aqS57S1100000_3.l1).LIZ);
        sendEventTrackingAsync.put("user_type", aqS57S1100000_3.s0);
        sendEventTrackingAsync.put("search_keyword", "");
        sendEventTrackingAsync.put("function", "mention");
        sendEventTrackingAsync.put("is_valid", String.valueOf(((Y9G) aqS57S1100000_3.l1).LJIJI.LIZ ? 1 : 0));
        sendEventTrackingAsync.put("click_type", "choose");
        sendEventTrackingAsync.put("enter_from", "video_edit_page");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", "video_edit_page");
        sendEventTrackingAsync.put("previous_page", "video_post_page");
        sendEventTrackingAsync.put("to_user_id", ((Y9G) aqS57S1100000_3.l1).LIZ);
        sendEventTrackingAsync.put("user_type", aqS57S1100000_3.s0);
        sendEventTrackingAsync.put("search_keyword", "");
        sendEventTrackingAsync.put("function", "mention");
        sendEventTrackingAsync.put("is_valid", String.valueOf(((Y9G) aqS57S1100000_3.l1).LJIJI.LIZ ? 1 : 0));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (r3 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AqS57S1100000_3 r3, java.lang.Object r4) {
        /*
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.lang.String r0 = "$this$sendEventTrackingAsync"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = r3.s0
            r4.put(r1, r0)
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem r0 = (com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem) r0
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r0)
            X.7ML r0 = (X.C7ML) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r1 = r0.getAid()
            java.lang.String r0 = "group_id"
            r4.put(r0, r1)
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem r0 = (com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem) r0
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r0)
            X.7ML r0 = (X.C7ML) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r1 = r0.getAuthorUid()
            java.lang.String r0 = "author_id"
            r4.put(r0, r1)
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem r0 = (com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem) r0
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r0)
            X.7ML r0 = (X.C7ML) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            int r1 = r0.getFollowStatus()
            java.lang.String r0 = "follow_status"
            r4.put(r0, r1)
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem r0 = (com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem) r0
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r0)
            X.7ML r0 = (X.C7ML) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            com.ss.android.ugc.aweme.now.NowPostInfo r0 = r0.nowPostInfo
            if (r0 == 0) goto L6b
            java.lang.String r1 = r0.getNowMediaType()
            if (r1 != 0) goto L6d
        L6b:
            java.lang.String r1 = "post"
        L6d:
            java.lang.String r0 = "now_type"
            r4.put(r0, r1)
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem r0 = (com.ss.android.ugc.aweme.nows.interaction.assem.NowShareBottomAssem) r0
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r0)
            X.7ML r0 = (X.C7ML) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = r0.isPrivate()
            r1 = r0 ^ 1
            java.lang.String r0 = "is_today"
            r4.put(r0, r1)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L97
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L9a
        L97:
            r1 = r2
            if (r3 == 0) goto Lba
        L9a:
            boolean r0 = r3.isConnected()
        L9e:
            r4.put(r1, r0)
            if (r3 == 0) goto La9
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto Lac
        La9:
            r1 = r2
            if (r3 == 0) goto Lb2
        Lac:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto Lb8
        Lb2:
            r4.put(r1, r2)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lb8:
            r2 = r0
            goto Lb2
        Lba:
            r0 = 0
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS57S1100000_3.invoke$3(kotlin.jvm.internal.AqS57S1100000_3, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$30(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("search_keyword", aqS57S1100000_3.s0);
        sendEventTrackingAsync.put("log_pb", C3A5.LIZ.LJ(((Y9G) aqS57S1100000_3.l1).LIZ));
        sendEventTrackingAsync.put("to_user_id", ((Y9G) aqS57S1100000_3.l1).LIZ);
        sendEventTrackingAsync.put("relation_tag", ((Y9G) aqS57S1100000_3.l1).LIZIZ);
        sendEventTrackingAsync.put("enter_from", "video_edit_page");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("previous_page", "video_edit_page");
        sendEventTrackingAsync.put("to_user_id", ((Y9G) aqS57S1100000_3.l1).LIZ);
        sendEventTrackingAsync.put("user_type", aqS57S1100000_3.s0);
        sendEventTrackingAsync.put("search_keyword", "");
        sendEventTrackingAsync.put("function", "mention");
        sendEventTrackingAsync.put("is_valid", String.valueOf(((Y9G) aqS57S1100000_3.l1).LJIJI.LIZ ? 1 : 0));
        sendEventTrackingAsync.put("click_type", "choose");
        sendEventTrackingAsync.put("enter_from", "video_post_page");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", "video_post_page");
        sendEventTrackingAsync.put("previous_page", "video_edit_page");
        sendEventTrackingAsync.put("to_user_id", ((Y9G) aqS57S1100000_3.l1).LIZ);
        sendEventTrackingAsync.put("user_type", aqS57S1100000_3.s0);
        sendEventTrackingAsync.put("search_keyword", "");
        sendEventTrackingAsync.put("function", "mention");
        sendEventTrackingAsync.put("is_valid", String.valueOf(((Y9G) aqS57S1100000_3.l1).LJIJI.LIZ ? 1 : 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        String str;
        String str2;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        ResetEntryTextData resetEntryTextData = (ResetEntryTextData) aqS57S1100000_3.l1;
        String str3 = null;
        if (resetEntryTextData != null) {
            str = resetEntryTextData.getOk();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            ResetEntryTextData resetEntryTextData2 = (ResetEntryTextData) aqS57S1100000_3.l1;
            if (resetEntryTextData2 != null) {
                str3 = resetEntryTextData2.getOk();
            }
            str2 = String.valueOf(str3);
        } else {
            str2 = aqS57S1100000_3.s0;
        }
        actionGroup.LJII(str2, C7D5.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C225458t3 it = (C225458t3) obj;
        o.LJIIIZ(it, "it");
        if (!o.LJ(aqS57S1100000_3.s0, it.LJLILLLLZI)) {
            ((FeedAvatarDefaultVM) aqS57S1100000_3.l1).setState(new AqS28S1000000_3(aqS57S1100000_3.s0, 19));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        JSONObject sendEventTracking = (JSONObject) obj;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("enter_from", aqS57S1100000_3.s0);
        sendEventTracking.put("position", "detail_below_left");
        sendEventTracking.put("caption_flag", CardStruct.IStatusCode.DEFAULT);
        sendEventTracking.put("group_id", ((InterfaceC194547kI) aqS57S1100000_3.l1).getAweme().getAid());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        String str;
        JSONObject sendEventTracking = (JSONObject) obj;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("enter_from", aqS57S1100000_3.s0);
        sendEventTracking.put("position", "detail_below_left");
        sendEventTracking.put("caption_flag", CardStruct.IStatusCode.DEFAULT);
        Aweme aweme = ((NowCollectionCellCaptionAssem) aqS57S1100000_3.l1).LLFF;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        sendEventTracking.put("group_id", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$37(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C219708jm it = (C219708jm) obj;
        o.LJIIIZ(it, "it");
        List LIZ = C208708Ha.LIZ(it);
        if (LIZ != null) {
            String str = aqS57S1100000_3.s0;
            AddYoursHubListViewModel addYoursHubListViewModel = (AddYoursHubListViewModel) aqS57S1100000_3.l1;
            int i = 0;
            for (Object obj2 : LIZ) {
                int i2 = i + 1;
                String str2 = null;
                if (i >= 0) {
                    Aweme video = ((C219618jd) obj2).LJLILLLLZI.getVideo();
                    if (video != null) {
                        str2 = video.getAid();
                    }
                    if (o.LJ(str2, str)) {
                        addYoursHubListViewModel.listRemoveItemAt(i);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS57S1100000_3 aqS57S1100000_3, Object it) {
        o.LJIIIZ(it, "it");
        C73411SrX c73411SrX = ((PoiMapViewModel) aqS57S1100000_3.l1).LJLIL;
        if (c73411SrX == null || c73411SrX.isDisposed()) {
            long currentTimeMillis = System.currentTimeMillis();
            PoiMapViewModel poiMapViewModel = (PoiMapViewModel) aqS57S1100000_3.l1;
            poiMapViewModel.LJLJJI++;
            PoiListApi.LIZ.getClass();
            C73454SsE LJJJ = C189927cq.LIZ().getPoiDetail(aqS57S1100000_3.s0).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
            PoiMapViewModel poiMapViewModel2 = (PoiMapViewModel) aqS57S1100000_3.l1;
            poiMapViewModel.LJLIL = (C73411SrX) LJJJ.LJJJLIIL(new AfS2S0100100_3(currentTimeMillis, poiMapViewModel2, 3), new AfS55S0100000_3(poiMapViewModel2, 59));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C8AS it = (C8AS) obj;
        o.LJIIIZ(it, "it");
        List<C2050482y> list = it.LJLJJI.LJLJJI;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (o.LJ(((C2050482y) ListProtector.get(list, i)).LJLIL.getAid(), aqS57S1100000_3.s0)) {
                    ListProtector.add(arrayList, 0, Integer.valueOf(i));
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((ExploreFeedListViewModel) aqS57S1100000_3.l1).listRemoveItemAt(((Number) ListProtector.get(arrayList, i2)).intValue());
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS57S1100000_3 aqS57S1100000_3, Object it) {
        o.LJIIIZ(it, "it");
        ((InterfaceC65784Pro) aqS57S1100000_3.l1).invoke();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", aqS57S1100000_3.s0);
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("region_code", C64707PaR.LIZJ);
        c188727au.LJIIIZ("click_type", "post_now");
        FMX.LJIIL("click_public_notice", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS57S1100000_3 aqS57S1100000_3, Object setStateImmediate) {
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return new C7J0(new C43I(new OSZ(aqS57S1100000_3.s0, (Spannable) aqS57S1100000_3.l1)));
    }

    public static final Object invoke$41(AqS57S1100000_3 aqS57S1100000_3, Object setStateImmediate) {
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return new C7J0(new C43I(new OSZ(aqS57S1100000_3.s0, (Spannable) aqS57S1100000_3.l1)));
    }

    public static final Object invoke$42(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C2U8.LIZ(new C187127Wa(((Boolean) obj).booleanValue(), aqS57S1100000_3.s0, ((PoiCollectStatusBaseAssem) aqS57S1100000_3.l1).M3().LJLJJI, ((PoiCollectStatusBaseAssem) aqS57S1100000_3.l1).M3().LJLJJL, String.valueOf(((PoiCollectStatusBaseAssem) aqS57S1100000_3.l1).hashCode())));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        it.LIZ().LIZIZ(null);
        LiveOuterService.LJJJLL().LJJIJIL().LJJJIL(((C188487aW) aqS57S1100000_3.l1).LIZIZ, UriProtector.parse(aqS57S1100000_3.s0));
        ((C188487aW) aqS57S1100000_3.l1).LJ("click_contact_us");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.tq8, new AqS57S1100000_3((C188487aW) aqS57S1100000_3.l1, aqS57S1100000_3.s0, 43));
        actionGroup.LJIIIIZZ(R.string.spn, new AqS169S0100000_3((C188487aW) aqS57S1100000_3.l1, 990));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$45(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C181627Aw setStateImmediate = (C181627Aw) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return C181627Aw.LIZ(setStateImmediate, null, null, new C43I(new OSZ(0, aqS57S1100000_3.s0)), C1FP.LJIIIIZZ(C7H2.LIZ(aqS57S1100000_3.s0)), (Integer) aqS57S1100000_3.l1, null, 35);
    }

    public static final Object invoke$46(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C181627Aw setState = (C181627Aw) obj;
        o.LJIIIZ(setState, "$this$setState");
        Throwable it = (Throwable) aqS57S1100000_3.l1;
        o.LJIIIIZZ(it, "it");
        return C181627Aw.LIZ(setState, new C3C1(it), null, new C43I(new OSZ(4, aqS57S1100000_3.s0)), C1FP.LJIIIIZZ(C7H2.LIZ(aqS57S1100000_3.s0)), null, null, 50);
    }

    public static final Object invoke$47(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C181627Aw setState = (C181627Aw) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C181627Aw.LIZ(setState, null, null, new C43I(new OSZ(3, aqS57S1100000_3.s0)), (UpvoteStruct) aqS57S1100000_3.l1, null, null, 51);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (r3 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$48(kotlin.jvm.internal.AqS57S1100000_3 r3, java.lang.Object r4) {
        /*
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.lang.String r0 = "$this$sendEventTrackingAsync"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = r3.s0
            r4.put(r1, r0)
            java.lang.Object r0 = r3.l1
            X.7kI r0 = (X.InterfaceC194547kI) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r1 = r0.getAid()
            java.lang.String r0 = "group_id"
            r4.put(r0, r1)
            java.lang.Object r0 = r3.l1
            X.7kI r0 = (X.InterfaceC194547kI) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r1 = r0.getAuthorUid()
            java.lang.String r0 = "author_id"
            r4.put(r0, r1)
            java.lang.Object r0 = r3.l1
            X.7kI r0 = (X.InterfaceC194547kI) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            int r1 = r0.getFollowStatus()
            java.lang.String r0 = "follow_status"
            r4.put(r0, r1)
            java.lang.Object r0 = r3.l1
            X.7kI r0 = (X.InterfaceC194547kI) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            com.ss.android.ugc.aweme.now.NowPostInfo r0 = r0.nowPostInfo
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.getNowMediaType()
            if (r1 != 0) goto L55
        L53:
            java.lang.String r1 = "post"
        L55:
            java.lang.String r0 = "now_type"
            r4.put(r0, r1)
            java.lang.Object r0 = r3.l1
            X.7kI r0 = (X.InterfaceC194547kI) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = r0.isPrivate()
            r1 = r0 ^ 1
            java.lang.String r0 = "is_today"
            r4.put(r0, r1)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L79
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L7c
        L79:
            r1 = r2
            if (r3 == 0) goto L9c
        L7c:
            boolean r0 = r3.isConnected()
        L80:
            r4.put(r1, r0)
            if (r3 == 0) goto L8b
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L8e
        L8b:
            r1 = r2
            if (r3 == 0) goto L94
        L8e:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto L9a
        L94:
            r4.put(r1, r2)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L9a:
            r2 = r0
            goto L94
        L9c:
            r0 = 0
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS57S1100000_3.invoke$48(kotlin.jvm.internal.AqS57S1100000_3, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AqS57S1100000_3 aqS57S1100000_3, Object it) {
        o.LJIIIZ(it, "it");
        ((InterfaceC65784Pro) aqS57S1100000_3.l1).invoke();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", aqS57S1100000_3.s0);
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("region_code", C64707PaR.LIZJ);
        c188727au.LJIIIZ("click_type", "cancel");
        FMX.LJIIL("click_public_notice", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        List<C2050482y> list;
        C2050482y c2050482y;
        C8AS it = (C8AS) obj;
        o.LJIIIZ(it, "it");
        List<C2050482y> list2 = it.LJLJJI.LJLJJI;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<C2050482y> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJLIL.getAid());
            }
            int indexOf = arrayList.indexOf(aqS57S1100000_3.s0);
            if (indexOf >= 0 && (list = it.LJLJJI.LJLJJI) != null && (c2050482y = (C2050482y) ListProtector.get(list, indexOf)) != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onVideoEvent: aid = ");
                LIZ.append(aqS57S1100000_3.s0);
                LIZ.append(", selected = ");
                boolean z = true;
                if (c2050482y.LJLIL.getUserDigg() != 1) {
                    z = false;
                }
                LIZ.append(z);
                LIZ.append(", diggCount = ");
                LIZ.append(c2050482y.LJLIL.getStatistics().getDiggCount());
                X1D.LIZIZ(LIZ);
                ExploreFeedListViewModel exploreFeedListViewModel = (ExploreFeedListViewModel) aqS57S1100000_3.l1;
                Aweme aweme = c2050482y.LJLIL;
                exploreFeedListViewModel.listSetItemAt(indexOf, (int) new C2050482y(aweme, aweme.isLike(), c2050482y.LJLJI, c2050482y.LJLJJI));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        C8AS it = (C8AS) obj;
        o.LJIIIZ(it, "it");
        if (!(it.getListState().LJLIL instanceof C72922tc)) {
            String enterMethod = aqS57S1100000_3.s0;
            o.LJIIIZ(enterMethod, "enterMethod");
            C206998Al c206998Al = (C206998Al) C206978Aj.LIZ.getValue();
            c206998Al.getClass();
            c206998Al.LIZIZ = SystemClock.elapsedRealtime();
            if (!o.LJ(enterMethod, "init")) {
                c206998Al.LJIIIIZZ = "refresh";
            }
            String enterMethod2 = aqS57S1100000_3.s0;
            o.LJIIIZ(enterMethod2, "enterMethod");
            if (!o.LJ(enterMethod2, "init")) {
                if (o.LJ(enterMethod2, "publish_landing")) {
                    enterMethod2 = "after_upload_succeed";
                }
                C207008Am.LIZ(new C84T(enterMethod2));
            }
            ((ExploreFeedListViewModel) aqS57S1100000_3.l1).manualListRefresh();
            if (o.LJ(aqS57S1100000_3.s0, "click_button_icon") || o.LJ(aqS57S1100000_3.s0, "click_top_icon") || o.LJ(aqS57S1100000_3.s0, "publish_landing")) {
                ((ExploreFeedListViewModel) aqS57S1100000_3.l1).setState(C206888Aa.LJLIL);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS57S1100000_3 aqS57S1100000_3, Object obj) {
        int i;
        if (((Boolean) obj).booleanValue()) {
            InputNameSheetFragment inputNameSheetFragment = (InputNameSheetFragment) aqS57S1100000_3.l1;
            InterfaceC193237iB interfaceC193237iB = inputNameSheetFragment.LJLJL;
            if (interfaceC193237iB != null) {
                String str = aqS57S1100000_3.s0;
                if (inputNameSheetFragment.LJLLI) {
                    i = 3;
                } else {
                    i = 1;
                }
                interfaceC193237iB.LIZ(i, str);
            }
            ASQ.LJ((InputNameSheetFragment) aqS57S1100000_3.l1, ASX.LIZ);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AqS57S1100000_3 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS57S1100000_3.invoke$9(kotlin.jvm.internal.AqS57S1100000_3, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS57S1100000_3(X.Y9G r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 28: goto Lf;
                case 29: goto Lf;
                case 30: goto L5;
                case 31: goto Lf;
                case 32: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS57S1100000_3.<init>(X.Y9G, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS57S1100000_3(com.ss.android.ugc.aweme.toptab.vm.LiveDualFeedListViewModel r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS57S1100000_3.<init>(com.ss.android.ugc.aweme.toptab.vm.LiveDualFeedListViewModel, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(C188487aW c188487aW, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c188487aW;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(Spannable spannable, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = spannable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(UIAssem uIAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = uIAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(TuxTextLayoutView tuxTextLayoutView, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = tuxTextLayoutView;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(Comment comment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = comment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(ResetEntryTextData resetEntryTextData, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = resetEntryTextData;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(InputNameSheetFragment inputNameSheetFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = inputNameSheetFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(NowArchiveCalendarListViewModel nowArchiveCalendarListViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = nowArchiveCalendarListViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(PoiCollectStatusBaseAssem poiCollectStatusBaseAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = poiCollectStatusBaseAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(PoiDetailInfoAssem poiDetailInfoAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiDetailInfoAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(PoiMapViewModel poiMapViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiMapViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(UpvotePublishResponse upvotePublishResponse, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = upvotePublishResponse;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(WatchHistoryContentAssem watchHistoryContentAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = watchHistoryContentAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, InterfaceC194547kI interfaceC194547kI, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC194547kI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC65784Pro;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, ExploreFeedListViewModel exploreFeedListViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = exploreFeedListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, FeedAvatarDefaultVM feedAvatarDefaultVM, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = feedAvatarDefaultVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, UpvoteStruct upvoteStruct, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = upvoteStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, NowCollectionCellCaptionAssem nowCollectionCellCaptionAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = nowCollectionCellCaptionAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, NowShareBottomAssem nowShareBottomAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = nowShareBottomAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, StoryViewerListResponse storyViewerListResponse, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = storyViewerListResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, FeedTaggedListViewModel feedTaggedListViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = feedTaggedListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, TopicSearchListAssem topicSearchListAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = topicSearchListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, AddYoursHubListViewModel addYoursHubListViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = addYoursHubListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(String str, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS57S1100000_3(String str, String str2, List<? extends User> list) {
        super(1);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1100000_3(Throwable th, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = th;
        this.s0 = str;
    }
}
