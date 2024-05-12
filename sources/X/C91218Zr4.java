package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zr4 */
/* loaded from: classes22.dex */
public final class C91218Zr4 {
    public static boolean LIZ;

    public static boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        try {
            C16880lQ.LLLLLLZ(context.getPackageManager(), "com.moonvideo.android.resso", 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String LIZ(String str, String str2) {
        android.net.Uri parse = UriProtector.parse(str);
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        ArrayList arrayList = new ArrayList();
        for (String key : queryParameterNames) {
            String queryParameter = UriProtector.getQueryParameter(parse, key);
            if (queryParameter != null) {
                if (o.LJ(key, "entry_name")) {
                    o.LJIIIIZZ(key, "key");
                    arrayList.add(new OSZ(key, str2));
                } else {
                    arrayList.add(new OSZ(key, queryParameter));
                }
            }
        }
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            clearQuery.appendQueryParameter((String) osz.getFirst(), (String) osz.getSecond());
        }
        String uri = clearQuery.build().toString();
        o.LJIIIIZZ(uri, "builder.build().toString()");
        return uri;
    }

    public static boolean LIZJ(String str, C91605ZxJ c91605ZxJ) {
        InterfaceC91296ZsK LIZ2;
        if (str == null) {
            return false;
        }
        String str2 = null;
        if (c91605ZxJ != null && (LIZ2 = c91605ZxJ.LIZ()) != null) {
            str2 = LIZ2.getId();
        }
        if (!o.LJ(str2, str) || !ExpiredPlayableManager.INSTANCE.isLastExpiredPlayable(str)) {
            return false;
        }
        EnumC91310ZsY LJIJI = c91605ZxJ.LJIJI();
        if (!LJIJI.isStartState() && !LJIJI.isPlayingState() && !LJIJI.isPauseState()) {
            return false;
        }
        return true;
    }

    public static DspUpsellRessoStruct LIZIZ(DspUpsellRessoStruct info, boolean z, int i) {
        String str;
        String str2;
        String LIZIZ;
        String str3;
        HashMap hashMap;
        o.LJIIIZ(info, "info");
        SV9.LIZ.getClass();
        if (!SV9.LIZLLL.getEnableReplaceEntryName()) {
            LIZIZ = "tt_dsp";
        } else {
            if (i > 0) {
                if (i == 1) {
                    str = "tt_dsp_preview_mode_tips";
                } else {
                    str = "tt_dsp_preview_mode_cta";
                }
            } else if (z) {
                str = "tt_dsp_previous_song";
            } else {
                str = "tt_dsp_ls2";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            if (C52424Kho.LIZ() > 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append('_');
                LIZ3.append(C52424Kho.LIZ());
                str2 = X1D.LIZIZ(LIZ3);
            } else {
                str2 = "_10";
            }
            LIZ2.append(str2);
            LIZIZ = X1D.LIZIZ(LIZ2);
            YBM.LIZ.getClass();
            if (YBM.LIZ().getDspEntryName().length() > 0) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(LIZIZ);
                LIZ4.append('_');
                LIZ4.append(YBM.LIZ().getDspEntryName());
                LIZIZ = X1D.LIZIZ(LIZ4);
            }
        }
        if (o.LJ(LIZIZ, "tt_dsp")) {
            return info;
        }
        DspUpsellRessoStruct dspUpsellRessoStruct = new DspUpsellRessoStruct();
        dspUpsellRessoStruct.setAppLink(LIZ(info.getAppLink(), LIZIZ));
        dspUpsellRessoStruct.setDeepLink(LIZ(info.getDeepLink(), LIZIZ));
        android.net.Uri parse = UriProtector.parse(info.getDownloadLink());
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        ArrayList arrayList = new ArrayList();
        for (String key : queryParameterNames) {
            String queryParameter = UriProtector.getQueryParameter(parse, key);
            if (queryParameter != null) {
                if (o.LJ(key, "af_dp")) {
                    o.LJIIIIZZ(key, "key");
                    arrayList.add(new OSZ(key, LIZ(queryParameter, LIZIZ)));
                } else {
                    arrayList.add(new OSZ(key, queryParameter));
                }
            }
        }
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            clearQuery.appendQueryParameter((String) osz.getFirst(), (String) osz.getSecond());
        }
        String uri = clearQuery.build().toString();
        o.LJIIIIZZ(uri, "builder.build().toString()");
        dspUpsellRessoStruct.setDownloadLink(uri);
        SV7.LIZ.getClass();
        if (SV7.LJII(true)) {
            OSZ LJIIIIZZ = SV7.LJIIIIZZ(info.getStoreLink());
            if (LJIIIIZZ == null || (hashMap = (HashMap) LJIIIIZZ.getSecond()) == null || (str3 = (String) hashMap.get("af_dp")) == null) {
                str3 = "";
            }
            if (str3.length() > 0 && LJIIIIZZ != null) {
                HashMap hashMap2 = (HashMap) LJIIIIZZ.getSecond();
                if (hashMap2 != null) {
                    hashMap2.put("af_dp", LIZ(str3, LIZIZ));
                }
                String data = GsonProtectorUtils.toJson(SVF.LIZ, LJIIIIZZ.getSecond());
                String str4 = (String) LJIIIIZZ.getFirst();
                o.LJIIIIZZ(data, "data");
                dspUpsellRessoStruct.setStoreLink(new TTMStoreLink(str4, data));
            }
        }
        return dspUpsellRessoStruct;
    }

    public static void LJ(Context context, DspUpsellRessoStruct dspUpsellRessoStruct, boolean z, int i) {
        Intent intent;
        o.LJIIIZ(context, "context");
        if (dspUpsellRessoStruct == null) {
            dspUpsellRessoStruct = new DspUpsellRessoStruct();
            dspUpsellRessoStruct.setAppLink(YBK.LIZ().links.getAppLink());
            dspUpsellRessoStruct.setDeepLink(YBK.LIZ().links.getDeepLink());
            dspUpsellRessoStruct.setDownloadLink(YBK.LIZ().links.getDownloadLink());
            YBK.LIZ.getClass();
            dspUpsellRessoStruct.setStoreLink((TTMStoreLink) YBK.LIZLLL.getValue());
        }
        DspUpsellRessoStruct LIZIZ = LIZIZ(dspUpsellRessoStruct, z, i);
        if (LIZLLL(context)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (LIZIZ.getAppLink().length() == 0) {
                    return;
                } else {
                    intent = new Intent("android.intent.action.VIEW", UriProtector.parse(LIZIZ.getAppLink()));
                }
            } else {
                if (LIZIZ.getDeepLink().length() == 0) {
                    return;
                }
                intent = new Intent("android.intent.action.VIEW", UriProtector.parse(LIZIZ.getDeepLink())).setPackage("com.moonvideo.android.resso");
                o.LJIIIIZZ(intent, "{\n            // default…O_PACKAGE_NAME)\n        }");
            }
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("pns.sandbox.dataflow_id", 1207967745);
            try {
                C16880lQ.LIZJ(context, intent);
                return;
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
                return;
            }
        }
        if (LIZIZ.getDownloadLink().length() == 0) {
            return;
        }
        String downloadLink = LIZIZ.getDownloadLink();
        SV7.LIZ.getClass();
        if (SV7.LJIIJ() && SV7.LJII(true) && i == 0) {
            SVA sva = SVA.RESSO;
            String LIZJ = SV7.LIZJ(sva);
            TTMStoreLink storeLink = LIZIZ.getStoreLink();
            if (storeLink != null) {
                downloadLink = SV7.LIZ(storeLink.getLink(), LIZJ);
                SVF.LJIIL(sva, context, storeLink, LIZJ, SVG.CLICK);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("launch uri: ");
        LIZ2.append(downloadLink);
        X1D.LIZIZ(LIZ2);
        Intent intent2 = new Intent("android.intent.action.VIEW", UriProtector.parse(downloadLink));
        intent2.addCategory("android.intent.category.BROWSABLE");
        intent2.addCategory("android.intent.category.DEFAULT");
        intent2.putExtra("pns.sandbox.dataflow_id", 1207965953);
        try {
            C16880lQ.LIZJ(context, intent2);
        } catch (Exception e2) {
            C78983UzD.LJIIZILJ(e2);
        }
    }

    public static /* synthetic */ void LJFF(Context context, DspUpsellRessoStruct dspUpsellRessoStruct, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        LJ(context, dspUpsellRessoStruct, z, 0);
    }

    public static void LJI(ActivityC45651qj activityC45651qj, FragmentManager fragmentManager, InterfaceC91296ZsK interfaceC91296ZsK, String pageName) {
        String str;
        o.LJIIIZ(pageName, "pageName");
        if (LIZ) {
            return;
        }
        LIZ = true;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.b1, C16880lQ.LLZIL(activityC45651qj), null);
        if (LIZLLL(activityC45651qj)) {
            ((AppCompatImageView) LLLZIIL.findViewById(R.id.f12)).setImageResource(R.drawable.ku);
            ((TextView) LLLZIIL.findViewById(R.id.m5c)).setText(R.string.ihg);
            ((TextView) LLLZIIL.findViewById(R.id.jl)).setText(R.string.ihf);
            str = "open_resso";
        } else {
            ((AppCompatImageView) LLLZIIL.findViewById(R.id.f12)).setImageResource(R.drawable.kt);
            ((TextView) LLLZIIL.findViewById(R.id.m5c)).setText(R.string.igv);
            ((TextView) LLLZIIL.findViewById(R.id.jl)).setText(R.string.igu);
            str = "download_resso";
        }
        C16880lQ.LJJIZ((SY4) LLLZIIL.findViewById(R.id.jl), new ViewOnClickListenerC91217Zr3(LLLZIIL, activityC45651qj, interfaceC91296ZsK, pageName, str));
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark_small;
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new IDqS421S0100000_29(LLLZIIL, 73));
        ASL asl = new ASL();
        asl.LIZ.LJLLI = LLLZIIL;
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZIZ(c234529Ii);
        asl.LIZ.LJLLL = c235119Kp;
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(activityC45651qj);
        if (LIZIZ != null) {
            C91215Zr1.LIZLLL(new C91409Zu9(asl, fragmentManager, "UpsellRessoSheet", EnumC91213Zqz.UPSELL_RESSO.ordinal(), LIZIZ));
        }
        C91249ZrZ.LJIILLIIL(interfaceC91296ZsK.getEventData(), C91293ZsH.LIZ(pageName), "background_play", str, interfaceC91296ZsK.getEventData().LJ);
    }
}
