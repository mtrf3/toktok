package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C00F;
import X.C04270Et;
import X.C10K;
import X.C16880lQ;
import X.C17N;
import X.C181627Aw;
import X.C183887Jo;
import X.C187237Wl;
import X.C187377Wz;
import X.C189257bl;
import X.C189367bw;
import X.C189377bx;
import X.C189957ct;
import X.C192487gy;
import X.C195627m2;
import X.C195637m3;
import X.C195937mX;
import X.C198847rE;
import X.C199127rg;
import X.C200537tx;
import X.C202297wn;
import X.C202427x0;
import X.C202467x4;
import X.C204147zm;
import X.C212418Vh;
import X.C212428Vi;
import X.C214378bB;
import X.C219608jc;
import X.C219618jd;
import X.C220488l2;
import X.C226388uY;
import X.C227768wm;
import X.C2NU;
import X.C2WN;
import X.C36922EeM;
import X.C3C8;
import X.C43I;
import X.C46276IEe;
import X.C51029K0z;
import X.C55096Ljo;
import X.C55230Lly;
import X.C5S1;
import X.C63044Ooi;
import X.C72808Sho;
import X.C72912tb;
import X.C72T;
import X.C73305Spp;
import X.C73454SsE;
import X.C73969T1h;
import X.C76800UCe;
import X.C78963Uyt;
import X.C78999UzT;
import X.C7JS;
import X.C7ML;
import X.C7VC;
import X.C8E0;
import X.C8MP;
import X.C8VR;
import X.C8YM;
import X.C90193gN;
import X.FFL;
import X.InterfaceC212848Wy;
import X.InterfaceC55235Lm3;
import X.InterfaceC57784Mm4;
import X.InterfaceC65350Pko;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.JA9;
import X.LPX;
import X.LRD;
import X.ORZ;
import X.OSZ;
import X.RBW;
import X.SYL;
import X.T16;
import X.X1D;
import Y.ACListenerS29S0300000_3;
import Y.ACListenerS38S0200000_3;
import Y.ACallableS106S0100000_3;
import Y.AfS53S0100000_1;
import Y.AfS7S1201000_3;
import Y.AfS9S1101000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListFragmentForMineProfile;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.input.DanmakuInputFragment;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicCoverAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoWithArtistAssem;
import com.ss.android.ugc.aweme.nows.feed.caption.NowCollectionCellCaptionAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.ymal.PoiDetailYmalAssemV2;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.assem.PoiReviewFloatingActionAssem;
import com.ss.android.ugc.aweme.poi.reviews.assem.PoiReviewStatusAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.popup.AvatarAndNicknamePopup;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryCoverListAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListFragment;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerNavBarAssem;
import com.ss.android.ugc.aweme.upvote.dispatcher.UpvoteEventObservable;
import com.ss.android.ugc.aweme.upvote.dispatcher.UpvoteEventObservableFixMemoryLeak;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AqS166S0200000_3 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            case 17:
                return invoke$17(this, obj, obj2);
            case 18:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case 20:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case 24:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            default:
                return null;
        }
    }

    public final void invoke$0(C3C8 selectSubscribe, C8E0 page) {
        int i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(page, "page");
        View findViewById = ((View) this.l0).findViewById(R.id.f0h);
        AvatarAndNicknamePopup avatarAndNicknamePopup = (AvatarAndNicknamePopup) this.l1;
        TuxIconView tuxIconView = (TuxIconView) findViewById;
        if (page.getShowCloseXMark()) {
            i = 0;
        } else {
            i = 8;
        }
        tuxIconView.setVisibility(i);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS38S0200000_3(page, avatarAndNicknamePopup, 46));
    }

    public final void invoke$1(NowCollectionCellCaptionAssem selectSubscribe, int i) {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        Drawable drawable;
        String desc;
        int i2;
        String str;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C195627m2 c195627m2 = selectSubscribe.LLF;
        if (c195627m2 != null) {
            if (c195627m2.LJLJL.LIZ()) {
                C195637m3 c195637m3 = c195627m2.LJLJL;
                C7ML c7ml = (C7ML) ORZ.LJLLLLLL(c195637m3.LJI, c195637m3.LJIIIIZZ);
                if (c7ml == null || (aweme = c7ml.getAweme()) == null) {
                    aweme = c195627m2.LJLIL;
                }
            } else {
                aweme = c195627m2.LJLIL;
            }
        } else {
            aweme = null;
        }
        selectSubscribe.LLFF = aweme;
        if (aweme == null) {
            return;
        }
        String desc2 = aweme.getDesc();
        if ((desc2 == null || desc2.length() == 0) && (aweme2 = selectSubscribe.LLFF) != null && C78963Uyt.LJJIIZ(aweme2) && (aweme3 = selectSubscribe.LLFF) != null && !C195937mX.LJ(aweme3)) {
            selectSubscribe.Z3().setVisibility(0);
            Context context = selectSubscribe.getContext();
            if (context != null) {
                drawable = C04270Et.LIZIZ(context, R.drawable.btp);
                if (drawable != null) {
                    drawable.setBounds(0, 0, C17N.LJIILL(14.0d), C17N.LJIILL(14.0d));
                }
            } else {
                drawable = null;
            }
            TuxTextView Z3 = selectSubscribe.Z3();
            C195627m2 c195627m22 = (C195627m2) this.l0;
            NowCollectionCellCaptionAssem nowCollectionCellCaptionAssem = (NowCollectionCellCaptionAssem) this.l1;
            selectSubscribe.a4(selectSubscribe.Z3().getContext().getString(R.string.y1));
            Z3.setTuxFont(33);
            Context context2 = Z3.getContext();
            o.LJIIIIZZ(context2, "this.context");
            Z3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context2));
            if (C90193gN.LIZ()) {
                Z3.setCompoundDrawables(null, null, drawable, null);
            } else {
                Z3.setCompoundDrawables(drawable, null, null, null);
            }
            Z3.setCompoundDrawablePadding(C17N.LJIILL(4.0d));
            C16880lQ.LJJJJI(Z3, new ACListenerS29S0300000_3(nowCollectionCellCaptionAssem, selectSubscribe, c195627m22, 11));
            return;
        }
        Aweme aweme4 = selectSubscribe.LLFF;
        if (aweme4 != null) {
            C187377Wz c187377Wz = C187377Wz.LIZIZ;
            if (c187377Wz.LIZIZ() != 0 && (desc = aweme4.getDesc()) != null && desc.length() != 0) {
                C195627m2 c195627m23 = selectSubscribe.LLF;
                if (c195627m23 != null) {
                    i2 = c195627m23.LJLJI;
                } else {
                    i2 = 0;
                }
                if (!c187377Wz.LIZ(i2) && c187377Wz.LIZIZ() != 1) {
                    Aweme aweme5 = selectSubscribe.LLFF;
                    if (aweme5 != null) {
                        str = aweme5.getDesc();
                    } else {
                        str = null;
                    }
                    selectSubscribe.a4(str);
                    selectSubscribe.Z3().setVisibility(0);
                    selectSubscribe.Z3().setCompoundDrawables(null, null, null, null);
                    C16880lQ.LJJJJI(selectSubscribe.Z3(), new View.OnClickListener() { // from class: X.7Wy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C6ZT.LIZ(view);
                        }
                    });
                    return;
                }
            }
        }
        selectSubscribe.a4("");
        selectSubscribe.Z3().setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(ActivityC45651qj activityC45651qj, AddYoursHubItemCellAssem addYoursHubItemCellAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = addYoursHubItemCellAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        OSZ osz;
        Object second;
        String str;
        C43I c43i = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (osz = (OSZ) c43i.LIZ) != null && (second = osz.getSecond()) != null) {
            Aweme aweme = ((VideoItemParams) ((ReusedUIAssem) aqS166S0200000_3.l0).v3()).getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (o.LJ(second, str)) {
                C8VR.LIZJ((ReusedUIAssem) aqS166S0200000_3.l0, (InterfaceC65350Pko) aqS166S0200000_3.l1);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        String str;
        C7JS c7js = (C7JS) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Aweme aweme = ((VideoItemParams) ((ReusedUIAssem) aqS166S0200000_3.l0).v3()).getAweme();
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (c7js != null) {
            str2 = c7js.LJLIL;
        }
        if (o.LJ(str2, str)) {
            C8VR.LIZJ((ReusedUIAssem) aqS166S0200000_3.l0, (InterfaceC65350Pko) aqS166S0200000_3.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        int i;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        MusicPgcMetaInfoWithArtistAssem musicPgcMetaInfoWithArtistAssem = (MusicPgcMetaInfoWithArtistAssem) aqS166S0200000_3.l0;
        View view = (View) aqS166S0200000_3.l1;
        musicPgcMetaInfoWithArtistAssem.getClass();
        if (booleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        Integer num;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        C72808Sho<InterfaceC57784Mm4> state;
        List list = (List) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ymal assem select detect, size: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        if (((PoiDetailYmalAssemV2) aqS166S0200000_3.l0).N3()) {
            if (list != null) {
                ((PoiDetailYmalAssemV2) aqS166S0200000_3.l0).getClass();
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        PoiDetailYmalAssemV2 poiDetailYmalAssemV2 = (PoiDetailYmalAssemV2) aqS166S0200000_3.l0;
                        View view = (View) aqS166S0200000_3.l1;
                        C189957ct.LIZ.getClass();
                        FFL.LJIIIZ().getClass();
                        if (FFL.LJIIJ(31744, 0, "poi_ymal_show", false) == 1) {
                            poiDetailYmalAssemV2.P3(view, false);
                        } else if (C00F.LIZ(31744, 0, "poi_ymal_show", false) == 2) {
                            Fragment LIZLLL = C212428Vi.LIZLLL(poiDetailYmalAssemV2);
                            if (LIZLLL != null && (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), IPoiDetailInfoVAbility.class, null)) != null && iPoiDetailInfoVAbility.w4()) {
                                poiDetailYmalAssemV2.P3(view, false);
                            } else {
                                poiDetailYmalAssemV2.M3(false);
                            }
                        }
                        SYL syl = poiDetailYmalAssemV2.LJLLJ;
                        if (syl != null && (state = syl.getState()) != null) {
                            state.LJIILLIIL(arrayList);
                        }
                    }
                }
            }
            ((PoiDetailYmalAssemV2) aqS166S0200000_3.l0).M3(false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse = (PoiReviewsApi.PoiReviewEligibleResponse) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (poiReviewEligibleResponse != null && o.LJ(poiReviewEligibleResponse.eligible, Boolean.TRUE) && RBW.LJLLI.LJI()) {
            ((View) aqS166S0200000_3.l0).setVisibility(0);
            C198847rE.LIZJ("poi_reviews", "write_review_button", ((PoiReviewFloatingActionAssem) aqS166S0200000_3.l1).H3().LJLIL, poiReviewEligibleResponse.collectInfo);
        } else {
            ((View) aqS166S0200000_3.l0).setVisibility(8);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object it) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiReviewListState - refreshState is success:");
        LIZ.append(((C7VC) ((PoiReviewStatusAssem) aqS166S0200000_3.l0).v3().getState()).LJLJJL.LJLIL instanceof C72912tb);
        LIZ.append(' ');
        C199127rg.LIZ(X1D.LIZIZ(LIZ));
        if (((C7VC) ((PoiReviewStatusAssem) aqS166S0200000_3.l0).v3().getState()).LJLJJL.LJLIL instanceof C72912tb) {
            ((PoiReviewStatusAssem) aqS166S0200000_3.l0).x3((C73305Spp) aqS166S0200000_3.l1);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        aqS166S0200000_3.invoke$0((C3C8) obj, (C8E0) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        C189377bx c189377bx;
        Aweme aweme = (Aweme) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (aweme != null) {
            if (((C189257bl) ((AssemViewModel) ((StoryGalleryCoverListAssem) aqS166S0200000_3.l0).LJLJJLL.getValue()).getState()).LJLILLLLZI != null) {
                StoryViewerListViewModel storyViewerListViewModel = (StoryViewerListViewModel) ((StoryGalleryCoverListAssem) aqS166S0200000_3.l0).LJLJJLL.getValue();
                C189377bx c189377bx2 = storyViewerListViewModel.LJLILLLLZI;
                if (c189377bx2 != null) {
                    c189377bx = C189377bx.copy$default(c189377bx2, null, "change_item", null, null, 0, 29, null);
                } else {
                    c189377bx = null;
                }
                storyViewerListViewModel.LJLILLLLZI = c189377bx;
                ((StoryViewerListViewModel) ((StoryGalleryCoverListAssem) aqS166S0200000_3.l0).LJLJJLL.getValue()).hv0("close_story_views_list_panel", null);
            }
            StoryViewerListViewModel storyViewerListViewModel2 = (StoryViewerListViewModel) ((StoryGalleryCoverListAssem) aqS166S0200000_3.l0).LJLJJLL.getValue();
            storyViewerListViewModel2.setStateImmediate(new AqS134S0200000_3((InterfaceC88472Yns) new AqS134S0200000_3((StoryViewerListHostAbility) aqS166S0200000_3.l1, aweme, 155), (InterfaceC88472Yns<? super C189257bl, C189367bw>) storyViewerListViewModel2, (StoryViewerListViewModel) 4));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj != null) {
            ((StoryViewerListViewModel) ((StoryViewerListFragment) aqS166S0200000_3.l0).LJLILLLLZI.getValue()).hv0("close_story_views_list_panel", C187237Wl.LJLIL);
            StoryViewerListFragment storyViewerListFragment = (StoryViewerListFragment) aqS166S0200000_3.l0;
            View view = (View) aqS166S0200000_3.l1;
            storyViewerListFragment.vl(view, 0, view.getHeight(), new AqS153S0100000_3((StoryViewerListFragment) aqS166S0200000_3.l0, 1017));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        C43I c43i = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            StoryViewerNavBarAssem storyViewerNavBarAssem = (StoryViewerNavBarAssem) aqS166S0200000_3.l0;
            Context ctx = (Context) aqS166S0200000_3.l1;
            o.LJIIIIZZ(ctx, "ctx");
            storyViewerNavBarAssem.x3(((Number) c43i.LIZ).longValue(), ctx);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        C189367bw c189367bw = (C189367bw) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c189367bw == null || c189367bw.LIZLLL || c189367bw.LJ || c189367bw.LIZJ || c189367bw.LJFF || c189367bw.LJI) {
            StoryViewerNavBarAssem storyViewerNavBarAssem = (StoryViewerNavBarAssem) aqS166S0200000_3.l0;
            Context ctx = (Context) aqS166S0200000_3.l1;
            o.LJIIIIZZ(ctx, "ctx");
            storyViewerNavBarAssem.x3(-1L, ctx);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AqS166S0200000_3 r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r7 = r19
            r0 = r20
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r7 = (com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct) r7
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            r4 = 0
            r2 = r18
            if (r7 == 0) goto L5e
            java.lang.Object r0 = r2.l0
            com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem r0 = (com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem) r0
            java.lang.Object r3 = r2.l1
            X.1qj r3 = (X.ActivityC45651qj) r3
            com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam r6 = new com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam
            boolean r9 = X.C226388uY.LJ()
            java.lang.String r10 = "personal_homepage"
            java.lang.String r11 = "add_yours"
            java.lang.String r12 = "personal_homepage_favourite_shoot"
            java.lang.Object r1 = X.C51029K0z.LJIILLIIL(r0)
            X.8jE r1 = (X.C219368jE) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.LJLJJLL
            if (r1 == 0) goto L37
            int r1 = r1.getFollowStatus()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
        L37:
            java.lang.String r13 = java.lang.String.valueOf(r4)
            r15 = r5 ^ 1
            r16 = 0
            r8 = 0
            r4 = r6
            r19 = 3714(0xe82, float:5.204E-42)
            r14 = r8
            r17 = r16
            r18 = r16
            r20 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.8l2 r1 = X.C220488l2.LIZIZ
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r0)
            X.8jE r0 = (X.C219368jE) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLJJLL
            r1.LJIIJ(r3, r0, r4)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L8a
        L5e:
            java.lang.Object r1 = r2.l0
            com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem r1 = (com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem) r1
            X.Ol8 r0 = r1.LLIIII
            java.lang.Object r0 = r0.getValue()
            X.AKb r0 = (X.C26045AKb) r0
            r0.LJIIJ()
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "cannot get valid add yours for topic, topicId="
            r2.append(r0)
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r1)
            X.8jE r0 = (X.C219368jE) r0
            long r0 = r0.LJLIL
            r2.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "AddYoursCollectionCell"
            X.C221018lt.LIZIZ(r0, r1)
        L8a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS166S0200000_3.invoke$19(kotlin.jvm.internal.AqS166S0200000_3, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        String str;
        C183887Jo c183887Jo = (C183887Jo) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Aweme aweme = ((VideoItemParams) ((ReusedUIAssem) aqS166S0200000_3.l0).v3()).getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (c183887Jo != null && c183887Jo.LJLILLLLZI && o.LJ(c183887Jo.LJLIL, str)) {
            C8VR.LIZJ((ReusedUIAssem) aqS166S0200000_3.l0, (InterfaceC65350Pko) aqS166S0200000_3.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        AddYoursHubAbility addYoursHubAbility;
        C219608jc mB;
        User user;
        String num;
        AddYoursStickerStruct addYoursStickerStruct = (AddYoursStickerStruct) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS166S0200000_3.l0;
        Aweme video = ((C219618jd) C51029K0z.LJIILLIIL((AddYoursHubItemCellAssem) aqS166S0200000_3.l1)).LJLILLLLZI.getVideo();
        boolean LJ = C226388uY.LJ();
        if (((C219618jd) C51029K0z.LJIILLIIL((AddYoursHubItemCellAssem) aqS166S0200000_3.l1)).LJLJI || (addYoursHubAbility = (AddYoursHubAbility) ((AddYoursHubItemCellAssem) aqS166S0200000_3.l1).LLFII.getValue()) == null || (mB = addYoursHubAbility.mB()) == null || (user = mB.LIZIZ) == null) {
            num = null;
        } else {
            num = Integer.valueOf(user.getFollowStatus()).toString();
        }
        c220488l2.LJIIJ(activityC45651qj, video, new AddYourRecordParam(addYoursStickerStruct, false, LJ, "add_yours_topic_list_page", "add_yours", "topic_list_page_shoot", num, true, !booleanValue, null, null, null, 3586, null));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        Boolean bool = (Boolean) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (bool != null) {
            LinearLayout linearLayout = (LinearLayout) aqS166S0200000_3.l0;
            LinearLayout linearLayout2 = (LinearLayout) aqS166S0200000_3.l1;
            if (bool.booleanValue()) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            } else {
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        C3C8 actualReceiver = ((InterfaceC212848Wy) aqS166S0200000_3.l0).getActualReceiver();
        if (actualReceiver != null) {
            C8VR.LIZIZ(actualReceiver, new AqS63S0400000_3((InterfaceC88473Ynt) aqS166S0200000_3.l1, (InterfaceC88473Ynt<C3C8, Object, Object, C76800UCe>) actualReceiver, (C3C8) obj, obj2, (Object) 7));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        C3C8 receiverForHostVM = ((C8YM) aqS166S0200000_3.l0).getReceiverForHostVM();
        if (receiverForHostVM != null || (receiverForHostVM = ((C8YM) aqS166S0200000_3.l0).getActualReceiverHolder().getActualReceiver()) != null) {
            ((InterfaceC88473Ynt) aqS166S0200000_3.l1).invoke(receiverForHostVM, obj, obj2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        C3C8 actualReceiver = ((InterfaceC212848Wy) aqS166S0200000_3.l0).getActualReceiver();
        if (actualReceiver != null) {
            C8VR.LIZIZ(actualReceiver, new AqS63S0400000_3((InterfaceC88473Ynt) aqS166S0200000_3.l1, (InterfaceC88473Ynt<C3C8, Object, Object, C76800UCe>) actualReceiver, (C3C8) obj, obj2, (Object) 8));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        C3C8 receiverForHostVM = ((C8YM) aqS166S0200000_3.l0).getReceiverForHostVM();
        if (receiverForHostVM != null || (receiverForHostVM = ((C8YM) aqS166S0200000_3.l0).getActualReceiverHolder().getActualReceiver()) != null) {
            ((InterfaceC88473Ynt) aqS166S0200000_3.l1).invoke(receiverForHostVM, obj, obj2);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        aqS166S0200000_3.invoke$1((NowCollectionCellCaptionAssem) obj, ((Number) obj2).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    View view = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLL;
                    if (view != null) {
                        view.setVisibility(8);
                        View view2 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLJLLL;
                        if (view2 != null) {
                            view2.setVisibility(0);
                            View view3 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLLI;
                            if (view3 != null) {
                                view3.setVisibility(8);
                                View view4 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLLI;
                                if (view4 != null) {
                                    view4.clearAnimation();
                                } else {
                                    o.LJIJI("musicLoading");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("musicLoading");
                                throw null;
                            }
                        } else {
                            o.LJIJI("musicPlay");
                            throw null;
                        }
                    } else {
                        o.LJIJI("musicStop");
                        throw null;
                    }
                }
            } else {
                View view5 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLL;
                if (view5 != null) {
                    view5.setVisibility(0);
                    View view6 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLJLLL;
                    if (view6 != null) {
                        view6.setVisibility(8);
                        View view7 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLLI;
                        if (view7 != null) {
                            view7.setVisibility(8);
                            View view8 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLLI;
                            if (view8 != null) {
                                view8.clearAnimation();
                            } else {
                                o.LJIJI("musicLoading");
                                throw null;
                            }
                        } else {
                            o.LJIJI("musicLoading");
                            throw null;
                        }
                    } else {
                        o.LJIJI("musicPlay");
                        throw null;
                    }
                } else {
                    o.LJIJI("musicStop");
                    throw null;
                }
            }
        } else {
            View view9 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLL;
            if (view9 != null) {
                view9.setVisibility(8);
                View view10 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLJLLL;
                if (view10 != null) {
                    view10.setVisibility(8);
                    View view11 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLLI;
                    if (view11 != null) {
                        view11.setVisibility(0);
                        View view12 = ((MusicCoverAssem) aqS166S0200000_3.l0).LJLLI;
                        if (view12 != null) {
                            view12.startAnimation(AnimationUtils.loadAnimation((Context) aqS166S0200000_3.l1, R.anim.ef));
                        } else {
                            o.LJIJI("musicLoading");
                            throw null;
                        }
                    } else {
                        o.LJIJI("musicLoading");
                        throw null;
                    }
                } else {
                    o.LJIJI("musicPlay");
                    throw null;
                }
            } else {
                o.LJIJI("musicStop");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        UpvoteEventObservable upvoteEventObservable = (UpvoteEventObservable) aqS166S0200000_3.l0;
        AssemViewModel assemViewModel = (AssemViewModel) ((C214378bB) aqS166S0200000_3.l1).getValue();
        AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3((UpvoteEventObservable) aqS166S0200000_3.l0, 916);
        upvoteEventObservable.getClass();
        C212418Vh.LJIIJJI(assemViewModel, aqS169S0100000_3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        UpvoteEventObservable upvoteEventObservable = (UpvoteEventObservable) aqS166S0200000_3.l0;
        AssemViewModel assemViewModel = (AssemViewModel) ((C214378bB) aqS166S0200000_3.l1).getValue();
        AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3((UpvoteEventObservable) aqS166S0200000_3.l0, 917);
        upvoteEventObservable.getClass();
        C212418Vh.LJIIJJI(assemViewModel, aqS169S0100000_3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        C46276IEe c46276IEe = (C46276IEe) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Aweme aweme = ((VideoItemParams) ((ReusedUIAssem) aqS166S0200000_3.l0).v3()).getAweme();
        o.LJIIIIZZ(aweme, "getItem<VideoItemParams>().aweme");
        if (c46276IEe != null && c46276IEe.LJLIL == 7 && !aweme.isPhotoMode()) {
            C8VR.LIZJ((ReusedUIAssem) aqS166S0200000_3.l0, (InterfaceC65350Pko) aqS166S0200000_3.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        UpvoteEventObservableFixMemoryLeak upvoteEventObservableFixMemoryLeak = (UpvoteEventObservableFixMemoryLeak) aqS166S0200000_3.l0;
        AssemViewModel assemViewModel = (AssemViewModel) ((C214378bB) aqS166S0200000_3.l1).getValue();
        AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3((UpvoteEventObservableFixMemoryLeak) aqS166S0200000_3.l0, 918);
        upvoteEventObservableFixMemoryLeak.getClass();
        C212418Vh.LJIIJJI(assemViewModel, aqS169S0100000_3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        UpvoteEventObservableFixMemoryLeak upvoteEventObservableFixMemoryLeak = (UpvoteEventObservableFixMemoryLeak) aqS166S0200000_3.l0;
        AssemViewModel assemViewModel = (AssemViewModel) ((C214378bB) aqS166S0200000_3.l1).getValue();
        AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3((UpvoteEventObservableFixMemoryLeak) aqS166S0200000_3.l0, 919);
        upvoteEventObservableFixMemoryLeak.getClass();
        C212418Vh.LJIIJJI(assemViewModel, aqS169S0100000_3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((C63044Ooi) aqS166S0200000_3.l0).setChecked(booleanValue);
        ((C63044Ooi) aqS166S0200000_3.l1).setChecked(!booleanValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        String collectionName = (String) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(collectionName, "collectionName");
        C78999UzT.LJFF(new C192487gy().LIZJ.LJJJIL(new CollectionManageRequest(1, null, collectionName, null, null, null, null, null, Integer.valueOf(intValue), LiveCoverMinSizeSetting.DEFAULT, null)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS9S1101000_3((ChooseCollectionSheetFragment) aqS166S0200000_3.l0, intValue, collectionName, 1), new AfS53S0100000_1((ActivityC45651qj) aqS166S0200000_3.l1, 26)), ((ChooseCollectionSheetFragment) aqS166S0200000_3.l0).xl());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        String collectionName = (String) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(collectionName, "collectionName");
        CollectionManageRequest collectionManageRequest = new CollectionManageRequest(1, null, collectionName, null, null, null, null, null, Integer.valueOf(intValue), LiveCoverMinSizeSetting.DEFAULT, null);
        C73454SsE LJJJ = new C192487gy().LIZJ.LJJJIL(collectionManageRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS166S0200000_3.l1;
        C78999UzT.LJFF(LJJJ.LJJJLIIL(new AfS7S1201000_3(intValue, activityC45651qj, collectionName, collectionManageRequest, 1), new AfS53S0100000_1(activityC45651qj, 27)), ((CollectionListFragmentForMineProfile) aqS166S0200000_3.l0).Al());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        String str;
        C200537tx c200537tx;
        Aweme aweme = (Aweme) obj2;
        if (((Boolean) obj).booleanValue()) {
            View containerView = ((VideoDiggAssem) aqS166S0200000_3.l0).getContainerView();
            VideoItemParams gv0 = ((VideoDiggAssem) aqS166S0200000_3.l0).r4().gv0();
            String str2 = null;
            if (gv0 != null) {
                str = gv0.mEventType;
            } else {
                str = null;
            }
            LPX.LIZLLL(containerView, str, "digg");
            VideoDiggVM r4 = ((VideoDiggAssem) aqS166S0200000_3.l0).r4();
            if (r4.LJLLLLLL && (c200537tx = r4.LJZ) != null) {
                C10K.LIZJ(new ACallableS106S0100000_3(c200537tx, 3));
            }
            if (C204147zm.LIZLLL) {
                C202297wn.LIZ(((VideoDiggAssem) aqS166S0200000_3.l0).Y3().findViewById(R.id.c_r));
            } else {
                C202467x4 c202467x4 = (C202467x4) ((VideoDiggAssem) aqS166S0200000_3.l0).Y3().findViewById(R.id.c_r);
                View view = (View) aqS166S0200000_3.l1;
                Boolean bool = (Boolean) c202467x4.getTag(R.id.jzn);
                if (bool == null || !bool.booleanValue()) {
                    if (!c202467x4.isSelected()) {
                        c202467x4.LJII();
                    } else {
                        c202467x4.LJ();
                        c202467x4.setAnimation(C202467x4.LJLL);
                        if (c202467x4.LJLILLLLZI == null) {
                            c202467x4.LJLILLLLZI = new C202427x0(c202467x4);
                        }
                        c202467x4.removeAnimatorListener(c202467x4.LJLILLLLZI);
                        c202467x4.addAnimatorListener(c202467x4.LJLILLLLZI);
                        c202467x4.playAnimation();
                    }
                } else {
                    C202297wn.LIZ(view);
                }
            }
            ((VideoDiggAssem) aqS166S0200000_3.l0).getContext();
            if (C2NU.LIZ.LIZIZ()) {
                if (aweme == null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("handleDiggClick:");
                    LIZ.append(((VideoDiggAssem) aqS166S0200000_3.l0).getContext());
                    LIZ.append(",aweme: null");
                    C36922EeM.LIZLLL(6, "VideoDiggAssem", X1D.LIZIZ(LIZ));
                } else {
                    C2WN LIZ2 = C2WN.LIZ();
                    ImageView imageView = (ImageView) ((VideoDiggAssem) aqS166S0200000_3.l0).Y3().findViewById(R.id.c_r);
                    VideoItemParams gv02 = ((VideoDiggAssem) aqS166S0200000_3.l0).r4().gv0();
                    if (gv02 != null) {
                        str2 = gv02.mEventType;
                    }
                    String LIZIZ = C227768wm.LIZIZ(aweme);
                    String LIZJ = C227768wm.LIZJ(aweme);
                    LIZ2.getClass();
                    C2WN.LIZIZ(imageView, 1, str2, LIZIZ, LIZJ, null);
                    ((VideoDiggAssem) aqS166S0200000_3.l0).r4().pv0(aweme);
                    if (JA9.LIZIZ()) {
                        VideoDiggAssem videoDiggAssem = (VideoDiggAssem) aqS166S0200000_3.l0;
                        C8MP.LIZIZ(videoDiggAssem, "event_digg_click", ((VideoItemParams) C51029K0z.LJIILLIIL(videoDiggAssem)).getAweme());
                    }
                    FFL.LJIIIZ().getClass();
                    FFL.LJIILL(1, "hybrid_test_experiment_string", "default", false);
                }
            }
            C5S1 c5s1 = new C5S1(((VideoDiggAssem) aqS166S0200000_3.l0).getContext());
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            FFL.LJIIIZ().getClass();
            FFL.LJIILL(1, "hybrid_test_experiment_string", "default", false);
        } else {
            C5S1 c5s12 = new C5S1(((VideoDiggAssem) aqS166S0200000_3.l0).getContext());
            c5s12.LIZJ(R.string.txs);
            c5s12.LJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        LandscapeEntrancesControlAbility landscapeEntrancesControlAbility;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj != null) {
            InterfaceC55235Lm3 interfaceC55235Lm3 = ((DanmakuInputFragment) aqS166S0200000_3.l0).LJLJJL;
            if (interfaceC55235Lm3 != null && (landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C55096Ljo.LIZ(interfaceC55235Lm3, LandscapeEntrancesControlAbility.class, null)) != null) {
                landscapeEntrancesControlAbility.Fp0(true);
            }
            ActivityC45651qj mo49getActivity = ((DanmakuInputFragment) aqS166S0200000_3.l0).mo49getActivity();
            if (mo49getActivity != null) {
                LRD.LIZ(mo49getActivity).LJIIJ("input_danmaku", false, null);
            }
            KeyboardUtils.LIZIZ((View) aqS166S0200000_3.l1);
            C72T c72t = ((DanmakuInputFragment) aqS166S0200000_3.l0).LJLJL;
            if (c72t != null) {
                c72t.release();
            }
            ((DanmakuInputFragment) aqS166S0200000_3.l0).dismissAllowingStateLoss();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AqS166S0200000_3 aqS166S0200000_3, Object obj, Object obj2) {
        UIAssem selectSubscribe = (UIAssem) obj;
        C43I it = (C43I) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (((Boolean) it.LIZ).booleanValue()) {
            selectSubscribe.withState(((MixFeedManagerAssem) aqS166S0200000_3.l0).v3(), new AqS134S0200000_3((MixFeedManagerAssem) aqS166S0200000_3.l0, (C73305Spp) aqS166S0200000_3.l1, 97));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS166S0200000_3 aqS166S0200000_3, Object selectSubscribe, Object obj) {
        int i;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        MusicPgcMetaInfoAssem musicPgcMetaInfoAssem = (MusicPgcMetaInfoAssem) aqS166S0200000_3.l0;
        View view = (View) aqS166S0200000_3.l1;
        musicPgcMetaInfoAssem.getClass();
        if (booleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(C195627m2 c195627m2, NowCollectionCellCaptionAssem nowCollectionCellCaptionAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c195627m2;
        this.l1 = nowCollectionCellCaptionAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS166S0200000_3(InterfaceC212848Wy interfaceC212848Wy, InterfaceC212848Wy<C3C8> interfaceC212848Wy2, InterfaceC88473Ynt<C3C8, Object, Object, C76800UCe> interfaceC88473Ynt) {
        super(2);
        this.$t = interfaceC88473Ynt;
        this.l0 = interfaceC212848Wy;
        this.l1 = interfaceC212848Wy2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS166S0200000_3(C8YM c8ym, C8YM<C3C8> c8ym2, InterfaceC88473Ynt<C3C8, Object, Object, C76800UCe> interfaceC88473Ynt) {
        super(2);
        this.$t = interfaceC88473Ynt;
        this.l0 = c8ym;
        this.l1 = c8ym2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(C63044Ooi c63044Ooi, C63044Ooi c63044Ooi2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c63044Ooi;
        this.l1 = c63044Ooi2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(C73305Spp c73305Spp, PoiReviewStatusAssem poiReviewStatusAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiReviewStatusAssem;
        this.l1 = c73305Spp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(Context context, StoryViewerNavBarAssem storyViewerNavBarAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = storyViewerNavBarAssem;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(View view, PoiReviewFloatingActionAssem poiReviewFloatingActionAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = poiReviewFloatingActionAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(View view, AvatarAndNicknamePopup avatarAndNicknamePopup, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = avatarAndNicknamePopup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(View view, StoryViewerListFragment storyViewerListFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = storyViewerListFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(LinearLayout linearLayout, LinearLayout linearLayout2, int i) {
        super(2);
        this.$t = i;
        this.l0 = linearLayout;
        this.l1 = linearLayout2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS166S0200000_3(ReusedUIAssem reusedUIAssem, T t, InterfaceC65350Pko<? extends ReusedAssem<?>> interfaceC65350Pko) {
        super(2);
        this.$t = interfaceC65350Pko;
        this.l0 = reusedUIAssem;
        this.l1 = t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(ChooseCollectionSheetFragment chooseCollectionSheetFragment, ActivityC45651qj activityC45651qj, int i) {
        super(2);
        this.$t = i;
        this.l0 = chooseCollectionSheetFragment;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(CollectionListFragmentForMineProfile collectionListFragmentForMineProfile, ActivityC45651qj activityC45651qj, int i) {
        super(2);
        this.$t = i;
        this.l0 = collectionListFragmentForMineProfile;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(VideoDiggAssem videoDiggAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = videoDiggAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(DanmakuInputFragment danmakuInputFragment, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = danmakuInputFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(MixFeedManagerAssem mixFeedManagerAssem, C73305Spp c73305Spp, int i) {
        super(2);
        this.$t = i;
        this.l0 = mixFeedManagerAssem;
        this.l1 = c73305Spp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(MusicCoverAssem musicCoverAssem, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicCoverAssem;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(MusicPgcMetaInfoAssem musicPgcMetaInfoAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicPgcMetaInfoAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(MusicPgcMetaInfoWithArtistAssem musicPgcMetaInfoWithArtistAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicPgcMetaInfoWithArtistAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(PoiDetailYmalAssemV2 poiDetailYmalAssemV2, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailYmalAssemV2;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(StoryGalleryCoverListAssem storyGalleryCoverListAssem, StoryViewerListHostAbility storyViewerListHostAbility, int i) {
        super(2);
        this.$t = i;
        this.l0 = storyGalleryCoverListAssem;
        this.l1 = storyViewerListHostAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS166S0200000_3(UpvoteEventObservable upvoteEventObservable, UpvoteEventObservable upvoteEventObservable2, C214378bB<C181627Aw, UpvotePublishVM> c214378bB) {
        super(2);
        this.$t = c214378bB;
        this.l0 = upvoteEventObservable;
        this.l1 = upvoteEventObservable2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS166S0200000_3(UpvoteEventObservableFixMemoryLeak upvoteEventObservableFixMemoryLeak, UpvoteEventObservableFixMemoryLeak upvoteEventObservableFixMemoryLeak2, C214378bB<C181627Aw, UpvotePublishVM> c214378bB) {
        super(2);
        this.$t = c214378bB;
        this.l0 = upvoteEventObservableFixMemoryLeak;
        this.l1 = upvoteEventObservableFixMemoryLeak2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS166S0200000_3(AddYoursCollectionCellAssem addYoursCollectionCellAssem, ActivityC45651qj activityC45651qj, int i) {
        super(2);
        this.$t = i;
        this.l0 = addYoursCollectionCellAssem;
        this.l1 = activityC45651qj;
    }
}
