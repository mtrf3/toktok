package X;

import android.app.Activity;
import com.bef.effectsdk.message.MessageCenter;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.6nt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171296nt implements MessageCenter.Listener {
    public final Activity LJLIL;
    public final HashMap<Integer, C171316nv> LJLILLLLZI = new HashMap<>();
    public int LJLJI;

    public C171296nt(Activity activity) {
        this.LJLIL = activity;
    }

    public final void LIZ(int i) {
        if (this.LJLILLLLZI.get(Integer.valueOf(i)) == null) {
            MessageCenter.addListener(this);
            this.LJLILLLLZI.put(Integer.valueOf(i), new C171316nv(0, true, false));
            this.LJLJI = i;
            return;
        }
        for (Map.Entry<Integer, C171316nv> entry : this.LJLILLLLZI.entrySet()) {
            if (entry.getKey().intValue() == i && !entry.getValue().LJLILLLLZI) {
                MessageCenter.addListener(this);
                entry.getValue().LJLILLLLZI = true;
                entry.getValue().LJLIL = 0;
                this.LJLJI = i;
            }
        }
    }

    public final void LIZIZ(int i) {
        MessageCenter.removeListener(this);
        for (Map.Entry<Integer, C171316nv> entry : this.LJLILLLLZI.entrySet()) {
            if (entry.getKey().intValue() == i) {
                entry.getValue().LJLILLLLZI = false;
                entry.getValue().LJLIL = 0;
            }
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 81) {
            for (Map.Entry<Integer, C171316nv> entry : this.LJLILLLLZI.entrySet()) {
                if (entry.getKey().intValue() == this.LJLJI) {
                    entry.getValue().LJLIL++;
                }
            }
            C171316nv c171316nv = this.LJLILLLLZI.get(Integer.valueOf(this.LJLJI));
            if (c171316nv != null && c171316nv.LJLIL == 3 && !c171316nv.LJLJI) {
                C6QQ.LIZ(new AqS152S0100000_2(this, 1072));
                c171316nv.LJLJI = true;
                this.LJLILLLLZI.put(Integer.valueOf(this.LJLJI), c171316nv);
            }
        }
    }
}
