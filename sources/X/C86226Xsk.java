package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.fe.method.ImageChooseActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS119S0300000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xsk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86226Xsk implements InterfaceC86247Xt5 {
    public static int LJIIJJI = 216;
    public static int LJIIL = 384;
    public final WeakReference<Activity> LIZ;
    public final InterfaceC86245Xt3 LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJI;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final ExecutorService LJIIJ;
    public int LIZJ = 1;
    public final String LJFF = "";
    public float LJII = 1.0f;

    public static void LIZLLL(Activity activity) {
        if (!o.LJ("mounted", C16880lQ.LLLLLLLZIL())) {
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.PICK");
        intent.putExtra("pns.sandbox.dataflow_id", 1207965186);
        C16880lQ.LJFF(activity, 10003, intent);
    }

    public final void LIZIZ(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) ImageChooseActivity.class);
        intent.putExtra("maxSelectNum", this.LIZJ);
        intent.putExtra("enter_from", this.LJFF);
        C16880lQ.LJFF(activity, 10003, intent);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJFF);
        FMX.LJIIL("enter_image_choose", c188727au.LIZ);
    }

    public C86226Xsk(WeakReference weakReference, C86233Xsr c86233Xsr) {
        this.LIZ = weakReference;
        this.LIZIZ = c86233Xsr;
        C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
        c38027EwB.LIZIZ = "compressPhoto";
        this.LJIIJ = C37191Eih.LIZ(c38027EwB);
    }

    public final void LIZJ(Activity activity, List<? extends android.net.Uri> list) {
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator<? extends android.net.Uri> it = list.iterator();
                while (it.hasNext()) {
                    if (C38354F3m.LJ(it.next().toString())) {
                    }
                }
            }
            if (this.LJIIIIZZ == 0 && this.LIZLLL) {
                this.LJIIIIZZ = 1;
            }
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<? extends android.net.Uri> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toString());
            }
            int i = this.LJIIIIZZ;
            if (i == 1 || i == 2 || i == 3) {
                this.LJIIJ.execute(new HNV(activity, arrayList, this.LIZIZ, new AqS119S0300000_15(this, (C86226Xsk) activity, (Activity) arrayList, (List<String>) 8)));
                return;
            } else {
                LIZ(activity, arrayList, null, arrayList);
                return;
            }
        }
        this.LIZIZ.LIZ(0, "Path empty");
    }

    @Override // X.InterfaceC86247Xt5
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList LJII;
        if (i2 == 0 || intent == null) {
            this.LIZIZ.LIZ(-7, "User cancelled");
            return;
        }
        Activity activity = this.LIZ.get();
        if (activity == null) {
            this.LIZIZ.LIZ(0, "Activity not found");
            return;
        }
        if (this.LJI) {
            android.net.Uri data = intent.getData();
            if (data == null || C38354F3m.LJ(data.toString())) {
                this.LIZIZ.LIZ(0, "Path empty");
                return;
            }
            String uri = data.toString();
            o.LJIIIIZZ(uri, "uri.toString()");
            if (i != 10003) {
                if (i != 10004) {
                    return;
                }
                LIZJ(activity, C47261Igj.LJJIJ(data));
                return;
            }
            Z8A.LIZIZ.gotoCropActivity(activity, uri, false, this.LJII, (int) KL2.LIZJ(activity, 16.0f), 10004, 0, 0, -1, false);
            return;
        }
        if (i2 == 41312) {
            String[] stringArrayExtra = intent.getStringArrayExtra("images");
            if (stringArrayExtra != null) {
                LJII = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    LJII.add(UriProtector.parse(str));
                }
            } else {
                LJII = new ArrayList();
            }
        } else {
            LJII = C47261Igj.LJII(intent.getData());
        }
        LIZJ(activity, LJII);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r5 != 4) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.app.Activity r15, java.util.List<java.lang.String> r16, java.util.List<java.lang.String> r17, java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86226Xsk.LIZ(android.app.Activity, java.util.List, java.util.List, java.util.List):void");
    }
}
