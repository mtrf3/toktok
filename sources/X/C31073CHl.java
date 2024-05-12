package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CHl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31073CHl implements InterfaceC31074CHm, InterfaceC48038ItG, InterfaceC76502U0s {
    public static int LJLIL = 30;
    public static int LJLILLLLZI = 100;
    public static int LJLJI = 10;
    public static int LJLJJI = 10;
    public static final C31073CHl LJLJJL = new C31073CHl();
    public static final C31073CHl LJLJJLL = new C31073CHl();

    public void LJ(int i, int i2) {
    }

    public void LJFF() {
    }

    public void LJI(Animatable anim) {
        o.LJIIIZ(anim, "anim");
    }

    public void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
    }

    public static final long LIZIZ() {
        int i;
        Object obj;
        C65816PsK c65816PsK = new C65816PsK(Integer.valueOf(LJLJI), InterfaceC30442Bx8.LLIIJLIL.LIZJ());
        List<E> list = c65816PsK.LIZIZ;
        if (list != 0) {
            i = list.size();
        } else {
            i = 0;
        }
        long j = 0;
        if (i < LJLJI) {
            return 0L;
        }
        List<E> list2 = c65816PsK.LIZIZ;
        if (list2 == 0 || list2.size() <= 0) {
            obj = null;
        } else {
            List<E> list3 = c65816PsK.LIZIZ;
            obj = C64504PTg.LIZIZ(list3, -1, list3);
        }
        Double d = (Double) obj;
        if (d != null) {
            j = (long) d.doubleValue();
        }
        return (j + (LJLIL * 60)) - (System.currentTimeMillis() / 1000);
    }

    public static final boolean LIZJ() {
        int i;
        int i2;
        int i3;
        RandomLinkMicSetting.DisconnectJudge disconnectJudge;
        RandomLinkMicSetting.DisconnectJudge disconnectJudge2;
        LiveRandomLinkmicSetting liveRandomLinkmicSetting = LiveRandomLinkmicSetting.INSTANCE;
        RandomLinkMicSetting value = liveRandomLinkmicSetting.getValue();
        if (value != null) {
            i = value.banTime;
        } else {
            i = 30;
        }
        LJLIL = i;
        RandomLinkMicSetting value2 = liveRandomLinkmicSetting.getValue();
        int i4 = 10;
        if (value2 != null) {
            i2 = value2.disconnectTime;
        } else {
            i2 = 10;
        }
        LJLILLLLZI = i2;
        RandomLinkMicSetting value3 = liveRandomLinkmicSetting.getValue();
        if (value3 != null && (disconnectJudge2 = value3.disconnectJudge) != null) {
            i3 = disconnectJudge2.frequency;
        } else {
            i3 = 10;
        }
        LJLJI = i3;
        RandomLinkMicSetting value4 = liveRandomLinkmicSetting.getValue();
        if (value4 != null && (disconnectJudge = value4.disconnectJudge) != null) {
            i4 = disconnectJudge.period;
        }
        LJLJJI = i4;
        if (LIZIZ() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL() {
        boolean z = true;
        if (RandomLinkMicManager.LJLJLJ == EnumC75692TnE.LINKING_SUCCESS) {
            long j = 1000;
            if ((System.currentTimeMillis() / j) - RandomLinkMicManager.LJLLI >= LJLILLLLZI) {
                z = false;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isBeQuickDisconnected = ");
            LIZ.append((System.currentTimeMillis() / j) - RandomLinkMicManager.LJLLI);
            C0NB.LIZIZ("QuickPairing", X1D.LIZIZ(LIZ));
            return z;
        }
        C0NB.LIZIZ("QuickPair", "not in linked ");
        return false;
    }

    @Override // X.InterfaceC76502U0s
    public void LIZ(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        T t = it.data;
        if (t != 0) {
            return t;
        }
        throw new UIM(10000, "default location data is null");
    }
}
