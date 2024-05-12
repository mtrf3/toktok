package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS0S0331000_7;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public final class G5Q {
    public final CommonSettingItemStatus LIZ;
    public boolean LIZIZ;

    public final void LIZ(G5P g5p) {
        int i;
        boolean z;
        Float valueOf;
        Float valueOf2;
        PrivacySettingsRestrictionItem LIZJ = a.LJIILIIL().LIZJ(1, g5p.LIZ);
        boolean z2 = false;
        if (LIZJ != null) {
            i = LIZJ.getShowType();
        } else {
            i = 0;
        }
        boolean LIZ = PrivacyServiceImpl.LIZIZ().LIZ();
        boolean equals = TextUtils.equals(g5p.LIZ, "duet");
        boolean equals2 = TextUtils.equals(g5p.LIZ, "stitch");
        if (g5p.LIZIZ && i != 2) {
            this.LIZ._visibility.setValue(0);
            if ((LIZ && g5p.LJ != 0) || i == 1 || ((g5p.LJIIJJI && g5p.LJFF != 0) || GWJ.LIZIZ(g5p.LIZLLL) || g5p.LJIIIIZZ || g5p.LJII)) {
                z = true;
            } else {
                z = false;
            }
            this.LIZIZ = z;
            if (z) {
                MutableLiveData<Float> mutableLiveData = this.LIZ._alpha;
                if (G6X.LIZ()) {
                    valueOf2 = Float.valueOf(0.34f);
                } else {
                    valueOf2 = Float.valueOf(0.4f);
                }
                mutableLiveData.setValue(valueOf2);
                this.LIZ._isDisabled = this.LIZIZ;
            } else {
                this.LIZ._alpha.setValue(Float.valueOf(1.0f));
            }
            MutableLiveData<Boolean> mutableLiveData2 = this.LIZ._checked;
            if (g5p.LIZJ && !this.LIZIZ) {
                z2 = true;
            }
            mutableLiveData2.setValue(Boolean.valueOf(z2));
            if (g5p.LJIIL) {
                MutableLiveData<Float> mutableLiveData3 = this.LIZ._alpha;
                if (G6X.LIZ()) {
                    valueOf = Float.valueOf(0.34f);
                } else {
                    valueOf = Float.valueOf(0.4f);
                }
                mutableLiveData3.setValue(valueOf);
                CommonSettingItemStatus commonSettingItemStatus = this.LIZ;
                commonSettingItemStatus._isDisabled = true;
                commonSettingItemStatus._checked.setValue(Boolean.FALSE);
            }
            this.LIZ.setOnClickListener(new AqS0S0331000_7(this, i, g5p, LIZ, equals, equals2, LIZJ, 2));
            return;
        }
        this.LIZ._visibility.setValue(8);
    }

    public G5Q(CommonSettingItemStatus itemView, WeakReference<Context> weakReference) {
        o.LJIIIZ(itemView, "itemView");
        this.LIZ = itemView;
    }
}
