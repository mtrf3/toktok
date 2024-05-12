package X;

import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;

/* renamed from: X.GMv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41405GMv implements InterfaceC42275GiV {
    public final /* synthetic */ IPageToFinish LIZ;

    public C41405GMv(IPageToFinish iPageToFinish) {
        this.LIZ = iPageToFinish;
    }

    @Override // X.InterfaceC42275GiV
    public final void onFinish(boolean z) {
        this.LIZ.onFinish(z);
    }
}
