package X;

import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC156986Ec {
    public final String LIZ;

    public abstract AbstractC157016Ef LIZ();

    public abstract VideoPublishEditModel LIZIZ();

    public abstract ArrayList LIZJ();

    public boolean LIZLLL() {
        return this instanceof C157006Ee;
    }

    public void LJ() {
    }

    public /* synthetic */ AbstractC156986Ec(String str) {
        this.LIZ = str;
    }

    public void LJFF(java.util.Map map) {
        Object obj;
        if (map == null) {
            String creationId = LIZIZ().getCreationId();
            o.LJIIIIZZ(creationId, "model.creationId");
            if (C6EG.LIZJ(creationId)) {
                Iterator it = LIZJ().iterator();
                while (it.hasNext()) {
                    ((AbstractC157016Ef) it.next()).LJ.setValue(102);
                    H78.LIZ("BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 102");
                }
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            PreCheckResultModel preCheckResultModel = (PreCheckResultModel) entry.getValue();
            if (preCheckResultModel != null && !preCheckResultModel.hasShowResult) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int intValue = ((Number) entry2.getKey()).intValue();
            PreCheckResultModel preCheckResultModel2 = (PreCheckResultModel) entry2.getValue();
            Iterator it2 = LIZJ().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((AbstractC157016Ef) obj).LIZ() == intValue) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AbstractC157016Ef abstractC157016Ef = (AbstractC157016Ef) obj;
            if (abstractC157016Ef != null) {
                abstractC157016Ef.LJI = C6EY.LIZ(preCheckResultModel2);
                if (preCheckResultModel2 != null && !preCheckResultModel2.detectPass) {
                    H78.LIZ("BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 101");
                    abstractC157016Ef.LJ.setValue(101);
                } else {
                    String creationId2 = LIZIZ().getCreationId();
                    o.LJIIIIZZ(creationId2, "model.creationId");
                    if (C6EG.LIZJ(creationId2)) {
                        abstractC157016Ef.LJ.setValue(102);
                        H78.LIZ("BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 102");
                    } else {
                        abstractC157016Ef.LJ.setValue(100);
                        H78.LIZ("BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 100");
                    }
                }
            }
        }
    }

    public /* synthetic */ AbstractC156986Ec(VideoPublishEditModel model, ArrayList arrayList) {
        o.LJIIIZ(model, "model");
        this.LIZ = "BasePublishAudioCopyrightHandler";
    }
}
