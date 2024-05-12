package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.settings.DislikeReason;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Oet, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62435Oet implements InterfaceC72642tA<C50420Jqa>, C7C5, InterfaceC26269ASr {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final Context LJLJJL;
    public final Fragment LJLJJLL;
    public View LJLJL;
    public final SharePackage LJLJLJ;

    public final boolean LJIIIIZZ() {
        if (TextUtils.equals(this.LJLILLLLZI, "graphic_detail") || TextUtils.equals(this.LJLJJI, "graphic_detail")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC26269ASr
    public final SharePackage LJ() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC26269ASr
    public final C26245ARt LIZ(AS3 as3) {
        return new C26245ARt(this, as3);
    }

    @Override // X.InterfaceC26269ASr
    public final List<AbstractC26277ASz> LIZIZ(AS3 as3) {
        return new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:327:0x0734, code lost:
    
        if (r1.intValue() == 152) goto L340;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    @Override // X.InterfaceC26269ASr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.AbstractC26277ASz> LIZJ(final X.AS3 r24) {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62435Oet.LIZJ(X.AS3):java.util.List");
    }

    @Override // X.InterfaceC26269ASr
    public final List<AS4> LIZLLL(AS3 as3) {
        ArrayList arrayList = new ArrayList();
        try {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("dislike_reasons", DislikeReason[].class);
            o.LJIIIIZZ(LJII, "getInstance().getValue(D…sonsSettings::class.java)");
            DislikeReason[] dislikeReasonArr = (DislikeReason[]) LJII;
            int length = dislikeReasonArr.length;
            for (int i = 0; i < length; i++) {
                DislikeReason dislikeReason = dislikeReasonArr[i];
                C26264ASm c26264ASm = new C26264ASm(this, as3);
                String text = dislikeReason.getText();
                if (i == 0) {
                    text = this.LJLJJL.getString(R.string.te5);
                    o.LJIIIIZZ(this.LJLJJL.getString(R.string.te8), "context.getString(R.string.unifiedpanel_toast_a)");
                }
                if (i == 1) {
                    text = this.LJLJJL.getString(R.string.te6);
                    o.LJIIIIZZ(this.LJLJJL.getString(R.string.te9), "context.getString(R.string.unifiedpanel_toast_b)");
                }
                arrayList.add(new AS4(c26264ASm, new AS8(dislikeReason.getId(), text)));
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public final AbstractC26277ASz LJFF(AS3 as3) {
        boolean z;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        User author;
        Aweme aweme4;
        ITalentAdRevenueShareService LJIIJJI;
        Aweme aweme5;
        User author2;
        Aweme aweme6 = this.LJLIL;
        if (aweme6 != null && aweme6.isAd()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ((TextUtils.equals(this.LJLILLLLZI, "homepage_hot") || ((LJIIIIZZ() && !C78996UzQ.LJJIIZI(this.LJLIL)) || LO7.LIZIZ.J1(this.LJLILLLLZI) || TextUtils.equals(this.LJLILLLLZI, "homepage_popular") || TextUtils.equals(this.LJLILLLLZI, "homepage_nearby") || TextUtils.equals(this.LJLILLLLZI, "homepage_explore") || (TextUtils.equals(this.LJLILLLLZI, "homepage_friends") && (aweme5 = this.LJLIL) != null && (author2 = aweme5.getAuthor()) != null && author2.getFollowStatus() == 0 && !C78996UzQ.LJJIIZI(this.LJLIL)))) && DV4.LIZ() == 0)) {
            if (a.LJFF().LJIIIZ() == 2 && a.LJFF().LJJIJIIJIL(this.LJLIL)) {
                return new C26275ASx(new AS9(R.raw.icon_heart_broken, R.string.iqu, "dislike"), new C62436Oeu(this, as3), new C26251ARz(this, as3));
            }
            if (C00F.LIZ(31744, 0, "m_dislike_with_reason", false) == 1) {
                return new C26275ASx(new AS9(R.raw.icon_heart_broken, R.string.iqu, "dislike"), new C62436Oeu(this, as3), new AS0(this, as3));
            }
        }
        if (!C78996UzQ.LJJIIZI(this.LJLIL) || C59111NHv.LJ(this.LJLIL)) {
            if (TextUtils.equals(this.LJLILLLLZI, "homepage_hot") || ((LJIIIIZZ() && !TextUtils.equals(this.LJLILLLLZI, "others_homepage")) || LO7.LIZIZ.J1(this.LJLILLLLZI) || (((aweme = this.LJLIL) != null && aweme.isAd() && (LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI()) != null && LJIIJJI.LJI()) || TextUtils.equals(this.LJLILLLLZI, "homepage_popular") || ((TextUtils.equals(this.LJLILLLLZI, "homepage_follow") && (aweme4 = this.LJLIL) != null && aweme4.isAd() && !C78996UzQ.LJJIIZI(this.LJLIL)) || TextUtils.equals(this.LJLILLLLZI, "homepage_podcast") || TextUtils.equals(this.LJLILLLLZI, "homepage_nearby") || TextUtils.equals(this.LJLILLLLZI, "homepage_explore") || ((TextUtils.equals(this.LJLILLLLZI, "homepage_friends") && (aweme3 = this.LJLIL) != null && (author = aweme3.getAuthor()) != null && author.getFollowStatus() == 0 && !C78996UzQ.LJJIIZI(this.LJLIL)) || (TextUtils.equals(this.LJLILLLLZI, "others_homepage") && (aweme2 = this.LJLIL) != null && aweme2.isAd())))))) {
                return new C26276ASy(new AS9(R.raw.icon_heart_broken, R.string.iqu, "dislike"), new C62436Oeu(this, as3));
            }
            return null;
        }
        return null;
    }

    public final C26276ASy LJI(AS3 as3) {
        if (C78996UzQ.LJJIIZI(this.LJLIL)) {
            return null;
        }
        return new C26276ASy(new AS9(R.raw.icon_flag, R.string.q2_, "report"), new C8RN(this, as3));
    }

    public final C26276ASy LJII(AS3 as3) {
        int i;
        int i2;
        boolean LJII = C62623Ohv.LIZIZ.LJII();
        if (LJII) {
            i = R.raw.icon_danmu_slash_fill;
            i2 = R.string.caa;
        } else {
            i = R.raw.icon_danmu_fill;
            i2 = R.string.ca_;
        }
        return new C26276ASy(new AS9(i, i2, "danmaku"), new C62448Of6(LJII, this, as3));
    }

    @Override // X.C7C5
    public final String getEnterFrom(boolean z) {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC72642tA
    public final /* bridge */ /* synthetic */ void onInternalEvent(C50420Jqa c50420Jqa) {
    }

    public C62435Oet(Aweme aweme, String enterFrom, String str, String str2, Context context, Fragment fragment) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(context, "context");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = context;
        this.LJLJJLL = fragment;
        this.LJLJL = null;
        ShareService shareService = C4LD.LIZ;
        Context LIZIZ = EF7.LIZIZ();
        o.LJI(aweme);
        AwemeSharePackage LJJIJIIJI = shareService.LJJIJIIJI(0, LIZIZ, aweme, enterFrom, "long_press", "long_press");
        LJJIJIIJI.extras.putString("from_page", str2);
        this.LJLJLJ = LJJIJIIJI;
    }
}
