package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class OB3 extends ActivityC86117Xqz {
    public OB7 LJLIL;
    public KidsFeedFragment LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI = new LinkedHashMap();

    public String LLFII() {
        return null;
    }

    public String LLFZ() {
        return null;
    }

    public abstract String LLII();

    public abstract OB7 LLIIIILZ();

    public abstract String LLIIIJ();

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public abstract String getEnterFrom();

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        super.onPause();
        KidsFeedFragment kidsFeedFragment = this.LJLILLLLZI;
        if (kidsFeedFragment != null) {
            kidsFeedFragment.LJLJJI.handlePagePause(false);
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        super.onResume();
        KidsFeedFragment kidsFeedFragment = this.LJLILLLLZI;
        if (kidsFeedFragment != null) {
            if (kidsFeedFragment.LJLJLJ || KidsFeedFragment.LJZ) {
                kidsFeedFragment.LJLJLJ = false;
                KidsFeedFragment.LJZ = false;
                kidsFeedFragment.LJLJJI.startPlay();
            } else {
                kidsFeedFragment.LJLJJI.handlePageResume(false);
            }
        }
        KidsFeedFragment kidsFeedFragment2 = this.LJLILLLLZI;
        if (kidsFeedFragment2 != null) {
            View view = kidsFeedFragment2.LJLLLL;
            if (view != null) {
                view.setVisibility(0);
            } else {
                o.LJIJI("bottomSpaceView");
                throw null;
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        KidsFeedFragment kidsFeedFragment;
        activityConfiguration(C41214GFm.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bff);
        this.LJLIL = LLIIIILZ();
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL(LLIIIJ());
        if (LJJJIL instanceof KidsFeedFragment) {
            kidsFeedFragment = (KidsFeedFragment) LJJJIL;
        } else {
            kidsFeedFragment = null;
        }
        this.LJLILLLLZI = kidsFeedFragment;
        if (kidsFeedFragment != null) {
            return;
        }
        String title = LLII();
        String enterFrom = getEnterFrom();
        String LLFII = LLFII();
        OB7 ob7 = this.LJLIL;
        if (ob7 != null) {
            String LLFZ = LLFZ();
            o.LJIIIZ(title, "title");
            o.LJIIIZ(enterFrom, "enterFrom");
            Bundle LIZ = C0H1.LIZ("enter_from", enterFrom);
            if (LLFII != null) {
                LIZ.putString("current_id", LLFII);
            }
            LIZ.putString("title", title);
            KidsFeedFragment kidsFeedFragment2 = new KidsFeedFragment();
            kidsFeedFragment2.LJLJJLL = ob7;
            kidsFeedFragment2.LJLJL = LLFZ;
            kidsFeedFragment2.setArguments(LIZ);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJ(kidsFeedFragment2, LLIIIJ(), R.id.dm7);
            c1b3.LJIIL(kidsFeedFragment2);
            c1b3.LJIILJJIL();
            this.LJLILLLLZI = kidsFeedFragment2;
            return;
        }
        o.LJIJI("feedDelegate");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (i != 24 && i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24) {
            z = true;
        } else {
            z = false;
        }
        C2U8.LIZ(new O6A(z));
        return true;
    }
}
