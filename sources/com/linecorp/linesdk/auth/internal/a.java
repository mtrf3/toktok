package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes12.dex */
public final class a {
    public static final /* synthetic */ int LIZIZ = 0;
    public final d LIZ;

    /* loaded from: classes12.dex */
    public static class b {
    }

    public a(d dVar) {
        this.LIZ = dVar;
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    public static class C0024a {
        public final Intent LIZ;
        public final Bundle LIZIZ;
        public final boolean LIZJ;

        public C0024a(Intent intent, Bundle bundle, boolean z) {
            this.LIZ = intent;
            this.LIZIZ = bundle;
            this.LIZJ = z;
        }
    }

    public static List<Intent> LIZ(Uri uri, Collection<ResolveInfo> collection, Bundle bundle) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ResolveInfo resolveInfo : collection) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            arrayList.add(intent);
        }
        return arrayList;
    }

    /* loaded from: classes12.dex */
    public static class c {
        public final String LIZ;
        public final String LIZIZ;
        public final String LIZJ;
        public final String LIZLLL;

        public c(String str, String str2, String str3, String str4) {
            this.LIZ = str;
            this.LIZIZ = str2;
            this.LIZJ = str3;
            this.LIZLLL = str4;
        }
    }
}
