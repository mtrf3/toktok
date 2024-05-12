package com.ss.android.ugc.aweme.shortvideo.model;

import X.C5NP;
import X.C82891Wg3;
import X.X1D;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.e;
import com.google.gson.s;

/* loaded from: classes8.dex */
public final class ExtractFramesModelExtKt {
    public static final ExtractFramesModel string2Model(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        ExtractFramesModel extractFramesModel = null;
        if (z) {
            return null;
        }
        try {
            extractFramesModel = (ExtractFramesModel) GsonProtectorUtils.fromJson(new e().LIZ(), str, ExtractFramesModel.class);
            return extractFramesModel;
        } catch (s unused) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parser frames data error:\n");
            LIZ.append(str);
            LIZLLL.LIZ(X1D.LIZIZ(LIZ));
            return extractFramesModel;
        }
    }
}
