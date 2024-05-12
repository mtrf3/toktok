package X;

import android.content.Context;
import com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl;

/* loaded from: classes12.dex */
public final class QE5 extends QEL {
    public QE4 LJJIIZ;

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
    public final QE4 LJJIIJZLJL() {
        return this.LJJIIZ;
    }

    public QE5(Context context) {
        super(context);
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final /* bridge */ /* synthetic */ AbstractC66651QDv LJIJJ(QE3 qe3) {
        LJJIIZ(qe3);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
    public final CronetEngineBuilderImpl LJJIIZ(QE3 qe3) {
        this.LJJIIZ = new QE4(qe3);
        return this;
    }
}
