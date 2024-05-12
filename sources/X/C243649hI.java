package X;

import Y.ACallableS1S0002000_4;
import Y.IDuS75S0200000_4;
import Y.IDxS128S0200000_4;
import android.os.Handler;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9hI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243649hI {
    public static final C5H3 LIZLLL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C243679hL.LJLIL);
    public final Keva LIZ = Keva.getRepo("touch_point_request_repo");
    public final String LIZIZ = "request_time";
    public boolean LIZJ = true;

    public final void LIZIZ(Integer num) {
        try {
            LIZJ(num);
        } catch (Exception e) {
            String error = e.toString();
            o.LJIIIZ(error, "error");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error", error);
            } catch (JSONException unused) {
            }
            C09900aA.LJI("touch_point_exception", jSONObject, null, null);
        }
    }

    public final void LIZJ(Integer num) {
        this.LIZ.storeLong(this.LIZIZ, C245559kN.LIZ());
        final long currentTimeMillis = System.currentTimeMillis();
        C243639hH LIZ = C243669hK.LIZ();
        InterfaceC243629hG interfaceC243629hG = new InterfaceC243629hG() { // from class: X.9hJ
            @Override // X.InterfaceC243629hG
            public final void onFail() {
                int i;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                Integer num2 = C243669hK.LIZ().LIZLLL;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 1;
                }
                C10K.LIZJ(new CallableC243729hQ(0, i, C243669hK.LIZ().LIZJ, C243669hK.LIZ().LJ.LJLIL, currentTimeMillis2, ""));
                C243649hI.this.LIZJ = false;
            }

            @Override // X.InterfaceC243629hG
            public final void LIZ() {
                new Handler(C16880lQ.LLJJJJ()).post(new RunnableC243699hN(false));
            }

            @Override // X.InterfaceC243629hG
            public final void LIZIZ() {
                new Handler(C16880lQ.LLJJJJ()).post(new RunnableC243699hN(true));
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
            @Override // X.InterfaceC243629hG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(java.util.List<com.bytedance.touchpoint.core.model.TouchPoint> r13) {
                /*
                    r12 = this;
                    X.9hI r0 = X.C243649hI.this
                    r0.getClass()
                    r4 = 0
                    r5 = 1
                    if (r13 == 0) goto Lf
                    boolean r0 = r13.isEmpty()
                    if (r0 == 0) goto L42
                Lf:
                    java.lang.String r11 = ""
                L11:
                    long r9 = java.lang.System.currentTimeMillis()
                    long r0 = r2
                    long r9 = r9 - r0
                    X.9hH r0 = X.C243669hK.LIZ()
                    java.lang.Integer r0 = r0.LIZLLL
                    if (r0 == 0) goto L40
                    int r6 = r0.intValue()
                L25:
                    X.9hH r0 = X.C243669hK.LIZ()
                    int r7 = r0.LIZJ
                    X.9hH r0 = X.C243669hK.LIZ()
                    X.AYT r0 = r0.LJ
                    int r8 = r0.LJLIL
                    X.9hQ r4 = new X.9hQ
                    r4.<init>(r5, r6, r7, r8, r9, r11)
                    X.C10K.LIZJ(r4)
                    X.9hI r0 = X.C243649hI.this
                    r0.LIZJ = r5
                    return
                L40:
                    r6 = 1
                    goto L25
                L42:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    if (r13 == 0) goto Lf
                    boolean r0 = r13.isEmpty()
                    r0 = r0 ^ 1
                    if (r0 == 0) goto Lf
                    int r2 = r13.size()
                L55:
                    if (r4 >= r2) goto L75
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r13, r4)
                    com.bytedance.touchpoint.core.model.TouchPoint r0 = (com.bytedance.touchpoint.core.model.TouchPoint) r0
                    int r1 = r0.touchPointId
                    int r0 = r13.size()
                    int r0 = r0 - r5
                    if (r4 >= r0) goto L71
                    r3.append(r1)
                    java.lang.String r0 = ","
                    r3.append(r0)
                L6e:
                    int r4 = r4 + 1
                    goto L55
                L71:
                    r3.append(r1)
                    goto L6e
                L75:
                    java.lang.String r11 = r3.toString()
                    java.lang.String r0 = "ids.toString()"
                    kotlin.jvm.internal.o.LJIIIIZZ(r11, r0)
                    goto L11
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C243659hJ.onSuccess(java.util.List):void");
            }
        };
        LIZ.getClass();
        int i = 1;
        LIZ.LIZJ++;
        LIZ.LIZLLL = num;
        if (num != null) {
            i = num.intValue();
        }
        C10K.LIZJ(new ACallableS1S0002000_4(i, LIZ.LIZJ, 0));
        InterfaceC92693kP interfaceC92693kP = LIZ.LIZIZ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        LIZ.LJ = new AYT(9, 5000L);
        AbstractC73672Svk.LJIIJ(new IDuS75S0200000_4(LIZ, num, 1)).LJJJJL(LIZ.LJ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS128S0200000_4(LIZ, interfaceC243629hG, 5));
    }

    public static void LIZ(String touchPointId, String str, String str2, InterfaceC243629hG interfaceC243629hG) {
        o.LJIIIZ(touchPointId, "touchPointId");
        try {
            C243669hK.LIZ().getClass();
            C243639hH.LIZ(touchPointId, str, str2, interfaceC243629hG);
        } catch (Exception unused) {
            interfaceC243629hG.onFail();
        }
    }
}
