package com.bytedance.ies.xelement.pickview;

import X.C37692Eqm;
import X.C61590OFe;
import X.C61592OFg;
import X.C63155OqV;
import X.C75282xQ;
import X.C78847Ux1;
import X.C79734VRa;
import X.C79735VRb;
import X.C79736VRc;
import X.C79737VRd;
import X.C79738VRe;
import X.C79739VRf;
import X.F5B;
import X.InterfaceC58352MvE;
import X.OX1;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VSW;
import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxPickerViewColumn extends LynxUI<VSW> {
    public F5B LJLIL;
    public F5B LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC58352MvE LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LynxPickerViewColumn(VNU context) {
        this(context, null);
        o.LJIIJ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final VSW createView(Context context) {
        VSW vsw = new VSW(context);
        if (this.LJLJJI == null) {
            this.LJLJJI = new C78847Ux1();
        }
        vsw.setLocalizeAdapter(this.LJLJJI);
        vsw.setCyclic(false);
        vsw.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        vsw.setOnItemSelectedListener(new OX1(this));
        vsw.setCurrentIndex(0);
        return vsw;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJLJI = map.containsKey("change");
        }
    }

    @VPD(name = "font-family")
    public final void setFontFamily(String str) {
        if (str == null) {
            return;
        }
        Typeface LIZJ = C61590OFe.LIZJ(0, this.mContext, str);
        if (LIZJ == null) {
            LIZJ = C61592OFg.LIZ.LIZJ(this.mContext, str, 0, new C79734VRa(this));
            if (LIZJ == null) {
                return;
            }
        }
        ((VSW) this.mView).setTypeface(Typeface.create(LIZJ, 0));
    }

    @VPD(name = "indicator-style")
    public final void setIndicatorStyle(String style) {
        o.LJIIJ(style, "style");
        List LIZ = C75282xQ.LIZ(style);
        C79735VRb c79735VRb = new C79735VRb(this);
        String LIZIZ = C79737VRd.LIZIZ("font-size", LIZ);
        if (LIZIZ != null) {
            c79735VRb.LIZIZ(LIZIZ);
        }
        String LIZIZ2 = C79737VRd.LIZIZ("color", LIZ);
        if (LIZIZ2 != null) {
            c79735VRb.LIZ(LIZIZ2);
        }
        String LIZIZ3 = C79737VRd.LIZIZ("font-weight", LIZ);
        if (LIZIZ3 != null) {
            c79735VRb.LIZJ(LIZIZ3);
        }
        C79736VRc c79736VRc = new C79736VRc(this);
        String LIZIZ4 = C79737VRd.LIZIZ("border-width", LIZ);
        if (LIZIZ4 != null) {
            c79736VRc.LIZIZ(LIZIZ4);
        }
        String LIZIZ5 = C79737VRd.LIZIZ("border-color", LIZ);
        if (LIZIZ5 != null) {
            c79736VRc.LIZ(LIZIZ5);
        }
        C79737VRd.LIZ(LIZ, new C79738VRe(this));
    }

    @VPD(name = "mask-style")
    public final void setMaskStyle(String style) {
        o.LJIIJ(style, "style");
        C79737VRd.LIZ(C75282xQ.LIZ(style), new C79739VRf(this));
    }

    @VPD(name = "range")
    public final void setRange(F5B range) {
        ReadableArray asArray;
        String asString;
        o.LJIIJ(range, "range");
        this.LJLIL = range;
        if (range.getType() == ReadableType.Array && !range.isNull() && 1 != 0 && (asArray = range.asArray()) != null && asArray.size() > 0 && !asArray.isNull(0)) {
            ArrayList arrayList = new ArrayList();
            if (asArray.getType(0) == ReadableType.String) {
                ArrayList<Object> asArrayList = asArray.asArrayList();
                if (asArrayList != null) {
                    arrayList.addAll(asArrayList);
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                }
            } else {
                F5B f5b = this.LJLILLLLZI;
                if (f5b != null && (asString = f5b.asString()) != null) {
                    int size = asArray.size();
                    for (int i = 0; i < size; i++) {
                        String string = asArray.getMap(i).getString(asString);
                        o.LJFF(string, "array.getMap(i).getString(key)");
                        arrayList.add(string);
                    }
                }
            }
            VSW view = (VSW) this.mView;
            o.LJFF(view, "view");
            view.setAdapter(new C63155OqV(arrayList));
            ((VSW) this.mView).setItemsVisibleCount(5);
        }
    }

    @VPD(name = "range-key")
    public final void setRangeKey(F5B rangeKey) {
        o.LJIIJ(rangeKey, "rangeKey");
        this.LJLILLLLZI = rangeKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    @X.VPD(name = "value")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setValue(X.F5B r5) {
        /*
            r4 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.LJIIJ(r5, r0)
            com.lynx.react.bridge.ReadableType r2 = r5.getType()
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.String
            r1 = 0
            if (r2 != r0) goto L1c
            java.lang.String r2 = r5.asString()     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = "v"
            kotlin.jvm.internal.o.LJFF(r2, r0)     // Catch: java.lang.Exception -> L3f
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r2)     // Catch: java.lang.Exception -> L3f
            goto L3f
        L1c:
            com.lynx.react.bridge.ReadableType r2 = r5.getType()
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Int
            if (r2 == r0) goto L3b
            com.lynx.react.bridge.ReadableType r2 = r5.getType()
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Long
            if (r2 != r0) goto L2d
            goto L3b
        L2d:
            com.lynx.react.bridge.ReadableType r2 = r5.getType()
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Number
            if (r2 != r0) goto L3f
            double r2 = r5.asDouble()     // Catch: java.lang.Exception -> L3f
            int r1 = (int) r2     // Catch: java.lang.Exception -> L3f
            goto L3f
        L3b:
            int r1 = r5.asInt()     // Catch: java.lang.Exception -> L3f
        L3f:
            T extends android.view.View r0 = r4.mView
            X.VSW r0 = (X.VSW) r0
            if (r0 == 0) goto L48
            r0.setCurrentIndex(r1)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.pickview.LynxPickerViewColumn.setValue(X.F5B):void");
    }

    @VPD(name = "visible-count")
    public final void setVisibleCount(String value) {
        int i;
        o.LJIIJ(value, "value");
        try {
            i = CastIntegerProtector.parseInt(value);
        } catch (Exception unused) {
            i = 5;
        }
        ((VSW) this.mView).setItemsVisibleCount(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxPickerViewColumn(VNU context, InterfaceC58352MvE interfaceC58352MvE) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLJJI = interfaceC58352MvE;
    }
}
