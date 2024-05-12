package X;

import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;

/* renamed from: X.Ety, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37890Ety extends F2U {
    public final /* synthetic */ int LIZ;

    @Override // X.F2U, X.F48
    public final String LIZLLL() {
        switch (this.LIZ) {
            case 0:
                return "window.reactId=getClientContext().id;";
            default:
                return "'use strict';!function(){var e=getClientContext(),_={fe_hook_v1:!1,fe_hook_v2:!1,fe_use_v1:!1,fe_use_v2:!1,fe_context:e,fe_token:!1,fe_have_gp:i(),fe_inject_time:Date.now(),fe_runtime_time:!1,fe_runtime_have_gp:i(),fe_cost_time:0,fe_errors:[],fe_code_version:'1.0.1'};if(window.__jsb_s_inject_data__=_,e.token){var t=e.token;_.fe_token=e.token;var n=Boolean(window.ToutiaoJSBridge&&window.ToutiaoJSBridge.invokeMethod);!function(){if(!n)return _.fe_errors.push('Fails to hook V2 because there is no V2 API'),!1;var e=t,r=function(_){var t=JSON.parse(_);return t.token=e,JSON.stringify(t)},a=window.ToutiaoJSBridge;if('undefined'!=typeof Proxy){!function(e){var _=new Proxy(e,{get:function(e,_){return'invokeMethod'===_?function(t){window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=i(),window.__jsb_s_inject_data__.fe_use_v2=!0;var n=r(t);return e[_](n)}:'_fetchQueue'===_?function(){return o(),window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=i(),window.__jsb_s_inject_data__.fe_use_v1=!0,e[_]()}:e[_]}});window.ToutiaoJSBridge=_}(a)}else{var u=a;Object.defineProperty(window,'ToutiaoJSBridge',{get:function(){return u},set:function(e){var _,t,n;e&&(t=(_=e).invokeMethod,n=_._fetchQueue,Object.defineProperties(_,{invokeMethod:{get:function(){return function(e){var _=r(e);return window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=i(),window.__jsb_s_inject_data__.fe_use_v2=!0,t(_)}},set:function(e){t=e}},_fetchQueue:{get:function(){return function(){return o(),window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=i(),window.__jsb_s_inject_data__.fe_use_v1=!0,n()}},set:function(e){n=e}}}),u=e,Object.defineProperty(window,'ToutiaoJSBridge',{writable:!1,value:u}))}})}_.fe_hook_v2=!0}(),_.fe_cost_time=Date.now()-_.fe_inject_time}else fe_errors.push('format context error, stop hooking');function o(){if(!_.fe_hook_v1){_.fe_hook_v1=!0;var e=t;['__JSBridgeIframe_SetResult__','__JSBridgeIframe_SetResult_1.0__','__JSBridgeIframe_SetResult','__ToutiaoJSBridgeIframe_SetResult__','__ToutiaoJSBridgeIframe_SetResult'].some((function(_){return function(_){var t=document.getElementById(_),n=Boolean(t);n||((t=document.createElement('iframe')).id=_,t.style='display:none');var o=t.src;Object.defineProperty(t,'src',{get:function(){return o},set:function(_){if(o=_,_.indexOf('SCENE_FETCHQUEUE')>-1){var t=_.split('&');return''.concat(t[0],'&').concat(function(_){var t=decodeURIComponent(escape(atob(_))),n=JSON.parse(t);n.forEach((function(_){_.token=e}));var o=JSON.stringify(n);return btoa(unescape(encodeURIComponent(o)))}(t[1]))}return o}}),n||document.documentElement.append(t);return n}(_)}))}}function i(){return void 0!==(window.__globalprops&&window.__globalprops.getGlobalProps)}}();";
        }
    }

    @Override // X.F2U
    public final String LJFF() {
        switch (this.LIZ) {
            case 0:
                return "_jsmanage_tt_oldwebview_reactid";
            default:
                return "_jsmanage_tt_js_auth";
        }
    }

    @Override // X.F48
    public final JSInjectConfig LIZJ() {
        switch (this.LIZ) {
            case 0:
                return new JSInjectConfig("_jsmanage_tt_oldwebview_reactid", "custom_manual", "3", C47261Igj.LJJIJ("."), C61878OQg.INSTANCE, "https://lf16-gecko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/tt/webview/js_manage/tiktok_webview_js_inject_manage/assets/js/tt_oldwebview_reactid.js", true);
            default:
                return new JSInjectConfig("_jsmanage_tt_js_auth", "very_beginning", "3", C47261Igj.LJJIJIIJI(".tiktok.com", ".tiktokv.com", ".tiktokcdn.com", ".tiktokcdn-us.com"), C61878OQg.INSTANCE, "https://lf16-gecko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/tt/webview/js_manage/tiktok_webview_js_inject_manage/assets/js/tt_js_auth.js", false);
        }
    }
}
