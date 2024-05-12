package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.MediaStore;
import fjb.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.screenshot.ScreenShotMonitor$startListen$2", f = "ScreenShotMonitor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Oi9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62637Oi9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ WeakReference<Context> LJLIL;
    public final /* synthetic */ C62635Oi7 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62637Oi9(WeakReference<Context> weakReference, C62635Oi7 c62635Oi7, InterfaceC67352kd<? super C62637Oi9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = weakReference;
        this.LJLILLLLZI = c62635Oi7;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C62637Oi9(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        C141335gf.LIZJ(obj);
        Context context = this.LJLIL.get();
        if (context != null) {
            C62635Oi7 c62635Oi7 = this.LJLILLLLZI;
            boolean z2 = false;
            c62635Oi7.LJFF.LIZIZ(C62635Oi7.LJII[0], context);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("context[");
            LIZ.append(context);
            LIZ.append("]: try to start screen shot listener: isHasScreenShotListen: ");
            LIZ.append(c62635Oi7.LIZ);
            C62657OiT.LIZIZ(X1D.LIZIZ(LIZ));
            if (!c62635Oi7.LIZ) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 33) {
                        str = "android.permission.READ_MEDIA_IMAGES";
                    } else {
                        str = "android.permission.READ_EXTERNAL_STORAGE";
                    }
                    if (C04330Ez.LIZ(context, str) == 0) {
                        android.net.Uri INTERNAL_CONTENT_URI = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                        o.LJIIIIZZ(INTERNAL_CONTENT_URI, "INTERNAL_CONTENT_URI");
                        c62635Oi7.LIZIZ = new C62638OiA(c62635Oi7, INTERNAL_CONTENT_URI, c62635Oi7.LIZLLL);
                        android.net.Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        o.LJIIIIZZ(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                        c62635Oi7.LIZJ = new C62638OiA(c62635Oi7, EXTERNAL_CONTENT_URI, c62635Oi7.LIZLLL);
                        long currentTimeMillis = System.currentTimeMillis();
                        c62635Oi7.LJ = currentTimeMillis;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("startListenTime change to ");
                        LIZ2.append(currentTimeMillis);
                        C62657OiT.LIZIZ(X1D.LIZIZ(LIZ2));
                        C62638OiA c62638OiA = c62635Oi7.LIZIZ;
                        if (c62638OiA != null) {
                            ContentResolver contentResolver = C16880lQ.LLLLL(context).getContentResolver();
                            android.net.Uri uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                            if (i > 28) {
                                z = true;
                            } else {
                                z = false;
                            }
                            contentResolver.registerContentObserver(uri, z, c62638OiA);
                        }
                        C62638OiA c62638OiA2 = c62635Oi7.LIZJ;
                        if (c62638OiA2 != null) {
                            ContentResolver contentResolver2 = C16880lQ.LLLLL(context).getContentResolver();
                            android.net.Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            if (i > 28) {
                                z2 = true;
                            }
                            contentResolver2.registerContentObserver(uri2, z2, c62638OiA2);
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append('[');
                        LIZ3.append(context);
                        LIZ3.append("] start listen");
                        C62657OiT.LIZIZ(X1D.LIZIZ(LIZ3));
                        c62635Oi7.LIZ = true;
                    }
                } catch (Exception e) {
                    C62657OiT.LIZIZ(e.toString());
                }
            }
            return C76800UCe.LIZ;
        }
        return null;
    }
}
