package com.ss.android.ugc.effectmanager;

import X.C37692Eqm;
import X.ORY;
import X.ORZ;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AlgorithmUtils {
    public static final AlgorithmUtils INSTANCE = new AlgorithmUtils();

    private final Map<String, List<String>> convertMap(Map<String, ? extends Object> map) {
        if (CollectionUtil.isMapEmpty(map)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (CollectionUtil.isCollection(value)) {
                List<String> resultValueList = CollectionUtil.convertListObjToStr(CollectionUtil.convertObjectToList(value));
                if (!CollectionUtil.isListEmpty(resultValueList)) {
                    o.LJFF(resultValueList, "resultValueList");
                    hashMap.put(key, resultValueList);
                }
            }
        }
        return hashMap;
    }

    public static final Map<String, List<String>> getModelNamesOfEffect(Effect effect) {
        o.LJIIJ(effect, "effect");
        String modelNames = effect.getModelNames();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getModelNamesOfEffect->effectId = ");
        LIZ.append(effect.getEffectId());
        LIZ.append(", modelNames = ");
        LIZ.append(modelNames);
        EPLog.d("AlgorithmUtils", X1D.LIZIZ(LIZ));
        Map<String, List<String>> map = null;
        if (TextUtils.isEmpty(modelNames)) {
            return null;
        }
        try {
            map = INSTANCE.convertMap(JsonExtKt.toMap(new JSONObject(modelNames)));
            return map;
        } catch (Exception e) {
            EPLog.e("AlgorithmUtils", "getModelNamesOfEffect", e);
            return map;
        }
    }

    private final List<String> getRequirementsOfEffect(Effect effect) {
        return ORZ.LLJILJILJ(effect.getRequirements());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String[] getResourceNameArrayOfEffect(com.ss.android.ugc.effectmanager.effect.model.Effect r10) {
        /*
            java.lang.String r0 = "effect"
            kotlin.jvm.internal.o.LJIIJ(r10, r0)
            com.ss.android.ugc.effectmanager.AlgorithmUtils r0 = com.ss.android.ugc.effectmanager.AlgorithmUtils.INSTANCE
            java.util.List r8 = r0.getRequirementsOfEffect(r10)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getResourceNameArrayOfEffect::requirements, effect: "
            r1.append(r0)
            java.lang.String r0 = r10.getEffectId()
            r1.append(r0)
            java.lang.String r5 = ", name: "
            r1.append(r5)
            java.lang.String r0 = r10.getName()
            r1.append(r0)
            java.lang.String r0 = ", returned requirements: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r3 = "AlgorithmUtils"
            com.ss.android.ugc.effectmanager.common.logger.EPLog.d(r3, r0)
            java.util.Map r6 = getModelNamesOfEffect(r10)
            boolean r0 = com.ss.android.ugc.effectmanager.common.utils.CollectionUtil.isMapEmpty(r6)
            r7 = 0
            r4 = 0
            if (r0 != 0) goto L6a
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r8.iterator()
        L4d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc8
            java.lang.Object r1 = r2.next()
            if (r6 == 0) goto L63
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L4d
            r9.add(r1)
            goto L4d
        L63:
            kotlin.jvm.internal.o.LJIIZILJ()
            throw r4
        L67:
            r8.removeAll(r9)
        L6a:
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Ld4
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.Object[] r0 = r8.toArray(r0)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
            if (r0 == 0) goto Ldc
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.String[] r1 = com.bef.effectsdk.RequirementResourceMapper.nativePeekResourcesNeededByRequirements(r0)
            if (r1 == 0) goto L92
            java.util.List r1 = X.ORY.LJJIJIL(r1)
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.Object[] r1 = r1.toArray(r0)
            if (r1 == 0) goto Ld6
            java.lang.String[] r1 = (java.lang.String[]) r1
        L92:
            com.ss.android.ugc.effectmanager.AlgorithmUtils r0 = com.ss.android.ugc.effectmanager.AlgorithmUtils.INSTANCE
            java.lang.String[] r2 = r0.mergeRequirementsAndModelNames(r1, r6)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "fetchModels::effectId="
            r1.append(r0)
            java.lang.String r0 = r10.getEffectId()
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r10.getName()
            r1.append(r0)
            java.lang.String r0 = ", returned toDownloadRequirements: "
            r1.append(r0)
            if (r2 == 0) goto Lbd
            java.util.List r4 = X.ORY.LJJZZIII(r2)
        Lbd:
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            com.ss.android.ugc.effectmanager.common.logger.EPLog.d(r3, r0)
            return r2
        Lc8:
            boolean r0 = com.ss.android.ugc.effectmanager.common.utils.CollectionUtil.isListEmpty(r9)
            if (r0 != 0) goto L6a
            boolean r0 = kotlin.jvm.internal.o.LJ(r9, r8)
            if (r0 == 0) goto L67
        Ld4:
            r1 = r4
            goto L92
        Ld6:
            X.Eqm r0 = new X.Eqm
            r0.<init>(r2)
            throw r0
        Ldc:
            X.Eqm r0 = new X.Eqm
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.AlgorithmUtils.getResourceNameArrayOfEffect(com.ss.android.ugc.effectmanager.effect.model.Effect):java.lang.String[]");
    }

    private final String[] mergeRequirementsAndModelNames(String[] strArr, Map<String, ? extends List<String>> map) {
        if (CollectionUtil.isMapEmpty(map)) {
            return strArr;
        }
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, ? extends List<String>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList();
            if (strArr != null) {
                arrayList2.addAll(ORY.LJJZZIII(strArr));
            }
            arrayList2.addAll(arrayList);
            Object[] array = arrayList2.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
        }
        return null;
    }
}
