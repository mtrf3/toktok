package X;

import com.ss.android.ugc.aweme.im.message.template.card.botanswercard.BotAnswerCardItemComponent;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SG0 implements InterfaceC57784Mm4 {
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public final BotAnswerCardItemComponent LJLJI;
    public final SG1 LJLJJI;
    public final Integer LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SG0)) {
            return false;
        }
        SG0 sg0 = (SG0) obj;
        return this.LJLIL == sg0.LJLIL && this.LJLILLLLZI == sg0.LJLILLLLZI && o.LJ(this.LJLJI, sg0.LJLJI) && o.LJ(this.LJLJJI, sg0.LJLJJI) && o.LJ(this.LJLJJL, sg0.LJLJJL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LJLIL * 31;
        boolean z = this.LJLILLLLZI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int hashCode = (this.LJLJI.hashCode() + ((i + i2) * 31)) * 31;
        SG1 sg1 = this.LJLJJI;
        int hashCode2 = (hashCode + (sg1 == null ? 0 : sg1.hashCode())) * 31;
        Integer num = this.LJLJJL;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoItem(index=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showSup=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", item=");
        LIZ.append(this.LJLJI);
        LIZ.append(", action=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", videoCount=");
        return s0.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public SG0(int i, boolean z, BotAnswerCardItemComponent item, SG1 sg1, Integer num) {
        o.LJIIIZ(item, "item");
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = item;
        this.LJLJJI = sg1;
        this.LJLJJL = num;
    }
}
