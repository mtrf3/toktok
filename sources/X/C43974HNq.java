package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.HNq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43974HNq extends AbstractC43973HNp {
    public int LJLJLLL;

    @Override // X.AbstractC43973HNp
    public final void LJLZ(int i, int i2) {
    }

    @Override // X.AbstractC43973HNp
    public final int LJZI() {
        return -1;
    }

    @Override // X.AbstractC43973HNp
    public final CutSameVideoImageExtraData LLD() {
        return null;
    }

    @Override // X.AbstractC43973HNp
    public final void LLFZ(ArrayList<CutSameVideoImageExtraData> arrayList) {
    }

    @Override // X.AbstractC43973HNp
    public final void LLIIIJ(MyMediaModel myMediaModel) {
    }

    @Override // X.AbstractC43973HNp
    public final int LJZL() {
        return getItemCount();
    }

    public C43974HNq(Integer num) {
        super(num);
        this.LJLJLLL = -1;
    }

    @Override // X.AbstractC43973HNp
    public final Integer LLII(MyMediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        this.LJLJLLL = this.LJLJJI;
        this.LJLJJI = this.LJLIL.indexOf(mediaModel);
        int i = this.LJLJLLL;
        if (i > -1 && i < getItemCount()) {
            notifyItemChanged(this.LJLJLLL, "previewBorder");
        }
        int i2 = this.LJLJJI;
        if (i2 > -1 && i2 < getItemCount()) {
            notifyItemChanged(this.LJLJJI, "previewBorder");
            return Integer.valueOf(this.LJLJJI);
        }
        return null;
    }

    @Override // X.AbstractC43973HNp
    public final void LLIIII(int i) {
        int i2 = this.LJLJJI;
        this.LJLJLLL = i2;
        if (i2 > -1 && i2 < getItemCount()) {
            notifyItemChanged(this.LJLJLLL, "previewBorder");
        }
        this.LJLJJI = i;
    }
}
