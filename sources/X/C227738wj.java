package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS0S3400000_1;
import kotlin.jvm.internal.AqS1S3300000_1;
import kotlin.jvm.internal.AqS92S0300000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.8wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227738wj {
    public static final boolean LIZJ(long j) {
        if (((System.currentTimeMillis() / 1000) - j) / 60 <= 30) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        boolean z;
        o.LJIIIZ(aweme, "aweme");
        Boolean isPrivateAvailable = SharePrefCache.inst().getIsPrivateAvailable().LIZ();
        boolean LJFF = C80S.LJFF(aweme);
        if (aweme.getAuthor() != null && C38354F3m.LIZJ(((RBX) HG3.LJIILL()).getCurUserId(), aweme.getAuthor().getUid())) {
            z = true;
        } else {
            z = false;
        }
        o.LJIIIIZZ(isPrivateAvailable, "isPrivateAvailable");
        if (!isPrivateAvailable.booleanValue() || !LJFF || !z) {
            return false;
        }
        return true;
    }

    public static final void LJFF(Aweme aweme) {
        String str;
        boolean z;
        o.LJIIIZ(aweme, "aweme");
        C198517qh c198517qh = new C198517qh();
        User author = aweme.getAuthor();
        if (author == null || (str = author.getUid()) == null) {
            str = "";
        }
        c198517qh.LIZ.put("author_id", str);
        if (aweme.getVideo() == null) {
            z = true;
        } else {
            z = false;
        }
        c198517qh.LIZ.put("video_is_null", Boolean.valueOf(z));
        FUA.LIZJ("aweme_video_author_info_unmatch", c198517qh.LJ());
    }

    public static final long LJI(Aweme aweme) {
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            return statistics.getPlayCount();
        }
        return 0L;
    }

    public static final boolean LIZ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        if (aweme == null) {
            return false;
        }
        AwemeStatus status = aweme.getStatus();
        if (status != null && !status.isAllowShare()) {
            if (aweme.getStatus().isInReviewing() && aweme.getStatus().isSelfSee()) {
                C05L.LIZLLL(context, R.string.ses);
            } else if (aweme.isAd()) {
                C05L.LIZLLL(context, R.string.b91);
            } else {
                C05L.LIZLLL(context, R.string.cg7);
            }
            return false;
        }
        return true;
    }

    public static final Object LIZIZ(Aweme aweme, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        if (LIZ.configService().avsettingsConfig().enableReeditPostedDraftInSharePanel()) {
            return XKX.LJI(C78613UtF.LIZJ, new C67212kP(LIZ, aweme, null), interfaceC67352kd);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.7au, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.8l2] */
    public static void LJ(boolean z, Aweme aweme, String enterFrom, String tabName, String imprId, boolean z2, int i) {
        String str;
        int i2 = 0;
        ?? r12 = z2;
        if ((i & 64) != 0) {
            r12 = 0;
        }
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(imprId, "imprId");
        ?? c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("impr_id", imprId);
        C222578oP.LIZJ(c188727au, aweme, null, null, 14);
        c188727au.LJ(LJI(aweme), "item_vv");
        c188727au.LIZLLL(aweme.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        c188727au.LJIIIZ("tab_name", tabName);
        if (Z89.LIZIZ.LIZIZ(aweme)) {
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo == null || (str = nowPostInfo.getNowMediaType()) == null) {
                str = "post";
            }
            c188727au.LJI("now_type", str);
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getReviewStatus() == 1) {
                i2 = 1;
            }
            c188727au.LIZLLL(i2, "is_review_failed");
        }
        if (z) {
            ?? r5 = C220488l2.LIZIZ;
            c188727au.LIZLLL(aweme.getRetryType(), "retry_type");
            c188727au.LIZLLL(LIZJ(aweme.getCreateTime()) ? 1 : 0, "is_30min_delete");
            c188727au.LIZLLL(r12, "is_posted_draft");
            C222578oP.LIZJ(r5.LJII(aweme, c188727au), aweme, null, null, 14);
            FMX.LJIIL("confirm_delete_video", c188727au.LIZ);
            return;
        }
        FMX.LJIIL("cancel_delete_video", c188727au.LIZ);
    }

    public static final void LJII(boolean z, Context context, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Aweme aweme, String enterFrom, String tabName, String imprId, String panelSource, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i;
        String str;
        if (C54838Lfe.LJIIZILJ(aweme)) {
            i = R.string.egd;
        } else {
            i = R.string.efp;
        }
        if (z) {
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(imprId, "imprId");
            o.LJIIIZ(tabName, "tabName");
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(panelSource, "panelSource");
            if (C54838Lfe.LJIIZILJ(aweme)) {
                str = "story";
            } else {
                str = "post";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("group_id", aweme.getAid());
            c188727au.LJIIIZ("enter_from", enterFrom);
            c188727au.LJIIIZ("panel_source", panelSource);
            c188727au.LJIIIZ("impr_id", imprId);
            c188727au.LJIIIZ("story_type", str);
            c188727au.LJ(LJI(aweme), "item_vv");
            c188727au.LIZLLL(aweme.getRetryType(), "retry_type");
            c188727au.LIZLLL(LIZJ(aweme.getCreateTime()) ? 1 : 0, "is_30min_delete");
            c188727au.LJ((System.currentTimeMillis() / 1000) - aweme.getCreateTime(), "interval_from_post");
            if (TextUtils.equals(enterFrom, "personal_homepage")) {
                c188727au.LJI("tab_name", tabName);
            }
            FMX.LJIIL("tools_posted_drafts_popup", c188727au.LIZ);
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJ(i);
            c26227ARb.LIZ(R.string.q8y);
            UC0.LIZJ(c26227ARb, new AqS0S3400000_1(interfaceC72642tA, aweme, context, enterFrom, tabName, imprId, interfaceC65784Pro, 0));
            c26227ARb.LIZLLL(C65122h2.LJLIL);
            c26227ARb.LIZJ(C65132h3.LJLIL);
            c26227ARb.LJI().LIZLLL();
            return;
        }
        C26227ARb LIZ = Q7L.LIZ(context, i);
        UC0.LIZJ(LIZ, new AqS1S3300000_1(interfaceC72642tA, aweme, enterFrom, tabName, imprId, interfaceC65784Pro, 5));
        LIZ.LIZLLL(C65142h4.LJLIL);
        LIZ.LIZJ(C65152h5.LJLIL);
        LIZ.LJI().LIZLLL();
    }

    public static void LJIIIIZZ(Context context, final Aweme aweme, final InterfaceC72642tA interfaceC72642tA, String str, String str2, String str3, String str4, AqS92S0300000_3 aqS92S0300000_3, int i) {
        QaStruct qaStruct;
        String l;
        final String enterFrom = str2;
        final String tabName = str;
        final String imprId = str3;
        AqS92S0300000_3 aqS92S0300000_32 = aqS92S0300000_3;
        String panelSource = str4;
        String str5 = "";
        if ((i & 8) != 0) {
            tabName = "";
        }
        if ((i & 16) != 0) {
            enterFrom = "";
        }
        if ((i & 32) != 0) {
            imprId = "";
        }
        if ((i & 64) != 0) {
            panelSource = "";
        }
        if ((i & 128) != 0) {
            aqS92S0300000_32 = null;
        }
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(imprId, "imprId");
        o.LJIIIZ(panelSource, "panelSource");
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getQaStruct() != null) {
                    qaStruct = interactStickerStruct.getQaStruct();
                    break;
                }
            }
        }
        qaStruct = null;
        C62905OmT c62905OmT = new C62905OmT(new C25600zU(context, R.style.ul));
        if (aweme.getStarAtlasOrderId() > 0) {
            c62905OmT.LIZ(R.string.eg6);
        } else {
            if (CommerceMissionServiceImpl.LJIIIIZZ().LIZIZ(context).LIZ(aweme, new C72652tB(interfaceC72642tA, aweme, enterFrom, tabName, imprId, aqS92S0300000_32))) {
                return;
            }
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.isAdvPromotable()) {
                c62905OmT.LIZ(R.string.pjb);
            } else {
                AwemeStatus status = aweme.getStatus();
                if (status != null && status.isInReviewing() && aweme.getStatus().isSelfSee()) {
                    C26227ARb LIZLLL = KMP.LIZLLL(context, R.string.p59, R.string.p58);
                    UC0.LIZJ(LIZLLL, new AqS1S3300000_1(interfaceC72642tA, aweme, enterFrom, tabName, imprId, aqS92S0300000_32, 2));
                    LIZLLL.LJI().LIZLLL();
                    return;
                }
                if (qaStruct != null && (l = Long.valueOf(qaStruct.getItemId()).toString()) != null) {
                    str5 = l;
                }
                if (TextUtils.equals(str5, aweme.getAid()) && QnaService.LIZ().enablePublicQna()) {
                    C26227ARb LIZLLL2 = KMP.LIZLLL(context, R.string.ppf, R.string.pph);
                    UC0.LIZJ(LIZLLL2, new AqS1S3300000_1(interfaceC72642tA, aweme, enterFrom, tabName, imprId, aqS92S0300000_32, 4));
                    LIZLLL2.LJI().LIZLLL();
                    return;
                }
                if (C54838Lfe.LJIIZILJ(aweme)) {
                    if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableSharePanelTuxDialogRefactor() || C2304092m.LIZ()) {
                        if (aweme.isProhibited()) {
                            a.LJFF().LJIILIIL(context, interfaceC72642tA, aweme);
                            return;
                        }
                        C220488l2 c220488l2 = C220488l2.LIZIZ;
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("group_id", aweme.getAid());
                        c188727au.LJIIIZ("enter_from", enterFrom);
                        c188727au.LJIIIZ("panel_source", panelSource);
                        c188727au.LJIIIZ("impr_id", imprId);
                        C222578oP.LIZJ(c188727au, aweme, null, null, 14);
                        c188727au.LJ(LJI(aweme), "item_vv");
                        c188727au.LIZLLL(aweme.getRetryType(), "retry_type");
                        c188727au.LIZLLL(LIZJ(aweme.getCreateTime()) ? 1 : 0, "is_30min_delete");
                        c188727au.LJ((System.currentTimeMillis() / 1000) - aweme.getCreateTime(), "interval_from_post");
                        c188727au.LIZLLL(aweme.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
                        C188727au c188727au2 = (C188727au) c220488l2.LJII(aweme, c188727au);
                        c188727au2.getClass();
                        c188727au2.LJIIIZ("tab_name", tabName);
                        FMX.LJIIL("click_delete_video", c188727au2.LIZ);
                        XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new C65102h0(aweme, context, interfaceC72642tA, enterFrom, tabName, imprId, panelSource, null), 3);
                        return;
                    }
                    c62905OmT.LIZ(R.string.egd);
                } else if (Z89.LIZIZ.LIZIZ(aweme)) {
                    c62905OmT.LIZ(R.string.j3m);
                } else {
                    if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableSharePanelTuxDialogRefactor()) {
                        XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new C65112h1(aweme, context, interfaceC72642tA, enterFrom, tabName, imprId, panelSource, aqS92S0300000_32, null), 3);
                        return;
                    }
                    c62905OmT.LIZ(R.string.efp);
                }
            }
        }
        c62905OmT.LJII(R.string.cg_, new DialogInterface.OnClickListener() { // from class: X.8wl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C227738wj.LJ(false, aweme, enterFrom, tabName, imprId, false, 96);
            }
        });
        final String str6 = enterFrom;
        final String str7 = tabName;
        final String str8 = imprId;
        final AqS92S0300000_3 aqS92S0300000_33 = aqS92S0300000_32;
        c62905OmT.LJIIJ(R.string.efm, new DialogInterface.OnClickListener() { // from class: X.8wk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                InterfaceC72642tA<C50420Jqa> interfaceC72642tA2 = interfaceC72642tA;
                if (interfaceC72642tA2 != null) {
                    interfaceC72642tA2.onInternalEvent(new C50420Jqa(2, aweme));
                }
                C227738wj.LJ(true, aweme, str6, str7, str8, false, 96);
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = aqS92S0300000_33;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                dialogInterface.dismiss();
            }
        });
        c62905OmT.LIZJ(C207818Dp.LJLIL);
        c62905OmT.LIZLLL(C207808Do.LJLIL);
        new C62906OmU(c62905OmT).LIZLLL();
    }
}
