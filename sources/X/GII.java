package X;

import android.widget.CompoundButton;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GII implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ MutableLiveData<Boolean> LJLIL;
    public final /* synthetic */ BaseAntiBullyingFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public GII(MutableLiveData<Boolean> mutableLiveData, BaseAntiBullyingFragment baseAntiBullyingFragment, String str) {
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = baseAntiBullyingFragment;
        this.LJLJI = str;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        this.LJLIL.setValue(Boolean.valueOf(z));
        GIJ wl = this.LJLILLLLZI.wl();
        String eventName = this.LJLJI;
        wl.getClass();
        o.LJIIIZ(eventName, "eventName");
        C188727au c188727au = new C188727au();
        c188727au.LJI("from_page", wl.LIZJ());
        wl.LIZIZ(c188727au);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJI("to_status", str);
        FMX.LJIIL(eventName, c188727au.LIZ);
    }
}
