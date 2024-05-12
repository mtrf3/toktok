package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xsm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86228Xsm implements IHostMediaDepend {
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend
    public final void handleJsInvoke(Context context, C86236Xsu params, IChooseMediaResultCallback callback) {
        EnumC86234Xss enumC86234Xss;
        boolean z;
        boolean z2;
        String[] strArr;
        boolean z3;
        boolean z4;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        Activity LIZ = HT4.LIZ(context);
        if (LIZ == null) {
            callback.onFailure(0, "Context not provided");
            return;
        }
        WeakReference weakReference = new WeakReference(LIZ);
        C86233Xsr c86233Xsr = new C86233Xsr(LIZ, callback, weakReference);
        Activity LIZ2 = C37925EuX.LIZ((Context) weakReference.get());
        if (!OGC.LIZ(LIZ2, c86233Xsr)) {
            c86233Xsr.LIZ(0, "Failed to find proper activity");
            return;
        }
        WeakReference weakReference2 = new WeakReference(LIZ2);
        List<String> list = params.LJII;
        o.LJI(list);
        String str = (String) ListProtector.get(list, 0);
        String str2 = params.LJIIIIZZ;
        EnumC86234Xss.Companion.getClass();
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            if (o.LJ(lowerCase, "image")) {
                String lowerCase2 = str2.toLowerCase();
                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase()");
                if (o.LJ(lowerCase2, "camera")) {
                    enumC86234Xss = EnumC86234Xss.TAKE_PHOTO;
                }
            }
            String lowerCase3 = str.toLowerCase();
            o.LJIIIIZZ(lowerCase3, "this as java.lang.String).toLowerCase()");
            if (o.LJ(lowerCase3, "image")) {
                String lowerCase4 = str2.toLowerCase();
                o.LJIIIIZZ(lowerCase4, "this as java.lang.String).toLowerCase()");
                if (o.LJ(lowerCase4, "album")) {
                    enumC86234Xss = EnumC86234Xss.PICK_PHOTO_FROM_ALBUM;
                }
            }
            String lowerCase5 = str.toLowerCase();
            o.LJIIIIZZ(lowerCase5, "this as java.lang.String).toLowerCase()");
            if (o.LJ(lowerCase5, "video")) {
                String lowerCase6 = str2.toLowerCase();
                o.LJIIIIZZ(lowerCase6, "this as java.lang.String).toLowerCase()");
                if (o.LJ(lowerCase6, "camera")) {
                    enumC86234Xss = EnumC86234Xss.TAKE_VIDEO;
                }
            }
            String lowerCase7 = str.toLowerCase();
            o.LJIIIIZZ(lowerCase7, "this as java.lang.String).toLowerCase()");
            if (o.LJ(lowerCase7, "video")) {
                String lowerCase8 = str2.toLowerCase();
                o.LJIIIIZZ(lowerCase8, "this as java.lang.String).toLowerCase()");
                if (o.LJ(lowerCase8, "album")) {
                    enumC86234Xss = EnumC86234Xss.PICK_VIDEO_FROM_ALBUM;
                }
            }
            enumC86234Xss = EnumC86234Xss.UNSUPPORTED;
        } else {
            enumC86234Xss = EnumC86234Xss.UNSUPPORTED;
        }
        if (enumC86234Xss == EnumC86234Xss.UNSUPPORTED) {
            c86233Xsr.LIZ(-3, "Invalid fileType and sourceType in params");
            return;
        }
        int i = C86238Xsw.LIZ[enumC86234Xss.ordinal()];
        String str3 = "android.permission.READ_MEDIA_VIDEO";
        String str4 = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    C86226Xsk c86226Xsk = new C86226Xsk(weakReference2, c86233Xsr);
                    c86233Xsr.LJLIL = c86226Xsk;
                    int i2 = params.LJIIIZ;
                    c86226Xsk.LIZJ = i2;
                    if (params.LJIIJ || params.LIZLLL) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c86226Xsk.LIZLLL = z3;
                    c86226Xsk.LJIIIIZZ = params.LJ;
                    c86226Xsk.LJI = params.LIZ;
                    int i3 = params.LIZJ;
                    int i4 = params.LIZIZ;
                    if (i3 * i4 != 0) {
                        c86226Xsk.LJII = (i3 * 1.0f) / i4;
                    }
                    if (i2 > 1 || params.LJI) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c86226Xsk.LJ = params.LIZLLL;
                    c86226Xsk.LJIIIZ = params.LJFF;
                    int i5 = params.LJIILIIL;
                    if (i5 == 0) {
                        i5 = 216;
                    }
                    C86226Xsk.LJIIJJI = i5;
                    int i6 = params.LJIILJJIL;
                    if (i6 == 0) {
                        i6 = 384;
                    }
                    C86226Xsk.LJIIL = i6;
                    if (z4) {
                        Object obj = weakReference2.get();
                        o.LJII(obj, "null cannot be cast to non-null type android.app.Activity");
                        Activity activity = (Activity) obj;
                        if (Build.VERSION.SDK_INT >= 33) {
                            str4 = "android.permission.READ_MEDIA_IMAGES";
                        }
                        if (C04330Ez.LIZ(activity, str4) == 0) {
                            c86226Xsk.LIZIZ(activity);
                            return;
                        } else {
                            C61115Nyh.LIZIZ(activity, TokenCert.Companion.with("bpea-x_pick_photos_write_storage_permission"), new String[]{str4}, new C86232Xsq(c86226Xsk, activity));
                            return;
                        }
                    }
                    Object obj2 = weakReference2.get();
                    o.LJII(obj2, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity2 = (Activity) obj2;
                    if (Build.VERSION.SDK_INT >= 33) {
                        str4 = "android.permission.READ_MEDIA_IMAGES";
                    }
                    if (C04330Ez.LIZ(activity2, str4) == 0) {
                        C86226Xsk.LIZLLL(activity2);
                        return;
                    } else {
                        C61115Nyh.LIZIZ(activity2, TokenCert.Companion.with("bpea-x_pick_photos_write_storage_2_permission"), new String[]{str4}, new C86237Xsv(c86226Xsk, activity2));
                        return;
                    }
                }
                C86225Xsj c86225Xsj = new C86225Xsj(weakReference2, c86233Xsr);
                c86233Xsr.LJLIL = c86225Xsj;
                Activity activity3 = (Activity) weakReference2.get();
                if (activity3 == null) {
                    c86233Xsr.LIZ(0, "Activity not found");
                    return;
                }
                if (!activity3.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
                    c86233Xsr.LIZ(0, "Camera feature not found");
                    return;
                }
                if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity3.getPackageManager()) == null) {
                    c86233Xsr.LIZ(0, "Camera app not found");
                    return;
                }
                c86225Xsj.LJI = params.LJIIL;
                if (params.LJIIJ || params.LIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                c86225Xsj.LJIIIIZZ = z;
                c86225Xsj.LJIIJJI = params.LJ;
                c86225Xsj.LJIIIZ = params.LIZLLL;
                c86225Xsj.LJIIJ = params.LJIIJJI;
                if (C04330Ez.LIZ(activity3, "android.permission.CAMERA") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!c86225Xsj.LJIIJ ? z2 : !(Build.VERSION.SDK_INT < 33 ? !z2 || C04330Ez.LIZ(activity3, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 : !z2 || C04330Ez.LIZ(activity3, "android.permission.READ_MEDIA_IMAGES") != 0)) {
                    AsyncTaskC86227Xsl asyncTaskC86227Xsl = c86225Xsj.LJII;
                    if (asyncTaskC86227Xsl != null) {
                        asyncTaskC86227Xsl.cancel(false);
                    }
                    AsyncTaskC86227Xsl asyncTaskC86227Xsl2 = new AsyncTaskC86227Xsl(activity3, c86225Xsj, c86225Xsj.LJIIJ);
                    asyncTaskC86227Xsl2.executeOnExecutor(c86225Xsj.LIZJ, new C76800UCe[0]);
                    c86225Xsj.LJII = asyncTaskC86227Xsl2;
                    return;
                }
                if (c86225Xsj.LJIIJ) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        strArr = new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"};
                    } else {
                        strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
                    }
                } else {
                    strArr = new String[]{"android.permission.CAMERA"};
                }
                C61115Nyh.LIZIZ(activity3, TokenCert.Companion.with("bpea-x_take_photo_camera_and_write_storage_permission"), strArr, new C86231Xsp(c86225Xsj, activity3));
                return;
            }
            C86229Xsn c86229Xsn = new C86229Xsn(weakReference2, c86233Xsr);
            c86233Xsr.LJLIL = c86229Xsn;
            c86229Xsn.LIZJ = params.LJIIJJI;
            AqS162S0200000_15 aqS162S0200000_15 = new AqS162S0200000_15(c86229Xsn, params, 80);
            Activity activity4 = (Activity) weakReference2.get();
            if (activity4 == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 33) {
                str3 = "android.permission.WRITE_EXTERNAL_STORAGE";
            }
            if (C61184Nzo.LIZ(activity4) == 0 && C04330Ez.LIZ(activity4, str3) == 0) {
                aqS162S0200000_15.invoke();
                return;
            } else {
                C61115Nyh.LIZIZ(activity4, TokenCert.Companion.with("bpea-x_take_video_camera_write_storage_permission"), new String[]{"android.permission.CAMERA", str3}, new C86240Xsy(aqS162S0200000_15, c86229Xsn));
                return;
            }
        }
        C86230Xso c86230Xso = new C86230Xso(weakReference2, c86233Xsr);
        c86233Xsr.LJLIL = c86230Xso;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(c86230Xso, 866);
        Activity activity5 = (Activity) weakReference2.get();
        if (activity5 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 33) {
            str3 = "android.permission.WRITE_EXTERNAL_STORAGE";
        }
        if (C04330Ez.LIZ(activity5, str3) == 0) {
            aqS165S0100000_15.invoke();
        } else {
            C61115Nyh.LIZIZ(activity5, TokenCert.Companion.with("bpea-x_pick_videos_write_storage_permision"), new String[]{str3}, new C86239Xsx(aqS165S0100000_15, c86230Xso));
        }
    }
}
