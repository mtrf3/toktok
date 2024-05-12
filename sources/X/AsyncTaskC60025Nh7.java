package X;

import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: X.Nh7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class AsyncTaskC60025Nh7 extends AbstractAsyncTaskC60027Nh9 {
    public AsyncTaskC60025Nh7(C60038NhK c60038NhK, HashSet hashSet, JSONObject jSONObject, long j) {
        super(c60038NhK, hashSet, jSONObject, j);
    }

    @Override // X.AbstractAsyncTaskC60035NhH, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    @Override // X.AbstractAsyncTaskC60035NhH
    /* renamed from: LIZ */
    public final void onPostExecute(String str) {
        C60023Nh5 c60023Nh5 = C60023Nh5.LIZJ;
        if (c60023Nh5 != null) {
            for (C60014Ngw c60014Ngw : Collections.unmodifiableCollection(c60023Nh5.LIZ)) {
                if (this.LIZJ.contains(c60014Ngw.LJII)) {
                    AbstractC60015Ngx abstractC60015Ngx = c60014Ngw.LJ;
                    if (this.LJ >= abstractC60015Ngx.LJ) {
                        EnumC60020Nh2 enumC60020Nh2 = abstractC60015Ngx.LIZLLL;
                        EnumC60020Nh2 enumC60020Nh22 = EnumC60020Nh2.AD_STATE_NOTVISIBLE;
                        if (enumC60020Nh2 != enumC60020Nh22) {
                            abstractC60015Ngx.LIZLLL = enumC60020Nh22;
                            C37137Ehp.LIZIZ(abstractC60015Ngx.LJFF(), "setNativeViewHierarchy", str);
                        }
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return this.LIZLLL.toString();
    }
}
