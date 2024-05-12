package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.services.external.IComplianceService;

/* loaded from: classes8.dex */
public abstract class G5I extends LinearLayout {
    public IComplianceService LJLIL;
    public Fragment LJLILLLLZI;

    public abstract void LIZ(C40945G5d c40945G5d);

    public abstract void LIZIZ(int i);

    public abstract void LIZLLL();

    public abstract boolean LJ();

    public abstract void LJFF();

    public abstract void LJI(boolean z);

    public abstract String LJII();

    public abstract DialogC25756A8y getLemon8AuthLoadingHUD();

    public abstract Boolean getLemon8ButtonStatus();

    public abstract TuxIconView getLemon8ButtonView();

    public abstract int getSaveUploadType();

    public abstract void setSaveLocalEnabled(boolean z);

    public abstract void setSyncIconSize(int i);

    public abstract void setSyncShareViewTextColor(int i);

    public abstract void setSyncShareViewTextSize(float f);

    public void setSyncShareViewTitle(String str) {
    }

    public final void LIZJ() {
        Bundle bundle = new Bundle();
        IComplianceService iComplianceService = this.LJLIL;
        if (iComplianceService != null) {
            bundle.putInt("publish_private_status", iComplianceService.getPublishPermission());
            bundle.putBoolean("music_prevent_download", this.LJLIL.getMusicPreventDownload());
        }
        C62708OjI.LIZ(null, "ug_publish_share_click", bundle);
    }

    public IComplianceService getComplianceService() {
        return this.LJLIL;
    }

    public Fragment getFragment() {
        return this.LJLILLLLZI;
    }

    public G5I(Context context) {
        super(context);
    }

    public void setComplianceService(IComplianceService iComplianceService) {
        this.LJLIL = iComplianceService;
    }
}
