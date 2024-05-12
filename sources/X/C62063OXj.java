package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.share.improve.model.ShareH5Channel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.OXj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62063OXj {
    public static final /* synthetic */ int LIZ = 0;

    public static ArrayList LIZIZ(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        Object fromJson = GsonProtectorUtils.fromJson(C75792yF.LIZIZ(), jSONArray.toString(), new C62065OXl().getType());
        o.LJIIIIZZ(fromJson, "getGson().fromJson(share…areH5Channel>>() {}.type)");
        return (ArrayList) fromJson;
    }

    public static void LIZ(JSONArray jSONArray, C62394OeE c62394OeE) {
        C76800UCe c76800UCe;
        new C68322mC();
        new ArrayList();
        if (jSONArray != null) {
            ArrayList LIZIZ = LIZIZ(jSONArray);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LIZIZ, 10));
            Iterator it = LIZIZ.iterator();
            while (it.hasNext()) {
                arrayList.add(((ShareH5Channel) it.next()).getPlatformId());
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC62225ObV interfaceC62225ObV = C4LD.LIZIZ.LJJIII().get(it2.next());
                if (interfaceC62225ObV != null) {
                    C4LD.LIZIZ.LJJLIIIJLJLI(interfaceC62225ObV, c62394OeE);
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
                arrayList2.add(c76800UCe);
            }
        }
    }

    public static void LIZLLL(JSONArray jSONArray, C62394OeE c62394OeE) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            arrayList = LIZIZ(jSONArray);
        }
        if (!arrayList.isEmpty()) {
            c62394OeE.LJFF(new C62064OXk(arrayList));
        }
    }

    public static String LIZJ(boolean z, InterfaceC62225ObV channel, String desc) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(desc, "desc");
        String channelKey = channel.key();
        o.LJIIIZ(channelKey, "channelKey");
        if (!o.LJ(channelKey, "copy") || z) {
            return desc;
        }
        return "";
    }
}
