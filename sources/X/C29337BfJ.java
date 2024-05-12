package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.BfJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29337BfJ implements InterfaceC38012Evw {
    public final WeakReference<Context> LJLIL;
    public final WeakReference<InterfaceC29343BfP> LJLILLLLZI;

    public C29337BfJ(WeakReference<Context> weakReference, InterfaceC29343BfP interfaceC29343BfP) {
        this.LJLIL = weakReference;
        this.LJLILLLLZI = new WeakReference<>(interfaceC29343BfP);
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        Context context;
        C29336BfI shareInfo;
        String str;
        JSONObject jSONObject2 = c38048EwW.LIZLLL;
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.optString("title");
        jSONObject2.optString("desc");
        jSONObject2.optString("image");
        jSONObject2.optString("url");
        String optString = jSONObject2.optString("platform");
        String optString2 = jSONObject2.optString("type");
        WeakReference<Context> weakReference = this.LJLIL;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
        }
        if (C38354F3m.LJ(optString) || context == null) {
            return;
        }
        int i = 0;
        if ("live_room".equals(optString2)) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("url_extra");
            HashMap hashMap = new HashMap();
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = optJSONObject.get(next);
                    if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                        hashMap.put(next, String.valueOf(obj));
                    }
                }
            }
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null && room.getShareUrl() != null) {
                Uri.Builder buildUpon = UriProtector.parse(room.getShareUrl()).buildUpon();
                for (Map.Entry entry : hashMap.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                BNI un0 = ((IShareService) CN1.LIZ(IShareService.class)).un0();
                ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
                C29929Bor c29929Bor = new C29929Bor(room);
                c29929Bor.LIZ = optString;
                c29929Bor.LJIJJLI = hashMap;
                c29929Bor.LJIIJ = buildUpon.toString();
                C29338BfK c29338BfK = (C29338BfK) un0;
                c29338BfK.LIZ.share(LIZIZ, new C29930Bos(c29929Bor), c29338BfK.LIZJ);
                c29338BfK.LIZIZ = new C73521StJ<>();
                jSONObject.put("code", 1);
                return;
            }
            jSONObject.put("code", 0);
            return;
        }
        if ("open_platform".equals(optString2)) {
            BNI un02 = ((IShareService) CN1.LIZ(IShareService.class)).un0();
            ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(context);
            C29929Bor c29929Bor2 = new C29929Bor();
            c29929Bor2.LIZ = optString;
            C29338BfK c29338BfK2 = (C29338BfK) un02;
            c29338BfK2.LIZ.share(LIZIZ2, new C29930Bos(c29929Bor2), c29338BfK2.LIZJ);
            c29338BfK2.LIZIZ = new C73521StJ<>();
            jSONObject.put("code", 1);
            return;
        }
        if (this.LJLILLLLZI.get() != null && (shareInfo = this.LJLILLLLZI.get().getShareInfo()) != null && (str = shareInfo.LIZLLL) != null) {
            Uri.Builder buildUpon2 = UriProtector.parse(str).buildUpon();
            buildUpon2.appendQueryParameter("share_ht_uid", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            BNI un03 = ((IShareService) CN1.LIZ(IShareService.class)).un0();
            ActivityC45651qj LIZIZ3 = C29306Beo.LIZIZ(context);
            C29929Bor c29929Bor3 = new C29929Bor();
            c29929Bor3.LIZ = optString;
            c29929Bor3.LJIIJJI = shareInfo.LIZ;
            c29929Bor3.LJIIL = shareInfo.LIZIZ;
            c29929Bor3.LJIILIIL = shareInfo.LIZJ;
            c29929Bor3.LJIIJ = buildUpon2.toString();
            C29338BfK c29338BfK3 = (C29338BfK) un03;
            c29338BfK3.LIZ.share(LIZIZ3, new C29930Bos(c29929Bor3), c29338BfK3.LIZJ);
            c29338BfK3.LIZIZ = new C73521StJ<>();
            i = 1;
        }
        jSONObject.put("code", i);
    }
}
