package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.Record;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class WMM implements InterfaceC82169WMr {
    public final WM7 LIZ;
    public final /* synthetic */ WMI LIZIZ;

    @Override // X.InterfaceC82169WMr
    public final void execute() {
        Record record;
        if (this.LIZIZ.LJFF() == this.LIZ) {
            new C82156WMe(this.LIZIZ, null).execute();
            return;
        }
        List<Record> LIZIZ = this.LIZIZ.LIZIZ.LIZIZ();
        int size = ((ArrayList) LIZIZ).size();
        do {
            size--;
            if (size >= 0) {
                record = (Record) ListProtector.get(LIZIZ, size);
            } else {
                return;
            }
        } while (record.LJLIL != this.LIZ);
        if (size == r5.size() - 2) {
            this.LIZIZ.LIZJ();
        }
        WM7 wm7 = this.LIZ;
        WME wme = wm7.mState;
        WMI.LJI(this.LIZIZ.LIZ, wm7, WME.NONE, null, false, null);
        ((ArrayList) this.LIZIZ.LIZIZ.LIZ).remove(record);
        if (size > 0) {
            WMI.LJI(this.LIZIZ.LIZ, ((Record) ListProtector.get(LIZIZ, size - 1)).LJLIL, wme, null, false, null);
        }
    }

    public WMM(WMI wmi, WM7 wm7) {
        this.LIZIZ = wmi;
        this.LIZ = wm7;
    }
}
