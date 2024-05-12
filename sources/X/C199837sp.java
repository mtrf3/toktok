package X;

import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.NearbyTag;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199837sp extends LinearLayout implements InterfaceC211228Qs {
    public TuxTextView LJLIL;
    public Aweme LJLILLLLZI;

    @Override // X.InterfaceC211228Qs
    public final void LIZ() {
        String str;
        String str2;
        String str3;
        CharSequence text;
        String authorUid;
        boolean isSystemPrecise = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSystemPrecise(EF7.LIZIZ());
        boolean isInAppPrecise = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isInAppPrecise();
        boolean LJIJ = LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_nearby");
        Aweme aweme = this.LJLILLLLZI;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getGroupId();
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("group_id", str);
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null && (authorUid = aweme2.getAuthorUid()) != null) {
            str5 = authorUid;
        }
        c188727au.LJIIIZ("author_id", str5);
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null && (text = tuxTextView.getText()) != null) {
            str4 = text.toString();
        }
        c188727au.LJIIIZ("label_text", str4);
        String str6 = "1";
        if (LJIJ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("enable_location", str2);
        if (isSystemPrecise) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("system_is_precise", str3);
        if (!isInAppPrecise) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("inapp_is_precise", str6);
        FMX.LJIIL("region_label_show", c188727au.LIZ);
    }

    @Override // X.InterfaceC211228Qs
    public void setData(Aweme aweme) {
        String str;
        NearbyTag nearbyTag;
        o.LJIIIZ(aweme, "aweme");
        this.LJLILLLLZI = aweme;
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView == null) {
            return;
        }
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        if (poiDataStruct != null && (nearbyTag = poiDataStruct.getNearbyTag()) != null) {
            str = nearbyTag.getText();
        } else {
            str = null;
        }
        tuxTextView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199837sp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        a1.LJFF(context, "context");
        setGravity(16);
        boolean z = false;
        setOrientation(0);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(2));
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.m5);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        setBackground(c110614Vt.LIZ(context2));
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        TuxIconView tuxIconView = new TuxIconView(context3, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)));
        tuxIconView.setLayoutParams(layoutParams);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LIZ = R.raw.icon_map_pin_fill;
        tuxIconView.setTuxIcon(c2068389v);
        addView(tuxIconView);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        TuxTextView tuxTextView = new TuxTextView(context4, null, 6, 0);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        Context context5 = tuxTextView.getContext();
        o.LJIIIIZZ(context5, "context");
        Integer LJI = C79045V0n.LJI(R.attr.dj, context5);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        tuxTextView.setTextColor(i);
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && aweme.isAd()) {
            z = true;
        }
        C2055284u.LIZLLL(tuxTextView, 4, 62, z);
        this.LJLIL = tuxTextView;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        layoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        tuxTextView.setLayoutParams(layoutParams2);
        addView(this.LJLIL);
        post(new ARunnableS37S0100000_1(this, 165));
    }
}
