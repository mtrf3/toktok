package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.model.AdDefaultContainerInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;

/* renamed from: X.NRx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59373NRx implements NSN {
    public final String LIZ;
    public final String LIZIZ;
    public final ViewGroup LIZJ;

    @Override // X.NSN
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.NSN
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.NSG
    public final ViewGroup getContainer() {
        return this.LIZJ;
    }

    public C59373NRx(ViewOnClickListenerC59350NRa viewOnClickListenerC59350NRa, String str, ViewGroup viewGroup) {
        String str2;
        AdDefaultContainerInfoStruct defaultContainer;
        AdDescriptiveCTAStruct adDescriptiveCTAStruct = viewOnClickListenerC59350NRa.LJLJJI;
        if (adDescriptiveCTAStruct != null && (defaultContainer = adDescriptiveCTAStruct.getDefaultContainer()) != null) {
            str2 = defaultContainer.getButtonIconUrl();
        } else {
            str2 = null;
        }
        this.LIZ = str2;
        this.LIZIZ = str;
        this.LIZJ = viewGroup;
    }
}
