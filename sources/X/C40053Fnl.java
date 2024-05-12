package X;

import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Fnl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40053Fnl {
    public static final C40053Fnl LIZ = new C40053Fnl();
    public static final boolean LIZIZ;
    public static final Charset LIZJ;

    static {
        boolean z;
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ = z;
        LIZJ = Charset.forName("UTF8");
    }

    public static Object LIZ(ByteBuffer byteBuffer) {
        TraceEvent.LIZIZ("LepusBuffer::DecodeMessage");
        if (byteBuffer == null) {
            TraceEvent.LJ("LepusBuffer::DecodeMessage");
            return null;
        }
        try {
            byteBuffer.order(ByteOrder.nativeOrder());
            Object LIZLLL = LIZLLL(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                TraceEvent.LJ("LepusBuffer::DecodeMessage");
                return LIZLLL;
            }
            throw new IllegalArgumentException("Message corrupted");
        } catch (IllegalArgumentException e) {
            LynxError lynxError = new LynxError(e.toString(), -3);
            if (LynxEnv.LJIIIZ().LJIIZILJ != null) {
                LynxEnv.LJIIIZ().LJIIZILJ.LJIJ(lynxError);
            }
            TraceEvent.LJ("LepusBuffer::DecodeMessage");
            return null;
        }
    }

    public static ByteBuffer LIZIZ(Object obj) {
        TraceEvent.LIZIZ("LepusBuffer::EncodeMessage");
        if (obj == null) {
            TraceEvent.LJ("LepusBuffer::EncodeMessage");
            return null;
        }
        C40054Fnm c40054Fnm = new C40054Fnm();
        try {
            LJ(c40054Fnm, obj, new LinkedList());
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c40054Fnm.size());
            allocateDirect.put(c40054Fnm.LIZ(), 0, c40054Fnm.size());
            TraceEvent.LJ("LepusBuffer::EncodeMessage");
            return allocateDirect;
        } catch (IllegalArgumentException e) {
            LynxError lynxError = new LynxError(e.toString(), -3);
            LynxEnv.LJIIIZ().LJIIZILJ.LJIJ(lynxError);
            LLog.LIZLLL(4, "LepusBuffer", lynxError.toString());
            TraceEvent.LJ("LepusBuffer::EncodeMessage");
            return null;
        }
    }

    public static int LIZJ(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = byteBuffer.get() & 255;
            if (i < 254) {
                return i;
            }
            if (i == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    public static Object LIZLLL(ByteBuffer byteBuffer) {
        Object obj;
        if (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LepusBuffer::ReadValue: ");
            LIZ2.append((int) b);
            TraceEvent.LIZIZ(X1D.LIZIZ(LIZ2));
            if (b != 100) {
                int i = 0;
                switch (b) {
                    case 0:
                        break;
                    case 1:
                        obj = Boolean.TRUE;
                        break;
                    case 2:
                        obj = Boolean.FALSE;
                        break;
                    case 3:
                        obj = Integer.valueOf(byteBuffer.getInt());
                        break;
                    case 4:
                        int position = byteBuffer.position() % 8;
                        if (position != 0) {
                            byteBuffer.position((byteBuffer.position() + 8) - position);
                        }
                        obj = Long.valueOf(byteBuffer.getLong());
                        break;
                    case 5:
                        int position2 = byteBuffer.position() % 8;
                        if (position2 != 0) {
                            byteBuffer.position((byteBuffer.position() + 8) - position2);
                        }
                        obj = Double.valueOf(byteBuffer.getDouble());
                        break;
                    case 6:
                        byte[] bArr = new byte[LIZJ(byteBuffer)];
                        byteBuffer.get(bArr);
                        obj = new String(bArr, LIZJ);
                        break;
                    case 7:
                        int LIZJ2 = LIZJ(byteBuffer);
                        obj = new ArrayList(LIZJ2);
                        while (i < LIZJ2) {
                            obj.add(LIZLLL(byteBuffer));
                            i++;
                        }
                        break;
                    case 8:
                        int LIZJ3 = LIZJ(byteBuffer);
                        obj = new HashMap();
                        while (i < LIZJ3) {
                            obj.put(LIZLLL(byteBuffer), LIZLLL(byteBuffer));
                            i++;
                        }
                        break;
                    default:
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("LepusBuffer::ReadValue: ");
                        LIZ3.append((int) b);
                        TraceEvent.LJ(X1D.LIZIZ(LIZ3));
                        throw new IllegalArgumentException("Message corrupted");
                }
                TraceEvent.LJ("LepusBuffer::ReadValue: " + ((int) b));
                return obj;
            }
            obj = 0;
            TraceEvent.LJ("LepusBuffer::ReadValue: " + ((int) b));
            return obj;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static boolean LJFF(Object obj, Collection collection) {
        if (obj == null) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (obj == it.next()) {
                return true;
            }
        }
        return false;
    }

    public static void LJI(C40054Fnm c40054Fnm, int i) {
        if (LIZIZ) {
            c40054Fnm.write(i);
            c40054Fnm.write(i >>> 8);
            c40054Fnm.write(i >>> 16);
            c40054Fnm.write(i >>> 24);
            return;
        }
        c40054Fnm.write(i >>> 24);
        c40054Fnm.write(i >>> 16);
        c40054Fnm.write(i >>> 8);
        c40054Fnm.write(i);
    }

    public static void LJII(C40054Fnm c40054Fnm, long j) {
        if (LIZIZ) {
            c40054Fnm.write((byte) j);
            c40054Fnm.write((byte) (j >>> 8));
            c40054Fnm.write((byte) (j >>> 16));
            c40054Fnm.write((byte) (j >>> 24));
            c40054Fnm.write((byte) (j >>> 32));
            c40054Fnm.write((byte) (j >>> 40));
            c40054Fnm.write((byte) (j >>> 48));
            c40054Fnm.write((byte) (j >>> 56));
            return;
        }
        c40054Fnm.write((byte) (j >>> 56));
        c40054Fnm.write((byte) (j >>> 48));
        c40054Fnm.write((byte) (j >>> 40));
        c40054Fnm.write((byte) (j >>> 32));
        c40054Fnm.write((byte) (j >>> 24));
        c40054Fnm.write((byte) (j >>> 16));
        c40054Fnm.write((byte) (j >>> 8));
        c40054Fnm.write((byte) j);
    }

    public static void LJIIIIZZ(C40054Fnm c40054Fnm, int i) {
        if (i < 254) {
            c40054Fnm.write(i);
            return;
        }
        if (i <= 65535) {
            c40054Fnm.write(254);
            if (LIZIZ) {
                c40054Fnm.write(i);
                c40054Fnm.write(i >>> 8);
                return;
            } else {
                c40054Fnm.write(i >>> 8);
                c40054Fnm.write(i);
                return;
            }
        }
        c40054Fnm.write(255);
        LJI(c40054Fnm, i);
    }

    public static void LJ(C40054Fnm c40054Fnm, Object obj, LinkedList linkedList) {
        int i;
        if (obj == null || obj.equals(null)) {
            c40054Fnm.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                i = 1;
            } else {
                i = 2;
            }
            c40054Fnm.write(i);
            return;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                c40054Fnm.write(3);
                LJI(c40054Fnm, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                c40054Fnm.write(4);
                LJII(c40054Fnm, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                c40054Fnm.write(5);
                int size = c40054Fnm.size() % 8;
                if (size != 0) {
                    for (int i2 = 0; i2 < 8 - size; i2++) {
                        c40054Fnm.write(0);
                    }
                }
                LJII(c40054Fnm, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            }
            c40054Fnm.write(0);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Unsupported Number type: ");
            LIZ2.append(obj.getClass());
            LIZ2.append(" value: ");
            LIZ2.append(obj);
            LLog.LIZLLL(4, "LepusBuffer", X1D.LIZIZ(LIZ2));
            return;
        }
        if (obj instanceof String) {
            c40054Fnm.write(6);
            byte[] bytes = ((String) obj).getBytes(LIZJ);
            LJIIIIZZ(c40054Fnm, bytes.length);
            c40054Fnm.write(bytes, 0, bytes.length);
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (!list.isEmpty() && LJFF(obj, linkedList)) {
                c40054Fnm.write(0);
                new IllegalArgumentException("writeValue has cycle array!");
                return;
            }
            linkedList.addLast(obj);
            c40054Fnm.write(7);
            LJIIIIZZ(c40054Fnm, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LJ(c40054Fnm, it.next(), linkedList);
            }
            linkedList.removeLast();
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (!map.isEmpty() && LJFF(obj, linkedList)) {
                c40054Fnm.write(0);
                new IllegalArgumentException("writeValue has cycle dict!");
                return;
            }
            linkedList.addLast(obj);
            c40054Fnm.write(8);
            LJIIIIZZ(c40054Fnm, map.size());
            for (Map.Entry entry : map.entrySet()) {
                LJ(c40054Fnm, entry.getKey(), linkedList);
                LJ(c40054Fnm, entry.getValue(), linkedList);
            }
            linkedList.removeLast();
            return;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.length() > 0 && LJFF(obj, linkedList)) {
                c40054Fnm.write(0);
                new IllegalArgumentException("writeValue has cycle JSONObject!");
                return;
            }
            linkedList.addLast(obj);
            c40054Fnm.write(8);
            LJIIIIZZ(c40054Fnm, jSONObject.length());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                LJ(c40054Fnm, next, linkedList);
                LJ(c40054Fnm, jSONObject.opt(next), linkedList);
            }
            linkedList.removeLast();
            return;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() > 0 && LJFF(obj, linkedList)) {
                c40054Fnm.write(0);
                new IllegalArgumentException("writeValue has cycle JSONArray!");
                return;
            }
            linkedList.addLast(obj);
            c40054Fnm.write(7);
            LJIIIIZZ(c40054Fnm, jSONArray.length());
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                LJ(c40054Fnm, jSONArray.opt(i3), linkedList);
            }
            linkedList.removeLast();
            return;
        }
        if (obj instanceof byte[]) {
            c40054Fnm.write(9);
            byte[] bArr = (byte[]) obj;
            LJIIIIZZ(c40054Fnm, bArr.length);
            c40054Fnm.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof TemplateData) {
            TemplateData templateData = (TemplateData) obj;
            templateData.LIZLLL();
            c40054Fnm.write(10);
            LJII(c40054Fnm, templateData.LIZ);
            return;
        }
        c40054Fnm.write(0);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Unsupported type: ");
        LIZ3.append(obj.getClass());
        LIZ3.append(" value: ");
        LIZ3.append(obj);
        LLog.LIZLLL(4, "LepusBuffer", X1D.LIZIZ(LIZ3));
    }
}
