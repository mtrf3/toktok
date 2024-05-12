package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.69M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69M {
    public final List<Utterance> LIZ;
    public int LIZIZ;
    public int LIZJ;

    public C69M(List<Utterance> sortedUtterances) {
        o.LJIIIZ(sortedUtterances, "sortedUtterances");
        this.LIZ = sortedUtterances;
        this.LIZJ = -1;
    }

    public final String LIZ(int i) {
        if (i < 0) {
            return null;
        }
        int i2 = this.LIZJ;
        if (i > i2) {
            int size = this.LIZ.size();
            for (int i3 = this.LIZIZ; i3 < size; i3++) {
                long j = i;
                if (j < ((Utterance) ListProtector.get(this.LIZ, i3)).getStartTime()) {
                    return null;
                }
                if (((Utterance) ListProtector.get(this.LIZ, i3)).getStartTime() <= j && j < ((Utterance) ListProtector.get(this.LIZ, i3)).getEndTime()) {
                    String text = ((Utterance) ListProtector.get(this.LIZ, i3)).getText();
                    this.LIZIZ = i3;
                    this.LIZJ = i;
                    return text;
                }
            }
            return null;
        }
        if (i == i2) {
            Utterance utterance = (Utterance) ORZ.LJLLLLLL(this.LIZIZ, this.LIZ);
            if (utterance == null) {
                return null;
            }
            return utterance.getText();
        }
        for (int i4 = this.LIZIZ; -1 < i4; i4--) {
            long j2 = i;
            if (j2 > ((Utterance) ListProtector.get(this.LIZ, i4)).getEndTime()) {
                return null;
            }
            if (((Utterance) ListProtector.get(this.LIZ, i4)).getStartTime() <= j2 && j2 < ((Utterance) ListProtector.get(this.LIZ, i4)).getEndTime()) {
                String text2 = ((Utterance) ListProtector.get(this.LIZ, i4)).getText();
                this.LIZIZ = i4;
                this.LIZJ = i;
                return text2;
            }
        }
        return null;
    }
}
