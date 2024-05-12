package X;

import android.content.Context;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final class MS1<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ C68322mC<Class<?>> LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ GuideOutPushParam LIZJ;
    public final /* synthetic */ MS3 LIZLLL;
    public final /* synthetic */ C68322mC<MS4> LJ;

    public MS1(C68322mC<Class<?>> c68322mC, Context context, GuideOutPushParam guideOutPushParam, MS3 ms3, C68322mC<MS4> c68322mC2) {
        this.LIZ = c68322mC;
        this.LIZIZ = context;
        this.LIZJ = guideOutPushParam;
        this.LIZLLL = ms3;
        this.LJ = c68322mC2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Class] */
    @Override // X.C10I
    public final Object then(C10K c10k) {
        if (c10k != null) {
            try {
                if (c10k.LJIIJJI() != null) {
                    PushSettings settingList = (PushSettings) c10k.LJIIJJI();
                    C85940Xo8 c85940Xo8 = C85940Xo8.LIZIZ;
                    Object LJIIJJI = c10k.LJIIJJI();
                    o.LJIIIIZZ(LJIIJJI, "it.result");
                    c85940Xo8.LIZJ((PushSettings) LJIIJJI);
                    C68322mC<Class<?>> c68322mC = this.LIZ;
                    Context context = this.LIZIZ;
                    GuideOutPushParam guideOutPushParam = this.LIZJ;
                    o.LJIIIIZZ(settingList, "settingList");
                    c68322mC.element = C56827MRz.LIZLLL(context, guideOutPushParam, settingList, this.LIZLLL, this.LJ.element);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return C76800UCe.LIZ;
    }
}
