package X;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.videoshop.controller.RefactorVideoController;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.IvB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48157IvB {
    public YSJ LIZ = new YSJ(this);
    public C48158IvC LIZIZ = new C48158IvC(this);
    public C48156IvA LIZJ = new C48156IvA(this);
    public C48159IvD LIZLLL = new C48159IvD(this);
    public C48154Iv8 LJ = new C48154Iv8(this);
    public TTVideoEngine LJFF;
    public RefactorVideoController LJI;
    public WeakHandler LJII;

    public final void LIZIZ() {
        TTVideoEngine tTVideoEngine = this.LJFF;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJJIII(null);
            this.LJFF.LLJJIJI(null);
            this.LJFF.LLJJI(null);
            this.LJFF.LLFZ(null);
            this.LJFF.LLILLL(null);
            this.LJFF.LJJLIIIJLLLLLLLZ();
        }
        this.LJFF = null;
    }

    public final void LIZ(TTVideoEngine tTVideoEngine) {
        this.LJFF = tTVideoEngine;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJJIII(this.LIZ);
            this.LJFF.LLJJIJI(this.LIZLLL);
            this.LJFF.LLJJI(this.LJ);
            this.LJFF.LLFZ(this.LIZIZ);
            this.LJFF.LLILLL(this.LIZJ);
        }
    }

    public final void LIZJ(int i, int i2, Object obj, Bundle bundle) {
        WeakHandler weakHandler = this.LJII;
        if (weakHandler != null) {
            Message obtainMessage = weakHandler.obtainMessage(i);
            obtainMessage.arg1 = i2;
            obtainMessage.obj = obj;
            obtainMessage.setData(bundle);
            this.LJII.sendMessage(obtainMessage);
        }
    }
}
