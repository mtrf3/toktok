package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Wtr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83747Wtr implements IFetchCategoryEffectListener {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final IFetchCategoryEffectListener LIZLLL;
    public final C44428Hc8 LJ = C44428Hc8.LIZ();
    public java.util.Map<String, ? extends Object> LJFF;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        int i;
        Integer num;
        if (exceptionResult == null) {
            errorCode = -2;
            msg = "unknown error";
        } else {
            errorCode = exceptionResult.getErrorCode();
            msg = exceptionResult.getMsg();
            o.LJIIIIZZ(msg, "e.msg");
        }
        if (C48331Ixz.LJ() || C48331Ixz.LIZLLL()) {
            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("errorCode", Integer.valueOf(errorCode));
            c6bk.LIZ.put("errorDesc", msg);
            c6bk.LIZ.put("count", Integer.valueOf(this.LIZIZ));
            c6bk.LIZ.put("cursor", Integer.valueOf(this.LIZJ));
            c6bk.LIZ.put("panel", this.LIZ);
            java.util.Map<String, ? extends Object> map = this.LJFF;
            Object obj = null;
            if (map != null) {
                obj = map.get("is_story");
            }
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            c6bk.LIZ.put("is_story", Integer.valueOf(i));
            LJJIIZI.LJIIL(1, "sticker_list_error_rate", c6bk.LJ());
        }
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.LIZLLL;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onFail(exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        Object obj;
        int i;
        long LIZIZ = this.LJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.LIZLLL;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onSuccess(categoryPageModel);
        }
        if (C48331Ixz.LJ() || C48331Ixz.LIZLLL()) {
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("duration", Long.valueOf(LIZIZ));
            c6bk.LIZ.put("abParam", 2);
            c6bk.LIZ.put("count", Integer.valueOf(this.LIZIZ));
            c6bk.LIZ.put("cursor", Integer.valueOf(this.LIZJ));
            c6bk.LIZ.put("panel", this.LIZ);
            java.util.Map<String, ? extends Object> map = this.LJFF;
            Integer num = null;
            if (map != null) {
                obj = map.get("is_story");
            } else {
                obj = null;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            c6bk.LIZ.put("is_story", Integer.valueOf(i));
            C60903NvH.LJIIJJI().LJJIIZI().LJIIL(0, "sticker_list_error_rate", c6bk.LJ());
        }
    }

    public C83747Wtr(String str, int i, int i2, C83752Wtw c83752Wtw) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = c83752Wtw;
    }

    public static final C83747Wtr LIZ(String panel, int i, int i2, IFetchCategoryEffectListener listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        return new C83747Wtr(panel, i, i2, new C83752Wtw(panel, listener));
    }
}
