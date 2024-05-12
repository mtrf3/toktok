package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.mediarouter.media.MediaRouteProviderService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes29.dex */
public class ZXV implements IBinder.DeathRecipient {
    public final Messenger LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public C90524Zfs LJLJJI;
    public final SparseArray<AbstractC90096ZXo> LJLJJL = new SparseArray<>();
    public final C90593Zgz LJLJJLL = new C90593Zgz(this);
    public final /* synthetic */ C90595Zh1 LJLJL;

    public final void LIZLLL() {
        int size = this.LJLJJL.size();
        for (int i = 0; i < size; i++) {
            this.LJLJJL.valueAt(i).LJ();
        }
        this.LJLJJL.clear();
        this.LJLIL.getBinder().unlinkToDeath(this, 0);
        if (!Objects.equals(this.LJLJJI, null)) {
            this.LJLJJI = null;
            this.LJLJL.LJI();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.LJLJL.LIZ.LJLILLLLZI.obtainMessage(1, this.LJLIL).sendToTarget();
    }

    public final String toString() {
        Messenger messenger = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Client connection ");
        LIZ.append(messenger.getBinder().toString());
        return X1D.LIZIZ(LIZ);
    }

    public Bundle LIZ(C90099ZXr c90099ZXr) {
        return MediaRouteProviderService.LIZ(c90099ZXr, this.LJLILLLLZI);
    }

    public final AbstractC90096ZXo LJ(int i) {
        return this.LJLJJL.get(i);
    }

    public boolean LJFF(int i) {
        AbstractC90096ZXo abstractC90096ZXo = this.LJLJJL.get(i);
        if (abstractC90096ZXo != null) {
            this.LJLJJL.remove(i);
            abstractC90096ZXo.LJ();
            return true;
        }
        return false;
    }

    public Bundle LIZIZ(int i, String str) {
        AbstractC90599Zh5 LJIIJJI;
        if (this.LJLJJL.indexOfKey(i) < 0 && (LJIIJJI = this.LJLJL.LIZ.LJLJJI.LJIIJJI(str)) != null) {
            Context applicationContext = this.LJLJL.LIZ.getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            LJIIJJI.LJIILLIIL(C04330Ez.LIZLLL(applicationContext), this.LJLJJLL);
            this.LJLJJL.put(i, LJIIJJI);
            Bundle bundle = new Bundle();
            bundle.putString("groupableTitle", LJIIJJI.LJIIJ());
            bundle.putString("transferableTitle", LJIIJJI.LJIIJJI());
            return bundle;
        }
        return null;
    }

    public boolean LIZJ(int i, String str, String str2) {
        AbstractC90096ZXo LJIILIIL;
        if (this.LJLJJL.indexOfKey(i) < 0) {
            if (str2 == null) {
                LJIILIIL = this.LJLJL.LIZ.LJLJJI.LJIIL(str);
            } else {
                LJIILIIL = this.LJLJL.LIZ.LJLJJI.LJIILIIL(str, str2);
            }
            if (LJIILIIL != null) {
                this.LJLJJL.put(i, LJIILIIL);
                return true;
            }
            return false;
        }
        return false;
    }

    public void LJI(AbstractC90599Zh5 abstractC90599Zh5, C90089ZXh c90089ZXh, Collection<C90092ZXk> collection) {
        int indexOfValue = this.LJLJJL.indexOfValue(abstractC90599Zh5);
        if (indexOfValue < 0) {
            return;
        }
        int keyAt = this.LJLJJL.keyAt(indexOfValue);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C90092ZXk c90092ZXk : collection) {
            if (c90092ZXk.LJFF == null) {
                Bundle bundle = new Bundle();
                c90092ZXk.LJFF = bundle;
                bundle.putBundle("mrDescriptor", c90092ZXk.LIZ.LIZ);
                c90092ZXk.LJFF.putInt("selectionState", c90092ZXk.LIZIZ);
                c90092ZXk.LJFF.putBoolean("isUnselectable", c90092ZXk.LIZJ);
                c90092ZXk.LJFF.putBoolean("isGroupable", c90092ZXk.LIZLLL);
                c90092ZXk.LJFF.putBoolean("isTransferable", c90092ZXk.LJ);
            }
            arrayList.add(c90092ZXk.LJFF);
        }
        Bundle bundle2 = new Bundle();
        if (c90089ZXh != null) {
            bundle2.putParcelable("groupRoute", c90089ZXh.LIZ);
        }
        bundle2.putParcelableArrayList("dynamicRoutes", arrayList);
        MediaRouteProviderService.LJ(this.LJLIL, 7, 0, keyAt, bundle2, null);
    }

    public ZXV(C90595Zh1 c90595Zh1, Messenger messenger, int i, String str) {
        this.LJLJL = c90595Zh1;
        this.LJLIL = messenger;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
    }
}
