package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OKB implements InterfaceC31687Cc7 {
    public final /* synthetic */ OKL LIZ;

    public OKB(OKL okl) {
        this.LIZ = okl;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        ActivityC45651qj context;
        Long l;
        Long l2;
        Long l3;
        User owner;
        A72 a72 = this.LIZ.LJLJJI;
        if (a72 != null && (context = a72.getContext()) != null) {
            OKL okl = this.LIZ;
            String LIZJ = C31461Li.LIZJ("live_ba_leads_gen_schema", "", "getInstance().getStringV…chemaSetting::class.java)");
            if (LIZJ.length() == 0) {
                C78983UzD.LJIILL("Leads gen's schema is null during live");
                return;
            }
            Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
            Room room = okl.LJLJI;
            Long l4 = null;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("room_id", String.valueOf(l)).appendQueryParameter("enter_from", "during_live");
            Room room2 = okl.LJLJI;
            if (room2 != null) {
                l2 = Long.valueOf(room2.getOwnerUserId());
            } else {
                l2 = null;
            }
            String builder = appendQueryParameter.appendQueryParameter("ba_uid", String.valueOf(l2)).toString();
            o.LJIIIIZZ(builder, "parse(schema).buildUpon(…              .toString()");
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJIJLIJ(builder);
            sparkContext.LJJIIJ("container_bg_color", "00000000");
            c40342FsQ.getClass();
            C40342FsQ.LIZ(context, sparkContext).LIZIZ();
            Room room3 = okl.LJLJI;
            if (room3 != null) {
                l3 = Long.valueOf(room3.getId());
            } else {
                l3 = null;
            }
            String valueOf = String.valueOf(l3);
            Room room4 = okl.LJLJI;
            if (room4 != null && (owner = room4.getOwner()) != null) {
                l4 = Long.valueOf(owner.getId());
            }
            NIJ.LIZIZ(0, 1, valueOf, String.valueOf(l4), str);
        }
    }
}
