package X;

import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156996Ed extends AbstractC156986Ec {
    public final VideoPublishEditModel LIZIZ;
    public final ArrayList<AbstractC157016Ef> LIZJ;

    @Override // X.AbstractC156986Ec
    public final AbstractC157016Ef LIZ() {
        AbstractC157016Ef abstractC157016Ef;
        Iterator<AbstractC157016Ef> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                abstractC157016Ef = it.next();
                if (abstractC157016Ef.LIZ() == EnumC139485dg.ECOMMERCE.getScene()) {
                    break;
                }
            } else {
                abstractC157016Ef = null;
                break;
            }
        }
        return abstractC157016Ef;
    }

    @Override // X.AbstractC156986Ec
    public final boolean LIZLLL() {
        AbstractC157016Ef LIZ = LIZ();
        if (LIZ != null && LIZ.LJ()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC156986Ec
    public final VideoPublishEditModel LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC156986Ec
    public final ArrayList<AbstractC157016Ef> LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC156986Ec
    public final void LJFF(java.util.Map<Integer, PreCheckResultModel> map) {
        AbstractC157016Ef abstractC157016Ef;
        PreCheckResultModel preCheckResultModel;
        if (map == null) {
            String creationId = this.LIZIZ.getCreationId();
            o.LJIIIIZZ(creationId, "model.creationId");
            if (C6EG.LIZJ(creationId)) {
                Iterator<AbstractC157016Ef> it = this.LIZJ.iterator();
                while (it.hasNext()) {
                    it.next().LJ.setValue(102);
                    H78.LIZ("BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 102");
                }
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, PreCheckResultModel> entry : map.entrySet()) {
            PreCheckResultModel value = entry.getValue();
            if (value != null && !value.hasShowResult) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int intValue = ((Number) entry2.getKey()).intValue();
            PreCheckResultModel preCheckResultModel2 = (PreCheckResultModel) entry2.getValue();
            Iterator<AbstractC157016Ef> it2 = this.LIZJ.iterator();
            do {
                abstractC157016Ef = null;
                if (!it2.hasNext()) {
                    break;
                } else {
                    abstractC157016Ef = it2.next();
                }
            } while (abstractC157016Ef.LIZ() != intValue);
            AbstractC157016Ef abstractC157016Ef2 = abstractC157016Ef;
            if (abstractC157016Ef2 != null) {
                abstractC157016Ef2.LJI = C6EY.LIZ(preCheckResultModel2);
                if (preCheckResultModel2 != null && !preCheckResultModel2.detectPass) {
                    H78.LIZ("BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 101");
                    abstractC157016Ef2.LJ.setValue(101);
                } else {
                    String creationId2 = this.LIZIZ.getCreationId();
                    o.LJIIIIZZ(creationId2, "model.creationId");
                    if (C6EG.LIZJ(creationId2)) {
                        abstractC157016Ef2.LJ.setValue(102);
                        H78.LIZ("BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 102");
                    } else {
                        HashMap<Integer, PreCheckResultModel> detectResults = this.LIZIZ.creativeModel.audioCopyrightDetectModel.getDetectResults();
                        if (detectResults != null && (preCheckResultModel = detectResults.get(Integer.valueOf(intValue))) != null) {
                            preCheckResultModel.hasShowResult = true;
                        }
                        H78.LIZ("BasePublishAudioCopyrightController -> BasePublishAudioCopyrightHandler -> detectProcessStatus.value = 100");
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156996Ed(VideoPublishEditModel model, ArrayList<AbstractC157016Ef> arrayList) {
        super(model, arrayList);
        o.LJIIIZ(model, "model");
        this.LIZIZ = model;
        this.LIZJ = arrayList;
    }
}
