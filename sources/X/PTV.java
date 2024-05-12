package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.vega.nletodraft.model.Audio;
import com.vega.nletodraft.model.CanvasConfig;
import com.vega.nletodraft.model.LvProtocol;
import com.vega.nletodraft.model.Text;
import com.vega.nletodraft.model.Video;
import com.vega.nletodraft.model.ZipInputExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PTV {
    public final C5WL LIZ;
    public final String LIZIZ;
    public final NLEModel LIZLLL;
    public final Gson LIZJ = new Gson();
    public final List<Video> LJ = new ArrayList();
    public final List<Audio> LJFF = new ArrayList();
    public final List<Text> LJI = new ArrayList();

    public PTV(C5WL c5wl, String str) {
        this.LIZ = c5wl;
        this.LIZIZ = str;
        this.LIZLLL = c5wl.LJLIL;
    }

    public final void LIZ(Context context, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        OJT ojt = OJT.LIZ;
        linkedHashMap.put("cc_creative_cover", String.valueOf(ojt.LIZIZ(context, str)));
        String protocolText = GsonProtectorUtils.toJson(this.LIZJ, new LvProtocol(new CanvasConfig(1080, 1920), System.currentTimeMillis(), 1, this.LJ, this.LJFF, this.LJI));
        PTW.LIZ().i("nletodraft", o.LJIILLIIL(protocolText, "save protocolText: "));
        String str2 = this.LIZIZ;
        o.LJIIIIZZ(protocolText, "protocolText");
        PQ6.LJ(str2, protocolText, "protocol.json");
        linkedHashMap.put("protocol.json", String.valueOf(ojt.LIZIZ(context, "protocol.json")));
        Iterator it = ((ArrayList) this.LJ).iterator();
        while (it.hasNext()) {
            Video video = (Video) it.next();
            linkedHashMap.put(video.path, String.valueOf(OJT.LIZ.LIZIZ(context, video.path)));
        }
        Iterator it2 = ((ArrayList) this.LJFF).iterator();
        while (it2.hasNext()) {
            Audio audio = (Audio) it2.next();
            linkedHashMap.put(audio.path, String.valueOf(OJT.LIZ.LIZIZ(context, audio.path)));
        }
        ZipInputExtra zipInputExtra = this.LIZ.LJLILLLLZI;
        List<Video> list = this.LJ;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = ((ArrayList) list).iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((Video) next).track_index == 0) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        String creationId = zipInputExtra.creationId;
        String str3 = zipInputExtra.gameplayAlgorithm;
        String packageName = zipInputExtra.packageName;
        boolean z = zipInputExtra.isStandardNLEModel;
        long j = zipInputExtra.vid;
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(packageName, "packageName");
        String createJson = GsonProtectorUtils.toJson(this.LIZJ, new ZipInputExtra(creationId, str3, packageName, z, size, linkedHashMap, j));
        PTW.LIZ().i("nletodraft", o.LJIILLIIL(createJson, "save createJson: "));
        String str4 = this.LIZIZ;
        o.LJIIIIZZ(createJson, "createJson");
        PQ6.LJ(str4, createJson, "cc_creative_info.json");
    }
}
