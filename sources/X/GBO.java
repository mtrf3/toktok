package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS173S0100000_7;

/* loaded from: classes8.dex */
public class GBO extends GB7 implements G90 {
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public String LLFZ() {
        return null;
    }

    public boolean LLII() {
        return this instanceof FTCVideoRecordNewActivity;
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C43212Gxc LLFII() {
        GGS.LIZ.getClass();
        return GGS.LJFF;
    }

    @Override // X.G90
    public final Analysis getAnalysis() {
        String LLFZ = LLFZ();
        if (LLFZ != null && LLFZ.length() > 0) {
            Analysis analysis = new Analysis();
            analysis.setLabelName(LLFZ());
            return analysis;
        }
        return null;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context LIZ = C39386Fd0.LIZ(context);
        C39647FhD.LIZLLL(LIZ);
        super.attachBaseContext(LIZ);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        activityConfiguration(new AqS173S0100000_7(this, 373));
        super.onCreate(bundle);
        if (GBP.LIZ()) {
            getWindow().addFlags(128);
        }
        getLifecycle().addObserver(new AnalysisActivityComponent(this, this));
    }
}
