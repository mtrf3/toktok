package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Xsj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86225Xsj implements InterfaceC86247Xt5 {
    public static final /* synthetic */ int LJIIL = 0;
    public final WeakReference<Activity> LIZ;
    public final InterfaceC86245Xt3 LIZIZ;
    public final ExecutorService LIZJ;
    public final ExecutorService LIZLLL;
    public android.net.Uri LJ;
    public String LJFF;
    public String LJI;
    public AsyncTaskC86227Xsl LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;

    public C86225Xsj(WeakReference weakReference, C86233Xsr c86233Xsr) {
        this.LIZ = weakReference;
        this.LIZIZ = c86233Xsr;
        FSY fsy = FSY.SERIAL;
        C38027EwB c38027EwB = new C38027EwB(fsy);
        c38027EwB.LIZIZ = "takePhoto";
        this.LIZJ = C37191Eih.LIZ(c38027EwB);
        C38027EwB c38027EwB2 = new C38027EwB(fsy);
        c38027EwB2.LIZIZ = "compressPhoto";
        this.LIZLLL = C37191Eih.LIZ(c38027EwB2);
    }

    @Override // X.InterfaceC86247Xt5
    public final void onActivityResult(int i, int i2, Intent intent) {
        long j;
        String str;
        if (i2 == 0) {
            this.LIZIZ.LIZ(-7, "User cancel");
            return;
        }
        if (this.LJIIJJI == 0 && this.LJIIIIZZ) {
            this.LJIIJJI = 1;
        }
        if (i2 == -1) {
            int i3 = this.LJIIJJI;
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                ExecutorService executorService = this.LIZLLL;
                WeakReference<Activity> weakReference = this.LIZ;
                String str2 = this.LJFF;
                if (str2 == null) {
                    str2 = String.valueOf(this.LJ);
                }
                executorService.execute(new RunnableC86224Xsi(weakReference, str2, this.LIZIZ, this.LJIIIZ, this.LJIIJJI));
                return;
            }
            Context LIZIZ = EF7.LIZIZ();
            String str3 = this.LJFF;
            if (str3 == null) {
                str3 = String.valueOf(this.LJ);
            }
            android.net.Uri parse = UriProtector.parse(str3);
            o.LJIIIIZZ(parse, "parse(mImageFilePath ?: mImageFileUri.toString())");
            Long LIZ = C45876HzU.LIZ(LIZIZ, parse);
            if (LIZ != null) {
                j = LIZ.longValue();
            } else {
                j = 0;
            }
            String str4 = this.LJFF;
            if (str4 == null) {
                str4 = String.valueOf(this.LJ);
            }
            C86241Xsz c86241Xsz = new C86241Xsz(j, str4, "image");
            String str5 = this.LJFF;
            if (str5 == null) {
                str5 = String.valueOf(this.LJ);
            }
            c86241Xsz.LIZIZ = C32200CkO.LIZ(str5);
            if (this.LJIIIZ) {
                Activity activity = this.LIZ.get();
                if (activity != null) {
                    String str6 = this.LJFF;
                    if (str6 == null) {
                        str6 = String.valueOf(this.LJ);
                    }
                    str = OYW.LIZ(activity, str6);
                } else {
                    str = null;
                }
                c86241Xsz.LIZ = str;
            }
            List<C86241Xsz> LJJIJ = C47261Igj.LJJIJ(c86241Xsz);
            InterfaceC86245Xt3 interfaceC86245Xt3 = this.LIZIZ;
            C86242Xt0 c86242Xt0 = new C86242Xt0();
            c86242Xt0.LIZ = LJJIJ;
            interfaceC86245Xt3.LIZIZ(c86242Xt0);
        }
    }
}
