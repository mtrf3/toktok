package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.BQ8;
import X.C37499Enf;
import X.C37501Enh;
import X.C37618Epa;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.m;
import com.google.gson.p;

/* loaded from: classes7.dex */
public class PiaPropsPlugin extends AbstractC37502Eni {
    public final m LIZIZ;

    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "pia_props";
    }

    @Override // X.AbstractC37502Eni
    public final void LJI() {
        View LJI = this.LIZ.LJI();
        if (!(LJI instanceof WebView)) {
            return;
        }
        StringBuilder sb = new StringBuilder("(function(n){var r={},o=JSON.parse(n);for(var i in o)r[i]=function(n){return function(){return o[n]}}(i);window.pia_props=r})");
        C37618Epa.LIZ(this.LIZIZ.toString(), sb);
        C37618Epa.LIZIZ((WebView) LJI, sb.toString(), null);
    }

    @Override // X.AbstractC37502Eni
    public final void LIZIZ() {
        this.LIZIZ.LJJII("getPageConfig", new p(GsonProtectorUtils.toJson(GsonUtils.LIZIZ(), this.LIZ.LIZJ)));
        this.LIZIZ.LJJII("getManifest", new p("{}"));
    }

    public PiaPropsPlugin(C37499Enf c37499Enf) {
        super(c37499Enf);
        this.LIZIZ = new m();
    }

    @Override // X.AbstractC37502Eni
    public final void LJ(View view) {
        if (!(view instanceof WebView)) {
            return;
        }
        WebView webView = (WebView) view;
        BQ8 bq8 = this.LIZ.LJJII;
        if (bq8 == null || (bq8.get("ctx-pia-props-jsi") instanceof C37501Enh)) {
            return;
        }
        bq8.LIZ(new C37501Enh(bq8, webView), "ctx-pia-props-jsi");
    }
}
