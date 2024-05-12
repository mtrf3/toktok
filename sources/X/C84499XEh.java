package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.net.QueryInfoStickerResponse;
import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.XEh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84499XEh {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final EffectChannelResponse LIZJ = new EffectChannelResponse(null, 1, null);
    public static final EffectCategoryResponse LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new QueryInfoStickerResponse(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        LIZLLL = new EffectCategoryResponse(new com.ss.ugc.effectplatform.model.EffectCategoryResponse("", "", "", null, null, null, null, c61878OQg, c61878OQg, "", null, false, null, 7288, null));
    }

    public static final Exception LJIIIZ(ExceptionResult exceptionResult) {
        Exception runtimeException;
        String str;
        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
            StringBuilder LIZJ2 = b1.LIZJ("Failed on fetch from effect platform, ", "msg: ");
            Integer num = null;
            if (exceptionResult != null) {
                str = exceptionResult.getMsg();
            } else {
                str = null;
            }
            LIZJ2.append(str);
            LIZJ2.append(", code: ");
            if (exceptionResult != null) {
                num = Integer.valueOf(exceptionResult.getErrorCode());
            }
            LIZJ2.append(num);
            runtimeException = new RuntimeException(X1D.LIZIZ(LIZJ2));
        }
        return runtimeException;
    }

    public static final void LJFF(InterfaceC84497XEf combineFetchList, String str, IFetchEffectChannelListener iFetchEffectChannelListener, boolean z) {
        o.LJIIIZ(combineFetchList, "$this$combineFetchList");
        if (z) {
            combineFetchList.LJJJJI(str, C113554cx.LJJJLIIL(), iFetchEffectChannelListener);
        } else {
            InterfaceC84497XEf.LJJLIIJ.getClass();
            XEB.LIZ(combineFetchList, str, null, 0, new XF2(iFetchEffectChannelListener, combineFetchList, str));
        }
    }

    public static final void LIZIZ(InterfaceC84497XEf combineFetchCategoryEffect, String panel, String str, int i, int i2, int i3, String str2, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        o.LJIIIZ(combineFetchCategoryEffect, "$this$combineFetchCategoryEffect");
        o.LJIIIZ(panel, "panel");
        if (!combineFetchCategoryEffect.LJJIZ(panel)) {
            InterfaceC84497XEf.LJJLIIJ.getClass();
            XEB.LIZ(combineFetchCategoryEffect, panel, str, 1, new C84502XEk(combineFetchCategoryEffect, panel, str, i, i2, i3, str2, iFetchCategoryEffectListener));
        } else {
            LIZ(i, i2, i3, iFetchCategoryEffectListener, combineFetchCategoryEffect, panel, str, str2, null, true);
        }
    }

    public static final void LJIIIIZZ(int i, int i2, IFetchPanelInfoListener listener, InterfaceC84497XEf combineFetchPanelInfoInternal, String panel, String str, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(combineFetchPanelInfoInternal, "$this$combineFetchPanelInfoInternal");
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        combineFetchPanelInfoInternal.LJJJJJ(panel, z, str, i, i2, z2, z3, new C84504XEm(i, i2, listener, combineFetchPanelInfoInternal, panel, str, z, z2, z3));
    }

    public static final void LIZ(int i, int i2, int i3, IFetchCategoryEffectListener listener, InterfaceC84497XEf combineFetchCategoryEffect, String panel, String str, String str2, java.util.Map map, boolean z) {
        o.LJIIIZ(combineFetchCategoryEffect, "$this$combineFetchCategoryEffect");
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        combineFetchCategoryEffect.LJJIJ(panel, str, i, i2, i3, str2, z, new C84506XEo(combineFetchCategoryEffect, listener, panel, str, i, i2, i3, str2, z), map);
    }

    public static final void LIZLLL(int i, int i2, int i3, IFetchCategoryEffectListener iFetchCategoryEffectListener, InterfaceC84497XEf combineFetchCategoryEffectAfterCheckUpdate, String panel, String category, String str, java.util.Map map, boolean z) {
        o.LJIIIZ(combineFetchCategoryEffectAfterCheckUpdate, "$this$combineFetchCategoryEffectAfterCheckUpdate");
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(category, "category");
        if (z || combineFetchCategoryEffectAfterCheckUpdate.LJJIZ(category)) {
            combineFetchCategoryEffectAfterCheckUpdate.LJJIJ(panel, category, i, i2, i3, str, true, iFetchCategoryEffectListener, map);
        } else {
            InterfaceC84497XEf.LJJLIIJ.getClass();
            XEB.LIZ(combineFetchCategoryEffectAfterCheckUpdate, panel, category, 1, new C84501XEj(combineFetchCategoryEffectAfterCheckUpdate, panel, category, i, i2, i3, str, iFetchCategoryEffectListener, map));
        }
    }

    public static final void LJI(InterfaceC84497XEf combineFetchPanelInfo, String panel, boolean z, String str, int i, int i2, int i3, String str2, boolean z2, boolean z3, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z4, boolean z5, int i4) {
        String str3 = str2;
        o.LJIIIZ(combineFetchPanelInfo, "$this$combineFetchPanelInfo");
        o.LJIIIZ(panel, "panel");
        if (o.LJ(panel, "default") && z5) {
            if (str3 == null) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            combineFetchPanelInfo.LJJJJIZL(panel, i4, i2, i3, str3, C113554cx.LJJJLIIL(), iFetchPanelInfoListener);
            return;
        }
        if (z4) {
            combineFetchPanelInfo.LJFF(panel, z, str, i, i2, C113554cx.LJJJLIIL(), iFetchPanelInfoListener);
            return;
        }
        if (((!o.LJ(panel, "default")) && (!o.LJ(panel, "livestreaming"))) || !z3) {
            if (combineFetchPanelInfo.LJJIZ(panel)) {
                combineFetchPanelInfo.LJJJJJ(panel, z, str, i, i2, true, z2, iFetchPanelInfoListener);
                return;
            } else {
                InterfaceC84497XEf.LJJLIIJ.getClass();
                XEB.LIZ(combineFetchPanelInfo, panel, str, 2, new C84500XEi(i, i2, iFetchPanelInfoListener, combineFetchPanelInfo, panel, str, z, z2));
                return;
            }
        }
        if (z2) {
            if (combineFetchPanelInfo.LJJIZ(panel)) {
                combineFetchPanelInfo.LJJIJIIJI(panel, z, str, i, i2, i3, str3, true, iFetchPanelInfoListener);
                return;
            } else {
                combineFetchPanelInfo.LJJIJIIJI(panel, z, str, i, i2, i3, str3, false, new C84505XEn(i, i2, i3, iFetchPanelInfoListener, combineFetchPanelInfo, panel, str, str3, z));
                combineFetchPanelInfo.LJJIIZ(panel);
                return;
            }
        }
        if (combineFetchPanelInfo.LJJIZ(panel)) {
            combineFetchPanelInfo.LJIILL(panel, z, str, i, i2, true, iFetchPanelInfoListener);
        } else {
            combineFetchPanelInfo.LJIILL(panel, z, str, i, i2, false, new C84503XEl(i, i2, iFetchPanelInfoListener, combineFetchPanelInfo, panel, str, z));
            combineFetchPanelInfo.LJJIIZ(panel);
        }
    }
}
