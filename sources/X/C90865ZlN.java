package X;

import Y.IDRunnableS7S0101000_24;
import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.ZlN, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90865ZlN extends AbstractC90599Zh5 {
    public final String LJFF;
    public final MediaRouter2.RoutingController LJI;
    public final Messenger LJII;
    public final Messenger LJIIIIZZ;
    public final Handler LJIIJ;
    public final /* synthetic */ C90597Zh3 LJIILJJIL;
    public final SparseArray<AbstractC90104ZXw> LJIIIZ = new SparseArray<>();
    public final AtomicInteger LJIIJJI = new AtomicInteger(1);
    public final Runnable LJIIL = new IDRunnableS7S0101000_24(0, this, 3);
    public int LJIILIIL = -1;

    @Override // X.AbstractC90096ZXo
    public final void LJ() {
        this.LJI.release();
    }

    @Override // X.AbstractC90096ZXo
    public final void LJI(int i) {
        MediaRouter2.RoutingController routingController = this.LJI;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.LJIILIIL = i;
        this.LJIIJ.removeCallbacks(this.LJIIL);
        this.LJIIJ.postDelayed(this.LJIIL, 1000L);
    }

    @Override // X.AbstractC90096ZXo
    public final void LJIIIZ(int i) {
        MediaRouter2.RoutingController routingController = this.LJI;
        if (routingController == null) {
            return;
        }
        int i2 = this.LJIILIIL;
        if (i2 < 0) {
            i2 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i2 + i, this.LJI.getVolumeMax()));
        this.LJIILIIL = max;
        this.LJI.setVolume(max);
        this.LJIIJ.removeCallbacks(this.LJIIL);
        this.LJIIJ.postDelayed(this.LJIIL, 1000L);
    }

    @Override // X.AbstractC90599Zh5
    public final void LJIILIIL(String str) {
        MediaRoute2Info LJIIZILJ;
        if (str == null || str.isEmpty() || (LJIIZILJ = this.LJIILJJIL.LJIIZILJ(str)) == null) {
            return;
        }
        this.LJI.selectRoute(LJIIZILJ);
    }

    @Override // X.AbstractC90599Zh5
    public final void LJIILJJIL(String str) {
        MediaRoute2Info LJIIZILJ;
        if (str == null || str.isEmpty() || (LJIIZILJ = this.LJIILJJIL.LJIIZILJ(str)) == null) {
            return;
        }
        this.LJI.deselectRoute(LJIIZILJ);
    }

    @Override // X.AbstractC90599Zh5
    public final void LJIILL(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        MediaRoute2Info LJIIZILJ = this.LJIILJJIL.LJIIZILJ((String) ListProtector.get(list, 0));
        if (LJIIZILJ == null) {
            return;
        }
        this.LJIILJJIL.LJLJLLL.transferTo(LJIIZILJ);
    }

    @Override // X.AbstractC90096ZXo
    public final boolean LIZLLL(Intent intent, AbstractC90104ZXw abstractC90104ZXw) {
        MediaRouter2.RoutingController routingController = this.LJI;
        if (routingController != null && !routingController.isReleased() && this.LJII != null) {
            int andIncrement = this.LJIIJJI.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 9;
            obtain.arg1 = andIncrement;
            obtain.obj = intent;
            obtain.replyTo = this.LJIIIIZZ;
            try {
                this.LJII.send(obtain);
                if (abstractC90104ZXw != null) {
                    this.LJIIIZ.put(andIncrement, abstractC90104ZXw);
                    return true;
                }
                return true;
            } catch (DeadObjectException | RemoteException unused) {
            }
        }
        return false;
    }

    public C90865ZlN(C90597Zh3 c90597Zh3, MediaRouter2.RoutingController routingController, String str) {
        Bundle controlHints;
        Messenger messenger;
        this.LJIILJJIL = c90597Zh3;
        this.LJI = routingController;
        this.LJFF = str;
        if (routingController == null || (controlHints = routingController.getControlHints()) == null) {
            messenger = null;
        } else {
            messenger = (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        }
        this.LJII = messenger;
        this.LJIIIIZZ = messenger != null ? new Messenger(new HandlerC90082ZXa(this)) : null;
        this.LJIIJ = new Handler(C16880lQ.LLJJJJ());
    }
}
