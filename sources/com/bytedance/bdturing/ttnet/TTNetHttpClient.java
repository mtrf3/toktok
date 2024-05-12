package com.bytedance.bdturing.ttnet;

import X.C03660Ck;
import X.C38091ExD;
import X.C64797Pbt;
import X.C64859Pct;
import X.C65083PgV;
import X.C65230Pis;
import X.C78923UyF;
import X.InterfaceC65229Pir;
import X.OIP;
import android.content.Context;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes12.dex */
public class TTNetHttpClient implements InterfaceC65229Pir {
    public Context context;

    public TTNetHttpClient(Context context) {
        this.context = context;
        if (OIP.LIZ.LIZ.LJIJI) {
            C65083PgV.LIZIZ(new C38091ExD(C03660Ck.LIZJ("x-vc-bdturing-sdk-version", "2.3.3.i18n")));
        }
    }

    @Override // X.InterfaceC65229Pir
    public byte[] get(String str, Map<String, String> map) {
        C78923UyF.LIZJ(this.context, str, map);
        try {
            C64797Pbt<TypedInput> execute = ((INetworkApi) C65083PgV.LJIIL(str).LIZ(INetworkApi.class)).doGet(true, str, null, C64859Pct.LIZIZ(map)).execute();
            if (execute.LIZ.LIZIZ == 200) {
                InputStream in = execute.LIZIZ.in();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = in.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        return byteArrayOutputStream.toByteArray();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return new byte[0];
    }

    @Override // X.InterfaceC65229Pir
    public byte[] post(String str, Map<String, String> map, byte[] bArr) {
        C78923UyF.LIZJ(this.context, str, map);
        try {
            C64797Pbt<TypedInput> execute = ((INetworkApi) C65083PgV.LJIIL(str).LIZ(INetworkApi.class)).doPost(str, null, new C65230Pis(bArr), C64859Pct.LIZIZ(map)).execute();
            if (execute.LIZ.LIZIZ == 200) {
                InputStream in = execute.LIZIZ.in();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = in.read(bArr2);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } else {
                        return byteArrayOutputStream.toByteArray();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return new byte[0];
    }
}
