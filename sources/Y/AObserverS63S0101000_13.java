package Y;

import X.C15380j0;
import X.C40675Fxn;
import X.C78069UkT;
import X.C78071UkV;
import X.C78078Ukc;
import X.EnumC78089Ukn;
import X.EnumC78090Uko;
import X.ORZ;
import X.UQ8;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.dataChannel.GiftTrayHeightChangeChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.friends.service.SocialFriendsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AObserverS63S0101000_13 implements Observer {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS63S0101000_13 aObserverS63S0101000_13, Object obj) {
        ((SocialFriendsService) aObserverS63S0101000_13.l0).LJIIIZ((UQ8) obj, aObserverS63S0101000_13.i1);
    }

    public static final void onChanged$1(AObserverS63S0101000_13 aObserverS63S0101000_13, Object obj) {
        EnumC78089Ukn currentStyle;
        Resources resources;
        float f;
        boolean z;
        float f2;
        Object obj2;
        DataChannel dataChannel;
        EnumC78089Ukn currentStyle2;
        C78071UkV c78071UkV = (C78071UkV) aObserverS63S0101000_13.l0;
        int i = aObserverS63S0101000_13.i1;
        if (c78071UkV.LIZIZ.size() != 2) {
            return;
        }
        List LLJILJILJ = ORZ.LLJILJILJ(c78071UkV.LIZIZ);
        if (((ArrayList) LLJILJILJ).size() > 1) {
            C40675Fxn.LJJLIIIJ(LLJILJILJ, new IDComparatorS37S0000000_9(11));
        }
        C78078Ukc c78078Ukc = ((C78069UkT) ORZ.LJLLJ(LLJILJILJ)).LJIIIIZZ;
        if (c78078Ukc == null || (currentStyle = c78078Ukc.getCurrentStyle()) == null) {
            return;
        }
        int defaultHeightDimen = currentStyle.getDefaultHeightDimen();
        Context applicationContext = GlobalContext.getApplicationContext();
        if (applicationContext == null || (resources = applicationContext.getResources()) == null) {
            return;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(defaultHeightDimen);
        C78078Ukc c78078Ukc2 = ((C78069UkT) ORZ.LJLLJ(LLJILJILJ)).LJIIIIZZ;
        if (c78078Ukc2 != null && (currentStyle2 = c78078Ukc2.getCurrentStyle()) != null) {
            f = currentStyle2.getGapDp();
        } else {
            f = 0.0f;
        }
        int LIZ = C15380j0.LIZ(f);
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (LiveMultiHostGiftTrayOptSetting.INSTANCE.isSmallDevice()) {
            f2 = 28.0f;
        } else {
            f2 = 8.0f;
        }
        int LIZ2 = C15380j0.LIZ(f2);
        if (!z) {
            LIZ2 = 0;
        }
        EnumC78090Uko enumC78090Uko = ((C78069UkT) ORZ.LLFF(LLJILJILJ)).LIZLLL;
        EnumC78090Uko enumC78090Uko2 = EnumC78090Uko.IDLE;
        if (enumC78090Uko != enumC78090Uko2) {
            dimensionPixelSize = (dimensionPixelSize * 2) + LIZ;
        } else if (((C78069UkT) ORZ.LJLLJ(LLJILJILJ)).LIZLLL == enumC78090Uko2) {
            dimensionPixelSize = 0;
        }
        int i2 = LIZ2 + dimensionPixelSize;
        DataChannel dataChannel2 = c78071UkV.LIZLLL;
        if (dataChannel2 == null || (obj2 = dataChannel2.kv0(GiftTrayHeightChangeChannel.class)) == null) {
            obj2 = 0;
        }
        if (o.LJ(obj2, Integer.valueOf(i2)) || (dataChannel = c78071UkV.LIZLLL) == null) {
            return;
        }
        dataChannel.rv0(GiftTrayHeightChangeChannel.class, Float.valueOf(i2));
    }

    public AObserverS63S0101000_13(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
