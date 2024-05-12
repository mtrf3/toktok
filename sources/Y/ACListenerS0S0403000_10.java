package Y;

import X.AbstractDialogInterfaceC26236ARk;
import X.C26231ARf;
import X.C61780OMm;
import X.C68322mC;
import X.C80796VnM;
import X.EnumC61773OMf;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.List;

/* loaded from: classes11.dex */
public class ACListenerS0S0403000_10 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS0S0403000_10 aCListenerS0S0403000_10, View view) {
        C61780OMm.LIZ = new Option[]{ListProtector.get((List) aCListenerS0S0403000_10.l0, 0)};
        C61780OMm.LIZIZ = String.valueOf(((Option) ListProtector.get((List) aCListenerS0S0403000_10.l0, 0)).getId());
        C61780OMm.LIZ((Aweme) aCListenerS0S0403000_10.l1, EnumC61773OMf.SUBMIT, (C80796VnM) aCListenerS0S0403000_10.l2, aCListenerS0S0403000_10.i4, aCListenerS0S0403000_10.i5, aCListenerS0S0403000_10.i6);
        AbstractDialogInterfaceC26236ARk abstractDialogInterfaceC26236ARk = (AbstractDialogInterfaceC26236ARk) ((C68322mC) aCListenerS0S0403000_10.l3).element;
        if (abstractDialogInterfaceC26236ARk != null) {
            abstractDialogInterfaceC26236ARk.LIZIZ(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(ACListenerS0S0403000_10 aCListenerS0S0403000_10, View view) {
        C61780OMm.LIZ = new Option[]{ListProtector.get((List) aCListenerS0S0403000_10.l0, 1)};
        C61780OMm.LIZIZ = String.valueOf(((Option) ListProtector.get((List) aCListenerS0S0403000_10.l0, 1)).getId());
        C61780OMm.LIZ((Aweme) aCListenerS0S0403000_10.l1, EnumC61773OMf.SUBMIT, (C80796VnM) aCListenerS0S0403000_10.l2, aCListenerS0S0403000_10.i4, aCListenerS0S0403000_10.i5, aCListenerS0S0403000_10.i6);
        AbstractDialogInterfaceC26236ARk abstractDialogInterfaceC26236ARk = (AbstractDialogInterfaceC26236ARk) ((C68322mC) aCListenerS0S0403000_10.l3).element;
        if (abstractDialogInterfaceC26236ARk != null) {
            abstractDialogInterfaceC26236ARk.LIZIZ(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS0S0403000_10(List list, List<Option> list2, Aweme aweme, C80796VnM c80796VnM, int i, int i2, int i3, C68322mC<C26231ARf> c68322mC) {
        this.$t = c68322mC;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = aweme;
        this.i4 = c80796VnM;
        this.i5 = i;
        this.i6 = i2;
        this.l3 = i3;
    }
}
