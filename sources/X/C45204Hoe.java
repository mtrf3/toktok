package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallback;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.cutsame.TemplateList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS5S1301000_7;

/* renamed from: X.Hoe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45204Hoe extends MusicRequestCallback {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ InterfaceC45222How LIZIZ;
    public final /* synthetic */ C45199HoZ LIZJ;
    public final /* synthetic */ InterfaceC88471Ynr<List<CutsameDataItem>, String, C76800UCe> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C45204Hoe(boolean z, InterfaceC45222How interfaceC45222How, C45199HoZ c45199HoZ, InterfaceC88471Ynr<? super List<CutsameDataItem>, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LIZ = z;
        this.LIZIZ = interfaceC45222How;
        this.LIZJ = c45199HoZ;
        this.LIZLLL = interfaceC88471Ynr;
    }

    @Override // com.bytedance.ies.smartmovie.jni.MusicRequestCallback
    public final void onInfoCallBack(MusicRequestCallbackInfoType musicRequestCallbackInfoType, float f, int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        String str2;
        TemplateList templateList;
        int i2;
        CutsameDataItem cutsameDataItem;
        EnumC43998HOo enumC43998HOo;
        int i3;
        String str3;
        List<CutsameDataItem> list;
        MusicRequestCallbackInfoType musicRequestCallbackInfoType2 = MusicRequestCallbackInfoType.RESPONSE_SUCCESS;
        if (musicRequestCallbackInfoType == musicRequestCallbackInfoType2) {
            OSJ<TemplateList, String, String> LJJIJIL = C45087Hml.LJJIJIL(str);
            templateList = LJJIJIL.getFirst();
            str2 = LJJIJIL.getSecond();
            if (templateList != null && (list = templateList.templateList) != null) {
                cutsameDataItem = (CutsameDataItem) ORZ.LJLLLL(list);
            } else {
                cutsameDataItem = null;
            }
            if (this.LIZ) {
                enumC43998HOo = EnumC43998HOo.SOUND_SYNC_TEMPLATE;
            } else if (cutsameDataItem != null) {
                enumC43998HOo = cutsameDataItem.LJII();
            } else {
                enumC43998HOo = null;
            }
            InterfaceC45222How interfaceC45222How = this.LIZIZ;
            if (interfaceC45222How != null) {
                if (enumC43998HOo != null) {
                    i3 = enumC43998HOo.getValue();
                } else {
                    i3 = -1;
                }
                if (cutsameDataItem != null) {
                    str3 = cutsameDataItem.templateData;
                } else {
                    str3 = null;
                }
                interfaceC45222How.LJIJI(i3, str3);
            }
        } else {
            str2 = null;
            templateList = null;
        }
        this.LIZJ.LLILZIL(musicRequestCallbackInfoType, f, i, str, this.LIZIZ);
        if (musicRequestCallbackInfoType == MusicRequestCallbackInfoType.REQUEST_ERROR || musicRequestCallbackInfoType == musicRequestCallbackInfoType2) {
            this.LIZJ.LJLLI = null;
        }
        C6QQ.LIZ(new AqS5S1301000_7(musicRequestCallbackInfoType, this.LIZJ, i, str, unorderedMapStrStr, 1));
        if (musicRequestCallbackInfoType == musicRequestCallbackInfoType2) {
            C45199HoZ c45199HoZ = this.LIZJ;
            c45199HoZ.LJLLLLLL = 1.0f;
            C6QQ.LIZ(new AqS157S0100000_7(c45199HoZ, 60));
            if (templateList == null || templateList.templateList == null || str2 == null) {
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent parse musicList or taskId from response failed");
                if (str2 == null) {
                    i2 = 1006;
                } else if (templateList == null || templateList.templateList == null) {
                    i2 = 1004;
                } else {
                    List<CutsameDataItem> list2 = templateList.templateList;
                    if (list2 == null || list2.isEmpty()) {
                        i2 = 1005;
                    } else {
                        i2 = -1;
                    }
                }
                C45199HoZ.LJLZ(this.LIZJ, i2, null, str, null, 10, null);
                return;
            }
            List<CutsameDataItem> list3 = templateList.templateList;
            if (list3 == null) {
                return;
            }
            this.LIZLLL.invoke(list3, str2);
        }
    }
}
