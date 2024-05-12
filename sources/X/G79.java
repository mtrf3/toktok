package X;

import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class G79 extends G75 {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final MutableLiveData<List<TranslatedRegion>> LJLJL;
    public boolean LJLJLJ;

    public final List<String> getRegionCodeList() {
        List<TranslatedRegion> value = this.LJLJL.getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(value, 10));
            Iterator<TranslatedRegion> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getCode());
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    public final void setReadOnly(boolean z) {
        this.LJLJLJ = z;
        if (z) {
            this.LJLIL.setIcon((C2068389v) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G79(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attr");
        this.LJLJL = new MutableLiveData<>();
        HQ7 accountService = C60903NvH.LJIIJJI().getAccountService();
        if (accountService.isLogin() && accountService.LJ()) {
            setVisibility(0);
            setLeftTuxIcon(R.raw.icon_scope);
            setTitle(R.string.p6k);
            setLabelText("");
            setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS27S0100000_7(this, 23)));
            return;
        }
        setVisibility(8);
    }
}
