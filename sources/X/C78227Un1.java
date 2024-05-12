package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.gift.render.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Un1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78227Un1 implements InterfaceC78235Un9 {
    public final List<InterfaceC78233Un7> LIZ;
    public final C32449CoP LIZIZ;

    @Override // X.InterfaceC78235Un9
    public final InterfaceC78233Un7 LIZ() {
        Integer num;
        Effect effect = this.LIZIZ.LIZ;
        InterfaceC78233Un7 interfaceC78233Un7 = null;
        if (effect != null) {
            num = Integer.valueOf(effect.LIZ().resourceType);
        } else {
            num = null;
        }
        int i = AssetsModel.RESOURCE_TYPE_MP4;
        if (num == null || num.intValue() != i) {
            int i2 = AssetsModel.RESOURCE_TYPE_LYNX;
            if (num == null || num.intValue() != i2) {
                return null;
            }
            Iterator<InterfaceC78233Un7> it = this.LIZ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC78233Un7 next = it.next();
                if (next.getType() == EnumC78220Umu.LYNX) {
                    interfaceC78233Un7 = next;
                    break;
                }
            }
            return interfaceC78233Un7;
        }
        Iterator<InterfaceC78233Un7> it2 = this.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC78233Un7 next2 = it2.next();
            if (next2.getType() == EnumC78220Umu.ALPHA_PLAYER) {
                interfaceC78233Un7 = next2;
                break;
            }
        }
        return interfaceC78233Un7;
    }

    @Override // X.InterfaceC78235Un9
    public final InterfaceC78234Un8 LIZIZ() {
        Integer num;
        Effect effect = this.LIZIZ.LIZ;
        InterfaceC78233Un7 interfaceC78233Un7 = null;
        if (effect != null) {
            num = Integer.valueOf(effect.LIZ().downgradeResourceType);
        } else {
            num = null;
        }
        int i = AssetsModel.RESOURCE_TYPE_MP4;
        if (num == null || num.intValue() != i) {
            int i2 = AssetsModel.RESOURCE_TYPE_LYNX;
            if (num == null || num.intValue() != i2) {
                return null;
            }
            Iterator<InterfaceC78233Un7> it = this.LIZ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC78233Un7 next = it.next();
                if (next.getType() == EnumC78220Umu.LYNX) {
                    interfaceC78233Un7 = next;
                    break;
                }
            }
            return new C78232Un6(interfaceC78233Un7);
        }
        Iterator<InterfaceC78233Un7> it2 = this.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC78233Un7 next2 = it2.next();
            if (next2.getType() == EnumC78220Umu.ALPHA_PLAYER) {
                interfaceC78233Un7 = next2;
                break;
            }
        }
        return new C78231Un5(interfaceC78233Un7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C78227Un1(List<? extends InterfaceC78233Un7> list, C32449CoP request) {
        o.LJIIIZ(request, "request");
        this.LIZ = list;
        this.LIZIZ = request;
    }
}
