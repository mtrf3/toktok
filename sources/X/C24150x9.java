package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSchema;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.0x9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24150x9 {
    public static final C24150x9 LIZ = new C24150x9();

    public static final void LIZ(Context context, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        LIZ2.append("_kGBLAnchorGameLivePartnershipFirstClicked");
        Object LIZLLL = C78524Uro.LIZ(context).LIZLLL(X1D.LIZIZ(LIZ2));
        if (!(LIZLLL instanceof String)) {
            LIZLLL = null;
        }
        if (o.LJ("1", LIZLLL)) {
            ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).AA(context, new IDqS172S0200000(context, (Context) map, (java.util.Map<String, String>) 77));
            return;
        }
        String str = C24170xB.LIZ.promoteIntroduction;
        if (str.length() == 0) {
            return;
        }
        C29682Bks LIZ3 = C29683Bkt.LIZ(str);
        LIZ3.LJIJJ("bottom");
        BY3 by3 = BY3.DP;
        LIZ3.LJIIJ(534, by3);
        LIZ3.LJIIL();
        LIZ3.LJIL((int) C15380j0.LJIJ(C15380j0.LJIIL()), by3);
        LIZ3.LJJIFFI(map);
        InterfaceC06390Mx LIZ4 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ4, "getService(IHybridContainerService::class.java)");
        String uri = LIZ3.LIZ().toString();
        o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
        ((IHybridContainerService) LIZ4).Vs0(context, uri, null);
    }

    public static final void LIZIZ(Context context, java.util.Map<String, String> map) {
        String str = GameLivePartnershipDropsSchema.INSTANCE.getConfig().dropsHostList;
        if (str.length() == 0) {
            return;
        }
        C29682Bks LIZ2 = C29683Bkt.LIZ(str);
        LIZ2.LJJIFFI(map);
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ3, "getService(IHybridContainerService::class.java)");
        String uri = LIZ2.LIZ().toString();
        o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
        ((IHybridContainerService) LIZ3).Vs0(context, uri, null);
    }

    public static final void LIZJ(Context context, java.util.Map<String, String> map) {
        String str = GameLivePartnershipDropsSchema.INSTANCE.getConfig().dropsGuide;
        if (str.length() == 0) {
            return;
        }
        C29682Bks LIZ2 = C29683Bkt.LIZ(str);
        LIZ2.LJJIFFI(map);
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ3, "getService(IHybridContainerService::class.java)");
        String uri = LIZ2.LIZ().toString();
        o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
        ((IHybridContainerService) LIZ3).Vs0(context, uri, null);
    }

    public static final void LIZLLL(Context context, java.util.Map<String, String> map) {
        String str = C24170xB.LIZ.pageDropList;
        if (str.length() == 0) {
            return;
        }
        C29682Bks LIZ2 = C29683Bkt.LIZ(str);
        LIZ2.LJJIFFI(map);
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ3, "getService(IHybridContainerService::class.java)");
        String uri = LIZ2.LIZ().toString();
        o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
        ((IHybridContainerService) LIZ3).Vs0(context, uri, null);
    }

    public static final void LJ(Context context, java.util.Map<String, String> map) {
        String str = GameLivePartnershipDropsSchema.INSTANCE.getConfig().dropsHostList;
        if (str.length() == 0) {
            return;
        }
        C29682Bks LIZ2 = C29683Bkt.LIZ(str);
        LIZ2.LJJIFFI(map);
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ3, "getService(IHybridContainerService::class.java)");
        String uri = LIZ2.LIZ().toString();
        o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
        ((IHybridContainerService) LIZ3).Vs0(context, uri, null);
    }

    public static final void LJFF(Context context, java.util.Map<String, String> map) {
        String str = GameLivePartnershipDropsSchema.INSTANCE.getConfig().dropsHostTaskPanel;
        if (str.length() == 0) {
            return;
        }
        C29682Bks LIZ2 = C29683Bkt.LIZ(str);
        LIZ2.LJJIFFI(map);
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ3, "getService(IHybridContainerService::class.java)");
        String uri = LIZ2.LIZ().toString();
        o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
        ((IHybridContainerService) LIZ3).Vs0(context, uri, null);
    }

    public static final void LJI(Context context, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        String str = C24170xB.LIZ.promoteList;
        if (str.length() == 0) {
            return;
        }
        C29682Bks LIZ2 = C29683Bkt.LIZ(str);
        LIZ2.LJIJJ("bottom");
        LIZ2.LJIL((int) C15380j0.LJIJ(C15380j0.LJIIL()), BY3.DP);
        LIZ2.LJJIFFI(map);
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ3, "getService(IHybridContainerService::class.java)");
        String uri = LIZ2.LIZ().toString();
        o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
        ((IHybridContainerService) LIZ3).Vs0(context, uri, null);
    }

    public static final void LJII(Context context, java.util.Map<String, String> map) {
        String str = C24170xB.LIZ.eventQualification;
        if (str.length() == 0) {
            return;
        }
        C29682Bks LIZ2 = C29683Bkt.LIZ(str);
        C29682Bks.LJIJI(LIZ2, 8);
        LIZ2.LJJIFFI(map);
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ3, "getService(IHybridContainerService::class.java)");
        String uri = LIZ2.LIZ().toString();
        o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
        ((IHybridContainerService) LIZ3).Vs0(context, uri, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0083, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0084, code lost:
    
        r7.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0011, code lost:
    
        if (r10 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r5 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r3 = X.C15380j0.LJIILJJIL(com.zhiliaoapp.musically.R.string.lgy);
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "template");
        r1 = ujb.o.LJJJJZ(r3, "{game_name}", r5.toString(), true);
        r3 = new X.C47071t1(r9);
        r3.LJIILLIIL(com.zhiliaoapp.musically.R.string.lh2);
        r3.LJII(r1);
        r3.LJIIL(com.zhiliaoapp.musically.R.string.lh3, new X.C35621aY(r10, r4, r5));
        r3.LJIIIZ(com.zhiliaoapp.musically.R.string.lh1, new Y.IDcS169S0100000(r4, 28));
        r3.LJIILL = false;
        r7 = r3.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        if (new X.C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", r7, new java.lang.Object[0], "void", new X.C65300Pk0(false, "()V", "-6667988303672126629")).LIZ == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(android.content.Context r9, final java.util.Map<java.lang.String, ? extends java.lang.Object> r10) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            if (r10 == 0) goto Lf
            java.lang.String r0 = "scene"
            java.lang.Object r4 = r10.get(r0)
            if (r4 != 0) goto L13
        Lf:
            java.lang.String r4 = "before_live"
            if (r10 == 0) goto L1b
        L13:
            java.lang.String r0 = "gameName"
            java.lang.Object r5 = r10.get(r0)
            if (r5 != 0) goto L1d
        L1b:
            java.lang.String r5 = ""
        L1d:
            r0 = 2131837374(0x7f1141be, float:1.9307941E38)
            java.lang.String r3 = X.C15380j0.LJIILJJIL(r0)
            java.lang.String r0 = "template"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.lang.String r2 = r5.toString()
            r1 = 1
            java.lang.String r0 = "{game_name}"
            java.lang.String r1 = ujb.o.LJJJJZ(r3, r0, r2, r1)
            X.1t1 r3 = new X.1t1
            r3.<init>(r9)
            r0 = 2131837378(0x7f1141c2, float:1.930795E38)
            r3.LJIILLIIL(r0)
            r3.LJII(r1)
            X.1aY r1 = new X.1aY
            r1.<init>()
            r0 = 2131837379(0x7f1141c3, float:1.9307951E38)
            r3.LJIIL(r0, r1)
            Y.IDcS169S0100000 r1 = new Y.IDcS169S0100000
            r0 = 28
            r1.<init>(r4, r0)
            r0 = 2131837377(0x7f1141c1, float:1.9307947E38)
            r3.LJIIIZ(r0, r1)
            r2 = 0
            r3.LJIILL = r2
            com.bytedance.android.live.design.app.LiveDialog r7 = r3.LIZ()
            X.0Dg r3 = new X.0Dg
            r0 = 2
            r3.<init>(r0)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            X.Pk0 r10 = new X.Pk0
            java.lang.String r1 = "()V"
            java.lang.String r0 = "-6667988303672126629"
            r10.<init>(r2, r1, r0)
            r4 = 300000(0x493e0, float:4.2039E-40)
            java.lang.String r5 = "com/bytedance/android/live/design/app/LiveDialog"
            java.lang.String r6 = "show"
            java.lang.String r9 = "void"
            X.Ff9 r0 = r3.LIZJ(r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L84
        L83:
            return
        L84:
            r7.show()
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24150x9.LJIIIIZZ(android.content.Context, java.util.Map):void");
    }
}
