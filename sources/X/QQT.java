package X;

import android.database.ContentObserver;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes12.dex */
public class QQT extends ContentObserver {
    public final /* synthetic */ QQQ LIZ;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        QQQ qqq = this.LIZ;
        qqq.LJLJI = C66875QMl.LIZ(qqq.LJLIL).LIZ.LIZJ("is_desktop_red_badge_show", false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QQT(QQQ qqq, WeakHandler weakHandler) {
        super(weakHandler);
        this.LIZ = qqq;
    }
}
