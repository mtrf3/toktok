package kotlin.jvm.internal;

import X.ARH;
import X.ARI;
import X.ARN;
import X.AbstractC41479GPr;
import X.AbstractC42900Gsa;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C10K;
import X.C145995oB;
import X.C163296az;
import X.C16880lQ;
import X.C188727au;
import X.C1E4;
import X.C41306GJa;
import X.C41425GNp;
import X.C41474GPm;
import X.C41895GcN;
import X.C41896GcO;
import X.C41897GcP;
import X.C42299Git;
import X.C42509GmH;
import X.C42891GsR;
import X.C42898GsY;
import X.C42902Gsc;
import X.C42904Gse;
import X.C43703HDf;
import X.C44087HRz;
import X.C44739Hh9;
import X.C44832Hie;
import X.C45628HvU;
import X.C45804HyK;
import X.C45929I0v;
import X.C46144I9c;
import X.C46147I9f;
import X.C46148I9g;
import X.C46151I9j;
import X.C46159I9r;
import X.C46172IAe;
import X.C47261Igj;
import X.C53258KvG;
import X.C5SL;
import X.C63K;
import X.C74385THh;
import X.C75792yF;
import X.C76800UCe;
import X.C77413UZt;
import X.C78688UuS;
import X.C78857UxB;
import X.C7YU;
import X.C82622Wbi;
import X.C85144XbI;
import X.EnumC42507GmF;
import X.EnumC42934Gt8;
import X.FMX;
import X.GJZ;
import X.GM8;
import X.GTM;
import X.GUX;
import X.GWN;
import X.H9C;
import X.HNX;
import X.HPO;
import X.HPQ;
import X.HQJ;
import X.HQM;
import X.HQS;
import X.HS0;
import X.HS1;
import X.HS8;
import X.HSJ;
import X.HSK;
import X.HSM;
import X.HSQ;
import X.HTK;
import X.HVO;
import X.I11;
import X.I1J;
import X.I9J;
import X.I9O;
import X.I9P;
import X.IAK;
import X.IAL;
import X.ID3;
import X.InterfaceC41450GOo;
import X.InterfaceC42726Gpm;
import X.InterfaceC65784Pro;
import X.InterfaceC81454Vxy;
import X.InterfaceC82086WJm;
import X.InterfaceC82548WaW;
import X.InterfaceC84498XEg;
import X.InterfaceC88472Yns;
import X.JBR;
import X.M78;
import X.ORZ;
import X.Q7K;
import X.Q8U;
import X.SGI;
import X.V16;
import X.X1D;
import Y.ACListenerS42S0200000_7;
import Y.AgS75S0300000_7;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.AnchorRecentlyAddFragment;
import com.ss.android.ugc.aweme.account.login.twostep.Device;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.music.viewmodel.CommerceMusicLegalViewModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.library.LibraryMaterialInfo;
import com.ss.android.ugc.aweme.library.LibraryMaterialProvider;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.services.publish.IAVMentionEditText;
import com.ss.android.ugc.aweme.shortvideo.CheckTitleSensitivityResult;
import com.ss.android.ugc.aweme.shortvideo.PostPrompts;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.topic.book.anchors.BookAnchorContent;
import com.ss.android.ugc.aweme.topic.movie.anchors.MovieAnchorContent;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class AqS111S0300000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public final void invoke$0(C46144I9c $receiver) {
        o.LJIIIZ($receiver, "$this$$receiver");
        $receiver.LIZ = new C46147I9f(0);
        $receiver.LIZIZ = new C46151I9j(C44739Hh9.LJI(true), C44739Hh9.LJII(), Q7K.LIZIZ("record_bitrate_mode", 1), IAL.LIZ());
        I9O i9o = I9O.LJLIL;
        o.LJIIIZ(i9o, "<set-?>");
        $receiver.LJIIJ = i9o;
        o.LJIIIIZZ(C16880lQ.LLLLLILLIL((ActivityC45651qj) this.l0), "activity.applicationContext");
        $receiver.LJ = new C77413UZt();
        I9J i9j = I9J.LJLIL;
        o.LJIIIZ(i9j, "<set-?>");
        $receiver.LJFF = i9j;
        InterfaceC82086WJm interfaceC82086WJm = (InterfaceC82086WJm) this.l1;
        $receiver.LJI = new C46159I9r(new C46148I9g(interfaceC82086WJm));
        $receiver.LJII = true;
        $receiver.LJIIIIZZ = new C46172IAe(interfaceC82086WJm, (ShortVideoContext) this.l2);
        $receiver.LJIIIZ = new IAK((InterfaceC82086WJm) this.l1);
        I9P i9p = I9P.LJLIL;
        o.LJIIIZ(i9p, "<set-?>");
        $receiver.LJIILIIL = i9p;
        $receiver.LJIILLIIL = C44832Hie.LIZ();
    }

    public final void invoke$1(AnchorCommonStruct withAnchor) {
        UrlModel urlModel;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        Context context = ((ViewGroup) this.l0).getContext();
        o.LJIIIIZZ(context, "parent.context");
        HTK LIZ = HS0.LIZ(context);
        HSM hsm = (HSM) this.l1;
        C188727au c188727au = (C188727au) this.l2;
        UrlModel thumbnail = withAnchor.getThumbnail();
        if (thumbnail != null) {
            LIZ.setIcon(thumbnail);
        }
        String keyword = withAnchor.getKeyword();
        if (keyword == null) {
            keyword = "";
        }
        LIZ.setTitle(keyword);
        LIZ.setSubTitle(withAnchor.getDescription());
        C16880lQ.LJJJJZI(LIZ, new ACListenerS42S0200000_7(hsm, c188727au, 17));
        AnchorPanelAction anchorPanelAction = hsm.LJLJLJ;
        if (anchorPanelAction != null) {
            urlModel = anchorPanelAction.getIcon();
        } else {
            urlModel = null;
        }
        LIZ.setButtonIcon(urlModel);
        LIZ.setButtonOnClickListener(new AqS157S0100000_7(hsm, 462));
        ((ViewGroup) this.l0).addView(LIZ);
    }

    public final void invoke$2(AnchorCommonStruct withAnchor) {
        AnchorPanelAction anchorPanelAction;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        Context context = ((ViewGroup) this.l0).getContext();
        o.LJIIIIZZ(context, "parent.context");
        HTK LIZ = HS0.LIZ(context);
        HQJ hqj = (HQJ) this.l1;
        C188727au c188727au = (C188727au) this.l2;
        UrlModel thumbnail = withAnchor.getThumbnail();
        if (thumbnail != null) {
            LIZ.setIcon(thumbnail);
        }
        LIZ.setTitle(hqj.LIZ());
        LIZ.setSubTitle(withAnchor.getDescription());
        C16880lQ.LJJJJZI(LIZ, new ACListenerS42S0200000_7(hqj, c188727au, 18));
        List<AnchorPanelAction> actions = withAnchor.getActions();
        UrlModel urlModel = null;
        if (actions != null) {
            Iterator<AnchorPanelAction> it = actions.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorPanelAction = it.next();
                    if (anchorPanelAction.getActionType() == 1) {
                        break;
                    }
                } else {
                    anchorPanelAction = null;
                    break;
                }
            }
            AnchorPanelAction anchorPanelAction2 = anchorPanelAction;
            if (anchorPanelAction2 != null) {
                urlModel = anchorPanelAction2.getIcon();
            }
        }
        LIZ.setButtonIcon(urlModel);
        LIZ.setButtonOnClickListener(new AqS154S0200000_7(hqj, c188727au, 71));
        ((ViewGroup) this.l0).addView(LIZ);
    }

    public final void invoke$3(AnchorCommonStruct withAnchor) {
        UrlModel urlModel;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        String keyword = withAnchor.getKeyword();
        Context context = ((ViewGroup) this.l0).getContext();
        o.LJIIIIZZ(context, "parent.context");
        HTK LIZ = HS0.LIZ(context);
        HSQ hsq = (HSQ) this.l1;
        C188727au c188727au = (C188727au) this.l2;
        if (o.LJ(hsq.LJLL, "template")) {
            UrlModel urlModel2 = new UrlModel();
            urlModel2.setUri("20px_anchor_template3x.png");
            urlModel2.setUrlList(C47261Igj.LJJIJ("https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png"));
            LIZ.setIcon(urlModel2);
        } else {
            UrlModel thumbnail = withAnchor.getThumbnail();
            if (thumbnail != null) {
                LIZ.setIcon(thumbnail);
            }
        }
        if (keyword == null) {
            keyword = "";
        }
        LIZ.setTitle(keyword);
        LIZ.setSubTitle(withAnchor.getDescription());
        C16880lQ.LJJJJZI(LIZ, new ACListenerS42S0200000_7(hsq, c188727au, 19));
        AnchorPanelAction anchorPanelAction = hsq.LJLLI;
        if (anchorPanelAction != null) {
            urlModel = anchorPanelAction.getIcon();
        } else {
            urlModel = null;
        }
        LIZ.setButtonIcon(urlModel);
        LIZ.setButtonOnClickListener(new AqS154S0200000_7(hsq, c188727au, 72));
        ((ViewGroup) this.l0).addView(LIZ);
    }

    public final void invoke$4(AnchorCommonStruct withAnchor) {
        AnchorPanelAction anchorPanelAction;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        Context context = ((ViewGroup) this.l0).getContext();
        o.LJIIIIZZ(context, "parent.context");
        HTK LIZ = HS0.LIZ(context);
        HQS hqs = (HQS) this.l1;
        C188727au c188727au = (C188727au) this.l2;
        UrlModel thumbnail = withAnchor.getThumbnail();
        if (thumbnail != null) {
            LIZ.setIcon(thumbnail);
        }
        LIZ.setTitle(hqs.LIZ());
        LIZ.setSubTitle(withAnchor.getDescription());
        C16880lQ.LJJJJZI(LIZ, new ACListenerS42S0200000_7(hqs, c188727au, 20));
        List<AnchorPanelAction> actions = withAnchor.getActions();
        UrlModel urlModel = null;
        if (actions != null) {
            Iterator<AnchorPanelAction> it = actions.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorPanelAction = it.next();
                    if (anchorPanelAction.getActionType() == 1) {
                        break;
                    }
                } else {
                    anchorPanelAction = null;
                    break;
                }
            }
            AnchorPanelAction anchorPanelAction2 = anchorPanelAction;
            if (anchorPanelAction2 != null) {
                urlModel = anchorPanelAction2.getIcon();
            }
        }
        LIZ.setButtonIcon(urlModel);
        LIZ.setButtonOnClickListener(new AqS154S0200000_7(hqs, c188727au, 73));
        ((ViewGroup) this.l0).addView(LIZ);
    }

    public final void invoke$5(AnchorCommonStruct withAnchor) {
        UrlModel urlModel;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        Context context = ((ViewGroup) this.l0).getContext();
        o.LJIIIIZZ(context, "parent.context");
        HTK LIZ = HS0.LIZ(context);
        HSK hsk = (HSK) this.l1;
        C188727au c188727au = (C188727au) this.l2;
        UrlModel thumbnail = withAnchor.getThumbnail();
        if (thumbnail != null) {
            LIZ.setIcon(thumbnail);
        }
        LIZ.setTitle(hsk.LIZ());
        LIZ.setSubTitle(withAnchor.getDescription());
        C16880lQ.LJJJJZI(LIZ, new ACListenerS42S0200000_7(hsk, c188727au, 21));
        AnchorPanelAction anchorPanelAction = hsk.LJLJLJ;
        if (anchorPanelAction != null) {
            urlModel = anchorPanelAction.getIcon();
        } else {
            urlModel = null;
        }
        LIZ.setButtonIcon(urlModel);
        LIZ.setButtonOnClickListener(new AqS157S0100000_7(hsk, c188727au, 464));
        ((ViewGroup) this.l0).addView(LIZ);
    }

    public final void invoke$6(AnchorCommonStruct withAnchor) {
        AnchorPanelAction anchorPanelAction;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        Context context = ((ViewGroup) this.l0).getContext();
        o.LJIIIIZZ(context, "parent.context");
        HTK LIZ = HS0.LIZ(context);
        HS8 hs8 = (HS8) this.l1;
        C188727au c188727au = (C188727au) this.l2;
        LIZ.setIcon(hs8.LJJJJJ().getThumbnail());
        LIZ.setTitle(hs8.LJJJJJ().getPopUpTitle());
        LIZ.setSubTitle(hs8.LJJJJJ().getPopUpDescription());
        C16880lQ.LJJJJZI(LIZ, new ACListenerS42S0200000_7(hs8, c188727au, 22));
        List<AnchorPanelAction> actions = withAnchor.getActions();
        UrlModel urlModel = null;
        if (actions != null) {
            Iterator<AnchorPanelAction> it = actions.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorPanelAction = it.next();
                    if (anchorPanelAction.getActionType() == 1) {
                        break;
                    }
                } else {
                    anchorPanelAction = null;
                    break;
                }
            }
            AnchorPanelAction anchorPanelAction2 = anchorPanelAction;
            if (anchorPanelAction2 != null) {
                urlModel = anchorPanelAction2.getIcon();
            }
        }
        LIZ.setButtonIcon(urlModel);
        LIZ.setButtonOnClickListener(new AqS154S0200000_7(hs8, c188727au, 74));
        ((ViewGroup) this.l0).addView(LIZ);
    }

    public final void invoke$7(AnchorCommonStruct withAnchor) {
        String materialName;
        String str;
        AnchorPanelAction anchorPanelAction;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        LibraryMaterialInfo LJJJJJ = ((C44087HRz) this.l0).LJJJJJ();
        if (!C78857UxB.LJJJIL(LJJJJJ.getMaterialName())) {
            materialName = ((C44087HRz) this.l0).LJJI().getString(R.string.hrp);
        } else {
            materialName = LJJJJJ.getMaterialName();
            if (materialName == null) {
                materialName = ((C44087HRz) this.l0).LJJI().getString(R.string.hrp);
                o.LJIIIIZZ(materialName, "activity().getString(R.s…ge_tag_clip_from_library)");
            }
        }
        o.LJIIIIZZ(materialName, "if (!data.materialName.i…om_library)\n            }");
        if (LJJJJJ.getMaterialProvider() == LibraryMaterialProvider.GIPHY) {
            if (TextUtils.isEmpty(LJJJJJ.getAuthor())) {
                str = ((C44087HRz) this.l0).LJJI().getString(R.string.hr2);
            } else {
                String format = ((C44087HRz) this.l0).LJJI().getString(R.string.hr1);
                o.LJIIIIZZ(format, "format");
                str = Q8U.LIZIZ(new Object[]{LJJJJJ.getAuthor()}, 1, format, "format(format, *args)");
            }
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "if (data.materialProvide…         \"\"\n            }");
        Context context = ((ViewGroup) this.l1).getContext();
        o.LJIIIIZZ(context, "parent.context");
        HTK LIZ = HS0.LIZ(context);
        C44087HRz c44087HRz = (C44087HRz) this.l0;
        C188727au c188727au = (C188727au) this.l2;
        String preview = LJJJJJ.getPreview();
        if (preview != null) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(C47261Igj.LJII(preview));
            urlModel.setUri(Uri.decode(preview));
            LIZ.setIcon(urlModel);
        }
        LIZ.setTitle(materialName);
        LIZ.setSubTitle(str);
        C16880lQ.LJJJJZI(LIZ, new ACListenerS42S0200000_7(c44087HRz, c188727au, 23));
        List<AnchorPanelAction> actions = withAnchor.getActions();
        UrlModel urlModel2 = null;
        if (actions != null) {
            Iterator<AnchorPanelAction> it = actions.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorPanelAction = it.next();
                    if (anchorPanelAction.getActionType() == 1) {
                        break;
                    }
                } else {
                    anchorPanelAction = null;
                    break;
                }
            }
            AnchorPanelAction anchorPanelAction2 = anchorPanelAction;
            if (anchorPanelAction2 != null) {
                urlModel2 = anchorPanelAction2.getIcon();
            }
        }
        LIZ.setButtonIcon(urlModel2);
        LIZ.setButtonOnClickListener(new AqS157S0100000_7(c44087HRz, c188727au, 466));
        ((ViewGroup) this.l1).addView(LIZ);
    }

    public final void invoke$8(AnchorCommonStruct withAnchor) {
        AnchorPanelAction anchorPanelAction;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        Context context = ((ViewGroup) this.l0).getContext();
        o.LJIIIIZZ(context, "parent.context");
        HTK LIZ = HS0.LIZ(context);
        HQM hqm = (HQM) this.l1;
        C188727au c188727au = (C188727au) this.l2;
        UrlModel thumbnail = withAnchor.getThumbnail();
        if (thumbnail != null) {
            LIZ.setIcon(thumbnail);
        }
        LIZ.setTitle(hqm.LIZ());
        LIZ.setSubTitle(withAnchor.getDescription());
        C16880lQ.LJJJJZI(LIZ, new ACListenerS42S0200000_7(hqm, c188727au, 24));
        List<AnchorPanelAction> actions = withAnchor.getActions();
        UrlModel urlModel = null;
        if (actions != null) {
            Iterator<AnchorPanelAction> it = actions.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorPanelAction = it.next();
                    if (anchorPanelAction.getActionType() == 1) {
                        break;
                    }
                } else {
                    anchorPanelAction = null;
                    break;
                }
            }
            AnchorPanelAction anchorPanelAction2 = anchorPanelAction;
            if (anchorPanelAction2 != null) {
                urlModel = anchorPanelAction2.getIcon();
            }
        }
        LIZ.setButtonIcon(urlModel);
        LIZ.setButtonOnClickListener(new AqS154S0200000_7(hqm, c188727au, 76));
        ((ViewGroup) this.l0).addView(LIZ);
    }

    public final void invoke$9(AnchorCommonStruct withAnchor) {
        UrlModel urlModel;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        Context context = ((ViewGroup) this.l0).getContext();
        o.LJIIIIZZ(context, "parent.context");
        HTK LIZ = HS0.LIZ(context);
        HSJ hsj = (HSJ) this.l1;
        C188727au c188727au = (C188727au) this.l2;
        UrlModel thumbnail = withAnchor.getThumbnail();
        if (thumbnail != null) {
            LIZ.setIcon(thumbnail);
        }
        LIZ.setTitle(hsj.LIZ());
        LIZ.setSubTitle(withAnchor.getDescription());
        C16880lQ.LJJJJZI(LIZ, new ACListenerS42S0200000_7(hsj, c188727au, 25));
        AnchorPanelAction anchorPanelAction = hsj.LJLJLJ;
        if (anchorPanelAction != null) {
            urlModel = anchorPanelAction.getIcon();
        } else {
            urlModel = null;
        }
        LIZ.setButtonIcon(urlModel);
        LIZ.setButtonOnClickListener(new AqS157S0100000_7(hsj, c188727au, 467));
        ((ViewGroup) this.l0).addView(LIZ);
    }

    public static final Object invoke$0(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        InterfaceC84498XEg createMvEffectPlatform;
        InterfaceC82548WaW templateData = (InterfaceC82548WaW) obj;
        o.LJIIIZ(templateData, "templateData");
        if (templateData instanceof MvThemeData) {
            EffectService companion = EffectService.Companion.getInstance();
            if (companion != null && (createMvEffectPlatform = companion.createMvEffectPlatform((Context) aqS111S0300000_7.l0)) != null) {
                createMvEffectPlatform.LIZLLL(templateData.LIZIZ(), null, new HPO(templateData, (StickerDownloadConfig) aqS111S0300000_7.l1, (HPQ) aqS111S0300000_7.l2, (Context) aqS111S0300000_7.l0));
            }
        } else {
            InterfaceC65784Pro<C76800UCe> onSuccess = ((StickerDownloadConfig) aqS111S0300000_7.l1).getOnSuccess();
            if (onSuccess != null) {
                onSuccess.invoke();
            }
            ((HPQ) aqS111S0300000_7.l2).LJFF(C45804HyK.LJIJJ((Context) aqS111S0300000_7.l0), templateData);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.c42, new AqS138S0200000_7((Context) aqS111S0300000_7.l0, (Context) aqS111S0300000_7.l1, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 3));
        actionGroup.LJIIIIZZ(R.string.c3z, new AqS138S0200000_7((CommerceToolsTcmModel) aqS111S0300000_7.l2, (CommerceToolsTcmModel) aqS111S0300000_7.l1, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 4));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS111S0300000_7 aqS111S0300000_7, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        GTM.LJI((ActivityC45651qj) aqS111S0300000_7.l0, (C41474GPm) aqS111S0300000_7.l1, true);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("enter_from", "homepage_hot");
        c145995oB.LIZLLL("action_type", "1");
        ShoutOutsData shoutOutsData = ((AwemeDraft) aqS111S0300000_7.l2).LJJJJI.shoutOutsData;
        if (shoutOutsData != null && o.LJ(shoutOutsData.getShoutOutsMode(), ShoutOutsData.MODE_SEND)) {
            ShoutOutsData shoutOutsData2 = ((AwemeDraft) aqS111S0300000_7.l2).LJJJJI.shoutOutsData;
            String str2 = null;
            if (shoutOutsData2 != null) {
                str = shoutOutsData2.getOrderId();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                ShoutOutsData shoutOutsData3 = ((AwemeDraft) aqS111S0300000_7.l2).LJJJJI.shoutOutsData;
                if (shoutOutsData3 != null) {
                    str2 = shoutOutsData3.getOrderId();
                }
                c145995oB.LIZLLL("order_id", str2);
            }
        }
        FMX.LJIIL("upload_failed_pop_up_response", c145995oB.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.q63, new AqS111S0300000_7((ActivityC45651qj) aqS111S0300000_7.l0, (C41474GPm) aqS111S0300000_7.l1, (AwemeDraft) aqS111S0300000_7.l2, 10));
        actionGroup.LJIIIIZZ(R.string.cg_, new AqS173S0100000_7((AwemeDraft) aqS111S0300000_7.l2, 161));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS111S0300000_7 aqS111S0300000_7, Object it) {
        o.LJIIIZ(it, "it");
        C85144XbI.LIZJ("confirm", "device_remove", ((GJZ) aqS111S0300000_7.l0).LJLILLLLZI.getEnterFrom());
        if (((Device) aqS111S0300000_7.l1).getDevice_id() != null) {
            ((GJZ) aqS111S0300000_7.l0).LJLILLLLZI.LJII();
            TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.LIZ;
            String del_did = ((Device) aqS111S0300000_7.l1).getDevice_id().toString();
            twoStepAuthApi.getClass();
            o.LJIIIZ(del_did, "del_did");
            TwoStepAuthApi.LIZIZ().removeAuthDevice(del_did).LJ(new AgS75S0300000_7((GJZ) aqS111S0300000_7.l0, (Device) aqS111S0300000_7.l1, (C41306GJa) aqS111S0300000_7.l2, 1), C10K.LJIIIIZZ, null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.s7, new AqS111S0300000_7((C41306GJa) aqS111S0300000_7.l2, (GJZ) aqS111S0300000_7.l0, (Device) aqS111S0300000_7.l1, 12));
        actionGroup.LJIIIIZZ(R.string.rmt, null);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        aqS111S0300000_7.invoke$1((AnchorCommonStruct) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        aqS111S0300000_7.invoke$2((AnchorCommonStruct) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        aqS111S0300000_7.invoke$3((AnchorCommonStruct) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        aqS111S0300000_7.invoke$4((AnchorCommonStruct) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        aqS111S0300000_7.invoke$5((AnchorCommonStruct) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        aqS111S0300000_7.invoke$6((AnchorCommonStruct) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        aqS111S0300000_7.invoke$0((C46144I9c) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        AnchorPanelAction anchorPanelAction;
        AnchorCommonStruct withAnchor = (AnchorCommonStruct) obj;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        Context context = ((ViewGroup) aqS111S0300000_7.l0).getContext();
        o.LJIIIIZZ(context, "parent.context");
        HTK LIZ = HS0.LIZ(context);
        HS1 hs1 = (HS1) aqS111S0300000_7.l1;
        C188727au c188727au = (C188727au) aqS111S0300000_7.l2;
        UrlModel thumbnail = withAnchor.getThumbnail();
        if (thumbnail != null) {
            LIZ.setIcon(thumbnail);
        }
        String keyword = withAnchor.getKeyword();
        if (keyword == null) {
            keyword = "";
        }
        LIZ.setTitle(keyword);
        LIZ.setSubTitle(withAnchor.getDescription());
        List<AnchorPanelAction> actions = withAnchor.getActions();
        if (actions != null && (anchorPanelAction = (AnchorPanelAction) ORZ.LJLLLL(actions)) != null) {
            LIZ.setButtonIcon(anchorPanelAction.getIcon());
            LIZ.setButtonOnClickListener(new AqS154S0200000_7(hs1, c188727au, 75));
        }
        ((ViewGroup) aqS111S0300000_7.l0).addView(LIZ);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        aqS111S0300000_7.invoke$7((AnchorCommonStruct) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        aqS111S0300000_7.invoke$8((AnchorCommonStruct) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        aqS111S0300000_7.invoke$9((AnchorCommonStruct) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        GUX invokeCallback = (GUX) obj;
        o.LJIIIZ(invokeCallback, "$this$invokeCallback");
        invokeCallback.onFinish((AbstractC41479GPr) aqS111S0300000_7.l0, aqS111S0300000_7.l1, (PublishModel) aqS111S0300000_7.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            ((InterfaceC88472Yns) aqS111S0300000_7.l0).invoke(Boolean.FALSE);
        } else {
            File file = new File(((C41897GcP) aqS111S0300000_7.l1).LIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(file.getParentFile().getName());
            LIZ.append('_');
            LIZ.append(file.getName());
            String LIZIZ = X1D.LIZIZ(LIZ);
            C163296az c163296az = (C163296az) ((C41896GcO) aqS111S0300000_7.l2).LIZLLL.getValue();
            c163296az.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(c163296az.LIZ);
            File file2 = new File(JBR.LJFF(LIZ2, File.separator, LIZIZ, LIZ2));
            boolean LJFF = C42299Git.LJFF(bitmap, file2, 100, Bitmap.CompressFormat.PNG);
            C42299Git.LJ(bitmap);
            if (LJFF) {
                C1E4.LJJIIZI(((C41896GcO) aqS111S0300000_7.l2).LIZ, file2.getPath());
            }
            ((InterfaceC88472Yns) aqS111S0300000_7.l0).invoke(Boolean.valueOf(LJFF));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        String postAnyway;
        String goBack;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        PostPrompts postPrompts = ((CheckTitleSensitivityResult) aqS111S0300000_7.l0).getPostPrompts();
        if (postPrompts != null && (goBack = postPrompts.getGoBack()) != null) {
            actionGroup.LJII(goBack, new AqS172S0100000_6((InterfaceC65784Pro) aqS111S0300000_7.l1, (InterfaceC65784Pro<C76800UCe>) 82));
        }
        PostPrompts postPrompts2 = ((CheckTitleSensitivityResult) aqS111S0300000_7.l0).getPostPrompts();
        if (postPrompts2 != null && (postAnyway = postPrompts2.getPostAnyway()) != null) {
            actionGroup.LJIIIZ(postAnyway, new AqS172S0100000_6((InterfaceC65784Pro) aqS111S0300000_7.l2, (InterfaceC65784Pro<C76800UCe>) 83));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = C78688UuS.LJJIII((C45929I0v) aqS111S0300000_7.l0).getString(R.string.pn6);
        o.LJIIIIZZ(string, "context.getString(R.stri…acecomment_modal_button1)");
        actionGroup.LJII(string, new AqS31S0301000_7((C63K) aqS111S0300000_7.l1, actionGroup, (C45929I0v) aqS111S0300000_7.l0, (CommentVideoModel) aqS111S0300000_7.l2, 2, 1));
        String string2 = C78688UuS.LJJIII((C45929I0v) aqS111S0300000_7.l0).getString(R.string.pn7);
        o.LJIIIIZZ(string2, "context.getString(R.stri…acecomment_modal_button2)");
        C63K c63k = (C63K) aqS111S0300000_7.l1;
        actionGroup.LJIIIZ(string2, new AqS31S0301000_7(2, (CommentVideoModel) aqS111S0300000_7.l2, (C45929I0v) aqS111S0300000_7.l0, c63k, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = C78688UuS.LJJIII((C45929I0v) aqS111S0300000_7.l0).getString(R.string.pn6);
        o.LJIIIIZZ(string, "context.getString(R.stri…acecomment_modal_button1)");
        actionGroup.LJII(string, new AqS106S0300000_2((C63K) aqS111S0300000_7.l1, actionGroup, (C45929I0v) aqS111S0300000_7.l0, (QaStruct) aqS111S0300000_7.l2, 11));
        String string2 = C78688UuS.LJJIII((C45929I0v) aqS111S0300000_7.l0).getString(R.string.pn7);
        o.LJIIIIZZ(string2, "context.getString(R.stri…acecomment_modal_button2)");
        actionGroup.LJIIIZ(string2, I11.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Context) aqS111S0300000_7.l0).getString(R.string.dmn);
        o.LJIIIIZZ(string, "context.getString(R.stri…rce_anchor_dialog_delete)");
        actionGroup.LJII(string, new AqS138S0200000_7((AnchorRecentlyAddFragment) aqS111S0300000_7.l1, (InterfaceC42726Gpm) aqS111S0300000_7.l2, 80));
        String string2 = ((Context) aqS111S0300000_7.l0).getString(R.string.dmm);
        o.LJIIIIZZ(string2, "context.getString(R.stri…rce_anchor_dialog_cancel)");
        actionGroup.LJIIIZ(string2, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS111S0300000_7 aqS111S0300000_7, Object it) {
        o.LJIIIZ(it, "it");
        C43703HDf c43703HDf = (C43703HDf) aqS111S0300000_7.l0;
        ShareKitPanel shareKitPanel = (ShareKitPanel) aqS111S0300000_7.l1;
        c43703HDf.getClass();
        C43703HDf.LIZJ(true, shareKitPanel);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS111S0300000_7.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ArrayList arrayList;
        Integer num;
        String title;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        List<AnchorTransData> value = ((C42898GsY) aqS111S0300000_7.l0).LJ().getExtensionDataRepo().getUpdateAnchors().getValue();
        if (value instanceof ArrayList) {
            arrayList = (ArrayList) value;
        } else {
            arrayList = null;
        }
        if (C53258KvG.LIZIZ()) {
            ((C42898GsY) aqS111S0300000_7.l0).LJLZ.LIZLLL(1);
            if (arrayList != null) {
                arrayList.clear();
                ((C42898GsY) aqS111S0300000_7.l0).LJIILJJIL((List) aqS111S0300000_7.l2, arrayList);
            }
        } else if (arrayList != null) {
            arrayList.remove((AnchorTransData) aqS111S0300000_7.l1);
            ((C42898GsY) aqS111S0300000_7.l0).LJIILJJIL((List) aqS111S0300000_7.l2, arrayList);
        }
        ((C42898GsY) aqS111S0300000_7.l0).LJ().getExtensionDataRepo().getUpdateAnchors().setValue(arrayList);
        if (((AnchorTransData) aqS111S0300000_7.l1).getBusinessType() == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE() || ((AnchorTransData) aqS111S0300000_7.l1).getBusinessType() == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE()) {
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    AnchorTransData anchorTransData = (AnchorTransData) next;
                    if (anchorTransData.getBusinessType() == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE()) {
                        arrayList2.add(next);
                    }
                }
                num = Integer.valueOf(arrayList2.size());
            } else {
                num = null;
            }
            AbstractC42900Gsa abstractC42900Gsa = ((C42898GsY) aqS111S0300000_7.l0).LJLILLLLZI;
            if (abstractC42900Gsa != null) {
                if (abstractC42900Gsa.getVisibility() == 0 && num != null && num.intValue() == 0) {
                    View view = ((C42898GsY) aqS111S0300000_7.l0).LJLJJL;
                    if (view != null) {
                        KeyEvent.Callback findViewById = view.findViewById(R.id.cqu);
                        o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.publish.IAVMentionEditText");
                        ((IAVMentionEditText) findViewById).removeHashTag();
                    } else {
                        o.LJIJI("view");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("delegate");
                throw null;
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "video_publish_page");
        c188727au.LJIIIZ("shoot_way", ((C42898GsY) aqS111S0300000_7.l0).LJ().getMobParam().getShootWay());
        c188727au.LJIIIZ("creation_id", ((C42898GsY) aqS111S0300000_7.l0).LJ().getMobParam().getCreationId());
        c188727au.LIZLLL(((AnchorTransData) aqS111S0300000_7.l1).getBusinessType(), "business_type");
        if (((AnchorTransData) aqS111S0300000_7.l1).getBusinessType() == EnumC42934Gt8.LEMON8_GENERAL_ANCHOR.getTYPE()) {
            title = "Lemon8 | app";
        } else {
            title = ((AnchorTransData) aqS111S0300000_7.l1).getTitle();
        }
        c188727au.LJIIIZ("anchor_name", title);
        c188727au.LJIIIZ("anchor_type", C42891GsR.LIZ(((AnchorTransData) aqS111S0300000_7.l1).getBusinessType()));
        AnchorTransData anchorTransData2 = (AnchorTransData) aqS111S0300000_7.l1;
        if (anchorTransData2.getBusinessType() == EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE()) {
            String anchorContentJsonStr = anchorTransData2.getAnchorContent();
            o.LJIIIZ(anchorContentJsonStr, "anchorContentJsonStr");
            BookAnchorContent bookAnchorContent = (BookAnchorContent) C75792yF.LIZ(anchorContentJsonStr, BookAnchorContent.class);
            c188727au.LJI("book_id", bookAnchorContent.bookId);
            c188727au.LJI("book_title", bookAnchorContent.bookName);
        } else if (anchorTransData2.getBusinessType() == EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE()) {
            String anchorContentJsonStr2 = anchorTransData2.getAnchorContent();
            o.LJIIIZ(anchorContentJsonStr2, "anchorContentJsonStr");
            MovieAnchorContent movieAnchorContent = (MovieAnchorContent) C75792yF.LIZ(anchorContentJsonStr2, MovieAnchorContent.class);
            c188727au.LJI("movie_id", movieAnchorContent.id);
            c188727au.LJI("movie_title", movieAnchorContent.title);
        }
        FMX.LJIIL("delete_label", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(String.valueOf(((CopyWritingInfo) aqS111S0300000_7.l0).getCheckSettings()), new AqS138S0200000_7((Activity) aqS111S0300000_7.l1, (M78) aqS111S0300000_7.l2, 86));
        actionGroup.LJII(String.valueOf(((CopyWritingInfo) aqS111S0300000_7.l0).getConfirm()), new AqS138S0200000_7((Activity) aqS111S0300000_7.l1, (M78) aqS111S0300000_7.l2, 87));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        String confirm = ((CopyWritingInfo) aqS111S0300000_7.l0).getConfirm();
        String str = "";
        if (confirm == null) {
            confirm = "";
        }
        buttonGroup.LJFF(confirm, new AqS173S0100000_7((M78) aqS111S0300000_7.l1, 336));
        String checkSettings = ((CopyWritingInfo) aqS111S0300000_7.l0).getCheckSettings();
        if (checkSettings != null) {
            str = checkSettings;
        }
        buttonGroup.LJII(str, new AqS138S0200000_7((Activity) aqS111S0300000_7.l2, (M78) aqS111S0300000_7.l1, 88));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.ig, new AqS138S0200000_7((CommerceMusicLegalViewModel) aqS111S0300000_7.l0, (CommerceMusicLegalViewModel) aqS111S0300000_7.l1, (InterfaceC65784Pro<C76800UCe>) 93));
        actionGroup.LJIIIIZZ(R.string.ie, new AqS167S0100000_1((InterfaceC65784Pro) aqS111S0300000_7.l2, (InterfaceC65784Pro<C76800UCe>) 412));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        Music music;
        boolean z;
        MusicShareStoryInputData musicShareStory = (MusicShareStoryInputData) obj;
        o.LJIIIZ(musicShareStory, "$this$musicShareStory");
        musicShareStory.setCoverUrl((UrlModel) aqS111S0300000_7.l0);
        musicShareStory.setMusic((MusicModel) aqS111S0300000_7.l1);
        MusicShootAssem musicShootAssem = (MusicShootAssem) aqS111S0300000_7.l2;
        MusicDetail musicDetail = musicShootAssem.LLII;
        if (musicDetail != null && (music = musicDetail.music) != null) {
            Context context = musicShootAssem.getContext();
            if (context != null) {
                String ownerId = music.getOwnerId();
                if (ownerId == null || ownerId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                musicShareStory.setSongName(C7YU.LIZ(music, context, !z, music.isOriginMusic()));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Context) aqS111S0300000_7.l0).getString(R.string.eyu);
        o.LJIIIIZZ(string, "context.getString(string.draft_delete_discard)");
        actionGroup.LJFF(string, new AqS138S0200000_7((DraftFragment) aqS111S0300000_7.l1, (C41425GNp) aqS111S0300000_7.l2, 94));
        String string2 = ((Context) aqS111S0300000_7.l0).getString(R.string.eyv);
        o.LJIIIIZZ(string2, "context.getString(string.draft_delete_keep)");
        actionGroup.LJIIIZ(string2, GM8.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = C78688UuS.LJJIII((I1J) aqS111S0300000_7.l0).getString(R.string.pn6);
        o.LJIIIIZZ(string, "context.getString(R.stri…acecomment_modal_button1)");
        actionGroup.LJII(string, new AqS31S0301000_7(4, (CommentVideoModel) aqS111S0300000_7.l2, (InterfaceC81454Vxy) aqS111S0300000_7.l1, (I1J) aqS111S0300000_7.l0, 3));
        String string2 = C78688UuS.LJJIII((I1J) aqS111S0300000_7.l0).getString(R.string.pn7);
        o.LJIIIIZZ(string2, "context.getString(R.stri…acecomment_modal_button2)");
        actionGroup.LJIIIZ(string2, new AqS95S0101000_7((InterfaceC81454Vxy) aqS111S0300000_7.l1, 4, 21));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$37(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ((Boolean) obj).booleanValue();
        ((GWN) aqS111S0300000_7.l0).LJIILL((Activity) aqS111S0300000_7.l1, (InterfaceC65784Pro) aqS111S0300000_7.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        AqS154S0200000_7 aqS154S0200000_7;
        ID3 $receiver = (ID3) obj;
        o.LJIIIZ($receiver, "$this$$receiver");
        C74385THh c74385THh = (C74385THh) ((InterfaceC65784Pro) aqS111S0300000_7.l0).invoke();
        o.LJIIIZ(c74385THh, "<set-?>");
        $receiver.LJFF = c74385THh;
        $receiver.LIZLLL = C5SL.LIZ;
        $receiver.LIZJ = HNX.LJLIL;
        $receiver.LJ = SGI.LJLIL;
        if (V16.LJJIJLIJ((ShortVideoContext) ((C82622Wbi) aqS111S0300000_7.l1).LJIIIIZZ(null, ShortVideoContext.class))) {
            aqS154S0200000_7 = new AqS154S0200000_7((C82622Wbi) aqS111S0300000_7.l1, $receiver, 142);
        } else {
            aqS154S0200000_7 = new AqS154S0200000_7((C82622Wbi) aqS111S0300000_7.l1, $receiver, 143);
        }
        $receiver.LJI = aqS154S0200000_7;
        $receiver.LJIIIZ = true;
        $receiver.LJIIL = true;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS111S0300000_7.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke($receiver);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARN eventArgs = (ARN) obj;
        o.LJIIIZ(eventArgs, "eventArgs");
        new H9C().LJIIJ((Mission) aqS111S0300000_7.l0, o.LJ(((LiveData) ((C42509GmH) aqS111S0300000_7.l1).LJ.getValue()).getValue(), Boolean.TRUE), EnumC42507GmF.CANCEL);
        eventArgs.LIZ().LIZIZ(null);
        ((InterfaceC41450GOo) aqS111S0300000_7.l2).LIZJ();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f2, code lost:
    
        if (r1.showEditorPro == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AqS111S0300000_7 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS111S0300000_7.invoke$4(kotlin.jvm.internal.AqS111S0300000_7, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Activity) aqS111S0300000_7.l0).getString(R.string.cpu);
        o.LJIIIIZZ(string, "activity.getString(R.str…isibility_confirm_button)");
        actionGroup.LJII(string, new AqS173S0100000_7((InterfaceC65784Pro) aqS111S0300000_7.l1, (InterfaceC65784Pro<C76800UCe>) 143));
        String string2 = ((Activity) aqS111S0300000_7.l0).getString(R.string.cpt);
        o.LJIIIIZZ(string2, "activity.getString(R.str…visibility_change_button)");
        actionGroup.LJII(string2, new AqS173S0100000_7((InterfaceC65784Pro) aqS111S0300000_7.l2, (InterfaceC65784Pro<C76800UCe>) 144));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS111S0300000_7 aqS111S0300000_7, Object it) {
        o.LJIIIZ(it, "it");
        HVO.LJ((String[]) aqS111S0300000_7.l0, (ActivityC45651qj) aqS111S0300000_7.l1, false, "");
        ((InterfaceC65784Pro) aqS111S0300000_7.l2).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.rtj, new AqS138S0200000_7((String[]) aqS111S0300000_7.l0, (ActivityC45651qj) aqS111S0300000_7.l1, 30));
        actionGroup.LJIIIIZZ(R.string.rti, new AqS111S0300000_7((ActivityC45651qj) aqS111S0300000_7.l1, (InterfaceC65784Pro) aqS111S0300000_7.l2, (String[]) aqS111S0300000_7.l0, 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS111S0300000_7 aqS111S0300000_7, Object it) {
        o.LJIIIZ(it, "it");
        HVO.LJ((String[]) aqS111S0300000_7.l0, (ActivityC45651qj) aqS111S0300000_7.l1, false, "");
        ((InterfaceC65784Pro) aqS111S0300000_7.l2).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS111S0300000_7 aqS111S0300000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.rtj, new AqS138S0200000_7((String[]) aqS111S0300000_7.l0, (ActivityC45651qj) aqS111S0300000_7.l1, 31));
        actionGroup.LJIIIIZZ(R.string.rti, new AqS111S0300000_7((ActivityC45651qj) aqS111S0300000_7.l1, (InterfaceC65784Pro) aqS111S0300000_7.l2, (String[]) aqS111S0300000_7.l0, 8));
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS111S0300000_7(X.ActivityC45651qj r3, X.M78 r4, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 31: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS111S0300000_7.<init>(X.1qj, X.M78, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ActivityC45651qj activityC45651qj, C41474GPm c41474GPm, AwemeDraft awemeDraft, int i) {
        super(1);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = c41474GPm;
        this.l2 = awemeDraft;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro, String[] strArr, int i) {
        super(1);
        this.$t = i;
        this.l0 = strArr;
        this.l1 = activityC45651qj;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ActivityC45651qj activityC45651qj, InterfaceC82086WJm interfaceC82086WJm, ShortVideoContext shortVideoContext, int i) {
        super(1);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = interfaceC82086WJm;
        this.l2 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(C41306GJa c41306GJa, GJZ gjz, Device device, int i) {
        super(1);
        this.$t = i;
        this.l0 = gjz;
        this.l1 = device;
        this.l2 = c41306GJa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(AbstractC41479GPr abstractC41479GPr, Object obj, PublishModel publishModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC41479GPr;
        this.l1 = obj;
        this.l2 = publishModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS111S0300000_7(GWN gwn, GWN gwn2, Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = gwn;
        this.l1 = gwn2;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(C41895GcN c41895GcN, C41897GcP c41897GcP, C41896GcO c41896GcO, int i) {
        super(1);
        this.$t = i;
        this.l0 = c41895GcN;
        this.l1 = c41897GcP;
        this.l2 = c41896GcO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS111S0300000_7(C42898GsY c42898GsY, C42898GsY c42898GsY2, AnchorTransData anchorTransData, List<AnchorPublishStruct> list) {
        super(1);
        this.$t = list;
        this.l0 = c42898GsY;
        this.l1 = c42898GsY2;
        this.l2 = anchorTransData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS111S0300000_7(C43703HDf c43703HDf, C43703HDf c43703HDf2, ShareKitPanel shareKitPanel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = c43703HDf;
        this.l1 = c43703HDf2;
        this.l2 = shareKitPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(C44087HRz c44087HRz, ViewGroup viewGroup, C188727au c188727au, int i) {
        super(1);
        this.$t = i;
        this.l0 = c44087HRz;
        this.l1 = viewGroup;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS111S0300000_7(C45628HvU c45628HvU, C45628HvU c45628HvU2, MyMediaModel myMediaModel, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = c45628HvU;
        this.l1 = c45628HvU2;
        this.l2 = myMediaModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(C45929I0v c45929I0v, C63K c63k, QaStruct qaStruct, int i) {
        super(1);
        this.$t = i;
        this.l0 = c45929I0v;
        this.l1 = c63k;
        this.l2 = qaStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS111S0300000_7(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C74385THh> interfaceC65784Pro2, C82622Wbi c82622Wbi, InterfaceC88472Yns<? super ID3, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = interfaceC65784Pro;
        this.l1 = interfaceC65784Pro2;
        this.l2 = c82622Wbi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS111S0300000_7(Activity activity, Activity activity2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(1);
        this.$t = interfaceC65784Pro2;
        this.l0 = activity;
        this.l1 = activity2;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(Context context, HPQ hpq, StickerDownloadConfig stickerDownloadConfig, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = stickerDownloadConfig;
        this.l2 = hpq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(Context context, AnchorRecentlyAddFragment anchorRecentlyAddFragment, InterfaceC42726Gpm interfaceC42726Gpm, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = anchorRecentlyAddFragment;
        this.l2 = interfaceC42726Gpm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(Context context, CommerceToolsTcmModel commerceToolsTcmModel, AqS173S0100000_7 aqS173S0100000_7, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = aqS173S0100000_7;
        this.l2 = commerceToolsTcmModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(Context context, DraftFragment draftFragment, C41425GNp c41425GNp, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = draftFragment;
        this.l2 = c41425GNp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ViewGroup viewGroup, HQJ hqj, C188727au c188727au, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = hqj;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ViewGroup viewGroup, HQM hqm, C188727au c188727au, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = hqm;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ViewGroup viewGroup, HQS hqs, C188727au c188727au, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = hqs;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ViewGroup viewGroup, HS1 hs1, C188727au c188727au, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = hs1;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ViewGroup viewGroup, HS8 hs8, C188727au c188727au, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = hs8;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ViewGroup viewGroup, HSJ hsj, C188727au c188727au, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = hsj;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ViewGroup viewGroup, HSK hsk, C188727au c188727au, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = hsk;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ViewGroup viewGroup, HSM hsm, C188727au c188727au, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = hsm;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(ViewGroup viewGroup, HSQ hsq, C188727au c188727au, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = hsq;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(UrlModel urlModel, MusicModel musicModel, MusicShootAssem musicShootAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = urlModel;
        this.l1 = musicModel;
        this.l2 = musicShootAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(CommentVideoModel commentVideoModel, C45929I0v c45929I0v, C63K c63k, int i) {
        super(1);
        this.$t = i;
        this.l0 = c45929I0v;
        this.l1 = c63k;
        this.l2 = commentVideoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(CommentVideoModel commentVideoModel, InterfaceC81454Vxy interfaceC81454Vxy, I1J i1j, int i) {
        super(1);
        this.$t = i;
        this.l0 = i1j;
        this.l1 = interfaceC81454Vxy;
        this.l2 = commentVideoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(Mission mission, C42509GmH c42509GmH, InterfaceC41450GOo interfaceC41450GOo, int i) {
        super(1);
        this.$t = i;
        this.l0 = mission;
        this.l1 = c42509GmH;
        this.l2 = interfaceC41450GOo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS111S0300000_7(CommerceMusicLegalViewModel commerceMusicLegalViewModel, C42904Gse c42904Gse, C42902Gsc c42902Gsc, int i) {
        super(1);
        this.$t = i;
        this.l0 = commerceMusicLegalViewModel;
        this.l1 = c42904Gse;
        this.l2 = c42902Gsc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS111S0300000_7(CheckTitleSensitivityResult checkTitleSensitivityResult, CheckTitleSensitivityResult checkTitleSensitivityResult2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(1);
        this.$t = interfaceC65784Pro2;
        this.l0 = checkTitleSensitivityResult;
        this.l1 = checkTitleSensitivityResult2;
        this.l2 = interfaceC65784Pro;
    }
}
