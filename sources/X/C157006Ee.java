package X;

import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157006Ee extends AbstractC156986Ec {
    public final VideoPublishEditModel LIZIZ;
    public final ArrayList<AbstractC157016Ef> LIZJ;

    @Override // X.AbstractC156986Ec
    public final AbstractC157016Ef LIZ() {
        AbstractC157016Ef abstractC157016Ef = null;
        if (this.LIZIZ.creativeModel.privacySettingModel.isSubscribeOnly) {
            Iterator<AbstractC157016Ef> it = this.LIZJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC157016Ef next = it.next();
                if (next.LIZ() == EnumC139485dg.ECOMMERCE.getScene()) {
                    abstractC157016Ef = next;
                    break;
                }
            }
            return abstractC157016Ef;
        }
        Iterator<AbstractC157016Ef> it2 = this.LIZJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AbstractC157016Ef next2 = it2.next();
            if (next2.LIZ() == EnumC139485dg.LONG_VIDEO.getScene()) {
                abstractC157016Ef = next2;
                break;
            }
        }
        return abstractC157016Ef;
    }

    @Override // X.AbstractC156986Ec
    public final void LJ() {
        PreCheckResultModel preCheckResultModel;
        HashMap<Integer, PreCheckResultModel> detectResults;
        PreCheckResultModel preCheckResultModel2;
        PreCheckResultModel preCheckResultModel3;
        HashMap<Integer, PreCheckResultModel> detectResults2 = this.LIZIZ.creativeModel.audioCopyrightDetectModel.getDetectResults();
        PreCheckResultModel preCheckResultModel4 = null;
        if (detectResults2 != null) {
            preCheckResultModel = detectResults2.get(Integer.valueOf(EnumC139485dg.LONG_VIDEO.getScene()));
        } else {
            preCheckResultModel = null;
        }
        HashMap<Integer, PreCheckResultModel> detectResults3 = this.LIZIZ.creativeModel.audioCopyrightDetectModel.getDetectResults();
        if (detectResults3 != null) {
            preCheckResultModel4 = detectResults3.get(Integer.valueOf(EnumC139485dg.ECOMMERCE.getScene()));
        }
        if (preCheckResultModel != null) {
            if (preCheckResultModel.detectPass) {
                if (preCheckResultModel4 != null && !preCheckResultModel4.detectPass) {
                    AbstractC157016Ef LIZ = LIZ();
                    if (LIZ != null) {
                        LIZ.LJI();
                        return;
                    }
                    return;
                }
                if (preCheckResultModel == null) {
                    return;
                }
            }
            if (preCheckResultModel.detectPass) {
                if (preCheckResultModel4 != null && preCheckResultModel4.detectPass) {
                    HashMap<Integer, PreCheckResultModel> detectResults4 = this.LIZIZ.creativeModel.audioCopyrightDetectModel.getDetectResults();
                    if (detectResults4 == null || (preCheckResultModel3 = detectResults4.get(Integer.valueOf(EnumC139485dg.ECOMMERCE.getScene()))) == null) {
                        return;
                    }
                    preCheckResultModel3.hasShowResult = true;
                    return;
                }
                if (preCheckResultModel == null) {
                    return;
                }
            }
            if (preCheckResultModel.detectPass || (detectResults = this.LIZIZ.creativeModel.audioCopyrightDetectModel.getDetectResults()) == null || (preCheckResultModel2 = detectResults.get(Integer.valueOf(EnumC139485dg.ECOMMERCE.getScene()))) == null) {
                return;
            }
            preCheckResultModel2.hasShowResult = true;
        }
    }

    @Override // X.AbstractC156986Ec
    public final VideoPublishEditModel LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC156986Ec
    public final ArrayList<AbstractC157016Ef> LIZJ() {
        return this.LIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157006Ee(VideoPublishEditModel model, ArrayList<AbstractC157016Ef> arrayList) {
        super(model, arrayList);
        o.LJIIIZ(model, "model");
        this.LIZIZ = model;
        this.LIZJ = arrayList;
    }
}
