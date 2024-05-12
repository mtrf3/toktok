package com.ss.android.ugc.aweme.ui;

import X.C16880lQ;
import X.C2068389v;
import X.C2K0;
import X.C55096Ljo;
import X.C73305Spp;
import X.C73306Spq;
import X.C78685UuP;
import X.C86V;
import X.FMX;
import X.InterfaceC55102Lju;
import X.Q8U;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS71S1100000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class NearbyFeatureNotAvailableAssem extends UISlotAssem implements INearbyFeatureNotAvailableAbility, InterfaceC55102Lju {
    public C73305Spp LJLJLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -361057552) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bw7;
    }

    public NearbyFeatureNotAvailableAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyFeatureNotAvailableAbility
    public final void show() {
        getContainerView().setVisibility(0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "homepage_nearby");
        linkedHashMap.put("is_no_new_videos", CardStruct.IStatusCode.DEFAULT);
        FMX.LJIIL("no_videos_page_show", linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        String str1 = C86V.LJFF(R.string.il6);
        View findViewById = view.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.status_view)");
        C73305Spp c73305Spp = (C73305Spp) findViewById;
        this.LJLJLLL = c73305Spp;
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_unavailable_region;
        c2068389v.LJ = Integer.valueOf(R.attr.dn);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        String LJFF = C86V.LJFF(R.string.il8);
        o.LJIIIIZZ(LJFF, "getString(R.string.nearby_not_available_title)");
        c73306Spq.LJFF = LJFF;
        o.LJIIIIZZ(str1, "str1");
        String str2 = NearbyTabConfig.LIZIZ().learnMoreUrlFeatureNotAvailable;
        if (str2 != null && C78685UuP.LJJJZ(str2)) {
            String str22 = C86V.LJFF(R.string.il7);
            String LLLZ = C16880lQ.LLLZ(str1, Arrays.copyOf(new Object[]{str22}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            o.LJIIIIZZ(str22, "str2");
            int LJJLIIIJL = s.LJJLIIIJL(LLLZ, str22, 0, false, 6);
            str = str1;
            if (LJJLIIIJL >= 0) {
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(LLLZ);
                final AqS71S1100000_3 aqS71S1100000_3 = new AqS71S1100000_3(this, str2, 2);
                final Context context = getContext();
                valueOf.setSpan(new ClickableSpan(context, aqS71S1100000_3) { // from class: X.8Ti
                    public final InterfaceC65784Pro<C76800UCe> LJLIL;
                    public final Context LJLILLLLZI;

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View widget) {
                        o.LJIIIZ(widget, "widget");
                        this.LJLIL.invoke();
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint ds) {
                        o.LJIIIZ(ds, "ds");
                        super.updateDrawState(ds);
                        Context context2 = this.LJLILLLLZI;
                        if (context2 != null) {
                            ds.setColor(context2.getResources().getColor(R.color.c0));
                            ds.setUnderlineText(false);
                        }
                    }

                    {
                        this.LJLIL = aqS71S1100000_3;
                        this.LJLILLLLZI = context;
                    }
                }, LJJLIIIJL, LLLZ.length(), 18);
                str = valueOf;
            }
        } else {
            str = Q8U.LIZIZ(new Object[]{""}, 1, str1, "format(format, *args)");
        }
        c73306Spq.LJI = str;
        c73305Spp.setStatus(c73306Spq);
        C73305Spp c73305Spp2 = this.LJLJLLL;
        if (c73305Spp2 != null) {
            c73305Spp2.setLayoutVariant(0);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }
}
