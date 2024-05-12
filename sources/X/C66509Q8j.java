package X;

import android.text.TextUtils;
import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.squareup.wire.Wire;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Q8j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66509Q8j {
    public static final WsChannelMsg LIZ(byte[] bArr) {
        StringBuilder sb;
        int indexOf;
        Frame decode = Frame.ADAPTER.decode(bArr);
        long longValue = ((Long) Wire.get(decode.seqid, Frame.DEFAULT_SEQID)).longValue();
        long longValue2 = ((Long) Wire.get(decode.logid, Frame.DEFAULT_LOGID)).longValue();
        int intValue = ((Integer) Wire.get(decode.service, Frame.DEFAULT_SERVICE)).intValue();
        int intValue2 = ((Integer) Wire.get(decode.method, Frame.DEFAULT_METHOD)).intValue();
        List<C66507Q8h> list = (List) Wire.get(decode.headers, Collections.emptyList());
        String str = (String) Wire.get(decode.payload_encoding, "");
        String str2 = (String) Wire.get(decode.payload_type, "");
        byte[] byteArray = ((C64537PUn) Wire.get(decode.payload, Frame.DEFAULT_PAYLOAD)).toByteArray();
        String str3 = (String) Wire.get(decode.serverTiming, "");
        String str4 = (String) Wire.get(decode.msgId, "");
        WsChannelMsg wsChannelMsg = new WsChannelMsg();
        wsChannelMsg.logId = longValue2;
        wsChannelMsg.seqId = longValue;
        wsChannelMsg.service = intValue;
        wsChannelMsg.method = intValue2;
        if (list != null && list.size() >= 0) {
            ArrayList arrayList = new ArrayList();
            for (C66507Q8h c66507Q8h : list) {
                WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                msgHeader.key = (String) Wire.get(c66507Q8h.key, "");
                msgHeader.value = (String) Wire.get(c66507Q8h.value, "");
                arrayList.add(msgHeader);
            }
            wsChannelMsg.msgHeaders = arrayList;
        }
        wsChannelMsg.payloadEncoding = str;
        wsChannelMsg.payloadType = str2;
        wsChannelMsg.payload = byteArray;
        String str5 = null;
        if (!TextUtils.isEmpty(str3) && (indexOf = (sb = new StringBuilder(str3)).indexOf("ttnet;")) >= 0) {
            StringBuilder LIZ = X1D.LIZ();
            sb.insert(indexOf + 6, C72545SdZ.LIZLLL(LIZ, "recv_time=", ";", LIZ));
            str5 = sb.toString();
        }
        if (!TextUtils.isEmpty(str5)) {
            str3 = str5;
        }
        wsChannelMsg.serverTiming = str3;
        wsChannelMsg.msgId = str4;
        return wsChannelMsg;
    }

    public static final byte[] LIZIZ(WsChannelMsg wsChannelMsg) {
        C64537PUn c64537PUn;
        if (wsChannelMsg == null) {
            return null;
        }
        if (wsChannelMsg.LIZ() != null) {
            c64537PUn = C64537PUn.of(wsChannelMsg.LIZ());
        } else {
            c64537PUn = C64537PUn.EMPTY;
        }
        C66510Q8k c66510Q8k = new C66510Q8k();
        c66510Q8k.LJ = Long.valueOf(wsChannelMsg.logId);
        c66510Q8k.LIZLLL = Long.valueOf(wsChannelMsg.seqId);
        c66510Q8k.LJFF = Integer.valueOf(wsChannelMsg.service);
        c66510Q8k.LJIIIIZZ = wsChannelMsg.payloadEncoding;
        c66510Q8k.LJIIIZ = wsChannelMsg.payloadType;
        c66510Q8k.LJIIJ = c64537PUn;
        c66510Q8k.LJI = Integer.valueOf(wsChannelMsg.method);
        List<WsChannelMsg.MsgHeader> list = wsChannelMsg.msgHeaders;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (WsChannelMsg.MsgHeader msgHeader : list) {
                Q3O q3o = new Q3O();
                q3o.LIZLLL = msgHeader.key;
                q3o.LJ = msgHeader.value;
                arrayList.add(q3o.build());
            }
        }
        if (!arrayList.isEmpty()) {
            C63685Oz3.LIZ(arrayList);
            c66510Q8k.LJII = arrayList;
        }
        return Frame.ADAPTER.encode(c66510Q8k.build());
    }
}
