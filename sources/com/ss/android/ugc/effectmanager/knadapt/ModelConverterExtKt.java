package com.ss.android.ugc.effectmanager.knadapt;

import X.C162476Zf;
import X.X9D;
import X.XA2;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.FetchModelType;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ModelConverterExtKt {

    /* loaded from: classes16.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[XA2.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[XA2.ORIGIN.ordinal()] = 1;
            iArr[XA2.ZIP.ordinal()] = 2;
            int[] iArr2 = new int[FetchModelType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[FetchModelType.ORIGIN.ordinal()] = 1;
            iArr2[FetchModelType.ZIP.ordinal()] = 2;
            int[] iArr3 = new int[DownloadableModelConfig.ModelFileEnv.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[DownloadableModelConfig.ModelFileEnv.TEST.ordinal()] = 1;
            iArr3[DownloadableModelConfig.ModelFileEnv.ONLINE.ordinal()] = 2;
        }
    }

    public static final XA2 toKNFetchModelType(FetchModelType toKNFetchModelType) {
        o.LJIIJ(toKNFetchModelType, "$this$toKNFetchModelType");
        int i = WhenMappings.$EnumSwitchMapping$1[toKNFetchModelType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return XA2.ZIP;
            }
            throw new C162476Zf();
        }
        return XA2.ORIGIN;
    }

    public static final X9D toKNModel(DownloadableModelConfig.ModelFileEnv toKNModel) {
        o.LJIIJ(toKNModel, "$this$toKNModel");
        int i = WhenMappings.$EnumSwitchMapping$2[toKNModel.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return X9D.ONLINE;
            }
            throw new C162476Zf();
        }
        return X9D.TEST;
    }

    public static final FetchModelType toOldFetchModelType(XA2 toOldFetchModelType) {
        o.LJIIJ(toOldFetchModelType, "$this$toOldFetchModelType");
        int i = WhenMappings.$EnumSwitchMapping$0[toOldFetchModelType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return FetchModelType.ZIP;
            }
            throw new C162476Zf();
        }
        return FetchModelType.ORIGIN;
    }
}
