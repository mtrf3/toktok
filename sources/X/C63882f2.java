package X;

import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.ModerationRequestModel;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.ModerationsRequest;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.PushModerationModel;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.VideoModerationResponseItem;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.VideoModerationResponseModels;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.WaterMarkModerationModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2f2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63882f2 extends AbstractC65781Prl implements InterfaceC88472Yns<Long, C76800UCe> {
    public static final C63882f2 LJLIL = new C63882f2();

    public C63882f2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        l.longValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loop called, frameUriRecords size = ");
        java.util.Map<String, Integer> map = C3UH.LIZ;
        LIZ.append(map.size());
        C3UH.LIZLLL(X1D.LIZIZ(LIZ));
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                String str = (String) entry.getKey();
                ((Number) entry.getValue()).intValue();
                arrayList.add(new ModerationRequestModel(EnumC62152cF.WATERMARK_FRAME.ordinal(), new WaterMarkModerationModel(str)));
            }
            C3VR.LIZ.queryModerationResult(new ModerationsRequest(arrayList)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.2f3
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    boolean z;
                    Iterator<VideoModerationResponseItem> it = ((VideoModerationResponseModels) obj).getResults().iterator();
                    while (it.hasNext()) {
                        VideoModerationResponseItem next = it.next();
                        if (next.getStatus() == 2 || next.getStatus() == 3) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("get API result, target vframeUri is ");
                            LIZ2.append(next.getWaterMarkModerationModel().getVFrameUri());
                            C3UH.LIZLLL(X1D.LIZIZ(LIZ2));
                            if (next.getStatus() == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            String LIZJ = C75792yF.LIZJ(new PushModerationModel(next.getWaterMarkModerationModel().getVFrameUri(), z));
                            o.LJIIIIZZ(LIZJ, "toJson(pushModerationModel)");
                            C3UH.LIZJ(LIZJ);
                            C3UH.LIZ.remove(next.getWaterMarkModerationModel().getVFrameUri());
                        }
                    }
                    C3UH.LIZ();
                    C3UH.LIZIZ();
                }
            }, new InterfaceC64592gB() { // from class: X.2f4
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    C3UH.LIZLLL("queryModerationResult api error, request times + 1");
                    C3UH.LIZ();
                    C3UH.LIZIZ();
                }
            });
        } else {
            C3UH.LIZIZ();
        }
        return C76800UCe.LIZ;
    }
}
