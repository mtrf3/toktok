package X;

import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.C6v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30797C6v implements InterfaceC17150lr {
    @Override // X.InterfaceC17150lr
    public final LiveWidget LIZIZ() {
        return ((IStarCommentService) CN1.LIZ(IStarCommentService.class)).Dg0();
    }

    @Override // X.InterfaceC17150lr
    public final CharSequence LIZ() {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.o4k);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_starcmt_cmtList_tab_str)");
        return LJIILJJIL;
    }
}
