package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AV1;
import X.C193917jH;
import X.C36698Eak;
import X.C3A1;
import X.C44904Hjo;
import X.C44928HkC;
import X.C4PR;
import X.C4PS;
import X.C50420Jqa;
import X.C54218LPq;
import X.C62342OdO;
import X.C62344OdQ;
import X.C62359Odf;
import X.C62394OeE;
import X.C62616Oho;
import X.C63081OpJ;
import X.C76800UCe;
import X.C78996UzQ;
import X.C793439m;
import X.C7NR;
import X.C7O9;
import X.C7Z5;
import X.C7Z9;
import X.EnumC62617Ohp;
import X.InterfaceC62225ObV;
import X.InterfaceC62486Ofi;
import X.InterfaceC65784Pro;
import X.InterfaceC72642tA;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NowSharePackage extends PhotoSharePackage {
    public static Aweme shareAweme;
    public C7NR nowShareParams;
    public static final C62344OdQ Companion = new C62344OdQ();
    public static final int $stable = 8;

    public final EnumC62617Ohp LJIL() {
        if (!C4PR.LIZ()) {
            C62344OdQ c62344OdQ = Companion;
            String str = this.itemType;
            c62344OdQ.getClass();
            if (!C62344OdQ.LIZIZ(str)) {
                String itemType = this.itemType;
                o.LJIIIZ(itemType, "itemType");
                if (!o.LJ(itemType, "now_others_post") && !o.LJ(itemType, "now_others_video_post")) {
                    return EnumC62617Ohp.SHARE_NOW;
                }
            }
        }
        EnumC62617Ohp enumC62617Ohp = C62616Oho.LIZ.get(this.itemType);
        if (enumC62617Ohp == null) {
            return EnumC62617Ohp.SHARE_DEFAULT;
        }
        return enumC62617Ohp;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage
    public final void LJIILL(C62394OeE c62394OeE) {
        AwemeStatus status;
        List<SharePlatform> list;
        Aweme aweme;
        Activity LJIILLIIL;
        String str;
        AwemeStatus status2;
        C7NR c7nr;
        AwemeACLShare awemeACLShare;
        ACLCommonShare downloadGeneral;
        boolean LJJIIZI = C78996UzQ.LJJIIZI(this.nowShareParams.LIZJ);
        int i = R.string.t3d;
        if (LJJIIZI) {
            InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.nowShareParams.LIZLLL;
            if (interfaceC72642tA != null) {
                Activity LJIILLIIL2 = LJIILLIIL();
                if (LJIILLIIL2 != null && (c7nr = this.nowShareParams) != null && !AV1.LJIIJJI() && (((awemeACLShare = c7nr.LIZJ.awemeACLShareInfo) == null || (downloadGeneral = awemeACLShare.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 0) && c7nr.LIZJ.isSharedStoryVisible())) {
                    if (c7nr.LIZJ.getAwemeType() == 43) {
                        c62394OeE.LIZJ(new C44928HkC(LJIILLIIL2, c7nr.LIZJ, c7nr.LIZ, "click_download_icon", 16));
                    } else {
                        c62394OeE.LIZJ(new C44904Hjo(LJIILLIIL2, c7nr.LIZJ, c7nr.LIZ));
                    }
                }
                C7NR c7nr2 = this.nowShareParams;
                c62394OeE.LIZJ(new C793439m(interfaceC72642tA, c7nr2.LIZJ, c7nr2.LIZ, c7nr2.LIZIZ));
            }
            if (!this.nowShareParams.LIZJ.isPrivate()) {
                C7NR c7nr3 = this.nowShareParams;
                c62394OeE.LIZJ(new C7Z9(c7nr3.LIZ, c7nr3.LIZJ, c7nr3.LIZIZ));
            }
            boolean LJIJJLI = LJIJJLI(this.nowShareParams.LIZJ, c62394OeE, true);
            c62394OeE.LJIJ = true;
            c62394OeE.LJIILIIL = R.string.r5i;
            c62394OeE.LJIILLIIL = R.string.cg_;
            if (AV1.LJIIJJI() || this.nowShareParams.LIZJ.isScheduleVideo()) {
                c62394OeE.LJIJ = false;
            } else if (this.nowShareParams.LIZJ.isAd() && (status2 = this.nowShareParams.LIZJ.getStatus()) != null && !status2.isAllowShare()) {
                c62394OeE.LJIJ = false;
            } else if (C63081OpJ.LJJLIIIJLJLI(this.nowShareParams.LIZJ)) {
                c62394OeE.LJIJ = false;
            } else if (this.nowShareParams.LIZJ.isPrivate()) {
                c62394OeE.LJIJ = false;
            } else if (o.LJ(this.nowShareParams.LIZIZ, "screenshot_popup")) {
                c62394OeE.LJIJ = false;
            } else if (C7O9.LIZ() == 1 && C54218LPq.LJLIL.LIZ() && o.LJ(this.nowShareParams.LIZIZ, "dot_button")) {
                c62394OeE.LJIJ = false;
            }
            if (this.nowShareParams.LIZJ.isPrivate()) {
                c62394OeE.LIZLLL("chat_merge");
            }
            if (o.LJ(this.nowShareParams.LIZIZ, "screenshot_popup")) {
                c62394OeE.LJJIIJZLJL = true;
                c62394OeE.LJIILIIL = R.string.t3d;
            }
            if (!LJIJJLI) {
                if (C4PR.LIZ() && !Keva.getRepo("keva_share_repo").getBoolean("key_has_shown_under_18_tip", false)) {
                    Activity LJIILLIIL3 = LJIILLIIL();
                    if (LJIILLIIL3 == null || (str = LJIILLIIL3.getString(R.string.t3e)) == null) {
                        str = "";
                    }
                    c62394OeE.LJJIJL = str;
                }
                C62344OdQ c62344OdQ = Companion;
                String str2 = this.itemType;
                c62344OdQ.getClass();
                if (!C62344OdQ.LIZIZ(str2) && !e1.LIZ(31744, "now_hide_preview", true, false) && !o.LJ(this.nowShareParams.LIZIZ, "screenshot_popup") && (aweme = this.params.LIZIZ) != null && (LJIILLIIL = LJIILLIIL()) != null) {
                    c62394OeE.LJJIJIIJIL = true;
                    c62394OeE.LJJIJ = true;
                    c62394OeE.LJJIJIL = new C62342OdO(LJIILLIIL, aweme, this);
                }
            }
        } else {
            final C7NR c7nr4 = this.nowShareParams;
            final InterfaceC72642tA<C50420Jqa> interfaceC72642tA2 = c7nr4.LIZLLL;
            if (interfaceC72642tA2 != null) {
                final Aweme aweme2 = c7nr4.LIZJ;
                final String str3 = c7nr4.LIZ;
                final String str4 = c7nr4.LIZIZ;
                c62394OeE.LIZJ(new C3A1(interfaceC72642tA2, c7nr4, aweme2, str3, str4) { // from class: X.3A3
                    public final /* synthetic */ InterfaceC72642tA<C50420Jqa> LJLJJLL;
                    public final /* synthetic */ C7NR LJLJL;

                    @Override // X.C3A1
                    public final void LIZJ() {
                        InterfaceC72642tA<C50420Jqa> interfaceC72642tA3 = this.LJLJJLL;
                        if (interfaceC72642tA3 != null) {
                            interfaceC72642tA3.onInternalEvent(new C50420Jqa(1, this.LJLJL));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(interfaceC72642tA2, aweme2, str3, str4);
                        this.LJLJJLL = interfaceC72642tA2;
                        this.LJLJL = c7nr4;
                    }
                });
                if (C193917jH.LIZ() && (this.nowShareParams.LIZJ.getFollowStatus() == 1 || this.nowShareParams.LIZJ.getFollowStatus() == 2)) {
                    C7NR c7nr5 = this.nowShareParams;
                    c62394OeE.LIZJ(new C7Z5(c7nr5.LIZJ, interfaceC72642tA2, c7nr5));
                }
            }
            if (o.LJ(this.nowShareParams.LIZIZ, "share_button")) {
                LJIJJLI(this.nowShareParams.LIZJ, c62394OeE, false);
                if (AV1.LJIIJJI() || this.nowShareParams.LIZJ.isScheduleVideo() || (this.nowShareParams.LIZJ.isAd() && (status = this.nowShareParams.LIZJ.getStatus()) != null && !status.isAllowShare())) {
                    c62394OeE.LJIJ = false;
                } else {
                    c62394OeE.LJIJ = true;
                }
            } else if (this.nowShareParams.LIZIZ.equals("screenshot_popup")) {
                c62394OeE.LJIJ = false;
                c62394OeE.LJJIIJZLJL = true;
            } else {
                c62394OeE.LJFF = true;
                c62394OeE.LJIJ = false;
            }
            c62394OeE.LJJII = false;
            c62394OeE.LJJIJ = false;
            c62394OeE.LJIILLIIL = R.string.cg_;
            if (!this.nowShareParams.LIZIZ.equals("screenshot_popup")) {
                i = R.string.r5i;
            }
            c62394OeE.LJIILIIL = i;
        }
        ShareSettings shareSettings = C36698Eak.LIZIZ().LJLJI;
        if (shareSettings != null && (list = shareSettings.sharePlatforms) != null) {
            for (SharePlatform sharePlatform : list) {
                String str5 = sharePlatform.platformId;
                o.LJIIIIZZ(str5, "it.platformId");
                if (C62359Odf.LIZ(str5, LJIL()) == -1) {
                    String str6 = sharePlatform.platformId;
                    o.LJIIIIZZ(str6, "it.platformId");
                    c62394OeE.LIZLLL(str6);
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowSharePackage(android.app.Activity r43, X.C7NR r44) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.NowSharePackage.<init>(android.app.Activity, X.7NR):void");
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJIIIIZZ(InterfaceC62486Ofi action, Context context) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(context, "context");
        shareAweme = this.nowShareParams.LIZJ;
        super.LJIIIIZZ(action, context);
        return false;
    }

    public final boolean LJIJJLI(Aweme aweme, C62394OeE c62394OeE, boolean z) {
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null && awemeACLShare.getShareListStatus() == 0) {
            if (AV1.LJIIJJI() || aweme.isScheduleVideo()) {
                c62394OeE.LJFF = true;
                return true;
            }
            if (z) {
                C4PS.LIZ.getClass();
                if (!C4PS.LIZ()) {
                    c62394OeE.LJFF = true;
                    return true;
                }
            }
            if ((C7O9.LIZ() != 1 || !C54218LPq.LJLIL.LIZ() || !o.LJ(this.nowShareParams.LIZIZ, "dot_button")) && !this.nowShareParams.LIZJ.isPrivate()) {
                return false;
            }
            c62394OeE.LJFF = true;
            return true;
        }
        c62394OeE.LJFF = true;
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJI(Context context, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        shareAweme = this.nowShareParams.LIZJ;
        super.LJI(context, interfaceC62225ObV, view, interfaceC65784Pro);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a9, code lost:
    
        if (X.C62340OdM.LJIILLIIL(r3) == false) goto L15;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00cb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0179 A[ADDED_TO_REGION] */
    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(X.InterfaceC62225ObV r22, android.content.Context r23, android.view.View r24, X.InterfaceC62573Oh7 r25, X.InterfaceC88472Yns<? super java.lang.Boolean, X.C76800UCe> r26) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.NowSharePackage.LIZLLL(X.ObV, android.content.Context, android.view.View, X.Oh7, X.Yns):boolean");
    }
}
