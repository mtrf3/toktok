package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.vesdk.VEInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.WYc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82466WYc implements InterfaceC63875P5b {
    public int LIZ;
    public final /* synthetic */ C82495WZf LIZIZ;
    public final /* synthetic */ C82497WZh LIZJ;

    @Override // X.InterfaceC63875P5b
    public final void onError(int i, int i2, String str) {
    }

    @Override // X.InterfaceC63875P5b
    public final void LIZ(int i) {
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
            return;
        }
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
            this.LIZIZ.LIZIZ = true;
        } else {
            if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP) {
                return;
            }
            this.LIZIZ.LIZIZ = false;
        }
    }

    public C82466WYc(C82495WZf c82495WZf, C82497WZh c82497WZh) {
        this.LIZIZ = c82495WZf;
        this.LIZJ = c82497WZh;
    }

    @Override // X.InterfaceC63875P5b
    public final void LIZIZ(int i, byte[] bArr) {
        List<Byte> subList;
        int i2 = this.LIZ;
        this.LIZ = i2 + 1;
        if (i2 % 100 == 0) {
            C61897OQz c61897OQz = new C61897OQz(bArr);
            if (c61897OQz.LIZJ() > 4) {
                subList = c61897OQz.subList(0, 4);
            } else {
                subList = c61897OQz.subList(0, c61897OQz.LIZJ() - 1);
            }
            Objects.toString(subList);
        }
        if (!this.LIZIZ.LIZIZ) {
            return;
        }
        if (!this.LIZJ.LLII) {
            this.LIZIZ.getClass();
            int i3 = 105600 / i;
            ((ArrayList) this.LIZIZ.LIZLLL).add(bArr);
            while (((ArrayList) this.LIZIZ.LIZLLL).size() > i3) {
                ListProtector.remove(this.LIZIZ.LIZLLL, 0);
            }
        } else {
            if (!((ArrayList) this.LIZIZ.LIZLLL).isEmpty()) {
                List LLIILII = ORZ.LLIILII(this.LIZIZ.LIZLLL);
                C82495WZf c82495WZf = this.LIZIZ;
                Iterator it = LLIILII.iterator();
                while (it.hasNext()) {
                    c82495WZf.LIZJ.invoke(it.next());
                }
                ((ArrayList) this.LIZIZ.LIZLLL).clear();
            }
            this.LIZIZ.LIZJ.invoke(bArr);
        }
        C82497WZh c82497WZh = this.LIZJ;
        c82497WZh.getClass();
        c82497WZh.LIZJ(2, bArr);
    }
}
