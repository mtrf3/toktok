package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HkC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44928HkC extends AbstractC44912Hjw implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLL = 0;
    public final Activity LJLIL;
    public final Aweme LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final C44931HkF LJLJJLL;
    public boolean LJLJL;
    public android.net.Uri LJLJLJ;
    public SharePackage LJLJLLL;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_arrow_to_bottom;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_arrow_down_to_line_bold;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "save";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = this.LJLILLLLZI.awemeACLShareInfo;
        if (awemeACLShare != null && (downloadGeneral = awemeACLShare.getDownloadGeneral()) != null && downloadGeneral.getShowType() == 2 && C85990Xow.LJIIJ() && C1A7.LJIILLIIL("user_growth").LIZ(-1, "japan_share_download_dot") != 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = this.LJLILLLLZI.awemeACLShareInfo;
        if (awemeACLShare != null && (downloadGeneral = awemeACLShare.getDownloadGeneral()) != null && downloadGeneral.getShowType() == 2 && this.LJLILLLLZI.isSharedStoryVisible()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        if (C44938HkM.LIZIZ() && C44938HkM.LIZ()) {
            return R.string.ge0;
        }
        if (Z89.LIZIZ.LIZIZ(this.LJLILLLLZI)) {
            return R.string.j6f;
        }
        if (C1DF.LJJIII(this.LJLILLLLZI)) {
            return R.string.tr7;
        }
        return R.string.q9o;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        SharePackage sharePackage2 = (SharePackage) sharePackage;
        this.LJLJLLL = sharePackage2;
        if (C217628gQ.LIZIZ.LIZJ(this.LJLIL)) {
            C44936HkK.LIZ(new AqS154S0200000_7(sharePackage, this, 86));
        } else {
            LIZJ(this.LJLIL, context, this.LJLILLLLZI, sharePackage2, this.LJLJJI, this.LJLJI, this.LJLJJLL);
        }
    }

    @Override // X.AbstractC44912Hjw
    public final void LJII(Context context, C44913Hjx downloadActionConfig) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(downloadActionConfig, "downloadActionConfig");
        Aweme aweme = this.LJLILLLLZI;
        LJIIL(aweme, this.LJLIL, downloadActionConfig.LJ, this.LJLJI, C227738wj.LIZLLL(aweme), false, this.LJLJLLL);
    }

    public final void LJIIJ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJFF(Boolean.valueOf(TextUtils.isEmpty(str2)), "download_result");
        c188727au.LJIIIZ("group_id", this.LJLILLLLZI.getAid());
        c188727au.LJIIIZ("author_id", C227768wm.LIZJ(this.LJLILLLLZI));
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("download_without_logo_status", c188727au.LIZ);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }

    public C44928HkC(Activity activity, Aweme aweme, String eventType, String downloadMethod, String actionType) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(downloadMethod, "downloadMethod");
        o.LJIIIZ(actionType, "actionType");
        this.LJLIL = activity;
        this.LJLILLLLZI = aweme;
        this.LJLJI = eventType;
        this.LJLJJI = downloadMethod;
        this.LJLJJL = actionType;
        this.LJLJJLL = new C44931HkF(this);
        this.LJLJL = true;
    }

    public /* synthetic */ C44928HkC(Activity activity, Aweme aweme, String str, String str2, int i) {
        this(activity, aweme, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) == 0 ? null : "");
    }

    public final void LJIIL(Aweme aweme, Context context, int i, String str, boolean z, boolean z2, SharePackage sharePackage) {
        boolean z3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Bundle bundle;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        Bundle bundle7;
        Bundle bundle8;
        Bundle bundle9;
        String string2;
        Bundle bundle10;
        Bundle bundle11;
        Bundle bundle12;
        Bundle bundle13;
        String enterFrom = str;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "eventType");
        C44938HkM.LJIIJJI = enterFrom;
        C44938HkM.LJIIL = i;
        C44938HkM.LJIILL = sharePackage;
        C62443Of1.LIZJ(aweme, enterFrom);
        C44931HkF c44931HkF = this.LJLJJLL;
        if (c44931HkF != null) {
            enterFrom = c44931HkF.LJLIL.LJLJI;
        }
        int LJJJIL = C79004UzY.LJJJIL(context, aweme);
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableSaveOwnVideoWithoutWatermask() && C025908h.LJFF(false, aweme.getAuthorUid())) {
            z3 = true;
        } else {
            z3 = false;
        }
        Z8A z8a = Z8A.LIZIZ;
        String str12 = null;
        if (sharePackage != null && (bundle13 = sharePackage.extras) != null) {
            str2 = bundle13.getString("enter_from");
        } else {
            str2 = null;
        }
        String str13 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (sharePackage == null || (bundle12 = sharePackage.extras) == null || (str3 = bundle12.getString("enter_method")) == null) {
            str3 = "";
        }
        if (!z8a.isFromProfileLongPress(str2, str3) || sharePackage == null || (bundle11 = sharePackage.extras) == null || (str4 = bundle11.getString("detail_tab_name")) == null) {
            str4 = "";
        }
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        GScope gScope = GScope.LJLIL;
        o.LJIIIIZZ(enterFrom, "enterFrom");
        if (sharePackage == null || (bundle10 = sharePackage.extras) == null || (str5 = bundle10.getString("download_method")) == null) {
            str5 = "";
        }
        C55247LmF.LIZIZ(gScope, new C62840OlQ(aweme, enterFrom, str5, str4, LJJJIL, LIZ), C62840OlQ.class, "Download");
        String str14 = "1";
        if (((Boolean) C52812Ko4.LIZ.getValue()).booleanValue() || C1DF.LJJIII(aweme)) {
            C44919Hk3 c44919Hk3 = new C44919Hk3(context, aweme, this, enterFrom, z, z2);
            Bundle bundle14 = new Bundle();
            if (sharePackage == null || (bundle8 = sharePackage.extras) == null || (str6 = bundle8.getString("download_method")) == null) {
                str6 = "";
            }
            bundle14.putString("download_method", str6);
            bundle14.putString("download_id", LIZ);
            if (!C62814Ol0.LJIL(aweme)) {
                str14 = CardStruct.IStatusCode.DEFAULT;
            }
            bundle14.putString("is_self_video", str14);
            bundle14.putInt("aweme_type", aweme.getAwemeType());
            if (sharePackage == null || (bundle7 = sharePackage.extras) == null || (str7 = bundle7.getString("enter_from")) == null) {
                str7 = "";
            }
            if (sharePackage == null || (bundle6 = sharePackage.extras) == null || (str8 = bundle6.getString("enter_method")) == null) {
                str8 = "";
            }
            if (z8a.isFromProfileLongPress(str7, str8)) {
                C44938HkM.LJIILJJIL = false;
                if (sharePackage != null && (bundle5 = sharePackage.extras) != null) {
                    str12 = bundle5.getString("detail_tab_name");
                }
                C44938HkM.LJIILIIL = str12;
                if (sharePackage == null || (bundle4 = sharePackage.extras) == null || (str9 = bundle4.getString("profile_uid")) == null) {
                    str9 = "";
                }
                bundle14.putString("profile_uid", str9);
                if (sharePackage == null || (bundle3 = sharePackage.extras) == null || (str10 = bundle3.getString("enter_method")) == null) {
                    str10 = "";
                }
                bundle14.putString("enter_method", str10);
                if (sharePackage == null || (bundle2 = sharePackage.extras) == null || (str11 = bundle2.getString("enter_from")) == null) {
                    str11 = "";
                }
                bundle14.putString("enter_from", str11);
                if (sharePackage != null && (bundle = sharePackage.extras) != null && (string = bundle.getString("detail_tab_name")) != null) {
                    str13 = string;
                }
                bundle14.putString("detail_tab_name", str13);
            }
            C87760YcO.LIZ(C44953Hkb.LIZ(context, c44919Hk3, aweme, enterFrom, this.LJLJJI, bundle14, false, "download_action", i, "download", this.LJLJJL, LJJJIL, z3));
            return;
        }
        C45344Hqu c45344Hqu = new C45344Hqu(context, i, false, "download");
        Bundle bundle15 = c45344Hqu.LLIIJLIL;
        if (sharePackage != null && (bundle9 = sharePackage.extras) != null && (string2 = bundle9.getString("download_method")) != null) {
            str13 = string2;
        }
        bundle15.putString("download_method", str13);
        bundle15.putString("download_id", LIZ);
        if (!C62814Ol0.LJIL(aweme)) {
            str14 = CardStruct.IStatusCode.DEFAULT;
        }
        bundle15.putString("is_self_video", str14);
        bundle15.putInt("aweme_type", aweme.getAwemeType());
        C44930HkE.LIZ(c45344Hqu, sharePackage);
        c45344Hqu.LLIIJI = enterFrom;
        C44938HkM.LJI = enterFrom;
        String enterMethod = this.LJLJJI;
        o.LJIIIZ(enterMethod, "enterMethod");
        c45344Hqu.LLIIL = enterMethod;
        C44938HkM.LJII = enterMethod;
        c45344Hqu.LLIILII = LJJJIL;
        String actionType = this.LJLJJL;
        o.LJIIIZ(actionType, "actionType");
        c45344Hqu.LLIIIZ = actionType;
        C44920Hk4 c44920Hk4 = new C44920Hk4(context, aweme, this, enterFrom, z, z2);
        c45344Hqu.LJLLL = c44920Hk4;
        C44935HkJ.LIZ = c44920Hk4;
        c45344Hqu.LJIIJ(aweme, "download_action", z3);
    }
}
