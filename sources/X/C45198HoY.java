package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallback;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.cutsame.TemplateList;
import defpackage.b1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HoY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45198HoY extends MusicRequestCallback {
    public final /* synthetic */ AbstractC45196HoW LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ List<InterfaceC45209Hoj> LIZJ;
    public final /* synthetic */ InterfaceC88471Ynr<List<CutsameDataItem>, String, C76800UCe> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C45198HoY(AbstractC45196HoW abstractC45196HoW, boolean z, List<? extends InterfaceC45209Hoj> list, InterfaceC88471Ynr<? super List<CutsameDataItem>, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LIZ = abstractC45196HoW;
        this.LIZIZ = z;
        this.LIZJ = list;
        this.LIZLLL = interfaceC88471Ynr;
    }

    @Override // com.bytedance.ies.smartmovie.jni.MusicRequestCallback
    public final void onInfoCallBack(MusicRequestCallbackInfoType musicRequestCallbackInfoType, float f, int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        String str2;
        TemplateList templateList;
        int i2;
        int i3;
        CutsameDataItem cutsameDataItem;
        EnumC43998HOo enumC43998HOo;
        int i4;
        String str3;
        List<CutsameDataItem> list;
        if (musicRequestCallbackInfoType == MusicRequestCallbackInfoType.RESPONSE_SUCCESS) {
            OSJ<TemplateList, String, String> LJJIJIL = C45087Hml.LJJIJIL(str);
            templateList = LJJIJIL.getFirst();
            str2 = LJJIJIL.getSecond();
            if (templateList != null && (list = templateList.templateList) != null) {
                cutsameDataItem = (CutsameDataItem) ORZ.LJLLLL(list);
            } else {
                cutsameDataItem = null;
            }
            if (this.LIZIZ) {
                enumC43998HOo = EnumC43998HOo.SOUND_SYNC_TEMPLATE;
            } else if (cutsameDataItem != null) {
                enumC43998HOo = cutsameDataItem.LJII();
            } else {
                enumC43998HOo = null;
            }
            for (InterfaceC45209Hoj interfaceC45209Hoj : this.LIZJ) {
                if (enumC43998HOo != null) {
                    i4 = enumC43998HOo.getValue();
                } else {
                    i4 = -1;
                }
                if (cutsameDataItem != null) {
                    str3 = cutsameDataItem.templateData;
                } else {
                    str3 = null;
                }
                interfaceC45209Hoj.LJIJI(i4, str3);
            }
        } else {
            str2 = null;
            templateList = null;
        }
        AbstractC45196HoW abstractC45196HoW = this.LIZ;
        List<InterfaceC45209Hoj> callbacks = this.LIZJ;
        abstractC45196HoW.getClass();
        o.LJIIIZ(callbacks, "callbacks");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(abstractC45196HoW.LJIIIZ());
        LIZ.append(" requestRecommendedMusicList: ");
        LIZ.append(f);
        LIZ.append(' ');
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (musicRequestCallbackInfoType == null) {
            i2 = -1;
        } else {
            i2 = C45225Hoz.LIZ[musicRequestCallbackInfoType.ordinal()];
        }
        String str4 = "";
        switch (i2) {
            case 1:
                for (InterfaceC45209Hoj interfaceC45209Hoj2 : callbacks) {
                    interfaceC45209Hoj2.LJIIJ("before_extract");
                    interfaceC45209Hoj2.LJFF("after_extract");
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ);
                LIZ2.append(" BEFORE_EXTRACTOR");
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
                break;
            case 2:
                for (InterfaceC45209Hoj interfaceC45209Hoj3 : callbacks) {
                    interfaceC45209Hoj3.LJIIJ("after_extract");
                    interfaceC45209Hoj3.LJFF("zip_generate");
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ);
                LIZ3.append(" AFTER_EXTRACTOR");
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ3));
                break;
            case 3:
                if (C45093Hmr.LIZ()) {
                    for (InterfaceC45209Hoj interfaceC45209Hoj4 : callbacks) {
                        interfaceC45209Hoj4.LJIIJ("zip_generate");
                        interfaceC45209Hoj4.LJFF("music_request_success");
                    }
                } else {
                    for (InterfaceC45209Hoj interfaceC45209Hoj5 : callbacks) {
                        interfaceC45209Hoj5.LJIIJ("zip_generate");
                        interfaceC45209Hoj5.LJFF("zip_upload_tos");
                    }
                }
                StringBuilder LIZJ = b1.LIZJ(LIZIZ, " ZIP_GENERATE_SUCCESS, path = ");
                if (str != null) {
                    str4 = str;
                }
                C45243HpH.LIZIZ(LIZJ, str4, LIZJ);
                break;
            case 4:
                for (InterfaceC45209Hoj interfaceC45209Hoj6 : callbacks) {
                    interfaceC45209Hoj6.LJIIJ("zip_upload_tos");
                    interfaceC45209Hoj6.LJFF("music_request_success");
                }
                StringBuilder LIZJ2 = b1.LIZJ(LIZIZ, " ZIP_UPLOAD_TOS_SUCCESS, tosPath = ");
                if (str != null) {
                    str4 = str;
                }
                C45243HpH.LIZIZ(LIZJ2, str4, LIZJ2);
                break;
            case 5:
                Iterator<InterfaceC45209Hoj> it = callbacks.iterator();
                while (it.hasNext()) {
                    it.next().LJIIJ("music_request_success");
                }
                StringBuilder LIZJ3 = b1.LIZJ(LIZIZ, " RESPONSE_SUCCESS, result = ");
                if (str != null) {
                    str4 = str;
                }
                C45243HpH.LIZIZ(LIZJ3, str4, LIZJ3);
                break;
            case 6:
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(LIZIZ);
                LIZ4.append(" REQUEST_ERROR, code = ");
                LIZ4.append(i);
                LIZ4.append(", msg = ");
                if (str != null) {
                    str4 = str;
                }
                C45243HpH.LIZIZ(LIZ4, str4, LIZ4);
                break;
        }
        MusicRequestCallbackInfoType musicRequestCallbackInfoType2 = MusicRequestCallbackInfoType.REQUEST_ERROR;
        if (musicRequestCallbackInfoType == musicRequestCallbackInfoType2 || musicRequestCallbackInfoType == MusicRequestCallbackInfoType.RESPONSE_SUCCESS) {
            this.LIZ.LJII = null;
        }
        if (musicRequestCallbackInfoType == musicRequestCallbackInfoType2) {
            AbstractC45196HoW.LJIIJ(this.LIZ, i, null, str, unorderedMapStrStr, 2);
        } else if (musicRequestCallbackInfoType == MusicRequestCallbackInfoType.RESPONSE_SUCCESS) {
            Iterator<InterfaceC45209Hoj> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIIZ(EnumC45211Hol.PROCESS_APPLY_EFFECTS);
            }
        }
        if (musicRequestCallbackInfoType == MusicRequestCallbackInfoType.RESPONSE_SUCCESS) {
            AbstractC45196HoW abstractC45196HoW2 = this.LIZ;
            abstractC45196HoW2.LJIIJ = 1.0f;
            C44716Hgm c44716Hgm = abstractC45196HoW2.LJI;
            if (c44716Hgm != null && c44716Hgm.LIZJ()) {
                List<InterfaceC45209Hoj> list2 = this.LIZJ;
                AbstractC45196HoW abstractC45196HoW3 = this.LIZ;
                Iterator<InterfaceC45209Hoj> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().onProgress(abstractC45196HoW3.LIZLLL());
                }
            }
            if (templateList == null || templateList.templateList == null || str2 == null) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(this.LIZ.LJIIIZ());
                LIZ5.append(" parse musicList or taskId from response failed");
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ5));
                if (str2 == null) {
                    i3 = 1006;
                } else if (templateList == null || templateList.templateList == null) {
                    i3 = 1004;
                } else {
                    List<CutsameDataItem> list3 = templateList.templateList;
                    if (list3 == null || list3.isEmpty()) {
                        i3 = 1005;
                    } else {
                        i3 = -1;
                    }
                }
                AbstractC45196HoW.LJIIJ(this.LIZ, i3, null, str, null, 10);
                return;
            }
            List<CutsameDataItem> list4 = templateList.templateList;
            if (list4 == null) {
                return;
            }
            this.LIZLLL.invoke(list4, str2);
        }
    }
}
