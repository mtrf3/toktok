package X;

import com.bef.effectsdk.GeneralParam;
import com.ss.android.ugc.aweme.services.external.ability.IGeneralParam;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OpH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63079OpH implements IGeneralParam {
    public static final C63079OpH LIZ = new C63079OpH();

    @Override // com.ss.android.ugc.aweme.services.external.ability.IGeneralParam
    public final void setNetWorkInfoCallback() {
        GeneralParam.setNetWorkInfoCallback(new C63080OpI());
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IGeneralParam
    public final String getParamByKey(String str) {
        return GeneralParam.nativeGetParamByKey(str);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IGeneralParam
    public final void setParams(HashMap<String, String> params) {
        o.LJIIIZ(params, "params");
        GeneralParam.nativeSetParams(params);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IGeneralParam
    public final void setParamWithKey(String str, String str2) {
        GeneralParam.nativeSetParamWithKey(str, str2);
    }
}
