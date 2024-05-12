package com.ttnet.org.chromium.net.impl;

import J.N;
import X.C16880lQ;
import X.PNJ;
import X.QFB;
import X.QFC;
import X.QFE;
import X.QFF;
import X.QFI;
import X.QFN;
import X.QFP;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class CronetFrontierClient {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final Map<String, String> LJIIIZ;
    public final QFF LJIIJ;
    public final Map<Integer, QFI> LJIIJJI = new ConcurrentHashMap();
    public final QFP LJIIL;
    public final List<Integer> LJIILIIL;
    public long LJIILJJIL;
    public final Object LJIILL;
    public final AtomicInteger LJIILLIIL;

    static {
        C16880lQ.LJLLJ(CronetFrontierClient.class);
    }

    public CronetFrontierClient(QFC qfc) {
        this.LJIIJ = QFF.UNKNOWN;
        Object obj = new Object();
        this.LJIILL = obj;
        this.LJIILLIIL = new AtomicInteger(0);
        this.LIZ = qfc.LIZ;
        this.LIZIZ = qfc.LIZIZ;
        this.LIZJ = qfc.LIZJ;
        this.LIZLLL = qfc.LIZLLL;
        this.LJ = qfc.LJ;
        this.LJFF = qfc.LJFF;
        this.LJI = qfc.LJI;
        this.LJII = qfc.LJII;
        this.LJIIIIZZ = qfc.LJIIIIZZ;
        Map<String, String> map = qfc.LJIIIZ;
        this.LJIIIZ = map;
        this.LJIIJ = qfc.LJIIJ;
        this.LJIIL = qfc.LJIIJJI;
        this.LJIILIIL = qfc.LJIIL;
        synchronized (obj) {
            try {
                if (this.LJIILJJIL == 0) {
                    this.LJIILJJIL = N.MagNlhNv(this);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        N.MwZrRAIG(this.LJIILJJIL, this, entry.getKey(), entry.getValue());
                    }
                }
                List<Integer> list = this.LJIILIIL;
                if (list != null) {
                    Iterator<Integer> it = list.iterator();
                    while (it.hasNext()) {
                        N.Msf3H5kQ(this.LJIILJJIL, this, it.next().intValue());
                    }
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                N.Mhk1t9AY(this.LJIILJJIL, this, this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, null, this.LJII, this.LJIIIIZZ, this.LJIIJ.getValue());
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                throw th;
            }
        }
    }

    public final void LIZ(QFI qfi) {
        synchronized (this.LJIILL) {
            if (this.LJIILJJIL == 0) {
                return;
            }
            ((ConcurrentHashMap) this.LJIIJJI).put(Integer.valueOf(qfi.LIZ), qfi);
            N.MKu8Zh_d(this.LJIILJJIL, this, null, null, qfi.LIZ, qfi.LIZIZ.getValue(), true);
        }
    }

    public final void LIZIZ(boolean z) {
        synchronized (this.LJIILL) {
            if (this.LJIILJJIL == 0) {
                return;
            }
            N.MlH8$Rpg(this.LJIILJJIL, this, z);
        }
    }

    private void onConnectionStateChanged(int i, String str) {
        this.LJIILLIIL.set(i);
        try {
            ((QFE) this.LJIIL).LIZIZ(i, str);
        } catch (Exception unused) {
        }
    }

    private void onServiceReady(int i, String str) {
        boolean z;
        QFI qfi = (QFI) ((ConcurrentHashMap) this.LJIIJJI).get(Integer.valueOf(i));
        if (qfi == null) {
            return;
        }
        QFN qfn = (QFN) qfi.LIZJ;
        qfn.getClass();
        Logger.debug();
        if (!qfn.LIZ.LJIIIIZZ) {
            qfn.LIZ.LJIIIIZZ = true;
            QFB qfb = qfn.LIZ;
            if (qfb.LJI != null && qfb.LJII != -1) {
                QFB qfb2 = qfn.LIZ;
                CronetFrontierClient cronetFrontierClient = qfb2.LJI;
                if (qfb2.LJII == 1) {
                    z = true;
                } else {
                    z = false;
                }
                cronetFrontierClient.LIZIZ(z);
            }
        }
        ((ConcurrentHashMap) qfn.LIZ.LJFF).put(Integer.valueOf(i), Boolean.TRUE);
        qfn.LIZ.LIZ.onServiceConnectEvent(i, true, str);
    }

    private void onConnectionError(int i, String str, String str2) {
        this.LJIILLIIL.set(i);
        try {
            ((QFE) this.LJIIL).LIZ(i, str, str2);
        } catch (Exception unused) {
        }
    }

    private void onError(int i, int i2, String str) {
        QFI qfi = (QFI) ((ConcurrentHashMap) this.LJIIJJI).get(Integer.valueOf(i));
        if (qfi == null) {
            return;
        }
        QFN qfn = (QFN) qfi.LIZJ;
        qfn.getClass();
        Logger.debug();
        qfn.LIZ.LIZ.onServiceConnectEvent(i, false, str);
    }

    private void onReceivedAck(int i, long j, String str, boolean z) {
        if (z) {
            return;
        }
        QFI qfi = (QFI) ((ConcurrentHashMap) this.LJIIJJI).get(Integer.valueOf(i));
        if (qfi == null) {
            return;
        }
        qfi.LIZJ.getClass();
        Logger.debug();
    }

    private void onReceivedMessage(int i, String[] strArr, ByteBuffer byteBuffer, boolean z) {
        if (z) {
            return;
        }
        QFI qfi = (QFI) ((ConcurrentHashMap) this.LJIIJJI).get(Integer.valueOf(i));
        if (qfi == null) {
            return;
        }
        int length = strArr.length;
        if (length % 2 != 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < length; i2 += 2) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                int i3 = i2 + 1;
                if (!TextUtils.isEmpty(strArr[i3])) {
                    hashMap.put(strArr[i2], strArr[i3]);
                }
            }
        }
        byte[] bArr = new byte[byteBuffer.capacity()];
        byteBuffer.get(bArr);
        QFN qfn = (QFN) qfi.LIZJ;
        qfn.getClass();
        WsChannelMsg wsChannelMsg = new WsChannelMsg();
        wsChannelMsg.service = i;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                if (((String) entry.getKey()).equals("method_id")) {
                    try {
                        wsChannelMsg.method = CastIntegerProtector.valueOf((String) entry.getValue()).intValue();
                    } catch (NumberFormatException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                } else if (((String) entry.getKey()).equalsIgnoreCase("payload_encoding")) {
                    wsChannelMsg.payloadEncoding = (String) entry.getValue();
                } else if (((String) entry.getKey()).equalsIgnoreCase("payload_type")) {
                    wsChannelMsg.payloadType = (String) entry.getValue();
                } else if (((String) entry.getKey()).equalsIgnoreCase("msg_id")) {
                    wsChannelMsg.msgId = (String) entry.getValue();
                } else if (((String) entry.getKey()).equalsIgnoreCase("server_timing")) {
                    wsChannelMsg.serverTiming = (String) entry.getValue();
                } else {
                    WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                    msgHeader.key = (String) entry.getKey();
                    msgHeader.value = (String) entry.getValue();
                    arrayList.add(msgHeader);
                }
            }
        }
        wsChannelMsg.msgHeaders = arrayList;
        wsChannelMsg.payload = bArr;
        if (wsChannelMsg.payloadEncoding == null) {
            wsChannelMsg.payloadEncoding = "";
        }
        if (wsChannelMsg.payloadType == null) {
            wsChannelMsg.payloadType = "";
        }
        Logger.debug();
        qfn.LIZ.LIZ.onMessage(wsChannelMsg);
    }

    private void onTrafficChanged(String str, long j, long j2, boolean z) {
        try {
            ((QFE) this.LJIIL).getClass();
            PNJ.LIZ().LIZIZ(str, j, j2, z);
        } catch (Throwable unused) {
        }
    }
}
