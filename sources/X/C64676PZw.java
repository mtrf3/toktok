package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import ee1.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: X.PZw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64676PZw extends AbstractC64674PZu {
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public boolean LJIJJ;
    public int LJIJJLI = 100;
    public boolean LJIL;

    @Override // X.AbstractC64674PZu
    public final int LJII() {
        return -1;
    }

    static {
        C16880lQ.LJLLJ(C64676PZw.class);
    }

    @Override // X.AbstractC64674PZu
    public final boolean LJIIIIZZ(List list, JSONObject jSONObject) {
        boolean z;
        LJ(jSONObject);
        this.LJIIJJI = jSONObject.optString("service_name");
        this.LJIILL = jSONObject.optString("scheme_replace");
        this.LJIILLIIL = jSONObject.optString("host_replace");
        this.LJIIZILJ = jSONObject.optString("path_replace");
        String optString = jSONObject.optString("replace");
        this.LJIJI = optString;
        if (!TextUtils.isEmpty(optString)) {
            String optString2 = jSONObject.optString("regex");
            if (!TextUtils.isEmpty(optString2)) {
                try {
                    PatternProtector.compile(optString2);
                    this.LJIJ = optString2;
                } catch (Throwable unused) {
                }
            }
            this.LJIL = true;
            return true;
        }
        if (jSONObject.optInt("drop") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJIJJ = z;
        int optInt = jSONObject.optInt("possibility", 100);
        if (optInt >= 0 && optInt <= 100) {
            this.LJIJJLI = optInt;
        }
        if ((((ArrayList) this.LIZIZ).isEmpty() && ((ArrayList) this.LIZJ).isEmpty() && ((ArrayList) this.LIZLLL).isEmpty() && ((ArrayList) this.LJ).isEmpty() && ((ArrayList) this.LJFF).isEmpty()) || (!this.LJIJJ && this.LJIILL.isEmpty() && this.LJIILLIIL.isEmpty() && this.LJIIZILJ.isEmpty() && this.LJIJI.isEmpty())) {
            this.LJIL = true;
        }
        ListProtector.set(list, 0, Boolean.FALSE);
        return true;
    }

    @Override // X.AbstractC64674PZu
    public final EnumC64675PZv LJI(m mVar, String str, List<String> list) {
        Logger.debug();
        android.net.Uri parse = UriProtector.parse(str);
        if (this.LJIL || !LIZLLL(parse)) {
            ListProtector.set(list, 0, str);
            return EnumC64675PZv.DISPATCH_NONE;
        }
        ListProtector.set(list, 0, str);
        if (this.LJIJJ) {
            Logger.debug();
            int i = this.LJIJJLI;
            if (i < 100) {
                if (i > 0) {
                    if (new Random().nextInt(100) >= this.LJIJJLI) {
                        Logger.debug();
                    }
                }
                return EnumC64675PZv.DISPATCH_NONE;
            }
            ListProtector.set(list, 0, "");
            return EnumC64675PZv.DISPATCH_DROP;
        }
        if (!this.LJIILLIIL.isEmpty() || !this.LJIILL.isEmpty() || !this.LJIIZILJ.isEmpty()) {
            if (parse.getScheme() != null) {
                String scheme = parse.getScheme();
                String str2 = this.LJIILL;
                if (!TextUtils.isEmpty(str2) && (scheme.equals(str2) || (((scheme.equals("http") || scheme.equals("https")) && (str2.equals("http") || str2.equals("https"))) || ((scheme.equals("ws") || scheme.equals("wss")) && (str2.equals("ws") || str2.equals("wss")))))) {
                    str = str.replaceFirst(parse.getScheme(), this.LJIILL);
                }
            }
            if (parse.getHost() != null && !TextUtils.isEmpty(this.LJIILLIIL)) {
                str = str.replaceFirst(parse.getHost(), this.LJIILLIIL);
            }
            if (parse.getPath() != null && !TextUtils.isEmpty(this.LJIIZILJ)) {
                str = str.replaceFirst(parse.getPath(), this.LJIIZILJ);
            }
            ListProtector.set(list, 0, str);
            return EnumC64675PZv.DISPATCH_HIT;
        }
        if (!TextUtils.isEmpty(this.LJIJI) && !TextUtils.isEmpty(this.LJIJ)) {
            ListProtector.set(list, 0, str.replaceAll(this.LJIJ, this.LJIJI));
            return EnumC64675PZv.DISPATCH_HIT;
        }
        return EnumC64675PZv.DISPATCH_NONE;
    }
}
