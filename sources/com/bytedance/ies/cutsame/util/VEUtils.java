package com.bytedance.ies.cutsame.util;

import X.AnonymousClass636;
import X.C152275yJ;
import X.C16880lQ;
import X.C172946qY;
import X.C172976qb;
import X.C221108m2;
import X.C56O;
import X.InterfaceC172956qZ;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.vesdk.VECurveSpeedUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VEUtils {
    static {
        new VEUtils();
        new ConcurrentHashMap();
        C221108m2.LIZIZ(C56O.LJLIL);
    }

    public final float calculateAveCurveSpeed(String str) {
        C172946qY.LIZ("VEUtils", "calculateAveCurveSpeed: ");
        if (TextUtils.isEmpty(str)) {
            C172946qY.LIZIZ("VEUtils", "curveParamJson is empty");
            return -19.0f;
        }
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(str), "speed_points");
            int length = jSONArray.length();
            float[] fArr = new float[length];
            float[] fArr2 = new float[length];
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    float f = (float) JSONObjectProtectorUtils.getDouble(jSONObject, "x");
                    float f2 = (float) JSONObjectProtectorUtils.getDouble(jSONObject, "y");
                    fArr[i] = f;
                    fArr2[i] = f2;
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            float aveCurveSpeed = (float) new VECurveSpeedUtils(VECurveSpeedUtils.transferTrimPointXtoSeqPointX(fArr, fArr2), fArr2).getAveCurveSpeed();
            C172946qY.LIZ("VEUtils", o.LJIILLIIL(Float.valueOf(aveCurveSpeed), "curve speed"));
            return aveCurveSpeed;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return 1.0f;
        }
    }

    public final String transGif2Png(String str) {
        Bitmap decodeFile;
        Context context = C172976qb.LIZJ;
        if (context == null) {
            return str;
        }
        C172946qY.LIZ("VEUtils", o.LJIILLIIL(str, "transGif2Png "));
        if (str != null) {
            C152275yJ.LIZ.getClass();
            if (C152275yJ.LJFF(context, str)) {
                byte[] bArr = new byte[12];
                try {
                } catch (Exception e) {
                    InterfaceC172956qZ interfaceC172956qZ = C172946qY.LIZ;
                    if (interfaceC172956qZ != null) {
                        interfaceC172956qZ.LIZ(e);
                    }
                }
                if (C152275yJ.LJI(str)) {
                    InputStream openInputStream = C16880lQ.LLLLL(context).getContentResolver().openInputStream(UriProtector.parse(str));
                    if (openInputStream != null) {
                        try {
                            openInputStream.read(bArr);
                            openInputStream.close();
                            AnonymousClass636.LJFF(openInputStream, null);
                        } finally {
                        }
                    }
                    bArr = null;
                } else if (C152275yJ.LJFF(context, str)) {
                    FileInputStream fileInputStream = new FileInputStream(str);
                    try {
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        AnonymousClass636.LJFF(fileInputStream, null);
                    } finally {
                    }
                } else {
                    bArr = null;
                }
                boolean z = false;
                if (bArr != null && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70) {
                    z = true;
                }
                if (z) {
                    File file = new File(str);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(file.getAbsolutePath());
                    LIZ.append(System.currentTimeMillis());
                    LIZ.append(".png");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    C172946qY.LIZ("VEUtils", o.LJIILLIIL(str, "decodeBitmap isUri "));
                    C152275yJ.LIZ.getClass();
                    if (C152275yJ.LJI(str)) {
                        InputStream openInputStream2 = C16880lQ.LLLLL(context).getContentResolver().openInputStream(UriProtector.parse(str));
                        if (openInputStream2 == null) {
                            decodeFile = null;
                        } else {
                            decodeFile = BitmapFactory.decodeStream(openInputStream2, null, options);
                        }
                    } else {
                        decodeFile = BitmapFactory.decodeFile(str, options);
                    }
                    if (decodeFile == null) {
                        return str;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(LIZIZ);
                    try {
                        decodeFile.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                        AnonymousClass636.LJFF(fileOutputStream, null);
                        if (C152275yJ.LJFF(context, LIZIZ)) {
                            return LIZIZ;
                        }
                        return str;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AnonymousClass636.LJFF(fileOutputStream, th);
                            throw th2;
                        }
                    }
                }
            }
        }
        return str;
    }
}
