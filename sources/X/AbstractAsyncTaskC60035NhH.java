package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;

/* renamed from: X.NhH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractAsyncTaskC60035NhH extends PthreadAsyncTask<Object, Void, String> {
    public C60045NhR LIZ;
    public final InterfaceC60029NhB LIZIZ;

    public AbstractAsyncTaskC60035NhH(InterfaceC60029NhB interfaceC60029NhB) {
        this.LIZIZ = interfaceC60029NhB;
    }

    @Override // android.os.AsyncTask
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C60045NhR c60045NhR = this.LIZ;
        if (c60045NhR != null) {
            c60045NhR.LIZJ = null;
            AbstractAsyncTaskC60035NhH poll = c60045NhR.LIZIZ.poll();
            c60045NhR.LIZJ = poll;
            if (poll != null) {
                poll.executeOnExecutor(c60045NhR.LIZ, new Object[0]);
            }
        }
    }
}
