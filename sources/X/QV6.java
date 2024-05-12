package X;

import Y.IDComparatorS39S0000000_11;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sync.settings.SettingsV2;
import com.ss.android.agilelogger.ALog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QV6 implements QVG<QVX> {
    public static final /* synthetic */ InterfaceC74236TBo[] LJ;
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public SettingsV2 LIZJ;
    public final Context LIZLLL;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(QV6.class), "dbService", "getDbService()Lcom/bytedance/sync/v2/intf/IDBServiceV2;");
        C65352Pkq.LIZ.getClass();
        LJ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(QV6.class), "fileDataCache", "getFileDataCache()Lcom/bytedance/sync/interfaze/IFileDataCacheService;")};
    }

    public QV6(Context context) {
        o.LJIIJ(context, "context");
        this.LIZLLL = context;
        this.LIZ = C221108m2.LIZIZ(QVI.LJLIL);
        this.LIZIZ = C221108m2.LIZIZ(QVH.LJLIL);
    }

    @Override // X.QVG
    public final boolean LIZIZ(QVX obj) {
        o.LJIIJ(obj, "obj");
        if (obj == QVX.Data) {
            return true;
        }
        return false;
    }

    @Override // X.QVG
    public final void LIZ(C67098QVa c67098QVa, List<QVZ> list) {
        QVA qva;
        boolean z;
        int i;
        QV9 qv9;
        boolean z2;
        JSONObject jSONObject;
        Integer num;
        QUW LIZJ = QUW.LIZJ(this.LIZLLL);
        o.LJFF(LIZJ, "SyncSettings.inst(context)");
        SettingsV2 LIZIZ = LIZJ.LIZIZ();
        o.LJFF(LIZIZ, "SyncSettings.inst(context).settingsV2");
        this.LIZJ = LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (QVZ qvz : list) {
            Long l = qvz.sync_id;
            Object obj = linkedHashMap.get(l);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(l, obj);
            }
            ((List) obj).add(qvz);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            o.LJFF(key, "entry.key");
            long longValue = ((Number) key).longValue();
            Iterable iterable = (Iterable) entry.getValue();
            try {
                QV9 LJJIJIL = ((InterfaceC67090QUs) this.LIZ.getValue()).LJJIJIL(longValue);
                if (LJJIJIL == null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(longValue);
                    LIZ.append(" can't be found in local db");
                    C66629QCz.LIZIZ(X1D.LIZIZ(LIZ));
                } else {
                    String str = LJJIJIL.LIZ;
                    o.LJFF(str, "syncCursor.syncId");
                    int i2 = 1;
                    if (longValue != CastLongProtector.parseLong(str)) {
                        StringBuilder LIZJ2 = V10.LIZJ("syncId not match. server = ", longValue, ", local db = ");
                        LIZJ2.append(LJJIJIL.LIZ);
                        C66629QCz.LIZIZ(X1D.LIZIZ(LIZJ2));
                    } else if (!o.LJ(c67098QVa.did, LJJIJIL.LIZIZ)) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("did not match. server = ");
                        LIZ2.append(c67098QVa.did);
                        LIZ2.append(", local db = ");
                        LIZ2.append(LJJIJIL.LIZIZ);
                        C66629QCz.LIZIZ(X1D.LIZIZ(LIZ2));
                    } else if (LJJIJIL.LJ == QW9.User && (!o.LJ(c67098QVa.uid, LJJIJIL.LIZJ))) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("uid not match. server = ");
                        LIZ3.append(c67098QVa.uid);
                        LIZ3.append(", local db = ");
                        LIZ3.append(LJJIJIL.LIZJ);
                        C66629QCz.LIZIZ(X1D.LIZIZ(LIZ3));
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("local cursor info -> ");
                        LIZ4.append(LJJIJIL);
                        C66629QCz.LIZJ(X1D.LIZIZ(LIZ4));
                        for (QVZ qvz2 : ORZ.LLILII(new IDComparatorS39S0000000_11(23), iterable)) {
                            if (qvz2.ref_cursor.longValue() <= LJJIJIL.LJFF) {
                                List<C67102QVe> list2 = qvz2.packets;
                                o.LJFF(list2, "topic.packets");
                                ArrayList arrayList = new ArrayList();
                                for (C67102QVe c67102QVe : list2) {
                                    if (c67102QVe.cursor.cursor.longValue() > LJJIJIL.LJFF) {
                                        arrayList.add(c67102QVe);
                                    }
                                }
                                List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
                                ArrayList arrayList2 = (ArrayList) LLJILJILJ;
                                if (arrayList2.size() > i2) {
                                    C40675Fxn.LJJLIIIJ(LLJILJILJ, new IDComparatorS39S0000000_11(22));
                                }
                                ArrayList<QV2> arrayList3 = new ArrayList<>();
                                Iterator it = arrayList2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        C67102QVe it2 = (C67102QVe) it.next();
                                        o.LJFF(it2, "it");
                                        JSONObject jSONObject2 = new JSONObject();
                                        EnumC67115QVr enumC67115QVr = qvz2.topic_type;
                                        o.LJFF(enumC67115QVr, "topic.topic_type");
                                        jSONObject2.put("topic", enumC67115QVr.getValue());
                                        JSONObject jSONObject3 = new JSONObject();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        Long l2 = it2.ts;
                                        o.LJFF(l2, "packet.ts");
                                        jSONObject3.put("time_consuming", currentTimeMillis - l2.longValue());
                                        jSONObject3.put("receive_cnt", i2);
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put("sync_id", longValue);
                                        C67103QVf c67103QVf = it2.payload;
                                        if (c67103QVf != null && (num = c67103QVf.business) != null) {
                                            i = num.intValue();
                                        } else {
                                            i = 0;
                                        }
                                        jSONObject4.put("business", i);
                                        PV6.LIZ("sync_sdk_receive_data", jSONObject2, jSONObject3, jSONObject4);
                                        QV2 qv2 = new QV2();
                                        C67103QVf c67103QVf2 = it2.payload;
                                        qv2.LJI = c67103QVf2.business.intValue();
                                        qv2.LJII = c67103QVf2.consume_type;
                                        qv2.LIZ = String.valueOf(longValue);
                                        qv2.LJFF = c67103QVf2.md5;
                                        Long l3 = it2.ts;
                                        if (l3 == null) {
                                            l3 = C67098QVa.DEFAULT_TS;
                                            o.LJFF(l3, "BsyncHeader.DEFAULT_TS");
                                        }
                                        qv2.LJIIIZ = l3.longValue();
                                        qv2.LJIIJ = System.currentTimeMillis();
                                        Long l4 = it2.cursor.cursor;
                                        o.LJFF(l4, "it.cursor.cursor");
                                        qv2.LIZLLL = l4.longValue();
                                        qv2.LIZIZ = c67098QVa.did;
                                        qv2.LIZJ = c67098QVa.uid;
                                        qv2.LJIIJJI = qvz2.bucket;
                                        String str2 = qvz2.req_id;
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        qv2.LJIIL = str2;
                                        C64537PUn c64537PUn = it2.payload.data;
                                        if (c64537PUn == null) {
                                            qv2.LJ = C64537PUn.EMPTY.toByteArray();
                                            qv2.LJIIIIZZ = QV1.ORIGIN;
                                            jSONObject = null;
                                        } else {
                                            int size = c64537PUn.size();
                                            SettingsV2 settingsV2 = this.LIZJ;
                                            if (settingsV2 != null) {
                                                if (size > settingsV2.dbStoreSizeLimit) {
                                                    try {
                                                        qv9 = null;
                                                        jSONObject = null;
                                                        try {
                                                            String LJIIL = ((InterfaceC67086QUo) this.LIZIZ.getValue()).LJIIL(longValue, qv2.LIZLLL, it2.payload.data.toByteArray());
                                                            if (LJIIL != null) {
                                                                byte[] bytes = LJIIL.getBytes(PVC.LIZ);
                                                                o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                                                                qv2.LJ = bytes;
                                                                qv2.LJIIIIZZ = QV1.FILE_PATH;
                                                                z2 = true;
                                                                JSONObject jSONObject5 = new JSONObject();
                                                                jSONObject5.put("save_file", z2);
                                                                PV6.LIZIZ("sync_sdk_synclog_save_file", jSONObject5, jSONObject, C67092QUu.LIZ(qv2), 4);
                                                                C66629QCz.LIZJ("add sync_log to list : " + qv2);
                                                                arrayList3.add(qv2);
                                                                i2 = 1;
                                                            } else {
                                                                C66629QCz.LIZIZ("save data to file failed");
                                                                qva = new QVA(false, null);
                                                                break;
                                                            }
                                                        } catch (Exception unused) {
                                                            C66629QCz.LIZIZ("UnsupportedEncodingException when save syncLog data");
                                                            qva = new QVA(false, qv9);
                                                            z = qva.LIZ;
                                                            QV9 qv92 = qva.LIZIZ;
                                                            if (z) {
                                                            }
                                                            C66629QCz.LIZIZ("patchAndSave failed. break process data");
                                                            i2 = 1;
                                                        }
                                                    } catch (Exception unused2) {
                                                        qv9 = null;
                                                    }
                                                } else {
                                                    jSONObject = null;
                                                    qv2.LJ = it2.payload.data.toByteArray();
                                                    qv2.LJIIIIZZ = QV1.ORIGIN;
                                                }
                                            } else {
                                                o.LJIJI("mSettings");
                                                throw null;
                                            }
                                        }
                                        z2 = false;
                                        JSONObject jSONObject52 = new JSONObject();
                                        jSONObject52.put("save_file", z2);
                                        PV6.LIZIZ("sync_sdk_synclog_save_file", jSONObject52, jSONObject, C67092QUu.LIZ(qv2), 4);
                                        C66629QCz.LIZJ("add sync_log to list : " + qv2);
                                        arrayList3.add(qv2);
                                        i2 = 1;
                                    } else {
                                        QV9 qv93 = new QV9(LJJIJIL);
                                        Long l5 = qvz2.new_cursor;
                                        o.LJFF(l5, "topic.new_cursor");
                                        qv93.LJFF = l5.longValue();
                                        if (arrayList3.isEmpty()) {
                                            C66629QCz.LIZ("sync logs is empty,throw it ,syncId = " + longValue);
                                            qva = new QVA(true, LJJIJIL);
                                        } else {
                                            try {
                                                InterfaceC67090QUs interfaceC67090QUs = (InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class);
                                                C66629QCz.LIZ("save sync_logs to db : " + qv93 + " + " + arrayList3);
                                                interfaceC67090QUs.LJJJJLL(arrayList3, qv93);
                                                qva = new QVA(true, qv93);
                                            } catch (Exception e) {
                                                QUU.LIZJ().ensureNotReachHere(e, "execute sql failed when insertSyncLogAndCursor");
                                                C16880lQ.LLLLIIL(e);
                                                qva = new QVA(false, null);
                                            }
                                        }
                                    }
                                }
                                z = qva.LIZ;
                                QV9 qv922 = qva.LIZIZ;
                                if (z || qv922 == null) {
                                    C66629QCz.LIZIZ("patchAndSave failed. break process data");
                                } else {
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("update memory cursor ");
                                    LIZ5.append(qv922);
                                    C66629QCz.LIZJ(X1D.LIZIZ(LIZ5));
                                    LJJIJIL = qv922;
                                }
                            } else {
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append(qvz2.ref_cursor);
                                LIZ6.append(" > ");
                                LIZ6.append(LJJIJIL.LJFF);
                                LIZ6.append(", server cursor > db cursor when patch syncId = ");
                                LIZ6.append(longValue);
                                C66629QCz.LIZIZ(X1D.LIZIZ(LIZ6));
                            }
                            i2 = 1;
                        }
                    }
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("info not match when handle ");
                    LIZ7.append(longValue);
                    LIZ7.append('.');
                    C66629QCz.LIZIZ(X1D.LIZIZ(LIZ7));
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
                QUU.LIZJ().ensureNotReachHere(e2, "execute sql failed when queryLocalSyncCursorInfo when receive data");
            }
        }
        ((QUT) QPG.LIZ(QUT.class)).LJJLIIIJ(linkedHashMap.keySet());
        if (C66629QCz.LIZ != null) {
            try {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("SyncSDKLog", "handle data finished. continue poll again...");
            } catch (Throwable unused3) {
            }
        }
        ((InterfaceC67096QUy) QPG.LIZ(InterfaceC67096QUy.class)).LJJJJI(false);
    }
}
