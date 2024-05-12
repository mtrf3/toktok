package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.8C5, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8C5 extends ActivityC86117Xqz {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public abstract Fragment LLFII();

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        activityConfiguration(GDQ.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bsz);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJJI(R.anim.fv, R.anim.g2, 0, R.anim.g2);
        c1b3.LJIIJ(LLFII(), "TAG_CONTAINER", R.id.dm7);
        c1b3.LJI();
    }
}
