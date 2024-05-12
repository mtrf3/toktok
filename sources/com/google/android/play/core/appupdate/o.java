package com.google.android.play.core.appupdate;

import X.C13T;
import X.C16880lQ;
import X.C40579FwF;
import android.app.PendingIntent;
import android.os.Bundle;
import java.io.File;

/* loaded from: classes7.dex */
public final class o extends m<a> {
    public final String LJLJJI;
    public final /* synthetic */ p LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, C40579FwF c40579FwF, String str) {
        super(pVar, new C13T("OnRequestInstallCallback"), c40579FwF);
        this.LJLJJL = pVar;
        this.LJLJJI = str;
    }

    @Override // com.google.android.play.core.appupdate.m, X.InterfaceC40590FwQ
    public final void LJJJJLL(Bundle bundle) {
        Integer valueOf;
        super.LJJJJLL(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.LJLILLLLZI.LIZIZ(new com.google.android.play.core.install.a(bundle.getInt("error.code", -2)));
            return;
        }
        C40579FwF c40579FwF = this.LJLILLLLZI;
        p pVar = this.LJLJJL;
        String str = this.LJLJJI;
        int i = bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(bundle.getInt("client.version.staleness"));
        }
        int i4 = bundle.getInt("in.app.update.priority", 0);
        long j = bundle.getLong("bytes.downloaded");
        long j2 = bundle.getLong("total.bytes.to.download");
        long j3 = bundle.getLong("additional.size.required");
        q qVar = pVar.LIZLLL;
        qVar.getClass();
        c40579FwF.LIZJ(new r(str, i, i2, i3, valueOf, i4, j, j2, j3, q.LIZ(new File(C16880lQ.LLIIJLIL(qVar.LIZ), "assetpacks")), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent")));
    }
}
