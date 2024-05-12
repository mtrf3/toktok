package com.ss.android.ugc.aweme.commercialize.tcm.service;

import X.ARI;
import X.C198377qT;
import X.C248439p1;
import X.C26045AKb;
import X.C26227ARb;
import X.C26231ARf;
import X.C29822Bn8;
import X.C2U8;
import X.C34068DYq;
import X.C38049EwX;
import X.C3AW;
import X.C40179Fpn;
import X.C41461GOz;
import X.C46378IIc;
import X.C55492LqC;
import X.C58096Mr6;
import X.C60106NiQ;
import X.C60107NiR;
import X.C60108NiS;
import X.C68312mB;
import X.C69372nt;
import X.C76800UCe;
import X.C78983UzD;
import X.C8HI;
import X.EnumC49617Jdd;
import X.GTF;
import X.InterfaceC40516FvE;
import X.NH9;
import X.NHB;
import X.NHD;
import X.UC0;
import Y.IDCSpanS32S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.BizAccount;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BrandedContent;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusBottomBarAssem;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.notice.api.bean.BCVideosInPushMsg;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class TcmServiceImpl implements ITcmService {
    public static ITcmService LJIJI() {
        Object LIZ = C58096Mr6.LIZ(ITcmService.class, false);
        if (LIZ != null) {
            return (ITcmService) LIZ;
        }
        return new TcmServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final TcmOrderStatusBottomBarAssem LJ() {
        return new TcmOrderStatusBottomBarAssem();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final int LJIIJJI() {
        C60107NiR c60107NiR;
        User currentUser;
        String str;
        BrandedContent brandedContent;
        synchronized (C60107NiR.LJLILLLLZI) {
            if (C60107NiR.LJLJI == null) {
                C60107NiR.LJLJI = new C60107NiR();
            }
            c60107NiR = C60107NiR.LJLJI;
            o.LJI(c60107NiR);
        }
        BCVideosInPushMsg bCVideosInPushMsg = c60107NiR.LJLIL;
        NH9 nh9 = (NH9) NHB.LIZ.LIZ();
        if (nh9 != null && (currentUser = nh9.getCurrentUser()) != null) {
            if (bCVideosInPushMsg != null) {
                str = bCVideosInPushMsg.getUid();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, currentUser.getUid())) {
                if (bCVideosInPushMsg != null) {
                    return bCVideosInPushMsg.getNewContentNum();
                }
            } else {
                try {
                    BizAccount bizAccount = (BizAccount) SettingsManager.LIZLLL().LJIIIIZZ("biz_account", BizAccount.class, null);
                    if (bizAccount != null && (brandedContent = bizAccount.getBrandedContent()) != null) {
                        return brandedContent.getNewContentNum();
                    }
                } catch (Exception e) {
                    C78983UzD.LJIIZILJ(e);
                }
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final boolean LJIILIIL() {
        if (C34068DYq.LIZ || C46378IIc.LIZ) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final boolean LJII() {
        TcmConfig LIZ = C41461GOz.LIZ();
        if (LIZ != null) {
            return LIZ.getUseBcEntranceAfterPost();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final TcmConfig LJIIZILJ() {
        return C41461GOz.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LIZIZ(JSONObject jSONObject) {
        Aweme i6;
        int i;
        String optString = jSONObject.optString("item_id");
        if (optString != null && (i6 = AwemeService.LIZ().i6(optString)) != null) {
            boolean optBoolean = jSONObject.optBoolean("ads_only");
            boolean optBoolean2 = jSONObject.optBoolean("ads_authorization");
            String brandedContentType = jSONObject.optString("branded_content_type");
            if (optBoolean) {
                i = 1;
            } else {
                i = 2;
            }
            AwemeCommerceStruct commerceVideoAuthInfo = i6.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                commerceVideoAuthInfo.setDarkPostStatus(i);
                commerceVideoAuthInfo.setAdvPromotable(optBoolean2);
                o.LJIIIIZZ(brandedContentType, "brandedContentType");
                commerceVideoAuthInfo.setBrandedContentType(CastLongProtector.parseLong(brandedContentType));
                commerceVideoAuthInfo.setPreventSelfSee(TextUtils.equals(brandedContentType, "4"));
                if (!TextUtils.isEmpty(jSONObject.optString("star_atlas_order_id"))) {
                    String optString2 = jSONObject.optString("star_atlas_order_id");
                    o.LJIIIIZZ(optString2, "obj.optString(TcmConstants.STAR_ATLAS_ORDER_ID)");
                    i6.setStarAtlasOrderId(CastLongProtector.parseLong(optString2));
                }
                C2U8.LIZ(new C248439p1(CastIntegerProtector.parseInt(brandedContentType), commerceVideoAuthInfo.isAdvPromotable()));
            }
            C2U8.LIZ(new IEvent() { // from class: X.2J9
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final int LIZJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return R.string.s5e;
            }
            if (num.intValue() == 2) {
                return R.string.s59;
            }
            if (num.intValue() == 3) {
                return R.string.s5d;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final boolean LIZLLL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        List<AnchorCommonStruct> anchors2;
        if (aweme == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty() || (anchors2 = aweme.getAnchors()) == null) {
            return false;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors2) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2.getType() == 59 && anchorCommonStruct2.getExtra().length() > 0) {
                if (anchorCommonStruct == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJIIIIZZ(NHD nhd) {
        NHB.LIZ.LIZIZ(nhd);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJIILLIIL(JSONObject jSONObject) {
        C2U8.LIZ(new IEvent(jSONObject.optInt("type")) { // from class: X.2JA
            public final int LJLIL;

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C2U8.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C2U8.LIZIZ(this);
                return this;
            }

            {
                this.LJLIL = r1;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final C55492LqC LJFF(Context context, ViewGroup rootView) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(context, "context");
        return new C55492LqC(context, rootView);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJI(Context context, Aweme aweme) {
        String str;
        o.LJIIIZ(context, "context");
        BrandedContentToolSchema LIZ = GTF.LIZ();
        String str2 = null;
        if (LIZ != null) {
            str = LIZ.baViewInsightsSchema;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        bundle.putString("itemID", str2);
        bundle.putString("enter_from", "video_play");
        if (str == null) {
            str = "";
        }
        SmartRouter.buildRoute(context, C40179Fpn.LIZ(bundle, str)).open();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final boolean LJIIJ(Aweme aweme, String str) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        BizAccountInfo bizAccountInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (bizAccountInfo = commerceVideoAuthInfo.getBizAccountInfo()) == null || !bizAccountInfo.enableBrandedContentViewInsights() || !C60106NiQ.LIZ(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJIIL(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        ARI ari = new ARI(context);
        ari.LJI(R.string.c4k, new AqS141S0200000_10(context, aweme, 43));
        ari.LJIIIIZZ(R.string.c4_, C60108NiS.LJLIL);
        C26227ARb LIZ = C3AW.LIZ(context);
        LIZ.LJ(R.string.c4l);
        LIZ.LIZ(R.string.c4n);
        LIZ.LJIIL = ari;
        C26231ARf LJI = LIZ.LJI();
        LJI.LJIIIIZZ();
        LJI.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJIILJJIL(Activity activity, Aweme aweme) {
        TcmConfig LIZ;
        String LJ;
        String str;
        String str2;
        String str3;
        Music music;
        String bcSchemaAfterPost;
        if (activity == null || aweme == null || (LIZ = C41461GOz.LIZ()) == null || !LIZ.getUseNewBCSetting()) {
            return;
        }
        String aid = aweme.getAid();
        Integer num = null;
        if (aid != null) {
            TcmConfig LIZ2 = C41461GOz.LIZ();
            if (LIZ2 != null && (bcSchemaAfterPost = LIZ2.getBcSchemaAfterPost()) != null) {
                LJ = ujb.o.LJJJJZ(bcSchemaAfterPost, "%@", aid, false);
            } else {
                LJ = a1.LJ("aweme://webview?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftcm%2Fh5%2Fbranded_content%2F", aid, "%3Fhide_nav_bar%3D1");
            }
            C69372nt LIZ3 = C68312mB.LIZ(LJ);
            boolean isTop = aweme.isTop();
            String str4 = CardStruct.IStatusCode.DEFAULT;
            if (isTop) {
                LIZ3.LIZ("videoTopPlaylist", "1");
            } else if (aweme.playlist_info != null) {
                LIZ3.LIZ("videoTopPlaylist", "2");
            } else if (aweme.isTop() && aweme.playlist_info != null) {
                LIZ3.LIZ("videoTopPlaylist", "3");
            } else {
                LIZ3.LIZ("videoTopPlaylist", CardStruct.IStatusCode.DEFAULT);
            }
            LIZ3.LIZ("missionToastType", "3");
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                num = commerceVideoAuthInfo.getMissionItemStatus();
            }
            LIZ3.LIZ("missionItemStatus", String.valueOf(num));
            if (aweme.isPrivate()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ3.LIZ("isPrivate", str);
            TcmConfig LIZ4 = C41461GOz.LIZ();
            if (LIZ4 == null || (str2 = LIZ4.getTcmFeParams()) == null) {
                str2 = "";
            }
            LIZ3.LIZ("tcmFeParams", str2);
            if (aweme.getMusic() != null && CommerceMediaServiceImpl.LIZJ().LJIJ(aweme.getMusic())) {
                LIZ3.LIZ("musicType", "general");
            }
            Music music2 = aweme.getMusic();
            if (music2 != null && music2.isCommercialMusic() && ((music = aweme.getMusic()) == null || !music.isOriginalSound())) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ3.LIZ("isCommerceMusic", str3);
            LIZ3.LIZ("awemeType", String.valueOf(aweme.getAwemeType()));
            if (aweme.getIsTikTokStory()) {
                str4 = "1";
            }
            LIZ3.LIZ("isStory", str4);
            LIZ3.LIZ("use_spark", "1");
            SmartRouter.buildRoute(activity, LIZ3.LIZIZ().toString()).open();
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIIZZ(R.string.bhe);
        c26045AKb.LIZLLL(1000L);
        c26045AKb.LJIIJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(com.ss.android.ugc.aweme.feed.model.Aweme r12, java.lang.String r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L3
            return
        L3:
            java.util.List r0 = r12.getAnchors()
            r10 = 0
            r1 = 1
            if (r0 == 0) goto L11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
        L11:
            return
        L12:
            java.util.List r4 = r12.getAnchors()
            java.lang.String r0 = "aweme.anchors"
            java.util.ArrayList r2 = defpackage.s1.LIZIZ(r4, r0)
            java.lang.String r0 = "video"
            boolean r0 = kotlin.jvm.internal.o.LJ(r13, r0)
            if (r0 == 0) goto Lb0
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            r0 = 51
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r10] = r0
            java.util.ArrayList r0 = X.C47261Igj.LJII(r1)
        L32:
            java.util.Iterator r9 = r0.iterator()
        L36:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc8
            java.lang.Object r8 = r9.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.util.Iterator r7 = r4.iterator()
        L46:
            boolean r0 = r7.hasNext()
            r6 = 0
            if (r0 == 0) goto L6c
            java.lang.Object r5 = r7.next()
            r3 = r5
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r3
            int r1 = r3.getType()
            if (r8 != 0) goto L5b
            goto L46
        L5b:
            int r0 = r8.intValue()
            if (r1 != r0) goto L46
            java.lang.String r0 = r3.getExtra()
            int r0 = r0.length()
            if (r0 <= 0) goto L46
            goto L6d
        L6c:
            r5 = r6
        L6d:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r5
            if (r5 == 0) goto L36
            com.google.gson.o r1 = new com.google.gson.o
            r1.<init>()
            java.lang.String r0 = r5.getExtra()
            com.google.gson.j r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.parse(r1, r0)
            if (r0 == 0) goto Lae
            com.google.gson.m r3 = r0.LJIIZILJ()
        L84:
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            if (r3 == 0) goto L91
            java.lang.String r0 = "gecko_channel"
            com.google.gson.j r6 = r3.LJJIJ(r0)
        L91:
            X.2Qu r0 = new X.2Qu
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r6, r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L36
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L36
            r2.addAll(r1)
            goto L36
        Lae:
            r3 = r6
            goto L84
        Lb0:
            java.lang.String r0 = "comment"
            boolean r0 = kotlin.jvm.internal.o.LJ(r13, r0)
            if (r0 == 0) goto Lc8
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            r0 = 59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r10] = r0
            java.util.ArrayList r0 = X.C47261Igj.LJII(r1)
            goto L32
        Lc8:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lcf
            return
        Lcf:
            com.ss.android.ugc.aweme.services.IMainService r0 = com.ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin(r10)
            java.lang.String r1 = r0.getAccessKey()
            X.NH3 r0 = X.C58909NAb.LIZ
            r0.getClass()
            X.A20 r0 = X.NH3.LIZIZ()
            if (r0 == 0) goto Le7
            X.NJP r0 = (X.NJP) r0
            r0.LJI(r1, r2)
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl.LJIILL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final boolean LJIJ(Aweme aweme, String str) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        BizAccountInfo bizAccountInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (bizAccountInfo = commerceVideoAuthInfo.getBizAccountInfo()) == null || !bizAccountInfo.enableBrandedContentRemoveMe() || !C60106NiQ.LIZ(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final C198377qT LIZ(Context context, Aweme aweme, String str) {
        List<AnchorCommonStruct> anchors;
        List<AnchorCommonStruct> anchors2;
        AnchorCommonStruct anchorCommonStruct;
        String keyword;
        String schema;
        if (aweme == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty() || (anchors2 = aweme.getAnchors()) == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it = anchors2.iterator();
        while (true) {
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                if (anchorCommonStruct2.getType() == 59 && anchorCommonStruct2.getExtra().length() > 0) {
                    break;
                }
            } else {
                anchorCommonStruct = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
        if (anchorCommonStruct3 == null || (keyword = anchorCommonStruct3.getKeyword()) == null || keyword.length() == 0 || (schema = anchorCommonStruct3.getSchema()) == null || schema.length() == 0) {
            return null;
        }
        return new C198377qT(context, anchorCommonStruct3, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService
    public final void LJIIIZ(Context context, C38049EwX c38049EwX, InterfaceC40516FvE interfaceC40516FvE) {
        o.LJIIIZ(context, "context");
        String LIZ = C29822Bn8.LIZ(context, R.string.c4g, "context.resources.getString(R.string.bc_muc_title)");
        String string = context.getResources().getString(R.string.c4b, LIZ);
        o.LJIIIIZZ(string, "context.resources.getStr…bc_gml_popup, musicTitle)");
        int LJJLIIIJL = s.LJJLIIIJL(string, LIZ, 0, false, 6);
        int length = LIZ.length() + LJJLIIIJL;
        SpannableString spannableString = new SpannableString(string);
        if (Build.VERSION.SDK_INT >= 28) {
            spannableString.setSpan(new TypefaceSpan(C8HI.LIZJ().LIZLLL("medium")), LJJLIIIJL, length, 33);
        } else {
            spannableString.setSpan(new StyleSpan(EnumC49617Jdd.MEDIUM.getVALUE()), LJJLIIIJL, length, 33);
        }
        spannableString.setSpan(new IDCSpanS32S0100000_7(context, 5), LJJLIIIJL, length, 33);
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LIZIZ(spannableString);
        UC0.LIZJ(c26227ARb, new AqS141S0200000_10(c38049EwX, interfaceC40516FvE, 34));
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
    }
}
