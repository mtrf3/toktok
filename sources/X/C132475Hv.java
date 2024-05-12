package X;

import android.app.Application;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132475Hv {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LIZ(String str, EnumC43650HBe cacheResourceType, NLEModel nLEModel, VideoPublishEditModel model, List<String> uuids, boolean z) {
        o.LJIIIZ(cacheResourceType, "cacheResourceType");
        o.LJIIIZ(model, "model");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        String cacheDir = C43073GvN.LIZ(pathService, creativeInfo, cacheResourceType, null, 12).getAbsolutePath();
        if (str == null) {
            str = "";
        }
        C5KH c5kh = new C5KH(nLEModel, str);
        if (uuids != null && (!uuids.isEmpty())) {
            o.LJIIIZ(uuids, "uuids");
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            o.LJIIIIZZ(tracks, "nleModel.tracks");
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                VecNLETrackSlotSPtr LJIILLIIL = it.next().LJIILLIIL();
                ArrayList arrayList2 = new ArrayList();
                Iterator<NLETrackSlot> it2 = LJIILLIIL.iterator();
                while (it2.hasNext()) {
                    NLETrackSlot next = it2.next();
                    if (uuids.contains(next.getUUID())) {
                        arrayList2.add(next);
                    }
                }
                ORS.LJJLIIIJILLIZJL(arrayList2, arrayList);
            }
            if (!arrayList.isEmpty()) {
                ArrayList<NLETrackSlot> LIZ2 = C125694wX.LIZ(arrayList);
                o.LJII(LIZ2, "null cannot be cast to non-null type java.util.ArrayList<com.bytedance.ies.nle.editor_jni.NLETrackSlot>{ kotlin.collections.TypeAliasesKt.ArrayList<com.bytedance.ies.nle.editor_jni.NLETrackSlot> }");
                c5kh.LIZJ = LIZ2;
            }
        }
        o.LJIIIIZZ(cacheDir, "cacheDir");
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        C68322mC c68322mC = new C68322mC();
        XKX.LJ(MBB.INSTANCE, new C64282fg(c68322mC, XKX.LIZIZ(C780334l.LJLIL, C78613UtF.LIZJ, null, new C68882n6(application, c5kh, cacheDir, null, z), 2), null));
        String str2 = (String) c68322mC.element;
        if (str2 == null || str2.length() == 0) {
            return "zip_url_invalid";
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("TemplateProducer, TemplateZip:");
        LIZ3.append(str2);
        H78.LJI(X1D.LIZIZ(LIZ3));
        return str2;
    }
}
