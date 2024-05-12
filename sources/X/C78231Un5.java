package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.gift.render.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Un5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78231Un5 implements InterfaceC78234Un8 {
    public final InterfaceC78233Un7 LIZ;

    public C78231Un5(InterfaceC78233Un7 interfaceC78233Un7) {
        this.LIZ = interfaceC78233Un7;
    }

    @Override // X.InterfaceC78234Un8
    public final EnumC78220Umu LIZ(C32449CoP request) {
        EnumC78220Umu type;
        o.LJIIIZ(request, "request");
        InterfaceC78233Un7 interfaceC78233Un7 = this.LIZ;
        if (interfaceC78233Un7 == null || (type = interfaceC78233Un7.getType()) == null) {
            return EnumC78220Umu.NONE;
        }
        return type;
    }

    @Override // X.InterfaceC78234Un8
    public final boolean LIZIZ(C32449CoP request) {
        Effect effect;
        o.LJIIIZ(request, "request");
        if (this.LIZ == null || (effect = request.LIZ) == null || effect.LIZ().downgradeResourceType != AssetsModel.RESOURCE_TYPE_MP4) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC78234Un8
    public final InterfaceC32440CoG LIZJ(C32449CoP request) {
        o.LJIIIZ(request, "request");
        InterfaceC78233Un7 interfaceC78233Un7 = this.LIZ;
        if (interfaceC78233Un7 != null) {
            return interfaceC78233Un7.create(request);
        }
        return null;
    }
}
