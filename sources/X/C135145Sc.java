package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135145Sc {
    public static String LIZ = "";
    public static final List<InterfaceC135135Sb> LIZIZ = new ArrayList();
    public static final HashSet<String> LIZJ = new HashSet<>();
    public static final HashSet<String> LIZLLL = new HashSet<>();

    public static void LIZJ() {
        Iterator it = ((ArrayList) LIZIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC135135Sb) it.next()).LL();
        }
        LIZJ.clear();
        LIZ = "";
        ((ArrayList) LIZIZ).clear();
    }

    public static boolean LIZIZ(VideoPublishEditModel model) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        o.LJIIIZ(model, "model");
        if (LIZLLL.contains(model.getCreationId())) {
            return true;
        }
        if (!C140435fD.LIZ(model)) {
            return false;
        }
        Iterator it = ((ArrayList) LIZIZ).iterator();
        while (it.hasNext()) {
            if (((InterfaceC135135Sb) it.next()).LLI()) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = model.multiEditVideoRecordData;
                if (multiEditVideoStatusRecordData != null && (arrayList = multiEditVideoStatusRecordData.originalSegments) != null) {
                    Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        TimeSpeedModelExtension next = it2.next();
                        if (!C78685UuP.LJJJZ(next.getCreateId())) {
                            break;
                        }
                        if (!ORZ.LJLJJI(next.getCreateId(), LIZJ)) {
                            LIZLLL.add(model.getCreationId());
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, InterfaceC65784Pro interfaceC65784Pro) {
        if (C140435fD.LIZ(videoPublishEditModel) && o.LJ(LIZ, videoPublishEditModel.getCreationId())) {
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            return true;
        }
        LIZJ();
        return false;
    }
}
