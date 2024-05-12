package Y;

import X.C71897SJp;
import X.C80663Eo;
import X.C92643kK;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel.MessagingPrivacyViewModel;
import com.ss.android.ugc.aweme.legacy.select.RecUserSelectCell;
import com.ss.android.ugc.aweme.legacy.select.SelectedCardVM;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDCListenerS141S0200000_1 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS141S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onCheckedChanged$0(IDCListenerS141S0200000_1 iDCListenerS141S0200000_1, CompoundButton compoundButton, boolean z) {
        if (z) {
            MessagingPrivacyViewModel messagingPrivacyViewModel = ((C92643kK) iDCListenerS141S0200000_1.l0).LJLIL;
            PrivacySettingsRestrictionOption option = (PrivacySettingsRestrictionOption) iDCListenerS141S0200000_1.l1;
            messagingPrivacyViewModel.getClass();
            o.LJIIIZ(option, "option");
            messagingPrivacyViewModel.LJLL.setValue(option);
        }
    }

    public static final void onCheckedChanged$1(IDCListenerS141S0200000_1 iDCListenerS141S0200000_1, CompoundButton compoundButton, boolean z) {
        SelectedCardVM selectedCardVM = (SelectedCardVM) ((RecUserSelectCell) iDCListenerS141S0200000_1.l0).LJLJJLL.getValue();
        C80663Eo item = (C80663Eo) iDCListenerS141S0200000_1.l1;
        C71897SJp c71897SJp = ((RecUserSelectCell) iDCListenerS141S0200000_1.l0).LJLJJL;
        if (c71897SJp != null) {
            boolean isChecked = c71897SJp.isChecked();
            selectedCardVM.getClass();
            o.LJIIIZ(item, "item");
            item.LJLILLLLZI = isChecked;
            List<C80663Eo> value = selectedCardVM.LJLJL.getValue();
            int i = 0;
            if (value != null) {
                Iterator<C80663Eo> it = value.iterator();
                while (it.hasNext()) {
                    i += it.next().LJLILLLLZI ? 1 : 0;
                }
            }
            selectedCardVM.LJLJLLL.postValue(Integer.valueOf(i));
            return;
        }
        o.LJIJI("selectView");
        throw null;
    }
}
