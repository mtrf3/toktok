package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0T extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, C43I<? extends C2301491m>, C76800UCe> {
    public static final Y0T LJLIL = new Y0T();

    public Y0T() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, C43I<? extends C2301491m> c43i) {
        C86675Xzz c86675Xzz;
        View view;
        ViewGroup viewGroup;
        boolean z;
        C2301491m c2301491m;
        C2301491m c2301491m2;
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        C43I<? extends C2301491m> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (selectSubscribe.LLIIIJ && selectSubscribe.r4().wv0() && (c86675Xzz = selectSubscribe.LLIIIILZ) != null) {
            View view2 = null;
            if (c43i2 != null && (c2301491m2 = (C2301491m) c43i2.LIZ) != null) {
                view = c2301491m2.LIZ;
            } else {
                view = null;
            }
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            if (c43i2 != null && (c2301491m = (C2301491m) c43i2.LIZ) != null) {
                view2 = c2301491m.LIZIZ;
            }
            if (viewGroup != null && view2 != null) {
                Y0S LIZIZ = c86675Xzz.LIZIZ();
                boolean z2 = true;
                if (LIZIZ.LJI == null) {
                    z = true;
                } else {
                    z = false;
                }
                LIZIZ.LJI = view2;
                if (z) {
                    LIZIZ.LIZ();
                }
                Y0S LIZIZ2 = c86675Xzz.LIZIZ();
                if (LIZIZ2.LJII != null) {
                    z2 = false;
                }
                LIZIZ2.LJII = viewGroup;
                if (z2) {
                    LIZIZ2.LIZ();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
