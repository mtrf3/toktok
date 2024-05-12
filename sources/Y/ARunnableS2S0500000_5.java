package Y;

import X.BZI;
import X.C0A2;
import X.C28787BRn;
import X.C31478CXa;
import X.C32026Cha;
import X.C32129CjF;
import X.C68322mC;
import X.InterfaceC32032Chg;
import X.InterfaceC73573Su9;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ARunnableS2S0500000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        try {
            InterfaceC73573Su9 interfaceC73573Su9 = (InterfaceC73573Su9) this.l0;
            C32026Cha c32026Cha = (C32026Cha) this.l1;
            String str = c32026Cha.LJLJL;
            if (str != null) {
                interfaceC73573Su9.onNext(c32026Cha.LJII(str, (byte[]) this.l2, (String) ((C68322mC) this.l3).element, (InterfaceC32032Chg) this.l4));
            } else {
                o.LJIJI("mUrl");
                throw null;
            }
        } catch (Exception e) {
            ((InterfaceC73573Su9) this.l0).onError(e);
        }
    }

    public final void LIZ$1() {
        int i;
        String str;
        long j;
        Long l;
        C0A2 layoutManager = ((C31478CXa) this.l0).LJLIL.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILLJJLI = linearLayoutManager.LLILLJJLI() - linearLayoutManager.LLILL();
        boolean z = true;
        int i2 = LLILLJJLI + 1;
        Long l2 = (Long) this.l1;
        Long l3 = (Long) this.l2;
        Integer num = (Integer) this.l3;
        int i3 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (i2 < i) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        List<GiftColorInfo> list = (List) this.l4;
        StringBuffer stringBuffer = new StringBuffer("[");
        if (list != null) {
            for (GiftColorInfo giftColorInfo : list) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    stringBuffer.append(",");
                }
                if (giftColorInfo == null || (l = giftColorInfo.colorId) == null) {
                    j = 0;
                } else {
                    j = l.longValue();
                }
                stringBuffer.append(j);
                i3 = i4;
            }
        }
        stringBuffer.append("]");
        BZI LIZ = C28787BRn.LIZ("gift_color_tab_show");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(stringBuffer.toString(), "color_id_set");
        if (o.LJ(valueOf, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_all_show");
        LIZ.LJIJJ(l3, "oncall_color");
        LIZ.LJIJJ(l2, "gift_id");
        LIZ.LJIJJ(C32129CjF.LIZ.LIZ, "guide_from");
        LIZ.LJJIIJZLJL();
    }

    public static final void run$0(ARunnableS2S0500000_5 aRunnableS2S0500000_5) {
        boolean LIZ;
        try {
            aRunnableS2S0500000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0500000_5 aRunnableS2S0500000_5) {
        boolean LIZ;
        try {
            aRunnableS2S0500000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS2S0500000_5(Object obj, C31478CXa c31478CXa, Long l, Long l2, Integer num, List<GiftColorInfo> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = c31478CXa;
        this.l2 = l;
        this.l3 = l2;
        this.l4 = num;
    }
}
