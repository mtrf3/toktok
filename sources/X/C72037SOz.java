package X;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.BaseVisibilityViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.util.VideoPrivacySettingsDurationViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS110S0101000_12;
import kotlin.jvm.internal.AqS95S0101000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.SOz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72037SOz extends AbstractC72031SOt<BaseVisibilityViewModel> {
    public final String LJLLJ;
    public final String LJLLL;
    public final String LJLLLL;
    public String LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final VideoPrivacySettingsDurationViewModel LJZ;
    public final C62822Ol8 LJZI;

    @Override // X.AbstractC72031SOt
    public final boolean LLFZ() {
        return !C79146V4k.LJJJJI(this.LJLL.nv0());
    }

    @Override // X.AbstractC72031SOt
    public final boolean LLIFFJFJJ() {
        Story story;
        if (!C43908HLc.LIZ.isPrivateAvailable()) {
            return false;
        }
        if (C54838Lfe.LJJI(this.LJLL.nv0()) && (!C55723Ltv.LIZIZ.LJIJI() || !C78996UzQ.LJJIIZI(this.LJLL.nv0()) || (((story = this.LJLL.nv0().getStory()) != null && StoryKt.isExpired(story)) || o.LJ("story_archive", this.LJLLJ)))) {
            return false;
        }
        return true;
    }

    public final SP7 LLIILII() {
        return (SP7) this.LJZI.getValue();
    }

    public static boolean LLIILZL(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs;
        if (!QnaService.LIZ().enablePublicQna() || (interactStickerStructs = aweme.getInteractStickerStructs()) == null || interactStickerStructs.isEmpty()) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
            if (interactStickerStruct.getQaStruct() != null && TextUtils.equals(String.valueOf(interactStickerStruct.getQaStruct().getItemId()), aweme.getAid())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LLIIZ(Aweme aweme) {
        if (aweme.isSubOnlyVideo() && aweme.isNrNff()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC72031SOt
    public final boolean LLIIIJ(int i) {
        int intValue;
        Integer value = this.LJLL.LJLJI.getValue();
        if (value == null) {
            intValue = 1;
        } else {
            intValue = value.intValue();
        }
        if (this.LJLL.nv0().isSubOnlyVideo()) {
            String string = this.LJLIL.getString(R.string.ruf);
            o.LJIIIIZZ(string, "context.getString(R.stri…st_visibility_choice_sub)");
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new T5U(43, true), 0, string.length(), 17);
            Spanned LJIJ = C1A7.LJIJ(this.LJLIL, R.string.rue, spannableString);
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C26227ARb LIZ = C3AW.LIZ(this.LJLIL);
                        LIZ.LJ(R.string.ru9);
                        LIZ.LIZIZ(LJIJ);
                        UC0.LIZJ(LIZ, new AqS95S0101000_7(this, i, 13));
                        LIZ.LJI().LIZLLL();
                    }
                } else {
                    C26227ARb LIZ2 = C3AW.LIZ(this.LJLIL);
                    LIZ2.LJ(R.string.ru_);
                    LIZ2.LIZIZ(LJIJ);
                    UC0.LIZJ(LIZ2, new AqS95S0101000_7(this, i, 15));
                    LIZ2.LJI().LIZLLL();
                }
            } else if (C71945SLl.LIZLLL()) {
                C26227ARb LIZ3 = C3AW.LIZ(this.LJLIL);
                LIZ3.LJ(R.string.ru8);
                LIZ3.LIZIZ(LJIJ);
                UC0.LIZJ(LIZ3, new AqS95S0101000_7(this, i, 9));
                LIZ3.LJI().LIZLLL();
            } else {
                C26227ARb LIZ4 = C3AW.LIZ(this.LJLIL);
                LIZ4.LJ(R.string.rub);
                LIZ4.LIZIZ(LJIJ);
                UC0.LIZJ(LIZ4, new AqS95S0101000_7(this, i, 11));
                LIZ4.LJI().LIZLLL();
            }
            return true;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    String str = this.LJLLLLLL;
                    if (str == null || str.length() == 0) {
                        if (LLIILZL(this.LJLL.nv0()) && intValue == 0) {
                            String string2 = this.LJLIL.getString(R.string.ppb);
                            o.LJIIIIZZ(string2, "context.getString(R.stri…qaprivacy_delete_private)");
                            LLIL(2, string2);
                            return true;
                        }
                        if (LLIILII().bd(intValue, i)) {
                            return true;
                        }
                    } else {
                        LLIL(2, this.LJLLLLLL);
                        return true;
                    }
                }
            } else {
                String str2 = this.LJLLLLLL;
                if (str2 == null || str2.length() == 0) {
                    if (LLIILZL(this.LJLL.nv0()) && intValue == 0) {
                        String string3 = this.LJLIL.getString(R.string.ppb);
                        o.LJIIIIZZ(string3, "context.getString(R.stri…qaprivacy_delete_private)");
                        LLIL(1, string3);
                        return true;
                    }
                    if (LLIILII().bd(intValue, i)) {
                        return true;
                    }
                } else {
                    LLIL(1, this.LJLLLLLL);
                    return true;
                }
            }
        } else if (LLIILZL(this.LJLL.nv0())) {
            IPrivacyConfig.IPermissionBridge iPermissionBridge = C43908HLc.LIZ;
            if (iPermissionBridge.getPublishPermissionDialogPublicQNA(true)) {
                iPermissionBridge.setPublishPermissionDialogPublicQNA(false);
                String string4 = this.LJLIL.getString(R.string.ppm);
                o.LJIIIIZZ(string4, "context.getString(R.string.qaprivacy_public)");
                LLIL(0, string4);
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC72031SOt
    public final void LLIIIL(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LLIIL(2);
                return;
            }
            LLIIL(1);
            return;
        }
        LLIIL(0);
    }

    public final void LLIIL(int i) {
        String str;
        String str2;
        String str3;
        Integer value = this.LJLL.LJLJI.getValue();
        if (value == null || value.intValue() != i) {
            Aweme nv0 = this.LJLL.nv0();
            Integer value2 = this.LJLL.LJLJI.getValue();
            if (value2 == null) {
                value2 = 0;
            }
            int intValue = value2.intValue();
            String enterFrom = this.LJLLJ;
            String imprId = this.LJLLL;
            String tabName = this.LJLLLL;
            long gv0 = this.LJZ.gv0();
            boolean LJJIZ = C78983UzD.LJJIZ(this.LJLL.nv0());
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(imprId, "imprId");
            o.LJIIIZ(tabName, "tabName");
            String aid = nv0.getAid();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("group_id", aid);
            c188727au.LJIIIZ("enter_from", enterFrom);
            c188727au.LJIIIZ("impr_id", imprId);
            if (C54838Lfe.LJJI(nv0)) {
                str = "story";
            } else {
                str = "post";
            }
            c188727au.LJIIIZ("story type", str);
            c188727au.LJI("from_status", SK8.LIZ(intValue));
            c188727au.LJI("to_status", SK8.LIZ(i));
            if (TextUtils.equals(enterFrom, "personal_homepage")) {
                c188727au.LJI("tab_name", tabName);
            }
            if (Z89.LIZIZ.LIZIZ(nv0)) {
                NowPostInfo nowPostInfo = nv0.nowPostInfo;
                if (nowPostInfo != null) {
                    str3 = nowPostInfo.getNowMediaType();
                } else {
                    str3 = null;
                }
                c188727au.LJI("now_type", str3);
            } else {
                c188727au.LJI("click_from", "privacy_button");
            }
            c188727au.LIZLLL(C71945SLl.LIZLLL() ? 1 : 0, "is_private");
            c188727au.LJ((System.currentTimeMillis() / 1000) - nv0.getCreateTime(), "interval_from_post");
            c188727au.LJ(gv0, "duration");
            if (LJJIZ) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("is_allow_pugc_template", str2);
            FMX.LJIIL("select_privacy_setting_video", c188727au.LIZ);
        }
        super.LLIIIL(i);
    }

    public final void LLIL(int i, String str) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    i2 = R.string.itg;
                } else {
                    i2 = R.string.ppi;
                }
            } else {
                i2 = R.string.ppj;
            }
        } else {
            i2 = R.string.ppk;
        }
        C26227ARb LIZ = C3AW.LIZ(this.LJLIL);
        LIZ.LJ(i2);
        LIZ.LIZIZ(str);
        UC0.LIZJ(LIZ, new AqS95S0101000_7(this, i, 6));
        LIZ.LJI().LIZLLL();
    }

    public static void LLIIJLIL(C72037SOz c72037SOz, SL4 sl4, int i) {
        c72037SOz.getClass();
        sl4.LJIIJJI = true;
        sl4.LIZLLL = false;
        sl4.LJ(c72037SOz.LJLL);
        sl4.LJIIIZ = new AqS110S0101000_12(c72037SOz, i, 4);
        sl4.LJIIJ = new C53393KxR(c72037SOz);
        sl4.LJIIIIZZ = new L43(c72037SOz);
        sl4.LJII = new C72032SOu(c72037SOz, i, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C72037SOz(com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.BaseVisibilityViewModel r13, androidx.fragment.app.Fragment r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72037SOz.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.BaseVisibilityViewModel, androidx.fragment.app.Fragment, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
