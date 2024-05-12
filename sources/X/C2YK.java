package X;

import Y.AfS53S0100000_1;
import Y.IDaS212S0100000_1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2YK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2YK {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C2YL.LJLIL);

    public final void LIZ(InterfaceC65784Pro<C76800UCe> finishCallback) {
        o.LJIIIZ(finishCallback, "finishCallback");
        new AbstractC73672Svk<List<? extends String>>() { // from class: X.4iQ
            public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C2YM.LJLIL);

            @Override // X.AbstractC73672Svk
            public final void LJJJZ(InterfaceC116954iR<? super List<? extends String>> observer) {
                o.LJIIIZ(observer, "observer");
                try {
                    List<String> LIZ = AQY.LIZ();
                    List<String> LJJZ = LJJZ(LIZ);
                    ArrayList arrayList = new ArrayList(LIZ);
                    arrayList.removeAll(LJJZ);
                    if (!arrayList.isEmpty()) {
                        AQV.LJLIL.getClass();
                        AQV.LJJJIL(arrayList);
                    }
                    observer.onNext(LJJZ);
                    observer.onComplete();
                } catch (Exception e) {
                    observer.onError(e);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00a3 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<java.lang.String> LJJZ(java.util.List<java.lang.String> r13) {
                /*
                    r12 = this;
                    java.util.ArrayList r7 = new java.util.ArrayList
                    r7.<init>()
                    int r0 = r13.size()
                    double r2 = (double) r0
                    r8 = 20
                    double r0 = (double) r8
                    double r2 = r2 / r0
                    double r0 = java.lang.Math.ceil(r2)
                    int r6 = (int) r0
                    int r5 = r13.size()
                    r4 = 0
                L18:
                    if (r4 >= r6) goto Lc6
                    int r1 = r4 * 20
                    int r4 = r4 + 1
                    int r0 = r4 * 20
                    if (r0 <= r5) goto L23
                    r0 = r5
                L23:
                    java.util.List r3 = r13.subList(r1, r0)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.util.Iterator r1 = r3.iterator()
                L30:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L45
                    java.lang.Object r0 = r1.next()
                    java.lang.String r0 = (java.lang.String) r0
                    r2.append(r0)
                    java.lang.String r0 = ","
                    r2.append(r0)
                    goto L30
                L45:
                    int r1 = r2.length()
                    r0 = 1
                    int r1 = r1 - r0
                    r2.deleteCharAt(r1)
                    java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Exception -> La9
                    r10.<init>(r8)     // Catch: java.lang.Exception -> La9
                    java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> La9
                    java.lang.String r0 = "sb.toString()"
                    kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> La9
                    X.Ol8 r0 = com.ss.android.ugc.aweme.offlinemode.api.OfflineModeApi.LIZ     // Catch: java.lang.Exception -> La9
                    java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> La9
                    com.ss.android.ugc.aweme.offlinemode.api.OfflineModeApi$OfflineModeApiDefinition r0 = (com.ss.android.ugc.aweme.offlinemode.api.OfflineModeApi.OfflineModeApiDefinition) r0     // Catch: java.lang.Exception -> La9
                    X.Ek4 r0 = r0.verifyAids(r1)     // Catch: java.lang.Exception -> La9
                    X.Pbt r0 = r0.execute()     // Catch: java.lang.Exception -> La9
                    T r0 = r0.LIZIZ     // Catch: java.lang.Exception -> La9
                    com.ss.android.ugc.aweme.offlinemode.api.InspectItemResponse r0 = (com.ss.android.ugc.aweme.offlinemode.api.InspectItemResponse) r0     // Catch: java.lang.Exception -> La9
                    org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> La9
                    java.lang.String r0 = r0.itemStatus     // Catch: java.lang.Exception -> La9
                    r9.<init>(r0)     // Catch: java.lang.Exception -> La9
                    java.util.Iterator r11 = r3.iterator()     // Catch: java.lang.Exception -> La9
                L7c:
                    boolean r0 = r11.hasNext()     // Catch: java.lang.Exception -> La9
                    if (r0 == 0) goto La7
                    java.lang.Object r8 = r11.next()     // Catch: java.lang.Exception -> La9
                    r0 = r8
                    java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> La9
                    int r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getInt(r9, r0)     // Catch: java.lang.Exception -> L90
                    if (r0 != 0) goto L9e
                    goto La0
                L90:
                    r2 = move-exception
                    X.Ol8 r0 = r12.LJLIL     // Catch: java.lang.Exception -> La9
                    java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> La9
                    X.JEa r1 = (X.AbstractC48820JEa) r1     // Catch: java.lang.Exception -> La9
                    java.lang.String r0 = "filter error"
                    r1.LJFF(r0, r2)     // Catch: java.lang.Exception -> La9
                L9e:
                    r0 = 0
                    goto La1
                La0:
                    r0 = 1
                La1:
                    if (r0 == 0) goto L7c
                    r10.add(r8)     // Catch: java.lang.Exception -> La9
                    goto L7c
                La7:
                    r3 = r10
                    goto Lb7
                La9:
                    r2 = move-exception
                    X.Ol8 r0 = r12.LJLIL
                    java.lang.Object r1 = r0.getValue()
                    X.JEa r1 = (X.AbstractC48820JEa) r1
                    java.lang.String r0 = "verify by page error"
                    r1.LJFF(r0, r2)
                Lb7:
                    boolean r0 = r3.isEmpty()
                    r0 = r0 ^ 1
                    if (r0 == 0) goto Lc2
                    r7.addAll(r3)
                Lc2:
                    r8 = 20
                    goto L18
                Lc6:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C116944iQ.LJJZ(java.util.List):java.util.List");
            }
        }.LJJL(T16.LIZ()).LJIILLIIL(new IDaS212S0100000_1(finishCallback, 0)).LJJJLIIL(new AfS53S0100000_1(this, 41), new AfS53S0100000_1(this, 42));
    }
}
