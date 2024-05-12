package Y;

import X.AF1;
import X.AF5;
import X.ActivityC45651qj;
import X.C212428Vi;
import X.YFM;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.enterprise.ProfileEnterpriseAssem;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDCListenerS48S0200000_4 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS48S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(IDCListenerS48S0200000_4 iDCListenerS48S0200000_4, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        if (i != -2) {
            if (i != -1) {
                return;
            }
            ArrayList<ContentLanguage> arrayList = ((AF5) iDCListenerS48S0200000_4.l0).LJLILLLLZI;
            o.LJI(arrayList);
            arrayList.remove((ContentLanguage) iDCListenerS48S0200000_4.l1);
            ContentPreferenceViewModel contentPreferenceViewModel = ((AF5) iDCListenerS48S0200000_4.l0).LJLJI;
            o.LJI(contentPreferenceViewModel);
            ContentLanguage contentLanguage = (ContentLanguage) iDCListenerS48S0200000_4.l1;
            if (contentLanguage != null) {
                ArrayList<ContentLanguage> value = contentPreferenceViewModel.hv0().getValue();
                if (value != null) {
                    value.remove(contentLanguage);
                }
                contentPreferenceViewModel.LJLJJL = true;
            }
            AF1 af1 = ((AF5) iDCListenerS48S0200000_4.l0).LJLJJI;
            o.LJI(af1);
            af1.LIZ((ContentLanguage) iDCListenerS48S0200000_4.l1, 0);
            ((AF5) iDCListenerS48S0200000_4.l0).notifyDataSetChanged();
            dialog.dismiss();
            return;
        }
        dialog.dismiss();
    }

    public static final void onClick$1(IDCListenerS48S0200000_4 iDCListenerS48S0200000_4, DialogInterface dialogInterface, int i) {
        ActivityC45651qj LIZ = C212428Vi.LIZ((ProfileEnterpriseAssem) iDCListenerS48S0200000_4.l0);
        if (LIZ != null) {
            YFM.LIZIZ.switchToBioUrl(LIZ, ((User) iDCListenerS48S0200000_4.l1).getBioUrl());
        }
    }
}
