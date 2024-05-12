package com.ss.android.ugc.aweme.im.sdk.common.data.service;

import X.AV1;
import X.AbstractC73672Svk;
import X.C107274Ix;
import X.C111144Xu;
import X.C2304092m;
import X.C3FW;
import X.C4J3;
import X.C4J5;
import X.C4XO;
import X.C54838Lfe;
import X.C785836o;
import X.C78966Uyw;
import X.C95043oC;
import X.X1D;
import Y.IDuS313S0100000_1;
import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFragmentV2;
import com.ss.android.ugc.aweme.im.service.service.IStoryIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.dm.StoryQuickDMBottomBarAssem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes2.dex */
public final class StoryIMService implements IStoryIMService {
    public PointF LIZ;

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final PointF LJFF() {
        return this.LIZ;
    }

    public static boolean LJI(Aweme aweme) {
        User author;
        Integer num;
        Integer num2;
        User author2;
        Integer valueOf;
        User author3;
        User author4;
        if (C2304092m.LIZ()) {
            IPrivacyService LJIIIIZZ = PrivacyServiceImpl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                PrivacyUserSettingsV2 privacyUserSettings = LJIIIIZZ.getPrivacyUserSettings();
                String str = null;
                if (privacyUserSettings != null) {
                    num = privacyUserSettings.M("direct_message");
                } else {
                    num = null;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("judge follow status: ");
                if (aweme != null && (author4 = aweme.getAuthor()) != null) {
                    num2 = Integer.valueOf(author4.getFollowStatus());
                } else {
                    num2 = null;
                }
                LIZ.append(num2);
                LIZ.append(" ,is maf: ");
                C3FW LIZ2 = C785836o.LIZ();
                if (aweme != null && (author3 = aweme.getAuthor()) != null) {
                    str = author3.getUid();
                }
                LIZ2.getClass();
                LIZ.append(C3FW.LIZJ(str));
                LIZ.append(", user dm setting: ");
                LIZ.append(num);
                X1D.LIZIZ(LIZ);
                if (aweme != null && (author2 = aweme.getAuthor()) != null && (valueOf = Integer.valueOf(author2.getFollowStatus())) != null) {
                    if (valueOf.intValue() == 2) {
                        if (num == null || num.intValue() != 3) {
                            return true;
                        }
                    } else if (valueOf != null) {
                        if (valueOf.intValue() == 1) {
                            if (num != null && (num.intValue() == 1 || num.intValue() == 4)) {
                                return true;
                            }
                        } else {
                            C3FW LIZ3 = C785836o.LIZ();
                            String uid = aweme.getAuthor().getUid();
                            LIZ3.getClass();
                            if (C3FW.LIZJ(uid)) {
                                if (num != null && (num.intValue() == 1 || num.intValue() == 4)) {
                                    return true;
                                }
                            } else if (num != null && num.intValue() == 1) {
                                return true;
                            }
                        }
                    }
                }
            }
        } else if (aweme != null && (author = aweme.getAuthor()) != null && author.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final boolean LIZ(Aweme aweme) {
        boolean z;
        boolean z2 = false;
        if (aweme == null) {
            return false;
        }
        boolean z3 = C95043oC.LIZLLL;
        if (C54838Lfe.LJJI(aweme) && !aweme.isStoryFakeAweme()) {
            z = true;
        } else {
            z = false;
        }
        boolean LIZIZ = C78966Uyw.LJJIJ().LIZIZ();
        boolean LJIJ = AV1.LJIJ(aweme.getAuthor());
        boolean LJI = LJI(aweme);
        if (!z3 || !z || LIZIZ || LJIJ || !LJI) {
            z2 = true;
        }
        return !z2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final AbstractC73672Svk<C111144Xu> LIZJ(Aweme aweme) {
        boolean z;
        if (aweme == null) {
            return AbstractC73672Svk.LJJIJIL(new C111144Xu(aweme, false));
        }
        boolean z2 = C95043oC.LIZLLL;
        if (C54838Lfe.LJJI(aweme) && !aweme.isStoryFakeAweme()) {
            z = true;
        } else {
            z = false;
        }
        boolean LIZIZ = C78966Uyw.LJJIJ().LIZIZ();
        boolean LJIJ = AV1.LJIJ(aweme.getAuthor());
        boolean LJI = LJI(aweme);
        if (!z2 || !z || LIZIZ || LJIJ || !LJI) {
            return AbstractC73672Svk.LJJIJIL(new C111144Xu(aweme, false));
        }
        return AbstractC73672Svk.LJIIJ(new IDuS313S0100000_1(aweme, 0));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LJ(PointF pointF) {
        this.LIZ = pointF;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LIZIZ(final String str, User user, Aweme aweme, String str2, String str3, Boolean bool, final C4XO c4xo) {
        C107274Ix.LJII(str, user, aweme, str2, "story_message_input_box", str3, bool, new C4J3() { // from class: X.4XN
            @Override // X.C4J3
            public final void LIZIZ() {
                InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = c4xo;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(str);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LIZLLL(View view, FragmentManager fragmentManager, Aweme aweme, User user, String str, String str2, String str3, boolean z, StoryQuickDMBottomBarAssem storyQuickDMBottomBarAssem, AqS169S0100000_3 aqS169S0100000_3) {
        DetailFeedQuickDMFragmentV2 detailFeedQuickDMFragmentV2 = new DetailFeedQuickDMFragmentV2();
        if (storyQuickDMBottomBarAssem != null) {
            detailFeedQuickDMFragmentV2.LJLL = storyQuickDMBottomBarAssem;
        }
        detailFeedQuickDMFragmentV2.LJZ = z;
        detailFeedQuickDMFragmentV2.LJLZ = str3;
        detailFeedQuickDMFragmentV2.LJLLLLLL = aweme;
        detailFeedQuickDMFragmentV2.LJLLILLLL = new C4J5(aqS169S0100000_3, user, aweme, str, str2, z);
        if (fragmentManager != null) {
            detailFeedQuickDMFragmentV2.show(fragmentManager, "ReplyKeyboardDialogFragment");
        }
    }
}
