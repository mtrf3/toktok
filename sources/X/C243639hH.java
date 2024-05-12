package X;

import Y.IDxS305S0100000_4;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.bytedance.touchpoint.core.model.TouchPointsResponse;
import com.bytedance.touchpoint.data.request.INetworkApi;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.9hH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243639hH {
    public static final C5H3 LJFF = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C243689hM.LJLIL);
    public List<TouchPoint> LIZ;
    public InterfaceC92693kP LIZIZ;
    public int LIZJ;
    public Integer LIZLLL = 1;
    public AYT LJ = new AYT(2, 5000);

    public static void LIZ(final String touchPointId, final String str, final String str2, InterfaceC243629hG interfaceC243629hG) {
        o.LJIIIZ(touchPointId, "touchPointId");
        AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.9OX
            public final /* synthetic */ String LJLILLLLZI = "";

            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<List<TouchPoint>> interfaceC73573Su9) {
                INetworkApi LJFF2;
                C76L<TouchPointsResponse> touchPointById;
                try {
                    InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                    if (interfaceC247459nR != null && (LJFF2 = interfaceC247459nR.LJFF()) != null && (touchPointById = LJFF2.getTouchPointById(CastIntegerProtector.parseInt(touchPointId), this.LJLILLLLZI, str, str2)) != null) {
                        TouchPointsResponse touchPointsResponse = touchPointById.get();
                        if (touchPointsResponse != null && touchPointsResponse.statusCode == 0) {
                            List<TouchPoint> list = touchPointsResponse.touchPoints;
                            if (list != null) {
                                interfaceC73573Su9.onNext(list);
                                return;
                            } else {
                                interfaceC73573Su9.onNext(C61878OQg.INSTANCE);
                                return;
                            }
                        }
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
                interfaceC73573Su9.tryOnError(new Throwable("refresh touch points failed"));
            }
        }).LJJJJL(new AYT(2, 3000L)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS305S0100000_4(interfaceC243629hG, 24));
    }
}
