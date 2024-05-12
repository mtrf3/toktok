package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OdN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62341OdN implements InterfaceC62474OfW {
    public final /* synthetic */ PhotoSharePackage LIZ;

    public C62341OdN(PhotoSharePackage photoSharePackage) {
        this.LIZ = photoSharePackage;
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
        OQD.LIZIZ(baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        OQD.LIZJ(sharePackage, context);
        ScreenShotService.LJIIIZ().LIZIZ(false);
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC62486Ofi interfaceC62486Ofi) {
        OQD.LIZ(interfaceC62486Ofi, baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJFF(View view, C62387Oe7 sharePanelConfig, C5JV c5jv) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        OQD.LIZLLL(view, sharePanelConfig, c5jv);
        ScreenShotService.LJIIIZ().LIZIZ(true);
    }

    @Override // X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        String str7;
        String str8;
        int i2;
        Bundle bundle;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        Bundle bundle7;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        PhotoSharePackage photoSharePackage = this.LIZ;
        C50921Jyf c50921Jyf = new C50921Jyf();
        c50921Jyf.LJJLIIIIJ = channel.key();
        C62398OeI c62398OeI = this.LIZ.params;
        c50921Jyf.LIZLLL = c62398OeI.LIZLLL;
        c50921Jyf.LJJLIL = c62398OeI.LJ;
        c50921Jyf.LJJIIZ(c62398OeI.LIZIZ);
        C62398OeI c62398OeI2 = this.LIZ.params;
        c50921Jyf.LJJZZIII = c62398OeI2.LJIIIIZZ;
        Aweme aweme = c62398OeI2.LIZIZ;
        String str9 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str10 = "";
        if (str == null) {
            str = "";
        }
        c50921Jyf.LJJL = str;
        Aweme aweme2 = this.LIZ.params.LIZIZ;
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        c50921Jyf.LJJLI = str2;
        c50921Jyf.LJJLIIIJ = C62340OdM.LJFF(channel.key()).ordinal();
        if (baseSharePackage == null || (bundle7 = baseSharePackage.extras) == null || (str3 = bundle7.getString("share_form")) == null) {
            str3 = "video_form";
        }
        c50921Jyf.LJLLL = str3;
        if (baseSharePackage == null || (bundle6 = baseSharePackage.extras) == null || (str4 = bundle6.getString("now_type")) == null) {
            str4 = "";
        }
        c50921Jyf.LJJLIIIJILLIZJL = str4;
        if (baseSharePackage == null || (bundle5 = baseSharePackage.extras) == null || (str5 = bundle5.getString("OG_type")) == null) {
            str5 = "";
        }
        c50921Jyf.LJJLIIIJJI = str5;
        if (baseSharePackage != null && (bundle4 = baseSharePackage.extras) != null) {
            i = bundle4.getInt("is_today");
        } else {
            i = 1;
        }
        c50921Jyf.LJJLIIIJJIZ = i;
        if (baseSharePackage == null || (bundle3 = baseSharePackage.extras) == null || (str6 = bundle3.getString("is_self")) == null) {
            str6 = "";
        }
        c50921Jyf.LJJLIIIJL = str6;
        if (baseSharePackage == null || (bundle2 = baseSharePackage.extras) == null || (str7 = bundle2.getString("privacy_setting")) == null) {
            str7 = "";
        }
        c50921Jyf.LJJLIIIJLJLI = str7;
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("panel_source")) != null) {
            str10 = string;
        }
        c50921Jyf.LJJLJ = str10;
        Aweme aweme3 = photoSharePackage.params.LIZIZ;
        if (aweme3 != null && (aweme3.getAwemeType() == 41 || aweme3.getAwemeType() == 43)) {
            NowPostInfo nowPostInfo = aweme3.nowPostInfo;
            if (nowPostInfo == null || (str8 = nowPostInfo.getNowMediaType()) == null) {
                str8 = "post";
            }
            c50921Jyf.LIZLLL("now_type", str8);
            NowPostInfo nowPostInfo2 = aweme3.nowPostInfo;
            if (nowPostInfo2 != null) {
                i2 = C78847Ux1.LJJIJIIJIL(nowPostInfo2);
            } else {
                i2 = 1;
            }
            c50921Jyf.LIZJ(i2, "has_small_window");
            c50921Jyf.LIZJ(C78847Ux1.LJJJJ(aweme3), "is_original");
            c50921Jyf.LIZLLL("log_pb", C227768wm.LJIIZILJ(aweme3));
        }
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        Bundle bundle8 = baseSharePackage.extras;
        if (bundle8 != null) {
            str9 = bundle8.getString("enter_position");
        }
        c50921Jyf.LIZLLL("enter_position", str9);
        c50921Jyf.LJIILIIL();
        if (z) {
            PhotoSharePackage photoSharePackage2 = this.LIZ;
            Aweme aweme4 = photoSharePackage2.params.LIZIZ;
            if (aweme4 != null) {
                C10K.LIZJ(new CallableC62425Oej(channel.key(), aweme4, photoSharePackage2.params.LIZLLL));
            }
            this.LIZ.getClass();
            if (!PhotoSharePackage.doNotRecordChannels.contains(channel.key())) {
                C44384HbQ.LLII(channel.key());
            }
            Activity LJIILLIIL = this.LIZ.LJIILLIIL();
            if (LJIILLIIL != null) {
                C57135Mbb.LIZIZ.LIZLLL().LIZ(LJIILLIIL, this.LIZ.params.LIZ, channel.key());
            }
        }
    }

    @Override // X.InterfaceC110854Wr
    public final Object LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC62474OfW
    public final void LJI(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        String str;
        Bundle bundle;
        String string;
        Bundle bundle2;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        if (o.LJ(this.LIZ.params.LIZ, "now_post") || o.LJ(this.LIZ.params.LIZ, "now_video") || o.LJ(this.LIZ.params.LIZ, "now_post_memory") || o.LJ(this.LIZ.params.LIZ, "now_others_post") || o.LJ(this.LIZ.params.LIZ, "now_others_video_post") || o.LJ(this.LIZ.params.LIZ, "now_video_memory")) {
            String key = channel.key();
            if (z) {
                str = "success";
            } else {
                str = "fail";
            }
            String str2 = null;
            if (baseSharePackage != null && (bundle2 = baseSharePackage.extras) != null) {
                str2 = bundle2.getString("now_type");
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("is_self")) != null) {
                str3 = string;
            }
            C62468OfQ.LJII(baseSharePackage, key, str, str2, str3, 32);
        }
    }
}
