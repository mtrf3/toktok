package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class GXZ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final GXZ LJLIL = new GXZ();

    public GXZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        AVExternalServiceImpl.LIZ().provideAVPerformance().start("av_query_draft_list", "start");
        try {
            try {
                OSZ LIZ = GXY.LIZ();
                if (!((Collection) LIZ.getFirst()).isEmpty()) {
                    ArrayList<String> arrayList = GXY.LIZJ;
                    arrayList.clear();
                    arrayList.addAll(new HashSet((Collection) LIZ.getFirst()));
                }
                if (!((Collection) LIZ.getSecond()).isEmpty()) {
                    ArrayList<String> arrayList2 = GXY.LIZLLL;
                    arrayList2.clear();
                    arrayList2.addAll(new HashSet((Collection) LIZ.getSecond()));
                }
                GXY.LIZ = true;
            } catch (Exception e) {
                H78.LJ(e);
            }
            AVExternalServiceImpl.LIZ().provideAVPerformance().end("av_query_draft_list", "end");
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            AVExternalServiceImpl.LIZ().provideAVPerformance().end("av_query_draft_list", "end");
            throw th;
        }
    }
}
