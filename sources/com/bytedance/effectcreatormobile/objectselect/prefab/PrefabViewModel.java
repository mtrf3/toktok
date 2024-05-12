package com.bytedance.effectcreatormobile.objectselect.prefab;

import X.C113554cx;
import X.C141335gf;
import X.C3C4;
import X.C3C5;
import X.C78555UsJ;
import X.C79853Bl;
import X.C79863Bm;
import X.C79883Bo;
import X.C93670aUc;
import X.C93825aX7;
import X.C93829aXB;
import X.C93977aZZ;
import X.C94059aat;
import X.C94060aau;
import X.C94096abU;
import X.C94185acv;
import X.C94832anM;
import X.C94833anN;
import X.InterfaceC67352kd;
import X.OSZ;
import X.V1M;
import X.V8H;
import X.XKQ;
import X.XKS;
import X.XKX;
import X.XLL;
import X.XLM;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.api.IEffectDataResProvider;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import com.bytedance.ies.effectcreator.swig.Model;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class PrefabViewModel extends ViewModel {
    public final XLM LJLIL;
    public final C79863Bm LJLILLLLZI;
    public final XLM LJLJI;
    public final C79863Bm LJLJJI;
    public final XLL LJLJJL;
    public final C79883Bo LJLJJLL;
    public final XLL LJLJL;
    public final C79883Bo LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public XKQ LJLLI;
    public final PrefabData LJLLILLLL;
    public Long LJLLJ;
    public Feature LJLLL;
    public final boolean LJLLLL;
    public boolean LJLLLLLL;

    public final boolean gv0() {
        Model workingModel;
        FeatureManager featureManager;
        if (!this.LJLLLLLL) {
            return false;
        }
        Feature feature = this.LJLLL;
        if (feature != null) {
            feature.clearParameterMap();
        }
        if (this.LJLLLL) {
            Feature feature2 = this.LJLLL;
            if (feature2 != null) {
                feature2.recoverRecordedFeature();
            }
            C93829aXB LJI = CKEffectEditorContext.LJI();
            if (LJI != null && (workingModel = LJI.LIZJ.getWorkingModel()) != null && (featureManager = workingModel.featureManager()) != null) {
                featureManager.refreshWholeList();
                return true;
            }
            return true;
        }
        Feature feature3 = this.LJLLL;
        if (feature3 == null) {
            return true;
        }
        CKEffectEditorContext.LJIILIIL(feature3);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean iv0() {
        LinkedHashMap linkedHashMap;
        List list;
        AssetsLibData.AssetsItemData assetsItemData;
        String str;
        Feature feature;
        if (this.LJLLLLLL) {
            C94185acv c94185acv = (C94185acv) this.LJLJI.getValue();
            if (c94185acv.LJLILLLLZI < 0 || c94185acv.LJLJI == 2) {
                Feature feature2 = this.LJLLL;
                if (feature2 != null) {
                    feature2.clearParameterMap();
                }
                if (((C94185acv) this.LJLJI.getValue()).LJLILLLLZI < 0) {
                    Feature feature3 = this.LJLLL;
                    if (feature3 != null) {
                        CKEffectEditorContext.LJIILIIL(feature3);
                    }
                } else {
                    String str2 = ((C94185acv) this.LJLJI.getValue()).LJLIL;
                    int i = ((C94185acv) this.LJLJI.getValue()).LJLILLLLZI;
                    Object value = this.LJLILLLLZI.getValue();
                    if (!(value instanceof C94060aau)) {
                        value = null;
                    }
                    C94060aau c94060aau = (C94060aau) value;
                    if (c94060aau != null && (linkedHashMap = (LinkedHashMap) c94060aau.LIZIZ) != null && (list = (List) linkedHashMap.get(str2)) != null && (assetsItemData = (AssetsLibData.AssetsItemData) ListProtector.get(list, i)) != null && (str = assetsItemData.name) != null && (feature = this.LJLLL) != null) {
                        feature.setDisplayName(str);
                    }
                    Feature feature4 = this.LJLLL;
                    if (feature4 != null) {
                        CKEffectEditorContext.LJIILJJIL(Long.valueOf(C93825aX7.LIZ(feature4)));
                    }
                }
                return true;
            }
        }
        return false;
    }

    public PrefabViewModel(PrefabData prefabData) {
        XLM LIZ = V8H.LIZ(new C94059aat(null));
        this.LJLIL = LIZ;
        this.LJLILLLLZI = V1M.LIZLLL(LIZ);
        XLM LIZ2 = V8H.LIZ(new C94185acv(0));
        this.LJLJI = LIZ2;
        this.LJLJJI = V1M.LIZLLL(LIZ2);
        XLL LIZ3 = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLJJL = LIZ3;
        this.LJLJJLL = new C79883Bo(LIZ3);
        XLL LIZ4 = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLJL = LIZ4;
        this.LJLJLJ = new C79883Bo(LIZ4);
        this.LJLJLLL = true;
        this.LJLL = true;
        this.LJLLILLLL = prefabData;
        this.LJLLLL = false;
    }

    public final void lv0(AssetsLibData.AssetsItemData assetsItemData) {
        String str;
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ("is_ame_data", "1");
            oszArr[1] = new OSZ("asset_id", assetsItemData.effectId);
            Feature feature = this.LJLLL;
            if (feature != null) {
                str = C93825aX7.LJFF(feature);
            } else {
                str = "";
            }
            oszArr[2] = new OSZ("feature_id", str);
            oszArr[3] = new OSZ("category_key", assetsItemData.category);
            LIZ.onEvent("general_effect_click", C113554cx.LJJL(oszArr));
        }
    }

    public PrefabViewModel(long j, boolean z) {
        XLM LIZ = V8H.LIZ(new C94059aat(null));
        this.LJLIL = LIZ;
        this.LJLILLLLZI = V1M.LIZLLL(LIZ);
        XLM LIZ2 = V8H.LIZ(new C94185acv(0));
        this.LJLJI = LIZ2;
        this.LJLJJI = V1M.LIZLLL(LIZ2);
        XLL LIZ3 = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLJJL = LIZ3;
        this.LJLJJLL = new C79883Bo(LIZ3);
        XLL LIZ4 = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLJL = LIZ4;
        this.LJLJLJ = new C79883Bo(LIZ4);
        this.LJLJLLL = true;
        this.LJLL = true;
        this.LJLLJ = Long.valueOf(j);
        this.LJLLLL = !z;
    }

    public static Object jv0(String str, InterfaceC67352kd interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        IEffectDataResProvider LIZ = C93977aZZ.LIZ();
        if (LIZ != null) {
            LIZ.downloadRes(str, new C94096abU(xks));
        } else {
            C3C4 LIZ2 = C141335gf.LIZ(new Exception());
            C3C5.m7constructorimpl(LIZ2);
            xks.resumeWith(LIZ2);
        }
        return xks.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData r13, X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C94543aih
            if (r0 == 0) goto Lcb
            r4 = r14
            X.aih r4 = (X.C94543aih) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lcb
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r5 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L75
            if (r0 != r2) goto Ld2
            java.lang.Object r4 = r4.LJLJJI
            com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel r4 = (com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel) r4
            X.C141335gf.LIZJ(r5)
        L25:
            java.lang.Number r5 = (java.lang.Number) r5
            long r2 = r5.longValue()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            r4.LJLLJ = r0
            X.aXB r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJIILL
            if (r0 == 0) goto L3a
            com.bytedance.ies.effectcreator.swig.Feature r1 = r0.LJFF(r2)
        L3a:
            r4.LJLLL = r1
            if (r1 == 0) goto L64
            X.aX5 r3 = X.EnumC93823aX5.ResourcePackage
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.aXB r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJI()
            if (r0 == 0) goto L57
            com.bytedance.ies.effectcreator.swig.UIAnnotationAssetTexture r0 = X.C93829aXB.LIZLLL(r1)
            if (r0 == 0) goto L57
            com.bytedance.ies.effectcreator.swig.AssetImageTexture r2 = r0.getAssetTexture()
            if (r2 != 0) goto L67
        L57:
            int r0 = r3.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "feature_asset_type"
            r1.setExtraInfo(r0, r2)
        L64:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L67:
            int r0 = r3.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "asset_image_texture_type"
            r2.setExtraInfo(r0, r1)
            goto L64
        L75:
            X.C141335gf.LIZJ(r5)
            com.bytedance.ies.effectcreator.swig.FeatureType[] r9 = com.bytedance.ies.effectcreator.swig.FeatureType.values()
            int r8 = r9.length
            r7 = 0
        L7e:
            if (r7 >= r8) goto Lc5
            r6 = r9[r7]
            java.lang.String r5 = r6.name()
            java.lang.String r0 = r13.featureType
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc2
        L96:
            int r9 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJIIJ(r6)
            java.lang.String r7 = r13.typeName
            java.lang.String r6 = r13.effectFilePath
            java.lang.String r11 = r13.effectId
            java.lang.String r10 = r13.capabilites
            r4.LJLJJI = r12
            r4.LJLILLLLZI = r2
            X.XKS r5 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r4)
            r5.<init>(r2, r0)
            r5.LJIIL()
            X.aka r4 = new X.aka
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LIZLLL(r4)
            java.lang.Object r5 = r5.LJIIJJI()
            if (r5 != r3) goto Lc8
            return r3
        Lc2:
            int r7 = r7 + 1
            goto L7e
        Lc5:
            com.bytedance.ies.effectcreator.swig.FeatureType r6 = com.bytedance.ies.effectcreator.swig.FeatureType.FeatureType_Unknown
            goto L96
        Lc8:
            r4 = r12
            goto L25
        Lcb:
            X.aih r4 = new X.aih
            r4.<init>(r12, r14)
            goto L12
        Ld2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel.hv0(com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(boolean r9, X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C94544aii
            if (r0 == 0) goto L8d
            r7 = r10
            X.aii r7 = (X.C94544aii) r7
            int r2 = r7.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r7.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 == r4) goto L58
            if (r0 != r5) goto L93
            java.lang.Object r3 = r7.LJLJJI
            com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel r3 = (com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel) r3
            X.C141335gf.LIZJ(r1)
        L27:
            r3.LJLLLLLL = r4
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2c:
            X.C141335gf.LIZJ(r1)
            r0 = 0
            r8.LJLLLLLL = r0
            r7.LJLJJI = r8
            r7.LJLJJL = r9
            r7.LJLILLLLZI = r4
            X.XKS r2 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r7)
            r2.<init>(r4, r0)
            r2.LJIIL()
            kotlin.jvm.internal.IDqS423S0100000_42 r1 = new kotlin.jvm.internal.IDqS423S0100000_42
            r0 = 117(0x75, float:1.64E-43)
            r1.<init>(r2, r0)
            com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LIZLLL(r1)
            java.lang.Object r0 = r2.LJIIJJI()
            if (r0 != r6) goto L56
            return r6
        L56:
            r3 = r8
            goto L61
        L58:
            boolean r9 = r7.LJLJJL
            java.lang.Object r3 = r7.LJLJJI
            com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel r3 = (com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel) r3
            X.C141335gf.LIZJ(r1)
        L61:
            java.lang.Long r0 = r3.LJLLJ
            if (r0 != 0) goto L75
            com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData r0 = r3.LJLLILLLL
            kotlin.jvm.internal.o.LJI(r0)
            r7.LJLJJI = r3
            r7.LJLILLLLZI = r5
            java.lang.Object r0 = r3.hv0(r0, r7)
            if (r0 != r6) goto L27
            return r6
        L75:
            X.aXB r2 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJIILL
            if (r2 == 0) goto L8b
            long r0 = r0.longValue()
            com.bytedance.ies.effectcreator.swig.Feature r0 = r2.LJFF(r0)
        L81:
            r3.LJLLL = r0
            if (r9 == 0) goto L27
            if (r0 == 0) goto L27
            r0.recordFeature()
            goto L27
        L8b:
            r0 = 0
            goto L81
        L8d:
            X.aii r7 = new X.aii
            r7.<init>(r8, r10)
            goto L12
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel.kv0(boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mv0(int i, String category, boolean z) {
        LinkedHashMap linkedHashMap;
        List list;
        AssetsLibData.AssetsItemData assetsItemData;
        boolean z2;
        String str;
        o.LJIIIZ(category, "category");
        Object value = this.LJLILLLLZI.getValue();
        if (!(value instanceof C94060aau)) {
            value = null;
        }
        C94060aau c94060aau = (C94060aau) value;
        if (c94060aau != null && (linkedHashMap = (LinkedHashMap) c94060aau.LIZIZ) != null && (list = (List) linkedHashMap.get(category)) != null && (assetsItemData = (AssetsLibData.AssetsItemData) ListProtector.get(list, i)) != null) {
            if (o.LJ(((C94185acv) this.LJLJI.getValue()).LJLIL, category) && ((C94185acv) this.LJLJI.getValue()).LJLILLLLZI == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i2 = ((C94185acv) this.LJLJI.getValue()).LJLJI;
                if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.LJLLI = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C94832anM(this, category, i, assetsItemData.effectId, assetsItemData.capabilities, null), 3);
                    lv0(assetsItemData);
                    return;
                }
                if (!((C94185acv) this.LJLJI.getValue()).LJLJJI || !z) {
                    return;
                }
                StatisticReporter LIZ = C93670aUc.LIZ();
                if (LIZ != null) {
                    OSZ[] oszArr = new OSZ[4];
                    oszArr[0] = new OSZ("is_ame_data", "1");
                    oszArr[1] = new OSZ("asset_id", assetsItemData.effectId);
                    Feature feature = this.LJLLL;
                    if (feature != null) {
                        str = C93825aX7.LJFF(feature);
                    } else {
                        str = "";
                    }
                    oszArr[2] = new OSZ("feature_id", str);
                    oszArr[3] = new OSZ("category_key", assetsItemData.category);
                    LIZ.onEvent("general_effect_edit_click", C113554cx.LJJL(oszArr));
                }
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C94833anN(this, assetsItemData, null), 3);
                return;
            }
            if (z) {
                lv0(assetsItemData);
            }
            XKQ xkq = this.LJLLI;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            this.LJLLI = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C94832anM(this, category, i, assetsItemData.effectId, assetsItemData.capabilities, null), 3);
        }
    }
}
