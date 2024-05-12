package Y;

import X.C09900aA;
import X.C09O;
import X.C09R;
import X.C09T;
import X.C09U;
import X.C15070iV;
import X.C1BI;
import X.C31811Ce7;
import X.C64096PDo;
import X.X1D;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudiencePromoteGameCardWidget;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.UserInfo;
import defpackage.i0;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IDRunnableS0S1300000 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C09O orDefault = ((C09T) this.l3).LIZ.LJLJJI.getOrDefault(((C1BI) ((C09U) this.l1)).LIZ(), null);
        if (orDefault == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = ((C09T) this.l3).LIZ;
        String str = this.s0;
        IBinder iBinder = (IBinder) this.l2;
        mediaBrowserServiceCompat.getClass();
        if (iBinder == null) {
            orDefault.LJLJJL.remove(str);
            return;
        }
        List<C15070iV<IBinder, Bundle>> list = orDefault.LJLJJL.get(str);
        if (list != null) {
            Iterator<C15070iV<IBinder, Bundle>> it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == it.next().LIZ) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                orDefault.LJLJJL.remove(str);
            }
        }
    }

    public final void LIZ$1() {
        if (((C09T) this.l3).LIZ.LJLJJI.getOrDefault(((C1BI) ((C09U) this.l1)).LIZ(), null) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = ((C09T) this.l3).LIZ;
        final String str = this.s0;
        final ResultReceiver resultReceiver = (ResultReceiver) this.l2;
        mediaBrowserServiceCompat.getClass();
        C09R<MediaBrowserCompat.MediaItem> c09r = new C09R<MediaBrowserCompat.MediaItem>(str) { // from class: X.1BK
            @Override // X.C09R
            public final void LIZIZ() {
                if ((this.LIZLLL & 2) != 0) {
                    resultReceiver.LIZIZ(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", null);
                resultReceiver.LIZIZ(0, bundle);
            }
        };
        c09r.LIZLLL = 2;
        c09r.LIZJ();
        if (c09r.LIZ()) {
        } else {
            throw new IllegalStateException(i0.LJFF("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }

    public final void LIZ$2() {
        if (((C09T) this.l3).LIZ.LJLJJI.getOrDefault(((C1BI) ((C09U) this.l1)).LIZ(), null) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = ((C09T) this.l3).LIZ;
        final String str = this.s0;
        final ResultReceiver resultReceiver = (ResultReceiver) this.l2;
        mediaBrowserServiceCompat.getClass();
        C09R<List<MediaBrowserCompat.MediaItem>> c09r = new C09R<List<MediaBrowserCompat.MediaItem>>(str) { // from class: X.1BL
            @Override // X.C09R
            public final void LIZIZ() {
                resultReceiver.LIZIZ(-1, null);
            }
        };
        c09r.LIZLLL = 4;
        c09r.LIZJ();
        if (c09r.LIZ()) {
        } else {
            throw new IllegalStateException(i0.LJFF("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }

    public final void LIZ$3() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateShowGameCard  isFromMessage ");
        C31811Ce7.LJ(LIZ, this.s0, LIZ, "PartnershipAudience");
        GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget = (GamePartnershipAudiencePromoteGameCardWidget) this.l1;
        gamePartnershipAudiencePromoteGameCardWidget.LLF(gamePartnershipAudiencePromoteGameCardWidget.LJZI((BriefGameTask) this.l2, (UserInfo) this.l3));
        ((GamePartnershipAudiencePromoteGameCardWidget) this.l1).LJZL(true, (BriefGameTask) this.l2, this.s0, (UserInfo) this.l3);
    }

    public static final void run$0(IDRunnableS0S1300000 iDRunnableS0S1300000) {
        boolean LIZ;
        try {
            iDRunnableS0S1300000.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS0S1300000 iDRunnableS0S1300000) {
        boolean LIZ;
        try {
            iDRunnableS0S1300000.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS0S1300000 iDRunnableS0S1300000) {
        boolean LIZ;
        try {
            iDRunnableS0S1300000.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS0S1300000 iDRunnableS0S1300000) {
        boolean LIZ;
        try {
            JSONObject LIZ2 = new C64096PDo(iDRunnableS0S1300000.s0, 0, null, (JSONObject) iDRunnableS0S1300000.l1, (JSONObject) iDRunnableS0S1300000.l2, (JSONObject) iDRunnableS0S1300000.l3).LIZ();
            if (LIZ2 != null) {
                C09900aA.LJIILLIIL("monitorEvent", LIZ2.toString());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS0S1300000 iDRunnableS0S1300000) {
        boolean LIZ;
        try {
            JSONObject LIZ2 = new C64096PDo(iDRunnableS0S1300000.s0, 0, null, (JSONObject) iDRunnableS0S1300000.l1, (JSONObject) iDRunnableS0S1300000.l2, (JSONObject) iDRunnableS0S1300000.l3).LIZ();
            if (LIZ2 != null) {
                C09900aA.LJIILLIIL("monitorEvent", LIZ2.toString());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS0S1300000 iDRunnableS0S1300000) {
        boolean LIZ;
        try {
            iDRunnableS0S1300000.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS0S1300000(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l1 = obj2;
        this.s0 = str;
        this.l2 = obj3;
    }

    public IDRunnableS0S1300000(C09T c09t, C1BI c1bi, String str, Bundle bundle, ResultReceiver resultReceiver, int i) {
        this.$t = i;
        this.l3 = c09t;
        this.l1 = c1bi;
        this.s0 = str;
        this.l2 = resultReceiver;
    }
}
