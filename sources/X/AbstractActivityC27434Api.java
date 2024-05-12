package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Api, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractActivityC27434Api extends ActivityC86117Xqz implements OGB, InterfaceC27438Apm, InterfaceC26903Ah9 {
    public InterfaceC27436Apk LJLIL;
    public final java.util.Map<Integer, View> LJLJI = new LinkedHashMap();
    public long LJLILLLLZI = -1;

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

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public void fillNodeParams(C70858RrS c70858RrS) {
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageNameKey() {
        return "page_name";
    }

    @Override // X.InterfaceC27438Apm
    public final boolean onDetectBlank(java.util.Map<String, String> map) {
        return false;
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
    }

    public final long LLFII() {
        return SystemClock.elapsedRealtime() - this.LJLILLLLZI;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public void finish() {
        super.finish();
        C78939UyV.LJJJJ(this);
    }

    @Override // X.InterfaceC37828Esy
    public String getPageName() {
        return C16880lQ.LJLLJ(getClass());
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C26901Ah7.LIZ(this);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        super.onResume();
        this.LJLILLLLZI = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        InterfaceC71003Rtn LJIILL = C79234V7u.LJIILL(this);
        if (LJIILL == null) {
            return C79234V7u.LJIILIIL(getIntent(), this);
        }
        return LJIILL;
    }

    @Override // X.InterfaceC37828Esy
    public final java.util.Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityConfiguration(C27435Apj.LJLIL);
        C78929UyL.LJIJI(this);
        C70853RrN.LIZIZ(this, null, null, 3);
        View decorView = getWindow().getDecorView();
        o.LJIIIIZZ(decorView, "window.decorView");
        trackFirstScreen(decorView);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        new C1B3(supportFragmentManager);
    }

    @Override // X.OGB
    public final void setActivityResultListener(InterfaceC27436Apk listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
    }

    public void trackFirstScreen(View view) {
        o.LJIIIZ(view, "view");
        C70853RrN.LIZJ(this, view);
    }

    @Override // X.InterfaceC27538ArO
    public final void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC27436Apk interfaceC27436Apk = this.LJLIL;
        if (interfaceC27436Apk != null) {
            interfaceC27436Apk.onActivityResult(i, i2, intent);
        }
    }
}
