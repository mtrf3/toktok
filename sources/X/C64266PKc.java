package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.PKc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64266PKc {
    public final String LIZ;
    public PLI LIZLLL;
    public PLI LJ;
    public boolean LJFF;
    public int LJI;
    public final long LJIIIIZZ;
    public final int LJIIIZ;
    public ArrayList<String> LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public PL5 LJIILL;
    public final List<PLI> LIZIZ = new ArrayList();
    public final List<PLI> LIZJ = new ArrayList();
    public int LJII = 0;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;

    public C64266PKc(String str) {
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1;
        this.LIZ = str;
        String[] split = str.substring(0, str.length() - 1).split("-");
        if (split.length >= 2) {
            try {
                this.LJIIIIZZ = Long.decode(split[1]).longValue();
            } catch (Throwable unused) {
            }
        }
        if (split.length >= 3) {
            try {
                this.LJIIIZ = Integer.decode(split[2]).intValue();
            } catch (Throwable unused2) {
            }
        }
    }

    public final void LIZ(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        PL5 pl5 = this.LJIILL;
        if (pl5 == null) {
            PKN.LJIILIIL(CardStruct.IStatusCode.DEFAULT, "filters", "parse_native_file", jSONObject);
            return;
        }
        PKN.LJIILIIL("true", "filters", "has_dump", jSONObject);
        boolean z4 = true;
        if (pl5.LIZ > PKM.LJ()) {
            z = true;
        } else {
            z = false;
        }
        PKN.LJIILIIL(String.valueOf(z), "filters", "memory_leak", jSONObject);
        if (pl5.LIZJ > 960) {
            z2 = true;
        } else {
            z2 = false;
        }
        PKN.LJIILIIL(String.valueOf(z2), "filters", "fd_leak", jSONObject);
        if (pl5.LIZLLL > 350) {
            z3 = true;
        } else {
            z3 = false;
        }
        PKN.LJIILIIL(String.valueOf(z3), "filters", "threads_leak", jSONObject);
        PKN.LJIILIIL(String.valueOf(pl5.LJ), "filters", "leak_threads_count", jSONObject);
        if (pl5.LIZIZ <= 460800) {
            z4 = false;
        }
        PKN.LJIILIIL(String.valueOf(z4), "filters", "rss_excess", jSONObject);
        try {
            jSONObject.putOpt("memory_size", Integer.valueOf(pl5.LIZ));
            jSONObject.putOpt("rss", Integer.valueOf(pl5.LIZIZ));
        } catch (Throwable unused) {
        }
        PKN.LJIILIIL(pl5.LJIIIZ, "filters", "native_oom_reason", jSONObject);
        C64265PKb.LIZIZ("vmsize_range", pl5.LIZ, jSONObject);
        C64265PKb.LIZIZ("rss_range", pl5.LIZIZ, jSONObject);
        if (!TextUtils.isEmpty(pl5.LJII)) {
            PKN.LJIILIIL(pl5.LJII, "filters", "parse_os_memory_reason", jSONObject);
        }
        PKN.LJIILIIL(pl5.LJIIIIZZ, "filters", "delete_os_memory_file", jSONObject);
        C64265PKb.LIZ(jSONObject, pl5.LJFF, pl5.LJI);
        for (Map.Entry entry : ((HashMap) pl5.LJIIJJI).entrySet()) {
            PKN.LJIILIIL(entry.getValue(), "filters", (String) entry.getKey(), jSONObject);
        }
        PKV.LIZJ(jSONObject, new File(C78596Usy.LJIJI(PK0.LIZ, pl5.LJIIJ), "ref_table.txt"));
    }
}
