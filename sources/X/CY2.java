package X;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CY2 {
    public final DataChannel LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public C80955Vpv LJ;
    public C80955Vpv LJFF;
    public BQK LJI;
    public BQK LJII;
    public CYG LJIIIIZZ;
    public CYG LJIIIZ;
    public List<CV6> LJIIJ;

    public final void LIZ() {
        C80955Vpv c80955Vpv = this.LJ;
        if (c80955Vpv != null) {
            c80955Vpv.setEnableSizeChange(false);
            c80955Vpv.setEnableFixedSize(false);
        }
        C80955Vpv c80955Vpv2 = this.LJFF;
        if (c80955Vpv2 != null) {
            c80955Vpv2.setEnableSizeChange(false);
            c80955Vpv2.setEnableFixedSize(false);
        }
        C80955Vpv c80955Vpv3 = this.LJ;
        if (c80955Vpv3 != null) {
            c80955Vpv3.setVisibility(8);
        }
        C80955Vpv c80955Vpv4 = this.LJFF;
        if (c80955Vpv4 != null) {
            c80955Vpv4.setVisibility(8);
        }
        BQK bqk = this.LJI;
        if (bqk != null) {
            bqk.LIZIZ = null;
        }
        BQK bqk2 = this.LJII;
        if (bqk2 != null) {
            bqk2.LIZIZ = null;
        }
    }

    public static void LIZLLL(C80955Vpv c80955Vpv) {
        if (c80955Vpv == null) {
            return;
        }
        c80955Vpv.setVisibility(0);
        if (c80955Vpv == null) {
            return;
        }
        c80955Vpv.setEnableSizeChange(true);
        c80955Vpv.setEnableFixedSize(true);
    }

    public final void LIZJ(List<CV6> items) {
        List<CV6> list;
        CharSequence charSequence;
        CharSequence charSequence2;
        o.LJIIIZ(items, "items");
        if (RankOptimizeSetting.INSTANCE.getValue() && (list = this.LJIIJ) != null && list.size() == items.size()) {
            int size = list.size();
            if (size > 2) {
                size = 2;
            }
            for (int i = 0; i < size; i++) {
                if (((CV6) ListProtector.get(list, i)).LIZ.getId() == ((CV6) ListProtector.get(items, i)).LIZ.getId()) {
                    if (i == 0) {
                        CYG cyg = this.LJIIIIZZ;
                        if (cyg != null) {
                            charSequence2 = cyg.LIZ().getText();
                        } else {
                            charSequence2 = null;
                        }
                        if (o.LJ(charSequence2, g0.LJIJI(this.LIZJ, this.LIZLLL, (CV6) ListProtector.get(items, 0)))) {
                        }
                    } else if (i == 1) {
                        CYG cyg2 = this.LJIIIZ;
                        if (cyg2 != null) {
                            charSequence = cyg2.LIZ().getText();
                        } else {
                            charSequence = null;
                        }
                        if (o.LJ(charSequence, g0.LJIJI(this.LIZJ, this.LIZLLL, (CV6) ListProtector.get(items, 1)))) {
                            return;
                        }
                    }
                }
            }
            return;
        }
        if (items.isEmpty()) {
            this.LJIIJ = items;
            LIZ();
            return;
        }
        this.LJIIJ = items;
        if (items.size() == 1) {
            CV6 cv6 = (CV6) ListProtector.get(items, 0);
            LIZLLL(this.LJ);
            C80955Vpv c80955Vpv = this.LJFF;
            if (c80955Vpv != null) {
                c80955Vpv.setEnableSizeChange(false);
                c80955Vpv.setEnableFixedSize(false);
                c80955Vpv.setVisibility(8);
            }
            BQK bqk = this.LJII;
            if (bqk != null) {
                bqk.LIZIZ = null;
            }
            LIZIZ(cv6, 0, this.LJIIIIZZ, this.LJI);
            return;
        }
        if (items.size() == 2) {
            CV6 cv62 = (CV6) ListProtector.get(items, 0);
            CV6 cv63 = (CV6) ListProtector.get(items, 1);
            LIZLLL(this.LJ);
            LIZLLL(this.LJFF);
            LIZIZ(cv62, 0, this.LJIIIIZZ, this.LJI);
            LIZIZ(cv63, 1, this.LJIIIZ, this.LJII);
        }
    }

    public CY2(DataChannel dataChannel, LinearLayout linearLayout, boolean z) {
        boolean z2;
        long j;
        Room room;
        this.LIZ = dataChannel;
        this.LIZIZ = z;
        if (dataChannel != null) {
            z2 = C29306Beo.LJIIJ(dataChannel);
        } else {
            z2 = false;
        }
        this.LIZJ = !z2;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        this.LIZLLL = j;
        this.LJ = (C80955Vpv) linearLayout.findViewById(R.id.dm0);
        this.LJFF = (C80955Vpv) linearLayout.findViewById(R.id.dm1);
        C80955Vpv c80955Vpv = this.LJ;
        if (c80955Vpv != null) {
            this.LJIIIIZZ = new CYG(c80955Vpv);
        }
        C80955Vpv c80955Vpv2 = this.LJFF;
        if (c80955Vpv2 != null) {
            this.LJIIIZ = new CYG(c80955Vpv2);
        }
        LIZ();
        this.LJI = new BQK(dataChannel);
        this.LJII = new BQK(dataChannel);
    }

    public final void LIZIZ(CV6 cv6, int i, CYG cyg, BQK bqk) {
        long j;
        long j2;
        long j3;
        String str;
        DataChannel dataChannel;
        String charSequence;
        int i2;
        CharSequence text;
        CV6 cv62;
        CV6 cv63;
        User user;
        if (bqk != null && (cv63 = bqk.LIZIZ) != null && (user = cv63.LIZ) != null) {
            j = user.getId();
        } else {
            j = 0;
        }
        User user2 = cv6.LIZ;
        if (user2 != null) {
            j2 = user2.getId();
        } else {
            j2 = 0;
        }
        if (bqk != null && (cv62 = bqk.LIZIZ) != null) {
            j3 = cv62.LIZJ;
        } else {
            j3 = 0;
        }
        long j4 = cv6.LIZJ;
        String str2 = "";
        if (cyg == null || (text = cyg.LIZ().getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (cyg != null) {
            Object value = cyg.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-audienceProfile>(...)");
            ImageView imageView = (ImageView) value;
            if (bqk != null) {
                bqk.LIZIZ(imageView, cv6, i);
            }
            Object value2 = cyg.LIZ.getValue();
            o.LJIIIIZZ(value2, "<get-audienceProfile>(...)");
            C16880lQ.LJIILLIIL((ImageView) value2, new CYF(bqk, this, i));
            C47121t6 LIZ = cyg.LIZ();
            if (bqk != null) {
                boolean z = this.LIZIZ;
                long j5 = cv6.LIZIZ;
                if (z && j5 > 0) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                LIZ.setVisibility(i2);
                bqk.LIZJ(LIZ, this.LIZ, cv6, true);
            }
            CharSequence text2 = cyg.LIZ().getText();
            if (text2 != null && (charSequence = text2.toString()) != null) {
                str2 = charSequence;
            }
        }
        if (j3 > 0 && j4 <= 0) {
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                UCH.LJII(i, cv6, dataChannel2);
            }
        } else if ((j2 != j || !TextUtils.equals(str, str2)) && (dataChannel = this.LIZ) != null) {
            UCH.LJII(i, cv6, dataChannel);
        }
        long j6 = cv6.LJ;
        if (j6 == 1 || j6 == 2) {
            UCH.LJIIIIZZ(j4, j6);
        }
        if (bqk == null) {
            return;
        }
        bqk.LIZIZ = cv6;
    }
}
