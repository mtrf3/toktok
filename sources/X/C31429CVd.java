package X;

import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGameFloatMsgPanelConfigSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/* renamed from: X.CVd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31429CVd {
    public final InterfaceC88472Yns<CQO<? extends CR6>, C76800UCe> LIZ;
    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LIZIZ;
    public final int LIZJ;
    public CRD LJFF;
    public int LJI;
    public CQO LJII;
    public final Handler LJIIJ;
    public final long LJIIJJI;
    public final int LJIIL;
    public final Queue<CQO<? extends CR6>> LJIILIIL;
    public final int LIZLLL = 70;
    public final ArrayList<CQO<? extends CR6>> LJ = new ArrayList<>();
    public final ArrayList<OSZ<ChatMessage, ChatMessage>> LJIIIIZZ = new ArrayList<>();
    public final C73849Syb<OSZ<ChatMessage, ChatMessage>> LJIIIZ = new C73849Syb<>();

    public C31429CVd(C31434CVi c31434CVi, C31430CVe c31430CVe) {
        this.LIZ = c31434CVi;
        this.LIZIZ = c31430CVe;
        this.LIZJ = 200;
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        this.LJIIJ = handler;
        this.LJIILIIL = new ArrayDeque(8);
        ARunnableS41S0100000_5 aRunnableS41S0100000_5 = new ARunnableS41S0100000_5(this, 332);
        this.LJIIJJI = 3000L;
        this.LJIIL = 8;
        int i = LiveGameFloatMsgPanelConfigSetting.INSTANCE.getValue().showMaxSize;
        this.LIZJ = i;
        if (i <= 0) {
            this.LIZJ = 200;
        }
        handler.postDelayed(aRunnableS41S0100000_5, 3000L);
    }
}
