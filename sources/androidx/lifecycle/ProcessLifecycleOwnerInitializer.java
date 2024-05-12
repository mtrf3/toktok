package androidx.lifecycle;

import X.C56672Kh;
import X.FAK;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return androidx_lifecycle_ProcessLifecycleOwnerInitializer_com_ss_android_ugc_aweme_lancet_ProviderLancet_onCreate_15(this);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean androidx_lifecycle_ProcessLifecycleOwnerInitializer__onCreate$___twin___() {
        LifecycleDispatcher.init(getContext());
        ProcessLifecycleOwner.init(getContext());
        return true;
    }

    public static boolean androidx_lifecycle_ProcessLifecycleOwnerInitializer_com_ss_android_ugc_aweme_lancet_ProviderLancet_onCreate_15(ProcessLifecycleOwnerInitializer processLifecycleOwnerInitializer) {
        C56672Kh.LIZ().LIZLLL("ProcessLifecycleOwnerInitializer");
        boolean androidx_lifecycle_ProcessLifecycleOwnerInitializer__onCreate$___twin___ = processLifecycleOwnerInitializer.androidx_lifecycle_ProcessLifecycleOwnerInitializer__onCreate$___twin___();
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        LIZ.LJFF(SystemClock.uptimeMillis(), "ProcessLifecycleOwnerInitializer");
        return androidx_lifecycle_ProcessLifecycleOwnerInitializer__onCreate$___twin___;
    }
}
