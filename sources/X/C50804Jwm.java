package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import defpackage.e1;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jwm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50804Jwm {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C50815Jwx.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C50816Jwy.LJLIL);
    public static final C5H3 LIZJ = V16.LJJJJLL(C50818Jx0.LJLIL);
    public static String LIZLLL = "";
    public static final ArrayMap<SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, AbstractC60800Ntc> LJ = new ArrayMap<>();

    public static void LJ() {
        Iterator it = ((ConcurrentHashMap) LIZ.getValue()).entrySet().iterator();
        while (it.hasNext()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(((C50811Jwt) ((Map.Entry) it.next()).getValue()).LJLILLLLZI);
        }
        ((ConcurrentHashMap) LIZ.getValue()).clear();
        Iterator it2 = ((ConcurrentHashMap) LIZIZ.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(((C50811Jwt) ((Map.Entry) it2.next()).getValue()).LJLILLLLZI);
        }
        ((ConcurrentHashMap) LIZIZ.getValue()).clear();
    }

    public static void LIZIZ(CharSequence charSequence) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkCachedTheme, comingTheme: ");
        LIZ2.append((Object) charSequence);
        LIZ2.append(", cachedTheme: ");
        LIZ2.append(LIZLLL);
        C15280iq.LJ("search_spark_preload", X1D.LIZIZ(LIZ2));
        if ((TextUtils.equals(charSequence, "TikTok Theme Dark") || TextUtils.equals(LIZLLL, "TikTok Theme Dark")) && !TextUtils.equals(charSequence, LIZLLL)) {
            LJ();
            LIZLLL = charSequence.toString();
        }
    }

    public static C50811Jwt LIZJ(String str, AbstractC60800Ntc abstractC60800Ntc) {
        CharSequence charSequence;
        EnumC50808Jwq enumC50808Jwq;
        SearchResultActivity LJ2 = C50989Jzl.LJ();
        if (LJ2 == null || (charSequence = C79045V0n.LJIIJJI(LJ2)) == null) {
            charSequence = "";
        }
        LIZIZ(charSequence);
        C50811Jwt c50811Jwt = (C50811Jwt) ((ConcurrentHashMap) LIZIZ.getValue()).remove(str);
        if (c50811Jwt == null) {
            c50811Jwt = (C50811Jwt) ((ConcurrentHashMap) LIZ.getValue()).remove(str);
        }
        EnumC50808Jwq enumC50808Jwq2 = null;
        if (C50060Jkm.LIZ(str)) {
            if (c50811Jwt != null) {
                enumC50808Jwq = c50811Jwt.LJLJI;
            } else {
                enumC50808Jwq = null;
            }
            if (enumC50808Jwq == EnumC50808Jwq.LOADING) {
                LJ.put(c50811Jwt.LJLILLLLZI, abstractC60800Ntc);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fetch catch of ");
        LIZ2.append(str);
        LIZ2.append(" and result is ");
        LIZ2.append(c50811Jwt);
        LIZ2.append(" status:");
        if (c50811Jwt != null) {
            enumC50808Jwq2 = c50811Jwt.LJLJI;
        }
        LIZ2.append(enumC50808Jwq2);
        LIZ2.append(' ');
        C15280iq.LIZIZ("search_spark_preload", X1D.LIZIZ(LIZ2));
        return c50811Jwt;
    }

    public static void LIZ(boolean z, String str, C50811Jwt c50811Jwt) {
        try {
            Context context = c50811Jwt.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context, "sparkCache.sparkView.context");
            CharSequence LJIIJJI = C79045V0n.LJIIJJI(context);
            if (LJIIJJI == null) {
                LJIIJJI = "";
            }
            LIZIZ(LJIIJJI);
        } catch (Exception unused) {
            C15280iq.LIZJ("search_spark_preload", "theme variant concurrent error");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cacheSparkView:");
        LIZ2.append(str);
        C15280iq.LIZIZ("search_spark_preload", X1D.LIZIZ(LIZ2));
        if (z) {
            ((ConcurrentHashMap) LIZIZ.getValue()).put(str, c50811Jwt);
        } else {
            ((ConcurrentHashMap) LIZ.getValue()).put(str, c50811Jwt);
        }
    }

    public static void LIZLLL(Context context, String schema, String str, boolean z, C50770JwE c50770JwE, int i) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ2;
        TemplateData LJFF;
        C50770JwE c50770JwE2 = c50770JwE;
        String str2 = str;
        if ((i & 8) != 0) {
            z = false;
        }
        AttributeSet attributeSet = null;
        if ((i & 32) != 0) {
            c50770JwE2 = null;
        }
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("tryPreload by spark thread: ");
        LIZ3.append(C16880lQ.LLLLIIIILLL().getName());
        LIZ3.append(" schema:");
        LIZ3.append(schema);
        C15280iq.LIZIZ("search_spark_preload", X1D.LIZIZ(LIZ3));
        if (e1.LIZ(31744, "preload_without_prepare", true, false) && z) {
            SparkSchemaParam LJIIZILJ = new SparkContext().LJIIZILJ(3);
            if (LJIIZILJ != null && LJIIZILJ.getUseMutableContext()) {
                context = new MutableContextWrapper(context);
            }
            LIZ2 = new SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS(context, attributeSet, 62);
            C40343FsR.LJIILJJIL.LJIIIZ();
        } else {
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = new SparkContext();
            c40342FsQ.getClass();
            LIZ2 = C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext));
        }
        C50336JpE c50336JpE = C50336JpE.LJI;
        if (str2 == null) {
            str2 = "{}";
        }
        java.util.Map LIZIZ2 = C0DC.LIZIZ("isPreload", Boolean.TRUE);
        SparkContext sparkContext2 = LIZ2.getSparkContext();
        c50336JpE.getClass();
        if ((C50342JpK.LIZ(schema) && C50346JpO.LIZIZ()) || C50346JpO.LIZJ()) {
            LJFF = C50336JpE.LIZLLL(str2, LIZIZ2, sparkContext2);
        } else {
            LJFF = TemplateData.LJFF(str2);
            JSONObject jSONObject = new JSONObject();
            Iterator it = LIZIZ2.entrySet().iterator();
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "commonParam.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                LJFF.LJI(next, jSONObject.get(next));
            }
        }
        java.util.Map<String, ? extends Object> LIZIZ3 = C0DC.LIZIZ("is_preload", Boolean.TRUE);
        InterfaceC60761Nsz interfaceC60761Nsz = LIZ2.LJLIL;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LIZ(LIZIZ3);
        }
        C50811Jwt c50811Jwt = new C50811Jwt(schema, LIZ2, EnumC50808Jwq.LOADING);
        if (C50060Jkm.LIZ(schema)) {
            LIZ(false, schema, c50811Jwt);
        }
        C50802Jwk.LIZIZ(C50802Jwk.LIZ, LIZ2, schema, LJFF, true, new C50803Jwl(new C34K(), new C68322mC(), schema, new C34K(), c50811Jwt, false), new C50820Jx2(c50770JwE2, LIZ2), null, 64);
    }
}
