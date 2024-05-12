package X;

import Y.AObserverS74S0100000_6;
import Y.AObserverS75S0100000_7;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G7B {
    public static final /* synthetic */ int LIZJ = 0;
    public AI8 LIZ;
    public final MutableLiveData<List<TranslatedRegion>> LIZIZ = new MutableLiveData<>();

    public final List<String> LIZIZ() {
        List<TranslatedRegion> value = this.LIZIZ.getValue();
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

    public final void LJ() {
        AIF aif;
        Context context;
        String string;
        List<TranslatedRegion> value = this.LIZIZ.getValue();
        if (value == null) {
            return;
        }
        AI8 ai8 = this.LIZ;
        AI9 ai9 = null;
        if (ai8 != null) {
            ai9 = ai8.getAccessory();
        }
        if (!(ai9 instanceof AIF) || (aif = (AIF) ai9) == null) {
            return;
        }
        int size = value.size();
        String str = "";
        if (size != 0) {
            if (size != 1) {
                AI8 ai82 = this.LIZ;
                if (ai82 != null && (context = ai82.getContext()) != null && (string = context.getString(R.string.h1y, ((TranslatedRegion) ORZ.LJLLJ(value)).getTranslation(), Integer.valueOf(value.size() - 1))) != null) {
                    str = string;
                }
            } else {
                str = ((TranslatedRegion) ORZ.LJLLJ(value)).getTranslation();
            }
        }
        aif.LJIILIIL(str);
    }

    public final void LIZ(LifecycleOwner lifecycleOwner, AI8 item) {
        AIF aif;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(item, "item");
        this.LIZ = item;
        LJ();
        AI8 ai8 = this.LIZ;
        AI9 ai9 = null;
        if (ai8 != null) {
            ai9 = ai8.getAccessory();
        }
        if ((ai9 instanceof AIF) && (aif = (AIF) ai9) != null) {
            aif.LJIILJJIL(new G7T(item, this));
        }
    }

    public final void LIZJ(LifecycleOwner lifecycleOwner, List<String> list) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (G61.LIZ()) {
            return;
        }
        this.LIZIZ.observe(lifecycleOwner, new AObserverS75S0100000_7(this, 121));
        C41090GAs.LIZIZ(new AqS154S0200000_7(this, (G7B) list, (List<String>) 130));
    }

    public final void LIZLLL(LifecycleOwner lifecycleOwner, AObserverS75S0100000_7 aObserverS75S0100000_7) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZIZ.observe(lifecycleOwner, new AObserverS74S0100000_6(aObserverS75S0100000_7, 15));
    }
}
