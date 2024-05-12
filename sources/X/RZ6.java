package X;

import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RZ6 extends RZ7 {
    @Override // X.RZ7, X.InterfaceC69824Ram
    public final boolean Mv() {
        if (C52311Kfz.LIZ()) {
            return true;
        }
        return super.Mv();
    }

    @Override // X.RZ7, X.InterfaceC69824Ram
    public final int Rf() {
        if (C52311Kfz.LIZ()) {
            return R.layout.a2i;
        }
        return super.Rf();
    }

    @Override // X.RZ7, X.InterfaceC69824Ram
    public final void yk0(List<Object> contentList) {
        o.LJIIIZ(contentList, "contentList");
        if (C52311Kfz.LIZ()) {
            contentList.add(new RYW());
        } else {
            super.yk0(contentList);
        }
    }
}
