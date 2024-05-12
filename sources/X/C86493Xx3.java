package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPullUpLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xx3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86493Xx3 extends FrameLayout implements InterfaceC81305VvZ {
    public InnerPushPullUpLayout LJLIL;
    public FrameLayout LJLILLLLZI;
    public SQV LJLJI;
    public boolean LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public final RunnableC86513XxN LJLJL;
    public InterfaceC86538Xxm LJLJLJ;
    public InnerPushMessage LJLJLLL;

    @Override // X.InterfaceC81305VvZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC81305VvZ
    public final void LIZIZ() {
        InnerPushMessage innerPushMessage = this.LJLJLLL;
        if (innerPushMessage != null) {
            List list = (List) C86506XxG.LIZ().get(Integer.valueOf(innerPushMessage.getType()));
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC86533Xxh) it.next()).LJIIIZ();
                }
            }
            Iterator<InterfaceC86533Xxh> it2 = C86506XxG.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIIZ();
            }
        }
        this.LJLJJI = false;
        InnerPushPullUpLayout innerPushPullUpLayout = this.LJLIL;
        if (innerPushPullUpLayout != null) {
            innerPushPullUpLayout.removeCallbacks(this.LJLJL);
        }
        InterfaceC86538Xxm interfaceC86538Xxm = this.LJLJLJ;
        if (interfaceC86538Xxm != null) {
            interfaceC86538Xxm.LIZ(true);
        }
    }

    public final void LIZJ() {
        RunnableC86513XxN runnableC86513XxN = this.LJLJL;
        runnableC86513XxN.LJLIL = false;
        InnerPushPullUpLayout innerPushPullUpLayout = this.LJLIL;
        if (innerPushPullUpLayout != null) {
            innerPushPullUpLayout.removeCallbacks(runnableC86513XxN);
        }
        InnerPushPullUpLayout innerPushPullUpLayout2 = this.LJLIL;
        if (innerPushPullUpLayout2 != null) {
            innerPushPullUpLayout2.postDelayed(this.LJLJL, this.LJLJJLL);
        }
    }

    public final InnerPushMessage getMessage() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86493Xx3(Context context) {
        super(context, null, 0);
        View inflate;
        FrameLayout frameLayout;
        new LinkedHashMap();
        this.LJLJJLL = 5000L;
        this.LJLJL = new RunnableC86513XxN(this);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context2);
        if (C53334KwU.LIZIZ() && C16970lZ.LIZ(R.layout.ba_, getContext()) && LJIJJ != null) {
            inflate = C16970lZ.LIZJ(R.layout.ba_, LJIJJ, this, true);
        } else {
            inflate = FrameLayout.inflate(getContext(), R.layout.ba_, this);
        }
        this.LJLIL = (InnerPushPullUpLayout) inflate.findViewById(R.id.ig2);
        this.LJLILLLLZI = (FrameLayout) inflate.findViewById(R.id.j5m);
        this.LJLJI = new SQV(this.LJLILLLLZI);
        if (Build.VERSION.SDK_INT < 28 && (frameLayout = this.LJLILLLLZI) != null) {
            frameLayout.setLayerType(1, null);
        }
        FrameLayout frameLayout2 = this.LJLILLLLZI;
        if (frameLayout2 != null) {
            frameLayout2.setBackground(this.LJLJI);
        }
        InnerPushPullUpLayout innerPushPullUpLayout = this.LJLIL;
        if (innerPushPullUpLayout != null) {
            innerPushPullUpLayout.LJLJI = this.LJLILLLLZI;
            innerPushPullUpLayout.setPullUpListener(this);
        }
        InnerPushPullUpLayout innerPushPullUpLayout2 = this.LJLIL;
        if (innerPushPullUpLayout2 != null) {
            innerPushPullUpLayout2.setInternalTouchEventListener(new C86514XxO(this));
        }
    }

    public final void setInnerPushNotifier(InterfaceC86538Xxm listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJLJ = listener;
    }

    public final void setMessage(InnerPushMessage innerPushMessage) {
        this.LJLJLLL = innerPushMessage;
    }

    public final void setShowDuration(long j) {
        this.LJLJJLL = j;
    }
}
