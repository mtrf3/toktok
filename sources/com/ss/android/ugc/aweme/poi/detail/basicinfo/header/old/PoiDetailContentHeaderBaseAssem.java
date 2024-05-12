package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old;

import X.C16880lQ;
import X.C190497dl;
import X.C190597dv;
import X.C191187es;
import X.C1FL;
import X.C2068389v;
import X.C214298b3;
import X.C32151Nz;
import X.C51556KLg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77123UOp;
import X.C78685UuP;
import X.C78926UyI;
import X.C8VV;
import X.C90193gN;
import X.C9BE;
import X.EnumC189997cx;
import X.O6R;
import X.X1D;
import Y.ACListenerS0S4210000_3;
import Y.ACListenerS25S1200000_3;
import Y.ACListenerS38S0200000_3;
import Y.IDTListenerS113S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingProviderInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class PoiDetailContentHeaderBaseAssem extends UIContentAssem {
    public View LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final String LJLJI;
    public final IDqS428S0100000_3 LJLJJI;

    public abstract void F3(View view);

    public PoiDetailContentHeaderBaseAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiCollectStatusViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 714), C190597dv.INSTANCE, null);
        this.LJLJI = "poi_detail";
        this.LJLJJI = new IDqS428S0100000_3(this, 11);
    }

    public final View v3() {
        View view = this.LJLIL;
        if (view != null) {
            return view;
        }
        o.LJIJI("parentView");
        throw null;
    }

    public final void E3(PoiListApi.PoiDetailResponse poiDetailResponse) {
        int i;
        View findViewById = v3().findViewById(R.id.htw);
        FatherPoiModel fatherPoiModel = poiDetailResponse.fatherPoi;
        if (fatherPoiModel != null && C78685UuP.LJJJZ(fatherPoiModel.getKeyword())) {
            findViewById.setVisibility(0);
            TextView textView = (TextView) v3().findViewById(R.id.htv);
            textView.setText(new SpannableStringBuilder(fatherPoiModel.getKeyword()));
            if (C90193gN.LIZIZ(textView.getContext())) {
                i = 4;
            } else {
                i = 3;
            }
            textView.setTextDirection(i);
            C16880lQ.LJIJI(textView, new ACListenerS38S0200000_3(fatherPoiModel, this, 43));
            textView.setOnTouchListener(new IDTListenerS113S0100000_3(this, 11));
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        ViewGroup viewGroup = (ViewGroup) view;
        this.LJLIL = C1FL.LIZIZ(viewGroup, R.layout.bzt, viewGroup, true, "from(containerView.conte…d(), containerView, true)");
        F3(view);
    }

    public final boolean x3(PoiListApi.PoiDetailResponse poiDetailResponse) {
        List<PoiBookingProviderInfo> providers;
        PoiBookingProviderInfo poiBookingProviderInfo;
        PoiBookingInfo poiBookingInfo = poiDetailResponse.bookingInfo;
        String str = null;
        if (poiBookingInfo != null && (providers = poiBookingInfo.getProviders()) != null) {
            Iterator<PoiBookingProviderInfo> it = providers.iterator();
            while (true) {
                if (it.hasNext()) {
                    poiBookingProviderInfo = it.next();
                    Integer provider = poiBookingProviderInfo.getProvider();
                    if (provider != null && provider.intValue() == 1) {
                        break;
                    }
                } else {
                    poiBookingProviderInfo = null;
                    break;
                }
            }
            PoiBookingProviderInfo poiBookingProviderInfo2 = poiBookingProviderInfo;
            if (poiBookingProviderInfo2 != null) {
                str = poiBookingProviderInfo2.getUrl();
            }
        }
        return C78685UuP.LJJJZ(str);
    }

    public final void H3(PoiListApi.PoiDetailResponse poiDetailResponse, String str) {
        int i;
        TextView textView = (TextView) v3().findViewById(R.id.hug);
        if (textView != null) {
            textView.setText(poiDetailResponse.name);
            if (C90193gN.LIZIZ(textView.getContext())) {
                i = 4;
            } else {
                i = 3;
            }
            textView.setTextDirection(i);
            this.LJLJJI.invoke(textView, poiDetailResponse.name, str);
        }
    }

    public final void I3(PoiListApi.PoiDetailResponse poiDetailResponse, String str) {
        PoiBookingProviderInfo poiBookingProviderInfo;
        Integer provider;
        List<PoiBookingProviderInfo> providers;
        PoiBookingProviderInfo poiBookingProviderInfo2;
        if (!x3(poiDetailResponse)) {
            return;
        }
        v3().findViewById(R.id.hty).setVisibility(0);
        PoiBookingInfo poiBookingInfo = poiDetailResponse.bookingInfo;
        String str2 = null;
        if (poiBookingInfo != null && (providers = poiBookingInfo.getProviders()) != null) {
            Iterator<PoiBookingProviderInfo> it = providers.iterator();
            while (true) {
                if (it.hasNext()) {
                    poiBookingProviderInfo2 = it.next();
                    Integer provider2 = poiBookingProviderInfo2.getProvider();
                    if (provider2 != null && provider2.intValue() == 1) {
                        break;
                    }
                } else {
                    poiBookingProviderInfo2 = null;
                    break;
                }
            }
            poiBookingProviderInfo = poiBookingProviderInfo2;
        } else {
            poiBookingProviderInfo = null;
        }
        if (poiBookingProviderInfo != null && (provider = poiBookingProviderInfo.getProvider()) != null) {
            str2 = provider.toString();
        }
        C8VV.LIZJ(this, new AqS107S0300000_3(this, poiDetailResponse, new C191187es(str2, str, poiDetailResponse.cityCode, poiDetailResponse.regionCode, poiDetailResponse.typeLevel, poiDetailResponse.collectInfo), 45));
    }

    public final void L3(PoiListApi.PoiDetailResponse poiDetailResponse, boolean z) {
        long j;
        Long valueOf;
        String str;
        if (z) {
            valueOf = poiDetailResponse.videoCount;
        } else {
            Long l = poiDetailResponse.videoCount;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            valueOf = Long.valueOf(j);
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            TextView textView = (TextView) v3().findViewById(R.id.hvd);
            if (textView != null) {
                Context context = getContext();
                if (context != null) {
                    str = context.getString(R.string.drb, C77123UOp.LJJIIJ(longValue));
                } else {
                    str = null;
                }
                textView.setText(str);
            }
            if (longValue == 0) {
                textView.setVisibility(4);
            }
        }
    }

    public final void M3(MotionEvent motionEvent, View view) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                view.setAlpha(1.0f);
                return;
            } else {
                view.setAlpha(1.0f);
                return;
            }
        }
        view.setAlpha(0.2f);
    }

    public final void A3(String str, PoiListApi.PoiDetailResponse poiDetailResponse, C190497dl c190497dl) {
        int i;
        View findViewById = v3().findViewById(R.id.htf);
        String str2 = poiDetailResponse.address;
        if (str2 != null) {
            findViewById.setVisibility(0);
            TextView textView = (TextView) v3().findViewById(R.id.hte);
            textView.setText(str2);
            if (C90193gN.LIZIZ(textView.getContext())) {
                i = 4;
            } else {
                i = 3;
            }
            textView.setTextDirection(i);
            TuxTextView it = (TuxTextView) v3().findViewById(R.id.hte);
            IDqS428S0100000_3 iDqS428S0100000_3 = this.LJLJJI;
            o.LJIIIIZZ(it, "it");
            C51556KLg.LIZ.getClass();
            iDqS428S0100000_3.invoke(it, C51556KLg.LIZ().LJIJJ(poiDetailResponse.name, str2), str);
            C16880lQ.LJJJJI(it, new ACListenerS25S1200000_3(this, c190497dl, str, 2));
            it.setOnTouchListener(new IDTListenerS113S0100000_3(this, 10));
            return;
        }
        findViewById.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r37 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (r37 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        if (r37 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r37 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C3(java.lang.String r34, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r35, android.content.Context r36, X.C190497dl r37) {
        /*
            r33 = this;
            r0 = r33
            android.view.View r2 = r0.v3()
            r1 = 2131373140(0x7f0a2c54, float:1.8366363E38)
            android.view.View r2 = r2.findViewById(r1)
            r1 = 0
            r2.setVisibility(r1)
            java.lang.String r3 = r0.LJLJI
            r31 = r34
            if (r31 != 0) goto Lb4
            java.lang.String r7 = ""
        L19:
            r12 = 0
            r1 = r37
            if (r1 == 0) goto La5
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r2 = r1.LJLJI
            if (r2 == 0) goto La5
            java.lang.String r8 = r2.getPoiInfoSource()
        L26:
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r2 = r1.LJLJI
            if (r2 == 0) goto Laa
            java.lang.String r9 = r2.getPoiCityCode()
        L2e:
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r2 = r1.LJLJI
            if (r2 == 0) goto Lae
            java.lang.String r10 = r2.getPoiRegionCode()
        L36:
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r2 = r1.LJLJI
            if (r2 == 0) goto Lb2
            java.lang.Integer r2 = r2.getPoiDeviceSameCity()
            if (r2 == 0) goto Lb2
            java.lang.String r11 = r2.toString()
        L44:
            boolean r6 = X.C85256Xd6.LIZIZ(r36)
            if (r1 == 0) goto L9c
            java.lang.String r5 = r1.LJLILLLLZI
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r2 = r1.LJLJI
            if (r2 == 0) goto L9d
            java.lang.String r23 = r2.getFromGroupId()
        L54:
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r2 = r1.LJLJI
            if (r2 == 0) goto La2
            java.lang.String r22 = r2.getCollectInfo()
        L5c:
            r30 = r35
            java.lang.String r21 = r30.LJIIJJI()
            java.lang.String r20 = r30.LJIIIZ()
            if (r1 == 0) goto L9a
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LJLJLLL
        L6a:
            X.7eH r2 = new X.7eH
            java.lang.String r4 = "click_button"
            r28 = 23199232(0x161fe00, float:4.150821E-38)
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r24 = r12
            r25 = r12
            r26 = r1
            r27 = r12
            r29 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            kotlin.jvm.internal.AqS28S1300000_3 r1 = new kotlin.jvm.internal.AqS28S1300000_3
            r32 = 4
            r28 = r2
            r27 = r1
            r29 = r0
            r27.<init>(r28, r29, r30, r31, r32)
            X.C8VV.LIZJ(r0, r1)
            return
        L9a:
            r1 = r12
            goto L6a
        L9c:
            r5 = r12
        L9d:
            r23 = r12
            if (r1 == 0) goto La2
            goto L54
        La2:
            r22 = r12
            goto L5c
        La5:
            r8 = r12
            if (r1 == 0) goto Laa
            goto L26
        Laa:
            r9 = r12
            if (r1 == 0) goto Lae
            goto L2e
        Lae:
            r10 = r12
            if (r1 == 0) goto Lb2
            goto L36
        Lb2:
            r11 = r12
            goto L44
        Lb4:
            r7 = r31
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem.C3(java.lang.String, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, android.content.Context, X.7dl):void");
    }

    public final void K3(String str, boolean z, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, String str3, String str4) {
        Context context;
        Resources resources;
        String string;
        int i;
        Resources resources2;
        String string2;
        String openingHoursForPoiDetail;
        View findViewById = v3().findViewById(R.id.hua);
        int i2 = 0;
        findViewById.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        String str5 = poiDetailResponse.averagePrice;
        if (str5 != null && C78685UuP.LJJJZ(str5) && !o.LJ(poiDetailResponse.LJIIJJI(), EnumC189997cx.INDEPENDENT.getTypeName())) {
            arrayList.add(str5);
        }
        String str6 = poiDetailResponse.categoryName;
        if (str6 != null && C78685UuP.LJJJZ(str6)) {
            arrayList.add(str6);
        }
        StoreInfoModel storeInfoModel = poiDetailResponse.storeInfo;
        if (storeInfoModel != null && (openingHoursForPoiDetail = storeInfoModel.getOpeningHoursForPoiDetail()) != null && C78685UuP.LJJJZ(openingHoursForPoiDetail)) {
            arrayList.add(openingHoursForPoiDetail);
        }
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() == 0) {
            Context context2 = getContext();
            if (context2 != null && (resources2 = context2.getResources()) != null && (string2 = resources2.getString(R.string.p05)) != null) {
                sb.append(string2);
            }
        } else {
            if (arrayList.size() == 1 && (context = getContext()) != null && (resources = context.getResources()) != null && (string = resources.getString(R.string.p04)) != null) {
                arrayList.add(string);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i3 = i2 + 1;
                sb.append((String) it.next());
                if (i2 != arrayList.size() - 1) {
                    sb.append(" · ");
                }
                i2 = i3;
            }
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById.findViewById(R.id.hu_);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) sb);
        LIZ.append(' ');
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X1D.LIZIZ(LIZ));
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_chevron_right_offset_ltr;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        Context context3 = v3().getContext();
        o.LJIIIIZZ(context3, "parentView.context");
        spannableStringBuilder.setSpan(c2068389v.LIZIZ(2, context3), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        tuxTextView.setText(spannableStringBuilder);
        if (C90193gN.LIZIZ(tuxTextView.getContext())) {
            i = 4;
        } else {
            i = 3;
        }
        tuxTextView.setTextDirection(i);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS0S4210000_3(this, str, z, poiDetailResponse, str2, str3, str4, 1));
        tuxTextView.setOnTouchListener(new IDTListenerS113S0100000_3(this, 12));
    }
}
