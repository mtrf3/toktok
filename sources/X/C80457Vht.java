package X;

import android.view.View;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Vht, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80457Vht extends C16120kC {
    public final /* synthetic */ CreatorCaptionEditActivity LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        String str;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (this.LIZ.LJLLL) {
            str = this.LIZIZ;
        } else {
            str = this.LIZJ;
        }
        info.LIZIZ(new C17720mm(16, str));
    }

    public C80457Vht(CreatorCaptionEditActivity creatorCaptionEditActivity, String str, String str2) {
        this.LIZ = creatorCaptionEditActivity;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
