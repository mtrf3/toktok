package X;

import Y.AObserverS73S0100000_5;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdk.revenue.StarCommentPinnedAvoidEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CZN {
    public final StarCommentViewModel LIZ;
    public final LifecycleOwner LIZIZ;
    public final DataChannel LIZJ;
    public CVC LIZLLL;
    public CZV LJ;
    public CSH<? extends CRD> LJFF;
    public CZP LJI;
    public final long LJII;
    public long LJIIIIZZ;
    public final AqS171S0100000_5 LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final AObserverS73S0100000_5 LJIILIIL;
    public final AObserverS73S0100000_5 LJIILJJIL;
    public final AObserverS73S0100000_5 LJIILL;

    public final void LIZIZ(boolean z) {
        if (this.LJIIL != z) {
            this.LJIIL = z;
            this.LIZJ.rv0(StarCommentPinnedAvoidEvent.class, Boolean.valueOf(z));
        }
    }

    public CZN(StarCommentViewModel starCommentViewModel, LifecycleOwner owner, DataChannel dataChannel) {
        long j;
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = starCommentViewModel;
        this.LIZIZ = owner;
        this.LIZJ = dataChannel;
        this.LJ = CZV.UNKNOWN;
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LJII = j;
        this.LJIIIZ = new AqS171S0100000_5(this, 869);
        this.LJIILIIL = new AObserverS73S0100000_5(this, 62);
        this.LJIILJJIL = new AObserverS73S0100000_5(this, 61);
        this.LJIILL = new AObserverS73S0100000_5(this, 63);
    }

    public final CUX LIZ(CZP czp, boolean z, boolean z2) {
        String str;
        AqS171S0100000_5 aqS171S0100000_5;
        List list = null;
        if (czp == null) {
            return null;
        }
        CZW czw = czp.LIZJ;
        CZW czw2 = CZW.DELETED;
        if (czw == czw2) {
            str = "#80FF3B5C";
        } else {
            str = "#66000000";
        }
        Integer valueOf = Integer.valueOf(ColorProtector.parseColor(str));
        ImageModel imageModel = czp.LIZ;
        CharSequence charSequence = czp.LIZIZ;
        if (czp.LIZJ != czw2) {
            aqS171S0100000_5 = this.LJIIIZ;
        } else {
            aqS171S0100000_5 = null;
        }
        if (z) {
            list = C47261Igj.LJJIJ(1);
        }
        return new CUX(valueOf, imageModel, charSequence, aqS171S0100000_5, list, z2);
    }
}
