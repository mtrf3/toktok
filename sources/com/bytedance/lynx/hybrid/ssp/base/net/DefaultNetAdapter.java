package com.bytedance.lynx.hybrid.ssp.base.net;

import X.C76732zl;
import X.C77800Ug8;
import X.E8M;
import X.EJ6;
import X.InterfaceC195727mC;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class DefaultNetAdapter {
    public static final /* synthetic */ int LIZIZ = 0;
    public final ArrayList<EJ6> LIZ;

    /* loaded from: classes7.dex */
    public interface TTNetAdapterApi {
        @E8M
        InterfaceC37276Ek4<TypedInput> send(@InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC30951CCt boolean z, @InterfaceC195737mD Object obj, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list);
    }

    public DefaultNetAdapter() {
        ArrayList<EJ6> arrayList = new ArrayList<>();
        this.LIZ = arrayList;
        C77800Ug8.LJFF("Content-Type", "application/json", arrayList);
    }

    public static String LIZ(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[2048];
        new C76732zl();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }
}
