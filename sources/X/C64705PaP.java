package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;

/* renamed from: X.PaP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64705PaP extends RunnableC39007FSp {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;

    public final void LIZJ() {
        C64707PaR.LIZ().LIZIZ(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL);
        C64704PaO LJFF = C64704PaO.LJFF();
        String str = this.LJLJJLL;
        String str2 = this.LJLJL;
        String str3 = this.LJLJLJ;
        if (LJFF.LJIIIZ == null || !LJFF.LJIIJ || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (LJFF.LIZ.equalsIgnoreCase(str) && LJFF.LIZIZ.equalsIgnoreCase(str2) && LJFF.LIZJ.equalsIgnoreCase(str3)) {
            return;
        }
        LJFF.LIZJ = str3;
        LJFF.LIZ = str;
        LJFF.LIZIZ = str2;
        Logger.debug();
        SharedPreferences.Editor edit = F9J.LIZIZ(LJFF.LJIIIZ, 0, "ttnet_store_region").edit();
        edit.putString("store_region", LJFF.LIZ);
        edit.putString("store_region_src", LJFF.LIZIZ);
        edit.putString("store_sec_uid", LJFF.LIZJ);
        edit.apply();
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64705PaP(String str, String str2, String str3, String str4, String str5) {
        super((Object) null);
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = str4;
        this.LJLJLLL = str5;
    }
}
