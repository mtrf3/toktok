package X;

import Y.ARunnableS51S0100000_15;
import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* loaded from: classes16.dex */
public final class Y51 extends INLEResourceDownloadStatusListener {
    public final /* synthetic */ Y50 LIZ;

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onAllResourceDownloadFinished() {
        C1DH.LJJIJIIJI(new ARunnableS51S0100000_15(this.LIZ, 45));
    }

    public Y51(Y50 y50) {
        this.LIZ = y50;
    }

    public final boolean LIZ(NLEResourceNode nLEResourceNode) {
        String str;
        Y50 y50 = this.LIZ;
        java.util.Set<String> set = ((VideoPublishEditModel) y50.LIZ.LIZ(y50, Y50.LJIILLIIL[0])).creativeModel.autoCutModel.asyncRenderModel.asyncRenderUnnecessaryDownloadSet;
        if (set == null) {
            return false;
        }
        if (nLEResourceNode != null) {
            str = nLEResourceNode.LIZLLL();
        } else {
            str = null;
        }
        if (!ORZ.LJLJJI(str, set)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onStart(NLEResourceNode nLEResourceNode) {
        String str;
        if (LIZ(nLEResourceNode) && this.LIZ.LJII.get() == 0) {
            this.LIZ.LJII.set(System.currentTimeMillis());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ASYNC_RENDER: onStart downloadStartTime=");
        LIZ.append(this.LIZ.LJII.get());
        LIZ.append(", resourceId=");
        if (nLEResourceNode != null) {
            str = nLEResourceNode.LIZLLL();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onSuccess(NLEResourceNode nLEResourceNode, boolean z) {
        String str;
        if (LIZ(nLEResourceNode)) {
            if (z) {
                this.LIZ.LJ.incrementAndGet();
            }
            this.LIZ.LJI.incrementAndGet();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ASYNC_RENDER: onSuccess。cacheCount=");
        LIZ.append(this.LIZ.LJ.get());
        LIZ.append(", successCount=");
        LIZ.append(this.LIZ.LJI.get());
        LIZ.append(", isFromCache=");
        LIZ.append(z);
        LIZ.append(", resourceId=");
        if (nLEResourceNode != null) {
            str = nLEResourceNode.LIZLLL();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onFail(NLEResourceNode nLEResourceNode, int i, String str) {
        String str2;
        if (LIZ(nLEResourceNode)) {
            this.LIZ.LJFF.incrementAndGet();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ASYNC_RENDER: onFail. failCount=");
        LIZ.append(this.LIZ.LJFF.get());
        LIZ.append(", errorCode=");
        LIZ.append(i);
        LIZ.append(", errorMsg=");
        LIZ.append(str);
        LIZ.append(", resourceNode=");
        if (nLEResourceNode != null) {
            str2 = nLEResourceNode.LIZLLL();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
    }
}
