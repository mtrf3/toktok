package X;

import android.content.Context;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerComponentTemp;

/* renamed from: X.2Kp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56752Kp implements InterfaceC59191NKx {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ ViewPagerComponentTemp LIZJ;
    public final /* synthetic */ BaseListFragmentPanel LIZLLL;

    public final WeakHandler LIZIZ() {
        return this.LIZLLL.mHandler;
    }

    @Override // X.InterfaceC44391HbX
    public final Context getContext() {
        return this.LIZ;
    }

    public C56752Kp(BaseListFragmentPanel baseListFragmentPanel, Context context, int i, ViewPagerComponentTemp viewPagerComponentTemp) {
        this.LIZLLL = baseListFragmentPanel;
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = viewPagerComponentTemp;
    }
}
