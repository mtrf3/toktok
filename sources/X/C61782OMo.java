package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.List;

/* renamed from: X.OMo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61782OMo implements InterfaceC61791OMx {
    public final /* synthetic */ C61783OMp LIZ;
    public final /* synthetic */ List<Option> LIZIZ;

    public C61782OMo(C61783OMp c61783OMp, List<Option> list) {
        this.LIZ = c61783OMp;
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC61791OMx
    public final void LIZ(float f) {
        int i;
        ON0 optionClickListener = this.LIZ.getOptionClickListener();
        if (optionClickListener != null) {
            optionClickListener.C2();
        }
        int i2 = (int) f;
        if (i2 > 0) {
            i = i2 - 1;
        } else {
            i = 0;
        }
        this.LIZ.setOption(((Option) ListProtector.get(this.LIZIZ, i)).getName());
        Option option = (Option) ListProtector.get(this.LIZIZ, i);
        C61780OMm.LIZ = new Option[]{option};
        C61780OMm.LIZIZ = String.valueOf(option.getId());
    }
}
