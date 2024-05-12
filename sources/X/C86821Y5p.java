package X;

import android.graphics.Bitmap;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYCvMat;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yi2.b;

/* renamed from: X.Y5p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86821Y5p implements InterfaceC86827Y5v {
    public static final C86821Y5p LIZ = new C86821Y5p();

    public static void LIZIZ(Bitmap bitmap, PTYTaskResultCallback pTYTaskResultCallback) {
        IPitayaCore core = PitayaCoreFactory.getCore("411745");
        JSONObject LIZLLL = C770830u.LIZLLL("type", 2);
        LIZLLL.put("image", new PTYCvMat(bitmap, null, 2, null));
        core.runTask("bankcard_detect_bytenn", new PTYTaskData(LIZLLL), new PTYTaskConfig(false, null, 0.0f, 7, null), pTYTaskResultCallback);
    }

    @Override // X.InterfaceC86827Y5v
    public final void LIZ(final int i, final b bVar, final Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        if (i == EnumC86811Y5f.Default.getValue()) {
            bVar.LIZ(-1, -1, "needs to be uploaded", new PipoOcrResult(bitmap, 254), "video");
            return;
        }
        if (i == EnumC86811Y5f.DetectAndRecognize.getValue() || i == EnumC86811Y5f.NativeRecognizeInner.getValue() || i == EnumC86811Y5f.NativeRecognize.getValue()) {
            LIZIZ(bitmap, new PTYTaskResultCallback() { // from class: com.bytedance.pipo.pitaya.PipoPitayaService$onOcrProcess$1
                /* JADX WARN: Removed duplicated region for block: B:116:0x0344 A[Catch: all -> 0x0357, TryCatch #1 {all -> 0x0357, blocks: (B:168:0x0081, B:170:0x0087, B:30:0x009f, B:33:0x00ab, B:35:0x00b1, B:37:0x00b9, B:40:0x00d8, B:42:0x00f0, B:44:0x0103, B:46:0x0114, B:48:0x0125, B:50:0x0137, B:52:0x0148, B:54:0x015b, B:56:0x016e, B:66:0x01ae, B:68:0x01ca, B:71:0x01ce, B:73:0x01d6, B:74:0x0201, B:75:0x0206, B:77:0x0249, B:78:0x024c, B:81:0x030b, B:83:0x0252, B:85:0x025a, B:87:0x0265, B:89:0x0277, B:91:0x0289, B:93:0x029a, B:95:0x02ad, B:97:0x02bf, B:99:0x02d2, B:101:0x02e4, B:102:0x031a, B:103:0x031f, B:104:0x0320, B:105:0x0325, B:106:0x0326, B:107:0x032b, B:108:0x032c, B:109:0x0331, B:110:0x0332, B:111:0x0337, B:112:0x0338, B:113:0x033d, B:114:0x033e, B:115:0x0343, B:116:0x0344, B:117:0x0349, B:118:0x01de, B:120:0x01e6, B:122:0x01f2, B:123:0x01fb, B:124:0x0200, B:144:0x020b, B:145:0x0210, B:146:0x0211, B:147:0x0216, B:148:0x0217, B:149:0x021c, B:150:0x021d, B:151:0x0222, B:152:0x0223, B:153:0x0228, B:154:0x0229, B:155:0x022e, B:156:0x022f, B:157:0x0234, B:158:0x0235, B:159:0x023a, B:160:0x023b, B:161:0x0240, B:165:0x034a), top: B:167:0x0081 }] */
                /* JADX WARN: Removed duplicated region for block: B:164:0x0245  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0265 A[Catch: all -> 0x0357, TryCatch #1 {all -> 0x0357, blocks: (B:168:0x0081, B:170:0x0087, B:30:0x009f, B:33:0x00ab, B:35:0x00b1, B:37:0x00b9, B:40:0x00d8, B:42:0x00f0, B:44:0x0103, B:46:0x0114, B:48:0x0125, B:50:0x0137, B:52:0x0148, B:54:0x015b, B:56:0x016e, B:66:0x01ae, B:68:0x01ca, B:71:0x01ce, B:73:0x01d6, B:74:0x0201, B:75:0x0206, B:77:0x0249, B:78:0x024c, B:81:0x030b, B:83:0x0252, B:85:0x025a, B:87:0x0265, B:89:0x0277, B:91:0x0289, B:93:0x029a, B:95:0x02ad, B:97:0x02bf, B:99:0x02d2, B:101:0x02e4, B:102:0x031a, B:103:0x031f, B:104:0x0320, B:105:0x0325, B:106:0x0326, B:107:0x032b, B:108:0x032c, B:109:0x0331, B:110:0x0332, B:111:0x0337, B:112:0x0338, B:113:0x033d, B:114:0x033e, B:115:0x0343, B:116:0x0344, B:117:0x0349, B:118:0x01de, B:120:0x01e6, B:122:0x01f2, B:123:0x01fb, B:124:0x0200, B:144:0x020b, B:145:0x0210, B:146:0x0211, B:147:0x0216, B:148:0x0217, B:149:0x021c, B:150:0x021d, B:151:0x0222, B:152:0x0223, B:153:0x0228, B:154:0x0229, B:155:0x022e, B:156:0x022f, B:157:0x0234, B:158:0x0235, B:159:0x023a, B:160:0x023b, B:161:0x0240, B:165:0x034a), top: B:167:0x0081 }] */
                @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onResult(boolean r19, com.bytedance.pitaya.api.bean.PTYError r20, com.bytedance.pitaya.api.bean.PTYTaskData r21, com.bytedance.pitaya.api.bean.PTYPackageInfo r22) {
                    /*
                        Method dump skipped, instructions count: 868
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.pitaya.PipoPitayaService$onOcrProcess$1.onResult(boolean, com.bytedance.pitaya.api.bean.PTYError, com.bytedance.pitaya.api.bean.PTYTaskData, com.bytedance.pitaya.api.bean.PTYPackageInfo):void");
                }
            });
        } else {
            if (i != EnumC86811Y5f.ImageCropped.getValue()) {
                return;
            }
            LIZIZ(bitmap, new PTYTaskResultCallback() { // from class: com.bytedance.pipo.pitaya.PipoPitayaService$onOcrProcess$2
                /* JADX WARN: Removed duplicated region for block: B:12:0x016c A[Catch: Exception -> 0x0242, TryCatch #0 {Exception -> 0x0242, blocks: (B:49:0x0016, B:51:0x001c, B:53:0x0024, B:55:0x0047, B:57:0x005f, B:59:0x0070, B:61:0x0081, B:63:0x0092, B:65:0x00a3, B:67:0x00b4, B:69:0x00c5, B:71:0x00d6, B:6:0x0154, B:27:0x020f, B:8:0x015a, B:10:0x0162, B:12:0x016c, B:14:0x017d, B:16:0x018e, B:18:0x019f, B:20:0x01b1, B:22:0x01c2, B:24:0x01d3, B:26:0x01e4, B:31:0x0212, B:32:0x0217, B:33:0x0218, B:34:0x021d, B:35:0x021e, B:36:0x0223, B:37:0x0224, B:38:0x0229, B:39:0x022a, B:40:0x022f, B:41:0x0230, B:42:0x0235, B:43:0x0236, B:44:0x023b, B:45:0x023c, B:46:0x0241, B:97:0x0114, B:98:0x0119, B:99:0x011a, B:100:0x011f, B:101:0x0120, B:102:0x0125, B:103:0x0126, B:104:0x012b, B:105:0x012c, B:106:0x0131, B:107:0x0132, B:108:0x0137, B:109:0x0138, B:110:0x013d, B:111:0x013e, B:112:0x0143, B:113:0x0144, B:114:0x014b), top: B:48:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x023c A[Catch: Exception -> 0x0242, TryCatch #0 {Exception -> 0x0242, blocks: (B:49:0x0016, B:51:0x001c, B:53:0x0024, B:55:0x0047, B:57:0x005f, B:59:0x0070, B:61:0x0081, B:63:0x0092, B:65:0x00a3, B:67:0x00b4, B:69:0x00c5, B:71:0x00d6, B:6:0x0154, B:27:0x020f, B:8:0x015a, B:10:0x0162, B:12:0x016c, B:14:0x017d, B:16:0x018e, B:18:0x019f, B:20:0x01b1, B:22:0x01c2, B:24:0x01d3, B:26:0x01e4, B:31:0x0212, B:32:0x0217, B:33:0x0218, B:34:0x021d, B:35:0x021e, B:36:0x0223, B:37:0x0224, B:38:0x0229, B:39:0x022a, B:40:0x022f, B:41:0x0230, B:42:0x0235, B:43:0x0236, B:44:0x023b, B:45:0x023c, B:46:0x0241, B:97:0x0114, B:98:0x0119, B:99:0x011a, B:100:0x011f, B:101:0x0120, B:102:0x0125, B:103:0x0126, B:104:0x012b, B:105:0x012c, B:106:0x0131, B:107:0x0132, B:108:0x0137, B:109:0x0138, B:110:0x013d, B:111:0x013e, B:112:0x0143, B:113:0x0144, B:114:0x014b), top: B:48:0x0016 }] */
                @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onResult(boolean r23, com.bytedance.pitaya.api.bean.PTYError r24, com.bytedance.pitaya.api.bean.PTYTaskData r25, com.bytedance.pitaya.api.bean.PTYPackageInfo r26) {
                    /*
                        Method dump skipped, instructions count: 591
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.pitaya.PipoPitayaService$onOcrProcess$2.onResult(boolean, com.bytedance.pitaya.api.bean.PTYError, com.bytedance.pitaya.api.bean.PTYTaskData, com.bytedance.pitaya.api.bean.PTYPackageInfo):void");
                }
            });
        }
    }
}
