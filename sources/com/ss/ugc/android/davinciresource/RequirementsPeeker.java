package com.ss.ugc.android.davinciresource;

import com.bef.effectsdk.RequirementResourceMapper;
import com.ss.ugc.android.davinciresource.jni.IRequirementsPeeker;
import com.ss.ugc.android.davinciresource.jni.VecString;
import java.util.Iterator;

/* loaded from: classes16.dex */
public final class RequirementsPeeker extends IRequirementsPeeker {
    @Override // com.ss.ugc.android.davinciresource.jni.IRequirementsPeeker
    public VecString peekRequirements(VecString vecString) {
        int i = 0;
        if (vecString == null || vecString.isEmpty()) {
            return new VecString();
        }
        String[] strArr = new String[vecString.size()];
        Iterator<String> it = vecString.iterator();
        while (it.hasNext()) {
            strArr[i] = it.next();
            i++;
        }
        return new VecString(RequirementResourceMapper.nativePeekResourcesNeededByRequirements(strArr));
    }
}
