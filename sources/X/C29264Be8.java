package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Be8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29264Be8 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, String str, String containerId, boolean z) {
        String str2;
        String str3;
        int i;
        m mVar;
        String str4;
        User owner;
        String str5;
        Resources resources;
        Configuration configuration;
        User owner2;
        java.util.Set<Map.Entry> entrySet;
        o.LJIIIZ(containerId, "containerId");
        m mVar2 = new m();
        C65124PhA.LIZLLL().getClass();
        java.util.Map LIZIZ = C65124PhA.LIZIZ();
        if (LIZIZ != null && (entrySet = LIZIZ.entrySet()) != null) {
            for (Map.Entry entry : entrySet) {
                mVar2.LJJIIZ((String) entry.getKey(), (String) entry.getValue());
                String str6 = (String) entry.getKey();
                if (str6 != null) {
                    int hashCode = str6.hashCode();
                    if (hashCode != -102670958) {
                        if (hashCode != 96572) {
                            if (hashCode == 25209764 && str6.equals("device_id")) {
                                mVar2.LJJIIZ("deviceId", (String) entry.getValue());
                            }
                        } else if (str6.equals("aid")) {
                            mVar2.LJJIIZ("appId", (String) entry.getValue());
                        }
                    } else if (str6.equals("version_name")) {
                        mVar2.LJJIIZ("appVersion", (String) entry.getValue());
                    }
                }
            }
        }
        mVar2.LJJIIJ("screenWidth", Float.valueOf(C15380j0.LJIJ(C15380j0.LJIIL())));
        mVar2.LJJIIJ("screenHeight", Float.valueOf(C15380j0.LJIJ(C15380j0.LJIIJJI())));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room == null || (str2 = C17280m4.LIZ(room)) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        mVar2.LJJIIZ("room_id", str2);
        mVar2.LJJIIZ("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 == null || (owner2 = room2.getOwner()) == null || (str3 = C278817o.LIZIZ(owner2)) == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        mVar2.LJJIIZ("anchor_id", str3);
        mVar2.LJJIIJ("status_bar_height", Float.valueOf(C15380j0.LJIJ(C15450j7.LIZ(C15380j0.LIZLLL()))));
        mVar2.LJJIIZ("initTimestamp", String.valueOf(System.currentTimeMillis()));
        boolean z2 = true;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            i = 1;
        } else {
            i = 0;
        }
        mVar2.LJJIIJ("orientation", Integer.valueOf(i));
        if (str != null && str.length() != 0) {
            z2 = false;
        }
        if (z2) {
            mVar = null;
        } else {
            mVar = new m();
            try {
                android.net.Uri parse = UriProtector.parse(str);
                java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
                o.LJIIIIZZ(queryParameterNames, "this.queryParameterNames");
                for (String str7 : queryParameterNames) {
                    mVar.LJJIIZ(str7, UriProtector.getQueryParameter(parse, str7));
                    if (!mVar.LJJIJLIJ("room_id")) {
                        Room room3 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                        if (room3 == null || (str5 = Long.valueOf(room3.getId()).toString()) == null) {
                            str5 = CardStruct.IStatusCode.DEFAULT;
                        }
                        mVar.LJJIIZ("room_id", str5);
                    }
                    if (!mVar.LJJIJLIJ("user_id")) {
                        mVar.LJJIIZ("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                    }
                    if (!mVar.LJJIJLIJ("anchor_id")) {
                        Room room4 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                        if (room4 == null || (owner = room4.getOwner()) == null || (str4 = Long.valueOf(owner.getId()).toString()) == null) {
                            str4 = CardStruct.IStatusCode.DEFAULT;
                        }
                        mVar.LJJIIZ("anchor_id", str4);
                    }
                }
                C3C5.m7constructorimpl(parse);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        mVar2.LJJII("queryItems", mVar);
        mVar2.LJJIIZ("containerID", containerId);
        mVar2.LJJIIJ("offline", Integer.valueOf(z ? 1 : 0));
        String jVar = mVar2.toString();
        o.LJIIIIZZ(jVar, "JsonObject().apply {\n   …ine)\n        }.toString()");
        return jVar;
    }
}
