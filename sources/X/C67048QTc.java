package X;

import com.bytedance.common.utility.collection.WeakHandler;

/* renamed from: X.QTc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67048QTc extends AbstractC68941R3x {
    public final /* synthetic */ AbstractC68941R3x LIZ;
    public final /* synthetic */ QTW LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(R4V r4v) {
        AbstractC68941R3x abstractC68941R3x = this.LIZ;
        if (abstractC68941R3x != null) {
            abstractC68941R3x.onSuccess(r4v);
        }
        WeakHandler weakHandler = this.LIZIZ.LLILZ;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessageDelayed(1000, 600000L);
        }
    }

    public C67048QTc(QTW qtw, QXG qxg) {
        this.LIZIZ = qtw;
        this.LIZ = qxg;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(R4V r4v, int i) {
        AbstractC68941R3x abstractC68941R3x = this.LIZ;
        if (abstractC68941R3x != null) {
            abstractC68941R3x.onError(r4v, i);
        }
        WeakHandler weakHandler = this.LIZIZ.LLILZ;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessageDelayed(1000, 600000L);
        }
    }
}
