package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS103S0101000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6EF, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6EF {
    public final VideoPublishEditModel LIZ;
    public final ArrayList<C6EJ> LIZIZ;

    public void LIZ() {
    }

    public abstract int LIZIZ();

    public C6EJ LIZJ() {
        return null;
    }

    public boolean LJI() {
        return this instanceof C6EH;
    }

    public boolean LJFF() {
        Iterator<C6EJ> it = LIZLLL().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C6EJ next = it.next();
            if (next.LIZIZ(LJ())) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<C6EJ> LIZLLL() {
        return this.LIZIZ;
    }

    public VideoPublishEditModel LJ() {
        return this.LIZ;
    }

    public C6EF(VideoPublishEditModel videoPublishEditModel, ArrayList<C6EJ> arrayList) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = arrayList;
    }

    public void LJII(FragmentManager fragmentManager, Context context, VideoPublishEditModel model, int i, AqS103S0101000_2 aqS103S0101000_2, AqS103S0101000_2 aqS103S0101000_22) {
        o.LJIIIZ(model, "model");
        C6EJ LIZJ = LIZJ();
        if (LIZJ != null) {
            LIZJ.LJ(fragmentManager, context, model, i, aqS103S0101000_2, aqS103S0101000_22);
        }
    }
}
