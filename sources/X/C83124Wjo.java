package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wjo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83124Wjo implements InterfaceC83127Wjr {
    public final /* synthetic */ C83113Wjd LIZ;

    public C83124Wjo(C83113Wjd c83113Wjd) {
        this.LIZ = c83113Wjd;
    }

    @Override // X.InterfaceC83127Wjr
    public final void LIZ(Exception exc) {
        this.LIZ.HE(false);
        this.LIZ.LLIFFJFJJ.LIZJ();
    }

    @Override // X.InterfaceC83127Wjr
    public final void onSuccess(List<BeautyCategory> response) {
        o.LJIIIZ(response, "response");
        this.LIZ.HE(false);
        this.LIZ.LLIFFJFJJ.LIZJ();
    }
}
