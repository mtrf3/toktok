package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C50321Joz;
import X.C50345JpN;
import X.C50410JqQ;
import X.C50651JuJ;
import X.C50652JuK;
import X.C84763XOl;
import X.EnumC38014Evy;
import X.F2Y;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.K3L;
import X.VNS;
import Y.IDLCallbackS107S0200000_9;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenEffectRecordMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public EnumC38014Evy LJLILLLLZI;
    public final C50345JpN LJLJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenEffectRecordMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "open_effect_record";
        this.LJLILLLLZI = EnumC38014Evy.PRIVATE;
        this.LJLJI = new C50345JpN(contextProviderFactory, "open_effect_record");
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLILLLLZI = enumC38014Evy;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        String optString;
        String optString2;
        VNS vns;
        String str;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (!this.LJLJI.LIZ(params, iReturn) && params.has("prop_id")) {
            String optString3 = params.optString("prop_id");
            try {
                optString = params.optString("enter_from");
                optString2 = params.optString("enter_method");
            } catch (Exception e) {
                e = e;
            }
            try {
                String shootEntrance = params.optString("shoot_entrance");
                String optString4 = params.optString("shoot_way");
                String optString5 = params.optString("search_result_id");
                String optString6 = params.optString("search_keyword");
                String optString7 = params.optString("search_enter_position");
                String optString8 = params.optString("enter_position");
                String optString9 = params.optString("search_type");
                String optString10 = params.optString("list_item_id");
                HashMap<String, String> hashMap = new HashMap<>();
                Iterator<String> keys = params.keys();
                o.LJIIIIZZ(keys, "params.keys()");
                while (keys.hasNext()) {
                    String key = keys.next();
                    o.LJIIIIZZ(key, "key");
                    String optString11 = params.optString(key);
                    o.LJIIIIZZ(optString11, "params.optString(key)");
                    hashMap.put(key, optString11);
                }
                String uuid = UUID.randomUUID().toString();
                o.LJIIIIZZ(uuid, "randomUUID().toString()");
                RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.sticker(optString3);
                builder.creationId(uuid);
                builder.enterFrom("search_result");
                builder.shootWay(optString4);
                builder.extraLogParams(hashMap);
                HashMap<String, String> hashMap2 = K3L.LJIIJJI;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ != null) {
                    IExternalService LIZ = AVExternalServiceImpl.LIZ();
                    o.LJIIIIZZ(shootEntrance, "shootEntrance");
                    LIZ.asyncService(LJIIIIZZ, shootEntrance, new IDLCallbackS107S0200000_9(LJIIIIZZ, builder, 2));
                }
                F2Y LIZ2 = this.contextProviderFactory.LIZ(VNS.class);
                if (LIZ2 != null) {
                    vns = (VNS) LIZ2.LIZIZ();
                } else {
                    vns = null;
                }
                C50652JuK.Companion.getClass();
                C50321Joz LIZLLL = C50651JuJ.LIZLLL(vns);
                if (LIZLLL != null) {
                    str = LIZLLL.getSearchId();
                } else {
                    str = null;
                }
                C50410JqQ c50410JqQ = new C50410JqQ();
                c50410JqQ.LJIIZILJ("enter_method", optString2);
                c50410JqQ.LJIJI(optString);
                c50410JqQ.LJIIZILJ("shoot_way", optString4);
                c50410JqQ.LJIIZILJ("shoot_entrance", shootEntrance);
                c50410JqQ.LJIIZILJ("prop_id", optString3);
                c50410JqQ.LJIIZILJ("creation_id", uuid);
                c50410JqQ.LJIIZILJ("search_id", str);
                c50410JqQ.LJIJ("search_result_id", optString5);
                c50410JqQ.LJIIZILJ("search_keyword", optString6);
                if (!ujb.o.LJJJJJL(optString7)) {
                    optString8 = optString7;
                }
                c50410JqQ.LJIIZILJ("search_enter_position", optString8);
                c50410JqQ.LJIIZILJ("list_item_id", optString10);
                c50410JqQ.LJIIZILJ("search_type", optString9);
                c50410JqQ.LJIILIIL();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                iReturn.LIZIZ(jSONObject);
            } catch (Exception e2) {
                e = e2;
                iReturn.LIZ(0, e.getMessage());
            }
        }
    }
}
