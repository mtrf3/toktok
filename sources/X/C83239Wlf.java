package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.o;

/* renamed from: X.Wlf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C83239Wlf extends TAZ implements InterfaceC88472Yns<ComposerBeauty, Boolean> {
    public C83239Wlf(C83186Wko c83186Wko) {
        super(1, c83186Wko, C83186Wko.class, "isBeautyAvailable", "isBeautyAvailable(Lcom/ss/android/ugc/aweme/beauty/ComposerBeauty;Z)Z", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(ComposerBeauty composerBeauty) {
        ComposerBeauty p1 = composerBeauty;
        o.LJIIIZ(p1, "p1");
        return Boolean.valueOf(((C83186Wko) this.receiver).LIZLLL(p1, false));
    }
}
