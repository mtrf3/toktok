package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H02 extends H06 {
    public final /* synthetic */ H00 LIZ;
    public final /* synthetic */ H07 LIZIZ;

    @Override // X.H06
    public final String LIZ() {
        C43403H1r c43403H1r = this.LIZ.LIZIZ;
        if (c43403H1r != null) {
            VideoPublishEditModel model = c43403H1r.LIZ;
            o.LJIIIZ(model, "model");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("common", C43822HHu.LIZ());
                jSONObject.put("multiMedia", C43822HHu.LIZIZ(model));
                String jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "reportData.toString()");
                return jSONObject2;
            } catch (Exception unused) {
                return "";
            }
        }
        o.LJIJI("editModelContainer");
        throw null;
    }

    @Override // X.H06
    public final void LIZIZ(int i) {
        H00 h00 = this.LIZ;
        if (i == h00.LJIIJJI) {
            H07 h07 = this.LIZIZ;
            int i2 = h07.LIZ + h07.LIZIZ;
            List<String> list = h00.LJ;
            if (list != null) {
                if (i2 >= list.size()) {
                    ((C43353Gzt) this.LIZ.LJIJI.getValue()).LIZJ();
                    return;
                }
                H00 h002 = this.LIZ;
                H07 h072 = this.LIZIZ;
                h002.LJIIIZ(h002.LJFF(h072.LIZ + h072.LIZIZ));
                return;
            }
            o.LJIJI("imagePaths");
            throw null;
        }
    }

    public H02(H00 h00, H07 h07) {
        this.LIZ = h00;
        this.LIZIZ = h07;
    }
}
