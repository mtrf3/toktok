package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0a0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09800a0 {
    public final DataChannel LIZ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZIZ;
    public final List<AbstractC09790Zz> LIZJ;
    public int LIZLLL;

    public final boolean LIZIZ() {
        if (this.LIZLLL == ((ArrayList) this.LIZJ).size()) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        Iterator<AbstractC09790Zz> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
    }

    public final void LJ() {
        for (AbstractC09790Zz abstractC09790Zz : this.LIZJ) {
            DataChannel dataChannel = abstractC09790Zz.LIZJ;
            if (dataChannel != null) {
                dataChannel.jv0(abstractC09790Zz);
            }
            abstractC09790Zz.LIZIZ.dispose();
        }
    }

    public final void LIZ(AbstractC09790Zz abstractC09790Zz) {
        abstractC09790Zz.LIZLLL = this;
        DataChannel dataChannel = this.LIZ;
        o.LJIIIZ(dataChannel, "dataChannel");
        abstractC09790Zz.LIZJ = dataChannel;
        ((ArrayList) this.LIZJ).add(abstractC09790Zz);
        LIZJ(abstractC09790Zz.LIZ);
    }

    public final void LIZJ(boolean z) {
        if (!z) {
            int i = this.LIZLLL + 1;
            this.LIZLLL = i;
            if (i == ((ArrayList) this.LIZJ).size()) {
                this.LIZIZ.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        int i2 = this.LIZLLL - 1;
        this.LIZLLL = i2;
        if (i2 == ((ArrayList) this.LIZJ).size()) {
            return;
        }
        this.LIZIZ.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C09800a0(DataChannel dataChannel, InterfaceC88472Yns<? super Boolean, C76800UCe> onStateChange) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(onStateChange, "onStateChange");
        this.LIZ = dataChannel;
        this.LIZIZ = onStateChange;
        this.LIZJ = new ArrayList();
    }
}
