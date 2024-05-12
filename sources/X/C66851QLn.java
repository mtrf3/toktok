package X;

import Y.IDComparatorS342S0100000_11;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QLn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66851QLn implements S26, InterfaceC55676LtA, InterfaceC64452PRg {
    public static boolean LIZ;

    @Override // X.InterfaceC55676LtA
    public String LIZLLL() {
        if (((Boolean) C35401Duv.LIZJ.getValue()).booleanValue() && !C48236IwS.LJIIJ()) {
            return "";
        }
        C56662Kg.LIZ().LIZJ("feed_wait_feed_cache", false);
        if (!C48236IwS.LIZLLL) {
            try {
                C48236IwS.LJ.await(500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        C56662Kg.LIZ().LJFF("feed_wait_feed_cache", false);
        return C48236IwS.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66851QLn.LJIIIIZZ():void");
    }

    public /* synthetic */ C66851QLn() {
    }

    public static final IDComparatorS342S0100000_11 LJ(InterfaceC88472Yns... interfaceC88472YnsArr) {
        if (interfaceC88472YnsArr.length > 0) {
            return new IDComparatorS342S0100000_11(interfaceC88472YnsArr, 0);
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static void LJII(JSONObject jSONObject) {
        Object obj;
        boolean LIZLLL = PCI.LIZLLL();
        if (LIZLLL) {
            obj = "Harmony";
        } else {
            obj = "Android";
        }
        try {
            jSONObject.put("os", obj);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (!LIZLLL) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("os_api", C58323Mul.LIZ("hw_sc.build.os.apiversion"));
            jSONObject2.put("os_version", C58323Mul.LIZ("hw_sc.build.platform.version"));
            jSONObject2.put("release_type", C58323Mul.LIZ("hw_sc.build.os.releasetype"));
        } catch (Throwable unused) {
        }
        try {
            jSONObject.put("harmony", jSONObject2);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    @Override // X.InterfaceC64452PRg
    public boolean LIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        return o.LJ(scene, "system_launch");
    }

    @Override // X.S26
    public TuxTextView LIZIZ(Object obj) {
        View containerView = (View) obj;
        o.LJIIIZ(containerView, "containerView");
        View findViewById = containerView.findViewById(R.id.cml);
        TextPaint paint = ((TextView) findViewById).getPaint();
        paint.setFlags(16);
        paint.setAntiAlias(true);
        o.LJIIIIZZ(findViewById, "containerView.findViewBy…e\n            }\n        }");
        return (TuxTextView) findViewById;
    }

    public /* synthetic */ C66851QLn(float f, float f2) {
    }

    public static final int LJFF(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    @Override // X.S26
    public S28 LIZJ(Object obj, boolean z) {
        View containerView = (View) obj;
        o.LJIIIZ(containerView, "containerView");
        View findViewById = containerView.findViewById(R.id.cmt);
        ((S28) findViewById).setCurrencyShowLeft(z);
        o.LJIIIIZZ(findViewById, "containerView.findViewBy…rrencyShowLeft)\n        }");
        return (S28) findViewById;
    }

    public static final int LJI(Object obj, Object obj2, InterfaceC88472Yns[] interfaceC88472YnsArr) {
        for (InterfaceC88472Yns interfaceC88472Yns : interfaceC88472YnsArr) {
            int LJFF = LJFF((Comparable) interfaceC88472Yns.invoke(obj), (Comparable) interfaceC88472Yns.invoke(obj2));
            if (LJFF != 0) {
                return LJFF;
            }
        }
        return 0;
    }
}
