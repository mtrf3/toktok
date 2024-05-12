package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import java.util.HashMap;

/* renamed from: X.XDb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84467XDb {
    public boolean LIZ;
    public EffectManager LIZIZ;
    public java.util.Map<String, Object> LIZJ;
    public final java.util.Map<String, String> LIZLLL = new HashMap();

    public static ExceptionResult LJ() {
        ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
        exceptionResult.setErrorCode(-1);
        exceptionResult.setMsg("effect sdk manager init failed");
        return exceptionResult;
    }

    public final java.util.Map<String, String> LJFF(java.util.Map<String, String> map) {
        if (map == null && ((HashMap) this.LIZLLL).isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (!((HashMap) this.LIZLLL).isEmpty()) {
            hashMap.putAll(this.LIZLLL);
        }
        return hashMap;
    }

    public final void LIZIZ(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C83745Wtp c83745Wtp = new C83745Wtp(str, new C83753Wtx(str, iFetchEffectChannelListener));
        c83745Wtp.LIZLLL = this.LIZJ;
        if (!this.LIZ) {
            c83745Wtp.onFail(LJ());
        } else {
            this.LIZIZ.fetchEffectList(str, z, c83745Wtp);
        }
    }

    public final void LIZJ(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        IFetchPanelInfoListener iFetchPanelInfoListener2 = iFetchPanelInfoListener;
        if (!this.LIZ) {
            iFetchPanelInfoListener2.onFail(LJ());
            return;
        }
        if (!(iFetchPanelInfoListener2 instanceof C83746Wtq)) {
            iFetchPanelInfoListener2 = C83746Wtq.LIZ(str, iFetchPanelInfoListener2);
        }
        ((C83746Wtq) iFetchPanelInfoListener2).LIZLLL = this.LIZJ;
        this.LIZIZ.fetchPanelInfo(str, z, str2, i, i2, LJFF(null), iFetchPanelInfoListener2);
    }

    public final void LIZLLL(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        IFetchPanelInfoListener iFetchPanelInfoListener2 = iFetchPanelInfoListener;
        if (!this.LIZ) {
            iFetchPanelInfoListener2.onFail(LJ());
            return;
        }
        if (!(iFetchPanelInfoListener2 instanceof C83746Wtq)) {
            iFetchPanelInfoListener2 = C83746Wtq.LIZ(str, iFetchPanelInfoListener2);
        }
        ((C83746Wtq) iFetchPanelInfoListener2).LIZLLL = this.LIZJ;
        this.LIZIZ.fetchPanelInfoFromCache(str, z, str2, i, i2, iFetchPanelInfoListener2);
    }

    public final void LIZ(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener, java.util.Map<String, String> map) {
        IFetchCategoryEffectListener iFetchCategoryEffectListener2 = iFetchCategoryEffectListener;
        if (!this.LIZ) {
            iFetchCategoryEffectListener2.onFail(LJ());
            return;
        }
        if (!(iFetchCategoryEffectListener2 instanceof C83747Wtr)) {
            iFetchCategoryEffectListener2 = C83747Wtr.LIZ(str, i, i2, iFetchCategoryEffectListener2);
        }
        ((C83747Wtr) iFetchCategoryEffectListener2).LJFF = this.LIZJ;
        if (z || C53717L6j.LIZ().LIZIZ(str)) {
            this.LIZIZ.fetchCategoryEffectFromCache(str, str2, i, i2, i3, str3, new XE4(this, iFetchCategoryEffectListener2, str, str2, i, i2, i3, str3));
        } else {
            this.LIZIZ.fetchCategoryEffect(str, str2, i, i2, i3, str3, LJFF(map), iFetchCategoryEffectListener2);
            C53717L6j.LIZ().LIZJ(str);
        }
    }
}
