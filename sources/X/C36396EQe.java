package X;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.featureflags.TiktokAvatarLokiConfig;
import com.ss.android.ugc.gamora.recorder.navi.model.ResolveEffectsResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ResolvedEffect;
import com.ss.android.ugc.gamora.recorder.navi.service.NaviVideoCreationService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS106S0300000_2;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.EQe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36396EQe implements MessageCenter.Listener {
    public static final String LJLJJLL = TiktokAvatarLokiConfig.LIZ().lokiPanelName;
    public static final OSJ<Integer, Integer, Integer> LJLJL = new OSJ<>(8194, 0, 0);
    public static final OSJ<Integer, Long, Long> LJLJLJ = new OSJ<>(66668, 1L, 0L);
    public final InterfaceC84497XEf LJLIL;
    public final C5ZR LJLILLLLZI;
    public final InterfaceC36458ESo LJLJI;
    public final NaviVideoCreationService LJLJJI;
    public C73318Sq2 LJLJJL;

    public C36396EQe(InterfaceC84497XEf effectPlatform, C5ZR c5zr, C36400EQi c36400EQi) {
        NaviVideoCreationService.LIZ.getClass();
        NaviVideoCreationService service = C36393EQb.LIZ();
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(service, "service");
        this.LJLIL = effectPlatform;
        this.LJLILLLLZI = c5zr;
        this.LJLJI = c36400EQi;
        this.LJLJJI = service;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        OSJ<Integer, Integer, Integer> osj = LJLJL;
        if (i == osj.getFirst().intValue() && i2 == osj.getSecond().intValue() && i3 == osj.getThird().intValue() && str != null) {
            H78.LIZIZ("JEFF", "Download message received");
            final ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    String string = JSONArrayProtectorUtils.getString(jSONArray, i4);
                    o.LJIIIIZZ(string, "jsonArray.getString(i)");
                    arrayList.add(string);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Parsed paths ");
                LIZ.append(arrayList);
                H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
                C73318Sq2 c73318Sq2 = this.LJLJJL;
                if (c73318Sq2 != null) {
                    NaviVideoCreationService naviVideoCreationService = this.LJLJJI;
                    String str2 = LJLJJLL;
                    String json = GsonProtectorUtils.toJson(new Gson(), arrayList);
                    o.LJIIIIZZ(json, "Gson().toJson(effectPathList)");
                    c73318Sq2.LIZ(naviVideoCreationService.resolveEffects(str2, json).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.5ZP
                        @Override // X.InterfaceC64592gB
                        public final void accept(Object obj) {
                            String str3;
                            ResolveEffectsResponse resolveEffectsResponse = (ResolveEffectsResponse) obj;
                            List<ResolvedEffect> list = resolveEffectsResponse.resolvedEffects;
                            if (list == null || list.isEmpty()) {
                                return;
                            }
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Resolved effects ");
                            LIZ2.append(resolveEffectsResponse.resolvedEffects);
                            H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ2));
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (ResolvedEffect resolvedEffect : resolveEffectsResponse.resolvedEffects) {
                                String str4 = resolvedEffect.effectId;
                                if (str4 != null && (str3 = resolvedEffect.path) != null) {
                                    o.LJI(str4);
                                    linkedHashMap.put(str3, str4);
                                }
                            }
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("Effects to download ");
                            LIZ3.append(linkedHashMap.values());
                            H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ3));
                            C36396EQe c36396EQe = C36396EQe.this;
                            List LLJI = ORZ.LLJI(linkedHashMap.values());
                            final AqS106S0300000_2 aqS106S0300000_2 = new AqS106S0300000_2((List) arrayList, (List<String>) C36396EQe.this, (C36396EQe) linkedHashMap, (java.util.Map<String, String>) 14);
                            c36396EQe.LJLIL.LJ(LLJI, true, null, new IFetchEffectListListener() { // from class: X.5ZQ
                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                                public final void onFail(ExceptionResult e) {
                                    o.LJIIIZ(e, "e");
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(List<Effect> list2) {
                                    if (list2 != null) {
                                        aqS106S0300000_2.invoke(list2);
                                    }
                                }
                            });
                        }
                    }, C36397EQf.LJLIL));
                }
            } catch (JSONException e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Parse exception, ");
                LIZ2.append(e);
                H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ2));
            }
        }
    }
}
