package com.ss.android.ugc.aweme.poi.map.lynxmap;

import X.C141335gf;
import X.C191327f6;
import X.C191337f7;
import X.C191437fH;
import X.C3C5;
import X.C76800UCe;
import X.EWS;
import X.VNU;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxMapElement extends UISimpleView<C191327f6> {
    public C191327f6 LJLIL;

    public LynxMapElement(VNU vnu) {
        super(vnu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C191337f7 LJIJJLI(com.lynx.react.bridge.ReadableMap r37) {
        /*
            java.lang.String r3 = "poi_lat"
            r0 = 0
            r2 = r37
            double r15 = r2.getDouble(r3, r0)
            java.lang.String r3 = "poi_lon"
            double r17 = r2.getDouble(r3, r0)
            java.lang.String r3 = "zoom_level"
            double r19 = r2.getDouble(r3, r0)
            java.lang.String r3 = "max_lat"
            double r21 = r2.getDouble(r3, r0)
            java.lang.String r3 = "min_lat"
            double r23 = r2.getDouble(r3, r0)
            java.lang.String r3 = "max_lon"
            double r25 = r2.getDouble(r3, r0)
            java.lang.String r3 = "min_lon"
            double r27 = r2.getDouble(r3, r0)
            java.lang.String r3 = "min_zoom_level"
            double r29 = r2.getDouble(r3, r0)
            java.lang.String r3 = "max_zoom_level"
            double r31 = r2.getDouble(r3, r0)
            java.lang.String r1 = "disable_interaction"
            r0 = 0
            boolean r33 = r2.getBoolean(r1, r0)
            java.lang.String r1 = "track_info"
            com.lynx.react.bridge.ReadableMap r4 = r2.getMap(r1)
            java.lang.String r3 = "poi_id"
            java.lang.String r0 = ""
            java.lang.String r13 = r4.getString(r3, r0)
            java.lang.String r3 = "address"
            java.lang.String r12 = r2.getString(r3, r0)
            com.lynx.react.bridge.ReadableMap r3 = r2.getMap(r1)
            java.lang.String r1 = "enter_from"
            java.lang.String r11 = r3.getString(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La8
            r0.<init>()     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = "annotations"
            com.lynx.react.bridge.ReadableArray r8 = r2.getArray(r1)     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto La2
            int r1 = r8.size()     // Catch: java.lang.Throwable -> La8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> La8
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> La8
            if (r1 <= 0) goto La2
            int r10 = r2.intValue()     // Catch: java.lang.Throwable -> La8
            r3 = 0
        L7f:
            if (r3 >= r10) goto La2
            com.lynx.react.bridge.ReadableMap r6 = r8.getMap(r3)     // Catch: java.lang.Throwable -> La0
            X.7fG r7 = new X.7fG     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "lat"
            r1 = 0
            double r4 = r6.getDouble(r4, r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r9 = "lng"
            double r1 = r6.getDouble(r9, r1)     // Catch: java.lang.Throwable -> La6
            r7.<init>(r4, r1)     // Catch: java.lang.Throwable -> La6
            r0.add(r7)     // Catch: java.lang.Throwable -> La6
            int r3 = r3 + 1
            goto L7f
        L9e:
            r0 = move-exception
            goto Lab
        La0:
            r0 = move-exception
            goto Lab
        La2:
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> La6
            goto Lb2
        La6:
            r0 = move-exception
            goto Lab
        La8:
            r0 = move-exception
            goto Lab
        Laa:
            r0 = move-exception
        Lab:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        Lb2:
            boolean r1 = X.C3C5.m12isFailureimpl(r0)
            if (r1 == 0) goto Lb9
            r0 = 0
        Lb9:
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lbf
            X.OQg r0 = X.C61878OQg.INSTANCE
        Lbf:
            X.7f7 r14 = new X.7f7
            java.lang.String r1 = "getString(\"poi_id\", \"\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r13, r1)
            java.lang.String r1 = "getString(\"enter_from\", \"\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r11, r1)
            java.lang.String r1 = "getString(\"address\", \"\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r12, r1)
            r34 = r13
            r35 = r11
            r36 = r12
            r37 = r0
            r14.<init>(r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35, r36, r37)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.map.lynxmap.LynxMapElement.LJIJJLI(com.lynx.react.bridge.ReadableMap):X.7f7");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        C191327f6 c191327f6 = new C191327f6(context);
        this.LJLIL = c191327f6;
        return c191327f6;
    }

    @EWS
    public final void updateDynamicMapData(ReadableMap params, Callback callback) {
        C76800UCe c76800UCe;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        try {
            C191337f7 LJIJJLI = LJIJJLI(params);
            boolean LIZ = C191437fH.LIZ(LJIJJLI);
            C191327f6 c191327f6 = this.LJLIL;
            if (c191327f6 != null) {
                c191327f6.LIZ(LIZ, LJIJJLI, new AqS180S0100000_14(callback, 125));
            }
            C191327f6 c191327f62 = this.LJLIL;
            if (c191327f62 != null) {
                c191327f62.setCameraMoveListener$poi_release(new AqS164S0100000_14(this, 131));
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
