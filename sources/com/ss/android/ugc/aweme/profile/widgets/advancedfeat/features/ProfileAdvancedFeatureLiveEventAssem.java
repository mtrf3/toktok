package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import X.C0DC;
import X.C234189Ha;
import X.C65352Pkq;
import X.C8VC;
import X.C9GK;
import X.C9JT;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.TBT;
import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureLiveEventAssem extends ProfileSingleFeatureAssem {
    public String LJLJJLL;
    public long LJLJL;

    public ProfileAdvancedFeatureLiveEventAssem() {
        new LinkedHashMap();
        this.LJLJJLL = "";
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final Map<String, Boolean> F3() {
        String lowerCase = "HAS_INTERACTION_LIVE".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJL));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final View I3() {
        return v3(R.string.g76, R.raw.icon_calendar_star, new View.OnClickListener() { // from class: X.9He
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Hb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 645));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Hc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJ;
            }
        }, C234189Ha.LJLIL);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Hd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 646));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9GK.class), new TBT() { // from class: X.9HZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C99Z) obj).LIZ;
            }
        }, new AqS170S0100000_4(this, 647));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final C9JT x3() {
        return C9JT.LiveEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N3(java.util.List<com.ss.android.ugc.aweme.profile.model.LiveEventStruct> r12) {
        /*
            r11 = this;
            java.lang.Class<X.9Kk> r0 = X.InterfaceC235069Kk.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            r6 = r11
            X.7ql r0 = X.C8VC.LJIIIIZZ(r6, r0)
            X.9Kd r0 = (X.C234999Kd) r0
            r8 = 0
            if (r0 == 0) goto Lb3
            com.ss.android.ugc.aweme.profile.model.User r9 = r0.LIZ
        L12:
            r4 = 0
            r2 = 1
            r7 = r12
            if (r7 == 0) goto L1d
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Laa
        L1d:
            r1 = 0
        L1e:
            if (r7 == 0) goto L34
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r4)
            com.ss.android.ugc.aweme.profile.model.LiveEventStruct r8 = (com.ss.android.ugc.aweme.profile.model.LiveEventStruct) r8
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r4)
            com.ss.android.ugc.aweme.profile.model.LiveEventStruct r0 = (com.ss.android.ugc.aweme.profile.model.LiveEventStruct) r0
            if (r0 == 0) goto L34
            java.lang.String r0 = r0.getId()
            if (r0 != 0) goto L36
        L34:
            java.lang.String r0 = ""
        L36:
            r6.LJLJJLL = r0
            if (r9 == 0) goto La6
            if (r1 == 0) goto La6
            if (r8 == 0) goto La6
            boolean r0 = X.C2060386t.LIZ(r0)
            if (r0 != 0) goto La6
            Y.ACListenerS28S0400000_4 r5 = new Y.ACListenerS28S0400000_4
            r10 = 1
            r5.<init>(r6, r7, r8, r9, r10)
            r6.L3(r5)
            android.content.Context r0 = r6.E3()
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r0 = r8.getStartTime()
            java.lang.String r1 = X.C86036Xpg.LJFF(r0)
            android.content.Context r0 = r6.E3()
            boolean r0 = X.C90193gN.LIZIZ(r0)
            if (r0 == 0) goto L70
            r0 = 8207(0x200f, float:1.15E-41)
            java.lang.String r1 = X.QZZ.LIZIZ(r0, r1)
        L70:
            r2[r4] = r1
            r0 = 2131830014(0x7f1124fe, float:1.9293013E38)
            java.lang.String r1 = r3.getString(r0, r2)
            java.lang.String r0 = "notNullContext.resources…lse it\n                })"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r6.M3(r1)
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r6.LJLJL
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto La2
            X.9GK r1 = r6.H3()
            X.9JT r0 = r6.x3()
            boolean r0 = r1.t4(r0)
            if (r0 == 0) goto La2
            long r0 = java.lang.System.currentTimeMillis()
            r6.LJLJL = r0
        La2:
            r6.requestShow()
        La5:
            return
        La6:
            r6.requestHide()
            goto La5
        Laa:
            boolean r0 = X.AV1.LJIIJJI()
            if (r0 != 0) goto L1d
            r1 = 1
            goto L1e
        Lb3:
            r9 = r8
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureLiveEventAssem.N3(java.util.List):void");
    }
}
