package X;

import Y.AfS54S0200000_5;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.impl.api.PublicScreenAutoTranslateApi;
import com.bytedance.android.live.publicscreen.impl.api.model.AutoTranslateParams;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateBufferConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateIngoreContentLanguageSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CSn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31361CSn<T> extends CTV<T> {
    public final LifecycleOwner LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Looper LJI;
    public final LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig LJII;
    public final boolean LJIIIIZZ;
    public CV5<T> LJIIIZ;
    public InterfaceC31364CSq<T> LJIIJ;
    public C73318Sq2 LJIIJJI;
    public final String LJIIL;

    public abstract List LIZIZ(List list, java.util.Map map);

    public abstract MGetTranslationRequest.Text LIZJ(T t);

    public boolean LIZ(T t) {
        if (!this.LJFF) {
            Boolean LIZJ = InterfaceC30442Bx8.u0.LIZJ();
            o.LJIIIIZZ(LIZJ, "{\n            LivePlugin…_AUDIENCE.value\n        }");
            return LIZJ.booleanValue();
        }
        Boolean LIZJ2 = InterfaceC30442Bx8.x0.LIZJ();
        o.LJIIIIZZ(LIZJ2, "{\n            LivePlugin…TE_ANCHOR.value\n        }");
        return LIZJ2.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C73428Sro LIZLLL(List list) {
        o.LJIIIZ(list, "list");
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MGetTranslationRequest.Text LIZJ = LIZJ(it.next());
            if (LIZJ != null) {
                arrayList.add(LIZJ);
            }
        }
        return ((PublicScreenAutoTranslateApi) Q7L.LIZIZ(PublicScreenAutoTranslateApi.class)).translate(new AutoTranslateParams(this.LIZIZ, this.LIZJ, this.LIZLLL, (MGetTranslationRequest.Text[]) arrayList.toArray(new MGetTranslationRequest.Text[0]))).LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ());
    }

    public final void LJFF(List<? extends T> list) {
        AbstractC73946T0k LIZIZ;
        C73428Sro LIZLLL = LIZLLL(list);
        if (LIZLLL == null) {
            return;
        }
        long j = this.LJII.messageAutoTranslateRequestTimeout;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C73870Syw LJJLIIIJL = LIZLLL.LJJLIIIJL(j, new C31363CSp(list, this), C73969T1h.LIZIZ(), timeUnit);
        Looper looper = this.LJI;
        if (looper != null) {
            LIZIZ = C73969T1h.LIZ(looper);
        } else {
            LIZIZ = C73969T1h.LIZIZ();
        }
        InterfaceC92693kP LJJJLIIL = LJJLIIIJL.LJJJ(LIZIZ).LJJJLIIL(new AfS54S0200000_5(list, this, 49), new AfS54S0200000_5(list, this, 50));
        C73318Sq2 c73318Sq2 = this.LJIIJJI;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZ(LJJJLIIL);
        }
    }

    public final boolean LJ(T t, InterfaceC31364CSq<T> translateCallback) {
        o.LJIIIZ(translateCallback, "translateCallback");
        if (LIZ(t)) {
            this.LJIIJ = translateCallback;
            if (this.LJ) {
                CV5<T> cv5 = this.LJIIIZ;
                if (cv5 != null) {
                    cv5.add(t);
                    return true;
                }
                return true;
            }
            LJFF(C47261Igj.LJJIJ(t));
            return true;
        }
        return false;
    }

    public AbstractC31361CSn(LifecycleOwner lifecycleOwner, long j, long j2, String str, boolean z, boolean z2, Looper looper) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = looper;
        LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig value = LiveAutoTranslateBufferConfigSetting.getValue();
        this.LJII = value;
        this.LJIIIIZZ = LiveAutoTranslateIngoreContentLanguageSetting.getValue();
        this.LJIIJJI = new C73318Sq2();
        this.LJIIL = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale().getLanguage();
        if (z) {
            CV5<T> cv5 = new CV5<>(value.autoTranslateBufferSize, value.autoTranslateBufferTimeout, looper);
            this.LJIIIZ = cv5;
            cv5.setCountDownDispose(new AqS171S0100000_5(this, (AbstractC31361CSn<Object>) 701));
        }
    }
}
