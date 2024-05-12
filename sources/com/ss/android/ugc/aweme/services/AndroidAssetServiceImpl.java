package com.ss.android.ugc.aweme.services;

import X.AnonymousClass636;
import X.C60903NvH;
import X.C77321UWf;
import X.C78857UxB;
import X.InterfaceC72973SkT;
import X.PVC;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AndroidAssetServiceImpl {
    public <T> T convertJsonToObject(String fileName, Class<T> type) {
        o.LJIIIZ(fileName, "fileName");
        o.LJIIIZ(type, "type");
        return (T) convertJsonToObject(fileName, type, new C78857UxB());
    }

    public <T> T convertJsonToObject(String fileName, Class<T> type, InterfaceC72973SkT<String, T> transformer) {
        o.LJIIIZ(fileName, "fileName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(transformer, "transformer");
        InputStream open = C60903NvH.LJ.getAssets().open(fileName);
        o.LJIIIIZZ(open, "getApplication().assets.open(fileName)");
        Reader inputStreamReader = new InputStreamReader(open, PVC.LIZ);
        if (!(inputStreamReader instanceof BufferedReader)) {
            inputStreamReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
        }
        try {
            String LJIILJJIL = C77321UWf.LJIILJJIL(inputStreamReader);
            AnonymousClass636.LJFF(inputStreamReader, null);
            return transformer.LJFF(LJIILJJIL, type);
        } finally {
        }
    }
}
