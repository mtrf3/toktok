package X;

import android.util.Pair;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import net.jpountz.lz4.LZ4Exception;
import net.jpountz.lz4.LZ4Factory;

/* renamed from: X.Oyz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63681Oyz {
    public static Pair<String, byte[]> LIZIZ(Request request) {
        if (request.cmd.intValue() > EnumC63625Oy5.IMCMD_NOT_USED.getValue()) {
            C114444eO LIZLLL = C63308Osy.LJI().LIZLLL();
            byte[] encode = request.encode();
            float length = encode.length;
            if (LIZLLL != null) {
                if (encode.length <= LIZLLL.LJIIJ) {
                    return new Pair<>("pb", encode);
                }
                byte[] compress = LZ4Factory.fastestInstance().fastCompressor().compress(encode);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("compress rate = ");
                LIZ.append(compress.length / length);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                if (compress.length <= LIZLLL.LJIIIZ) {
                    return new Pair<>("__lz4", compress);
                }
                throw new C63616Oxw(-2004);
            }
            throw new C63616Oxw(-2001);
        }
        throw new C63616Oxw(-2002);
    }

    public static Response LIZ(String str, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            if ("__lz4".equals(str)) {
                if (bArr.length == 0) {
                    bArr = null;
                } else {
                    try {
                        bArr = LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, bArr.length * 3);
                    } catch (LZ4Exception e) {
                        C16880lQ.LLLLIIL(e);
                        C63322OtC.LJ("SSEncodeAndDecode lz4Decompress", e);
                        bArr = LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, 51200);
                    }
                }
            }
            return Response.ADAPTER.decode(bArr);
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
            C63322OtC.LJ("SSEncodeAndDecode decode", e2);
            C63616Oxw c63616Oxw = new C63616Oxw(-2003);
            c63616Oxw.setStackTrace(e2.getStackTrace());
            throw c63616Oxw;
        }
    }
}
