package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLinkInjectorOptSetting;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TkO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75516TkO extends AbstractC76172Tuy {
    public static final C75516TkO LIZ = new C75516TkO();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(UCP.LJLIL);

    @Override // X.AbstractC76172Tuy
    public final int LIZJ() {
        return 0;
    }

    @Override // X.AbstractC76172Tuy
    public final int LIZLLL() {
        return 1000000;
    }

    @Override // X.AbstractC76172Tuy
    public final void LJI(int i, String msg, Throwable th, java.util.Map map) {
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.AbstractC76172Tuy, X.InterfaceC64412ft
    public final void LIZ(int i, String msg, java.util.Map<String, String> map) {
        Object obj;
        o.LJIIIZ(msg, "msg");
        Iterator it = ((List) LIZIZ.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((AbstractC76172Tuy) obj).LJFF(i)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC76172Tuy abstractC76172Tuy = (AbstractC76172Tuy) obj;
        if (abstractC76172Tuy != null) {
            abstractC76172Tuy.LIZ(i, msg, map);
        } else {
            if (!LinkMicLinkInjectorOptSetting.INSTANCE.isOptLinkInjector()) {
                return;
            }
            C76174Tv0.LIZ.LIZ(i, msg, map);
        }
    }

    @Override // X.AbstractC76172Tuy, X.InterfaceC64412ft
    public final void LIZIZ(int i, String msg, Throwable t, java.util.Map<String, String> map) {
        Object obj;
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(t, "t");
        Iterator it = ((List) LIZIZ.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((AbstractC76172Tuy) obj).LJFF(i)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC76172Tuy abstractC76172Tuy = (AbstractC76172Tuy) obj;
        if (abstractC76172Tuy != null) {
            abstractC76172Tuy.LIZIZ(i, msg, t, map);
        } else {
            if (!LinkMicLinkInjectorOptSetting.INSTANCE.isOptLinkInjector()) {
                return;
            }
            C76174Tv0.LIZ.LIZIZ(i, msg, t, map);
        }
    }
}
