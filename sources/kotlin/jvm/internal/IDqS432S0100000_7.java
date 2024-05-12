package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C163166am;
import X.C188727au;
import X.C220858ld;
import X.C2311295g;
import X.C3CK;
import X.C41051G9f;
import X.C41529GRp;
import X.C41688GXs;
import X.C41700GYe;
import X.C41942Gd8;
import X.C42210GhS;
import X.C42310Gj4;
import X.C42796Gqu;
import X.C42800Gqy;
import X.C42829GrR;
import X.C43045Guv;
import X.C43302Gz4;
import X.C43303Gz5;
import X.C44301Ha5;
import X.C44941HkP;
import X.C46193IAz;
import X.C60903NvH;
import X.C61878OQg;
import X.C72602t6;
import X.C73030SlO;
import X.C76800UCe;
import X.C780334l;
import X.C78613UtF;
import X.C78966Uyw;
import X.C80S;
import X.C83489Wph;
import X.C84654XKg;
import X.C84763XOl;
import X.FMX;
import X.GQ5;
import X.GSR;
import X.I1J;
import X.I91;
import X.IB3;
import X.IBJ;
import X.IC2;
import X.InterfaceC67352kd;
import X.InterfaceC88473Ynt;
import X.MEX;
import X.OSZ;
import X.W0V;
import X.WPZ;
import X.XKX;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.feed.assem.review.VideoReviewStatusVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.OriginalAudioStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.share.qrcode.pkg.QRCodeSharePackage;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes8.dex */
public class IDqS432S0100000_7 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case 12:
                return invoke$12(this, obj, obj2, obj3);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS432S0100000_7(C3CK c3ck, C3CK<? super C163166am> c3ck2) {
        super(3);
        this.$t = c3ck2;
        this.l0 = c3ck;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(C41051G9f c41051G9f, int i) {
        super(3);
        this.$t = i;
        this.l0 = c41051G9f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(C42210GhS c42210GhS, int i) {
        super(3);
        this.$t = i;
        this.l0 = c42210GhS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(C42800Gqy c42800Gqy, int i) {
        super(3);
        this.$t = i;
        this.l0 = c42800Gqy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(C42829GrR c42829GrR, int i) {
        super(3);
        this.$t = i;
        this.l0 = c42829GrR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(I1J i1j, int i) {
        super(3);
        this.$t = i;
        this.l0 = i1j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(I91 i91, int i) {
        super(3);
        this.$t = i;
        this.l0 = i91;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(C46193IAz c46193IAz, int i) {
        super(3);
        this.$t = i;
        this.l0 = c46193IAz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(C84654XKg c84654XKg, int i) {
        super(3);
        this.$t = i;
        this.l0 = c84654XKg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(Activity activity, int i) {
        super(3);
        this.$t = i;
        this.l0 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(VideoReviewStatusVM videoReviewStatusVM, int i) {
        super(3);
        this.$t = i;
        this.l0 = videoReviewStatusVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(QRCodeSharePackage qRCodeSharePackage, int i) {
        super(3);
        this.$t = i;
        this.l0 = qRCodeSharePackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(ShortVideoContext shortVideoContext, int i) {
        super(3);
        this.$t = i;
        this.l0 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS432S0100000_7(W0V w0v, ShortVideoContext shortVideoContext, int i) {
        super(3);
        this.$t = i;
        this.l0 = shortVideoContext;
    }

    public static final Object invoke$0(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        C41051G9f c41051G9f = (C41051G9f) iDqS432S0100000_7.l0;
        VideoPublishEditModel videoPublishEditModel = c41051G9f.LJZ;
        if (videoPublishEditModel != null && booleanValue2 && booleanValue) {
            o.LJII(list, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo?>");
            videoPublishEditModel.tagUserList = (ArrayList) list;
            c41051G9f.LLJILJILJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        Effect effect = (Effect) obj;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        if (effect.getTags() != null) {
            List<String> tags = effect.getTags();
            o.LJI(tags);
            if (tags.contains("strong_beat")) {
                return new C44301Ha5((ShortVideoContext) iDqS432S0100000_7.l0, effect);
            }
        }
        return null;
    }

    public static final Object invoke$10(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        WPZ.LIZIZ.LIZJ("qa_panel_enter", ((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).intValue(), ((I1J) iDqS432S0100000_7.l0).LLILLJJLI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        RecommendHashtag avChallenge = (RecommendHashtag) obj3;
        o.LJIIIZ(avChallenge, "avChallenge");
        ListProtector.remove(((C42829GrR) iDqS432S0100000_7.l0).LJLJLJ, intValue);
        ((C42829GrR) iDqS432S0100000_7.l0).notifyItemRemoved(intValue);
        C43045Guv.LIZLLL(new AqS157S0100000_7((C42829GrR) iDqS432S0100000_7.l0, 675), 300L);
        InterfaceC88473Ynt<Integer, Integer, RecommendHashtag, C76800UCe> interfaceC88473Ynt = ((C42829GrR) iDqS432S0100000_7.l0).LJLL;
        Integer valueOf = Integer.valueOf(intValue);
        Integer valueOf2 = Integer.valueOf(intValue2);
        avChallenge.setLogId(((C42829GrR) iDqS432S0100000_7.l0).LJLLLL);
        interfaceC88473Ynt.invoke(valueOf, valueOf2, avChallenge);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        int intValue = ((Number) obj2).intValue();
        RecommendHashtag avChallenge = (RecommendHashtag) obj3;
        o.LJIIIZ(avChallenge, "avChallenge");
        C42796Gqu c42796Gqu = (C42796Gqu) ((C42800Gqy) iDqS432S0100000_7.l0).LIZIZ;
        GQ5 gq5 = c42796Gqu.LJLJLLL;
        VideoPublishEditModel videoPublishEditModel = gq5.LJIIL;
        if (videoPublishEditModel != null) {
            videoPublishEditModel.creativeModel.commonMobModel.hasClickRecommendHashtag = true;
        }
        c42796Gqu.LJLLLLLL = false;
        GSR gsr = gq5.LIZIZ;
        int selectionStart = gsr.getSelectionStart();
        if (gsr.getText() != null) {
            C41529GRp LIZIZ = C73030SlO.LIZIZ(gsr.getText().toString().substring(0, selectionStart), avChallenge.getChallengeName());
            if (LIZIZ.LIZJ != null) {
                gsr.getText().replace(selectionStart, selectionStart, LIZIZ.LIZJ);
                gsr.LJIJJ(true);
                String trim = LIZIZ.LIZJ.trim();
                if (!C73030SlO.LJFF(trim)) {
                    ((HashSet) gsr.LLFZ).add(trim);
                }
                HashTagMobHelper hashTagMobHelper = c42796Gqu.LLD;
                if (hashTagMobHelper != null) {
                    hashTagMobHelper.iv0(new C42310Gj4(Integer.valueOf(intValue), avChallenge.getChallengeName(), "auto", avChallenge.getCid(), avChallenge.getQueryId(), "recommendation_auto", avChallenge.getLogId()));
                }
                if (!gsr.LJLLI) {
                    gsr.requestFocus();
                    KeyboardUtils.LIZLLL(gsr);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        EffectTemplate effectTemplate = (EffectTemplate) obj2;
        if (effectTemplate != null) {
            C41700GYe.LJIIIZ((C3CK) iDqS432S0100000_7.l0, new C163166am(effectTemplate.getEffectId(), effectTemplate.getUnzipPath(), C2311295g.LIZ()));
        } else {
            C41700GYe.LJIIIZ((C3CK) iDqS432S0100000_7.l0, null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        C78966Uyw.LJJL(new C41688GXs((String) obj, (com.ss.ugc.effectplatform.model.Effect) obj2), (InterfaceC67352kd) iDqS432S0100000_7.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        ((Number) obj3).intValue();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        View view = ((QRCodeSharePackage) iDqS432S0100000_7.l0).qrCodeContainerView;
        if (view != null) {
            return new OSZ(view, layoutParams);
        }
        return null;
    }

    public static final Object invoke$2(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        EffectTemplate effectTemplate = (EffectTemplate) obj2;
        if (effectTemplate != null) {
            ((C42210GhS) iDqS432S0100000_7.l0).LJLJL.setValue(new C163166am(effectTemplate.getEffectId(), effectTemplate.getUnzipPath(), C2311295g.LIZ()));
        }
        ((C42210GhS) iDqS432S0100000_7.l0).LJLLILLLL = true;
        if (C42210GhS.LJJZZIII((C42210GhS) iDqS432S0100000_7.l0, 0, 0, 3, null)) {
            ((C42210GhS) iDqS432S0100000_7.l0).LJJLI();
            ((C42210GhS) iDqS432S0100000_7.l0).LJLJLJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        MusicModel musicModel = (MusicModel) obj2;
        I91 i91 = (I91) iDqS432S0100000_7.l0;
        if (!i91.LJLJLLL && musicModel != null) {
            i91.LJLIIL(musicModel, str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        Effect effect = (Effect) obj;
        List<IB3> preMediaList = (List) obj2;
        List<IB3> curMediaList = (List) obj3;
        o.LJIIIZ(preMediaList, "preMediaList");
        o.LJIIIZ(curMediaList, "curMediaList");
        if (DiyPropParser.LIZ(effect)) {
            if (curMediaList.isEmpty()) {
                DiyPropParser.LJIILIIL(IC2.LIZIZ, effect, new Bitmap[0], null);
            } else {
                int[] LJ = DiyPropParser.LJ(effect);
                AqS189S0100000_7 aqS189S0100000_7 = new AqS189S0100000_7(effect, 72);
                if (curMediaList.isEmpty()) {
                    aqS189S0100000_7.invoke(IBJ.UNKNOWN, C61878OQg.INSTANCE);
                } else {
                    ArrayList arrayList = new ArrayList();
                    aqS189S0100000_7.invoke(IBJ.START, arrayList);
                    XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C44941HkP(curMediaList, LJ, arrayList, aqS189S0100000_7, null), 2);
                }
            }
            ((C46193IAz) iDqS432S0100000_7.l0).LLJI = curMediaList.size();
        } else {
            C83489Wph c83489Wph = new C83489Wph();
            if (C41942Gd8.LIZ() && effect != null) {
                c83489Wph.LIZIZ(effect.getSdkExtra());
            }
            ((C46193IAz) iDqS432S0100000_7.l0).LLJLLIL(preMediaList, curMediaList, c83489Wph);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        String key = (String) obj2;
        IB3 media = (IB3) obj3;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(media, "media");
        if (DiyPropParser.LIZ((Effect) obj)) {
            ((C46193IAz) iDqS432S0100000_7.l0).LLJI = 1;
        } else {
            ((C46193IAz) iDqS432S0100000_7.l0).LLJJL(media, key);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        Effect faceStickerBean = (Effect) obj;
        Handler handler = (Handler) obj2;
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj3;
        o.LJIIIZ(faceStickerBean, "faceStickerBean");
        o.LJIIIZ(handler, "handler");
        o.LJIIIZ(onDismissListener, "onDismissListener");
        return C60903NvH.LJIIJJI().LJIJJ().LIZ(faceStickerBean, onDismissListener, handler, ((C46193IAz) iDqS432S0100000_7.l0).LJLIL);
    }

    public static final Object invoke$7(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        Aweme aweme;
        Object obj4;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        UrlModel urlModel;
        List<String> urlList;
        View view = (View) obj;
        String url = (String) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        VideoItemParams gv0 = ((VideoReviewStatusVM) iDqS432S0100000_7.l0).gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && !C80S.LIZ(aweme)) {
            if (booleanValue) {
                if (url.length() > 0) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "//webview");
                    buildRoute.withParam(UriProtector.parse(url));
                    buildRoute.open();
                }
            } else {
                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
                if (MEX.LJFF() && C220858ld.LJI(aweme)) {
                    if (aweme.isPhotoMode()) {
                        Context context = view.getContext();
                        o.LJIIIIZZ(context, "view.context");
                        C72602t6.LIZ(context, aweme, "photomode_copyrighted", "change_ban_music");
                    } else {
                        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                        if (LJIIIIZZ != null) {
                            IReplaceMusicDownloadService LIZJ = ReplaceMusicDownloadService.LIZJ();
                            String aid = aweme.getAid();
                            o.LJIIIIZZ(aid, "aweme.aid");
                            LIZJ.LIZIZ(LJIIIIZZ, aid, "video_edit_page");
                        }
                    }
                } else if (url.length() > 0) {
                    SmartRoute buildRoute2 = SmartRouter.buildRoute(view.getContext(), "//webview");
                    buildRoute2.withParam(UriProtector.parse(url));
                    buildRoute2.open();
                }
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            c188727au.LJIIIZ("group_id", aweme.getAid());
            Music music = aweme.getMusic();
            if (music == null) {
                obj4 = "";
            } else {
                obj4 = Long.valueOf(music.getId());
            }
            c188727au.LJFF(obj4, "music_id");
            c188727au.LJIIIZ("creation_id", "");
            c188727au.LJIIIZ("shoot_way", "");
            c188727au.LJIIIZ("content_source", "");
            if (booleanValue) {
                str = "violation_detail_page";
            } else {
                str = "replace";
            }
            c188727au.LJIIIZ("action_type", str);
            if (aweme.isPhotoMode()) {
                str2 = "photo_mode";
            } else {
                str2 = "video";
            }
            c188727au.LJIIIZ("replace_music_content_type", str2);
            OriginalAudioStruct originalAudioStruct = aweme.originalAudio;
            if (originalAudioStruct != null && (urlModel = originalAudioStruct.playUrl) != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty())) {
                i = 1;
            } else {
                i = 0;
            }
            c188727au.LIZLLL(i, "video_has_original_sound");
            if (C220858ld.LJI(aweme)) {
                str3 = "copyright";
            } else {
                str3 = "other";
            }
            c188727au.LJIIIZ("mute_reason", str3);
            Video video = aweme.getVideo();
            if (video != null && video.isLongVideo()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("is_long_video", str4);
            FMX.LJIIL("click_music_mute_detail", c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        int intValue = ((Number) obj3).intValue();
        C43303Gz5 c43303Gz5 = new C43303Gz5((Activity) iDqS432S0100000_7.l0, intValue);
        Activity activity = (Activity) iDqS432S0100000_7.l0;
        View findViewById = c43303Gz5.findViewById(R.id.erz);
        o.LJIIIIZZ(findViewById, "shareInviteView.findView…d.invite_card_view_pager)");
        return new OSZ(c43303Gz5, C43302Gz4.LIZ(activity, findViewById, intValue, c43303Gz5.getDesignHeightInPixel()));
    }

    public static final Object invoke$9(IDqS432S0100000_7 iDqS432S0100000_7, Object obj, Object obj2, Object obj3) {
        List<String> tags;
        Effect effect = (Effect) obj;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        if (effect.getTags() != null && (tags = effect.getTags()) != null && tags.contains("strong_beat")) {
            return new C44301Ha5((ShortVideoContext) iDqS432S0100000_7.l0, effect);
        }
        return null;
    }
}
