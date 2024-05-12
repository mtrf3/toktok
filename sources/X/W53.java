package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.i0;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class W53 extends C81695W4l {
    public final SIR LIZIZ;
    public final W5E LIZJ;
    public long LIZLLL = -1;

    public W53(W5E w5e) {
        this.LIZJ = w5e;
        this.LIZIZ = w5e.LJJJIL;
    }

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        if (this.LIZIZ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isSuccess", false);
                if (th != null) {
                    jSONObject.put("err_msg", th.getMessage());
                }
                this.LIZIZ.LIZ(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        this.LIZLLL = System.currentTimeMillis();
        C79083V1z.LJ(this.LIZJ.hashCode(), "FrescoSensibleListener", "onSubmit");
    }

    @Override // X.C81695W4l, X.W4V
    public final void LJIIJJI(String str, W5O w5o) {
        C79083V1z.LJFF(this.LIZJ.hashCode(), "FrescoSensibleListener", "onRelease", i0.LJFF("id:", str));
    }

    @Override // X.C81695W4l, X.W4V
    public final void LJIIIIZZ(String str, W5O w5o, Throwable th) {
        C79083V1z.LIZIZ(this.LIZJ.hashCode(), "FrescoSensibleListener", "onFailure", C25620zW.LIZ("throwable:", th));
        if (this.LIZIZ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isSuccess", false);
                if (th != null) {
                    jSONObject.put("err_msg", th.getMessage());
                }
                this.LIZIZ.LIZ(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public final void LJIIL(String str, Object obj, W5O w5o, java.util.Map map) {
        int i;
        int i2;
        int i3;
        C81828W9o c81828W9o;
        int i4;
        int i5;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("id: ");
        LIZ.append(str);
        LIZ.append("   imageRequest:");
        LIZ.append(w5o);
        C79083V1z.LIZ(this.LIZJ.hashCode(), "FrescoSensibleListener", "onFinalImageSet", X1D.LIZIZ(LIZ));
        if (w5o == null) {
            return;
        }
        VAA vaa = w5o.LJIJI;
        if (vaa != null) {
            i = vaa.LJ().getHeight();
            i2 = vaa.LJ().getWidth();
        } else {
            i = 0;
            i2 = 0;
        }
        new Rect();
        String uri = w5o.LIZIZ.toString();
        if (this.LIZLLL > 0) {
            i3 = (int) (System.currentTimeMillis() - this.LIZLLL);
        } else {
            i3 = -1;
        }
        int i6 = 1;
        if (obj instanceof W5A) {
            W5A w5a = (W5A) obj;
            i4 = w5a.getImageCount();
            c81828W9o = w5a.getImageFormat();
            if (w5a.isRequestInternet) {
                i5 = 0;
            } else if (w5a.isHitDiskCache) {
                i5 = 2;
            } else if (w5a.isHitMemoryCache) {
                i5 = 1;
            } else {
                i5 = -1;
            }
        } else {
            c81828W9o = null;
            i4 = -1;
            i5 = -1;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSuccess", true);
            jSONObject.put("view_width", i2);
            jSONObject.put("view_height", i);
            HashMap hashMap = (HashMap) map;
            jSONObject.put("image_width", hashMap.get("drawableWidth"));
            jSONObject.put("image_height", hashMap.get("drawableHeight"));
            jSONObject.put("duration", i3);
            jSONObject.put("from", i5);
            if (c81828W9o == null) {
                str2 = "undefined";
            } else {
                str2 = c81828W9o.LIZ;
            }
            jSONObject.put("image_type", str2);
            jSONObject.put("image_sdk_version", "1.13.42.20-tt-test1");
            jSONObject.put("image_count", i4);
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("uri", uri);
            jSONObject.put("scene_tag", hashMap.get("scene_tag"));
            if (TextUtils.isEmpty(jSONObject.optString("biz_tag"))) {
                android.net.Uri parse = UriProtector.parse(uri);
                String queryParameter = UriProtector.getQueryParameter(parse, "biz_tag");
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = UriProtector.getQueryParameter(parse, "from");
                }
                if (queryParameter != null) {
                    try {
                        jSONObject.put("biz_tag", queryParameter);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            if (vaa != null) {
                Context context = vaa.LJ().getContext();
                if (context instanceof Activity) {
                    jSONObject.put("page_tag", C16880lQ.LJLLJ(context.getClass()));
                }
            }
            jSONObject.put("exception_tag", 1);
            if (i5 != 2 && i5 != 1) {
                i6 = 0;
            }
            jSONObject.put("hit_cache", i6);
            if (i5 == -1) {
                i5 = 0;
            }
            jSONObject.put("hit_type", i5);
        } catch (JSONException unused) {
        }
        SIR sir = this.LIZIZ;
        if (sir != null) {
            sir.LIZ(jSONObject);
        }
    }

    @Override // X.C81695W4l, X.W4V
    public final void LJIIIZ(String str, Object obj, Animatable animatable, W5O w5o, java.util.Map map) {
        try {
            if (C61831OOl.LJIIIZ(w5o.LIZIZ.getHost())) {
                C61831OOl.LJI(w5o, Long.valueOf(Long.valueOf(this.LIZLLL).longValue()));
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
