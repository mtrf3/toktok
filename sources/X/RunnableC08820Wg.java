package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.0Wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC08820Wg implements Runnable {
    public DataChannel LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public C08810Wf LJLJJI;

    public final void LIZ() {
        String str;
        String str2;
        String str3;
        Integer num;
        Float f;
        Integer num2;
        C32021Nm.LJ = true;
        BZI LIZ = C28787BRn.LIZ("live_take_filter_effective_use");
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel == null) {
            LIZ.LJIIZILJ();
        } else {
            LIZ.LJIILLIIL(dataChannel);
        }
        if (this.LJLJI) {
            str = "click";
        } else {
            str = "draw";
        }
        LIZ.LIZJ(str);
        C08810Wf c08810Wf = this.LJLJJI;
        Integer num3 = null;
        if (c08810Wf != null) {
            str2 = c08810Wf.LIZ;
        } else {
            str2 = null;
        }
        LIZ.LJIJJ(str2, "filter_id");
        C08810Wf c08810Wf2 = this.LJLJJI;
        if (c08810Wf2 != null) {
            str3 = c08810Wf2.LIZIZ;
        } else {
            str3 = null;
        }
        LIZ.LJIJJ(str3, "resource_id");
        LIZ.LJIJJ(Integer.valueOf(this.LJLILLLLZI ? 1 : 0), "is_live_take_default");
        C08810Wf c08810Wf3 = this.LJLJJI;
        if (c08810Wf3 != null) {
            num = Integer.valueOf(c08810Wf3.LJFF);
        } else {
            num = null;
        }
        LIZ.LJIJJ(num, "impr_position");
        C08810Wf c08810Wf4 = this.LJLJJI;
        if (c08810Wf4 != null) {
            f = Float.valueOf(c08810Wf4.LIZJ);
        } else {
            f = null;
        }
        LIZ.LJIL("filter_value", f);
        C08810Wf c08810Wf5 = this.LJLJJI;
        if (c08810Wf5 != null) {
            num2 = Integer.valueOf(c08810Wf5.LIZLLL);
        } else {
            num2 = null;
        }
        C08810Wf c08810Wf6 = this.LJLJJI;
        if (c08810Wf6 != null) {
            num3 = Integer.valueOf(c08810Wf6.LJ);
        }
        LIZ.LJIJJ(Integer.valueOf(o.LJ(num2, num3) ? 1 : 0), "is_default_value");
        LIZ.LJJIIZI();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
