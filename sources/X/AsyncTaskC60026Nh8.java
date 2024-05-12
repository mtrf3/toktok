package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: X.Nh8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class AsyncTaskC60026Nh8 extends AbstractAsyncTaskC60027Nh9 {
    public AsyncTaskC60026Nh8(C60038NhK c60038NhK, HashSet hashSet, JSONObject jSONObject, long j) {
        super(c60038NhK, hashSet, jSONObject, j);
    }

    @Override // X.AbstractAsyncTaskC60035NhH, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    @Override // X.AbstractAsyncTaskC60035NhH
    /* renamed from: LIZ */
    public final void onPostExecute(String str) {
        C60023Nh5 c60023Nh5;
        if (!TextUtils.isEmpty(str) && (c60023Nh5 = C60023Nh5.LIZJ) != null) {
            for (C60014Ngw c60014Ngw : Collections.unmodifiableCollection(c60023Nh5.LIZ)) {
                if (this.LIZJ.contains(c60014Ngw.LJII)) {
                    AbstractC60015Ngx abstractC60015Ngx = c60014Ngw.LJ;
                    if (this.LJ >= abstractC60015Ngx.LJ) {
                        abstractC60015Ngx.LIZLLL = EnumC60020Nh2.AD_STATE_VISIBLE;
                        C37137Ehp.LIZIZ(abstractC60015Ngx.LJFF(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (C60031NhD.LIZLLL(this.LIZLLL, ((C60038NhK) this.LIZIZ).LIZ)) {
            return null;
        }
        InterfaceC60029NhB interfaceC60029NhB = this.LIZIZ;
        JSONObject jSONObject = this.LIZLLL;
        ((C60038NhK) interfaceC60029NhB).LIZ = jSONObject;
        return jSONObject.toString();
    }
}
