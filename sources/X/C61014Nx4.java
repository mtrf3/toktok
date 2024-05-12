package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.Nx4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61014Nx4 implements InterfaceC61015Nx5 {
    public final WeakReference<Activity> LIZ;
    public final /* synthetic */ String LIZIZ;

    public C61014Nx4(DownloadDelegateActivity downloadDelegateActivity, String str) {
        this.LIZIZ = str;
        this.LIZ = new WeakReference<>(downloadDelegateActivity);
    }
}
