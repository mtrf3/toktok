package X;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J84<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ ActivityC45651qj LJLJJL;

    public J84(String str, C68322mC<String> c68322mC, String str2, String str3, ActivityC45651qj activityC45651qj) {
        this.LJLIL = str;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = activityC45651qj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        JSONObject jSONObject = new JSONObject();
        String str = this.LJLIL;
        C68322mC<String> c68322mC = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String str3 = this.LJLJJI;
        ActivityC45651qj activityC45651qj = this.LJLJJL;
        try {
            jSONObject.put("tab_name", C54030LIk.LJFF(str));
            jSONObject.put("enter_from", C54030LIk.LJFF(c68322mC.element));
            if (str2 == null) {
                str2 = "be_null";
            }
            jSONObject.put("enter_method", str2);
            jSONObject.put("location", str3);
            C54030LIk.LIZ(C54030LIk.LJFF(str), activityC45651qj, jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        FMX.LJIILJJIL("enter_homepage_tab", jSONObject);
        return C76800UCe.LIZ;
    }
}
