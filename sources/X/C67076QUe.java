package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.sync.settings.SettingsV2;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.QUe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67076QUe implements InterfaceC67072QUa, InterfaceC67071QTz, Handler.Callback {
    public final C67040QSu LJLJJI;
    public final Context LJLJJL;
    public volatile InterfaceC67082QUk LJLJL;
    public boolean LJLJLJ;
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);
    public final AtomicBoolean LJLILLLLZI = new AtomicBoolean(false);
    public final QVY LJLJJLL = new QVY(new QVV());
    public final C67077QUf LJLJI = new C67077QUf(this);

    @Override // X.InterfaceC67072QUa
    public final void LIZ(C67074QUc c67074QUc) {
        ((Handler) this.LJLJI.LIZLLL(new Object[0])).sendMessage(((Handler) this.LJLJI.LIZLLL(new Object[0])).obtainMessage(101));
    }

    @Override // X.InterfaceC67071QTz
    public final void LJJJLZIJ(boolean z) {
        ((Handler) this.LJLJI.LIZLLL(new Object[0])).obtainMessage(102, Boolean.valueOf(z)).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 101) {
            boolean LJFF = this.LJLJJI.LIZJ.LJFF();
            LIZIZ(QUW.LIZJ(this.LJLJJL).LIZIZ(), LJFF);
            this.LJLJLJ = LJFF;
        }
        if (message.what == 102) {
            boolean LJFF2 = this.LJLJJI.LIZJ.LJFF();
            LIZIZ(QUW.LIZJ(this.LJLJJL).LIZIZ(), LJFF2);
            this.LJLJLJ = LJFF2;
            return false;
        }
        return false;
    }

    public C67076QUe(Context context, C67040QSu c67040QSu) {
        this.LJLJJL = context;
        this.LJLJJI = c67040QSu;
    }

    public final synchronized void LIZIZ(SettingsV2 settingsV2, boolean z) {
        InterfaceC67082QUk c67083QUl;
        if (settingsV2 == null) {
            return;
        }
        C66629QCz.LIZJ("[SocketPoll] start socket poll with settings.");
        if (this.LJLJL != null) {
            this.LJLJL.destroy();
            this.LJLJL = null;
            C66629QCz.LIZJ("[SocketPoll] destroy old one.");
        }
        if (!z || settingsV2.pollIntervalWhenWsConnected == 0) {
            c67083QUl = new C67083QUl();
        } else {
            c67083QUl = new C87868Ye8(this.LJLJI, settingsV2, this.LJLJJLL);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[SocketPoll] start new one. isReadyToPoll = ");
        LIZ.append(c67083QUl);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        c67083QUl.LIZJ(this.LJLIL.get());
        this.LJLJL = c67083QUl;
    }
}
