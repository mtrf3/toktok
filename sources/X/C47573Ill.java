package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: X.Ill, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47573Ill implements InterfaceC47574Ilm {
    public InterfaceC47574Ilm LIZ;
    public final CopyOnWriteArrayList<InterfaceC47564Ilc> LIZIZ = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC47574Ilm
    public final void onStartComplete() {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            interfaceC47574Ilm.onStartComplete();
        }
    }

    @Override // X.InterfaceC47574Ilm
    public final void LIZIZ(JSONObject jSONObject) {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            interfaceC47574Ilm.LIZIZ(jSONObject);
        }
    }

    @Override // X.InterfaceC47574Ilm
    public final void LJ(C47709Inx c47709Inx) {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            interfaceC47574Ilm.LJ(c47709Inx);
        }
    }

    @Override // X.InterfaceC47574Ilm
    public final HashMap<String, String> LJII(String str) {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            return interfaceC47574Ilm.LJII(str);
        }
        return null;
    }

    @Override // X.InterfaceC47574Ilm
    public final void LJIIIIZZ(C47106IeE c47106IeE) {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            interfaceC47574Ilm.LJIIIIZZ(c47106IeE);
        }
    }

    @Override // X.InterfaceC47574Ilm
    public final String getCheckSumInfo(String str) {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            return interfaceC47574Ilm.getCheckSumInfo(str);
        }
        return null;
    }

    @Override // X.InterfaceC47574Ilm
    public final boolean loadLibrary(String str) {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            return interfaceC47574Ilm.loadLibrary(str);
        }
        return false;
    }

    @Override // X.InterfaceC47574Ilm
    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            interfaceC47574Ilm.LIZ(str, jSONObject);
        }
    }

    @Override // X.InterfaceC47574Ilm
    public final String LIZLLL(String str, EnumC47176IfM enumC47176IfM) {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            return interfaceC47574Ilm.LIZLLL(str, enumC47176IfM);
        }
        return null;
    }

    @Override // X.InterfaceC47574Ilm
    public final void LJFF(int i, String str, JSONObject jSONObject) {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            interfaceC47574Ilm.LJFF(i, str, jSONObject);
        }
        if (jSONObject != null && i == 0) {
            try {
                long optLong = jSONObject.optLong("loader_download_size", 0L);
                String str2 = "";
                int optInt = jSONObject.optInt("task_type");
                if (optInt == 1) {
                    str2 = "play";
                } else if (optInt == 2) {
                    str2 = "preload";
                }
                if (!TextUtils.isEmpty(str2) && optLong > 0) {
                    C09900aA.LJIIZILJ(optLong, str2, "video", str2);
                    if (EB7.LIZ()) {
                        PN9.LJ(optLong, str2);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC47574Ilm
    public final String LJI(java.util.Map<String, String> map, String str, EnumC47176IfM enumC47176IfM) {
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            return interfaceC47574Ilm.LJI(map, str, enumC47176IfM);
        }
        return null;
    }

    @Override // X.InterfaceC47574Ilm
    public final void LIZJ(int i, long j, long j2, String str) {
        Iterator<InterfaceC47564Ilc> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(i, j, j2);
        }
        InterfaceC47574Ilm interfaceC47574Ilm = this.LIZ;
        if (interfaceC47574Ilm != null) {
            interfaceC47574Ilm.LIZJ(i, j, j2, str);
        }
    }
}
