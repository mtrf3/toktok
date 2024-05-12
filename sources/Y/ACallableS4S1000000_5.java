package Y;

import X.C16880lQ;
import X.C31880CfE;
import X.C31883CfH;
import X.CN1;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ACallableS4S1000000_5 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS4S1000000_5 aCallableS4S1000000_5) {
        String str = aCallableS4S1000000_5.s0;
        IHostNetwork iHostNetwork = (IHostNetwork) CN1.LIZ(IHostNetwork.class);
        if (iHostNetwork != null) {
            return iHostNetwork.executeGet(str);
        }
        return "";
    }

    public static final Object call$1(ACallableS4S1000000_5 aCallableS4S1000000_5) {
        File[] listFiles;
        String str = aCallableS4S1000000_5.s0;
        File file = new File(str);
        JSONObject jSONObject = null;
        if (!file.exists() || file.isFile() || (listFiles = file.listFiles()) == null) {
            return null;
        }
        if (listFiles.length == 1) {
            try {
                C31880CfE.LJFF(listFiles[0].getPath(), str);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        HashMap<String, Bitmap> hashMap = new HashMap<>();
        String str2 = "";
        boolean z = false;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (file2.isDirectory()) {
                for (File file3 : file2.listFiles()) {
                    String name2 = file3.getName();
                    if (name2.contains(".png")) {
                        hashMap.put(name2, BitmapFactory.decodeFile(file3.getAbsolutePath()));
                    }
                }
            } else if (name.contains(".json") && !z) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    bufferedReader.close();
                    fileInputStream.close();
                    str2 = sb.toString();
                    jSONObject = new JSONObject(sb.toString());
                    z = true;
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        C31883CfH c31883CfH = new C31883CfH();
        c31883CfH.LIZ = str;
        c31883CfH.LIZIZ = jSONObject;
        c31883CfH.LIZJ = str2;
        c31883CfH.LIZLLL = hashMap;
        return c31883CfH;
    }

    public ACallableS4S1000000_5(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
