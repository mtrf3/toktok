package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.Wae, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82556Wae implements IFetchEffectChannelListener {
    public final /* synthetic */ C173166qu LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C82552Waa LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        String msg;
        C82552Waa c82552Waa = this.LIZJ;
        String str = c82552Waa.LJLJLLL;
        if (c82552Waa.LJIIIIZZ()) {
            C5S1 c5s1 = new C5S1(c82552Waa.LJLJJI.getContext());
            c5s1.LIZLLL(str);
            c5s1.LJ();
            if (c82552Waa.LJLJJI.getDataCount() == 0) {
                C82553Wab c82553Wab = c82552Waa.LJLJJI;
                C8ID c8id = c82553Wab.LJLLL;
                if (c8id != null) {
                    c8id.setVisibility(8);
                }
                c82553Wab.LJLLJ.setVisibility(0);
                c82553Wab.LJLILLLLZI.setVisibility(8);
                c82553Wab.LJLIL.setVisibility(8);
                c82553Wab.LJZI.setNoScroll(true);
                ArrayList arrayList = new ArrayList();
                int i = 0;
                do {
                    MvThemeData mvThemeData = new MvThemeData();
                    mvThemeData.isDefaultType = true;
                    arrayList.add(mvThemeData);
                    i++;
                } while (i < 3);
                c82553Wab.LIZLLL(arrayList);
                C81290VvK c81290VvK = c82553Wab.LJLL;
                c81290VvK.setText(c81290VvK.getContext().getResources().getString(R.string.pwl));
                c82553Wab.LJLL.setClickable(false);
                c82553Wab.LJLLLL = true;
                c82553Wab.LJLL.LIZIZ();
            }
        }
        C173166qu c173166qu = this.LIZ;
        c173166qu.LIZ = 1;
        c173166qu.LIZIZ(this.LIZIZ);
        this.LIZ.LIZIZ = exceptionResult.getErrorCode();
        C173166qu c173166qu2 = this.LIZ;
        if (exceptionResult.getMsg() == null) {
            msg = "";
        } else {
            msg = exceptionResult.getMsg();
        }
        c173166qu2.LIZJ = msg;
        C173156qt.LIZLLL(this.LIZ, C78855Ux9.LJLJL, true);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        if (effectChannelResponse2 == null || C77413UZt.LJIILL(effectChannelResponse2.getAllCategoryEffects())) {
            return;
        }
        this.LIZJ.LJII(effectChannelResponse2.getAllCategoryEffects(), effectChannelResponse2.getUrlPrefix());
        this.LIZ.LIZIZ(this.LIZIZ);
        C173156qt.LIZLLL(this.LIZ, C78855Ux9.LJLJL, true);
    }

    public C82556Wae(C82552Waa c82552Waa, C173166qu c173166qu, long j) {
        this.LIZJ = c82552Waa;
        this.LIZ = c173166qu;
        this.LIZIZ = j;
    }
}
