package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

/* renamed from: X.91p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2301791p implements C92D {
    public final /* synthetic */ BaseFeedPageParams LIZ;
    public final /* synthetic */ Context LIZIZ;

    public C2301791p(Context context, BaseFeedPageParams baseFeedPageParams) {
        this.LIZ = baseFeedPageParams;
        this.LIZIZ = context;
    }

    @Override // X.C92D
    public final void LIZ(float f, float f2) {
        int i;
        if (this.LIZ.isPlayListCleanMode()) {
            return;
        }
        String str = this.LIZ.eventType;
        if (str == null) {
            str = "";
        }
        if (C2Q9.LIZ(str)) {
            int i2 = this.LIZ.awemeFromPage;
            Context context = this.LIZIZ;
            if (context != null) {
                i = context.hashCode();
            } else {
                i = 0;
            }
            C2U8.LIZ(new C55274Lmg(f, i2, f2, i));
        }
    }
}
