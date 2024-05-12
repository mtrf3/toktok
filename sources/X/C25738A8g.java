package X;

import Y.ARunnableS23S0200000_4;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.TicketMasterAnchorExtra;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.A8g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25738A8g extends C8IM {
    public final TuxTextView LJLJJL;
    public final TuxTextView LJLJJLL;
    public final SmartImageView LJLJL;
    public final LinearLayout LJLJLJ;
    public boolean LJLJLLL;
    public long LJLL;
    public InterfaceC44105HSr LJLLI;
    public AnchorCommonStruct LJLLILLLL;
    public TicketMasterAnchorExtra LJLLJ;
    public C188727au LJLLL;

    @Override // X.C8IM
    public final void LJIIIZ() {
        TuxTextView tuxTextView;
        CharSequence text;
        String str;
        java.util.Map LJJJLIIL;
        String LJJLJLI;
        this.LJLJJI = true;
        if (!this.LJLJLLL && (tuxTextView = this.LJLJJLL) != null && (text = tuxTextView.getText()) != null && text.length() > 0) {
            this.LJLJLLL = true;
            LinearLayout linearLayout = this.LJLJLJ;
            if (linearLayout != null) {
                ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(linearLayout, new ARunnableS23S0200000_4(linearLayout, this, 31));
            }
            InterfaceC44105HSr interfaceC44105HSr = this.LJLLI;
            String str2 = "";
            if (interfaceC44105HSr == null || (str = interfaceC44105HSr.LJJLIIIJLLLLLLLZ()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                str = "video_anchor";
            }
            C188727au originalMobParam = getOriginalMobParam();
            C188727au c188727au = this.LJLLL;
            if (c188727au == null || (LJJJLIIL = c188727au.LIZ) == null) {
                LJJJLIIL = C113554cx.LJJJLIIL();
            }
            originalMobParam.LJII(new HashMap(LJJJLIIL));
            InterfaceC44105HSr interfaceC44105HSr2 = this.LJLLI;
            if (interfaceC44105HSr2 != null && (LJJLJLI = interfaceC44105HSr2.LJJLJLI()) != null) {
                str2 = LJJLJLI;
            }
            originalMobParam.LJIIIZ("enter_from", str2);
            originalMobParam.LJIIIZ("enter_method", str);
            FMX.LJIIL("multi_anchor_entrance_expand", originalMobParam.LIZ);
        }
    }

    private final C188727au getOriginalMobParam() {
        String str;
        Aweme LJJLL;
        String aid;
        Aweme LJJLL2;
        C188727au c188727au = new C188727au();
        InterfaceC44105HSr interfaceC44105HSr = this.LJLLI;
        String str2 = "";
        if (interfaceC44105HSr == null || (LJJLL2 = interfaceC44105HSr.LJJLL()) == null || (str = LJJLL2.getAuthorUid()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("author_id", str);
        InterfaceC44105HSr interfaceC44105HSr2 = this.LJLLI;
        if (interfaceC44105HSr2 != null && (LJJLL = interfaceC44105HSr2.LJJLL()) != null && (aid = LJJLL.getAid()) != null) {
            str2 = aid;
        }
        c188727au.LJIIIZ("group_id", str2);
        return c188727au;
    }

    @Override // X.C8IG
    public final void LIZIZ() {
        C17N.LJJIIJZLJL(this.LJLJJLL);
        this.LJLJLLL = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25738A8g(Context context) {
        super(context);
        int i;
        a1.LJFF(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.aex, C16880lQ.LLZIL(context), this);
        C110614Vt c110614Vt = new C110614Vt();
        if (C87026YDm.LIZIZ()) {
            i = R.attr.l2;
        } else {
            i = R.attr.ch;
        }
        c110614Vt.LIZIZ = Integer.valueOf(i);
        c110614Vt.LIZJ = C61328O5c.LIZJ(4);
        LLLZIIL.setBackground(c110614Vt.LIZ(context));
        this.LJLJLJ = (LinearLayout) findViewById(R.id.g6o);
        this.LJLJJL = (TuxTextView) findViewById(R.id.mo6);
        this.LJLJL = (SmartImageView) findViewById(R.id.f51);
        this.LJLJJLL = (TuxTextView) findViewById(R.id.mlr);
    }

    @Override // X.C8IM
    public final boolean LJII(C188727au c188727au) {
        this.LJLLL = c188727au;
        return true;
    }

    public final void LJIIJ(C188727au c188727au) {
        Activity LIZ;
        AnchorCommonStruct anchorCommonStruct;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String LJJLJLI;
        Aweme LJJLL;
        Aweme LJJLL2;
        Aweme LJJLL3;
        InterfaceC44105HSr interfaceC44105HSr = this.LJLLI;
        if (interfaceC44105HSr == null || (LIZ = interfaceC44105HSr.LIZ()) == null || (anchorCommonStruct = this.LJLLILLLL) == null) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(LIZ, anchorCommonStruct.getSchema());
        InterfaceC44105HSr interfaceC44105HSr2 = this.LJLLI;
        Aweme aweme = null;
        if (interfaceC44105HSr2 != null) {
            str = interfaceC44105HSr2.LJJLJLI();
        } else {
            str = null;
        }
        InterfaceC44105HSr interfaceC44105HSr3 = this.LJLLI;
        if (interfaceC44105HSr3 != null) {
            aweme = interfaceC44105HSr3.LJJLL();
        }
        InterfaceC44105HSr interfaceC44105HSr4 = this.LJLLI;
        String str10 = "";
        if (interfaceC44105HSr4 == null || (str2 = interfaceC44105HSr4.LJJLIIIJLLLLLLLZ()) == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str2 = "video_anchor";
        }
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", str2);
        if (aweme == null || (str3 = aweme.getAuthorUid()) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("author_id", str3);
        if (aweme == null || (str4 = aweme.getAid()) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("group_id", str4);
        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(aweme));
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "eventMapBuilder\n        …))\n            .builder()");
        buildRoute.withParam("anchor_event_map", (HashMap) map);
        InterfaceC44105HSr interfaceC44105HSr5 = this.LJLLI;
        if (interfaceC44105HSr5 == null || (LJJLL3 = interfaceC44105HSr5.LJJLL()) == null || (str5 = LJJLL3.getAuthorUid()) == null) {
            str5 = "";
        }
        buildRoute.withParam("author_id", str5);
        InterfaceC44105HSr interfaceC44105HSr6 = this.LJLLI;
        if (interfaceC44105HSr6 == null || (LJJLL2 = interfaceC44105HSr6.LJJLL()) == null || (str6 = LJJLL2.getAid()) == null) {
            str6 = "";
        }
        buildRoute.withParam("group_id", str6);
        buildRoute.withParam("anchor_id", anchorCommonStruct.getId());
        InterfaceC44105HSr interfaceC44105HSr7 = this.LJLLI;
        if (interfaceC44105HSr7 == null || (str7 = interfaceC44105HSr7.LJJLJLI()) == null) {
            str7 = "";
        }
        buildRoute.withParam("enter_from", str7);
        InterfaceC44105HSr interfaceC44105HSr8 = this.LJLLI;
        if (interfaceC44105HSr8 == null || (LJJLL = interfaceC44105HSr8.LJJLL()) == null || (str8 = LJJLL.getAid()) == null) {
            str8 = "";
        }
        buildRoute.withParam("from_group_id", str8);
        InterfaceC44105HSr interfaceC44105HSr9 = this.LJLLI;
        if (interfaceC44105HSr9 == null || (str9 = interfaceC44105HSr9.LJJLJLI()) == null) {
            str9 = "";
        }
        buildRoute.withParam("previous_page", str9);
        InterfaceC44105HSr interfaceC44105HSr10 = this.LJLLI;
        if (interfaceC44105HSr10 != null && (LJJLJLI = interfaceC44105HSr10.LJJLJLI()) != null) {
            str10 = LJJLJLI;
        }
        buildRoute.withParam("detail_aweme_from", str10);
        buildRoute.withParam("anchor_subtype", anchorCommonStruct.subType());
        buildRoute.withParam("anchor_click_time", SystemClock.elapsedRealtime());
        buildRoute.open();
    }

    @QD3
    public final void onWebViewFinish(C25741A8j event) {
        String str;
        java.util.Map LJJJLIIL;
        o.LJIIIZ(event, "event");
        InterfaceC44105HSr interfaceC44105HSr = this.LJLLI;
        if (interfaceC44105HSr == null || (str = interfaceC44105HSr.LJJLIIIJLLLLLLLZ()) == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = "video_anchor";
        }
        C188727au originalMobParam = getOriginalMobParam();
        C188727au c188727au = this.LJLLL;
        if (c188727au == null || (LJJJLIIL = c188727au.LIZ) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        originalMobParam.LJII(new HashMap(LJJJLIIL));
        originalMobParam.LJIIIZ("enter_method", str);
        originalMobParam.LJ(event.LJLIL, "duration");
        FMX.LJIIL("multi_anchor_stay_time", originalMobParam.LIZ);
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8IG
    public final void LJ(C188727au c188727au, InterfaceC88472Yns<? super Boolean, C76800UCe> useCustomAction) {
        Activity LIZ;
        AnchorCommonStruct anchorCommonStruct;
        o.LJIIIZ(useCustomAction, "useCustomAction");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.LJLL > 300) {
            this.LJLL = elapsedRealtime;
            this.LJLLL = c188727au;
            EventBus.LIZJ().LJIILJJIL(this);
            if (C25740A8i.LIZ()) {
                LJIIJ(c188727au);
                return;
            }
            InterfaceC44105HSr interfaceC44105HSr = this.LJLLI;
            if (interfaceC44105HSr == null || (LIZ = interfaceC44105HSr.LIZ()) == null || (anchorCommonStruct = this.LJLLILLLL) == null) {
                return;
            }
            try {
                C16880lQ.LLLLLLZ(LIZ.getPackageManager(), "com.ticketmaster.mobile.android.na", 0);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setPackage("com.ticketmaster.mobile.android.na");
                if (C78685UuP.LJJJZ(anchorCommonStruct.getUniversalLink()) && Build.VERSION.SDK_INT >= 23) {
                    intent.setData(UriProtector.parse(anchorCommonStruct.getUniversalLink()));
                    C16880lQ.LIZIZ(LIZ, intent);
                } else if (C78685UuP.LJJJZ(anchorCommonStruct.getDeepLink())) {
                    intent.setData(UriProtector.parse(anchorCommonStruct.getDeepLink()));
                    C16880lQ.LIZIZ(LIZ, intent);
                } else {
                    LJIIJ(c188727au);
                }
            } catch (PackageManager.NameNotFoundException e) {
                C16880lQ.LLLLIIL(e);
                LJIIJ(c188727au);
            }
        }
    }

    @Override // X.C8IG
    public final void LIZLLL(AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, int i, InterfaceC65784Pro commonClickAction) {
        Object obj;
        String str;
        o.LJIIIZ(commonClickAction, "commonClickAction");
        this.LJLLI = interfaceC44105HSr;
        this.LJLLILLLL = anchorCommonStruct;
        String str2 = null;
        try {
            obj = ((Gson) C25742A8k.LIZ.getValue()).LJI(anchorCommonStruct.getExtra(), TicketMasterAnchorExtra.class);
        } catch (Exception unused) {
            obj = null;
        }
        this.LJLLJ = (TicketMasterAnchorExtra) obj;
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            AnchorCommonStruct anchorCommonStruct2 = this.LJLLILLLL;
            if (anchorCommonStruct2 != null) {
                str = anchorCommonStruct2.getKeyword();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LJLJJLL;
        if (tuxTextView2 != null) {
            TicketMasterAnchorExtra ticketMasterAnchorExtra = this.LJLLJ;
            if (ticketMasterAnchorExtra != null) {
                str2 = ticketMasterAnchorExtra.subTitle;
            }
            tuxTextView2.setText(str2);
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(anchorCommonStruct.getIcon()));
        LJII.LJJIIJ = this.LJLJL;
        C16880lQ.LLJJJ(LJII);
    }
}
