package X;

import android.database.ContentObserver;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes12.dex */
public class QQW extends ContentObserver {
    public final /* synthetic */ QQP LIZ;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        QQP qqp = this.LIZ;
        qqp.LIZLLL(qqp.LJLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QQW(QQP qqp, WeakHandler weakHandler) {
        super(weakHandler);
        this.LIZ = qqp;
    }
}
