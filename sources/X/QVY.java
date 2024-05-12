package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QVY implements InterfaceC67096QUy {
    public final QW4 LJLIL;

    @Override // X.InterfaceC67096QUy
    public final boolean LIZIZ() {
        return this.LJLIL.LIZIZ();
    }

    @Override // X.InterfaceC67096QUy
    public final void LJJIIZ() {
        JSONObject jSONObject;
        InterfaceC67059QTn deviceInfoService = (InterfaceC67059QTn) QPG.LIZ(InterfaceC67059QTn.class);
        o.LJFF(deviceInfoService, "deviceInfoService");
        QUJ LIZJ = deviceInfoService.LIZJ();
        QPA LIZ = QPG.LIZ(InterfaceC67044QSy.class);
        o.LJFF(LIZ, "UgBusFramework.getServic…aramProvider::class.java)");
        java.util.Map<String, String> commonParams = ((InterfaceC67044QSy) LIZ).getCommonParams();
        HashMap hashMap = new HashMap();
        if (commonParams != null) {
            jSONObject = new JSONObject(commonParams);
        } else {
            jSONObject = new JSONObject();
        }
        Integer valueOf = Integer.valueOf(QWB.Params.getValue());
        C64537PUn encodeUtf8 = C64537PUn.encodeUtf8(jSONObject.toString());
        o.LJFF(encodeUtf8, "ByteString.encodeUtf8(params.toString())");
        hashMap.put(valueOf, encodeUtf8);
        C67110QVm c67110QVm = new C67110QVm();
        c67110QVm.LIZLLL = EnumC67117QVt.V2;
        c67110QVm.LJFF = LIZJ.LIZ;
        c67110QVm.LJ = LIZJ.LIZIZ;
        c67110QVm.LJI = Long.valueOf(System.currentTimeMillis());
        C63685Oz3.LIZIZ(hashMap);
        c67110QVm.LJIIIIZZ = hashMap;
        C67098QVa build = c67110QVm.build();
        C67109QVl c67109QVl = new C67109QVl();
        QVX qvx = QVX.Sync;
        c67109QVl.LIZLLL = qvx;
        c67109QVl.LJFF = EnumC67115QVr.SpecTopic;
        QVZ build2 = c67109QVl.build();
        C67109QVl c67109QVl2 = new C67109QVl();
        c67109QVl2.LIZLLL = qvx;
        c67109QVl2.LJFF = EnumC67115QVr.GlobalTopic;
        QVZ build3 = c67109QVl2.build();
        C67111QVn c67111QVn = new C67111QVn();
        c67111QVn.LIZLLL = build;
        List<QVZ> LJJIJIIJI = C47261Igj.LJJIJIIJI(build2, build3);
        C63685Oz3.LIZ(LJJIJIIJI);
        c67111QVn.LJ = LJJIJIIJI;
        C67101QVd build4 = c67111QVn.build();
        QW3 qw3 = new QW3();
        qw3.LIZIZ = true;
        qw3.LIZ = build4;
        this.LJLIL.LJJL(qw3);
    }

    public QVY(QW4 qw4) {
        this.LJLIL = qw4;
    }

    @Override // X.InterfaceC67096QUy
    public final void LJIJI(List<? extends C67094QUw> list) {
        JSONObject jSONObject;
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC67090QUs interfaceC67090QUs = (InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class);
        InterfaceC67059QTn deviceInfoService = (InterfaceC67059QTn) QPG.LIZ(InterfaceC67059QTn.class);
        o.LJFF(deviceInfoService, "deviceInfoService");
        QUJ LIZJ = deviceInfoService.LIZJ();
        QPA LIZ = QPG.LIZ(InterfaceC67044QSy.class);
        o.LJFF(LIZ, "UgBusFramework.getServic…der::class.java\n        )");
        java.util.Map<String, String> commonParams = ((InterfaceC67044QSy) LIZ).getCommonParams();
        HashMap hashMap = new HashMap();
        if (commonParams != null) {
            jSONObject = new JSONObject(commonParams);
        } else {
            jSONObject = new JSONObject();
        }
        Integer valueOf = Integer.valueOf(QWB.Params.getValue());
        C64537PUn encodeUtf8 = C64537PUn.encodeUtf8(jSONObject.toString());
        o.LJFF(encodeUtf8, "ByteString.encodeUtf8(params.toString())");
        hashMap.put(valueOf, encodeUtf8);
        C67110QVm c67110QVm = new C67110QVm();
        c67110QVm.LIZLLL = EnumC67117QVt.V2;
        c67110QVm.LJFF = LIZJ.LIZ;
        c67110QVm.LJ = LIZJ.LIZIZ;
        c67110QVm.LJI = Long.valueOf(currentTimeMillis);
        C63685Oz3.LIZIZ(hashMap);
        c67110QVm.LJIIIIZZ = hashMap;
        C67098QVa build = c67110QVm.build();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = ((C67094QUw) next).LIZ;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(next);
        }
        try {
            List<QV9> LJI = interfaceC67090QUs.LJI(ORZ.LLJI(linkedHashMap.keySet()));
            ArrayList arrayList = new ArrayList();
            for (QV9 qv9 : LJI) {
                List<C67094QUw> list2 = (List) linkedHashMap.get(qv9.LIZ);
                if (list2 != null) {
                    C67109QVl c67109QVl = new C67109QVl();
                    c67109QVl.LIZLLL = QVX.FIN;
                    c67109QVl.LJFF = qv9.LIZLLL;
                    String str2 = qv9.LIZ;
                    o.LJFF(str2, "syncCursor.syncId");
                    c67109QVl.LJI = Long.valueOf(CastLongProtector.parseLong(str2));
                    c67109QVl.LJII = Long.valueOf(qv9.LJFF);
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
                    for (C67094QUw c67094QUw : list2) {
                        C67112QVo c67112QVo = new C67112QVo();
                        C67114QVq c67114QVq = new C67114QVq();
                        c67114QVq.LIZLLL = Long.valueOf(c67094QUw.LJ);
                        c67112QVo.LIZLLL = c67114QVq.build();
                        C67113QVp c67113QVp = new C67113QVp();
                        c67113QVp.LIZLLL = Integer.valueOf((int) c67094QUw.LIZIZ);
                        c67113QVp.LJ = c67094QUw.LJIIJJI;
                        c67113QVp.LJI = C64537PUn.EMPTY;
                        c67112QVo.LJ = c67113QVp.build();
                        c67112QVo.LJFF = Long.valueOf(currentTimeMillis);
                        arrayList2.add(c67112QVo.build());
                    }
                    List<C67102QVe> LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
                    C63685Oz3.LIZ(LLJILJILJ);
                    c67109QVl.LJIIIZ = LLJILJILJ;
                    arrayList.add(c67109QVl.build());
                }
            }
            C67111QVn c67111QVn = new C67111QVn();
            c67111QVn.LIZLLL = build;
            C63685Oz3.LIZ(arrayList);
            c67111QVn.LJ = arrayList;
            C67101QVd build2 = c67111QVn.build();
            QW3 qw3 = new QW3();
            qw3.LIZIZ = true;
            qw3.LIZ = build2;
            this.LJLIL.LJJL(qw3);
        } catch (Throwable th) {
            PV6.LIZJ(null, th);
        }
    }

    @Override // X.InterfaceC67096QUy
    public final void LJJJJI(boolean z) {
        JSONObject jSONObject;
        InterfaceC67090QUs interfaceC67090QUs = (InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class);
        InterfaceC67059QTn deviceInfoService = (InterfaceC67059QTn) QPG.LIZ(InterfaceC67059QTn.class);
        o.LJFF(deviceInfoService, "deviceInfoService");
        QUJ deviceInfo = deviceInfoService.LIZJ();
        try {
            o.LJFF(deviceInfo, "deviceInfo");
            List<QV9> LJJII = interfaceC67090QUs.LJJII(deviceInfo);
            QPA LIZ = QPG.LIZ(InterfaceC67044QSy.class);
            o.LJFF(LIZ, "UgBusFramework.getServic…der::class.java\n        )");
            java.util.Map<String, String> commonParams = ((InterfaceC67044QSy) LIZ).getCommonParams();
            HashMap hashMap = new HashMap();
            if (commonParams != null) {
                jSONObject = new JSONObject(commonParams);
            } else {
                jSONObject = new JSONObject();
            }
            Integer valueOf = Integer.valueOf(QWB.Params.getValue());
            C64537PUn encodeUtf8 = C64537PUn.encodeUtf8(jSONObject.toString());
            o.LJFF(encodeUtf8, "ByteString.encodeUtf8(params.toString())");
            hashMap.put(valueOf, encodeUtf8);
            C67110QVm c67110QVm = new C67110QVm();
            c67110QVm.LIZLLL = EnumC67117QVt.V2;
            c67110QVm.LJFF = deviceInfo.LIZ;
            c67110QVm.LJ = deviceInfo.LIZIZ;
            c67110QVm.LJI = Long.valueOf(System.currentTimeMillis());
            C63685Oz3.LIZIZ(hashMap);
            c67110QVm.LJIIIIZZ = hashMap;
            C67098QVa build = c67110QVm.build();
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJJII, 10));
            for (QV9 qv9 : LJJII) {
                C67109QVl c67109QVl = new C67109QVl();
                c67109QVl.LIZLLL = QVX.Poll;
                c67109QVl.LJFF = qv9.LIZLLL;
                c67109QVl.LJ = qv9.LJ;
                String str = qv9.LIZ;
                o.LJFF(str, "it.syncId");
                c67109QVl.LJI = Long.valueOf(CastLongProtector.parseLong(str));
                c67109QVl.LJII = Long.valueOf(qv9.LJFF);
                arrayList.add(c67109QVl.build());
            }
            C67111QVn c67111QVn = new C67111QVn();
            c67111QVn.LIZLLL = build;
            C63685Oz3.LIZ(arrayList);
            c67111QVn.LJ = arrayList;
            C67101QVd build2 = c67111QVn.build();
            if (z) {
                QW3 qw3 = new QW3();
                qw3.LIZIZ = false;
                qw3.LIZJ = true;
                qw3.LIZ = build2;
                this.LJLIL.LJJL(qw3);
                return;
            }
            QW3 qw32 = new QW3();
            qw32.LIZIZ = true;
            qw32.LIZ = build2;
            this.LJLIL.LJJL(qw32);
        } catch (Throwable th) {
            PV6.LIZJ(null, th);
        }
    }

    @Override // X.InterfaceC67096QUy
    public final void LJJJJIZL(List<? extends QV2> list) {
        JSONObject jSONObject;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC67090QUs interfaceC67090QUs = (InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class);
        InterfaceC67059QTn deviceInfoService = (InterfaceC67059QTn) QPG.LIZ(InterfaceC67059QTn.class);
        o.LJFF(deviceInfoService, "deviceInfoService");
        QUJ LIZJ = deviceInfoService.LIZJ();
        QPA LIZ = QPG.LIZ(InterfaceC67044QSy.class);
        o.LJFF(LIZ, "UgBusFramework.getServic…der::class.java\n        )");
        java.util.Map<String, String> commonParams = ((InterfaceC67044QSy) LIZ).getCommonParams();
        HashMap hashMap = new HashMap();
        if (commonParams != null) {
            jSONObject = new JSONObject(commonParams);
        } else {
            jSONObject = new JSONObject();
        }
        Integer valueOf = Integer.valueOf(QWB.Params.getValue());
        C64537PUn encodeUtf8 = C64537PUn.encodeUtf8(jSONObject.toString());
        o.LJFF(encodeUtf8, "ByteString.encodeUtf8(params.toString())");
        hashMap.put(valueOf, encodeUtf8);
        C67110QVm c67110QVm = new C67110QVm();
        c67110QVm.LIZLLL = EnumC67117QVt.V2;
        c67110QVm.LJFF = LIZJ.LIZ;
        c67110QVm.LJ = LIZJ.LIZIZ;
        c67110QVm.LJI = Long.valueOf(currentTimeMillis);
        C63685Oz3.LIZIZ(hashMap);
        c67110QVm.LJIIIIZZ = hashMap;
        C67098QVa build = c67110QVm.build();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = ((QV2) next).LIZ;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(next);
        }
        try {
            List<QV9> LJI = interfaceC67090QUs.LJI(ORZ.LLJI(linkedHashMap.keySet()));
            ArrayList arrayList2 = new ArrayList();
            for (QV9 qv9 : LJI) {
                List<QV2> list2 = (List) linkedHashMap.get(qv9.LIZ);
                if (list2 != null) {
                    C67109QVl c67109QVl = new C67109QVl();
                    c67109QVl.LIZLLL = QVX.FIN;
                    c67109QVl.LJFF = qv9.LIZLLL;
                    String str2 = qv9.LIZ;
                    o.LJFF(str2, "syncCursor.syncId");
                    c67109QVl.LJI = Long.valueOf(CastLongProtector.parseLong(str2));
                    c67109QVl.LJII = Long.valueOf(qv9.LJFF);
                    ArrayList arrayList3 = new ArrayList(C32I.LJJL(list2, 10));
                    for (QV2 qv2 : list2) {
                        C67112QVo c67112QVo = new C67112QVo();
                        C67114QVq c67114QVq = new C67114QVq();
                        c67114QVq.LIZLLL = Long.valueOf(qv2.LIZLLL);
                        c67112QVo.LIZLLL = c67114QVq.build();
                        C67113QVp c67113QVp = new C67113QVp();
                        c67113QVp.LIZLLL = Integer.valueOf((int) qv2.LJI);
                        c67113QVp.LJ = qv2.LJII;
                        c67113QVp.LJI = C64537PUn.EMPTY;
                        c67112QVo.LJ = c67113QVp.build();
                        c67112QVo.LJFF = Long.valueOf(currentTimeMillis);
                        arrayList3.add(c67112QVo.build());
                    }
                    List<C67102QVe> LLJILJILJ = ORZ.LLJILJILJ(arrayList3);
                    C63685Oz3.LIZ(LLJILJILJ);
                    c67109QVl.LJIIIZ = LLJILJILJ;
                    arrayList2.add(c67109QVl.build());
                }
            }
            C67111QVn c67111QVn = new C67111QVn();
            c67111QVn.LIZLLL = build;
            C63685Oz3.LIZ(arrayList2);
            c67111QVn.LJ = arrayList2;
            C67101QVd build2 = c67111QVn.build();
            QW3 qw3 = new QW3();
            qw3.LIZIZ = true;
            qw3.LIZ = build2;
            this.LJLIL.LJJL(qw3);
        } catch (Throwable th) {
            PV6.LIZJ(null, th);
        }
    }

    @Override // X.InterfaceC67096QUy
    public final void LJJIIJ(String str, List<QV5> list, boolean z) {
        JSONObject jSONObject;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("payload is null or empty when send to server,syncId = ");
            LIZ.append(str);
            C66629QCz.LIZIZ(X1D.LIZIZ(LIZ));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC67059QTn deviceInfoService = (InterfaceC67059QTn) QPG.LIZ(InterfaceC67059QTn.class);
        o.LJFF(deviceInfoService, "deviceInfoService");
        QUJ LIZJ = deviceInfoService.LIZJ();
        QPA LIZ2 = QPG.LIZ(InterfaceC67044QSy.class);
        o.LJFF(LIZ2, "UgBusFramework.getServic…der::class.java\n        )");
        java.util.Map<String, String> commonParams = ((InterfaceC67044QSy) LIZ2).getCommonParams();
        HashMap hashMap = new HashMap();
        if (commonParams != null) {
            jSONObject = new JSONObject(commonParams);
        } else {
            jSONObject = new JSONObject();
        }
        Integer valueOf = Integer.valueOf(QWB.Params.getValue());
        C64537PUn encodeUtf8 = C64537PUn.encodeUtf8(jSONObject.toString());
        o.LJFF(encodeUtf8, "ByteString.encodeUtf8(params.toString())");
        hashMap.put(valueOf, encodeUtf8);
        C67110QVm c67110QVm = new C67110QVm();
        c67110QVm.LIZLLL = EnumC67117QVt.V2;
        c67110QVm.LJFF = LIZJ.LIZ;
        c67110QVm.LJ = LIZJ.LIZIZ;
        c67110QVm.LJI = Long.valueOf(currentTimeMillis);
        C63685Oz3.LIZIZ(hashMap);
        c67110QVm.LJIIIIZZ = hashMap;
        C67098QVa build = c67110QVm.build();
        C67109QVl c67109QVl = new C67109QVl();
        c67109QVl.LIZLLL = QVX.Data;
        c67109QVl.LJFF = EnumC67115QVr.SpecTopic;
        c67109QVl.LJI = Long.valueOf(CastLongProtector.parseLong(str));
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            QV5 qv5 = (QV5) it.next();
            C67112QVo c67112QVo = new C67112QVo();
            C67114QVq c67114QVq = new C67114QVq();
            c67114QVq.LIZLLL = Long.valueOf(qv5.LJI);
            c67112QVo.LIZLLL = c67114QVq.build();
            C67113QVp c67113QVp = new C67113QVp();
            c67113QVp.LIZLLL = Integer.valueOf((int) qv5.LIZJ);
            byte[] bArr = qv5.LJII;
            c67113QVp.LJI = C64537PUn.of(bArr, 0, bArr.length);
            c67112QVo.LJ = c67113QVp.build();
            c67112QVo.LJFF = Long.valueOf(currentTimeMillis);
            arrayList2.add(c67112QVo.build());
        }
        List<C67102QVe> LLJI = ORZ.LLJI(arrayList2);
        C63685Oz3.LIZ(LLJI);
        c67109QVl.LJIIIZ = LLJI;
        QVZ build2 = c67109QVl.build();
        C67111QVn c67111QVn = new C67111QVn();
        c67111QVn.LIZLLL = build;
        ArrayList LJII = C47261Igj.LJII(build2);
        C63685Oz3.LIZ(LJII);
        c67111QVn.LJ = LJII;
        C67101QVd build3 = c67111QVn.build();
        QW3 qw3 = new QW3();
        qw3.LIZIZ = !z;
        qw3.LIZ = build3;
        qw3.LIZJ = z;
        this.LJLIL.LJJL(qw3);
    }
}
