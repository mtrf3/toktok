package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.donation.IDonationService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8qP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223818qP extends AbstractC221838nD {
    public final InterfaceC223648q8 LJLJJL;

    @Override // X.AbstractC221838nD
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
        o.LJIIIZ(stickerStruct, "stickerStruct");
        return C223998qh.LIZJ(j, stickerStruct);
    }

    public final void LJIIIIZZ(String str, String str2) {
        String str3;
        String str4;
        String str5;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        C188727au c188727au = new C188727au();
        C245649kW c245649kW = this.LJLJJI;
        String str6 = null;
        if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
            str3 = c223778qL4.LIZJ;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("group_id", str3);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
            str4 = c223778qL3.LIZIZ;
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("author_id", str4);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
            str5 = c223778qL2.LIZLLL;
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("log_pb", str5);
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
            str6 = c223778qL.LIZ;
        }
        c188727au.LJIIIZ("enter_from", str6);
        c188727au.LJIIIZ("powered_by", str);
        c188727au.LJIIIZ("ngo_name", str2);
        c188727au.LJIIIZ("sticker_type", "donation");
        FMX.LJIIL("sticker_click", c188727au.LIZ);
    }

    @Override // X.AbstractC221838nD
    public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        String str14 = "PERCENT";
        o.LJIIIZ(popListener, "popListener");
        if (C6ZT.LIZ(this.LJLILLLLZI.LIZ(6))) {
            return;
        }
        C2U8.LIZ(new C223728qG(this.LJLILLLLZI.hashCode()));
        try {
            HashMap hashMap = (HashMap) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), this.LJLJI.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.2ZG
            }.getType());
            String str15 = null;
            if (hashMap != null) {
                str = (String) hashMap.get("donation_url");
            } else {
                str = null;
            }
            if (hashMap == null) {
                str2 = null;
            } else {
                str2 = (String) hashMap.get("organization_type");
            }
            boolean equals = TextUtils.equals(str2, "PERCENT");
            if (!equals) {
                str14 = "TILTIFY";
            } else {
                if (hashMap == null) {
                    str = null;
                } else {
                    str = (String) hashMap.get("organization_id");
                }
                if (TextUtils.isEmpty(str)) {
                    str = "test";
                }
            }
            if (hashMap == null) {
                str3 = null;
            } else {
                str3 = (String) hashMap.get("donation_name");
            }
            LJIIIIZZ(str14, str3);
            if (str == null || str.length() == 0) {
                View LIZ = this.LJLILLLLZI.LIZ(6);
                if (LIZ != null) {
                    C26045AKb c26045AKb = new C26045AKb(LIZ);
                    c26045AKb.LJIIIZ(this.LJLIL.getString(R.string.ex5));
                    c26045AKb.LJIIJ();
                    return;
                }
                return;
            }
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("donation_legal_disclaimer_android_enabled", false)) {
                if (equals) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "aweme://donation/pannel");
                    buildRoute.withParam("enter_method", "sticker_click");
                    C245649kW c245649kW = this.LJLJJI;
                    if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
                        str9 = c223778qL4.LIZ;
                    } else {
                        str9 = null;
                    }
                    buildRoute.withParam("enter_from", str9);
                    C245649kW c245649kW2 = this.LJLJJI;
                    if (c245649kW2 != null) {
                        str10 = c245649kW2.LIZLLL;
                    } else {
                        str10 = null;
                    }
                    buildRoute.withParam("aweme_id", str10);
                    C245649kW c245649kW3 = this.LJLJJI;
                    if (c245649kW3 != null && (c223778qL3 = c245649kW3.LJIIZILJ) != null) {
                        str11 = c223778qL3.LIZLLL;
                    } else {
                        str11 = null;
                    }
                    buildRoute.withParam("log_pb", str11);
                    if (hashMap == null) {
                        str12 = null;
                    } else {
                        str12 = (String) hashMap.get("organization_id");
                    }
                    buildRoute.withParam("organization_id", str12);
                    if (hashMap == null) {
                        str13 = null;
                    } else {
                        str13 = (String) hashMap.get("donation_name");
                    }
                    buildRoute.withParam("ngo_name", str13);
                    if (hashMap != null) {
                        str15 = (String) hashMap.get("organization_type");
                    }
                    buildRoute.withParam("organization_type", str15);
                    buildRoute.open();
                    return;
                }
                SmartRoute buildRoute2 = SmartRouter.buildRoute(this.LJLIL, "aweme://donation/pannel");
                buildRoute2.withParam("enter_method", "sticker_click");
                C245649kW c245649kW4 = this.LJLJJI;
                if (c245649kW4 != null && (c223778qL2 = c245649kW4.LJIIZILJ) != null) {
                    str4 = c223778qL2.LIZ;
                } else {
                    str4 = null;
                }
                buildRoute2.withParam("enter_from", str4);
                C245649kW c245649kW5 = this.LJLJJI;
                if (c245649kW5 != null) {
                    str5 = c245649kW5.LIZLLL;
                } else {
                    str5 = null;
                }
                buildRoute2.withParam("aweme_id", str5);
                C245649kW c245649kW6 = this.LJLJJI;
                if (c245649kW6 != null && (c223778qL = c245649kW6.LJIIZILJ) != null) {
                    str6 = c223778qL.LIZLLL;
                } else {
                    str6 = null;
                }
                buildRoute2.withParam("log_pb", str6);
                if (hashMap == null) {
                    str7 = null;
                } else {
                    str7 = (String) hashMap.get("ngo_id");
                }
                buildRoute2.withParam("organization_id", str7);
                if (hashMap == null) {
                    str8 = null;
                } else {
                    str8 = (String) hashMap.get("donation_name");
                }
                buildRoute2.withParam("ngo_name", str8);
                if (hashMap != null) {
                    str15 = (String) hashMap.get("organization_type");
                }
                buildRoute2.withParam("organization_type", str15);
                buildRoute2.open();
                return;
            }
            IDonationService LJI = DonationServiceImpl.LJI();
            o.LJIIIIZZ(LJI, "get().getService(IDonationService::class.java)");
            Context context = this.LJLIL;
            C245649kW c245649kW7 = this.LJLJJI;
            if (c245649kW7 != null) {
                str15 = c245649kW7.LIZLLL;
            }
            LJI.LIZLLL(context, str15, str, str14, null);
        } catch (s e) {
            LJIIIIZZ("", "");
            C36922EeM.LJFF(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C223818qP(Context context, C223798qN view, InteractStickerStruct stickerStruct, C245649kW c245649kW, InterfaceC223648q8 interfaceC223648q8) {
        super(context, view, stickerStruct, c245649kW);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(stickerStruct, "stickerStruct");
        this.LJLJJL = interfaceC223648q8;
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 1541));
    }
}
