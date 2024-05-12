package X;

import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CQQ {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Room LJI;
    public final User LJII;
    public DataChannel LJIIIIZZ;
    public final InterfaceC31407CUh LJIIIZ;
    public final CQP LJIIJ;
    public final long LJIIJJI;
    public long LJIIL;
    public final C5H3 LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIILL;
    public final long LJIILLIIL;
    public boolean LJIIZILJ;
    public CRY LJIJ;
    public int LJIJI;
    public long LJIJJ;
    public final C5H3 LJIJJLI;

    public final int LIZIZ() {
        return ((Number) this.LJIILIIL.getValue()).intValue();
    }

    public final User LIZJ() {
        DataChannel dataChannel = this.LJIIIIZZ;
        if (dataChannel != null) {
            return (User) dataChannel.kv0(RoomUserChannel.class);
        }
        return null;
    }

    public final long LIZLLL() {
        long LIZ;
        if (this.LJIIL == 0) {
            User LIZJ = LIZJ();
            if (LIZJ != null) {
                LIZ = LIZJ.getId();
            } else {
                LIZ = C025908h.LIZ();
            }
            this.LJIIL = LIZ;
        }
        return this.LJIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        boolean z = this.LIZJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z2 = this.LIZLLL;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.LJ;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        if (!this.LJFF) {
            i = 0;
        }
        int i8 = (i7 + i) * 31;
        Room room = this.LJI;
        int i9 = 0;
        if (room == null) {
            hashCode = 0;
        } else {
            hashCode = room.hashCode();
        }
        int i10 = (i8 + hashCode) * 31;
        User user = this.LJII;
        if (user == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = user.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        DataChannel dataChannel = this.LJIIIIZZ;
        if (dataChannel != null) {
            i9 = dataChannel.hashCode();
        }
        return this.LJIIJ.hashCode() + ((this.LJIIIZ.hashCode() + ((i11 + i9) * 31)) * 31);
    }

    public final String toString() {
        return "PublicScreenContext(context=" + this.LIZ + ", owner=" + this.LIZIZ + ", isRtl=" + this.LIZJ + ", isPortrait=" + this.LIZLLL + ", isTranslationEnabled=" + this.LJ + ", isAnchor=" + this.LJFF + ", room=" + this.LJI + ", anchor=" + this.LJII + ", dataChannel=" + this.LJIIIIZZ + ", publicScreenConfigurationProvider=" + this.LJIIIZ + ", presenter=" + this.LJIIJ + ')';
    }

    public final void LIZ(TextView textView) {
        o.LJIIIZ(textView, "textView");
        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
        boolean z = this.LIZLLL;
        iPublicScreenService.bu0(z);
        if (z) {
            textView.setShadowLayer(textView.getContext().getResources().getDimension(R.dimen.afr), 0.0f, textView.getContext().getResources().getDimension(R.dimen.afs), ((Number) this.LJIJJLI.getValue()).intValue());
        } else {
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    public final void LJFF(CQL model) {
        o.LJIIIZ(model, "model");
        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
        if (iPublicScreenService != null) {
            iPublicScreenService.IX(this.LJIIJJI, model);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CQQ)) {
            return false;
        }
        CQQ cqq = (CQQ) obj;
        if (o.LJ(this.LIZ, cqq.LIZ) && o.LJ(this.LIZIZ, cqq.LIZIZ) && this.LIZJ == cqq.LIZJ && this.LIZLLL == cqq.LIZLLL && this.LJ == cqq.LJ && this.LJFF == cqq.LJFF && o.LJ(this.LJI, cqq.LJI) && o.LJ(this.LJII, cqq.LJII) && o.LJ(this.LJIIIIZZ, cqq.LJIIIIZZ) && o.LJ(this.LJIIIZ, cqq.LJIIIZ) && o.LJ(this.LJIIJ, cqq.LJIIJ)) {
            return true;
        }
        return false;
    }

    public final void LJ(CQO<? extends CR6> cqo, C30779C6d c30779C6d) {
        this.LJIIJ.LJJIIZ(cqo, c30779C6d);
    }

    public final void LJI(CQL model, C31306CQk c31306CQk) {
        o.LJIIIZ(model, "model");
        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
        if (iPublicScreenService != null) {
            iPublicScreenService.df0(this.LJIIJJI, model, c31306CQk);
        }
    }

    public CQQ(Context context, LifecycleOwner owner, boolean z, boolean z2, boolean z3, boolean z4, Room room, User user, DataChannel dataChannel, InterfaceC31407CUh publicScreenConfigurationProvider, CQP presenter) {
        long j;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(publicScreenConfigurationProvider, "publicScreenConfigurationProvider");
        o.LJIIIZ(presenter, "presenter");
        this.LIZ = context;
        this.LIZIZ = owner;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = room;
        this.LJII = user;
        this.LJIIIIZZ = dataChannel;
        this.LJIIIZ = publicScreenConfigurationProvider;
        this.LJIIJ = presenter;
        this.LJIIJJI = room.getId();
        this.LJIILIIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 286));
        if (user != null) {
            j = user.getId();
        } else {
            j = 0;
        }
        this.LJIILLIIL = j;
        this.LJIJJLI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 287));
    }
}
