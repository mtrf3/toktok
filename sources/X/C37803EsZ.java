package X;

import Y.ARunnableS25S0200000_6;
import android.graphics.Bitmap;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.m;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.WebviewInlineInjectJsSettings;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.EsZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37803EsZ extends C59862NeU {
    public static String LJLJLJ = "function _construct(e,t,r){return _construct=_isNativeReflectConstruct()?Reflect.construct.bind():function(e,t,r){var o=[null];o.push.apply(o,t);var n=new(Function.bind.apply(e,o));return r&&_setPrototypeOf(n,r.prototype),n},_construct.apply(null,arguments)}function _isNativeReflectConstruct(){if(\"undefined\"==typeof Reflect||!Reflect.construct)return!1;if(Reflect.construct.sham)return!1;if(\"function\"==typeof Proxy)return!0;try{return Boolean.prototype.valueOf.call(Reflect.construct(Boolean,[],(function(){}))),!0}catch(e){return!1}}function _setPrototypeOf(e,t){return _setPrototypeOf=Object.setPrototypeOf?Object.setPrototypeOf.bind():function(e,t){return e.__proto__=t,e},_setPrototypeOf(e,t)}function _extends(){return _extends=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var r=arguments[t];for(var o in r)Object.prototype.hasOwnProperty.call(r,o)&&(e[o]=r[o])}return e},_extends.apply(this,arguments)}function _createForOfIteratorHelperLoose(e,t){var r=\"undefined\"!=typeof Symbol&&e[Symbol.iterator]||e[\"@@iterator\"];if(r)return(r=r.call(e)).next.bind(r);if(Array.isArray(e)||(r=_unsupportedIterableToArray(e))||t&&e&&\"number\"==typeof e.length){r&&(e=r);var o=0;return function(){return o>=e.length?{done:!0}:{done:!1,value:e[o++]}}}throw new TypeError(\"Invalid attempt to iterate non-iterable instance.\\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.\")}function _unsupportedIterableToArray(e,t){if(e){if(\"string\"==typeof e)return _arrayLikeToArray(e,t);var r=Object.prototype.toString.call(e).slice(8,-1);return\"Object\"===r&&e.constructor&&(r=e.constructor.name),\"Map\"===r||\"Set\"===r?Array.from(e):\"Arguments\"===r||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(r)?_arrayLikeToArray(e,t):void 0}}function _arrayLikeToArray(e,t){(null==t||t>e.length)&&(t=e.length);for(var r=0,o=new Array(t);r<t;r++)o[r]=e[r];return o}!function(e){\"function\"==typeof define&&define.amd?define(e):e()}((function(){\"use strict\";var e=\"URLSearchParams\"in self,t=(\"Symbol\"in self&&Symbol,\"FileReader\"in self&&\"Blob\"in self&&function(){try{return new Blob,!0}catch(e){return!1}}()),r=\"FormData\"in self,o=\"ArrayBuffer\"in self;function n(e){return e&&DataView.prototype.isPrototypeOf(e)}if(o)var i=[\"[object Int8Array]\",\"[object Uint8Array]\",\"[object Uint8ClampedArray]\",\"[object Int16Array]\",\"[object Uint16Array]\",\"[object Int32Array]\",\"[object Uint32Array]\",\"[object Float32Array]\",\"[object Float64Array]\"],a=ArrayBuffer.isView||function(e){return e&&i.indexOf(Object.prototype.toString.call(e))>-1};function s(e){if(e.bodyUsed)return Promise.reject(new TypeError(\"Already read\"));e.bodyUsed=!0}function c(e){return new Promise((function(t,r){e.onload=function(){t(e.result)},e.onerror=function(){r(e.error)}}))}function u(e){var t=new FileReader,r=c(t);return t.readAsArrayBuffer(e),r}function d(e){if(e.slice)return e.slice(0);var t=new Uint8Array(e.byteLength);return t.set(new Uint8Array(e)),t.buffer}function l(e){var t=new FormData;return e.trim().split(\"&\").forEach((function(e){if(e){var r=e.split(\"=\"),o=r.shift().replace(/\\+/g,\" \"),n=r.join(\"=\").replace(/\\+/g,\" \");t.append(decodeURIComponent(o),decodeURIComponent(n))}})),t}function f(e,t){t||(t={}),this.type=\"default\",this.status=void 0===t.status?200:t.status,this.ok=this.status>=200&&this.status<300,this.statusText=\"statusText\"in t?t.statusText:\"OK\",this.headers=new Headers(t.headers),this.url=t.url||\"\",this._initBody(e)}(function(){return this.bodyUsed=!1,this._initBody=function(i){this._bodyInit=i,i?\"string\"==typeof i?this._bodyText=i:t&&Blob.prototype.isPrototypeOf(i)?this._bodyBlob=i:r&&FormData.prototype.isPrototypeOf(i)?this._bodyFormData=i:e&&URLSearchParams.prototype.isPrototypeOf(i)?this._bodyText=i.toString():o&&t&&n(i)?(this._bodyArrayBuffer=d(i.buffer),this._bodyInit=new Blob([this._bodyArrayBuffer])):o&&(ArrayBuffer.prototype.isPrototypeOf(i)||a(i))?this._bodyArrayBuffer=d(i):this._bodyText=i=Object.prototype.toString.call(i):this._bodyText=\"\",this.headers.get(\"content-type\")||(\"string\"==typeof i?this.headers.set(\"content-type\",\"text/plain;charset=UTF-8\"):this._bodyBlob&&this._bodyBlob.type?this.headers.set(\"content-type\",this._bodyBlob.type):e&&URLSearchParams.prototype.isPrototypeOf(i)&&this.headers.set(\"content-type\",\"application/x-www-form-urlencoded;charset=UTF-8\"))},t&&(this.blob=function(){var e=s(this);if(e)return e;if(this._bodyBlob)return Promise.resolve(this._bodyBlob);if(this._bodyArrayBuffer)return Promise.resolve(new Blob([this._bodyArrayBuffer]));if(this._bodyFormData)throw new Error(\"could not read FormData body as blob\");return Promise.resolve(new Blob([this._bodyText]))},this.arrayBuffer=function(){return this._bodyArrayBuffer?s(this)||Promise.resolve(this._bodyArrayBuffer):this.blob().then(u)}),this.text=function(){var e,t,r,o=s(this);if(o)return o;if(this._bodyBlob)return e=this._bodyBlob,t=new FileReader,r=c(t),t.readAsText(e),r;if(this._bodyArrayBuffer)return Promise.resolve(function(e){for(var t=new Uint8Array(e),r=new Array(t.length),o=0;o<t.length;o++)r[o]=String.fromCharCode(t[o]);return r.join(\"\")}(this._bodyArrayBuffer));if(this._bodyFormData)throw new Error(\"could not read FormData body as text\");return Promise.resolve(this._bodyText)},r&&(this.formData=function(){return this.text().then(l)}),this.json=function(){return this.text().then(JSON.parse)},this}).call(f.prototype),f.prototype.clone=function(){return new f(this._bodyInit,{status:this.status,statusText:this.statusText,headers:new Headers(this.headers),url:this.url})},f.error=function(){var e=new f(null,{status:0,statusText:\"\"});return e.type=\"error\",e};var _=[301,302,303,307,308];f.redirect=function(e,t){if(-1===_.indexOf(t))throw new RangeError(\"Invalid status code\");return new f(null,{status:t,headers:{location:e}})};var h=self.DOMException;try{new h}catch(e){(h=function(e,t){this.message=e,this.name=t;var r=Error(e);this.stack=r.stack}).prototype=Object.create(Error.prototype),h.prototype.constructor=h}function p(e){return ArrayBuffer.prototype.isPrototypeOf(e)||a(e)}function w(e){return URLSearchParams.prototype.isPrototypeOf(e)}function y(){if(E(\"fixResponseInstanceOf\")&&window.Symbol){Object.defineProperty(window.Response,window.Symbol.hasInstance,{value:function(e){return e instanceof f||function(e){var t=window.Response.prototype;for(e=e.__proto__;;){if(null===e)return!1;if(e===t)return!0;e=e.__proto__}}(e)}})}}function m(e){void 0===e&&(e=\"\");try{var t,r;return null==(t=k(e).search)||null==(r=t.slice(1))?void 0:r.split(\"&\").some((function(e){var t=e.split(\"=\"),r=t[0],o=t[1];return\"x_tt_webview_res_type\"===r&&\"binary\"===o}))}catch(e){return!1}}function v(e){var t={};return e instanceof Headers?e.forEach((function(e,r){t[r]=e})):e&&Object.getOwnPropertyNames(e).forEach((function(r){t[r]=e[r]})),t}var b=/iPhone|iPad/.test(navigator.userAgent);function g(e){return new Promise((function(t,r){for(var o,n=0,i=[],a=function(){var e=o.value;n++;var r=e[0],a=e[1];Blob.prototype.isPrototypeOf(a)?((c=new FileReader).readAsDataURL(a),c.onload=function(e){var o=this.result;i.push({name:r,value:o,filename:a.name,contentType:a.type,type:\"[object Blob]\"}),i.length===n&&t(JSON.stringify(i))}):i.push({name:r,value:a,type:Object.prototype.toString.call(a)})},s=_createForOfIteratorHelperLoose(e.entries());!(o=s()).done;){var c;a()}i.length===n&&t(JSON.stringify(i))}))}var k=function(e){var t=document.createElement(\"a\");return t.href=e,t};function x(e){if(!window.__tiktokwebview_hook_whitelist_setting__)return!0;var t=window.__tiktokwebview_hook_whitelist_setting__,r=t.includes,o=t.excludes,n=k(e),i=n.hostname,a=i+n.pathname;for(var s in o)if(a.startsWith(o[s]))return!1;for(var c in r)if(i.endsWith(r[c]))return!0;return!1}function T(e,t,r){void 0===t&&(t={}),void 0===r&&(r={});try{t.__version__=window.__tiktokwebview_hook_version__;var o={eventName:e,category:t,metrics:r,url:location.href};console.log(\"twh_slardar_report\",o),b?window.webkit.messageHandlers.WIReport.postMessage(o):window.WIReport.postMessage(JSON.stringify(o))}catch(e){console.error(\"report error\",e)}}function S(e){return Object.prototype.toString.call(e).slice(8,-1)}function R(e){return void 0===e&&(e=\"get\"),[\"post\",\"put\",\"patch\"].includes(e.toLowerCase())}function O(e){if(void 0===e&&(e={}),/Channel\\/(local_test|test|inhouse)/.test(navigator.userAgent)&&E(\"local_test\")&&e.message){var t=\"[local_test]: \"+e.message+\"; please contact TikTok Cross Platform Team if you have any problem. This toast does not appear online\";\"console\"===e.level?console.warn(t):function(e){if(e){var t=document.createElement(\"div\");t.textContent=e,t.style.cssText=\"z-index: 9999;position: fixed;left: 0px;right: 0px;top: 20px;text-align: center;background-color: rgba(84, 84, 84, 0.92);color: white;border-radius: 4px;padding: 4px;margin: 16px;font-size:14px;\",document.body.appendChild(t),setTimeout((function(){document.body.removeChild(t)}),1e3)}}(t)}T(e.eventName,e.category,e.metrics)}function A(e,t){try{var r=S(e);null!=e&&\"String\"!==r&&\"Object\"!==r&&O({message:\"The request data type \"+r+\" is not supported\",eventName:\"twh_request_body\",category:{dataType:r,reqUrl:t}})}catch(e){console.error(\"checkBody error\")}}function B(e){return e=new Uint8Array(n(e)?e.buffer:e),window.btoa(e.reduce((function(e,t){return e+String.fromCharCode(t)}),\"\"))}function P(e){for(var t=window.atob(e),r=t.length,o=new Uint8Array(r),n=0;n<r;n++)o[n]=t.charCodeAt(n);return o.buffer}function E(e){try{var t,r,o=window.__webview_ajax_hook_js_switch__||{};if(!o[e])return!1;var n=k(location.href),i=n.host+n.pathname;return!((null==(t=o[e])||null==(r=t.excludes)?void 0:r.findIndex((function(e){return i.startsWith(e)})))>=0)}catch(e){return!1}}String.prototype.startsWith||Object.defineProperty(String.prototype,\"startsWith\",{value:function(e,t){var r=t>0?0|t:0;return this.substring(r,r+e.length)===e}}),String.prototype.endsWith||(String.prototype.endsWith=function(e,t){return(void 0===t||t>this.length)&&(t=this.length),this.substring(t-e.length,t)===e});var j=function(){var e=1===window.__tiktokwebview_hook_inject_method__,t=1===window.__tiktokwebview_ops_hook_inject_method__,r=-1;e&&t?r=1:e&&!t?r=2:!e&&t?r=3:e||t||(r=4),T(\"twh_inject_method_v2\",{type:r})},H=!1,C=function(){H||(H=!0,setTimeout(j,0))};function L(){var e;window.fetch&&(window._realFetch=window._realFetch||window.fetch,window.fetch=function(e,t){var r,o=\"\",n=\"\",i={},a={},s=0,c=!1,u=!1,d=!1,l=!1;if(\"string\"==typeof e&&\"object\"==typeof t&&\"string\"==typeof t.method)o=e,n=t.method,t.body&&t.body.constructor===FormData.prototype.constructor?(r=g(t.body),u=!0):p(t.body)?(d=!0,r=Promise.resolve(B(t.body))):w(t.body)?(l=!0,r=Promise.resolve(t.body.toString())):r=Promise.resolve(t.body),a=v(t.headers);else if(\"object\"==typeof e&&\"function\"==typeof e.json){var _;o=e.url||\"\",n=e.method||\"GET\",\"application/x-www-form-urlencoded\"===e.headers.get(\"Content-Type\")?r=e.text():(null==(_=e._raw_body)?void 0:_.constructor)===FormData.prototype.constructor?(r=Promise.resolve(g(e._raw_body)),u=!0):w(e._raw_body)?(l=!0,r=e.text()):p(e._raw_body)?(d=!0,r=Promise.resolve(B(e._raw_body))):R(n)&&(r=e.json()),a=v(e.headers)}if(u&&(a[\"Content-Type\"]=\"multipart/form-data\"),l&&!a[\"Content-Type\"]&&(a[\"Content-Type\"]=\"application/x-www-form-urlencoded;charset=UTF-8\"),C(),r){var h={};return r.then((function(r){return i=r,c=R(n),x(location.href)||(c=!1),c&&(window._is_offline_closed?(c=!1,s=0):null==i?(c=!1,s=-1):s=1),s<=0&&console.log(\"bytedance://disable_offline\"),c?new Promise((function(r,s){var c=t&&t.signal||e&&e.signal;if(c&&c.aborted)return s(new DOMException(\"Aborted\",\"AbortError\"));var u=window.global_index;window.xxxRequestId=u,window.global_map[u]={callbackNative:function(e){var t;if(c&&c.aborted)return s(new DOMException(\"Aborted\",\"AbortError\"));var i,u={status:e.status,statusText:e.statusText,headers:(i=e.headers||\"\",new Headers(i))};u.url=\"responseURL\"in e?e.responseURL:u.headers.get(\"X-Request-URL\");var d=e.data;e.isResponseBinary&&(d=P(d));var l=new f(d,u);r(l),T(\"twh_ajax\",_extends({},a,{_method:null==(t=n)||null==t.toLowerCase?void 0:t.toLowerCase(),_url:o,_httpCode:u.status,_page:location.href,_v:\"fetch\"}))}},global_index++,h.id=u,A(i,o),h.data=i,h.method=n,h.url=o,h.headers=a,d&&(h.isBinary=!0),m(o)&&(h.isResponseBinary=!0),console.log(\"message\",h);try{if(b)window.webkit.messageHandlers.IMYXHR.postMessage(h);else if(\"success\"!==window.__TTHYBRIDXHR.postMessage(JSON.stringify(h)))return window._realFetch(e,t)}catch(e){window.imy_realxhr_callback(u,{status:0})}})):window._realFetch(e,t)})).catch((function(e){var t;throw O({message:\"ajax hook call failed. \"+n+\" \"+o,eventName:\"twh_ajax\",category:{method:null==(t=n)||null==t.toLowerCase?void 0:t.toLowerCase(),_url:o,_page:location.href,_v:\"fetch\",_httpCode:\"fetch_fail_catch\",_msg:null==e?void 0:e.message}}),console.error(\"error\",e),e}))}return window._realFetch(e,t)}),window._setbackXML_=function(){window.XMLHttpRequest=window._ahrealxhr,\"function\"==typeof window._realFetch&&(window.fetch=window._realFetch)},E(\"request_constructor\")&&(e=window.Request,window.Request=function(t,r){var o;void 0===r&&(r={});var n=new e(t,r);return n._raw_body=t instanceof window.Request?null!=(o=r.body)?o:t._raw_body:r.body,n},window.Request.prototype=e.prototype)}function q(){var e=(new Date).getTime();e=parseInt(e/1e3%1e5),window.global_index=e+1,window.global_map={},window.imy_realxhr_callback=function(e,t){var r=global_map[e];if(r&&!r.is_abort&&r.callbackNative(t),!r)try{Array.prototype.slice.call(document.querySelectorAll(\"iframe\")).forEach((function(r){r.contentWindow.postMessage({key:\"imy_realxhr_callback\",id:e,message:t},\"*\")}))}catch(e){console.error(e)}global_map[e]=null},window.addEventListener(\"message\",(function(e){if(e&&e.data){var t=e.data||{};\"imy_realxhr_callback\"===t.key&&t.id&&t.message&&window.imy_realxhr_callback(t.id,t.message)}}),!1),function(e){function t(e){return function(){var t;T(\"tiktok_webview_hook_prototype_call\",{prototype_method:e}),console.warn(\"XMLHttpRequest.prototype.\"+e+\" called\");for(var r=arguments.length,o=new Array(r),i=0;i<r;i++)o[i]=arguments[i];return(t=n(e)).call.apply(t,[this].concat(o))}}function r(e){return function(){return this.hasOwnProperty(e+\"_\")?this[e+\"_\"]:this._xhr[e]}}function o(t){return function(r){var o=this._xhr,n=this;0==t.indexOf(\"on\")?e[t]?o[t]=function(){e[t](n)||r.apply(o,arguments)}:o[t]=r:this[t+\"_\"]=r}}function n(t){return function(){var r=[].slice.call(arguments);if(e[t]){var o=e[t].call(this,r,this._xhr);if(!0===o)return;if(o&&(\"getResponseHeader\"===t||\"getAllResponseHeaders\"===t))return o}return this._xhr[t].apply(this._xhr,r)}}window._ahrealxhr=window._ahrealxhr||XMLHttpRequest,window.XMLHttpRequest=function(){for(var t in this._xhr=new window._ahrealxhr,this._xhr){var i=\"\";try{i=typeof this._xhr[t]}catch(e){T(\"twh_xhr_attr_error\",{message:null==e?void 0:e.message})}\"function\"===i?this[t]=n(t):Object.defineProperty(this,t,{get:r(t),set:o(t)})}for(var a in e)this[a]||(this[a]=n(a));C()},window.XMLHttpRequest.UNSENT=0,window.XMLHttpRequest.OPENED=1,window.XMLHttpRequest.HEADERS_RECEIVED=2,window.XMLHttpRequest.LOADING=3,window.XMLHttpRequest.DONE=4,window.XMLHttpRequest.prototype={open:t(\"open\"),send:t(\"send\"),setRequestHeader:t(\"setRequestHeader\"),upload:t(\"upload\"),timeout:t(\"timeout\"),withCredentials:t(\"withCredentials\"),abort:t(\"abort\"),constructor:window.XMLHttpRequest},window._ahrealxhr}({getResponseHeader:function(e,t){if(this.needHook){var r=e&&e[0]?e[0].trim():\"\";if(r=r.toLowerCase())for(var o in this.responseHeaders)if(r==o.toLowerCase())return this.responseHeaders[o]}},getAllResponseHeaders:function(e,t){if(this.needHook&&this.responseHeaders){var r=this.responseHeaders,o=\"\";return Object.keys(r).forEach((function(e){o=o+e+\": \"+r[e]+\"\\r\\n\"})),o}},setRequestHeader:function(e,t){try{this._headers||(this._headers={});e[0];var r=e[1];r&&(r=r.toString().trim()),this._headers[e[0]]=e[1]}catch(e){console.error(e)}},open:function(e,t){this.open_arguments=e},send:function(e,t){var r=this,o=function(){r.withCredentials&&(r._xhr.withCredentials=!0),r.responseType&&(r._xhr.responseType=r.responseType),r.timeout&&(r._xhr.timeout=r.timeout)},n=function(){var t=0,n=r.open_arguments[1],i=r.open_arguments&&r.open_arguments[0]&&R(r.open_arguments[0]);if(i&&(t=1),i&&(window._is_offline_closed?i=!1:!1===r.open_arguments[2]?(i=!1,t=-1):/^about:wk/.test(n)?i=!1:t=1),t<0&&console.log(\"bytedance://disable_offline\"),r.needHook=i,console.log(\"bytedance://log_event_v3?event=wkwebview_hook&params=\"+JSON.stringify({value:t})),i){r.request_id=global_index,global_map[r.request_id]=r,global_index++;var a={};r.isBinary&&(a.isBinary=!0),m(r.open_arguments[1])&&(a.isResponseBinary=!0),a.id=r.request_id,A(e[0],r.open_arguments[1]),a.data=e[0],a.method=r.open_arguments[0],a.url=r.open_arguments[1],a.headers=r._headers||{},a.headers.referer=location.href,a.headers.origin=location.protocol+\"//\"+location.host,r.readyState=3,console.log(\"message\",a);try{if(b)return window.webkit.messageHandlers.IMYXHR.postMessage(a),!0;if(\"success\"===window.__TTHYBRIDXHR.postMessage(JSON.stringify(a)))return!0}catch(e){window.imy_realxhr_callback(r.request_id,{status:0})}}else o()};if(!x(location.href))return o(),!1;if(\"get\"===this.open_arguments[0].toLowerCase())return n();if(e&&e[0]&&e[0].constructor===FormData.prototype.constructor){this.setRequestHeader(\"Content-Type\",\"multipart/form-data\");try{g(e[0]).then((function(t){e[0]=t,n()}))}catch(e){console.log(\"error of readFormDataAsText\",e)}return!0}return p(e[0])?(this.isBinary=!0,e[0]=B(e[0]),n(),!0):w(e[0])?(function(e){void 0===e&&(e={}),e=v(e);for(var t=0,r=Object.keys(e);t<r.length;t++){var o=r[t];if(\"content-type\"===o.toLocaleLowerCase())return e[o]}return\"\"}(this._headers)||this.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=UTF-8\"),e[0]=e[0].toString(),n(),!0):n()},abort:function(){this.is_abort=!0},callbackNative:function(e,t){var r,o,n,i=e[0];return this.is_abort?this.readyState=1:(this.status=i.status,this.responseText=i.data?i.data:\"\",this.response=i.data?i.data:\"\",i.isResponseBinary&&(this.response=P(this.response)),this.responseHeaders=i.headers,this.readyState=4),this.readyState>=3&&(this.status>=200&&this.status<300?this.statusText=\"OK\":this.statusText=\"Fail\"),this.dispatchEvent(new Event(\"readystatechange\")),this.dispatchEvent(new Event(\"load\")),4==this.readyState?this.onload&&this.onload():this.onerror&&this.onerror(),this.onloadend&&this.onloadend(),T(\"twh_ajax\",_extends({},this._headers||{},{_method:null==(r=this.open_arguments)||null==(o=r[0])||null==o.toLowerCase?void 0:o.toLowerCase(),_url:null==(n=this.open_arguments)?void 0:n[1],_httpCode:this.status,_page:location.href,_v:\"xhr\"})),!0}})}function F(){try{!function(){var e=\"__ttnetWebviewPerformanceMetrics__\";function t(){var t,r,o=window[e];return!1===o||void 0===o||void 0===(null==(t=o.timing)||null==(r=t.request)?void 0:r.start_time)}function r(e){return void 0===e&&(e=0),Math.floor(1e3*e)}function o(e){return void 0===e&&(e=0),e<=0?0:e}function n(){var t,n,i=window[e],a=(null==(t=i.timing)?void 0:t.detailed_duration)||{},s=(null==(n=i.timing)?void 0:n.request)||{},c=null==i?void 0:i.redirect,u=null==i?void 0:i.webViewRequestStart,d=a.dns,l=a.tcp,f=a.ssl,_=a.send,h=s.request_sent_time,p=s.response_recv_time,w=s.duration,y=s.start_time;return{dns:o(d),tcp:o(l),ssl:o(f),send:o(_),duration:o(w),request_sent_time:r(h),response_recv_time:r(p),start_time:r(y),isRedirect:Boolean(c),redirectEnd:(null==c?void 0:c.end)||0,redirectStart:(null==c?void 0:c.start)||0,redirectCount:(null==c?void 0:c.count)||0,webViewRequestStart:u}}window.__realPerformanceTiming__||(window.__realGetEntriesByType__=performance.getEntriesByType,window.__realPerformanceTiming__=performance.timing,Object.defineProperty(performance,\"timing\",{get:function(){if(t())return window.__realPerformanceTiming__;var e=n(),r=e.dns,o=e.tcp,i=e.ssl,a=e.send,s=e.request_sent_time,c=e.response_recv_time,u=e.duration,d=e.start_time,l=e.isRedirect,f=e.redirectEnd,_=e.redirectStart,h=e.webViewRequestStart,p=d,w=s-a,y=w,m=y-i-o,v=y-i,g=m,k=g-r,x=c,T=p+u,S=l&&!b?{navigationStart:h,redirectEnd:f,redirectStart:_}:{};return _extends({},window.__realPerformanceTiming__.toJSON(),S,{fetchStart:p,domainLookupStart:k,domainLookupEnd:g,connectStart:m,secureConnectionStart:v,connectEnd:y,requestStart:w,responseStart:x,responseEnd:T})},configurable:!0,enumerable:!1}),performance.getEntriesByType=function(){for(var e=arguments.length,r=new Array(e),o=0;o<e;o++)r[o]=arguments[o];var i=window.__realGetEntriesByType__.apply(performance,r);if(t())return i;if(i&&\"navigation\"===r[0]&&i.length){var a=i[0].toJSON(),s=n(),c=s.dns,u=s.tcp,d=s.ssl,l=s.send,f=s.request_sent_time,_=s.response_recv_time,h=s.duration,p=s.start_time,w=s.isRedirect,y=s.redirectEnd,m=s.redirectStart,v=s.redirectCount,g=s.webViewRequestStart,k=w&&!b?g:window.__realPerformanceTiming__.navigationStart,x=p-k,T=f-l-k,S=T-d-u;return[_extends({},a,w&&!b?{redirectEnd:y-k,redirectStart:m-k,redirectCount:v}:{},{fetchStart:x,domainLookupStart:S-c,domainLookupEnd:S,connectStart:S,secureConnectionStart:T-d,connectEnd:T,requestStart:T,responseStart:_-k,responseEnd:x+h})].concat(i.slice(1))}return i},window.__revertFixPerformanceTiming__=function(){window.__realPerformanceTiming__&&(Object.defineProperty(performance,\"timing\",{value:window.__realPerformanceTiming__}),window.__realPerformanceTiming__=void 0),window.__realGetEntriesByType__&&(performance.getEntriesByType=window.__realGetEntriesByType__,window.__realGetEntriesByType__=void 0)})}()}catch(e){console.error(\"fixPerformanceTiming error\"),console.error(e)}}function I(){try{E(\"cookie\")&&function(){var e=Object.getOwnPropertyDescriptor(Document.prototype,\"cookie\")||Object.getOwnPropertyDescriptor(HTMLDocument.prototype,\"cookie\");if(e&&e.configurable){var t=\"Using document.cookie directly must be tested in TikTok Webview\",r=3;Object.defineProperty(document,\"cookie\",{get:function(){return r>0&&(O({message:t,eventName:\"twh_cookie\",category:{type:\"get\"}}),r--),e.get.call(document)},set:function(o){r>0&&O({message:t,eventName:\"twh_cookie\",category:{type:\"set\"}}),r--,e.set.call(document,o)}})}}(),E(\"websocket\")&&function(){if(\"function\"==typeof window.WebSocket){var e=window.WebSocket,t=function(){for(var t=arguments.length,r=new Array(t),o=0;o<t;o++)r[o]=arguments[o];var n=_construct(e,r);return O({message:\"TikTok WebView does not support WebSocket\",eventName:\"twh_websocket\",category:{url:r[0]}}),n};window.WebSocket=t,window.WebSocket.prototype=t.prototype}}(),E(\"web_worker\")&&function(){if(\"function\"==typeof window.Worker){var e=window.Worker,t=function(){for(var t=arguments.length,r=new Array(t),o=0;o<t;o++)r[o]=arguments[o];var n=_construct(e,r);return O({message:\"Using WebWorker in TikTok WebView is dangerous\",eventName:\"twh_worker\"}),n};window.Worker=t,window.Worker.prototype=t.prototype}}(),E(\"service_worker\")&&function(){if(\"serviceWorker\"in navigator){var e=navigator.serviceWorker.register;navigator.serviceWorker.register=function(){O({message:\"Using ServiceWorker in TikTok WebView is dangerous\",eventName:\"twh_service_worker\"});for(var t=arguments.length,r=new Array(t),o=0;o<t;o++)r[o]=arguments[o];return e.apply(this,r)}}}(),E(\"iframe\")&&(e=!1,setTimeout((function(){var t=new MutationObserver((function(){if(!e){var r=document.querySelector(\"iframe\");if(r){var o;if(null!=(o=r.id)&&o.includes(\"JSBridgeIframe\"))return;e=!0,O({message:\"Using Iframe in TikTok Webview is dangerous\",eventName:\"twh_iframe\",category:{iframeId:r.id,src:r.src}}),t.disconnect()}}}));t.observe(document.documentElement,{childList:!0,subtree:!0})}),200))}catch(e){console.error(\"hook api error\")}var e}!function(){if(!window.__tiktokwebview_hook_version__&&x(location.href))try{L(),q(),F(),function(){if(\"function\"==typeof navigator.sendBeacon){var e=navigator.sendBeacon;navigator.sendBeacon=function(){for(var t=arguments.length,r=new Array(t),o=0;o<t;o++)r[o]=arguments[o];if(\"string\"!=typeof r[1])return O({eventName:\"twh_send_beacon\",message:\"Sending non-string data using sendBeacon is not recommended in TikTok\",category:{dataType:S(r[1])}}),e.apply(this,r);var n={data:r[1],url:r[0],method:\"post\",headers:{referer:location.href,origin:location.protocol+\"//\"+location.host,\"Content-Type\":\"text/plain;charset=UTF-8\"}};try{b?window.webkit.messageHandlers.IMYXHR.postMessage(n):window.__TTHYBRIDXHR.postMessage(JSON.stringify(n))}catch(e){O({eventName:\"twh_send_beacon_error\",message:null==e?void 0:e.message})}}}}(),y(),I(),window.__tiktokwebview_hook_version__=\"gecko_1.0.0.72\",T(\"twh_init_success\")}catch(e){O({eventName:\"twh_init_error\",category:{message:null==e?void 0:e.message}})}}()}));";

    public C37803EsZ() {
        super(6);
    }

    public static String LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        FC2.LIZ.getClass();
        jSONObject.put("includes", new JSONArray((Collection) FC2.LIZJ.getValue()));
        jSONObject.put("excludes", new JSONArray((Collection) FC2.LIZLLL.getValue()));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("window.__tiktokwebview_hook_whitelist_setting__ = ");
        LIZ.append(jSONObject);
        return X1D.LIZIZ(LIZ);
    }

    public static String LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("window.__webview_ajax_hook_js_switch__=");
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        Object obj = C37814Esk.LIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("webview_ajax_hook_js_switch", m.class, obj);
        if (LJIIIIZZ != null) {
            obj = LJIIIIZZ;
        }
        LIZ.append(obj);
        return X1D.LIZIZ(LIZ);
    }

    public static boolean LJ(WebView webView) {
        String LIZ;
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        WebviewInlineInjectJsSettings.WebviewInlineInjectJsModel webviewInlineInjectJsModel = WebviewInlineInjectJsSettings.LIZ;
        WebviewInlineInjectJsSettings.WebviewInlineInjectJsModel webviewInlineInjectJsModel2 = (WebviewInlineInjectJsSettings.WebviewInlineInjectJsModel) LIZLLL.LJIIIIZZ("webview_inline_inject_js", WebviewInlineInjectJsSettings.WebviewInlineInjectJsModel.class, webviewInlineInjectJsModel);
        if (webviewInlineInjectJsModel2 != null) {
            webviewInlineInjectJsModel = webviewInlineInjectJsModel2;
        }
        if (webviewInlineInjectJsModel.enabled && (LIZ = C37804Esa.LIZ(webView)) != null) {
            Iterator<String> it = webviewInlineInjectJsModel.denyList.iterator();
            while (it.hasNext()) {
                if (o.LJJJLIIL(it.next(), LIZ, false)) {
                    return false;
                }
            }
            for (String str : webviewInlineInjectJsModel.allowList) {
                if (kotlin.jvm.internal.o.LJ(str, "*") || o.LJJJLIIL(str, LIZ, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0078, code lost:
    
        if (r1.equals("OPTIONS") != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:20:0x002f, B:22:0x0035, B:24:0x003b, B:26:0x004f, B:27:0x0053, B:29:0x0057, B:32:0x007a, B:35:0x0086, B:37:0x008c, B:38:0x0090, B:40:0x0060, B:43:0x0069, B:46:0x0072), top: B:19:0x002f }] */
    @Override // X.C59862NeU, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r14, android.webkit.WebResourceRequest r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37803EsZ.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (webView == null || str == null) {
            return;
        }
        C37804Esa.LJFF(webView, str, "page_start");
        if (!C37804Esa.LJ(webView)) {
            return;
        }
        if (LJ(webView)) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            WebviewInlineInjectJsSettings.WebviewInlineInjectJsModel webviewInlineInjectJsModel = WebviewInlineInjectJsSettings.LIZ;
            WebviewInlineInjectJsSettings.WebviewInlineInjectJsModel webviewInlineInjectJsModel2 = (WebviewInlineInjectJsSettings.WebviewInlineInjectJsModel) LIZLLL.LJIIIIZZ("webview_inline_inject_js", WebviewInlineInjectJsSettings.WebviewInlineInjectJsModel.class, webviewInlineInjectJsModel);
            if (webviewInlineInjectJsModel2 != null) {
                webviewInlineInjectJsModel = webviewInlineInjectJsModel2;
            }
            if (!webviewInlineInjectJsModel.legacyEnable) {
                return;
            }
        }
        C37801EsX.LJIIIIZZ.getClass();
        C37801EsX LIZ = C37800EsW.LIZ(webView, str, true);
        if (LIZ != null) {
            LIZ.LJII = true;
            if (LIZ.LJI && LIZ.LJII) {
                webView.post(new ARunnableS25S0200000_6(LIZ, webView, 50));
            }
        }
        webView.evaluateJavascript("window.__tiktokwebview_ops_hook_inject_method__=1", C37808Ese.LIZ);
        webView.evaluateJavascript(LIZJ(), C37809Esf.LIZ);
        webView.evaluateJavascript(LIZLLL(), C37810Esg.LIZ);
        webView.evaluateJavascript(LJLJLJ, C37811Esh.LIZ);
        if (C37804Esa.LIZIZ(webView) != EnumC37807Esd.PLANB) {
            return;
        }
        webView.evaluateJavascript("window.__tiktokwebview_ajax_hook_planb=1", C37812Esi.LIZ);
    }
}