package Y;

import X.C47069Idd;
import X.C47147Iet;
import X.C47837Iq1;
import X.C47843Iq7;
import X.C47902Ir4;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class IDHandlerS8S0000000_8 extends Handler {
    public final int $t;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS8S0000000_8(Looper looper, int i) {
        super(looper);
        this.$t = i;
    }

    public static final void handleMessage$0(IDHandlerS8S0000000_8 iDHandlerS8S0000000_8, Message message) {
        if (message == null) {
            return;
        }
        try {
            Object obj = message.obj;
            if (!(obj instanceof ArrayList)) {
                TTVideoEngineLog.d("DataLoaderHelper", "[preload] obj should instance of ArrayList");
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            if (arrayList == null) {
                TTVideoEngineLog.d("DataLoaderHelper", "[preload] obj should instance of ArrayList");
                return;
            }
            DataLoaderHelper dataLoaderHelper = (DataLoaderHelper) ListProtector.get(arrayList, 0);
            switch (message.what) {
                case 111:
                    if (arrayList.size() == 3) {
                        C47069Idd c47069Idd = (C47069Idd) ListProtector.get(arrayList, 1);
                        String str = (String) ListProtector.get(arrayList, 2);
                        if (dataLoaderHelper != null) {
                            dataLoaderHelper.LIZLLL(c47069Idd, str);
                            return;
                        }
                        return;
                    }
                    return;
                case 112:
                    if (arrayList.size() == 3) {
                        String str2 = (String) ListProtector.get(arrayList, 1);
                        String str3 = (String) ListProtector.get(arrayList, 2);
                        if (dataLoaderHelper != null) {
                            C47147Iet.LIZ.LJ().removeMedia(str2, str3);
                            return;
                        }
                        return;
                    }
                    return;
                case 113:
                    if (arrayList.size() == 3) {
                        String str4 = (String) ListProtector.get(arrayList, 1);
                        int intValue = ((Integer) ListProtector.get(arrayList, 2)).intValue();
                        if (dataLoaderHelper != null) {
                            C47147Iet.LIZ.LJ().removeAllMedia(str4, intValue);
                            return;
                        }
                        return;
                    }
                    return;
                case 114:
                    if (arrayList.size() == 3) {
                        String str5 = (String) ListProtector.get(arrayList, 1);
                        int intValue2 = ((Integer) ListProtector.get(arrayList, 2)).intValue();
                        if (dataLoaderHelper != null) {
                            C47147Iet.LIZ.LJ().focusMedia(str5, intValue2);
                            return;
                        }
                        return;
                    }
                    return;
                case 115:
                    if (arrayList.size() == 2) {
                        C47069Idd c47069Idd2 = (C47069Idd) ListProtector.get(arrayList, 1);
                        if (dataLoaderHelper != null) {
                            dataLoaderHelper.LJ(c47069Idd2);
                            return;
                        }
                        return;
                    }
                    return;
                case 116:
                    if (arrayList.size() == 2) {
                        String str6 = (String) ListProtector.get(arrayList, 1);
                        if (dataLoaderHelper != null) {
                            C47147Iet.LIZ.LJ().removePriorityTask(str6);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            TTVideoEngineLog.d(th);
        }
    }

    public static final void handleMessage$1(IDHandlerS8S0000000_8 iDHandlerS8S0000000_8, Message message) {
        C47843Iq7 c47843Iq7;
        try {
            Object obj = message.obj;
            if (!(obj instanceof ArrayList)) {
                TTVideoEngineLog.d("TTVideoEngine.Downloader", "[downloader] obj should instance of ArrayList");
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            C47837Iq1 c47837Iq1 = (C47837Iq1) ListProtector.get(arrayList, 0);
            int i = message.what;
            if (i == 10) {
                c47837Iq1.getClass();
                C47902Ir4 c47902Ir4 = new C47902Ir4(null, "TTVideoEngine_download_database_v01");
                c47837Iq1.LJI = c47902Ir4;
                if (!c47902Ir4.LJLJJI) {
                    return;
                }
                TTVideoEngineLog.d("TTVideoEngine.Downloader", "[downloader] open db success");
                c47837Iq1.LIZ();
                return;
            }
            if (i != 11 || arrayList.size() != 2 || (c47843Iq7 = (C47843Iq7) ListProtector.get(arrayList, 1)) == null) {
                return;
            }
            c47837Iq1.LJFF(c47843Iq7.LIZ, c47843Iq7.LIZIZ);
        } catch (Throwable th) {
            TTVideoEngineLog.d(th);
        }
    }
}
