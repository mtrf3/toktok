package com.ss.android.ugc.aweme.donation.detail;

import X.ASL;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C2IP;
import X.C2U8;
import X.C62712d9;
import X.X1D;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class DonationInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        Uri uri2;
        StringBuilder LIZ = X1D.LIZ();
        String str2 = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            str = uri2.getHost();
        } else {
            str = null;
        }
        LIZ.append(str);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str2 = uri.getPath();
        }
        LIZ.append(str2);
        return s.LJJJLZIJ(X1D.LIZIZ(LIZ), "donation/pannel", false);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2;
        Intent extra;
        Intent extra2;
        Intent extra3;
        Intent extra4;
        String LLJJIJIIJIL;
        Intent extra5;
        Intent extra6;
        Intent extra7;
        Intent extra8;
        Intent extra9;
        Intent extra10;
        Intent extra11;
        Uri uri;
        Uri uri2;
        StringBuilder LIZ = X1D.LIZ();
        String str9 = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            str = uri2.getHost();
        } else {
            str = null;
        }
        LIZ.append(str);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str2 = uri.getPath();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        if (!s.LJJJLZIJ(X1D.LIZIZ(LIZ), "donation/pannel", false) || !(context instanceof ActivityC45651qj)) {
            return false;
        }
        Bundle bundle = new Bundle();
        String str10 = "";
        if (routeIntent == null || (extra11 = routeIntent.getExtra()) == null || (str3 = C16880lQ.LLJJIJIIJIL(extra11, "sticker_id")) == null) {
            str3 = "";
        }
        bundle.putString("sticker_id", str3);
        if (routeIntent != null && (extra10 = routeIntent.getExtra()) != null) {
            i = extra10.getIntExtra("ngo_id", 0);
        } else {
            i = 0;
        }
        bundle.putInt("ngo_id", i);
        if (routeIntent == null || (extra9 = routeIntent.getExtra()) == null || (str4 = C16880lQ.LLJJIJIIJIL(extra9, "ngo_name")) == null) {
            str4 = "";
        }
        bundle.putString("ngo_name", str4);
        if (routeIntent == null || (extra8 = routeIntent.getExtra()) == null || (str5 = C16880lQ.LLJJIJIIJIL(extra8, "organization_type")) == null) {
            str5 = "";
        }
        bundle.putString("organization_type", str5);
        if (routeIntent == null || (extra7 = routeIntent.getExtra()) == null || (str6 = C16880lQ.LLJJIJIIJIL(extra7, "organization_id")) == null) {
            str6 = "";
        }
        bundle.putString("organization_id", str6);
        if (routeIntent == null || (extra6 = routeIntent.getExtra()) == null || (str7 = C16880lQ.LLJJIJIIJIL(extra6, "aweme_id")) == null) {
            str7 = "";
        }
        if (routeIntent == null || (extra5 = routeIntent.getExtra()) == null || (str8 = C16880lQ.LLJJIJIIJIL(extra5, "enter_from")) == null) {
            str8 = "";
        }
        if (routeIntent != null && (extra4 = routeIntent.getExtra()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(extra4, "enter_method")) != null) {
            str10 = LLJJIJIIJIL;
        }
        int i3 = -1;
        if (routeIntent != null && (extra3 = routeIntent.getExtra()) != null) {
            i2 = extra3.getIntExtra("height", -1);
        } else {
            i2 = -1;
        }
        if (routeIntent != null && (extra2 = routeIntent.getExtra()) != null) {
            str9 = C16880lQ.LLJJIJIIJIL(extra2, "log_pb");
        }
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            i3 = extra.getIntExtra("page_type", -1);
        }
        DonationFragment donationFragment = new DonationFragment();
        bundle.putString("aid", str7);
        bundle.putString("enter_method", str10);
        bundle.putString("enter_from", str8);
        bundle.putInt("height", i2);
        bundle.putString("log_pb", str9);
        bundle.putInt("page_type", i3);
        donationFragment.setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = donationFragment;
        asl.LJI(0);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.8rk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C2U8.LIZ(new C2IP(false, false));
            }
        };
        FragmentManager supportFragmentManager = ((ActivityC45651qj) context).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "context.supportFragmentManager");
        tuxSheet.show(supportFragmentManager, "DonationFragment");
        C2U8.LIZ(new C2IP(true, false));
        return true;
    }
}
