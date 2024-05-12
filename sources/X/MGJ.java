package X;

import Y.AfS61S0100000_9;
import Y.IDhS102S0100000_9;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class MGJ extends Dialog {
    public C73411SrX LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final java.util.Map<String, String> LJLJJL;
    public final Bundle LJLJJLL;
    public long LJLJL;
    public C8IC LJLJLJ;

    @Override // android.app.Dialog
    public final void onBackPressed() {
    }

    @Override // android.app.Dialog
    public final void show() {
        C8IC c8ic = this.LJLJLJ;
        if (c8ic != null) {
            c8ic.setVisibility(0);
        }
        if (new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-6431479634948185298")).LIZ) {
            return;
        }
        super.show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        C73411SrX c73411SrX = this.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        this.LJLJL = System.currentTimeMillis();
        super.onCreate(bundle);
        setContentView(R.layout.bvd);
        C8IC c8ic = (C8IC) findViewById(R.id.ceq);
        this.LJLJLJ = c8ic;
        if (c8ic != null) {
            c8ic.setVisibility(0);
        }
        setCanceledOnTouchOutside(false);
        C73428Sro LJJL = AbstractC73672Svk.LJJIIJZLJL(new Callable() { // from class: X.2tX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONObject jSONObject = new JSONObject();
                List<String> LLIL = ORZ.LLIL(((LinkedHashMap) MGJ.this.LJLJJL).keySet());
                MGJ mgj = MGJ.this;
                for (String str : LLIL) {
                    try {
                        jSONObject.put(str, ((LinkedHashMap) mgj.LJLJJL).get(str));
                    } catch (Exception unused) {
                    }
                }
                return jSONObject.toString();
            }
        }).LJJIII(new IDhS102S0100000_9(this, 26), false).LJJL(T16.LIZ());
        int i = 3;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("fetch_vipinfo_preload_timeout", 3);
        } catch (Exception unused) {
        }
        this.LJLIL = (C73411SrX) LJJL.LJJLIIIJJI(i, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new MGK(this), new AfS61S0100000_9(this, 87));
    }

    public MGJ(android.net.Uri uri, Context context, Bundle bundle) {
        super(context, R.style.jf);
        int i;
        Integer LJJIL;
        this.LJLJJL = new LinkedHashMap();
        String queryParameter = UriProtector.getQueryParameter(uri, WM7.SCENE_SERVICE);
        if (queryParameter != null && (LJJIL = C38350F3i.LJJIL(queryParameter)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
        UriProtector.getQueryParameter(uri, "music_id");
        String queryParameter2 = UriProtector.getQueryParameter(uri, "track_id");
        this.LJLJI = queryParameter2 == null ? "" : queryParameter2;
        this.LJLJJI = uri.getBooleanQueryParameter("allow_play_full_song_in_tt", false);
        this.LJLJJLL = bundle;
        Iterator LIZ = C47117IeP.LIZ(uri, "uri.queryParameterNames");
        while (LIZ.hasNext()) {
            String it = (String) LIZ.next();
            java.util.Map<String, String> map = this.LJLJJL;
            o.LJIIIIZZ(it, "it");
            map.put(it, UriProtector.getQueryParameter(uri, it));
        }
    }

    public final void LIZ(int i, Boolean bool, String str, String str2, String str3) {
        String str4;
        HashSet hashSet = new HashSet(C47261Igj.LJJIJIIJI("enter_from", "enter_method", "item_id", "meta_song_id", "music_id", "upsell_reason"));
        HashMap hashMap = new HashMap();
        if (str3 != null) {
            android.net.Uri parse = UriProtector.parse(str3);
            Iterator LIZ = C47117IeP.LIZ(parse, "uri.queryParameterNames");
            while (LIZ.hasNext()) {
                String key = (String) LIZ.next();
                if (hashSet.contains(key)) {
                    o.LJIIIIZZ(key, "key");
                    hashMap.put(key, UriProtector.getQueryParameter(parse, key));
                }
            }
        }
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("subscription_status", str4);
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJL;
        hashMap.put("call_to_action", str);
        hashMap.put("request_id", str2);
        hashMap.put("loading_duration", String.valueOf(currentTimeMillis));
        hashMap.put("status", String.valueOf(i));
        FMX.LJIIL("group_click_loading_result", hashMap);
    }
}
