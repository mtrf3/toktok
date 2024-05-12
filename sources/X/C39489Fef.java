package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fef, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39489Fef extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;
    public final JSONObject LJLJJLL;
    public final JSONObject LJLJL;
    public final Object LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;
    public final String LJLLL;
    public final String LJLLLL;
    public final String LJLLLLLL;
    public final String LJLZ;
    public final List<String> LJZ;
    public final JSONObject LJZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C39489Fef() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 524287);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Boolean.valueOf(this.LJLJJI), this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, this.LJLLLLLL, this.LJLZ, this.LJZ, this.LJZI};
    }

    public static C39489Fef L(C39489Fef c39489Fef, JSONObject jSONObject, Object obj, int i) {
        String id;
        String str;
        String namespace;
        boolean z;
        String str2;
        JSONObject jSONObject2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        List<String> list;
        JSONObject jSONObject3 = jSONObject;
        Object obj2 = obj;
        JSONObject jSONObject4 = null;
        if ((i & 1) != 0) {
            id = c39489Fef.LJLIL;
        } else {
            id = null;
        }
        if ((i & 2) != 0) {
            str = c39489Fef.LJLILLLLZI;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            namespace = c39489Fef.LJLJI;
        } else {
            namespace = null;
        }
        if ((i & 8) != 0) {
            z = c39489Fef.LJLJJI;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            str2 = c39489Fef.LJLJJL;
        } else {
            str2 = null;
        }
        if ((i & 32) != 0) {
            jSONObject2 = c39489Fef.LJLJJLL;
        } else {
            jSONObject2 = null;
        }
        if ((i & 64) != 0) {
            jSONObject3 = c39489Fef.LJLJL;
        }
        if ((i & 128) != 0) {
            obj2 = c39489Fef.LJLJLJ;
        }
        if ((i & 256) != 0) {
            str3 = c39489Fef.LJLJLLL;
        } else {
            str3 = null;
        }
        if ((i & 512) != 0) {
            str4 = c39489Fef.LJLL;
        } else {
            str4 = null;
        }
        if ((i & 1024) != 0) {
            str5 = c39489Fef.LJLLI;
        } else {
            str5 = null;
        }
        if ((i & 2048) != 0) {
            str6 = c39489Fef.LJLLILLLL;
        } else {
            str6 = null;
        }
        if ((i & 4096) != 0) {
            str7 = c39489Fef.LJLLJ;
        } else {
            str7 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str8 = c39489Fef.LJLLL;
        } else {
            str8 = null;
        }
        if ((i & 16384) != 0) {
            str9 = c39489Fef.LJLLLL;
        } else {
            str9 = null;
        }
        if ((32768 & i) != 0) {
            str10 = c39489Fef.LJLLLLLL;
        } else {
            str10 = null;
        }
        if ((65536 & i) != 0) {
            str11 = c39489Fef.LJLZ;
        } else {
            str11 = null;
        }
        if ((131072 & i) != 0) {
            list = c39489Fef.LJZ;
        } else {
            list = null;
        }
        if ((i & 262144) != 0) {
            jSONObject4 = c39489Fef.LJZI;
        }
        c39489Fef.getClass();
        o.LJIIIZ(id, "id");
        o.LJIIIZ(namespace, "namespace");
        return new C39489Fef(id, str, namespace, z, str2, jSONObject2, jSONObject3, obj2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, jSONObject4);
    }

    public /* synthetic */ C39489Fef(String str, String str2, String str3, boolean z, String str4, JSONObject jSONObject, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, int i) {
        this((i & 1) != 0 ? AnonymousClass629.LIZ("UUID.randomUUID().toString()") : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : jSONObject, null, null, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (32768 & i) != 0 ? null : str12, (65536 & i) != 0 ? null : str13, (i & 131072) == 0 ? list : null, null);
    }

    public C39489Fef(String id, String str, String namespace, boolean z, String str2, JSONObject jSONObject, JSONObject jSONObject2, Object obj, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<String> list, JSONObject jSONObject3) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(namespace, "namespace");
        this.LJLIL = id;
        this.LJLILLLLZI = str;
        this.LJLJI = namespace;
        this.LJLJJI = z;
        this.LJLJJL = str2;
        this.LJLJJLL = jSONObject;
        this.LJLJL = jSONObject2;
        this.LJLJLJ = obj;
        this.LJLJLLL = str3;
        this.LJLL = str4;
        this.LJLLI = str5;
        this.LJLLILLLL = str6;
        this.LJLLJ = str7;
        this.LJLLL = str8;
        this.LJLLLL = str9;
        this.LJLLLLLL = str10;
        this.LJLZ = str11;
        this.LJZ = list;
        this.LJZI = jSONObject3;
    }
}
