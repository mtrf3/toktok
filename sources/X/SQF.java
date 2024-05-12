package X;

import Y.IDaS219S0100000_9;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterKeywordsSettingViewModel;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SQF implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ARV LJLIL;
    public final /* synthetic */ FilterKeywordsSettingFragment LJLILLLLZI;

    public SQF(ARV arv, FilterKeywordsSettingFragment filterKeywordsSettingFragment) {
        this.LJLIL = arv;
        this.LJLILLLLZI = filterKeywordsSettingFragment;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        String str;
        AbstractC73430Srq LJFF;
        boolean z2;
        if (C53332KwS.LIZ()) {
            ARV arv = this.LJLIL;
            if (!this.LJLILLLLZI.LJLJJI && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            arv.setChecked(z2);
        }
        DmFilterKeywordsSettingViewModel dmFilterKeywordsSettingViewModel = this.LJLILLLLZI.LJLIL;
        if (dmFilterKeywordsSettingViewModel != null) {
            if (z == DmFilterKeywordsSettingViewModel.kv0()) {
                return;
            }
            if (dmFilterKeywordsSettingViewModel.LJLJL.LJFF() > 0) {
                dmFilterKeywordsSettingViewModel.LJLJL.LIZLLL();
                dmFilterKeywordsSettingViewModel.LJLJL = new C73318Sq2();
            }
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            IPrivacyService LJIIIIZZ = PrivacyServiceImpl.LJIIIIZZ();
            InterfaceC101453yX LJFF2 = LJIIIIZZ.LJFF();
            if (LJFF2 != null && (LJFF = LJFF2.LJFF(i)) != null) {
                C78999UzT.LJFF(LJFF.LJIIZILJ(new IDaS219S0100000_9(LJIIIIZZ, 4)).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Ew
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }, new InterfaceC64592gB() { // from class: X.9Ex
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }), dmFilterKeywordsSettingViewModel.LJLJL);
            }
            C85323Wm onEventV3 = C772831o.LIZ();
            o.LJIIIZ(onEventV3, "onEventV3");
            if (i != 1) {
                str = "off";
            } else {
                str = "on";
            }
            onEventV3.LIZIZ("change_message_preference_permission", C62814Ol0.LJFF(new OSZ("enter_from", "privacy_and_safety_settings"), new OSZ("to_status", str), new OSZ("target", "filtered_keywords"), new OSZ("action_source", "user")));
            return;
        }
        o.LJIJI("viewModel");
        throw null;
    }
}
