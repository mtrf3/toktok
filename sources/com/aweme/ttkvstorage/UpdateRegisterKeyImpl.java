package com.aweme.ttkvstorage;

import X.C1OX;
import X.C25180yo;
import X.EnumC10900bm;
import com.bytedance.ies.ugc.ttkvstorageapi.IUpdateKVRegisterKey;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class UpdateRegisterKeyImpl implements IUpdateKVRegisterKey {
    @Override // com.bytedance.ies.ugc.ttkvstorageapi.IUpdateKVRegisterKey
    public final HashMap<String, String> LIZ(String repoName, String repoType) {
        C1OX c1ox;
        HashMap<String, String> hashMap;
        C1OX c1ox2;
        HashMap<String, String> hashMap2;
        o.LJIIIZ(repoName, "repoName");
        o.LJIIIZ(repoType, "repoType");
        EnumC10900bm enumC10900bm = EnumC10900bm.KEVA;
        if (o.LJ(repoType, enumC10900bm.name())) {
            HashMap LIZ = C25180yo.LIZ(repoName, enumC10900bm);
            if (LIZ == null || (c1ox2 = (C1OX) LIZ.get(repoName)) == null || (hashMap2 = c1ox2.LJLIL) == null) {
                return new HashMap<>();
            }
            return hashMap2;
        }
        HashMap LIZ2 = C25180yo.LIZ(repoName, EnumC10900bm.SP);
        if (LIZ2 != null && (c1ox = (C1OX) LIZ2.get(repoName)) != null && (hashMap = c1ox.LJLIL) != null) {
            return hashMap;
        }
        return new HashMap<>();
    }
}
