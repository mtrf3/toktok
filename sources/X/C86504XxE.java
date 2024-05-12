package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.model.GetMessageListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.XxE, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86504XxE<T, R> implements InterfaceC48038ItG {
    public static final C86504XxE<T, R> LJLIL = new C86504XxE<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        Object LIZ;
        String str;
        GetMessageListResponse it = (GetMessageListResponse) obj;
        o.LJIIIZ(it, "it");
        try {
            List<InnerPushMessage> list = it.messages;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (InnerPushMessage innerPushMessage : list) {
                    if (innerPushMessage.getProtocol() > 2) {
                        arrayList.add(innerPushMessage);
                    }
                }
                if (!arrayList.isEmpty() && (str = it.LJLIL) != null && str.length() != 0) {
                    String str2 = it.LJLIL;
                    o.LJI(str2);
                    JSONArray optJSONArray = new JSONObject(str2).optJSONArray("messages");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                int optInt = optJSONObject.optInt("protocol");
                                long optLong = optJSONObject.optLong("id");
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        InnerPushMessage innerPushMessage2 = (InnerPushMessage) it2.next();
                                        if (optInt == innerPushMessage2.getProtocol() && optLong == innerPushMessage2.getId()) {
                                            C57419MgB.LIZIZ(innerPushMessage2, optJSONObject.optString("payload"));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C86478Xwo.LIZJ("InnerPushMessage", "applyPayload from resp error", m10exceptionOrNullimpl);
        }
        return it;
    }
}
