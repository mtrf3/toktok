package X;

import android.view.LayoutInflater;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85931Xnz {
    public static final /* synthetic */ int LIZ = 0;

    public static AG6 LIZ(PushItem item, InterfaceC85953XoL interfaceC85953XoL, LayoutInflater layoutInflater) {
        o.LJIIIZ(item, "item");
        switch (item.actionType) {
            case 1:
                return new C85918Xnm(item, interfaceC85953XoL);
            case 2:
                return new C85930Xny(item);
            case 3:
                return new C85923Xnr(item, layoutInflater);
            case 4:
                return new C85932Xo0(item);
            case 5:
                return new C85924Xns(item);
            case 6:
                return new C85928Xnw(item);
            case 7:
                return new C85927Xnv(item);
            default:
                return new C85918Xnm(item, interfaceC85953XoL);
        }
    }
}
