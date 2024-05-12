package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G7T implements View.OnClickListener {
    public final /* synthetic */ AI8 LJLIL;
    public final /* synthetic */ G7B LJLILLLLZI;

    public G7T(AI8 ai8, G7B g7b) {
        this.LJLIL = ai8;
        this.LJLILLLLZI = g7b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object[], java.io.Serializable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        Context context;
        if (C40977G6j.LIZ()) {
            Context context2 = this.LJLIL.getContext();
            o.LJIIIIZZ(context2, "item.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI == null) {
                return;
            }
            List<TranslatedRegion> selected = this.LJLILLLLZI.LIZIZ.getValue();
            if (selected == null) {
                selected = C61878OQg.INSTANCE;
            }
            o.LJIIIZ(selected, "selected");
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra.read_only", false);
            bundle.putSerializable("extra.region.list", selected.toArray(new TranslatedRegion[0]));
            GeoFencingStatusFragment geoFencingStatusFragment = new GeoFencingStatusFragment();
            geoFencingStatusFragment.setArguments(bundle);
            geoFencingStatusFragment.LJLILLLLZI = new G7S(this.LJLILLLLZI);
            ASL asl = new ASL();
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLILLLL = geoFencingStatusFragment;
            tuxSheet.LJZI = false;
            asl.LJI(1);
            TuxSheet tuxSheet2 = asl.LIZ;
            tuxSheet2.LJLLLLLL = (int) (KL2.LJIIIZ(LJJIFFI) * 0.9d);
            tuxSheet2.LJLJI = true;
            tuxSheet2.LL = true;
            C1DG.LJII(LJJIFFI, "activity.supportFragmentManager", tuxSheet2, "GeoFencingSelectionFragment");
            return;
        }
        G7B g7b = this.LJLILLLLZI;
        g7b.getClass();
        AI8 ai8 = g7b.LIZ;
        if (ai8 != null && (context = ai8.getContext()) != null) {
            activity = C105574Cj.LIZ(context);
        } else {
            activity = null;
        }
        List<TranslatedRegion> selected2 = g7b.LIZIZ.getValue();
        if (selected2 == null) {
            selected2 = C61878OQg.INSTANCE;
        }
        o.LJIIIZ(selected2, "selected");
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) GeoFencingStatusActivity.class);
        intent.putExtra("extra.read_only", false);
        C79004UzY.LJJJJI(intent, selected2);
        C78598Ut0.LJIJJ(intent, activity);
        activity.startActivityForResult(intent, 1988, null);
    }
}
