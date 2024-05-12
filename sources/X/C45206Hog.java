package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallback;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.cutsame.TemplateList;
import java.util.List;

/* renamed from: X.Hog, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45206Hog extends MusicRequestCallback {
    public final /* synthetic */ C45199HoZ LIZ;
    public final /* synthetic */ InterfaceC88471Ynr<List<AutoCutThemeData>, String, C76800UCe> LIZIZ;
    public final /* synthetic */ AutoCutThemeData LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C45206Hog(C45199HoZ c45199HoZ, InterfaceC88471Ynr<? super List<AutoCutThemeData>, ? super String, C76800UCe> interfaceC88471Ynr, AutoCutThemeData autoCutThemeData) {
        this.LIZ = c45199HoZ;
        this.LIZIZ = interfaceC88471Ynr;
        this.LIZJ = autoCutThemeData;
    }

    @Override // com.bytedance.ies.smartmovie.jni.MusicRequestCallback
    public final void onInfoCallBack(MusicRequestCallbackInfoType musicRequestCallbackInfoType, float f, int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        if (musicRequestCallbackInfoType == MusicRequestCallbackInfoType.REQUEST_ERROR || musicRequestCallbackInfoType == MusicRequestCallbackInfoType.RESPONSE_SUCCESS) {
            this.LIZ.LJLLI = null;
        }
        if (musicRequestCallbackInfoType == MusicRequestCallbackInfoType.RESPONSE_SUCCESS) {
            OSJ<TemplateList, String, String> LJJIJIL = C45087Hml.LJJIJIL(str);
            TemplateList first = LJJIJIL.getFirst();
            String second = LJJIJIL.getSecond();
            if (first == null || first.templateList == null || second == null) {
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent preRecommend parse musicList or taskId from response failed");
                return;
            }
            List<CutsameDataItem> list = first.templateList;
            if (list == null) {
                return;
            }
            this.LIZIZ.invoke(C45087Hml.LJI(list, this.LIZJ), second);
        }
    }
}
