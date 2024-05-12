package com.bytedance.android.monitorV2.hybridSetting.entity;

import X.C1NE;
import X.C38918FPe;
import X.C48339Iy7;
import X.X1D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public final class BidInfo {
    public final Map<String, BidConfig> LIZ = new HashMap();
    public final List<C38918FPe> LIZIZ = new ArrayList();

    /* loaded from: classes15.dex */
    public static class BidConfig {
        public boolean ajax_web;
        public String bid;
        public boolean blank_lynx;
        public boolean blank_reactnative;
        public boolean blank_web;
        public boolean container_error;
        public boolean custom_p0;
        public boolean custom_p1;
        public boolean custom_p2;
        public boolean custom_p3;
        public boolean custom_p4;
        public boolean custom_p5;
        public boolean custom_p6;
        public boolean custom_p7;
        public boolean custom_p8;
        public Map<String, Integer> eventNameSample;
        public boolean falcon_perf_web;
        public boolean fetch_error_lynx;
        public boolean fetch_error_reactnative;
        public boolean fetch_error_web;
        public long hitSample;
        public boolean js_exception_lynx;
        public boolean js_exception_web;
        public boolean jsb_error_lynx;
        public boolean jsb_error_reactnative;
        public boolean jsb_error_web;
        public boolean jsb_perf_lynx;
        public boolean jsb_perf_web;
        public boolean native_error_lynx;
        public boolean native_error_reactnative;
        public boolean native_error_web;
        public boolean navigation_start_lynx;
        public boolean navigation_start_web;
        public boolean perf_web;
        public boolean performance_lynx;
        public boolean performance_reactnative;
        public boolean res_loader_error_lynx;
        public boolean res_loader_error_template_lynx;
        public boolean res_loader_error_template_web;
        public boolean res_loader_error_web;
        public boolean res_loader_perf_lynx;
        public boolean res_loader_perf_template_lynx;
        public boolean res_loader_perf_template_web;
        public boolean res_loader_perf_web;
        public long settingId;
        public boolean static_error_lynx;
        public boolean static_error_web;
        public boolean static_perf_web;
        public boolean static_sri_web;
        public boolean tea_switch;

        public BidConfig() {
            this.bid = "__hybrid_default";
            this.eventNameSample = new HashMap();
            this.custom_p0 = false;
            this.custom_p1 = false;
            this.custom_p2 = false;
            this.custom_p3 = false;
            this.custom_p4 = false;
            this.custom_p5 = false;
            this.custom_p6 = false;
            this.custom_p7 = false;
            this.custom_p8 = false;
            this.perf_web = false;
            this.ajax_web = false;
            this.static_perf_web = false;
            this.static_error_web = false;
            this.js_exception_web = false;
            this.blank_web = false;
            this.fetch_error_web = false;
            this.jsb_error_web = false;
            this.jsb_perf_web = false;
            this.falcon_perf_web = false;
            this.native_error_web = false;
            this.navigation_start_web = false;
            this.static_sri_web = false;
            this.performance_lynx = false;
            this.blank_lynx = false;
            this.fetch_error_lynx = false;
            this.jsb_error_lynx = false;
            this.jsb_perf_lynx = false;
            this.native_error_lynx = false;
            this.navigation_start_lynx = false;
            this.performance_reactnative = false;
            this.blank_reactnative = false;
            this.fetch_error_reactnative = false;
            this.jsb_error_reactnative = false;
            this.native_error_reactnative = false;
            this.container_error = false;
            this.js_exception_lynx = false;
            this.static_error_lynx = false;
            this.tea_switch = false;
            this.res_loader_perf_web = false;
            this.res_loader_error_web = false;
            this.res_loader_perf_template_web = false;
            this.res_loader_error_template_web = false;
            this.res_loader_perf_lynx = false;
            this.res_loader_error_lynx = false;
            this.res_loader_perf_template_lynx = false;
            this.res_loader_error_template_lynx = false;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BidConfig{, hitSample=");
            LIZ.append(this.hitSample);
            LIZ.append(", settingId=");
            LIZ.append(this.settingId);
            LIZ.append(", custom_p0=");
            LIZ.append(this.custom_p0);
            LIZ.append(", custom_p1=");
            LIZ.append(this.custom_p1);
            LIZ.append(", custom_p2=");
            LIZ.append(this.custom_p2);
            LIZ.append(", custom_p3=");
            LIZ.append(this.custom_p3);
            LIZ.append(", custom_p4=");
            LIZ.append(this.custom_p4);
            LIZ.append(", custom_p5=");
            LIZ.append(this.custom_p5);
            LIZ.append(", custom_p6=");
            LIZ.append(this.custom_p6);
            LIZ.append(", custom_p7=");
            LIZ.append(this.custom_p7);
            LIZ.append(", custom_p8=");
            LIZ.append(this.custom_p8);
            LIZ.append(", perf_web=");
            LIZ.append(this.perf_web);
            LIZ.append(", ajax_web=");
            LIZ.append(this.ajax_web);
            LIZ.append(", static_perf_web=");
            LIZ.append(this.static_perf_web);
            LIZ.append(", static_error_web=");
            LIZ.append(this.static_error_web);
            LIZ.append(", js_exception_web=");
            LIZ.append(this.js_exception_web);
            LIZ.append(", blank_web=");
            LIZ.append(this.blank_web);
            LIZ.append(", fetch_error_web=");
            LIZ.append(this.fetch_error_web);
            LIZ.append(", jsb_error_web=");
            LIZ.append(this.jsb_error_web);
            LIZ.append(", jsb_perf_web=");
            LIZ.append(this.jsb_perf_web);
            LIZ.append(", falcon_perf_web=");
            LIZ.append(this.falcon_perf_web);
            LIZ.append(", native_error_web=");
            LIZ.append(this.native_error_web);
            LIZ.append(", navigation_start_web=");
            LIZ.append(this.navigation_start_web);
            LIZ.append(", performance_lynx=");
            LIZ.append(this.performance_lynx);
            LIZ.append(", blank_lynx=");
            LIZ.append(this.blank_lynx);
            LIZ.append(", fetch_error_lynx=");
            LIZ.append(this.fetch_error_lynx);
            LIZ.append(", jsb_error_lynx=");
            LIZ.append(this.jsb_error_lynx);
            LIZ.append(", jsb_perf_lynx=");
            LIZ.append(this.jsb_perf_lynx);
            LIZ.append(", native_error_lynx=");
            LIZ.append(this.native_error_lynx);
            LIZ.append(", navigation_start_lynx=");
            LIZ.append(this.navigation_start_lynx);
            LIZ.append(", performance_reactnative=");
            LIZ.append(this.performance_reactnative);
            LIZ.append(", blank_reactnative=");
            LIZ.append(this.blank_reactnative);
            LIZ.append(", fetch_error_reactnative=");
            LIZ.append(this.fetch_error_reactnative);
            LIZ.append(", jsb_error_reactnative=");
            LIZ.append(this.jsb_error_reactnative);
            LIZ.append(", native_error_reactnative=");
            LIZ.append(this.native_error_reactnative);
            LIZ.append(", container_error=");
            LIZ.append(this.container_error);
            LIZ.append(", js_exception_lynx=");
            LIZ.append(this.js_exception_lynx);
            LIZ.append(", static_error_lynx=");
            LIZ.append(this.static_error_lynx);
            LIZ.append(", tea_switch=");
            LIZ.append(this.tea_switch);
            LIZ.append(", res_loader_perf_web=");
            LIZ.append(this.res_loader_perf_web);
            LIZ.append(", res_loader_error_web=");
            LIZ.append(this.res_loader_error_web);
            LIZ.append(", res_loader_perf_template_web=");
            LIZ.append(this.res_loader_perf_template_web);
            LIZ.append(", res_loader_error_template_web=");
            LIZ.append(this.res_loader_error_template_web);
            LIZ.append(", res_loader_perf_lynx=");
            LIZ.append(this.res_loader_perf_lynx);
            LIZ.append(", res_loader_error_lynx=");
            LIZ.append(this.res_loader_error_lynx);
            LIZ.append(", res_loader_perf_template_lynx=");
            LIZ.append(this.res_loader_perf_template_lynx);
            LIZ.append(", res_loader_error_template_lynx=");
            return C48339Iy7.LIZJ(LIZ, this.res_loader_error_template_lynx, '}', LIZ);
        }

        public BidConfig(String str) {
            this.bid = "__hybrid_default";
            this.eventNameSample = new HashMap();
            this.custom_p0 = false;
            this.custom_p1 = false;
            this.custom_p2 = false;
            this.custom_p3 = false;
            this.custom_p4 = false;
            this.custom_p5 = false;
            this.custom_p6 = false;
            this.custom_p7 = false;
            this.custom_p8 = false;
            this.perf_web = false;
            this.ajax_web = false;
            this.static_perf_web = false;
            this.static_error_web = false;
            this.js_exception_web = false;
            this.blank_web = false;
            this.fetch_error_web = false;
            this.jsb_error_web = false;
            this.jsb_perf_web = false;
            this.falcon_perf_web = false;
            this.native_error_web = false;
            this.navigation_start_web = false;
            this.static_sri_web = false;
            this.performance_lynx = false;
            this.blank_lynx = false;
            this.fetch_error_lynx = false;
            this.jsb_error_lynx = false;
            this.jsb_perf_lynx = false;
            this.native_error_lynx = false;
            this.navigation_start_lynx = false;
            this.performance_reactnative = false;
            this.blank_reactnative = false;
            this.fetch_error_reactnative = false;
            this.jsb_error_reactnative = false;
            this.native_error_reactnative = false;
            this.container_error = false;
            this.js_exception_lynx = false;
            this.static_error_lynx = false;
            this.tea_switch = false;
            this.res_loader_perf_web = false;
            this.res_loader_error_web = false;
            this.res_loader_perf_template_web = false;
            this.res_loader_error_template_web = false;
            this.res_loader_perf_lynx = false;
            this.res_loader_error_lynx = false;
            this.res_loader_perf_template_lynx = false;
            this.res_loader_error_template_lynx = false;
            if (!str.isEmpty()) {
                this.bid = str;
            }
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BidInfo{bidInfoMap=");
        LIZ.append(this.LIZ);
        LIZ.append(", regexList=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, '}', LIZ);
    }

    public final BidConfig LIZ(String str) {
        if (((HashMap) this.LIZ).containsKey(str)) {
            return (BidConfig) ((HashMap) this.LIZ).get(str);
        }
        if (((HashMap) this.LIZ).containsKey("__hybrid_default")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Not found bidConfig for ");
            LIZ.append(str);
            LIZ.append(", use ");
            LIZ.append("__hybrid_default");
            X1D.LIZIZ(LIZ);
            return (BidConfig) ((HashMap) this.LIZ).get("__hybrid_default");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Not found bidConfig for ");
        LIZ2.append(str);
        LIZ2.append(", use ");
        LIZ2.append("__hybrid_default");
        X1D.LIZIZ(LIZ2);
        return new BidConfig("__hybrid_default");
    }
}
