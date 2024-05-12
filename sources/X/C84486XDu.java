package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XDu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84486XDu extends XCZ {
    public final XCG LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    @Override // X.XCZ
    public final void LIZ() {
        String queryToValue;
        InterfaceC84458XCs interfaceC84458XCs;
        if (C107244Iu.LIZIZ(this.LJII)) {
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(10007), 40), 64));
            return;
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse(null, null, null, null, null, null, null, null, null, 511, null);
        InterfaceC84458XCs interfaceC84458XCs2 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJI.LJJIFFI);
        if (interfaceC84458XCs2 != null && (queryToValue = interfaceC84458XCs2.queryToValue(XDN.LJIIIIZZ(this.LJI.LJFF, this.LJII))) != null) {
            try {
                G0J g0j = this.LJI.LJIJ;
                if (g0j != null) {
                    EffectChannelModel effectChannelModel = (EffectChannelModel) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(queryToValue, EffectChannelModel.class);
                    if (effectChannelModel != null && effectChannelModel.checkValued()) {
                        List<Effect> effect_list = effectChannelModel.getEffect_list();
                        ArrayList arrayList = new ArrayList();
                        if (effect_list != null && (interfaceC84458XCs = (InterfaceC84458XCs) this.LJI.LJJIFFI.LIZ) != null) {
                            for (Effect effect : effect_list) {
                                if (interfaceC84458XCs.has(effect.getId())) {
                                    arrayList.add(effect);
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new EffectChannelResponse(this.LJII, null, null, null, null, null, null, null, null, 510, null), 44), 64));
                            return;
                        }
                        effectChannelResponse.setAll_category_effects(arrayList);
                        List<EffectCategoryModel> category_list = effectChannelModel.getCategory_list();
                        ArrayList arrayList2 = new ArrayList();
                        for (EffectCategoryModel effectCategoryModel : category_list) {
                            if (effectCategoryModel.checkValued()) {
                                String id = effectCategoryModel.getId();
                                String name = effectCategoryModel.getName();
                                String key = effectCategoryModel.getKey();
                                List<String> effects = effectCategoryModel.getEffects();
                                ArrayList arrayList3 = new ArrayList();
                                if (effects != null) {
                                    for (String str : effects) {
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            Effect effect2 = (Effect) it.next();
                                            if (o.LJ(str, effect2.getEffect_id())) {
                                                arrayList3.add(effect2);
                                            }
                                        }
                                    }
                                }
                                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(id, name, key, null, null, null, null, arrayList3, effectCategoryModel.getTags(), effectCategoryModel.getTags_updated_at(), null, false, null, 7288, null);
                                effectCategoryResponse.setCollection_effect(effectChannelModel.getCollection_list());
                                effectCategoryResponse.set_default(effectCategoryModel.is_default());
                                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                                arrayList2.add(effectCategoryResponse);
                            }
                        }
                        effectChannelResponse.setCategory_responses(arrayList2);
                        effectChannelResponse.setPanel(this.LJII);
                        effectChannelResponse.setPanel_model(effectChannelModel.getPanel_model());
                        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, effectChannelResponse, 44), 64));
                        return;
                    }
                }
            } catch (Exception e) {
                C71313Ryn.LIZJ("Json Parse Exception: ", e, C12310e3.LIZIZ, "FetchDownloadedEffectListTask", null);
            }
        }
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(10004), 40), 64));
    }

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 713), 64));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84486XDu(XCG effectConfig, String str, String taskFlag) {
        super(taskFlag, null);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJI = effectConfig;
        this.LJII = str;
        this.LJIIIIZZ = taskFlag;
    }
}
