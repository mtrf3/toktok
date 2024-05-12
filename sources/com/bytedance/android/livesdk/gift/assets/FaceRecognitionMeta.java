package com.bytedance.android.livesdk.gift.assets;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class FaceRecognitionMeta extends F9E {

    @InterfaceC65349Pkn("model_names")
    public String modelNames;

    @InterfaceC65349Pkn("requirement")
    public List<String> requirements;

    @InterfaceC65349Pkn("sdk_extra")
    public String sdkExtra;

    @InterfaceC65349Pkn("version")
    public String version;

    /* JADX WARN: Multi-variable type inference failed */
    public FaceRecognitionMeta() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceRecognitionMeta copy$default(FaceRecognitionMeta faceRecognitionMeta, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceRecognitionMeta.modelNames;
        }
        if ((i & 2) != 0) {
            list = faceRecognitionMeta.requirements;
        }
        if ((i & 4) != 0) {
            str2 = faceRecognitionMeta.sdkExtra;
        }
        if ((i & 8) != 0) {
            str3 = faceRecognitionMeta.version;
        }
        return faceRecognitionMeta.copy(str, list, str2, str3);
    }

    public final String component1() {
        return this.modelNames;
    }

    public final List<String> component2() {
        return this.requirements;
    }

    public final String component3() {
        return this.sdkExtra;
    }

    public final String component4() {
        return this.version;
    }

    public final FaceRecognitionMeta copy(String str, List<String> list, String str2, String str3) {
        return new FaceRecognitionMeta(str, list, str2, str3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.modelNames, this.requirements, this.sdkExtra, this.version};
    }

    public FaceRecognitionMeta(String str, List<String> list, String str2, String str3) {
        this.modelNames = str;
        this.requirements = list;
        this.sdkExtra = str2;
        this.version = str3;
    }

    public /* synthetic */ FaceRecognitionMeta(String str, List list, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
