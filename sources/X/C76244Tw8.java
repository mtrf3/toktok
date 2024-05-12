package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Tw8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76244Tw8 implements InterfaceC75940TrE {
    public C75883TqJ LJII;
    public long LJIIIIZZ;
    public List<TeamUsersInfo> LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public List<TeamUsersInfo> LJIILIIL;
    public Long LJIILJJIL;
    public List<TeamUsersInfo> LJIILL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public final MutableLiveData<Long> LIZ = new MutableLiveData<>();
    public final MutableLiveData<List<C75883TqJ>> LIZIZ = new MutableLiveData<>();
    public List<C75883TqJ> LIZJ = new ArrayList();
    public final MutableLiveData<Long> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<List<C75883TqJ>> LJ = new MutableLiveData<>();
    public final MutableLiveData<List<C75883TqJ>> LJFF = new MutableLiveData<>();
    public final MutableLiveData<java.util.Map<Long, Boolean>> LJI = new MutableLiveData<>();
    public final C278417k<Long, Boolean> LJIILLIIL = new C278417k<>();

    public static long LIZ() {
        return C76265TwT.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC75940TrE
    public final void onCleared() {
        this.LIZ.setValue(null);
        this.LIZIZ.setValue(null);
        this.LIZLLL.setValue(null);
        this.LJ.setValue(null);
        this.LJFF.setValue(null);
        this.LJI.setValue(null);
        this.LJIILL = null;
        this.LJIIZILJ = false;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = null;
        this.LJIJ = false;
    }

    public final void LIZIZ() {
        this.LIZJ = C8E.LIZLLL().LJIILJJIL();
        this.LIZLLL.setValue(null);
        this.LJ.setValue(null);
        this.LJFF.setValue(null);
        this.LJI.setValue(null);
        this.LJIIZILJ = false;
        this.LJIIIZ = null;
        this.LJIJ = false;
    }
}
