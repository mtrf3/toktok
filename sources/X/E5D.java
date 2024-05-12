package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E5D implements G1V {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(E5F.LJLIL);
    public final List<String> LIZIZ = new ArrayList();

    @Override // X.G1V
    public final String LIZ() {
        return "exposure_vid";
    }

    @Override // X.G1V
    public final boolean LIZIZ(G15 flowEngine, EnumC40761FzB componentType) {
        String str;
        String str2;
        o.LJIIIZ(flowEngine, "flowEngine");
        o.LJIIIZ(componentType, "componentType");
        if (!C47261Igj.LJJIJIIJI(EnumC40761FzB.JOURNEY_SLOGAN_ID, EnumC40761FzB.JOURNEY_SERVER_DELAY, EnumC40761FzB.JOURNEY_SMART_LOCK_ID).contains(componentType)) {
            return false;
        }
        this.LIZ.getValue().getClass();
        IPluginService.PluginData LIZ = E50.LIZ();
        this.LIZ.getValue().getClass();
        IPluginService.PluginData LIZIZ = E50.LIZIZ();
        this.LIZ.getValue().getClass();
        IPluginService.PluginData LIZJ = E50.LIZJ();
        String str3 = null;
        if (LIZ != null) {
            str = LIZ.abExposeVid;
        } else {
            str = null;
        }
        if (LIZIZ != null) {
            str2 = LIZIZ.abExposeVid;
        } else {
            str2 = null;
        }
        if (LIZJ != null) {
            str3 = LIZJ.abExposeVid;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() != 0 && !((ArrayList) this.LIZIZ).contains(str)) {
            arrayList.add(str);
        }
        if (str2 != null && str2.length() != 0 && !((ArrayList) this.LIZIZ).contains(str2)) {
            arrayList.add(str2);
        }
        if (str3 != null && str3.length() != 0 && !((ArrayList) this.LIZIZ).contains(str3)) {
            arrayList.add(str3);
        }
        ((ArrayList) this.LIZIZ).addAll(arrayList);
        String LLD = ORZ.LLD(arrayList, ",", null, null, null, 62);
        if (LLD.length() > 0) {
            FH5.LIZIZ().getClass();
            FH5.LIZ(LLD);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("intercept componentType:");
        LIZ2.append(componentType);
        LIZ2.append(",vids:");
        LIZ2.append(LLD);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ2));
        return false;
    }
}
