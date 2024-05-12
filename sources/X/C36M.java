package X;

import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: X.36M, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C36M implements Runnable, Serializable {
    public final /* synthetic */ JSONObject LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public /* synthetic */ C36M(JSONObject jSONObject, boolean z, String str, String str2, String str3) {
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        String str3 = this.LJLJJL;
        if (!z) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                return;
            }
        }
        if (str2 != null) {
            jSONObject.put("service", str2);
        }
        C09900aA.LJ(str3, jSONObject);
    }
}
