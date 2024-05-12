package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.27y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C534627y extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends AbstractC35601aW>> {
    public static final C534627y LJLIL = new C534627y();

    public C534627y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends AbstractC35601aW> invoke() {
        return C47261Igj.LJJIJIIJI(new AbstractC35601aW() { // from class: X.1pD
            public final C5H3 LIZ = C78996UzQ.LJJIJIIJI(C28Z.LJLIL);
            public final String LIZIZ = "user_info";

            @Override // X.InterfaceC18160nU
            public final String getName() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC18160nU
            public final Object LIZ(JSONArray args) {
                Object LIZ;
                String str;
                o.LJIIIZ(args, "args");
                try {
                    JSONObject jSONObject = new JSONObject();
                    InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
                    String str2 = CardStruct.IStatusCode.DEFAULT;
                    if (LIZIZ == null || (str = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId()).toString()) == null) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    JSONObject putOpt = jSONObject.putOpt("user_id", str);
                    Object value = this.LIZ.getValue();
                    o.LJIIIIZZ(value, "<get-hostApp>(...)");
                    String serverDeviceId = ((IHostAppContext) value).getServerDeviceId();
                    if (serverDeviceId != null) {
                        str2 = serverDeviceId;
                    }
                    LIZ = putOpt.putOpt("device_id", str2);
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                    new JSONObject();
                }
                return C3C5.m6boximpl(LIZ);
            }
        }, new AbstractC35601aW() { // from class: X.1p8
            public final C5H3 LIZ = C78996UzQ.LJJIJIIJI(C28Y.LJLIL);
            public final String LIZIZ = "ab_params";

            @Override // X.InterfaceC18160nU
            public final String getName() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC18160nU
            public final Object LIZ(JSONArray args) {
                Object LIZ;
                java.util.Map linkedHashMap;
                java.util.Map<String, Object> map;
                o.LJIIIZ(args, "args");
                try {
                    Object obj = args.get(0);
                    o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                    C2NN c2nn = (C2NN) ((java.util.Map) this.LIZ.getValue()).get((String) obj);
                    if (c2nn != null && (map = c2nn.LJLILLLLZI) != null) {
                        linkedHashMap = C113554cx.LJJLIL(map);
                    } else {
                        linkedHashMap = new LinkedHashMap();
                    }
                    LIZ = new JSONObject(linkedHashMap);
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                    new JSONObject();
                }
                return C3C5.m6boximpl(LIZ);
            }
        }, new AbstractC35601aW() { // from class: X.1p9
            public final String LIZ = "app_states";

            @Override // X.InterfaceC18160nU
            public final String getName() {
                return this.LIZ;
            }

            @Override // X.InterfaceC18160nU
            public final Object LIZ(JSONArray args) {
                o.LJIIIZ(args, "args");
                JSONObject putOpt = new JSONObject().putOpt("app_states", Integer.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppBackground() ? 1 : 0));
                o.LJIIIIZZ(putOpt, "JSONObject().putOpt(\"app… (isBackground) 1 else 0)");
                return putOpt;
            }
        }, new AbstractC35601aW() { // from class: X.1pA
            public final String LIZ = "current_room_info";
            public DataChannel LIZIZ;

            @Override // X.InterfaceC18160nU
            public final String getName() {
                return this.LIZ;
            }

            @Override // X.InterfaceC18160nU
            public final Object LIZ(JSONArray args) {
                long j;
                Object valueOf;
                String str;
                o.LJIIIZ(args, "args");
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                C28246B6s c28246B6s = (C28246B6s) dataChannelGlobal.mv0(C29049Baf.class);
                if (c28246B6s == null) {
                    return new JSONObject();
                }
                Room room = c28246B6s.LIZIZ;
                if (room == null) {
                    return new JSONObject();
                }
                JSONObject putOpt = new JSONObject().putOpt("room_id", Long.valueOf(room.getId()));
                String title = room.getTitle();
                String str2 = "";
                if (title == null) {
                    title = "";
                }
                JSONObject putOpt2 = putOpt.putOpt("title", title);
                BJL bjl = c28246B6s.LJFF;
                if (bjl != null && (str = bjl.LIZ) != null) {
                    str2 = str;
                }
                JSONObject putOpt3 = putOpt2.putOpt("enter_method", str2);
                Long l = c28246B6s.LIZJ;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                JSONObject putOpt4 = putOpt3.putOpt("anchor_id", Long.valueOf(j));
                DataChannel dataChannel = this.LIZIZ;
                if (dataChannel != null) {
                    valueOf = Boolean.valueOf(C29306Beo.LJIIJ(dataChannel));
                } else {
                    valueOf = Integer.valueOf(C29306Beo.LJIIJJI(dataChannelGlobal) ? 1 : 0);
                }
                JSONObject putOpt5 = putOpt4.putOpt("is_anchor", valueOf).putOpt("enter_room_ts", Long.valueOf(C37651dp.LIZ)).putOpt("is_watching", Integer.valueOf(C37651dp.LIZIZ)).putOpt("online_audience_number", Integer.valueOf(BM1.LIZJ));
                o.LJIIIIZZ(putOpt5, "JSONObject()\n           …lData.curRoomAudienceNum)");
                return putOpt5;
            }

            @Override // X.AbstractC35601aW
            public final void LIZJ(Fragment fragment) {
                o.LJIIIZ(fragment, "fragment");
                this.LIZIZ = null;
            }

            @Override // X.AbstractC35601aW
            public final void LIZIZ(Fragment fragment, DataChannel dataChannel) {
                o.LJIIIZ(fragment, "fragment");
                this.LIZIZ = dataChannel;
            }
        }, new AbstractC35601aW() { // from class: X.1pC
            public final String LIZ = "trigger_records";

            @Override // X.InterfaceC18160nU
            public final String getName() {
                return this.LIZ;
            }

            @Override // X.InterfaceC18160nU
            public final Object LIZ(JSONArray args) {
                AnonymousClass127 anonymousClass127;
                o.LJIIIZ(args, "args");
                try {
                    Object obj = args.get(0);
                    o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                    Object obj2 = args.get(1);
                    o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj2;
                    ConcurrentHashMap<String, AnonymousClass127> concurrentHashMap = AnonymousClass122.LJI.get((String) obj);
                    if (concurrentHashMap == null || (anonymousClass127 = concurrentHashMap.get(str)) == null) {
                        anonymousClass127 = new AnonymousClass127();
                    }
                    JSONObject putOpt = new JSONObject().putOpt("last_timestamp", Long.valueOf(anonymousClass127.LIZ)).putOpt("times", Integer.valueOf(anonymousClass127.LIZIZ));
                    o.LJIIIIZZ(putOpt, "JSONObject()\n           …pt(\"times\", triggerTimes)");
                    return putOpt;
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    return new JSONObject();
                }
            }
        }, new C44691pB());
    }
}
