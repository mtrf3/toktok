package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HRP implements InterfaceC80245VeT {
    public final /* synthetic */ HRO LIZ;

    public HRP(HRO hro) {
        this.LIZ = hro;
    }

    @Override // X.InterfaceC80245VeT
    public final WM7 LIZ(ClassLoader classLoader, String className) {
        o.LJIIIZ(classLoader, "<anonymous parameter 0>");
        o.LJIIIZ(className, "className");
        if (TextUtils.equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene", className)) {
            return this.LIZ.LJLILLLLZI;
        }
        return null;
    }
}
